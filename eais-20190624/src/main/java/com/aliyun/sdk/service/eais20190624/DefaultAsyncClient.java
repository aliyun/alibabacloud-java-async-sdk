// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.eais20190624.models.*;
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
        this.product = "eais";
        this.version = "2019-06-24";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "eais.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "eais.aliyuncs.com"),
            new TeaPair("ap-south-1", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-edge-1", "eais.aliyuncs.com"),
            new TeaPair("cn-fujian", "eais.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "eais.aliyuncs.com"),
            new TeaPair("cn-hongkong", "eais.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "eais.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "eais.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "eais.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "eais.aliyuncs.com"),
            new TeaPair("cn-qingdao", "eais.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-wuhan", "eais.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "eais.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "eais.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "eais.aliyuncs.com"),
            new TeaPair("eu-central-1", "eais.aliyuncs.com"),
            new TeaPair("eu-west-1", "eais.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "eais.aliyuncs.com"),
            new TeaPair("me-east-1", "eais.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "eais.aliyuncs.com"),
            new TeaPair("us-east-1", "eais.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<AttachEaiResponse> attachEai(AttachEaiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachEai").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachEaiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachEaiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateEaiResponse> createEai(CreateEaiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEai").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEaiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEaiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateEaiAllResponse> createEaiAll(CreateEaiAllRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEaiAll").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEaiAllResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEaiAllResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteEaiResponse> deleteEai(DeleteEaiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEai").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEaiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEaiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteEaiAllResponse> deleteEaiAll(DeleteEaiAllRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEaiAll").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEaiAllResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEaiAllResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeEaisResponse> describeEais(DescribeEaisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEais").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEaisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEaisResponse> future = new CompletableFuture<>();
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
    public CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachEaiResponse> detachEai(DetachEaiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachEai").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachEaiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachEaiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetPrivateIpResponse> getPrivateIp(GetPrivateIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPrivateIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPrivateIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPrivateIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
