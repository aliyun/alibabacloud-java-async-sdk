package com.aliyun.sdk.service.oss20190517.paginator.async;

import java.util.concurrent.CompletableFuture;

public interface AsyncPageFetcher<ResponseT> {

    boolean hasNextPage(ResponseT oldPage);

    CompletableFuture<ResponseT> nextPage(ResponseT oldPage);
}
