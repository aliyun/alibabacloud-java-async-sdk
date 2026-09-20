// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hbase20190101.models.*;
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
     * @param request the request parameters of AddUserHdfsInfo  AddUserHdfsInfoRequest
     * @return AddUserHdfsInfoResponse
     */
    CompletableFuture<AddUserHdfsInfoResponse> addUserHdfsInfo(AddUserHdfsInfoRequest request);

    /**
     * @param request the request parameters of AllocatePublicNetworkAddress  AllocatePublicNetworkAddressRequest
     * @return AllocatePublicNetworkAddressResponse
     */
    CompletableFuture<AllocatePublicNetworkAddressResponse> allocatePublicNetworkAddress(AllocatePublicNetworkAddressRequest request);

    /**
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of CheckComponentsVersion  CheckComponentsVersionRequest
     * @return CheckComponentsVersionResponse
     */
    CompletableFuture<CheckComponentsVersionResponse> checkComponentsVersion(CheckComponentsVersionRequest request);

    /**
     * @param request the request parameters of CloseBackup  CloseBackupRequest
     * @return CloseBackupResponse
     */
    CompletableFuture<CloseBackupResponse> closeBackup(CloseBackupRequest request);

    /**
     * <b>description</b> :
     * <p>Note: This operation can be called only when payType is set to Postpaid.</p>
     * 
     * @param request the request parameters of ConvertInstance  ConvertInstanceRequest
     * @return ConvertInstanceResponse
     */
    CompletableFuture<ConvertInstanceResponse> convertInstance(ConvertInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Only ApsaraDB for HBase Performance-enhanced Edition is supported.</p>
     * 
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, this operation supports only HBaseue clusters. The EnableHBaseueBackup operation is compatible with this operation and performs automatic creation of a backup plan after a BDS cluster is created.</p>
     * 
     * @param request the request parameters of CreateBackupPlan  CreateBackupPlanRequest
     * @return CreateBackupPlanResponse
     */
    CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request);

    /**
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * @param request the request parameters of CreateGlobalResource  CreateGlobalResourceRequest
     * @return CreateGlobalResourceResponse
     */
    CompletableFuture<CreateGlobalResourceResponse> createGlobalResource(CreateGlobalResourceRequest request);

    /**
     * @param request the request parameters of CreateHBaseSlbServer  CreateHBaseSlbServerRequest
     * @return CreateHBaseSlbServerResponse
     */
    CompletableFuture<CreateHBaseSlbServerResponse> createHBaseSlbServer(CreateHBaseSlbServerRequest request);

    /**
     * @param request the request parameters of CreateHbaseHaSlb  CreateHbaseHaSlbRequest
     * @return CreateHbaseHaSlbResponse
     */
    CompletableFuture<CreateHbaseHaSlbResponse> createHbaseHaSlb(CreateHbaseHaSlbRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, only version 2.0 of the HBaseue engine is supported.</p>
     * 
     * @param request the request parameters of CreateMultiZoneCluster  CreateMultiZoneClusterRequest
     * @return CreateMultiZoneClusterResponse
     */
    CompletableFuture<CreateMultiZoneClusterResponse> createMultiZoneCluster(CreateMultiZoneClusterRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the backup and restore feature is enabled for the ApsaraDB for HBase Performance-enhanced Edition cluster and that the target ApsaraDB for HBase Performance-enhanced Edition cluster is associated with the corresponding BDS.</p>
     * 
     * @param request the request parameters of CreateRestorePlan  CreateRestorePlanRequest
     * @return CreateRestorePlanResponse
     */
    CompletableFuture<CreateRestorePlanResponse> createRestorePlan(CreateRestorePlanRequest request);

    /**
     * @param request the request parameters of CreateServerlessCluster  CreateServerlessClusterRequest
     * @return CreateServerlessClusterResponse
     */
    CompletableFuture<CreateServerlessClusterResponse> createServerlessCluster(CreateServerlessClusterRequest request);

    /**
     * <b>description</b> :
     * <p>Only supported for HBase Enhanced Edition (HBaseue).</p>
     * 
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * @param request the request parameters of DeleteGlobalResource  DeleteGlobalResourceRequest
     * @return DeleteGlobalResourceResponse
     */
    CompletableFuture<DeleteGlobalResourceResponse> deleteGlobalResource(DeleteGlobalResourceRequest request);

    /**
     * @param request the request parameters of DeleteHBaseHaDB  DeleteHBaseHaDBRequest
     * @return DeleteHBaseHaDBResponse
     */
    CompletableFuture<DeleteHBaseHaDBResponse> deleteHBaseHaDB(DeleteHBaseHaDBRequest request);

    /**
     * @param request the request parameters of DeleteHBaseSlbServer  DeleteHBaseSlbServerRequest
     * @return DeleteHBaseSlbServerResponse
     */
    CompletableFuture<DeleteHBaseSlbServerResponse> deleteHBaseSlbServer(DeleteHBaseSlbServerRequest request);

    /**
     * @param request the request parameters of DeleteHbaseHaSlb  DeleteHbaseHaSlbRequest
     * @return DeleteHbaseHaSlbResponse
     */
    CompletableFuture<DeleteHbaseHaSlbResponse> deleteHbaseHaSlb(DeleteHbaseHaSlbRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, the instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance status is <strong>Running</strong>.</li>
     * <li>The billing method of the instance is <strong>pay-as-you-go</strong>.<blockquote>
     * <p>Subscription instances cannot be deleted by calling this operation. They are automatically released upon expiration. To release a subscription instance in advance, submit a ticket.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteMultiZoneCluster  DeleteMultiZoneClusterRequest
     * @return DeleteMultiZoneClusterResponse
     */
    CompletableFuture<DeleteMultiZoneClusterResponse> deleteMultiZoneCluster(DeleteMultiZoneClusterRequest request);

    /**
     * @param request the request parameters of DeleteServerlessCluster  DeleteServerlessClusterRequest
     * @return DeleteServerlessClusterResponse
     */
    CompletableFuture<DeleteServerlessClusterResponse> deleteServerlessCluster(DeleteServerlessClusterRequest request);

    /**
     * @param request the request parameters of DeleteUserHdfsInfo  DeleteUserHdfsInfoRequest
     * @return DeleteUserHdfsInfoResponse
     */
    CompletableFuture<DeleteUserHdfsInfoResponse> deleteUserHdfsInfo(DeleteUserHdfsInfoRequest request);

    /**
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTaskType  DescribeActiveOperationTaskTypeRequest
     * @return DescribeActiveOperationTaskTypeResponse
     */
    CompletableFuture<DescribeActiveOperationTaskTypeResponse> describeActiveOperationTaskType(DescribeActiveOperationTaskTypeRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTasks  DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation currently supports only HBaseue. Before calling this operation, make sure that the backup and recovery feature is enabled for the HBaseue instance.</p>
     * 
     * @param request the request parameters of DescribeBackupPlanConfig  DescribeBackupPlanConfigRequest
     * @return DescribeBackupPlanConfigResponse
     */
    CompletableFuture<DescribeBackupPlanConfigResponse> describeBackupPlanConfig(DescribeBackupPlanConfigRequest request);

    /**
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * @param request the request parameters of DescribeBackupStatus  DescribeBackupStatusRequest
     * @return DescribeBackupStatusResponse
     */
    CompletableFuture<DescribeBackupStatusResponse> describeBackupStatus(DescribeBackupStatusRequest request);

    /**
     * <b>description</b> :
     * <p>The backup and restore feature of the HBase Enhanced Edition instance is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/145767.html">Enable backup and restore</a>.</p>
     * 
     * @param request the request parameters of DescribeBackupSummary  DescribeBackupSummaryRequest
     * @return DescribeBackupSummaryResponse
     */
    CompletableFuture<DescribeBackupSummaryResponse> describeBackupSummary(DescribeBackupSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the backup and recovery feature is enabled for the HBaseue cluster and that backup records exist. You can call the DescribeBackupSummary operation to obtain backup records.</p>
     * 
     * @param request the request parameters of DescribeBackupTables  DescribeBackupTablesRequest
     * @return DescribeBackupTablesResponse
     */
    CompletableFuture<DescribeBackupTablesResponse> describeBackupTables(DescribeBackupTablesRequest request);

    /**
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * @param request the request parameters of DescribeClusterConnection  DescribeClusterConnectionRequest
     * @return DescribeClusterConnectionResponse
     */
    CompletableFuture<DescribeClusterConnectionResponse> describeClusterConnection(DescribeClusterConnectionRequest request);

    /**
     * @param request the request parameters of DescribeColdStorage  DescribeColdStorageRequest
     * @return DescribeColdStorageResponse
     */
    CompletableFuture<DescribeColdStorageResponse> describeColdStorage(DescribeColdStorageRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceUsage  DescribeDBInstanceUsageRequest
     * @return DescribeDBInstanceUsageResponse
     */
    CompletableFuture<DescribeDBInstanceUsageResponse> describeDBInstanceUsage(DescribeDBInstanceUsageRequest request);

    /**
     * <b>description</b> :
     * <p>By default, cluster resources are fully cleaned up 7 days after deletion. If you have called the PurgeInstance operation or set ImmediateDeleteFlag to true when calling the delete operation, the resources have already been fully cleaned up.</p>
     * 
     * @param request the request parameters of DescribeDeletedInstances  DescribeDeletedInstancesRequest
     * @return DescribeDeletedInstancesResponse
     */
    CompletableFuture<DescribeDeletedInstancesResponse> describeDeletedInstances(DescribeDeletedInstancesRequest request);

    /**
     * @param request the request parameters of DescribeDiskWarningLine  DescribeDiskWarningLineRequest
     * @return DescribeDiskWarningLineResponse
     */
    CompletableFuture<DescribeDiskWarningLineResponse> describeDiskWarningLine(DescribeDiskWarningLineRequest request);

    /**
     * @param request the request parameters of DescribeEndpoints  DescribeEndpointsRequest
     * @return DescribeEndpointsResponse
     */
    CompletableFuture<DescribeEndpointsResponse> describeEndpoints(DescribeEndpointsRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>The complete specification mapping table is based on the list returned by this operation.
     * If the response returns an &quot;instanceType is not found&quot; error, the specification has been deprecated. If you have a strong dependency on this specification, contact the Alibaba Cloud HBase management team.</p>
     * 
     * @param request the request parameters of DescribeInstanceType  DescribeInstanceTypeRequest
     * @return DescribeInstanceTypeResponse
     */
    CompletableFuture<DescribeInstanceTypeResponse> describeInstanceType(DescribeInstanceTypeRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of DescribeIpWhitelist  DescribeIpWhitelistRequest
     * @return DescribeIpWhitelistResponse
     */
    CompletableFuture<DescribeIpWhitelistResponse> describeIpWhitelist(DescribeIpWhitelistRequest request);

    /**
     * @param request the request parameters of DescribeMultiZoneAvailableRegions  DescribeMultiZoneAvailableRegionsRequest
     * @return DescribeMultiZoneAvailableRegionsResponse
     */
    CompletableFuture<DescribeMultiZoneAvailableRegionsResponse> describeMultiZoneAvailableRegions(DescribeMultiZoneAvailableRegionsRequest request);

    /**
     * @param request the request parameters of DescribeMultiZoneAvailableResource  DescribeMultiZoneAvailableResourceRequest
     * @return DescribeMultiZoneAvailableResourceResponse
     */
    CompletableFuture<DescribeMultiZoneAvailableResourceResponse> describeMultiZoneAvailableResource(DescribeMultiZoneAvailableResourceRequest request);

    /**
     * @param request the request parameters of DescribeMultiZoneCluster  DescribeMultiZoneClusterRequest
     * @return DescribeMultiZoneClusterResponse
     */
    CompletableFuture<DescribeMultiZoneClusterResponse> describeMultiZoneCluster(DescribeMultiZoneClusterRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the backup and recovery feature is enabled for the HBaseue cluster.</p>
     * 
     * @param request the request parameters of DescribeRecoverableTimeRange  DescribeRecoverableTimeRangeRequest
     * @return DescribeRecoverableTimeRangeResponse
     */
    CompletableFuture<DescribeRecoverableTimeRangeResponse> describeRecoverableTimeRange(DescribeRecoverableTimeRangeRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the backup and recovery feature is enabled for the HBaseue cluster and that restoration records exist. You can call DescribeRestoreSummary to obtain restoration records.</p>
     * 
     * @param request the request parameters of DescribeRestoreFullDetails  DescribeRestoreFullDetailsRequest
     * @return DescribeRestoreFullDetailsResponse
     */
    CompletableFuture<DescribeRestoreFullDetailsResponse> describeRestoreFullDetails(DescribeRestoreFullDetailsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the backup and recovery feature is enabled for the HBaseue cluster and that restoration records exist. You can call the DescribeRestoreSummary operation to obtain restoration records.</p>
     * 
     * @param request the request parameters of DescribeRestoreIncrDetail  DescribeRestoreIncrDetailRequest
     * @return DescribeRestoreIncrDetailResponse
     */
    CompletableFuture<DescribeRestoreIncrDetailResponse> describeRestoreIncrDetail(DescribeRestoreIncrDetailRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the backup and recovery feature is enabled for the HBaseue cluster and that restoration records exist.</p>
     * 
     * @param request the request parameters of DescribeRestoreSchemaDetails  DescribeRestoreSchemaDetailsRequest
     * @return DescribeRestoreSchemaDetailsResponse
     */
    CompletableFuture<DescribeRestoreSchemaDetailsResponse> describeRestoreSchemaDetails(DescribeRestoreSchemaDetailsRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that backup and recovery is enabled for the HBaseue cluster.</p>
     * 
     * @param request the request parameters of DescribeRestoreSummary  DescribeRestoreSummaryRequest
     * @return DescribeRestoreSummaryResponse
     */
    CompletableFuture<DescribeRestoreSummaryResponse> describeRestoreSummary(DescribeRestoreSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the backup and recovery feature is enabled for the HBaseue cluster and that restore records exist. You can call DescribeRestoreSummary to obtain restore records.</p>
     * 
     * @param request the request parameters of DescribeRestoreTables  DescribeRestoreTablesRequest
     * @return DescribeRestoreTablesResponse
     */
    CompletableFuture<DescribeRestoreTablesResponse> describeRestoreTables(DescribeRestoreTablesRequest request);

    /**
     * @param request the request parameters of DescribeSecurityGroups  DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     */
    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    /**
     * @param request the request parameters of DescribeServerlessCluster  DescribeServerlessClusterRequest
     * @return DescribeServerlessClusterResponse
     */
    CompletableFuture<DescribeServerlessClusterResponse> describeServerlessCluster(DescribeServerlessClusterRequest request);

    /**
     * @param request the request parameters of DescribeSubDomain  DescribeSubDomainRequest
     * @return DescribeSubDomainResponse
     */
    CompletableFuture<DescribeSubDomainResponse> describeSubDomain(DescribeSubDomainRequest request);

    /**
     * @param request the request parameters of EnableHBaseueBackup  EnableHBaseueBackupRequest
     * @return EnableHBaseueBackupResponse
     */
    CompletableFuture<EnableHBaseueBackupResponse> enableHBaseueBackup(EnableHBaseueBackupRequest request);

    /**
     * @param request the request parameters of EnableHBaseueModule  EnableHBaseueModuleRequest
     * @return EnableHBaseueModuleResponse
     */
    CompletableFuture<EnableHBaseueModuleResponse> enableHBaseueModule(EnableHBaseueModuleRequest request);

    /**
     * @param request the request parameters of EvaluateMultiZoneResource  EvaluateMultiZoneResourceRequest
     * @return EvaluateMultiZoneResourceResponse
     */
    CompletableFuture<EvaluateMultiZoneResourceResponse> evaluateMultiZoneResource(EvaluateMultiZoneResourceRequest request);

    /**
     * <b>description</b> :
     * <p>CloudMonitor has been migrated. This operation is no longer in use. Access monitoring from the Monitoring and Alerts page in cluster management.</p>
     * 
     * @param request the request parameters of GetMultimodeCmsUrl  GetMultimodeCmsUrlRequest
     * @return GetMultimodeCmsUrlResponse
     */
    CompletableFuture<GetMultimodeCmsUrlResponse> getMultimodeCmsUrl(GetMultimodeCmsUrlRequest request);

    /**
     * @param request the request parameters of Grant  GrantRequest
     * @return GrantResponse
     */
    CompletableFuture<GrantResponse> grant(GrantRequest request);

    /**
     * @param request the request parameters of ListHBaseInstances  ListHBaseInstancesRequest
     * @return ListHBaseInstancesResponse
     */
    CompletableFuture<ListHBaseInstancesResponse> listHBaseInstances(ListHBaseInstancesRequest request);

    /**
     * @param request the request parameters of ListInstanceServiceConfigHistories  ListInstanceServiceConfigHistoriesRequest
     * @return ListInstanceServiceConfigHistoriesResponse
     */
    CompletableFuture<ListInstanceServiceConfigHistoriesResponse> listInstanceServiceConfigHistories(ListInstanceServiceConfigHistoriesRequest request);

    /**
     * @param request the request parameters of ListInstanceServiceConfigurations  ListInstanceServiceConfigurationsRequest
     * @return ListInstanceServiceConfigurationsResponse
     */
    CompletableFuture<ListInstanceServiceConfigurationsResponse> listInstanceServiceConfigurations(ListInstanceServiceConfigurationsRequest request);

    /**
     * <b>description</b> :
     * <p>You must specify at least one of the ResourceId and Tag parameters. Otherwise, an error is returned.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTags  ListTagsRequest
     * @return ListTagsResponse
     */
    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    /**
     * @param request the request parameters of ModifyAccountPassword  ModifyAccountPasswordRequest
     * @return ModifyAccountPasswordResponse
     */
    CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request);

    /**
     * <b>description</b> :
     * <p>In addition to notifications sent by text message, phone call, email, or internal message, O&amp;M events of ApsaraDB for HBase (such as minor engine version updates) are also displayed in the console. In addition to calling this operation to modify the scheduled switchover time, you can also modify it in the console. For more information, see <a href="https://help.aliyun.com/document_detail/405057.html">Query or manage pending events</a>.</p>
     * 
     * @param request the request parameters of ModifyActiveOperationTasks  ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the backup and recovery feature is enabled for the HBaseue cluster.</p>
     * 
     * @param request the request parameters of ModifyBackupPlanConfig  ModifyBackupPlanConfigRequest
     * @return ModifyBackupPlanConfigResponse
     */
    CompletableFuture<ModifyBackupPlanConfigResponse> modifyBackupPlanConfig(ModifyBackupPlanConfigRequest request);

    /**
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyClusterDeletionProtection  ModifyClusterDeletionProtectionRequest
     * @return ModifyClusterDeletionProtectionResponse
     */
    CompletableFuture<ModifyClusterDeletionProtectionResponse> modifyClusterDeletionProtection(ModifyClusterDeletionProtectionRequest request);

    /**
     * @param request the request parameters of ModifyDiskWarningLine  ModifyDiskWarningLineRequest
     * @return ModifyDiskWarningLineResponse
     */
    CompletableFuture<ModifyDiskWarningLineResponse> modifyDiskWarningLine(ModifyDiskWarningLineRequest request);

    /**
     * @param request the request parameters of ModifyInstanceMaintainTime  ModifyInstanceMaintainTimeRequest
     * @return ModifyInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    /**
     * @param request the request parameters of ModifyInstanceName  ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     */
    CompletableFuture<ModifyInstanceNameResponse> modifyInstanceName(ModifyInstanceNameRequest request);

    /**
     * @param request the request parameters of ModifyInstanceServiceConfig  ModifyInstanceServiceConfigRequest
     * @return ModifyInstanceServiceConfigResponse
     */
    CompletableFuture<ModifyInstanceServiceConfigResponse> modifyInstanceServiceConfig(ModifyInstanceServiceConfigRequest request);

    /**
     * @param request the request parameters of ModifyInstanceType  ModifyInstanceTypeRequest
     * @return ModifyInstanceTypeResponse
     */
    CompletableFuture<ModifyInstanceTypeResponse> modifyInstanceType(ModifyInstanceTypeRequest request);

    /**
     * @param request the request parameters of ModifyIpWhitelist  ModifyIpWhitelistRequest
     * @return ModifyIpWhitelistResponse
     */
    CompletableFuture<ModifyIpWhitelistResponse> modifyIpWhitelist(ModifyIpWhitelistRequest request);

    /**
     * @param request the request parameters of ModifyMultiZoneClusterNodeType  ModifyMultiZoneClusterNodeTypeRequest
     * @return ModifyMultiZoneClusterNodeTypeResponse
     */
    CompletableFuture<ModifyMultiZoneClusterNodeTypeResponse> modifyMultiZoneClusterNodeType(ModifyMultiZoneClusterNodeTypeRequest request);

    /**
     * @param request the request parameters of ModifySecurityGroups  ModifySecurityGroupsRequest
     * @return ModifySecurityGroupsResponse
     */
    CompletableFuture<ModifySecurityGroupsResponse> modifySecurityGroups(ModifySecurityGroupsRequest request);

    /**
     * @param request the request parameters of ModifyUIAccountPassword  ModifyUIAccountPasswordRequest
     * @return ModifyUIAccountPasswordResponse
     */
    CompletableFuture<ModifyUIAccountPasswordResponse> modifyUIAccountPassword(ModifyUIAccountPasswordRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * @param request the request parameters of OpenBackup  OpenBackupRequest
     * @return OpenBackupResponse
     */
    CompletableFuture<OpenBackupResponse> openBackup(OpenBackupRequest request);

    /**
     * @param request the request parameters of PurgeInstance  PurgeInstanceRequest
     * @return PurgeInstanceResponse
     */
    CompletableFuture<PurgeInstanceResponse> purgeInstance(PurgeInstanceRequest request);

    /**
     * @param request the request parameters of QueryHBaseHaDB  QueryHBaseHaDBRequest
     * @return QueryHBaseHaDBResponse
     */
    CompletableFuture<QueryHBaseHaDBResponse> queryHBaseHaDB(QueryHBaseHaDBRequest request);

    /**
     * @param request the request parameters of QueryXpackRelateDB  QueryXpackRelateDBRequest
     * @return QueryXpackRelateDBResponse
     */
    CompletableFuture<QueryXpackRelateDBResponse> queryXpackRelateDB(QueryXpackRelateDBRequest request);

    /**
     * @param request the request parameters of RelateDbForHBaseHa  RelateDbForHBaseHaRequest
     * @return RelateDbForHBaseHaResponse
     */
    CompletableFuture<RelateDbForHBaseHaResponse> relateDbForHBaseHa(RelateDbForHBaseHaRequest request);

    /**
     * @param request the request parameters of ReleasePublicNetworkAddress  ReleasePublicNetworkAddressRequest
     * @return ReleasePublicNetworkAddressResponse
     */
    CompletableFuture<ReleasePublicNetworkAddressResponse> releasePublicNetworkAddress(ReleasePublicNetworkAddressRequest request);

    /**
     * <b>description</b> :
     * <p>This operation applies only to subscription HBase instances.</p>
     * 
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * @param request the request parameters of ResizeColdStorageSize  ResizeColdStorageSizeRequest
     * @return ResizeColdStorageSizeResponse
     */
    CompletableFuture<ResizeColdStorageSizeResponse> resizeColdStorageSize(ResizeColdStorageSizeRequest request);

    /**
     * @param request the request parameters of ResizeDiskSize  ResizeDiskSizeRequest
     * @return ResizeDiskSizeResponse
     */
    CompletableFuture<ResizeDiskSizeResponse> resizeDiskSize(ResizeDiskSizeRequest request);

    /**
     * @param request the request parameters of ResizeMultiZoneClusterDiskSize  ResizeMultiZoneClusterDiskSizeRequest
     * @return ResizeMultiZoneClusterDiskSizeResponse
     */
    CompletableFuture<ResizeMultiZoneClusterDiskSizeResponse> resizeMultiZoneClusterDiskSize(ResizeMultiZoneClusterDiskSizeRequest request);

    /**
     * @param request the request parameters of ResizeMultiZoneClusterNodeCount  ResizeMultiZoneClusterNodeCountRequest
     * @return ResizeMultiZoneClusterNodeCountResponse
     */
    CompletableFuture<ResizeMultiZoneClusterNodeCountResponse> resizeMultiZoneClusterNodeCount(ResizeMultiZoneClusterNodeCountRequest request);

    /**
     * <b>description</b> :
     * <p>Scales up the number of core nodes in a cluster. You can add up to 50 nodes at a time, and the total number of nodes can be scaled up to 250. If you have additional requirements, submit a ticket.</p>
     * 
     * @param request the request parameters of ResizeNodeCount  ResizeNodeCountRequest
     * @return ResizeNodeCountResponse
     */
    CompletableFuture<ResizeNodeCountResponse> resizeNodeCount(ResizeNodeCountRequest request);

    /**
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * @param request the request parameters of Revoke  RevokeRequest
     * @return RevokeResponse
     */
    CompletableFuture<RevokeResponse> revoke(RevokeRequest request);

    /**
     * @param request the request parameters of SwitchHbaseHaSlb  SwitchHbaseHaSlbRequest
     * @return SwitchHbaseHaSlbResponse
     */
    CompletableFuture<SwitchHbaseHaSlbResponse> switchHbaseHaSlb(SwitchHbaseHaSlbRequest request);

    /**
     * <b>description</b> :
     * <p>Extension service<br>For example: the Lindorm service compatible with the HBaseProxy protocol.</p>
     * 
     * @param request the request parameters of SwitchService  SwitchServiceRequest
     * @return SwitchServiceResponse
     */
    CompletableFuture<SwitchServiceResponse> switchService(SwitchServiceRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnTagResources  UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    /**
     * @param request the request parameters of UpgradeMinorVersion  UpgradeMinorVersionRequest
     * @return UpgradeMinorVersionResponse
     */
    CompletableFuture<UpgradeMinorVersionResponse> upgradeMinorVersion(UpgradeMinorVersionRequest request);

    /**
     * @param request the request parameters of UpgradeMultiZoneCluster  UpgradeMultiZoneClusterRequest
     * @return UpgradeMultiZoneClusterResponse
     */
    CompletableFuture<UpgradeMultiZoneClusterResponse> upgradeMultiZoneCluster(UpgradeMultiZoneClusterRequest request);

    /**
     * @param request the request parameters of XpackRelateDB  XpackRelateDBRequest
     * @return XpackRelateDBResponse
     */
    CompletableFuture<XpackRelateDBResponse> xpackRelateDB(XpackRelateDBRequest request);

}
