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

    CompletableFuture<AttachSharedStoragesResponse> attachSharedStorages(AttachSharedStoragesRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateNodesResponse> createNodes(CreateNodesRequest request);

    CompletableFuture<CreateQueueResponse> createQueue(CreateQueueRequest request);

    CompletableFuture<CreateUsersResponse> createUsers(CreateUsersRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteJobsResponse> deleteJobs(DeleteJobsRequest request);

    /**
      * ## [](#)Usage notes
      * Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.
      *
     */
    CompletableFuture<DeleteNodesResponse> deleteNodes(DeleteNodesRequest request);

    /**
      * ## [](#)Usage notes
      * Before you delete a queue, you must delete all compute nodes in the queue.
      *
     */
    CompletableFuture<DeleteQueuesResponse> deleteQueues(DeleteQueuesRequest request);

    CompletableFuture<DeleteUsersResponse> deleteUsers(DeleteUsersRequest request);

    CompletableFuture<DescribeAddonTemplateResponse> describeAddonTemplate(DescribeAddonTemplateRequest request);

    CompletableFuture<DetachSharedStoragesResponse> detachSharedStorages(DetachSharedStoragesRequest request);

    CompletableFuture<GetAddonResponse> getAddon(GetAddonRequest request);

    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    CompletableFuture<GetCommonLogDetailResponse> getCommonLogDetail(GetCommonLogDetailRequest request);

    CompletableFuture<GetQueueResponse> getQueue(GetQueueRequest request);

    CompletableFuture<InstallAddonResponse> installAddon(InstallAddonRequest request);

    CompletableFuture<InstallSoftwaresResponse> installSoftwares(InstallSoftwaresRequest request);

    CompletableFuture<ListAddonTemplatesResponse> listAddonTemplates(ListAddonTemplatesRequest request);

    CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request);

    CompletableFuture<ListAvailableFileSystemsResponse> listAvailableFileSystems(ListAvailableFileSystemsRequest request);

    CompletableFuture<ListAvailableImagesResponse> listAvailableImages(ListAvailableImagesRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListCommonLogsResponse> listCommonLogs(ListCommonLogsRequest request);

    CompletableFuture<ListInstalledSoftwaresResponse> listInstalledSoftwares(ListInstalledSoftwaresRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListQueuesResponse> listQueues(ListQueuesRequest request);

    CompletableFuture<ListSharedStoragesResponse> listSharedStorages(ListSharedStoragesRequest request);

    CompletableFuture<ListSoftwaresResponse> listSoftwares(ListSoftwaresRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<UnInstallAddonResponse> unInstallAddon(UnInstallAddonRequest request);

    CompletableFuture<UninstallSoftwaresResponse> uninstallSoftwares(UninstallSoftwaresRequest request);

    CompletableFuture<UpdateClusterResponse> updateCluster(UpdateClusterRequest request);

    /**
      * ## [](#)Usage notes
      * Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.
      *
     */
    CompletableFuture<UpdateNodesResponse> updateNodes(UpdateNodesRequest request);

    CompletableFuture<UpdateQueueResponse> updateQueue(UpdateQueueRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
