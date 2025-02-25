// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.rai20240701.models.*;
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
        this.product = "RAI";
        this.version = "2024-07-01";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of BatchContentAsyncDetect  BatchContentAsyncDetectRequest
     * @return BatchContentAsyncDetectResponse
     */
    @Override
    public CompletableFuture<BatchContentAsyncDetectResponse> batchContentAsyncDetect(BatchContentAsyncDetectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchContentAsyncDetect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchContentAsyncDetectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchContentAsyncDetectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchContentSyncDetect  BatchContentSyncDetectRequest
     * @return BatchContentSyncDetectResponse
     */
    @Override
    public CompletableFuture<BatchContentSyncDetectResponse> batchContentSyncDetect(BatchContentSyncDetectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchContentSyncDetect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchContentSyncDetectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchContentSyncDetectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckAccount  CheckAccountRequest
     * @return CheckAccountResponse
     */
    @Override
    public CompletableFuture<CheckAccountResponse> checkAccount(CheckAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ContentAsyncDetect  ContentAsyncDetectRequest
     * @return ContentAsyncDetectResponse
     */
    @Override
    public CompletableFuture<ContentAsyncDetectResponse> contentAsyncDetect(ContentAsyncDetectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ContentAsyncDetect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ContentAsyncDetectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ContentAsyncDetectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ContentSyncDetect  ContentSyncDetectRequest
     * @return ContentSyncDetectResponse
     */
    @Override
    public CompletableFuture<ContentSyncDetectResponse> contentSyncDetect(ContentSyncDetectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ContentSyncDetect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ContentSyncDetectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ContentSyncDetectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetContentDetectResult  GetContentDetectResultRequest
     * @return GetContentDetectResultResponse
     */
    @Override
    public CompletableFuture<GetContentDetectResultResponse> getContentDetectResult(GetContentDetectResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContentDetectResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContentDetectResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContentDetectResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSensitiveWord  ListSensitiveWordRequest
     * @return ListSensitiveWordResponse
     */
    @Override
    public CompletableFuture<ListSensitiveWordResponse> listSensitiveWord(ListSensitiveWordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSensitiveWord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSensitiveWordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSensitiveWordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RegisterAccount  RegisterAccountRequest
     * @return RegisterAccountResponse
     */
    @Override
    public CompletableFuture<RegisterAccountResponse> registerAccount(RegisterAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncSensitiveWord  SyncSensitiveWordRequest
     * @return SyncSensitiveWordResponse
     */
    @Override
    public CompletableFuture<SyncSensitiveWordResponse> syncSensitiveWord(SyncSensitiveWordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncSensitiveWord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncSensitiveWordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncSensitiveWordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
