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
     * <b>description</b> :
     * <p>  The region of the bucket must be the same as the region where the security audit feature is enabled.</p>
     * <ul>
     * <li>If the security audit feature is enabled, do not delete Object Storage Service (OSS) buckets. If you delete OSS buckets, audit logs fail to be delivered.</li>
     * <li>Only electronic virtual security modules (EVSMs) and general virtual security modules (GVSMs) within the Chinese mainland support the security audit feature.</li>
     * </ul>
     * 
     * @param request the request parameters of ConfigAuditLog  ConfigAuditLogRequest
     * @return ConfigAuditLogResponse
     */
    CompletableFuture<ConfigAuditLogResponse> configAuditLog(ConfigAuditLogRequest request);

    /**
     * @param request the request parameters of ConfigBackupRemark  ConfigBackupRemarkRequest
     * @return ConfigBackupRemarkResponse
     */
    CompletableFuture<ConfigBackupRemarkResponse> configBackupRemark(ConfigBackupRemarkRequest request);

    /**
     * <b>description</b> :
     * <p>Only hardware security modules (HSMs) in the Chinese mainland support the operation.</p>
     * 
     * @param request the request parameters of ConfigBackupTask  ConfigBackupTaskRequest
     * @return ConfigBackupTaskResponse
     */
    CompletableFuture<ConfigBackupTaskResponse> configBackupTask(ConfigBackupTaskRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about how to create a self-signed certificate and a cluster certificate on an Elastic Compute Service (ECS) instance, see <a href="https://help.aliyun.com/document_detail/293585.html">Create a NIST FIPS-validated GVSM cluster</a>.</p>
     * 
     * @param request the request parameters of ConfigClusterCertificate  ConfigClusterCertificateRequest
     * @return ConfigClusterCertificateResponse
     */
    CompletableFuture<ConfigClusterCertificateResponse> configClusterCertificate(ConfigClusterCertificateRequest request);

    /**
     * @param request the request parameters of ConfigClusterName  ConfigClusterNameRequest
     * @return ConfigClusterNameResponse
     */
    CompletableFuture<ConfigClusterNameResponse> configClusterName(ConfigClusterNameRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the operation to configure all vSwitches that are associated with a HSM cluster. You can only add new vSwitches. You cannot delete vSwitches.</p>
     * 
     * @param request the request parameters of ConfigClusterSubnet  ConfigClusterSubnetRequest
     * @return ConfigClusterSubnetResponse
     */
    CompletableFuture<ConfigClusterSubnetResponse> configClusterSubnet(ConfigClusterSubnetRequest request);

    /**
     * <b>description</b> :
     * <p>The IP address whitelist of a cluster has a higher priority than the IP address whitelist of a hardware security module (HSM) in the cluster. In cluster mode, we recommend that you create an IP address whitelist for your cluster. You do not need to create an IP address for the HSM in the cluster.</p>
     * 
     * @param request the request parameters of ConfigClusterWhitelist  ConfigClusterWhitelistRequest
     * @return ConfigClusterWhitelistResponse
     */
    CompletableFuture<ConfigClusterWhitelistResponse> configClusterWhitelist(ConfigClusterWhitelistRequest request);

    /**
     * @param request the request parameters of ConfigImageRemark  ConfigImageRemarkRequest
     * @return ConfigImageRemarkResponse
     */
    CompletableFuture<ConfigImageRemarkResponse> configImageRemark(ConfigImageRemarkRequest request);

    /**
     * <b>description</b> :
     * <p>After you add an HSM to a cluster, you cannot modify the VPC endpoint of the HSM.</p>
     * 
     * @param request the request parameters of ConfigInstanceIpAddress  ConfigInstanceIpAddressRequest
     * @return ConfigInstanceIpAddressResponse
     */
    CompletableFuture<ConfigInstanceIpAddressResponse> configInstanceIpAddress(ConfigInstanceIpAddressRequest request);

    /**
     * @param request the request parameters of ConfigInstanceRemark  ConfigInstanceRemarkRequest
     * @return ConfigInstanceRemarkResponse
     */
    CompletableFuture<ConfigInstanceRemarkResponse> configInstanceRemark(ConfigInstanceRemarkRequest request);

    /**
     * <b>description</b> :
     * <p>You can configure the IP address whitelist for HSMs that are not added to a cluster and are in the ACTIVE state.</p>
     * 
     * @param request the request parameters of ConfigInstanceWhitelist  ConfigInstanceWhitelistRequest
     * @return ConfigInstanceWhitelistResponse
     */
    CompletableFuture<ConfigInstanceWhitelistResponse> configInstanceWhitelist(ConfigInstanceWhitelistRequest request);

    /**
     * <b>description</b> :
     * <p>This operation requires that the destination region does not have the same image. This operation is available only for hardware security modules (HSMs) outside the Chinese mainland.</p>
     * 
     * @param request the request parameters of CopyImage  CopyImageRequest
     * @return CopyImageResponse
     */
    CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request);

    /**
     * <b>description</b> :
     * <p>The master HSM that you specify to create a cluster must be in the ACTIVE state.</p>
     * 
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete an HSM only if the cluster does not contain HSMs.</p>
     * 
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API允许用户获取特定集群的管理证书。</li>
     * <li>返回的数据是经过base64编码的证书内容。</li>
     * </ul>
     * 
     * @param request the request parameters of DownloadClusterManagedCert  DownloadClusterManagedCertRequest
     * @return DownloadClusterManagedCertResponse
     */
    CompletableFuture<DownloadClusterManagedCertResponse> downloadClusterManagedCert(DownloadClusterManagedCertRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only for backups in the Chinese mainland.</p>
     * 
     * @param request the request parameters of EnableBackup  EnableBackupRequest
     * @return EnableBackupResponse
     */
    CompletableFuture<EnableBackupResponse> enableBackup(EnableBackupRequest request);

    /**
     * @param request the request parameters of ExportImage  ExportImageRequest
     * @return ExportImageResponse
     */
    CompletableFuture<ExportImageResponse> exportImage(ExportImageRequest request);

    /**
     * @param request the request parameters of GetAuditLogStatus  GetAuditLogStatusRequest
     * @return GetAuditLogStatusResponse
     */
    CompletableFuture<GetAuditLogStatusResponse> getAuditLogStatus(GetAuditLogStatusRequest request);

    /**
     * @param request the request parameters of GetBackup  GetBackupRequest
     * @return GetBackupResponse
     */
    CompletableFuture<GetBackupResponse> getBackup(GetBackupRequest request);

    /**
     * @param request the request parameters of GetCluster  GetClusterRequest
     * @return GetClusterResponse
     */
    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    /**
     * @param request the request parameters of GetImage  GetImageRequest
     * @return GetImageResponse
     */
    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    /**
     * @param request the request parameters of InitializeAuditLog  InitializeAuditLogRequest
     * @return InitializeAuditLogResponse
     */
    CompletableFuture<InitializeAuditLogResponse> initializeAuditLog(InitializeAuditLogRequest request);

    /**
     * <b>description</b> :
     * <p>  The cluster is not initialized, but the master hardware security module (HSM) of the cluster is initialized.</p>
     * <ul>
     * <li>Two or more vSwitches are configured for the cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of InitializeCluster  InitializeClusterRequest
     * @return InitializeClusterResponse
     */
    CompletableFuture<InitializeClusterResponse> initializeCluster(InitializeClusterRequest request);

    /**
     * <b>description</b> :
     * <p>  You can add the HSM to only the cluster that is in the INITIALIZED state.</p>
     * <ul>
     * <li>The HSM that you want to add to the cluster is enabled or disabled and is not initialized.</li>
     * </ul>
     * 
     * @param request the request parameters of JoinCluster  JoinClusterRequest
     * @return JoinClusterResponse
     */
    CompletableFuture<JoinClusterResponse> joinCluster(JoinClusterRequest request);

    /**
     * <b>description</b> :
     * <p>  If non-master HSMs exist in a cluster, the master HSM cannot be removed from the cluster.</p>
     * <ul>
     * <li>After the master HSM is removed from a cluster, the cluster enters the TO_DELETE state and cannot be restored to the available state. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of LeaveCluster  LeaveClusterRequest
     * @return LeaveClusterResponse
     */
    CompletableFuture<LeaveClusterResponse> leaveCluster(LeaveClusterRequest request);

    /**
     * @param request the request parameters of ListBackups  ListBackupsRequest
     * @return ListBackupsResponse
     */
    CompletableFuture<ListBackupsResponse> listBackups(ListBackupsRequest request);

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>After you disable an HSM, the relevant service operations fail. Proceed with caution.</p>
     * 
     * @param request the request parameters of PauseInstance  PauseInstanceRequest
     * @return PauseInstanceResponse
     */
    CompletableFuture<PauseInstanceResponse> pauseInstance(PauseInstanceRequest request);

    /**
     * @param request the request parameters of QuickDeployCluster  QuickDeployClusterRequest
     * @return QuickDeployClusterResponse
     */
    CompletableFuture<QuickDeployClusterResponse> quickDeployCluster(QuickDeployClusterRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only for general virtual security modules (GVSMs) in the Chinese mainland.</p>
     * 
     * @param request the request parameters of QuickInitInstance  QuickInitInstanceRequest
     * @return QuickInitInstanceResponse
     */
    CompletableFuture<QuickInitInstanceResponse> quickInitInstance(QuickInitInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only for HSMs in the Chinese mainland.</p>
     * 
     * @param request the request parameters of ResetBackup  ResetBackupRequest
     * @return ResetBackupResponse
     */
    CompletableFuture<ResetBackupResponse> resetBackup(ResetBackupRequest request);

    /**
     * <b>description</b> :
     * <p>After an HSM is reset, all related data is deleted and cannot be recovered. Proceed with caution.</p>
     * 
     * @param request the request parameters of ResetInstance  ResetInstanceRequest
     * @return ResetInstanceResponse
     */
    CompletableFuture<ResetInstanceResponse> resetInstance(ResetInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can use images to restore only HSMs that are paused or disabled.</p>
     * 
     * @param request the request parameters of RestoreInstance  RestoreInstanceRequest
     * @return RestoreInstanceResponse
     */
    CompletableFuture<RestoreInstanceResponse> restoreInstance(RestoreInstanceRequest request);

    /**
     * @param request the request parameters of ResumeInstance  ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API用于触发指定集群的管理证书轮转过程。通过提供<code>ClusterId</code>参数，可以指定需要进行证书轮转的集群。此操作有助于提高集群的安全性，建议定期执行。</p>
     * <h3>注意事项</h3>
     * <ul>
     * <li>确保提供的<code>ClusterId</code>是有效的，并且用户具有对该集群的操作权限。</li>
     * <li>证书轮转可能会影响依赖于旧证书的服务，请在适当的时间窗口内执行此操作。</li>
     * </ul>
     * 
     * @param request the request parameters of RotateClusterManagedCert  RotateClusterManagedCertRequest
     * @return RotateClusterManagedCertResponse
     */
    CompletableFuture<RotateClusterManagedCertResponse> rotateClusterManagedCert(RotateClusterManagedCertRequest request);

    /**
     * @param request the request parameters of SwitchClusterMaster  SwitchClusterMasterRequest
     * @return SwitchClusterMasterResponse
     */
    CompletableFuture<SwitchClusterMasterResponse> switchClusterMaster(SwitchClusterMasterRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is used for manually synchronizing data within clusters located in the Chinese Mainland. For clusters outside the Chinese Mainland, automatic data synchronization is supported, and this operation is unnecessary. If you attempt to use this operation, a 400 error code will be returned.</p>
     * <ul>
     * <li>The data synchronization takes approximately 5 minutes. To avoid service interruptions, we recommend performing this operation during off-peak hours.</li>
     * </ul>
     * 
     * @param request the request parameters of SyncCluster  SyncClusterRequest
     * @return SyncClusterResponse
     */
    CompletableFuture<SyncClusterResponse> syncCluster(SyncClusterRequest request);

}
