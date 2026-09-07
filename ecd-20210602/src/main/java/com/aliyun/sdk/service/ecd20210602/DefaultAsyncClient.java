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
        this.endpointMap = new java.util.HashMap<>();
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
     * <b>description</b> :
     * <p>The obtained SecurityToken is valid for 15 minutes.</p>
     * 
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
     * <b>description</b> :
     * <p>Call the ParseSkillPackage operation first. Poll this operation every 3 seconds.</p>
     * 
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
     * <b>description</b> :
     * <p>The resource type supports only cloud computers.</p>
     * 
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
     * <b>description</b> :
     * <p>Authorized objects support only cloud computers.</p>
     * 
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
     * <b>description</b> :
     * <p>The query scope is determined by the caller identity and includes applications uploaded by the current tenant and marketplace applications that the tenant is authorized to view. The visibility of marketplace applications is subject to authorization and display policy restrictions. The authorization and auto-installation information in the list represents application configurations and does not indicate the actual installation result on a specific device.</p>
     * <ul>
     * <li><strong>Application identity</strong>: Id is a numeric application ID, and AppUid is a character string UID. The two cannot be used interchangeably.</li>
     * <li><strong>Authorization scope</strong>: DistributeType is used together with AuthType. For example, <code>AuthType=auth_type_user</code> and <code>DistributeType=ALL</code> indicate that the application is allocated to all users on a per-user dimension.</li>
     * <li><strong>Auto-installation</strong>: AutoInstallmentType specifies the auto-installation scope policy, which is used to distinguish between full, partial, or disabled auto-installation.</li>
     * <li><strong>Partial auto-installation</strong>: When AutoInstallmentType is set to 1, use SetAutoInstallUser or SetAutoInstallDesktop to configure specific users or cloud desktops. OperationType=1 indicates enabled, and OperationType=2 indicates disabled. ListTenantApp only returns configurations and does not modify auto-installation settings.</li>
     * <li><strong>Capabilities and execution results</strong>: The silent installation capability is application metadata returned in the response. To determine the actual installation or execution result on a device, use the corresponding execution result query capability.</li>
     * <li><strong>Optional information</strong>: Information such as timestamps may be empty.</li>
     * <li><strong>Compatibility handling</strong>: Extension information and subtype do not use closed enumerations. Clients should ignore unrecognized extension fields and be compatible with new enumeration values.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTenantApp  ListTenantAppRequest
     * @return ListTenantAppResponse
     */
    @Override
    public CompletableFuture<ListTenantAppResponse> listTenantApp(ListTenantAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTenantApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTenantAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTenantAppResponse> future = new CompletableFuture<>();
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
     * <b>description</b> :
     * <p>The authorized object supports only cloud computers.</p>
     * 
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
     * <b>description</b> :
     * <p>The resource type supports only cloud computers.</p>
     * 
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
