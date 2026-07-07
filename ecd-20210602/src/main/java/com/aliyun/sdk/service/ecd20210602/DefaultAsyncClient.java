// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ecd20210602.models.*;
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
        this.product = "ecd";
        this.version = "2021-06-02";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("us-west-1", "ecd.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "ecd.us-east-1.aliyuncs.com"),
            new TeaPair("me-east-1", "ecd.me-east-1.aliyuncs.com"),
            new TeaPair("me-central-1", "ecd.me-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "ecd.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "ecd.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ecd.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "ecd.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ecd.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ecd.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai", "ecd.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ecd.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-nanjing", "ecd.cn-nanjing.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ecd.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ecd.cn-hangzhou-finance.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ecd.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "ecd.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ecd.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-beijing", "ecd.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "ecd.ap-southeast-7.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "ecd.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ecd.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ecd.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "ecd.ap-northeast-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateTenantSkill  CreateTenantSkillRequest
     * @return CreateTenantSkillResponse
     */
    @Override
    public CompletableFuture<CreateTenantSkillResponse> createTenantSkill(CreateTenantSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTenantSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTenantSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTenantSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTenantSkills  DeleteTenantSkillsRequest
     * @return DeleteTenantSkillsResponse
     */
    @Override
    public CompletableFuture<DeleteTenantSkillsResponse> deleteTenantSkills(DeleteTenantSkillsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTenantSkills").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTenantSkillsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTenantSkillsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOssStsToken  GetOssStsTokenRequest
     * @return GetOssStsTokenResponse
     */
    @Override
    public CompletableFuture<GetOssStsTokenResponse> getOssStsToken(GetOssStsTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOssStsToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOssStsTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOssStsTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetParseProgress  GetParseProgressRequest
     * @return GetParseProgressResponse
     */
    @Override
    public CompletableFuture<GetParseProgressResponse> getParseProgress(GetParseProgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetParseProgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetParseProgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetParseProgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSecureSkillIdentities  ListSecureSkillIdentitiesRequest
     * @return ListSecureSkillIdentitiesResponse
     */
    @Override
    public CompletableFuture<ListSecureSkillIdentitiesResponse> listSecureSkillIdentities(ListSecureSkillIdentitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSecureSkillIdentities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSecureSkillIdentitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSecureSkillIdentitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSkillAuthedIdentities  ListSkillAuthedIdentitiesRequest
     * @return ListSkillAuthedIdentitiesResponse
     */
    @Override
    public CompletableFuture<ListSkillAuthedIdentitiesResponse> listSkillAuthedIdentities(ListSkillAuthedIdentitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSkillAuthedIdentities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillAuthedIdentitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillAuthedIdentitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    @Override
    public CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSkills").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ParseSkillPackage  ParseSkillPackageRequest
     * @return ParseSkillPackageResponse
     */
    @Override
    public CompletableFuture<ParseSkillPackageResponse> parseSkillPackage(ParseSkillPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ParseSkillPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ParseSkillPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ParseSkillPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetIdentitySkillAuth  SetIdentitySkillAuthRequest
     * @return SetIdentitySkillAuthResponse
     */
    @Override
    public CompletableFuture<SetIdentitySkillAuthResponse> setIdentitySkillAuth(SetIdentitySkillAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetIdentitySkillAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetIdentitySkillAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetIdentitySkillAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetIdentitySkillSecurity  SetIdentitySkillSecurityRequest
     * @return SetIdentitySkillSecurityResponse
     */
    @Override
    public CompletableFuture<SetIdentitySkillSecurityResponse> setIdentitySkillSecurity(SetIdentitySkillSecurityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetIdentitySkillSecurity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetIdentitySkillSecurityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetIdentitySkillSecurityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetTenantSkillEnabled  SetTenantSkillEnabledRequest
     * @return SetTenantSkillEnabledResponse
     */
    @Override
    public CompletableFuture<SetTenantSkillEnabledResponse> setTenantSkillEnabled(SetTenantSkillEnabledRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetTenantSkillEnabled").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetTenantSkillEnabledResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetTenantSkillEnabledResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
