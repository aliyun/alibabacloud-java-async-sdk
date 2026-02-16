// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.adbai20250812.models.*;
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
        this.product = "ADBAI";
        this.version = "2025-08-12";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateAgentPlatform  CreateAgentPlatformRequest
     * @return CreateAgentPlatformResponse
     */
    @Override
    public CompletableFuture<CreateAgentPlatformResponse> createAgentPlatform(CreateAgentPlatformRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAgentPlatform").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentPlatformResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentPlatformResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEmbodiedAIPlatform  CreateEmbodiedAIPlatformRequest
     * @return CreateEmbodiedAIPlatformResponse
     */
    @Override
    public CompletableFuture<CreateEmbodiedAIPlatformResponse> createEmbodiedAIPlatform(CreateEmbodiedAIPlatformRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEmbodiedAIPlatform").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEmbodiedAIPlatformResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEmbodiedAIPlatformResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEmbodiedAIPlatform  DeleteEmbodiedAIPlatformRequest
     * @return DeleteEmbodiedAIPlatformResponse
     */
    @Override
    public CompletableFuture<DeleteEmbodiedAIPlatformResponse> deleteEmbodiedAIPlatform(DeleteEmbodiedAIPlatformRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEmbodiedAIPlatform").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEmbodiedAIPlatformResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEmbodiedAIPlatformResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEmbodiedAIPlatforms  DescribeEmbodiedAIPlatformsRequest
     * @return DescribeEmbodiedAIPlatformsResponse
     */
    @Override
    public CompletableFuture<DescribeEmbodiedAIPlatformsResponse> describeEmbodiedAIPlatforms(DescribeEmbodiedAIPlatformsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEmbodiedAIPlatforms").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEmbodiedAIPlatformsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEmbodiedAIPlatformsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEmbodiedAIPlatformResourceUsageInfo  GetEmbodiedAIPlatformResourceUsageInfoRequest
     * @return GetEmbodiedAIPlatformResourceUsageInfoResponse
     */
    @Override
    public CompletableFuture<GetEmbodiedAIPlatformResourceUsageInfoResponse> getEmbodiedAIPlatformResourceUsageInfo(GetEmbodiedAIPlatformResourceUsageInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEmbodiedAIPlatformResourceUsageInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEmbodiedAIPlatformResourceUsageInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEmbodiedAIPlatformResourceUsageInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LockEmbodiedAIPlatform  LockEmbodiedAIPlatformRequest
     * @return LockEmbodiedAIPlatformResponse
     */
    @Override
    public CompletableFuture<LockEmbodiedAIPlatformResponse> lockEmbodiedAIPlatform(LockEmbodiedAIPlatformRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LockEmbodiedAIPlatform").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LockEmbodiedAIPlatformResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LockEmbodiedAIPlatformResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetEmbodiedAIPlatformPassword  ResetEmbodiedAIPlatformPasswordRequest
     * @return ResetEmbodiedAIPlatformPasswordResponse
     */
    @Override
    public CompletableFuture<ResetEmbodiedAIPlatformPasswordResponse> resetEmbodiedAIPlatformPassword(ResetEmbodiedAIPlatformPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetEmbodiedAIPlatformPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetEmbodiedAIPlatformPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetEmbodiedAIPlatformPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnlockEmbodiedAIPlatform  UnlockEmbodiedAIPlatformRequest
     * @return UnlockEmbodiedAIPlatformResponse
     */
    @Override
    public CompletableFuture<UnlockEmbodiedAIPlatformResponse> unlockEmbodiedAIPlatform(UnlockEmbodiedAIPlatformRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnlockEmbodiedAIPlatform").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnlockEmbodiedAIPlatformResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnlockEmbodiedAIPlatformResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
