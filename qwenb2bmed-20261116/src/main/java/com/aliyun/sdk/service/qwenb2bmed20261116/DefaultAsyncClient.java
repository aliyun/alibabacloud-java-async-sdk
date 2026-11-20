// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bmed20261116;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.qwenb2bmed20261116.models.*;
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
        this.product = "QwenB2BMed";
        this.version = "2026-11-16";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of MedicalAgentChat  MedicalAgentChatRequest
     * @return MedicalAgentChatResponse
     */
    @Override
    public CompletableFuture<MedicalAgentChatResponse> medicalAgentChat(MedicalAgentChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MedicalAgentChat").setMethod(HttpMethod.POST).setPathRegex("/v1/api/medicalQa").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MedicalAgentChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MedicalAgentChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<MedicalAgentChatResponseBody> medicalAgentChatWithResponseIterable(MedicalAgentChatRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("MedicalAgentChat").setMethod(HttpMethod.POST).setPathRegex("/v1/api/medicalQa").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        MedicalAgentChatResponseBodyIterator iterator = MedicalAgentChatResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of MedicalModelInference  MedicalModelInferenceRequest
     * @return MedicalModelInferenceResponse
     */
    @Override
    public CompletableFuture<MedicalModelInferenceResponse> medicalModelInference(MedicalModelInferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MedicalModelInference").setMethod(HttpMethod.POST).setPathRegex("/v1/api/directModel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MedicalModelInferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MedicalModelInferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<MedicalModelInferenceResponseBody> medicalModelInferenceWithResponseIterable(MedicalModelInferenceRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("MedicalModelInference").setMethod(HttpMethod.POST).setPathRegex("/v1/api/directModel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        MedicalModelInferenceResponseBodyIterator iterator = MedicalModelInferenceResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of OpenService  OpenServiceRequest
     * @return OpenServiceResponse
     */
    @Override
    public CompletableFuture<OpenServiceResponse> openService(OpenServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenService").setMethod(HttpMethod.POST).setPathRegex("/v1/api/medical/openService").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
