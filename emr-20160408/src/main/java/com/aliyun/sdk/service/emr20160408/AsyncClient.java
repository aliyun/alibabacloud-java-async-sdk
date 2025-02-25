// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.emr20160408.models.*;
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

    CompletableFuture<AddClusterServiceResponse> addClusterService(AddClusterServiceRequest request);

    CompletableFuture<AddScalingConfigItemV2Response> addScalingConfigItemV2(AddScalingConfigItemV2Request request);

    CompletableFuture<CloneFlowResponse> cloneFlow(CloneFlowRequest request);

    CompletableFuture<CloneFlowJobResponse> cloneFlowJob(CloneFlowJobRequest request);

    CompletableFuture<CreateClusterHostGroupResponse> createClusterHostGroup(CreateClusterHostGroupRequest request);

    CompletableFuture<CreateClusterTemplateResponse> createClusterTemplate(CreateClusterTemplateRequest request);

    CompletableFuture<CreateClusterV2Response> createClusterV2(CreateClusterV2Request request);

    CompletableFuture<CreateClusterWithTemplateResponse> createClusterWithTemplate(CreateClusterWithTemplateRequest request);

    CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request);

    CompletableFuture<CreateFlowCategoryResponse> createFlowCategory(CreateFlowCategoryRequest request);

    CompletableFuture<CreateFlowForWebResponse> createFlowForWeb(CreateFlowForWebRequest request);

    CompletableFuture<CreateFlowJobResponse> createFlowJob(CreateFlowJobRequest request);

    CompletableFuture<CreateFlowProjectResponse> createFlowProject(CreateFlowProjectRequest request);

    CompletableFuture<CreateFlowProjectClusterSettingResponse> createFlowProjectClusterSetting(CreateFlowProjectClusterSettingRequest request);

    CompletableFuture<CreateFlowProjectUserResponse> createFlowProjectUser(CreateFlowProjectUserRequest request);

    CompletableFuture<CreateResourcePoolResponse> createResourcePool(CreateResourcePoolRequest request);

    CompletableFuture<CreateResourceQueueResponse> createResourceQueue(CreateResourceQueueRequest request);

    CompletableFuture<CreateScalingGroupV2Response> createScalingGroupV2(CreateScalingGroupV2Request request);

    CompletableFuture<DeleteClusterTemplateResponse> deleteClusterTemplate(DeleteClusterTemplateRequest request);

    CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request);

    CompletableFuture<DeleteFlowCategoryResponse> deleteFlowCategory(DeleteFlowCategoryRequest request);

    CompletableFuture<DeleteFlowJobResponse> deleteFlowJob(DeleteFlowJobRequest request);

    CompletableFuture<DeleteFlowProjectResponse> deleteFlowProject(DeleteFlowProjectRequest request);

    CompletableFuture<DeleteFlowProjectClusterSettingResponse> deleteFlowProjectClusterSetting(DeleteFlowProjectClusterSettingRequest request);

    CompletableFuture<DeleteFlowProjectUserResponse> deleteFlowProjectUser(DeleteFlowProjectUserRequest request);

    CompletableFuture<DeleteResourcePoolResponse> deleteResourcePool(DeleteResourcePoolRequest request);

    CompletableFuture<DeleteResourceQueueResponse> deleteResourceQueue(DeleteResourceQueueRequest request);

    CompletableFuture<DescribeClusterBasicInfoResponse> describeClusterBasicInfo(DescribeClusterBasicInfoRequest request);

    CompletableFuture<DescribeClusterOperationHostTaskLogResponse> describeClusterOperationHostTaskLog(DescribeClusterOperationHostTaskLogRequest request);

    CompletableFuture<DescribeClusterResourcePoolSchedulerTypeResponse> describeClusterResourcePoolSchedulerType(DescribeClusterResourcePoolSchedulerTypeRequest request);

    CompletableFuture<DescribeClusterServiceResponse> describeClusterService(DescribeClusterServiceRequest request);

    CompletableFuture<DescribeClusterServiceConfigResponse> describeClusterServiceConfig(DescribeClusterServiceConfigRequest request);

    CompletableFuture<DescribeClusterServiceConfigTagResponse> describeClusterServiceConfigTag(DescribeClusterServiceConfigTagRequest request);

    CompletableFuture<DescribeClusterTemplateResponse> describeClusterTemplate(DescribeClusterTemplateRequest request);

    CompletableFuture<DescribeClusterV2Response> describeClusterV2(DescribeClusterV2Request request);

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

    CompletableFuture<DescribeScalingConfigItemV2Response> describeScalingConfigItemV2(DescribeScalingConfigItemV2Request request);

    CompletableFuture<DescribeScalingGroupInstanceV2Response> describeScalingGroupInstanceV2(DescribeScalingGroupInstanceV2Request request);

    CompletableFuture<DescribeScalingGroupV2Response> describeScalingGroupV2(DescribeScalingGroupV2Request request);

    CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request);

    CompletableFuture<KillFlowJobResponse> killFlowJob(KillFlowJobRequest request);

    CompletableFuture<ListClusterHostResponse> listClusterHost(ListClusterHostRequest request);

    CompletableFuture<ListClusterHostComponentResponse> listClusterHostComponent(ListClusterHostComponentRequest request);

    CompletableFuture<ListClusterHostGroupResponse> listClusterHostGroup(ListClusterHostGroupRequest request);

    CompletableFuture<ListClusterInstalledServiceResponse> listClusterInstalledService(ListClusterInstalledServiceRequest request);

    CompletableFuture<ListClusterOperationResponse> listClusterOperation(ListClusterOperationRequest request);

    CompletableFuture<ListClusterOperationHostResponse> listClusterOperationHost(ListClusterOperationHostRequest request);

    CompletableFuture<ListClusterOperationHostTaskResponse> listClusterOperationHostTask(ListClusterOperationHostTaskRequest request);

    CompletableFuture<ListClusterOperationTaskResponse> listClusterOperationTask(ListClusterOperationTaskRequest request);

    CompletableFuture<ListClusterServiceResponse> listClusterService(ListClusterServiceRequest request);

    CompletableFuture<ListClusterServiceComponentHealthInfoResponse> listClusterServiceComponentHealthInfo(ListClusterServiceComponentHealthInfoRequest request);

    CompletableFuture<ListClusterServiceConfigHistoryResponse> listClusterServiceConfigHistory(ListClusterServiceConfigHistoryRequest request);

    CompletableFuture<ListClusterServiceQuickLinkResponse> listClusterServiceQuickLink(ListClusterServiceQuickLinkRequest request);

    CompletableFuture<ListClusterTemplatesResponse> listClusterTemplates(ListClusterTemplatesRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListEmrAvailableConfigResponse> listEmrAvailableConfig(ListEmrAvailableConfigRequest request);

    CompletableFuture<ListEmrAvailableResourceResponse> listEmrAvailableResource(ListEmrAvailableResourceRequest request);

    CompletableFuture<ListEmrMainVersionResponse> listEmrMainVersion(ListEmrMainVersionRequest request);

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

    CompletableFuture<ListResourcePoolResponse> listResourcePool(ListResourcePoolRequest request);

    CompletableFuture<ListScalingActivityV2Response> listScalingActivityV2(ListScalingActivityV2Request request);

    CompletableFuture<ListScalingConfigItemV2Response> listScalingConfigItemV2(ListScalingConfigItemV2Request request);

    CompletableFuture<ListScalingGroupV2Response> listScalingGroupV2(ListScalingGroupV2Request request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyClusterNameResponse> modifyClusterName(ModifyClusterNameRequest request);

    CompletableFuture<ModifyClusterServiceConfigResponse> modifyClusterServiceConfig(ModifyClusterServiceConfigRequest request);

    CompletableFuture<ModifyClusterTemplateResponse> modifyClusterTemplate(ModifyClusterTemplateRequest request);

    CompletableFuture<ModifyFlowCategoryResponse> modifyFlowCategory(ModifyFlowCategoryRequest request);

    CompletableFuture<ModifyFlowForWebResponse> modifyFlowForWeb(ModifyFlowForWebRequest request);

    CompletableFuture<ModifyFlowProjectResponse> modifyFlowProject(ModifyFlowProjectRequest request);

    CompletableFuture<ModifyFlowProjectClusterSettingResponse> modifyFlowProjectClusterSetting(ModifyFlowProjectClusterSettingRequest request);

    CompletableFuture<ModifyResourcePoolResponse> modifyResourcePool(ModifyResourcePoolRequest request);

    CompletableFuture<ModifyResourcePoolSchedulerTypeResponse> modifyResourcePoolSchedulerType(ModifyResourcePoolSchedulerTypeRequest request);

    CompletableFuture<ModifyResourceQueueResponse> modifyResourceQueue(ModifyResourceQueueRequest request);

    CompletableFuture<ModifyScalingConfigItemV2Response> modifyScalingConfigItemV2(ModifyScalingConfigItemV2Request request);

    CompletableFuture<ModifyScalingGroupV2Response> modifyScalingGroupV2(ModifyScalingGroupV2Request request);

    CompletableFuture<RefreshClusterResourcePoolResponse> refreshClusterResourcePool(RefreshClusterResourcePoolRequest request);

    CompletableFuture<ReleaseClusterResponse> releaseCluster(ReleaseClusterRequest request);

    CompletableFuture<ReleaseClusterHostGroupResponse> releaseClusterHostGroup(ReleaseClusterHostGroupRequest request);

    CompletableFuture<RemoveScalingConfigItemV2Response> removeScalingConfigItemV2(RemoveScalingConfigItemV2Request request);

    CompletableFuture<RerunFlowResponse> rerunFlow(RerunFlowRequest request);

    CompletableFuture<ResizeClusterV2Response> resizeClusterV2(ResizeClusterV2Request request);

    CompletableFuture<ResumeFlowResponse> resumeFlow(ResumeFlowRequest request);

    CompletableFuture<RunClusterServiceActionResponse> runClusterServiceAction(RunClusterServiceActionRequest request);

    CompletableFuture<RunScalingActionV2Response> runScalingActionV2(RunScalingActionV2Request request);

    CompletableFuture<StartFlowResponse> startFlow(StartFlowRequest request);

    CompletableFuture<SubmitFlowResponse> submitFlow(SubmitFlowRequest request);

    CompletableFuture<SubmitFlowJobResponse> submitFlowJob(SubmitFlowJobRequest request);

    CompletableFuture<SuspendFlowResponse> suspendFlow(SuspendFlowRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
