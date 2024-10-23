// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.farui20240628.models.*;
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
        this.product = "FaRui";
        this.version = "2024-06-28";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of RunContractResultGeneration  RunContractResultGenerationRequest
     * @return RunContractResultGenerationResponse
     */
    @Override
    public CompletableFuture<RunContractResultGenerationResponse> runContractResultGeneration(RunContractResultGenerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunContractResultGeneration").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/farui/contract/result/genarate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunContractResultGenerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunContractResultGenerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunContractResultGenerationResponseBody> runContractResultGenerationWithResponseIterable(RunContractResultGenerationRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunContractResultGeneration").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/farui/contract/result/genarate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunContractResultGenerationResponseBodyIterator iterator = RunContractResultGenerationResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RunContractRuleGeneration  RunContractRuleGenerationRequest
     * @return RunContractRuleGenerationResponse
     */
    @Override
    public CompletableFuture<RunContractRuleGenerationResponse> runContractRuleGeneration(RunContractRuleGenerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunContractRuleGeneration").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/farui/contract/rule/genarate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunContractRuleGenerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunContractRuleGenerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunContractRuleGenerationResponseBody> runContractRuleGenerationWithResponseIterable(RunContractRuleGenerationRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunContractRuleGeneration").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/farui/contract/rule/genarate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunContractRuleGenerationResponseBodyIterator iterator = RunContractRuleGenerationResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RunLegalAdviceConsultation  RunLegalAdviceConsultationRequest
     * @return RunLegalAdviceConsultationResponse
     */
    @Override
    public CompletableFuture<RunLegalAdviceConsultationResponse> runLegalAdviceConsultation(RunLegalAdviceConsultationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunLegalAdviceConsultation").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/farui/legalAdvice/consult").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunLegalAdviceConsultationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunLegalAdviceConsultationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunLegalAdviceConsultationResponseBody> runLegalAdviceConsultationWithResponseIterable(RunLegalAdviceConsultationRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunLegalAdviceConsultation").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/farui/legalAdvice/consult").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunLegalAdviceConsultationResponseBodyIterator iterator = RunLegalAdviceConsultationResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

}
