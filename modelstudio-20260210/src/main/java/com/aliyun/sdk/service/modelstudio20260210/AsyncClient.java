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
     * @param request the request parameters of CreateApiKey  CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    CompletableFuture<CreateApiKeyResponse> createApiKey(CreateApiKeyRequest request);

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
     * @param request the request parameters of GetSubscriptionSeatDetails  GetSubscriptionSeatDetailsRequest
     * @return GetSubscriptionSeatDetailsResponse
     */
    CompletableFuture<GetSubscriptionSeatDetailsResponse> getSubscriptionSeatDetails(GetSubscriptionSeatDetailsRequest request);

    /**
     * @param request the request parameters of ListApiKeys  ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    CompletableFuture<ListApiKeysResponse> listApiKeys(ListApiKeysRequest request);

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * @param request the request parameters of ResetApiKey  ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    CompletableFuture<ResetApiKeyResponse> resetApiKey(ResetApiKeyRequest request);

    /**
     * @param request the request parameters of UpdateApiKey  UpdateApiKeyRequest
     * @return UpdateApiKeyResponse
     */
    CompletableFuture<UpdateApiKeyResponse> updateApiKey(UpdateApiKeyRequest request);

}
