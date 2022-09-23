package com.aliyun.sdk.service.oss20190517.paginator.async;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.function.Predicate;

public class FilteringSubscriber<T> implements Subscriber<T> {
    private final Subscriber<? super T> subscriber;
    private final Predicate<T> predicate;

    private Subscription subscription;

    public FilteringSubscriber(Subscriber<? super T> subscriber, Predicate<T> predicate) {
        this.subscriber = subscriber;
        this.predicate = predicate;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        subscriber.onSubscribe(subscription);
        this.subscription = subscription;
    }

    @Override
    public void onNext(T t) {
        if (predicate.test(t)) {
            subscriber.onNext(t);
        } else {
            subscription.request(1);
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