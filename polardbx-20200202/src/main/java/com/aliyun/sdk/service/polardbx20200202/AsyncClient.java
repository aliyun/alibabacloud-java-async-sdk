// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.polardbx20200202.models.*;
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

    CompletableFuture<AlignStoragePrimaryAzoneResponse> alignStoragePrimaryAzone(AlignStoragePrimaryAzoneRequest request);

    CompletableFuture<AllocateColdDataVolumeResponse> allocateColdDataVolume(AllocateColdDataVolumeRequest request);

    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    CompletableFuture<CreateDBResponse> createDB(CreateDBRequest request);

    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    CompletableFuture<CreateSuperAccountResponse> createSuperAccount(CreateSuperAccountRequest request);

    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    CompletableFuture<DeleteDBResponse> deleteDB(DeleteDBRequest request);

    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    CompletableFuture<DescribeAccountListResponse> describeAccountList(DescribeAccountListRequest request);

    CompletableFuture<DescribeActiveOperationMaintainConfResponse> describeActiveOperationMaintainConf(DescribeActiveOperationMaintainConfRequest request);

    CompletableFuture<DescribeActiveOperationTaskCountResponse> describeActiveOperationTaskCount(DescribeActiveOperationTaskCountRequest request);

    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    CompletableFuture<DescribeArchiveTableListResponse> describeArchiveTableList(DescribeArchiveTableListRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupSetResponse> describeBackupSet(DescribeBackupSetRequest request);

    CompletableFuture<DescribeBackupSetListResponse> describeBackupSetList(DescribeBackupSetListRequest request);

    CompletableFuture<DescribeBinaryLogListResponse> describeBinaryLogList(DescribeBinaryLogListRequest request);

    CompletableFuture<DescribeCharacterSetResponse> describeCharacterSet(DescribeCharacterSetRequest request);

    CompletableFuture<DescribeColdDataBasicInfoResponse> describeColdDataBasicInfo(DescribeColdDataBasicInfoRequest request);

    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    CompletableFuture<DescribeDBInstanceConfigResponse> describeDBInstanceConfig(DescribeDBInstanceConfigRequest request);

    CompletableFuture<DescribeDBInstanceHAResponse> describeDBInstanceHA(DescribeDBInstanceHARequest request);

    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    CompletableFuture<DescribeDBInstanceTDEResponse> describeDBInstanceTDE(DescribeDBInstanceTDERequest request);

    CompletableFuture<DescribeDBInstanceTopologyResponse> describeDBInstanceTopology(DescribeDBInstanceTopologyRequest request);

    CompletableFuture<DescribeDBInstanceViaEndpointResponse> describeDBInstanceViaEndpoint(DescribeDBInstanceViaEndpointRequest request);

    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    CompletableFuture<DescribeDBNodePerformanceResponse> describeDBNodePerformance(DescribeDBNodePerformanceRequest request);

    CompletableFuture<DescribeDbListResponse> describeDbList(DescribeDbListRequest request);

    CompletableFuture<DescribeDistributeTableListResponse> describeDistributeTableList(DescribeDistributeTableListRequest request);

    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeScaleOutMigrateTaskListResponse> describeScaleOutMigrateTaskList(DescribeScaleOutMigrateTaskListRequest request);

    CompletableFuture<DescribeSecurityIpsResponse> describeSecurityIps(DescribeSecurityIpsRequest request);

    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

    CompletableFuture<DisableRightsSeparationResponse> disableRightsSeparation(DisableRightsSeparationRequest request);

    CompletableFuture<EnableRightsSeparationResponse> enableRightsSeparation(EnableRightsSeparationRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyAccountPrivilegeResponse> modifyAccountPrivilege(ModifyAccountPrivilegeRequest request);

    CompletableFuture<ModifyActiveOperationMaintainConfResponse> modifyActiveOperationMaintainConf(ModifyActiveOperationMaintainConfRequest request);

    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    CompletableFuture<ModifyDBInstanceClassResponse> modifyDBInstanceClass(ModifyDBInstanceClassRequest request);

    CompletableFuture<ModifyDBInstanceConfigResponse> modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request);

    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    CompletableFuture<ModifyDatabaseDescriptionResponse> modifyDatabaseDescription(ModifyDatabaseDescriptionRequest request);

    CompletableFuture<ModifyParameterResponse> modifyParameter(ModifyParameterRequest request);

    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    CompletableFuture<ReleaseColdDataVolumeResponse> releaseColdDataVolume(ReleaseColdDataVolumeRequest request);

    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    CompletableFuture<SwitchDBInstanceHAResponse> switchDBInstanceHA(SwitchDBInstanceHARequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateBackupPolicyResponse> updateBackupPolicy(UpdateBackupPolicyRequest request);

    CompletableFuture<UpdateDBInstanceSSLResponse> updateDBInstanceSSL(UpdateDBInstanceSSLRequest request);

    CompletableFuture<UpdateDBInstanceTDEResponse> updateDBInstanceTDE(UpdateDBInstanceTDERequest request);

    CompletableFuture<UpdatePolarDBXInstanceNodeResponse> updatePolarDBXInstanceNode(UpdatePolarDBXInstanceNodeRequest request);

    CompletableFuture<UpgradeDBInstanceKernelVersionResponse> upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request);

}
