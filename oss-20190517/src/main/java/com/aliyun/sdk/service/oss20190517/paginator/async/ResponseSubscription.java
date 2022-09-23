package com.aliyun.sdk.service.oss20190517.paginator.async;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class ResponseSubscription<ResponseT> implements Subscription {
    protected final Subscriber subscriber;
    protected final AsyncPageFetcher<ResponseT> nextPageFetcher;
    private final AtomicBoolean isTerminated = new AtomicBoolean(false);
    private final AtomicBoolean isTaskRunning = new AtomicBoolean(false);
    protected AtomicLong requestN = new AtomicLong(0);
    protected volatile ResponseT currentPage;

    private ResponseSubscription(Builder builder) {
        this.subscriber = builder.subscriber;
        this.nextPageFetcher = builder.nextPageFetcher;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public void request(long n) {
        if (isTerminated()) {
            return;
        }

        if (n <= 0) {
            subscriber.onError(new IllegalArgumentException("Non-positive request signals are illegal"));
        }

        AtomicBoolean startTask = new AtomicBoolean(false);
        synchronized (this) {
            requestN.addAndGet(n);
            startTask.set(startTask());
        }

        if (startTask.get()) {
            handleRequests();
        }
    }

    @Override
    public void cancel() {
        cleanup();
    }

    private void handleRequests() {
        if (!hasNextPage()) {
            completeSubscription();
            return;
        }

        synchronized (this) {
            if (requestN.get() <= 0) {
                stopTask();
                return;
            }
        }

        if (!isTerminated()) {
            requestN.getAndDecrement();
            nextPageFetcher.nextPage(currentPage)
                    .whenComplete(((response, error) -> {
                        if (response != null) {
                            currentPage = response;
                            subscriber.onNext(response);
                            handleRequests();
                        }
                        if (error != null) {
                            subscriber.onError(error);
                            cleanup();
                        }
                    }));
        }
    }

    private boolean hasNextPage() {
        return currentPage == null || nextPageFetcher.hasNextPage(currentPage);
    }

    private void completeSubscription() {
        if (!isTerminated()) {
            subscriber.onComplete();
            cleanup();
        }
    }

    private void terminate() {
        isTerminated.compareAndSet(false, true);
    }

    private boolean isTerminated() {
        return isTerminated.get();
    }

    private void stopTask() {
        isTaskRunning.set(false);
    }

    private synchronized boolean startTask() {
        return !isTerminated() && isTaskRunning.compareAndSet(false, true);
    }

    private synchronized void cleanup() {
        terminate();
        stopTask();
    }

    public static final class Builder {
        private Subscriber subscriber;
        private AsyncPageFetcher nextPageFetcher;

        public Builder subscriber(Subscriber subscriber) {
            this.subscriber = subscriber;
            return this;
        }

        public Builder nextPageFetcher(AsyncPageFetcher nextPageFetcher) {
            this.nextPageFetcher = nextPageFetcher;
            return this;
        }

        public ResponseSubscription build() {
            return new ResponseSubscription(this);
        }
    }
}