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
     * @param request the request parameters of GetIqsUsage  GetIqsUsageRequest
     * @return GetIqsUsageResponse
     */
    CompletableFuture<GetIqsUsageResponse> getIqsUsage(GetIqsUsageRequest request);

    /**
     * @param request the request parameters of GlobalSearch  GlobalSearchRequest
     * @return GlobalSearchResponse
     */
    CompletableFuture<GlobalSearchResponse> globalSearch(GlobalSearchRequest request);

    /**
     * @param request the request parameters of ReadPageBasic  ReadPageBasicRequest
     * @return ReadPageBasicResponse
     */
    CompletableFuture<ReadPageBasicResponse> readPageBasic(ReadPageBasicRequest request);

    /**
     * @param request the request parameters of ReadPageScrape  ReadPageScrapeRequest
     * @return ReadPageScrapeResponse
     */
    CompletableFuture<ReadPageScrapeResponse> readPageScrape(ReadPageScrapeRequest request);

    /**
     * @param request the request parameters of UnifiedSearch  UnifiedSearchRequest
     * @return UnifiedSearchResponse
     */
    CompletableFuture<UnifiedSearchResponse> unifiedSearch(UnifiedSearchRequest request);

}
