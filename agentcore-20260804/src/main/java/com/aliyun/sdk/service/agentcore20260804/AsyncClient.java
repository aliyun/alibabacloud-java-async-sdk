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
     * @param request the request parameters of CreateManagedAgent  CreateManagedAgentRequest
     * @return CreateManagedAgentResponse
     */
    CompletableFuture<CreateManagedAgentResponse> createManagedAgent(CreateManagedAgentRequest request);

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
     * <b>description</b> :
     * <h2>请求说明\n创建 AgentCore 工作空间控制面记录。服务端在同一事务内完成 <code>Initializing</code> 到 <code>Initialized</code> 的状态转换。网络配置通过 <code>Enabled</code> 指定是否开启 VPC 网络，开启时必须提供 <code>VpcId</code> 和至少一个 <code>VSwitchIds</code>。\n</h2>
     * 
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

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
     * @param request the request parameters of DeleteManagedAgent  DeleteManagedAgentRequest
     * @return DeleteManagedAgentResponse
     */
    CompletableFuture<DeleteManagedAgentResponse> deleteManagedAgent(DeleteManagedAgentRequest request);

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
     * <b>description</b> :
     * <h2>请求说明\n删除指定工作空间控制面记录。服务端在同一事务内完成 <code>Deleting</code> 到 <code>Deleted</code> 的状态转换。重复删除处于 <code>Deleting</code> 或 <code>Deleted</code> 状态的工作空间时，服务端按幂等语义处理。\n</h2>
     * 
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

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
     * @param request the request parameters of GetManagedAgent  GetManagedAgentRequest
     * @return GetManagedAgentResponse
     */
    CompletableFuture<GetManagedAgentResponse> getManagedAgent(GetManagedAgentRequest request);

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
     * <b>description</b> :
     * <h2>请求说明\n根据工作空间 ID 查询工作空间详情，包括生命周期状态、CMS Workspace、AIRegistry Namespace 和当前网络策略。\n</h2>
     * 
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

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
     * @param request the request parameters of ListManagedAgents  ListManagedAgentsRequest
     * @return ListManagedAgentsResponse
     */
    CompletableFuture<ListManagedAgentsResponse> listManagedAgents(ListManagedAgentsRequest request);

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
     * <b>description</b> :
     * <h2>请求说明\n分页查询当前租户下的工作空间。列表默认不返回状态为 <code>Deleted</code> 的软删除记录，结果按创建顺序由服务端稳定排序。通过 <code>nextToken</code> 获取下一页，通过 <code>skip</code> 跳过指定数量的工作空间，通过 <code>maxResults</code> 指定单页最大记录数，通过 <code>nameLike</code> 按工作空间名称模糊过滤。未指定 <code>maxResults</code> 或取值为 0 时，服务端默认返回 20 条。\n</h2>
     * 
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

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
     * @param request the request parameters of UpdateManagedAgent  UpdateManagedAgentRequest
     * @return UpdateManagedAgentResponse
     */
    CompletableFuture<UpdateManagedAgentResponse> updateManagedAgent(UpdateManagedAgentRequest request);

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

    /**
     * <b>description</b> :
     * <h2>请求说明\n更新工作空间名称或网络配置。只有状态为 <code>Initialized</code> 的工作空间允许更新。<code>Status</code>、<code>TenantId</code> 和 <code>RegionId</code> 由服务端维护，不允许通过本接口修改。网络配置通过 <code>Enabled</code> 指定是否开启 VPC 网络，开启时必须同时提供 <code>VpcId</code> 和至少一个 <code>VSwitchIds</code>。\n</h2>
     * 
     * @param request the request parameters of UpdateWorkspace  UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    CompletableFuture<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request);

}
