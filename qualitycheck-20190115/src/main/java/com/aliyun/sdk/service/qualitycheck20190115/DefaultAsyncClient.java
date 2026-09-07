// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.qualitycheck20190115.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
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
        this.product = "Qualitycheck";
        this.version = "2019-01-15";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddBusinessCategory  AddBusinessCategoryRequest
     * @return AddBusinessCategoryResponse
     */
    @Override
    public CompletableFuture<AddBusinessCategoryResponse> addBusinessCategory(AddBusinessCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddBusinessCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddBusinessCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddBusinessCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddRuleCategory  AddRuleCategoryRequest
     * @return AddRuleCategoryResponse
     */
    @Override
    public CompletableFuture<AddRuleCategoryResponse> addRuleCategory(AddRuleCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddRuleCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddRuleCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddRuleCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddRuleV4  AddRuleV4Request
     * @return AddRuleV4Response
     */
    @Override
    public CompletableFuture<AddRuleV4Response> addRuleV4(AddRuleV4Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddRuleV4").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddRuleV4Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddRuleV4Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AnalyzeLabel  AnalyzeLabelRequest
     * @return AnalyzeLabelResponse
     */
    @Override
    public CompletableFuture<AnalyzeLabelResponse> analyzeLabel(AnalyzeLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AnalyzeLabel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AnalyzeLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AnalyzeLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyWsToken  ApplyWsTokenRequest
     * @return ApplyWsTokenResponse
     */
    @Override
    public CompletableFuture<ApplyWsTokenResponse> applyWsToken(ApplyWsTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyWsToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyWsTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyWsTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can manually assign files that have completed quality inspection to reviewers. Assignments can be made one file at a time or in batches:
     * Single-file assignment: Assign a specific file to a specified reviewer.
     * Batch assignment: Assign multiple filtered files to one or more reviewers. You can specify how many files each reviewer receives, or let the system distribute the files evenly among reviewers.</p>
     * 
     * @param request the request parameters of AssignReviewer  AssignReviewerRequest
     * @return AssignReviewerResponse
     */
    @Override
    public CompletableFuture<AssignReviewerResponse> assignReviewer(AssignReviewerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignReviewer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignReviewerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignReviewerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI AssignReviewerBySessionGroup is deprecated  * @param request  the request parameters of AssignReviewerBySessionGroup  AssignReviewerBySessionGroupRequest
     * @return AssignReviewerBySessionGroupResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<AssignReviewerBySessionGroupResponse> assignReviewerBySessionGroup(AssignReviewerBySessionGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignReviewerBySessionGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignReviewerBySessionGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignReviewerBySessionGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchSubmitReviewInfo  BatchSubmitReviewInfoRequest
     * @return BatchSubmitReviewInfoResponse
     */
    @Override
    public CompletableFuture<BatchSubmitReviewInfoResponse> batchSubmitReviewInfo(BatchSubmitReviewInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchSubmitReviewInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchSubmitReviewInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchSubmitReviewInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAgent  CreateAgentRequest
     * @return CreateAgentResponse
     */
    @Override
    public CompletableFuture<CreateAgentResponse> createAgent(CreateAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAgentTask  CreateAgentTaskRequest
     * @return CreateAgentTaskResponse
     */
    @Override
    public CompletableFuture<CreateAgentTaskResponse> createAgentTask(CreateAgentTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAgentTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Hotwords help improve recognition accuracy for specific terms, such as names, place names, or technical terms. <a href="https://help.aliyun.com/document_detail/213249.html">Learn more</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAsrVocab  CreateAsrVocabRequest
     * @return CreateAsrVocabResponse
     */
    @Override
    public CompletableFuture<CreateAsrVocabResponse> createAsrVocab(CreateAsrVocabRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAsrVocab").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAsrVocabResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAsrVocabResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCheckTypeToScheme  CreateCheckTypeToSchemeRequest
     * @return CreateCheckTypeToSchemeResponse
     */
    @Override
    public CompletableFuture<CreateCheckTypeToSchemeResponse> createCheckTypeToScheme(CreateCheckTypeToSchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCheckTypeToScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCheckTypeToSchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCheckTypeToSchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMiningTask  CreateMiningTaskRequest
     * @return CreateMiningTaskResponse
     */
    @Override
    public CompletableFuture<CreateMiningTaskResponse> createMiningTask(CreateMiningTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMiningTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMiningTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMiningTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQualityCheckScheme  CreateQualityCheckSchemeRequest
     * @return CreateQualityCheckSchemeResponse
     */
    @Override
    public CompletableFuture<CreateQualityCheckSchemeResponse> createQualityCheckScheme(CreateQualityCheckSchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQualityCheckScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQualityCheckSchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQualityCheckSchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSchemeTaskConfig  CreateSchemeTaskConfigRequest
     * @return CreateSchemeTaskConfigResponse
     */
    @Override
    public CompletableFuture<CreateSchemeTaskConfigResponse> createSchemeTaskConfig(CreateSchemeTaskConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSchemeTaskConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSchemeTaskConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSchemeTaskConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateSkillGroupConfig is deprecated  * @param request  the request parameters of CreateSkillGroupConfig  CreateSkillGroupConfigRequest
     * @return CreateSkillGroupConfigResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateSkillGroupConfigResponse> createSkillGroupConfig(CreateSkillGroupConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSkillGroupConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSkillGroupConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSkillGroupConfigResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTaskAssignRule  CreateTaskAssignRuleRequest
     * @return CreateTaskAssignRuleResponse
     */
    @Override
    public CompletableFuture<CreateTaskAssignRuleResponse> createTaskAssignRule(CreateTaskAssignRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTaskAssignRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTaskAssignRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTaskAssignRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Alibaba Cloud uses Resource Access Management (RAM) for unified account management. Before you create a user in Smart Conversation Analysis, first create the user in <a href="https://ram.console.aliyun.com">RAM</a>. Then, obtain the user’s UID, username, and display name. Finally, add the RAM user to Smart Conversation Analysis to grant them access to the Smart Conversation Analysis service.</p>
     * 
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    @Override
    public CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWarningConfig  CreateWarningConfigRequest
     * @return CreateWarningConfigResponse
     */
    @Override
    public CompletableFuture<CreateWarningConfigResponse> createWarningConfig(CreateWarningConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWarningConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWarningConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWarningConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWarningStrategyConfig  CreateWarningStrategyConfigRequest
     * @return CreateWarningStrategyConfigResponse
     */
    @Override
    public CompletableFuture<CreateWarningStrategyConfigResponse> createWarningStrategyConfig(CreateWarningStrategyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWarningStrategyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWarningStrategyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWarningStrategyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DelRuleCategory  DelRuleCategoryRequest
     * @return DelRuleCategoryResponse
     */
    @Override
    public CompletableFuture<DelRuleCategoryResponse> delRuleCategory(DelRuleCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DelRuleCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DelRuleCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DelRuleCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    @Override
    public CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAsrVocab  DeleteAsrVocabRequest
     * @return DeleteAsrVocabResponse
     */
    @Override
    public CompletableFuture<DeleteAsrVocabResponse> deleteAsrVocab(DeleteAsrVocabRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAsrVocab").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAsrVocabResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAsrVocabResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBusinessCategory  DeleteBusinessCategoryRequest
     * @return DeleteBusinessCategoryResponse
     */
    @Override
    public CompletableFuture<DeleteBusinessCategoryResponse> deleteBusinessCategory(DeleteBusinessCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBusinessCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBusinessCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBusinessCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCheckTypeToScheme  DeleteCheckTypeToSchemeRequest
     * @return DeleteCheckTypeToSchemeResponse
     */
    @Override
    public CompletableFuture<DeleteCheckTypeToSchemeResponse> deleteCheckTypeToScheme(DeleteCheckTypeToSchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCheckTypeToScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCheckTypeToSchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCheckTypeToSchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomizationConfig  DeleteCustomizationConfigRequest
     * @return DeleteCustomizationConfigResponse
     */
    @Override
    public CompletableFuture<DeleteCustomizationConfigResponse> deleteCustomizationConfig(DeleteCustomizationConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomizationConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomizationConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomizationConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteDataSet is deprecated  * @param request  the request parameters of DeleteDataSet  DeleteDataSetRequest
     * @return DeleteDataSetResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteDataSetResponse> deleteDataSet(DeleteDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteQualityCheckScheme  DeleteQualityCheckSchemeRequest
     * @return DeleteQualityCheckSchemeResponse
     */
    @Override
    public CompletableFuture<DeleteQualityCheckSchemeResponse> deleteQualityCheckScheme(DeleteQualityCheckSchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQualityCheckScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQualityCheckSchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQualityCheckSchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteRule is deprecated, please use Qualitycheck::2019-01-15::DeleteRuleV4 instead.  * @param request  the request parameters of DeleteRule  DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRuleV4  DeleteRuleV4Request
     * @return DeleteRuleV4Response
     */
    @Override
    public CompletableFuture<DeleteRuleV4Response> deleteRuleV4(DeleteRuleV4Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRuleV4").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRuleV4Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRuleV4Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSchemeTaskConfig  DeleteSchemeTaskConfigRequest
     * @return DeleteSchemeTaskConfigResponse
     */
    @Override
    public CompletableFuture<DeleteSchemeTaskConfigResponse> deleteSchemeTaskConfig(DeleteSchemeTaskConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSchemeTaskConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSchemeTaskConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSchemeTaskConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteSkillGroupConfig is deprecated  * @param request  the request parameters of DeleteSkillGroupConfig  DeleteSkillGroupConfigRequest
     * @return DeleteSkillGroupConfigResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteSkillGroupConfigResponse> deleteSkillGroupConfig(DeleteSkillGroupConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSkillGroupConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSkillGroupConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSkillGroupConfigResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTaskAssignRule  DeleteTaskAssignRuleRequest
     * @return DeleteTaskAssignRuleResponse
     */
    @Override
    public CompletableFuture<DeleteTaskAssignRuleResponse> deleteTaskAssignRule(DeleteTaskAssignRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTaskAssignRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTaskAssignRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTaskAssignRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWarningConfig  DeleteWarningConfigRequest
     * @return DeleteWarningConfigResponse
     */
    @Override
    public CompletableFuture<DeleteWarningConfigResponse> deleteWarningConfig(DeleteWarningConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWarningConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWarningConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWarningConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWarningStrategyConfig  DeleteWarningStrategyConfigRequest
     * @return DeleteWarningStrategyConfigResponse
     */
    @Override
    public CompletableFuture<DeleteWarningStrategyConfigResponse> deleteWarningStrategyConfig(DeleteWarningStrategyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWarningStrategyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWarningStrategyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWarningStrategyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteAgent  ExecuteAgentRequest
     * @return ExecuteAgentResponse
     */
    @Override
    public CompletableFuture<ExecuteAgentResponse> executeAgent(ExecuteAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ExecuteAgentResponseBody> executeAgentWithResponseIterable(ExecuteAgentRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ExecuteAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        ExecuteAgentResponseBodyIterator iterator = ExecuteAgentResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of GenerateLabel  GenerateLabelRequest
     * @return GenerateLabelResponse
     */
    @Override
    public CompletableFuture<GenerateLabelResponse> generateLabel(GenerateLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateLabel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    @Override
    public CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgentMJobInfo  GetAgentMJobInfoRequest
     * @return GetAgentMJobInfoResponse
     */
    @Override
    public CompletableFuture<GetAgentMJobInfoResponse> getAgentMJobInfo(GetAgentMJobInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentMJobInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentMJobInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentMJobInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries data uploaded through <a href="https://help.aliyun.com/document_detail/139399.html">UploadAudioData</a> or <a href="https://help.aliyun.com/document_detail/111394.html">UploadData</a>, or queries data from a dataset quality check task <a href="https://help.aliyun.com/document_detail/158890.html">SubmitQualityCheckTask</a>. You can query by task ID (taskId) or by time range.
     * By default, only partial parameters are returned in the response. Use the requiredFields request parameter to specify which fields to include in the response.</p>
     * 
     * @param request the request parameters of GetAgentTaskResult  GetAgentTaskResultRequest
     * @return GetAgentTaskResultResponse
     */
    @Override
    public CompletableFuture<GetAgentTaskResultResponse> getAgentTaskResult(GetAgentTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAsrVocab  GetAsrVocabRequest
     * @return GetAsrVocabResponse
     */
    @Override
    public CompletableFuture<GetAsrVocabResponse> getAsrVocab(GetAsrVocabRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAsrVocab").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAsrVocabResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAsrVocabResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBusinessCategoryList  GetBusinessCategoryListRequest
     * @return GetBusinessCategoryListResponse
     */
    @Override
    public CompletableFuture<GetBusinessCategoryListResponse> getBusinessCategoryList(GetBusinessCategoryListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBusinessCategoryList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBusinessCategoryListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBusinessCategoryListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomizationConfigList  GetCustomizationConfigListRequest
     * @return GetCustomizationConfigListResponse
     */
    @Override
    public CompletableFuture<GetCustomizationConfigListResponse> getCustomizationConfigList(GetCustomizationConfigListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomizationConfigList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomizationConfigListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomizationConfigListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLabelAnalysisResult  GetLabelAnalysisResultRequest
     * @return GetLabelAnalysisResultResponse
     */
    @Override
    public CompletableFuture<GetLabelAnalysisResultResponse> getLabelAnalysisResult(GetLabelAnalysisResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLabelAnalysisResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLabelAnalysisResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLabelAnalysisResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLabelGeneratedResult  GetLabelGeneratedResultRequest
     * @return GetLabelGeneratedResultResponse
     */
    @Override
    public CompletableFuture<GetLabelGeneratedResultResponse> getLabelGeneratedResult(GetLabelGeneratedResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLabelGeneratedResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLabelGeneratedResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLabelGeneratedResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMiningTaskResult  GetMiningTaskResultRequest
     * @return GetMiningTaskResultResponse
     */
    @Override
    public CompletableFuture<GetMiningTaskResultResponse> getMiningTaskResult(GetMiningTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMiningTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMiningTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMiningTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNextResultToVerify  GetNextResultToVerifyRequest
     * @return GetNextResultToVerifyResponse
     */
    @Override
    public CompletableFuture<GetNextResultToVerifyResponse> getNextResultToVerify(GetNextResultToVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNextResultToVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNextResultToVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNextResultToVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityCheckScheme  GetQualityCheckSchemeRequest
     * @return GetQualityCheckSchemeResponse
     */
    @Override
    public CompletableFuture<GetQualityCheckSchemeResponse> getQualityCheckScheme(GetQualityCheckSchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualityCheckScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityCheckSchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityCheckSchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query data uploaded using <a href="https://help.aliyun.com/document_detail/139399.html">UploadAudioData</a> or <a href="https://help.aliyun.com/document_detail/111394.html">UploadData</a>. You can also query data from dataset-based quality inspection tasks created with <a href="https://help.aliyun.com/document_detail/158890.html">SubmitQualityCheckTask</a>. You can search by task ID (taskId) or by time range.</p>
     * 
     * @param request the request parameters of GetResult  GetResultRequest
     * @return GetResultResponse
     */
    @Override
    public CompletableFuture<GetResultResponse> getResult(GetResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResultToReview  GetResultToReviewRequest
     * @return GetResultToReviewResponse
     */
    @Override
    public CompletableFuture<GetResultToReviewResponse> getResultToReview(GetResultToReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResultToReview").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResultToReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResultToReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetRule is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.  * @description > This operation returns basic rule information such as the **id** and **name**. You can use this information with [GetRuleDetails](https://help.aliyun.com/document_detail/142310.html).
     * 
     * @param request the request parameters of GetRule  GetRuleRequest
     * @return GetRuleResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetRuleById is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.  * @param request  the request parameters of GetRuleById  GetRuleByIdRequest
     * @return GetRuleByIdResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetRuleByIdResponse> getRuleById(GetRuleByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRuleById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRuleByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRuleByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRuleCategory  GetRuleCategoryRequest
     * @return GetRuleCategoryResponse
     */
    @Override
    public CompletableFuture<GetRuleCategoryResponse> getRuleCategory(GetRuleCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRuleCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRuleCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRuleCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetRuleDetail is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.  * @description > This operation is used in conjunction with [Get basic rule information](https://help.aliyun.com/document_detail/142333.html). First, call the GetRule operation to obtain the rule ID. Then, use the rule ID as a parameter to call the **GetRuleDetail** operation.
     * 
     * @param request the request parameters of GetRuleDetail  GetRuleDetailRequest
     * @return GetRuleDetailResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetRuleDetailResponse> getRuleDetail(GetRuleDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRuleDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRuleDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRuleDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRuleV4  GetRuleV4Request
     * @return GetRuleV4Response
     */
    @Override
    public CompletableFuture<GetRuleV4Response> getRuleV4(GetRuleV4Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRuleV4").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRuleV4Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRuleV4Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRulesCountList  GetRulesCountListRequest
     * @return GetRulesCountListResponse
     */
    @Override
    public CompletableFuture<GetRulesCountListResponse> getRulesCountList(GetRulesCountListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRulesCountList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRulesCountListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRulesCountListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSchemeTaskConfig  GetSchemeTaskConfigRequest
     * @return GetSchemeTaskConfigResponse
     */
    @Override
    public CompletableFuture<GetSchemeTaskConfigResponse> getSchemeTaskConfig(GetSchemeTaskConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSchemeTaskConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSchemeTaskConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSchemeTaskConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetSkillGroupConfig is deprecated  * @param request  the request parameters of GetSkillGroupConfig  GetSkillGroupConfigRequest
     * @return GetSkillGroupConfigResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetSkillGroupConfigResponse> getSkillGroupConfig(GetSkillGroupConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSkillGroupConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillGroupConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillGroupConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetSyncResult is deprecated, please use Qualitycheck::2019-01-15::GetResult instead.  * @param request  the request parameters of GetSyncResult  GetSyncResultRequest
     * @return GetSyncResultResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetSyncResultResponse> getSyncResult(GetSyncResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSyncResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSyncResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSyncResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTag  GetTagRequest
     * @return GetTagResponse
     */
    @Override
    public CompletableFuture<GetTagResponse> getTag(GetTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWarningStrategyConfig  GetWarningStrategyConfigRequest
     * @return GetWarningStrategyConfigResponse
     */
    @Override
    public CompletableFuture<GetWarningStrategyConfigResponse> getWarningStrategyConfig(GetWarningStrategyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWarningStrategyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWarningStrategyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWarningStrategyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only quality checkers or administrators can call this operation.</p>
     * 
     * @param request the request parameters of HandleComplaint  HandleComplaintRequest
     * @return HandleComplaintResponse
     */
    @Override
    public CompletableFuture<HandleComplaintResponse> handleComplaint(HandleComplaintRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HandleComplaint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HandleComplaintResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HandleComplaintResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI InvalidRule is deprecated, please use Qualitycheck::2019-01-15::DeleteRuleV4 instead.  * @param request  the request parameters of InvalidRule  InvalidRuleRequest
     * @return InvalidRuleResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<InvalidRuleResponse> invalidRule(InvalidRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InvalidRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvalidRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvalidRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentMJobInfo  ListAgentMJobInfoRequest
     * @return ListAgentMJobInfoResponse
     */
    @Override
    public CompletableFuture<ListAgentMJobInfoResponse> listAgentMJobInfo(ListAgentMJobInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentMJobInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentMJobInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentMJobInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAsrVocab  ListAsrVocabRequest
     * @return ListAsrVocabResponse
     */
    @Override
    public CompletableFuture<ListAsrVocabResponse> listAsrVocab(ListAsrVocabRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAsrVocab").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAsrVocabResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAsrVocabResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListDataSet is deprecated  * @param request  the request parameters of ListDataSet  ListDataSetRequest
     * @return ListDataSetResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListDataSetResponse> listDataSet(ListDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQualityCheckScheme  ListQualityCheckSchemeRequest
     * @return ListQualityCheckSchemeResponse
     */
    @Override
    public CompletableFuture<ListQualityCheckSchemeResponse> listQualityCheckScheme(ListQualityCheckSchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQualityCheckScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQualityCheckSchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQualityCheckSchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListRules is deprecated, please use Qualitycheck::2019-01-15::ListRulesV4 instead.  * @param request  the request parameters of ListRules  ListRulesRequest
     * @return ListRulesResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRulesV4  ListRulesV4Request
     * @return ListRulesV4Response
     */
    @Override
    public CompletableFuture<ListRulesV4Response> listRulesV4(ListRulesV4Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRulesV4").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRulesV4Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRulesV4Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSchemeTaskConfig  ListSchemeTaskConfigRequest
     * @return ListSchemeTaskConfigResponse
     */
    @Override
    public CompletableFuture<ListSchemeTaskConfigResponse> listSchemeTaskConfig(ListSchemeTaskConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSchemeTaskConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSchemeTaskConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSchemeTaskConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListSessionGroup is deprecated  * @param request  the request parameters of ListSessionGroup  ListSessionGroupRequest
     * @return ListSessionGroupResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListSessionGroupResponse> listSessionGroup(ListSessionGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSessionGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSessionGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSessionGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListSkillGroupConfig is deprecated  * @param request  the request parameters of ListSkillGroupConfig  ListSkillGroupConfigRequest
     * @return ListSkillGroupConfigResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListSkillGroupConfigResponse> listSkillGroupConfig(ListSkillGroupConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSkillGroupConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillGroupConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillGroupConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTag  ListTagRequest
     * @return ListTagResponse
     */
    @Override
    public CompletableFuture<ListTagResponse> listTag(ListTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTaskAssignRules  ListTaskAssignRulesRequest
     * @return ListTaskAssignRulesResponse
     */
    @Override
    public CompletableFuture<ListTaskAssignRulesResponse> listTaskAssignRules(ListTaskAssignRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTaskAssignRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTaskAssignRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTaskAssignRulesResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWarningConfig  ListWarningConfigRequest
     * @return ListWarningConfigResponse
     */
    @Override
    public CompletableFuture<ListWarningConfigResponse> listWarningConfig(ListWarningConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWarningConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWarningConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWarningConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWarningStrategyConfig  ListWarningStrategyConfigRequest
     * @return ListWarningStrategyConfigResponse
     */
    @Override
    public CompletableFuture<ListWarningStrategyConfigResponse> listWarningStrategyConfig(ListWarningStrategyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWarningStrategyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWarningStrategyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWarningStrategyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevertAssignedSession  RevertAssignedSessionRequest
     * @return RevertAssignedSessionResponse
     */
    @Override
    public CompletableFuture<RevertAssignedSessionResponse> revertAssignedSession(RevertAssignedSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevertAssignedSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevertAssignedSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevertAssignedSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI RevertAssignedSessionGroup is deprecated  * @param request  the request parameters of RevertAssignedSessionGroup  RevertAssignedSessionGroupRequest
     * @return RevertAssignedSessionGroupResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<RevertAssignedSessionGroupResponse> revertAssignedSessionGroup(RevertAssignedSessionGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevertAssignedSessionGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevertAssignedSessionGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevertAssignedSessionGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunCompletionMessage  RunCompletionMessageRequest
     * @return RunCompletionMessageResponse
     */
    @Override
    public CompletableFuture<RunCompletionMessageResponse> runCompletionMessage(RunCompletionMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunCompletionMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunCompletionMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunCompletionMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunCompletionMessageResponseBody> runCompletionMessageWithResponseIterable(RunCompletionMessageRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunCompletionMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunCompletionMessageResponseBodyIterator iterator = RunCompletionMessageResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @deprecated OpenAPI SaveConfigDataSet is deprecated  * @param request  the request parameters of SaveConfigDataSet  SaveConfigDataSetRequest
     * @return SaveConfigDataSetResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<SaveConfigDataSetResponse> saveConfigDataSet(SaveConfigDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveConfigDataSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveConfigDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveConfigDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitComplaint  SubmitComplaintRequest
     * @return SubmitComplaintResponse
     */
    @Override
    public CompletableFuture<SubmitComplaintResponse> submitComplaint(SubmitComplaintRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitComplaint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitComplaintResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitComplaintResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitQualityCheckTask  SubmitQualityCheckTaskRequest
     * @return SubmitQualityCheckTaskResponse
     */
    @Override
    public CompletableFuture<SubmitQualityCheckTaskResponse> submitQualityCheckTask(SubmitQualityCheckTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitQualityCheckTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitQualityCheckTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitQualityCheckTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can manually review files after quality inspection. After completing the review, call this API to save the review results. This involves manually reviewing rules identified by the system as hits to determine if they are true hits or false positives. Refer to the file review feature on the console page. For more information, see <a href="https://help.aliyun.com/document_detail/139653.html#h2-u6587u4EF6u590Du68385">File Review</a>.</p>
     * 
     * @param request the request parameters of SubmitReviewInfo  SubmitReviewInfoRequest
     * @return SubmitReviewInfoResponse
     */
    @Override
    public CompletableFuture<SubmitReviewInfoResponse> submitReviewInfo(SubmitReviewInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitReviewInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitReviewInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitReviewInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitReviewInfoV4  SubmitReviewInfoV4Request
     * @return SubmitReviewInfoV4Response
     */
    @Override
    public CompletableFuture<SubmitReviewInfoV4Response> submitReviewInfoV4(SubmitReviewInfoV4Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitReviewInfoV4").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitReviewInfoV4Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitReviewInfoV4Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Real-time hotline quality inspection transcribes spoken dialogue into text during a call. It sends the text to the Smart Conversation Analysis system for real-time quality inspection to detect potential issues or risks. You can display the dialogue text and inspection results in real time on the customer service representative\&quot;s workbench (a third-party system). This differs from offline quality inspection, which uses UploadAudioData for inspection or dataset inspection. For details, see the developer guide. Offline quality inspection occurs after the call ends and the recording file is generated.
     * <strong>Usage Flow</strong>
     * You can implement real-time transcription of audio streams to text during calls, or use Alibaba Cloud Call Center (CC) directly. CC integrates deeply with Smart Conversation Analysis, enabling real-time quality inspection during calls without API integration.
     * If you implement audio-to-text conversion yourself, invoke the SyncQualityCheck API for real-time quality inspection after a speaker finishes a sentence and generates dialogue text. This returns the inspection result for that sentence synchronously.
     * You should include skill group information when uploading data. Then, you can use the Call Center Quality Inspection - Configuration Management feature to configure different quality inspection rules for calls from different skill groups.
     * After the call ends, you can store the recording file on a storage server accessible over the public network. You can invoke the recording information maintenance API: UpdateSyncQualityCheckData. You can submit the recording name, recording file URL, and other details to the Smart Conversation Analysis service. This lets quality inspectors play back the recording during review.
     * After the call ends, you can view the quality inspection results in Call Center Quality Inspection - Result Display - Real-time Quality Inspection Results. You can also invoke the real-time quality inspection result query API: GetSyncResult to retrieve the results. You can use Score Dashboard - Real-time Dashboard to view data charts for customer service representatives, skill groups, and scoring items.
     * <strong>Full-Text Quality Inspection</strong>
     * Quality inspection rules include dozens of operators. Some operators require dialogue context (multi-turn conversations between customer service representatives and customers) for analysis. However, real-time quality inspection occurs during a call and typically uses text from only one sentence spoken by a single speaker. Some operators are not suitable for real-time quality inspection. Therefore, quality inspection rules are divided into real-time quality inspection rules and full-text quality inspection rules:
     * <strong>Real-time quality inspection rules</strong>: Rules used for real-time quality inspection. They support a limited number of operator types. They do not support specifying the detection range for operators.
     * <strong>Full-text quality inspection rules</strong>: Rules used for offline quality inspection. They support all operator types. They support custom detection ranges for operators.
     * For calls that underwent real-time quality inspection, you can apply full-text quality inspection rules to the complete dialogue text after the call ends. To enable full-text quality inspection after real-time inspection, see the full-text quality inspection description in Call Center Quality Inspection - Configuration Management.</p>
     * 
     * @param request the request parameters of SyncQualityCheck  SyncQualityCheckRequest
     * @return SyncQualityCheckResponse
     */
    @Override
    public CompletableFuture<SyncQualityCheckResponse> syncQualityCheck(SyncQualityCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncQualityCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncQualityCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncQualityCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TestRuleV4  TestRuleV4Request
     * @return TestRuleV4Response
     */
    @Override
    public CompletableFuture<TestRuleV4Response> testRuleV4(TestRuleV4Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestRuleV4").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestRuleV4Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestRuleV4Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAgent  UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    @Override
    public CompletableFuture<UpdateAgentResponse> updateAgent(UpdateAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAsrVocab  UpdateAsrVocabRequest
     * @return UpdateAsrVocabResponse
     */
    @Override
    public CompletableFuture<UpdateAsrVocabResponse> updateAsrVocab(UpdateAsrVocabRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAsrVocab").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAsrVocabResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAsrVocabResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCheckTypeToScheme  UpdateCheckTypeToSchemeRequest
     * @return UpdateCheckTypeToSchemeResponse
     */
    @Override
    public CompletableFuture<UpdateCheckTypeToSchemeResponse> updateCheckTypeToScheme(UpdateCheckTypeToSchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCheckTypeToScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCheckTypeToSchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCheckTypeToSchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateQualityCheckData  UpdateQualityCheckDataRequest
     * @return UpdateQualityCheckDataResponse
     */
    @Override
    public CompletableFuture<UpdateQualityCheckDataResponse> updateQualityCheckData(UpdateQualityCheckDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateQualityCheckData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateQualityCheckDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateQualityCheckDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateQualityCheckScheme  UpdateQualityCheckSchemeRequest
     * @return UpdateQualityCheckSchemeResponse
     */
    @Override
    public CompletableFuture<UpdateQualityCheckSchemeResponse> updateQualityCheckScheme(UpdateQualityCheckSchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateQualityCheckScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateQualityCheckSchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateQualityCheckSchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI UpdateRule is deprecated, please use Qualitycheck::2019-01-15::UpdateRuleV4 instead.  * @description > Update an existing rule. You can modify its conditions and operators as needed. The rule ID (rid) remains unchanged, but condition IDs and operator IDs may change.
     * 
     * @param request the request parameters of UpdateRule  UpdateRuleRequest
     * @return UpdateRuleResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI UpdateRuleById is deprecated, please use Qualitycheck::2019-01-15::UpdateRuleV4 instead.  * @param request  the request parameters of UpdateRuleById  UpdateRuleByIdRequest
     * @return UpdateRuleByIdResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<UpdateRuleByIdResponse> updateRuleById(UpdateRuleByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRuleById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRuleByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRuleByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRuleToScheme  UpdateRuleToSchemeRequest
     * @return UpdateRuleToSchemeResponse
     */
    @Override
    public CompletableFuture<UpdateRuleToSchemeResponse> updateRuleToScheme(UpdateRuleToSchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRuleToScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRuleToSchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRuleToSchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRuleV4  UpdateRuleV4Request
     * @return UpdateRuleV4Response
     */
    @Override
    public CompletableFuture<UpdateRuleV4Response> updateRuleV4(UpdateRuleV4Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRuleV4").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRuleV4Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRuleV4Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates quality inspection task information.</p>
     * 
     * @param request the request parameters of UpdateSchemeTaskConfig  UpdateSchemeTaskConfigRequest
     * @return UpdateSchemeTaskConfigResponse
     */
    @Override
    public CompletableFuture<UpdateSchemeTaskConfigResponse> updateSchemeTaskConfig(UpdateSchemeTaskConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSchemeTaskConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSchemeTaskConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSchemeTaskConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI UpdateSkillGroupConfig is deprecated  * @param request  the request parameters of UpdateSkillGroupConfig  UpdateSkillGroupConfigRequest
     * @return UpdateSkillGroupConfigResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<UpdateSkillGroupConfigResponse> updateSkillGroupConfig(UpdateSkillGroupConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSkillGroupConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSkillGroupConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSkillGroupConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSyncQualityCheckData  UpdateSyncQualityCheckDataRequest
     * @return UpdateSyncQualityCheckDataResponse
     */
    @Override
    public CompletableFuture<UpdateSyncQualityCheckDataResponse> updateSyncQualityCheckData(UpdateSyncQualityCheckDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSyncQualityCheckData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSyncQualityCheckDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSyncQualityCheckDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTag  UpdateTagRequest
     * @return UpdateTagResponse
     */
    @Override
    public CompletableFuture<UpdateTagResponse> updateTag(UpdateTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTaskAssignRule  UpdateTaskAssignRuleRequest
     * @return UpdateTaskAssignRuleResponse
     */
    @Override
    public CompletableFuture<UpdateTaskAssignRuleResponse> updateTaskAssignRule(UpdateTaskAssignRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTaskAssignRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTaskAssignRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTaskAssignRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you update users, you can modify only their roles. You cannot modify other account information because all Alibaba Cloud products use a unified account management system. Smart Conversation Analysis uses these accounts. To modify account information, go to <a href="https://ram.console.aliyun.com/">Resource Access Management (RAM)</a>.</p>
     * 
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    @Override
    public CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWarningConfig  UpdateWarningConfigRequest
     * @return UpdateWarningConfigResponse
     */
    @Override
    public CompletableFuture<UpdateWarningConfigResponse> updateWarningConfig(UpdateWarningConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWarningConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWarningConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWarningConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWarningStrategyConfig  UpdateWarningStrategyConfigRequest
     * @return UpdateWarningStrategyConfigResponse
     */
    @Override
    public CompletableFuture<UpdateWarningStrategyConfigResponse> updateWarningStrategyConfig(UpdateWarningStrategyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWarningStrategyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWarningStrategyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWarningStrategyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Process description</h3>
     * <p>Call the API to upload audio quality inspection =&gt; Convert the recording file to text =&gt; Separate roles in the text based on the specified channel splitting method (distinguish between agent and customer) =&gt; Analyze using quality inspection rules =&gt; Quality inspection complete.</p>
     * <h3>Task execution efficiency</h3>
     * <p>The speed of task execution depends on the speed of converting the recording file to text. Ideally, a 5-minute recording file can be transcribed within 2 minutes. However, when the transcription service has many queued tasks, there will be a queuing wait time. Generally, transcription completes within 6 hours, except for bulk uploads of large-scale data (more than 500 hours of recordings uploaded within 30 minutes). After transcription is complete, quality inspection analysis takes only milliseconds.</p>
     * <h3>Recording file URL requirements</h3>
     * <ul>
     * <li>Supports single-channel/dual-channel WAV and MP3 format recording files. The file size must be less than 512 MB.</li>
     * <li>The URL must be an HTTP-accessible URL address. Local file submission is not supported. The recording file access permissions must be set to public.</li>
     * <li>The URL can only use domain names, not IP addresses. The URL cannot contain spaces. Avoid using Chinese characters.</li>
     * <li>After converting the recording to text, the system deletes the downloaded recording file and does not retain a copy.</li>
     * <li>If your recording URL has an access expiration period (for example, the recording is stored in Alibaba Cloud OSS and you specified an expiration period when generating the recording URL through OSS), set the expiration period to at least 12 hours, or 24 hours if possible. This is because file transcription takes time and occasional queuing may occur. If the queuing time is long, the recording is downloaded only when transcription begins. This prevents the recording URL from expiring before the download.</li>
     * <li>After quality inspection analysis is complete, the recording is still played using the URL you provided when reviewing files in the console. Ensure that the URL remains active long-term. Otherwise, the recording cannot be played.</li>
     * </ul>
     * <h3>Role separation description</h3>
     * <p>After the recording is converted to text, the system automatically separates the text into two conversation roles. However, the system cannot determine which role is the agent and which is the customer. You need to perform role separation based on certain rules. The accuracy of role separation is critical because the rules used for quality inspection analysis often have role detection restrictions (a rule only checks the agent or the customer). If role separation is incorrect, the accuracy of quality inspection results is significantly affected.
     * Recording files are typically divided into two types: single-channel (mono) and dual-channel (stereo):</p>
     * <ul>
     * <li>Single-channel recording: The voices of both the agent and customer are stored on one channel. After the recording file is converted to text, the system uses a built-in algorithm to distinguish between two roles. By setting a list of keywords that the agent is likely to say, the system analyzes the transcribed text sentence by sentence from top to bottom. When a sentence matches a keyword, the role of that sentence is determined to be the agent, and the other role is the customer. For details, see recognizeRoleDataSetId and serviceChannelKeywords in the request parameters. Due to the unpredictability of conversation content (for example, cross-talk between two roles or both people speaking simultaneously), role separation for single-channel recordings cannot be guaranteed to be 100% accurate. Save recording files as dual-channel recordings whenever possible.</li>
     * <li>Dual-channel recording: The voices of the agent and customer are stored on two separate channels. Even if the conversation overlaps, the recording-to-text conversion can accurately distinguish between the two. Specify the agent and customer by using the serviceChannel and clientChannel request parameters.</li>
     * </ul>
     * <h3>Retrieve quality inspection analysis results</h3>
     * <p>Because recording file recognition is not real-time, you need to asynchronously retrieve quality inspection analysis results. The following three methods are available:</p>
     * <ul>
     * <li>Message notification: For details, see <a href="https://help.aliyun.com/document_detail/213237.html">MSMQ</a>. After receiving a message, invoke the GetResult operation to retrieve detailed results. (Recommended)</li>
     * <li>Callback: Specify a callbackUrl in the request parameters. The system initiates a callback after the task is complete. After receiving the callback, invoke the GetResult operation to retrieve detailed results.</li>
     * <li>Polling: The operation returns a task ID (taskId). Use the taskId to poll the <code>getResult</code> operation to asynchronously retrieve results. Check whether the <code>status</code> in the response parameters indicates completion. Do not set the polling interval too short. Analysis normally completes within a few minutes. Set the polling interval to 30 seconds or more. (Not recommended)</li>
     * </ul>
     * 
     * @param request the request parameters of UploadAudioData  UploadAudioDataRequest
     * @return UploadAudioDataResponse
     */
    @Override
    public CompletableFuture<UploadAudioDataResponse> uploadAudioData(UploadAudioDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadAudioData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadAudioDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadAudioDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI UploadData is deprecated, please use Qualitycheck::2019-01-15::UploadDataV4 instead.  * @description You can call UploadData.json to upload text-based quality inspection data. Text typically originates from online customer service interactions or tickets. The API returns a task ID. You can retrieve results in one of three ways:
     * - Message notification: For details, see [message queues](https://help.aliyun.com/document_detail/213237.html). After you receive a message, call the GetResult API to retrieve detailed results. (Recommended)
     * - Callback: Specify a callback URL in your request parameters. After the task completes, the system sends a callback to that URL. Then call the GetResult API to retrieve detailed results.
     * - Polling: Use the returned task ID to poll the GetResult API asynchronously. Check whether the status field in the response indicates completion. (Not recommended)
     * 
     * @param request the request parameters of UploadData  UploadDataRequest
     * @return UploadDataResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<UploadDataResponse> uploadData(UploadDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Pushes text data in a specific format to SCA for real-time quality inspection analysis based on user-specified rules, and synchronously returns the analysis results. Compared with uploaded text quality inspection, which typically uploads the complete conversation text after a conversation ends, real-time text quality inspection allows you to push text to SCA for analysis after one role finishes one or more sentences, providing higher real-time performance. Notes:</p>
     * <ul>
     * <li>If the pushed text is a single sentence from one role, some operators in the rules become ineffective due to the lack of conversation context, such as context repetition check, interruption check, and call silence check.</li>
     * <li>Real-time quality inspection synchronously returns analysis results. SCA does not save call records, so you cannot query quality inspection results through APIs.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadDataSync  UploadDataSyncRequest
     * @return UploadDataSyncResponse
     */
    @Override
    public CompletableFuture<UploadDataSyncResponse> uploadDataSync(UploadDataSyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadDataSync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadDataSyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadDataSyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Pushes text data in a specific format to Smart Conversation Analysis (SCA) for real-time quality inspection based on user-specified rules, and synchronously returns the analysis results. Compared with uploaded text quality inspection, which typically uploads the complete conversation text after a conversation ends, real-time text quality inspection allows you to push text to SCA for analysis after one or more sentences are spoken by a role, providing higher real-time performance. Special notes:
     * If the pushed text is a single sentence from one role, some operators in the rules may not work due to the lack of conversation context, such as context repetition check, interruption check, and call silence check.
     * Real-time quality inspection synchronously returns analysis results. SCA does not save call records, so you cannot query quality inspection results through APIs.</p>
     * 
     * @param request the request parameters of UploadDataSyncForLLM  UploadDataSyncForLLMRequest
     * @return UploadDataSyncForLLMResponse
     */
    @Override
    public CompletableFuture<UploadDataSyncForLLMResponse> uploadDataSyncForLLM(UploadDataSyncForLLMRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadDataSyncForLLM").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadDataSyncForLLMResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadDataSyncForLLMResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Calls UploadData.json to upload text quality inspection data. The text typically comes from online customer service or tickets. The operation returns a taskId. You can obtain results in three ways:</p>
     * <ul>
     * <li>Message notification: For details, see <a href="https://help.aliyun.com/document_detail/213237.html">Message channel</a>. After receiving a message, call the GetResult operation to obtain detailed results. (Recommended)</li>
     * <li>Callback: Specify a callbackUrl in the request parameters. The system initiates a callback after the task is completed. After receiving the callback, call the GetResult operation to obtain detailed results.</li>
     * <li>Polling: Use the task ID returned by this operation to poll the GetResult operation asynchronously. Check whether the status in the response indicates completion. (Not recommended)</li>
     * </ul>
     * 
     * @param request the request parameters of UploadDataV4  UploadDataV4Request
     * @return UploadDataV4Response
     */
    @Override
    public CompletableFuture<UploadDataV4Response> uploadDataV4(UploadDataV4Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadDataV4").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadDataV4Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadDataV4Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/213225.html">Rule configuration</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UploadRule  UploadRuleRequest
     * @return UploadRuleResponse
     */
    @Override
    public CompletableFuture<UploadRuleResponse> uploadRule(UploadRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
