// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20150303;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ft20150303.models.*;
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
        this.product = "Ft";
        this.version = "2015-03-03";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "ft.aliyuncs.com"),
            new TeaPair("ap-south-1", "ft.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ft.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ft.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ft.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ft.aliyuncs.com"),
            new TeaPair("cn-beijing", "ft.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ft.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ft.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ft.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ft.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ft.aliyuncs.com"),
            new TeaPair("cn-fujian", "ft.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ft.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ft.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ft.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "ft.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ft.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ft.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ft.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ft.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ft.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ft.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ft.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ft.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ft.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "ft.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ft.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "ft.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ft.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ft.aliyuncs.com"),
            new TeaPair("eu-central-1", "ft.aliyuncs.com"),
            new TeaPair("eu-west-1", "ft.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ft.aliyuncs.com"),
            new TeaPair("me-east-1", "ft.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ft.aliyuncs.com"),
            new TeaPair("us-west-1", "ft.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<CreateInsResponse> createIns(CreateInsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RpcNoDefaultErrorCodeApiResponse> rpcNoDefaultErrorCodeApi(RpcNoDefaultErrorCodeApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RpcNoDefaultErrorCodeApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RpcNoDefaultErrorCodeApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RpcNoDefaultErrorCodeApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateInsResponse> updateIns(UpdateInsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateIns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
