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

    /**
     * @param request the request parameters of AlignStoragePrimaryAzone  AlignStoragePrimaryAzoneRequest
     * @return AlignStoragePrimaryAzoneResponse
     */
    CompletableFuture<AlignStoragePrimaryAzoneResponse> alignStoragePrimaryAzone(AlignStoragePrimaryAzoneRequest request);

    /**
     * @param request the request parameters of AllocateColdDataVolume  AllocateColdDataVolumeRequest
     * @return AllocateColdDataVolumeResponse
     */
    CompletableFuture<AllocateColdDataVolumeResponse> allocateColdDataVolume(AllocateColdDataVolumeRequest request);

    /**
     * @param request the request parameters of AllocateInstancePublicConnection  AllocateInstancePublicConnectionRequest
     * @return AllocateInstancePublicConnectionResponse
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    /**
     * @param request the request parameters of AttachColumnarInstance  AttachColumnarInstanceRequest
     * @return AttachColumnarInstanceResponse
     */
    CompletableFuture<AttachColumnarInstanceResponse> attachColumnarInstance(AttachColumnarInstanceRequest request);

    /**
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckCloudResourceAuthorized  CheckCloudResourceAuthorizedRequest
     * @return CheckCloudResourceAuthorizedResponse
     */
    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
     * @param request the request parameters of CheckSqlAuditSlsStatus  CheckSqlAuditSlsStatusRequest
     * @return CheckSqlAuditSlsStatusResponse
     */
    CompletableFuture<CheckSqlAuditSlsStatusResponse> checkSqlAuditSlsStatus(CheckSqlAuditSlsStatusRequest request);

    /**
     * @param request the request parameters of CloseEngineMigration  CloseEngineMigrationRequest
     * @return CloseEngineMigrationResponse
     */
    CompletableFuture<CloseEngineMigrationResponse> closeEngineMigration(CloseEngineMigrationRequest request);

    /**
     * @param request the request parameters of ConfirmNoConnection  ConfirmNoConnectionRequest
     * @return ConfirmNoConnectionResponse
     */
    CompletableFuture<ConfirmNoConnectionResponse> confirmNoConnection(ConfirmNoConnectionRequest request);

    /**
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * @param request the request parameters of CreateBackup  CreateBackupRequest
     * @return CreateBackupResponse
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
     * @param request the request parameters of CreateCustomEndpoint  CreateCustomEndpointRequest
     * @return CreateCustomEndpointResponse
     */
    CompletableFuture<CreateCustomEndpointResponse> createCustomEndpoint(CreateCustomEndpointRequest request);

    /**
     * @param request the request parameters of CreateDB  CreateDBRequest
     * @return CreateDBResponse
     */
    CompletableFuture<CreateDBResponse> createDB(CreateDBRequest request);

    /**
     * @param request the request parameters of CreateDBInstance  CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
     * @param request the request parameters of CreateDataImportTask  CreateDataImportTaskRequest
     * @return CreateDataImportTaskResponse
     */
    CompletableFuture<CreateDataImportTaskResponse> createDataImportTask(CreateDataImportTaskRequest request);

    /**
     * @param request the request parameters of CreateGdnInstance  CreateGdnInstanceRequest
     * @return CreateGdnInstanceResponse
     */
    CompletableFuture<CreateGdnInstanceResponse> createGdnInstance(CreateGdnInstanceRequest request);

    /**
     * @param request the request parameters of CreateRplInspectionTask  CreateRplInspectionTaskRequest
     * @return CreateRplInspectionTaskResponse
     */
    CompletableFuture<CreateRplInspectionTaskResponse> createRplInspectionTask(CreateRplInspectionTaskRequest request);

    /**
     * @param request the request parameters of CreateSQLEvaluateTask  CreateSQLEvaluateTaskRequest
     * @return CreateSQLEvaluateTaskResponse
     */
    CompletableFuture<CreateSQLEvaluateTaskResponse> createSQLEvaluateTask(CreateSQLEvaluateTaskRequest request);

    /**
     * @param request the request parameters of CreateStoragePool  CreateStoragePoolRequest
     * @return CreateStoragePoolResponse
     */
    CompletableFuture<CreateStoragePoolResponse> createStoragePool(CreateStoragePoolRequest request);

    /**
     * @param request the request parameters of CreateStructureImportTask  CreateStructureImportTaskRequest
     * @return CreateStructureImportTaskResponse
     */
    CompletableFuture<CreateStructureImportTaskResponse> createStructureImportTask(CreateStructureImportTaskRequest request);

    /**
     * @param request the request parameters of CreateSuperAccount  CreateSuperAccountRequest
     * @return CreateSuperAccountResponse
     */
    CompletableFuture<CreateSuperAccountResponse> createSuperAccount(CreateSuperAccountRequest request);

    /**
     * @param request the request parameters of CreateTransformOperation  CreateTransformOperationRequest
     * @return CreateTransformOperationResponse
     */
    CompletableFuture<CreateTransformOperationResponse> createTransformOperation(CreateTransformOperationRequest request);

    /**
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * @param request the request parameters of DeleteCustomEndpoint  DeleteCustomEndpointRequest
     * @return DeleteCustomEndpointResponse
     */
    CompletableFuture<DeleteCustomEndpointResponse> deleteCustomEndpoint(DeleteCustomEndpointRequest request);

    /**
     * @param request the request parameters of DeleteDB  DeleteDBRequest
     * @return DeleteDBResponse
     */
    CompletableFuture<DeleteDBResponse> deleteDB(DeleteDBRequest request);

    /**
     * @param request the request parameters of DeleteDBInstance  DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     */
    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    /**
     * @param request the request parameters of DeleteEvaluateAndImportTask  DeleteEvaluateAndImportTaskRequest
     * @return DeleteEvaluateAndImportTaskResponse
     */
    CompletableFuture<DeleteEvaluateAndImportTaskResponse> deleteEvaluateAndImportTask(DeleteEvaluateAndImportTaskRequest request);

    /**
     * @param request the request parameters of DeleteGdnInstance  DeleteGdnInstanceRequest
     * @return DeleteGdnInstanceResponse
     */
    CompletableFuture<DeleteGdnInstanceResponse> deleteGdnInstance(DeleteGdnInstanceRequest request);

    /**
     * @param request the request parameters of DescribeAccountList  DescribeAccountListRequest
     * @return DescribeAccountListResponse
     */
    CompletableFuture<DescribeAccountListResponse> describeAccountList(DescribeAccountListRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationMaintainConf  DescribeActiveOperationMaintainConfRequest
     * @return DescribeActiveOperationMaintainConfResponse
     */
    CompletableFuture<DescribeActiveOperationMaintainConfResponse> describeActiveOperationMaintainConf(DescribeActiveOperationMaintainConfRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTaskCount  DescribeActiveOperationTaskCountRequest
     * @return DescribeActiveOperationTaskCountResponse
     */
    CompletableFuture<DescribeActiveOperationTaskCountResponse> describeActiveOperationTaskCount(DescribeActiveOperationTaskCountRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTasks  DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of DescribeArchiveTableList  DescribeArchiveTableListRequest
     * @return DescribeArchiveTableListResponse
     */
    CompletableFuture<DescribeArchiveTableListResponse> describeArchiveTableList(DescribeArchiveTableListRequest request);

    /**
     * @param request the request parameters of DescribeAvailableCrossRegions  DescribeAvailableCrossRegionsRequest
     * @return DescribeAvailableCrossRegionsResponse
     */
    CompletableFuture<DescribeAvailableCrossRegionsResponse> describeAvailableCrossRegions(DescribeAvailableCrossRegionsRequest request);

    /**
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * @param request the request parameters of DescribeBackupSet  DescribeBackupSetRequest
     * @return DescribeBackupSetResponse
     */
    CompletableFuture<DescribeBackupSetResponse> describeBackupSet(DescribeBackupSetRequest request);

    /**
     * @param request the request parameters of DescribeBackupSetList  DescribeBackupSetListRequest
     * @return DescribeBackupSetListResponse
     */
    CompletableFuture<DescribeBackupSetListResponse> describeBackupSetList(DescribeBackupSetListRequest request);

    /**
     * @param request the request parameters of DescribeBinaryLogList  DescribeBinaryLogListRequest
     * @return DescribeBinaryLogListResponse
     */
    CompletableFuture<DescribeBinaryLogListResponse> describeBinaryLogList(DescribeBinaryLogListRequest request);

    /**
     * @param request the request parameters of DescribeCdcClassList  DescribeCdcClassListRequest
     * @return DescribeCdcClassListResponse
     */
    CompletableFuture<DescribeCdcClassListResponse> describeCdcClassList(DescribeCdcClassListRequest request);

    /**
     * @param request the request parameters of DescribeCdcInfo  DescribeCdcInfoRequest
     * @return DescribeCdcInfoResponse
     */
    CompletableFuture<DescribeCdcInfoResponse> describeCdcInfo(DescribeCdcInfoRequest request);

    /**
     * @param request the request parameters of DescribeCdcVersionList  DescribeCdcVersionListRequest
     * @return DescribeCdcVersionListResponse
     */
    CompletableFuture<DescribeCdcVersionListResponse> describeCdcVersionList(DescribeCdcVersionListRequest request);

    /**
     * @param request the request parameters of DescribeCharacterSet  DescribeCharacterSetRequest
     * @return DescribeCharacterSetResponse
     */
    CompletableFuture<DescribeCharacterSetResponse> describeCharacterSet(DescribeCharacterSetRequest request);

    /**
     * @param request the request parameters of DescribeColdDataBasicInfo  DescribeColdDataBasicInfoRequest
     * @return DescribeColdDataBasicInfoResponse
     */
    CompletableFuture<DescribeColdDataBasicInfoResponse> describeColdDataBasicInfo(DescribeColdDataBasicInfoRequest request);

    /**
     * @param request the request parameters of DescribeColumnarClassList  DescribeColumnarClassListRequest
     * @return DescribeColumnarClassListResponse
     */
    CompletableFuture<DescribeColumnarClassListResponse> describeColumnarClassList(DescribeColumnarClassListRequest request);

    /**
     * @param request the request parameters of DescribeColumnarInfo  DescribeColumnarInfoRequest
     * @return DescribeColumnarInfoResponse
     */
    CompletableFuture<DescribeColumnarInfoResponse> describeColumnarInfo(DescribeColumnarInfoRequest request);

    /**
     * @param request the request parameters of DescribeColumnarVersionList  DescribeColumnarVersionListRequest
     * @return DescribeColumnarVersionListResponse
     */
    CompletableFuture<DescribeColumnarVersionListResponse> describeColumnarVersionList(DescribeColumnarVersionListRequest request);

    /**
     * @param request the request parameters of DescribeComponentPropeties  DescribeComponentPropetiesRequest
     * @return DescribeComponentPropetiesResponse
     */
    CompletableFuture<DescribeComponentPropetiesResponse> describeComponentPropeties(DescribeComponentPropetiesRequest request);

    /**
     * @param request the request parameters of DescribeCustomEndpointList  DescribeCustomEndpointListRequest
     * @return DescribeCustomEndpointListResponse
     */
    CompletableFuture<DescribeCustomEndpointListResponse> describeCustomEndpointList(DescribeCustomEndpointListRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceAttribute  DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     */
    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceConfig  DescribeDBInstanceConfigRequest
     * @return DescribeDBInstanceConfigResponse
     */
    CompletableFuture<DescribeDBInstanceConfigResponse> describeDBInstanceConfig(DescribeDBInstanceConfigRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceHA  DescribeDBInstanceHARequest
     * @return DescribeDBInstanceHAResponse
     */
    CompletableFuture<DescribeDBInstanceHAResponse> describeDBInstanceHA(DescribeDBInstanceHARequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceSSL  DescribeDBInstanceSSLRequest
     * @return DescribeDBInstanceSSLResponse
     */
    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceTDE  DescribeDBInstanceTDERequest
     * @return DescribeDBInstanceTDEResponse
     */
    CompletableFuture<DescribeDBInstanceTDEResponse> describeDBInstanceTDE(DescribeDBInstanceTDERequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceTopology  DescribeDBInstanceTopologyRequest
     * @return DescribeDBInstanceTopologyResponse
     */
    CompletableFuture<DescribeDBInstanceTopologyResponse> describeDBInstanceTopology(DescribeDBInstanceTopologyRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceViaEndpoint  DescribeDBInstanceViaEndpointRequest
     * @return DescribeDBInstanceViaEndpointResponse
     */
    CompletableFuture<DescribeDBInstanceViaEndpointResponse> describeDBInstanceViaEndpoint(DescribeDBInstanceViaEndpointRequest request);

    /**
     * @param request the request parameters of DescribeDBInstances  DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    /**
     * @param request the request parameters of DescribeDBNodePerformance  DescribeDBNodePerformanceRequest
     * @return DescribeDBNodePerformanceResponse
     */
    CompletableFuture<DescribeDBNodePerformanceResponse> describeDBNodePerformance(DescribeDBNodePerformanceRequest request);

    /**
     * @param request the request parameters of DescribeDataImportTaskInfo  DescribeDataImportTaskInfoRequest
     * @return DescribeDataImportTaskInfoResponse
     */
    CompletableFuture<DescribeDataImportTaskInfoResponse> describeDataImportTaskInfo(DescribeDataImportTaskInfoRequest request);

    /**
     * @param request the request parameters of DescribeDbList  DescribeDbListRequest
     * @return DescribeDbListResponse
     */
    CompletableFuture<DescribeDbListResponse> describeDbList(DescribeDbListRequest request);

    /**
     * @param request the request parameters of DescribeDistributeTableList  DescribeDistributeTableListRequest
     * @return DescribeDistributeTableListResponse
     */
    CompletableFuture<DescribeDistributeTableListResponse> describeDistributeTableList(DescribeDistributeTableListRequest request);

    /**
     * @param request the request parameters of DescribeEnabledCrossRegions  DescribeEnabledCrossRegionsRequest
     * @return DescribeEnabledCrossRegionsResponse
     */
    CompletableFuture<DescribeEnabledCrossRegionsResponse> describeEnabledCrossRegions(DescribeEnabledCrossRegionsRequest request);

    /**
     * @param request the request parameters of DescribeEvaluateAndImportTask  DescribeEvaluateAndImportTaskRequest
     * @return DescribeEvaluateAndImportTaskResponse
     */
    CompletableFuture<DescribeEvaluateAndImportTaskResponse> describeEvaluateAndImportTask(DescribeEvaluateAndImportTaskRequest request);

    /**
     * @param request the request parameters of DescribeEvaluateAndImportTasks  DescribeEvaluateAndImportTasksRequest
     * @return DescribeEvaluateAndImportTasksResponse
     */
    CompletableFuture<DescribeEvaluateAndImportTasksResponse> describeEvaluateAndImportTasks(DescribeEvaluateAndImportTasksRequest request);

    /**
     * @param request the request parameters of DescribeEvents  DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    /**
     * @param request the request parameters of DescribeGdnInstances  DescribeGdnInstancesRequest
     * @return DescribeGdnInstancesResponse
     */
    CompletableFuture<DescribeGdnInstancesResponse> describeGdnInstances(DescribeGdnInstancesRequest request);

    /**
     * @param request the request parameters of DescribeOpenBackupSet  DescribeOpenBackupSetRequest
     * @return DescribeOpenBackupSetResponse
     */
    CompletableFuture<DescribeOpenBackupSetResponse> describeOpenBackupSet(DescribeOpenBackupSetRequest request);

    /**
     * @param request the request parameters of DescribeParameterGroups  DescribeParameterGroupsRequest
     * @return DescribeParameterGroupsResponse
     */
    CompletableFuture<DescribeParameterGroupsResponse> describeParameterGroups(DescribeParameterGroupsRequest request);

    /**
     * @param request the request parameters of DescribeParameterTemplates  DescribeParameterTemplatesRequest
     * @return DescribeParameterTemplatesResponse
     */
    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeParameters  DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    /**
     * @param request the request parameters of DescribePolarxDataNodes  DescribePolarxDataNodesRequest
     * @return DescribePolarxDataNodesResponse
     */
    CompletableFuture<DescribePolarxDataNodesResponse> describePolarxDataNodes(DescribePolarxDataNodesRequest request);

    /**
     * @param request the request parameters of DescribeRdsVpcs  DescribeRdsVpcsRequest
     * @return DescribeRdsVpcsResponse
     */
    CompletableFuture<DescribeRdsVpcsResponse> describeRdsVpcs(DescribeRdsVpcsRequest request);

    /**
     * @param request the request parameters of DescribeRdsVswitches  DescribeRdsVswitchesRequest
     * @return DescribeRdsVswitchesResponse
     */
    CompletableFuture<DescribeRdsVswitchesResponse> describeRdsVswitches(DescribeRdsVswitchesRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRplInspectionTask  DescribeRplInspectionTaskRequest
     * @return DescribeRplInspectionTaskResponse
     */
    CompletableFuture<DescribeRplInspectionTaskResponse> describeRplInspectionTask(DescribeRplInspectionTaskRequest request);

    /**
     * @param request the request parameters of DescribeScaleOutMigrateTaskList  DescribeScaleOutMigrateTaskListRequest
     * @return DescribeScaleOutMigrateTaskListResponse
     */
    CompletableFuture<DescribeScaleOutMigrateTaskListResponse> describeScaleOutMigrateTaskList(DescribeScaleOutMigrateTaskListRequest request);

    /**
     * @param request the request parameters of DescribeSecurityIps  DescribeSecurityIpsRequest
     * @return DescribeSecurityIpsResponse
     */
    CompletableFuture<DescribeSecurityIpsResponse> describeSecurityIps(DescribeSecurityIpsRequest request);

    /**
     * @param request the request parameters of DescribeShowStorageInfo  DescribeShowStorageInfoRequest
     * @return DescribeShowStorageInfoResponse
     */
    CompletableFuture<DescribeShowStorageInfoResponse> describeShowStorageInfo(DescribeShowStorageInfoRequest request);

    /**
     * @param request the request parameters of DescribeSlowLogRecords  DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
     * @param request the request parameters of DescribeSqlAuditInfo  DescribeSqlAuditInfoRequest
     * @return DescribeSqlAuditInfoResponse
     */
    CompletableFuture<DescribeSqlAuditInfoResponse> describeSqlAuditInfo(DescribeSqlAuditInfoRequest request);

    /**
     * @param request the request parameters of DescribeSqlFlashbackTaskList  DescribeSqlFlashbackTaskListRequest
     * @return DescribeSqlFlashbackTaskListResponse
     */
    CompletableFuture<DescribeSqlFlashbackTaskListResponse> describeSqlFlashbackTaskList(DescribeSqlFlashbackTaskListRequest request);

    /**
     * @param request the request parameters of DescribeStoragePoolInfo  DescribeStoragePoolInfoRequest
     * @return DescribeStoragePoolInfoResponse
     */
    CompletableFuture<DescribeStoragePoolInfoResponse> describeStoragePoolInfo(DescribeStoragePoolInfoRequest request);

    /**
     * @param request the request parameters of DescribeStructureImportTaskInfo  DescribeStructureImportTaskInfoRequest
     * @return DescribeStructureImportTaskInfoResponse
     */
    CompletableFuture<DescribeStructureImportTaskInfoResponse> describeStructureImportTaskInfo(DescribeStructureImportTaskInfoRequest request);

    /**
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
     * @param request the request parameters of DescribeTransformStatus  DescribeTransformStatusRequest
     * @return DescribeTransformStatusResponse
     */
    CompletableFuture<DescribeTransformStatusResponse> describeTransformStatus(DescribeTransformStatusRequest request);

    /**
     * @param request the request parameters of DescribeUserEncryptionKeyList  DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
     */
    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

    /**
     * @param request the request parameters of DisableRightsSeparation  DisableRightsSeparationRequest
     * @return DisableRightsSeparationResponse
     */
    CompletableFuture<DisableRightsSeparationResponse> disableRightsSeparation(DisableRightsSeparationRequest request);

    /**
     * @param request the request parameters of DisableSqlAudit  DisableSqlAuditRequest
     * @return DisableSqlAuditResponse
     */
    CompletableFuture<DisableSqlAuditResponse> disableSqlAudit(DisableSqlAuditRequest request);

    /**
     * @param request the request parameters of EnableRightsSeparation  EnableRightsSeparationRequest
     * @return EnableRightsSeparationResponse
     */
    CompletableFuture<EnableRightsSeparationResponse> enableRightsSeparation(EnableRightsSeparationRequest request);

    /**
     * @param request the request parameters of EnableSqlAudit  EnableSqlAuditRequest
     * @return EnableSqlAuditResponse
     */
    CompletableFuture<EnableSqlAuditResponse> enableSqlAudit(EnableSqlAuditRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of MigrateDBInstance  MigrateDBInstanceRequest
     * @return MigrateDBInstanceResponse
     */
    CompletableFuture<MigrateDBInstanceResponse> migrateDBInstance(MigrateDBInstanceRequest request);

    /**
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyAccountPrivilege  ModifyAccountPrivilegeRequest
     * @return ModifyAccountPrivilegeResponse
     */
    CompletableFuture<ModifyAccountPrivilegeResponse> modifyAccountPrivilege(ModifyAccountPrivilegeRequest request);

    /**
     * @param request the request parameters of ModifyActiveOperationMaintainConf  ModifyActiveOperationMaintainConfRequest
     * @return ModifyActiveOperationMaintainConfResponse
     */
    CompletableFuture<ModifyActiveOperationMaintainConfResponse> modifyActiveOperationMaintainConf(ModifyActiveOperationMaintainConfRequest request);

    /**
     * @param request the request parameters of ModifyActiveOperationTasks  ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of ModifyCdcClass  ModifyCdcClassRequest
     * @return ModifyCdcClassResponse
     */
    CompletableFuture<ModifyCdcClassResponse> modifyCdcClass(ModifyCdcClassRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of ModifyColumnarClass  ModifyColumnarClassRequest
     * @return ModifyColumnarClassResponse
     */
    CompletableFuture<ModifyColumnarClassResponse> modifyColumnarClass(ModifyColumnarClassRequest request);

    /**
     * @param request the request parameters of ModifyCustomEndpoint  ModifyCustomEndpointRequest
     * @return ModifyCustomEndpointResponse
     */
    CompletableFuture<ModifyCustomEndpointResponse> modifyCustomEndpoint(ModifyCustomEndpointRequest request);

    /**
     * @param request the request parameters of ModifyCustomEndpointNet  ModifyCustomEndpointNetRequest
     * @return ModifyCustomEndpointNetResponse
     */
    CompletableFuture<ModifyCustomEndpointNetResponse> modifyCustomEndpointNet(ModifyCustomEndpointNetRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceClass  ModifyDBInstanceClassRequest
     * @return ModifyDBInstanceClassResponse
     */
    CompletableFuture<ModifyDBInstanceClassResponse> modifyDBInstanceClass(ModifyDBInstanceClassRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceConfig  ModifyDBInstanceConfigRequest
     * @return ModifyDBInstanceConfigResponse
     */
    CompletableFuture<ModifyDBInstanceConfigResponse> modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceConnectionString  ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceDescription  ModifyDBInstanceDescriptionRequest
     * @return ModifyDBInstanceDescriptionResponse
     */
    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceMaintainTime  ModifyDBInstanceMaintainTimeRequest
     * @return ModifyDBInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of ModifyDBInstanceVip  ModifyDBInstanceVipRequest
     * @return ModifyDBInstanceVipResponse
     */
    CompletableFuture<ModifyDBInstanceVipResponse> modifyDBInstanceVip(ModifyDBInstanceVipRequest request);

    /**
     * @param request the request parameters of ModifyDatabaseDescription  ModifyDatabaseDescriptionRequest
     * @return ModifyDatabaseDescriptionResponse
     */
    CompletableFuture<ModifyDatabaseDescriptionResponse> modifyDatabaseDescription(ModifyDatabaseDescriptionRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of ModifyEngineMigration  ModifyEngineMigrationRequest
     * @return ModifyEngineMigrationResponse
     */
    CompletableFuture<ModifyEngineMigrationResponse> modifyEngineMigration(ModifyEngineMigrationRequest request);

    /**
     * @param request the request parameters of ModifyParameter  ModifyParameterRequest
     * @return ModifyParameterResponse
     */
    CompletableFuture<ModifyParameterResponse> modifyParameter(ModifyParameterRequest request);

    /**
     * @param request the request parameters of ModifySecurityIps  ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    /**
     * @param request the request parameters of PreCheckSqlFlashbackTask  PreCheckSqlFlashbackTaskRequest
     * @return PreCheckSqlFlashbackTaskResponse
     */
    CompletableFuture<PreCheckSqlFlashbackTaskResponse> preCheckSqlFlashbackTask(PreCheckSqlFlashbackTaskRequest request);

    /**
     * @param request the request parameters of RefreshImportMeta  RefreshImportMetaRequest
     * @return RefreshImportMetaResponse
     */
    CompletableFuture<RefreshImportMetaResponse> refreshImportMeta(RefreshImportMetaRequest request);

    /**
     * @param request the request parameters of ReleaseColdDataVolume  ReleaseColdDataVolumeRequest
     * @return ReleaseColdDataVolumeResponse
     */
    CompletableFuture<ReleaseColdDataVolumeResponse> releaseColdDataVolume(ReleaseColdDataVolumeRequest request);

    /**
     * @param request the request parameters of ReleaseInstancePublicConnection  ReleaseInstancePublicConnectionRequest
     * @return ReleaseInstancePublicConnectionResponse
     */
    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    /**
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of ResetAccountPasswordRestrict  ResetAccountPasswordRestrictRequest
     * @return ResetAccountPasswordRestrictResponse
     */
    CompletableFuture<ResetAccountPasswordRestrictResponse> resetAccountPasswordRestrict(ResetAccountPasswordRestrictRequest request);

    /**
     * @param request the request parameters of RestartDBInstance  RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    /**
     * @param request the request parameters of RestartDataImportTask  RestartDataImportTaskRequest
     * @return RestartDataImportTaskResponse
     */
    CompletableFuture<RestartDataImportTaskResponse> restartDataImportTask(RestartDataImportTaskRequest request);

    /**
     * @param request the request parameters of SkipCurrentStep  SkipCurrentStepRequest
     * @return SkipCurrentStepResponse
     */
    CompletableFuture<SkipCurrentStepResponse> skipCurrentStep(SkipCurrentStepRequest request);

    /**
     * @param request the request parameters of StartSwitchDatabase  StartSwitchDatabaseRequest
     * @return StartSwitchDatabaseResponse
     */
    CompletableFuture<StartSwitchDatabaseResponse> startSwitchDatabase(StartSwitchDatabaseRequest request);

    /**
     * @param request the request parameters of StopDataImportTask  StopDataImportTaskRequest
     * @return StopDataImportTaskResponse
     */
    CompletableFuture<StopDataImportTaskResponse> stopDataImportTask(StopDataImportTaskRequest request);

    /**
     * @param request the request parameters of SubmitSqlFlashbackTask  SubmitSqlFlashbackTaskRequest
     * @return SubmitSqlFlashbackTaskResponse
     */
    CompletableFuture<SubmitSqlFlashbackTaskResponse> submitSqlFlashbackTask(SubmitSqlFlashbackTaskRequest request);

    /**
     * @param request the request parameters of SwitchDBInstanceHA  SwitchDBInstanceHARequest
     * @return SwitchDBInstanceHAResponse
     */
    CompletableFuture<SwitchDBInstanceHAResponse> switchDBInstanceHA(SwitchDBInstanceHARequest request);

    /**
     * @param request the request parameters of SwitchGdnMemberRole  SwitchGdnMemberRoleRequest
     * @return SwitchGdnMemberRoleResponse
     */
    CompletableFuture<SwitchGdnMemberRoleResponse> switchGdnMemberRole(SwitchGdnMemberRoleRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateBackupPolicy  UpdateBackupPolicyRequest
     * @return UpdateBackupPolicyResponse
     */
    CompletableFuture<UpdateBackupPolicyResponse> updateBackupPolicy(UpdateBackupPolicyRequest request);

    /**
     * @param request the request parameters of UpdateDBInstanceSSL  UpdateDBInstanceSSLRequest
     * @return UpdateDBInstanceSSLResponse
     */
    CompletableFuture<UpdateDBInstanceSSLResponse> updateDBInstanceSSL(UpdateDBInstanceSSLRequest request);

    /**
     * @param request the request parameters of UpdateDBInstanceTDE  UpdateDBInstanceTDERequest
     * @return UpdateDBInstanceTDEResponse
     */
    CompletableFuture<UpdateDBInstanceTDEResponse> updateDBInstanceTDE(UpdateDBInstanceTDERequest request);

    /**
     * @param request the request parameters of UpdatePolarDBXInstanceNode  UpdatePolarDBXInstanceNodeRequest
     * @return UpdatePolarDBXInstanceNodeResponse
     */
    CompletableFuture<UpdatePolarDBXInstanceNodeResponse> updatePolarDBXInstanceNode(UpdatePolarDBXInstanceNodeRequest request);

    /**
     * @param request the request parameters of UpgradeCDCVersion  UpgradeCDCVersionRequest
     * @return UpgradeCDCVersionResponse
     */
    CompletableFuture<UpgradeCDCVersionResponse> upgradeCDCVersion(UpgradeCDCVersionRequest request);

    /**
     * @param request the request parameters of UpgradeColumnarVersion  UpgradeColumnarVersionRequest
     * @return UpgradeColumnarVersionResponse
     */
    CompletableFuture<UpgradeColumnarVersionResponse> upgradeColumnarVersion(UpgradeColumnarVersionRequest request);

    /**
     * @param request the request parameters of UpgradeDBInstanceKernelVersion  UpgradeDBInstanceKernelVersionRequest
     * @return UpgradeDBInstanceKernelVersionResponse
     */
    CompletableFuture<UpgradeDBInstanceKernelVersionResponse> upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request);

}
