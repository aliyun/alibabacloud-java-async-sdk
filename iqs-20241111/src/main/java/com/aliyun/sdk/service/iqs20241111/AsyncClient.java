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
     * <b>description</b> :
     * <p>Provides streaming results in two stages, common_search and post_retrieval, for customers to use on demand. General search results (common_search): the original search results. Covers key fields such as web page title, dynamic summary, body text, source website, and publish time. Post-retrieval processing (post_retrieval): reranks and filters the common_search results from the previous stage by using a rerank model. The mean average precision (mAP) metric for context relevancy of search results is improved by about 5%, and the latency is increased by about 110 ms.</p>
     * 
     * @param request the request parameters of AiSearch  AiSearchRequest
     * @return AiSearchResponse
     */
    CompletableFuture<AiSearchResponse> aiSearch(AiSearchRequest request);

    ResponseIterable<AiSearchResponseBody> aiSearchWithResponseIterable(AiSearchRequest request);

    /**
     * <b>description</b> :
     * <p>The general API for natural language search.</p>
     * 
     * @param request the request parameters of CommonQueryByScene  CommonQueryBySceneRequest
     * @return CommonQueryBySceneResponse
     */
    CompletableFuture<CommonQueryBySceneResponse> commonQueryByScene(CommonQueryBySceneRequest request);

    /**
     * <b>description</b> :
     * <p>GenericAdvancedSearch is currently in the testing phase. New specifications will be available for purchase in the future.</p>
     * 
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
     * <b>description</b> :
     * <p>This topic describes how to use the Global Edition search (GlobalSearch) and provides parameter descriptions.</p>
     * 
     * @param request the request parameters of GlobalSearch  GlobalSearchRequest
     * @return GlobalSearchResponse
     */
    CompletableFuture<GlobalSearchResponse> globalSearch(GlobalSearchRequest request);

    /**
     * @param request the request parameters of MedicalAnswer  MedicalAnswerRequest
     * @return MedicalAnswerResponse
     */
    CompletableFuture<MedicalAnswerResponse> medicalAnswer(MedicalAnswerRequest request);

    /**
     * @param request the request parameters of MedicalKnowledge  MedicalKnowledgeRequest
     * @return MedicalKnowledgeResponse
     */
    CompletableFuture<MedicalKnowledgeResponse> medicalKnowledge(MedicalKnowledgeRequest request);

    /**
     * @param request the request parameters of MultimodalSearch  MultimodalSearchRequest
     * @return MultimodalSearchResponse
     */
    CompletableFuture<MultimodalSearchResponse> multimodalSearch(MultimodalSearchRequest request);

    /**
     * @param request the request parameters of OmniAnswer  OmniAnswerRequest
     * @return OmniAnswerResponse
     */
    CompletableFuture<OmniAnswerResponse> omniAnswer(OmniAnswerRequest request);

<ReturnT> CompletableFuture<ReturnT> omniAnswerWithAsyncResponseHandler(OmniAnswerRequest request, AsyncResponseHandler<OmniAnswerResponse, ReturnT> responseHandler);

    ResponseIterable<String> omniAnswerWithResponseIterable(OmniAnswerRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>A request is counted as valid when the HTTP response code of the destination URL is less than 500.</li>
     * <li>If the content type in the response header of the destination URL is application/pdf, the system automatically triggers PDF parsing (the maximum PDF size is 20 MB). This operation is counted as an additional valid request.</li>
     * <li>Trial instructions: During the trial period, the API rate limit is 5 QPS, and the trial quota is 1,000 requests per 30 days.</li>
     * </ol>
     * 
     * @param request the request parameters of ReadPageBasic  ReadPageBasicRequest
     * @return ReadPageBasicResponse
     */
    CompletableFuture<ReadPageBasicResponse> readPageBasic(ReadPageBasicRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>A request is counted as a valid request when the HTTP status code of the target URL is less than 500.</li>
     * <li>If the Content-Type in the response header of the target URL is application/pdf, the system automatically triggers PDF parsing (the maximum size of a PDF file that can be processed is 20 MB). This operation is counted as an additional valid request.</li>
     * <li>Trial description: During the trial period, the API operation is limited to 5 QPS. The trial quota is 1,000 requests per 30 days.</li>
     * </ol>
     * 
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
