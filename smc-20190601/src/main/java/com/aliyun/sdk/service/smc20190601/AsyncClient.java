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
     * <p>A migration source can be associated with only one workgroup.</p>
     * 
     * @param request the request parameters of AssociateSourceServers  AssociateSourceServersRequest
     * @return AssociateSourceServersResponse
     */
    CompletableFuture<AssociateSourceServersResponse> associateSourceServers(AssociateSourceServersRequest request);

    /**
     * <b>description</b> :
     * <p>If you want to import the information of migration sources by using an activation code, you can call this operation to create one.</p>
     * 
     * @param request the request parameters of CreateAccessToken  CreateAccessTokenRequest
     * @return CreateAccessTokenResponse
     */
    CompletableFuture<CreateAccessTokenResponse> createAccessToken(CreateAccessTokenRequest request);

    /**
     * @param request the request parameters of CreateCrossZoneMigrationJob  CreateCrossZoneMigrationJobRequest
     * @return CreateCrossZoneMigrationJobResponse
     */
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
     * 
     * @param request the request parameters of CreateReplicationJob  CreateReplicationJobRequest
     * @return CreateReplicationJobResponse
     */
    CompletableFuture<CreateReplicationJobResponse> createReplicationJob(CreateReplicationJobRequest request);

    /**
     * <b>description</b> :
     * <p>  You can create up to 50 workgroups within an Alibaba Cloud account.</p>
     * <ul>
     * <li>A workgroup can be associated with a maximum of 50 migration sources.</li>
     * <li>A migration source can be associated with only one workgroup.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateWorkgroup  CreateWorkgroupRequest
     * @return CreateWorkgroupResponse
     */
    CompletableFuture<CreateWorkgroupResponse> createWorkgroup(CreateWorkgroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The incremental migration job must be in the Waiting state.</li>
     * <li>After you call this operation, the incremental migration job no longer periodically runs. In the meantime, Server Migration Center (SMC) determines whether to perform a full data migration for the last time based on the value of the <code>SyncData</code> parameter. If you set the SyncData parameter to <code>false</code>, SMC releases intermediate resources without data migration before the migration job is complete. If you set the SyncData parameter to <code>true</code>, SMC performs a full data migration and releases intermediate resources before the migration job is complete.</li>
     * </ul>
     * 
     * @param request the request parameters of CutOverReplicationJob  CutOverReplicationJobRequest
     * @return CutOverReplicationJobResponse
     */
    CompletableFuture<CutOverReplicationJobResponse> cutOverReplicationJob(CutOverReplicationJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete an activation code if you no longer need to import the information about migration sources by using the activation code or if the activation code has expired.</p>
     * 
     * @param request the request parameters of DeleteAccessToken  DeleteAccessTokenRequest
     * @return DeleteAccessTokenResponse
     */
    CompletableFuture<DeleteAccessTokenResponse> deleteAccessToken(DeleteAccessTokenRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Deleted migration jobs cannot be restored.</li>
     * <li>After a migration job is deleted, associated resources, such as the intermediate instance, are automatically released.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteReplicationJob  DeleteReplicationJobRequest
     * @return DeleteReplicationJobResponse
     */
    CompletableFuture<DeleteReplicationJobResponse> deleteReplicationJob(DeleteReplicationJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>If a migration job is created for the migration source and the migration job is in the Running state, the migration source cannot be deleted.</li>
     * <li>If a migration job is created for the migration source but the migration job is not in the Running state, you can set the <code>Force</code> parameter to true to delete the migration source.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSourceServer  DeleteSourceServerRequest
     * @return DeleteSourceServerResponse
     */
    CompletableFuture<DeleteSourceServerResponse> deleteSourceServer(DeleteSourceServerRequest request);

    /**
     * <b>description</b> :
     * <p>To delete a workgroup, you must delete or dissociate the migration source that is associated with the workgroup. For more information, see <a href="https://help.aliyun.com/document_detail/2402124.html">DeleteSourceServer</a>.</p>
     * 
     * @param request the request parameters of DeleteWorkgroup  DeleteWorkgroupRequest
     * @return DeleteWorkgroupResponse
     */
    CompletableFuture<DeleteWorkgroupResponse> deleteWorkgroup(DeleteWorkgroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are used as filter conditions.</li>
     * <li>Server Migration Center (SMC) allows you to migrate source servers to Docker container images. You can use SMC to migrate containerized applications in a cost-effective way. For more information, see <a href="https://help.aliyun.com/document_detail/60744.html">Terms</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeReplicationJobs  DescribeReplicationJobsRequest
     * @return DescribeReplicationJobsResponse
     */
    CompletableFuture<DescribeReplicationJobsResponse> describeReplicationJobs(DescribeReplicationJobsRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are used as filter conditions.</p>
     * 
     * @param request the request parameters of DescribeSourceServers  DescribeSourceServersRequest
     * @return DescribeSourceServersResponse
     */
    CompletableFuture<DescribeSourceServersResponse> describeSourceServers(DescribeSourceServersRequest request);

    /**
     * @param request the request parameters of DescribeWorkgroups  DescribeWorkgroupsRequest
     * @return DescribeWorkgroupsResponse
     */
    CompletableFuture<DescribeWorkgroupsResponse> describeWorkgroups(DescribeWorkgroupsRequest request);

    /**
     * <b>description</b> :
     * <p>To prevent an activation code from being leaked, you can call this operation to disable the activation code. Disabled activation codes can no longer be used to import the information about migration sources. However, migration sources whose information has been imported are not affected.</p>
     * 
     * @param request the request parameters of DisableAccessToken  DisableAccessTokenRequest
     * @return DisableAccessTokenResponse
     */
    CompletableFuture<DisableAccessTokenResponse> disableAccessToken(DisableAccessTokenRequest request);

    /**
     * @param request the request parameters of DisassociateSourceServers  DisassociateSourceServersRequest
     * @return DisassociateSourceServersResponse
     */
    CompletableFuture<DisassociateSourceServersResponse> disassociateSourceServers(DisassociateSourceServersRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query activation codes and the usage details of the activation codes. An activation code can be in the activated, unactivated, or expired state.</p>
     * 
     * @param request the request parameters of ListAccessTokens  ListAccessTokensRequest
     * @return ListAccessTokensResponse
     */
    CompletableFuture<ListAccessTokensResponse> listAccessTokens(ListAccessTokensRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
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
     * 
     * @param request the request parameters of ModifyReplicationJobAttribute  ModifyReplicationJobAttributeRequest
     * @return ModifyReplicationJobAttributeResponse
     */
    CompletableFuture<ModifyReplicationJobAttributeResponse> modifyReplicationJobAttribute(ModifyReplicationJobAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation regardless of the status of the migration source.</p>
     * 
     * @param request the request parameters of ModifySourceServerAttribute  ModifySourceServerAttributeRequest
     * @return ModifySourceServerAttributeResponse
     */
    CompletableFuture<ModifySourceServerAttributeResponse> modifySourceServerAttribute(ModifySourceServerAttributeRequest request);

    /**
     * @param request the request parameters of ModifyWorkgroupAttribute  ModifyWorkgroupAttributeRequest
     * @return ModifyWorkgroupAttributeResponse
     */
    CompletableFuture<ModifyWorkgroupAttributeResponse> modifyWorkgroupAttribute(ModifyWorkgroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation can only be used to start the migration jobs that are in the Ready, Stopped, or InError state.</p>
     * 
     * @param request the request parameters of StartReplicationJob  StartReplicationJobRequest
     * @return StartReplicationJobResponse
     */
    CompletableFuture<StartReplicationJobResponse> startReplicationJob(StartReplicationJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to pause only a migration job whose primary status is Running and business status is Syncing.</p>
     * 
     * @param request the request parameters of StopReplicationJob  StopReplicationJobRequest
     * @return StopReplicationJobResponse
     */
    CompletableFuture<StopReplicationJobResponse> stopReplicationJob(StopReplicationJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Up to 20 tags can be added to each SMC resource.
     * Before you add tags to an SMC resource, Alibaba Cloud checks the number of the tags that have been added to the resource. If the maximum number is reached, an error message is returned.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove tags that are added to one or more SMC resources and delete the tags if the tags are no longer used.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
