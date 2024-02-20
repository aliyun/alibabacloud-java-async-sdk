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

    CompletableFuture<AttachNasFileSystemResponse> attachNasFileSystem(AttachNasFileSystemRequest request);

    CompletableFuture<CancelBackupJobResponse> cancelBackupJob(CancelBackupJobRequest request);

    CompletableFuture<CancelRestoreJobResponse> cancelRestoreJob(CancelRestoreJobRequest request);

    /**
      * *   In the Hybrid Backup Recovery (HBR), you can use resource groups to manage resources such as backup vaults, backup clients, and SAP HANA instances.
      * *   A resource is a cloud service entity that you create on Alibaba Cloud, such as an ECS instance, a backup vault, or an SAP HANA instance.
      * *   You can sort resources owned by your Alibaba Cloud account into various resource groups. This facilitates resource management among multiple projects or applications within your Alibaba Cloud account and simplifies permission management.
      *
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CheckRoleResponse> checkRole(CheckRoleRequest request);

    CompletableFuture<CreateBackupJobResponse> createBackupJob(CreateBackupJobRequest request);

    /**
      * *   A backup schedule defines the data source, backup policy, and other configurations. After you execute a backup schedule, a backup job is generated to record the backup progress and the backup result. If a backup job is complete, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   You can specify only one type of data source in a backup schedule.
      * *   You can specify only one interval as a backup cycle in a backup schedule.
      * *   Each backup schedule allows you to back up data to only one backup vault.
      *
     */
    CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request);

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and pricing of Hybrid Backup Recovery (HBR). For more information, see [Billable items and billing methods](~~89062~~).
      *
     */
    CompletableFuture<CreateClientsResponse> createClients(CreateClientsRequest request);

    /**
      * *   A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   You can specify only one type of data source in a backup plan.
      * *   You can specify only one interval as a backup cycle in a backup plan.
      * *   Each backup plan allows you to back up data to only one backup vault.
      *
     */
    CompletableFuture<CreateHanaBackupPlanResponse> createHanaBackupPlan(CreateHanaBackupPlanRequest request);

    /**
      * To register an SAP HANA instance, you must configure the connection parameters of the SAP HANA instance. After the SAP HANA instance is registered, HBR installs an HBR client on the ECS instance that hosts the SAP HANA instance.
      *
     */
    CompletableFuture<CreateHanaInstanceResponse> createHanaInstance(CreateHanaInstanceRequest request);

    /**
      * If you call this operation to restore a database, the database is restored to a specified state. Proceed with caution. For more information, see [Restore databases to an SAP HANA instance](~~101178~~).
      *
     */
    CompletableFuture<CreateHanaRestoreResponse> createHanaRestore(CreateHanaRestoreRequest request);

    /**
      * *   You can bind data sources to only one policy in each request.
      * *   Elastic Compute Service (ECS) instances can be bound to only one policy.
      *
     */
    CompletableFuture<CreatePolicyBindingsResponse> createPolicyBindings(CreatePolicyBindingsRequest request);

    /**
      * A backup policy records the information required for backup. After you execute a backup policy, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   A backup policy supports multiple data sources. The data sources can be only Elastic Compute Service (ECS) instances.
      * *   You can specify only one interval as a backup cycle in a backup policy.
      * *   Each backup policy allows you to back up data to only one backup vault.
      *
     */
    CompletableFuture<CreatePolicyV2Response> createPolicyV2(CreatePolicyV2Request request);

    /**
      * After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state.
      *
     */
    CompletableFuture<CreateReplicationVaultResponse> createReplicationVault(CreateReplicationVaultRequest request);

    /**
      * *   You must create a restore job based on the specified backup snapshot and restore destination.
      * *   The type of the data source from which you restore data must be the same as the type of the restore destination.
      *
     */
    CompletableFuture<CreateRestoreJobResponse> createRestoreJob(CreateRestoreJobRequest request);

    /**
      * 1.  You can directly upload a file to Object Storage Service (OSS) by using a form based on the returned value of this operation.
      * 2.  For more information about how to upload a file to OSS by using a form, see OSS documentation.
      * 3.  The system periodically deletes files that are uploaded to OSS.
      *
     */
    CompletableFuture<CreateTempFileUploadUrlResponse> createTempFileUploadUrl(CreateTempFileUploadUrlRequest request);

    /**
      * *   Each Alibaba Cloud account can create up to 100 backup vaults.
      * *   After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state. A backup job can use a backup vault to store backup data only if the backup vault is in the CREATED state.
      *
     */
    CompletableFuture<CreateVaultResponse> createVault(CreateVaultRequest request);

    /**
      * *   You cannot delete an active backup client from which a heartbeat packet is received within the previous hour. After you call the UninstallBackupClients operation to uninstall a backup client, the status of the backup client changes to inactive.
      * *   This operation deletes the resources that are related to the backup client. The following resources are included:
      *     *   Backup plans
      *     *   Backup jobs
      *     *   Backup files
      *
     */
    CompletableFuture<DeleteBackupClientResponse> deleteBackupClient(DeleteBackupClientRequest request);

    /**
      * This operation deletes only the resources that are related to HBR clients. The resources include backup plans, backup jobs, and backup snapshots. The operation does not delete HBR clients.
      *
     */
    CompletableFuture<DeleteBackupClientResourceResponse> deleteBackupClientResource(DeleteBackupClientResourceRequest request);

    /**
      * *   If you delete a backup plan, the backup jobs are also deleted.
      * *   If you delete a backup plan, the created snapshot files are not deleted.
      *
     */
    CompletableFuture<DeleteBackupPlanResponse> deleteBackupPlan(DeleteBackupPlanRequest request);

    CompletableFuture<DeleteClientResponse> deleteClient(DeleteClientRequest request);

    CompletableFuture<DeleteHanaBackupPlanResponse> deleteHanaBackupPlan(DeleteHanaBackupPlanRequest request);

    /**
      * If you delete an SAP HANA instance, the existing backup data is also deleted and the running backup and restore jobs fail to be completed. Before you delete the SAP HANA instance, make sure that you no longer need the data in the HBR client of the instance and no backup or restore jobs are running for the instance. To delete an SAP HANA instance, you must specify the security identifier (SID) of the instance. The SID is three characters in length and starts with a letter. For more information, see [How to find sid user and instance number of HANA db?](https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?)
      *
     */
    CompletableFuture<DeleteHanaInstanceResponse> deleteHanaInstance(DeleteHanaInstanceRequest request);

    CompletableFuture<DeletePolicyBindingResponse> deletePolicyBinding(DeletePolicyBindingRequest request);

    /**
      * If you delete a backup policy, the backup policy is disassociated with all data sources. Proceed with caution.
      *
     */
    CompletableFuture<DeletePolicyV2Response> deletePolicyV2(DeletePolicyV2Request request);

    /**
      * If you delete the most recent backup file for a data source, you must set the `Force parameter to true`. Otherwise, an error occurs.
      *
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
      * *   You cannot delete a backup vault within 2 hours after the backup vault is created or a backup vault that is in the INITIALIZING state.
      * *   After you delete a backup vault, all resources that are associated with the backup vault are deleted. The resources include backup clients of earlier versions, backup plans, backup jobs, snapshots, and restore jobs.
      *
     */
    CompletableFuture<DeleteVaultResponse> deleteVault(DeleteVaultRequest request);

    CompletableFuture<DescribeBackupClientsResponse> describeBackupClients(DescribeBackupClientsRequest request);

    CompletableFuture<DescribeBackupJobs2Response> describeBackupJobs2(DescribeBackupJobs2Request request);

    CompletableFuture<DescribeBackupPlansResponse> describeBackupPlans(DescribeBackupPlansRequest request);

    /**
      * This operation is applicable only to SAP HANA backup. For backup clients of other data sources, call the DescribeBackupClients operation.
      *
     */
    CompletableFuture<DescribeClientsResponse> describeClients(DescribeClientsRequest request);

    /**
      * You can call this operation to query only Container Service for Kubernetes (ACK) clusters.
      *
     */
    CompletableFuture<DescribeContainerClusterResponse> describeContainerCluster(DescribeContainerClusterRequest request);

    CompletableFuture<DescribeCrossAccountsResponse> describeCrossAccounts(DescribeCrossAccountsRequest request);

    CompletableFuture<DescribeHanaBackupPlansResponse> describeHanaBackupPlans(DescribeHanaBackupPlansRequest request);

    /**
      * If you want to query the backup retention period of a database, you can call the DescribeHanaRetentionSetting operation.
      *
     */
    CompletableFuture<DescribeHanaBackupSettingResponse> describeHanaBackupSetting(DescribeHanaBackupSettingRequest request);

    /**
      * After you call the DescribeHanaBackupsAsync operation to query the SAP HANA backups that meet the specified conditions, call the DescribeTask operation to query the execution result of the asynchronous job.
      *
     */
    CompletableFuture<DescribeHanaBackupsAsyncResponse> describeHanaBackupsAsync(DescribeHanaBackupsAsyncRequest request);

    /**
      * After you register an SAP HANA instance and install a backup client on the instance, you can call this operation to query the information about SAP HANA databases. You can call the StartHanaDatabaseAsync operation to start a database and call the StopHanaDatabaseAsync operation to stop a database.
      *
     */
    CompletableFuture<DescribeHanaDatabasesResponse> describeHanaDatabases(DescribeHanaDatabasesRequest request);

    CompletableFuture<DescribeHanaInstancesResponse> describeHanaInstances(DescribeHanaInstancesRequest request);

    CompletableFuture<DescribeHanaRestoresResponse> describeHanaRestores(DescribeHanaRestoresRequest request);

    /**
      * *   If you want to query the backup parameters of a database, you can call the DescribeHanaBackupSetting operation.
      * *   HBR deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.
      *
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
      * *   If the request is successful, the mount target is deleted.
      * *   After you create a backup plan for an Apsara File Storage NAS file system, HBR automatically creates a mount target for the file system. You can call this operation to delete the mount target. In the **Status** column of the mount target of the NAS file system, the following information is displayed: **This mount target is created by an Alibaba Cloud internal service and cannot be operated. Service name: HBR**.
      *
     */
    CompletableFuture<DetachNasFileSystemResponse> detachNasFileSystem(DetachNasFileSystemRequest request);

    /**
      * If the request is successful, the specified backup plan is disabled. If you call the DescribeBackupPlans operation to query backup plans, the Disabled parameter is set to true for the backup plan.
      *
     */
    CompletableFuture<DisableBackupPlanResponse> disableBackupPlan(DisableBackupPlanRequest request);

    /**
      * To enable the backup plan again, call the EnableHanaBackupPlan operation.
      *
     */
    CompletableFuture<DisableHanaBackupPlanResponse> disableHanaBackupPlan(DisableHanaBackupPlanRequest request);

    /**
      * If the request is successful, the system enables the backup plan and backs up data based on the polices that are specified in the backup plan. If you call the DescribeBackupPlans operation to query backup plans, the Disabled parameter is automatically set to false for the backup plan.
      *
     */
    CompletableFuture<EnableBackupPlanResponse> enableBackupPlan(EnableBackupPlanRequest request);

    /**
      * To disable the backup plan again, call the DisableHanaBackupPlan operation.
      *
     */
    CompletableFuture<EnableHanaBackupPlanResponse> enableHanaBackupPlan(EnableHanaBackupPlanRequest request);

    CompletableFuture<ExecuteBackupPlanResponse> executeBackupPlan(ExecuteBackupPlanRequest request);

    CompletableFuture<ExecutePolicyV2Response> executePolicyV2(ExecutePolicyV2Request request);

    CompletableFuture<GenerateRamPolicyResponse> generateRamPolicy(GenerateRamPolicyRequest request);

    CompletableFuture<GetTempFileDownloadLinkResponse> getTempFileDownloadLink(GetTempFileDownloadLinkRequest request);

    /**
      * *   This operation creates an asynchronous job at the backend and calls Cloud Assistant to install an HBR client on an ECS instance.
      * *   You can call the [DescribeTask](~~431265~~) operation to query the execution result of an asynchronous job.
      * *   The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 60 seconds after you call the InstallBackupClients operation to install HBR clients. Then, run the next queries at an interval of 30 seconds.
      *
     */
    CompletableFuture<InstallBackupClientsResponse> installBackupClients(InstallBackupClientsRequest request);

    CompletableFuture<OpenHbrServiceResponse> openHbrService(OpenHbrServiceRequest request);

    CompletableFuture<SearchHistoricalSnapshotsResponse> searchHistoricalSnapshots(SearchHistoricalSnapshotsRequest request);

    /**
      * To stop the database again, call the StopHanaDatabaseAsync operation.
      *
     */
    CompletableFuture<StartHanaDatabaseAsyncResponse> startHanaDatabaseAsync(StartHanaDatabaseAsyncRequest request);

    /**
      * To start the database again, call the StartHanaDatabaseAsync operation.
      *
     */
    CompletableFuture<StopHanaDatabaseAsyncResponse> stopHanaDatabaseAsync(StopHanaDatabaseAsyncRequest request);

    /**
      * *   This operation creates an asynchronous job at the backend and calls Cloud Assistant to uninstall a backup client from an ECS instance.
      * *   You can call the DescribeTask operation to query the execution result of an asynchronous job.
      * *   The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 30 seconds after you call the UninstallBackupClients operation to uninstall backup clients. Then, run the next queries at an interval of 30 seconds.
      *
     */
    CompletableFuture<UninstallBackupClientsResponse> uninstallBackupClients(UninstallBackupClientsRequest request);

    /**
      * If you call this operation, the specified HBR client is uninstalled. To reinstall the HBR client, call the CreateClients operation.
      *
     */
    CompletableFuture<UninstallClientResponse> uninstallClient(UninstallClientRequest request);

    CompletableFuture<UpdateBackupPlanResponse> updateBackupPlan(UpdateBackupPlanRequest request);

    /**
      * You can call this operation to update the configurations of both the old and new HBR clients.
      *
     */
    CompletableFuture<UpdateClientSettingsResponse> updateClientSettings(UpdateClientSettingsRequest request);

    CompletableFuture<UpdateContainerClusterResponse> updateContainerCluster(UpdateContainerClusterRequest request);

    /**
      * *   A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   You can specify only one type of data source in a backup plan.
      * *   You can specify only one interval as a backup cycle in a backup plan.
      * *   Each backup plan allows you to back up data to only one backup vault.
      *
     */
    CompletableFuture<UpdateHanaBackupPlanResponse> updateHanaBackupPlan(UpdateHanaBackupPlanRequest request);

    /**
      * You can call the UpdateHanaRetentionSetting operation to update the backup retention period of a database.
      *
     */
    CompletableFuture<UpdateHanaBackupSettingResponse> updateHanaBackupSetting(UpdateHanaBackupSettingRequest request);

    CompletableFuture<UpdateHanaInstanceResponse> updateHanaInstance(UpdateHanaInstanceRequest request);

    /**
      * *   If you want to update the backup parameters of a database, you can call the UpdateHanaBackupSetting operation.
      * *   HBR deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.
      *
     */
    CompletableFuture<UpdateHanaRetentionSettingResponse> updateHanaRetentionSetting(UpdateHanaRetentionSettingRequest request);

    CompletableFuture<UpdatePolicyBindingResponse> updatePolicyBinding(UpdatePolicyBindingRequest request);

    /**
      * If you modify a backup policy, the modification takes effect on all data sources that are bound to the backup policy. Proceed with caution.
      *
     */
    CompletableFuture<UpdatePolicyV2Response> updatePolicyV2(UpdatePolicyV2Request request);

    CompletableFuture<UpdateVaultResponse> updateVault(UpdateVaultRequest request);

    /**
      * *   This operation creates an asynchronous job at the backend and calls Cloud Assistant to upgrade an HBR client that is installed on an ECS instance.
      * *   You can call the DescribeTask operation to query the execution result of an asynchronous job.
      * *   The timeout period of an asynchronous job is 15 minutes.
      *
     */
    CompletableFuture<UpgradeBackupClientsResponse> upgradeBackupClients(UpgradeBackupClientsRequest request);

    /**
      * You can call this operation to upgrade a backup client to the latest version. After the backup client is upgraded, the version of the backup client cannot be rolled back.
      *
     */
    CompletableFuture<UpgradeClientResponse> upgradeClient(UpgradeClientRequest request);

}
