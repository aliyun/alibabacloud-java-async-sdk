// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.iqs20241111.models.*;
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
     * @param request the request parameters of AiSearch  AiSearchRequest
     * @return AiSearchResponse
     */
    CompletableFuture<AiSearchResponse> aiSearch(AiSearchRequest request);

    ResponseIterable<AiSearchResponseBody> aiSearchWithResponseIterable(AiSearchRequest request);

    /**
     * @param request the request parameters of GenericAdvancedSearch  GenericAdvancedSearchRequest
     * @return GenericAdvancedSearchResponse
     */
    CompletableFuture<GenericAdvancedSearchResponse> genericAdvancedSearch(GenericAdvancedSearchRequest request);

    /**
     * @param request the request parameters of GenericSearch  GenericSearchRequest
     * @return GenericSearchResponse
     */
    CompletableFuture<GenericSearchResponse> genericSearch(GenericSearchRequest request);

    /**
     * @param request the request parameters of GlobalSearch  GlobalSearchRequest
     * @return GlobalSearchResponse
     */
    CompletableFuture<GlobalSearchResponse> globalSearch(GlobalSearchRequest request);

}
