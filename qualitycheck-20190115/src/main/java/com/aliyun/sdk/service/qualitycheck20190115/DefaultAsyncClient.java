// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.qualitycheck20190115.models.*;
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
        this.endpointRule = "";
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
     * @param request the request parameters of CreateSkillGroupConfig  CreateSkillGroupConfigRequest
     * @return CreateSkillGroupConfigResponse
     */
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
     * @param request the request parameters of DeletePrecisionTask  DeletePrecisionTaskRequest
     * @return DeletePrecisionTaskResponse
     */
    @Override
    public CompletableFuture<DeletePrecisionTaskResponse> deletePrecisionTask(DeletePrecisionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePrecisionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePrecisionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePrecisionTaskResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteSkillGroupConfig  DeleteSkillGroupConfigRequest
     * @return DeleteSkillGroupConfigResponse
     */
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
     * @param request the request parameters of GetPrecisionTask  GetPrecisionTaskRequest
     * @return GetPrecisionTaskResponse
     */
    @Override
    public CompletableFuture<GetPrecisionTaskResponse> getPrecisionTask(GetPrecisionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPrecisionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPrecisionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPrecisionTaskResponse> future = new CompletableFuture<>();
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
     * @deprecated OpenAPI GetRule is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.  * @param request  the request parameters of GetRule  GetRuleRequest
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
     * @deprecated OpenAPI GetRuleDetail is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.  * @param request  the request parameters of GetRuleDetail  GetRuleDetailRequest
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
     * @deprecated OpenAPI GetScoreInfo is deprecated  * @param request  the request parameters of GetScoreInfo  GetScoreInfoRequest
     * @return GetScoreInfoResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetScoreInfoResponse> getScoreInfo(GetScoreInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetScoreInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScoreInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScoreInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSkillGroupConfig  GetSkillGroupConfigRequest
     * @return GetSkillGroupConfigResponse
     */
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
     * @param request the request parameters of ListPrecisionTask  ListPrecisionTaskRequest
     * @return ListPrecisionTaskResponse
     */
    @Override
    public CompletableFuture<ListPrecisionTaskResponse> listPrecisionTask(ListPrecisionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrecisionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrecisionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrecisionTaskResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListSkillGroupConfig  ListSkillGroupConfigRequest
     * @return ListSkillGroupConfigResponse
     */
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
     * @param request the request parameters of SubmitPrecisionTask  SubmitPrecisionTaskRequest
     * @return SubmitPrecisionTaskResponse
     */
    @Override
    public CompletableFuture<SubmitPrecisionTaskResponse> submitPrecisionTask(SubmitPrecisionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitPrecisionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitPrecisionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitPrecisionTaskResponse> future = new CompletableFuture<>();
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
     * @deprecated OpenAPI UpdateRule is deprecated, please use Qualitycheck::2019-01-15::UpdateRuleV4 instead.  * @param request  the request parameters of UpdateRule  UpdateRuleRequest
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
     * @param request the request parameters of UpdateSkillGroupConfig  UpdateSkillGroupConfigRequest
     * @return UpdateSkillGroupConfigResponse
     */
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
     * @deprecated OpenAPI UploadData is deprecated, please use Qualitycheck::2019-01-15::UploadDataV4 instead.  * @param request  the request parameters of UploadData  UploadDataRequest
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

    /**
     * @param request the request parameters of VerifyFile  VerifyFileRequest
     * @return VerifyFileResponse
     */
    @Override
    public CompletableFuture<VerifyFileResponse> verifyFile(VerifyFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifySentence  VerifySentenceRequest
     * @return VerifySentenceResponse
     */
    @Override
    public CompletableFuture<VerifySentenceResponse> verifySentence(VerifySentenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifySentence").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifySentenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifySentenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
