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
     * <b>description</b> :
     * <p>Writes messages or text to a memory store. By default, sync is set to true, which means the operation synchronously waits for extraction and returns only memories (an empty array is allowed). If sync is set to false, the operation returns only a taskId, which you can query by calling GetMemoryTask.</p>
     * 
     * @param request the request parameters of AddMemories  AddMemoriesRequest
     * @return AddMemoriesResponse
     */
    CompletableFuture<AddMemoriesResponse> addMemories(AddMemoriesRequest request);

    /**
     * @param request the request parameters of BatchDeleteModels  BatchDeleteModelsRequest
     * @return BatchDeleteModelsResponse
     */
    CompletableFuture<BatchDeleteModelsResponse> batchDeleteModels(BatchDeleteModelsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Uploads skill ZIP packages in batches through OSS and returns the processing result for each skill.</p>
     * 
     * @param request the request parameters of BatchUploadSkillsViaOss  BatchUploadSkillsViaOssRequest
     * @return BatchUploadSkillsViaOssResponse
     */
    CompletableFuture<BatchUploadSkillsViaOssResponse> batchUploadSkillsViaOss(BatchUploadSkillsViaOssRequest request);

    /**
     * <b>description</b> :
     * <p>Disables template usage constraints. After the conversion, the MCP retains its source and tags, but no longer appears on the usage page.</p>
     * 
     * @param request the request parameters of ConvertMcpToFreeEdit  ConvertMcpToFreeEditRequest
     * @return ConvertMcpToFreeEditResponse
     */
    CompletableFuture<ConvertMcpToFreeEditResponse> convertMcpToFreeEdit(ConvertMcpToFreeEditRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an IM channel for a specified agent and binds it to a publicly accessible ServiceEndpoint.</p>
     * 
     * @param request the request parameters of CreateAgentIMChannel  CreateAgentIMChannelRequest
     * @return CreateAgentIMChannelResponse
     */
    CompletableFuture<CreateAgentIMChannelResponse> createAgentIMChannel(CreateAgentIMChannelRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Creates an AgentSpec in a specified workspace and generates the first draft version. Returns a resource conflict error if an AgentSpec with the same name already exists.</p>
     * 
     * @param request the request parameters of CreateAgentSpec  CreateAgentSpecRequest
     * @return CreateAgentSpecResponse
     */
    CompletableFuture<CreateAgentSpecResponse> createAgentSpec(CreateAgentSpecRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Creates a new draft version for an existing AgentSpec. The AgentSpec must exist and must not have a draft currently being edited.</p>
     * 
     * @param request the request parameters of CreateAgentSpecVersion  CreateAgentSpecVersionRequest
     * @return CreateAgentSpecVersionResponse
     */
    CompletableFuture<CreateAgentSpecVersionResponse> createAgentSpecVersion(CreateAgentSpecVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a credential in a workspace for authentication of services such as Connector.</p>
     * 
     * @param request the request parameters of CreateCredential  CreateCredentialRequest
     * @return CreateCredentialResponse
     */
    CompletableFuture<CreateCredentialResponse> createCredential(CreateCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, prepare a writable workspace, a RAM role ARN, a container image or code package, and runtime configurations. You must specify name, artifact, roleArn, and runtime. The runtime parameter must include both compute and sessionPolicy.
     * In container mode, use artifact.container and specify artifact.port. The image must have the required access permissions and be accessible over the network allowed by the workspace.
     * In code package pattern, specify artifact.port, and the sourceUri, languageRuntime, and entrypoint of artifact.code. Do not specify container at the same time. Dependencies must be packaged by the user. ZIP and TAR.GZ formats are supported. The compressed package size cannot exceed 500,000,000 bytes. You can call ListAgentCodeRuntimes to query the runtime environment identity. The sourceUri parameter supports oss:// addresses or HTTPS object addresses of standard OSS public domain names, including signed URLs. For local files, call GetAgentCodePackageUploadUrl to obtain an upload URL, upload the file directly, and then commit the returned sourceUri.
     * When you submit a new code package source, the backend rechecks the read permissions, object, and size. The configuration is saved only after the transfer succeeds. If the transfer fails, the configuration is not saved. Saved fixed packages can be reused. Set the client timeout to 210 seconds for code package requests. Archive integrity and secure decompression are checked at startup. A successful acceptance does not mean that the agent is ready to run.
     * The creation process is asynchronous. A successful response indicates that the request is accepted. You can use the returned agentId to call GetCustomAgent and check the latestVersionStatus, latestExecutionError, and status corresponding to latestSpecVersion to confirm the deployment result. After the deployment is ready, you can call CreateServiceEndpoint to configure the access endpoint.
     * The clientToken parameter does not provide idempotency guarantees. Do not rely on this parameter to prevent duplicate requests. The healthyThreshold parameter for health checks does not take effect. Omit this parameter.</p>
     * 
     * @param request the request parameters of CreateCustomAgent  CreateCustomAgentRequest
     * @return CreateCustomAgentResponse
     */
    CompletableFuture<CreateCustomAgentResponse> createCustomAgent(CreateCustomAgentRequest request);

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
     * <p>Creates the Bootstrap token and CMS configuration required to onboard a specified external agent.</p>
     * 
     * @param request the request parameters of CreateExternalAgentBootstrapToken  CreateExternalAgentBootstrapTokenRequest
     * @return CreateExternalAgentBootstrapTokenResponse
     */
    CompletableFuture<CreateExternalAgentBootstrapTokenResponse> createExternalAgentBootstrapToken(CreateExternalAgentBootstrapTokenRequest request);

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>A workspace can be bound to only one external identity provider. The identityProviderType parameter supports DingTalk, Feishu, and CustomSSO. CustomSSO only initializes the shared user pool. Do not pass non-empty metadata, and do not pass true for loginEnabled or syncEnabled. By default, both switches are turned off. Protocols and SAML configurations are saved by calling UpdateIdentityProvider. SCIM is configured through a separate API. You do not need to save SAML first. After the request is accepted and CONFIGURED is returned, call GetIdentityProvider and wait for the user pool initialization to complete. READY only indicates that the resource is ready, not that SAML is configured. If the same CustomSSO binding is in the CONFIGURED or READY state, the existing binding can be returned. You cannot treat all states as repeatable creations.
     * For DingTalk, the metadata parameter requires appKey, appSecret, and corpId. For Feishu, appId and appSecret are required. The vendor logon switch is enabled by default, and the synchronization switch is disabled by default. When synchronization is enabled, encryptKey and verificationToken are also required. The vendor syncOnBind and syncScope parameters retain the existing department-based synchronization definitions. Do not use these vendor pull parameters to replace SCIM configurations during CustomSSO initialization.</p>
     * <h2>Requests and examples</h2>
     * <p>POST /workspaces/{workspaceId}/identity-providers
     * Call conventions: Call the API based on the region of the target workspace. Use an AccessKey pair or STS token that has permissions on the identity provider resources of the corresponding workspace. The ws-example, URLs, certificates, and tokens in the following examples are placeholder values and must be replaced with actual values. The request body example represents the body parameters of the public API, not the extra body wrapper of the backend direct connection API. The response example only shows the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Keep the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">POST /workspaces/ws-example/identity-providers
     * {&quot;identityProviderType&quot;: &quot;CustomSSO&quot;}
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;loginEnabled&quot;: false,
     *     &quot;syncEnabled&quot;: false,
     *     &quot;status&quot;: &quot;CONFIGURED&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. A synchronous call to the upstream service may return 503 IdentityProviderProvisioningUnavailable if it fails. Keep the request ID for troubleshooting and do not interpret a read failure as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 409 IdentityProviderAlreadyBound: An external binding already exists. Query and reuse the correct binding first. Do not automatically unbind the entire binding. Asynchronous initialization failure does not equal HTTP request failure. You must continue to query the status.</p>
     * 
     * @param request the request parameters of CreateIdentityProvider  CreateIdentityProviderRequest
     * @return CreateIdentityProviderResponse
     */
    CompletableFuture<CreateIdentityProviderResponse> createIdentityProvider(CreateIdentityProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Initiates a one-time user synchronization based on the saved scope without saving the configuration or requiring syncEnabled=true. Prerequisites: the identity provider is in the READY or SYNC_FAILED state, a user pool exists, and no other pending identity provider operations are in progress. The returned taskId only indicates that the request is accepted. Call GetIdentityProviderSyncJob to poll the status until it reaches SUCCESS, FAILED, or CANCELED. If the task fails, check the failureReason. The workspace user quota still applies, and previously synchronized users are not automatically deleted if the scope is reduced.
     * Authorization information: RAM action agentcore:CreateIdentityProviderSyncJob, access level Write, resource ARN: acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource is required for authorization.
     * Idempotency and retry: This operation does not provide a ClientToken parameter for conditional idempotency. Repeated submissions do not guarantee the same task is returned. If an operation is already in progress, an operation conflict is returned. Submitting again after the task ends creates a new synchronization task. If a submission times out, query the identity provider status first to avoid blindly resubmitting the request.
     * Calling this API is free of charge, and operation records support ActionTrail auditing.
     * Initial selective synchronization process: CreateIdentityProvider (syncOnBind=false, it is recommended to keep syncEnabled=false initially) → GetIdentityProvider and wait for READY → ListIdentityProviderDepartments to select departments → UpdateIdentityProvider to save syncScope and wait for READY → CreateIdentityProviderSyncJob → GetIdentityProviderSyncJob to query the terminal state. If incremental synchronization is required, configure callbacks and event subscriptions, and then update syncEnabled=true.
     * Response example:</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;data&quot;: {
     *     &quot;taskId&quot;: &quot;12345678-1234-4234-8234-123456789abc&quot;,
     *     &quot;status&quot;: &quot;PENDING&quot;
     *   }
     * }
     * </code></pre>
     * 
     * @param request the request parameters of CreateIdentityProviderSyncJob  CreateIdentityProviderSyncJobRequest
     * @return CreateIdentityProviderSyncJobResponse
     */
    CompletableFuture<CreateIdentityProviderSyncJobResponse> createIdentityProviderSyncJob(CreateIdentityProviderSyncJobRequest request);

    /**
     * <b>description</b> :
     * <p>Creates or reuses an image cache in the current workspace based on the image source and tag. Both public and private images uniformly reuse the workspace\&quot;s source image pull authorization and resource roles. The resource manager parses the tag during the transfer node and performs image replication based on the parsed summary. The digest is empty before parsing is complete. For regular tags, the saved summary is reused after parsing. For the latest tag, it is parsed again when registered after reaching the desired state, and duplicate registrations in progress reuse the node. The logical imageId remains stable. accessInternet and accessVpc only determine the source reading and transfer for the current request and do not modify the agent network. An HTTP 200 response returns an acceptance snapshot of PENDING, READY, or FAILED, which does not indicate that the creation is complete. ClientToken does not guarantee to deduplicate requests or recover the original result. If the result is unconfirmed, query the query cache status first before deciding whether to recommit.</p>
     * 
     * @param request the request parameters of CreateImageCache  CreateImageCacheRequest
     * @return CreateImageCacheResponse
     */
    CompletableFuture<CreateImageCacheResponse> createImageCache(CreateImageCacheRequest request);

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
     * <b>description</b> :
     * <p>Creates a long-term memory store in a specified workspace.</p>
     * 
     * @param request the request parameters of CreateMemoryStore  CreateMemoryStoreRequest
     * @return CreateMemoryStoreResponse
     */
    CompletableFuture<CreateMemoryStoreResponse> createMemoryStore(CreateMemoryStoreRequest request);

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
     * <h2>Request description\nCreates an AgentCore workspace control plane record. The server completes the state transition from <code>Initializing</code> to <code>Initialized</code> within the same transaction. The network configuration uses <code>Enabled</code> to specify whether to enable the VPC network. If enabled, you must provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
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
     * <h2>Operation description</h2>
     * <p>Deletes the specified AgentSpec and all its versions and metadata. The deletion is irreversible.</p>
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
     * <b>description</b> :
     * <p>Deletes an access credential in a specified workspace. A credential cannot be deleted if it is still bound to an MCP service.</p>
     * 
     * @param request the request parameters of DeleteCredential  DeleteCredentialRequest
     * @return DeleteCredentialResponse
     */
    CompletableFuture<DeleteCredentialResponse> deleteCredential(DeleteCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure that the workspace is writable. If the agent is still associated with a team, you must dissociate it from the team first.
     * Deletion is an asynchronous process. After the request is accepted, the associated invocation endpoints become unavailable, and the runtime resources are subsequently cleaned up. The status in the response is typically Deleting. If the agent is already in the deletion process, a subsequent request returns the current summary.
     * You can call GetCustomAgent to check the deletion progress. After the deletion is complete, a detail query returns a resource not found error.</p>
     * 
     * @param request the request parameters of DeleteCustomAgent  DeleteCustomAgentRequest
     * @return DeleteCustomAgentResponse
     */
    CompletableFuture<DeleteCustomAgentResponse> deleteCustomAgent(DeleteCustomAgentRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a specified external agent.</p>
     * 
     * @param request the request parameters of DeleteExternalAgent  DeleteExternalAgentRequest
     * @return DeleteExternalAgentResponse
     */
    CompletableFuture<DeleteExternalAgentResponse> deleteExternalAgent(DeleteExternalAgentRequest request);

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>This is a complete disconnection, not just disabling logon. Disconnecting CustomSSO cleans up the AC users imported from this identity source, remote shared user pools and related resources, logon publishing configurations, and bindings. Therefore, both SAML and SCIM are affected. It does not delete the enterprise applications created by users on external platforms such as Azure. The system first checks the references between users and Teams. If references exist, the disconnection is rejected.
     * After the request is accepted, the system returns DISCONNECTING. You can call GetIdentityProvider to query the status. The cleanup is complete only when the binding does not exist (IdentityProviderNotFound). The binding should also no longer appear in the list. DISCONNECT_FAILED indicates that a partial cleanup may have occurred and the state cannot be restored to a brand new unconfigured state. You can retry based on the returned status. If the binding does not exist in the first place, the API returns a placeholder result indicating no binding without creating new resources. An ongoing disconnection task may return the current binding. Do not use this API as a substitute for setting loginEnabled=false, syncEnabled=false, or deleting a single token.</p>
     * <h2>Requests and examples</h2>
     * <p>DELETE /workspaces/{workspaceId}/identity-providers/{identityProviderType}
     * Call conventions: Call the API in the region of the target workspace by using an AccessKey pair or STS credential that has permissions on the identity source resources of the workspace. The ws-example, URLs, certificates, and tokens in the following examples are placeholder values and must be replaced with actual values. The request body example represents the body parameter content of the public API, not the extra body wrapper of the backend direct connection API. The response example only shows the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Keep the requestId for troubleshooting and do not record keys. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">DELETE /workspaces/ws-example/identity-providers/CustomSSO
     * </code></pre>
     * <h2>Response examples</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;status&quot;: &quot;DISCONNECTING&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. A synchronous call failure to the upstream may return 503 IdentityProviderProvisioningUnavailable. Keep the request ID for troubleshooting and do not interpret a read failure as unconfigured. Actual authentication and workspace non-existence errors follow the common error handling.
     * 409 IdentityProvider.Disconnect.Conflict: Users of this identity source still belong to a Team. Remove the references first. 409 IdentityProviderOperationConflict: The current status does not allow disconnection. 404 IdentityProviderNotFound: An external binding exists but the type does not match. An asynchronous failure may result in a partial cleanup. You cannot claim completion based solely on the first response.</p>
     * 
     * @param request the request parameters of DeleteIdentityProvider  DeleteIdentityProviderRequest
     * @return DeleteIdentityProviderResponse
     */
    CompletableFuture<DeleteIdentityProviderResponse> deleteIdentityProvider(DeleteIdentityProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes the logical image cache of the current workspace. The deletion requires that no enabled agent configurations reference the cache and no active instances are using it. Concurrency is rechecked upon submission. Caches in the PENDING or FAILED state can still be deleted, and the backend handles the cleanup. An HTTP 200 response returns an imageId that matches the request. If deletionPending is true, the current workspace is still undergoing deletion, and a Get request returns DELETING until ImageCacheNotFound is explicitly returned. If false, the deletion is complete or the current workspace no longer exists. Usage by other workspaces does not block the deletion for the current workspace. The physical content is reclaimed only after all workspaces in the same region have removed their associations and no active instances are using it.</p>
     * 
     * @param request the request parameters of DeleteImageCache  DeleteImageCacheRequest
     * @return DeleteImageCacheResponse
     */
    CompletableFuture<DeleteImageCacheResponse> deleteImageCache(DeleteImageCacheRequest request);

    /**
     * @param request the request parameters of DeleteManagedAgent  DeleteManagedAgentRequest
     * @return DeleteManagedAgentResponse
     */
    CompletableFuture<DeleteManagedAgentResponse> deleteManagedAgent(DeleteManagedAgentRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes a specified MCP server. The deletion is an asynchronous process, and the MCP server is no longer returned after the process is complete.</p>
     * 
     * @param request the request parameters of DeleteMcp  DeleteMcpRequest
     * @return DeleteMcpResponse
     */
    CompletableFuture<DeleteMcpResponse> deleteMcp(DeleteMcpRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a long-term memory based on the memory ID.</p>
     * 
     * @param request the request parameters of DeleteMemory  DeleteMemoryRequest
     * @return DeleteMemoryResponse
     */
    CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request);

    /**
     * <b>description</b> :
     * <p>Asynchronously deletes a MemoryStore and all long-term memory within it.</p>
     * 
     * @param request the request parameters of DeleteMemoryStore  DeleteMemoryStoreRequest
     * @return DeleteMemoryStoreResponse
     */
    CompletableFuture<DeleteMemoryStoreResponse> deleteMemoryStore(DeleteMemoryStoreRequest request);

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
     * <h2>Operation description</h2>
     * <p>Deletes a skill and its related version data from a specified workspace. This operation is irreversible.</p>
     * 
     * @param request the request parameters of DeleteSkill  DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    CompletableFuture<DeleteSkillResponse> deleteSkill(DeleteSkillRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
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
     * <h2>Request description\nDeletes the control plane record of a specified workspace. The server completes the state transition from <code>Deleting</code> to <code>Deleted</code> within the same transaction. The server processes repeated deletion requests for workspaces in the <code>Deleting</code> or <code>Deleted</code> state idempotently.\n.</h2>
     * 
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>Disables a Connector in a specified workspace.</p>
     * 
     * @param request the request parameters of DisableConnector  DisableConnectorRequest
     * @return DisableConnectorResponse
     */
    CompletableFuture<DisableConnectorResponse> disableConnector(DisableConnectorRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves the presigned OSS download URL of a specified AgentSpec to download the AgentSpec ZIP package.</p>
     * 
     * @param request the request parameters of DownloadAgentSpecViaOss  DownloadAgentSpecViaOssRequest
     * @return DownloadAgentSpecViaOssResponse
     */
    CompletableFuture<DownloadAgentSpecViaOssResponse> downloadAgentSpecViaOss(DownloadAgentSpecViaOssRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves a pre-signed OSS download URL for a specified Skill version, which is used to download the corresponding Skill ZIP package.</p>
     * 
     * @param request the request parameters of DownloadSkillVersionViaOss  DownloadSkillVersionViaOssRequest
     * @return DownloadSkillVersionViaOssResponse
     */
    CompletableFuture<DownloadSkillVersionViaOssResponse> downloadSkillVersionViaOss(DownloadSkillVersionViaOssRequest request);

    /**
     * <b>description</b> :
     * <p>Enables a Connector in a specified workspace. Credential verification is required before the Connector can be enabled.</p>
     * 
     * @param request the request parameters of EnableConnector  EnableConnectorRequest
     * @return EnableConnectorResponse
     */
    CompletableFuture<EnableConnectorResponse> enableConnector(EnableConnectorRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Skips the regular review process and forcibly publishes a specified Skill version.</p>
     * 
     * @param request the request parameters of ForcePublishSkillVersion  ForcePublishSkillVersionRequest
     * @return ForcePublishSkillVersionResponse
     */
    CompletableFuture<ForcePublishSkillVersionResponse> forcePublishSkillVersion(ForcePublishSkillVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Generates a time-limited, read-only download URL for the code package referenced by the currently saved agent configuration. This applies to code packages uploaded locally or imported from Object Storage Service (OSS). The operation uses workspaceId and agentId for locating and does not accept arbitrary bucket, object key, or historical version parameters. The current configuration must reference an available, fixed code package, and does not require waiting for a running instance to be ready. An error is returned if the code package does not exist, has changed, or is unreadable. The link is valid for up to 10 minutes and does not exceed the underlying credential expiration time. Call the operation again after it expires. The resourceVersionId indicates the saved configuration version corresponding to this download. The sample download link is redacted. Use the downloadUrl in the response.</p>
     * 
     * @param request the request parameters of GetAgentCodePackageDownloadUrl  GetAgentCodePackageDownloadUrlRequest
     * @return GetAgentCodePackageDownloadUrlResponse
     */
    CompletableFuture<GetAgentCodePackageDownloadUrlResponse> getAgentCodePackageDownloadUrl(GetAgentCodePackageDownloadUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Generates a RAM authorization URL for the resource role of the current workspace for a specified source bucket. The client cannot specify or override the role. After you open the authorizeUrl and confirm the authorization, call VerifyAgentCodePackageOssRamAuthorization to check the policy binding, and call ValidateAgentCodePackageFromOss to check specific objects.
     * This authorization reuses the OSSObjectRestoreCustom template, which includes permissions to read, write, and delete objects, and is not a read-only authorization. Retrieving the URL itself does not complete the authorization, transfer the code package, or modify the default OSS binding of the workspace. Existing authorizations for the same role and bucket can be reused. The example URL is provided to demonstrate the format. Use the actual authorization URL returned by the API operation.</p>
     * 
     * @param request the request parameters of GetAgentCodePackageOssRamAuthorizeUrl  GetAgentCodePackageOssRamAuthorizeUrlRequest
     * @return GetAgentCodePackageOssRamAuthorizeUrlResponse
     */
    CompletableFuture<GetAgentCodePackageOssRamAuthorizeUrlResponse> getAgentCodePackageOssRamAuthorizeUrl(GetAgentCodePackageOssRamAuthorizeUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a time-limited upload URL for a code package without uploading the file content. The fileName must be a ZIP or TAR.GZ filename without directories. The format must match the file extension. The fileSize is in bytes, with valid values ranging from 1 to 500,000,000.
     * Use the uploadMethod, uploadUrl, and headers from the response to upload the file directly. After the upload is complete, pass the sourceUri to the artifact.code.sourceUri parameter of CreateCustomAgent or UpdateCustomAgent. The actual object and size are verified and a fixed copy is saved during creation or update. The upload URL is valid for up to 10 minutes and does not exceed the expiration time of the underlying temporary credentials. Retrieve a new URL after it expires. The example URL is desensitized and cannot be used for actual uploads. Use the original URL and request headers from this response.</p>
     * 
     * @param request the request parameters of GetAgentCodePackageUploadUrl  GetAgentCodePackageUploadUrlRequest
     * @return GetAgentCodePackageUploadUrlResponse
     */
    CompletableFuture<GetAgentCodePackageUploadUrlResponse> getAgentCodePackageUploadUrl(GetAgentCodePackageUploadUrlRequest request);

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
     * <h2>Request description</h2>
     * <p>Queries the governance details of a specified AgentSpec, including basic information, governance pointers, and summaries of all versions.</p>
     * 
     * @param request the request parameters of GetAgentSpec  GetAgentSpecRequest
     * @return GetAgentSpecResponse
     */
    CompletableFuture<GetAgentSpecResponse> getAgentSpec(GetAgentSpecRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves the OSS presigned upload URL and object name required to import an AgentSpec ZIP package. After the upload is complete, you can call the AgentSpec OSS upload API to complete the import.</p>
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
     * <h2>Request description</h2>
     * <p>Queries the complete content of a specified AgentSpec version, including the manifest content, resource files, and metadata.</p>
     * 
     * @param request the request parameters of GetAgentSpecVersion  GetAgentSpecVersionRequest
     * @return GetAgentSpecVersionResponse
     */
    CompletableFuture<GetAgentSpecVersionResponse> getAgentSpecVersion(GetAgentSpecVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a single credential. Sensitive fields are not returned.</p>
     * 
     * @param request the request parameters of GetCredential  GetCredentialRequest
     * @return GetCredentialResponse
     */
    CompletableFuture<GetCredentialResponse> getCredential(GetCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>After creating or updating a custom agent, you can poll this operation to query the execution result of the latest configuration version. latestVersionStatus corresponds to latestSpecVersion. latestExecutionError indicates the cause of the pending or failed status for this version. If retryable is true, you can query again later.
     * The returned configuration is the latest submitted configuration and may not have taken effect. Verify the deployment and running status by checking latestVersionStatus, the overall agent status, and the running instance statistics sandboxPhaseCounts.
     * If the queried custom agent does not exist, has been deleted, or does not belong to the specified workspace, a resource not found error is returned.</p>
     * 
     * @param request the request parameters of GetCustomAgent  GetCustomAgentRequest
     * @return GetCustomAgentResponse
     */
    CompletableFuture<GetCustomAgentResponse> getCustomAgent(GetCustomAgentRequest request);

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
     * <p>Queries the available access network types for a specified external agent.</p>
     * 
     * @param request the request parameters of GetExternalAgentBootstrapOptions  GetExternalAgentBootstrapOptionsRequest
     * @return GetExternalAgentBootstrapOptionsResponse
     */
    CompletableFuture<GetExternalAgentBootstrapOptionsResponse> getExternalAgentBootstrapOptions(GetExternalAgentBootstrapOptionsRequest request);

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>Reads existing bindings by type. For CustomSSO, the API returns the saved protocol, standardized SAML, expected loginEnabled, syncEnabled, and shared binding status. If SAML is not configured, the saml and configuration fields may not be returned. If SAML is configured, the API additionally queries AgentIdentity, and the configuration field represents the actual SSO/JIT configuration. The saml field serves as the data source for the edit form. The status switches in the configuration field are Enabled and Disabled. If the upstream query fails, an error is returned. This failure must not be treated as an unconfigured state.
     * Only this API reads back the actual SAML configuration. The list and write APIs do not guarantee that the configuration field is returned. A READY user pool does not indicate that SAML is configured. The UPDATING and UPDATE_FAILED statuses describe logon configuration tasks, not SCIM tasks. The vendor callback URL for CustomSSO is empty. Use GetIdentityProviderSCIM.operationStatus to query SCIM operation results.</p>
     * <h2>Requests and examples</h2>
     * <p>GET /workspaces/{workspaceId}/identity-providers/{identityProviderType}
     * Calling convention: Call this API in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity source resources of the workspace. The ws-example, URLs, certificates, and tokens in the following examples are placeholder values and must be replaced with actual values. The request body example shows the body parameters of the public API, rather than the extra body wrapper of the backend direct-connection API. The response example shows only the business data. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not log secrets. Asynchronous business tasks do not imply that the HTTP request uses a persistent connection to wait for completion.</p>
     * <pre><code class="language-text">GET /workspaces/ws-example/identity-providers/CustomSSO
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;status&quot;: &quot;READY&quot;,
     *     &quot;loginEnabled&quot;: false,
     *     &quot;syncEnabled&quot;: false
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: A 400 InvalidParameter error indicates that the parameters or current configuration prerequisites are not met. A 404 IdentityProviderNotFound error indicates that no binding of the specified type exists. Synchronous calls to the upstream service may return a 503 IdentityProviderProvisioningUnavailable error if they fail. Retain the request ID for troubleshooting and do not interpret read failures as an unconfigured state. Authentication errors and workspace-not-found errors follow common error handling procedures.
     * 404 IdentityProviderNotFound: No binding exists, or the specified type is inconsistent with the current binding. If SAML is already configured, an upstream read failure does not degrade to a successful empty configuration.</p>
     * 
     * @param request the request parameters of GetIdentityProvider  GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    CompletableFuture<GetIdentityProviderResponse> getIdentityProvider(GetIdentityProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status, current step, number of processed users, and failure cause of a manual synchronization task by using the local taskId of AgentCore. The taskId must be obtained from CreateIdentityProviderSyncJob in the same workspace and identity provider. It is not the synchronizationJobId of AgentIdentity. Poll the task until the status is SUCCESS, FAILED, or CANCELED. The PENDING, RUNNING, and PAUSED statuses do not indicate completion. The syncedUserCount includes updated existing users and does not equal the number of newly added users or the progress percentage.
     * Authorization information: The RAM operation is agentcore:GetIdentityProviderSyncJob, the access level is Read, and the resource ARN is acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource is a required authorization resource.
     * Idempotence and retry: This operation is read-only and can be repeatedly queried.
     * Calling this API operation is free of charge, and operation records support ActionTrail auditing.
     * Response example:</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;data&quot;: {
     *     &quot;taskId&quot;: &quot;12345678-1234-4234-8234-123456789abc&quot;,
     *     &quot;status&quot;: &quot;SUCCESS&quot;,
     *     &quot;currentStep&quot;: &quot;SYNC&quot;,
     *     &quot;synchronizationJobId&quot;: &quot;syncjob_0123456789abcdef0123456789abcdef&quot;,
     *     &quot;syncedUserCount&quot;: 12
     *   }
     * }
     * </code></pre>
     * 
     * @param request the request parameters of GetIdentityProviderSyncJob  GetIdentityProviderSyncJobRequest
     * @return GetIdentityProviderSyncJobResponse
     */
    CompletableFuture<GetIdentityProviderSyncJobResponse> getIdentityProviderSyncJob(GetIdentityProviderSyncJobRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the saved synchronization scope, the validity of selected departments, and the estimated user count downstream of the identity provider. This operation is not used for real-time estimation of unsaved selections. AllAuthorized indicates the address book scope authorized for the application, which is not equivalent to the entire enterprise organization. An empty selectedDepartments array does not prove that the organization has no sub-departments. The estimation can be used only when estimateStatus is Ready and a count is returned. A missing count does not indicate 0.
     * Authorization information: RAM operation agentcore:GetIdentityProviderSyncScope, access level Read, resource ARN: acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource is a required authorization resource.
     * Idempotence and retry: This operation is read-only and can be queried repeatedly.
     * Calling this API operation is free of charge. Operation records support ActionTrail auditing.
     * Sample response:</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;data&quot;: {
     *     &quot;syncScope&quot;: {
     *       &quot;mode&quot;: &quot;SelectedDepartments&quot;,
     *       &quot;departmentIds&quot;: [
     *         &quot;10001&quot;
     *       ]
     *     },
     *     &quot;selectedDepartments&quot;: [
     *       {
     *         &quot;id&quot;: &quot;10001&quot;,
     *         &quot;name&quot;: &quot;R&amp;D Department&quot;,
     *         &quot;exists&quot;: true
     *       }
     *     ],
     *     &quot;estimateStatus&quot;: &quot;Ready&quot;,
     *     &quot;expandedDepartmentCount&quot;: 2,
     *     &quot;estimatedUserCount&quot;: 12
     *   }
     * }
     * </code></pre>
     * 
     * @param request the request parameters of GetIdentityProviderSyncScope  GetIdentityProviderSyncScopeRequest
     * @return GetIdentityProviderSyncScopeResponse
     */
    CompletableFuture<GetIdentityProviderSyncScopeResponse> getIdentityProviderSyncScope(GetIdentityProviderSyncScopeRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of the logical image cache in the current workspace. Returns the complete source, current digest, actual size, creation time, status, and secure error messages. AgentCount counts configuration references with the switch enabled. CanDelete verifies both configuration references and instance usage. If the switch is disabled, the count is 0, but deletion is still prohibited if old instances are not released. If the resource does not belong to the current workspace, resources with the same content from other workspaces are not returned.</p>
     * 
     * @param request the request parameters of GetImageCache  GetImageCacheRequest
     * @return GetImageCacheResponse
     */
    CompletableFuture<GetImageCacheResponse> getImageCache(GetImageCacheRequest request);

    /**
     * @param request the request parameters of GetManagedAgent  GetManagedAgentRequest
     * @return GetManagedAgentResponse
     */
    CompletableFuture<GetManagedAgentResponse> getManagedAgent(GetManagedAgentRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the details of a specified MCP server, including the address, type, status, authentication configuration, and protocol.</p>
     * 
     * @param request the request parameters of GetMcp  GetMcpRequest
     * @return GetMcpResponse
     */
    CompletableFuture<GetMcpResponse> getMcp(GetMcpRequest request);

    /**
     * <b>description</b> :
     * <p>Returns the current template version and installation form schema.</p>
     * 
     * @param request the request parameters of GetMcpMarketItem  GetMcpMarketItemRequest
     * @return GetMcpMarketItemResponse
     */
    CompletableFuture<GetMcpMarketItemResponse> getMcpMarketItem(GetMcpMarketItemRequest request);

    /**
     * <b>description</b> :
     * <p>Queries a long-term memory by memory ID.</p>
     * 
     * @param request the request parameters of GetMemory  GetMemoryRequest
     * @return GetMemoryResponse
     */
    CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the public information and current status of a MemoryStore in a specified workspace.</p>
     * 
     * @param request the request parameters of GetMemoryStore  GetMemoryStoreRequest
     * @return GetMemoryStoreResponse
     */
    CompletableFuture<GetMemoryStoreResponse> getMemoryStore(GetMemoryStoreRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the task ID returned by the asynchronous AddMemories operation.</p>
     * 
     * @param request the request parameters of GetMemoryTask  GetMemoryTaskRequest
     * @return GetMemoryTaskResponse
     */
    CompletableFuture<GetMemoryTaskResponse> getMemoryTask(GetMemoryTaskRequest request);

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
     * <p>Queries the currently active API key for a specified service endpoint. The call succeeds only when API key authentication is enabled for the service endpoint and the gateway consumer and credentials are ready. The service reads the API key from the gateway in real time, and AgentCore does not persist the plaintext. Keep the returned API key secure and avoid logging it or exposing it in public configurations.</p>
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
     * <p>Retrieves the OSS presigned upload URL and object name required to import a Skill ZIP package. After the upload is complete, you can call the Skill OSS upload API to complete the import.</p>
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
     * <h2>Request description\nQueries the details of a workspace by workspace ID, including the lifecycle status, CMS Workspace, AIRegistry Namespace, and current network policies.\n.</h2>
     * 
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>ACR and user OSS mounts share the workspace role. If no existing role is found, AliyunAgentCoreWorkspace-{workspaceId} is used. If a valid legacy OSS mount role exists, it is reused and permissions are appended without overwriting existing OSS policies. Fixed historical shared roles continue to be reused and are not recreated or renamed due to new naming templates. The acrInstanceId, namespace, and repository parameters are required. The region and account are derived from the workspace context. Returns the role resolved by the backend and the authorization URL for the target repository. This operation does not create ACR or agent execution versions, nor does it deliver runtime configurations. After authorization is complete, you can call Verify before creating or updating an agent, without the need to call an independent Ensure operation.</p>
     * 
     * @param request the request parameters of GetWorkspaceAcrRamAuthorizeUrl  GetWorkspaceAcrRamAuthorizeUrlRequest
     * @return GetWorkspaceAcrRamAuthorizeUrlResponse
     */
    CompletableFuture<GetWorkspaceAcrRamAuthorizeUrlResponse> getWorkspaceAcrRamAuthorizeUrl(GetWorkspaceAcrRamAuthorizeUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Determines the account, region, and shared role based on the workspace, and concatenates the resource ARN based on the provided fileSystemId and accessPointId. The server parameter is used to generate the policy name. This operation does not query NAS or check the resource status, and returns an authorization URL that contains only the target NAS policy. After completing RAM authorization, you must call the verification API.</p>
     * 
     * @param request the request parameters of GetWorkspaceAgenticFsMountRamAuthorizeUrl  GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest
     * @return GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse
     */
    CompletableFuture<GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse> getWorkspaceAgenticFsMountRamAuthorizeUrl(GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest request);

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
     * <p>Validates the input based on the specified template version and creates an MCP in the workspace.</p>
     * 
     * @param request the request parameters of InstallMcpMarketItem  InstallMcpMarketItemRequest
     * @return InstallMcpMarketItemResponse
     */
    CompletableFuture<InstallMcpMarketItemResponse> installMcpMarketItem(InstallMcpMarketItemRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description\nInstalls a plugin for a specified AgentCore workspace. Currently, only the <code>collaboration</code> plugin is supported. Plugin configurations are passed through the <code>Config</code> parameter, and different plugins can define their own configuration structures. The <code>collaboration</code> plugin uses <code>Config.NetworkConfiguration</code> to specify the VPC and public network access policy. The installation procedure executes asynchronously. If you repeatedly invoke this operation for a plugin with the same name that is being installed or already installed, the operation returns the current status based on idempotent semantics if the configurations are identical. If the configurations are different, the operation returns an operation conflict.\n</h2>
     * 
     * @param request the request parameters of InstallWorkspacePlugin  InstallWorkspacePluginRequest
     * @return InstallWorkspacePluginResponse
     */
    CompletableFuture<InstallWorkspacePluginResponse> installWorkspacePlugin(InstallWorkspacePluginRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the directories in the current workspace that can be used to create code package agents or switch runtime environments. Runtime environments are dynamically provided based on the current version configuration, and internal image addresses are not returned.
     * If maxResults is omitted or set to 0, the default value is 10. If the value is greater than 100, it is processed as 100. Omit nextToken in the first request. For subsequent requests, use the token returned in the previous response as is, and keep the workspace unchanged. If a directory change invalidates the token, query from the first page again. An empty nextToken indicates that there are no more pages. Existing agents continue to use the saved images for restarts, scaling, and regular updates.</p>
     * 
     * @param request the request parameters of ListAgentCodeRuntimes  ListAgentCodeRuntimesRequest
     * @return ListAgentCodeRuntimesResponse
     */
    CompletableFuture<ListAgentCodeRuntimesResponse> listAgentCodeRuntimes(ListAgentCodeRuntimesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of IM channels for a specified agent.</p>
     * 
     * @param request the request parameters of ListAgentIMChannels  ListAgentIMChannelsRequest
     * @return ListAgentIMChannelsResponse
     */
    CompletableFuture<ListAgentIMChannelsResponse> listAgentIMChannels(ListAgentIMChannelsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries AgentSpec resources in a specified workspace by using paging, and supports name-based search, sorting, and filtering by owner, visibility scope, and business labels.</p>
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
     * <b>description</b> :
     * <p>Queries the list of available models for a specified Connector. Pagination is supported.</p>
     * 
     * @param request the request parameters of ListConnectorModels  ListConnectorModelsRequest
     * @return ListConnectorModelsResponse
     */
    CompletableFuture<ListConnectorModelsResponse> listConnectorModels(ListConnectorModelsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of connectors in a specified workspace.</p>
     * 
     * @param request the request parameters of ListConnectors  ListConnectorsRequest
     * @return ListConnectorsResponse
     */
    CompletableFuture<ListConnectorsResponse> listConnectors(ListConnectorsRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paged query for the credential list in a workspace, and supports filtering by type and name during paging.</p>
     * 
     * @param request the request parameters of ListCredentials  ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    CompletableFuture<ListCredentialsResponse> listCredentials(ListCredentialsRequest request);

    /**
     * <b>description</b> :
     * <p>The default value of maxResults is 20 and the maximum value is 100. If this parameter is omitted or set to 0, the default value is used.
     * Omit nextToken in the first request. For subsequent requests, pass the nextToken returned in the previous response as is and keep the same workspace. The nextToken is an opaque token. Do not parse or construct it. An empty token in the response indicates that there are no more pages.
     * This operation returns the summaries of the current page and does not return the complete deployment configurations or the execution errors of the latest version. To obtain this information, call GetCustomAgent by using the agentId in items.</p>
     * 
     * @param request the request parameters of ListCustomAgents  ListCustomAgentsRequest
     * @return ListCustomAgentsResponse
     */
    CompletableFuture<ListCustomAgentsResponse> listCustomAgents(ListCustomAgentsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of external agents in a specified workspace.</p>
     * 
     * @param request the request parameters of ListExternalAgents  ListExternalAgentsRequest
     * @return ListExternalAgentsResponse
     */
    CompletableFuture<ListExternalAgentsResponse> listExternalAgents(ListExternalAgentsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries DingTalk or Feishu departments by hierarchy and page. Prerequisites include a bound identity provider, a user pool, valid application credentials, and address book read authorization. If you do not specify parentDepartmentId, the root hierarchy is queried. When expanding a node, specify the ID of the node to query its direct child departments. The hasChildren field indicates whether the node can be expanded and does not mean that child nodes are returned. The nextToken field is used only to query the next page of child departments under the current parent department. This query only reads the directory. It does not save the synchronization scope or import users. If a new department is added to a DingTalk or Feishu organization, re-query the corresponding parent department because the previous list does not reflect the latest directory.\n\nAuthorization information: The RAM action is agentcore:ListIdentityProviderDepartments, the access level is List, and the resource ARN is acs:agentcore:{regionId}:{accountId}:workspace/{workspaceId}/identityProvider/{identityProviderType}. This resource is required for authorization.\n\nIdempotency and retry: This operation is read-only and can be called repeatedly.\n\nCalling this API is free of charge. Operation records support ActionTrail auditing.\n\nResponse example:\n<code>json\\n{\\n  &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,\\n  &quot;message&quot;: &quot;success&quot;,\\n  &quot;httpStatusCode&quot;: 200,\\n  &quot;code&quot;: &quot;SUCCESS&quot;,\\n  &quot;success&quot;: true,\\n  &quot;maxResults&quot;: 50,\\n  &quot;nextToken&quot;: &quot;&quot;,\\n  &quot;items&quot;: [\\n    {\\n      &quot;id&quot;: &quot;10001&quot;,\\n      &quot;name&quot;: &quot;R&amp;D Department&quot;,\\n      &quot;parentId&quot;: &quot;1&quot;,\\n      &quot;memberCount&quot;: 12,\\n      &quot;hasChildren&quot;: true\\n    }\\n  ]\\n}\\n</code></p>
     * 
     * @param request the request parameters of ListIdentityProviderDepartments  ListIdentityProviderDepartmentsRequest
     * @return ListIdentityProviderDepartmentsResponse
     */
    CompletableFuture<ListIdentityProviderDepartmentsResponse> listIdentityProviderDepartments(ListIdentityProviderDepartmentsRequest request);

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>Returns the local binding summary without querying the actual SAML or SCIM configurations of AgentIdentity. If no binding exists, items is an empty array. A workspace currently supports only one external binding. The default value of maxResults is 10, and the valid range is 1 to 100. Currently, nextToken must be omitted or left empty. A non-empty value returns InvalidParameter, and fictitious multi-page results are not supported.
     * The status of CustomSSO indicates the task status of shared resources and logon configurations. You must check protocol and saml to determine whether SAML is configured. To query SCIM configurations, independently call GetIdentityProviderSCIM. The list operation does not issue tokens and does not return the vendor appSecret, encryptKey, or verificationToken.</p>
     * <h2>Requests and examples</h2>
     * <p>GET /workspaces/{workspaceId}/identity-providers
     * Call conventions: Call the API in the region of the target workspace by using an AccessKey pair or Security Token Service (STS) token that has the required permissions on the identity source resources of the workspace. In the following examples, ws-example, URLs, certificates, and tokens are placeholder values and must be replaced with actual values. The request body example shows the body parameters of the public API, not the extra body wrapper of the backend direct connection API. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Retain the requestId for troubleshooting and do not record secrets. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">GET /workspaces/ws-example/identity-providers?maxResults=10
     * </code></pre>
     * <h2>Response examples</h2>
     * <pre><code class="language-json">{
     *   &quot;items&quot;: [
     *     {
     *       &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *       &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *       &quot;status&quot;: &quot;READY&quot;,
     *       &quot;loginEnabled&quot;: false,
     *       &quot;syncEnabled&quot;: false
     *     }
     *   ],
     *   &quot;maxResults&quot;: 10,
     *   &quot;totalCount&quot;: 1
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. Synchronous calls to upstream services that fail may return 503 IdentityProviderProvisioningUnavailable. Retain the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace non-existence errors follow common error handling.
     * 400 InvalidParameter: maxResults is out of bounds, or nextToken is not empty, which is currently not supported. If a query fails, an error is displayed instead of resetting the status to unconfigured.</p>
     * 
     * @param request the request parameters of ListIdentityProviders  ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    CompletableFuture<ListIdentityProvidersResponse> listIdentityProviders(ListIdentityProvidersRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the logical image caches within the current account, region, and workspace. WorkspaceId is required, and caches are not visible across workspaces. All conditions filter the full set using the AND operator before pagination is calculated. Results are sorted in descending order of logical resource creation time and ascending order of ImageId. The cursor is bound to the account, region, workspace, all filters, and the sort order. Returns the complete cache objects, the AgentCount based on the configuration switch, and the actual deletion eligibility. Query failures do not return a disguised empty list, and the nextToken on the last page is an empty string.</p>
     * 
     * @param request the request parameters of ListImageCaches  ListImageCachesRequest
     * @return ListImageCachesResponse
     */
    CompletableFuture<ListImageCachesResponse> listImageCaches(ListImageCachesRequest request);

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
     * <p>Queries all online official MCP templates. You can filter results by keyword, usage tag, and MCP type.</p>
     * 
     * @param request the request parameters of ListMcpMarketItems  ListMcpMarketItemsRequest
     * @return ListMcpMarketItemsResponse
     */
    CompletableFuture<ListMcpMarketItemsResponse> listMcpMarketItems(ListMcpMarketItemsRequest request);

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
     * <p>Queries MCP services and their configurations and statuses in a specified workspace by using paging.</p>
     * 
     * @param request the request parameters of ListMcps  ListMcpsRequest
     * @return ListMcpsResponse
     */
    CompletableFuture<ListMcpsResponse> listMcps(ListMcpsRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paged query on long-term memory records. The results can be filtered independently by user ID, agent ID, and session ID. Paging is supported.</p>
     * 
     * @param request the request parameters of ListMemories  ListMemoriesRequest
     * @return ListMemoriesResponse
     */
    CompletableFuture<ListMemoriesResponse> listMemories(ListMemoriesRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paging query for raw messages by exact scope. SessionId is required, and at least one of UserId and AgentId must be provided.</p>
     * 
     * @param request the request parameters of ListMemorySessionMessages  ListMemorySessionMessagesRequest
     * @return ListMemorySessionMessagesResponse
     */
    CompletableFuture<ListMemorySessionMessagesResponse> listMemorySessionMessages(ListMemorySessionMessagesRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paging query for sessions in a MemoryStore. You can filter the sessions independently by user ID and agent ID.</p>
     * 
     * @param request the request parameters of ListMemorySessions  ListMemorySessionsRequest
     * @return ListMemorySessionsResponse
     */
    CompletableFuture<ListMemorySessionsResponse> listMemorySessions(ListMemorySessionsRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paged query for MemoryStores in a specified workspace with paging.</p>
     * 
     * @param request the request parameters of ListMemoryStores  ListMemoryStoresRequest
     * @return ListMemoryStoresResponse
     */
    CompletableFuture<ListMemoryStoresResponse> listMemoryStores(ListMemoryStoresRequest request);

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
     * <p>Queries the list of active sessions in the sandbox of a specified managed agent.</p>
     * 
     * @param request the request parameters of ListSandboxSessions  ListSandboxSessionsRequest
     * @return ListSandboxSessionsResponse
     */
    CompletableFuture<ListSandboxSessionsResponse> listSandboxSessions(ListSandboxSessionsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of sandboxes for a specified managed agent. The searchText parameter performs a fuzzy match on sandbox ID fragments, and the sessionId parameter performs a fuzzy match on active session ID fragments. Both parameters are case-insensitive and can be used together with AND logic.</p>
     * 
     * @param request the request parameters of ListSandboxes  ListSandboxesRequest
     * @return ListSandboxesResponse
     */
    CompletableFuture<ListSandboxesResponse> listSandboxes(ListSandboxesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description\nQueries service endpoints in a specified workspace with paging. You can filter the results by targetType, agentId, agentVersion, resourceBindingId, collaborationComponent, and status. Use maxResults to specify the maximum number of records per page, and use nextToken to retrieve the next page. If maxResults is not specified, the server returns 20 records by default.\n</h2>
     * 
     * @param request the request parameters of ListServiceEndpoints  ListServiceEndpointsRequest
     * @return ListServiceEndpointsResponse
     */
    CompletableFuture<ListServiceEndpointsResponse> listServiceEndpoints(ListServiceEndpointsRequest request);

    /**
     * @param request the request parameters of ListSkillReferences  ListSkillReferencesRequest
     * @return ListSkillReferencesResponse
     */
    CompletableFuture<ListSkillReferencesResponse> listSkillReferences(ListSkillReferencesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a paged query of Skills in a specified workspace and returns basic Skill information, version status, and paging information.</p>
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
     * <h2>Request description\nPerforms a paged query on the workspaces under the current tenant. By default, the list does not return soft-deleted records with the Deleted status. The server performs stable sorting on the results by creation order to facilitate paging. You can use nextToken to obtain the next page, skip to skip a specified number of workspaces, maxResults to specify the maximum number of records per page, and nameLike to perform fuzzy filtering by workspace name. If maxResults is not specified or is set to 0, the server returns 20 records by default.\n</h2>
     * 
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
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
     * <h2>Operation description</h2>
     * <p>Parses and checks one or more Skill ZIP packages uploaded to OSS, and returns the name, version, and conflict check results.</p>
     * 
     * @param request the request parameters of PrecheckSkillUploadViaOss  PrecheckSkillUploadViaOssRequest
     * @return PrecheckSkillUploadViaOssResponse
     */
    CompletableFuture<PrecheckSkillUploadViaOssResponse> precheckSkillUploadViaOss(PrecheckSkillUploadViaOssRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Publishes a specified Skill version to transition it to the published state.</p>
     * 
     * @param request the request parameters of PublishSkillVersion  PublishSkillVersionRequest
     * @return PublishSkillVersionResponse
     */
    CompletableFuture<PublishSkillVersionResponse> publishSkillVersion(PublishSkillVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Converts a specified Skill version back to an editable draft so that you can continue to modify it.</p>
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
     * <p>Retries the image cache for the original ImageId in the current workspace. WorkspaceId is required. The business request body is not required and can be omitted or provided as an empty object. The source authorization and transfer network reuse the trusted context of the original registration. If a digest exists, the retry uses the original digest. If no digest exists, the original tag is resolved again. A new request for a FAILED status can start a new production round. PENDING and READY statuses are reused. DELETING status is rejected, and deleted resources are not recreated. PUBLIC and PRIVATE statuses reuse the pull authorization of the original workspace. Returns a complete acceptance snapshot and retains the original ImageId and CreatedAt. ClientToken does not guarantee request deduplication. If the result is not confirmed, query the real-time status first before deciding whether to resubmit.</p>
     * 
     * @param request the request parameters of RetryImageCache  RetryImageCacheRequest
     * @return RetryImageCacheResponse
     */
    CompletableFuture<RetryImageCacheResponse> retryImageCache(RetryImageCacheRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves long-term memory from a MemoryStore based on semantics.</p>
     * 
     * @param request the request parameters of SearchMemories  SearchMemoriesRequest
     * @return SearchMemoriesResponse
     */
    CompletableFuture<SearchMemoriesResponse> searchMemories(SearchMemoriesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Submits a specified draft version of an AgentSpec for review. If no release pipeline is configured, the version is directly published online.</p>
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
     * <p>Updates the ServiceEndpoint, enablement status, or channel behavior configuration bound to an IM channel. At least one updatable field must be provided.</p>
     * 
     * @param request the request parameters of UpdateAgentIMChannel  UpdateAgentIMChannelRequest
     * @return UpdateAgentIMChannelResponse
     */
    CompletableFuture<UpdateAgentIMChannelResponse> updateAgentIMChannel(UpdateAgentIMChannelRequest request);

    /**
     * <b>description</b> :
     * <p>Fully updates the channel credentials of a specified IM channel. Secrets are not returned in the response.</p>
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
     * <b>description</b> :
     * <p>Updates the sensitive configuration of a specified Connector and aligns Service Account Keys by ID.</p>
     * 
     * @param request the request parameters of UpdateConnector  UpdateConnectorRequest
     * @return UpdateConnectorResponse
     */
    CompletableFuture<UpdateConnectorResponse> updateConnector(UpdateConnectorRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the metadata or application scope of a specified credential.</p>
     * 
     * @param request the request parameters of UpdateCredential  UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    CompletableFuture<UpdateCredentialResponse> updateCredential(UpdateCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>Provide at least one top-level field to update. Omitted top-level fields retain their original configurations. When providing a configuration object, specify its required subfields and include any optional configurations that you want to retain. Arrays are replaced as a whole. Pass an empty array [] to clear a list. The agenticFsMounts field does not accept null. Pass null for the description field to clear the description, and pass null for the healthCheck field to remove the health check.
     * When updating an image, you must specify artifact.port and the type, instanceId, namespace, repo, and tag fields of artifact.container. To retain a custom startup command, also provide the entrypoint field.
     * In code package pattern, specify artifact.port and the sourceUri, languageRuntime, and entrypoint fields of artifact.code. Do not specify the container field at the same time. Dependencies must be packaged by the user. ZIP and TAR.GZ formats are supported, and the compressed package size cannot exceed 500,000,000 bytes. Query the runtime environment identity by calling the ListAgentCodeRuntimes operation. The sourceUri field supports oss:// addresses or HTTPS object addresses of standard OSS public domain names, including signed URLs. For local files, first call the GetAgentCodePackageUploadUrl operation to obtain an upload URL, upload the file directly, and then commit the returned sourceUri.
     * When submitting a new code package source, the backend rechecks read permissions, objects, and sizes. The configuration is saved only after the transfer succeeds. If the transfer fails, the current configuration is not saved. Saved fixed packages can be reused. Set the client timeout to 210 seconds for code package requests. Archive integrity and secure decompression are checked at startup. A successful acceptance does not indicate that the agent is ready to run.
     * When providing the runtime field, the compute and sessionPolicy fields must be provided at the same time. If the hpa field or its subfields are omitted, unspecified elastic configurations use default values. To retain the original elastic configurations, provide them together. When providing the network field, omitted access items are treated as allowed, but actual access is still restricted by the workspace network configurations. To retain the original restrictions, provide both accessInternet and accessVpc. When providing the healthCheck field, the port field is required, and other unspecified items use default values. When providing the logging.sls field, both project and logstore must be specified.
     * The update is an asynchronous process. A successful response indicates that the request is accepted. Call the GetCustomAgent operation to query latestSpecVersion, latestVersionStatus, and latestExecutionError, and check the status field to confirm the update result.
     * The clientToken field currently does not provide idempotency guarantees. Do not rely on this parameter to prevent duplicate requests. The healthyThreshold field for health checks currently does not take effect. Omit this field.</p>
     * 
     * @param request the request parameters of UpdateCustomAgent  UpdateCustomAgentRequest
     * @return UpdateCustomAgentResponse
     */
    CompletableFuture<UpdateCustomAgentResponse> updateCustomAgent(UpdateCustomAgentRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified external agent.</p>
     * 
     * @param request the request parameters of UpdateExternalAgent  UpdateExternalAgentRequest
     * @return UpdateExternalAgentResponse
     */
    CompletableFuture<UpdateExternalAgentResponse> updateExternalAgent(UpdateExternalAgentRequest request);

    /**
     * <b>description</b> :
     * <h2>Features and prerequisites</h2>
     * <p>CustomSSO uses protocol=SAML and saml to save logon configurations. It does not accept legacy metadata or syncEnabled. To toggle the SCIM switch, you must call UpdateIdentityProviderSCIM. OIDC is not supported. You can either import XML or manually enter fields. If you import XML, metadataXml must be a single IdP EntityDescriptor XML text of up to 1 MiB. URLs or file paths are not accepted, and DTDs or external entities are prohibited. If you manually enter fields, you must provide entityId, loginUrl, bindingType, and a non-empty x509Certificates array at the same time. The entityId must be non-empty and up to 2,048 characters in length, and cannot be replaced after configuration. The loginUrl must be an absolute HTTPS URL without user credentials or fragments. The bindingType must be HTTP-Redirect or HTTP-POST. Signing certificates must be valid X.509 certificates, and up to 10 certificates are supported.
     * Saving the configuration does not automatically enable logon. A valid SAML configuration must exist before you enable logon. Setting loginEnabled=false only disables logon and does not clear SAML or SCIM configurations. You can independently pass Boolean values for jitProvisionEnabled and jitUpdateEnabled. If omitted, the existing values are retained. If omitted for the first time, the default value is false. Updating only the JIT switches also requires a valid SAML configuration. If the request is unchanged, the current binding may be returned directly without generating a new task. A successful update returns UPDATING. You can call GetIdentityProvider and wait for READY or UPDATE_FAILED. If the update fails, you can resubmit the request. An HTTP success response does not indicate that the upstream configuration has taken effect.
     * DingTalk and Feishu continue to use vendor metadata and logon or synchronization switches. They do not accept protocol or saml. Updating vendor metadata supports partial updates. You only need to submit the fields to be modified. Unsubmitted fields and saved credentials remain unchanged. The server merges the new and old values and then validates the complete configuration. Explicitly submitted fields cannot be null, empty strings, or blank strings. For example, you can submit only appSecret to update the secret. The existing vendor semantics of syncScope are retained. Saving the scope does not automatically trigger full synchronization.</p>
     * <h2>Request and examples</h2>
     * <p>PUT /workspaces/{workspaceId}/identity-providers/{identityProviderType}
     * Call conventions: Call the API in the region of the target workspace by using an AccessKey pair or STS token that has permissions on the identity provider resources of the workspace. In the following examples, ws-example, URLs, certificates, and tokens are placeholder values and must be replaced with actual values. The request body example shows the body parameters of the public API, not the extra body wrapper of the backend direct connection API. The response example shows only the business part. The outer layer also includes requestId, success, code, message, and httpStatusCode. Keep the requestId for troubleshooting and do not log secrets. Asynchronous business tasks do not mean that the HTTP request uses a long connection to wait for completion.</p>
     * <pre><code class="language-text">PUT /workspaces/ws-example/identity-providers/CustomSSO
     * {
     *   &quot;protocol&quot;: &quot;SAML&quot;,
     *   &quot;saml&quot;: {
     *     &quot;entityId&quot;: &quot;https://idp.example.com/entity&quot;,
     *     &quot;loginUrl&quot;: &quot;https://idp.example.com/sso&quot;,
     *     &quot;bindingType&quot;: &quot;HTTP-Redirect&quot;,
     *     &quot;x509Certificates&quot;: [
     *       &quot;&lt;Valid PEM X.509 certificate text&gt;&quot;
     *     ],
     *     &quot;jitProvisionEnabled&quot;: false,
     *     &quot;jitUpdateEnabled&quot;: false
     *   }
     * }
     * Toggle logon only: {&quot;loginEnabled&quot;: true}
     * </code></pre>
     * <h2>Response example</h2>
     * <pre><code class="language-json">{
     *   &quot;data&quot;: {
     *     &quot;workspaceId&quot;: &quot;ws-example&quot;,
     *     &quot;identityProviderType&quot;: &quot;CustomSSO&quot;,
     *     &quot;protocol&quot;: &quot;SAML&quot;,
     *     &quot;loginEnabled&quot;: false,
     *     &quot;syncEnabled&quot;: false,
     *     &quot;status&quot;: &quot;UPDATING&quot;
     *   }
     * }
     * </code></pre>
     * <h2>Errors and handling</h2>
     * <p>Error handling: 400 InvalidParameter indicates that the parameters or current configuration prerequisites are not met. 404 IdentityProviderNotFound indicates that no binding of the matching type exists. Synchronous calls to the upstream may return 503 IdentityProviderProvisioningUnavailable if they fail. Keep the request ID for troubleshooting and do not interpret read failures as unconfigured. Actual authentication and workspace non-existence errors follow common error handling.
     * 400 InvalidParameter: XML and manual entry are mixed, manual entry items are missing, certificates are invalid, the protocol is not supported, entityId is changed, logon is enabled without configuration, or CustomSSO submits metadata or syncEnabled. 409 IdentityProviderOperationConflict: The current binding does not allow updates. CustomSSO supports resubmitting configurations from UPDATE_FAILED.</p>
     * 
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
     * <p>Updates the schema-exposed parameters by using the same template version that was bound when the MCP was created, without upgrading the template version.</p>
     * 
     * @param request the request parameters of UpdateMcpTemplateConfig  UpdateMcpTemplateConfigRequest
     * @return UpdateMcpTemplateConfigResponse
     */
    CompletableFuture<UpdateMcpTemplateConfigResponse> updateMcpTemplateConfig(UpdateMcpTemplateConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the text or metadata of a long-term memory based on the memory ID.</p>
     * 
     * @param request the request parameters of UpdateMemory  UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request);

    /**
     * <b>description</b> :
     * <p>Updates a memory store.</p>
     * 
     * @param request the request parameters of UpdateMemoryStore  UpdateMemoryStoreRequest
     * @return UpdateMemoryStoreResponse
     */
    CompletableFuture<UpdateMemoryStoreResponse> updateMemoryStore(UpdateMemoryStoreRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports updating description, contextSize, maxTokens, and capabilities. You must specify at least one non-null parameter. Parameters that are not specified or are set to null retain their original values. The capabilities parameter is replaced as a whole object. Capability fields that are not specified in the object are treated as false.
     * Modifying only the description does not refresh the model configurations of associated agents. When contextSize, maxTokens, or capabilities actually change, the system asynchronously refreshes managed agents that reference the model within the same workspace, as well as external agents whose model source is PLATFORM. External agents whose model source is RUNTIME are not affected. Repeatedly submitting the same configuration does not trigger a new model configuration refresh.
     * A successful response indicates that the model configuration has been saved, but does not indicate that associated agents have completed the configuration refresh or that the runtime has loaded the new configuration. You can call GetModel to query the saved model configuration.</p>
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
     * <h2>Request description</h2>
     * <p>Updates the business tags of a specified skill. Other attributes not provided in the request remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateSkillBizTags  UpdateSkillBizTagsRequest
     * @return UpdateSkillBizTagsResponse
     */
    CompletableFuture<UpdateSkillBizTagsResponse> updateSkillBizTags(UpdateSkillBizTagsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
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
     * <h2>Request description\nUpdates the name or network configuration of a workspace. Only workspaces in the <code>Initialized</code> state can be updated. <code>Status</code>, <code>TenantId</code>, and <code>RegionId</code> are maintained by the server and cannot be modified through this API operation. The network configuration uses <code>Enabled</code> to specify whether to enable the VPC network. If enabled, you must provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
     * 
     * @param request the request parameters of UpdateWorkspace  UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    CompletableFuture<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves an uploaded AgentSpec ZIP package from OSS, parses the package, and imports the AgentSpec into the current workspace.</p>
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

    /**
     * <b>description</b> :
     * <p>Uses the current workspace role to check whether the customer\&quot;s OSS object exists and is readable, and checks the file name extension and compressed size. Returns the sourceUri, file name, size, and format read in this request. The bucket and object key are passed separately, and HTTPS download URLs are not accepted.
     * The validation uses object metadata and read probing. It does not perform full downloads, transfers, or decompression, nor does it generate a SHA-256 hash. Passing the validation does not mean that the archive content is complete or can be started. When you submit a CreateCustomAgent or UpdateCustomAgent request, the system re-validates and transfers the package. You do not need to invoke this operation in advance as a prerequisite for submission.</p>
     * 
     * @param request the request parameters of ValidateAgentCodePackageFromOss  ValidateAgentCodePackageFromOssRequest
     * @return ValidateAgentCodePackageFromOssResponse
     */
    CompletableFuture<ValidateAgentCodePackageFromOssResponse> validateAgentCodePackageFromOss(ValidateAgentCodePackageFromOssRequest request);

    /**
     * <b>description</b> :
     * <p>检查当前 Workspace 角色是否绑定所选源 Bucket 对应的自定义 RAM 策略，复用已有挂载授权。仅返回策略绑定状态，不验证代码包存在或可读、不修改默认桶。授权状态不能替代 ValidateAgentCodePackageFromOss 的实际对象读取校验。</p>
     * 
     * @param request the request parameters of VerifyAgentCodePackageOssRamAuthorization  VerifyAgentCodePackageOssRamAuthorizationRequest
     * @return VerifyAgentCodePackageOssRamAuthorizationResponse
     */
    CompletableFuture<VerifyAgentCodePackageOssRamAuthorizationResponse> verifyAgentCodePackageOssRamAuthorization(VerifyAgentCodePackageOssRamAuthorizationRequest request);

    /**
     * <b>description</b> :
     * <p>Validates whether the credentials of a specified Connector are valid and returns a list of invalid Service Account Keys.</p>
     * 
     * @param request the request parameters of VerifyConnector  VerifyConnectorRequest
     * @return VerifyConnectorResponse
     */
    CompletableFuture<VerifyConnectorResponse> verifyConnector(VerifyConnectorRequest request);

    /**
     * <b>description</b> :
     * <p>ACR and user OSS mounts share the workspace role. If no existing role is found, AliyunAgentCoreWorkspace-{workspaceId} is used. If a valid legacy OSS mount role exists, it is retained and only new permissions are appended without overwriting existing OSS policies. Fixed historical shared roles continue to be reused and are not recreated or renamed due to new naming templates. This operation performs a read-only check to verify whether the custom policies corresponding to the target instance, namespace, and repository are attached to the shared role, and checks the workspace prerequisites. It does not create execution versions or trigger configuration delivery. AUTHORIZED only indicates that the custom policy for the target name is attached, without parsing the policy content or simulating the final permissions. ELIGIBLE does not mean that RuntimeManager capacity or template admission is complete, nor does it require ACR configuration to be delivered. Creating or updating an agent re-verifies permissions and processes ACR dependencies on the backend. Configuration waiting, failures, and retries are reported through agent details.</p>
     * 
     * @param request the request parameters of VerifyWorkspaceAcrRamAuthorization  VerifyWorkspaceAcrRamAuthorizationRequest
     * @return VerifyWorkspaceAcrRamAuthorizationResponse
     */
    CompletableFuture<VerifyWorkspaceAcrRamAuthorizationResponse> verifyWorkspaceAcrRamAuthorization(VerifyWorkspaceAcrRamAuthorizationRequest request);

    /**
     * <b>description</b> :
     * <p>Determines the shared role and target access point based on the workspace and server, checks whether the role has a mounted policy with the expected name and a type of Custom, and returns AUTHORIZED or UNAUTHORIZED. Consistent with OSS/ACR, this operation does not verify the policy body, role trust, or actual mount read/write permissions. If the upstream query fails, an error is returned.</p>
     * 
     * @param request the request parameters of VerifyWorkspaceAgenticFsMountRamAuthorization  VerifyWorkspaceAgenticFsMountRamAuthorizationRequest
     * @return VerifyWorkspaceAgenticFsMountRamAuthorizationResponse
     */
    CompletableFuture<VerifyWorkspaceAgenticFsMountRamAuthorizationResponse> verifyWorkspaceAgenticFsMountRamAuthorization(VerifyWorkspaceAgenticFsMountRamAuthorizationRequest request);

    /**
     * <b>description</b> :
     * <p>Queries whether the workspace OSS mount role is bound to the custom RAM policy corresponding to the target bucket, and returns AUTHORIZED or UNAUTHORIZED. When bucketName is not specified, the existing user-managed OSS binding of the workspace is used and the authorization status is saved. When bucketName is specified, only the authorization status of the specified bucket is queried without modifying the workspace OSS binding. This operation does not verify OSS data plane access permissions or resume workspace initialization tasks. Alibaba Cloud Container Registry (ACR) and user OSS mounts share the workspace role. If no existing role is available, AliyunAgentCoreWorkspace-{workspaceId} is used. If a valid legacy OSS mount role exists, it is reused and permissions are only appended without overwriting existing OSS policies. Previously pinned shared roles continue to be reused and are not recreated or renamed due to new naming templates.</p>
     * 
     * @param request the request parameters of VerifyWorkspaceOssMountRamAuthorization  VerifyWorkspaceOssMountRamAuthorizationRequest
     * @return VerifyWorkspaceOssMountRamAuthorizationResponse
     */
    CompletableFuture<VerifyWorkspaceOssMountRamAuthorizationResponse> verifyWorkspaceOssMountRamAuthorization(VerifyWorkspaceOssMountRamAuthorizationRequest request);

}
