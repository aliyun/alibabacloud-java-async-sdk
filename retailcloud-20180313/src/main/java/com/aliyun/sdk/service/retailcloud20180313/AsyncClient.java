// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.retailcloud20180313.models.*;
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

    CompletableFuture<AddClusterNodeResponse> addClusterNode(AddClusterNodeRequest request);

    CompletableFuture<AllocatePodConfigResponse> allocatePodConfig(AllocatePodConfigRequest request);

    CompletableFuture<BatchAddServersResponse> batchAddServers(BatchAddServersRequest request);

    CompletableFuture<BindGroupResponse> bindGroup(BindGroupRequest request);

    CompletableFuture<BindNodeLabelResponse> bindNodeLabel(BindNodeLabelRequest request);

    CompletableFuture<CloseDeployOrderResponse> closeDeployOrder(CloseDeployOrderRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateAppGroupResponse> createAppGroup(CreateAppGroupRequest request);

    CompletableFuture<CreateAppMonitorsResponse> createAppMonitors(CreateAppMonitorsRequest request);

    CompletableFuture<CreateAppResourceAllocResponse> createAppResourceAlloc(CreateAppResourceAllocRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateDbResponse> createDb(CreateDbRequest request);

    CompletableFuture<CreateDeployConfigResponse> createDeployConfig(CreateDeployConfigRequest request);

    CompletableFuture<CreateEciConfigResponse> createEciConfig(CreateEciConfigRequest request);

    CompletableFuture<CreateEnvironmentResponse> createEnvironment(CreateEnvironmentRequest request);

    CompletableFuture<CreateNodeLabelResponse> createNodeLabel(CreateNodeLabelRequest request);

    CompletableFuture<CreatePersistentVolumeResponse> createPersistentVolume(CreatePersistentVolumeRequest request);

    CompletableFuture<CreatePersistentVolumeClaimResponse> createPersistentVolumeClaim(CreatePersistentVolumeClaimRequest request);

    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    CompletableFuture<CreateSlbAPResponse> createSlbAP(CreateSlbAPRequest request);

    CompletableFuture<DeleteAppDetailResponse> deleteAppDetail(DeleteAppDetailRequest request);

    CompletableFuture<DeleteAppEnvironmentResponse> deleteAppEnvironment(DeleteAppEnvironmentRequest request);

    CompletableFuture<DeleteAppGroupResponse> deleteAppGroup(DeleteAppGroupRequest request);

    CompletableFuture<DeleteAppResourceAllocResponse> deleteAppResourceAlloc(DeleteAppResourceAllocRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    CompletableFuture<DeleteDeployConfigResponse> deleteDeployConfig(DeleteDeployConfigRequest request);

    CompletableFuture<DeleteNodeLabelResponse> deleteNodeLabel(DeleteNodeLabelRequest request);

    CompletableFuture<DeletePersistentVolumeResponse> deletePersistentVolume(DeletePersistentVolumeRequest request);

    CompletableFuture<DeletePersistentVolumeClaimResponse> deletePersistentVolumeClaim(DeletePersistentVolumeClaimRequest request);

    CompletableFuture<DeleteRdsAccountResponse> deleteRdsAccount(DeleteRdsAccountRequest request);

    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    CompletableFuture<DeleteSlbAPResponse> deleteSlbAP(DeleteSlbAPRequest request);

    CompletableFuture<DeployAppResponse> deployApp(DeployAppRequest request);

    CompletableFuture<DescribeAppDetailResponse> describeAppDetail(DescribeAppDetailRequest request);

    CompletableFuture<DescribeAppEnvDeployBaselineResponse> describeAppEnvDeployBaseline(DescribeAppEnvDeployBaselineRequest request);

    CompletableFuture<DescribeAppEnvironmentDetailResponse> describeAppEnvironmentDetail(DescribeAppEnvironmentDetailRequest request);

    CompletableFuture<DescribeAppGroupDeploySettingResponse> describeAppGroupDeploySetting(DescribeAppGroupDeploySettingRequest request);

    CompletableFuture<DescribeAppMonitorMetricResponse> describeAppMonitorMetric(DescribeAppMonitorMetricRequest request);

    CompletableFuture<DescribeAppResourceAllocResponse> describeAppResourceAlloc(DescribeAppResourceAllocRequest request);

    CompletableFuture<DescribeClusterDetailResponse> describeClusterDetail(DescribeClusterDetailRequest request);

    CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request);

    CompletableFuture<DescribeDeployOrderDetailResponse> describeDeployOrderDetail(DescribeDeployOrderDetailRequest request);

    CompletableFuture<DescribeEciConfigResponse> describeEciConfig(DescribeEciConfigRequest request);

    CompletableFuture<DescribeEventMonitorListResponse> describeEventMonitorList(DescribeEventMonitorListRequest request);

    CompletableFuture<DescribeJobLogResponse> describeJobLog(DescribeJobLogRequest request);

    CompletableFuture<DescribePodContainerLogListResponse> describePodContainerLogList(DescribePodContainerLogListRequest request);

    CompletableFuture<DescribePodEventsResponse> describePodEvents(DescribePodEventsRequest request);

    CompletableFuture<DescribePodLogResponse> describePodLog(DescribePodLogRequest request);

    CompletableFuture<DescribeRdsAccountsResponse> describeRdsAccounts(DescribeRdsAccountsRequest request);

    CompletableFuture<DescribeServiceDetailResponse> describeServiceDetail(DescribeServiceDetailRequest request);

    CompletableFuture<DescribeSlbAPDetailResponse> describeSlbAPDetail(DescribeSlbAPDetailRequest request);

    CompletableFuture<GetInstTransInfoResponse> getInstTransInfo(GetInstTransInfoRequest request);

    CompletableFuture<GetRdsBackUpResponse> getRdsBackUp(GetRdsBackUpRequest request);

    CompletableFuture<GrantDbToAccountResponse> grantDbToAccount(GrantDbToAccountRequest request);

    CompletableFuture<ListAppResponse> listApp(ListAppRequest request);

    CompletableFuture<ListAppCmsGroupsResponse> listAppCmsGroups(ListAppCmsGroupsRequest request);

    CompletableFuture<ListAppEnvironmentResponse> listAppEnvironment(ListAppEnvironmentRequest request);

    CompletableFuture<ListAppGroupResponse> listAppGroup(ListAppGroupRequest request);

    CompletableFuture<ListAppGroupMappingResponse> listAppGroupMapping(ListAppGroupMappingRequest request);

    CompletableFuture<ListAppInstanceResponse> listAppInstance(ListAppInstanceRequest request);

    CompletableFuture<ListAppResourceAllocsResponse> listAppResourceAllocs(ListAppResourceAllocsRequest request);

    CompletableFuture<ListAvailableClusterNodeResponse> listAvailableClusterNode(ListAvailableClusterNodeRequest request);

    CompletableFuture<ListClusterResponse> listCluster(ListClusterRequest request);

    CompletableFuture<ListClusterNodeResponse> listClusterNode(ListClusterNodeRequest request);

    CompletableFuture<ListDeployConfigResponse> listDeployConfig(ListDeployConfigRequest request);

    CompletableFuture<ListDeployOrdersResponse> listDeployOrders(ListDeployOrdersRequest request);

    CompletableFuture<ListJobHistoriesResponse> listJobHistories(ListJobHistoriesRequest request);

    CompletableFuture<ListNodeLabelBindingsResponse> listNodeLabelBindings(ListNodeLabelBindingsRequest request);

    CompletableFuture<ListNodeLabelsResponse> listNodeLabels(ListNodeLabelsRequest request);

    CompletableFuture<ListPersistentVolumeResponse> listPersistentVolume(ListPersistentVolumeRequest request);

    CompletableFuture<ListPersistentVolumeClaimResponse> listPersistentVolumeClaim(ListPersistentVolumeClaimRequest request);

    CompletableFuture<ListPodsResponse> listPods(ListPodsRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    CompletableFuture<ListSlbAPsResponse> listSlbAPs(ListSlbAPsRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ModifyServiceResponse> modifyService(ModifyServiceRequest request);

    CompletableFuture<ModifySlbAPResponse> modifySlbAP(ModifySlbAPRequest request);

    CompletableFuture<OfflineAppEnvironmentResponse> offlineAppEnvironment(OfflineAppEnvironmentRequest request);

    CompletableFuture<QueryClusterDetailResponse> queryClusterDetail(QueryClusterDetailRequest request);

    CompletableFuture<RebuildAppInstanceResponse> rebuildAppInstance(RebuildAppInstanceRequest request);

    CompletableFuture<RemoveClusterNodeResponse> removeClusterNode(RemoveClusterNodeRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<ResourceStatusNotifyResponse> resourceStatusNotify(ResourceStatusNotifyRequest request);

    CompletableFuture<RestartAppInstanceResponse> restartAppInstance(RestartAppInstanceRequest request);

    CompletableFuture<ResumeDeployResponse> resumeDeploy(ResumeDeployRequest request);

    CompletableFuture<ScaleAppResponse> scaleApp(ScaleAppRequest request);

    CompletableFuture<SetDeployPauseTypeResponse> setDeployPauseType(SetDeployPauseTypeRequest request);

    CompletableFuture<SubmitInfoResponse> submitInfo(SubmitInfoRequest request);

    CompletableFuture<SyncPodInfoResponse> syncPodInfo(SyncPodInfoRequest request);

    CompletableFuture<UnbindGroupResponse> unbindGroup(UnbindGroupRequest request);

    CompletableFuture<UnbindNodeLabelResponse> unbindNodeLabel(UnbindNodeLabelRequest request);

    CompletableFuture<UpdateAppResponse> updateApp(UpdateAppRequest request);

    CompletableFuture<UpdateAppMonitorsResponse> updateAppMonitors(UpdateAppMonitorsRequest request);

    CompletableFuture<UpdateDeployConfigResponse> updateDeployConfig(UpdateDeployConfigRequest request);

    CompletableFuture<UpdateEciConfigResponse> updateEciConfig(UpdateEciConfigRequest request);

    CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request);

    CompletableFuture<UpdateNormalDeployConfigResponse> updateNormalDeployConfig(UpdateNormalDeployConfigRequest request);

}
