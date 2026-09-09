// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.agentcore20260804.models.*;
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
        this.product = "AgentCore";
        this.version = "2026-08-04";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of BatchDeleteModels  BatchDeleteModelsRequest
     * @return BatchDeleteModelsResponse
     */
    @Override
    public CompletableFuture<BatchDeleteModelsResponse> batchDeleteModels(BatchDeleteModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchDeleteModels").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/models/actions/batch-delete").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Uploads Skill ZIP packages in bulk through OSS and returns the processing result of each Skill.</p>
     * 
     * @param request the request parameters of BatchUploadSkillsViaOss  BatchUploadSkillsViaOssRequest
     * @return BatchUploadSkillsViaOssResponse
     */
    @Override
    public CompletableFuture<BatchUploadSkillsViaOssResponse> batchUploadSkillsViaOss(BatchUploadSkillsViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchUploadSkillsViaOss").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skill-actions/batch-upload-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUploadSkillsViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUploadSkillsViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an IM channel for a specified agent and binds a publicly accessible ServiceEndpoint.</p>
     * 
     * @param request the request parameters of CreateAgentIMChannel  CreateAgentIMChannelRequest
     * @return CreateAgentIMChannelResponse
     */
    @Override
    public CompletableFuture<CreateAgentIMChannelResponse> createAgentIMChannel(CreateAgentIMChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentIMChannel").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentIMChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentIMChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates an AgentSpec in the specified workspace and generates the first draft version. Returns a resource conflict error if an AgentSpec with the same name already exists.</p>
     * 
     * @param request the request parameters of CreateAgentSpec  CreateAgentSpecRequest
     * @return CreateAgentSpecResponse
     */
    @Override
    public CompletableFuture<CreateAgentSpecResponse> createAgentSpec(CreateAgentSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentSpec").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-specs").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Creates a new draft version for an existing AgentSpec. The AgentSpec must exist, and there must not be a draft currently being edited.</p>
     * 
     * @param request the request parameters of CreateAgentSpecVersion  CreateAgentSpecVersionRequest
     * @return CreateAgentSpecVersionResponse
     */
    @Override
    public CompletableFuture<CreateAgentSpecVersionResponse> createAgentSpecVersion(CreateAgentSpecVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentSpecVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/versions").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentSpecVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentSpecVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCredential  CreateCredentialRequest
     * @return CreateCredentialResponse
     */
    @Override
    public CompletableFuture<CreateCredentialResponse> createCredential(CreateCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCredential").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/credentials").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an external agent in a specified workspace.</p>
     * 
     * @param request the request parameters of CreateExternalAgent  CreateExternalAgentRequest
     * @return CreateExternalAgentResponse
     */
    @Override
    public CompletableFuture<CreateExternalAgentResponse> createExternalAgent(CreateExternalAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExternalAgent").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/external-agents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExternalAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExternalAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a Bootstrap Token and CMS configuration required for connecting a specified external agent.</p>
     * 
     * @param request the request parameters of CreateExternalAgentBootstrapToken  CreateExternalAgentBootstrapTokenRequest
     * @return CreateExternalAgentBootstrapTokenResponse
     */
    @Override
    public CompletableFuture<CreateExternalAgentBootstrapTokenResponse> createExternalAgentBootstrapToken(CreateExternalAgentBootstrapTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExternalAgentBootstrapToken").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/external-agents/{agentId}/bootstrap/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExternalAgentBootstrapTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExternalAgentBootstrapTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateIdentityProvider  CreateIdentityProviderRequest
     * @return CreateIdentityProviderResponse
     */
    @Override
    public CompletableFuture<CreateIdentityProviderResponse> createIdentityProvider(CreateIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIdentityProvider").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/identity-providers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIdentityProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIdentityProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateManagedAgent  CreateManagedAgentRequest
     * @return CreateManagedAgentResponse
     */
    @Override
    public CompletableFuture<CreateManagedAgentResponse> createManagedAgent(CreateManagedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateManagedAgent").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/managed-agents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateManagedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateManagedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates an MCP service in a specified workspace. The creation is an asynchronous process. You can check whether the service is ready by using the returned status or by calling a query operation.</p>
     * 
     * @param request the request parameters of CreateMcp  CreateMcpRequest
     * @return CreateMcpResponse
     */
    @Override
    public CompletableFuture<CreateMcpResponse> createMcp(CreateMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMcp").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/mcp-servers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMcpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMcpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateModel  CreateModelRequest
     * @return CreateModelResponse
     */
    @Override
    public CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModel").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/models").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateModelConnection  CreateModelConnectionRequest
     * @return CreateModelConnectionResponse
     */
    @Override
    public CompletableFuture<CreateModelConnectionResponse> createModelConnection(CreateModelConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModelConnection").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/model-connections").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Creates a Skill in the specified workspace and generates a draft version that can be further edited. You can derive a draft from an existing version or specify a target version and commit message.</p>
     * 
     * @param request the request parameters of CreateSkillDraft  CreateSkillDraftRequest
     * @return CreateSkillDraftResponse
     */
    @Override
    public CompletableFuture<CreateSkillDraftResponse> createSkillDraft(CreateSkillDraftRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSkillDraft").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSkillDraftResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSkillDraftResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTeam  CreateTeamRequest
     * @return CreateTeamResponse
     */
    @Override
    public CompletableFuture<CreateTeamResponse> createTeam(CreateTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTeam").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/teams").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    @Override
    public CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateUser").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/users").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description\nCreates an AgentCore workspace control plane record. The server completes the state transition from <code>Initializing</code> to <code>Initialized</code> within the same transaction. The network configuration uses <code>Enabled</code> to specify whether to enable VPC networking. When enabled, you must provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
     * 
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    @Override
    public CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkspace").setMethod(HttpMethod.POST).setPathRegex("/workspaces").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DebugModel  DebugModelRequest
     * @return DebugModelResponse
     */
    @Override
    public CompletableFuture<DebugModelResponse> debugModel(DebugModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DebugModel").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/models/{modelId}/actions/debug").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DebugModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DebugModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes an IM channel of a specified agent.</p>
     * 
     * @param request the request parameters of DeleteAgentIMChannel  DeleteAgentIMChannelRequest
     * @return DeleteAgentIMChannelResponse
     */
    @Override
    public CompletableFuture<DeleteAgentIMChannelResponse> deleteAgentIMChannel(DeleteAgentIMChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentIMChannel").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels/{imChannelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentIMChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentIMChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes a specified AgentSpec along with all its versions and metadata. This operation is irreversible.</p>
     * 
     * @param request the request parameters of DeleteAgentSpec  DeleteAgentSpecRequest
     * @return DeleteAgentSpecResponse
     */
    @Override
    public CompletableFuture<DeleteAgentSpecResponse> deleteAgentSpec(DeleteAgentSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentSpec").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes the draft version currently being edited for a specified AgentSpec and clears the draft version pointer.</p>
     * 
     * @param request the request parameters of DeleteAgentSpecVersion  DeleteAgentSpecVersionRequest
     * @return DeleteAgentSpecVersionResponse
     */
    @Override
    public CompletableFuture<DeleteAgentSpecVersionResponse> deleteAgentSpecVersion(DeleteAgentSpecVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentSpecVersion").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/draft").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentSpecVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentSpecVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCredential  DeleteCredentialRequest
     * @return DeleteCredentialResponse
     */
    @Override
    public CompletableFuture<DeleteCredentialResponse> deleteCredential(DeleteCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCredential").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/credentials/{credentialId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified external agent.</p>
     * 
     * @param request the request parameters of DeleteExternalAgent  DeleteExternalAgentRequest
     * @return DeleteExternalAgentResponse
     */
    @Override
    public CompletableFuture<DeleteExternalAgentResponse> deleteExternalAgent(DeleteExternalAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExternalAgent").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/external-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExternalAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExternalAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteIdentityProvider  DeleteIdentityProviderRequest
     * @return DeleteIdentityProviderResponse
     */
    @Override
    public CompletableFuture<DeleteIdentityProviderResponse> deleteIdentityProvider(DeleteIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIdentityProvider").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/identity-providers/{identityProviderType}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIdentityProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIdentityProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteManagedAgent  DeleteManagedAgentRequest
     * @return DeleteManagedAgentResponse
     */
    @Override
    public CompletableFuture<DeleteManagedAgentResponse> deleteManagedAgent(DeleteManagedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteManagedAgent").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/managed-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteManagedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteManagedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes a specified MCP service. The deletion is an asynchronous process. After the deletion is complete, the MCP service is no longer returned.</p>
     * 
     * @param request the request parameters of DeleteMcp  DeleteMcpRequest
     * @return DeleteMcpResponse
     */
    @Override
    public CompletableFuture<DeleteMcpResponse> deleteMcp(DeleteMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMcp").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/mcp-servers/{mcpServerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMcpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMcpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteModel  DeleteModelRequest
     * @return DeleteModelResponse
     */
    @Override
    public CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModel").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/models/{modelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteModelConnection  DeleteModelConnectionRequest
     * @return DeleteModelConnectionResponse
     */
    @Override
    public CompletableFuture<DeleteModelConnectionResponse> deleteModelConnection(DeleteModelConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModelConnection").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/model-connections/{connectionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes a skill and its related version data from a specified workspace. This operation is irreversible.</p>
     * 
     * @param request the request parameters of DeleteSkill  DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    @Override
    public CompletableFuture<DeleteSkillResponse> deleteSkill(DeleteSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSkill").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Deletes the draft version currently being edited for a specified Skill.</p>
     * 
     * @param request the request parameters of DeleteSkillDraft  DeleteSkillDraftRequest
     * @return DeleteSkillDraftResponse
     */
    @Override
    public CompletableFuture<DeleteSkillDraftResponse> deleteSkillDraft(DeleteSkillDraftRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSkillDraft").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/draft").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSkillDraftResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSkillDraftResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTeam  DeleteTeamRequest
     * @return DeleteTeamResponse
     */
    @Override
    public CompletableFuture<DeleteTeamResponse> deleteTeam(DeleteTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTeam").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/teams/{teamId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    @Override
    public CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteUser").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/users/{agentCoreUserId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nDeletes the control plane record of a specified workspace. The server completes the state transition from <code>Deleting</code> to <code>Deleted</code> within the same transaction. When you repeatedly delete a workspace that is in the <code>Deleting</code> or <code>Deleted</code> state, the server handles the request with idempotence semantics.\n.</h2>
     * 
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    @Override
    public CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWorkspace").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <h2>Operation description</h2>
     * <p>Retrieves a pre-signed OSS download URL for a specified AgentSpec, which is used to download the AgentSpec ZIP package.</p>
     * 
     * @param request the request parameters of DownloadAgentSpecViaOss  DownloadAgentSpecViaOssRequest
     * @return DownloadAgentSpecViaOssResponse
     */
    @Override
    public CompletableFuture<DownloadAgentSpecViaOssResponse> downloadAgentSpecViaOss(DownloadAgentSpecViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DownloadAgentSpecViaOss").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/actions/download-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadAgentSpecViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadAgentSpecViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves a pre-signed OSS download URL for a specified Skill version, which is used to download the corresponding Skill ZIP package.</p>
     * 
     * @param request the request parameters of DownloadSkillVersionViaOss  DownloadSkillVersionViaOssRequest
     * @return DownloadSkillVersionViaOssResponse
     */
    @Override
    public CompletableFuture<DownloadSkillVersionViaOssResponse> downloadSkillVersionViaOss(DownloadSkillVersionViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DownloadSkillVersionViaOss").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}/actions/download-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadSkillVersionViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadSkillVersionViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Skips the regular review process and forcibly publishes the specified Skill version.</p>
     * 
     * @param request the request parameters of ForcePublishSkillVersion  ForcePublishSkillVersionRequest
     * @return ForcePublishSkillVersionResponse
     */
    @Override
    public CompletableFuture<ForcePublishSkillVersionResponse> forcePublishSkillVersion(ForcePublishSkillVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ForcePublishSkillVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}/actions/force-publish").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ForcePublishSkillVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ForcePublishSkillVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified agent IM channel.</p>
     * 
     * @param request the request parameters of GetAgentIMChannel  GetAgentIMChannelRequest
     * @return GetAgentIMChannelResponse
     */
    @Override
    public CompletableFuture<GetAgentIMChannelResponse> getAgentIMChannel(GetAgentIMChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentIMChannel").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels/{imChannelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentIMChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentIMChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the governance details of a specified AgentSpec, including basic information, governance pointers, and summaries of all versions.</p>
     * 
     * @param request the request parameters of GetAgentSpec  GetAgentSpecRequest
     * @return GetAgentSpecResponse
     */
    @Override
    public CompletableFuture<GetAgentSpecResponse> getAgentSpec(GetAgentSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentSpec").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing an AgentSpec ZIP package. After the upload is complete, call the AgentSpec OSS upload operation to complete the import.</p>
     * 
     * @param request the request parameters of GetAgentSpecImportFileUrl  GetAgentSpecImportFileUrlRequest
     * @return GetAgentSpecImportFileUrlResponse
     */
    @Override
    public CompletableFuture<GetAgentSpecImportFileUrlResponse> getAgentSpecImportFileUrl(GetAgentSpecImportFileUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentSpecImportFileUrl").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-spec-actions/get-import-file-url").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSpecImportFileUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSpecImportFileUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the full content of the latest version of a specified AgentSpec for editing or viewing.</p>
     * 
     * @param request the request parameters of GetAgentSpecLatest  GetAgentSpecLatestRequest
     * @return GetAgentSpecLatestResponse
     */
    @Override
    public CompletableFuture<GetAgentSpecLatestResponse> getAgentSpecLatest(GetAgentSpecLatestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentSpecLatest").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/latest").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSpecLatestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSpecLatestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the complete content of a specified AgentSpec version, including manifest content, resource files, and metadata.</p>
     * 
     * @param request the request parameters of GetAgentSpecVersion  GetAgentSpecVersionRequest
     * @return GetAgentSpecVersionResponse
     */
    @Override
    public CompletableFuture<GetAgentSpecVersionResponse> getAgentSpecVersion(GetAgentSpecVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentSpecVersion").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/versions/{agentSpecVersion}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSpecVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSpecVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCredential  GetCredentialRequest
     * @return GetCredentialResponse
     */
    @Override
    public CompletableFuture<GetCredentialResponse> getCredential(GetCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCredential").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/credentials/{credentialId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified external agent.</p>
     * 
     * @param request the request parameters of GetExternalAgent  GetExternalAgentRequest
     * @return GetExternalAgentResponse
     */
    @Override
    public CompletableFuture<GetExternalAgentResponse> getExternalAgent(GetExternalAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExternalAgent").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/external-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExternalAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExternalAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the available network types for a specified external agent.</p>
     * 
     * @param request the request parameters of GetExternalAgentBootstrapOptions  GetExternalAgentBootstrapOptionsRequest
     * @return GetExternalAgentBootstrapOptionsResponse
     */
    @Override
    public CompletableFuture<GetExternalAgentBootstrapOptionsResponse> getExternalAgentBootstrapOptions(GetExternalAgentBootstrapOptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExternalAgentBootstrapOptions").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/external-agents/{agentId}/bootstrap/options").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExternalAgentBootstrapOptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExternalAgentBootstrapOptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIdentityProvider  GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    @Override
    public CompletableFuture<GetIdentityProviderResponse> getIdentityProvider(GetIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIdentityProvider").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/identity-providers/{identityProviderType}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIdentityProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIdentityProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetManagedAgent  GetManagedAgentRequest
     * @return GetManagedAgentResponse
     */
    @Override
    public CompletableFuture<GetManagedAgentResponse> getManagedAgent(GetManagedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetManagedAgent").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/managed-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetManagedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetManagedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the details of a specified MCP service, including its address, type, status, authentication configuration, and protocol.</p>
     * 
     * @param request the request parameters of GetMcp  GetMcpRequest
     * @return GetMcpResponse
     */
    @Override
    public CompletableFuture<GetMcpResponse> getMcp(GetMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMcp").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/mcp-servers/{mcpServerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMcpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMcpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetModel  GetModelRequest
     * @return GetModelResponse
     */
    @Override
    public CompletableFuture<GetModelResponse> getModel(GetModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetModel").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/models/{modelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetModelConnection  GetModelConnectionRequest
     * @return GetModelConnectionResponse
     */
    @Override
    public CompletableFuture<GetModelConnectionResponse> getModelConnection(GetModelConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetModelConnection").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/model-connections/{connectionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description\nQueries the details of a specified service endpoint. A service endpoint (ServiceEndpoint) provides a stable access URL for a specific agent version (AgentVersion) or workspace collaboration component. The response includes target routing, access URL list, authentication configuration, and current lifecycle status.\n.</h2>
     * 
     * @param request the request parameters of GetServiceEndpoint  GetServiceEndpointRequest
     * @return GetServiceEndpointResponse
     */
    @Override
    public CompletableFuture<GetServiceEndpointResponse> getServiceEndpoint(GetServiceEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceEndpoint").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/service-endpoints/{serviceEndpointId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the currently active API Key for a specified service endpoint. The call succeeds only when the service endpoint has API_KEY authentication enabled and the gateway consumer and credentials are ready. The service reads the API Key from the gateway in real time. AgentCore does not persist the plaintext. Keep the returned API Key secure and avoid logging it or exposing it in public configurations.</p>
     * 
     * @param request the request parameters of GetServiceEndpointApiKey  GetServiceEndpointApiKeyRequest
     * @return GetServiceEndpointApiKeyResponse
     */
    @Override
    public CompletableFuture<GetServiceEndpointApiKeyResponse> getServiceEndpointApiKey(GetServiceEndpointApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceEndpointApiKey").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/service-endpoints/{serviceEndpointId}/api-key/get").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceEndpointApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceEndpointApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the basic information, version status, labels, visibility scope, and version list of a specified Skill.</p>
     * 
     * @param request the request parameters of GetSkillDetail  GetSkillDetailRequest
     * @return GetSkillDetailResponse
     */
    @Override
    public CompletableFuture<GetSkillDetailResponse> getSkillDetail(GetSkillDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSkillDetail").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Retrieves the OSS pre-signed upload URL and object name required for importing a Skill ZIP package. After the upload is complete, call the Skill OSS upload operation to complete the import.</p>
     * 
     * @param request the request parameters of GetSkillImportFileUrl  GetSkillImportFileUrlRequest
     * @return GetSkillImportFileUrlResponse
     */
    @Override
    public CompletableFuture<GetSkillImportFileUrlResponse> getSkillImportFileUrl(GetSkillImportFileUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSkillImportFileUrl").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/skill-actions/get-import-file-url").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillImportFileUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillImportFileUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the complete details of a specified Skill version, including version metadata, Skill content, and associated resources.</p>
     * 
     * @param request the request parameters of GetSkillVersionDetail  GetSkillVersionDetailRequest
     * @return GetSkillVersionDetailResponse
     */
    @Override
    public CompletableFuture<GetSkillVersionDetailResponse> getSkillVersionDetail(GetSkillVersionDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSkillVersionDetail").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillVersionDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillVersionDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTeam  GetTeamRequest
     * @return GetTeamResponse
     */
    @Override
    public CompletableFuture<GetTeamResponse> getTeam(GetTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTeam").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/teams/{teamId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    @Override
    public CompletableFuture<GetUserResponse> getUser(GetUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUser").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/users/{agentCoreUserId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description\nQueries workspace details by workspace ID, including lifecycle status, CMS Workspace, AIRegistry Namespace, and current network policy.\n.</h2>
     * 
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    @Override
    public CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkspace").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description\nQueries the plug-in status of a specified workspace. Returns whether the plug-in is enabled, its lifecycle status, and the currently effective configuration. Currently, two types of plug-ins are supported: collaboration and agentloop. If a plug-in is not installed, its status is DISABLED.\n.</h2>
     * 
     * @param request the request parameters of GetWorkspacePlugin  GetWorkspacePluginRequest
     * @return GetWorkspacePluginResponse
     */
    @Override
    public CompletableFuture<GetWorkspacePluginResponse> getWorkspacePlugin(GetWorkspacePluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkspacePlugin").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/plugins/{pluginName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkspacePluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkspacePluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description\nInstalls a plugin for a specified AgentCore workspace. Currently supports the <code>collaboration</code> plugin. Plugin configuration is passed through the <code>Config</code> parameter, and different plugins can define their own configuration structures. The <code>collaboration</code> plugin uses <code>Config.NetworkConfiguration</code> to specify VPC and public network access policies. The installation process is executed asynchronously. When you repeatedly call this operation for a plugin with the same name that is being installed or already installed, the operation returns the current status with idempotent semantics if the configuration is the same. If the configuration is different, the operation returns an operation conflict error.\n.</h2>
     * 
     * @param request the request parameters of InstallWorkspacePlugin  InstallWorkspacePluginRequest
     * @return InstallWorkspacePluginResponse
     */
    @Override
    public CompletableFuture<InstallWorkspacePluginResponse> installWorkspacePlugin(InstallWorkspacePluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallWorkspacePlugin").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/plugins/{pluginName}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallWorkspacePluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallWorkspacePluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the IM channel list of a specified agent.</p>
     * 
     * @param request the request parameters of ListAgentIMChannels  ListAgentIMChannelsRequest
     * @return ListAgentIMChannelsResponse
     */
    @Override
    public CompletableFuture<ListAgentIMChannelsResponse> listAgentIMChannels(ListAgentIMChannelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentIMChannels").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentIMChannelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentIMChannelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries AgentSpec resources in a specified workspace by using paging, supporting name search, sorting, and filtering by owner, visibility scope, and business labels.</p>
     * 
     * @param request the request parameters of ListAgentSpecs  ListAgentSpecsRequest
     * @return ListAgentSpecsResponse
     */
    @Override
    public CompletableFuture<ListAgentSpecsResponse> listAgentSpecs(ListAgentSpecsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentSpecs").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-specs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentSpecsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentSpecsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentTeams  ListAgentTeamsRequest
     * @return ListAgentTeamsResponse
     */
    @Override
    public CompletableFuture<ListAgentTeamsResponse> listAgentTeams(ListAgentTeamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentTeams").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-team-memberships").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentTeamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentTeamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCredentials  ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    @Override
    public CompletableFuture<ListCredentialsResponse> listCredentials(ListCredentialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCredentials").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/credentials").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCredentialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCredentialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of external agents in a specified workspace.</p>
     * 
     * @param request the request parameters of ListExternalAgents  ListExternalAgentsRequest
     * @return ListExternalAgentsResponse
     */
    @Override
    public CompletableFuture<ListExternalAgentsResponse> listExternalAgents(ListExternalAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExternalAgents").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/external-agents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExternalAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExternalAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIdentityProviders  ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    @Override
    public CompletableFuture<ListIdentityProvidersResponse> listIdentityProviders(ListIdentityProvidersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIdentityProviders").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/identity-providers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIdentityProvidersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIdentityProvidersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of managed agents in a specified workspace by using paging. Returns summary information for each agent, including the identity, name, status, template, and specifications.</p>
     * 
     * @param request the request parameters of ListManagedAgents  ListManagedAgentsRequest
     * @return ListManagedAgentsResponse
     */
    @Override
    public CompletableFuture<ListManagedAgentsResponse> listManagedAgents(ListManagedAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListManagedAgents").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/managed-agents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListManagedAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListManagedAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries the list of tools exposed by a specified MCP service and their input/output schemas.</p>
     * 
     * @param request the request parameters of ListMcpTools  ListMcpToolsRequest
     * @return ListMcpToolsResponse
     */
    @Override
    public CompletableFuture<ListMcpToolsResponse> listMcpTools(ListMcpToolsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMcpTools").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/mcp-servers/{mcpServerId}/tools").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMcpToolsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMcpToolsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Queries MCP services and their configurations and statuses in a specified workspace by page.</p>
     * 
     * @param request the request parameters of ListMcps  ListMcpsRequest
     * @return ListMcpsResponse
     */
    @Override
    public CompletableFuture<ListMcpsResponse> listMcps(ListMcpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMcps").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/mcp-servers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMcpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMcpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries model connections in a specified AgentCore workspace. Supports filtering by name through <code>Name</code> and selecting exact match or fuzzy match through <code>SearchType</code>. Also supports filtering by model provider type and invoke protocol, and supports paging.</p>
     * 
     * @param request the request parameters of ListModelConnections  ListModelConnectionsRequest
     * @return ListModelConnectionsResponse
     */
    @Override
    public CompletableFuture<ListModelConnectionsResponse> listModelConnections(ListModelConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModelConnections").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/model-connections").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelConnectionsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModels").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPredefinedModelProviders  ListPredefinedModelProvidersRequest
     * @return ListPredefinedModelProvidersResponse
     */
    @Override
    public CompletableFuture<ListPredefinedModelProvidersResponse> listPredefinedModelProviders(ListPredefinedModelProvidersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPredefinedModelProviders").setMethod(HttpMethod.GET).setPathRegex("/model-catalog/providers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPredefinedModelProvidersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPredefinedModelProvidersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPredefinedModels  ListPredefinedModelsRequest
     * @return ListPredefinedModelsResponse
     */
    @Override
    public CompletableFuture<ListPredefinedModelsResponse> listPredefinedModels(ListPredefinedModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPredefinedModels").setMethod(HttpMethod.GET).setPathRegex("/model-catalog/providers/{providerType}/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPredefinedModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPredefinedModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nQueries service endpoints in a specified workspace by using paging. Filter results by targetType, agentId, agentVersion, resourceBindingId, collaborationComponent, and status. Use maxResults to specify the maximum number of records per page, and use nextToken to retrieve the next page. If maxResults is not specified, the server returns 20 records by default.\n</h2>
     * 
     * @param request the request parameters of ListServiceEndpoints  ListServiceEndpointsRequest
     * @return ListServiceEndpointsResponse
     */
    @Override
    public CompletableFuture<ListServiceEndpointsResponse> listServiceEndpoints(ListServiceEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListServiceEndpoints").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/service-endpoints").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a paged query of Skills in a specified workspace, and returns basic Skill information, version status, and paging details.</p>
     * 
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    @Override
    public CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSkills").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/skills").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTeams  ListTeamsRequest
     * @return ListTeamsResponse
     */
    @Override
    public CompletableFuture<ListTeamsResponse> listTeams(ListTeamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTeams").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/teams").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTeamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTeamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    @Override
    public CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUsers").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description\nQueries workspaces under the current tenant with paging. The list does not return soft-deleted records with a status of <code>Deleted</code> by default. Results are stably sorted by creation order on the server side. Use <code>nextToken</code> to retrieve the next page, <code>skip</code> to skip a specified number of workspaces, <code>maxResults</code> to specify the maximum number of records per page, and <code>nameLike</code> to filter workspaces by name using fuzzy match. If <code>maxResults</code> is not specified or is set to 0, the server returns 20 records by default.\n</h2>
     * 
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    @Override
    public CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkspaces").setMethod(HttpMethod.GET).setPathRegex("/workspaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkspacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkspacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Takes the online version of a specified Skill offline so that it is no longer used as the online version.</p>
     * 
     * @param request the request parameters of OfflineSkill  OfflineSkillRequest
     * @return OfflineSkillResponse
     */
    @Override
    public CompletableFuture<OfflineSkillResponse> offlineSkill(OfflineSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OfflineSkill").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/actions/offline").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Sets a specified Skill version as the online version.</p>
     * 
     * @param request the request parameters of OnlineSkill  OnlineSkillRequest
     * @return OnlineSkillResponse
     */
    @Override
    public CompletableFuture<OnlineSkillResponse> onlineSkill(OnlineSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OnlineSkill").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/actions/online").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnlineSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnlineSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Parses and checks one or more Skill ZIP packages uploaded to OSS, and returns the name, version, and conflict check results.</p>
     * 
     * @param request the request parameters of PrecheckSkillUploadViaOss  PrecheckSkillUploadViaOssRequest
     * @return PrecheckSkillUploadViaOssResponse
     */
    @Override
    public CompletableFuture<PrecheckSkillUploadViaOssResponse> precheckSkillUploadViaOss(PrecheckSkillUploadViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PrecheckSkillUploadViaOss").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skill-actions/precheck-upload-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PrecheckSkillUploadViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PrecheckSkillUploadViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Publishes a specified Skill version to change its state to published.</p>
     * 
     * @param request the request parameters of PublishSkillVersion  PublishSkillVersionRequest
     * @return PublishSkillVersionResponse
     */
    @Override
    public CompletableFuture<PublishSkillVersionResponse> publishSkillVersion(PublishSkillVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishSkillVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}/actions/publish").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishSkillVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishSkillVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Converts a specified Skill version back into an editable draft for further modifications.</p>
     * 
     * @param request the request parameters of RedraftSkillVersion  RedraftSkillVersionRequest
     * @return RedraftSkillVersionResponse
     */
    @Override
    public CompletableFuture<RedraftSkillVersionResponse> redraftSkillVersion(RedraftSkillVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RedraftSkillVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}/actions/redraft").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RedraftSkillVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RedraftSkillVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetUserPassword  ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    @Override
    public CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResetUserPassword").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/users/actions/reset-password").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetUserPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetUserPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Submits a specified AgentSpec draft version for review. If no release pipeline is configured, the version is published directly to online status.</p>
     * 
     * @param request the request parameters of SubmitAgentSpecVersion  SubmitAgentSpecVersionRequest
     * @return SubmitAgentSpecVersionResponse
     */
    @Override
    public CompletableFuture<SubmitAgentSpecVersionResponse> submitAgentSpecVersion(SubmitAgentSpecVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitAgentSpecVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/versions/{agentSpecVersion}/actions/submit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAgentSpecVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAgentSpecVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Submits a specified draft version of a skill for review.</p>
     * 
     * @param request the request parameters of SubmitSkillVersion  SubmitSkillVersionRequest
     * @return SubmitSkillVersionResponse
     */
    @Override
    public CompletableFuture<SubmitSkillVersionResponse> submitSkillVersion(SubmitSkillVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitSkillVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}/actions/submit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitSkillVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitSkillVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the ServiceEndpoint binding, enabled/disabled status, or channel behavior configuration of an IM channel. At least one updatable field must be provided.</p>
     * 
     * @param request the request parameters of UpdateAgentIMChannel  UpdateAgentIMChannelRequest
     * @return UpdateAgentIMChannelResponse
     */
    @Override
    public CompletableFuture<UpdateAgentIMChannelResponse> updateAgentIMChannel(UpdateAgentIMChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentIMChannel").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels/{imChannelId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentIMChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentIMChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a full update of the channel credential for a specified IM channel of an agent. Secrets are not returned in the response.</p>
     * 
     * @param request the request parameters of UpdateAgentIMChannelCredential  UpdateAgentIMChannelCredentialRequest
     * @return UpdateAgentIMChannelCredentialResponse
     */
    @Override
    public CompletableFuture<UpdateAgentIMChannelCredentialResponse> updateAgentIMChannelCredential(UpdateAgentIMChannelCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentIMChannelCredential").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels/{imChannelId}/actions/update-credential").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentIMChannelCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentIMChannelCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the business tags, version labels, and visibility scope of a specified AgentSpec. Fields that are not provided remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateAgentSpec  UpdateAgentSpecRequest
     * @return UpdateAgentSpecResponse
     */
    @Override
    public CompletableFuture<UpdateAgentSpecResponse> updateAgentSpec(UpdateAgentSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentSpec").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCredential  UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    @Override
    public CompletableFuture<UpdateCredentialResponse> updateCredential(UpdateCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCredential").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/credentials/{credentialId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified external agent.</p>
     * 
     * @param request the request parameters of UpdateExternalAgent  UpdateExternalAgentRequest
     * @return UpdateExternalAgentResponse
     */
    @Override
    public CompletableFuture<UpdateExternalAgentResponse> updateExternalAgent(UpdateExternalAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExternalAgent").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/external-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExternalAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExternalAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateIdentityProvider  UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    @Override
    public CompletableFuture<UpdateIdentityProviderResponse> updateIdentityProvider(UpdateIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateIdentityProvider").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/identity-providers/{identityProviderType}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIdentityProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIdentityProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateManagedAgent  UpdateManagedAgentRequest
     * @return UpdateManagedAgentResponse
     */
    @Override
    public CompletableFuture<UpdateManagedAgentResponse> updateManagedAgent(UpdateManagedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateManagedAgent").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/managed-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateManagedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateManagedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the address, description, authentication, or Swagger configuration of a specified MCP service. The MCP type and protocol cannot be modified after creation. The update is an asynchronous process.</p>
     * 
     * @param request the request parameters of UpdateMcp  UpdateMcpRequest
     * @return UpdateMcpResponse
     */
    @Override
    public CompletableFuture<UpdateMcpResponse> updateMcp(UpdateMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMcp").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/mcp-servers/{mcpServerId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMcpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMcpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation updates description, contextSize, maxTokens, and capabilities. At least one non-null parameter must be provided. Parameters that are not provided or set to null retain their original values. The capabilities object is replaced as a whole. Capability fields not included in the object are treated as false.
     * Modifying only description does not refresh the model configuration of associated agents. When contextSize, maxTokens, or capabilities actually change, the system asynchronously refreshes managed agents that reference the model within the same workspace, as well as external agents whose model source is PLATFORM. External agents whose model source is RUNTIME are not affected. Submitting the same configuration repeatedly does not trigger a new model configuration refresh.
     * A successful response indicates that the model configuration has been saved. It does not indicate that associated agents have completed the configuration refresh or that the runtime has loaded the new configuration. Call GetModel to query the saved model configuration.</p>
     * 
     * @param request the request parameters of UpdateModel  UpdateModelRequest
     * @return UpdateModelResponse
     */
    @Override
    public CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModel").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/models/{modelId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateModelConnection  UpdateModelConnectionRequest
     * @return UpdateModelConnectionResponse
     */
    @Override
    public CompletableFuture<UpdateModelConnectionResponse> updateModelConnection(UpdateModelConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModelConnection").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/model-connections/{connectionId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Updates the business tags of a specified Skill. Other attributes that are not included in the request remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateSkillBizTags  UpdateSkillBizTagsRequest
     * @return UpdateSkillBizTagsResponse
     */
    @Override
    public CompletableFuture<UpdateSkillBizTagsResponse> updateSkillBizTags(UpdateSkillBizTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSkillBizTags").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/biz-tags").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSkillBizTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSkillBizTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Updates the version labels and their mappings for a specified Skill.</p>
     * 
     * @param request the request parameters of UpdateSkillLabels  UpdateSkillLabelsRequest
     * @return UpdateSkillLabelsResponse
     */
    @Override
    public CompletableFuture<UpdateSkillLabelsResponse> updateSkillLabels(UpdateSkillLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSkillLabels").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/labels").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSkillLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSkillLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Updates the visibility scope of a specified skill.</p>
     * 
     * @param request the request parameters of UpdateSkillScope  UpdateSkillScopeRequest
     * @return UpdateSkillScopeResponse
     */
    @Override
    public CompletableFuture<UpdateSkillScopeResponse> updateSkillScope(UpdateSkillScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSkillScope").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/scope").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSkillScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSkillScopeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTeam  UpdateTeamRequest
     * @return UpdateTeamResponse
     */
    @Override
    public CompletableFuture<UpdateTeamResponse> updateTeam(UpdateTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTeam").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/teams/{teamId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    @Override
    public CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateUser").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/users/{agentCoreUserId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description\nUpdates the name or network configuration of a workspace. Only workspaces in the <code>Initialized</code> status can be updated. <code>Status</code>, <code>TenantId</code>, and <code>RegionId</code> are maintained by the server and cannot be modified through this operation. The network configuration uses <code>Enabled</code> to specify whether to enable VPC networking. When enabled, you must also provide <code>VpcId</code> and at least one <code>VSwitchIds</code>.\n.</h2>
     * 
     * @param request the request parameters of UpdateWorkspace  UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    @Override
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWorkspace").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves an uploaded AgentSpec ZIP package from OSS, parses it, and imports the AgentSpec into the current workspace.</p>
     * 
     * @param request the request parameters of UploadAgentSpecViaOss  UploadAgentSpecViaOssRequest
     * @return UploadAgentSpecViaOssResponse
     */
    @Override
    public CompletableFuture<UploadAgentSpecViaOssResponse> uploadAgentSpecViaOss(UploadAgentSpecViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UploadAgentSpecViaOss").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-spec-actions/upload-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadAgentSpecViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadAgentSpecViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Retrieves an uploaded Skill ZIP package from OSS, parses it, and imports the Skill into the current workspace.</p>
     * 
     * @param request the request parameters of UploadSkillViaOss  UploadSkillViaOssRequest
     * @return UploadSkillViaOssResponse
     */
    @Override
    public CompletableFuture<UploadSkillViaOssResponse> uploadSkillViaOss(UploadSkillViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UploadSkillViaOss").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skill-actions/upload-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadSkillViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadSkillViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
