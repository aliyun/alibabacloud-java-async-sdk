package com.aliyun.sdk.service.oss20190517.paginator.async;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.concurrent.atomic.AtomicInteger;

public class LimitingSubscriber<T> implements Subscriber<T> {
    private final Subscriber<? super T> subscriber;
    private final int limit;
    private final AtomicInteger delivered = new AtomicInteger(0);

    private Subscription subscription;

    public LimitingSubscriber(Subscriber<? super T> subscriber, int limit) {
        this.subscriber = subscriber;
        this.limit = limit;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        subscriber.onSubscribe(subscription);
        this.subscription = subscription;
    }

    @Override
    public void onNext(T t) {
        if (delivered.get() < limit) {
            subscriber.onNext(t);
        }
        if (delivered.incrementAndGet() >= limit) {
            subscription.cancel();
            subscriber.onComplete();
        }
    }

    @Override
    public void onError(Throwable throwable) {
        subscriber.onError(throwable);
    }

    @Override
    public void onComplete() {
        subscriber.onComplete();
    }
}

