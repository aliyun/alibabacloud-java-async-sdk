// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101;

import com.aliyun.core.http.*;
import com.aliyun.ft20210101.models.*;
import darabonba.core.utils.*;
import com.aliyun.pop.*;
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
        this.version = "2021-01-01";
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
    public CompletableFuture<CreateRPCPathTestResponse> createRPCPathTest(CreateRPCPathTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRPCPathTest").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRPCPathTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRPCPathTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateRamTestResponse> createRamTest(CreateRamTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRamTest").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRamTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRamTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DataRateLimitTestResponse> dataRateLimitTest(DataRateLimitTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DataRateLimitTest").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DataRateLimitTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DataRateLimitTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<NormalRpcHsfApiResponse> normalRpcHsfApi(NormalRpcHsfApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("NormalRpcHsfApi").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(NormalRpcHsfApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<NormalRpcHsfApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<NormalRpcHttpApiResponse> normalRpcHttpApi(NormalRpcHttpApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("NormalRpcHttpApi").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(NormalRpcHttpApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<NormalRpcHttpApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RpcDataUploadResponse> rpcDataUpload(RpcDataUploadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RpcDataUpload").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RpcDataUploadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RpcDataUploadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RpcDataUploadAndDownloadResponse> rpcDataUploadAndDownload(RpcDataUploadAndDownloadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RpcDataUploadAndDownload").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RpcDataUploadAndDownloadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RpcDataUploadAndDownloadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RpcDataUploadTestResponse> rpcDataUploadTest(RpcDataUploadTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RpcDataUploadTest").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RpcDataUploadTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RpcDataUploadTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RpcUploadDemoResponse> rpcUploadDemo(RpcUploadDemoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RpcUploadDemo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.OBJECT).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RpcUploadDemoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RpcUploadDemoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ServiceRouteTestResponse> serviceRouteTest(ServiceRouteTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ServiceRouteTest").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ServiceRouteTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ServiceRouteTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UserGcFetchResponse> userGcFetch(UserGcFetchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UserGcFetch").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UserGcFetchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UserGcFetchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UserGcGrayResponse> userGcGray(UserGcGrayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UserGcGray").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UserGcGrayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UserGcGrayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UserGcSerivceGrayResponse> userGcSerivceGray(UserGcSerivceGrayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UserGcSerivceGray").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UserGcSerivceGrayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UserGcSerivceGrayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<VpcInstanceAccessTestYResponse> vpcInstanceAccessTestY(VpcInstanceAccessTestYRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VpcInstanceAccessTestY").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VpcInstanceAccessTestYResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VpcInstanceAccessTestYResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
