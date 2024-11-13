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

    /**
     * @param request the request parameters of AddContainerCluster  AddContainerClusterRequest
     * @return AddContainerClusterResponse
     */
    CompletableFuture<AddContainerClusterResponse> addContainerCluster(AddContainerClusterRequest request);

    /**
     * @param request the request parameters of CancelBackupJob  CancelBackupJobRequest
     * @return CancelBackupJobResponse
     */
    CompletableFuture<CancelBackupJobResponse> cancelBackupJob(CancelBackupJobRequest request);

    /**
     * @param request the request parameters of CancelRestoreJob  CancelRestoreJobRequest
     * @return CancelRestoreJobResponse
     */
    CompletableFuture<CancelRestoreJobResponse> cancelRestoreJob(CancelRestoreJobRequest request);

    /**
     * <b>description</b> :
     * <p>  In the Cloud Backup console, you can use resource groups to manage resources such as backup vaults, Cloud Backup clients, and SAP HANA instances.</p>
     * <ul>
     * <li>A resource is a cloud service entity that you create on Alibaba Cloud, such as an Elastic Compute Service (ECS) instance, a backup vault, or an SAP HANA instance.</li>
     * <li>You can sort resources owned by your Alibaba Cloud account into various resource groups. Resource groups facilitate resource management among multiple projects or applications within your Alibaba Cloud account and simplify permission management.</li>
     * </ul>
     * 
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckRole  CheckRoleRequest
     * @return CheckRoleResponse
     */
    CompletableFuture<CheckRoleResponse> checkRole(CheckRoleRequest request);

    /**
     * @param request the request parameters of CreateBackupJob  CreateBackupJobRequest
     * @return CreateBackupJobResponse
     */
    CompletableFuture<CreateBackupJobResponse> createBackupJob(CreateBackupJobRequest request);

    /**
     * <b>description</b> :
     * <p>  A backup schedule defines the data source, backup policy, and other configurations. After you execute a backup schedule, a backup job is generated to record the backup progress and the backup result. If a backup job is complete, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>You can specify only one type of data source in a backup schedule.</li>
     * <li>You can specify only one interval as a backup cycle in a backup schedule.</li>
     * <li>Each backup schedule allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBackupPlan  CreateBackupPlanRequest
     * @return CreateBackupPlanResponse
     */
    CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of Cloud Backup. For more information, see <a href="https://help.aliyun.com/document_detail/89062.html">Billing methods and billable items</a>.</p>
     * 
     * @param request the request parameters of CreateClients  CreateClientsRequest
     * @return CreateClientsResponse
     */
    CompletableFuture<CreateClientsResponse> createClients(CreateClientsRequest request);

    /**
     * <b>description</b> :
     * <p>  A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>You can specify only one type of data source in a backup plan.</li>
     * <li>You can specify only one interval as a backup cycle in a backup plan.</li>
     * <li>Each backup plan allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateHanaBackupPlan  CreateHanaBackupPlanRequest
     * @return CreateHanaBackupPlanResponse
     */
    CompletableFuture<CreateHanaBackupPlanResponse> createHanaBackupPlan(CreateHanaBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>To register an SAP HANA instance, you must configure the SAP HANA connection information. After the SAP HANA instance is registered, Cloud Backup installs a backup client on the node of the SAP HANA instance.</p>
     * 
     * @param request the request parameters of CreateHanaInstance  CreateHanaInstanceRequest
     * @return CreateHanaInstanceResponse
     */
    CompletableFuture<CreateHanaInstanceResponse> createHanaInstance(CreateHanaInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>If you call this operation to restore a database, the database is restored to a specified state. Proceed with caution. For more information, see <a href="https://help.aliyun.com/document_detail/101178.html">Restore databases to an SAP HANA instance</a>.</p>
     * 
     * @param request the request parameters of CreateHanaRestore  CreateHanaRestoreRequest
     * @return CreateHanaRestoreResponse
     */
    CompletableFuture<CreateHanaRestoreResponse> createHanaRestore(CreateHanaRestoreRequest request);

    /**
     * <b>description</b> :
     * <p>  You can bind data sources to only one policy in each request.</p>
     * <ul>
     * <li>Elastic Compute Service (ECS) instances can be bound to only one policy.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePolicyBindings  CreatePolicyBindingsRequest
     * @return CreatePolicyBindingsResponse
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
     * 
     * @param request the request parameters of CreatePolicyV2  CreatePolicyV2Request
     * @return CreatePolicyV2Response
     */
    CompletableFuture<CreatePolicyV2Response> createPolicyV2(CreatePolicyV2Request request);

    /**
     * <b>description</b> :
     * <p>After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state.</p>
     * 
     * @param request the request parameters of CreateReplicationVault  CreateReplicationVaultRequest
     * @return CreateReplicationVaultResponse
     */
    CompletableFuture<CreateReplicationVaultResponse> createReplicationVault(CreateReplicationVaultRequest request);

    /**
     * <b>description</b> :
     * <p>  You must create a restore job based on the specified backup snapshot and restore destination.</p>
     * <ul>
     * <li>The type of the data source from which you restore data must be the same as the type of the restore destination.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRestoreJob  CreateRestoreJobRequest
     * @return CreateRestoreJobResponse
     */
    CompletableFuture<CreateRestoreJobResponse> createRestoreJob(CreateRestoreJobRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can directly upload a file to Object Storage Service (OSS) by using a form based on the returned value of this operation.</li>
     * <li>For more information about how to upload a file to OSS by using a form, see OSS documentation.</li>
     * <li>The system periodically deletes files that are uploaded to OSS.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateTempFileUploadUrl  CreateTempFileUploadUrlRequest
     * @return CreateTempFileUploadUrlResponse
     */
    CompletableFuture<CreateTempFileUploadUrlResponse> createTempFileUploadUrl(CreateTempFileUploadUrlRequest request);

    /**
     * <b>description</b> :
     * <p>  Each Alibaba Cloud account can create up to 100 backup vaults.</p>
     * <ul>
     * <li>After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state. A backup job can use a backup vault to store backup data only if the backup vault is in the CREATED state.
     * **
     * <strong>Note</strong> Before you call this operation, make sure that you fully understand the billing of Cloud Backup.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVault  CreateVaultRequest
     * @return CreateVaultResponse
     */
    CompletableFuture<CreateVaultResponse> createVault(CreateVaultRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot delete the active Cloud Backup clients that receive heartbeat packets within 1 hour. You can call the UninstallBackupClients operation to uninstall a Cloud Backup client. Then, the client becomes inactive.</p>
     * <ul>
     * <li>When you perform this operation, resources that are associated with the client are also deleted, including:<ul>
     * <li>Backup plans</li>
     * <li>Backup jobs</li>
     * <li>Snapshots</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBackupClient  DeleteBackupClientRequest
     * @return DeleteBackupClientResponse
     */
    CompletableFuture<DeleteBackupClientResponse> deleteBackupClient(DeleteBackupClientRequest request);

    /**
     * <b>description</b> :
     * <p>This operation deletes only the resources that are related to HBR clients. The resources include backup plans, backup jobs, and backup snapshots. The operation does not delete HBR clients.</p>
     * 
     * @param request the request parameters of DeleteBackupClientResource  DeleteBackupClientResourceRequest
     * @return DeleteBackupClientResourceResponse
     */
    CompletableFuture<DeleteBackupClientResourceResponse> deleteBackupClientResource(DeleteBackupClientResourceRequest request);

    /**
     * <b>description</b> :
     * <p>  If you delete a backup plan, the backup jobs are also deleted.</p>
     * <ul>
     * <li>If you delete a backup plan, the created snapshot files are not deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBackupPlan  DeleteBackupPlanRequest
     * @return DeleteBackupPlanResponse
     */
    CompletableFuture<DeleteBackupPlanResponse> deleteBackupPlan(DeleteBackupPlanRequest request);

    /**
     * @param request the request parameters of DeleteClient  DeleteClientRequest
     * @return DeleteClientResponse
     */
    CompletableFuture<DeleteClientResponse> deleteClient(DeleteClientRequest request);

    /**
     * @param request the request parameters of DeleteHanaBackupPlan  DeleteHanaBackupPlanRequest
     * @return DeleteHanaBackupPlanResponse
     */
    CompletableFuture<DeleteHanaBackupPlanResponse> deleteHanaBackupPlan(DeleteHanaBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>If you delete an SAP HANA instance, the existing backup data is also deleted and the running backup and restore jobs fail to be completed. Before you delete the SAP HANA instance, make sure that you no longer need the backup data of the instance and no backup or restore jobs are running for the instance. To delete an SAP HANA instance, you must specify the security identifier (SID) of the instance. The SID is three characters in length and starts with a letter. For more information, see <a href="https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?">How to find sid user and instance number of HANA db?</a></p>
     * 
     * @param request the request parameters of DeleteHanaInstance  DeleteHanaInstanceRequest
     * @return DeleteHanaInstanceResponse
     */
    CompletableFuture<DeleteHanaInstanceResponse> deleteHanaInstance(DeleteHanaInstanceRequest request);

    /**
     * @param request the request parameters of DeletePolicyBinding  DeletePolicyBindingRequest
     * @return DeletePolicyBindingResponse
     */
    CompletableFuture<DeletePolicyBindingResponse> deletePolicyBinding(DeletePolicyBindingRequest request);

    /**
     * <b>description</b> :
     * <p>If you delete a backup policy, the backup policy is disassociated with all data sources. Proceed with caution.</p>
     * 
     * @param request the request parameters of DeletePolicyV2  DeletePolicyV2Request
     * @return DeletePolicyV2Response
     */
    CompletableFuture<DeletePolicyV2Response> deletePolicyV2(DeletePolicyV2Request request);

    /**
     * <b>description</b> :
     * <p>If you delete the most recent backup snapshot for a data source, you must set the Force parameter to <code>true</code>. Otherwise, an error occurs.</p>
     * 
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteUdmDisk  DeleteUdmDiskRequest
     * @return DeleteUdmDiskResponse
     */
    CompletableFuture<DeleteUdmDiskResponse> deleteUdmDisk(DeleteUdmDiskRequest request);

    /**
     * @param request the request parameters of DeleteUdmEcsInstance  DeleteUdmEcsInstanceRequest
     * @return DeleteUdmEcsInstanceResponse
     */
    CompletableFuture<DeleteUdmEcsInstanceResponse> deleteUdmEcsInstance(DeleteUdmEcsInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot delete a backup vault within 2 hours after the backup vault is created or a backup vault that is in the INITIALIZING state.</p>
     * <ul>
     * <li>After you delete a backup vault, all resources that are associated with the backup vault are deleted. The resources include the Cloud Backup client of the old version, backup plans, backup jobs, snapshots, and restore jobs.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVault  DeleteVaultRequest
     * @return DeleteVaultResponse
     */
    CompletableFuture<DeleteVaultResponse> deleteVault(DeleteVaultRequest request);

    /**
     * @param request the request parameters of DescribeBackupClients  DescribeBackupClientsRequest
     * @return DescribeBackupClientsResponse
     */
    CompletableFuture<DescribeBackupClientsResponse> describeBackupClients(DescribeBackupClientsRequest request);

    /**
     * @param request the request parameters of DescribeBackupJobs2  DescribeBackupJobs2Request
     * @return DescribeBackupJobs2Response
     */
    CompletableFuture<DescribeBackupJobs2Response> describeBackupJobs2(DescribeBackupJobs2Request request);

    /**
     * @param request the request parameters of DescribeBackupPlans  DescribeBackupPlansRequest
     * @return DescribeBackupPlansResponse
     */
    CompletableFuture<DescribeBackupPlansResponse> describeBackupPlans(DescribeBackupPlansRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to SAP HANA backup. For Cloud Backup clients of other data sources, call the DescribeBackupClients operation.</p>
     * 
     * @param request the request parameters of DescribeClients  DescribeClientsRequest
     * @return DescribeClientsResponse
     */
    CompletableFuture<DescribeClientsResponse> describeClients(DescribeClientsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only Container Service for Kubernetes (ACK) clusters.</p>
     * 
     * @param request the request parameters of DescribeContainerCluster  DescribeContainerClusterRequest
     * @return DescribeContainerClusterResponse
     */
    CompletableFuture<DescribeContainerClusterResponse> describeContainerCluster(DescribeContainerClusterRequest request);

    /**
     * @param request the request parameters of DescribeCrossAccounts  DescribeCrossAccountsRequest
     * @return DescribeCrossAccountsResponse
     */
    CompletableFuture<DescribeCrossAccountsResponse> describeCrossAccounts(DescribeCrossAccountsRequest request);

    /**
     * @param request the request parameters of DescribeHanaBackupPlans  DescribeHanaBackupPlansRequest
     * @return DescribeHanaBackupPlansResponse
     */
    CompletableFuture<DescribeHanaBackupPlansResponse> describeHanaBackupPlans(DescribeHanaBackupPlansRequest request);

    /**
     * <b>description</b> :
     * <p>If you want to query the backup retention period of a database, you can call the DescribeHanaRetentionSetting operation.</p>
     * 
     * @param request the request parameters of DescribeHanaBackupSetting  DescribeHanaBackupSettingRequest
     * @return DescribeHanaBackupSettingResponse
     */
    CompletableFuture<DescribeHanaBackupSettingResponse> describeHanaBackupSetting(DescribeHanaBackupSettingRequest request);

    /**
     * <b>description</b> :
     * <p>After you call the DescribeHanaBackupsAsync operation to query the SAP HANA backups that meet the specified conditions, call the DescribeTask operation to query the final result.</p>
     * 
     * @param request the request parameters of DescribeHanaBackupsAsync  DescribeHanaBackupsAsyncRequest
     * @return DescribeHanaBackupsAsyncResponse
     */
    CompletableFuture<DescribeHanaBackupsAsyncResponse> describeHanaBackupsAsync(DescribeHanaBackupsAsyncRequest request);

    /**
     * <b>description</b> :
     * <p>After you register an SAP HANA instance and install a Cloud Backup client on the instance, you can call this operation to query the information about SAP HANA databases. You can call the StartHanaDatabaseAsync operation to start a database and call the StopHanaDatabaseAsync operation to stop a database.</p>
     * 
     * @param request the request parameters of DescribeHanaDatabases  DescribeHanaDatabasesRequest
     * @return DescribeHanaDatabasesResponse
     */
    CompletableFuture<DescribeHanaDatabasesResponse> describeHanaDatabases(DescribeHanaDatabasesRequest request);

    /**
     * @param request the request parameters of DescribeHanaInstances  DescribeHanaInstancesRequest
     * @return DescribeHanaInstancesResponse
     */
    CompletableFuture<DescribeHanaInstancesResponse> describeHanaInstances(DescribeHanaInstancesRequest request);

    /**
     * @param request the request parameters of DescribeHanaRestores  DescribeHanaRestoresRequest
     * @return DescribeHanaRestoresResponse
     */
    CompletableFuture<DescribeHanaRestoresResponse> describeHanaRestores(DescribeHanaRestoresRequest request);

    /**
     * <b>description</b> :
     * <p>  If you want to query the backup parameters of a database, you can call the DescribeHanaBackupSetting operation.</p>
     * <ul>
     * <li>Cloud Backup deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeHanaRetentionSetting  DescribeHanaRetentionSettingRequest
     * @return DescribeHanaRetentionSettingResponse
     */
    CompletableFuture<DescribeHanaRetentionSettingResponse> describeHanaRetentionSetting(DescribeHanaRetentionSettingRequest request);

    /**
     * @param request the request parameters of DescribeOtsTableSnapshots  DescribeOtsTableSnapshotsRequest
     * @return DescribeOtsTableSnapshotsResponse
     */
    CompletableFuture<DescribeOtsTableSnapshotsResponse> describeOtsTableSnapshots(DescribeOtsTableSnapshotsRequest request);

    /**
     * @param request the request parameters of DescribePoliciesV2  DescribePoliciesV2Request
     * @return DescribePoliciesV2Response
     */
    CompletableFuture<DescribePoliciesV2Response> describePoliciesV2(DescribePoliciesV2Request request);

    /**
     * @param request the request parameters of DescribePolicyBindings  DescribePolicyBindingsRequest
     * @return DescribePolicyBindingsResponse
     */
    CompletableFuture<DescribePolicyBindingsResponse> describePolicyBindings(DescribePolicyBindingsRequest request);

    /**
     * @param request the request parameters of DescribeRecoverableOtsInstances  DescribeRecoverableOtsInstancesRequest
     * @return DescribeRecoverableOtsInstancesResponse
     */
    CompletableFuture<DescribeRecoverableOtsInstancesResponse> describeRecoverableOtsInstances(DescribeRecoverableOtsInstancesRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRestoreJobs2  DescribeRestoreJobs2Request
     * @return DescribeRestoreJobs2Response
     */
    CompletableFuture<DescribeRestoreJobs2Response> describeRestoreJobs2(DescribeRestoreJobs2Request request);

    /**
     * @param request the request parameters of DescribeTask  DescribeTaskRequest
     * @return DescribeTaskResponse
     */
    CompletableFuture<DescribeTaskResponse> describeTask(DescribeTaskRequest request);

    /**
     * @param request the request parameters of DescribeUdmSnapshots  DescribeUdmSnapshotsRequest
     * @return DescribeUdmSnapshotsResponse
     */
    CompletableFuture<DescribeUdmSnapshotsResponse> describeUdmSnapshots(DescribeUdmSnapshotsRequest request);

    /**
     * @param request the request parameters of DescribeVaultReplicationRegions  DescribeVaultReplicationRegionsRequest
     * @return DescribeVaultReplicationRegionsResponse
     */
    CompletableFuture<DescribeVaultReplicationRegionsResponse> describeVaultReplicationRegions(DescribeVaultReplicationRegionsRequest request);

    /**
     * @param request the request parameters of DescribeVaults  DescribeVaultsRequest
     * @return DescribeVaultsResponse
     */
    CompletableFuture<DescribeVaultsResponse> describeVaults(DescribeVaultsRequest request);

    /**
     * <b>description</b> :
     * <p>  If the request is successful, the mount target is deleted.</p>
     * <ul>
     * <li>After you create a backup plan for an Apsara File Storage NAS file system, HBR automatically creates a mount target for the file system. You can call this operation to delete the mount target. In the <strong>Status</strong> column of the mount target of the NAS file system, the following information is displayed: <strong>This mount target is created by an Alibaba Cloud internal service and cannot be operated. Service name: HBR</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachNasFileSystem  DetachNasFileSystemRequest
     * @return DetachNasFileSystemResponse
     */
    CompletableFuture<DetachNasFileSystemResponse> detachNasFileSystem(DetachNasFileSystemRequest request);

    /**
     * <b>description</b> :
     * <p>After you call this operation, the backup plan is suspended. In the DescribeBackupPlans operation, the Disabled parameter is set to true.</p>
     * 
     * @param request the request parameters of DisableBackupPlan  DisableBackupPlanRequest
     * @return DisableBackupPlanResponse
     */
    CompletableFuture<DisableBackupPlanResponse> disableBackupPlan(DisableBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>To enable the backup plan again, call the EnableHanaBackupPlan operation.</p>
     * 
     * @param request the request parameters of DisableHanaBackupPlan  DisableHanaBackupPlanRequest
     * @return DisableHanaBackupPlanResponse
     */
    CompletableFuture<DisableHanaBackupPlanResponse> disableHanaBackupPlan(DisableHanaBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>After you call this operation, the backup plan is restarted (Disabled is set to false in the DescribeBackupPlans operation). Cloud Backup continues to perform backups based on the policy specified in the backup plan.</p>
     * 
     * @param request the request parameters of EnableBackupPlan  EnableBackupPlanRequest
     * @return EnableBackupPlanResponse
     */
    CompletableFuture<EnableBackupPlanResponse> enableBackupPlan(EnableBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>To disable the backup plan again, call the DisableHanaBackupPlan operation.</p>
     * 
     * @param request the request parameters of EnableHanaBackupPlan  EnableHanaBackupPlanRequest
     * @return EnableHanaBackupPlanResponse
     */
    CompletableFuture<EnableHanaBackupPlanResponse> enableHanaBackupPlan(EnableHanaBackupPlanRequest request);

    /**
     * @param request the request parameters of ExecuteBackupPlan  ExecuteBackupPlanRequest
     * @return ExecuteBackupPlanResponse
     */
    CompletableFuture<ExecuteBackupPlanResponse> executeBackupPlan(ExecuteBackupPlanRequest request);

    /**
     * @param request the request parameters of ExecutePolicyV2  ExecutePolicyV2Request
     * @return ExecutePolicyV2Response
     */
    CompletableFuture<ExecutePolicyV2Response> executePolicyV2(ExecutePolicyV2Request request);

    /**
     * @param request the request parameters of GenerateRamPolicy  GenerateRamPolicyRequest
     * @return GenerateRamPolicyResponse
     */
    CompletableFuture<GenerateRamPolicyResponse> generateRamPolicy(GenerateRamPolicyRequest request);

    /**
     * @param request the request parameters of GetTempFileDownloadLink  GetTempFileDownloadLinkRequest
     * @return GetTempFileDownloadLinkResponse
     */
    CompletableFuture<GetTempFileDownloadLinkResponse> getTempFileDownloadLink(GetTempFileDownloadLinkRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to install an HBR client on an ECS instance.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/431265.html">DescribeTask</a> operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 60 seconds after you call the InstallBackupClients operation to install HBR clients. Then, run the next queries at an interval of 30 seconds.</li>
     * </ul>
     * 
     * @param request the request parameters of InstallBackupClients  InstallBackupClientsRequest
     * @return InstallBackupClientsResponse
     */
    CompletableFuture<InstallBackupClientsResponse> installBackupClients(InstallBackupClientsRequest request);

    /**
     * @param request the request parameters of OpenHbrService  OpenHbrServiceRequest
     * @return OpenHbrServiceResponse
     */
    CompletableFuture<OpenHbrServiceResponse> openHbrService(OpenHbrServiceRequest request);

    /**
     * @param request the request parameters of SearchHistoricalSnapshots  SearchHistoricalSnapshotsRequest
     * @return SearchHistoricalSnapshotsResponse
     */
    CompletableFuture<SearchHistoricalSnapshotsResponse> searchHistoricalSnapshots(SearchHistoricalSnapshotsRequest request);

    /**
     * <b>description</b> :
     * <p>To stop the database again, call the StopHanaDatabaseAsync operation.</p>
     * 
     * @param request the request parameters of StartHanaDatabaseAsync  StartHanaDatabaseAsyncRequest
     * @return StartHanaDatabaseAsyncResponse
     */
    CompletableFuture<StartHanaDatabaseAsyncResponse> startHanaDatabaseAsync(StartHanaDatabaseAsyncRequest request);

    /**
     * <b>description</b> :
     * <p>To start the database again, call the StartHanaDatabaseAsync operation.</p>
     * 
     * @param request the request parameters of StopHanaDatabaseAsync  StopHanaDatabaseAsyncRequest
     * @return StopHanaDatabaseAsyncResponse
     */
    CompletableFuture<StopHanaDatabaseAsyncResponse> stopHanaDatabaseAsync(StopHanaDatabaseAsyncRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to uninstall a backup client from an ECS instance.</p>
     * <ul>
     * <li>You can call the DescribeTask operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 30 seconds after you call the UninstallBackupClients operation to uninstall backup clients. Then, run the next queries at an interval of 30 seconds.</li>
     * </ul>
     * 
     * @param request the request parameters of UninstallBackupClients  UninstallBackupClientsRequest
     * @return UninstallBackupClientsResponse
     */
    CompletableFuture<UninstallBackupClientsResponse> uninstallBackupClients(UninstallBackupClientsRequest request);

    /**
     * <b>description</b> :
     * <p>If you call this operation, the specified HBR client is uninstalled. To reinstall the HBR client, call the CreateClients operation.</p>
     * 
     * @param request the request parameters of UninstallClient  UninstallClientRequest
     * @return UninstallClientResponse
     */
    CompletableFuture<UninstallClientResponse> uninstallClient(UninstallClientRequest request);

    /**
     * @param request the request parameters of UpdateBackupPlan  UpdateBackupPlanRequest
     * @return UpdateBackupPlanResponse
     */
    CompletableFuture<UpdateBackupPlanResponse> updateBackupPlan(UpdateBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the configurations of both the old and new HBR clients.</p>
     * 
     * @param request the request parameters of UpdateClientSettings  UpdateClientSettingsRequest
     * @return UpdateClientSettingsResponse
     */
    CompletableFuture<UpdateClientSettingsResponse> updateClientSettings(UpdateClientSettingsRequest request);

    /**
     * @param request the request parameters of UpdateContainerCluster  UpdateContainerClusterRequest
     * @return UpdateContainerClusterResponse
     */
    CompletableFuture<UpdateContainerClusterResponse> updateContainerCluster(UpdateContainerClusterRequest request);

    /**
     * <b>description</b> :
     * <p>  A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>You can specify only one type of data source in a backup plan.</li>
     * <li>You can specify only one interval as a backup cycle in a backup plan.</li>
     * <li>Each backup plan allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateHanaBackupPlan  UpdateHanaBackupPlanRequest
     * @return UpdateHanaBackupPlanResponse
     */
    CompletableFuture<UpdateHanaBackupPlanResponse> updateHanaBackupPlan(UpdateHanaBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the UpdateHanaRetentionSetting operation to update the backup retention period of a database.</p>
     * 
     * @param request the request parameters of UpdateHanaBackupSetting  UpdateHanaBackupSettingRequest
     * @return UpdateHanaBackupSettingResponse
     */
    CompletableFuture<UpdateHanaBackupSettingResponse> updateHanaBackupSetting(UpdateHanaBackupSettingRequest request);

    /**
     * @param request the request parameters of UpdateHanaInstance  UpdateHanaInstanceRequest
     * @return UpdateHanaInstanceResponse
     */
    CompletableFuture<UpdateHanaInstanceResponse> updateHanaInstance(UpdateHanaInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  If you want to update the backup parameters of a database, you can call the UpdateHanaBackupSetting operation.</p>
     * <ul>
     * <li>Cloud Backup deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateHanaRetentionSetting  UpdateHanaRetentionSettingRequest
     * @return UpdateHanaRetentionSettingResponse
     */
    CompletableFuture<UpdateHanaRetentionSettingResponse> updateHanaRetentionSetting(UpdateHanaRetentionSettingRequest request);

    /**
     * @param request the request parameters of UpdatePolicyBinding  UpdatePolicyBindingRequest
     * @return UpdatePolicyBindingResponse
     */
    CompletableFuture<UpdatePolicyBindingResponse> updatePolicyBinding(UpdatePolicyBindingRequest request);

    /**
     * <b>description</b> :
     * <p>If you modify a backup policy, the modification takes effect on all data sources that are bound to the backup policy. Proceed with caution.</p>
     * 
     * @param request the request parameters of UpdatePolicyV2  UpdatePolicyV2Request
     * @return UpdatePolicyV2Response
     */
    CompletableFuture<UpdatePolicyV2Response> updatePolicyV2(UpdatePolicyV2Request request);

    /**
     * @param request the request parameters of UpdateVault  UpdateVaultRequest
     * @return UpdateVaultResponse
     */
    CompletableFuture<UpdateVaultResponse> updateVault(UpdateVaultRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to upgrade an HBR client that is installed on an ECS instance.</p>
     * <ul>
     * <li>You can call the DescribeTask operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes.</li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeBackupClients  UpgradeBackupClientsRequest
     * @return UpgradeBackupClientsResponse
     */
    CompletableFuture<UpgradeBackupClientsResponse> upgradeBackupClients(UpgradeBackupClientsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to upgrade a Cloud Backup client to the latest version. After the Cloud Backup client is upgraded, the version of the client cannot be rolled back.</p>
     * 
     * @param request the request parameters of UpgradeClient  UpgradeClientRequest
     * @return UpgradeClientResponse
     */
    CompletableFuture<UpgradeClientResponse> upgradeClient(UpgradeClientRequest request);

}
