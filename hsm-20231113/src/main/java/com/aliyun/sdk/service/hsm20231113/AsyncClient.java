// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hsm20231113.models.*;
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
      * *   The region of the bucket must be the same as the region where the security audit feature is enabled.
      * *   If the security audit feature is enabled, do not delete Object Storage Service (OSS) buckets. If you delete OSS buckets, audit logs fail to be delivered.
      * *   Only electronic virtual security modules (EVSMs) and general virtual security modules (GVSMs) within the Chinese mainland support the security audit feature.
      *
     */
    CompletableFuture<ConfigAuditLogResponse> configAuditLog(ConfigAuditLogRequest request);

    CompletableFuture<ConfigBackupRemarkResponse> configBackupRemark(ConfigBackupRemarkRequest request);

    CompletableFuture<ConfigBackupTaskResponse> configBackupTask(ConfigBackupTaskRequest request);

    CompletableFuture<ConfigClusterCertificateResponse> configClusterCertificate(ConfigClusterCertificateRequest request);

    CompletableFuture<ConfigClusterNameResponse> configClusterName(ConfigClusterNameRequest request);

    CompletableFuture<ConfigClusterSubnetResponse> configClusterSubnet(ConfigClusterSubnetRequest request);

    /**
      * The IP address whitelist of a cluster has a higher priority than the IP address whitelist of a hardware security module (HSM) in the cluster. In cluster mode, we recommend that you create an IP address whitelist for your cluster. In this case, you do not need to create an IP address for the HSM in the cluster.
      *
     */
    CompletableFuture<ConfigClusterWhitelistResponse> configClusterWhitelist(ConfigClusterWhitelistRequest request);

    CompletableFuture<ConfigImageRemarkResponse> configImageRemark(ConfigImageRemarkRequest request);

    /**
      * After you add an HSM to a cluster, you cannot modify the VPC endpoint of the HSM.
      *
     */
    CompletableFuture<ConfigInstanceIpAddressResponse> configInstanceIpAddress(ConfigInstanceIpAddressRequest request);

    CompletableFuture<ConfigInstanceRemarkResponse> configInstanceRemark(ConfigInstanceRemarkRequest request);

    CompletableFuture<ConfigInstanceWhitelistResponse> configInstanceWhitelist(ConfigInstanceWhitelistRequest request);

    CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request);

    /**
      * The master HSM that you specify to create a cluster must be in the ACTIVE state.
      *
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
      * You can delete a cluster only when no hardware security modules (HSMs) exist in the cluster.
      *
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<EnableBackupResponse> enableBackup(EnableBackupRequest request);

    CompletableFuture<ExportImageResponse> exportImage(ExportImageRequest request);

    CompletableFuture<GetAuditLogStatusResponse> getAuditLogStatus(GetAuditLogStatusRequest request);

    CompletableFuture<GetBackupResponse> getBackup(GetBackupRequest request);

    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    CompletableFuture<InitializeAuditLogResponse> initializeAuditLog(InitializeAuditLogRequest request);

    /**
      * *   The cluster is not initialized, but the master hardware security module (HSM) of the cluster is initialized.
      * *   Two or more vSwitches are configured for the cluster.
      *
     */
    CompletableFuture<InitializeClusterResponse> initializeCluster(InitializeClusterRequest request);

    /**
      * You can add an HSM only to the cluster that is in the INITIALIZED state, and the HSM must be enabled or disabled and is not initialized.
      *
     */
    CompletableFuture<JoinClusterResponse> joinCluster(JoinClusterRequest request);

    /**
      * *   If non-master HSMs exist in a cluster, you cannot remove the master HSM from the cluster.
      * *   After the master HSM is removed from a cluster, the cluster enters the TO_DELETE state and cannot be restored to be available. Proceed with caution.
      *
     */
    CompletableFuture<LeaveClusterResponse> leaveCluster(LeaveClusterRequest request);

    CompletableFuture<ListBackupsResponse> listBackups(ListBackupsRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
      * After you deactivate an HSM, the relevant service operations fail. Proceed with caution.
      *
     */
    CompletableFuture<PauseInstanceResponse> pauseInstance(PauseInstanceRequest request);

    /**
      * This operation is supported only for general virtual security modules (GVSMs) that are deployed in regions in the Chinese mainland.
      *
     */
    CompletableFuture<QuickInitInstanceResponse> quickInitInstance(QuickInitInstanceRequest request);

    CompletableFuture<ResetBackupResponse> resetBackup(ResetBackupRequest request);

    /**
      * After an HSM is reset, all related data is deleted and cannot be recovered. Exercise caution.
      *
     */
    CompletableFuture<ResetInstanceResponse> resetInstance(ResetInstanceRequest request);

    /**
      * You can use images to restore only HSMs that are suspended or deactivated.
      *
     */
    CompletableFuture<RestoreInstanceResponse> restoreInstance(RestoreInstanceRequest request);

    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    CompletableFuture<SwitchClusterMasterResponse> switchClusterMaster(SwitchClusterMasterRequest request);

    /**
      * This operation is supported only for hardware security modules (HSMs) that are created in regions in the Chinese mainland.
      *
     */
    CompletableFuture<SyncClusterResponse> syncCluster(SyncClusterRequest request);

}
