// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.pairecservice20221213.models.*;
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
        this.product = "PaiRecService";
        this.version = "2022-12-13";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ApplyEngineConfig  ApplyEngineConfigRequest
     * @return ApplyEngineConfigResponse
     */
    @Override
    public CompletableFuture<ApplyEngineConfigResponse> applyEngineConfig(ApplyEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyEngineConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/engineconfigs/{EngineConfigId}/action/apply").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyEngineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BackflowFeatureConsistencyCheckJobData  BackflowFeatureConsistencyCheckJobDataRequest
     * @return BackflowFeatureConsistencyCheckJobDataResponse
     */
    @Override
    public CompletableFuture<BackflowFeatureConsistencyCheckJobDataResponse> backflowFeatureConsistencyCheckJobData(BackflowFeatureConsistencyCheckJobDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BackflowFeatureConsistencyCheckJobData").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobs/action/backflowdata").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BackflowFeatureConsistencyCheckJobDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BackflowFeatureConsistencyCheckJobDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>Use this API to change the version of a recall management service. Ensure that the provided <code>RecallManagementServiceId</code>, <code>InstanceId</code>, and target <code>RecallManagementServiceVersionId</code> are valid, and that you have the required permissions for these resources.</p>
     * <ul>
     * <li><strong>RecallManagementServiceId</strong>: The unique identifier of the recall management service.</li>
     * <li><strong>InstanceId</strong>: The instance ID associated with the recall management service.</li>
     * <li><strong>RecallManagementServiceVersionId</strong>: The target version ID to switch to.
     * Note: Before changing the version, confirm that the new version is fully tested and ready for production.</li>
     * </ul>
     * 
     * @param request the request parameters of ChangeRecallManagementServiceVersion  ChangeRecallManagementServiceVersionRequest
     * @return ChangeRecallManagementServiceVersionResponse
     */
    @Override
    public CompletableFuture<ChangeRecallManagementServiceVersionResponse> changeRecallManagementServiceVersion(ChangeRecallManagementServiceVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeRecallManagementServiceVersion").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}/action/changeversion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeRecallManagementServiceVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeRecallManagementServiceVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Call this API operation to send a conversation message to an agent. Server-Sent Events (SSE) is supported.</li>
     * <li>If the <code>ConversationId</code> parameter is specified, the conversation continues in the context of the specified existing session. If this parameter is not specified, automatic creation of a new session is performed.</li>
     * <li>The <code>Config</code> field allows you to pass additional information input. The value must be in JSON format.</li>
     * <li>If the request succeeds, the response includes the message ID, reply content, and other information for this conversation. If a fault occurs, the corresponding error code and error message are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ChatConversation  ChatConversationRequest
     * @return ChatConversationResponse
     */
    @Override
    public CompletableFuture<ChatConversationResponse> chatConversation(ChatConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChatConversation").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/chat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ChatConversationResponseBody> chatConversationWithResponseIterable(ChatConversationRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ChatConversation").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/chat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        ChatConversationResponseBodyIterator iterator = ChatConversationResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of CheckInstanceResources  CheckInstanceResourcesRequest
     * @return CheckInstanceResourcesResponse
     */
    @Override
    public CompletableFuture<CheckInstanceResourcesResponse> checkInstanceResources(CheckInstanceResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckInstanceResources").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/action/checkresources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckInstanceResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckInstanceResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This operation validates a traffic control task expression for a specific instance and table. Provide the correct <code>InstanceId</code>, <code>TableMetaId</code>, and <code>Expression</code> parameters.</p>
     * 
     * @param request the request parameters of CheckTrafficControlTaskExpression  CheckTrafficControlTaskExpressionRequest
     * @return CheckTrafficControlTaskExpressionResponse
     */
    @Override
    public CompletableFuture<CheckTrafficControlTaskExpressionResponse> checkTrafficControlTaskExpression(CheckTrafficControlTaskExpressionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckTrafficControlTaskExpression").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltasks/action/checkexpression").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckTrafficControlTaskExpressionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckTrafficControlTaskExpressionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneEngineConfig  CloneEngineConfigRequest
     * @return CloneEngineConfigResponse
     */
    @Override
    public CompletableFuture<CloneEngineConfigResponse> cloneEngineConfig(CloneEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneEngineConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/engineconfigs/{EngineConfigId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneEngineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneExperiment  CloneExperimentRequest
     * @return CloneExperimentResponse
     */
    @Override
    public CompletableFuture<CloneExperimentResponse> cloneExperiment(CloneExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments/{ExperimentId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneExperimentGroup  CloneExperimentGroupRequest
     * @return CloneExperimentGroupResponse
     */
    @Override
    public CompletableFuture<CloneExperimentGroupResponse> cloneExperimentGroup(CloneExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneExperimentGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneFeatureConsistencyCheckJobConfig  CloneFeatureConsistencyCheckJobConfigRequest
     * @return CloneFeatureConsistencyCheckJobConfigResponse
     */
    @Override
    public CompletableFuture<CloneFeatureConsistencyCheckJobConfigResponse> cloneFeatureConsistencyCheckJobConfig(CloneFeatureConsistencyCheckJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneFeatureConsistencyCheckJobConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobconfigs/{SourceFeatureConsistencyCheckJobConfigId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneFeatureConsistencyCheckJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneFeatureConsistencyCheckJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloneLaboratory  CloneLaboratoryRequest
     * @return CloneLaboratoryResponse
     */
    @Override
    public CompletableFuture<CloneLaboratoryResponse> cloneLaboratory(CloneLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneLaboratory").setMethod(HttpMethod.POST).setPathRegex("/api/v1/laboratories/{LaboratoryId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API clones an existing traffic control task to another specified instance. Ensure that the <code>InstanceId</code> you provide is valid and that you have the required permissions for the target instance.
     * Note: The cloning process does not affect the status or configuration of the original task.</p>
     * 
     * @param request the request parameters of CloneTrafficControlTask  CloneTrafficControlTaskRequest
     * @return CloneTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<CloneTrafficControlTaskResponse> cloneTrafficControlTask(CloneTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloneTrafficControlTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/clone").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CompareSampleConsistencyJob  CompareSampleConsistencyJobRequest
     * @return CompareSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<CompareSampleConsistencyJobResponse> compareSampleConsistencyJob(CompareSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CompareSampleConsistencyJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}/action/compare").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompareSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompareSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateABMetric  CreateABMetricRequest
     * @return CreateABMetricResponse
     */
    @Override
    public CompletableFuture<CreateABMetricResponse> createABMetric(CreateABMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateABMetric").setMethod(HttpMethod.POST).setPathRegex("/api/v1/abmetrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateABMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateABMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateABMetricGroup  CreateABMetricGroupRequest
     * @return CreateABMetricGroupResponse
     */
    @Override
    public CompletableFuture<CreateABMetricGroupResponse> createABMetricGroup(CreateABMetricGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateABMetricGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/abmetricgroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateABMetricGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateABMetricGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCalculationJobs  CreateCalculationJobsRequest
     * @return CreateCalculationJobsResponse
     */
    @Override
    public CompletableFuture<CreateCalculationJobsResponse> createCalculationJobs(CreateCalculationJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCalculationJobs").setMethod(HttpMethod.POST).setPathRegex("/api/v1/batch/calculationjobs/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCalculationJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCalculationJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCrowd  CreateCrowdRequest
     * @return CreateCrowdResponse
     */
    @Override
    public CompletableFuture<CreateCrowdResponse> createCrowd(CreateCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCrowd").setMethod(HttpMethod.POST).setPathRegex("/api/v1/crowds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This API creates a data diagnosis task. It supports various analysis types, including item or user change rate analysis, user preference statistics cycle analysis, two-table join analysis, basic statistical analysis, and abnormal behavior analysis.</li>
     * <li>The content of the <code>Config</code> parameter depends on the value of the <code>Type</code> parameter. For more information, see the example configurations in this topic.</li>
     * <li>To run the task on a schedule, specify the <code>CycleTime</code> parameter. If this parameter is omitted, the task runs only once.</li>
     * <li>The optional <code>TopNQuantity</code> parameter specifies the number of top results to return.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataDiagnosis  CreateDataDiagnosisRequest
     * @return CreateDataDiagnosisResponse
     */
    @Override
    public CompletableFuture<CreateDataDiagnosisResponse> createDataDiagnosis(CreateDataDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDataDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/datadiagnoses").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This operation creates a data diagnosis (rerun) job for a specific instance within a specified time frame. To ensure the job runs correctly, provide accurate values for the <code>DataDiagnosisId</code>, <code>InstanceId</code>, <code>StartDate</code>, and <code>EndDate</code> parameters.</p>
     * 
     * @param request the request parameters of CreateDataDiagnosisJobs  CreateDataDiagnosisJobsRequest
     * @return CreateDataDiagnosisJobsResponse
     */
    @Override
    public CompletableFuture<CreateDataDiagnosisJobsResponse> createDataDiagnosisJobs(CreateDataDiagnosisJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDataDiagnosisJobs").setMethod(HttpMethod.POST).setPathRegex("/api/v1/batch/datadiagnosisjobs/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataDiagnosisJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataDiagnosisJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEngineConfig  CreateEngineConfigRequest
     * @return CreateEngineConfigResponse
     */
    @Override
    public CompletableFuture<CreateEngineConfigResponse> createEngineConfig(CreateEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateEngineConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/engineconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEngineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExperiment  CreateExperimentRequest
     * @return CreateExperimentResponse
     */
    @Override
    public CompletableFuture<CreateExperimentResponse> createExperiment(CreateExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExperimentGroup  CreateExperimentGroupRequest
     * @return CreateExperimentGroupResponse
     */
    @Override
    public CompletableFuture<CreateExperimentGroupResponse> createExperimentGroup(CreateExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExperimentGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experimentgroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFeatureConsistencyCheckJob  CreateFeatureConsistencyCheckJobRequest
     * @return CreateFeatureConsistencyCheckJobResponse
     */
    @Override
    public CompletableFuture<CreateFeatureConsistencyCheckJobResponse> createFeatureConsistencyCheckJob(CreateFeatureConsistencyCheckJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFeatureConsistencyCheckJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFeatureConsistencyCheckJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFeatureConsistencyCheckJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFeatureConsistencyCheckJobConfig  CreateFeatureConsistencyCheckJobConfigRequest
     * @return CreateFeatureConsistencyCheckJobConfigResponse
     */
    @Override
    public CompletableFuture<CreateFeatureConsistencyCheckJobConfigResponse> createFeatureConsistencyCheckJobConfig(CreateFeatureConsistencyCheckJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFeatureConsistencyCheckJobConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFeatureConsistencyCheckJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFeatureConsistencyCheckJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstanceResource  CreateInstanceResourceRequest
     * @return CreateInstanceResourceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResourceResponse> createInstanceResource(CreateInstanceResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstanceResource").setMethod(HttpMethod.POST).setPathRegex("/api/v1/instances/{InstanceId}/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLaboratory  CreateLaboratoryRequest
     * @return CreateLaboratoryResponse
     */
    @Override
    public CompletableFuture<CreateLaboratoryResponse> createLaboratory(CreateLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLaboratory").setMethod(HttpMethod.POST).setPathRegex("/api/v1/laboratories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLayer  CreateLayerRequest
     * @return CreateLayerResponse
     */
    @Override
    public CompletableFuture<CreateLayerResponse> createLayer(CreateLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLayer").setMethod(HttpMethod.POST).setPathRegex("/api/v1/layers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description.</h2>
     * 
     * @param request the request parameters of CreateParam  CreateParamRequest
     * @return CreateParamResponse
     */
    @Override
    public CompletableFuture<CreateParamResponse> createParam(CreateParamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateParam").setMethod(HttpMethod.POST).setPathRegex("/api/v1/params").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateParamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateParamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * 
     * @param request the request parameters of CreateRecallManagementConfig  CreateRecallManagementConfigRequest
     * @return CreateRecallManagementConfigResponse
     */
    @Override
    public CompletableFuture<CreateRecallManagementConfigResponse> createRecallManagementConfig(CreateRecallManagementConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRecallManagementConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recallmanagementconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRecallManagementConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRecallManagementConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>To create a recall management service, call this API with a specified instance ID, service name, and service description. Ensure that the <code>InstanceId</code> parameter is valid.</p>
     * 
     * @param request the request parameters of CreateRecallManagementService  CreateRecallManagementServiceRequest
     * @return CreateRecallManagementServiceResponse
     */
    @Override
    public CompletableFuture<CreateRecallManagementServiceResponse> createRecallManagementService(CreateRecallManagementServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRecallManagementService").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recallmanagementservices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRecallManagementServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRecallManagementServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>Use this API to create a new version of a recall management service.</li>
     * <li>To create a new version from an existing one, specify the source recall management service version ID.</li>
     * <li>You can configure detailed recall rules, such as the recall name, description, priority, and recall type.</li>
     * <li>Configure operators such as filter, trigger, feature extraction, and join.</li>
     * <li>The merge configuration specifies how to merge multiple recall results and supports two merge methods: weight-based and alternating.</li>
     * <li>All configuration items are optional.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecallManagementServiceVersion  CreateRecallManagementServiceVersionRequest
     * @return CreateRecallManagementServiceVersionResponse
     */
    @Override
    public CompletableFuture<CreateRecallManagementServiceVersionResponse> createRecallManagementServiceVersion(CreateRecallManagementServiceVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRecallManagementServiceVersion").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRecallManagementServiceVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRecallManagementServiceVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This API creates a configuration for a specific version of the Recall Management Service.</li>
     * <li>The <code>ConfigType</code> parameter specifies the configuration type, which can be either recall or merge.</li>
     * <li>Use the <code>RecallConfig</code> and <code>MergeConfig</code> parameters to provide the recall and merge configurations, respectively.</li>
     * <li>Required parameters must be provided in the specified data formats.</li>
     * <li>Optional parameter values must be consistent with your business logic.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecallManagementServiceVersionConfig  CreateRecallManagementServiceVersionConfigRequest
     * @return CreateRecallManagementServiceVersionConfigResponse
     */
    @Override
    public CompletableFuture<CreateRecallManagementServiceVersionConfigResponse> createRecallManagementServiceVersionConfig(CreateRecallManagementServiceVersionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRecallManagementServiceVersionConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}/versions/{RecallManagementServiceVersionId}/configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRecallManagementServiceVersionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRecallManagementServiceVersionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>The <strong>InstanceId</strong>, <strong>Name</strong>, <strong>Description</strong>, <strong>Type</strong>, and <strong>DataSource</strong> parameters are required.</li>
     * <li>The <strong>RecallType</strong> parameter is optional. If provided, it must be a valid enum value.</li>
     * <li>For each field in the <strong>Fields</strong> parameter, you must define its name, type, and attributes. You must mark at least one field as Primary.</li>
     * <li>If you use MaxCompute as the data source, you must specify the <strong>MaxcomputeProjectName</strong> and <strong>MaxcomputeTableName</strong> parameters. The <strong>MaxcomputeSchema</strong> parameter is optional.</li>
     * <li>For vector fields, the values of the <strong>VectorDimension</strong> and <strong>VectorMetricType</strong> parameters must match the actual data.</li>
     * <li>Use the <strong>Config</strong> field to provide additional configuration as a JSON string.</li>
     * <li>Use fluctuation threshold parameters, such as <strong>EnableRowCountFluctuationThreshold</strong>, to monitor changes in row count or table size. Enable these parameters and set appropriate thresholds as needed.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecallManagementTable  CreateRecallManagementTableRequest
     * @return CreateRecallManagementTableResponse
     */
    @Override
    public CompletableFuture<CreateRecallManagementTableResponse> createRecallManagementTable(CreateRecallManagementTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRecallManagementTable").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recallmanagementtables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRecallManagementTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRecallManagementTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateResourceRule  CreateResourceRuleRequest
     * @return CreateResourceRuleResponse
     */
    @Override
    public CompletableFuture<CreateResourceRuleResponse> createResourceRule(CreateResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateResourceRule").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resourcerules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateResourceRuleItem  CreateResourceRuleItemRequest
     * @return CreateResourceRuleItemResponse
     */
    @Override
    public CompletableFuture<CreateResourceRuleItemResponse> createResourceRuleItem(CreateResourceRuleItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateResourceRuleItem").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}/items").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceRuleItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceRuleItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSampleConsistencyJob  CreateSampleConsistencyJobRequest
     * @return CreateSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<CreateSampleConsistencyJobResponse> createSampleConsistencyJob(CreateSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSampleConsistencyJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/sampleconsistencyjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateScene  CreateSceneRequest
     * @return CreateSceneResponse
     */
    @Override
    public CompletableFuture<CreateSceneResponse> createScene(CreateSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateScene").setMethod(HttpMethod.POST).setPathRegex("/api/v1/scenes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSubCrowd  CreateSubCrowdRequest
     * @return CreateSubCrowdResponse
     */
    @Override
    public CompletableFuture<CreateSubCrowdResponse> createSubCrowd(CreateSubCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSubCrowd").setMethod(HttpMethod.POST).setPathRegex("/api/v1/crowds/{CrowdId}/subcrowds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSubCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSubCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTableMeta  CreateTableMetaRequest
     * @return CreateTableMetaResponse
     */
    @Override
    public CompletableFuture<CreateTableMetaResponse> createTableMeta(CreateTableMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTableMeta").setMethod(HttpMethod.POST).setPathRegex("/api/v1/tablemetas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTableMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTableMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The <code>ItemConditionType</code> parameter supports two formats: array format (Array) and expression format (Expression). Based on the format you select, you must provide either <code>ItemConditionArray</code> or <code>ItemConditionExpress</code>.</li>
     * <li>The <code>StatisPeriod</code> parameter defaults to daily. For hourly statistics, you must set this parameter explicitly.</li>
     * <li>The <code>ToleranceValue</code> and <code>NewProductRegulation</code> parameters are optional.</li>
     * <li>The <code>Status</code> parameter controls whether a new traffic control target takes effect immediately. By default, new targets are inactive.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTrafficControlTarget  CreateTrafficControlTargetRequest
     * @return CreateTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<CreateTrafficControlTargetResponse> createTrafficControlTarget(CreateTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTrafficControlTarget").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltargets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>Use this API to create a new traffic control task. You can define a traffic control policy for different scenarios, time ranges, and conditions for users or items.</li>
     * <li>The <code>ExecutionTime</code> parameter specifies the execution time mode for the task. If you select the <code>TimeRange</code> mode, you must provide both the <code>StartTime</code> and <code>EndTime</code> parameters.</li>
     * <li>The <code>TrafficControlTargets</code> parameter is required. For each traffic control target, you must specify its name, time range, event type, and expected value.</li>
     * <li>You can use the <code>UserConditionType</code> and <code>ItemConditionType</code> parameters to define conditions for the target user group and items.</li>
     * <li>Set the <code>ControlLogic</code> parameter to <code>Guaranteed</code> for guaranteed control or to <code>Approach</code> for approach control.</li>
     * <li>To configure new product regulation, use the <code>NewProductRegulation</code> field.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTrafficControlTask  CreateTrafficControlTaskRequest
     * @return CreateTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<CreateTrafficControlTaskResponse> createTrafficControlTask(CreateTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTrafficControlTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DebugResourceRule  DebugResourceRuleRequest
     * @return DebugResourceRuleResponse
     */
    @Override
    public CompletableFuture<DebugResourceRuleResponse> debugResourceRule(DebugResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DebugResourceRule").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}/action/debug").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DebugResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DebugResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteABMetric  DeleteABMetricRequest
     * @return DeleteABMetricResponse
     */
    @Override
    public CompletableFuture<DeleteABMetricResponse> deleteABMetric(DeleteABMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteABMetric").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/abmetrics/{ABMetricId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteABMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteABMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteABMetricGroup  DeleteABMetricGroupRequest
     * @return DeleteABMetricGroupResponse
     */
    @Override
    public CompletableFuture<DeleteABMetricGroupResponse> deleteABMetricGroup(DeleteABMetricGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteABMetricGroup").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/abmetricgroups/{ABMetricGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteABMetricGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteABMetricGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCrowd  DeleteCrowdRequest
     * @return DeleteCrowdResponse
     */
    @Override
    public CompletableFuture<DeleteCrowdResponse> deleteCrowd(DeleteCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCrowd").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/crowds/{CrowdId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Ensure you provide the correct <code>DataDiagnosisId</code> and <code>InstanceId</code> to avoid accidental deletion.</p>
     * 
     * @param request the request parameters of DeleteDataDiagnosis  DeleteDataDiagnosisRequest
     * @return DeleteDataDiagnosisResponse
     */
    @Override
    public CompletableFuture<DeleteDataDiagnosisResponse> deleteDataDiagnosis(DeleteDataDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDataDiagnosis").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/datadiagnoses/{DataDiagnosisId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified engine configuration.</p>
     * 
     * @param request the request parameters of DeleteEngineConfig  DeleteEngineConfigRequest
     * @return DeleteEngineConfigResponse
     */
    @Override
    public CompletableFuture<DeleteEngineConfigResponse> deleteEngineConfig(DeleteEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteEngineConfig").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/engineconfigs/{EngineConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEngineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExperiment  DeleteExperimentRequest
     * @return DeleteExperimentResponse
     */
    @Override
    public CompletableFuture<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExperiment").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/experiments/{ExperimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExperimentGroup  DeleteExperimentGroupRequest
     * @return DeleteExperimentGroupResponse
     */
    @Override
    public CompletableFuture<DeleteExperimentGroupResponse> deleteExperimentGroup(DeleteExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExperimentGroup").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstanceResource  DeleteInstanceResourceRequest
     * @return DeleteInstanceResourceResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceResourceResponse> deleteInstanceResource(DeleteInstanceResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInstanceResource").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/instances/{InstanceId}/resources/{ResourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLaboratory  DeleteLaboratoryRequest
     * @return DeleteLaboratoryResponse
     */
    @Override
    public CompletableFuture<DeleteLaboratoryResponse> deleteLaboratory(DeleteLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLaboratory").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/laboratories/{LaboratoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLayer  DeleteLayerRequest
     * @return DeleteLayerResponse
     */
    @Override
    public CompletableFuture<DeleteLayerResponse> deleteLayer(DeleteLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLayer").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/layers/{LayerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteParam  DeleteParamRequest
     * @return DeleteParamResponse
     */
    @Override
    public CompletableFuture<DeleteParamResponse> deleteParam(DeleteParamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteParam").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/params/{ParamId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteParamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteParamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation deletes a recall management service based on the RecallManagementServiceId and InstanceId. Before you call this API, ensure you have the correct information for the service to be deleted.</p>
     * 
     * @param request the request parameters of DeleteRecallManagementService  DeleteRecallManagementServiceRequest
     * @return DeleteRecallManagementServiceResponse
     */
    @Override
    public CompletableFuture<DeleteRecallManagementServiceResponse> deleteRecallManagementService(DeleteRecallManagementServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRecallManagementService").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRecallManagementServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRecallManagementServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This operation deletes a specific version of a recall management service. You must provide the recall management service ID, the recall management service version ID, and the instance ID. This operation is irreversible, so back up all critical data before proceeding.</p>
     * 
     * @param request the request parameters of DeleteRecallManagementServiceVersion  DeleteRecallManagementServiceVersionRequest
     * @return DeleteRecallManagementServiceVersionResponse
     */
    @Override
    public CompletableFuture<DeleteRecallManagementServiceVersionResponse> deleteRecallManagementServiceVersion(DeleteRecallManagementServiceVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRecallManagementServiceVersion").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}/versions/{RecallManagementServiceVersionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRecallManagementServiceVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRecallManagementServiceVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Specify the recall management service ID, recall management version ID, and recall management configuration ID.</li>
     * <li><code>InstanceId</code> is a required query parameter.</li>
     * <li>The request fails if any of the specified IDs are invalid.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRecallManagementServiceVersionConfig  DeleteRecallManagementServiceVersionConfigRequest
     * @return DeleteRecallManagementServiceVersionConfigResponse
     */
    @Override
    public CompletableFuture<DeleteRecallManagementServiceVersionConfigResponse> deleteRecallManagementServiceVersionConfig(DeleteRecallManagementServiceVersionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRecallManagementServiceVersionConfig").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}/versions/{RecallManagementServiceVersionId}/configs/{RecallManagementServiceVersionConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRecallManagementServiceVersionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRecallManagementServiceVersionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>The required <strong>path parameter</strong> <code>RecallManagementTableId</code> specifies the ID of the recall management table to delete.</li>
     * <li>The required <strong>query parameter</strong> <code>InstanceId</code> specifies the ID of the instance.</li>
     * <li>A successful operation returns a <code>RequestId</code> in the response body for request tracking.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRecallManagementTable  DeleteRecallManagementTableRequest
     * @return DeleteRecallManagementTableResponse
     */
    @Override
    public CompletableFuture<DeleteRecallManagementTableResponse> deleteRecallManagementTable(DeleteRecallManagementTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRecallManagementTable").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/recallmanagementtables/{RecallManagementTableId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRecallManagementTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRecallManagementTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteResourceRule  DeleteResourceRuleRequest
     * @return DeleteResourceRuleResponse
     */
    @Override
    public CompletableFuture<DeleteResourceRuleResponse> deleteResourceRule(DeleteResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteResourceRule").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteResourceRuleItem  DeleteResourceRuleItemRequest
     * @return DeleteResourceRuleItemResponse
     */
    @Override
    public CompletableFuture<DeleteResourceRuleItemResponse> deleteResourceRuleItem(DeleteResourceRuleItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteResourceRuleItem").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}/items/{ResourceRuleItemId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceRuleItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceRuleItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSampleConsistencyJob  DeleteSampleConsistencyJobRequest
     * @return DeleteSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<DeleteSampleConsistencyJobResponse> deleteSampleConsistencyJob(DeleteSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSampleConsistencyJob").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteScene  DeleteSceneRequest
     * @return DeleteSceneResponse
     */
    @Override
    public CompletableFuture<DeleteSceneResponse> deleteScene(DeleteSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteScene").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/scenes/{SceneId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSubCrowd  DeleteSubCrowdRequest
     * @return DeleteSubCrowdResponse
     */
    @Override
    public CompletableFuture<DeleteSubCrowdResponse> deleteSubCrowd(DeleteSubCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSubCrowd").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/crowds/{CrowdId}/subcrowds/{SubCrowdId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSubCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSubCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTableMeta  DeleteTableMetaRequest
     * @return DeleteTableMetaResponse
     */
    @Override
    public CompletableFuture<DeleteTableMetaResponse> deleteTableMeta(DeleteTableMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTableMeta").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/tablemetas/{TableMetaId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTableMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTableMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li><strong>TrafficControlTargetId</strong> is a required path parameter that specifies the traffic control target to delete.</li>
     * <li><strong>InstanceId</strong> is a required query parameter that specifies the instance ID for this operation.</li>
     * <li>A successful response includes a <code>RequestId</code> field to track the request.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTrafficControlTarget  DeleteTrafficControlTargetRequest
     * @return DeleteTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<DeleteTrafficControlTargetResponse> deleteTrafficControlTarget(DeleteTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTrafficControlTarget").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This API uses <code>TrafficControlTaskId</code> and <code>InstanceId</code> to delete a traffic control task.</li>
     * <li>Ensure the <code>TrafficControlTaskId</code> and <code>InstanceId</code> are correct, or the operation may fail.</li>
     * <li>This operation is irreversible. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTrafficControlTask  DeleteTrafficControlTaskRequest
     * @return DeleteTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<DeleteTrafficControlTaskResponse> deleteTrafficControlTask(DeleteTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTrafficControlTask").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Overview</h2>
     * <ul>
     * <li>This API deploys Flink code for a specific traffic control task.</li>
     * <li><code>TrafficControlTaskId</code> is a path parameter and requires a valid task ID.</li>
     * <li><code>InstanceId</code> and <code>Environment</code> are required request body parameters that specify the instance ID and the target deployment environment.</li>
     * <li>The optional <code>RetryDeploy</code> parameter specifies whether to automatically retry the deployment on failure. The default value is <code>false</code>.</li>
     * <li>The value for <code>Environment</code> must be one of the following: Daily, Pre, or Prod.</li>
     * </ul>
     * 
     * @param request the request parameters of DeployTrafficControlTaskCode  DeployTrafficControlTaskCodeRequest
     * @return DeployTrafficControlTaskCodeResponse
     */
    @Override
    public CompletableFuture<DeployTrafficControlTaskCodeResponse> deployTrafficControlTaskCode(DeployTrafficControlTaskCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeployTrafficControlTaskCode").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/deploycode").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployTrafficControlTaskCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployTrafficControlTaskCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Use this API to export a specific table from the recall engine to Alibaba Cloud MaxCompute for further data processing or analysis. Ensure the provided MaxCompute project name, schema, and table name are valid and that you have the required permissions.</p>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>The <code>Partitions</code> field must be a JSON object that specifies the table partitions to export.</li>
     * <li>The request may fail if any required parameters are missing or incorrect.</li>
     * <li>The export process is asynchronous and may take some time. You can use the returned job ID to track the status of the job.</li>
     * </ul>
     * 
     * @param request the request parameters of ExportRecallManagementTable  ExportRecallManagementTableRequest
     * @return ExportRecallManagementTableResponse
     */
    @Override
    public CompletableFuture<ExportRecallManagementTableResponse> exportRecallManagementTable(ExportRecallManagementTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExportRecallManagementTable").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recallmanagementtables/{RecallManagementTableId}/action/export").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportRecallManagementTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportRecallManagementTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateAlgorithmCustomizationScript  GenerateAlgorithmCustomizationScriptRequest
     * @return GenerateAlgorithmCustomizationScriptResponse
     */
    @Override
    public CompletableFuture<GenerateAlgorithmCustomizationScriptResponse> generateAlgorithmCustomizationScript(GenerateAlgorithmCustomizationScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateAlgorithmCustomizationScript").setMethod(HttpMethod.POST).setPathRegex("/api/v1/algorithmcustomizations/{AlgorithmCustomizationId}/action/generatescript").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateAlgorithmCustomizationScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateAlgorithmCustomizationScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This API generates Flink code for a specified traffic control task ID, instance ID, and environment type.</li>
     * <li>The <code>Environment</code> parameter accepts three values: <code>Daily</code> for the daily environment, <code>Pre</code> for the pre-release environment, and <code>Prod</code> for the production environment.</li>
     * <li>Check the <code>PreNeedConfig</code> field in the response. A <code>true</code> value indicates that necessary configuration information might be missing in the pre-release environment. If this occurs, add or adjust the required settings.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateTrafficControlTaskCode  GenerateTrafficControlTaskCodeRequest
     * @return GenerateTrafficControlTaskCodeResponse
     */
    @Override
    public CompletableFuture<GenerateTrafficControlTaskCodeResponse> generateTrafficControlTaskCode(GenerateTrafficControlTaskCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateTrafficControlTaskCode").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/generatecode").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateTrafficControlTaskCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateTrafficControlTaskCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateTrafficControlTaskConfig  GenerateTrafficControlTaskConfigRequest
     * @return GenerateTrafficControlTaskConfigResponse
     */
    @Override
    public CompletableFuture<GenerateTrafficControlTaskConfigResponse> generateTrafficControlTaskConfig(GenerateTrafficControlTaskConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateTrafficControlTaskConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/generateconfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateTrafficControlTaskConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateTrafficControlTaskConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetABMetric  GetABMetricRequest
     * @return GetABMetricResponse
     */
    @Override
    public CompletableFuture<GetABMetricResponse> getABMetric(GetABMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetABMetric").setMethod(HttpMethod.GET).setPathRegex("/api/v1/abmetrics/{ABMetricId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetABMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetABMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetABMetricGroup  GetABMetricGroupRequest
     * @return GetABMetricGroupResponse
     */
    @Override
    public CompletableFuture<GetABMetricGroupResponse> getABMetricGroup(GetABMetricGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetABMetricGroup").setMethod(HttpMethod.GET).setPathRegex("/api/v1/abmetricgroups/{ABMetricGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetABMetricGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetABMetricGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCalculationJob  GetCalculationJobRequest
     * @return GetCalculationJobResponse
     */
    @Override
    public CompletableFuture<GetCalculationJobResponse> getCalculationJob(GetCalculationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCalculationJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/calculationjobs/{CalculationJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCalculationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCalculationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This API retrieves the details of a specific data diagnosis task using the provided <code>DataDiagnosisId</code> (data diagnosis task configuration ID) and <code>InstanceId</code> (instance ID).</li>
     * <li>The <code>CycleTime</code> field specifies the time for periodic execution. If this field is empty, the task does not execute periodically.</li>
     * <li>The value of <code>Type</code> determines the content of the <code>Config</code> field. For details about the required configuration for each type, see the relevant documentation.</li>
     * <li><code>GmtCreateTime</code> and <code>GmtModifiedTime</code> are timestamps for the record\&quot;s creation and modification times, respectively.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDataDiagnosis  GetDataDiagnosisRequest
     * @return GetDataDiagnosisResponse
     */
    @Override
    public CompletableFuture<GetDataDiagnosisResponse> getDataDiagnosis(GetDataDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDataDiagnosis").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datadiagnoses/{DataDiagnosisId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEngineConfig  GetEngineConfigRequest
     * @return GetEngineConfigResponse
     */
    @Override
    public CompletableFuture<GetEngineConfigResponse> getEngineConfig(GetEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEngineConfig").setMethod(HttpMethod.GET).setPathRegex("/api/v1/engineconfigs/{EngineConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEngineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperiment  GetExperimentRequest
     * @return GetExperimentResponse
     */
    @Override
    public CompletableFuture<GetExperimentResponse> getExperiment(GetExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperiment").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments/{ExperimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExperimentGroup  GetExperimentGroupRequest
     * @return GetExperimentGroupResponse
     */
    @Override
    public CompletableFuture<GetExperimentGroupResponse> getExperimentGroup(GetExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExperimentGroup").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFeatureConsistencyCheckJob  GetFeatureConsistencyCheckJobRequest
     * @return GetFeatureConsistencyCheckJobResponse
     */
    @Override
    public CompletableFuture<GetFeatureConsistencyCheckJobResponse> getFeatureConsistencyCheckJob(GetFeatureConsistencyCheckJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFeatureConsistencyCheckJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobs/{FeatureConsistencyCheckJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFeatureConsistencyCheckJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFeatureConsistencyCheckJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFeatureConsistencyCheckJobConfig  GetFeatureConsistencyCheckJobConfigRequest
     * @return GetFeatureConsistencyCheckJobConfigResponse
     */
    @Override
    public CompletableFuture<GetFeatureConsistencyCheckJobConfigResponse> getFeatureConsistencyCheckJobConfig(GetFeatureConsistencyCheckJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFeatureConsistencyCheckJobConfig").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobconfigs/{FeatureConsistencyCheckJobConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFeatureConsistencyCheckJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFeatureConsistencyCheckJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    @Override
    public CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstance").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceResource  GetInstanceResourceRequest
     * @return GetInstanceResourceResponse
     */
    @Override
    public CompletableFuture<GetInstanceResourceResponse> getInstanceResource(GetInstanceResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceResource").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/resources/{ResourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceResourceTable  GetInstanceResourceTableRequest
     * @return GetInstanceResourceTableResponse
     */
    @Override
    public CompletableFuture<GetInstanceResourceTableResponse> getInstanceResourceTable(GetInstanceResourceTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceResourceTable").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/resources/{ResourceId}/tables/{TableName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResourceTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResourceTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLaboratory  GetLaboratoryRequest
     * @return GetLaboratoryResponse
     */
    @Override
    public CompletableFuture<GetLaboratoryResponse> getLaboratory(GetLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLaboratory").setMethod(HttpMethod.GET).setPathRegex("/api/v1/laboratories/{LaboratoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLayer  GetLayerRequest
     * @return GetLayerResponse
     */
    @Override
    public CompletableFuture<GetLayerResponse> getLayer(GetLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLayer").setMethod(HttpMethod.GET).setPathRegex("/api/v1/layers/{LayerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRecallManagementConfig  GetRecallManagementConfigRequest
     * @return GetRecallManagementConfigResponse
     */
    @Override
    public CompletableFuture<GetRecallManagementConfigResponse> getRecallManagementConfig(GetRecallManagementConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRecallManagementConfig").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRecallManagementConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRecallManagementConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Retrieves the details of a specific recall management job using its <code>RecallManagementJobId</code> and <code>InstanceId</code>. The response includes the job\&quot;s status (such as Init, Running, Success, or Failed), start and end times, related table information, and operation log. To make a request, specify the <code>RecallManagementJobId</code> as a path parameter and the <code>InstanceId</code> as a query parameter.</p>
     * 
     * @param request the request parameters of GetRecallManagementJob  GetRecallManagementJobRequest
     * @return GetRecallManagementJobResponse
     */
    @Override
    public CompletableFuture<GetRecallManagementJobResponse> getRecallManagementJob(GetRecallManagementJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRecallManagementJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementjobs/{RecallManagementJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRecallManagementJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRecallManagementJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * 
     * @param request the request parameters of GetRecallManagementService  GetRecallManagementServiceRequest
     * @return GetRecallManagementServiceResponse
     */
    @Override
    public CompletableFuture<GetRecallManagementServiceResponse> getRecallManagementService(GetRecallManagementServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRecallManagementService").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRecallManagementServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRecallManagementServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRecallManagementServiceVersion  GetRecallManagementServiceVersionRequest
     * @return GetRecallManagementServiceVersionResponse
     */
    @Override
    public CompletableFuture<GetRecallManagementServiceVersionResponse> getRecallManagementServiceVersion(GetRecallManagementServiceVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRecallManagementServiceVersion").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}/versions/{RecallManagementServiceVersionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRecallManagementServiceVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRecallManagementServiceVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>Retrieves the configuration details for a specific version of a Recall Management Service by specifying its service, version, and configuration IDs. Ensure the parameter values are correct. The <code>InstanceId</code> is crucial for locating the correct instance.</p>
     * <ul>
     * <li><strong>Note</strong>: All path parameters (<code>RecallManagementServiceId</code>, <code>RecallManagementServiceVersionId</code>, and <code>RecallManagementServiceVersionConfigId</code>) are required and must reference an existing resource.</li>
     * <li><strong>Extended configuration</strong>: The response includes the <code>ExtendedConfig</code> field, which is used for future extensions and custom settings. Parse this field as needed.</li>
     * </ul>
     * 
     * @param request the request parameters of GetRecallManagementServiceVersionConfig  GetRecallManagementServiceVersionConfigRequest
     * @return GetRecallManagementServiceVersionConfigResponse
     */
    @Override
    public CompletableFuture<GetRecallManagementServiceVersionConfigResponse> getRecallManagementServiceVersionConfig(GetRecallManagementServiceVersionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRecallManagementServiceVersionConfig").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}/versions/{RecallManagementServiceVersionId}/configs/{RecallManagementServiceVersionConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRecallManagementServiceVersionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRecallManagementServiceVersionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API retrieves details of a specific recall management table using the provided <code>RecallManagementTableId</code> and <code>InstanceId</code>. Ensure you provide the correct values for these parameters.</p>
     * <ul>
     * <li><strong>Note</strong>: The <code>CanDelete</code> field indicates whether the data table supports delete operations. Use this value to control delete functionality in your application.</li>
     * <li>The <code>Fields</code> list contains the definitions for each field in the data table, including their name, type, and properties.</li>
     * <li>To monitor data changes, you can configure or query the fluctuation thresholds for row count and size using the corresponding fields.</li>
     * </ul>
     * 
     * @param request the request parameters of GetRecallManagementTable  GetRecallManagementTableRequest
     * @return GetRecallManagementTableResponse
     */
    @Override
    public CompletableFuture<GetRecallManagementTableResponse> getRecallManagementTable(GetRecallManagementTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRecallManagementTable").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementtables/{RecallManagementTableId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRecallManagementTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRecallManagementTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceRule  GetResourceRuleRequest
     * @return GetResourceRuleResponse
     */
    @Override
    public CompletableFuture<GetResourceRuleResponse> getResourceRule(GetResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResourceRule").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSampleConsistencyJob  GetSampleConsistencyJobRequest
     * @return GetSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<GetSampleConsistencyJobResponse> getSampleConsistencyJob(GetSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSampleConsistencyJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetScene  GetSceneRequest
     * @return GetSceneResponse
     */
    @Override
    public CompletableFuture<GetSceneResponse> getScene(GetSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetScene").setMethod(HttpMethod.GET).setPathRegex("/api/v1/scenes/{SceneId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetService  GetServiceRequest
     * @return GetServiceResponse
     */
    @Override
    public CompletableFuture<GetServiceResponse> getService(GetServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetService").setMethod(HttpMethod.GET).setPathRegex("/api/v1/services/{ServiceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSubCrowd  GetSubCrowdRequest
     * @return GetSubCrowdResponse
     */
    @Override
    public CompletableFuture<GetSubCrowdResponse> getSubCrowd(GetSubCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSubCrowd").setMethod(HttpMethod.GET).setPathRegex("/api/v1/crowds/{CrowdId}/subcrowds/{SubCrowdId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSubCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSubCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTableMeta  GetTableMetaRequest
     * @return GetTableMetaResponse
     */
    @Override
    public CompletableFuture<GetTableMetaResponse> getTableMeta(GetTableMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTableMeta").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tablemetas/{TableMetaId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTableMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTableMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>Retrieves the detailed configuration of a traffic control target. The configuration includes the target name, time range, and condition settings. This operation requires the <code>TrafficControlTargetId</code> and <code>InstanceId</code> parameters.</p>
     * 
     * @param request the request parameters of GetTrafficControlTarget  GetTrafficControlTargetRequest
     * @return GetTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<GetTrafficControlTargetResponse> getTrafficControlTarget(GetTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrafficControlTarget").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation retrieves the details of a specific traffic control task, including but not limited to the task name, description, and status.</li>
     * <li>TrafficControlTaskId and InstanceId are required parameters that specify the task ID and instance ID to query.</li>
     * <li>Optional parameters such as Environment, Version, and ControlTargetFilter help refine the request to retrieve more specific task data or version information.</li>
     * <li>Check the returned data structure, especially the TrafficControlTargets section, which contains multiple control targets and their related properties.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTrafficControlTask  GetTrafficControlTaskRequest
     * @return GetTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<GetTrafficControlTaskResponse> getTrafficControlTask(GetTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrafficControlTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API retrieves the traffic details for a specific traffic control task. The request must include the <code>TrafficControlTaskId</code>, <code>InstanceId</code>, and <code>Environment</code>.</p>
     * <ul>
     * <li><code>TrafficControlTaskId</code>: The unique identifier for the traffic control task.</li>
     * <li><code>InstanceId</code>: The instance ID.</li>
     * <li><code>Environment</code>: The environment type, such as the production environment (Prod).
     * The response includes the traffic allocation for each experiment and traffic control target. This data allows you to analyze and manage your traffic control strategies.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTrafficControlTaskTraffic  GetTrafficControlTaskTrafficRequest
     * @return GetTrafficControlTaskTrafficResponse
     */
    @Override
    public CompletableFuture<GetTrafficControlTaskTrafficResponse> getTrafficControlTaskTraffic(GetTrafficControlTaskTrafficRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrafficControlTaskTraffic").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/trafficinfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrafficControlTaskTrafficResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrafficControlTaskTrafficResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListABMetricGroups  ListABMetricGroupsRequest
     * @return ListABMetricGroupsResponse
     */
    @Override
    public CompletableFuture<ListABMetricGroupsResponse> listABMetricGroups(ListABMetricGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListABMetricGroups").setMethod(HttpMethod.GET).setPathRegex("/api/v1/abmetricgroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListABMetricGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListABMetricGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListABMetrics  ListABMetricsRequest
     * @return ListABMetricsResponse
     */
    @Override
    public CompletableFuture<ListABMetricsResponse> listABMetrics(ListABMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListABMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/abmetrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListABMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListABMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCalculationJobs  ListCalculationJobsRequest
     * @return ListCalculationJobsResponse
     */
    @Override
    public CompletableFuture<ListCalculationJobsResponse> listCalculationJobs(ListCalculationJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCalculationJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/calculationjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCalculationJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCalculationJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCrowdUsers  ListCrowdUsersRequest
     * @return ListCrowdUsersResponse
     */
    @Override
    public CompletableFuture<ListCrowdUsersResponse> listCrowdUsers(ListCrowdUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCrowdUsers").setMethod(HttpMethod.GET).setPathRegex("/api/v1/crowds/{CrowdId}/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCrowdUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCrowdUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCrowds  ListCrowdsRequest
     * @return ListCrowdsResponse
     */
    @Override
    public CompletableFuture<ListCrowdsResponse> listCrowds(ListCrowdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCrowds").setMethod(HttpMethod.GET).setPathRegex("/api/v1/crowds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCrowdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCrowdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API retrieves a list of data diagnosis tasks. It requires the <code>InstanceId</code> parameter and accepts optional parameters—such as data diagnosis type, page number, and page size—for filtering and pagination.</p>
     * <ul>
     * <li>The <strong>Types</strong> parameter accepts multiple data diagnosis types, allowing you to view reports for all selected types at once.</li>
     * <li>To paginate results, use the <code>PageNumber</code> and <code>PageSize</code> parameters.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDataDiagnoses  ListDataDiagnosesRequest
     * @return ListDataDiagnosesResponse
     */
    @Override
    public CompletableFuture<ListDataDiagnosesResponse> listDataDiagnoses(ListDataDiagnosesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataDiagnoses").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datadiagnoses").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataDiagnosesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataDiagnosesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API retrieves data diagnosis jobs for a specific instance. You can filter the jobs by parameters such as <code>InstanceId</code> and <code>Status</code>, and use the <code>PageNumber</code> and <code>PageSize</code> parameters to control pagination.</p>
     * <ul>
     * <li>The <strong>InstanceId</strong> parameter is required and specifies the instance to query.</li>
     * <li>Optional parameters include <strong>Status</strong>, <strong>Types</strong>, <strong>PageNumber</strong>, and <strong>PageSize</strong>.</li>
     * <li>Note: If you omit filter conditions, the operation returns all matching data diagnosis jobs.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDataDiagnosisJobs  ListDataDiagnosisJobsRequest
     * @return ListDataDiagnosisJobsResponse
     */
    @Override
    public CompletableFuture<ListDataDiagnosisJobsResponse> listDataDiagnosisJobs(ListDataDiagnosisJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataDiagnosisJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datadiagnosisjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataDiagnosisJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataDiagnosisJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This API retrieves data diagnosis reports based on parameters such as the data diagnosis ID, instance ID, and a date range.</li>
     * <li>The <code>FeatureName</code> parameter filters reports by a specific feature, and the <code>TopN</code> parameter limits the number of results.</li>
     * <li>The <code>RemainRateType</code> parameter specifies the type of retention rate report, such as a periodic report.</li>
     * <li>Report content includes item and user change rate analysis, periodic user preference analysis, correlation analysis, basic statistical analysis, and anomaly detection.</li>
     * <li>Important: All date values must use the <code>YYYY-MM-DD</code> format.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDataDiagnosisReports  ListDataDiagnosisReportsRequest
     * @return ListDataDiagnosisReportsResponse
     */
    @Override
    public CompletableFuture<ListDataDiagnosisReportsResponse> listDataDiagnosisReports(ListDataDiagnosisReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataDiagnosisReports").setMethod(HttpMethod.GET).setPathRegex("/api/v1/datadiagnoses/{DataDiagnosisId}/reports").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataDiagnosisReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataDiagnosisReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEngineConfigs  ListEngineConfigsRequest
     * @return ListEngineConfigsResponse
     */
    @Override
    public CompletableFuture<ListEngineConfigsResponse> listEngineConfigs(ListEngineConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEngineConfigs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/engineconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEngineConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEngineConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExperimentGroups  ListExperimentGroupsRequest
     * @return ListExperimentGroupsResponse
     */
    @Override
    public CompletableFuture<ListExperimentGroupsResponse> listExperimentGroups(ListExperimentGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExperimentGroups").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experimentgroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExperimentGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExperimentGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExperiments  ListExperimentsRequest
     * @return ListExperimentsResponse
     */
    @Override
    public CompletableFuture<ListExperimentsResponse> listExperiments(ListExperimentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExperiments").setMethod(HttpMethod.GET).setPathRegex("/api/v1/experiments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExperimentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExperimentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobConfigs  ListFeatureConsistencyCheckJobConfigsRequest
     * @return ListFeatureConsistencyCheckJobConfigsResponse
     */
    @Override
    public CompletableFuture<ListFeatureConsistencyCheckJobConfigsResponse> listFeatureConsistencyCheckJobConfigs(ListFeatureConsistencyCheckJobConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureConsistencyCheckJobConfigs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureConsistencyCheckJobConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureConsistencyCheckJobConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobFeatureReports  ListFeatureConsistencyCheckJobFeatureReportsRequest
     * @return ListFeatureConsistencyCheckJobFeatureReportsResponse
     */
    @Override
    public CompletableFuture<ListFeatureConsistencyCheckJobFeatureReportsResponse> listFeatureConsistencyCheckJobFeatureReports(ListFeatureConsistencyCheckJobFeatureReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureConsistencyCheckJobFeatureReports").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobs/{FeatureConsistencyCheckJobId}/featurereports").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureConsistencyCheckJobFeatureReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureConsistencyCheckJobFeatureReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobScoreReports  ListFeatureConsistencyCheckJobScoreReportsRequest
     * @return ListFeatureConsistencyCheckJobScoreReportsResponse
     */
    @Override
    public CompletableFuture<ListFeatureConsistencyCheckJobScoreReportsResponse> listFeatureConsistencyCheckJobScoreReports(ListFeatureConsistencyCheckJobScoreReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureConsistencyCheckJobScoreReports").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobs/{FeatureConsistencyCheckJobId}/scorereports").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureConsistencyCheckJobScoreReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureConsistencyCheckJobScoreReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobs  ListFeatureConsistencyCheckJobsRequest
     * @return ListFeatureConsistencyCheckJobsResponse
     */
    @Override
    public CompletableFuture<ListFeatureConsistencyCheckJobsResponse> listFeatureConsistencyCheckJobs(ListFeatureConsistencyCheckJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFeatureConsistencyCheckJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/featureconsistencycheck/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFeatureConsistencyCheckJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFeatureConsistencyCheckJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>To retrieve a list of all schemas for a specified resource, provide the instance ID (InstanceId) and resource ID (ResourceId). Use the optional SchemaName parameter to filter the schemas by a name prefix.</p>
     * 
     * @param request the request parameters of ListInstanceResourceSchemas  ListInstanceResourceSchemasRequest
     * @return ListInstanceResourceSchemasResponse
     */
    @Override
    public CompletableFuture<ListInstanceResourceSchemasResponse> listInstanceResourceSchemas(ListInstanceResourceSchemasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceResourceSchemas").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/resources/{ResourceId}/schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceResourceSchemasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceResourceSchemasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Provide the instance ID (InstanceId) and data source ID (ResourceId) to retrieve a list of data tables from the specified data source. Use the optional <code>MaxcomputeSchema</code> parameter to filter the results by a MaxCompute schema.</p>
     * 
     * @param request the request parameters of ListInstanceResourceTables  ListInstanceResourceTablesRequest
     * @return ListInstanceResourceTablesResponse
     */
    @Override
    public CompletableFuture<ListInstanceResourceTablesResponse> listInstanceResourceTables(ListInstanceResourceTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceResourceTables").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/resources/{ResourceId}/tables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceResourceTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceResourceTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceResources  ListInstanceResourcesRequest
     * @return ListInstanceResourcesResponse
     */
    @Override
    public CompletableFuture<ListInstanceResourcesResponse> listInstanceResources(ListInstanceResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceResources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances/{InstanceId}/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    @Override
    public CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstances").setMethod(HttpMethod.GET).setPathRegex("/api/v1/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLaboratories  ListLaboratoriesRequest
     * @return ListLaboratoriesResponse
     */
    @Override
    public CompletableFuture<ListLaboratoriesResponse> listLaboratories(ListLaboratoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLaboratories").setMethod(HttpMethod.GET).setPathRegex("/api/v1/laboratories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLaboratoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLaboratoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLayers  ListLayersRequest
     * @return ListLayersResponse
     */
    @Override
    public CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLayers").setMethod(HttpMethod.GET).setPathRegex("/api/v1/layers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLayersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLayersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListParams  ListParamsRequest
     * @return ListParamsResponse
     */
    @Override
    public CompletableFuture<ListParamsResponse> listParams(ListParamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListParams").setMethod(HttpMethod.GET).setPathRegex("/api/v1/params").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListParamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListParamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>Use this API operation to retrieve a list of recall management tasks.</li>
     * <li>The <code>InstanceId</code> and <code>Type</code> parameters are required. All other parameters are optional.</li>
     * <li>Use the <code>Condition</code> parameter to set filter conditions on specific table types, such as filtering by <code>RecallManagementTableId</code>.</li>
     * <li>Use the <code>SortBy</code> and <code>Order</code> parameters to control the sort order of the results. The default sort order is ascending by creation time.</li>
     * <li>Use the <code>PageNumber</code> and <code>PageSize</code> parameters for pagination. The <code>PageNumber</code> parameter defaults to 1, and the <code>PageSize</code> parameter defaults to 10.</li>
     * <li>The response includes details about each recall management task, such as its basic information and status.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecallManagementJobs  ListRecallManagementJobsRequest
     * @return ListRecallManagementJobsResponse
     */
    @Override
    public CompletableFuture<ListRecallManagementJobsResponse> listRecallManagementJobs(ListRecallManagementJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRecallManagementJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecallManagementJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecallManagementJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This operation queries the details of all versions for a specific Recall Management Service, including the version ID, name, effective status, creation time, and modification time. For accurate results, provide the correct <code>RecallManagementServiceId</code> and <code>InstanceId</code>.</p>
     * <ul>
     * <li>Use the <code>PageNumber</code> and <code>PageSize</code> parameters for pagination. By default, the query starts from the first page and returns 50 entries per page.</li>
     * <li>Use the <code>SortBy</code> parameter to sort the results by creation time or modification time. By default, the results are sorted by creation time in ascending order.</li>
     * <li>The <code>Order</code> parameter specifies the sort order. Valid values are <code>ASC</code> for ascending order and <code>DESC</code> for descending order.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecallManagementServiceVersions  ListRecallManagementServiceVersionsRequest
     * @return ListRecallManagementServiceVersionsResponse
     */
    @Override
    public CompletableFuture<ListRecallManagementServiceVersionsResponse> listRecallManagementServiceVersions(ListRecallManagementServiceVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRecallManagementServiceVersions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecallManagementServiceVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecallManagementServiceVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>By calling the <code>ListRecallManagementServices</code> operation, you can retrieve the list of recall management services under a specific instance based on given parameters such as InstanceId, PageNumber, and PageSize. You can sort results by creation time or update time in ascending or descending order.</p>
     * <ul>
     * <li><strong>InstanceId</strong> is required and specifies the instance to which the services belong.</li>
     * <li>The pagination parameters <strong>PageNumber</strong> and <strong>PageSize</strong> allow you to control the amount of returned data and the page from which to start displaying results. By default, data from the first page is returned.</li>
     * <li>Use the <strong>SortBy</strong> and <strong>Order</strong> parameters to customize the sorting of the list.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecallManagementServices  ListRecallManagementServicesRequest
     * @return ListRecallManagementServicesResponse
     */
    @Override
    public CompletableFuture<ListRecallManagementServicesResponse> listRecallManagementServices(ListRecallManagementServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRecallManagementServices").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementservices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecallManagementServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecallManagementServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage</h2>
     * <ul>
     * <li>To retrieve the version history of a specific RecallManagementTable, provide the <code>RecallManagementTableId</code> and <code>InstanceId</code>.</li>
     * <li>Use the <code>SortBy</code> parameter to sort the results by creation time or update time. By default, the results are sorted by creation time in ascending order.</li>
     * <li>The <code>PageNumber</code> and <code>PageSize</code> parameters enable pagination, which allows you to control the number of items to return and the page to display.</li>
     * <li>If the <code>Order</code> parameter is not specified, the results are sorted in ascending order by default.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecallManagementTableVersions  ListRecallManagementTableVersionsRequest
     * @return ListRecallManagementTableVersionsResponse
     */
    @Override
    public CompletableFuture<ListRecallManagementTableVersionsResponse> listRecallManagementTableVersions(ListRecallManagementTableVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRecallManagementTableVersions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementtables/{RecallManagementTableId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecallManagementTableVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecallManagementTableVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li><strong>InstanceId</strong> is a required parameter specifying the instance to query.</li>
     * <li>The <strong>Name</strong> and <strong>Type</strong> parameters filter recall management tables by name or type.</li>
     * <li>The <strong>PageNumber</strong> and <strong>PageSize</strong> parameters control pagination. By default, the query returns the first 50 records.</li>
     * <li>You can sort results by creation time (GmtCreateTime) or modification time (GmtModifiedTime) in ascending (ASC) or descending (DESC) order.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecallManagementTables  ListRecallManagementTablesRequest
     * @return ListRecallManagementTablesResponse
     */
    @Override
    public CompletableFuture<ListRecallManagementTablesResponse> listRecallManagementTables(ListRecallManagementTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRecallManagementTables").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementtables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecallManagementTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecallManagementTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResourceRules  ListResourceRulesRequest
     * @return ListResourceRulesResponse
     */
    @Override
    public CompletableFuture<ListResourceRulesResponse> listResourceRules(ListResourceRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResourceRules").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resourcerules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSampleConsistencyJobs  ListSampleConsistencyJobsRequest
     * @return ListSampleConsistencyJobsResponse
     */
    @Override
    public CompletableFuture<ListSampleConsistencyJobsResponse> listSampleConsistencyJobs(ListSampleConsistencyJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSampleConsistencyJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/sampleconsistencyjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSampleConsistencyJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSampleConsistencyJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListScenes  ListScenesRequest
     * @return ListScenesResponse
     */
    @Override
    public CompletableFuture<ListScenesResponse> listScenes(ListScenesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListScenes").setMethod(HttpMethod.GET).setPathRegex("/api/v1/scenes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListScenesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListScenesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSubCrowds  ListSubCrowdsRequest
     * @return ListSubCrowdsResponse
     */
    @Override
    public CompletableFuture<ListSubCrowdsResponse> listSubCrowds(ListSubCrowdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSubCrowds").setMethod(HttpMethod.GET).setPathRegex("/api/v1/crowds/{CrowdId}/subcrowds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubCrowdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubCrowdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTableMetas  ListTableMetasRequest
     * @return ListTableMetasResponse
     */
    @Override
    public CompletableFuture<ListTableMetasResponse> listTableMetas(ListTableMetasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTableMetas").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tablemetas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTableMetasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTableMetasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The <code>TrafficControlTargetId</code>, <code>InstanceId</code>, and <code>Environment</code> parameters are required.</li>
     * <li>You can use <code>StartTime</code> and <code>EndTime</code> to specify the time range.</li>
     * <li>The <code>Threshold</code> parameter is optional.</li>
     * <li>Use <code>ExperimentId</code> and <code>ExperimentGroupId</code> to filter data for a specific experiment or experiment group.</li>
     * <li>Use <code>ItemId</code> to filter traffic data for a specific item.</li>
     * <li>The supported environments are the Daily environment, pre-production environment (Pre), and production environment (Prod).</li>
     * </ul>
     * 
     * @param request the request parameters of ListTrafficControlTargetTrafficHistory  ListTrafficControlTargetTrafficHistoryRequest
     * @return ListTrafficControlTargetTrafficHistoryResponse
     */
    @Override
    public CompletableFuture<ListTrafficControlTargetTrafficHistoryResponse> listTrafficControlTargetTrafficHistory(ListTrafficControlTargetTrafficHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTrafficControlTargetTrafficHistory").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}/traffichistories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrafficControlTargetTrafficHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrafficControlTargetTrafficHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This API retrieves a list of traffic control tasks.</li>
     * <li>Use query parameters to filter and sort the results.</li>
     * <li>This operation supports pagination. You can also retrieve all results in a single response.</li>
     * <li>Note: The <code>InstanceId</code> is a required parameter. All other parameters are optional.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTrafficControlTasks  ListTrafficControlTasksRequest
     * @return ListTrafficControlTasksResponse
     */
    @Override
    public CompletableFuture<ListTrafficControlTasksResponse> listTrafficControlTasks(ListTrafficControlTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTrafficControlTasks").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrafficControlTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrafficControlTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OfflineExperiment  OfflineExperimentRequest
     * @return OfflineExperimentResponse
     */
    @Override
    public CompletableFuture<OfflineExperimentResponse> offlineExperiment(OfflineExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OfflineExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments/{ExperimentId}/action/offline").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OfflineExperimentGroup  OfflineExperimentGroupRequest
     * @return OfflineExperimentGroupResponse
     */
    @Override
    public CompletableFuture<OfflineExperimentGroupResponse> offlineExperimentGroup(OfflineExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OfflineExperimentGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}/action/offline").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OfflineLaboratory  OfflineLaboratoryRequest
     * @return OfflineLaboratoryResponse
     */
    @Override
    public CompletableFuture<OfflineLaboratoryResponse> offlineLaboratory(OfflineLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OfflineLaboratory").setMethod(HttpMethod.POST).setPathRegex("/api/v1/laboratories/{LaboratoryId}/action/offline").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Use this API to take a specific recall management service offline. Ensure that the provided <code>RecallManagementServiceId</code> and <code>InstanceId</code> are accurate to prevent unintended operations.</p>
     * <ul>
     * <li><strong>Important</strong>: Once a recall management service is taken offline, it stops processing new requests until you reactivate it.</li>
     * <li>Back up any required data or configurations before you perform this operation in case you need to restore the current state.</li>
     * </ul>
     * 
     * @param request the request parameters of OfflineRecallManagementService  OfflineRecallManagementServiceRequest
     * @return OfflineRecallManagementServiceResponse
     */
    @Override
    public CompletableFuture<OfflineRecallManagementServiceResponse> offlineRecallManagementService(OfflineRecallManagementServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OfflineRecallManagementService").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}/action/offline").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineRecallManagementServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineRecallManagementServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OnlineExperiment  OnlineExperimentRequest
     * @return OnlineExperimentResponse
     */
    @Override
    public CompletableFuture<OnlineExperimentResponse> onlineExperiment(OnlineExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OnlineExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments/{ExperimentId}/action/online").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnlineExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnlineExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OnlineExperimentGroup  OnlineExperimentGroupRequest
     * @return OnlineExperimentGroupResponse
     */
    @Override
    public CompletableFuture<OnlineExperimentGroupResponse> onlineExperimentGroup(OnlineExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OnlineExperimentGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}/action/online").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnlineExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnlineExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OnlineLaboratory  OnlineLaboratoryRequest
     * @return OnlineLaboratoryResponse
     */
    @Override
    public CompletableFuture<OnlineLaboratoryResponse> onlineLaboratory(OnlineLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OnlineLaboratory").setMethod(HttpMethod.POST).setPathRegex("/api/v1/laboratories/{LaboratoryId}/action/online").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnlineLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnlineLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>You can use this operation to bring a Recall Management Service online by specifying the Recall Management Service ID and the instance ID. Ensure that the <code>RecallManagementServiceId</code> and <code>InstanceId</code> are correct and that you have the required permissions.</p>
     * 
     * @param request the request parameters of OnlineRecallManagementService  OnlineRecallManagementServiceRequest
     * @return OnlineRecallManagementServiceResponse
     */
    @Override
    public CompletableFuture<OnlineRecallManagementServiceResponse> onlineRecallManagementService(OnlineRecallManagementServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OnlineRecallManagementService").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}/action/online").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnlineRecallManagementServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnlineRecallManagementServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request details</h2>
     * <p>This API synchronizes a specified MaxCompute table with the recall engine. You must provide the correct <code>RecallManagementTableId</code> in the path parameter and the instance ID in the request body. You can also specify the table partitions to publish, whether to skip the threshold check, and the synchronization mode. To publish specific partitions, provide them as key-value pairs in the <code>Partitions</code> field.</p>
     * 
     * @param request the request parameters of PublishRecallManagementTable  PublishRecallManagementTableRequest
     * @return PublishRecallManagementTableResponse
     */
    @Override
    public CompletableFuture<PublishRecallManagementTableResponse> publishRecallManagementTable(PublishRecallManagementTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishRecallManagementTable").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recallmanagementtables/{RecallManagementTableId}/action/publish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishRecallManagementTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishRecallManagementTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushAllExperiment  PushAllExperimentRequest
     * @return PushAllExperimentResponse
     */
    @Override
    public CompletableFuture<PushAllExperimentResponse> pushAllExperiment(PushAllExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushAllExperiment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/experiments/{ExperimentId}/action/pushall").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushAllExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushAllExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushResourceRule  PushResourceRuleRequest
     * @return PushResourceRuleResponse
     */
    @Override
    public CompletableFuture<PushResourceRuleResponse> pushResourceRule(PushResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushResourceRule").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}/action/push").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>The <code>DataDiagnosisId</code> parameter is required and specifies the data diagnosis task.</li>
     * <li>The <code>InstanceId</code> parameter is also required and specifies the instance.</li>
     * <li>The <code>StartDate</code> and <code>EndDate</code> parameters specify the start and end dates of the time range. The format is YYYY-MM-DD.</li>
     * <li>The <code>RemainRateType</code> parameter is optional. It specifies the retention rate report type. The default value is \&quot;Period\&quot;, which indicates a periodic report.</li>
     * <li>The response includes the request ID (<code>RequestId</code>) and a <code>Statistics</code> object. This object contains the dates of task failures (<code>FailedDates</code>) and dates with missing task data (<code>NoDataDates</code>).</li>
     * </ul>
     * 
     * @param request the request parameters of QueryDataDiagnosisStatistics  QueryDataDiagnosisStatisticsRequest
     * @return QueryDataDiagnosisStatisticsResponse
     */
    @Override
    public CompletableFuture<QueryDataDiagnosisStatisticsResponse> queryDataDiagnosisStatistics(QueryDataDiagnosisStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryDataDiagnosisStatistics").setMethod(HttpMethod.POST).setPathRegex("/api/v1/datadiagnoses/{DataDiagnosisId}/statistics/action/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDataDiagnosisStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDataDiagnosisStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API retrieves records from a specific recall management table using the provided primary keys. You must provide a valid <code>InstanceId</code> and <code>RecallManagementTableId</code>, and a non-empty <code>PrimaryKeys</code> list. If you specify <code>RecallManagementTableVersionId</code>, the API returns records from that version; otherwise, it uses the currently published version.</p>
     * 
     * @param request the request parameters of QueryRecallManagementTableRecords  QueryRecallManagementTableRecordsRequest
     * @return QueryRecallManagementTableRecordsResponse
     */
    @Override
    public CompletableFuture<QueryRecallManagementTableRecordsResponse> queryRecallManagementTableRecords(QueryRecallManagementTableRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryRecallManagementTableRecords").setMethod(HttpMethod.GET).setPathRegex("/api/v1/recallmanagementtables/{RecallManagementTableId}/queryrecords").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecallManagementTableRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecallManagementTableRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySampleConsistencyJobDifference  QuerySampleConsistencyJobDifferenceRequest
     * @return QuerySampleConsistencyJobDifferenceResponse
     */
    @Override
    public CompletableFuture<QuerySampleConsistencyJobDifferenceResponse> querySampleConsistencyJobDifference(QuerySampleConsistencyJobDifferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QuerySampleConsistencyJobDifference").setMethod(HttpMethod.GET).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}/action/querydifference").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySampleConsistencyJobDifferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySampleConsistencyJobDifferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>Use this API to query the details of single-item control for a given traffic control target on a specified date and for a specific instance ID and environment. The details include traffic data and feature information for the top 100 items before and after the control is applied. Ensure that the <code>TrafficControlTargetId</code>, <code>InstanceId</code>, and <code>Environment</code> parameters are accurate, and that the <code>Date</code> is in YYYY-MM-DD format. Although the <code>Date</code> parameter is optional, we recommend specifying a date for meaningful results.</p>
     * 
     * @param request the request parameters of QueryTrafficControlTargetItemReportDetail  QueryTrafficControlTargetItemReportDetailRequest
     * @return QueryTrafficControlTargetItemReportDetailResponse
     */
    @Override
    public CompletableFuture<QueryTrafficControlTargetItemReportDetailResponse> queryTrafficControlTargetItemReportDetail(QueryTrafficControlTargetItemReportDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryTrafficControlTargetItemReportDetail").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}/itemcontrolreportdetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTrafficControlTargetItemReportDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTrafficControlTargetItemReportDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can call this operation to query the deployment result of a traffic control task specified by TrafficControlTaskId for a given instance ID and environment. Make sure that the specified InstanceId is associated with your account and that the Environment parameter value is valid (Daily for daily environment, Pre for staging environment, Prod for production environment). All request parameters are required.</p>
     * 
     * @param request the request parameters of QueryTrafficControlTaskDeployResult  QueryTrafficControlTaskDeployResultRequest
     * @return QueryTrafficControlTaskDeployResultResponse
     */
    @Override
    public CompletableFuture<QueryTrafficControlTaskDeployResultResponse> queryTrafficControlTaskDeployResult(QueryTrafficControlTaskDeployResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryTrafficControlTaskDeployResult").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/queryresult").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTrafficControlTaskDeployResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTrafficControlTaskDeployResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This API retrieves the item control results for a specific traffic control task within a given time range.</li>
     * <li><code>TrafficControlTaskId</code> is the unique identifier for a traffic control task.</li>
     * <li><code>InstanceId</code> specifies the instance that runs the task.</li>
     * <li>The <code>Environment</code> parameter specifies the task\&quot;s execution environment. Valid values are Daily (development environment), Pre (staging environment), and Prod (production environment).</li>
     * <li><code>StartTime</code> and <code>EndTime</code> specify the start and end of the time range for the report, respectively. The format is &quot;YYYY-MM-DD HH:MM:SS&quot;.</li>
     * <li>The specified start and end times must be valid and span no more than two consecutive calendar days.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryTrafficControlTaskItemReport  QueryTrafficControlTaskItemReportRequest
     * @return QueryTrafficControlTaskItemReportResponse
     */
    @Override
    public CompletableFuture<QueryTrafficControlTaskItemReportResponse> queryTrafficControlTaskItemReport(QueryTrafficControlTaskItemReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryTrafficControlTaskItemReport").setMethod(HttpMethod.GET).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/queryitemreport").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTrafficControlTaskItemReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTrafficControlTaskItemReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>Use this API to release a traffic control task for a specific instance and environment (Daily, Pre, or Prod). Your request must include the <code>TrafficControlTaskId</code>, <code>InstanceId</code>, and <code>Environment</code> parameters.</p>
     * <ul>
     * <li><code>TrafficControlTaskId</code>: The unique ID of the traffic control task.</li>
     * <li><code>InstanceId</code>: The ID of the target instance.</li>
     * <li><code>Environment</code>: The execution environment for the traffic control task. Valid values: <code>Daily</code>, <code>Pre</code>, and <code>Prod</code>.
     * The request succeeds only if all required parameters are provided correctly. A successful response includes a <code>RequestId</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseTrafficControlTask  ReleaseTrafficControlTaskRequest
     * @return ReleaseTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<ReleaseTrafficControlTaskResponse> releaseTrafficControlTask(ReleaseTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReleaseTrafficControlTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/release").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReportABMetricGroup  ReportABMetricGroupRequest
     * @return ReportABMetricGroupResponse
     */
    @Override
    public CompletableFuture<ReportABMetricGroupResponse> reportABMetricGroup(ReportABMetricGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReportABMetricGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/abmetricgroups/{ABMetricGroupId}/action/report").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReportABMetricGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReportABMetricGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReportSampleConsistencyJob  ReportSampleConsistencyJobRequest
     * @return ReportSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<ReportSampleConsistencyJobResponse> reportSampleConsistencyJob(ReportSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReportSampleConsistencyJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}/action/report").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReportSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReportSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation sends conversation messages to the AI shopping assistant and supports Server-Sent Events (SSE).</li>
     * <li><code>InstanceId</code>, <code>SessionId</code>, <code>SceneId</code>, <code>ServiceId</code>, <code>Environment</code>, <code>Uid</code>, and <code>Language</code> are required parameters. Ensure the accuracy of these parameters to get the best response.</li>
     * <li><code>InputMessage</code> must contain at least one text-type message that describes the user\&quot;s request or question.</li>
     * <li>Based on the provided input, the system returns corresponding recommendation results or other relevant information.</li>
     * <li>Check the returned <code>StopReason</code> field to understand whether the session has ended and the reason.</li>
     * </ul>
     * 
     * @param request the request parameters of ShoppingAssistant  ShoppingAssistantRequest
     * @return ShoppingAssistantResponse
     */
    @Override
    public CompletableFuture<ShoppingAssistantResponse> shoppingAssistant(ShoppingAssistantRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ShoppingAssistant").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/shopping_assistant/chat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ShoppingAssistantResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ShoppingAssistantResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> shoppingAssistantWithAsyncResponseHandler(ShoppingAssistantRequest request, AsyncResponseHandler<ShoppingAssistantResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ShoppingAssistant").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/shopping_assistant/chat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(ShoppingAssistantResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((ShoppingAssistantResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ShoppingAssistantResponseBody> shoppingAssistantWithResponseIterable(ShoppingAssistantRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ShoppingAssistant").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/shopping_assistant/chat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        ShoppingAssistantResponseBodyIterator iterator = ShoppingAssistantResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * <b>description</b> :
     * <p>Splits the target values for a traffic control target into time intervals.</p>
     * 
     * @param request the request parameters of SplitTrafficControlTarget  SplitTrafficControlTargetRequest
     * @return SplitTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<SplitTrafficControlTargetResponse> splitTrafficControlTarget(SplitTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SplitTrafficControlTarget").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}/action/split").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SplitTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SplitTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>Call this operation to start a traffic control task by providing the <code>TrafficControlTargetId</code> and <code>InstanceId</code>.</p>
     * 
     * @param request the request parameters of StartTrafficControlTarget  StartTrafficControlTargetRequest
     * @return StartTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<StartTrafficControlTargetResponse> startTrafficControlTarget(StartTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartTrafficControlTarget").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}/action/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request details</h2>
     * <ul>
     * <li>This operation starts the traffic control task identified by <code>TrafficControlTaskId</code>.</li>
     * <li><code>InstanceId</code> specifies the target instance.</li>
     * <li><code>Environment</code> specifies the target environment. Valid values: Daily, Pre, and Prod.</li>
     * <li>Ensure that all required parameters are set correctly before you call this operation. The specified <code>TrafficControlTaskId</code> must exist in the system.</li>
     * </ul>
     * 
     * @param request the request parameters of StartTrafficControlTask  StartTrafficControlTaskRequest
     * @return StartTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<StartTrafficControlTaskResponse> startTrafficControlTask(StartTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartTrafficControlTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopSampleConsistencyJob  StopSampleConsistencyJobRequest
     * @return StopSampleConsistencyJobResponse
     */
    @Override
    public CompletableFuture<StopSampleConsistencyJobResponse> stopSampleConsistencyJob(StopSampleConsistencyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopSampleConsistencyJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/sampleconsistencyjobs/{SampleConsistencyJobId}/action/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopSampleConsistencyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopSampleConsistencyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>You can call this operation to stop a specific traffic control Flink task based on the specified TrafficControlTaskId. Make sure that you have prepared the correct InstanceId and the environment to which the instance belongs (Daily for daily environment, Pre for staging environment, Prod for production environment). Include this information in the request body to ensure that the operation is correctly performed.</p>
     * 
     * @param request the request parameters of StopTrafficControlFlinkTask  StopTrafficControlFlinkTaskRequest
     * @return StopTrafficControlFlinkTaskResponse
     */
    @Override
    public CompletableFuture<StopTrafficControlFlinkTaskResponse> stopTrafficControlFlinkTask(StopTrafficControlFlinkTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopTrafficControlFlinkTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/stopflink").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTrafficControlFlinkTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTrafficControlFlinkTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This operation stops a traffic control task using the provided <code>TrafficControlTargetId</code> and <code>InstanceId</code>. Ensure that the parameter values are accurate to avoid stopping the wrong target or instance.</p>
     * 
     * @param request the request parameters of StopTrafficControlTarget  StopTrafficControlTargetRequest
     * @return StopTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<StopTrafficControlTargetResponse> stopTrafficControlTarget(StopTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopTrafficControlTarget").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}/action/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>This API stops a traffic control task identified by a specific <code>TrafficControlTaskId</code>.</li>
     * <li>The <code>InstanceId</code> and <code>Environment</code> parameters are required to identify the target instance and its environment.</li>
     * <li>Ensure that you provide the correct <code>TrafficControlTaskId</code> to prevent the request from failing.</li>
     * </ul>
     * 
     * @param request the request parameters of StopTrafficControlTask  StopTrafficControlTaskRequest
     * @return StopTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<StopTrafficControlTaskResponse> stopTrafficControlTask(StopTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopTrafficControlTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncFeatureConsistencyCheckJobReplayLog  SyncFeatureConsistencyCheckJobReplayLogRequest
     * @return SyncFeatureConsistencyCheckJobReplayLogResponse
     */
    @Override
    public CompletableFuture<SyncFeatureConsistencyCheckJobReplayLogResponse> syncFeatureConsistencyCheckJobReplayLog(SyncFeatureConsistencyCheckJobReplayLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncFeatureConsistencyCheckJobReplayLog").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobs/action/syncreplaylog").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncFeatureConsistencyCheckJobReplayLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncFeatureConsistencyCheckJobReplayLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TerminateFeatureConsistencyCheckJob  TerminateFeatureConsistencyCheckJobRequest
     * @return TerminateFeatureConsistencyCheckJobResponse
     */
    @Override
    public CompletableFuture<TerminateFeatureConsistencyCheckJobResponse> terminateFeatureConsistencyCheckJob(TerminateFeatureConsistencyCheckJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TerminateFeatureConsistencyCheckJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/featureconsistencycheck/jobs/{FeatureConsistencyCheckJobId}/action/terminate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminateFeatureConsistencyCheckJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminateFeatureConsistencyCheckJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation allows you to update the attributes of a specified ABTest metric, including whether to calculate significance and the aggregation method. Make sure that you have obtained the correct <code>ABMetricId</code> before calling this operation.</p>
     * <ul>
     * <li><code>NeedSignificance</code>: Specifies whether to perform significance analysis on the current metric. Default value: <code>false</code>.</li>
     * <li><code>AggregationByUser</code>: When significance calculation is enabled, specifies whether to aggregate data by user or by sample. Default value: <code>false</code> (by sample).</li>
     * <li><code>Numerator</code> and <code>Denominator</code>: The specific definitions of the numerator and denominator used in significance calculation.</li>
     * <li><code>IsBinomialDistribution</code>: Valid only for derived metrics. Specifies whether the metric follows a binomial distribution, which affects subsequent data processing logic.
     * Note: You do not need to provide all fields at the same time. Include only the parameters whose values you want to change in the request body.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateABMetric  UpdateABMetricRequest
     * @return UpdateABMetricResponse
     */
    @Override
    public CompletableFuture<UpdateABMetricResponse> updateABMetric(UpdateABMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateABMetric").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/abmetrics/{ABMetricId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateABMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateABMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateABMetricGroup  UpdateABMetricGroupRequest
     * @return UpdateABMetricGroupResponse
     */
    @Override
    public CompletableFuture<UpdateABMetricGroupResponse> updateABMetricGroup(UpdateABMetricGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateABMetricGroup").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/abmetricgroups/{ABMetricGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateABMetricGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateABMetricGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCrowd  UpdateCrowdRequest
     * @return UpdateCrowdResponse
     */
    @Override
    public CompletableFuture<UpdateCrowdResponse> updateCrowd(UpdateCrowdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCrowd").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/crowds/{CrowdId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCrowdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCrowdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API updates the configuration of an existing data diagnosis task, including the instance ID, task name, task type, and specific configuration content. Provide the <code>DataDiagnosisId</code> in the request path to identify the task to update. You must also specify the <code>Config</code> parameter based on the task <code>Type</code>. For periodic runs, set the execution time in the <code>CycleTime</code> field. If a periodic run is not required, omit this field.</p>
     * <h2>Usage notes</h2>
     * <ul>
     * <li><code>DataDiagnosisId</code> is a required path parameter that uniquely identifies a data diagnosis task.</li>
     * <li>The structure of the <code>Config</code> field varies depending on the value of <code>Type</code>. Refer to the examples in this document for configuration details.</li>
     * <li>To disable periodic runs, omit the <code>CycleTime</code> field.</li>
     * <li>When updating a task for two-table join analysis (<code>JoinTables</code>), provide the information for the left and right tables, including <code>LeftTableMetaId</code> and <code>RightTableMetaId</code>.</li>
     * <li>The <code>InstanceId</code>, <code>Name</code>, and <code>Type</code> parameters are required for all types of data diagnosis tasks.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDataDiagnosis  UpdateDataDiagnosisRequest
     * @return UpdateDataDiagnosisResponse
     */
    @Override
    public CompletableFuture<UpdateDataDiagnosisResponse> updateDataDiagnosis(UpdateDataDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDataDiagnosis").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/datadiagnoses/{DataDiagnosisId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEngineConfig  UpdateEngineConfigRequest
     * @return UpdateEngineConfigResponse
     */
    @Override
    public CompletableFuture<UpdateEngineConfigResponse> updateEngineConfig(UpdateEngineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateEngineConfig").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/engineconfigs/{EngineConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEngineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEngineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExperiment  UpdateExperimentRequest
     * @return UpdateExperimentResponse
     */
    @Override
    public CompletableFuture<UpdateExperimentResponse> updateExperiment(UpdateExperimentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExperiment").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/experiments/{ExperimentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExperimentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExperimentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExperimentGroup  UpdateExperimentGroupRequest
     * @return UpdateExperimentGroupResponse
     */
    @Override
    public CompletableFuture<UpdateExperimentGroupResponse> updateExperimentGroup(UpdateExperimentGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExperimentGroup").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/experimentgroups/{ExperimentGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExperimentGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExperimentGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation allows you to update the configuration of an existing feature consistency check task. By providing new configuration parameters, you can modify multiple properties including the instance ID, name, and scene ID. Ensure that all required parameters are included in the request, and provide optional parameters as needed.</p>
     * <ul>
     * <li><strong>FeatureConsistencyCheckJobConfigId</strong> is a path parameter that specifies the feature consistency check task to update.</li>
     * <li>All other parameters are in the request body. Some are required (such as InstanceId and Name), and the rest are optional.</li>
     * <li>The SampleRate value must be a floating-point number between 0 and 1, which indicates the sampling ratio.</li>
     * <li>If you use FeatureStore-related features, make sure that you correctly set the IsUseFeatureStore flag and the related FeatureStore* fields.</li>
     * <li>For network configuration parameters (such as VpcId and SwitchId), make sure that the values match your Alibaba Cloud environment.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateFeatureConsistencyCheckJobConfig  UpdateFeatureConsistencyCheckJobConfigRequest
     * @return UpdateFeatureConsistencyCheckJobConfigResponse
     */
    @Override
    public CompletableFuture<UpdateFeatureConsistencyCheckJobConfigResponse> updateFeatureConsistencyCheckJobConfig(UpdateFeatureConsistencyCheckJobConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFeatureConsistencyCheckJobConfig").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/featureconsistencycheck/jobconfigs/{FeatureConsistencyCheckJobConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFeatureConsistencyCheckJobConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFeatureConsistencyCheckJobConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceResource  UpdateInstanceResourceRequest
     * @return UpdateInstanceResourceResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceResourceResponse> updateInstanceResource(UpdateInstanceResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstanceResource").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/instances/{InstanceId}/resources/{ResourceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLaboratory  UpdateLaboratoryRequest
     * @return UpdateLaboratoryResponse
     */
    @Override
    public CompletableFuture<UpdateLaboratoryResponse> updateLaboratory(UpdateLaboratoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLaboratory").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/laboratories/{LaboratoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLaboratoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLaboratoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLayer  UpdateLayerRequest
     * @return UpdateLayerResponse
     */
    @Override
    public CompletableFuture<UpdateLayerResponse> updateLayer(UpdateLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLayer").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/layers/{LayerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateParam  UpdateParamRequest
     * @return UpdateParamResponse
     */
    @Override
    public CompletableFuture<UpdateParamResponse> updateParam(UpdateParamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateParam").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/params/{ParamId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateParamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateParamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li><code>InstanceId</code> is required. It specifies the instance to update.</li>
     * <li><code>Password</code> and <code>NetworkConfigs</code> are optional.</li>
     * <li>Use <code>NetworkConfigs</code> to define the network by specifying the Virtual Private Cloud (VPC) ID (<code>VpcId</code>) and mapping availability zones to VSwitch IDs (<code>VswitchIds</code>).</li>
     * <li>Note: Ensure that sensitive information, such as the password, is transmitted securely.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRecallManagementConfig  UpdateRecallManagementConfigRequest
     * @return UpdateRecallManagementConfigResponse
     */
    @Override
    public CompletableFuture<UpdateRecallManagementConfigResponse> updateRecallManagementConfig(UpdateRecallManagementConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRecallManagementConfig").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/recallmanagementconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRecallManagementConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRecallManagementConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation updates the instance ID and description of a specific recall management service. Make sure to specify the <code>InstanceId</code> and <code>Description</code> fields in the request body.</p>
     * <ul>
     * <li><strong>RecallManagementServiceId</strong>: The unique identifier of the recall management service.</li>
     * <li><strong>InstanceId</strong>: The instance ID to associate with this recall management service.</li>
     * <li><strong>Description</strong>: A new description for the recall management service.
     * Note: You must provide all required parameters, or the update may fail.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRecallManagementService  UpdateRecallManagementServiceRequest
     * @return UpdateRecallManagementServiceResponse
     */
    @Override
    public CompletableFuture<UpdateRecallManagementServiceResponse> updateRecallManagementService(UpdateRecallManagementServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRecallManagementService").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRecallManagementServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRecallManagementServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API updates the recall and merge configurations for a specific recall management service version. Your request must include the correct <code>InstanceId</code> and the configurations to update. Refer to the parameter descriptions for details on required parameters.</p>
     * 
     * @param request the request parameters of UpdateRecallManagementServiceVersionConfig  UpdateRecallManagementServiceVersionConfigRequest
     * @return UpdateRecallManagementServiceVersionConfigResponse
     */
    @Override
    public CompletableFuture<UpdateRecallManagementServiceVersionConfigResponse> updateRecallManagementServiceVersionConfig(UpdateRecallManagementServiceVersionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRecallManagementServiceVersionConfig").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/recallmanagementservices/{RecallManagementServiceId}/versions/{RecallManagementServiceVersionId}/configs/{RecallManagementServiceVersionConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRecallManagementServiceVersionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRecallManagementServiceVersionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request details</h2>
     * <ul>
     * <li>Updates the recall management table specified by <code>RecallManagementTableId</code>.</li>
     * <li>You can enable fluctuation thresholds for the row count or data size and define the specific ranges for these thresholds.</li>
     * <li>You can add or modify fields in the table, including their names, types, and attributes.</li>
     * <li>The <code>InstanceId</code> parameter is required and identifies the specific instance.</li>
     * <li>For vector-related fields, you can also specify the vector dimension and metric type.</li>
     * <li>Note: Optional parameters in the request body selectively update the target table.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRecallManagementTable  UpdateRecallManagementTableRequest
     * @return UpdateRecallManagementTableResponse
     */
    @Override
    public CompletableFuture<UpdateRecallManagementTableResponse> updateRecallManagementTable(UpdateRecallManagementTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRecallManagementTable").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/recallmanagementtables/{RecallManagementTableId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRecallManagementTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRecallManagementTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateResourceRule  UpdateResourceRuleRequest
     * @return UpdateResourceRuleResponse
     */
    @Override
    public CompletableFuture<UpdateResourceRuleResponse> updateResourceRule(UpdateResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateResourceRule").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateResourceRuleItem  UpdateResourceRuleItemRequest
     * @return UpdateResourceRuleItemResponse
     */
    @Override
    public CompletableFuture<UpdateResourceRuleItemResponse> updateResourceRuleItem(UpdateResourceRuleItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateResourceRuleItem").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resourcerules/{ResourceRuleId}/items/{ResourceRuleItemId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceRuleItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceRuleItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateScene  UpdateSceneRequest
     * @return UpdateSceneResponse
     */
    @Override
    public CompletableFuture<UpdateSceneResponse> updateScene(UpdateSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateScene").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/scenes/{SceneId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTableMeta  UpdateTableMetaRequest
     * @return UpdateTableMetaResponse
     */
    @Override
    public CompletableFuture<UpdateTableMetaResponse> updateTableMeta(UpdateTableMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTableMeta").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/tablemetas/{TableMetaId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTableMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTableMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>Updates a traffic control target specified by its ID.</li>
     * <li><code>TrafficControlTargetId</code> is a path parameter that specifies the ID of the traffic control target to update.</li>
     * <li>The <code>ItemConditionType</code> parameter specifies the format of the item condition, which can be either <code>Array</code> or <code>Expression</code>. Based on your selection, you must provide a value for either the <code>ItemConditionArray</code> or <code>ItemConditionExpress</code> parameter.</li>
     * <li>If <code>NewProductRegulation</code> is set to <code>true</code>, the control rule applies to a new product.</li>
     * <li>The <code>StatisPeriod</code> parameter specifies the statistics period. Valid values are <code>Daily</code> and <code>hourly</code>.</li>
     * <li>Ensure that the time interval between <code>StartTime</code> and <code>EndTime</code> is reasonable and meets your business requirements.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTrafficControlTarget  UpdateTrafficControlTargetRequest
     * @return UpdateTrafficControlTargetResponse
     */
    @Override
    public CompletableFuture<UpdateTrafficControlTargetResponse> updateTrafficControlTarget(UpdateTrafficControlTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTrafficControlTarget").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/trafficcontroltargets/{TrafficControlTargetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrafficControlTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrafficControlTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Use this API to update an existing traffic control task.</li>
     * <li>When <code>ExecutionTime</code> is set to <code>TimeRange</code>, you must also provide <code>StartTime</code> and <code>EndTime</code>.</li>
     * <li>Each element in the <code>TrafficControlTargets</code> array is a traffic control target. Ensure each target\&quot;s time range, condition type, and other information are complete and valid.</li>
     * <li>If you set <code>UserConditionType</code> or <code>ItemConditionType</code> to <code>Expression</code>, you must specify the corresponding expression field (for example, <code>UserConditionExpress</code>).</li>
     * <li><code>ServiceIds</code> and <code>EffectiveSceneIds</code> are optional parameters. If you include them, ensure the ID lists are correctly formatted.</li>
     * <li>Ensure you complete all required fields to avoid a failed request.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTrafficControlTask  UpdateTrafficControlTaskRequest
     * @return UpdateTrafficControlTaskResponse
     */
    @Override
    public CompletableFuture<UpdateTrafficControlTaskResponse> updateTrafficControlTask(UpdateTrafficControlTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTrafficControlTask").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrafficControlTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrafficControlTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API updates the traffic configuration for a specific traffic control task. The configuration includes the traffic control target ID, record time, target traffic, and overall traffic. Ensure that the provided<code>TrafficControlTaskId</code> is valid and within your permission scope. Additionally, each object in the<code>Traffics</code> array must contain the required fields.</p>
     * 
     * @param request the request parameters of UpdateTrafficControlTaskTraffic  UpdateTrafficControlTaskTrafficRequest
     * @return UpdateTrafficControlTaskTrafficResponse
     */
    @Override
    public CompletableFuture<UpdateTrafficControlTaskTrafficResponse> updateTrafficControlTaskTraffic(UpdateTrafficControlTaskTrafficRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTrafficControlTaskTraffic").setMethod(HttpMethod.POST).setPathRegex("/api/v1/trafficcontroltasks/{TrafficControlTaskId}/action/traffic").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrafficControlTaskTrafficResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrafficControlTaskTrafficResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UploadRecommendationData  UploadRecommendationDataRequest
     * @return UploadRecommendationDataResponse
     */
    @Override
    public CompletableFuture<UploadRecommendationDataResponse> uploadRecommendationData(UploadRecommendationDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UploadRecommendationData").setMethod(HttpMethod.POST).setPathRegex("/api/v1/recommendationdata/action/upload").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadRecommendationDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadRecommendationDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
