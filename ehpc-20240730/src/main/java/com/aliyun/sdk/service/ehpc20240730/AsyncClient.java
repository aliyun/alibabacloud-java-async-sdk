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
     * <b>description</b> :
     * <p>The ECS instances must meet the following requirements:</p>
     * <ul>
     * <li>The ECS instances do not belong to any E-HPC cluster.</li>
     * <li>The ECS instances reside in the same virtual private cloud (VPC) as the cluster.</li>
     * <li>The ECS instances are in the Stopped state.
     * Take of the following limits:</li>
     * <li>You can specify multiple instance IDs to add them at a time. However, the instances must be of the same type.</li>
     * <li>When an instance is added to the cluster, <a href="https://help.aliyun.com/zh/ecs/user-guide/re-initialize-a-system-disk">the system disk is reset</a> by using the image specified by the input parameters.</li>
     * <li>If the instance has data disks, they are not automatically created and mounted after the instance is added.</li>
     * <li>The hostname of the instance remains the same. Therefore, you must ensure that the hostname of the instance to be added is different from the hostname of an existing node in the cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachNodes  AttachNodesRequest
     * @return AttachNodesResponse
     */
    CompletableFuture<AttachNodesResponse> attachNodes(AttachNodesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The file system that you want to attach must be created in advance in the same virtual private cloud (VPC) as the destination cluster. For more information, see <a href="https://help.aliyun.com/document_detail/27530.html">Create a file system</a> and <a href="https://help.aliyun.com/document_detail/27531.html">Manage mount targets</a>.</li>
     * <li>E-HPC clusters support Apsara File Storage NAS file systems.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachSharedStorages  AttachSharedStoragesRequest
     * @return AttachSharedStoragesResponse
     */
    CompletableFuture<AttachSharedStoragesResponse> attachSharedStorages(AttachSharedStoragesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you call this operation, make sure that you are familiar with the billing and pricing of E-HPC. For more information, see <a href="https://help.aliyun.com/document_detail/2842985.html">Overview</a>.</p>
     * 
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
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Make sure that data of the cluster to be deleted is backed up before you call this operation.</p>
     * <blockquote>
     * <p>After a cluster is released, you cannot restore the data stored in the cluster. Exercise caution when you release a cluster.</p>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>The cluster must be in the <code>Running</code> state.</li>
     * <li>Clusters fall into two types:<ul>
     * <li>Regular clusters on Alibaba Cloud Public Cloud</li>
     * <li>Managed clusters on Alibaba Cloud Public Cloud</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of InstallAddon  InstallAddonRequest
     * @return InstallAddonResponse
     */
    CompletableFuture<InstallAddonResponse> installAddon(InstallAddonRequest request);

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>When calling this interface, please note the following:</p>
     * <ul>
     * <li>The cluster status must be <code>Running</code>. </li>
     * <li>If the cluster series is <code>Serverless</code>, ensure that there is at least one login node or compute node in the cluster; otherwise, software cannot be added to the target cluster.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>The cluster must be in the <code>Running</code> state.</li>
     * <li>Clusters fall into the following types:<ul>
     * <li>Regular clusters on Alibaba Cloud Public Cloud</li>
     * <li>Managed clusters on Alibaba Cloud Public Cloud</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UnInstallAddon  UnInstallAddonRequest
     * @return UnInstallAddonResponse
     */
    CompletableFuture<UnInstallAddonResponse> unInstallAddon(UnInstallAddonRequest request);

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>When calling this interface, please note:
     * The cluster status must be <code>Running</code>.</p>
     * 
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
