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

    /**
      * If you select an image for a new containerized application, the image is pulled from Docker Hub by default. However, the version of the image may not be up to date. You can call the [PullImage](~~159052~~) operation to pull the latest image.
      *
     */
    CompletableFuture<AddContainerAppResponse> addContainerApp(AddContainerAppRequest request);

    /**
      * *   The compute nodes to be added are in the Stopped state.
      * *   After the compute nodes are added to the cluster, the operating systems of the nodes are replaced with the operating system specified by the ImageId parameter.
      * *   The hosts of the compute nodes must be different from those of the existing compute nodes in the cluster. Otherwise, the add operation fails.
      *
     */
    CompletableFuture<AddExistedNodesResponse> addExistedNodes(AddExistedNodesRequest request);

    CompletableFuture<AddLocalNodesResponse> addLocalNodes(AddLocalNodesRequest request);

    CompletableFuture<AddNodesResponse> addNodes(AddNodesRequest request);

    CompletableFuture<AddQueueResponse> addQueue(AddQueueRequest request);

    CompletableFuture<AddSecurityGroupResponse> addSecurityGroup(AddSecurityGroupRequest request);

    CompletableFuture<AddUsersResponse> addUsers(AddUsersRequest request);

    /**
      * You can call the ApplyNodes operation to specify the number of compute nodes, the number of vCPUs, and the memory size when you add nodes to a cluster.
      *
     */
    CompletableFuture<ApplyNodesResponse> applyNodes(ApplyNodesRequest request);

    /**
      * The ID of the zone.
      * You can call the [ListRegions](~~188593~~) and [DescribeZones](~~25610~~) operations to query IDs of the zones where E-HPC is supported.
      *
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateGWSClusterResponse> createGWSCluster(CreateGWSClusterRequest request);

    CompletableFuture<CreateGWSImageResponse> createGWSImage(CreateGWSImageRequest request);

    CompletableFuture<CreateGWSInstanceResponse> createGWSInstance(CreateGWSInstanceRequest request);

    CompletableFuture<CreateHybridClusterResponse> createHybridCluster(CreateHybridClusterRequest request);

    CompletableFuture<CreateJobFileResponse> createJobFile(CreateJobFileRequest request);

    CompletableFuture<CreateJobTemplateResponse> createJobTemplate(CreateJobTemplateRequest request);

    /**
      * After a cluster is released, the pay-as-you-go nodes and the subscription nodes that have expired are automatically released. The subscription nodes that have not expired are retained. If you need to release the subscription nodes that have not expired, change their billing method to pay-as-you-go. Before you release a cluster, make sure that you will no longer use the cluster.
      *
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteContainerAppsResponse> deleteContainerApps(DeleteContainerAppsRequest request);

    CompletableFuture<DeleteGWSClusterResponse> deleteGWSCluster(DeleteGWSClusterRequest request);

    CompletableFuture<DeleteGWSInstanceResponse> deleteGWSInstance(DeleteGWSInstanceRequest request);

    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    CompletableFuture<DeleteJobTemplatesResponse> deleteJobTemplates(DeleteJobTemplatesRequest request);

    CompletableFuture<DeleteJobsResponse> deleteJobs(DeleteJobsRequest request);

    CompletableFuture<DeleteLocalImageResponse> deleteLocalImage(DeleteLocalImageRequest request);

    /**
      * Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.
      *
     */
    CompletableFuture<DeleteNodesResponse> deleteNodes(DeleteNodesRequest request);

    CompletableFuture<DeleteQueueResponse> deleteQueue(DeleteQueueRequest request);

    CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request);

    /**
      * ## Description
      * If you delete a user, only its information is deleted. The files stored in the /home directory for the user are retained. For example, if you delete a user named user1, the files in the `/home/user1/` directory of the cluster are not deleted. However, a deleted user cannot be recovered. Even if you create another user that has the same name, the data retained for the deleted user is not reused.
      *
     */
    CompletableFuture<DeleteUsersResponse> deleteUsers(DeleteUsersRequest request);

    CompletableFuture<DescribeAutoScaleConfigResponse> describeAutoScaleConfig(DescribeAutoScaleConfigRequest request);

    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    CompletableFuture<DescribeContainerAppResponse> describeContainerApp(DescribeContainerAppRequest request);

    CompletableFuture<DescribeEstackImageResponse> describeEstackImage(DescribeEstackImageRequest request);

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

    CompletableFuture<DescribeServerlessJobsResponse> describeServerlessJobs(DescribeServerlessJobsRequest request);

    CompletableFuture<EditJobTemplateResponse> editJobTemplate(EditJobTemplateRequest request);

    CompletableFuture<GetAccountingReportResponse> getAccountingReport(GetAccountingReportRequest request);

    CompletableFuture<GetAutoScaleConfigResponse> getAutoScaleConfig(GetAutoScaleConfigRequest request);

    CompletableFuture<GetCloudMetricLogsResponse> getCloudMetricLogs(GetCloudMetricLogsRequest request);

    CompletableFuture<GetCloudMetricProfilingResponse> getCloudMetricProfiling(GetCloudMetricProfilingRequest request);

    CompletableFuture<GetClusterVolumesResponse> getClusterVolumes(GetClusterVolumesRequest request);

    CompletableFuture<GetCommonImageResponse> getCommonImage(GetCommonImageRequest request);

    CompletableFuture<GetGWSConnectTicketResponse> getGWSConnectTicket(GetGWSConnectTicketRequest request);

    CompletableFuture<GetHybridClusterConfigResponse> getHybridClusterConfig(GetHybridClusterConfigRequest request);

    CompletableFuture<GetIfEcsTypeSupportHtConfigResponse> getIfEcsTypeSupportHtConfig(GetIfEcsTypeSupportHtConfigRequest request);

    CompletableFuture<GetJobLogResponse> getJobLog(GetJobLogRequest request);

    CompletableFuture<GetPostScriptsResponse> getPostScripts(GetPostScriptsRequest request);

    CompletableFuture<GetSchedulerInfoResponse> getSchedulerInfo(GetSchedulerInfoRequest request);

    CompletableFuture<GetUserImageResponse> getUserImage(GetUserImageRequest request);

    CompletableFuture<GetVisualServiceStatusResponse> getVisualServiceStatus(GetVisualServiceStatusRequest request);

    CompletableFuture<InitializeEHPCResponse> initializeEHPC(InitializeEHPCRequest request);

    CompletableFuture<InspectImageResponse> inspectImage(InspectImageRequest request);

    CompletableFuture<InstallSoftwareResponse> installSoftware(InstallSoftwareRequest request);

    CompletableFuture<InvokeShellCommandResponse> invokeShellCommand(InvokeShellCommandRequest request);

    CompletableFuture<ListAvailableEcsTypesResponse> listAvailableEcsTypes(ListAvailableEcsTypesRequest request);

    CompletableFuture<ListCloudMetricProfilingsResponse> listCloudMetricProfilings(ListCloudMetricProfilingsRequest request);

    CompletableFuture<ListClusterLogsResponse> listClusterLogs(ListClusterLogsRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListClustersMetaResponse> listClustersMeta(ListClustersMetaRequest request);

    CompletableFuture<ListCommandsResponse> listCommands(ListCommandsRequest request);

    CompletableFuture<ListCommunityImagesResponse> listCommunityImages(ListCommunityImagesRequest request);

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

    CompletableFuture<ListJobsWithFiltersResponse> listJobsWithFilters(ListJobsWithFiltersRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListNodesByQueueResponse> listNodesByQueue(ListNodesByQueueRequest request);

    CompletableFuture<ListNodesNoPagingResponse> listNodesNoPaging(ListNodesNoPagingRequest request);

    CompletableFuture<ListPreferredEcsTypesResponse> listPreferredEcsTypes(ListPreferredEcsTypesRequest request);

    CompletableFuture<ListQueuesResponse> listQueues(ListQueuesRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListSecurityGroupsResponse> listSecurityGroups(ListSecurityGroupsRequest request);

    CompletableFuture<ListServerlessJobsResponse> listServerlessJobs(ListServerlessJobsRequest request);

    CompletableFuture<ListSoftwaresResponse> listSoftwares(ListSoftwaresRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * If you succeed in calling an asynchronous API operation, a response is generated before a resulting task is completed. Therefore, to query the result of the task, you can use the TaskId parameter returned by the API operation.
      *
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<ListUpgradeClientsResponse> listUpgradeClients(ListUpgradeClientsRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListUsersAsyncResponse> listUsersAsync(ListUsersAsyncRequest request);

    CompletableFuture<ListVolumesResponse> listVolumes(ListVolumesRequest request);

    /**
      * The new cluster name.
      *
     */
    CompletableFuture<ModifyClusterAttributesResponse> modifyClusterAttributes(ModifyClusterAttributesRequest request);

    CompletableFuture<ModifyContainerAppAttributesResponse> modifyContainerAppAttributes(ModifyContainerAppAttributesRequest request);

    CompletableFuture<ModifyImageGatewayConfigResponse> modifyImageGatewayConfig(ModifyImageGatewayConfigRequest request);

    CompletableFuture<ModifyUserGroupsResponse> modifyUserGroups(ModifyUserGroupsRequest request);

    CompletableFuture<ModifyUserPasswordsResponse> modifyUserPasswords(ModifyUserPasswordsRequest request);

    CompletableFuture<ModifyVisualServicePasswdResponse> modifyVisualServicePasswd(ModifyVisualServicePasswdRequest request);

    CompletableFuture<MountNFSResponse> mountNFS(MountNFSRequest request);

    CompletableFuture<PullImageResponse> pullImage(PullImageRequest request);

    CompletableFuture<QueryServicePackAndPriceResponse> queryServicePackAndPrice(QueryServicePackAndPriceRequest request);

    /**
      * You can call the operation to reset and restore a cluster only when the cluster is in the Exception state. You can call the [ListClusters](~~87116~~) operation to query the ID and status of a cluster.
      * We recommend that you export all job data before you restore a cluster. When you reset and restore a cluster, take note of the following impacts:
      * *   The system disks of all nodes are changed. By default, new system disks are configured based on the settings that you specified when the cluster was created.
      * *   The data on the system disks and data disks of all cluster nodes is lost. The data includes user information, job information, scheduler queue information, and configuration data of auto-scaling queues. However, the data on Apsara File Storage NAS file systems is retained.
      * *   The self-managed queues in the cluster are deleted. All nodes are retained and migrated to the default queue of the cluster.
      *
     */
    CompletableFuture<RecoverClusterResponse> recoverCluster(RecoverClusterRequest request);

    CompletableFuture<RerunJobsResponse> rerunJobs(RerunJobsRequest request);

    /**
      * After a node is reset, the operating system and software return to their initial states. To ensure that jobs run as expected, we recommend that you do not reset running nodes unless you need to perform crash recovery.
      *
     */
    CompletableFuture<ResetNodesResponse> resetNodes(ResetNodesRequest request);

    CompletableFuture<RunCloudMetricProfilingResponse> runCloudMetricProfiling(RunCloudMetricProfilingRequest request);

    /**
      * Configures the auto scaling settings of a cluster.
      *
     */
    CompletableFuture<SetAutoScaleConfigResponse> setAutoScaleConfig(SetAutoScaleConfigRequest request);

    CompletableFuture<SetGWSClusterPolicyResponse> setGWSClusterPolicy(SetGWSClusterPolicyRequest request);

    CompletableFuture<SetGWSInstanceNameResponse> setGWSInstanceName(SetGWSInstanceNameRequest request);

    CompletableFuture<SetGWSInstanceUserResponse> setGWSInstanceUser(SetGWSInstanceUserRequest request);

    CompletableFuture<SetPostScriptsResponse> setPostScripts(SetPostScriptsRequest request);

    CompletableFuture<SetQueueResponse> setQueue(SetQueueRequest request);

    CompletableFuture<SetSchedulerInfoResponse> setSchedulerInfo(SetSchedulerInfoRequest request);

    CompletableFuture<StartClusterResponse> startCluster(StartClusterRequest request);

    CompletableFuture<StartGWSInstanceResponse> startGWSInstance(StartGWSInstanceRequest request);

    CompletableFuture<StartNodesResponse> startNodes(StartNodesRequest request);

    CompletableFuture<StartVisualServiceResponse> startVisualService(StartVisualServiceRequest request);

    /**
      * If you stop a subscription compute node, its billing is not affected. If you stop a pay-as-you-go compute node for which you have enabled the *economical mode*, you are no longer charged for its computing resources. For more information, see [Economical mode](~~63353~~).
      *
     */
    CompletableFuture<StopClusterResponse> stopCluster(StopClusterRequest request);

    CompletableFuture<StopGWSInstanceResponse> stopGWSInstance(StopGWSInstanceRequest request);

    CompletableFuture<StopJobsResponse> stopJobs(StopJobsRequest request);

    CompletableFuture<StopNodesResponse> stopNodes(StopNodesRequest request);

    CompletableFuture<StopServerlessJobsResponse> stopServerlessJobs(StopServerlessJobsRequest request);

    CompletableFuture<StopVisualServiceResponse> stopVisualService(StopVisualServiceRequest request);

    /**
      * ## Description
      * Before you submit a job in a cluster, you must upload a job file to the cluster, for example, job.sh. For more information, see [CreateJobFile](~~159049~~).
      *
     */
    CompletableFuture<SubmitJobResponse> submitJob(SubmitJobRequest request);

    CompletableFuture<SubmitServerlessJobResponse> submitServerlessJob(SubmitServerlessJobRequest request);

    CompletableFuture<SummaryImagesResponse> summaryImages(SummaryImagesRequest request);

    CompletableFuture<SummaryImagesInfoResponse> summaryImagesInfo(SummaryImagesInfoRequest request);

    CompletableFuture<SyncUsersResponse> syncUsers(SyncUsersRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    CompletableFuture<UninstallSoftwareResponse> uninstallSoftware(UninstallSoftwareRequest request);

    CompletableFuture<UpdateClusterVolumesResponse> updateClusterVolumes(UpdateClusterVolumesRequest request);

    /**
      * After you update the instance types of a resource group, the nodes that you add by scaling out the cluster are automatically included in the resource group.
      *
     */
    CompletableFuture<UpdateQueueConfigResponse> updateQueueConfig(UpdateQueueConfigRequest request);

    CompletableFuture<UpgradeClientResponse> upgradeClient(UpgradeClientRequest request);

}
