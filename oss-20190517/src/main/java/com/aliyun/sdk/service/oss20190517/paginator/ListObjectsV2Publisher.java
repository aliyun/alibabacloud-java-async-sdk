package com.aliyun.sdk.service.oss20190517.paginator;

import com.aliyun.sdk.service.oss20190517.AsyncClient;
import com.aliyun.sdk.service.oss20190517.models.ListObjectsV2Request;
import com.aliyun.sdk.service.oss20190517.models.ListObjectsV2Response;
import com.aliyun.sdk.service.oss20190517.paginator.async.AsyncPageFetcher;
import com.aliyun.sdk.service.oss20190517.paginator.async.PaginatedPublisher;
import com.aliyun.sdk.service.oss20190517.paginator.async.ResponseSubscription;
import org.reactivestreams.Subscriber;

import java.util.concurrent.CompletableFuture;

public class ListObjectsV2Publisher implements PaginatedPublisher<ListObjectsV2Response> {
    private final AsyncClient client;
    private final ListObjectsV2Request firstRequest;
    private final AsyncPageFetcher nextPageFetcher;

    public ListObjectsV2Publisher(AsyncClient client, ListObjectsV2Request firstRequest) {
        this.client = client;
        this.firstRequest = firstRequest;
        this.nextPageFetcher = new ListObjectsV2ResponseFetcher();
    }

    @Override
    public void subscribe(Subscriber<? super ListObjectsV2Response> subscriber) {
        subscriber.onSubscribe(ResponseSubscription.builder().subscriber(subscriber).nextPageFetcher(nextPageFetcher).build());
    }

    private class ListObjectsV2ResponseFetcher implements AsyncPageFetcher<ListObjectsV2Response> {
        @Override
        public boolean hasNextPage(final ListObjectsV2Response previousPage) {
            if (previousPage == null ||
                    previousPage.getBody() == null ||
                    previousPage.getBody().getIsTruncated() == null) {
                return false;
            }
            return previousPage.getBody().getIsTruncated().booleanValue();
        }

        @Override
        public CompletableFuture<ListObjectsV2Response> nextPage(final ListObjectsV2Response previousPage) {
            if (previousPage == null) {
                return client.listObjectsV2(firstRequest);
            }
            return client.listObjectsV2(firstRequest.toBuilder().continuationToken(previousPage.getBody().getNextContinuationToken()).build());
        }
    }
}
