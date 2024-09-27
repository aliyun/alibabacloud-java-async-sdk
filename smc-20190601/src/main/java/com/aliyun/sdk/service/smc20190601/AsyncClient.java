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
     * <b>description</b> :
     * <p>If you want to import the information of migration sources by using an activation code, you can call this operation to create one.</p>
     */
    CompletableFuture<CreateAccessTokenResponse> createAccessToken(CreateAccessTokenRequest request);

    CompletableFuture<CreateCrossZoneMigrationJobResponse> createCrossZoneMigrationJob(CreateCrossZoneMigrationJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You can create migration jobs only for source servers that are in the Available state.</li>
     * <li>Each source server can be associated with only one migration job that is in the Ready, Running, Stopped, Waiting, InError, or Expired state.</li>
     * <li>You can create a maximum of 1,000 migration jobs within each Alibaba Cloud account.</li>
     * <li>If you migrate a source server to an image, you must specify the ImageName, SystemDiskSize, and DataDisk parameters.</li>
     * <li>If you use a virtual private cloud (VPC) to migrate data, the VSwitchId parameter is required and the VpcId parameter is optional.</li>
     * <li>Server Migration Center (SMC) allows you to migrate source servers to Docker container images. This allows you to migrate containerized applications in a cost-effective way.</li>
     * </ul>
     */
    CompletableFuture<CreateReplicationJobResponse> createReplicationJob(CreateReplicationJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The incremental migration job must be in the Waiting state.</li>
     * <li>After you call this operation, the incremental migration job no longer periodically runs. In the meantime, Server Migration Center (SMC) determines whether to perform a full data migration for the last time based on the value of the <code>SyncData</code> parameter. If you set the SyncData parameter to <code>false</code>, SMC releases intermediate resources without data migration before the migration job is complete. If you set the SyncData parameter to <code>true</code>, SMC performs a full data migration and releases intermediate resources before the migration job is complete.</li>
     * </ul>
     */
    CompletableFuture<CutOverReplicationJobResponse> cutOverReplicationJob(CutOverReplicationJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete an activation code if you no longer need to import the information about migration sources by using the activation code or if the activation code has expired.</p>
     */
    CompletableFuture<DeleteAccessTokenResponse> deleteAccessToken(DeleteAccessTokenRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Deleted migration jobs cannot be restored.</li>
     * <li>After a migration job is deleted, associated resources, such as the intermediate instance, are automatically released.</li>
     * </ul>
     */
    CompletableFuture<DeleteReplicationJobResponse> deleteReplicationJob(DeleteReplicationJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>If a migration job is created for the migration source and the migration job is in the Running state, the migration source cannot be deleted.</li>
     * <li>If a migration job is created for the migration source but the migration job is not in the Running state, you can set the <code>Force</code> parameter to true to delete the migration source.</li>
     * </ul>
     */
    CompletableFuture<DeleteSourceServerResponse> deleteSourceServer(DeleteSourceServerRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are used as filter conditions.</li>
     * <li>Server Migration Center (SMC) allows you to migrate source servers to Docker container images. You can use SMC to migrate containerized applications in a cost-effective way. For more information, see <a href="~~60744~~">Terms</a>.</li>
     * </ul>
     */
    CompletableFuture<DescribeReplicationJobsResponse> describeReplicationJobs(DescribeReplicationJobsRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are used as filter conditions.</p>
     */
    CompletableFuture<DescribeSourceServersResponse> describeSourceServers(DescribeSourceServersRequest request);

    /**
     * <b>description</b> :
     * <p>To prevent an activation code from being leaked, you can call this operation to disable the activation code. Disabled activation codes can no longer be used to import the information about migration sources. However, migration sources whose information has been imported are not affected.</p>
     */
    CompletableFuture<DisableAccessTokenResponse> disableAccessToken(DisableAccessTokenRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query activation codes and the usage details of the activation codes. An activation code can be in the activated, unactivated, or expired state.</p>
     */
    CompletableFuture<ListAccessTokensResponse> listAccessTokens(ListAccessTokensRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you modify the parameters of a migration job, take note of the following information:</p>
     * <ul>
     * <li>The <code>Name</code> and <code>Description</code> parameters can be modified during the lifecycle of the migration job.</li>
     * <li>The <code>Frequency</code> and <code>MaxNumberOfImageToKeep</code> parameters can be modified only before the migration job is executed or when the migration job is in the <code>Waiting</code> state.</li>
     * <li>Other parameters can be modified only before the migration job is executed.</li>
     * </ul>
     */
    CompletableFuture<ModifyReplicationJobAttributeResponse> modifyReplicationJobAttribute(ModifyReplicationJobAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation regardless of the status of the migration source.</p>
     */
    CompletableFuture<ModifySourceServerAttributeResponse> modifySourceServerAttribute(ModifySourceServerAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation can only be used to start the migration jobs that are in the Ready, Stopped, or InError state.</p>
     */
    CompletableFuture<StartReplicationJobResponse> startReplicationJob(StartReplicationJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to pause only a migration job whose primary status is Running and business status is Syncing.</p>
     */
    CompletableFuture<StopReplicationJobResponse> stopReplicationJob(StopReplicationJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Up to 20 tags can be added to each SMC resource.
     * Before you add tags to an SMC resource, Alibaba Cloud checks the number of the tags that have been added to the resource. If the maximum number is reached, an error message is returned.</p>
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove tags that are added to one or more SMC resources and delete the tags if the tags are no longer used.</p>
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
