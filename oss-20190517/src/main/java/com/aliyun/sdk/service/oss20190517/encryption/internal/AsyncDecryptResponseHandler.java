package com.aliyun.sdk.service.oss20190517.encryption.internal;

import com.aliyun.sdk.service.oss20190517.encryption.crypto.CryptoCipher;
import darabonba.core.async.AsyncResponseHandler;
import org.reactivestreams.Processor;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.nio.ByteBuffer;

public class AsyncDecryptResponseHandler<ResponseT, ResultT> implements AsyncResponseHandler<ResponseT, ResultT> {
    protected volatile AsyncResponseHandler<ResponseT, ResultT> handler;
    long[] desiredRange;
    long[] cryptoRange;
    long contentLength;
    CryptoCipher cryptoCipher;
    DecryptProcessor proc;

    public AsyncDecryptResponseHandler(AsyncResponseHandler<ResponseT, ResultT> handler,
                                       long[] desiredRange, long[] cryptoRange, long contentLength,
                                       CryptoCipher cryptoCipher) {
        this.handler = handler;
        this.desiredRange = desiredRange;
        this.cryptoRange = cryptoRange;
        this.contentLength = contentLength;
        this.cryptoCipher = cryptoCipher;
    }

    @Override
    public void onStream(Publisher<ByteBuffer> publisher) {
        DecryptProcessor proc = new DecryptProcessor(cryptoCipher, desiredRange, cryptoRange, contentLength);
        this.proc = proc;
        this.handler.onStream(proc);
        publisher.subscribe(proc);
    }

    @Override
    public ResultT transform(ResponseT response) {
        return this.handler.transform(response);
    }

    public Exception getLastException() {
        if (this.proc == null) {
            return null;
        }
        return this.proc.getLastException();
    }

    static class DecryptProcessor implements Processor<ByteBuffer, ByteBuffer> {
        protected volatile Subscriber<? super ByteBuffer> subscriber;
        protected CryptoCipher cryptoCipher;
        private long numBytesToSkip = 0;
        private long numBytesToRead = Long.MAX_VALUE;
        private Exception lastException = null;

        DecryptProcessor(CryptoCipher cryptoCipher, long[] desiredRange, long[] adjustedCryptoRange, long contentLength) {
            this.cryptoCipher = cryptoCipher;
            if (desiredRange != null) {
                numBytesToSkip = desiredRange[0] < 0 ? 0 : (desiredRange[0] - adjustedCryptoRange[0]);
                numBytesToRead = desiredRange[1] < 0 ? Long.MAX_VALUE : (desiredRange[1] - desiredRange[0] + 1);
            }
        }

        private byte[] decryptBuffer(ByteBuffer byteBuffer) {
            byte[] result = null;
            if (byteBuffer != null) {
                byte[] b = byteBuffer.array();
                int off = byteBuffer.arrayOffset() + byteBuffer.position();
                int remaining = byteBuffer.remaining();
                result = this.cryptoCipher.update(b, off, remaining);
            } else {
                try {
                    result = this.cryptoCipher.doFinal();
                } catch (Exception e) {
                    lastException = e;
                }
            }
            return result;
        }

        private boolean flushToSubscriber(byte[] data) {
            if (data == null) {
                return true;
            }

            long offset = 0;
            long remains = data.length;
            if (numBytesToSkip > 0) {
                long min = Math.min(numBytesToSkip, data.length);
                numBytesToSkip = numBytesToSkip - min;
                remains = remains - min;
                offset = offset + min;
            }

            if (remains > 0) {
                long send = Math.min(remains, numBytesToRead);
                if (send > 0) {
                    this.subscriber.onNext(ByteBuffer.wrap(data, (int) offset, (int) send));
                    numBytesToRead = numBytesToRead - send;
                }
                remains = remains - send;
            }
            return true;
        }

        @Override
        public void subscribe(final Subscriber<? super ByteBuffer> subscriber) {
            this.subscriber = subscriber;
        }

        @Override
        public void onSubscribe(Subscription subscription) {
            this.subscriber.onSubscribe(subscription);
        }

        @Override
        public void onNext(ByteBuffer byteBuffer) {
            flushToSubscriber(decryptBuffer(byteBuffer));
        }

        @Override
        public void onError(Throwable throwable) {
            this.subscriber.onError(throwable);
        }

        @Override
        public void onComplete() {
            flushToSubscriber(decryptBuffer(null));
            this.subscriber.onComplete();
        }

        public Exception getLastException() {
            return this.lastException;
        }
    }
}

