// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.devops20210625.models.*;
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
        this.product = "devops";
        this.version = "2021-06-25";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddGroupMember  AddGroupMemberRequest
     * @return AddGroupMemberResponse
     */
    @Override
    public CompletableFuture<AddGroupMemberResponse> addGroupMember(AddGroupMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddGroupMember").setMethod(HttpMethod.POST).setPathRegex("/repository/groups/{groupId}/members/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddGroupMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddGroupMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddPipelineRelations  AddPipelineRelationsRequest
     * @return AddPipelineRelationsResponse
     */
    @Override
    public CompletableFuture<AddPipelineRelationsResponse> addPipelineRelations(AddPipelineRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddPipelineRelations").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/{pipelineId}/pipelineRelations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddPipelineRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddPipelineRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddRepositoryMember  AddRepositoryMemberRequest
     * @return AddRepositoryMemberResponse
     */
    @Override
    public CompletableFuture<AddRepositoryMemberResponse> addRepositoryMember(AddRepositoryMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddRepositoryMember").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/members").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddRepositoryMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddRepositoryMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddWebhook  AddWebhookRequest
     * @return AddWebhookResponse
     */
    @Override
    public CompletableFuture<AddWebhookResponse> addWebhook(AddWebhookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddWebhook").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/webhooks/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddWebhookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddWebhookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelExecutionReleaseStage  CancelExecutionReleaseStageRequest
     * @return CancelExecutionReleaseStageResponse
     */
    @Override
    public CompletableFuture<CancelExecutionReleaseStageResponse> cancelExecutionReleaseStage(CancelExecutionReleaseStageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelExecutionReleaseStage").setMethod(HttpMethod.POST).setPathRegex("/appstack/apps/{appName}/releaseWorkflows/{releaseWorkflowSn}/releaseStages/{releaseStageSn}/executions/{executionNumber}:cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelExecutionReleaseStageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelExecutionReleaseStageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloseMergeRequest  CloseMergeRequestRequest
     * @return CloseMergeRequestResponse
     */
    @Override
    public CompletableFuture<CloseMergeRequestResponse> closeMergeRequest(CloseMergeRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloseMergeRequest").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/{repositoryId}/merge_requests/{localId}/close").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseMergeRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseMergeRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAppMembers  CreateAppMembersRequest
     * @return CreateAppMembersResponse
     */
    @Override
    public CompletableFuture<CreateAppMembersResponse> createAppMembers(CreateAppMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAppMembers").setMethod(HttpMethod.POST).setPathRegex("/appstack/apps/{appName}/members").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAppMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAppMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateBranch  CreateBranchRequest
     * @return CreateBranchResponse
     */
    @Override
    public CompletableFuture<CreateBranchResponse> createBranch(CreateBranchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateBranch").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/branches").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBranchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBranchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateChangeRequest  CreateChangeRequestRequest
     * @return CreateChangeRequestResponse
     */
    @Override
    public CompletableFuture<CreateChangeRequestResponse> createChangeRequest(CreateChangeRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateChangeRequest").setMethod(HttpMethod.POST).setPathRegex("/appstack/apps/{appName}/changeRequests").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateChangeRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateChangeRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCheckRun  CreateCheckRunRequest
     * @return CreateCheckRunResponse
     */
    @Override
    public CompletableFuture<CreateCheckRunResponse> createCheckRun(CreateCheckRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCheckRun").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/check_runs/create_check_run").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCheckRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCheckRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateComment  CreateCommentRequest
     * @return CreateCommentResponse
     */
    @Override
    public CompletableFuture<CreateCommentResponse> createComment(CreateCommentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateComment").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/code_reviews/comments/create_comment").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCommentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCommentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCommitStatus  CreateCommitStatusRequest
     * @return CreateCommitStatusResponse
     */
    @Override
    public CompletableFuture<CreateCommitStatusResponse> createCommitStatus(CreateCommitStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCommitStatus").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/repository/commit_statuses/create_commit_status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCommitStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCommitStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCommitWithMultipleFiles  CreateCommitWithMultipleFilesRequest
     * @return CreateCommitWithMultipleFilesResponse
     */
    @Override
    public CompletableFuture<CreateCommitWithMultipleFilesResponse> createCommitWithMultipleFiles(CreateCommitWithMultipleFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCommitWithMultipleFiles").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/repository/commits/files").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCommitWithMultipleFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCommitWithMultipleFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDeployKey  CreateDeployKeyRequest
     * @return CreateDeployKeyResponse
     */
    @Override
    public CompletableFuture<CreateDeployKeyResponse> createDeployKey(CreateDeployKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDeployKey").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/keys/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeployKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeployKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFile  CreateFileRequest
     * @return CreateFileResponse
     */
    @Override
    public CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFile").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/files").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFlowTag  CreateFlowTagRequest
     * @return CreateFlowTagResponse
     */
    @Override
    public CompletableFuture<CreateFlowTagResponse> createFlowTag(CreateFlowTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFlowTag").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/flow/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFlowTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFlowTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFlowTagGroup  CreateFlowTagGroupRequest
     * @return CreateFlowTagGroupResponse
     */
    @Override
    public CompletableFuture<CreateFlowTagGroupResponse> createFlowTagGroup(CreateFlowTagGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFlowTagGroup").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/flow/tagGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFlowTagGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFlowTagGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHostGroup  CreateHostGroupRequest
     * @return CreateHostGroupResponse
     */
    @Override
    public CompletableFuture<CreateHostGroupResponse> createHostGroup(CreateHostGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateHostGroup").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/hostGroups").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHostGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHostGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMergeRequest  CreateMergeRequestRequest
     * @return CreateMergeRequestResponse
     */
    @Override
    public CompletableFuture<CreateMergeRequestResponse> createMergeRequest(CreateMergeRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMergeRequest").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/{repositoryId}/merge_requests").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMergeRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMergeRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOAuthToken  CreateOAuthTokenRequest
     * @return CreateOAuthTokenResponse
     */
    @Override
    public CompletableFuture<CreateOAuthTokenResponse> createOAuthToken(CreateOAuthTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateOAuthToken").setMethod(HttpMethod.POST).setPathRegex("/login/oauth/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOAuthTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOAuthTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePipeline  CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    @Override
    public CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePipeline").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/pipelines").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePipelineGroup  CreatePipelineGroupRequest
     * @return CreatePipelineGroupResponse
     */
    @Override
    public CompletableFuture<CreatePipelineGroupResponse> createPipelineGroup(CreatePipelineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePipelineGroup").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/pipelineGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePipelineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePipelineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    @Override
    public CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProject").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/projects/createProject").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProjectLabel  CreateProjectLabelRequest
     * @return CreateProjectLabelResponse
     */
    @Override
    public CompletableFuture<CreateProjectLabelResponse> createProjectLabel(CreateProjectLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProjectLabel").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProtectdBranch  CreateProtectdBranchRequest
     * @return CreateProtectdBranchResponse
     */
    @Override
    public CompletableFuture<CreateProtectdBranchResponse> createProtectdBranch(CreateProtectdBranchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProtectdBranch").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/protect_branches").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProtectdBranchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProtectdBranchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePushRule  CreatePushRuleRequest
     * @return CreatePushRuleResponse
     */
    @Override
    public CompletableFuture<CreatePushRuleResponse> createPushRule(CreatePushRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePushRule").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/{repositoryId}/push_rule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePushRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePushRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRepository  CreateRepositoryRequest
     * @return CreateRepositoryResponse
     */
    @Override
    public CompletableFuture<CreateRepositoryResponse> createRepository(CreateRepositoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRepository").setMethod(HttpMethod.POST).setPathRegex("/repository/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRepositoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRepositoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRepositoryGroup  CreateRepositoryGroupRequest
     * @return CreateRepositoryGroupResponse
     */
    @Override
    public CompletableFuture<CreateRepositoryGroupResponse> createRepositoryGroup(CreateRepositoryGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRepositoryGroup").setMethod(HttpMethod.POST).setPathRegex("/repository/groups/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRepositoryGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRepositoryGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateResourceMember  CreateResourceMemberRequest
     * @return CreateResourceMemberResponse
     */
    @Override
    public CompletableFuture<CreateResourceMemberResponse> createResourceMember(CreateResourceMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateResourceMember").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/{resourceType}/{resourceId}/members").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceAuth  CreateServiceAuthRequest
     * @return CreateServiceAuthResponse
     */
    @Override
    public CompletableFuture<CreateServiceAuthResponse> createServiceAuth(CreateServiceAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateServiceAuth").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/serviceAuths").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceConnection  CreateServiceConnectionRequest
     * @return CreateServiceConnectionResponse
     */
    @Override
    public CompletableFuture<CreateServiceConnectionResponse> createServiceConnection(CreateServiceConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateServiceConnection").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/createServiceConnection").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceCredential  CreateServiceCredentialRequest
     * @return CreateServiceCredentialResponse
     */
    @Override
    public CompletableFuture<CreateServiceCredentialResponse> createServiceCredential(CreateServiceCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateServiceCredential").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/serviceCredentials").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSprint  CreateSprintRequest
     * @return CreateSprintResponse
     */
    @Override
    public CompletableFuture<CreateSprintResponse> createSprint(CreateSprintRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSprint").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/sprints/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSprintResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSprintResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSshKey  CreateSshKeyRequest
     * @return CreateSshKeyResponse
     */
    @Override
    public CompletableFuture<CreateSshKeyResponse> createSshKey(CreateSshKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSshKey").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/sshKey").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSshKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSshKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTag  CreateTagRequest
     * @return CreateTagResponse
     */
    @Override
    public CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTag").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/tags/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTestCase  CreateTestCaseRequest
     * @return CreateTestCaseResponse
     */
    @Override
    public CompletableFuture<CreateTestCaseResponse> createTestCase(CreateTestCaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTestCase").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/testhub/testcase").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTestCaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTestCaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUserKey  CreateUserKeyRequest
     * @return CreateUserKeyResponse
     */
    @Override
    public CompletableFuture<CreateUserKeyResponse> createUserKey(CreateUserKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateUserKey").setMethod(HttpMethod.POST).setPathRegex("/api/v3/user/keys/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVariableGroup  CreateVariableGroupRequest
     * @return CreateVariableGroupResponse
     */
    @Override
    public CompletableFuture<CreateVariableGroupResponse> createVariableGroup(CreateVariableGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateVariableGroup").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/variableGroups").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVariableGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVariableGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorkitem  CreateWorkitemRequest
     * @return CreateWorkitemResponse
     */
    @Override
    public CompletableFuture<CreateWorkitemResponse> createWorkitem(CreateWorkitemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkitem").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/workitems/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkitemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkitemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorkitemComment  CreateWorkitemCommentRequest
     * @return CreateWorkitemCommentResponse
     */
    @Override
    public CompletableFuture<CreateWorkitemCommentResponse> createWorkitemComment(CreateWorkitemCommentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkitemComment").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/workitems/comment").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkitemCommentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkitemCommentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorkitemEstimate  CreateWorkitemEstimateRequest
     * @return CreateWorkitemEstimateResponse
     */
    @Override
    public CompletableFuture<CreateWorkitemEstimateResponse> createWorkitemEstimate(CreateWorkitemEstimateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkitemEstimate").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/workitems/estimate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkitemEstimateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkitemEstimateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorkitemRecord  CreateWorkitemRecordRequest
     * @return CreateWorkitemRecordResponse
     */
    @Override
    public CompletableFuture<CreateWorkitemRecordResponse> createWorkitemRecord(CreateWorkitemRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkitemRecord").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/workitems/record").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkitemRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkitemRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorkitemV2  CreateWorkitemV2Request
     * @return CreateWorkitemV2Response
     */
    @Override
    public CompletableFuture<CreateWorkitemV2Response> createWorkitemV2(CreateWorkitemV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkitemV2").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/workitem").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkitemV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkitemV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAppMember  DeleteAppMemberRequest
     * @return DeleteAppMemberResponse
     */
    @Override
    public CompletableFuture<DeleteAppMemberResponse> deleteAppMember(DeleteAppMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAppMember").setMethod(HttpMethod.DELETE).setPathRegex("/appstack/apps/{appName}/members").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAppMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAppMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBranch  DeleteBranchRequest
     * @return DeleteBranchResponse
     */
    @Override
    public CompletableFuture<DeleteBranchResponse> deleteBranch(DeleteBranchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteBranch").setMethod(HttpMethod.DELETE).setPathRegex("/repository/{repositoryId}/branches/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBranchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBranchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    @Override
    public CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFile").setMethod(HttpMethod.DELETE).setPathRegex("/repository/{repositoryId}/files/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFlowTag  DeleteFlowTagRequest
     * @return DeleteFlowTagResponse
     */
    @Override
    public CompletableFuture<DeleteFlowTagResponse> deleteFlowTag(DeleteFlowTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFlowTag").setMethod(HttpMethod.DELETE).setPathRegex("/organization/{organizationId}/flow/tags/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFlowTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFlowTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFlowTagGroup  DeleteFlowTagGroupRequest
     * @return DeleteFlowTagGroupResponse
     */
    @Override
    public CompletableFuture<DeleteFlowTagGroupResponse> deleteFlowTagGroup(DeleteFlowTagGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFlowTagGroup").setMethod(HttpMethod.DELETE).setPathRegex("/organization/{organizationId}/flow/tagGroups/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFlowTagGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFlowTagGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteGroupMember  DeleteGroupMemberRequest
     * @return DeleteGroupMemberResponse
     */
    @Override
    public CompletableFuture<DeleteGroupMemberResponse> deleteGroupMember(DeleteGroupMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteGroupMember").setMethod(HttpMethod.DELETE).setPathRegex("/repository/groups/{groupId}/members/remove/aliyun_pk").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGroupMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGroupMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHostGroup  DeleteHostGroupRequest
     * @return DeleteHostGroupResponse
     */
    @Override
    public CompletableFuture<DeleteHostGroupResponse> deleteHostGroup(DeleteHostGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteHostGroup").setMethod(HttpMethod.DELETE).setPathRegex("/organization/{organizationId}/hostGroups/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHostGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHostGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePipeline  DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    @Override
    public CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePipeline").setMethod(HttpMethod.DELETE).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePipelineGroup  DeletePipelineGroupRequest
     * @return DeletePipelineGroupResponse
     */
    @Override
    public CompletableFuture<DeletePipelineGroupResponse> deletePipelineGroup(DeletePipelineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePipelineGroup").setMethod(HttpMethod.DELETE).setPathRegex("/organization/{organizationId}/pipelineGroups/{groupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePipelineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePipelineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePipelineRelations  DeletePipelineRelationsRequest
     * @return DeletePipelineRelationsResponse
     */
    @Override
    public CompletableFuture<DeletePipelineRelationsResponse> deletePipelineRelations(DeletePipelineRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePipelineRelations").setMethod(HttpMethod.DELETE).setPathRegex("/organization/{organizationId}/{pipelineId}/pipelineRelations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePipelineRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePipelineRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    @Override
    public CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProject").setMethod(HttpMethod.DELETE).setPathRegex("/organization/{organizationId}/projects/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteProjectLabel  DeleteProjectLabelRequest
     * @return DeleteProjectLabelResponse
     */
    @Override
    public CompletableFuture<DeleteProjectLabelResponse> deleteProjectLabel(DeleteProjectLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProjectLabel").setMethod(HttpMethod.DELETE).setPathRegex("/api/v4/projects/labels/{labelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteProtectedBranch  DeleteProtectedBranchRequest
     * @return DeleteProtectedBranchResponse
     */
    @Override
    public CompletableFuture<DeleteProtectedBranchResponse> deleteProtectedBranch(DeleteProtectedBranchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProtectedBranch").setMethod(HttpMethod.DELETE).setPathRegex("/repository/{repositoryId}/protect_branches/{protectedBranchId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProtectedBranchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProtectedBranchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePushRule  DeletePushRuleRequest
     * @return DeletePushRuleResponse
     */
    @Override
    public CompletableFuture<DeletePushRuleResponse> deletePushRule(DeletePushRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePushRule").setMethod(HttpMethod.DELETE).setPathRegex("/api/v4/projects/{repositoryId}/push_rule/{pushRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePushRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePushRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRepository  DeleteRepositoryRequest
     * @return DeleteRepositoryResponse
     */
    @Override
    public CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRepository").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/remove").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRepositoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRepositoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRepositoryGroup  DeleteRepositoryGroupRequest
     * @return DeleteRepositoryGroupResponse
     */
    @Override
    public CompletableFuture<DeleteRepositoryGroupResponse> deleteRepositoryGroup(DeleteRepositoryGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRepositoryGroup").setMethod(HttpMethod.POST).setPathRegex("/repository/groups/{groupId}/remove").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRepositoryGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRepositoryGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRepositoryMember  DeleteRepositoryMemberRequest
     * @return DeleteRepositoryMemberResponse
     */
    @Override
    public CompletableFuture<DeleteRepositoryMemberResponse> deleteRepositoryMember(DeleteRepositoryMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRepositoryMember").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/members/delete/{aliyunPk}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRepositoryMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRepositoryMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRepositoryWebhook  DeleteRepositoryWebhookRequest
     * @return DeleteRepositoryWebhookResponse
     */
    @Override
    public CompletableFuture<DeleteRepositoryWebhookResponse> deleteRepositoryWebhook(DeleteRepositoryWebhookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRepositoryWebhook").setMethod(HttpMethod.DELETE).setPathRegex("/repository/{repositoryId}/hooks/{hookId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRepositoryWebhookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRepositoryWebhookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteResourceMember  DeleteResourceMemberRequest
     * @return DeleteResourceMemberResponse
     */
    @Override
    public CompletableFuture<DeleteResourceMemberResponse> deleteResourceMember(DeleteResourceMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteResourceMember").setMethod(HttpMethod.DELETE).setPathRegex("/organization/{organizationId}/{resourceType}/{resourceId}/members/{accountId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTag  DeleteTagRequest
     * @return DeleteTagResponse
     */
    @Override
    public CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTag").setMethod(HttpMethod.DELETE).setPathRegex("/repository/{repositoryId}/tags/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUserKey  DeleteUserKeyRequest
     * @return DeleteUserKeyResponse
     */
    @Override
    public CompletableFuture<DeleteUserKeyResponse> deleteUserKey(DeleteUserKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteUserKey").setMethod(HttpMethod.DELETE).setPathRegex("/api/v3/user/keys/{keyId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVariableGroup  DeleteVariableGroupRequest
     * @return DeleteVariableGroupResponse
     */
    @Override
    public CompletableFuture<DeleteVariableGroupResponse> deleteVariableGroup(DeleteVariableGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteVariableGroup").setMethod(HttpMethod.DELETE).setPathRegex("/organization/{organizationId}/variableGroups/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVariableGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVariableGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWorkitem  DeleteWorkitemRequest
     * @return DeleteWorkitemResponse
     */
    @Override
    public CompletableFuture<DeleteWorkitemResponse> deleteWorkitem(DeleteWorkitemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWorkitem").setMethod(HttpMethod.DELETE).setPathRegex("/organization/{organizationId}/workitem/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkitemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkitemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWorkitemAllComment  DeleteWorkitemAllCommentRequest
     * @return DeleteWorkitemAllCommentResponse
     */
    @Override
    public CompletableFuture<DeleteWorkitemAllCommentResponse> deleteWorkitemAllComment(DeleteWorkitemAllCommentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWorkitemAllComment").setMethod(HttpMethod.DELETE).setPathRegex("/organization/{organizationId}/workitems/deleteAllComment").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkitemAllCommentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkitemAllCommentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWorkitemComment  DeleteWorkitemCommentRequest
     * @return DeleteWorkitemCommentResponse
     */
    @Override
    public CompletableFuture<DeleteWorkitemCommentResponse> deleteWorkitemComment(DeleteWorkitemCommentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWorkitemComment").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/workitems/deleteComent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkitemCommentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkitemCommentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableDeployKey  EnableDeployKeyRequest
     * @return EnableDeployKeyResponse
     */
    @Override
    public CompletableFuture<EnableDeployKeyResponse> enableDeployKey(EnableDeployKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableDeployKey").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/keys/{keyId}/enable").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableDeployKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableDeployKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteChangeRequestReleaseStage  ExecuteChangeRequestReleaseStageRequest
     * @return ExecuteChangeRequestReleaseStageResponse
     */
    @Override
    public CompletableFuture<ExecuteChangeRequestReleaseStageResponse> executeChangeRequestReleaseStage(ExecuteChangeRequestReleaseStageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteChangeRequestReleaseStage").setMethod(HttpMethod.POST).setPathRegex("/appstack/apps/{appName}/releaseWorkflows/{releaseWorkflowSn}/releaseStages/{releaseStageSn}:execute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteChangeRequestReleaseStageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteChangeRequestReleaseStageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportInsightCustomValue  ExportInsightCustomValueRequest
     * @return ExportInsightCustomValueResponse
     */
    @Override
    public CompletableFuture<ExportInsightCustomValueResponse> exportInsightCustomValue(ExportInsightCustomValueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportInsightCustomValue").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/customValues").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportInsightCustomValueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportInsightCustomValueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportInsightExpectedWorkTime  ExportInsightExpectedWorkTimeRequest
     * @return ExportInsightExpectedWorkTimeResponse
     */
    @Override
    public CompletableFuture<ExportInsightExpectedWorkTimeResponse> exportInsightExpectedWorkTime(ExportInsightExpectedWorkTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportInsightExpectedWorkTime").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/expectedWorkTimes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportInsightExpectedWorkTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportInsightExpectedWorkTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportInsightField  ExportInsightFieldRequest
     * @return ExportInsightFieldResponse
     */
    @Override
    public CompletableFuture<ExportInsightFieldResponse> exportInsightField(ExportInsightFieldRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportInsightField").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/fields").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportInsightFieldResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportInsightFieldResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportInsightSpace  ExportInsightSpaceRequest
     * @return ExportInsightSpaceResponse
     */
    @Override
    public CompletableFuture<ExportInsightSpaceResponse> exportInsightSpace(ExportInsightSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportInsightSpace").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/spaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportInsightSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportInsightSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportInsightSpaceRef  ExportInsightSpaceRefRequest
     * @return ExportInsightSpaceRefResponse
     */
    @Override
    public CompletableFuture<ExportInsightSpaceRefResponse> exportInsightSpaceRef(ExportInsightSpaceRefRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportInsightSpaceRef").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/spaceRefs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportInsightSpaceRefResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportInsightSpaceRefResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportInsightSprint  ExportInsightSprintRequest
     * @return ExportInsightSprintResponse
     */
    @Override
    public CompletableFuture<ExportInsightSprintResponse> exportInsightSprint(ExportInsightSprintRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportInsightSprint").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/sprints").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportInsightSprintResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportInsightSprintResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportInsightTagRef  ExportInsightTagRefRequest
     * @return ExportInsightTagRefResponse
     */
    @Override
    public CompletableFuture<ExportInsightTagRefResponse> exportInsightTagRef(ExportInsightTagRefRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportInsightTagRef").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/tagRefs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportInsightTagRefResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportInsightTagRefResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportInsightWorkTime  ExportInsightWorkTimeRequest
     * @return ExportInsightWorkTimeResponse
     */
    @Override
    public CompletableFuture<ExportInsightWorkTimeResponse> exportInsightWorkTime(ExportInsightWorkTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportInsightWorkTime").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/workTimes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportInsightWorkTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportInsightWorkTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportInsightWorkitemStatus  ExportInsightWorkitemStatusRequest
     * @return ExportInsightWorkitemStatusResponse
     */
    @Override
    public CompletableFuture<ExportInsightWorkitemStatusResponse> exportInsightWorkitemStatus(ExportInsightWorkitemStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportInsightWorkitemStatus").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/workitemStatuses").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportInsightWorkitemStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportInsightWorkitemStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportInsightWorkitemStatusJoinWorkitemDefectExtra  ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest
     * @return ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse
     */
    @Override
    public CompletableFuture<ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse> exportInsightWorkitemStatusJoinWorkitemDefectExtra(ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportInsightWorkitemStatusJoinWorkitemDefectExtra").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/workitemStatusJoinWorkitemDefectExtras").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportInsightWorkitemVersion  ExportInsightWorkitemVersionRequest
     * @return ExportInsightWorkitemVersionResponse
     */
    @Override
    public CompletableFuture<ExportInsightWorkitemVersionResponse> exportInsightWorkitemVersion(ExportInsightWorkitemVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportInsightWorkitemVersion").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/workitemVersions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportInsightWorkitemVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportInsightWorkitemVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportWorkitemActivity  ExportWorkitemActivityRequest
     * @return ExportWorkitemActivityResponse
     */
    @Override
    public CompletableFuture<ExportWorkitemActivityResponse> exportWorkitemActivity(ExportWorkitemActivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportWorkitemActivity").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/data/workitemActivities").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportWorkitemActivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportWorkitemActivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    @Override
    public CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetApplication").setMethod(HttpMethod.GET).setPathRegex("/appstack/apps/{appName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBranchInfo  GetBranchInfoRequest
     * @return GetBranchInfoResponse
     */
    @Override
    public CompletableFuture<GetBranchInfoResponse> getBranchInfo(GetBranchInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetBranchInfo").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/branches/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBranchInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBranchInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCheckRun  GetCheckRunRequest
     * @return GetCheckRunResponse
     */
    @Override
    public CompletableFuture<GetCheckRunResponse> getCheckRun(GetCheckRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCheckRun").setMethod(HttpMethod.GET).setPathRegex("/api/v4/projects/check_runs/get_check_run").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCheckRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCheckRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCodeupOrganization  GetCodeupOrganizationRequest
     * @return GetCodeupOrganizationResponse
     */
    @Override
    public CompletableFuture<GetCodeupOrganizationResponse> getCodeupOrganization(GetCodeupOrganizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCodeupOrganization").setMethod(HttpMethod.GET).setPathRegex("/api/organization/{identity}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCodeupOrganizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCodeupOrganizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCompareDetail  GetCompareDetailRequest
     * @return GetCompareDetailResponse
     */
    @Override
    public CompletableFuture<GetCompareDetailResponse> getCompareDetail(GetCompareDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCompareDetail").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/commits/compare/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCompareDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCompareDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomFieldOption  GetCustomFieldOptionRequest
     * @return GetCustomFieldOptionResponse
     */
    @Override
    public CompletableFuture<GetCustomFieldOptionResponse> getCustomFieldOption(GetCustomFieldOptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCustomFieldOption").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/fields/{fieldId}/getCustomOption").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomFieldOptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomFieldOptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileBlobs  GetFileBlobsRequest
     * @return GetFileBlobsResponse
     */
    @Override
    public CompletableFuture<GetFileBlobsResponse> getFileBlobs(GetFileBlobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFileBlobs").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/files/blobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileBlobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileBlobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileLastCommit  GetFileLastCommitRequest
     * @return GetFileLastCommitResponse
     */
    @Override
    public CompletableFuture<GetFileLastCommitResponse> getFileLastCommit(GetFileLastCommitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFileLastCommit").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/files/lastCommit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileLastCommitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileLastCommitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFlowTagGroup  GetFlowTagGroupRequest
     * @return GetFlowTagGroupResponse
     */
    @Override
    public CompletableFuture<GetFlowTagGroupResponse> getFlowTagGroup(GetFlowTagGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFlowTagGroup").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/flow/tagGroups/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFlowTagGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFlowTagGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetGroupByPath  GetGroupByPathRequest
     * @return GetGroupByPathResponse
     */
    @Override
    public CompletableFuture<GetGroupByPathResponse> getGroupByPath(GetGroupByPathRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGroupByPath").setMethod(HttpMethod.GET).setPathRegex("/api/4/groups/find_by_path").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGroupByPathResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGroupByPathResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetGroupDetail  GetGroupDetailRequest
     * @return GetGroupDetailResponse
     */
    @Override
    public CompletableFuture<GetGroupDetailResponse> getGroupDetail(GetGroupDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGroupDetail").setMethod(HttpMethod.GET).setPathRegex("/repository/groups/get_detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGroupDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGroupDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHostGroup  GetHostGroupRequest
     * @return GetHostGroupResponse
     */
    @Override
    public CompletableFuture<GetHostGroupResponse> getHostGroup(GetHostGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHostGroup").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/hostGroups/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHostGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHostGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMergeRequest  GetMergeRequestRequest
     * @return GetMergeRequestResponse
     */
    @Override
    public CompletableFuture<GetMergeRequestResponse> getMergeRequest(GetMergeRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMergeRequest").setMethod(HttpMethod.GET).setPathRegex("/api/v4/projects/{repositoryId}/merge_requests/{localId}/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMergeRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMergeRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMergeRequestChangeTree  GetMergeRequestChangeTreeRequest
     * @return GetMergeRequestChangeTreeResponse
     */
    @Override
    public CompletableFuture<GetMergeRequestChangeTreeResponse> getMergeRequestChangeTree(GetMergeRequestChangeTreeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMergeRequestChangeTree").setMethod(HttpMethod.GET).setPathRegex("/api/v4/projects/merge_requests/diffs/change_tree").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMergeRequestChangeTreeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMergeRequestChangeTreeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOrganizationMember  GetOrganizationMemberRequest
     * @return GetOrganizationMemberResponse
     */
    @Override
    public CompletableFuture<GetOrganizationMemberResponse> getOrganizationMember(GetOrganizationMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOrganizationMember").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/members/{accountId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrganizationMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrganizationMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPipeline  GetPipelineRequest
     * @return GetPipelineResponse
     */
    @Override
    public CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPipeline").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPipelineArtifactUrl  GetPipelineArtifactUrlRequest
     * @return GetPipelineArtifactUrlResponse
     */
    @Override
    public CompletableFuture<GetPipelineArtifactUrlResponse> getPipelineArtifactUrl(GetPipelineArtifactUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPipelineArtifactUrl").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/pipeline/getArtifactDownloadUrl").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPipelineArtifactUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPipelineArtifactUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPipelineEmasArtifactUrl  GetPipelineEmasArtifactUrlRequest
     * @return GetPipelineEmasArtifactUrlResponse
     */
    @Override
    public CompletableFuture<GetPipelineEmasArtifactUrlResponse> getPipelineEmasArtifactUrl(GetPipelineEmasArtifactUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPipelineEmasArtifactUrl").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/pipeline/{pipelineId}/pipelineRun/{pipelineRunId}/emas/artifact/{emasJobInstanceId}/{md5}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPipelineEmasArtifactUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPipelineEmasArtifactUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPipelineGroup  GetPipelineGroupRequest
     * @return GetPipelineGroupResponse
     */
    @Override
    public CompletableFuture<GetPipelineGroupResponse> getPipelineGroup(GetPipelineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPipelineGroup").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/pipelineGroups/{groupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPipelineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPipelineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPipelineRun  GetPipelineRunRequest
     * @return GetPipelineRunResponse
     */
    @Override
    public CompletableFuture<GetPipelineRunResponse> getPipelineRun(GetPipelineRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPipelineRun").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPipelineRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPipelineRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPipelineScanReportUrl  GetPipelineScanReportUrlRequest
     * @return GetPipelineScanReportUrlResponse
     */
    @Override
    public CompletableFuture<GetPipelineScanReportUrlResponse> getPipelineScanReportUrl(GetPipelineScanReportUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPipelineScanReportUrl").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/pipeline/getPipelineScanReportUrl").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPipelineScanReportUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPipelineScanReportUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProjectInfo  GetProjectInfoRequest
     * @return GetProjectInfoResponse
     */
    @Override
    public CompletableFuture<GetProjectInfoResponse> getProjectInfo(GetProjectInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProjectInfo").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/project/{projectId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProjectMember  GetProjectMemberRequest
     * @return GetProjectMemberResponse
     */
    @Override
    public CompletableFuture<GetProjectMemberResponse> getProjectMember(GetProjectMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProjectMember").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/members/get/{aliyunPk}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetReleaseStagePipelineRun  GetReleaseStagePipelineRunRequest
     * @return GetReleaseStagePipelineRunResponse
     */
    @Override
    public CompletableFuture<GetReleaseStagePipelineRunResponse> getReleaseStagePipelineRun(GetReleaseStagePipelineRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetReleaseStagePipelineRun").setMethod(HttpMethod.GET).setPathRegex("/appstack/apps/{appName}/releaseWorkflows/{releaseWorkflowSn}/releaseStages/{releaseStageSn}/executions/{executionNumber}:getPipelineRun").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetReleaseStagePipelineRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetReleaseStagePipelineRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRepository  GetRepositoryRequest
     * @return GetRepositoryResponse
     */
    @Override
    public CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRepository").setMethod(HttpMethod.GET).setPathRegex("/repository/get").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRepositoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRepositoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRepositoryCommit  GetRepositoryCommitRequest
     * @return GetRepositoryCommitResponse
     */
    @Override
    public CompletableFuture<GetRepositoryCommitResponse> getRepositoryCommit(GetRepositoryCommitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRepositoryCommit").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/commits/{sha}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRepositoryCommitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRepositoryCommitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRepositoryTag  GetRepositoryTagRequest
     * @return GetRepositoryTagResponse
     */
    @Override
    public CompletableFuture<GetRepositoryTagResponse> getRepositoryTag(GetRepositoryTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRepositoryTag").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/tag/info").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRepositoryTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRepositoryTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSearchCodePreview  GetSearchCodePreviewRequest
     * @return GetSearchCodePreviewResponse
     */
    @Override
    public CompletableFuture<GetSearchCodePreviewResponse> getSearchCodePreview(GetSearchCodePreviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSearchCodePreview").setMethod(HttpMethod.GET).setPathRegex("/search/code_preview").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSearchCodePreviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSearchCodePreviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSprintInfo  GetSprintInfoRequest
     * @return GetSprintInfoResponse
     */
    @Override
    public CompletableFuture<GetSprintInfoResponse> getSprintInfo(GetSprintInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSprintInfo").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/sprints/{sprintId}/getSprintinfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSprintInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSprintInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTestResultList  GetTestResultListRequest
     * @return GetTestResultListResponse
     */
    @Override
    public CompletableFuture<GetTestResultListResponse> getTestResultList(GetTestResultListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTestResultList").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/testhub/testplan/{testPlanIdentifier}/testresults").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTestResultListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTestResultListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTestcaseList  GetTestcaseListRequest
     * @return GetTestcaseListResponse
     */
    @Override
    public CompletableFuture<GetTestcaseListResponse> getTestcaseList(GetTestcaseListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTestcaseList").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/testhub/testcases").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTestcaseListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTestcaseListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserInfo  GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    @Override
    public CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserInfo").setMethod(HttpMethod.GET).setPathRegex("/users/current").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVMDeployOrder  GetVMDeployOrderRequest
     * @return GetVMDeployOrderResponse
     */
    @Override
    public CompletableFuture<GetVMDeployOrderResponse> getVMDeployOrder(GetVMDeployOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetVMDeployOrder").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/deploy/{deployOrderId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVMDeployOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVMDeployOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVariableGroup  GetVariableGroupRequest
     * @return GetVariableGroupResponse
     */
    @Override
    public CompletableFuture<GetVariableGroupResponse> getVariableGroup(GetVariableGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetVariableGroup").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/variableGroups/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVariableGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVariableGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkItemActivity  GetWorkItemActivityRequest
     * @return GetWorkItemActivityResponse
     */
    @Override
    public CompletableFuture<GetWorkItemActivityResponse> getWorkItemActivity(GetWorkItemActivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkItemActivity").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitems/{workitemId}/getActivity").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkItemActivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkItemActivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkItemInfo  GetWorkItemInfoRequest
     * @return GetWorkItemInfoResponse
     */
    @Override
    public CompletableFuture<GetWorkItemInfoResponse> getWorkItemInfo(GetWorkItemInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkItemInfo").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitems/{workitemId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkItemInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkItemInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkItemWorkFlowInfo  GetWorkItemWorkFlowInfoRequest
     * @return GetWorkItemWorkFlowInfoResponse
     */
    @Override
    public CompletableFuture<GetWorkItemWorkFlowInfoResponse> getWorkItemWorkFlowInfo(GetWorkItemWorkFlowInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkItemWorkFlowInfo").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitems/{workitemId}/getWorkflowInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkItemWorkFlowInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkItemWorkFlowInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkitemAttachmentCreatemeta  GetWorkitemAttachmentCreatemetaRequest
     * @return GetWorkitemAttachmentCreatemetaResponse
     */
    @Override
    public CompletableFuture<GetWorkitemAttachmentCreatemetaResponse> getWorkitemAttachmentCreatemeta(GetWorkitemAttachmentCreatemetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkitemAttachmentCreatemeta").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitem/{workitemIdentifier}/attachment/createmeta").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkitemAttachmentCreatemetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkitemAttachmentCreatemetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkitemCommentList  GetWorkitemCommentListRequest
     * @return GetWorkitemCommentListResponse
     */
    @Override
    public CompletableFuture<GetWorkitemCommentListResponse> getWorkitemCommentList(GetWorkitemCommentListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkitemCommentList").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitems/{workitemId}/commentList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkitemCommentListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkitemCommentListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkitemFile  GetWorkitemFileRequest
     * @return GetWorkitemFileResponse
     */
    @Override
    public CompletableFuture<GetWorkitemFileResponse> getWorkitemFile(GetWorkitemFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkitemFile").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitem/{workitemIdentifier}/files/{fileIdentifier}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkitemFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkitemFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkitemRelations  GetWorkitemRelationsRequest
     * @return GetWorkitemRelationsResponse
     */
    @Override
    public CompletableFuture<GetWorkitemRelationsResponse> getWorkitemRelations(GetWorkitemRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkitemRelations").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitems/{workitemId}/getRelations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkitemRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkitemRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkitemTimeTypeList  GetWorkitemTimeTypeListRequest
     * @return GetWorkitemTimeTypeListResponse
     */
    @Override
    public CompletableFuture<GetWorkitemTimeTypeListResponse> getWorkitemTimeTypeList(GetWorkitemTimeTypeListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkitemTimeTypeList").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitems/type/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkitemTimeTypeListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkitemTimeTypeListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of JoinPipelineGroup  JoinPipelineGroupRequest
     * @return JoinPipelineGroupResponse
     */
    @Override
    public CompletableFuture<JoinPipelineGroupResponse> joinPipelineGroup(JoinPipelineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("JoinPipelineGroup").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/pipelineGroups/join").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JoinPipelineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JoinPipelineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LinkMergeRequestLabel  LinkMergeRequestLabelRequest
     * @return LinkMergeRequestLabelResponse
     */
    @Override
    public CompletableFuture<LinkMergeRequestLabelResponse> linkMergeRequestLabel(LinkMergeRequestLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("LinkMergeRequestLabel").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/merge_requests/link_labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LinkMergeRequestLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LinkMergeRequestLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAllReleaseWorkflows  ListAllReleaseWorkflowsRequest
     * @return ListAllReleaseWorkflowsResponse
     */
    @Override
    public CompletableFuture<ListAllReleaseWorkflowsResponse> listAllReleaseWorkflows(ListAllReleaseWorkflowsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAllReleaseWorkflows").setMethod(HttpMethod.GET).setPathRegex("/appstack/apps/{appName}/releaseWorkflows").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAllReleaseWorkflowsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAllReleaseWorkflowsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAppReleaseStageExecutionIntegratedMetadata  ListAppReleaseStageExecutionIntegratedMetadataRequest
     * @return ListAppReleaseStageExecutionIntegratedMetadataResponse
     */
    @Override
    public CompletableFuture<ListAppReleaseStageExecutionIntegratedMetadataResponse> listAppReleaseStageExecutionIntegratedMetadata(ListAppReleaseStageExecutionIntegratedMetadataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAppReleaseStageExecutionIntegratedMetadata").setMethod(HttpMethod.GET).setPathRegex("/appstack/apps/{appName}/releaseWorkflows/{releaseWorkflowSn}/releaseStages/{releaseStageSn}/executions/{executionNumber}/integratedMetadata").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppReleaseStageExecutionIntegratedMetadataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppReleaseStageExecutionIntegratedMetadataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAppReleaseStageExecutions  ListAppReleaseStageExecutionsRequest
     * @return ListAppReleaseStageExecutionsResponse
     */
    @Override
    public CompletableFuture<ListAppReleaseStageExecutionsResponse> listAppReleaseStageExecutions(ListAppReleaseStageExecutionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAppReleaseStageExecutions").setMethod(HttpMethod.GET).setPathRegex("/appstack/apps/{appName}/releaseWorkflows/{releaseWorkflowSn}/releaseStages/{releaseStageSn}/executions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppReleaseStageExecutionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppReleaseStageExecutionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApplicationMembers  ListApplicationMembersRequest
     * @return ListApplicationMembersResponse
     */
    @Override
    public CompletableFuture<ListApplicationMembersResponse> listApplicationMembers(ListApplicationMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApplicationMembers").setMethod(HttpMethod.GET).setPathRegex("/appstack/apps/{appName}/members").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    @Override
    public CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApplications").setMethod(HttpMethod.GET).setPathRegex("/appstack/apps:search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListChangeRequestWorkflowExecutions  ListChangeRequestWorkflowExecutionsRequest
     * @return ListChangeRequestWorkflowExecutionsResponse
     */
    @Override
    public CompletableFuture<ListChangeRequestWorkflowExecutionsResponse> listChangeRequestWorkflowExecutions(ListChangeRequestWorkflowExecutionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListChangeRequestWorkflowExecutions").setMethod(HttpMethod.GET).setPathRegex("/appstack/apps/{appName}/changeRequests/{sn}/executions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChangeRequestWorkflowExecutionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChangeRequestWorkflowExecutionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListChangeRequests  ListChangeRequestsRequest
     * @return ListChangeRequestsResponse
     */
    @Override
    public CompletableFuture<ListChangeRequestsResponse> listChangeRequests(ListChangeRequestsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListChangeRequests").setMethod(HttpMethod.GET).setPathRegex("/appstack/apps/{appName}/changeRequests").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChangeRequestsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChangeRequestsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCheckRuns  ListCheckRunsRequest
     * @return ListCheckRunsResponse
     */
    @Override
    public CompletableFuture<ListCheckRunsResponse> listCheckRuns(ListCheckRunsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCheckRuns").setMethod(HttpMethod.GET).setPathRegex("/api/v4/projects/check_runs/list_check_runs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCheckRunsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCheckRunsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCommitStatuses  ListCommitStatusesRequest
     * @return ListCommitStatusesResponse
     */
    @Override
    public CompletableFuture<ListCommitStatusesResponse> listCommitStatuses(ListCommitStatusesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCommitStatuses").setMethod(HttpMethod.GET).setPathRegex("/api/v4/projects/repository/commit_statuses/list_commit_statuses").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCommitStatusesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCommitStatusesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFlowTagGroups  ListFlowTagGroupsRequest
     * @return ListFlowTagGroupsResponse
     */
    @Override
    public CompletableFuture<ListFlowTagGroupsResponse> listFlowTagGroups(ListFlowTagGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFlowTagGroups").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/flow/tagGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlowTagGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlowTagGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGroupMember  ListGroupMemberRequest
     * @return ListGroupMemberResponse
     */
    @Override
    public CompletableFuture<ListGroupMemberResponse> listGroupMember(ListGroupMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListGroupMember").setMethod(HttpMethod.GET).setPathRegex("/repository/groups/{groupId}/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGroupMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGroupMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGroupRepositories  ListGroupRepositoriesRequest
     * @return ListGroupRepositoriesResponse
     */
    @Override
    public CompletableFuture<ListGroupRepositoriesResponse> listGroupRepositories(ListGroupRepositoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListGroupRepositories").setMethod(HttpMethod.GET).setPathRegex("/repository/groups/{groupId}/projects").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGroupRepositoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGroupRepositoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHostGroups  ListHostGroupsRequest
     * @return ListHostGroupsResponse
     */
    @Override
    public CompletableFuture<ListHostGroupsResponse> listHostGroups(ListHostGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHostGroups").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/hostGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHostGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHostGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListJoinedOrganizations  ListJoinedOrganizationsRequest
     * @return ListJoinedOrganizationsResponse
     */
    @Override
    public CompletableFuture<ListJoinedOrganizationsResponse> listJoinedOrganizations(ListJoinedOrganizationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListJoinedOrganizations").setMethod(HttpMethod.GET).setPathRegex("/users/joinedOrgs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJoinedOrganizationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJoinedOrganizationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMergeRequestComments  ListMergeRequestCommentsRequest
     * @return ListMergeRequestCommentsResponse
     */
    @Override
    public CompletableFuture<ListMergeRequestCommentsResponse> listMergeRequestComments(ListMergeRequestCommentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMergeRequestComments").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/merge_requests/comments/list_comments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMergeRequestCommentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMergeRequestCommentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMergeRequestFilesReads  ListMergeRequestFilesReadsRequest
     * @return ListMergeRequestFilesReadsResponse
     */
    @Override
    public CompletableFuture<ListMergeRequestFilesReadsResponse> listMergeRequestFilesReads(ListMergeRequestFilesReadsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMergeRequestFilesReads").setMethod(HttpMethod.GET).setPathRegex("/api/v4/projects/merge_requests/diffs/files_read_infos").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMergeRequestFilesReadsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMergeRequestFilesReadsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMergeRequestLabels  ListMergeRequestLabelsRequest
     * @return ListMergeRequestLabelsResponse
     */
    @Override
    public CompletableFuture<ListMergeRequestLabelsResponse> listMergeRequestLabels(ListMergeRequestLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMergeRequestLabels").setMethod(HttpMethod.GET).setPathRegex("/api/v4/projects/merge_requests/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMergeRequestLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMergeRequestLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMergeRequestPatchSets  ListMergeRequestPatchSetsRequest
     * @return ListMergeRequestPatchSetsResponse
     */
    @Override
    public CompletableFuture<ListMergeRequestPatchSetsResponse> listMergeRequestPatchSets(ListMergeRequestPatchSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMergeRequestPatchSets").setMethod(HttpMethod.GET).setPathRegex("/api/v4/projects/merge_requests/diffs/list_patchsets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMergeRequestPatchSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMergeRequestPatchSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMergeRequests  ListMergeRequestsRequest
     * @return ListMergeRequestsResponse
     */
    @Override
    public CompletableFuture<ListMergeRequestsResponse> listMergeRequests(ListMergeRequestsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMergeRequests").setMethod(HttpMethod.GET).setPathRegex("/api/v4/projects/merge_requests/advanced_search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMergeRequestsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMergeRequestsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOrganizationMembers  ListOrganizationMembersRequest
     * @return ListOrganizationMembersResponse
     */
    @Override
    public CompletableFuture<ListOrganizationMembersResponse> listOrganizationMembers(ListOrganizationMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOrganizationMembers").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/members").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOrganizationMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOrganizationMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOrganizations  ListOrganizationsRequest
     * @return ListOrganizationsResponse
     */
    @Override
    public CompletableFuture<ListOrganizationsResponse> listOrganizations(ListOrganizationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOrganizations").setMethod(HttpMethod.GET).setPathRegex("/organizations/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOrganizationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOrganizationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipelineGroupPipelines  ListPipelineGroupPipelinesRequest
     * @return ListPipelineGroupPipelinesResponse
     */
    @Override
    public CompletableFuture<ListPipelineGroupPipelinesResponse> listPipelineGroupPipelines(ListPipelineGroupPipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPipelineGroupPipelines").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/pipelineGroups/{groupId}/pipelines").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelineGroupPipelinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelineGroupPipelinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipelineGroups  ListPipelineGroupsRequest
     * @return ListPipelineGroupsResponse
     */
    @Override
    public CompletableFuture<ListPipelineGroupsResponse> listPipelineGroups(ListPipelineGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPipelineGroups").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/pipelineGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelineGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelineGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipelineJobHistorys  ListPipelineJobHistorysRequest
     * @return ListPipelineJobHistorysResponse
     */
    @Override
    public CompletableFuture<ListPipelineJobHistorysResponse> listPipelineJobHistorys(ListPipelineJobHistorysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPipelineJobHistorys").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/pipeline/{pipelineId}/job/historys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelineJobHistorysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelineJobHistorysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipelineJobs  ListPipelineJobsRequest
     * @return ListPipelineJobsResponse
     */
    @Override
    public CompletableFuture<ListPipelineJobsResponse> listPipelineJobs(ListPipelineJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPipelineJobs").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/pipeline/{pipelineId}/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelineJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelineJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipelineRelations  ListPipelineRelationsRequest
     * @return ListPipelineRelationsResponse
     */
    @Override
    public CompletableFuture<ListPipelineRelationsResponse> listPipelineRelations(ListPipelineRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPipelineRelations").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/{pipelineId}/pipelineRelations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelineRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelineRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipelineRuns  ListPipelineRunsRequest
     * @return ListPipelineRunsResponse
     */
    @Override
    public CompletableFuture<ListPipelineRunsResponse> listPipelineRuns(ListPipelineRunsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPipelineRuns").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/pipelineRuns").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelineRunsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelineRunsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipelines  ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    @Override
    public CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPipelines").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/pipelines").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProjectLabels  ListProjectLabelsRequest
     * @return ListProjectLabelsResponse
     */
    @Override
    public CompletableFuture<ListProjectLabelsResponse> listProjectLabels(ListProjectLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProjectLabels").setMethod(HttpMethod.GET).setPathRegex("/api/v4/projects/labels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProjectMembers  ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    @Override
    public CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProjectMembers").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/projects/{projectId}/listMembers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProjectTemplates  ListProjectTemplatesRequest
     * @return ListProjectTemplatesResponse
     */
    @Override
    public CompletableFuture<ListProjectTemplatesResponse> listProjectTemplates(ListProjectTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProjectTemplates").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/projects/listTemplates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProjectWorkitemTypes  ListProjectWorkitemTypesRequest
     * @return ListProjectWorkitemTypesResponse
     */
    @Override
    public CompletableFuture<ListProjectWorkitemTypesResponse> listProjectWorkitemTypes(ListProjectWorkitemTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProjectWorkitemTypes").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/projects/{projectId}/getWorkitemType").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectWorkitemTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectWorkitemTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    @Override
    public CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProjects").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/listProjects").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProtectedBranches  ListProtectedBranchesRequest
     * @return ListProtectedBranchesResponse
     */
    @Override
    public CompletableFuture<ListProtectedBranchesResponse> listProtectedBranches(ListProtectedBranchesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProtectedBranches").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/protect_branches").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProtectedBranchesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProtectedBranchesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPushRules  ListPushRulesRequest
     * @return ListPushRulesResponse
     */
    @Override
    public CompletableFuture<ListPushRulesResponse> listPushRules(ListPushRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPushRules").setMethod(HttpMethod.GET).setPathRegex("/api/v4/projects/{repositoryId}/push_rule/push_rules/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPushRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPushRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRepositories  ListRepositoriesRequest
     * @return ListRepositoriesResponse
     */
    @Override
    public CompletableFuture<ListRepositoriesResponse> listRepositories(ListRepositoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRepositories").setMethod(HttpMethod.GET).setPathRegex("/repository/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRepositoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRepositoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRepositoryBranches  ListRepositoryBranchesRequest
     * @return ListRepositoryBranchesResponse
     */
    @Override
    public CompletableFuture<ListRepositoryBranchesResponse> listRepositoryBranches(ListRepositoryBranchesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRepositoryBranches").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/branches").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRepositoryBranchesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRepositoryBranchesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRepositoryCommitDiff  ListRepositoryCommitDiffRequest
     * @return ListRepositoryCommitDiffResponse
     */
    @Override
    public CompletableFuture<ListRepositoryCommitDiffResponse> listRepositoryCommitDiff(ListRepositoryCommitDiffRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRepositoryCommitDiff").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/commits/{sha}/diff").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRepositoryCommitDiffResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRepositoryCommitDiffResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRepositoryCommits  ListRepositoryCommitsRequest
     * @return ListRepositoryCommitsResponse
     */
    @Override
    public CompletableFuture<ListRepositoryCommitsResponse> listRepositoryCommits(ListRepositoryCommitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRepositoryCommits").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/commits").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRepositoryCommitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRepositoryCommitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRepositoryGroups  ListRepositoryGroupsRequest
     * @return ListRepositoryGroupsResponse
     */
    @Override
    public CompletableFuture<ListRepositoryGroupsResponse> listRepositoryGroups(ListRepositoryGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRepositoryGroups").setMethod(HttpMethod.GET).setPathRegex("/repository/groups/get/all").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRepositoryGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRepositoryGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRepositoryMemberWithInherited  ListRepositoryMemberWithInheritedRequest
     * @return ListRepositoryMemberWithInheritedResponse
     */
    @Override
    public CompletableFuture<ListRepositoryMemberWithInheritedResponse> listRepositoryMemberWithInherited(ListRepositoryMemberWithInheritedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRepositoryMemberWithInherited").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/members/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRepositoryMemberWithInheritedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRepositoryMemberWithInheritedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRepositoryTags  ListRepositoryTagsRequest
     * @return ListRepositoryTagsResponse
     */
    @Override
    public CompletableFuture<ListRepositoryTagsResponse> listRepositoryTags(ListRepositoryTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRepositoryTags").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/tag/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRepositoryTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRepositoryTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRepositoryTree  ListRepositoryTreeRequest
     * @return ListRepositoryTreeResponse
     */
    @Override
    public CompletableFuture<ListRepositoryTreeResponse> listRepositoryTree(ListRepositoryTreeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRepositoryTree").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/files/tree").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRepositoryTreeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRepositoryTreeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRepositoryWebhook  ListRepositoryWebhookRequest
     * @return ListRepositoryWebhookResponse
     */
    @Override
    public CompletableFuture<ListRepositoryWebhookResponse> listRepositoryWebhook(ListRepositoryWebhookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRepositoryWebhook").setMethod(HttpMethod.GET).setPathRegex("/repository/{repositoryId}/webhooks/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRepositoryWebhookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRepositoryWebhookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResourceMembers  ListResourceMembersRequest
     * @return ListResourceMembersResponse
     */
    @Override
    public CompletableFuture<ListResourceMembersResponse> listResourceMembers(ListResourceMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResourceMembers").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/{resourceType}/{resourceId}/members").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSearchCommit  ListSearchCommitRequest
     * @return ListSearchCommitResponse
     */
    @Override
    public CompletableFuture<ListSearchCommitResponse> listSearchCommit(ListSearchCommitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSearchCommit").setMethod(HttpMethod.POST).setPathRegex("/search/commit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSearchCommitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSearchCommitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSearchRepository  ListSearchRepositoryRequest
     * @return ListSearchRepositoryResponse
     */
    @Override
    public CompletableFuture<ListSearchRepositoryResponse> listSearchRepository(ListSearchRepositoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSearchRepository").setMethod(HttpMethod.POST).setPathRegex("/search/repo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSearchRepositoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSearchRepositoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSearchSourceCode  ListSearchSourceCodeRequest
     * @return ListSearchSourceCodeResponse
     */
    @Override
    public CompletableFuture<ListSearchSourceCodeResponse> listSearchSourceCode(ListSearchSourceCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSearchSourceCode").setMethod(HttpMethod.POST).setPathRegex("/search/code").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSearchSourceCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSearchSourceCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceAuths  ListServiceAuthsRequest
     * @return ListServiceAuthsResponse
     */
    @Override
    public CompletableFuture<ListServiceAuthsResponse> listServiceAuths(ListServiceAuthsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListServiceAuths").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/serviceAuths").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceAuthsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceAuthsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceConnections  ListServiceConnectionsRequest
     * @return ListServiceConnectionsResponse
     */
    @Override
    public CompletableFuture<ListServiceConnectionsResponse> listServiceConnections(ListServiceConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListServiceConnections").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/serviceConnections").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceCredentials  ListServiceCredentialsRequest
     * @return ListServiceCredentialsResponse
     */
    @Override
    public CompletableFuture<ListServiceCredentialsResponse> listServiceCredentials(ListServiceCredentialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListServiceCredentials").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/serviceCredentials").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceCredentialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceCredentialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSprints  ListSprintsRequest
     * @return ListSprintsResponse
     */
    @Override
    public CompletableFuture<ListSprintsResponse> listSprints(ListSprintsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSprints").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/sprints/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSprintsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSprintsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTestCaseFields  ListTestCaseFieldsRequest
     * @return ListTestCaseFieldsResponse
     */
    @Override
    public CompletableFuture<ListTestCaseFieldsResponse> listTestCaseFields(ListTestCaseFieldsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTestCaseFields").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/testhub/testcase/fields").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTestCaseFieldsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTestCaseFieldsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserDrawRecordByPk  ListUserDrawRecordByPkRequest
     * @return ListUserDrawRecordByPkResponse
     */
    @Override
    public CompletableFuture<ListUserDrawRecordByPkResponse> listUserDrawRecordByPk(ListUserDrawRecordByPkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserDrawRecordByPk").setMethod(HttpMethod.GET).setPathRegex("/listUserDrawRecords").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserDrawRecordByPkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserDrawRecordByPkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserKeys  ListUserKeysRequest
     * @return ListUserKeysResponse
     */
    @Override
    public CompletableFuture<ListUserKeysResponse> listUserKeys(ListUserKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserKeys").setMethod(HttpMethod.GET).setPathRegex("/api/v3/user/keys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserResources  ListUserResourcesRequest
     * @return ListUserResourcesResponse
     */
    @Override
    public CompletableFuture<ListUserResourcesResponse> listUserResources(ListUserResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserResources").setMethod(HttpMethod.GET).setPathRegex("/api/v4/user/vision/user_resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVariableGroups  ListVariableGroupsRequest
     * @return ListVariableGroupsResponse
     */
    @Override
    public CompletableFuture<ListVariableGroupsResponse> listVariableGroups(ListVariableGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListVariableGroups").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/variableGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVariableGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVariableGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkItemAllFields  ListWorkItemAllFieldsRequest
     * @return ListWorkItemAllFieldsResponse
     */
    @Override
    public CompletableFuture<ListWorkItemAllFieldsResponse> listWorkItemAllFields(ListWorkItemAllFieldsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkItemAllFields").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitems/fields/listAll").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkItemAllFieldsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkItemAllFieldsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkItemWorkFlowStatus  ListWorkItemWorkFlowStatusRequest
     * @return ListWorkItemWorkFlowStatusResponse
     */
    @Override
    public CompletableFuture<ListWorkItemWorkFlowStatusResponse> listWorkItemWorkFlowStatus(ListWorkItemWorkFlowStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkItemWorkFlowStatus").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitems/workflow/listWorkflowStatus").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkItemWorkFlowStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkItemWorkFlowStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkitemAttachments  ListWorkitemAttachmentsRequest
     * @return ListWorkitemAttachmentsResponse
     */
    @Override
    public CompletableFuture<ListWorkitemAttachmentsResponse> listWorkitemAttachments(ListWorkitemAttachmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkitemAttachments").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitem/{workitemIdentifier}/attachments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkitemAttachmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkitemAttachmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkitemEstimate  ListWorkitemEstimateRequest
     * @return ListWorkitemEstimateResponse
     */
    @Override
    public CompletableFuture<ListWorkitemEstimateResponse> listWorkitemEstimate(ListWorkitemEstimateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkitemEstimate").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitems/{workitemId}/estimate/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkitemEstimateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkitemEstimateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkitemTime  ListWorkitemTimeRequest
     * @return ListWorkitemTimeResponse
     */
    @Override
    public CompletableFuture<ListWorkitemTimeResponse> listWorkitemTime(ListWorkitemTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkitemTime").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/workitems/{workitemId}/time/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkitemTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkitemTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkitems  ListWorkitemsRequest
     * @return ListWorkitemsResponse
     */
    @Override
    public CompletableFuture<ListWorkitemsResponse> listWorkitems(ListWorkitemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkitems").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/listWorkitems").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkitemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkitemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LogPipelineJobRun  LogPipelineJobRunRequest
     * @return LogPipelineJobRunResponse
     */
    @Override
    public CompletableFuture<LogPipelineJobRunResponse> logPipelineJobRun(LogPipelineJobRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("LogPipelineJobRun").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/pipeline/{pipelineId}/pipelineRun/{pipelineRunId}/job/{jobId}/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LogPipelineJobRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LogPipelineJobRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LogVMDeployMachine  LogVMDeployMachineRequest
     * @return LogVMDeployMachineResponse
     */
    @Override
    public CompletableFuture<LogVMDeployMachineResponse> logVMDeployMachine(LogVMDeployMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("LogVMDeployMachine").setMethod(HttpMethod.GET).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/deploy/{deployOrderId}/machine/{machineSn}/log").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LogVMDeployMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LogVMDeployMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MergeMergeRequest  MergeMergeRequestRequest
     * @return MergeMergeRequestResponse
     */
    @Override
    public CompletableFuture<MergeMergeRequestResponse> mergeMergeRequest(MergeMergeRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MergeMergeRequest").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/{repositoryId}/merge_requests/{localId}/merge").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MergeMergeRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MergeMergeRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PassPipelineValidate  PassPipelineValidateRequest
     * @return PassPipelineValidateResponse
     */
    @Override
    public CompletableFuture<PassPipelineValidateResponse> passPipelineValidate(PassPipelineValidateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PassPipelineValidate").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/jobs/{jobId}/pass").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PassPipelineValidateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PassPipelineValidateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PassReleaseStagePipelineValidate  PassReleaseStagePipelineValidateRequest
     * @return PassReleaseStagePipelineValidateResponse
     */
    @Override
    public CompletableFuture<PassReleaseStagePipelineValidateResponse> passReleaseStagePipelineValidate(PassReleaseStagePipelineValidateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PassReleaseStagePipelineValidate").setMethod(HttpMethod.POST).setPathRegex("/appstack/apps/{appName}/releaseWorkflows/{releaseWorkflowSn}/releaseStages/{releaseStageSn}/executions/{executionNumber}:passPipelineValidate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PassReleaseStagePipelineValidateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PassReleaseStagePipelineValidateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefusePipelineValidate  RefusePipelineValidateRequest
     * @return RefusePipelineValidateResponse
     */
    @Override
    public CompletableFuture<RefusePipelineValidateResponse> refusePipelineValidate(RefusePipelineValidateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RefusePipelineValidate").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/jobs/{jobId}/refuse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefusePipelineValidateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefusePipelineValidateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefuseReleaseStagePipelineValidate  RefuseReleaseStagePipelineValidateRequest
     * @return RefuseReleaseStagePipelineValidateResponse
     */
    @Override
    public CompletableFuture<RefuseReleaseStagePipelineValidateResponse> refuseReleaseStagePipelineValidate(RefuseReleaseStagePipelineValidateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RefuseReleaseStagePipelineValidate").setMethod(HttpMethod.POST).setPathRegex("/appstack/apps/{appName}/releaseWorkflows/{releaseWorkflowSn}/releaseStages/{releaseStageSn}/executions/{executionNumber}:refusePipelineValidate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefuseReleaseStagePipelineValidateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefuseReleaseStagePipelineValidateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReopenMergeRequest  ReopenMergeRequestRequest
     * @return ReopenMergeRequestResponse
     */
    @Override
    public CompletableFuture<ReopenMergeRequestResponse> reopenMergeRequest(ReopenMergeRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReopenMergeRequest").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/{repositoryId}/merge_requests/{localId}/reopen").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReopenMergeRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReopenMergeRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetSshKey  ResetSshKeyRequest
     * @return ResetSshKeyResponse
     */
    @Override
    public CompletableFuture<ResetSshKeyResponse> resetSshKey(ResetSshKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResetSshKey").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/sshKey").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetSshKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetSshKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResumeVMDeployOrder  ResumeVMDeployOrderRequest
     * @return ResumeVMDeployOrderResponse
     */
    @Override
    public CompletableFuture<ResumeVMDeployOrderResponse> resumeVMDeployOrder(ResumeVMDeployOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResumeVMDeployOrder").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/deploy/{deployOrderId}/resume").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeVMDeployOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeVMDeployOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetryPipelineJobRun  RetryPipelineJobRunRequest
     * @return RetryPipelineJobRunResponse
     */
    @Override
    public CompletableFuture<RetryPipelineJobRunResponse> retryPipelineJobRun(RetryPipelineJobRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RetryPipelineJobRun").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/jobs/{jobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryPipelineJobRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryPipelineJobRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetryVMDeployMachine  RetryVMDeployMachineRequest
     * @return RetryVMDeployMachineResponse
     */
    @Override
    public CompletableFuture<RetryVMDeployMachineResponse> retryVMDeployMachine(RetryVMDeployMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RetryVMDeployMachine").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/deploy/{deployOrderId}/machine/{machineSn}/retry").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryVMDeployMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryVMDeployMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReviewMergeRequest  ReviewMergeRequestRequest
     * @return ReviewMergeRequestResponse
     */
    @Override
    public CompletableFuture<ReviewMergeRequestResponse> reviewMergeRequest(ReviewMergeRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReviewMergeRequest").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/{repositoryId}/merge_requests/{localId}/submit_review_opinion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReviewMergeRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReviewMergeRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SkipPipelineJobRun  SkipPipelineJobRunRequest
     * @return SkipPipelineJobRunResponse
     */
    @Override
    public CompletableFuture<SkipPipelineJobRunResponse> skipPipelineJobRun(SkipPipelineJobRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SkipPipelineJobRun").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/jobs/{jobId}/skip").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SkipPipelineJobRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SkipPipelineJobRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SkipVMDeployMachine  SkipVMDeployMachineRequest
     * @return SkipVMDeployMachineResponse
     */
    @Override
    public CompletableFuture<SkipVMDeployMachineResponse> skipVMDeployMachine(SkipVMDeployMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SkipVMDeployMachine").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/deploy/{deployOrderId}/machine/{machineSn}/skip").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SkipVMDeployMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SkipVMDeployMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartPipelineRun  StartPipelineRunRequest
     * @return StartPipelineRunResponse
     */
    @Override
    public CompletableFuture<StartPipelineRunResponse> startPipelineRun(StartPipelineRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartPipelineRun").setMethod(HttpMethod.POST).setPathRegex("/organizations/{organizationId}/pipelines/{pipelineId}/run").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartPipelineRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartPipelineRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopPipelineJobRun  StopPipelineJobRunRequest
     * @return StopPipelineJobRunResponse
     */
    @Override
    public CompletableFuture<StopPipelineJobRunResponse> stopPipelineJobRun(StopPipelineJobRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopPipelineJobRun").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/jobs/{jobId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopPipelineJobRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopPipelineJobRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopPipelineRun  StopPipelineRunRequest
     * @return StopPipelineRunResponse
     */
    @Override
    public CompletableFuture<StopPipelineRunResponse> stopPipelineRun(StopPipelineRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopPipelineRun").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopPipelineRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopPipelineRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopVMDeployOrder  StopVMDeployOrderRequest
     * @return StopVMDeployOrderResponse
     */
    @Override
    public CompletableFuture<StopVMDeployOrderResponse> stopVMDeployOrder(StopVMDeployOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopVMDeployOrder").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/deploy/{deployOrderId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopVMDeployOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopVMDeployOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransferRepository  TransferRepositoryRequest
     * @return TransferRepositoryResponse
     */
    @Override
    public CompletableFuture<TransferRepositoryResponse> transferRepository(TransferRepositoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TransferRepository").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/repository/transfer").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferRepositoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferRepositoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TriggerRepositoryMirrorSync  TriggerRepositoryMirrorSyncRequest
     * @return TriggerRepositoryMirrorSyncResponse
     */
    @Override
    public CompletableFuture<TriggerRepositoryMirrorSyncResponse> triggerRepositoryMirrorSync(TriggerRepositoryMirrorSyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TriggerRepositoryMirrorSync").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/mirror").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerRepositoryMirrorSyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerRepositoryMirrorSyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAppMember  UpdateAppMemberRequest
     * @return UpdateAppMemberResponse
     */
    @Override
    public CompletableFuture<UpdateAppMemberResponse> updateAppMember(UpdateAppMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAppMember").setMethod(HttpMethod.PUT).setPathRegex("/appstack/apps/{appName}/members").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAppMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAppMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApplication  UpdateApplicationRequest
     * @return UpdateApplicationResponse
     */
    @Override
    public CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateApplication").setMethod(HttpMethod.PUT).setPathRegex("/appstack/apps/{appName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCheckRun  UpdateCheckRunRequest
     * @return UpdateCheckRunResponse
     */
    @Override
    public CompletableFuture<UpdateCheckRunResponse> updateCheckRun(UpdateCheckRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCheckRun").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/check_runs/update_check_run").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCheckRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCheckRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFile  UpdateFileRequest
     * @return UpdateFileResponse
     */
    @Override
    public CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFile").setMethod(HttpMethod.PUT).setPathRegex("/repository/{repositoryId}/files/update").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFlowTag  UpdateFlowTagRequest
     * @return UpdateFlowTagResponse
     */
    @Override
    public CompletableFuture<UpdateFlowTagResponse> updateFlowTag(UpdateFlowTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFlowTag").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/flow/tags/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFlowTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFlowTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFlowTagGroup  UpdateFlowTagGroupRequest
     * @return UpdateFlowTagGroupResponse
     */
    @Override
    public CompletableFuture<UpdateFlowTagGroupResponse> updateFlowTagGroup(UpdateFlowTagGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFlowTagGroup").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/flow/tagGroups/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFlowTagGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFlowTagGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateGroup  UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    @Override
    public CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateGroup").setMethod(HttpMethod.PUT).setPathRegex("/groups/modify").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateGroupMember  UpdateGroupMemberRequest
     * @return UpdateGroupMemberResponse
     */
    @Override
    public CompletableFuture<UpdateGroupMemberResponse> updateGroupMember(UpdateGroupMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateGroupMember").setMethod(HttpMethod.PUT).setPathRegex("/repository/groups/{groupId}/members/update/aliyun_pk").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGroupMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGroupMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHostGroup  UpdateHostGroupRequest
     * @return UpdateHostGroupResponse
     */
    @Override
    public CompletableFuture<UpdateHostGroupResponse> updateHostGroup(UpdateHostGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHostGroup").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/hostGroups/{id}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHostGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHostGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMergeRequest  UpdateMergeRequestRequest
     * @return UpdateMergeRequestResponse
     */
    @Override
    public CompletableFuture<UpdateMergeRequestResponse> updateMergeRequest(UpdateMergeRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMergeRequest").setMethod(HttpMethod.PUT).setPathRegex("/api/v4/projects/{repositoryId}/merge_requests/{localId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMergeRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMergeRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMergeRequestPersonnel  UpdateMergeRequestPersonnelRequest
     * @return UpdateMergeRequestPersonnelResponse
     */
    @Override
    public CompletableFuture<UpdateMergeRequestPersonnelResponse> updateMergeRequestPersonnel(UpdateMergeRequestPersonnelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMergeRequestPersonnel").setMethod(HttpMethod.POST).setPathRegex("/api/v4/projects/{repositoryId}/merge_requests/{localId}/person/{personType}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMergeRequestPersonnelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMergeRequestPersonnelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOrganizationMember  UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     */
    @Override
    public CompletableFuture<UpdateOrganizationMemberResponse> updateOrganizationMember(UpdateOrganizationMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateOrganizationMember").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/members/{accountId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOrganizationMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOrganizationMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    @Override
    public CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePipeline").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/pipelines/update").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePipelineBaseInfo  UpdatePipelineBaseInfoRequest
     * @return UpdatePipelineBaseInfoResponse
     */
    @Override
    public CompletableFuture<UpdatePipelineBaseInfoResponse> updatePipelineBaseInfo(UpdatePipelineBaseInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePipelineBaseInfo").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/pipelines/{pipelineId}/baseInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePipelineBaseInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePipelineBaseInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePipelineGroup  UpdatePipelineGroupRequest
     * @return UpdatePipelineGroupResponse
     */
    @Override
    public CompletableFuture<UpdatePipelineGroupResponse> updatePipelineGroup(UpdatePipelineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePipelineGroup").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/pipelineGroups/{groupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePipelineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePipelineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProjectField  UpdateProjectFieldRequest
     * @return UpdateProjectFieldResponse
     */
    @Override
    public CompletableFuture<UpdateProjectFieldResponse> updateProjectField(UpdateProjectFieldRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProjectField").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/project/{identifier}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectFieldResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectFieldResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProjectLabel  UpdateProjectLabelRequest
     * @return UpdateProjectLabelResponse
     */
    @Override
    public CompletableFuture<UpdateProjectLabelResponse> updateProjectLabel(UpdateProjectLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProjectLabel").setMethod(HttpMethod.PUT).setPathRegex("/api/v4/projects/labels/{labelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProjectMember  UpdateProjectMemberRequest
     * @return UpdateProjectMemberResponse
     */
    @Override
    public CompletableFuture<UpdateProjectMemberResponse> updateProjectMember(UpdateProjectMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProjectMember").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/projects/{projectId}/updateMember").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProtectedBranches  UpdateProtectedBranchesRequest
     * @return UpdateProtectedBranchesResponse
     */
    @Override
    public CompletableFuture<UpdateProtectedBranchesResponse> updateProtectedBranches(UpdateProtectedBranchesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProtectedBranches").setMethod(HttpMethod.PUT).setPathRegex("/{repositoryId}/protect_branches/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProtectedBranchesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProtectedBranchesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePushReviewOnOff  UpdatePushReviewOnOffRequest
     * @return UpdatePushReviewOnOffResponse
     */
    @Override
    public CompletableFuture<UpdatePushReviewOnOffResponse> updatePushReviewOnOff(UpdatePushReviewOnOffRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePushReviewOnOff").setMethod(HttpMethod.POST).setPathRegex("/repository/{repositoryId}/settings/trunk_mode").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePushReviewOnOffResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePushReviewOnOffResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePushRule  UpdatePushRuleRequest
     * @return UpdatePushRuleResponse
     */
    @Override
    public CompletableFuture<UpdatePushRuleResponse> updatePushRule(UpdatePushRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePushRule").setMethod(HttpMethod.PUT).setPathRegex("/api/v4/projects/{repositoryId}/push_rule/{pushRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePushRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePushRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRepository  UpdateRepositoryRequest
     * @return UpdateRepositoryResponse
     */
    @Override
    public CompletableFuture<UpdateRepositoryResponse> updateRepository(UpdateRepositoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRepository").setMethod(HttpMethod.PUT).setPathRegex("/repository/{repositoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRepositoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRepositoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRepositoryMember  UpdateRepositoryMemberRequest
     * @return UpdateRepositoryMemberResponse
     */
    @Override
    public CompletableFuture<UpdateRepositoryMemberResponse> updateRepositoryMember(UpdateRepositoryMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRepositoryMember").setMethod(HttpMethod.PUT).setPathRegex("/repository/{repositoryId}/members/{aliyunPk}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRepositoryMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRepositoryMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateResourceMember  UpdateResourceMemberRequest
     * @return UpdateResourceMemberResponse
     */
    @Override
    public CompletableFuture<UpdateResourceMemberResponse> updateResourceMember(UpdateResourceMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateResourceMember").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/{resourceType}/{resourceId}/members/{accountId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTestCase  UpdateTestCaseRequest
     * @return UpdateTestCaseResponse
     */
    @Override
    public CompletableFuture<UpdateTestCaseResponse> updateTestCase(UpdateTestCaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTestCase").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/testhub/testcase/{testcaseIdentifier}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTestCaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTestCaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTestResult  UpdateTestResultRequest
     * @return UpdateTestResultResponse
     */
    @Override
    public CompletableFuture<UpdateTestResultResponse> updateTestResult(UpdateTestResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTestResult").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/testhub/testplan/{testPlanIdentifier}/testresult/{testcaseIdentifier}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTestResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTestResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateVariableGroup  UpdateVariableGroupRequest
     * @return UpdateVariableGroupResponse
     */
    @Override
    public CompletableFuture<UpdateVariableGroupResponse> updateVariableGroup(UpdateVariableGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateVariableGroup").setMethod(HttpMethod.PUT).setPathRegex("/organization/{organizationId}/variableGroups/{id}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVariableGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVariableGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWorkItem  UpdateWorkItemRequest
     * @return UpdateWorkItemResponse
     */
    @Override
    public CompletableFuture<UpdateWorkItemResponse> updateWorkItem(UpdateWorkItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWorkItem").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/workitems/update").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWorkitemComment  UpdateWorkitemCommentRequest
     * @return UpdateWorkitemCommentResponse
     */
    @Override
    public CompletableFuture<UpdateWorkitemCommentResponse> updateWorkitemComment(UpdateWorkitemCommentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWorkitemComment").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/workitems/commentUpdate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkitemCommentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkitemCommentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWorkitemField  UpdateWorkitemFieldRequest
     * @return UpdateWorkitemFieldResponse
     */
    @Override
    public CompletableFuture<UpdateWorkitemFieldResponse> updateWorkitemField(UpdateWorkitemFieldRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWorkitemField").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/workitems/updateWorkitemField").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkitemFieldResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkitemFieldResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WorkitemAttachmentCreate  WorkitemAttachmentCreateRequest
     * @return WorkitemAttachmentCreateResponse
     */
    @Override
    public CompletableFuture<WorkitemAttachmentCreateResponse> workitemAttachmentCreate(WorkitemAttachmentCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("WorkitemAttachmentCreate").setMethod(HttpMethod.POST).setPathRegex("/organization/{organizationId}/workitem/{workitemIdentifier}/attachment").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WorkitemAttachmentCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WorkitemAttachmentCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
