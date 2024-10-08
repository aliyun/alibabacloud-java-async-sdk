// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hbr20170908.models.*;
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

    CompletableFuture<AddContainerClusterResponse> addContainerCluster(AddContainerClusterRequest request);

    CompletableFuture<CancelBackupJobResponse> cancelBackupJob(CancelBackupJobRequest request);

    CompletableFuture<CancelRestoreJobResponse> cancelRestoreJob(CancelRestoreJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>In Cloud Backup, you can use resource groups to manage resources such as backup vaults, backup clients, and SAP HANA instances.</li>
     * <li>A resource is a cloud service entity that you create on Alibaba Cloud, such as an Elastic Compute Service (ECS) instance, a backup vault, or an SAP HANA instance.</li>
     * <li>You can sort resources owned by your Alibaba Cloud account into various resource groups. Resource groups facilitate resource management among multiple projects or applications within your Alibaba Cloud account and simplify permission management.</li>
     * </ul>
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CheckRoleResponse> checkRole(CheckRoleRequest request);

    CompletableFuture<CreateBackupJobResponse> createBackupJob(CreateBackupJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>A backup schedule defines the data source, backup policy, and other configurations. After you execute a backup schedule, a backup job is generated to record the backup progress and the backup result. If a backup job is complete, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</li>
     * <li>You can specify only one type of data source in a backup schedule.</li>
     * <li>You can specify only one interval as a backup cycle in a backup schedule.</li>
     * <li>Each backup schedule allows you to back up data to only one backup vault.</li>
     * </ul>
     */
    CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of Hybrid Backup Recovery (HBR). For more information, see <a href="~~89062~~">Billable items and billing methods</a>.</p>
     */
    CompletableFuture<CreateClientsResponse> createClients(CreateClientsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</li>
     * <li>You can specify only one type of data source in a backup plan.</li>
     * <li>You can specify only one interval as a backup cycle in a backup plan.</li>
     * <li>Each backup plan allows you to back up data to only one backup vault.</li>
     * </ul>
     */
    CompletableFuture<CreateHanaBackupPlanResponse> createHanaBackupPlan(CreateHanaBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>To register an SAP HANA instance, you must configure the connection parameters of the SAP HANA instance. After the SAP HANA instance is registered, Cloud Backup installs a Cloud Backup client on the Elastic Compute Service (ECS) instance that hosts the SAP HANA instance.</p>
     */
    CompletableFuture<CreateHanaInstanceResponse> createHanaInstance(CreateHanaInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>If you call this operation to restore a database, the database is restored to a specified state. Proceed with caution. For more information, see <a href="~~101178~~">Restore databases to an SAP HANA instance</a>.</p>
     */
    CompletableFuture<CreateHanaRestoreResponse> createHanaRestore(CreateHanaRestoreRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can bind data sources to only one policy in each request.</li>
     * <li>Elastic Compute Service (ECS) instances can be bound to only one policy.</li>
     * </ul>
     */
    CompletableFuture<CreatePolicyBindingsResponse> createPolicyBindings(CreatePolicyBindingsRequest request);

    /**
     * <b>description</b> :
     * <p>A backup policy records the information required for backup. After you execute a backup policy, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>A backup policy supports multiple data sources. The data sources can be only Elastic Compute Service (ECS) instances.</li>
     * <li>You can specify only one interval as a backup cycle in a backup policy.</li>
     * <li>Each backup policy allows you to back up data to only one backup vault.</li>
     * </ul>
     */
    CompletableFuture<CreatePolicyV2Response> createPolicyV2(CreatePolicyV2Request request);

    /**
     * <b>description</b> :
     * <p>After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state.</p>
     */
    CompletableFuture<CreateReplicationVaultResponse> createReplicationVault(CreateReplicationVaultRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You must create a restore job based on the specified backup snapshot and restore destination.</li>
     * <li>The type of the data source from which you restore data must be the same as the type of the restore destination.</li>
     * </ul>
     */
    CompletableFuture<CreateRestoreJobResponse> createRestoreJob(CreateRestoreJobRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can directly upload a file to Object Storage Service (OSS) by using a form based on the returned value of this operation.</li>
     * <li>For more information about how to upload a file to OSS by using a form, see OSS documentation.</li>
     * <li>The system periodically deletes files that are uploaded to OSS.</li>
     * </ol>
     */
    CompletableFuture<CreateTempFileUploadUrlResponse> createTempFileUploadUrl(CreateTempFileUploadUrlRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Each Alibaba Cloud account can create up to 100 backup vaults.</li>
     * <li>After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state. A backup job can use a backup vault to store backup data only if the backup vault is in the CREATED state.
     * **
     * <strong>Note</strong> Before you call this operation, make sure that you fully understand the billing of Cloud Backup.</li>
     * </ul>
     */
    CompletableFuture<CreateVaultResponse> createVault(CreateVaultRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You cannot delete the active Cloud Backup clients that receive heartbeat packets within 1 hour. You can call the UninstallBackupClients operation to uninstall a Cloud Backup client. Then, the client becomes inactive.</li>
     * <li>When you perform this operation, resources that are associated with the client are also deleted, including:<ul>
     * <li>Backup plans</li>
     * <li>Backup jobs</li>
     * <li>Snapshots</li>
     * </ul>
     * </li>
     * </ul>
     */
    CompletableFuture<DeleteBackupClientResponse> deleteBackupClient(DeleteBackupClientRequest request);

    /**
     * <b>description</b> :
     * <p>This operation deletes only the resources that are related to HBR clients. The resources include backup plans, backup jobs, and backup snapshots. The operation does not delete HBR clients.</p>
     */
    CompletableFuture<DeleteBackupClientResourceResponse> deleteBackupClientResource(DeleteBackupClientResourceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you delete a backup plan, the backup jobs are also deleted.</li>
     * <li>If you delete a backup plan, the created snapshot files are not deleted.</li>
     * </ul>
     */
    CompletableFuture<DeleteBackupPlanResponse> deleteBackupPlan(DeleteBackupPlanRequest request);

    CompletableFuture<DeleteClientResponse> deleteClient(DeleteClientRequest request);

    CompletableFuture<DeleteHanaBackupPlanResponse> deleteHanaBackupPlan(DeleteHanaBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>If you delete an SAP HANA instance, the existing backup data is also deleted and the running backup and restore jobs fail to be completed. Before you delete the SAP HANA instance, make sure that you no longer need the backup data of the instance and no backup or restore jobs are running for the instance. To delete an SAP HANA instance, you must specify the security identifier (SID) of the instance. The SID is three characters in length and starts with a letter. For more information, see <a href="https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?">How to find sid user and instance number of HANA db?</a></p>
     */
    CompletableFuture<DeleteHanaInstanceResponse> deleteHanaInstance(DeleteHanaInstanceRequest request);

    CompletableFuture<DeletePolicyBindingResponse> deletePolicyBinding(DeletePolicyBindingRequest request);

    /**
     * <b>description</b> :
     * <p>If you delete a backup policy, the backup policy is disassociated with all data sources. Proceed with caution.</p>
     */
    CompletableFuture<DeletePolicyV2Response> deletePolicyV2(DeletePolicyV2Request request);

    /**
     * <b>description</b> :
     * <p>If you delete the most recent backup snapshot for a data source, you must set the Force parameter to <code>true</code>. Otherwise, an error occurs.</p>
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    CompletableFuture<DeleteUdmDiskResponse> deleteUdmDisk(DeleteUdmDiskRequest request);

    CompletableFuture<DeleteUdmEcsInstanceResponse> deleteUdmEcsInstance(DeleteUdmEcsInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You cannot delete a backup vault within 2 hours after the backup vault is created or a backup vault that is in the INITIALIZING state.</li>
     * <li>After you delete a backup vault, all resources that are associated with the backup vault are deleted. The resources include the Cloud Backup client of the old version, backup plans, backup jobs, snapshots, and restore jobs.</li>
     * </ul>
     */
    CompletableFuture<DeleteVaultResponse> deleteVault(DeleteVaultRequest request);

    CompletableFuture<DescribeBackupClientsResponse> describeBackupClients(DescribeBackupClientsRequest request);

    CompletableFuture<DescribeBackupJobs2Response> describeBackupJobs2(DescribeBackupJobs2Request request);

    CompletableFuture<DescribeBackupPlansResponse> describeBackupPlans(DescribeBackupPlansRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to SAP HANA backup. For Cloud Backup clients of other data sources, call the DescribeBackupClients operation.</p>
     */
    CompletableFuture<DescribeClientsResponse> describeClients(DescribeClientsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only Container Service for Kubernetes (ACK) clusters.</p>
     */
    CompletableFuture<DescribeContainerClusterResponse> describeContainerCluster(DescribeContainerClusterRequest request);

    CompletableFuture<DescribeCrossAccountsResponse> describeCrossAccounts(DescribeCrossAccountsRequest request);

    CompletableFuture<DescribeHanaBackupPlansResponse> describeHanaBackupPlans(DescribeHanaBackupPlansRequest request);

    /**
     * <b>description</b> :
     * <p>If you want to query the backup retention period of a database, you can call the DescribeHanaRetentionSetting operation.</p>
     */
    CompletableFuture<DescribeHanaBackupSettingResponse> describeHanaBackupSetting(DescribeHanaBackupSettingRequest request);

    /**
     * <b>description</b> :
     * <p>After you call the DescribeHanaBackupsAsync operation to query the SAP HANA backups that meet the specified conditions, call the DescribeTask operation to query the final result.</p>
     */
    CompletableFuture<DescribeHanaBackupsAsyncResponse> describeHanaBackupsAsync(DescribeHanaBackupsAsyncRequest request);

    /**
     * <b>description</b> :
     * <p>After you register an SAP HANA instance and install a Cloud Backup client on the instance, you can call this operation to query the information about SAP HANA databases. You can call the StartHanaDatabaseAsync operation to start a database and call the StopHanaDatabaseAsync operation to stop a database.</p>
     */
    CompletableFuture<DescribeHanaDatabasesResponse> describeHanaDatabases(DescribeHanaDatabasesRequest request);

    CompletableFuture<DescribeHanaInstancesResponse> describeHanaInstances(DescribeHanaInstancesRequest request);

    CompletableFuture<DescribeHanaRestoresResponse> describeHanaRestores(DescribeHanaRestoresRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you want to query the backup parameters of a database, you can call the DescribeHanaBackupSetting operation.</li>
     * <li>Cloud Backup deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.</li>
     * </ul>
     */
    CompletableFuture<DescribeHanaRetentionSettingResponse> describeHanaRetentionSetting(DescribeHanaRetentionSettingRequest request);

    CompletableFuture<DescribeOtsTableSnapshotsResponse> describeOtsTableSnapshots(DescribeOtsTableSnapshotsRequest request);

    CompletableFuture<DescribePoliciesV2Response> describePoliciesV2(DescribePoliciesV2Request request);

    CompletableFuture<DescribePolicyBindingsResponse> describePolicyBindings(DescribePolicyBindingsRequest request);

    CompletableFuture<DescribeRecoverableOtsInstancesResponse> describeRecoverableOtsInstances(DescribeRecoverableOtsInstancesRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRestoreJobs2Response> describeRestoreJobs2(DescribeRestoreJobs2Request request);

    CompletableFuture<DescribeTaskResponse> describeTask(DescribeTaskRequest request);

    CompletableFuture<DescribeUdmSnapshotsResponse> describeUdmSnapshots(DescribeUdmSnapshotsRequest request);

    CompletableFuture<DescribeVaultReplicationRegionsResponse> describeVaultReplicationRegions(DescribeVaultReplicationRegionsRequest request);

    CompletableFuture<DescribeVaultsResponse> describeVaults(DescribeVaultsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the request is successful, the mount target is deleted.</li>
     * <li>After you create a backup plan for an Apsara File Storage NAS file system, HBR automatically creates a mount target for the file system. You can call this operation to delete the mount target. In the <strong>Status</strong> column of the mount target of the NAS file system, the following information is displayed: <strong>This mount target is created by an Alibaba Cloud internal service and cannot be operated. Service name: HBR</strong>.</li>
     * </ul>
     */
    CompletableFuture<DetachNasFileSystemResponse> detachNasFileSystem(DetachNasFileSystemRequest request);

    /**
     * <b>description</b> :
     * <p>After you call this operation, the backup plan is suspended. In the DescribeBackupPlans operation, the Disabled parameter is set to true.</p>
     */
    CompletableFuture<DisableBackupPlanResponse> disableBackupPlan(DisableBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>To enable the backup plan again, call the EnableHanaBackupPlan operation.</p>
     */
    CompletableFuture<DisableHanaBackupPlanResponse> disableHanaBackupPlan(DisableHanaBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>After you call this operation, the backup plan is restarted (Disabled is set to false in the DescribeBackupPlans operation). Cloud Backup continues to perform backups based on the policy specified in the backup plan.</p>
     */
    CompletableFuture<EnableBackupPlanResponse> enableBackupPlan(EnableBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>To disable the backup plan again, call the DisableHanaBackupPlan operation.</p>
     */
    CompletableFuture<EnableHanaBackupPlanResponse> enableHanaBackupPlan(EnableHanaBackupPlanRequest request);

    CompletableFuture<ExecuteBackupPlanResponse> executeBackupPlan(ExecuteBackupPlanRequest request);

    CompletableFuture<ExecutePolicyV2Response> executePolicyV2(ExecutePolicyV2Request request);

    CompletableFuture<GenerateRamPolicyResponse> generateRamPolicy(GenerateRamPolicyRequest request);

    CompletableFuture<GetTempFileDownloadLinkResponse> getTempFileDownloadLink(GetTempFileDownloadLinkRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation creates an asynchronous job at the backend and calls Cloud Assistant to install an HBR client on an ECS instance.</li>
     * <li>You can call the <a href="~~431265~~">DescribeTask</a> operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 60 seconds after you call the InstallBackupClients operation to install HBR clients. Then, run the next queries at an interval of 30 seconds.</li>
     * </ul>
     */
    CompletableFuture<InstallBackupClientsResponse> installBackupClients(InstallBackupClientsRequest request);

    CompletableFuture<OpenHbrServiceResponse> openHbrService(OpenHbrServiceRequest request);

    CompletableFuture<SearchHistoricalSnapshotsResponse> searchHistoricalSnapshots(SearchHistoricalSnapshotsRequest request);

    /**
     * <b>description</b> :
     * <p>To stop the database again, call the StopHanaDatabaseAsync operation.</p>
     */
    CompletableFuture<StartHanaDatabaseAsyncResponse> startHanaDatabaseAsync(StartHanaDatabaseAsyncRequest request);

    /**
     * <b>description</b> :
     * <p>To start the database again, call the StartHanaDatabaseAsync operation.</p>
     */
    CompletableFuture<StopHanaDatabaseAsyncResponse> stopHanaDatabaseAsync(StopHanaDatabaseAsyncRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation creates an asynchronous job at the backend and calls Cloud Assistant to uninstall a backup client from an ECS instance.</li>
     * <li>You can call the DescribeTask operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 30 seconds after you call the UninstallBackupClients operation to uninstall backup clients. Then, run the next queries at an interval of 30 seconds.</li>
     * </ul>
     */
    CompletableFuture<UninstallBackupClientsResponse> uninstallBackupClients(UninstallBackupClientsRequest request);

    /**
     * <b>description</b> :
     * <p>If you call this operation, the specified HBR client is uninstalled. To reinstall the HBR client, call the CreateClients operation.</p>
     */
    CompletableFuture<UninstallClientResponse> uninstallClient(UninstallClientRequest request);

    CompletableFuture<UpdateBackupPlanResponse> updateBackupPlan(UpdateBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the configurations of both the old and new HBR clients.</p>
     */
    CompletableFuture<UpdateClientSettingsResponse> updateClientSettings(UpdateClientSettingsRequest request);

    CompletableFuture<UpdateContainerClusterResponse> updateContainerCluster(UpdateContainerClusterRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</li>
     * <li>You can specify only one type of data source in a backup plan.</li>
     * <li>You can specify only one interval as a backup cycle in a backup plan.</li>
     * <li>Each backup plan allows you to back up data to only one backup vault.</li>
     * </ul>
     */
    CompletableFuture<UpdateHanaBackupPlanResponse> updateHanaBackupPlan(UpdateHanaBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the UpdateHanaRetentionSetting operation to update the backup retention period of a database.</p>
     */
    CompletableFuture<UpdateHanaBackupSettingResponse> updateHanaBackupSetting(UpdateHanaBackupSettingRequest request);

    CompletableFuture<UpdateHanaInstanceResponse> updateHanaInstance(UpdateHanaInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you want to update the backup parameters of a database, you can call the UpdateHanaBackupSetting operation.</li>
     * <li>Cloud Backup deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.</li>
     * </ul>
     */
    CompletableFuture<UpdateHanaRetentionSettingResponse> updateHanaRetentionSetting(UpdateHanaRetentionSettingRequest request);

    CompletableFuture<UpdatePolicyBindingResponse> updatePolicyBinding(UpdatePolicyBindingRequest request);

    /**
     * <b>description</b> :
     * <p>If you modify a backup policy, the modification takes effect on all data sources that are bound to the backup policy. Proceed with caution.</p>
     */
    CompletableFuture<UpdatePolicyV2Response> updatePolicyV2(UpdatePolicyV2Request request);

    CompletableFuture<UpdateVaultResponse> updateVault(UpdateVaultRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation creates an asynchronous job at the backend and calls Cloud Assistant to upgrade an HBR client that is installed on an ECS instance.</li>
     * <li>You can call the DescribeTask operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes.</li>
     * </ul>
     */
    CompletableFuture<UpgradeBackupClientsResponse> upgradeBackupClients(UpgradeBackupClientsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to upgrade a Cloud Backup client to the latest version. After the Cloud Backup client is upgraded, the version of the client cannot be rolled back.</p>
     */
    CompletableFuture<UpgradeClientResponse> upgradeClient(UpgradeClientRequest request);

}
