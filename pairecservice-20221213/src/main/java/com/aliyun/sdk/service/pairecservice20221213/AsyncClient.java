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
     * <h2>Request description</h2>
     * <ul>
     * <li>This API sends a conversation message to an agent and supports Server-Sent Events (SSE).</li>
     * <li>If the ConversationId parameter is provided, the conversation continues in the context of the specified existing session. If this parameter is not provided, automatic creation of a new session is triggered.</li>
     * <li>The Config field allows you to pass additional information input, which must be in JSON format.</li>
     * <li>If the request is successful, the response includes the message ID and reply content of the current conversation. If a fault occurs, the corresponding error code and error message are returned.</li>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This API creates data diagnostic tasks and supports multiple analysis types, including item/user change rate analysis, user preference statistical period analysis, join table analysis, basic statistics analysis, and abnormal behavior analysis.</li>
     * <li>The content of the Config field varies depending on the Type value. Set this field correctly by referring to the sample configurations in the References.</li>
     * <li>To execute the diagnostic task periodically, set the CycleTime field. If this field is not set, the diagnostic task does not execute periodically.</li>
     * <li>The TopNQuantity field specifies the number of top N results to display. This field is default optional.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataDiagnosis  CreateDataDiagnosisRequest
     * @return CreateDataDiagnosisResponse
     */
    CompletableFuture<CreateDataDiagnosisResponse> createDataDiagnosis(CreateDataDiagnosisRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>By invoking this API, you can start a new data modeling diagnostics node for a specific instance within a given time range. Make sure the values of the <code>DataDiagnosisId</code>, <code>InstanceId</code>, <code>StartDate</code>, and <code>EndDate</code> parameters are accurate to ensure the node executes correctly.</p>
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
     * <h2>Request notes</h2>
     * <ul>
     * <li><code>ItemConditionType</code> supports two formats: array format (Array) and expression format (Expression). Depending on your selection, you must provide the corresponding <code>ItemConditionArray</code> or <code>ItemConditionExpress</code>.</li>
     * <li>The default value of <code>StatisPeriod</code> is daily. If you require hourly statistics, explicitly specify this parameter.</li>
     * <li><code>ToleranceValue</code> and <code>NewProductRegulation</code> are optional parameters. Specify them only when you have specific requirements.</li>
     * <li>The <code>Status</code> field allows you to control whether the newly created traffic control target takes effect immediately. By default, it may be in the disabled state.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTrafficControlTarget  CreateTrafficControlTargetRequest
     * @return CreateTrafficControlTargetResponse
     */
    CompletableFuture<CreateTrafficControlTargetResponse> createTrafficControlTarget(CreateTrafficControlTargetRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation creates a traffic control task. You can define traffic control policies based on different scenarios, time ranges, and specific user or item conditions.</li>
     * <li>The <code>ExecutionTime</code> parameter specifies the time mode for task execution. If you select the <code>TimeRange</code> mode, you must specify both <code>StartTime</code> and <code>EndTime</code>.</li>
     * <li>The traffic control target list (<code>TrafficControlTargets</code>) is required. For each target, you must specify its name, time range, event type, and expected value.</li>
     * <li>You can use <code>UserConditionType</code> and <code>ItemConditionType</code> to flexibly set specific conditions for the target users and items. Both array and expression formats are supported.</li>
     * <li>The <code>ControlLogic</code> parameter can be set to <code>Guaranteed</code> or <code>Approach</code>, which indicates guaranteed traffic control or approximate traffic control, respectively.</li>
     * <li>When you configure new product regulation, make sure that the <code>NewProductRegulation</code> field is correctly specified.</li>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This API retrieves detailed information about a specific diagnostic node based on the provided <code>DataDiagnosisId</code> (diagnostic node configuration ID) and <code>InstanceId</code> (instance ID).</li>
     * <li>The <code>CycleTime</code> field indicates the epoch runtime. If this field is empty, no scheduled runs are performed.</li>
     * <li>The content of the <code>Config</code> field varies depending on the <code>Type</code> value. Refer to the References for the specific configuration items required for each type.</li>
     * <li><code>GmtCreateTime</code> and <code>GmtModifiedTime</code> represent the UNIX timestamps for when the record was created and last modified, respectively.</li>
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
     * <h2>Request description</h2>
     * <p>Provides the details of a specified recall management task by using RecallManagementJobId and InstanceId. This API returns the task status (such as init, running, success, or failed), start and end times, related table information, and operation logs. Make sure to specify the path parameter RecallManagementJobId and the query parameter InstanceId in the request.</p>
     * 
     * @param request the request parameters of GetRecallManagementJob  GetRecallManagementJobRequest
     * @return GetRecallManagementJobResponse
     */
    CompletableFuture<GetRecallManagementJobResponse> getRecallManagementJob(GetRecallManagementJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
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
     * <h2>Request description</h2>
     * <p>Specify the recall management service ID, version ID, and configuration ID to retrieve the configuration details of the recall service version. Ensure that the parameter values are accurate, especially <code>InstanceId</code>, which is crucial for locating the correct instance.</p>
     * <ul>
     * <li><strong>Note</strong>: All path parameters (<code>RecallManagementServiceId</code>, <code>RecallManagementServiceVersionId</code>, and <code>RecallManagementServiceVersionConfigId</code>) are required and must match existing resources.</li>
     * <li><strong>Extended configuration</strong>: The returned data includes the <code>ExtendedConfig</code> field for future feature extensions or custom settings. Parse and use it as needed.</li>
     * </ul>
     * 
     * @param request the request parameters of GetRecallManagementServiceVersionConfig  GetRecallManagementServiceVersionConfigRequest
     * @return GetRecallManagementServiceVersionConfigResponse
     */
    CompletableFuture<GetRecallManagementServiceVersionConfigResponse> getRecallManagementServiceVersionConfig(GetRecallManagementServiceVersionConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation retrieves the details of a recall management table based on the specified table ID (<code>RecallManagementTableId</code>) and instance ID (<code>InstanceId</code>). Make sure to provide valid values for these two parameters in the request.</p>
     * <ul>
     * <li><strong>Note</strong>: The <code>CanDelete</code> field indicates whether the table supports deletion. Handle the related logic with caution.</li>
     * <li>The <code>Fields</code> list contains the specific definitions of the fields in the table, such as the name, type, and attributes.</li>
     * <li>The fluctuation threshold settings for the table (row count and size) can be configured or queried through the corresponding fields to monitor data changes.</li>
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
     * <h2>Request description</h2>
     * <p>Provide the traffic control target ID and instance ID to retrieve the detailed configuration of the traffic control target, including the target name, time range, and condition settings. Note that TrafficControlTargetId and InstanceId are required parameters.</p>
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
     * <h2>Request description</h2>
     * <p>This API allows you to retrieve a list of data diagnostic tasks for a specific instance based on provided parameters such as InstanceId and Status. You can filter tasks by status and type, and control the amount of returned data by using pagination parameters such as PageNumber and PageSize.</p>
     * <ul>
     * <li><strong>InstanceId</strong> is required and specifies the instance to which the tasks to be queried belong.</li>
     * <li>Optional parameters include <strong>Status</strong>, <strong>Types</strong>, <strong>PageNumber</strong>, and <strong>PageSize</strong>, which allow you to filter the required information more precisely.</li>
     * <li>Note: If no filter conditions are provided, all eligible data diagnostic tasks are returned by default.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDataDiagnosisJobs  ListDataDiagnosisJobsRequest
     * @return ListDataDiagnosisJobsResponse
     */
    CompletableFuture<ListDataDiagnosisJobsResponse> listDataDiagnosisJobs(ListDataDiagnosisJobsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API retrieves a diagnostic report based on the provided data diagnosis ID, instance ID, and date range.</li>
     * <li>Use Settings for FeatureName to filter reports for a specific feature. Use the TopN parameter to limit the number of returned results.</li>
     * <li>RemainRateType allows you to select the type of retention rate report, such as a periodic report.</li>
     * <li>Report content includes, but is not limited to, item/user change rate analysis, user preference statistical period analysis, join table associate analysis, basic statistics analysis, and abnormal behavior analysis.</li>
     * <li>Note: All dates must follow the YYYY-MM-DD format.</li>
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
     * <h2>Request description</h2>
     * <p>Provide the instance ID (InstanceId) and data source ID (ResourceId) to retrieve a list of all tables in the data source. You can use the optional <code>MaxcomputeSchema</code> parameter to specify a MaxCompute schema to further filter the results.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation retrieves a list of recall management tasks.</li>
     * <li><code>InstanceId</code> and <code>Type</code> are required parameters. Other parameters are optional.</li>
     * <li>The <code>Condition</code> parameter supports filtering by specific table types, such as filtering by <code>RecallManagementTableId</code>.</li>
     * <li>You can use the <code>SortBy</code> and <code>Order</code> parameters to control the sorting of the returned results. By default, the results are sorted in ascending order of creation time.</li>
     * <li>Pagination is implemented through the <code>PageNumber</code> and <code>PageSize</code> parameters. The default value of <code>PageNumber</code> is 1, and the default value of <code>PageSize</code> is 10.</li>
     * <li>The returned data includes the basic information and status details of each recall management task.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecallManagementJobs  ListRecallManagementJobsRequest
     * @return ListRecallManagementJobsResponse
     */
    CompletableFuture<ListRecallManagementJobsResponse> listRecallManagementJobs(ListRecallManagementJobsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can call this API operation to query the details of all versions for a specific recall management service, including the version ID, name, effective status, and creation and update times. Make sure to provide the correct RecallManagementServiceId and InstanceId to obtain accurate data.</p>
     * <ul>
     * <li>The PageNumber and PageSize parameters are used for pagination. By default, the first page is returned, and each page contains 50 entries.</li>
     * <li>You can use the SortBy parameter to sort the results by creation time or update time. By default, the results are sorted in ascending order of creation time.</li>
     * <li>The Order parameter specifies the sort order. Valid values: ASC (ascending order) and DESC (descending order).</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecallManagementServiceVersions  ListRecallManagementServiceVersionsRequest
     * @return ListRecallManagementServiceVersionsResponse
     */
    CompletableFuture<ListRecallManagementServiceVersionsResponse> listRecallManagementServiceVersions(ListRecallManagementServiceVersionsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>By calling the ListRecallManagementServices operation, you can retrieve a list of recall management services for a specific instance based on given parameters such as InstanceId, PageNumber, and PageSize. You can sort the results by creation time or update time in ascending or descending order.</p>
     * <ul>
     * <li><strong>InstanceId</strong> is required and specifies the instance to which the services belong.</li>
     * <li>The pagination parameters <strong>PageNumber</strong> and <strong>PageSize</strong> allow you to control the number of returned entries and the starting page. By default, the first page is returned.</li>
     * <li>You can use the <strong>SortBy</strong> and <strong>Order</strong> parameters to customize the sorting method of the list.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecallManagementServices  ListRecallManagementServicesRequest
     * @return ListRecallManagementServicesResponse
     */
    CompletableFuture<ListRecallManagementServicesResponse> listRecallManagementServices(ListRecallManagementServicesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Provide <code>RecallManagementTableId</code> and <code>InstanceId</code> to retrieve the version history of a specific recall management table.</li>
     * <li>Use the <code>SortBy</code> parameter for sorting the results by creation time or update time. By default, the results are sorted in ascending order by creation time.</li>
     * <li>The <code>PageNumber</code> and <code>PageSize</code> parameters support the paged query feature, allowing you to control the number of returned entries and the specific page to view during paging.</li>
     * <li>If you do not specify the <code>Order</code> parameter, the results are sorted in ascending order by default.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecallManagementTableVersions  ListRecallManagementTableVersionsRequest
     * @return ListRecallManagementTableVersionsResponse
     */
    CompletableFuture<ListRecallManagementTableVersionsResponse> listRecallManagementTableVersions(ListRecallManagementTableVersionsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>InstanceId</strong> is a required parameter that specifies the instance to query.</li>
     * <li>Use the <strong>Name</strong> and <strong>Type</strong> parameters to filter recall management tables by name or type.</li>
     * <li>Pagination is controlled by <strong>PageNumber</strong> and <strong>PageSize</strong>. By default, the query starts from page 1 and returns 50 records per page.</li>
     * <li>Supports sorting by creation time (GmtCreateTime) or update time (GmtModifiedTime) in ascending (ASC) or descending (DESC) order.</li>
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
     * <h2>Request description</h2>
     * <ul>
     * <li><code>TrafficControlTargetId</code>, <code>InstanceId</code>, and <code>Environment</code> are required parameters.</li>
     * <li>You can use <code>StartTime</code> and <code>EndTime</code> to specify the time range for the query. The format is <code>YYYY-MM-DD HH:MM:SS</code>.</li>
     * <li>The <code>Threshold</code> parameter is optional and used to set the threshold.</li>
     * <li><code>ExperimentId</code> and <code>ExperimentGroupId</code> are used to filter data for specific experiments or experiment groups.</li>
     * <li><code>ItemId</code> is used to filter traffic data for specific items.</li>
     * <li>Supported environments include Daily (daily environment), Pre (staging environment), and Prod (production environment).</li>
     * </ul>
     * 
     * @param request the request parameters of ListTrafficControlTargetTrafficHistory  ListTrafficControlTargetTrafficHistoryRequest
     * @return ListTrafficControlTargetTrafficHistoryResponse
     */
    CompletableFuture<ListTrafficControlTargetTrafficHistoryResponse> listTrafficControlTargetTrafficHistory(ListTrafficControlTargetTrafficHistoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation retrieves a list of traffic control nodes that meet specific conditional requirements.</li>
     * <li>You can filter the returned nodes and apply sorting by specifying different query parameters.</li>
     * <li>Paged query is supported. You can also choose to return all data at once without paging.</li>
     * <li>Note: InstanceId is required, and other parameters are options. Specify other parameters as needed to obtain more precise results.</li>
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
     * <h2>Request description</h2>
     * <p>This operation synchronizes a specified MaxCompute table to the recall engine. It allows you to specify the table partition to publish, whether to skip the threshold check, and the synchronous mode (merge or overwrite). Ensure that you correctly specify the instance ID and table ID in the request body, and provide the correct <code>RecallManagementTableId</code> in the path parameters. To specify a particular table partition for publishing, provide it as key-value pairs in the <code>Partitions</code> field. You can also choose whether to skip the data volume threshold check and configure the synchronous mode.</p>
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
     * <li><code>DataDiagnosisId</code> is required and specifies the data diagnostic node to query.</li>
     * <li><code>InstanceId</code> is also required and identifies the specific instance.</li>
     * <li><code>StartDate</code> and <code>EndDate</code> specify the start and end dates for the statistics, respectively. The format is YYYY-MM-DD.</li>
     * <li>The <code>RemainRateType</code> parameter is optional. If provided, it specifies the retention rate report type. The default value is Period, which indicates a periodic report.</li>
     * <li>The response includes the request ID (<code>RequestId</code>) and the statistics object (<code>Statistics</code>), which lists the dates when nodes failed (<code>FailedDates</code>) and the dates with missing nodes (<code>NoDataDates</code>).</li>
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
     * <h2>Request description</h2>
     * <p>This API operation queries the traffic control details for individual items of a specified traffic control target on a specified date, for a specified instance ID, and in a specified environment. The details include the traffic conditions and feature information of the top 100 items before traffic control and the bottom 100 items after traffic control. Ensure that the <code>TrafficControlTargetId</code>, <code>InstanceId</code>, and <code>Environment</code> parameters are accurate, and the <code>Date</code> format is correct (YYYY-MM-DD). Note: Although the <code>Date</code> parameter is optional, always specify a date to obtain meaningful results.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This API queries the item-level traffic control effect of a specific traffic control task within a given time range.</li>
     * <li>TrafficControlTaskId is the ID that uniquely identifies a traffic control task.</li>
     * <li>InstanceId specifies the instance that runs the task.</li>
     * <li>The Environment parameter defines the environment in which the task runs. Valid values: Daily (daily environment), Pre (pre-release environment), and Prod (production environment).</li>
     * <li>StartTime and EndTime represent the start and end points of the query time range, respectively. The format is YYYY-MM-DD HH:MM:SS.</li>
     * <li>Make sure that the start time and end time are valid and fall within the same calendar day or consecutive calendar days.</li>
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
     * <h2>Request description</h2>
     * <p>This operation allows you to update the configuration of an existing data diagnostic task, including the instance ID, task name, task type, and specific configuration details. Ensure that you provide the correct <code>DataDiagnosisId</code> in the request body to locate the specific task to be updated, and specify the corresponding configuration parameters (<code>Config</code>) based on the selected task type (<code>Type</code>). For periodic tasks, set the desired execution time by using the <code>CycleTime</code> field. If periodic execution is not required, omit this field.</p>
     * <h2>Precautions</h2>
     * <ul>
     * <li><code>DataDiagnosisId</code> is a path parameter and must be provided to uniquely identify a data diagnostic task.</li>
     * <li>The content structure of the <code>Config</code> field varies depending on the <code>Type</code> value. Refer to the documentation examples for configuration details.</li>
     * <li>If periodic execution is not required, you can omit the <code>CycleTime</code> field.</li>
     * <li>When the update involves join table analysis (<code>JoinTables</code>), ensure that you correctly specify the information for the left and right tables, including <code>LeftTableMetaId</code> and <code>RightTableMetaId</code>.</li>
     * <li>For all types of data diagnostic tasks, <code>InstanceId</code>, <code>Name</code>, and <code>Type</code> are required.</li>
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
     * <h2>Request description</h2>
     * <p>This API operation allows you to update the configuration of an existing feature consistency check job. By providing new configuration parameters, you can modify multiple properties, including the instance ID, name, and scene ID. Make sure that all required parameters are included in the request, and provide optional parameters as needed.</p>
     * <ul>
     * <li><strong>FeatureConsistencyCheckJobConfigId</strong> is a path parameter used to specify the feature consistency check job to be updated.</li>
     * <li>All other parameters are located in the request body. Some of them are required (such as InstanceId and Name), while others are optional.</li>
     * <li>Note that <code>SampleRate</code> must be a floating-point number between 0 and 1, which represents the sampling ratio.</li>
     * <li>If you use <code>FeatureStore</code>-related features, make sure to correctly set the <code>IsUseFeatureStore</code> flag and the related <code>FeatureStore*</code> fields.</li>
     * <li>For network configuration parameters (such as VpcId and SwitchId), make sure that the provided values match your Alibaba Cloud environment.</li>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows you to update a traffic control target by its ID.</li>
     * <li><code>TrafficControlTargetId</code> is a path parameter. You must provide a specific traffic control target ID.</li>
     * <li><code>ItemConditionType</code> defines the format of the item control condition. Valid values: <code>Array</code> and <code>Expression</code>. Based on the selected type, fill in the <code>ItemConditionArray</code> or <code>ItemConditionExpress</code> field accordingly.</li>
     * <li>If <code>NewProductRegulation</code> is set to <code>true</code>, the control rule applies specifically to new products.</li>
     * <li><code>StatisPeriod</code> supports <code>Daily</code> and <code>Hour</code> options. The default value is determined by the system.</li>
     * <li>Ensure that the interval between <code>StartTime</code> and <code>EndTime</code> is reasonable and meets your business requirements.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTrafficControlTarget  UpdateTrafficControlTargetRequest
     * @return UpdateTrafficControlTargetResponse
     */
    CompletableFuture<UpdateTrafficControlTargetResponse> updateTrafficControlTarget(UpdateTrafficControlTargetRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API updates an existing traffic control task.</li>
     * <li>When <code>ExecutionTime</code> is set to <code>TimeRange</code>, you must provide both <code>StartTime</code> and <code>EndTime</code>.</li>
     * <li>Each element in the <code>TrafficControlTargets</code> array represents a specific traffic control target. Make sure that the time range, condition type, and other information for each target are complete and valid.</li>
     * <li>If <code>UserConditionType</code> or <code>ItemConditionType</code> is set to <code>Expression</code>, the corresponding expression field (such as <code>UserConditionExpress</code>) cannot be empty.</li>
     * <li><code>ServiceIds</code> and <code>EffectiveSceneIds</code> are optional parameters. If you use them, make sure that the provided ID lists are in the correct format.</li>
     * <li>During the update, make sure that all required fields are correctly filled in. Otherwise, the request may fail.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTrafficControlTask  UpdateTrafficControlTaskRequest
     * @return UpdateTrafficControlTaskResponse
     */
    CompletableFuture<UpdateTrafficControlTaskResponse> updateTrafficControlTask(UpdateTrafficControlTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API allows you to update the traffic configuration of a specific traffic control task, including but not limited to the traffic control target ID, record time, target traffic, and overall traffic. Make sure that the provided <code>TrafficControlTaskId</code> is valid and within the permission scope of the current user. In addition, each object in the <code>Traffics</code> array must contain the required fields to ensure successful request processing.</p>
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
