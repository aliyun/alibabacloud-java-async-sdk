// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.r_kvstore20150101.models.*;
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

    CompletableFuture<AddShardingNodeResponse> addShardingNode(AddShardingNodeRequest request);

    CompletableFuture<AllocateDirectConnectionResponse> allocateDirectConnection(AllocateDirectConnectionRequest request);

    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    CompletableFuture<CreateCacheAnalysisTaskResponse> createCacheAnalysisTask(CreateCacheAnalysisTaskRequest request);

    CompletableFuture<CreateGlobalDistributeCacheResponse> createGlobalDistributeCache(CreateGlobalDistributeCacheRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateInstancesResponse> createInstances(CreateInstancesRequest request);

    CompletableFuture<CreateTairInstanceResponse> createTairInstance(CreateTairInstanceRequest request);

    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteShardingNodeResponse> deleteShardingNode(DeleteShardingNodeRequest request);

    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeActiveOperationTaskResponse> describeActiveOperationTask(DescribeActiveOperationTaskRequest request);

    CompletableFuture<DescribeAuditLogConfigResponse> describeAuditLogConfig(DescribeAuditLogConfigRequest request);

    CompletableFuture<DescribeAuditRecordsResponse> describeAuditRecords(DescribeAuditRecordsRequest request);

    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupTasksResponse> describeBackupTasks(DescribeBackupTasksRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    CompletableFuture<DescribeCacheAnalysisReportResponse> describeCacheAnalysisReport(DescribeCacheAnalysisReportRequest request);

    CompletableFuture<DescribeCacheAnalysisReportListResponse> describeCacheAnalysisReportList(DescribeCacheAnalysisReportListRequest request);

    CompletableFuture<DescribeClusterMemberInfoResponse> describeClusterMemberInfo(DescribeClusterMemberInfoRequest request);

    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    CompletableFuture<DescribeDedicatedClusterInstanceListResponse> describeDedicatedClusterInstanceList(DescribeDedicatedClusterInstanceListRequest request);

    CompletableFuture<DescribeEncryptionKeyResponse> describeEncryptionKey(DescribeEncryptionKeyRequest request);

    CompletableFuture<DescribeEncryptionKeyListResponse> describeEncryptionKeyList(DescribeEncryptionKeyListRequest request);

    CompletableFuture<DescribeEngineVersionResponse> describeEngineVersion(DescribeEngineVersionRequest request);

    CompletableFuture<DescribeGlobalDistributeCacheResponse> describeGlobalDistributeCache(DescribeGlobalDistributeCacheRequest request);

    CompletableFuture<DescribeHistoryMonitorValuesResponse> describeHistoryMonitorValues(DescribeHistoryMonitorValuesRequest request);

    CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request);

    CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request);

    CompletableFuture<DescribeInstanceConfigResponse> describeInstanceConfig(DescribeInstanceConfigRequest request);

    CompletableFuture<DescribeInstanceSSLResponse> describeInstanceSSL(DescribeInstanceSSLRequest request);

    CompletableFuture<DescribeInstanceTDEStatusResponse> describeInstanceTDEStatus(DescribeInstanceTDEStatusRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeInstancesOverviewResponse> describeInstancesOverview(DescribeInstancesOverviewRequest request);

    CompletableFuture<DescribeIntranetAttributeResponse> describeIntranetAttribute(DescribeIntranetAttributeRequest request);

    CompletableFuture<DescribeLogicInstanceTopologyResponse> describeLogicInstanceTopology(DescribeLogicInstanceTopologyRequest request);

    CompletableFuture<DescribeMonitorItemsResponse> describeMonitorItems(DescribeMonitorItemsRequest request);

    CompletableFuture<DescribeParameterModificationHistoryResponse> describeParameterModificationHistory(DescribeParameterModificationHistoryRequest request);

    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRoleZoneInfoResponse> describeRoleZoneInfo(DescribeRoleZoneInfoRequest request);

    CompletableFuture<DescribeRunningLogRecordsResponse> describeRunningLogRecords(DescribeRunningLogRecordsRequest request);

    CompletableFuture<DescribeSecurityGroupConfigurationResponse> describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request);

    CompletableFuture<DescribeSecurityIpsResponse> describeSecurityIps(DescribeSecurityIpsRequest request);

    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<EnableAdditionalBandwidthResponse> enableAdditionalBandwidth(EnableAdditionalBandwidthRequest request);

    CompletableFuture<FlushExpireKeysResponse> flushExpireKeys(FlushExpireKeysRequest request);

    CompletableFuture<FlushInstanceResponse> flushInstance(FlushInstanceRequest request);

    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    CompletableFuture<InitializeKvstorePermissionResponse> initializeKvstorePermission(InitializeKvstorePermissionRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request);

    CompletableFuture<ModifyActiveOperationTaskResponse> modifyActiveOperationTask(ModifyActiveOperationTaskRequest request);

    CompletableFuture<ModifyAuditLogConfigResponse> modifyAuditLogConfig(ModifyAuditLogConfigRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request);

    CompletableFuture<ModifyInstanceConfigResponse> modifyInstanceConfig(ModifyInstanceConfigRequest request);

    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    CompletableFuture<ModifyInstanceMajorVersionResponse> modifyInstanceMajorVersion(ModifyInstanceMajorVersionRequest request);

    CompletableFuture<ModifyInstanceMinorVersionResponse> modifyInstanceMinorVersion(ModifyInstanceMinorVersionRequest request);

    CompletableFuture<ModifyInstanceNetExpireTimeResponse> modifyInstanceNetExpireTime(ModifyInstanceNetExpireTimeRequest request);

    CompletableFuture<ModifyInstanceSSLResponse> modifyInstanceSSL(ModifyInstanceSSLRequest request);

    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    CompletableFuture<ModifyInstanceTDEResponse> modifyInstanceTDE(ModifyInstanceTDERequest request);

    CompletableFuture<ModifyInstanceVpcAuthModeResponse> modifyInstanceVpcAuthMode(ModifyInstanceVpcAuthModeRequest request);

    CompletableFuture<ModifyIntranetAttributeResponse> modifyIntranetAttribute(ModifyIntranetAttributeRequest request);

    CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request);

    CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request);

    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    CompletableFuture<ReleaseDirectConnectionResponse> releaseDirectConnection(ReleaseDirectConnectionRequest request);

    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    CompletableFuture<RemoveSubInstanceResponse> removeSubInstance(RemoveSubInstanceRequest request);

    CompletableFuture<RenewAdditionalBandwidthResponse> renewAdditionalBandwidth(RenewAdditionalBandwidthRequest request);

    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    CompletableFuture<RestoreInstanceResponse> restoreInstance(RestoreInstanceRequest request);

    CompletableFuture<SwitchInstanceHAResponse> switchInstanceHA(SwitchInstanceHARequest request);

    CompletableFuture<SwitchInstanceProxyResponse> switchInstanceProxy(SwitchInstanceProxyRequest request);

    CompletableFuture<SwitchNetworkResponse> switchNetwork(SwitchNetworkRequest request);

    CompletableFuture<SyncDtsStatusResponse> syncDtsStatus(SyncDtsStatusRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<TransformInstanceChargeTypeResponse> transformInstanceChargeType(TransformInstanceChargeTypeRequest request);

    CompletableFuture<TransformToPrePaidResponse> transformToPrePaid(TransformToPrePaidRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
