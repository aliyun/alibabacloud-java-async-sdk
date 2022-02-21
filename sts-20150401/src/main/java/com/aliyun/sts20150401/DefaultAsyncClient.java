// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401;

import com.aliyun.core.http.*;
import com.aliyun.sts20150401.models.*;
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

    /**
     * ### Prerequisites
    Make sure that the RAM user who calls this API has been granted the STS administrative permission (AliyunSTSAssumeRoleAccess). Otherwise, an error is reported. The error message is as follows:
    
    "You are not authorized to do this action. You should be authorized by RAM ."
    
    The causes and solutions are as follows:
    
    -The RAM user is not authorized to assume a role by STS. Add a system policy (AliyunSTSAssumeRoleAccess) or a custom policy to the RAM user. For more information, see [authorize a RAM user](~~ 116146 ~~) and [specify which RAM role a RAM user can play](~~ 39744 ~~).
    -The RAM role trust policy does not include the RAM user you are using, that is, the RAM role does not allow the RAM user to assume: please add a trust policy for the RAM role to allow the RAM user to assume. For more information, see [Modify the trust policy for a RAM role](~~ 116819 ~~).
    
    
    ### QPS limit
    This API can be called up to 6,000 times per minute, and an Alibaba Cloud account, RAM users and RAM roles under this account share the same 6,000 times. If the number of requests exceeds 6,000, an error is returned. The error message is as follows:
    
    "Request was denied due to user flow control ."
    
    
     */
    @Override
    public CompletableFuture<AssumeRoleResponse> assumeRole(AssumeRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ### Prerequisites
    -Make sure that the OIDC Token (OIDC Token) has been obtained from an external identity provider (IdP).
    -Make sure that you have created an OIDC identity provider in RAM. For more information, see [create an OIDC identity provider](~~ 327123 ~~) or [CreateOIDCProvider](~~ 327135 ~~).
    -Make sure that you have created a RAM role with the trusted entity as the OIDC identity provider in RAM. For more information, see [create a RAM role with a trusted entity as an identity provider](~~ 116805 ~~) or [CreateRole](~~ 28710 ~~).
     */
    @Override
    public CompletableFuture<AssumeRoleWithOIDCResponse> assumeRoleWithOIDC(AssumeRoleWithOIDCRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeRoleWithOIDC").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeRoleWithOIDCResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeRoleWithOIDCResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ### Prerequisites
    -Make sure that the SAML response is obtained from an external identity provider (IdP).
    -Make sure that you have created a SAML identity provider in RAM. For more information, see [create a SAML identity provider](~~ 116083 ~~) or [CreateSAMLProvider](~~ 186846 ~~).
    -Make sure that you have created a RAM role with the trusted entity as the SAML identity provider in RAM. For more information, see [create a RAM role with a trusted entity as an identity provider](~~ 116805 ~~) or [CreateRole](~~ 28710 ~~).
     */
    @Override
    public CompletableFuture<AssumeRoleWithSAMLResponse> assumeRoleWithSAML(AssumeRoleWithSAMLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeRoleWithSAML").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCallerIdentity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCallerIdentityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCallerIdentityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
