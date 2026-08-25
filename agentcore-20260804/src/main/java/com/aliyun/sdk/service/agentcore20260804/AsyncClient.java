// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agentcore20260804.models.*;
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
     * @param request the request parameters of BatchDeleteModels  BatchDeleteModelsRequest
     * @return BatchDeleteModelsResponse
     */
    CompletableFuture<BatchDeleteModelsResponse> batchDeleteModels(BatchDeleteModelsRequest request);

    /**
     * @param request the request parameters of CreateCredential  CreateCredentialRequest
     * @return CreateCredentialResponse
     */
    CompletableFuture<CreateCredentialResponse> createCredential(CreateCredentialRequest request);

    /**
     * @param request the request parameters of CreateIdentityProvider  CreateIdentityProviderRequest
     * @return CreateIdentityProviderResponse
     */
    CompletableFuture<CreateIdentityProviderResponse> createIdentityProvider(CreateIdentityProviderRequest request);

    /**
     * @param request the request parameters of CreateModel  CreateModelRequest
     * @return CreateModelResponse
     */
    CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request);

    /**
     * @param request the request parameters of CreateModelConnection  CreateModelConnectionRequest
     * @return CreateModelConnectionResponse
     */
    CompletableFuture<CreateModelConnectionResponse> createModelConnection(CreateModelConnectionRequest request);

    /**
     * @param request the request parameters of CreateTeam  CreateTeamRequest
     * @return CreateTeamResponse
     */
    CompletableFuture<CreateTeamResponse> createTeam(CreateTeamRequest request);

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * @param request the request parameters of DebugModel  DebugModelRequest
     * @return DebugModelResponse
     */
    CompletableFuture<DebugModelResponse> debugModel(DebugModelRequest request);

    /**
     * @param request the request parameters of DeleteCredential  DeleteCredentialRequest
     * @return DeleteCredentialResponse
     */
    CompletableFuture<DeleteCredentialResponse> deleteCredential(DeleteCredentialRequest request);

    /**
     * @param request the request parameters of DeleteIdentityProvider  DeleteIdentityProviderRequest
     * @return DeleteIdentityProviderResponse
     */
    CompletableFuture<DeleteIdentityProviderResponse> deleteIdentityProvider(DeleteIdentityProviderRequest request);

    /**
     * @param request the request parameters of DeleteModel  DeleteModelRequest
     * @return DeleteModelResponse
     */
    CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request);

    /**
     * @param request the request parameters of DeleteModelConnection  DeleteModelConnectionRequest
     * @return DeleteModelConnectionResponse
     */
    CompletableFuture<DeleteModelConnectionResponse> deleteModelConnection(DeleteModelConnectionRequest request);

    /**
     * @param request the request parameters of DeleteTeam  DeleteTeamRequest
     * @return DeleteTeamResponse
     */
    CompletableFuture<DeleteTeamResponse> deleteTeam(DeleteTeamRequest request);

    /**
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * @param request the request parameters of GetCredential  GetCredentialRequest
     * @return GetCredentialResponse
     */
    CompletableFuture<GetCredentialResponse> getCredential(GetCredentialRequest request);

    /**
     * @param request the request parameters of GetIdentityProvider  GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    CompletableFuture<GetIdentityProviderResponse> getIdentityProvider(GetIdentityProviderRequest request);

    /**
     * @param request the request parameters of GetModel  GetModelRequest
     * @return GetModelResponse
     */
    CompletableFuture<GetModelResponse> getModel(GetModelRequest request);

    /**
     * @param request the request parameters of GetModelConnection  GetModelConnectionRequest
     * @return GetModelConnectionResponse
     */
    CompletableFuture<GetModelConnectionResponse> getModelConnection(GetModelConnectionRequest request);

    /**
     * @param request the request parameters of GetTeam  GetTeamRequest
     * @return GetTeamResponse
     */
    CompletableFuture<GetTeamResponse> getTeam(GetTeamRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of ListCredentials  ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    CompletableFuture<ListCredentialsResponse> listCredentials(ListCredentialsRequest request);

    /**
     * @param request the request parameters of ListIdentityProviders  ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    CompletableFuture<ListIdentityProvidersResponse> listIdentityProviders(ListIdentityProvidersRequest request);

    /**
     * @param request the request parameters of ListModelConnections  ListModelConnectionsRequest
     * @return ListModelConnectionsResponse
     */
    CompletableFuture<ListModelConnectionsResponse> listModelConnections(ListModelConnectionsRequest request);

    /**
     * @param request the request parameters of ListModels  ListModelsRequest
     * @return ListModelsResponse
     */
    CompletableFuture<ListModelsResponse> listModels(ListModelsRequest request);

    /**
     * @param request the request parameters of ListPredefinedModelProviders  ListPredefinedModelProvidersRequest
     * @return ListPredefinedModelProvidersResponse
     */
    CompletableFuture<ListPredefinedModelProvidersResponse> listPredefinedModelProviders(ListPredefinedModelProvidersRequest request);

    /**
     * @param request the request parameters of ListPredefinedModels  ListPredefinedModelsRequest
     * @return ListPredefinedModelsResponse
     */
    CompletableFuture<ListPredefinedModelsResponse> listPredefinedModels(ListPredefinedModelsRequest request);

    /**
     * @param request the request parameters of ListTeams  ListTeamsRequest
     * @return ListTeamsResponse
     */
    CompletableFuture<ListTeamsResponse> listTeams(ListTeamsRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ResetUserPassword  ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request);

    /**
     * @param request the request parameters of UpdateCredential  UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    CompletableFuture<UpdateCredentialResponse> updateCredential(UpdateCredentialRequest request);

    /**
     * @param request the request parameters of UpdateIdentityProvider  UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    CompletableFuture<UpdateIdentityProviderResponse> updateIdentityProvider(UpdateIdentityProviderRequest request);

    /**
     * @param request the request parameters of UpdateModel  UpdateModelRequest
     * @return UpdateModelResponse
     */
    CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request);

    /**
     * @param request the request parameters of UpdateModelConnection  UpdateModelConnectionRequest
     * @return UpdateModelConnectionResponse
     */
    CompletableFuture<UpdateModelConnectionResponse> updateModelConnection(UpdateModelConnectionRequest request);

    /**
     * @param request the request parameters of UpdateTeam  UpdateTeamRequest
     * @return UpdateTeamResponse
     */
    CompletableFuture<UpdateTeamResponse> updateTeam(UpdateTeamRequest request);

    /**
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
