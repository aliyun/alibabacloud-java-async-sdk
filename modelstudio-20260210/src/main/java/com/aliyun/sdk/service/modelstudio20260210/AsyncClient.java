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
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * @param request the request parameters of DisableApiKey  DisableApiKeyRequest
     * @return DisableApiKeyResponse
     */
    CompletableFuture<DisableApiKeyResponse> disableApiKey(DisableApiKeyRequest request);

    /**
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
     * @param request the request parameters of GetTokenPlanAccountDetail  GetTokenPlanAccountDetailRequest
     * @return GetTokenPlanAccountDetailResponse
     */
    CompletableFuture<GetTokenPlanAccountDetailResponse> getTokenPlanAccountDetail(GetTokenPlanAccountDetailRequest request);

    /**
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>通过 <code>workspaceId</code> 指定要查询的业务空间（必填，不可为空）。</li>
     * <li>采用 Token 分页：<code>nextToken</code> 为字符串型 offset，首页不传；<code>maxResults</code> 默认 20，超过上限报 <code>InvalidParameter.maxResults</code>。</li>
     * <li><code>authorizationScope</code> 控制查询维度：<code>AUTHORIZED</code>=已授权指定 action 的模型，<code>AUTHORIZABLE</code>=全量可授权目录。</li>
     * <li><code>modelAction</code> 指定授权 action 维度，当前仅支持 <code>INFERENCE</code>，为空默认 <code>INFERENCE</code>。</li>
     * <li><code>filter</code> 支持按 <code>name</code>（模糊匹配 model+name）或 <code>model</code>（精确匹配单个模型）过滤。</li>
     * <li>返回 <code>TokenBasedPage</code>，含每个模型的授权态（inference/fineTune/deploy）与限流信息。</li>
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
