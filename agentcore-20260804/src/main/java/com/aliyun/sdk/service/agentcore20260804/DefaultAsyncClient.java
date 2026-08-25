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
     * @param request the request parameters of UpdateModel  UpdateModelRequest
     * @return UpdateModelResponse
     */
    @Override
    public CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModel").setMethod(HttpMethod.PATCH).setPathRegex("/workspaces/{workspaceId}/models/{modelId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModelConnection").setMethod(HttpMethod.PATCH).setPathRegex("/workspaces/{workspaceId}/model-connections/{connectionId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelConnectionResponse> future = new CompletableFuture<>();
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

}
