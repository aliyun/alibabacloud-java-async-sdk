// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ft20180713.models.*;
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
        this.version = "2018-07-13";
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
    public CompletableFuture<BatchAuditTest01Response> batchAuditTest01(BatchAuditTest01Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchAuditTest01").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchAuditTest01Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchAuditTest01Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FTApiAliasApiResponse> fTApiAliasApi(FTApiAliasApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FTApiAliasApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FTApiAliasApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FTApiAliasApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FtDynamicAddressDubboResponse> ftDynamicAddressDubbo(FtDynamicAddressDubboRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FtDynamicAddressDubbo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FtDynamicAddressDubboResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FtDynamicAddressDubboResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FtDynamicAddressHsfResponse> ftDynamicAddressHsf(FtDynamicAddressHsfRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FtDynamicAddressHsf").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FtDynamicAddressHsfResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FtDynamicAddressHsfResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FtDynamicAddressHttpVpcResponse> ftDynamicAddressHttpVpc(FtDynamicAddressHttpVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FtDynamicAddressHttpVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FtDynamicAddressHttpVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FtDynamicAddressHttpVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FtEagleEyeResponse> ftEagleEye(FtEagleEyeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FtEagleEye").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FtEagleEyeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FtEagleEyeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FtFlowSpecialResponse> ftFlowSpecial(FtFlowSpecialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FtFlowSpecial").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FtFlowSpecialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FtFlowSpecialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FtGatedLaunchPolicy4Response> ftGatedLaunchPolicy4(FtGatedLaunchPolicy4Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FtGatedLaunchPolicy4").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FtGatedLaunchPolicy4Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FtGatedLaunchPolicy4Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FtIpFlowControlResponse> ftIpFlowControl(FtIpFlowControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FtIpFlowControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FtIpFlowControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FtIpFlowControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FtParamListResponse> ftParamList(FtParamListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FtParamList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FtParamListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FtParamListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<TestFlowStrategy01Response> testFlowStrategy01(TestFlowStrategy01Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestFlowStrategy01").setMethod(HttpMethod.PUT).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestFlowStrategy01Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestFlowStrategy01Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<TestHttpApiResponse> testHttpApi(TestHttpApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestHttpApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestHttpApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestHttpApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
