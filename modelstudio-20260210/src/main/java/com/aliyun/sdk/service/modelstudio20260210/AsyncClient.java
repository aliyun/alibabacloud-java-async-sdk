// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.modelstudio20260210.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * @param request the request parameters of AddOrganizationMember  AddOrganizationMemberRequest
     * @return AddOrganizationMemberResponse
     */
    CompletableFuture<AddOrganizationMemberResponse> addOrganizationMember(AddOrganizationMemberRequest request);

    /**
     * @param request the request parameters of BatchAssignSeats  BatchAssignSeatsRequest
     * @return BatchAssignSeatsResponse
     */
    CompletableFuture<BatchAssignSeatsResponse> batchAssignSeats(BatchAssignSeatsRequest request);

    /**
     * @param request the request parameters of BatchRevokeSeats  BatchRevokeSeatsRequest
     * @return BatchRevokeSeatsResponse
     */
    CompletableFuture<BatchRevokeSeatsResponse> batchRevokeSeats(BatchRevokeSeatsRequest request);

    /**
     * @param request the request parameters of CreateApiKey  CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    CompletableFuture<CreateApiKeyResponse> createApiKey(CreateApiKeyRequest request);

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
    CompletableFuture<CreateTokenPlanInviteLinkResponse> createTokenPlanInviteLink(CreateTokenPlanInviteLinkRequest request);

    /**
     * @param request the request parameters of CreateTokenPlanKey  CreateTokenPlanKeyRequest
     * @return CreateTokenPlanKeyResponse
     */
    CompletableFuture<CreateTokenPlanKeyResponse> createTokenPlanKey(CreateTokenPlanKeyRequest request);

    /**
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    /**
     * @param request the request parameters of DeleteApiKey  DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     */
    CompletableFuture<DeleteApiKeyResponse> deleteApiKey(DeleteApiKeyRequest request);

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
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>An API key that is already disabled cannot be disabled again.</p>
     * 
     * @param request the request parameters of DisableApiKey  DisableApiKeyRequest
     * @return DisableApiKeyResponse
     */
    CompletableFuture<DisableApiKeyResponse> disableApiKey(DisableApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p>An API key that is already enabled cannot be enabled again.</p>
     * 
     * @param request the request parameters of EnableApiKey  EnableApiKeyRequest
     * @return EnableApiKeyResponse
     */
    CompletableFuture<EnableApiKeyResponse> enableApiKey(EnableApiKeyRequest request);

    /**
     * @param request the request parameters of GetApiKey  GetApiKeyRequest
     * @return GetApiKeyResponse
     */
    CompletableFuture<GetApiKeyResponse> getApiKey(GetApiKeyRequest request);

    /**
     * @param request the request parameters of GetBillingOverview  GetBillingOverviewRequest
     * @return GetBillingOverviewResponse
     */
    CompletableFuture<GetBillingOverviewResponse> getBillingOverview(GetBillingOverviewRequest request);

    /**
     * @param request the request parameters of GetBillingTrend  GetBillingTrendRequest
     * @return GetBillingTrendResponse
     */
    CompletableFuture<GetBillingTrendResponse> getBillingTrend(GetBillingTrendRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves information about a specified organization by OrgId.</p>
     * 
     * @param request the request parameters of GetOrganization  GetOrganizationRequest
     * @return GetOrganizationResponse
     */
    CompletableFuture<GetOrganizationResponse> getOrganization(GetOrganizationRequest request);

    /**
     * @param request the request parameters of GetOrganizationMemberSeatStats  GetOrganizationMemberSeatStatsRequest
     * @return GetOrganizationMemberSeatStatsResponse
     */
    CompletableFuture<GetOrganizationMemberSeatStatsResponse> getOrganizationMemberSeatStats(GetOrganizationMemberSeatStatsRequest request);

    /**
     * @param request the request parameters of GetSubscriptionSeatDetails  GetSubscriptionSeatDetailsRequest
     * @return GetSubscriptionSeatDetailsResponse
     */
    CompletableFuture<GetSubscriptionSeatDetailsResponse> getSubscriptionSeatDetails(GetSubscriptionSeatDetailsRequest request);

    /**
     * @param request the request parameters of GetSubscriptionStats  GetSubscriptionStatsRequest
     * @return GetSubscriptionStatsResponse
     */
    CompletableFuture<GetSubscriptionStatsResponse> getSubscriptionStats(GetSubscriptionStatsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the TokenPlan management platform account information when the user is logged in.</p>
     * 
     * @param request the request parameters of GetTokenPlanAccountDetail  GetTokenPlanAccountDetailRequest
     * @return GetTokenPlanAccountDetailResponse
     */
    CompletableFuture<GetTokenPlanAccountDetailResponse> getTokenPlanAccountDetail(GetTokenPlanAccountDetailRequest request);

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
    CompletableFuture<GetTokenPlanInviteLinkResponse> getTokenPlanInviteLink(GetTokenPlanInviteLinkRequest request);

    /**
     * @param request the request parameters of GetTokenPlanOrgInviteConfig  GetTokenPlanOrgInviteConfigRequest
     * @return GetTokenPlanOrgInviteConfigResponse
     */
    CompletableFuture<GetTokenPlanOrgInviteConfigResponse> getTokenPlanOrgInviteConfig(GetTokenPlanOrgInviteConfigRequest request);

    /**
     * @param request the request parameters of ListApiKeys  ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    CompletableFuture<ListApiKeysResponse> listApiKeys(ListApiKeysRequest request);

    /**
     * @param request the request parameters of ListModelLimits  ListModelLimitsRequest
     * @return ListModelLimitsResponse
     */
    CompletableFuture<ListModelLimitsResponse> listModelLimits(ListModelLimitsRequest request);

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
    CompletableFuture<ListModelPermissionsResponse> listModelPermissions(ListModelPermissionsRequest request);

    /**
     * @param request the request parameters of ListModels  ListModelsRequest
     * @return ListModelsResponse
     */
    CompletableFuture<ListModelsResponse> listModels(ListModelsRequest request);

    /**
     * @param request the request parameters of ListOrganizationMembers  ListOrganizationMembersRequest
     * @return ListOrganizationMembersResponse
     */
    CompletableFuture<ListOrganizationMembersResponse> listOrganizationMembers(ListOrganizationMembersRequest request);

    /**
     * @param request the request parameters of ListSubscriptionSharedPackages  ListSubscriptionSharedPackagesRequest
     * @return ListSubscriptionSharedPackagesResponse
     */
    CompletableFuture<ListSubscriptionSharedPackagesResponse> listSubscriptionSharedPackages(ListSubscriptionSharedPackagesRequest request);

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * @param request the request parameters of RemoveOrganizationMember  RemoveOrganizationMemberRequest
     * @return RemoveOrganizationMemberResponse
     */
    CompletableFuture<RemoveOrganizationMemberResponse> removeOrganizationMember(RemoveOrganizationMemberRequest request);

    /**
     * <b>description</b> :
     * <p>Only the API key value changes. The API key ID remains unchanged.</p>
     * 
     * @param request the request parameters of ResetApiKey  ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    CompletableFuture<ResetApiKeyResponse> resetApiKey(ResetApiKeyRequest request);

    /**
     * @param request the request parameters of RevokeTokenPlanInviteLink  RevokeTokenPlanInviteLinkRequest
     * @return RevokeTokenPlanInviteLinkResponse
     */
    CompletableFuture<RevokeTokenPlanInviteLinkResponse> revokeTokenPlanInviteLink(RevokeTokenPlanInviteLinkRequest request);

    /**
     * <b>description</b> :
     * <p>Only the API Key value changes. The API Key ID remains unchanged.</p>
     * 
     * @param request the request parameters of RotateTokenPlanKey  RotateTokenPlanKeyRequest
     * @return RotateTokenPlanKeyResponse
     */
    CompletableFuture<RotateTokenPlanKeyResponse> rotateTokenPlanKey(RotateTokenPlanKeyRequest request);

    /**
     * @param request the request parameters of SetTokenPlanOrgInviteConfig  SetTokenPlanOrgInviteConfigRequest
     * @return SetTokenPlanOrgInviteConfigResponse
     */
    CompletableFuture<SetTokenPlanOrgInviteConfigResponse> setTokenPlanOrgInviteConfig(SetTokenPlanOrgInviteConfigRequest request);

    /**
     * @param request the request parameters of UpdateApiKey  UpdateApiKeyRequest
     * @return UpdateApiKeyResponse
     */
    CompletableFuture<UpdateApiKeyResponse> updateApiKey(UpdateApiKeyRequest request);

    /**
     * @param request the request parameters of UpdateModelLimits  UpdateModelLimitsRequest
     * @return UpdateModelLimitsResponse
     */
    CompletableFuture<UpdateModelLimitsResponse> updateModelLimits(UpdateModelLimitsRequest request);

    /**
     * @param request the request parameters of UpdateModelPermissions  UpdateModelPermissionsRequest
     * @return UpdateModelPermissionsResponse
     */
    CompletableFuture<UpdateModelPermissionsResponse> updateModelPermissions(UpdateModelPermissionsRequest request);

    /**
     * @param request the request parameters of UpdateOrganization  UpdateOrganizationRequest
     * @return UpdateOrganizationResponse
     */
    CompletableFuture<UpdateOrganizationResponse> updateOrganization(UpdateOrganizationRequest request);

    /**
     * @param request the request parameters of UpdateOrganizationMember  UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     */
    CompletableFuture<UpdateOrganizationMemberResponse> updateOrganizationMember(UpdateOrganizationMemberRequest request);

}
