package com.aliyun.sdk.service.oss20190517.paginator.async;

import org.reactivestreams.Publisher;

import java.util.function.Function;
import java.util.function.Predicate;

public interface PaginatedPublisher<T> extends Publisher<T> {

    default PaginatedPublisher<T> filter(Predicate<T> predicate) {
        return subscriber -> subscribe(new FilteringSubscriber<>(subscriber, predicate));
    }

    default PaginatedPublisher<T> limit(int limit) {
        return subscriber -> subscribe(new LimitingSubscriber<>(subscriber, limit));
    }

    default <U> PaginatedPublisher<U> map(Function<T, U> mapper) {
        return subscriber -> subscribe(new MapperSubscriber<T, U>(subscriber, mapper));
    }
}
