// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pairecservice20221213.models.*;
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
     * @param request the request parameters of ApplyEngineConfig  ApplyEngineConfigRequest
     * @return ApplyEngineConfigResponse
     */
    CompletableFuture<ApplyEngineConfigResponse> applyEngineConfig(ApplyEngineConfigRequest request);

    /**
     * @param request the request parameters of BackflowFeatureConsistencyCheckJobData  BackflowFeatureConsistencyCheckJobDataRequest
     * @return BackflowFeatureConsistencyCheckJobDataResponse
     */
    CompletableFuture<BackflowFeatureConsistencyCheckJobDataResponse> backflowFeatureConsistencyCheckJobData(BackflowFeatureConsistencyCheckJobDataRequest request);

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
    CompletableFuture<ChangeRecallManagementServiceVersionResponse> changeRecallManagementServiceVersion(ChangeRecallManagementServiceVersionRequest request);

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
    CompletableFuture<ChatConversationResponse> chatConversation(ChatConversationRequest request);

    ResponseIterable<ChatConversationResponseBody> chatConversationWithResponseIterable(ChatConversationRequest request);

    /**
     * @param request the request parameters of CheckInstanceResources  CheckInstanceResourcesRequest
     * @return CheckInstanceResourcesResponse
     */
    CompletableFuture<CheckInstanceResourcesResponse> checkInstanceResources(CheckInstanceResourcesRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This operation validates a traffic control task expression for a specific instance and table. Provide the correct <code>InstanceId</code>, <code>TableMetaId</code>, and <code>Expression</code> parameters.</p>
     * 
     * @param request the request parameters of CheckTrafficControlTaskExpression  CheckTrafficControlTaskExpressionRequest
     * @return CheckTrafficControlTaskExpressionResponse
     */
    CompletableFuture<CheckTrafficControlTaskExpressionResponse> checkTrafficControlTaskExpression(CheckTrafficControlTaskExpressionRequest request);

    /**
     * @param request the request parameters of CloneEngineConfig  CloneEngineConfigRequest
     * @return CloneEngineConfigResponse
     */
    CompletableFuture<CloneEngineConfigResponse> cloneEngineConfig(CloneEngineConfigRequest request);

    /**
     * @param request the request parameters of CloneExperiment  CloneExperimentRequest
     * @return CloneExperimentResponse
     */
    CompletableFuture<CloneExperimentResponse> cloneExperiment(CloneExperimentRequest request);

    /**
     * @param request the request parameters of CloneExperimentGroup  CloneExperimentGroupRequest
     * @return CloneExperimentGroupResponse
     */
    CompletableFuture<CloneExperimentGroupResponse> cloneExperimentGroup(CloneExperimentGroupRequest request);

    /**
     * @param request the request parameters of CloneFeatureConsistencyCheckJobConfig  CloneFeatureConsistencyCheckJobConfigRequest
     * @return CloneFeatureConsistencyCheckJobConfigResponse
     */
    CompletableFuture<CloneFeatureConsistencyCheckJobConfigResponse> cloneFeatureConsistencyCheckJobConfig(CloneFeatureConsistencyCheckJobConfigRequest request);

    /**
     * @param request the request parameters of CloneLaboratory  CloneLaboratoryRequest
     * @return CloneLaboratoryResponse
     */
    CompletableFuture<CloneLaboratoryResponse> cloneLaboratory(CloneLaboratoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API clones an existing traffic control task to another specified instance. Ensure that the <code>InstanceId</code> you provide is valid and that you have the required permissions for the target instance.
     * Note: The cloning process does not affect the status or configuration of the original task.</p>
     * 
     * @param request the request parameters of CloneTrafficControlTask  CloneTrafficControlTaskRequest
     * @return CloneTrafficControlTaskResponse
     */
    CompletableFuture<CloneTrafficControlTaskResponse> cloneTrafficControlTask(CloneTrafficControlTaskRequest request);

    /**
     * @param request the request parameters of CompareSampleConsistencyJob  CompareSampleConsistencyJobRequest
     * @return CompareSampleConsistencyJobResponse
     */
    CompletableFuture<CompareSampleConsistencyJobResponse> compareSampleConsistencyJob(CompareSampleConsistencyJobRequest request);

    /**
     * @param request the request parameters of CreateABMetric  CreateABMetricRequest
     * @return CreateABMetricResponse
     */
    CompletableFuture<CreateABMetricResponse> createABMetric(CreateABMetricRequest request);

    /**
     * @param request the request parameters of CreateABMetricGroup  CreateABMetricGroupRequest
     * @return CreateABMetricGroupResponse
     */
    CompletableFuture<CreateABMetricGroupResponse> createABMetricGroup(CreateABMetricGroupRequest request);

    /**
     * @param request the request parameters of CreateCalculationJobs  CreateCalculationJobsRequest
     * @return CreateCalculationJobsResponse
     */
    CompletableFuture<CreateCalculationJobsResponse> createCalculationJobs(CreateCalculationJobsRequest request);

    /**
     * @param request the request parameters of CreateCrowd  CreateCrowdRequest
     * @return CreateCrowdResponse
     */
    CompletableFuture<CreateCrowdResponse> createCrowd(CreateCrowdRequest request);

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
    CompletableFuture<CreateDataDiagnosisResponse> createDataDiagnosis(CreateDataDiagnosisRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This operation creates a data diagnosis (rerun) job for a specific instance within a specified time frame. To ensure the job runs correctly, provide accurate values for the <code>DataDiagnosisId</code>, <code>InstanceId</code>, <code>StartDate</code>, and <code>EndDate</code> parameters.</p>
     * 
     * @param request the request parameters of CreateDataDiagnosisJobs  CreateDataDiagnosisJobsRequest
     * @return CreateDataDiagnosisJobsResponse
     */
    CompletableFuture<CreateDataDiagnosisJobsResponse> createDataDiagnosisJobs(CreateDataDiagnosisJobsRequest request);

    /**
     * @param request the request parameters of CreateEngineConfig  CreateEngineConfigRequest
     * @return CreateEngineConfigResponse
     */
    CompletableFuture<CreateEngineConfigResponse> createEngineConfig(CreateEngineConfigRequest request);

    /**
     * @param request the request parameters of CreateExperiment  CreateExperimentRequest
     * @return CreateExperimentResponse
     */
    CompletableFuture<CreateExperimentResponse> createExperiment(CreateExperimentRequest request);

    /**
     * @param request the request parameters of CreateExperimentGroup  CreateExperimentGroupRequest
     * @return CreateExperimentGroupResponse
     */
    CompletableFuture<CreateExperimentGroupResponse> createExperimentGroup(CreateExperimentGroupRequest request);

    /**
     * @param request the request parameters of CreateFeatureConsistencyCheckJob  CreateFeatureConsistencyCheckJobRequest
     * @return CreateFeatureConsistencyCheckJobResponse
     */
    CompletableFuture<CreateFeatureConsistencyCheckJobResponse> createFeatureConsistencyCheckJob(CreateFeatureConsistencyCheckJobRequest request);

    /**
     * @param request the request parameters of CreateFeatureConsistencyCheckJobConfig  CreateFeatureConsistencyCheckJobConfigRequest
     * @return CreateFeatureConsistencyCheckJobConfigResponse
     */
    CompletableFuture<CreateFeatureConsistencyCheckJobConfigResponse> createFeatureConsistencyCheckJobConfig(CreateFeatureConsistencyCheckJobConfigRequest request);

    /**
     * @param request the request parameters of CreateInstanceResource  CreateInstanceResourceRequest
     * @return CreateInstanceResourceResponse
     */
    CompletableFuture<CreateInstanceResourceResponse> createInstanceResource(CreateInstanceResourceRequest request);

    /**
     * @param request the request parameters of CreateLaboratory  CreateLaboratoryRequest
     * @return CreateLaboratoryResponse
     */
    CompletableFuture<CreateLaboratoryResponse> createLaboratory(CreateLaboratoryRequest request);

    /**
     * @param request the request parameters of CreateLayer  CreateLayerRequest
     * @return CreateLayerResponse
     */
    CompletableFuture<CreateLayerResponse> createLayer(CreateLayerRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description.</h2>
     * 
     * @param request the request parameters of CreateParam  CreateParamRequest
     * @return CreateParamResponse
     */
    CompletableFuture<CreateParamResponse> createParam(CreateParamRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * 
     * @param request the request parameters of CreateRecallManagementConfig  CreateRecallManagementConfigRequest
     * @return CreateRecallManagementConfigResponse
     */
    CompletableFuture<CreateRecallManagementConfigResponse> createRecallManagementConfig(CreateRecallManagementConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>To create a recall management service, call this API with a specified instance ID, service name, and service description. Ensure that the <code>InstanceId</code> parameter is valid.</p>
     * 
     * @param request the request parameters of CreateRecallManagementService  CreateRecallManagementServiceRequest
     * @return CreateRecallManagementServiceResponse
     */
    CompletableFuture<CreateRecallManagementServiceResponse> createRecallManagementService(CreateRecallManagementServiceRequest request);

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
    CompletableFuture<CreateRecallManagementServiceVersionResponse> createRecallManagementServiceVersion(CreateRecallManagementServiceVersionRequest request);

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
    CompletableFuture<CreateRecallManagementServiceVersionConfigResponse> createRecallManagementServiceVersionConfig(CreateRecallManagementServiceVersionConfigRequest request);

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
    CompletableFuture<CreateRecallManagementTableResponse> createRecallManagementTable(CreateRecallManagementTableRequest request);

    /**
     * @param request the request parameters of CreateResourceRule  CreateResourceRuleRequest
     * @return CreateResourceRuleResponse
     */
    CompletableFuture<CreateResourceRuleResponse> createResourceRule(CreateResourceRuleRequest request);

    /**
     * @param request the request parameters of CreateResourceRuleItem  CreateResourceRuleItemRequest
     * @return CreateResourceRuleItemResponse
     */
    CompletableFuture<CreateResourceRuleItemResponse> createResourceRuleItem(CreateResourceRuleItemRequest request);

    /**
     * @param request the request parameters of CreateSampleConsistencyJob  CreateSampleConsistencyJobRequest
     * @return CreateSampleConsistencyJobResponse
     */
    CompletableFuture<CreateSampleConsistencyJobResponse> createSampleConsistencyJob(CreateSampleConsistencyJobRequest request);

    /**
     * @param request the request parameters of CreateScene  CreateSceneRequest
     * @return CreateSceneResponse
     */
    CompletableFuture<CreateSceneResponse> createScene(CreateSceneRequest request);

    /**
     * @param request the request parameters of CreateSubCrowd  CreateSubCrowdRequest
     * @return CreateSubCrowdResponse
     */
    CompletableFuture<CreateSubCrowdResponse> createSubCrowd(CreateSubCrowdRequest request);

    /**
     * @param request the request parameters of CreateTableMeta  CreateTableMetaRequest
     * @return CreateTableMetaResponse
     */
    CompletableFuture<CreateTableMetaResponse> createTableMeta(CreateTableMetaRequest request);

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
    CompletableFuture<CreateTrafficControlTargetResponse> createTrafficControlTarget(CreateTrafficControlTargetRequest request);

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
    CompletableFuture<CreateTrafficControlTaskResponse> createTrafficControlTask(CreateTrafficControlTaskRequest request);

    /**
     * @param request the request parameters of DebugResourceRule  DebugResourceRuleRequest
     * @return DebugResourceRuleResponse
     */
    CompletableFuture<DebugResourceRuleResponse> debugResourceRule(DebugResourceRuleRequest request);

    /**
     * @param request the request parameters of DeleteABMetric  DeleteABMetricRequest
     * @return DeleteABMetricResponse
     */
    CompletableFuture<DeleteABMetricResponse> deleteABMetric(DeleteABMetricRequest request);

    /**
     * @param request the request parameters of DeleteABMetricGroup  DeleteABMetricGroupRequest
     * @return DeleteABMetricGroupResponse
     */
    CompletableFuture<DeleteABMetricGroupResponse> deleteABMetricGroup(DeleteABMetricGroupRequest request);

    /**
     * @param request the request parameters of DeleteCrowd  DeleteCrowdRequest
     * @return DeleteCrowdResponse
     */
    CompletableFuture<DeleteCrowdResponse> deleteCrowd(DeleteCrowdRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Ensure you provide the correct <code>DataDiagnosisId</code> and <code>InstanceId</code> to avoid accidental deletion.</p>
     * 
     * @param request the request parameters of DeleteDataDiagnosis  DeleteDataDiagnosisRequest
     * @return DeleteDataDiagnosisResponse
     */
    CompletableFuture<DeleteDataDiagnosisResponse> deleteDataDiagnosis(DeleteDataDiagnosisRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a specified engine configuration.</p>
     * 
     * @param request the request parameters of DeleteEngineConfig  DeleteEngineConfigRequest
     * @return DeleteEngineConfigResponse
     */
    CompletableFuture<DeleteEngineConfigResponse> deleteEngineConfig(DeleteEngineConfigRequest request);

    /**
     * @param request the request parameters of DeleteExperiment  DeleteExperimentRequest
     * @return DeleteExperimentResponse
     */
    CompletableFuture<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request);

    /**
     * @param request the request parameters of DeleteExperimentGroup  DeleteExperimentGroupRequest
     * @return DeleteExperimentGroupResponse
     */
    CompletableFuture<DeleteExperimentGroupResponse> deleteExperimentGroup(DeleteExperimentGroupRequest request);

    /**
     * @param request the request parameters of DeleteInstanceResource  DeleteInstanceResourceRequest
     * @return DeleteInstanceResourceResponse
     */
    CompletableFuture<DeleteInstanceResourceResponse> deleteInstanceResource(DeleteInstanceResourceRequest request);

    /**
     * @param request the request parameters of DeleteLaboratory  DeleteLaboratoryRequest
     * @return DeleteLaboratoryResponse
     */
    CompletableFuture<DeleteLaboratoryResponse> deleteLaboratory(DeleteLaboratoryRequest request);

    /**
     * @param request the request parameters of DeleteLayer  DeleteLayerRequest
     * @return DeleteLayerResponse
     */
    CompletableFuture<DeleteLayerResponse> deleteLayer(DeleteLayerRequest request);

    /**
     * @param request the request parameters of DeleteParam  DeleteParamRequest
     * @return DeleteParamResponse
     */
    CompletableFuture<DeleteParamResponse> deleteParam(DeleteParamRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation deletes a recall management service based on the RecallManagementServiceId and InstanceId. Before you call this API, ensure you have the correct information for the service to be deleted.</p>
     * 
     * @param request the request parameters of DeleteRecallManagementService  DeleteRecallManagementServiceRequest
     * @return DeleteRecallManagementServiceResponse
     */
    CompletableFuture<DeleteRecallManagementServiceResponse> deleteRecallManagementService(DeleteRecallManagementServiceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This operation deletes a specific version of a recall management service. You must provide the recall management service ID, the recall management service version ID, and the instance ID. This operation is irreversible, so back up all critical data before proceeding.</p>
     * 
     * @param request the request parameters of DeleteRecallManagementServiceVersion  DeleteRecallManagementServiceVersionRequest
     * @return DeleteRecallManagementServiceVersionResponse
     */
    CompletableFuture<DeleteRecallManagementServiceVersionResponse> deleteRecallManagementServiceVersion(DeleteRecallManagementServiceVersionRequest request);

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
    CompletableFuture<DeleteRecallManagementServiceVersionConfigResponse> deleteRecallManagementServiceVersionConfig(DeleteRecallManagementServiceVersionConfigRequest request);

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
    CompletableFuture<DeleteRecallManagementTableResponse> deleteRecallManagementTable(DeleteRecallManagementTableRequest request);

    /**
     * @param request the request parameters of DeleteResourceRule  DeleteResourceRuleRequest
     * @return DeleteResourceRuleResponse
     */
    CompletableFuture<DeleteResourceRuleResponse> deleteResourceRule(DeleteResourceRuleRequest request);

    /**
     * @param request the request parameters of DeleteResourceRuleItem  DeleteResourceRuleItemRequest
     * @return DeleteResourceRuleItemResponse
     */
    CompletableFuture<DeleteResourceRuleItemResponse> deleteResourceRuleItem(DeleteResourceRuleItemRequest request);

    /**
     * @param request the request parameters of DeleteSampleConsistencyJob  DeleteSampleConsistencyJobRequest
     * @return DeleteSampleConsistencyJobResponse
     */
    CompletableFuture<DeleteSampleConsistencyJobResponse> deleteSampleConsistencyJob(DeleteSampleConsistencyJobRequest request);

    /**
     * @param request the request parameters of DeleteScene  DeleteSceneRequest
     * @return DeleteSceneResponse
     */
    CompletableFuture<DeleteSceneResponse> deleteScene(DeleteSceneRequest request);

    /**
     * @param request the request parameters of DeleteSubCrowd  DeleteSubCrowdRequest
     * @return DeleteSubCrowdResponse
     */
    CompletableFuture<DeleteSubCrowdResponse> deleteSubCrowd(DeleteSubCrowdRequest request);

    /**
     * @param request the request parameters of DeleteTableMeta  DeleteTableMetaRequest
     * @return DeleteTableMetaResponse
     */
    CompletableFuture<DeleteTableMetaResponse> deleteTableMeta(DeleteTableMetaRequest request);

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
    CompletableFuture<DeleteTrafficControlTargetResponse> deleteTrafficControlTarget(DeleteTrafficControlTargetRequest request);

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
    CompletableFuture<DeleteTrafficControlTaskResponse> deleteTrafficControlTask(DeleteTrafficControlTaskRequest request);

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
    CompletableFuture<DeployTrafficControlTaskCodeResponse> deployTrafficControlTaskCode(DeployTrafficControlTaskCodeRequest request);

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
    CompletableFuture<ExportRecallManagementTableResponse> exportRecallManagementTable(ExportRecallManagementTableRequest request);

    /**
     * @param request the request parameters of GenerateAlgorithmCustomizationScript  GenerateAlgorithmCustomizationScriptRequest
     * @return GenerateAlgorithmCustomizationScriptResponse
     */
    CompletableFuture<GenerateAlgorithmCustomizationScriptResponse> generateAlgorithmCustomizationScript(GenerateAlgorithmCustomizationScriptRequest request);

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
    CompletableFuture<GenerateTrafficControlTaskCodeResponse> generateTrafficControlTaskCode(GenerateTrafficControlTaskCodeRequest request);

    /**
     * @param request the request parameters of GenerateTrafficControlTaskConfig  GenerateTrafficControlTaskConfigRequest
     * @return GenerateTrafficControlTaskConfigResponse
     */
    CompletableFuture<GenerateTrafficControlTaskConfigResponse> generateTrafficControlTaskConfig(GenerateTrafficControlTaskConfigRequest request);

    /**
     * @param request the request parameters of GetABMetric  GetABMetricRequest
     * @return GetABMetricResponse
     */
    CompletableFuture<GetABMetricResponse> getABMetric(GetABMetricRequest request);

    /**
     * @param request the request parameters of GetABMetricGroup  GetABMetricGroupRequest
     * @return GetABMetricGroupResponse
     */
    CompletableFuture<GetABMetricGroupResponse> getABMetricGroup(GetABMetricGroupRequest request);

    /**
     * @param request the request parameters of GetCalculationJob  GetCalculationJobRequest
     * @return GetCalculationJobResponse
     */
    CompletableFuture<GetCalculationJobResponse> getCalculationJob(GetCalculationJobRequest request);

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
    CompletableFuture<GetDataDiagnosisResponse> getDataDiagnosis(GetDataDiagnosisRequest request);

    /**
     * @param request the request parameters of GetEngineConfig  GetEngineConfigRequest
     * @return GetEngineConfigResponse
     */
    CompletableFuture<GetEngineConfigResponse> getEngineConfig(GetEngineConfigRequest request);

    /**
     * @param request the request parameters of GetExperiment  GetExperimentRequest
     * @return GetExperimentResponse
     */
    CompletableFuture<GetExperimentResponse> getExperiment(GetExperimentRequest request);

    /**
     * @param request the request parameters of GetExperimentGroup  GetExperimentGroupRequest
     * @return GetExperimentGroupResponse
     */
    CompletableFuture<GetExperimentGroupResponse> getExperimentGroup(GetExperimentGroupRequest request);

    /**
     * @param request the request parameters of GetFeatureConsistencyCheckJob  GetFeatureConsistencyCheckJobRequest
     * @return GetFeatureConsistencyCheckJobResponse
     */
    CompletableFuture<GetFeatureConsistencyCheckJobResponse> getFeatureConsistencyCheckJob(GetFeatureConsistencyCheckJobRequest request);

    /**
     * @param request the request parameters of GetFeatureConsistencyCheckJobConfig  GetFeatureConsistencyCheckJobConfigRequest
     * @return GetFeatureConsistencyCheckJobConfigResponse
     */
    CompletableFuture<GetFeatureConsistencyCheckJobConfigResponse> getFeatureConsistencyCheckJobConfig(GetFeatureConsistencyCheckJobConfigRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetInstanceResource  GetInstanceResourceRequest
     * @return GetInstanceResourceResponse
     */
    CompletableFuture<GetInstanceResourceResponse> getInstanceResource(GetInstanceResourceRequest request);

    /**
     * @param request the request parameters of GetInstanceResourceTable  GetInstanceResourceTableRequest
     * @return GetInstanceResourceTableResponse
     */
    CompletableFuture<GetInstanceResourceTableResponse> getInstanceResourceTable(GetInstanceResourceTableRequest request);

    /**
     * @param request the request parameters of GetLaboratory  GetLaboratoryRequest
     * @return GetLaboratoryResponse
     */
    CompletableFuture<GetLaboratoryResponse> getLaboratory(GetLaboratoryRequest request);

    /**
     * @param request the request parameters of GetLayer  GetLayerRequest
     * @return GetLayerResponse
     */
    CompletableFuture<GetLayerResponse> getLayer(GetLayerRequest request);

    /**
     * @param request the request parameters of GetRecallManagementConfig  GetRecallManagementConfigRequest
     * @return GetRecallManagementConfigResponse
     */
    CompletableFuture<GetRecallManagementConfigResponse> getRecallManagementConfig(GetRecallManagementConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Retrieves the details of a specific recall management job using its <code>RecallManagementJobId</code> and <code>InstanceId</code>. The response includes the job\&quot;s status (such as Init, Running, Success, or Failed), start and end times, related table information, and operation log. To make a request, specify the <code>RecallManagementJobId</code> as a path parameter and the <code>InstanceId</code> as a query parameter.</p>
     * 
     * @param request the request parameters of GetRecallManagementJob  GetRecallManagementJobRequest
     * @return GetRecallManagementJobResponse
     */
    CompletableFuture<GetRecallManagementJobResponse> getRecallManagementJob(GetRecallManagementJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * 
     * @param request the request parameters of GetRecallManagementService  GetRecallManagementServiceRequest
     * @return GetRecallManagementServiceResponse
     */
    CompletableFuture<GetRecallManagementServiceResponse> getRecallManagementService(GetRecallManagementServiceRequest request);

    /**
     * @param request the request parameters of GetRecallManagementServiceVersion  GetRecallManagementServiceVersionRequest
     * @return GetRecallManagementServiceVersionResponse
     */
    CompletableFuture<GetRecallManagementServiceVersionResponse> getRecallManagementServiceVersion(GetRecallManagementServiceVersionRequest request);

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
    CompletableFuture<GetRecallManagementServiceVersionConfigResponse> getRecallManagementServiceVersionConfig(GetRecallManagementServiceVersionConfigRequest request);

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
    CompletableFuture<GetRecallManagementTableResponse> getRecallManagementTable(GetRecallManagementTableRequest request);

    /**
     * @param request the request parameters of GetResourceRule  GetResourceRuleRequest
     * @return GetResourceRuleResponse
     */
    CompletableFuture<GetResourceRuleResponse> getResourceRule(GetResourceRuleRequest request);

    /**
     * @param request the request parameters of GetSampleConsistencyJob  GetSampleConsistencyJobRequest
     * @return GetSampleConsistencyJobResponse
     */
    CompletableFuture<GetSampleConsistencyJobResponse> getSampleConsistencyJob(GetSampleConsistencyJobRequest request);

    /**
     * @param request the request parameters of GetScene  GetSceneRequest
     * @return GetSceneResponse
     */
    CompletableFuture<GetSceneResponse> getScene(GetSceneRequest request);

    /**
     * @param request the request parameters of GetService  GetServiceRequest
     * @return GetServiceResponse
     */
    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    /**
     * @param request the request parameters of GetSubCrowd  GetSubCrowdRequest
     * @return GetSubCrowdResponse
     */
    CompletableFuture<GetSubCrowdResponse> getSubCrowd(GetSubCrowdRequest request);

    /**
     * @param request the request parameters of GetTableMeta  GetTableMetaRequest
     * @return GetTableMetaResponse
     */
    CompletableFuture<GetTableMetaResponse> getTableMeta(GetTableMetaRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>Retrieves the detailed configuration of a traffic control target. The configuration includes the target name, time range, and condition settings. This operation requires the <code>TrafficControlTargetId</code> and <code>InstanceId</code> parameters.</p>
     * 
     * @param request the request parameters of GetTrafficControlTarget  GetTrafficControlTargetRequest
     * @return GetTrafficControlTargetResponse
     */
    CompletableFuture<GetTrafficControlTargetResponse> getTrafficControlTarget(GetTrafficControlTargetRequest request);

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
    CompletableFuture<GetTrafficControlTaskResponse> getTrafficControlTask(GetTrafficControlTaskRequest request);

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
    CompletableFuture<GetTrafficControlTaskTrafficResponse> getTrafficControlTaskTraffic(GetTrafficControlTaskTrafficRequest request);

    /**
     * @param request the request parameters of ListABMetricGroups  ListABMetricGroupsRequest
     * @return ListABMetricGroupsResponse
     */
    CompletableFuture<ListABMetricGroupsResponse> listABMetricGroups(ListABMetricGroupsRequest request);

    /**
     * @param request the request parameters of ListABMetrics  ListABMetricsRequest
     * @return ListABMetricsResponse
     */
    CompletableFuture<ListABMetricsResponse> listABMetrics(ListABMetricsRequest request);

    /**
     * @param request the request parameters of ListCalculationJobs  ListCalculationJobsRequest
     * @return ListCalculationJobsResponse
     */
    CompletableFuture<ListCalculationJobsResponse> listCalculationJobs(ListCalculationJobsRequest request);

    /**
     * @param request the request parameters of ListCrowdUsers  ListCrowdUsersRequest
     * @return ListCrowdUsersResponse
     */
    CompletableFuture<ListCrowdUsersResponse> listCrowdUsers(ListCrowdUsersRequest request);

    /**
     * @param request the request parameters of ListCrowds  ListCrowdsRequest
     * @return ListCrowdsResponse
     */
    CompletableFuture<ListCrowdsResponse> listCrowds(ListCrowdsRequest request);

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
    CompletableFuture<ListDataDiagnosesResponse> listDataDiagnoses(ListDataDiagnosesRequest request);

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
    CompletableFuture<ListDataDiagnosisJobsResponse> listDataDiagnosisJobs(ListDataDiagnosisJobsRequest request);

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
    CompletableFuture<ListDataDiagnosisReportsResponse> listDataDiagnosisReports(ListDataDiagnosisReportsRequest request);

    /**
     * @param request the request parameters of ListEngineConfigs  ListEngineConfigsRequest
     * @return ListEngineConfigsResponse
     */
    CompletableFuture<ListEngineConfigsResponse> listEngineConfigs(ListEngineConfigsRequest request);

    /**
     * @param request the request parameters of ListExperimentGroups  ListExperimentGroupsRequest
     * @return ListExperimentGroupsResponse
     */
    CompletableFuture<ListExperimentGroupsResponse> listExperimentGroups(ListExperimentGroupsRequest request);

    /**
     * @param request the request parameters of ListExperiments  ListExperimentsRequest
     * @return ListExperimentsResponse
     */
    CompletableFuture<ListExperimentsResponse> listExperiments(ListExperimentsRequest request);

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobConfigs  ListFeatureConsistencyCheckJobConfigsRequest
     * @return ListFeatureConsistencyCheckJobConfigsResponse
     */
    CompletableFuture<ListFeatureConsistencyCheckJobConfigsResponse> listFeatureConsistencyCheckJobConfigs(ListFeatureConsistencyCheckJobConfigsRequest request);

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobFeatureReports  ListFeatureConsistencyCheckJobFeatureReportsRequest
     * @return ListFeatureConsistencyCheckJobFeatureReportsResponse
     */
    CompletableFuture<ListFeatureConsistencyCheckJobFeatureReportsResponse> listFeatureConsistencyCheckJobFeatureReports(ListFeatureConsistencyCheckJobFeatureReportsRequest request);

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobScoreReports  ListFeatureConsistencyCheckJobScoreReportsRequest
     * @return ListFeatureConsistencyCheckJobScoreReportsResponse
     */
    CompletableFuture<ListFeatureConsistencyCheckJobScoreReportsResponse> listFeatureConsistencyCheckJobScoreReports(ListFeatureConsistencyCheckJobScoreReportsRequest request);

    /**
     * @param request the request parameters of ListFeatureConsistencyCheckJobs  ListFeatureConsistencyCheckJobsRequest
     * @return ListFeatureConsistencyCheckJobsResponse
     */
    CompletableFuture<ListFeatureConsistencyCheckJobsResponse> listFeatureConsistencyCheckJobs(ListFeatureConsistencyCheckJobsRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>To retrieve a list of all schemas for a specified resource, provide the instance ID (InstanceId) and resource ID (ResourceId). Use the optional SchemaName parameter to filter the schemas by a name prefix.</p>
     * 
     * @param request the request parameters of ListInstanceResourceSchemas  ListInstanceResourceSchemasRequest
     * @return ListInstanceResourceSchemasResponse
     */
    CompletableFuture<ListInstanceResourceSchemasResponse> listInstanceResourceSchemas(ListInstanceResourceSchemasRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Provide the instance ID (InstanceId) and data source ID (ResourceId) to retrieve a list of data tables from the specified data source. Use the optional <code>MaxcomputeSchema</code> parameter to filter the results by a MaxCompute schema.</p>
     * 
     * @param request the request parameters of ListInstanceResourceTables  ListInstanceResourceTablesRequest
     * @return ListInstanceResourceTablesResponse
     */
    CompletableFuture<ListInstanceResourceTablesResponse> listInstanceResourceTables(ListInstanceResourceTablesRequest request);

    /**
     * @param request the request parameters of ListInstanceResources  ListInstanceResourcesRequest
     * @return ListInstanceResourcesResponse
     */
    CompletableFuture<ListInstanceResourcesResponse> listInstanceResources(ListInstanceResourcesRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListLaboratories  ListLaboratoriesRequest
     * @return ListLaboratoriesResponse
     */
    CompletableFuture<ListLaboratoriesResponse> listLaboratories(ListLaboratoriesRequest request);

    /**
     * @param request the request parameters of ListLayers  ListLayersRequest
     * @return ListLayersResponse
     */
    CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request);

    /**
     * @param request the request parameters of ListParams  ListParamsRequest
     * @return ListParamsResponse
     */
    CompletableFuture<ListParamsResponse> listParams(ListParamsRequest request);

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
    CompletableFuture<ListRecallManagementJobsResponse> listRecallManagementJobs(ListRecallManagementJobsRequest request);

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
    CompletableFuture<ListRecallManagementServiceVersionsResponse> listRecallManagementServiceVersions(ListRecallManagementServiceVersionsRequest request);

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
    CompletableFuture<ListRecallManagementServicesResponse> listRecallManagementServices(ListRecallManagementServicesRequest request);

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
    CompletableFuture<ListRecallManagementTableVersionsResponse> listRecallManagementTableVersions(ListRecallManagementTableVersionsRequest request);

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
    CompletableFuture<ListRecallManagementTablesResponse> listRecallManagementTables(ListRecallManagementTablesRequest request);

    /**
     * @param request the request parameters of ListResourceRules  ListResourceRulesRequest
     * @return ListResourceRulesResponse
     */
    CompletableFuture<ListResourceRulesResponse> listResourceRules(ListResourceRulesRequest request);

    /**
     * @param request the request parameters of ListSampleConsistencyJobs  ListSampleConsistencyJobsRequest
     * @return ListSampleConsistencyJobsResponse
     */
    CompletableFuture<ListSampleConsistencyJobsResponse> listSampleConsistencyJobs(ListSampleConsistencyJobsRequest request);

    /**
     * @param request the request parameters of ListScenes  ListScenesRequest
     * @return ListScenesResponse
     */
    CompletableFuture<ListScenesResponse> listScenes(ListScenesRequest request);

    /**
     * @param request the request parameters of ListSubCrowds  ListSubCrowdsRequest
     * @return ListSubCrowdsResponse
     */
    CompletableFuture<ListSubCrowdsResponse> listSubCrowds(ListSubCrowdsRequest request);

    /**
     * @param request the request parameters of ListTableMetas  ListTableMetasRequest
     * @return ListTableMetasResponse
     */
    CompletableFuture<ListTableMetasResponse> listTableMetas(ListTableMetasRequest request);

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
    CompletableFuture<ListTrafficControlTargetTrafficHistoryResponse> listTrafficControlTargetTrafficHistory(ListTrafficControlTargetTrafficHistoryRequest request);

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
    CompletableFuture<ListTrafficControlTasksResponse> listTrafficControlTasks(ListTrafficControlTasksRequest request);

    /**
     * @param request the request parameters of OfflineExperiment  OfflineExperimentRequest
     * @return OfflineExperimentResponse
     */
    CompletableFuture<OfflineExperimentResponse> offlineExperiment(OfflineExperimentRequest request);

    /**
     * @param request the request parameters of OfflineExperimentGroup  OfflineExperimentGroupRequest
     * @return OfflineExperimentGroupResponse
     */
    CompletableFuture<OfflineExperimentGroupResponse> offlineExperimentGroup(OfflineExperimentGroupRequest request);

    /**
     * @param request the request parameters of OfflineLaboratory  OfflineLaboratoryRequest
     * @return OfflineLaboratoryResponse
     */
    CompletableFuture<OfflineLaboratoryResponse> offlineLaboratory(OfflineLaboratoryRequest request);

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
    CompletableFuture<OfflineRecallManagementServiceResponse> offlineRecallManagementService(OfflineRecallManagementServiceRequest request);

    /**
     * @param request the request parameters of OnlineExperiment  OnlineExperimentRequest
     * @return OnlineExperimentResponse
     */
    CompletableFuture<OnlineExperimentResponse> onlineExperiment(OnlineExperimentRequest request);

    /**
     * @param request the request parameters of OnlineExperimentGroup  OnlineExperimentGroupRequest
     * @return OnlineExperimentGroupResponse
     */
    CompletableFuture<OnlineExperimentGroupResponse> onlineExperimentGroup(OnlineExperimentGroupRequest request);

    /**
     * @param request the request parameters of OnlineLaboratory  OnlineLaboratoryRequest
     * @return OnlineLaboratoryResponse
     */
    CompletableFuture<OnlineLaboratoryResponse> onlineLaboratory(OnlineLaboratoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>You can use this operation to bring a Recall Management Service online by specifying the Recall Management Service ID and the instance ID. Ensure that the <code>RecallManagementServiceId</code> and <code>InstanceId</code> are correct and that you have the required permissions.</p>
     * 
     * @param request the request parameters of OnlineRecallManagementService  OnlineRecallManagementServiceRequest
     * @return OnlineRecallManagementServiceResponse
     */
    CompletableFuture<OnlineRecallManagementServiceResponse> onlineRecallManagementService(OnlineRecallManagementServiceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request details</h2>
     * <p>This API synchronizes a specified MaxCompute table with the recall engine. You must provide the correct <code>RecallManagementTableId</code> in the path parameter and the instance ID in the request body. You can also specify the table partitions to publish, whether to skip the threshold check, and the synchronization mode. To publish specific partitions, provide them as key-value pairs in the <code>Partitions</code> field.</p>
     * 
     * @param request the request parameters of PublishRecallManagementTable  PublishRecallManagementTableRequest
     * @return PublishRecallManagementTableResponse
     */
    CompletableFuture<PublishRecallManagementTableResponse> publishRecallManagementTable(PublishRecallManagementTableRequest request);

    /**
     * @param request the request parameters of PushAllExperiment  PushAllExperimentRequest
     * @return PushAllExperimentResponse
     */
    CompletableFuture<PushAllExperimentResponse> pushAllExperiment(PushAllExperimentRequest request);

    /**
     * @param request the request parameters of PushResourceRule  PushResourceRuleRequest
     * @return PushResourceRuleResponse
     */
    CompletableFuture<PushResourceRuleResponse> pushResourceRule(PushResourceRuleRequest request);

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
    CompletableFuture<QueryDataDiagnosisStatisticsResponse> queryDataDiagnosisStatistics(QueryDataDiagnosisStatisticsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API retrieves records from a specific recall management table using the provided primary keys. You must provide a valid <code>InstanceId</code> and <code>RecallManagementTableId</code>, and a non-empty <code>PrimaryKeys</code> list. If you specify <code>RecallManagementTableVersionId</code>, the API returns records from that version; otherwise, it uses the currently published version.</p>
     * 
     * @param request the request parameters of QueryRecallManagementTableRecords  QueryRecallManagementTableRecordsRequest
     * @return QueryRecallManagementTableRecordsResponse
     */
    CompletableFuture<QueryRecallManagementTableRecordsResponse> queryRecallManagementTableRecords(QueryRecallManagementTableRecordsRequest request);

    /**
     * @param request the request parameters of QuerySampleConsistencyJobDifference  QuerySampleConsistencyJobDifferenceRequest
     * @return QuerySampleConsistencyJobDifferenceResponse
     */
    CompletableFuture<QuerySampleConsistencyJobDifferenceResponse> querySampleConsistencyJobDifference(QuerySampleConsistencyJobDifferenceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>Use this API to query the details of single-item control for a given traffic control target on a specified date and for a specific instance ID and environment. The details include traffic data and feature information for the top 100 items before and after the control is applied. Ensure that the <code>TrafficControlTargetId</code>, <code>InstanceId</code>, and <code>Environment</code> parameters are accurate, and that the <code>Date</code> is in YYYY-MM-DD format. Although the <code>Date</code> parameter is optional, we recommend specifying a date for meaningful results.</p>
     * 
     * @param request the request parameters of QueryTrafficControlTargetItemReportDetail  QueryTrafficControlTargetItemReportDetailRequest
     * @return QueryTrafficControlTargetItemReportDetailResponse
     */
    CompletableFuture<QueryTrafficControlTargetItemReportDetailResponse> queryTrafficControlTargetItemReportDetail(QueryTrafficControlTargetItemReportDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can call this operation to query the deployment result of a traffic control task specified by TrafficControlTaskId for a given instance ID and environment. Make sure that the specified InstanceId is associated with your account and that the Environment parameter value is valid (Daily for daily environment, Pre for staging environment, Prod for production environment). All request parameters are required.</p>
     * 
     * @param request the request parameters of QueryTrafficControlTaskDeployResult  QueryTrafficControlTaskDeployResultRequest
     * @return QueryTrafficControlTaskDeployResultResponse
     */
    CompletableFuture<QueryTrafficControlTaskDeployResultResponse> queryTrafficControlTaskDeployResult(QueryTrafficControlTaskDeployResultRequest request);

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
    CompletableFuture<QueryTrafficControlTaskItemReportResponse> queryTrafficControlTaskItemReport(QueryTrafficControlTaskItemReportRequest request);

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
    CompletableFuture<ReleaseTrafficControlTaskResponse> releaseTrafficControlTask(ReleaseTrafficControlTaskRequest request);

    /**
     * @param request the request parameters of ReportABMetricGroup  ReportABMetricGroupRequest
     * @return ReportABMetricGroupResponse
     */
    CompletableFuture<ReportABMetricGroupResponse> reportABMetricGroup(ReportABMetricGroupRequest request);

    /**
     * @param request the request parameters of ReportSampleConsistencyJob  ReportSampleConsistencyJobRequest
     * @return ReportSampleConsistencyJobResponse
     */
    CompletableFuture<ReportSampleConsistencyJobResponse> reportSampleConsistencyJob(ReportSampleConsistencyJobRequest request);

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
    CompletableFuture<ShoppingAssistantResponse> shoppingAssistant(ShoppingAssistantRequest request);

<ReturnT> CompletableFuture<ReturnT> shoppingAssistantWithAsyncResponseHandler(ShoppingAssistantRequest request, AsyncResponseHandler<ShoppingAssistantResponse, ReturnT> responseHandler);

    ResponseIterable<ShoppingAssistantResponseBody> shoppingAssistantWithResponseIterable(ShoppingAssistantRequest request);

    /**
     * <b>description</b> :
     * <p>Splits the target values for a traffic control target into time intervals.</p>
     * 
     * @param request the request parameters of SplitTrafficControlTarget  SplitTrafficControlTargetRequest
     * @return SplitTrafficControlTargetResponse
     */
    CompletableFuture<SplitTrafficControlTargetResponse> splitTrafficControlTarget(SplitTrafficControlTargetRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>Call this operation to start a traffic control task by providing the <code>TrafficControlTargetId</code> and <code>InstanceId</code>.</p>
     * 
     * @param request the request parameters of StartTrafficControlTarget  StartTrafficControlTargetRequest
     * @return StartTrafficControlTargetResponse
     */
    CompletableFuture<StartTrafficControlTargetResponse> startTrafficControlTarget(StartTrafficControlTargetRequest request);

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
    CompletableFuture<StartTrafficControlTaskResponse> startTrafficControlTask(StartTrafficControlTaskRequest request);

    /**
     * @param request the request parameters of StopSampleConsistencyJob  StopSampleConsistencyJobRequest
     * @return StopSampleConsistencyJobResponse
     */
    CompletableFuture<StopSampleConsistencyJobResponse> stopSampleConsistencyJob(StopSampleConsistencyJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>You can call this operation to stop a specific traffic control Flink task based on the specified TrafficControlTaskId. Make sure that you have prepared the correct InstanceId and the environment to which the instance belongs (Daily for daily environment, Pre for staging environment, Prod for production environment). Include this information in the request body to ensure that the operation is correctly performed.</p>
     * 
     * @param request the request parameters of StopTrafficControlFlinkTask  StopTrafficControlFlinkTaskRequest
     * @return StopTrafficControlFlinkTaskResponse
     */
    CompletableFuture<StopTrafficControlFlinkTaskResponse> stopTrafficControlFlinkTask(StopTrafficControlFlinkTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This operation stops a traffic control task using the provided <code>TrafficControlTargetId</code> and <code>InstanceId</code>. Ensure that the parameter values are accurate to avoid stopping the wrong target or instance.</p>
     * 
     * @param request the request parameters of StopTrafficControlTarget  StopTrafficControlTargetRequest
     * @return StopTrafficControlTargetResponse
     */
    CompletableFuture<StopTrafficControlTargetResponse> stopTrafficControlTarget(StopTrafficControlTargetRequest request);

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
    CompletableFuture<StopTrafficControlTaskResponse> stopTrafficControlTask(StopTrafficControlTaskRequest request);

    /**
     * @param request the request parameters of SyncFeatureConsistencyCheckJobReplayLog  SyncFeatureConsistencyCheckJobReplayLogRequest
     * @return SyncFeatureConsistencyCheckJobReplayLogResponse
     */
    CompletableFuture<SyncFeatureConsistencyCheckJobReplayLogResponse> syncFeatureConsistencyCheckJobReplayLog(SyncFeatureConsistencyCheckJobReplayLogRequest request);

    /**
     * @param request the request parameters of TerminateFeatureConsistencyCheckJob  TerminateFeatureConsistencyCheckJobRequest
     * @return TerminateFeatureConsistencyCheckJobResponse
     */
    CompletableFuture<TerminateFeatureConsistencyCheckJobResponse> terminateFeatureConsistencyCheckJob(TerminateFeatureConsistencyCheckJobRequest request);

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
    CompletableFuture<UpdateABMetricResponse> updateABMetric(UpdateABMetricRequest request);

    /**
     * @param request the request parameters of UpdateABMetricGroup  UpdateABMetricGroupRequest
     * @return UpdateABMetricGroupResponse
     */
    CompletableFuture<UpdateABMetricGroupResponse> updateABMetricGroup(UpdateABMetricGroupRequest request);

    /**
     * @param request the request parameters of UpdateCrowd  UpdateCrowdRequest
     * @return UpdateCrowdResponse
     */
    CompletableFuture<UpdateCrowdResponse> updateCrowd(UpdateCrowdRequest request);

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
    CompletableFuture<UpdateDataDiagnosisResponse> updateDataDiagnosis(UpdateDataDiagnosisRequest request);

    /**
     * @param request the request parameters of UpdateEngineConfig  UpdateEngineConfigRequest
     * @return UpdateEngineConfigResponse
     */
    CompletableFuture<UpdateEngineConfigResponse> updateEngineConfig(UpdateEngineConfigRequest request);

    /**
     * @param request the request parameters of UpdateExperiment  UpdateExperimentRequest
     * @return UpdateExperimentResponse
     */
    CompletableFuture<UpdateExperimentResponse> updateExperiment(UpdateExperimentRequest request);

    /**
     * @param request the request parameters of UpdateExperimentGroup  UpdateExperimentGroupRequest
     * @return UpdateExperimentGroupResponse
     */
    CompletableFuture<UpdateExperimentGroupResponse> updateExperimentGroup(UpdateExperimentGroupRequest request);

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
    CompletableFuture<UpdateFeatureConsistencyCheckJobConfigResponse> updateFeatureConsistencyCheckJobConfig(UpdateFeatureConsistencyCheckJobConfigRequest request);

    /**
     * @param request the request parameters of UpdateInstanceResource  UpdateInstanceResourceRequest
     * @return UpdateInstanceResourceResponse
     */
    CompletableFuture<UpdateInstanceResourceResponse> updateInstanceResource(UpdateInstanceResourceRequest request);

    /**
     * @param request the request parameters of UpdateLaboratory  UpdateLaboratoryRequest
     * @return UpdateLaboratoryResponse
     */
    CompletableFuture<UpdateLaboratoryResponse> updateLaboratory(UpdateLaboratoryRequest request);

    /**
     * @param request the request parameters of UpdateLayer  UpdateLayerRequest
     * @return UpdateLayerResponse
     */
    CompletableFuture<UpdateLayerResponse> updateLayer(UpdateLayerRequest request);

    /**
     * @param request the request parameters of UpdateParam  UpdateParamRequest
     * @return UpdateParamResponse
     */
    CompletableFuture<UpdateParamResponse> updateParam(UpdateParamRequest request);

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
    CompletableFuture<UpdateRecallManagementConfigResponse> updateRecallManagementConfig(UpdateRecallManagementConfigRequest request);

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
    CompletableFuture<UpdateRecallManagementServiceResponse> updateRecallManagementService(UpdateRecallManagementServiceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API updates the recall and merge configurations for a specific recall management service version. Your request must include the correct <code>InstanceId</code> and the configurations to update. Refer to the parameter descriptions for details on required parameters.</p>
     * 
     * @param request the request parameters of UpdateRecallManagementServiceVersionConfig  UpdateRecallManagementServiceVersionConfigRequest
     * @return UpdateRecallManagementServiceVersionConfigResponse
     */
    CompletableFuture<UpdateRecallManagementServiceVersionConfigResponse> updateRecallManagementServiceVersionConfig(UpdateRecallManagementServiceVersionConfigRequest request);

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
    CompletableFuture<UpdateRecallManagementTableResponse> updateRecallManagementTable(UpdateRecallManagementTableRequest request);

    /**
     * @param request the request parameters of UpdateResourceRule  UpdateResourceRuleRequest
     * @return UpdateResourceRuleResponse
     */
    CompletableFuture<UpdateResourceRuleResponse> updateResourceRule(UpdateResourceRuleRequest request);

    /**
     * @param request the request parameters of UpdateResourceRuleItem  UpdateResourceRuleItemRequest
     * @return UpdateResourceRuleItemResponse
     */
    CompletableFuture<UpdateResourceRuleItemResponse> updateResourceRuleItem(UpdateResourceRuleItemRequest request);

    /**
     * @param request the request parameters of UpdateScene  UpdateSceneRequest
     * @return UpdateSceneResponse
     */
    CompletableFuture<UpdateSceneResponse> updateScene(UpdateSceneRequest request);

    /**
     * @param request the request parameters of UpdateTableMeta  UpdateTableMetaRequest
     * @return UpdateTableMetaResponse
     */
    CompletableFuture<UpdateTableMetaResponse> updateTableMeta(UpdateTableMetaRequest request);

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
    CompletableFuture<UpdateTrafficControlTargetResponse> updateTrafficControlTarget(UpdateTrafficControlTargetRequest request);

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
    CompletableFuture<UpdateTrafficControlTaskResponse> updateTrafficControlTask(UpdateTrafficControlTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API updates the traffic configuration for a specific traffic control task. The configuration includes the traffic control target ID, record time, target traffic, and overall traffic. Ensure that the provided<code>TrafficControlTaskId</code> is valid and within your permission scope. Additionally, each object in the<code>Traffics</code> array must contain the required fields.</p>
     * 
     * @param request the request parameters of UpdateTrafficControlTaskTraffic  UpdateTrafficControlTaskTrafficRequest
     * @return UpdateTrafficControlTaskTrafficResponse
     */
    CompletableFuture<UpdateTrafficControlTaskTrafficResponse> updateTrafficControlTaskTraffic(UpdateTrafficControlTaskTrafficRequest request);

    /**
     * @param request the request parameters of UploadRecommendationData  UploadRecommendationDataRequest
     * @return UploadRecommendationDataResponse
     */
    CompletableFuture<UploadRecommendationDataResponse> uploadRecommendationData(UploadRecommendationDataRequest request);

}
