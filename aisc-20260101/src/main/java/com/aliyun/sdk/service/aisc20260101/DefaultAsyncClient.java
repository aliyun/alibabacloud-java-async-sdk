// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.aisc20260101.models.*;
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
        this.product = "AISC";
        this.version = "2026-01-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-zhangjiakou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-nanjing", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-beijing", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-heyuan-acdr-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "aisc.cn-shanghai.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateSkillFileCheck  CreateSkillFileCheckRequest
     * @return CreateSkillFileCheckResponse
     */
    @Override
    public CompletableFuture<CreateSkillFileCheckResponse> createSkillFileCheck(CreateSkillFileCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSkillFileCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSkillFileCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSkillFileCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAIAgentEvent  ListAIAgentEventRequest
     * @return ListAIAgentEventResponse
     */
    @Override
    public CompletableFuture<ListAIAgentEventResponse> listAIAgentEvent(ListAIAgentEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIAgentEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIAgentEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIAgentEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSubTasks  ListSubTasksRequest
     * @return ListSubTasksResponse
     */
    @Override
    public CompletableFuture<ListSubTasksResponse> listSubTasks(ListSubTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSubTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
