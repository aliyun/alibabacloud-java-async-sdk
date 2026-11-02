// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvusknowledgebase20260604;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.milvusknowledgebase20260604.models.*;
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
        this.product = "MilvusKnowledgeBase";
        this.version = "2026-06-04";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddDocuments  AddDocumentsRequest
     * @return AddDocumentsResponse
     */
    @Override
    public CompletableFuture<AddDocumentsResponse> addDocuments(AddDocumentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddDocuments").setMethod(HttpMethod.POST).setPathRegex("/api/v1/datasets/{datasetId}/documents/addDocuments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDocumentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDocumentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetKnowledgeBasePreSignedUrl  GetKnowledgeBasePreSignedUrlRequest
     * @return GetKnowledgeBasePreSignedUrlResponse
     */
    @Override
    public CompletableFuture<GetKnowledgeBasePreSignedUrlResponse> getKnowledgeBasePreSignedUrl(GetKnowledgeBasePreSignedUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetKnowledgeBasePreSignedUrl").setMethod(HttpMethod.POST).setPathRegex("/api/v1/datasets/{datasetId}/getKnowledgeBasePreSignedUrl").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKnowledgeBasePreSignedUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKnowledgeBasePreSignedUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Searches a specified knowledge base by using a query or an image. For the version, use the display name DRAFT, LATEST_PUBLISHED, or vN. Pass tag filter conditions based on the actual operators used by the backend.</p>
     * 
     * @param request the request parameters of SearchKnowledgeBase  SearchKnowledgeBaseRequest
     * @return SearchKnowledgeBaseResponse
     */
    @Override
    public CompletableFuture<SearchKnowledgeBaseResponse> searchKnowledgeBase(SearchKnowledgeBaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchKnowledgeBase").setMethod(HttpMethod.POST).setPathRegex("/api/v1/knowledge-bases/{knowledgeBaseId}/search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchKnowledgeBaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchKnowledgeBaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
