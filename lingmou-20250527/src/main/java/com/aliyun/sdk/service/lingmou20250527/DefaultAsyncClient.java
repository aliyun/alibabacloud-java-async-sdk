// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.lingmou20250527.models.*;
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
        this.product = "LingMou";
        this.version = "2025-05-27";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CloseChatInstanceSessions  CloseChatInstanceSessionsRequest
     * @return CloseChatInstanceSessionsResponse
     */
    @Override
    public CompletableFuture<CloseChatInstanceSessionsResponse> closeChatInstanceSessions(CloseChatInstanceSessionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloseChatInstanceSessions").setMethod(HttpMethod.PUT).setPathRegex("/openapi/chat/instances/{instanceId}/sessions/close").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseChatInstanceSessionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseChatInstanceSessionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateBackgroundPic  CreateBackgroundPicRequest
     * @return CreateBackgroundPicResponse
     */
    @Override
    public CompletableFuture<CreateBackgroundPicResponse> createBackgroundPic(CreateBackgroundPicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateBackgroundPic").setMethod(HttpMethod.POST).setPathRegex("/openapi/chat/createBackgroundPic").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBackgroundPicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBackgroundPicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateChatConfig  CreateChatConfigRequest
     * @return CreateChatConfigResponse
     */
    @Override
    public CompletableFuture<CreateChatConfigResponse> createChatConfig(CreateChatConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateChatConfig").setMethod(HttpMethod.POST).setPathRegex("/openapi/chat/createChatConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateChatConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateChatConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateChatSession  CreateChatSessionRequest
     * @return CreateChatSessionResponse
     */
    @Override
    public CompletableFuture<CreateChatSessionResponse> createChatSession(CreateChatSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateChatSession").setMethod(HttpMethod.POST).setPathRegex("/openapi/chat/init/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateChatSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateChatSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateNoTrainPicAvatar  CreateNoTrainPicAvatarRequest
     * @return CreateNoTrainPicAvatarResponse
     */
    @Override
    public CompletableFuture<CreateNoTrainPicAvatarResponse> createNoTrainPicAvatar(CreateNoTrainPicAvatarRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateNoTrainPicAvatar").setMethod(HttpMethod.POST).setPathRegex("/openapi/chat/createNoTrainPicAvatar").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNoTrainPicAvatarResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNoTrainPicAvatarResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUploadPolicy  GetUploadPolicyRequest
     * @return GetUploadPolicyResponse
     */
    @Override
    public CompletableFuture<GetUploadPolicyResponse> getUploadPolicy(GetUploadPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUploadPolicy").setMethod(HttpMethod.GET).setPathRegex("/openapi/chat/getUploadPolicy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUploadPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUploadPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryChatInstanceSessions  QueryChatInstanceSessionsRequest
     * @return QueryChatInstanceSessionsResponse
     */
    @Override
    public CompletableFuture<QueryChatInstanceSessionsResponse> queryChatInstanceSessions(QueryChatInstanceSessionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryChatInstanceSessions").setMethod(HttpMethod.GET).setPathRegex("/openapi/chat/instances/{instanceId}/sessions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryChatInstanceSessionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryChatInstanceSessionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
