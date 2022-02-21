// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.hitsdb20200615.models.*;
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
        this.product = "hitsdb";
        this.version = "2020-06-15";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "hitsdb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "hitsdb.aliyuncs.com"),
            new TeaPair("us-west-1", "hitsdb.aliyuncs.com"),
            new TeaPair("us-east-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "hitsdb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-chengdu", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-fujian", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "hitsdb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "hitsdb.aliyuncs.com"),
            new TeaPair("me-east-1", "hitsdb.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "hitsdb.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<CreateLindormInstanceResponse> createLindormInstance(CreateLindormInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLindormInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLindormInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLindormInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetInstanceIpWhiteListResponse> getInstanceIpWhiteList(GetInstanceIpWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceIpWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceIpWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceIpWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetLindormInstanceResponse> getLindormInstance(GetLindormInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLindormInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLindormInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLindormInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetLindormInstanceEngineListResponse> getLindormInstanceEngineList(GetLindormInstanceEngineListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLindormInstanceEngineList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLindormInstanceEngineListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLindormInstanceEngineListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetLindormInstanceListResponse> getLindormInstanceList(GetLindormInstanceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLindormInstanceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLindormInstanceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLindormInstanceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReleaseLindormInstanceResponse> releaseLindormInstance(ReleaseLindormInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseLindormInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseLindormInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseLindormInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateInstanceIpWhiteListResponse> updateInstanceIpWhiteList(UpdateInstanceIpWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateInstanceIpWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceIpWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceIpWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpgradeLindormInstanceResponse> upgradeLindormInstance(UpgradeLindormInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeLindormInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeLindormInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeLindormInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
