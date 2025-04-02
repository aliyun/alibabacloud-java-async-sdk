// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aipodcast20250228;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aipodcast20250228.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * @param request the request parameters of PodcastTaskResultQuery  PodcastTaskResultQueryRequest
     * @return PodcastTaskResultQueryResponse
     */
    CompletableFuture<PodcastTaskResultQueryResponse> podcastTaskResultQuery(PodcastTaskResultQueryRequest request);

    /**
     * @param request the request parameters of PodcastTaskSubmit  PodcastTaskSubmitRequest
     * @return PodcastTaskSubmitResponse
     */
    CompletableFuture<PodcastTaskSubmitResponse> podcastTaskSubmit(PodcastTaskSubmitRequest request);

}
