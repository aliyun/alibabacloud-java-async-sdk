package com.aliyun.sdk.service.oss20190517.paginator.async;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.function.Function;

public class MapperSubscriber<T, U> implements Subscriber<T> {
    protected final Subscriber<? super U> subscriber;
    protected final Function<T, U> mapper;

    protected MapperSubscriber(Subscriber<? super U> subscriber, Function<T, U> mapper) {
        this.subscriber = subscriber;
        this.mapper = mapper;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        subscriber.onSubscribe(subscription);
    }

    @Override
    public void onNext(T t) {
        subscriber.onNext(mapper.apply(t));
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
