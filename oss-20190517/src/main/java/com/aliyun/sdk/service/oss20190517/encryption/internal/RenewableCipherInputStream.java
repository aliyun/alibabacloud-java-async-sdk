package com.aliyun.sdk.service.oss20190517.encryption.internal;

import com.aliyun.sdk.service.oss20190517.encryption.crypto.CryptoCipher;

import java.io.IOException;
import java.io.InputStream;

/**
 * A specific kind of {@link CipherInputStream} that supports partial
 * mark-and-reset in the sense that, if the underlying input stream supports
 * mark-and-reset, this input stream can then be marked at and get reset back to
 * the very beginning of the stream (but not anywhere else).
 */
public final class RenewableCipherInputStream extends CipherInputStream {
    private boolean hasBeenAccessed;

    public RenewableCipherInputStream(InputStream is, CryptoCipher cryptoCipher) {
        super(is, cryptoCipher);
    }

    public RenewableCipherInputStream(InputStream is, CryptoCipher c, int buffsize) {
        super(is, c, buffsize);
    }

    /**
     * Mark and reset is currently only partially supported, in the sense that, if
     * the underlying input stream supports mark-and-reset, this input stream can
     * then be marked at and get reset back to the very beginning of the stream (but
     * not anywhere else).
     */
    @Override
    public boolean markSupported() {
        return in.markSupported();
    }

    /**
     * Mark and reset is currently only partially supported, in the sense that, if
     * the underlying input stream supports mark-and-reset, this input stream can
     * then be marked at and get reset back to the very beginning of the stream (but
     * not anywhere else).
     *
     * @throws UnsupportedOperationException if mark is called after this stream has been accessed.
     */
    @Override
    public void mark(final int readlimit) {
        if (hasBeenAccessed) {
            throw new UnsupportedOperationException(
                    "Marking is only supported before your first call to " + "read or skip.");
        }
        in.mark(readlimit);
    }

    /**
     * Resets back to the very beginning of the stream.
     * <p>
     * Mark and reset is currently only partially supported, in the sense that, if
     * the underlying input stream supports mark-and-reset, this input stream can
     * then be marked at and get reset back to the very beginning of the stream (but
     * not anywhere else).
     */
    @Override
    public void reset() throws IOException {
        in.reset();
        renewCryptoCipher();
        resetInternal();
        hasBeenAccessed = false;
    }

    @Override
    public int read() throws IOException {
        hasBeenAccessed = true;
        return super.read();
    }

    @Override
    public int read(final byte[] b) throws IOException {
        hasBeenAccessed = true;
        return super.read(b);
    }

    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        hasBeenAccessed = true;
        return super.read(b, off, len);
    }

    @Override
    public long skip(final long n) throws IOException {
        hasBeenAccessed = true;
        return super.skip(n);
    }
}
