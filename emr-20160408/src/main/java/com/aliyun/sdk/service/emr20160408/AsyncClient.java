// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.emr20160408.models.*;
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

    CompletableFuture<AddClusterServiceResponse> addClusterService(AddClusterServiceRequest request);

    CompletableFuture<AddScalingConfigItemV2Response> addScalingConfigItemV2(AddScalingConfigItemV2Request request);

    CompletableFuture<AuthorizeSecurityGroupResponse> authorizeSecurityGroup(AuthorizeSecurityGroupRequest request);

    CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request);

    CompletableFuture<CloneFlowResponse> cloneFlow(CloneFlowRequest request);

    CompletableFuture<CloneFlowJobResponse> cloneFlowJob(CloneFlowJobRequest request);

    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request);

    CompletableFuture<CreateClusterBootstrapActionResponse> createClusterBootstrapAction(CreateClusterBootstrapActionRequest request);

    CompletableFuture<CreateClusterHostGroupResponse> createClusterHostGroup(CreateClusterHostGroupRequest request);

    CompletableFuture<CreateClusterTemplateResponse> createClusterTemplate(CreateClusterTemplateRequest request);

    CompletableFuture<CreateClusterV2Response> createClusterV2(CreateClusterV2Request request);

    CompletableFuture<CreateClusterWithTemplateResponse> createClusterWithTemplate(CreateClusterWithTemplateRequest request);

    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    CompletableFuture<CreateExecutionPlanResponse> createExecutionPlan(CreateExecutionPlanRequest request);

    CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request);

    CompletableFuture<CreateFlowCategoryResponse> createFlowCategory(CreateFlowCategoryRequest request);

    CompletableFuture<CreateFlowForWebResponse> createFlowForWeb(CreateFlowForWebRequest request);

    CompletableFuture<CreateFlowJobResponse> createFlowJob(CreateFlowJobRequest request);

    CompletableFuture<CreateFlowProjectResponse> createFlowProject(CreateFlowProjectRequest request);

    CompletableFuture<CreateFlowProjectClusterSettingResponse> createFlowProjectClusterSetting(CreateFlowProjectClusterSettingRequest request);

    CompletableFuture<CreateFlowProjectUserResponse> createFlowProjectUser(CreateFlowProjectUserRequest request);

    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    CompletableFuture<CreateLibraryResponse> createLibrary(CreateLibraryRequest request);

    CompletableFuture<CreateMetaTablePreviewTaskResponse> createMetaTablePreviewTask(CreateMetaTablePreviewTaskRequest request);

    CompletableFuture<CreateResourcePoolResponse> createResourcePool(CreateResourcePoolRequest request);

    CompletableFuture<CreateResourceQueueResponse> createResourceQueue(CreateResourceQueueRequest request);

    CompletableFuture<CreateScalingGroupV2Response> createScalingGroupV2(CreateScalingGroupV2Request request);

    CompletableFuture<CreateScalingRuleResponse> createScalingRule(CreateScalingRuleRequest request);

    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<CreateUsersResponse> createUsers(CreateUsersRequest request);

    CompletableFuture<DecommissionHostComponentResponse> decommissionHostComponent(DecommissionHostComponentRequest request);

    CompletableFuture<DeleteClusterTemplateResponse> deleteClusterTemplate(DeleteClusterTemplateRequest request);

    CompletableFuture<DeleteExecutionPlanResponse> deleteExecutionPlan(DeleteExecutionPlanRequest request);

    CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request);

    CompletableFuture<DeleteFlowCategoryResponse> deleteFlowCategory(DeleteFlowCategoryRequest request);

    CompletableFuture<DeleteFlowJobResponse> deleteFlowJob(DeleteFlowJobRequest request);

    CompletableFuture<DeleteFlowProjectResponse> deleteFlowProject(DeleteFlowProjectRequest request);

    CompletableFuture<DeleteFlowProjectClusterSettingResponse> deleteFlowProjectClusterSetting(DeleteFlowProjectClusterSettingRequest request);

    CompletableFuture<DeleteFlowProjectUserResponse> deleteFlowProjectUser(DeleteFlowProjectUserRequest request);

    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    CompletableFuture<DeleteLibrariesResponse> deleteLibraries(DeleteLibrariesRequest request);

    CompletableFuture<DeleteResourcePoolResponse> deleteResourcePool(DeleteResourcePoolRequest request);

    CompletableFuture<DeleteResourceQueueResponse> deleteResourceQueue(DeleteResourceQueueRequest request);

    CompletableFuture<DeleteScalingRuleResponse> deleteScalingRule(DeleteScalingRuleRequest request);

    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DescribeClusterBasicInfoResponse> describeClusterBasicInfo(DescribeClusterBasicInfoRequest request);

    CompletableFuture<DescribeClusterMetaCollectResponse> describeClusterMetaCollect(DescribeClusterMetaCollectRequest request);

    CompletableFuture<DescribeClusterOperationHostTaskLogResponse> describeClusterOperationHostTaskLog(DescribeClusterOperationHostTaskLogRequest request);

    CompletableFuture<DescribeClusterResourcePoolSchedulerTypeResponse> describeClusterResourcePoolSchedulerType(DescribeClusterResourcePoolSchedulerTypeRequest request);

    CompletableFuture<DescribeClusterServiceResponse> describeClusterService(DescribeClusterServiceRequest request);

    CompletableFuture<DescribeClusterServiceConfigResponse> describeClusterServiceConfig(DescribeClusterServiceConfigRequest request);

    CompletableFuture<DescribeClusterServiceConfigHistoryResponse> describeClusterServiceConfigHistory(DescribeClusterServiceConfigHistoryRequest request);

    CompletableFuture<DescribeClusterServiceConfigTagResponse> describeClusterServiceConfigTag(DescribeClusterServiceConfigTagRequest request);

    CompletableFuture<DescribeClusterTemplateResponse> describeClusterTemplate(DescribeClusterTemplateRequest request);

    CompletableFuture<DescribeClusterV2Response> describeClusterV2(DescribeClusterV2Request request);

    CompletableFuture<DescribeDataSourceResponse> describeDataSource(DescribeDataSourceRequest request);

    CompletableFuture<DescribeDiskOpsActivityResponse> describeDiskOpsActivity(DescribeDiskOpsActivityRequest request);

    CompletableFuture<DescribeEmrMainVersionResponse> describeEmrMainVersion(DescribeEmrMainVersionRequest request);

    CompletableFuture<DescribeExecutionPlanResponse> describeExecutionPlan(DescribeExecutionPlanRequest request);

    CompletableFuture<DescribeFlowResponse> describeFlow(DescribeFlowRequest request);

    CompletableFuture<DescribeFlowCategoryResponse> describeFlowCategory(DescribeFlowCategoryRequest request);

    CompletableFuture<DescribeFlowCategoryTreeResponse> describeFlowCategoryTree(DescribeFlowCategoryTreeRequest request);

    CompletableFuture<DescribeFlowInstanceResponse> describeFlowInstance(DescribeFlowInstanceRequest request);

    CompletableFuture<DescribeFlowJobResponse> describeFlowJob(DescribeFlowJobRequest request);

    CompletableFuture<DescribeFlowNodeInstanceResponse> describeFlowNodeInstance(DescribeFlowNodeInstanceRequest request);

    CompletableFuture<DescribeFlowNodeInstanceContainerLogResponse> describeFlowNodeInstanceContainerLog(DescribeFlowNodeInstanceContainerLogRequest request);

    CompletableFuture<DescribeFlowNodeInstanceLauncherLogResponse> describeFlowNodeInstanceLauncherLog(DescribeFlowNodeInstanceLauncherLogRequest request);

    CompletableFuture<DescribeFlowProjectResponse> describeFlowProject(DescribeFlowProjectRequest request);

    CompletableFuture<DescribeFlowProjectClusterSettingResponse> describeFlowProjectClusterSetting(DescribeFlowProjectClusterSettingRequest request);

    CompletableFuture<DescribeJobResponse> describeJob(DescribeJobRequest request);

    CompletableFuture<DescribeLibraryDetailResponse> describeLibraryDetail(DescribeLibraryDetailRequest request);

    CompletableFuture<DescribeLibraryInstallTaskDetailResponse> describeLibraryInstallTaskDetail(DescribeLibraryInstallTaskDetailRequest request);

    CompletableFuture<DescribeMetaTablePreviewTaskResponse> describeMetaTablePreviewTask(DescribeMetaTablePreviewTaskRequest request);

    CompletableFuture<DescribeScalingActivityResponse> describeScalingActivity(DescribeScalingActivityRequest request);

    CompletableFuture<DescribeScalingCommonConfigResponse> describeScalingCommonConfig(DescribeScalingCommonConfigRequest request);

    CompletableFuture<DescribeScalingConfigItemV2Response> describeScalingConfigItemV2(DescribeScalingConfigItemV2Request request);

    CompletableFuture<DescribeScalingGroupInstanceV2Response> describeScalingGroupInstanceV2(DescribeScalingGroupInstanceV2Request request);

    CompletableFuture<DescribeScalingGroupV2Response> describeScalingGroupV2(DescribeScalingGroupV2Request request);

    CompletableFuture<DescribeScalingRuleResponse> describeScalingRule(DescribeScalingRuleRequest request);

    CompletableFuture<DescribeSecurityGroupAttributeResponse> describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request);

    CompletableFuture<DetachAndReleaseClusterEniResponse> detachAndReleaseClusterEni(DetachAndReleaseClusterEniRequest request);

    CompletableFuture<GetHdfsCapacityStatisticInfoResponse> getHdfsCapacityStatisticInfo(GetHdfsCapacityStatisticInfoRequest request);

    CompletableFuture<GetJobInputStatisticInfoResponse> getJobInputStatisticInfo(GetJobInputStatisticInfoRequest request);

    CompletableFuture<GetJobOutputStatisticInfoResponse> getJobOutputStatisticInfo(GetJobOutputStatisticInfoRequest request);

    CompletableFuture<GetJobRunningTimeStatisticInfoResponse> getJobRunningTimeStatisticInfo(GetJobRunningTimeStatisticInfoRequest request);

    CompletableFuture<GetQueueInputStatisticInfoResponse> getQueueInputStatisticInfo(GetQueueInputStatisticInfoRequest request);

    CompletableFuture<GetQueueOutputStatisticInfoResponse> getQueueOutputStatisticInfo(GetQueueOutputStatisticInfoRequest request);

    CompletableFuture<GetQueueSubmissionStatisticInfoResponse> getQueueSubmissionStatisticInfo(GetQueueSubmissionStatisticInfoRequest request);

    CompletableFuture<GetUserInputStatisticInfoResponse> getUserInputStatisticInfo(GetUserInputStatisticInfoRequest request);

    CompletableFuture<GetUserOutputStatisticInfoResponse> getUserOutputStatisticInfo(GetUserOutputStatisticInfoRequest request);

    CompletableFuture<GetUserSubmissionStatisticInfoResponse> getUserSubmissionStatisticInfo(GetUserSubmissionStatisticInfoRequest request);

    CompletableFuture<InstallLibrariesResponse> installLibraries(InstallLibrariesRequest request);

    CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request);

    CompletableFuture<KillFlowJobResponse> killFlowJob(KillFlowJobRequest request);

    CompletableFuture<ListAdviceActionResponse> listAdviceAction(ListAdviceActionRequest request);

    CompletableFuture<ListApmApplicationResponse> listApmApplication(ListApmApplicationRequest request);

    CompletableFuture<ListBackupsResponse> listBackups(ListBackupsRequest request);

    CompletableFuture<ListClusterHostResponse> listClusterHost(ListClusterHostRequest request);

    CompletableFuture<ListClusterHostComponentResponse> listClusterHostComponent(ListClusterHostComponentRequest request);

    CompletableFuture<ListClusterHostGroupResponse> listClusterHostGroup(ListClusterHostGroupRequest request);

    CompletableFuture<ListClusterInstalledServiceResponse> listClusterInstalledService(ListClusterInstalledServiceRequest request);

    CompletableFuture<ListClusterOperationResponse> listClusterOperation(ListClusterOperationRequest request);

    CompletableFuture<ListClusterOperationHostResponse> listClusterOperationHost(ListClusterOperationHostRequest request);

    CompletableFuture<ListClusterOperationHostTaskResponse> listClusterOperationHostTask(ListClusterOperationHostTaskRequest request);

    CompletableFuture<ListClusterOperationTaskResponse> listClusterOperationTask(ListClusterOperationTaskRequest request);

    CompletableFuture<ListClusterServiceResponse> listClusterService(ListClusterServiceRequest request);

    CompletableFuture<ListClusterServiceComponentResponse> listClusterServiceComponent(ListClusterServiceComponentRequest request);

    CompletableFuture<ListClusterServiceComponentHealthInfoResponse> listClusterServiceComponentHealthInfo(ListClusterServiceComponentHealthInfoRequest request);

    CompletableFuture<ListClusterServiceConfigHistoryResponse> listClusterServiceConfigHistory(ListClusterServiceConfigHistoryRequest request);

    CompletableFuture<ListClusterServiceQuickLinkResponse> listClusterServiceQuickLink(ListClusterServiceQuickLinkRequest request);

    CompletableFuture<ListClusterTemplatesResponse> listClusterTemplates(ListClusterTemplatesRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListDataSourceResponse> listDataSource(ListDataSourceRequest request);

    CompletableFuture<ListDiskOpsEventsResponse> listDiskOpsEvents(ListDiskOpsEventsRequest request);

    CompletableFuture<ListEmrAvailableConfigResponse> listEmrAvailableConfig(ListEmrAvailableConfigRequest request);

    CompletableFuture<ListEmrAvailableResourceResponse> listEmrAvailableResource(ListEmrAvailableResourceRequest request);

    CompletableFuture<ListEmrMainVersionResponse> listEmrMainVersion(ListEmrMainVersionRequest request);

    CompletableFuture<ListExecutionPlanInstancesResponse> listExecutionPlanInstances(ListExecutionPlanInstancesRequest request);

    CompletableFuture<ListFlowResponse> listFlow(ListFlowRequest request);

    CompletableFuture<ListFlowCategoryResponse> listFlowCategory(ListFlowCategoryRequest request);

    CompletableFuture<ListFlowClusterResponse> listFlowCluster(ListFlowClusterRequest request);

    CompletableFuture<ListFlowClusterAllResponse> listFlowClusterAll(ListFlowClusterAllRequest request);

    CompletableFuture<ListFlowClusterAllHostsResponse> listFlowClusterAllHosts(ListFlowClusterAllHostsRequest request);

    CompletableFuture<ListFlowClusterHostResponse> listFlowClusterHost(ListFlowClusterHostRequest request);

    CompletableFuture<ListFlowInstanceResponse> listFlowInstance(ListFlowInstanceRequest request);

    CompletableFuture<ListFlowJobResponse> listFlowJob(ListFlowJobRequest request);

    CompletableFuture<ListFlowJobHistoryResponse> listFlowJobHistory(ListFlowJobHistoryRequest request);

    CompletableFuture<ListFlowNodeInstanceResponse> listFlowNodeInstance(ListFlowNodeInstanceRequest request);

    CompletableFuture<ListFlowNodeInstanceContainerStatusResponse> listFlowNodeInstanceContainerStatus(ListFlowNodeInstanceContainerStatusRequest request);

    CompletableFuture<ListFlowNodeSqlResultResponse> listFlowNodeSqlResult(ListFlowNodeSqlResultRequest request);

    CompletableFuture<ListFlowProjectResponse> listFlowProject(ListFlowProjectRequest request);

    CompletableFuture<ListFlowProjectClusterSettingResponse> listFlowProjectClusterSetting(ListFlowProjectClusterSettingRequest request);

    CompletableFuture<ListFlowProjectUserResponse> listFlowProjectUser(ListFlowProjectUserRequest request);

    CompletableFuture<ListJobExecutionInstancesResponse> listJobExecutionInstances(ListJobExecutionInstancesRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<ListLibrariesResponse> listLibraries(ListLibrariesRequest request);

    CompletableFuture<ListLibraryInstallTasksResponse> listLibraryInstallTasks(ListLibraryInstallTasksRequest request);

    CompletableFuture<ListLibraryStatusResponse> listLibraryStatus(ListLibraryStatusRequest request);

    CompletableFuture<ListLocalDiskComponentInfoResponse> listLocalDiskComponentInfo(ListLocalDiskComponentInfoRequest request);

    CompletableFuture<ListResourcePoolResponse> listResourcePool(ListResourcePoolRequest request);

    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    CompletableFuture<ListScalingActivityV2Response> listScalingActivityV2(ListScalingActivityV2Request request);

    CompletableFuture<ListScalingConfigItemV2Response> listScalingConfigItemV2(ListScalingConfigItemV2Request request);

    CompletableFuture<ListScalingGroupV2Response> listScalingGroupV2(ListScalingGroupV2Request request);

    CompletableFuture<ListSecurityGroupResponse> listSecurityGroup(ListSecurityGroupRequest request);

    CompletableFuture<ListStackResponse> listStack(ListStackRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListVswitchResponse> listVswitch(ListVswitchRequest request);

    CompletableFuture<ModifyClusterBootstrapActionResponse> modifyClusterBootstrapAction(ModifyClusterBootstrapActionRequest request);

    CompletableFuture<ModifyClusterHostGroupResponse> modifyClusterHostGroup(ModifyClusterHostGroupRequest request);

    CompletableFuture<ModifyClusterMetaCollectResponse> modifyClusterMetaCollect(ModifyClusterMetaCollectRequest request);

    CompletableFuture<ModifyClusterNameResponse> modifyClusterName(ModifyClusterNameRequest request);

    CompletableFuture<ModifyClusterSecurityGroupRuleResponse> modifyClusterSecurityGroupRule(ModifyClusterSecurityGroupRuleRequest request);

    CompletableFuture<ModifyClusterServiceConfigResponse> modifyClusterServiceConfig(ModifyClusterServiceConfigRequest request);

    CompletableFuture<ModifyClusterTemplateResponse> modifyClusterTemplate(ModifyClusterTemplateRequest request);

    CompletableFuture<ModifyExecutionPlanResponse> modifyExecutionPlan(ModifyExecutionPlanRequest request);

    CompletableFuture<ModifyFlowResponse> modifyFlow(ModifyFlowRequest request);

    CompletableFuture<ModifyFlowCategoryResponse> modifyFlowCategory(ModifyFlowCategoryRequest request);

    CompletableFuture<ModifyFlowForWebResponse> modifyFlowForWeb(ModifyFlowForWebRequest request);

    CompletableFuture<ModifyFlowJobResponse> modifyFlowJob(ModifyFlowJobRequest request);

    CompletableFuture<ModifyFlowProjectResponse> modifyFlowProject(ModifyFlowProjectRequest request);

    CompletableFuture<ModifyFlowProjectClusterSettingResponse> modifyFlowProjectClusterSetting(ModifyFlowProjectClusterSettingRequest request);

    CompletableFuture<ModifyJobResponse> modifyJob(ModifyJobRequest request);

    CompletableFuture<ModifyResourcePoolResponse> modifyResourcePool(ModifyResourcePoolRequest request);

    CompletableFuture<ModifyResourcePoolSchedulerTypeResponse> modifyResourcePoolSchedulerType(ModifyResourcePoolSchedulerTypeRequest request);

    CompletableFuture<ModifyResourceQueueResponse> modifyResourceQueue(ModifyResourceQueueRequest request);

    CompletableFuture<ModifyScalingConfigItemV2Response> modifyScalingConfigItemV2(ModifyScalingConfigItemV2Request request);

    CompletableFuture<ModifyScalingGroupV2Response> modifyScalingGroupV2(ModifyScalingGroupV2Request request);

    CompletableFuture<ModifyScalingRuleResponse> modifyScalingRule(ModifyScalingRuleRequest request);

    CompletableFuture<ModifyScalingTaskGroupResponse> modifyScalingTaskGroup(ModifyScalingTaskGroupRequest request);

    CompletableFuture<QueryEntityResponse> queryEntity(QueryEntityRequest request);

    CompletableFuture<QueryTagResponse> queryTag(QueryTagRequest request);

    CompletableFuture<RefreshClusterResourcePoolResponse> refreshClusterResourcePool(RefreshClusterResourcePoolRequest request);

    CompletableFuture<ReleaseClusterResponse> releaseCluster(ReleaseClusterRequest request);

    CompletableFuture<ReleaseClusterHostGroupResponse> releaseClusterHostGroup(ReleaseClusterHostGroupRequest request);

    CompletableFuture<RemoveScalingConfigItemV2Response> removeScalingConfigItemV2(RemoveScalingConfigItemV2Request request);

    CompletableFuture<RerunFlowResponse> rerunFlow(RerunFlowRequest request);

    CompletableFuture<ResizeClusterV2Response> resizeClusterV2(ResizeClusterV2Request request);

    CompletableFuture<ResumeExecutionPlanSchedulerResponse> resumeExecutionPlanScheduler(ResumeExecutionPlanSchedulerRequest request);

    CompletableFuture<ResumeFlowResponse> resumeFlow(ResumeFlowRequest request);

    CompletableFuture<RetryOperationResponse> retryOperation(RetryOperationRequest request);

    CompletableFuture<RunClusterServiceActionResponse> runClusterServiceAction(RunClusterServiceActionRequest request);

    CompletableFuture<RunDiskOpsActivityResponse> runDiskOpsActivity(RunDiskOpsActivityRequest request);

    CompletableFuture<RunExecutionPlanResponse> runExecutionPlan(RunExecutionPlanRequest request);

    CompletableFuture<RunScalingActionV2Response> runScalingActionV2(RunScalingActionV2Request request);

    CompletableFuture<SearchLogResponse> searchLog(SearchLogRequest request);

    CompletableFuture<StartFlowResponse> startFlow(StartFlowRequest request);

    CompletableFuture<SubmitFlowResponse> submitFlow(SubmitFlowRequest request);

    CompletableFuture<SubmitFlowJobResponse> submitFlowJob(SubmitFlowJobRequest request);

    CompletableFuture<SuspendExecutionPlanSchedulerResponse> suspendExecutionPlanScheduler(SuspendExecutionPlanSchedulerRequest request);

    CompletableFuture<SuspendFlowResponse> suspendFlow(SuspendFlowRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UninstallLibrariesResponse> uninstallLibraries(UninstallLibrariesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    CompletableFuture<UpdateLibraryInstallTaskStatusResponse> updateLibraryInstallTaskStatus(UpdateLibraryInstallTaskStatusRequest request);

    CompletableFuture<UpdateTagResponse> updateTag(UpdateTagRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
