// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.iqs20241111.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "IQS";
        this.version = "2024-11-11";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AiSearch  AiSearchRequest
     * @return AiSearchResponse
     */
    @Override
    public CompletableFuture<AiSearchResponse> aiSearch(AiSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AiSearch").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-entry/v3/linkedRetrieval/commands/aiSearch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AiSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AiSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<AiSearchResponseBody> aiSearchWithResponseIterable(AiSearchRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("AiSearch").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-entry/v3/linkedRetrieval/commands/aiSearch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        AiSearchResponseBodyIterator iterator = AiSearchResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of CommonQueryByScene  CommonQueryBySceneRequest
     * @return CommonQueryBySceneResponse
     */
    @Override
    public CompletableFuture<CommonQueryBySceneResponse> commonQueryByScene(CommonQueryBySceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CommonQueryByScene").setMethod(HttpMethod.POST).setPathRegex("/amap-function-call-agent/iqs-agent-service/v2/nl/common").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CommonQueryBySceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CommonQueryBySceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenericAdvancedSearch  GenericAdvancedSearchRequest
     * @return GenericAdvancedSearchResponse
     */
    @Override
    public CompletableFuture<GenericAdvancedSearchResponse> genericAdvancedSearch(GenericAdvancedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenericAdvancedSearch").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-entry/v2/linkedRetrieval/commands/genericAdvancedSearch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenericAdvancedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenericAdvancedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenericSearch  GenericSearchRequest
     * @return GenericSearchResponse
     */
    @Override
    public CompletableFuture<GenericSearchResponse> genericSearch(GenericSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenericSearch").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-entry/v2/linkedRetrieval/commands/genericSearch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenericSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenericSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIqsUsage  GetIqsUsageRequest
     * @return GetIqsUsageResponse
     */
    @Override
    public CompletableFuture<GetIqsUsageResponse> getIqsUsage(GetIqsUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIqsUsage").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-admin/v1/iqs/usage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIqsUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIqsUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GlobalSearch  GlobalSearchRequest
     * @return GlobalSearchResponse
     */
    @Override
    public CompletableFuture<GlobalSearchResponse> globalSearch(GlobalSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GlobalSearch").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-entry/v1/iqs/search/global").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MedicalAnswer  MedicalAnswerRequest
     * @return MedicalAnswerResponse
     */
    @Override
    public CompletableFuture<MedicalAnswerResponse> medicalAnswer(MedicalAnswerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MedicalAnswer").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-entry/v1/iqs/domain/medical/answer").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MedicalAnswerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MedicalAnswerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MedicalKnowledge  MedicalKnowledgeRequest
     * @return MedicalKnowledgeResponse
     */
    @Override
    public CompletableFuture<MedicalKnowledgeResponse> medicalKnowledge(MedicalKnowledgeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MedicalKnowledge").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-entry/v1/iqs/domain/medical/know").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MedicalKnowledgeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MedicalKnowledgeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MultimodalSearch  MultimodalSearchRequest
     * @return MultimodalSearchResponse
     */
    @Override
    public CompletableFuture<MultimodalSearchResponse> multimodalSearch(MultimodalSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MultimodalSearch").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-entry/v1/iqs/multimodal/unified").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MultimodalSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MultimodalSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OmniAnswer  OmniAnswerRequest
     * @return OmniAnswerResponse
     */
    @Override
    public CompletableFuture<OmniAnswerResponse> omniAnswer(OmniAnswerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OmniAnswer").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-entry/v1/iqs/answer/omni/search").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OmniAnswerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OmniAnswerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> omniAnswerWithAsyncResponseHandler(OmniAnswerRequest request, AsyncResponseHandler<OmniAnswerResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OmniAnswer").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-entry/v1/iqs/answer/omni/search").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(OmniAnswerResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((OmniAnswerResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<String> omniAnswerWithResponseIterable(OmniAnswerRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("OmniAnswer").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-entry/v1/iqs/answer/omni/search").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        OmniAnswerResponseBodyIterator iterator = OmniAnswerResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of ReadPageBasic  ReadPageBasicRequest
     * @return ReadPageBasicResponse
     */
    @Override
    public CompletableFuture<ReadPageBasicResponse> readPageBasic(ReadPageBasicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReadPageBasic").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-entry/v1/iqs/readpage/basic").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadPageBasicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadPageBasicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadPageScrape  ReadPageScrapeRequest
     * @return ReadPageScrapeResponse
     */
    @Override
    public CompletableFuture<ReadPageScrapeResponse> readPageScrape(ReadPageScrapeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReadPageScrape").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-entry/v1/iqs/readpage/scrape").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadPageScrapeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadPageScrapeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ScanFile  ScanFileRequest
     * @return ScanFileResponse
     */
    @Override
    public CompletableFuture<ScanFileResponse> scanFile(ScanFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScanFile").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-entry/v1/iqs/domain/scan/file").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScanFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScanFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnifiedSearch  UnifiedSearchRequest
     * @return UnifiedSearchResponse
     */
    @Override
    public CompletableFuture<UnifiedSearchResponse> unifiedSearch(UnifiedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnifiedSearch").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-entry/v1/iqs/search/unified").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnifiedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnifiedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
