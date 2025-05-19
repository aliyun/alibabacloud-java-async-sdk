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
     * @param request the request parameters of CheckInstanceResources  CheckInstanceResourcesRequest
     * @return CheckInstanceResourcesResponse
     */
    CompletableFuture<CheckInstanceResourcesResponse> checkInstanceResources(CheckInstanceResourcesRequest request);

    /**
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
     * @param request the request parameters of CreateParam  CreateParamRequest
     * @return CreateParamResponse
     */
    CompletableFuture<CreateParamResponse> createParam(CreateParamRequest request);

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
     * @param request the request parameters of CreateTrafficControlTarget  CreateTrafficControlTargetRequest
     * @return CreateTrafficControlTargetResponse
     */
    CompletableFuture<CreateTrafficControlTargetResponse> createTrafficControlTarget(CreateTrafficControlTargetRequest request);

    /**
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
     * @param request the request parameters of DeleteTrafficControlTarget  DeleteTrafficControlTargetRequest
     * @return DeleteTrafficControlTargetResponse
     */
    CompletableFuture<DeleteTrafficControlTargetResponse> deleteTrafficControlTarget(DeleteTrafficControlTargetRequest request);

    /**
     * @param request the request parameters of DeleteTrafficControlTask  DeleteTrafficControlTaskRequest
     * @return DeleteTrafficControlTaskResponse
     */
    CompletableFuture<DeleteTrafficControlTaskResponse> deleteTrafficControlTask(DeleteTrafficControlTaskRequest request);

    /**
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
     * @param request the request parameters of GetTrafficControlTarget  GetTrafficControlTargetRequest
     * @return GetTrafficControlTargetResponse
     */
    CompletableFuture<GetTrafficControlTargetResponse> getTrafficControlTarget(GetTrafficControlTargetRequest request);

    /**
     * @param request the request parameters of GetTrafficControlTask  GetTrafficControlTaskRequest
     * @return GetTrafficControlTaskResponse
     */
    CompletableFuture<GetTrafficControlTaskResponse> getTrafficControlTask(GetTrafficControlTaskRequest request);

    /**
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
     * @param request the request parameters of ListTrafficControlTargetTrafficHistory  ListTrafficControlTargetTrafficHistoryRequest
     * @return ListTrafficControlTargetTrafficHistoryResponse
     */
    CompletableFuture<ListTrafficControlTargetTrafficHistoryResponse> listTrafficControlTargetTrafficHistory(ListTrafficControlTargetTrafficHistoryRequest request);

    /**
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
     * @param request the request parameters of QuerySampleConsistencyJobDifference  QuerySampleConsistencyJobDifferenceRequest
     * @return QuerySampleConsistencyJobDifferenceResponse
     */
    CompletableFuture<QuerySampleConsistencyJobDifferenceResponse> querySampleConsistencyJobDifference(QuerySampleConsistencyJobDifferenceRequest request);

    /**
     * @param request the request parameters of QueryTrafficControlTargetItemReportDetail  QueryTrafficControlTargetItemReportDetailRequest
     * @return QueryTrafficControlTargetItemReportDetailResponse
     */
    CompletableFuture<QueryTrafficControlTargetItemReportDetailResponse> queryTrafficControlTargetItemReportDetail(QueryTrafficControlTargetItemReportDetailRequest request);

    /**
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
     * @param request the request parameters of SplitTrafficControlTarget  SplitTrafficControlTargetRequest
     * @return SplitTrafficControlTargetResponse
     */
    CompletableFuture<SplitTrafficControlTargetResponse> splitTrafficControlTarget(SplitTrafficControlTargetRequest request);

    /**
     * @param request the request parameters of StartTrafficControlTarget  StartTrafficControlTargetRequest
     * @return StartTrafficControlTargetResponse
     */
    CompletableFuture<StartTrafficControlTargetResponse> startTrafficControlTarget(StartTrafficControlTargetRequest request);

    /**
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
     * @param request the request parameters of StopTrafficControlTarget  StopTrafficControlTargetRequest
     * @return StopTrafficControlTargetResponse
     */
    CompletableFuture<StopTrafficControlTargetResponse> stopTrafficControlTarget(StopTrafficControlTargetRequest request);

    /**
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
     * @param request the request parameters of UpdateTrafficControlTarget  UpdateTrafficControlTargetRequest
     * @return UpdateTrafficControlTargetResponse
     */
    CompletableFuture<UpdateTrafficControlTargetResponse> updateTrafficControlTarget(UpdateTrafficControlTargetRequest request);

    /**
     * @param request the request parameters of UpdateTrafficControlTask  UpdateTrafficControlTaskRequest
     * @return UpdateTrafficControlTaskResponse
     */
    CompletableFuture<UpdateTrafficControlTaskResponse> updateTrafficControlTask(UpdateTrafficControlTaskRequest request);

    /**
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
