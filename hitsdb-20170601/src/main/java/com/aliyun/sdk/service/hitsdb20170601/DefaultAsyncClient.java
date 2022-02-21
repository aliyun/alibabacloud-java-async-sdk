// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.hitsdb20170601.models.*;
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
        this.version = "2017-06-01";
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
    public CompletableFuture<CreateHiTSDBInstanceResponse> createHiTSDBInstance(CreateHiTSDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHiTSDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHiTSDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHiTSDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteHiTSDBInstanceResponse> deleteHiTSDBInstance(DeleteHiTSDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHiTSDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHiTSDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHiTSDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeHiTSDBInstanceResponse> describeHiTSDBInstance(DescribeHiTSDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHiTSDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHiTSDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHiTSDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeHiTSDBInstanceListResponse> describeHiTSDBInstanceList(DescribeHiTSDBInstanceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHiTSDBInstanceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHiTSDBInstanceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHiTSDBInstanceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeHiTSDBInstanceSecurityIpListResponse> describeHiTSDBInstanceSecurityIpList(DescribeHiTSDBInstanceSecurityIpListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHiTSDBInstanceSecurityIpList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHiTSDBInstanceSecurityIpListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHiTSDBInstanceSecurityIpListResponse> future = new CompletableFuture<>();
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
    public CompletableFuture<ModifyHiTSDBInstanceClassResponse> modifyHiTSDBInstanceClass(ModifyHiTSDBInstanceClassRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHiTSDBInstanceClass").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHiTSDBInstanceClassResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHiTSDBInstanceClassResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyHiTSDBInstanceSecurityIpListResponse> modifyHiTSDBInstanceSecurityIpList(ModifyHiTSDBInstanceSecurityIpListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHiTSDBInstanceSecurityIpList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHiTSDBInstanceSecurityIpListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHiTSDBInstanceSecurityIpListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RenameHiTSDBInstanceAliasResponse> renameHiTSDBInstanceAlias(RenameHiTSDBInstanceAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenameHiTSDBInstanceAlias").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenameHiTSDBInstanceAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenameHiTSDBInstanceAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RenewTSDBInstanceResponse> renewTSDBInstance(RenewTSDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewTSDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewTSDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewTSDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RestartHiTSDBInstanceResponse> restartHiTSDBInstance(RestartHiTSDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartHiTSDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartHiTSDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartHiTSDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SwitchHiTSDBInstancePublicNetResponse> switchHiTSDBInstancePublicNet(SwitchHiTSDBInstancePublicNetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchHiTSDBInstancePublicNet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchHiTSDBInstancePublicNetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchHiTSDBInstancePublicNetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
