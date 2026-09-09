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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Uploads Skill ZIP packages in bulk through OSS and returns the processing result of each Skill.</p>
     * 
     * @param request the request parameters of BatchUploadSkillsViaOss  BatchUploadSkillsViaOssRequest
     * @return BatchUploadSkillsViaOssResponse
     */
    CompletableFuture<BatchUploadSkillsViaOssResponse> batchUploadSkillsViaOss(BatchUploadSkillsViaOssRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an IM channel for a specified agent and binds a publicly accessible ServiceEndpoint.</p>
     * 
     * @param request the request parameters of CreateAgentIMChannel  CreateAgentIMChannelRequest
     * @return CreateAgentIMChannelResponse
     */
    CompletableFuture<CreateAgentIMChannelResponse> createAgentIMChannel(CreateAgentIMChannelRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates an AgentSpec in the specified workspace and generates the first draft version. Returns a resource conflict error if an AgentSpec with the same name already exists.</p>
     * 
     * @param request the request parameters of CreateAgentSpec  CreateAgentSpecRequest
     * @return CreateAgentSpecResponse
     */
    CompletableFuture<CreateAgentSpecResponse> createAgentSpec(CreateAgentSpecRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Creates a new draft version for an existing AgentSpec. The AgentSpec must exist, and there must not be a draft currently being edited.</p>
     * 
     * @param request the request parameters of CreateAgentSpecVersion  CreateAgentSpecVersionRequest
     * @return CreateAgentSpecVersionResponse
     */
    CompletableFuture<CreateAgentSpecVersionResponse> createAgentSpecVersion(CreateAgentSpecVersionRequest request);

    /**
     * @param request the request parameters of CreateCredential  CreateCredentialRequest
     * @return CreateCredentialResponse
     */
    CompletableFuture<CreateCredentialResponse> createCredential(CreateCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an external agent in a specified workspace.</p>
     * 
     * @param request the request parameters of CreateExternalAgent  CreateExternalAgentRequest
     * @return CreateExternalAgentResponse
     */
    CompletableFuture<CreateExternalAgentResponse> createExternalAgent(CreateExternalAgentRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a Bootstrap Token and CMS configuration required for connecting a specified external agent.</p>
     * 
     * @param request the request parameters of CreateExternalAgentBootstrapToken  CreateExternalAgentBootstrapTokenRequest
     * @return CreateExternalAgentBootstrapTokenResponse
     */
    CompletableFuture<CreateExternalAgentBootstrapTokenResponse> createExternalAgentBootstrapToken(CreateExternalAgentBootstrapTokenRequest request);

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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates an MCP service in a specified workspace. The creation is an asynchronous process. You can check whether the service is ready by using the returned status or by calling a query operation.</p>
     * 
     * @param request the request parameters of CreateMcp  CreateMcpRequest
     * @return CreateMcpResponse
     */
    CompletableFuture<CreateMcpResponse> createMcp(CreateMcpRequest request);

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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates a Skill in the specified workspace and generates a draft version that can be further edited. You can derive a draft from an existing version or specify a target version and commit message.</p>
     * 
     * @param request the request parameters of CreateSkillDraft  CreateSkillDraftRequest
     * @return CreateSkillDraftResponse
     */
    CompletableFuture<CreateSkillDraftResponse> createSkillDraft(CreateSkillDraftRequest request);

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
     * <h2>Operation description\nCreates an AgentCore workspace control plane record. The server completes the state transition from <code>Initializing</code> to <code>Initialized</code> within the same transaction. The network configuration uses <code>Enabled</code> to specify whether to enable VPC networking. When enabled, you must provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
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
     * <b>description</b> :
     * <p>Deletes an IM channel of a specified agent.</p>
     * 
     * @param request the request parameters of DeleteAgentIMChannel  DeleteAgentIMChannelRequest
     * @return DeleteAgentIMChannelResponse
     */
    CompletableFuture<DeleteAgentIMChannelResponse> deleteAgentIMChannel(DeleteAgentIMChannelRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes a specified AgentSpec along with all its versions and metadata. This operation is irreversible.</p>
     * 
     * @param request the request parameters of DeleteAgentSpec  DeleteAgentSpecRequest
     * @return DeleteAgentSpecResponse
     */
    CompletableFuture<DeleteAgentSpecResponse> deleteAgentSpec(DeleteAgentSpecRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes the draft version currently being edited for a specified AgentSpec and clears the draft version pointer.</p>
     * 
     * @param request the request parameters of DeleteAgentSpecVersion  DeleteAgentSpecVersionRequest
     * @return DeleteAgentSpecVersionResponse
     */
    CompletableFuture<DeleteAgentSpecVersionResponse> deleteAgentSpecVersion(DeleteAgentSpecVersionRequest request);

    /**
     * @param request the request parameters of DeleteCredential  DeleteCredentialRequest
     * @return DeleteCredentialResponse
     */
    CompletableFuture<DeleteCredentialResponse> deleteCredential(DeleteCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a specified external agent.</p>
     * 
     * @param request the request parameters of DeleteExternalAgent  DeleteExternalAgentRequest
     * @return DeleteExternalAgentResponse
     */
    CompletableFuture<DeleteExternalAgentResponse> deleteExternalAgent(DeleteExternalAgentRequest request);

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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes a specified MCP service. The deletion is an asynchronous process. After the deletion is complete, the MCP service is no longer returned.</p>
     * 
     * @param request the request parameters of DeleteMcp  DeleteMcpRequest
     * @return DeleteMcpResponse
     */
    CompletableFuture<DeleteMcpResponse> deleteMcp(DeleteMcpRequest request);

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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes a skill and its related version data from a specified workspace. This operation is irreversible.</p>
     * 
     * @param request the request parameters of DeleteSkill  DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    CompletableFuture<DeleteSkillResponse> deleteSkill(DeleteSkillRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes the draft version currently being edited for a specified Skill.</p>
     * 
     * @param request the request parameters of DeleteSkillDraft  DeleteSkillDraftRequest
     * @return DeleteSkillDraftResponse
     */
    CompletableFuture<DeleteSkillDraftResponse> deleteSkillDraft(DeleteSkillDraftRequest request);

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
     * <h2>Request description\nDeletes the control plane record of a specified workspace. The server completes the state transition from <code>Deleting</code> to <code>Deleted</code> within the same transaction. When you repeatedly delete a workspace that is in the <code>Deleting</code> or <code>Deleted</code> state, the server handles the request with idempotence semantics.\n.</h2>
     * 
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves a pre-signed OSS download URL for a specified AgentSpec, which is used to download the AgentSpec ZIP package.</p>
     * 
     * @param request the request parameters of DownloadAgentSpecViaOss  DownloadAgentSpecViaOssRequest
     * @return DownloadAgentSpecViaOssResponse
     */
    CompletableFuture<DownloadAgentSpecViaOssResponse> downloadAgentSpecViaOss(DownloadAgentSpecViaOssRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves a pre-signed OSS download URL for a specified Skill version, which is used to download the corresponding Skill ZIP package.</p>
     * 
     * @param request the request parameters of DownloadSkillVersionViaOss  DownloadSkillVersionViaOssRequest
     * @return DownloadSkillVersionViaOssResponse
     */
    CompletableFuture<DownloadSkillVersionViaOssResponse> downloadSkillVersionViaOss(DownloadSkillVersionViaOssRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Skips the regular review process and forcibly publishes the specified Skill version.</p>
     * 
     * @param request the request parameters of ForcePublishSkillVersion  ForcePublishSkillVersionRequest
     * @return ForcePublishSkillVersionResponse
     */
    CompletableFuture<ForcePublishSkillVersionResponse> forcePublishSkillVersion(ForcePublishSkillVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified agent IM channel.</p>
     * 
     * @param request the request parameters of GetAgentIMChannel  GetAgentIMChannelRequest
     * @return GetAgentIMChannelResponse
     */
    CompletableFuture<GetAgentIMChannelResponse> getAgentIMChannel(GetAgentIMChannelRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the governance details of a specified AgentSpec, including basic information, governance pointers, and summaries of all versions.</p>
     * 
     * @param request the request parameters of GetAgentSpec  GetAgentSpecRequest
     * @return GetAgentSpecResponse
     */
    CompletableFuture<GetAgentSpecResponse> getAgentSpec(GetAgentSpecRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing an AgentSpec ZIP package. After the upload is complete, call the AgentSpec OSS upload operation to complete the import.</p>
     * 
     * @param request the request parameters of GetAgentSpecImportFileUrl  GetAgentSpecImportFileUrlRequest
     * @return GetAgentSpecImportFileUrlResponse
     */
    CompletableFuture<GetAgentSpecImportFileUrlResponse> getAgentSpecImportFileUrl(GetAgentSpecImportFileUrlRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the full content of the latest version of a specified AgentSpec for editing or viewing.</p>
     * 
     * @param request the request parameters of GetAgentSpecLatest  GetAgentSpecLatestRequest
     * @return GetAgentSpecLatestResponse
     */
    CompletableFuture<GetAgentSpecLatestResponse> getAgentSpecLatest(GetAgentSpecLatestRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the complete content of a specified AgentSpec version, including manifest content, resource files, and metadata.</p>
     * 
     * @param request the request parameters of GetAgentSpecVersion  GetAgentSpecVersionRequest
     * @return GetAgentSpecVersionResponse
     */
    CompletableFuture<GetAgentSpecVersionResponse> getAgentSpecVersion(GetAgentSpecVersionRequest request);

    /**
     * @param request the request parameters of GetCredential  GetCredentialRequest
     * @return GetCredentialResponse
     */
    CompletableFuture<GetCredentialResponse> getCredential(GetCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified external agent.</p>
     * 
     * @param request the request parameters of GetExternalAgent  GetExternalAgentRequest
     * @return GetExternalAgentResponse
     */
    CompletableFuture<GetExternalAgentResponse> getExternalAgent(GetExternalAgentRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the available network types for a specified external agent.</p>
     * 
     * @param request the request parameters of GetExternalAgentBootstrapOptions  GetExternalAgentBootstrapOptionsRequest
     * @return GetExternalAgentBootstrapOptionsResponse
     */
    CompletableFuture<GetExternalAgentBootstrapOptionsResponse> getExternalAgentBootstrapOptions(GetExternalAgentBootstrapOptionsRequest request);

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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the details of a specified MCP service, including its address, type, status, authentication configuration, and protocol.</p>
     * 
     * @param request the request parameters of GetMcp  GetMcpRequest
     * @return GetMcpResponse
     */
    CompletableFuture<GetMcpResponse> getMcp(GetMcpRequest request);

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
     * <b>description</b> :
     * <h2>Operation description\nQueries the details of a specified service endpoint. A service endpoint (ServiceEndpoint) provides a stable access URL for a specific agent version (AgentVersion) or workspace collaboration component. The response includes target routing, access URL list, authentication configuration, and current lifecycle status.\n.</h2>
     * 
     * @param request the request parameters of GetServiceEndpoint  GetServiceEndpointRequest
     * @return GetServiceEndpointResponse
     */
    CompletableFuture<GetServiceEndpointResponse> getServiceEndpoint(GetServiceEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the currently active API Key for a specified service endpoint. The call succeeds only when the service endpoint has API_KEY authentication enabled and the gateway consumer and credentials are ready. The service reads the API Key from the gateway in real time. AgentCore does not persist the plaintext. Keep the returned API Key secure and avoid logging it or exposing it in public configurations.</p>
     * 
     * @param request the request parameters of GetServiceEndpointApiKey  GetServiceEndpointApiKeyRequest
     * @return GetServiceEndpointApiKeyResponse
     */
    CompletableFuture<GetServiceEndpointApiKeyResponse> getServiceEndpointApiKey(GetServiceEndpointApiKeyRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the basic information, version status, labels, visibility scope, and version list of a specified Skill.</p>
     * 
     * @param request the request parameters of GetSkillDetail  GetSkillDetailRequest
     * @return GetSkillDetailResponse
     */
    CompletableFuture<GetSkillDetailResponse> getSkillDetail(GetSkillDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing a Skill ZIP package. After the upload is complete, call the Skill OSS upload operation to complete the import.</p>
     * 
     * @param request the request parameters of GetSkillImportFileUrl  GetSkillImportFileUrlRequest
     * @return GetSkillImportFileUrlResponse
     */
    CompletableFuture<GetSkillImportFileUrlResponse> getSkillImportFileUrl(GetSkillImportFileUrlRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the complete details of a specified Skill version, including version metadata, Skill content, and associated resources.</p>
     * 
     * @param request the request parameters of GetSkillVersionDetail  GetSkillVersionDetailRequest
     * @return GetSkillVersionDetailResponse
     */
    CompletableFuture<GetSkillVersionDetailResponse> getSkillVersionDetail(GetSkillVersionDetailRequest request);

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
     * <h2>Operation description\nQueries workspace details by workspace ID, including lifecycle status, CMS Workspace, AIRegistry Namespace, and current network policy.\n.</h2>
     * 
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description\nQueries the plug-in status of a specified workspace. Returns whether the plug-in is enabled, its lifecycle status, and the currently effective configuration. Currently, two types of plug-ins are supported: collaboration and agentloop. If a plug-in is not installed, its status is DISABLED.\n.</h2>
     * 
     * @param request the request parameters of GetWorkspacePlugin  GetWorkspacePluginRequest
     * @return GetWorkspacePluginResponse
     */
    CompletableFuture<GetWorkspacePluginResponse> getWorkspacePlugin(GetWorkspacePluginRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description\nInstalls a plugin for a specified AgentCore workspace. Currently supports the <code>collaboration</code> plugin. Plugin configuration is passed through the <code>Config</code> parameter, and different plugins can define their own configuration structures. The <code>collaboration</code> plugin uses <code>Config.NetworkConfiguration</code> to specify VPC and public network access policies. The installation process is executed asynchronously. When you repeatedly call this operation for a plugin with the same name that is being installed or already installed, the operation returns the current status with idempotent semantics if the configuration is the same. If the configuration is different, the operation returns an operation conflict error.\n.</h2>
     * 
     * @param request the request parameters of InstallWorkspacePlugin  InstallWorkspacePluginRequest
     * @return InstallWorkspacePluginResponse
     */
    CompletableFuture<InstallWorkspacePluginResponse> installWorkspacePlugin(InstallWorkspacePluginRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the IM channel list of a specified agent.</p>
     * 
     * @param request the request parameters of ListAgentIMChannels  ListAgentIMChannelsRequest
     * @return ListAgentIMChannelsResponse
     */
    CompletableFuture<ListAgentIMChannelsResponse> listAgentIMChannels(ListAgentIMChannelsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries AgentSpec resources in a specified workspace by using paging, supporting name search, sorting, and filtering by owner, visibility scope, and business labels.</p>
     * 
     * @param request the request parameters of ListAgentSpecs  ListAgentSpecsRequest
     * @return ListAgentSpecsResponse
     */
    CompletableFuture<ListAgentSpecsResponse> listAgentSpecs(ListAgentSpecsRequest request);

    /**
     * @param request the request parameters of ListAgentTeams  ListAgentTeamsRequest
     * @return ListAgentTeamsResponse
     */
    CompletableFuture<ListAgentTeamsResponse> listAgentTeams(ListAgentTeamsRequest request);

    /**
     * @param request the request parameters of ListCredentials  ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    CompletableFuture<ListCredentialsResponse> listCredentials(ListCredentialsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of external agents in a specified workspace.</p>
     * 
     * @param request the request parameters of ListExternalAgents  ListExternalAgentsRequest
     * @return ListExternalAgentsResponse
     */
    CompletableFuture<ListExternalAgentsResponse> listExternalAgents(ListExternalAgentsRequest request);

    /**
     * @param request the request parameters of ListIdentityProviders  ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    CompletableFuture<ListIdentityProvidersResponse> listIdentityProviders(ListIdentityProvidersRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of managed agents in a specified workspace by using paging. Returns summary information for each agent, including the identity, name, status, template, and specifications.</p>
     * 
     * @param request the request parameters of ListManagedAgents  ListManagedAgentsRequest
     * @return ListManagedAgentsResponse
     */
    CompletableFuture<ListManagedAgentsResponse> listManagedAgents(ListManagedAgentsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the list of tools exposed by a specified MCP service and their input/output schemas.</p>
     * 
     * @param request the request parameters of ListMcpTools  ListMcpToolsRequest
     * @return ListMcpToolsResponse
     */
    CompletableFuture<ListMcpToolsResponse> listMcpTools(ListMcpToolsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries MCP services and their configurations and statuses in a specified workspace by page.</p>
     * 
     * @param request the request parameters of ListMcps  ListMcpsRequest
     * @return ListMcpsResponse
     */
    CompletableFuture<ListMcpsResponse> listMcps(ListMcpsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries model connections in a specified AgentCore workspace. Supports filtering by name through <code>Name</code> and selecting exact match or fuzzy match through <code>SearchType</code>. Also supports filtering by model provider type and invoke protocol, and supports paging.</p>
     * 
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
     * <b>description</b> :
     * <h2>Request description\nQueries service endpoints in a specified workspace by using paging. Filter results by targetType, agentId, agentVersion, resourceBindingId, collaborationComponent, and status. Use maxResults to specify the maximum number of records per page, and use nextToken to retrieve the next page. If maxResults is not specified, the server returns 20 records by default.\n</h2>
     * 
     * @param request the request parameters of ListServiceEndpoints  ListServiceEndpointsRequest
     * @return ListServiceEndpointsResponse
     */
    CompletableFuture<ListServiceEndpointsResponse> listServiceEndpoints(ListServiceEndpointsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a paged query of Skills in a specified workspace, and returns basic Skill information, version status, and paging details.</p>
     * 
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request);

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
     * <h2>Request description\nQueries workspaces under the current tenant with paging. The list does not return soft-deleted records with a status of <code>Deleted</code> by default. Results are stably sorted by creation order on the server side. Use <code>nextToken</code> to retrieve the next page, <code>skip</code> to skip a specified number of workspaces, <code>maxResults</code> to specify the maximum number of records per page, and <code>nameLike</code> to filter workspaces by name using fuzzy match. If <code>maxResults</code> is not specified or is set to 0, the server returns 20 records by default.\n</h2>
     * 
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Takes the online version of a specified Skill offline so that it is no longer used as the online version.</p>
     * 
     * @param request the request parameters of OfflineSkill  OfflineSkillRequest
     * @return OfflineSkillResponse
     */
    CompletableFuture<OfflineSkillResponse> offlineSkill(OfflineSkillRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Sets a specified Skill version as the online version.</p>
     * 
     * @param request the request parameters of OnlineSkill  OnlineSkillRequest
     * @return OnlineSkillResponse
     */
    CompletableFuture<OnlineSkillResponse> onlineSkill(OnlineSkillRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Parses and checks one or more Skill ZIP packages uploaded to OSS, and returns the name, version, and conflict check results.</p>
     * 
     * @param request the request parameters of PrecheckSkillUploadViaOss  PrecheckSkillUploadViaOssRequest
     * @return PrecheckSkillUploadViaOssResponse
     */
    CompletableFuture<PrecheckSkillUploadViaOssResponse> precheckSkillUploadViaOss(PrecheckSkillUploadViaOssRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Publishes a specified Skill version to change its state to published.</p>
     * 
     * @param request the request parameters of PublishSkillVersion  PublishSkillVersionRequest
     * @return PublishSkillVersionResponse
     */
    CompletableFuture<PublishSkillVersionResponse> publishSkillVersion(PublishSkillVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Converts a specified Skill version back into an editable draft for further modifications.</p>
     * 
     * @param request the request parameters of RedraftSkillVersion  RedraftSkillVersionRequest
     * @return RedraftSkillVersionResponse
     */
    CompletableFuture<RedraftSkillVersionResponse> redraftSkillVersion(RedraftSkillVersionRequest request);

    /**
     * @param request the request parameters of ResetUserPassword  ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Submits a specified AgentSpec draft version for review. If no release pipeline is configured, the version is published directly to online status.</p>
     * 
     * @param request the request parameters of SubmitAgentSpecVersion  SubmitAgentSpecVersionRequest
     * @return SubmitAgentSpecVersionResponse
     */
    CompletableFuture<SubmitAgentSpecVersionResponse> submitAgentSpecVersion(SubmitAgentSpecVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Submits a specified draft version of a skill for review.</p>
     * 
     * @param request the request parameters of SubmitSkillVersion  SubmitSkillVersionRequest
     * @return SubmitSkillVersionResponse
     */
    CompletableFuture<SubmitSkillVersionResponse> submitSkillVersion(SubmitSkillVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the ServiceEndpoint binding, enabled/disabled status, or channel behavior configuration of an IM channel. At least one updatable field must be provided.</p>
     * 
     * @param request the request parameters of UpdateAgentIMChannel  UpdateAgentIMChannelRequest
     * @return UpdateAgentIMChannelResponse
     */
    CompletableFuture<UpdateAgentIMChannelResponse> updateAgentIMChannel(UpdateAgentIMChannelRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a full update of the channel credential for a specified IM channel of an agent. Secrets are not returned in the response.</p>
     * 
     * @param request the request parameters of UpdateAgentIMChannelCredential  UpdateAgentIMChannelCredentialRequest
     * @return UpdateAgentIMChannelCredentialResponse
     */
    CompletableFuture<UpdateAgentIMChannelCredentialResponse> updateAgentIMChannelCredential(UpdateAgentIMChannelCredentialRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the business tags, version labels, and visibility scope of a specified AgentSpec. Fields that are not provided remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateAgentSpec  UpdateAgentSpecRequest
     * @return UpdateAgentSpecResponse
     */
    CompletableFuture<UpdateAgentSpecResponse> updateAgentSpec(UpdateAgentSpecRequest request);

    /**
     * @param request the request parameters of UpdateCredential  UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    CompletableFuture<UpdateCredentialResponse> updateCredential(UpdateCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified external agent.</p>
     * 
     * @param request the request parameters of UpdateExternalAgent  UpdateExternalAgentRequest
     * @return UpdateExternalAgentResponse
     */
    CompletableFuture<UpdateExternalAgentResponse> updateExternalAgent(UpdateExternalAgentRequest request);

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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the address, description, authentication, or Swagger configuration of a specified MCP service. The MCP type and protocol cannot be modified after creation. The update is an asynchronous process.</p>
     * 
     * @param request the request parameters of UpdateMcp  UpdateMcpRequest
     * @return UpdateMcpResponse
     */
    CompletableFuture<UpdateMcpResponse> updateMcp(UpdateMcpRequest request);

    /**
     * <b>description</b> :
     * <p>This operation updates description, contextSize, maxTokens, and capabilities. At least one non-null parameter must be provided. Parameters that are not provided or set to null retain their original values. The capabilities object is replaced as a whole. Capability fields not included in the object are treated as false.
     * Modifying only description does not refresh the model configuration of associated agents. When contextSize, maxTokens, or capabilities actually change, the system asynchronously refreshes managed agents that reference the model within the same workspace, as well as external agents whose model source is PLATFORM. External agents whose model source is RUNTIME are not affected. Submitting the same configuration repeatedly does not trigger a new model configuration refresh.
     * A successful response indicates that the model configuration has been saved. It does not indicate that associated agents have completed the configuration refresh or that the runtime has loaded the new configuration. Call GetModel to query the saved model configuration.</p>
     * 
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the business tags of a specified Skill. Other attributes that are not included in the request remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateSkillBizTags  UpdateSkillBizTagsRequest
     * @return UpdateSkillBizTagsResponse
     */
    CompletableFuture<UpdateSkillBizTagsResponse> updateSkillBizTags(UpdateSkillBizTagsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Updates the version labels and their mappings for a specified Skill.</p>
     * 
     * @param request the request parameters of UpdateSkillLabels  UpdateSkillLabelsRequest
     * @return UpdateSkillLabelsResponse
     */
    CompletableFuture<UpdateSkillLabelsResponse> updateSkillLabels(UpdateSkillLabelsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Updates the visibility scope of a specified skill.</p>
     * 
     * @param request the request parameters of UpdateSkillScope  UpdateSkillScopeRequest
     * @return UpdateSkillScopeResponse
     */
    CompletableFuture<UpdateSkillScopeResponse> updateSkillScope(UpdateSkillScopeRequest request);

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
     * <h2>Operation description\nUpdates the name or network configuration of a workspace. Only workspaces in the <code>Initialized</code> status can be updated. <code>Status</code>, <code>TenantId</code>, and <code>RegionId</code> are maintained by the server and cannot be modified through this operation. The network configuration uses <code>Enabled</code> to specify whether to enable VPC networking. When enabled, you must also provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
     * 
     * @param request the request parameters of UpdateWorkspace  UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    CompletableFuture<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves an uploaded AgentSpec ZIP package from OSS, parses it, and imports the AgentSpec into the current workspace.</p>
     * 
     * @param request the request parameters of UploadAgentSpecViaOss  UploadAgentSpecViaOssRequest
     * @return UploadAgentSpecViaOssResponse
     */
    CompletableFuture<UploadAgentSpecViaOssResponse> uploadAgentSpecViaOss(UploadAgentSpecViaOssRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves an uploaded Skill ZIP package from OSS, parses it, and imports the Skill into the current workspace.</p>
     * 
     * @param request the request parameters of UploadSkillViaOss  UploadSkillViaOssRequest
     * @return UploadSkillViaOssResponse
     */
    CompletableFuture<UploadSkillViaOssResponse> uploadSkillViaOss(UploadSkillViaOssRequest request);

}
