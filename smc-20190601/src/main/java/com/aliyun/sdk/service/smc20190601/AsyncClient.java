// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.smc20190601.models.*;
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
      * If you want to import the information of migration sources by using an activation code, you can call this operation to create one.
      *
     */
    CompletableFuture<CreateAccessTokenResponse> createAccessToken(CreateAccessTokenRequest request);

    CompletableFuture<CreateCrossZoneMigrationJobResponse> createCrossZoneMigrationJob(CreateCrossZoneMigrationJobRequest request);

    /**
      * ## Usage notes
      * *   You can create migration jobs only for source servers that are in the Available state.
      * *   Each source server can be associated with only one migration job that is in the Ready, Running, Stopped, Waiting, InError, or Expired state.
      * *   You can create a maximum of 1,000 migration jobs within each Alibaba Cloud account.
      * *   If you migrate a source server to an image, you must specify the ImageName, SystemDiskSize, and DataDisk parameters.
      * *   If you use a virtual private cloud (VPC) to migrate data, the VSwitchId parameter is required and the VpcId parameter is optional.
      * *   Server Migration Center (SMC) allows you to migrate source servers to Docker container images. This allows you to migrate containerized applications in a cost-effective way.
      *
     */
    CompletableFuture<CreateReplicationJobResponse> createReplicationJob(CreateReplicationJobRequest request);

    /**
      * ## Usage notes
      * *   The incremental migration job must be in the Waiting state.
      * *   After you call this operation, the incremental migration job no longer periodically runs. In the meantime, Server Migration Center (SMC) determines whether to perform a full data migration for the last time based on the value of the `SyncData` parameter. If you set the SyncData parameter to `false`, SMC releases intermediate resources without data migration before the migration job is complete. If you set the SyncData parameter to `true`, SMC performs a full data migration and releases intermediate resources before the migration job is complete.
      *
     */
    CompletableFuture<CutOverReplicationJobResponse> cutOverReplicationJob(CutOverReplicationJobRequest request);

    /**
      * You can call this operation to delete an activation code if you no longer need to import the information about migration sources by using the activation code or if the activation code has expired.
      *
     */
    CompletableFuture<DeleteAccessTokenResponse> deleteAccessToken(DeleteAccessTokenRequest request);

    /**
      * ## Usage notes
      * *   Deleted migration jobs cannot be restored.
      * *   After a migration job is deleted, associated resources, such as the intermediate instance, are automatically released.
      *
     */
    CompletableFuture<DeleteReplicationJobResponse> deleteReplicationJob(DeleteReplicationJobRequest request);

    /**
      * ## Usage notes
      * *   If a migration job is created for the migration source and the migration job is in the Running state, the migration source cannot be deleted.
      * *   If a migration job is created for the migration source but the migration job is not in the Running state, you can set the `Force` parameter to true to delete the migration source.
      *
     */
    CompletableFuture<DeleteSourceServerResponse> deleteSourceServer(DeleteSourceServerRequest request);

    /**
      * ## Usage notes
      * *   You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are used as filter conditions.
      * *   Server Migration Center (SMC) allows you to migrate source servers to Docker container images. You can use SMC to migrate containerized applications in a cost-effective way. For more information, see [Terms](~~60744~~).
      *
     */
    CompletableFuture<DescribeReplicationJobsResponse> describeReplicationJobs(DescribeReplicationJobsRequest request);

    /**
      * ## Usage notes
      * You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are used as filter conditions.
      *
     */
    CompletableFuture<DescribeSourceServersResponse> describeSourceServers(DescribeSourceServersRequest request);

    /**
      * To prevent an activation code from being leaked, you can call this operation to disable the activation code. Disabled activation codes can no longer be used to import the information about migration sources. However, migration sources whose information has been imported are not affected.
      *
     */
    CompletableFuture<DisableAccessTokenResponse> disableAccessToken(DisableAccessTokenRequest request);

    /**
      * You can call this operation to query activation codes and the usage details of the activation codes. An activation code can be in the activated, unactivated, or expired state.
      *
     */
    CompletableFuture<ListAccessTokensResponse> listAccessTokens(ListAccessTokensRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * ## Usage notes
      * Before you modify the parameters of a migration job, take note of the following information:
      * *   The `Name` and `Description` parameters can be modified during the lifecycle of the migration job.
      * *   The `Frequency` and `MaxNumberOfImageToKeep` parameters can be modified only before the migration job is executed or when the migration job is in the `Waiting` state.
      * *   Other parameters can be modified only before the migration job is executed.
      *
     */
    CompletableFuture<ModifyReplicationJobAttributeResponse> modifyReplicationJobAttribute(ModifyReplicationJobAttributeRequest request);

    /**
      * ## Usage notes
      * You can call this operation regardless of the status of the migration source.
      *
     */
    CompletableFuture<ModifySourceServerAttributeResponse> modifySourceServerAttribute(ModifySourceServerAttributeRequest request);

    /**
      * ## Usage notes
      * This operation can only be used to start the migration jobs that are in the Ready, Stopped, or InError state.
      *
     */
    CompletableFuture<StartReplicationJobResponse> startReplicationJob(StartReplicationJobRequest request);

    /**
      * ## Usage notes
      * You can call this operation to pause only a migration job whose primary status is Running and business status is Syncing.
      *
     */
    CompletableFuture<StopReplicationJobResponse> stopReplicationJob(StopReplicationJobRequest request);

    /**
      * ## Usage notes
      * Up to 20 tags can be added to each SMC resource.
      * Before you add tags to an SMC resource, Alibaba Cloud checks the number of the tags that have been added to the resource. If the maximum number is reached, an error message is returned.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * You can call this operation to remove tags that are added to one or more SMC resources and delete the tags if the tags are no longer used.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
