package com.aliyun.sdk.service.oss20190517.paginator;

import com.aliyun.sdk.service.oss20190517.AsyncClient;
import com.aliyun.sdk.service.oss20190517.models.ListObjectVersionsRequest;
import com.aliyun.sdk.service.oss20190517.models.ListObjectVersionsResponse;
import com.aliyun.sdk.service.oss20190517.paginator.async.AsyncPageFetcher;
import com.aliyun.sdk.service.oss20190517.paginator.async.PaginatedPublisher;
import com.aliyun.sdk.service.oss20190517.paginator.async.ResponseSubscription;
import org.reactivestreams.Subscriber;

import java.util.concurrent.CompletableFuture;

public class ListObjectVersionsPublisher implements PaginatedPublisher<ListObjectVersionsResponse> {
    private final AsyncClient client;
    private final ListObjectVersionsRequest firstRequest;
    private final AsyncPageFetcher nextPageFetcher;

    public ListObjectVersionsPublisher(AsyncClient client, ListObjectVersionsRequest firstRequest) {
        this.client = client;
        this.firstRequest = firstRequest;
        this.nextPageFetcher = new ListObjectVersionsResponseFetcher();
    }

    @Override
    public void subscribe(Subscriber<? super ListObjectVersionsResponse> subscriber) {
        subscriber.onSubscribe(ResponseSubscription.builder().subscriber(subscriber).nextPageFetcher(nextPageFetcher).build());
    }

    private class ListObjectVersionsResponseFetcher implements AsyncPageFetcher<ListObjectVersionsResponse> {
        @Override
        public boolean hasNextPage(final ListObjectVersionsResponse previousPage) {
            if (previousPage == null ||
                    previousPage.getBody() == null ||
                    previousPage.getBody().getIsTruncated() == null) {
                return false;
            }
            return previousPage.getBody().getIsTruncated().booleanValue();
        }

        @Override
        public CompletableFuture<ListObjectVersionsResponse> nextPage(final ListObjectVersionsResponse previousPage) {
            if (previousPage == null) {
                return client.listObjectVersions(firstRequest);
            }
            return client.listObjectVersions(firstRequest.toBuilder().keyMarker(previousPage.getBody().getNextKeyMarker())
                    .versionIdMarker(previousPage.getBody().getNextVersionIdMarker()).build());
        }
    }
}