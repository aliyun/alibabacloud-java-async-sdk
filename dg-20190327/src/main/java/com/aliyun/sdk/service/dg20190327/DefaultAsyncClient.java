// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dg20190327;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dg20190327.models.*;
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
        this.product = "dg";
        this.version = "2019-03-27";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "dg.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dg.aliyuncs.com"),
            new TeaPair("ap-south-1", "dg.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dg.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dg.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dg.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dg.aliyuncs.com"),
            new TeaPair("cn-beijing", "dg.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dg.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dg.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dg.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dg.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dg.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dg.aliyuncs.com"),
            new TeaPair("cn-fujian", "dg.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dg.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dg.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dg.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dg.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dg.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dg.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dg.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dg.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dg.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dg.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dg.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dg.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dg.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dg.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dg.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dg.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dg.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dg.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dg.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dg.aliyuncs.com"),
            new TeaPair("eu-central-1", "dg.aliyuncs.com"),
            new TeaPair("eu-west-1", "dg.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dg.aliyuncs.com"),
            new TeaPair("me-east-1", "dg.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dg.aliyuncs.com"),
            new TeaPair("us-east-1", "dg.aliyuncs.com"),
            new TeaPair("us-west-1", "dg.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<AddDatabaseResponse> addDatabase(AddDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AddDatabaseListResponse> addDatabaseList(AddDatabaseListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddDatabaseList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDatabaseListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDatabaseListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ConnectDatabaseResponse> connectDatabase(ConnectDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConnectDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConnectDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConnectDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateDatabaseAccessPointResponse> createDatabaseAccessPoint(CreateDatabaseAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDatabaseAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatabaseAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatabaseAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateGatewayResponse> createGateway(CreateGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateGatewayVerifyCodeResponse> createGatewayVerifyCode(CreateGatewayVerifyCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGatewayVerifyCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGatewayVerifyCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGatewayVerifyCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDatabaseAccessPointResponse> deleteDatabaseAccessPoint(DeleteDatabaseAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDatabaseAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatabaseAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatabaseAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteGatewayInstanceResponse> deleteGatewayInstance(DeleteGatewayInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGatewayInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGatewayInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGatewayInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DownloadGatewayProgramResponse> downloadGatewayProgram(DownloadGatewayProgramRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DownloadGatewayProgram").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadGatewayProgramResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadGatewayProgramResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FindUserGatewayByIdResponse> findUserGatewayById(FindUserGatewayByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindUserGatewayById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindUserGatewayByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindUserGatewayByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetUserDatabasesResponse> getUserDatabases(GetUserDatabasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUserDatabases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserDatabasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserDatabasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetUserGatewayInstancesResponse> getUserGatewayInstances(GetUserGatewayInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUserGatewayInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserGatewayInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserGatewayInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetUserGatewaysResponse> getUserGateways(GetUserGatewaysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUserGateways").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserGatewaysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserGatewaysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListDatabaseAccessPointResponse> listDatabaseAccessPoint(ListDatabaseAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDatabaseAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatabaseAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatabaseAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDatabaseResponse> modifyDatabase(ModifyDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyGatewayResponse> modifyGateway(ModifyGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RetryDatabaseResponse> retryDatabase(RetryDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetryDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StopGatewayResponse> stopGateway(StopGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
