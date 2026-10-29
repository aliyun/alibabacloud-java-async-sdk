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
     * <p>A user can have only one valid invitation link.
     * If the user already has a valid invitation link, this operation returns the existing link.
     * To create a new link, call the RevokeTokenPlanInviteLink operation to invalidate the current link.
     * This operation returns only the generated token. The invitation link is concatenated in the following format: <code>https://{host}/accept-invite?token=[token]&amp;orgId=[orgId]</code>.</p>
     * <ul>
     * <li>For the China site, the host is tokenplan-enterprise.bailian.aliyunportal.com.</li>
     * <li>For the international site, the host is tokenplan-enterprise.modelstudio.aliyunportal.com.</li>
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
     * <p>You can delete a workspace only if it meets the following conditional requirements:</p>
     * <ol>
     * <li>The workspace is not the default workspace.</li>
     * <li>The workspace is not used to purchase other services, such as AMB.</li>
     * <li>The workspace is not granted to Resource Access Management (RAM) users or RAM roles in permission management.</li>
     * <li>No resources exist in the workspace, such as API keys, model deployments, or knowledge bases.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot disable an API key repeatedly.</p>
     * 
     * @param request the request parameters of DisableApiKey  DisableApiKeyRequest
     * @return DisableApiKeyResponse
     */
    CompletableFuture<DisableApiKeyResponse> disableApiKey(DisableApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot enable an API key multiple times.</p>
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
     * <p>Retrieves the details of a specified organization by using the organization ID.</p>
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
     * <p>Retrieves the account information from the TokenPlan management platform when logged on.</p>
     * 
     * @param request the request parameters of GetTokenPlanAccountDetail  GetTokenPlanAccountDetailRequest
     * @return GetTokenPlanAccountDetailResponse
     */
    CompletableFuture<GetTokenPlanAccountDetailResponse> getTokenPlanAccountDetail(GetTokenPlanAccountDetailRequest request);

    /**
     * <b>description</b> :
     * <p>This operation returns only the generated token and expiration time. The invitation link is concatenated in the following format: <code>https://{host}/accept-invite?token=[token]&amp;orgId=[orgId]</code>.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>Specify the workspace to query by using <code>workspaceId</code> (required and cannot be empty).</li>
     * <li>Uses token-based pagination: <code>nextToken</code> is a string offset and is not required for the first page. The default value of <code>maxResults</code> is 20. If the value exceeds the upper limit, the <code>InvalidParameter.maxResults</code> error is returned.</li>
     * <li><code>authorizationScope</code> controls the query dimension: <code>AUTHORIZED</code> specifies models that are authorized for the specified action, and <code>AUTHORIZABLE</code> specifies all authorizable directories.</li>
     * <li><code>modelAction</code> specifies the authorization action dimension. Currently, only <code>INFERENCE</code> is supported. If this parameter is left empty, the default value <code>INFERENCE</code> is used.</li>
     * <li><code>filter</code> supports filtering by <code>name</code> (fuzzy match for model and name) or <code>model</code> (exact match for a single model).</li>
     * <li>Returns <code>TokenBasedPage</code>, which contains the authorization status (inference, fine-tuning, and deployment) and throttling information for each model.</li>
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
     * <p>Only the API key changes. The API key ID remains unchanged.</p>
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
