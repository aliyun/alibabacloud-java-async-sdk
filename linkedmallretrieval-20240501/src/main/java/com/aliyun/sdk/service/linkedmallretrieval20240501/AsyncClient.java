// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmallretrieval20240501;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkedmallretrieval20240501.models.*;
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
     * @param request the request parameters of AISearchV2  AISearchV2Request
     * @return AISearchV2Response
     */
    CompletableFuture<AISearchV2Response> aISearchV2(AISearchV2Request request);

    ResponseIterable<AISearchV2ResponseBody> aISearchV2WithResponseIterable(AISearchV2Request request);

    /**
     * @param request the request parameters of GenericSearch  GenericSearchRequest
     * @return GenericSearchResponse
     */
    CompletableFuture<GenericSearchResponse> genericSearch(GenericSearchRequest request);

}
