// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ehpc20180412.models.*;
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
     * <b>description</b> :
     * <p>  The compute nodes to be added are in the Stopped state.</p>
     * <ul>
     * <li>After the compute nodes are added to the cluster, the operating systems of the nodes are replaced with the operating system specified by the ImageId parameter.</li>
     * <li>The hosts of the compute nodes must be different from those of the existing compute nodes in the cluster. Otherwise, the add operation fails.</li>
     * </ul>
     * 
     * @param request the request parameters of AddExistedNodes  AddExistedNodesRequest
     * @return AddExistedNodesResponse
     */
    CompletableFuture<AddExistedNodesResponse> addExistedNodes(AddExistedNodesRequest request);

    /**
     * @param request the request parameters of AddLocalNodes  AddLocalNodesRequest
     * @return AddLocalNodesResponse
     */
    CompletableFuture<AddLocalNodesResponse> addLocalNodes(AddLocalNodesRequest request);

    /**
     * @param request the request parameters of AddNodes  AddNodesRequest
     * @return AddNodesResponse
     */
    CompletableFuture<AddNodesResponse> addNodes(AddNodesRequest request);

    /**
     * @param request the request parameters of AddQueue  AddQueueRequest
     * @return AddQueueResponse
     */
    CompletableFuture<AddQueueResponse> addQueue(AddQueueRequest request);

    /**
     * @param request the request parameters of AddSecurityGroup  AddSecurityGroupRequest
     * @return AddSecurityGroupResponse
     */
    CompletableFuture<AddSecurityGroupResponse> addSecurityGroup(AddSecurityGroupRequest request);

    /**
     * @param request the request parameters of AddUsers  AddUsersRequest
     * @return AddUsersResponse
     */
    CompletableFuture<AddUsersResponse> addUsers(AddUsersRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Description</h2>
     * <p>You can call the ApplyNodes operation to specify the number of compute nodes, the number of vCPUs, and the memory size when you add nodes to a cluster.</p>
     * 
     * @param request the request parameters of ApplyNodes  ApplyNodesRequest
     * @return ApplyNodesResponse
     */
    CompletableFuture<ApplyNodesResponse> applyNodes(ApplyNodesRequest request);

    /**
     * <b>description</b> :
     * <p>After you create an Elastic High Performance Computing (E-HPC) cluster, you are charged for the cluster resources that you use. We recommend that you learn about the billing methods of E-HPC in advance. For more information, see <a href="https://help.aliyun.com/document_detail/57844.html">Billing overview</a>.</p>
     * 
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * @param request the request parameters of CreateHybridCluster  CreateHybridClusterRequest
     * @return CreateHybridClusterResponse
     */
    CompletableFuture<CreateHybridClusterResponse> createHybridCluster(CreateHybridClusterRequest request);

    /**
     * @param request the request parameters of CreateJobFile  CreateJobFileRequest
     * @return CreateJobFileResponse
     */
    CompletableFuture<CreateJobFileResponse> createJobFile(CreateJobFileRequest request);

    /**
     * @param request the request parameters of CreateJobTemplate  CreateJobTemplateRequest
     * @return CreateJobTemplateResponse
     */
    CompletableFuture<CreateJobTemplateResponse> createJobTemplate(CreateJobTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>After a cluster is released, the pay-as-you-go nodes and the subscription nodes that are expired are automatically released. The subscription nodes that are expired are retained. If you need to release subscription nodes that are not expired, change the billing method to pay-as-you-go. Before you release a cluster, make sure that you no longer use the cluster.</p>
     * 
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * @param request the request parameters of DeleteJobTemplates  DeleteJobTemplatesRequest
     * @return DeleteJobTemplatesResponse
     */
    CompletableFuture<DeleteJobTemplatesResponse> deleteJobTemplates(DeleteJobTemplatesRequest request);

    /**
     * @param request the request parameters of DeleteJobs  DeleteJobsRequest
     * @return DeleteJobsResponse
     */
    CompletableFuture<DeleteJobsResponse> deleteJobs(DeleteJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.</p>
     * 
     * @param request the request parameters of DeleteNodes  DeleteNodesRequest
     * @return DeleteNodesResponse
     */
    CompletableFuture<DeleteNodesResponse> deleteNodes(DeleteNodesRequest request);

    /**
     * @param request the request parameters of DeleteQueue  DeleteQueueRequest
     * @return DeleteQueueResponse
     */
    CompletableFuture<DeleteQueueResponse> deleteQueue(DeleteQueueRequest request);

    /**
     * @param request the request parameters of DeleteSecurityGroup  DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     */
    CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <p>If you delete a user, only its information is deleted. The files stored in the /home directory for the user are retained. For example, if you delete a user named user1, the files in the <code>/home/user1/</code> directory of the cluster are not deleted. However, a deleted user cannot be recovered. Even if you create another user that has the same name, the data retained for the deleted user is not reused.</p>
     * 
     * @param request the request parameters of DeleteUsers  DeleteUsersRequest
     * @return DeleteUsersResponse
     */
    CompletableFuture<DeleteUsersResponse> deleteUsers(DeleteUsersRequest request);

    /**
     * @param request the request parameters of DescribeAutoScaleConfig  DescribeAutoScaleConfigRequest
     * @return DescribeAutoScaleConfigResponse
     */
    CompletableFuture<DescribeAutoScaleConfigResponse> describeAutoScaleConfig(DescribeAutoScaleConfigRequest request);

    /**
     * @param request the request parameters of DescribeCluster  DescribeClusterRequest
     * @return DescribeClusterResponse
     */
    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    /**
     * @param request the request parameters of DescribeEstackImage  DescribeEstackImageRequest
     * @return DescribeEstackImageResponse
     */
    CompletableFuture<DescribeEstackImageResponse> describeEstackImage(DescribeEstackImageRequest request);

    /**
     * @param request the request parameters of DescribeImagePrice  DescribeImagePriceRequest
     * @return DescribeImagePriceResponse
     */
    CompletableFuture<DescribeImagePriceResponse> describeImagePrice(DescribeImagePriceRequest request);

    /**
     * @param request the request parameters of DescribeJob  DescribeJobRequest
     * @return DescribeJobResponse
     */
    CompletableFuture<DescribeJobResponse> describeJob(DescribeJobRequest request);

    /**
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    /**
     * @param request the request parameters of DescribeServerlessJobs  DescribeServerlessJobsRequest
     * @return DescribeServerlessJobsResponse
     */
    CompletableFuture<DescribeServerlessJobsResponse> describeServerlessJobs(DescribeServerlessJobsRequest request);

    /**
     * @param request the request parameters of EditJobTemplate  EditJobTemplateRequest
     * @return EditJobTemplateResponse
     */
    CompletableFuture<EditJobTemplateResponse> editJobTemplate(EditJobTemplateRequest request);

    /**
     * @param request the request parameters of GetAccountingReport  GetAccountingReportRequest
     * @return GetAccountingReportResponse
     */
    CompletableFuture<GetAccountingReportResponse> getAccountingReport(GetAccountingReportRequest request);

    /**
     * @param request the request parameters of GetAutoScaleConfig  GetAutoScaleConfigRequest
     * @return GetAutoScaleConfigResponse
     */
    CompletableFuture<GetAutoScaleConfigResponse> getAutoScaleConfig(GetAutoScaleConfigRequest request);

    /**
     * @param request the request parameters of GetCloudMetricLogs  GetCloudMetricLogsRequest
     * @return GetCloudMetricLogsResponse
     */
    CompletableFuture<GetCloudMetricLogsResponse> getCloudMetricLogs(GetCloudMetricLogsRequest request);

    /**
     * @param request the request parameters of GetCloudMetricProfiling  GetCloudMetricProfilingRequest
     * @return GetCloudMetricProfilingResponse
     */
    CompletableFuture<GetCloudMetricProfilingResponse> getCloudMetricProfiling(GetCloudMetricProfilingRequest request);

    /**
     * @param request the request parameters of GetClusterVolumes  GetClusterVolumesRequest
     * @return GetClusterVolumesResponse
     */
    CompletableFuture<GetClusterVolumesResponse> getClusterVolumes(GetClusterVolumesRequest request);

    /**
     * @param request the request parameters of GetHybridClusterConfig  GetHybridClusterConfigRequest
     * @return GetHybridClusterConfigResponse
     */
    CompletableFuture<GetHybridClusterConfigResponse> getHybridClusterConfig(GetHybridClusterConfigRequest request);

    /**
     * @param request the request parameters of GetIfEcsTypeSupportHtConfig  GetIfEcsTypeSupportHtConfigRequest
     * @return GetIfEcsTypeSupportHtConfigResponse
     */
    CompletableFuture<GetIfEcsTypeSupportHtConfigResponse> getIfEcsTypeSupportHtConfig(GetIfEcsTypeSupportHtConfigRequest request);

    /**
     * @param request the request parameters of GetJobLog  GetJobLogRequest
     * @return GetJobLogResponse
     */
    CompletableFuture<GetJobLogResponse> getJobLog(GetJobLogRequest request);

    /**
     * @param request the request parameters of GetPostScripts  GetPostScriptsRequest
     * @return GetPostScriptsResponse
     */
    CompletableFuture<GetPostScriptsResponse> getPostScripts(GetPostScriptsRequest request);

    /**
     * @param request the request parameters of GetSchedulerInfo  GetSchedulerInfoRequest
     * @return GetSchedulerInfoResponse
     */
    CompletableFuture<GetSchedulerInfoResponse> getSchedulerInfo(GetSchedulerInfoRequest request);

    /**
     * @param request the request parameters of GetVisualServiceStatus  GetVisualServiceStatusRequest
     * @return GetVisualServiceStatusResponse
     */
    CompletableFuture<GetVisualServiceStatusResponse> getVisualServiceStatus(GetVisualServiceStatusRequest request);

    /**
     * @param request the request parameters of InitializeEHPC  InitializeEHPCRequest
     * @return InitializeEHPCResponse
     */
    CompletableFuture<InitializeEHPCResponse> initializeEHPC(InitializeEHPCRequest request);

    /**
     * @param request the request parameters of InstallSoftware  InstallSoftwareRequest
     * @return InstallSoftwareResponse
     */
    CompletableFuture<InstallSoftwareResponse> installSoftware(InstallSoftwareRequest request);

    /**
     * @param request the request parameters of InvokeShellCommand  InvokeShellCommandRequest
     * @return InvokeShellCommandResponse
     */
    CompletableFuture<InvokeShellCommandResponse> invokeShellCommand(InvokeShellCommandRequest request);

    /**
     * @param request the request parameters of ListAvailableEcsTypes  ListAvailableEcsTypesRequest
     * @return ListAvailableEcsTypesResponse
     */
    CompletableFuture<ListAvailableEcsTypesResponse> listAvailableEcsTypes(ListAvailableEcsTypesRequest request);

    /**
     * @param request the request parameters of ListCloudMetricProfilings  ListCloudMetricProfilingsRequest
     * @return ListCloudMetricProfilingsResponse
     */
    CompletableFuture<ListCloudMetricProfilingsResponse> listCloudMetricProfilings(ListCloudMetricProfilingsRequest request);

    /**
     * @param request the request parameters of ListClusterLogs  ListClusterLogsRequest
     * @return ListClusterLogsResponse
     */
    CompletableFuture<ListClusterLogsResponse> listClusterLogs(ListClusterLogsRequest request);

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
     * @param request the request parameters of ListClustersMeta  ListClustersMetaRequest
     * @return ListClustersMetaResponse
     */
    CompletableFuture<ListClustersMetaResponse> listClustersMeta(ListClustersMetaRequest request);

    /**
     * @param request the request parameters of ListCommands  ListCommandsRequest
     * @return ListCommandsResponse
     */
    CompletableFuture<ListCommandsResponse> listCommands(ListCommandsRequest request);

    /**
     * @param request the request parameters of ListCommunityImages  ListCommunityImagesRequest
     * @return ListCommunityImagesResponse
     */
    CompletableFuture<ListCommunityImagesResponse> listCommunityImages(ListCommunityImagesRequest request);

    /**
     * @param request the request parameters of ListCpfsFileSystems  ListCpfsFileSystemsRequest
     * @return ListCpfsFileSystemsResponse
     */
    CompletableFuture<ListCpfsFileSystemsResponse> listCpfsFileSystems(ListCpfsFileSystemsRequest request);

    /**
     * @param request the request parameters of ListCurrentClientVersion  ListCurrentClientVersionRequest
     * @return ListCurrentClientVersionResponse
     */
    CompletableFuture<ListCurrentClientVersionResponse> listCurrentClientVersion(ListCurrentClientVersionRequest request);

    /**
     * @param request the request parameters of ListCustomImages  ListCustomImagesRequest
     * @return ListCustomImagesResponse
     */
    CompletableFuture<ListCustomImagesResponse> listCustomImages(ListCustomImagesRequest request);

    /**
     * @param request the request parameters of ListFileSystemWithMountTargets  ListFileSystemWithMountTargetsRequest
     * @return ListFileSystemWithMountTargetsResponse
     */
    CompletableFuture<ListFileSystemWithMountTargetsResponse> listFileSystemWithMountTargets(ListFileSystemWithMountTargetsRequest request);

    /**
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
     * @param request the request parameters of ListInstalledSoftware  ListInstalledSoftwareRequest
     * @return ListInstalledSoftwareResponse
     */
    CompletableFuture<ListInstalledSoftwareResponse> listInstalledSoftware(ListInstalledSoftwareRequest request);

    /**
     * @param request the request parameters of ListInvocationResults  ListInvocationResultsRequest
     * @return ListInvocationResultsResponse
     */
    CompletableFuture<ListInvocationResultsResponse> listInvocationResults(ListInvocationResultsRequest request);

    /**
     * @param request the request parameters of ListInvocationStatus  ListInvocationStatusRequest
     * @return ListInvocationStatusResponse
     */
    CompletableFuture<ListInvocationStatusResponse> listInvocationStatus(ListInvocationStatusRequest request);

    /**
     * @param request the request parameters of ListJobTemplates  ListJobTemplatesRequest
     * @return ListJobTemplatesResponse
     */
    CompletableFuture<ListJobTemplatesResponse> listJobTemplates(ListJobTemplatesRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * @param request the request parameters of ListJobsWithFilters  ListJobsWithFiltersRequest
     * @return ListJobsWithFiltersResponse
     */
    CompletableFuture<ListJobsWithFiltersResponse> listJobsWithFilters(ListJobsWithFiltersRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * @param request the request parameters of ListNodesByQueue  ListNodesByQueueRequest
     * @return ListNodesByQueueResponse
     */
    CompletableFuture<ListNodesByQueueResponse> listNodesByQueue(ListNodesByQueueRequest request);

    /**
     * @param request the request parameters of ListNodesNoPaging  ListNodesNoPagingRequest
     * @return ListNodesNoPagingResponse
     */
    CompletableFuture<ListNodesNoPagingResponse> listNodesNoPaging(ListNodesNoPagingRequest request);

    /**
     * @param request the request parameters of ListPreferredEcsTypes  ListPreferredEcsTypesRequest
     * @return ListPreferredEcsTypesResponse
     */
    CompletableFuture<ListPreferredEcsTypesResponse> listPreferredEcsTypes(ListPreferredEcsTypesRequest request);

    /**
     * @param request the request parameters of ListQueues  ListQueuesRequest
     * @return ListQueuesResponse
     */
    CompletableFuture<ListQueuesResponse> listQueues(ListQueuesRequest request);

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * @param request the request parameters of ListSecurityGroups  ListSecurityGroupsRequest
     * @return ListSecurityGroupsResponse
     */
    CompletableFuture<ListSecurityGroupsResponse> listSecurityGroups(ListSecurityGroupsRequest request);

    /**
     * @param request the request parameters of ListServerlessJobs  ListServerlessJobsRequest
     * @return ListServerlessJobsResponse
     */
    CompletableFuture<ListServerlessJobsResponse> listServerlessJobs(ListServerlessJobsRequest request);

    /**
     * @param request the request parameters of ListSoftwares  ListSoftwaresRequest
     * @return ListSoftwaresResponse
     */
    CompletableFuture<ListSoftwaresResponse> listSoftwares(ListSoftwaresRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>For some asynchronous API operations such as AddNodes, the system immediately returns a result without waiting for the node to be created if the request succeeds. In this case, you can use the TaskId returned by the asynchronous API operation to query the result of the task.</p>
     * 
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
     * @param request the request parameters of ListUpgradeClients  ListUpgradeClientsRequest
     * @return ListUpgradeClientsResponse
     */
    CompletableFuture<ListUpgradeClientsResponse> listUpgradeClients(ListUpgradeClientsRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListUsersAsync  ListUsersAsyncRequest
     * @return ListUsersAsyncResponse
     */
    CompletableFuture<ListUsersAsyncResponse> listUsersAsync(ListUsersAsyncRequest request);

    /**
     * @param request the request parameters of ListVolumes  ListVolumesRequest
     * @return ListVolumesResponse
     */
    CompletableFuture<ListVolumesResponse> listVolumes(ListVolumesRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/87126.html">DescribeCluster</a> operation to query details of the selected cluster.</p>
     * 
     * @param request the request parameters of ModifyClusterAttributes  ModifyClusterAttributesRequest
     * @return ModifyClusterAttributesResponse
     */
    CompletableFuture<ModifyClusterAttributesResponse> modifyClusterAttributes(ModifyClusterAttributesRequest request);

    /**
     * @param request the request parameters of ModifyUserGroups  ModifyUserGroupsRequest
     * @return ModifyUserGroupsResponse
     */
    CompletableFuture<ModifyUserGroupsResponse> modifyUserGroups(ModifyUserGroupsRequest request);

    /**
     * @param request the request parameters of ModifyUserPasswords  ModifyUserPasswordsRequest
     * @return ModifyUserPasswordsResponse
     */
    CompletableFuture<ModifyUserPasswordsResponse> modifyUserPasswords(ModifyUserPasswordsRequest request);

    /**
     * @param request the request parameters of ModifyVisualServicePasswd  ModifyVisualServicePasswdRequest
     * @return ModifyVisualServicePasswdResponse
     */
    CompletableFuture<ModifyVisualServicePasswdResponse> modifyVisualServicePasswd(ModifyVisualServicePasswdRequest request);

    /**
     * @param request the request parameters of PullImage  PullImageRequest
     * @return PullImageResponse
     */
    CompletableFuture<PullImageResponse> pullImage(PullImageRequest request);

    /**
     * @param request the request parameters of QueryServicePackAndPrice  QueryServicePackAndPriceRequest
     * @return QueryServicePackAndPriceResponse
     */
    CompletableFuture<QueryServicePackAndPriceResponse> queryServicePackAndPrice(QueryServicePackAndPriceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the operation to reset and restore a cluster only when the cluster is in the Exception state. You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the ID and status of a cluster. We recommend that you export all job data before you restore a cluster. When you reset and restore a cluster, take note of the following impacts:</p>
     * <ul>
     * <li>The system disks of all nodes are changed. By default, new system disks are configured based on the settings that you specified when the cluster was created.</li>
     * <li>The data on the system disks and data disks of all cluster nodes is lost. The data includes user information, job information, scheduler queue information, and configuration data of auto-scaling queues. However, the data on File Storage NAS file systems is retained.</li>
     * <li>The self-managed queues in the cluster are deleted. All nodes are retained and migrated to the default queue of the cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of RecoverCluster  RecoverClusterRequest
     * @return RecoverClusterResponse
     */
    CompletableFuture<RecoverClusterResponse> recoverCluster(RecoverClusterRequest request);

    /**
     * @param request the request parameters of RerunJobs  RerunJobsRequest
     * @return RerunJobsResponse
     */
    CompletableFuture<RerunJobsResponse> rerunJobs(RerunJobsRequest request);

    /**
     * <b>description</b> :
     * <p>After a node is reset, the operating system and software return to their initial states. To ensure that jobs run as expected, we recommend that you do not reset running nodes unless you need to perform crash recovery.</p>
     * 
     * @param request the request parameters of ResetNodes  ResetNodesRequest
     * @return ResetNodesResponse
     */
    CompletableFuture<ResetNodesResponse> resetNodes(ResetNodesRequest request);

    /**
     * @param request the request parameters of RunCloudMetricProfiling  RunCloudMetricProfilingRequest
     * @return RunCloudMetricProfilingResponse
     */
    CompletableFuture<RunCloudMetricProfilingResponse> runCloudMetricProfiling(RunCloudMetricProfilingRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>If the settings in the Queue Configuration section are different from the settings in the Global Configurations section, the former prevails.</p>
     * 
     * @param request the request parameters of SetAutoScaleConfig  SetAutoScaleConfigRequest
     * @return SetAutoScaleConfigResponse
     */
    CompletableFuture<SetAutoScaleConfigResponse> setAutoScaleConfig(SetAutoScaleConfigRequest request);

    /**
     * @param request the request parameters of SetPostScripts  SetPostScriptsRequest
     * @return SetPostScriptsResponse
     */
    CompletableFuture<SetPostScriptsResponse> setPostScripts(SetPostScriptsRequest request);

    /**
     * @param request the request parameters of SetQueue  SetQueueRequest
     * @return SetQueueResponse
     */
    CompletableFuture<SetQueueResponse> setQueue(SetQueueRequest request);

    /**
     * @param request the request parameters of SetSchedulerInfo  SetSchedulerInfoRequest
     * @return SetSchedulerInfoResponse
     */
    CompletableFuture<SetSchedulerInfoResponse> setSchedulerInfo(SetSchedulerInfoRequest request);

    /**
     * @param request the request parameters of StartCluster  StartClusterRequest
     * @return StartClusterResponse
     */
    CompletableFuture<StartClusterResponse> startCluster(StartClusterRequest request);

    /**
     * @param request the request parameters of StartNodes  StartNodesRequest
     * @return StartNodesResponse
     */
    CompletableFuture<StartNodesResponse> startNodes(StartNodesRequest request);

    /**
     * @param request the request parameters of StartVisualService  StartVisualServiceRequest
     * @return StartVisualServiceResponse
     */
    CompletableFuture<StartVisualServiceResponse> startVisualService(StartVisualServiceRequest request);

    /**
     * <b>description</b> :
     * <p>If you stop a subscription compute node, its billing is not affected. If you stop a pay-as-you-go compute node for which you have enabled the <em>economical mode</em>, you are no longer charged for its computing resources. For more information, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
     * 
     * @param request the request parameters of StopCluster  StopClusterRequest
     * @return StopClusterResponse
     */
    CompletableFuture<StopClusterResponse> stopCluster(StopClusterRequest request);

    /**
     * @param request the request parameters of StopJobs  StopJobsRequest
     * @return StopJobsResponse
     */
    CompletableFuture<StopJobsResponse> stopJobs(StopJobsRequest request);

    /**
     * @param request the request parameters of StopNodes  StopNodesRequest
     * @return StopNodesResponse
     */
    CompletableFuture<StopNodesResponse> stopNodes(StopNodesRequest request);

    /**
     * @param request the request parameters of StopServerlessJobs  StopServerlessJobsRequest
     * @return StopServerlessJobsResponse
     */
    CompletableFuture<StopServerlessJobsResponse> stopServerlessJobs(StopServerlessJobsRequest request);

    /**
     * @param request the request parameters of StopVisualService  StopVisualServiceRequest
     * @return StopVisualServiceResponse
     */
    CompletableFuture<StopVisualServiceResponse> stopVisualService(StopVisualServiceRequest request);

    /**
     * <b>description</b> :
     * <p>The ID of the request.</p>
     * 
     * @param request the request parameters of SubmitJob  SubmitJobRequest
     * @return SubmitJobResponse
     */
    CompletableFuture<SubmitJobResponse> submitJob(SubmitJobRequest request);

    /**
     * @param request the request parameters of SubmitServerlessJob  SubmitServerlessJobRequest
     * @return SubmitServerlessJobResponse
     */
    CompletableFuture<SubmitServerlessJobResponse> submitServerlessJob(SubmitServerlessJobRequest request);

    /**
     * @param request the request parameters of SyncUsers  SyncUsersRequest
     * @return SyncUsersResponse
     */
    CompletableFuture<SyncUsersResponse> syncUsers(SyncUsersRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnTagResources  UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    /**
     * @param request the request parameters of UninstallSoftware  UninstallSoftwareRequest
     * @return UninstallSoftwareResponse
     */
    CompletableFuture<UninstallSoftwareResponse> uninstallSoftware(UninstallSoftwareRequest request);

    /**
     * @param request the request parameters of UpdateClusterVolumes  UpdateClusterVolumesRequest
     * @return UpdateClusterVolumesResponse
     */
    CompletableFuture<UpdateClusterVolumesResponse> updateClusterVolumes(UpdateClusterVolumesRequest request);

    /**
     * <b>description</b> :
     * <p>After you update the resource group, the nodes that you add by scaling out the cluster are automatically included in the resource group.</p>
     * 
     * @param request the request parameters of UpdateQueueConfig  UpdateQueueConfigRequest
     * @return UpdateQueueConfigResponse
     */
    CompletableFuture<UpdateQueueConfigResponse> updateQueueConfig(UpdateQueueConfigRequest request);

    /**
     * @param request the request parameters of UpgradeClient  UpgradeClientRequest
     * @return UpgradeClientResponse
     */
    CompletableFuture<UpgradeClientResponse> upgradeClient(UpgradeClientRequest request);

}
