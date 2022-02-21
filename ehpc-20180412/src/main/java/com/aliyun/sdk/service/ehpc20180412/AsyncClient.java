// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ehpc20180412.models.*;
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

    CompletableFuture<AddContainerAppResponse> addContainerApp(AddContainerAppRequest request);

    CompletableFuture<AddExistedNodesResponse> addExistedNodes(AddExistedNodesRequest request);

    CompletableFuture<AddLocalNodesResponse> addLocalNodes(AddLocalNodesRequest request);

    CompletableFuture<AddNodesResponse> addNodes(AddNodesRequest request);

    CompletableFuture<AddQueueResponse> addQueue(AddQueueRequest request);

    CompletableFuture<AddSecurityGroupResponse> addSecurityGroup(AddSecurityGroupRequest request);

    CompletableFuture<AddUsersResponse> addUsers(AddUsersRequest request);

    CompletableFuture<ApplyNodesResponse> applyNodes(ApplyNodesRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateGWSClusterResponse> createGWSCluster(CreateGWSClusterRequest request);

    CompletableFuture<CreateGWSImageResponse> createGWSImage(CreateGWSImageRequest request);

    CompletableFuture<CreateGWSInstanceResponse> createGWSInstance(CreateGWSInstanceRequest request);

    CompletableFuture<CreateHybridClusterResponse> createHybridCluster(CreateHybridClusterRequest request);

    CompletableFuture<CreateJobFileResponse> createJobFile(CreateJobFileRequest request);

    CompletableFuture<CreateJobTemplateResponse> createJobTemplate(CreateJobTemplateRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteContainerAppsResponse> deleteContainerApps(DeleteContainerAppsRequest request);

    CompletableFuture<DeleteGWSClusterResponse> deleteGWSCluster(DeleteGWSClusterRequest request);

    CompletableFuture<DeleteGWSInstanceResponse> deleteGWSInstance(DeleteGWSInstanceRequest request);

    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    CompletableFuture<DeleteJobTemplatesResponse> deleteJobTemplates(DeleteJobTemplatesRequest request);

    CompletableFuture<DeleteJobsResponse> deleteJobs(DeleteJobsRequest request);

    CompletableFuture<DeleteNodesResponse> deleteNodes(DeleteNodesRequest request);

    CompletableFuture<DeleteQueueResponse> deleteQueue(DeleteQueueRequest request);

    CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request);

    CompletableFuture<DeleteUsersResponse> deleteUsers(DeleteUsersRequest request);

    CompletableFuture<DescribeAutoScaleConfigResponse> describeAutoScaleConfig(DescribeAutoScaleConfigRequest request);

    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    CompletableFuture<DescribeContainerAppResponse> describeContainerApp(DescribeContainerAppRequest request);

    CompletableFuture<DescribeGWSClusterPolicyResponse> describeGWSClusterPolicy(DescribeGWSClusterPolicyRequest request);

    CompletableFuture<DescribeGWSClustersResponse> describeGWSClusters(DescribeGWSClustersRequest request);

    CompletableFuture<DescribeGWSImagesResponse> describeGWSImages(DescribeGWSImagesRequest request);

    CompletableFuture<DescribeGWSInstancesResponse> describeGWSInstances(DescribeGWSInstancesRequest request);

    CompletableFuture<DescribeImageResponse> describeImage(DescribeImageRequest request);

    CompletableFuture<DescribeImageGatewayConfigResponse> describeImageGatewayConfig(DescribeImageGatewayConfigRequest request);

    CompletableFuture<DescribeImagePriceResponse> describeImagePrice(DescribeImagePriceRequest request);

    CompletableFuture<DescribeJobResponse> describeJob(DescribeJobRequest request);

    CompletableFuture<DescribeNFSClientStatusResponse> describeNFSClientStatus(DescribeNFSClientStatusRequest request);

    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    CompletableFuture<EditJobTemplateResponse> editJobTemplate(EditJobTemplateRequest request);

    CompletableFuture<GetAccountingReportResponse> getAccountingReport(GetAccountingReportRequest request);

    CompletableFuture<GetAutoScaleConfigResponse> getAutoScaleConfig(GetAutoScaleConfigRequest request);

    CompletableFuture<GetCloudMetricLogsResponse> getCloudMetricLogs(GetCloudMetricLogsRequest request);

    CompletableFuture<GetCloudMetricProfilingResponse> getCloudMetricProfiling(GetCloudMetricProfilingRequest request);

    CompletableFuture<GetClusterVolumesResponse> getClusterVolumes(GetClusterVolumesRequest request);

    CompletableFuture<GetGWSConnectTicketResponse> getGWSConnectTicket(GetGWSConnectTicketRequest request);

    CompletableFuture<GetHybridClusterConfigResponse> getHybridClusterConfig(GetHybridClusterConfigRequest request);

    CompletableFuture<GetIfEcsTypeSupportHtConfigResponse> getIfEcsTypeSupportHtConfig(GetIfEcsTypeSupportHtConfigRequest request);

    CompletableFuture<GetSchedulerInfoResponse> getSchedulerInfo(GetSchedulerInfoRequest request);

    CompletableFuture<GetVisualServiceStatusResponse> getVisualServiceStatus(GetVisualServiceStatusRequest request);

    CompletableFuture<InitializeEHPCResponse> initializeEHPC(InitializeEHPCRequest request);

    CompletableFuture<InstallSoftwareResponse> installSoftware(InstallSoftwareRequest request);

    CompletableFuture<InvokeShellCommandResponse> invokeShellCommand(InvokeShellCommandRequest request);

    CompletableFuture<ListAvailableEcsTypesResponse> listAvailableEcsTypes(ListAvailableEcsTypesRequest request);

    CompletableFuture<ListCloudMetricProfilingsResponse> listCloudMetricProfilings(ListCloudMetricProfilingsRequest request);

    CompletableFuture<ListClusterLogsResponse> listClusterLogs(ListClusterLogsRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListClustersMetaResponse> listClustersMeta(ListClustersMetaRequest request);

    CompletableFuture<ListCommandsResponse> listCommands(ListCommandsRequest request);

    CompletableFuture<ListContainerAppsResponse> listContainerApps(ListContainerAppsRequest request);

    CompletableFuture<ListContainerImagesResponse> listContainerImages(ListContainerImagesRequest request);

    CompletableFuture<ListCpfsFileSystemsResponse> listCpfsFileSystems(ListCpfsFileSystemsRequest request);

    CompletableFuture<ListCurrentClientVersionResponse> listCurrentClientVersion(ListCurrentClientVersionRequest request);

    CompletableFuture<ListCustomImagesResponse> listCustomImages(ListCustomImagesRequest request);

    CompletableFuture<ListFileSystemWithMountTargetsResponse> listFileSystemWithMountTargets(ListFileSystemWithMountTargetsRequest request);

    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    CompletableFuture<ListInstalledSoftwareResponse> listInstalledSoftware(ListInstalledSoftwareRequest request);

    CompletableFuture<ListInvocationResultsResponse> listInvocationResults(ListInvocationResultsRequest request);

    CompletableFuture<ListInvocationStatusResponse> listInvocationStatus(ListInvocationStatusRequest request);

    CompletableFuture<ListJobTemplatesResponse> listJobTemplates(ListJobTemplatesRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListNodesByQueueResponse> listNodesByQueue(ListNodesByQueueRequest request);

    CompletableFuture<ListNodesNoPagingResponse> listNodesNoPaging(ListNodesNoPagingRequest request);

    CompletableFuture<ListPreferredEcsTypesResponse> listPreferredEcsTypes(ListPreferredEcsTypesRequest request);

    CompletableFuture<ListQueuesResponse> listQueues(ListQueuesRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListSecurityGroupsResponse> listSecurityGroups(ListSecurityGroupsRequest request);

    CompletableFuture<ListSoftwaresResponse> listSoftwares(ListSoftwaresRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListVolumesResponse> listVolumes(ListVolumesRequest request);

    CompletableFuture<ModifyClusterAttributesResponse> modifyClusterAttributes(ModifyClusterAttributesRequest request);

    CompletableFuture<ModifyContainerAppAttributesResponse> modifyContainerAppAttributes(ModifyContainerAppAttributesRequest request);

    CompletableFuture<ModifyImageGatewayConfigResponse> modifyImageGatewayConfig(ModifyImageGatewayConfigRequest request);

    CompletableFuture<ModifyUserGroupsResponse> modifyUserGroups(ModifyUserGroupsRequest request);

    CompletableFuture<ModifyUserPasswordsResponse> modifyUserPasswords(ModifyUserPasswordsRequest request);

    CompletableFuture<ModifyVisualServicePasswdResponse> modifyVisualServicePasswd(ModifyVisualServicePasswdRequest request);

    CompletableFuture<MountNFSResponse> mountNFS(MountNFSRequest request);

    CompletableFuture<PullImageResponse> pullImage(PullImageRequest request);

    CompletableFuture<QueryServicePackAndPriceResponse> queryServicePackAndPrice(QueryServicePackAndPriceRequest request);

    CompletableFuture<RecoverClusterResponse> recoverCluster(RecoverClusterRequest request);

    CompletableFuture<RerunJobsResponse> rerunJobs(RerunJobsRequest request);

    CompletableFuture<ResetNodesResponse> resetNodes(ResetNodesRequest request);

    CompletableFuture<RunCloudMetricProfilingResponse> runCloudMetricProfiling(RunCloudMetricProfilingRequest request);

    CompletableFuture<SetAutoScaleConfigResponse> setAutoScaleConfig(SetAutoScaleConfigRequest request);

    CompletableFuture<SetGWSClusterPolicyResponse> setGWSClusterPolicy(SetGWSClusterPolicyRequest request);

    CompletableFuture<SetGWSInstanceNameResponse> setGWSInstanceName(SetGWSInstanceNameRequest request);

    CompletableFuture<SetGWSInstanceUserResponse> setGWSInstanceUser(SetGWSInstanceUserRequest request);

    CompletableFuture<SetQueueResponse> setQueue(SetQueueRequest request);

    CompletableFuture<SetSchedulerInfoResponse> setSchedulerInfo(SetSchedulerInfoRequest request);

    CompletableFuture<StartClusterResponse> startCluster(StartClusterRequest request);

    CompletableFuture<StartGWSInstanceResponse> startGWSInstance(StartGWSInstanceRequest request);

    CompletableFuture<StartNodesResponse> startNodes(StartNodesRequest request);

    CompletableFuture<StartVisualServiceResponse> startVisualService(StartVisualServiceRequest request);

    CompletableFuture<StopClusterResponse> stopCluster(StopClusterRequest request);

    CompletableFuture<StopGWSInstanceResponse> stopGWSInstance(StopGWSInstanceRequest request);

    CompletableFuture<StopJobsResponse> stopJobs(StopJobsRequest request);

    CompletableFuture<StopNodesResponse> stopNodes(StopNodesRequest request);

    CompletableFuture<StopVisualServiceResponse> stopVisualService(StopVisualServiceRequest request);

    CompletableFuture<SubmitJobResponse> submitJob(SubmitJobRequest request);

    CompletableFuture<SyncUsersResponse> syncUsers(SyncUsersRequest request);

    CompletableFuture<UninstallSoftwareResponse> uninstallSoftware(UninstallSoftwareRequest request);

    CompletableFuture<UpdateClusterVolumesResponse> updateClusterVolumes(UpdateClusterVolumesRequest request);

    CompletableFuture<UpdateQueueConfigResponse> updateQueueConfig(UpdateQueueConfigRequest request);

    CompletableFuture<UpgradeClientResponse> upgradeClient(UpgradeClientRequest request);

}
