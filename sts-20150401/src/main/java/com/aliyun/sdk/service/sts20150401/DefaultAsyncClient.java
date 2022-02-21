// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.sts20150401.models.*;
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
        this.product = "Sts";
        this.version = "2015-04-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-edge-1", "sts.aliyuncs.com"),
            new TeaPair("cn-fujian", "sts.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "sts.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "sts.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "sts.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "sts-vpc.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "sts-vpc.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-wuhan", "sts.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "sts.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "sts.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "sts.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "sts.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<AssumeRoleResponse> assumeRole(AssumeRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AssumeRoleWithOIDCResponse> assumeRoleWithOIDC(AssumeRoleWithOIDCRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeRoleWithOIDC").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeRoleWithOIDCResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeRoleWithOIDCResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AssumeRoleWithSAMLResponse> assumeRoleWithSAML(AssumeRoleWithSAMLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeRoleWithSAML").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeRoleWithSAMLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeRoleWithSAMLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetCallerIdentityResponse> getCallerIdentity(GetCallerIdentityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCallerIdentity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCallerIdentityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCallerIdentityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
