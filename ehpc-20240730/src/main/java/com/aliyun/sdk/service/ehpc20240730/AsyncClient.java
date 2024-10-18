// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ehpc20240730.models.*;
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
     * @param request the request parameters of AttachSharedStorages  AttachSharedStoragesRequest
     * @return AttachSharedStoragesResponse
     */
    CompletableFuture<AttachSharedStoragesResponse> attachSharedStorages(AttachSharedStoragesRequest request);

    /**
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of E-HPC.</p>
     * 
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * 
     * @param request the request parameters of CreateNodes  CreateNodesRequest
     * @return CreateNodesResponse
     */
    CompletableFuture<CreateNodesResponse> createNodes(CreateNodesRequest request);

    /**
     * @param request the request parameters of CreateQueue  CreateQueueRequest
     * @return CreateQueueResponse
     */
    CompletableFuture<CreateQueueResponse> createQueue(CreateQueueRequest request);

    /**
     * @param request the request parameters of CreateUsers  CreateUsersRequest
     * @return CreateUsersResponse
     */
    CompletableFuture<CreateUsersResponse> createUsers(CreateUsersRequest request);

    /**
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.</p>
     * 
     * @param request the request parameters of DeleteNodes  DeleteNodesRequest
     * @return DeleteNodesResponse
     */
    CompletableFuture<DeleteNodesResponse> deleteNodes(DeleteNodesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a queue, you must delete all compute nodes in the queue.</p>
     * 
     * @param request the request parameters of DeleteQueues  DeleteQueuesRequest
     * @return DeleteQueuesResponse
     */
    CompletableFuture<DeleteQueuesResponse> deleteQueues(DeleteQueuesRequest request);

    /**
     * @param request the request parameters of DeleteUsers  DeleteUsersRequest
     * @return DeleteUsersResponse
     */
    CompletableFuture<DeleteUsersResponse> deleteUsers(DeleteUsersRequest request);

    /**
     * @param request the request parameters of DescribeAddonTemplate  DescribeAddonTemplateRequest
     * @return DescribeAddonTemplateResponse
     */
    CompletableFuture<DescribeAddonTemplateResponse> describeAddonTemplate(DescribeAddonTemplateRequest request);

    /**
     * @param request the request parameters of DetachSharedStorages  DetachSharedStoragesRequest
     * @return DetachSharedStoragesResponse
     */
    CompletableFuture<DetachSharedStoragesResponse> detachSharedStorages(DetachSharedStoragesRequest request);

    /**
     * @param request the request parameters of GetAddon  GetAddonRequest
     * @return GetAddonResponse
     */
    CompletableFuture<GetAddonResponse> getAddon(GetAddonRequest request);

    /**
     * @param request the request parameters of GetCluster  GetClusterRequest
     * @return GetClusterResponse
     */
    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    /**
     * @param request the request parameters of GetCommonLogDetail  GetCommonLogDetailRequest
     * @return GetCommonLogDetailResponse
     */
    CompletableFuture<GetCommonLogDetailResponse> getCommonLogDetail(GetCommonLogDetailRequest request);

    /**
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Currently, only Slurm and PBS Pro schedulers for Standard Edition clusters are supported.</p>
     * 
     * @param request the request parameters of GetJobLog  GetJobLogRequest
     * @return GetJobLogResponse
     */
    CompletableFuture<GetJobLogResponse> getJobLog(GetJobLogRequest request);

    /**
     * @param request the request parameters of GetQueue  GetQueueRequest
     * @return GetQueueResponse
     */
    CompletableFuture<GetQueueResponse> getQueue(GetQueueRequest request);

    /**
     * @param request the request parameters of InstallAddon  InstallAddonRequest
     * @return InstallAddonResponse
     */
    CompletableFuture<InstallAddonResponse> installAddon(InstallAddonRequest request);

    /**
     * @param request the request parameters of InstallSoftwares  InstallSoftwaresRequest
     * @return InstallSoftwaresResponse
     */
    CompletableFuture<InstallSoftwaresResponse> installSoftwares(InstallSoftwaresRequest request);

    /**
     * @param request the request parameters of ListAddonTemplates  ListAddonTemplatesRequest
     * @return ListAddonTemplatesResponse
     */
    CompletableFuture<ListAddonTemplatesResponse> listAddonTemplates(ListAddonTemplatesRequest request);

    /**
     * @param request the request parameters of ListAddons  ListAddonsRequest
     * @return ListAddonsResponse
     */
    CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request);

    /**
     * @param request the request parameters of ListAvailableFileSystems  ListAvailableFileSystemsRequest
     * @return ListAvailableFileSystemsResponse
     */
    CompletableFuture<ListAvailableFileSystemsResponse> listAvailableFileSystems(ListAvailableFileSystemsRequest request);

    /**
     * @param request the request parameters of ListAvailableImages  ListAvailableImagesRequest
     * @return ListAvailableImagesResponse
     */
    CompletableFuture<ListAvailableImagesResponse> listAvailableImages(ListAvailableImagesRequest request);

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
     * @param request the request parameters of ListCommonLogs  ListCommonLogsRequest
     * @return ListCommonLogsResponse
     */
    CompletableFuture<ListCommonLogsResponse> listCommonLogs(ListCommonLogsRequest request);

    /**
     * @param request the request parameters of ListInstalledSoftwares  ListInstalledSoftwaresRequest
     * @return ListInstalledSoftwaresResponse
     */
    CompletableFuture<ListInstalledSoftwaresResponse> listInstalledSoftwares(ListInstalledSoftwaresRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * @param request the request parameters of ListQueues  ListQueuesRequest
     * @return ListQueuesResponse
     */
    CompletableFuture<ListQueuesResponse> listQueues(ListQueuesRequest request);

    /**
     * @param request the request parameters of ListSharedStorages  ListSharedStoragesRequest
     * @return ListSharedStoragesResponse
     */
    CompletableFuture<ListSharedStoragesResponse> listSharedStorages(ListSharedStoragesRequest request);

    /**
     * @param request the request parameters of ListSoftwares  ListSoftwaresRequest
     * @return ListSoftwaresResponse
     */
    CompletableFuture<ListSoftwaresResponse> listSoftwares(ListSoftwaresRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of StopJobs  StopJobsRequest
     * @return StopJobsResponse
     */
    CompletableFuture<StopJobsResponse> stopJobs(StopJobsRequest request);

    /**
     * @param request the request parameters of UnInstallAddon  UnInstallAddonRequest
     * @return UnInstallAddonResponse
     */
    CompletableFuture<UnInstallAddonResponse> unInstallAddon(UnInstallAddonRequest request);

    /**
     * @param request the request parameters of UninstallSoftwares  UninstallSoftwaresRequest
     * @return UninstallSoftwaresResponse
     */
    CompletableFuture<UninstallSoftwaresResponse> uninstallSoftwares(UninstallSoftwaresRequest request);

    /**
     * @param request the request parameters of UpdateCluster  UpdateClusterRequest
     * @return UpdateClusterResponse
     */
    CompletableFuture<UpdateClusterResponse> updateCluster(UpdateClusterRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.</p>
     * 
     * @param request the request parameters of UpdateNodes  UpdateNodesRequest
     * @return UpdateNodesResponse
     */
    CompletableFuture<UpdateNodesResponse> updateNodes(UpdateNodesRequest request);

    /**
     * @param request the request parameters of UpdateQueue  UpdateQueueRequest
     * @return UpdateQueueResponse
     */
    CompletableFuture<UpdateQueueResponse> updateQueue(UpdateQueueRequest request);

    /**
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
