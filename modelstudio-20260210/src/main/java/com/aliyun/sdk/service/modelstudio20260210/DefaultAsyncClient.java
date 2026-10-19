// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.modelstudio20260210.models.*;
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
        this.product = "ModelStudio";
        this.version = "2026-02-10";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddOrganizationMember  AddOrganizationMemberRequest
     * @return AddOrganizationMemberResponse
     */
    @Override
    public CompletableFuture<AddOrganizationMemberResponse> addOrganizationMember(AddOrganizationMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddOrganizationMember").setMethod(HttpMethod.POST).setPathRegex("/tokenplan/organization/member-additions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddOrganizationMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddOrganizationMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchAssignSeats  BatchAssignSeatsRequest
     * @return BatchAssignSeatsResponse
     */
    @Override
    public CompletableFuture<BatchAssignSeatsResponse> batchAssignSeats(BatchAssignSeatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchAssignSeats").setMethod(HttpMethod.POST).setPathRegex("/tokenplan/subscription/seat-assignments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchAssignSeatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchAssignSeatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchRevokeSeats  BatchRevokeSeatsRequest
     * @return BatchRevokeSeatsResponse
     */
    @Override
    public CompletableFuture<BatchRevokeSeatsResponse> batchRevokeSeats(BatchRevokeSeatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchRevokeSeats").setMethod(HttpMethod.POST).setPathRegex("/tokenplan/subscription/seat-revocations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchRevokeSeatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchRevokeSeatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateApiKey  CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    @Override
    public CompletableFuture<CreateApiKeyResponse> createApiKey(CreateApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateApiKey").setMethod(HttpMethod.POST).setPathRegex("/modelstudio/apikeys").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A user can have only one valid invitation link at a time.
     * If the user already has a valid invitation link, this operation returns the existing link.
     * To create a new link, call the RevokeTokenPlanInviteLink operation to invalidate the current link first.
     * This operation returns only the generated token. The invitation link is assembled in the following format: <code>https://{host}/accept-invite?token=[token]&amp;orgId=[orgId]</code></p>
     * <ul>
     * <li>For the China site, the host is tokenplan-enterprise.bailian.aliyunportal.com.</li>
     * <li>For the China site, the host is tokenplan-enterprise.modelstudio.aliyunportal.com.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTokenPlanInviteLink  CreateTokenPlanInviteLinkRequest
     * @return CreateTokenPlanInviteLinkResponse
     */
    @Override
    public CompletableFuture<CreateTokenPlanInviteLinkResponse> createTokenPlanInviteLink(CreateTokenPlanInviteLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTokenPlanInviteLink").setMethod(HttpMethod.POST).setPathRegex("/tokenplan/invite/link/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTokenPlanInviteLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTokenPlanInviteLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTokenPlanKey  CreateTokenPlanKeyRequest
     * @return CreateTokenPlanKeyResponse
     */
    @Override
    public CompletableFuture<CreateTokenPlanKeyResponse> createTokenPlanKey(CreateTokenPlanKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTokenPlanKey").setMethod(HttpMethod.POST).setPathRegex("/tokenplan/api-keys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTokenPlanKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTokenPlanKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    @Override
    public CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkspace").setMethod(HttpMethod.POST).setPathRegex("/modelstudio/workspaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteApiKey  DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     */
    @Override
    public CompletableFuture<DeleteApiKeyResponse> deleteApiKey(DeleteApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteApiKey").setMethod(HttpMethod.DELETE).setPathRegex("/modelstudio/apikeys/{apiKeyId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A workspace can be deleted only if the following conditional requirements are met:</p>
     * <ol>
     * <li>The workspace is not the default workspace.</li>
     * <li>The workspace is not used to purchase other products, such as AMB.</li>
     * <li>In permission management, the workspace is not granted to Resource Access Management (RAM) users or RAM roles.</li>
     * <li>The workspace does not contain any resources, such as API keys, model deployments, or knowledge bases.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    @Override
    public CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWorkspace").setMethod(HttpMethod.DELETE).setPathRegex("/modelstudio/workspaces/{workspaceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>An API key that is already disabled cannot be disabled again.</p>
     * 
     * @param request the request parameters of DisableApiKey  DisableApiKeyRequest
     * @return DisableApiKeyResponse
     */
    @Override
    public CompletableFuture<DisableApiKeyResponse> disableApiKey(DisableApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableApiKey").setMethod(HttpMethod.PUT).setPathRegex("/modelstudio/apikeys/{apiKeyId}/disable").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>An API key that is already enabled cannot be enabled again.</p>
     * 
     * @param request the request parameters of EnableApiKey  EnableApiKeyRequest
     * @return EnableApiKeyResponse
     */
    @Override
    public CompletableFuture<EnableApiKeyResponse> enableApiKey(EnableApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableApiKey").setMethod(HttpMethod.PUT).setPathRegex("/modelstudio/apikeys/{apiKeyId}/enable").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetApiKey  GetApiKeyRequest
     * @return GetApiKeyResponse
     */
    @Override
    public CompletableFuture<GetApiKeyResponse> getApiKey(GetApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetApiKey").setMethod(HttpMethod.GET).setPathRegex("/modelstudio/apikeys/{apiKeyId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBillingOverview  GetBillingOverviewRequest
     * @return GetBillingOverviewResponse
     */
    @Override
    public CompletableFuture<GetBillingOverviewResponse> getBillingOverview(GetBillingOverviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetBillingOverview").setMethod(HttpMethod.GET).setPathRegex("/modelstudio/billing/overview").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBillingOverviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBillingOverviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBillingTrend  GetBillingTrendRequest
     * @return GetBillingTrendResponse
     */
    @Override
    public CompletableFuture<GetBillingTrendResponse> getBillingTrend(GetBillingTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetBillingTrend").setMethod(HttpMethod.GET).setPathRegex("/modelstudio/billing/trend").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBillingTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBillingTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves information about a specified organization by OrgId.</p>
     * 
     * @param request the request parameters of GetOrganization  GetOrganizationRequest
     * @return GetOrganizationResponse
     */
    @Override
    public CompletableFuture<GetOrganizationResponse> getOrganization(GetOrganizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOrganization").setMethod(HttpMethod.GET).setPathRegex("/tokenplan/organization").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrganizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrganizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOrganizationMemberSeatStats  GetOrganizationMemberSeatStatsRequest
     * @return GetOrganizationMemberSeatStatsResponse
     */
    @Override
    public CompletableFuture<GetOrganizationMemberSeatStatsResponse> getOrganizationMemberSeatStats(GetOrganizationMemberSeatStatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOrganizationMemberSeatStats").setMethod(HttpMethod.GET).setPathRegex("/tokenplan/organization/member-seat-stats").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrganizationMemberSeatStatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrganizationMemberSeatStatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSubscriptionSeatDetails  GetSubscriptionSeatDetailsRequest
     * @return GetSubscriptionSeatDetailsResponse
     */
    @Override
    public CompletableFuture<GetSubscriptionSeatDetailsResponse> getSubscriptionSeatDetails(GetSubscriptionSeatDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSubscriptionSeatDetails").setMethod(HttpMethod.GET).setPathRegex("/tokenplan/subscription/seat-detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSubscriptionSeatDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSubscriptionSeatDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSubscriptionStats  GetSubscriptionStatsRequest
     * @return GetSubscriptionStatsResponse
     */
    @Override
    public CompletableFuture<GetSubscriptionStatsResponse> getSubscriptionStats(GetSubscriptionStatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSubscriptionStats").setMethod(HttpMethod.GET).setPathRegex("/tokenplan/subscription/stats").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSubscriptionStatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSubscriptionStatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the TokenPlan management platform account information when the user is logged in.</p>
     * 
     * @param request the request parameters of GetTokenPlanAccountDetail  GetTokenPlanAccountDetailRequest
     * @return GetTokenPlanAccountDetailResponse
     */
    @Override
    public CompletableFuture<GetTokenPlanAccountDetailResponse> getTokenPlanAccountDetail(GetTokenPlanAccountDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTokenPlanAccountDetail").setMethod(HttpMethod.GET).setPathRegex("/tokenplan/account").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTokenPlanAccountDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTokenPlanAccountDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation returns only the generated token and expiration time. The invitation link is assembled in the following format: <code>https://{host}/accept-invite?token=[token]&amp;orgId=[orgId]</code></p>
     * <ul>
     * <li>For the China site, the host is tokenplan-enterprise.bailian.aliyunportal.com.</li>
     * <li>For the international site, the host is tokenplan-enterprise.modelstudio.aliyunportal.com.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTokenPlanInviteLink  GetTokenPlanInviteLinkRequest
     * @return GetTokenPlanInviteLinkResponse
     */
    @Override
    public CompletableFuture<GetTokenPlanInviteLinkResponse> getTokenPlanInviteLink(GetTokenPlanInviteLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTokenPlanInviteLink").setMethod(HttpMethod.GET).setPathRegex("/tokenplan/invite/link/get").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTokenPlanInviteLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTokenPlanInviteLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTokenPlanOrgInviteConfig  GetTokenPlanOrgInviteConfigRequest
     * @return GetTokenPlanOrgInviteConfigResponse
     */
    @Override
    public CompletableFuture<GetTokenPlanOrgInviteConfigResponse> getTokenPlanOrgInviteConfig(GetTokenPlanOrgInviteConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTokenPlanOrgInviteConfig").setMethod(HttpMethod.GET).setPathRegex("/tokenplan/invite/config/get").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTokenPlanOrgInviteConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTokenPlanOrgInviteConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApiKeys  ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    @Override
    public CompletableFuture<ListApiKeysResponse> listApiKeys(ListApiKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApiKeys").setMethod(HttpMethod.GET).setPathRegex("/modelstudio/apikeys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApiKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApiKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListModelLimits  ListModelLimitsRequest
     * @return ListModelLimitsResponse
     */
    @Override
    public CompletableFuture<ListModelLimitsResponse> listModelLimits(ListModelLimitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModelLimits").setMethod(HttpMethod.GET).setPathRegex("/modelstudio/models/limits").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelLimitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelLimitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Use <code>workspaceId</code> to specify the workspace to query (required, cannot be empty).</li>
     * <li>Token-based pagination is used: <code>nextToken</code> is a string-type offset. Do not pass it for the first page. <code>maxResults</code> defaults to 20. If the upper limit is exceeded, <code>InvalidParameter.maxResults</code> is returned.</li>
     * <li><code>authorizationScope</code> controls the query dimension: <code>AUTHORIZED</code> = models that have been authorized for the specified action. <code>AUTHORIZABLE</code> = full authorizable catalog.</li>
     * <li><code>modelAction</code> specifies the authorization action dimension. Currently only <code>INFERENCE</code> is supported. If left empty, it defaults to <code>INFERENCE</code>.</li>
     * <li><code>filter</code> supports filtering by <code>name</code> (fuzzy match on model and name) or <code>model</code> (exact match on a single model).</li>
     * <li>Returns a <code>TokenBasedPage</code> that contains the authorization status (inference/fineTune/deploy) and rate limit information for each model.</li>
     * </ul>
     * 
     * @param request the request parameters of ListModelPermissions  ListModelPermissionsRequest
     * @return ListModelPermissionsResponse
     */
    @Override
    public CompletableFuture<ListModelPermissionsResponse> listModelPermissions(ListModelPermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModelPermissions").setMethod(HttpMethod.GET).setPathRegex("/modelstudio/models/permissions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelPermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelPermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListModels  ListModelsRequest
     * @return ListModelsResponse
     */
    @Override
    public CompletableFuture<ListModelsResponse> listModels(ListModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModels").setMethod(HttpMethod.GET).setPathRegex("/modelstudio/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOrganizationMembers  ListOrganizationMembersRequest
     * @return ListOrganizationMembersResponse
     */
    @Override
    public CompletableFuture<ListOrganizationMembersResponse> listOrganizationMembers(ListOrganizationMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOrganizationMembers").setMethod(HttpMethod.GET).setPathRegex("/tokenplan/organization/members").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOrganizationMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOrganizationMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSubscriptionSharedPackages  ListSubscriptionSharedPackagesRequest
     * @return ListSubscriptionSharedPackagesResponse
     */
    @Override
    public CompletableFuture<ListSubscriptionSharedPackagesResponse> listSubscriptionSharedPackages(ListSubscriptionSharedPackagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSubscriptionSharedPackages").setMethod(HttpMethod.GET).setPathRegex("/tokenplan/subscription/shared-packages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubscriptionSharedPackagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubscriptionSharedPackagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    @Override
    public CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkspaces").setMethod(HttpMethod.GET).setPathRegex("/modelstudio/workspaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkspacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkspacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveOrganizationMember  RemoveOrganizationMemberRequest
     * @return RemoveOrganizationMemberResponse
     */
    @Override
    public CompletableFuture<RemoveOrganizationMemberResponse> removeOrganizationMember(RemoveOrganizationMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveOrganizationMember").setMethod(HttpMethod.POST).setPathRegex("/tokenplan/organization/member-removals").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveOrganizationMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveOrganizationMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the API key value changes. The API key ID remains unchanged.</p>
     * 
     * @param request the request parameters of ResetApiKey  ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    @Override
    public CompletableFuture<ResetApiKeyResponse> resetApiKey(ResetApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResetApiKey").setMethod(HttpMethod.PUT).setPathRegex("/modelstudio/apikeys/{apiKeyId}/reset").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokeTokenPlanInviteLink  RevokeTokenPlanInviteLinkRequest
     * @return RevokeTokenPlanInviteLinkResponse
     */
    @Override
    public CompletableFuture<RevokeTokenPlanInviteLinkResponse> revokeTokenPlanInviteLink(RevokeTokenPlanInviteLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokeTokenPlanInviteLink").setMethod(HttpMethod.POST).setPathRegex("/tokenplan/invite/link/revoke").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeTokenPlanInviteLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeTokenPlanInviteLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the API Key value changes. The API Key ID remains unchanged.</p>
     * 
     * @param request the request parameters of RotateTokenPlanKey  RotateTokenPlanKeyRequest
     * @return RotateTokenPlanKeyResponse
     */
    @Override
    public CompletableFuture<RotateTokenPlanKeyResponse> rotateTokenPlanKey(RotateTokenPlanKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RotateTokenPlanKey").setMethod(HttpMethod.POST).setPathRegex("/tokenplan/api-key-rotations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RotateTokenPlanKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RotateTokenPlanKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetTokenPlanOrgInviteConfig  SetTokenPlanOrgInviteConfigRequest
     * @return SetTokenPlanOrgInviteConfigResponse
     */
    @Override
    public CompletableFuture<SetTokenPlanOrgInviteConfigResponse> setTokenPlanOrgInviteConfig(SetTokenPlanOrgInviteConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SetTokenPlanOrgInviteConfig").setMethod(HttpMethod.POST).setPathRegex("/tokenplan/invite/config/set").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetTokenPlanOrgInviteConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetTokenPlanOrgInviteConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApiKey  UpdateApiKeyRequest
     * @return UpdateApiKeyResponse
     */
    @Override
    public CompletableFuture<UpdateApiKeyResponse> updateApiKey(UpdateApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateApiKey").setMethod(HttpMethod.PUT).setPathRegex("/modelstudio/apikeys/{apiKeyId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateModelLimits  UpdateModelLimitsRequest
     * @return UpdateModelLimitsResponse
     */
    @Override
    public CompletableFuture<UpdateModelLimitsResponse> updateModelLimits(UpdateModelLimitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModelLimits").setMethod(HttpMethod.POST).setPathRegex("/modelstudio/models/limits").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelLimitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelLimitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateModelPermissions  UpdateModelPermissionsRequest
     * @return UpdateModelPermissionsResponse
     */
    @Override
    public CompletableFuture<UpdateModelPermissionsResponse> updateModelPermissions(UpdateModelPermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModelPermissions").setMethod(HttpMethod.POST).setPathRegex("/modelstudio/models/permissions").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelPermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelPermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOrganization  UpdateOrganizationRequest
     * @return UpdateOrganizationResponse
     */
    @Override
    public CompletableFuture<UpdateOrganizationResponse> updateOrganization(UpdateOrganizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateOrganization").setMethod(HttpMethod.POST).setPathRegex("/tokenplan/organization").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOrganizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOrganizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOrganizationMember  UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     */
    @Override
    public CompletableFuture<UpdateOrganizationMemberResponse> updateOrganizationMember(UpdateOrganizationMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateOrganizationMember").setMethod(HttpMethod.POST).setPathRegex("/tokenplan/organization/members/update").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOrganizationMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOrganizationMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
