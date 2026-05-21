// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hologram20220601.models.*;
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
     * @param request the request parameters of BindLeaderInstance  BindLeaderInstanceRequest
     * @return BindLeaderInstanceResponse
     */
    CompletableFuture<BindLeaderInstanceResponse> bindLeaderInstance(BindLeaderInstanceRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateDatabase  CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    /**
     * @param request the request parameters of CreateExternalDatabase  CreateExternalDatabaseRequest
     * @return CreateExternalDatabaseResponse
     */
    CompletableFuture<CreateExternalDatabaseResponse> createExternalDatabase(CreateExternalDatabaseRequest request);

    /**
     * @param request the request parameters of CreateHoloWarehouse  CreateHoloWarehouseRequest
     * @return CreateHoloWarehouseResponse
     */
    CompletableFuture<CreateHoloWarehouseResponse> createHoloWarehouse(CreateHoloWarehouseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing details of Hologres, see <a href="https://www.alibabacloud.com/help/en/hologres/developer-reference/api-hologram-2022-06-01-createinstance">Pricing</a>.</li>
     * <li>When you purchase a Hologres instance, you must specify the region and zone in which the Hologres instance resides. A region may correspond to multiple zones. Example:<!---->
     * cn-hangzhou: cn-hangzhou-h, cn-hangzhou-j
     *    cn-shanghai: cn-shanghai-e, cn-shanghai-f
     *    cn-beijing: cn-beijing-i, cn-beijing-g
     *    cn-zhangjiakou: cn-zhangjiakou-b
     *    cn-shenzhen: cn-shenzhen-e
     *    cn-hongkong: cn-hongkong-b
     *    cn-shanghai-finance-1: cn-shanghai-finance-1z
     *    ap-northeast-1: ap-northeast-1a
     *    ap-southeast-1: ap-southeast-1c
     *    ap-southeast-3: ap-southeast-3b
     *    ap-southeast-5: ap-southeast-5b
     *    ap-south-1: ap-south-1b
     *    eu-central-1: eu-central-1a
     *    us-east-1: us-east-1a
     *    us-west-1: us-west-1b</li>
     * </ul>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateManualBackup  CreateManualBackupRequest
     * @return CreateManualBackupResponse
     */
    CompletableFuture<CreateManualBackupResponse> createManualBackup(CreateManualBackupRequest request);

    /**
     * @param request the request parameters of CreateModelService  CreateModelServiceRequest
     * @return CreateModelServiceResponse
     */
    CompletableFuture<CreateModelServiceResponse> createModelService(CreateModelServiceRequest request);

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * @param request the request parameters of CreateWarehouse  CreateWarehouseRequest
     * @return CreateWarehouseResponse
     */
    CompletableFuture<CreateWarehouseResponse> createWarehouse(CreateWarehouseRequest request);

    /**
     * @param request the request parameters of CreateWarehouseScheduleTask  CreateWarehouseScheduleTaskRequest
     * @return CreateWarehouseScheduleTaskResponse
     */
    CompletableFuture<CreateWarehouseScheduleTaskResponse> createWarehouseScheduleTask(CreateWarehouseScheduleTaskRequest request);

    /**
     * @param request the request parameters of DeleteBackupData  DeleteBackupDataRequest
     * @return DeleteBackupDataResponse
     */
    CompletableFuture<DeleteBackupDataResponse> deleteBackupData(DeleteBackupDataRequest request);

    /**
     * @param request the request parameters of DeleteHoloWarehouse  DeleteHoloWarehouseRequest
     * @return DeleteHoloWarehouseResponse
     */
    CompletableFuture<DeleteHoloWarehouseResponse> deleteHoloWarehouse(DeleteHoloWarehouseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, read the documentation and make sure that you understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li>After you delete a Hologres instance, data and objects in the instance cannot be restored. Proceed with caution. For more information, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview?spm=a2c63.p38356.0.0.efc33b87i5pDl7">Billing overview</a>.</li>
     * <li>You can delete only pay-as-you-go instances.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteModelResource  DeleteModelResourceRequest
     * @return DeleteModelResourceResponse
     */
    CompletableFuture<DeleteModelResourceResponse> deleteModelResource(DeleteModelResourceRequest request);

    /**
     * @param request the request parameters of DeleteModelService  DeleteModelServiceRequest
     * @return DeleteModelServiceResponse
     */
    CompletableFuture<DeleteModelServiceResponse> deleteModelService(DeleteModelServiceRequest request);

    /**
     * @param request the request parameters of DeleteWarehouseScheduleTask  DeleteWarehouseScheduleTaskRequest
     * @return DeleteWarehouseScheduleTaskResponse
     */
    CompletableFuture<DeleteWarehouseScheduleTaskResponse> deleteWarehouseScheduleTask(DeleteWarehouseScheduleTaskRequest request);

    /**
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
     * @param request the request parameters of DisableExecuteStatement  DisableExecuteStatementRequest
     * @return DisableExecuteStatementResponse
     */
    CompletableFuture<DisableExecuteStatementResponse> disableExecuteStatement(DisableExecuteStatementRequest request);

    /**
     * @param request the request parameters of DisableHiveAccess  DisableHiveAccessRequest
     * @return DisableHiveAccessResponse
     */
    CompletableFuture<DisableHiveAccessResponse> disableHiveAccess(DisableHiveAccessRequest request);

    /**
     * @param request the request parameters of DisableOperationEvent  DisableOperationEventRequest
     * @return DisableOperationEventResponse
     */
    CompletableFuture<DisableOperationEventResponse> disableOperationEvent(DisableOperationEventRequest request);

    /**
     * @param request the request parameters of DisableSSL  DisableSSLRequest
     * @return DisableSSLResponse
     */
    CompletableFuture<DisableSSLResponse> disableSSL(DisableSSLRequest request);

    /**
     * @param request the request parameters of DisableSupportAccount  DisableSupportAccountRequest
     * @return DisableSupportAccountResponse
     */
    CompletableFuture<DisableSupportAccountResponse> disableSupportAccount(DisableSupportAccountRequest request);

    /**
     * @param request the request parameters of DisableWarehouseAutoScale  DisableWarehouseAutoScaleRequest
     * @return DisableWarehouseAutoScaleResponse
     */
    CompletableFuture<DisableWarehouseAutoScaleResponse> disableWarehouseAutoScale(DisableWarehouseAutoScaleRequest request);

    /**
     * @param request the request parameters of DiscardUpgrade  DiscardUpgradeRequest
     * @return DiscardUpgradeResponse
     */
    CompletableFuture<DiscardUpgradeResponse> discardUpgrade(DiscardUpgradeRequest request);

    /**
     * @param request the request parameters of DropUser  DropUserRequest
     * @return DropUserResponse
     */
    CompletableFuture<DropUserResponse> dropUser(DropUserRequest request);

    /**
     * @param request the request parameters of EnableExecuteStatement  EnableExecuteStatementRequest
     * @return EnableExecuteStatementResponse
     */
    CompletableFuture<EnableExecuteStatementResponse> enableExecuteStatement(EnableExecuteStatementRequest request);

    /**
     * @param request the request parameters of EnableHiveAccess  EnableHiveAccessRequest
     * @return EnableHiveAccessResponse
     */
    CompletableFuture<EnableHiveAccessResponse> enableHiveAccess(EnableHiveAccessRequest request);

    /**
     * @param request the request parameters of EnableSSL  EnableSSLRequest
     * @return EnableSSLResponse
     */
    CompletableFuture<EnableSSLResponse> enableSSL(EnableSSLRequest request);

    /**
     * @param request the request parameters of EnableSupportAccount  EnableSupportAccountRequest
     * @return EnableSupportAccountResponse
     */
    CompletableFuture<EnableSupportAccountResponse> enableSupportAccount(EnableSupportAccountRequest request);

    /**
     * @param request the request parameters of EnableWarehouseAutoScale  EnableWarehouseAutoScaleRequest
     * @return EnableWarehouseAutoScaleResponse
     */
    CompletableFuture<EnableWarehouseAutoScaleResponse> enableWarehouseAutoScale(EnableWarehouseAutoScaleRequest request);

    /**
     * @param request the request parameters of ExecuteStatement  ExecuteStatementRequest
     * @return ExecuteStatementResponse
     */
    CompletableFuture<ExecuteStatementResponse> executeStatement(ExecuteStatementRequest request);

    /**
     * @param request the request parameters of GetCertificateAttribute  GetCertificateAttributeRequest
     * @return GetCertificateAttributeResponse
     */
    CompletableFuture<GetCertificateAttributeResponse> getCertificateAttribute(GetCertificateAttributeRequest request);

    /**
     * @param request the request parameters of GetExecuteStatementEnabled  GetExecuteStatementEnabledRequest
     * @return GetExecuteStatementEnabledResponse
     */
    CompletableFuture<GetExecuteStatementEnabledResponse> getExecuteStatementEnabled(GetExecuteStatementEnabledRequest request);

    /**
     * @param request the request parameters of GetHoloWebLoginSetting  GetHoloWebLoginSettingRequest
     * @return GetHoloWebLoginSettingResponse
     */
    CompletableFuture<GetHoloWebLoginSettingResponse> getHoloWebLoginSetting(GetHoloWebLoginSettingRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetInstanceModel  GetInstanceModelRequest
     * @return GetInstanceModelResponse
     */
    CompletableFuture<GetInstanceModelResponse> getInstanceModel(GetInstanceModelRequest request);

    /**
     * @param request the request parameters of GetLastUpgradeRecord  GetLastUpgradeRecordRequest
     * @return GetLastUpgradeRecordResponse
     */
    CompletableFuture<GetLastUpgradeRecordResponse> getLastUpgradeRecord(GetLastUpgradeRecordRequest request);

    /**
     * @param request the request parameters of GetRootCertificate  GetRootCertificateRequest
     * @return GetRootCertificateResponse
     */
    CompletableFuture<GetRootCertificateResponse> getRootCertificate(GetRootCertificateRequest request);

    /**
     * @param request the request parameters of GetScheduledBackupConfig  GetScheduledBackupConfigRequest
     * @return GetScheduledBackupConfigResponse
     */
    CompletableFuture<GetScheduledBackupConfigResponse> getScheduledBackupConfig(GetScheduledBackupConfigRequest request);

    /**
     * @param request the request parameters of GetUpgradeStatus  GetUpgradeStatusRequest
     * @return GetUpgradeStatusResponse
     */
    CompletableFuture<GetUpgradeStatusResponse> getUpgradeStatus(GetUpgradeStatusRequest request);

    /**
     * @param request the request parameters of GetUpgradeable  GetUpgradeableRequest
     * @return GetUpgradeableResponse
     */
    CompletableFuture<GetUpgradeableResponse> getUpgradeable(GetUpgradeableRequest request);

    /**
     * @param request the request parameters of GetWarehouseDetail  GetWarehouseDetailRequest
     * @return GetWarehouseDetailResponse
     */
    CompletableFuture<GetWarehouseDetailResponse> getWarehouseDetail(GetWarehouseDetailRequest request);

    /**
     * @param request the request parameters of GrantDatabasePermission  GrantDatabasePermissionRequest
     * @return GrantDatabasePermissionResponse
     */
    CompletableFuture<GrantDatabasePermissionResponse> grantDatabasePermission(GrantDatabasePermissionRequest request);

    /**
     * @param request the request parameters of GrantSchemaPermission  GrantSchemaPermissionRequest
     * @return GrantSchemaPermissionResponse
     */
    CompletableFuture<GrantSchemaPermissionResponse> grantSchemaPermission(GrantSchemaPermissionRequest request);

    /**
     * @param request the request parameters of GrantTablePermission  GrantTablePermissionRequest
     * @return GrantTablePermissionResponse
     */
    CompletableFuture<GrantTablePermissionResponse> grantTablePermission(GrantTablePermissionRequest request);

    /**
     * @param request the request parameters of ListBackupData  ListBackupDataRequest
     * @return ListBackupDataResponse
     */
    CompletableFuture<ListBackupDataResponse> listBackupData(ListBackupDataRequest request);

    /**
     * @param request the request parameters of ListDatabases  ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    /**
     * @param request the request parameters of ListFollowerInstances  ListFollowerInstancesRequest
     * @return ListFollowerInstancesResponse
     */
    CompletableFuture<ListFollowerInstancesResponse> listFollowerInstances(ListFollowerInstancesRequest request);

    /**
     * @param request the request parameters of ListInstanceModel  ListInstanceModelRequest
     * @return ListInstanceModelResponse
     */
    CompletableFuture<ListInstanceModelResponse> listInstanceModel(ListInstanceModelRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListLeaderInstances  ListLeaderInstancesRequest
     * @return ListLeaderInstancesResponse
     */
    CompletableFuture<ListLeaderInstancesResponse> listLeaderInstances(ListLeaderInstancesRequest request);

    /**
     * @param request the request parameters of ListMigrationZones  ListMigrationZonesRequest
     * @return ListMigrationZonesResponse
     */
    CompletableFuture<ListMigrationZonesResponse> listMigrationZones(ListMigrationZonesRequest request);

    /**
     * @param request the request parameters of ListModelCatalog  ListModelCatalogRequest
     * @return ListModelCatalogResponse
     */
    CompletableFuture<ListModelCatalogResponse> listModelCatalog(ListModelCatalogRequest request);

    /**
     * @param request the request parameters of ListOperationEvents  ListOperationEventsRequest
     * @return ListOperationEventsResponse
     */
    CompletableFuture<ListOperationEventsResponse> listOperationEvents(ListOperationEventsRequest request);

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * @param request the request parameters of ListUpgradeReleaseVersions  ListUpgradeReleaseVersionsRequest
     * @return ListUpgradeReleaseVersionsResponse
     */
    CompletableFuture<ListUpgradeReleaseVersionsResponse> listUpgradeReleaseVersions(ListUpgradeReleaseVersionsRequest request);

    /**
     * @param request the request parameters of ListWarehouseScheduleEvent  ListWarehouseScheduleEventRequest
     * @return ListWarehouseScheduleEventResponse
     */
    CompletableFuture<ListWarehouseScheduleEventResponse> listWarehouseScheduleEvent(ListWarehouseScheduleEventRequest request);

    /**
     * @param request the request parameters of ListWarehouseScheduleTask  ListWarehouseScheduleTaskRequest
     * @return ListWarehouseScheduleTaskResponse
     */
    CompletableFuture<ListWarehouseScheduleTaskResponse> listWarehouseScheduleTask(ListWarehouseScheduleTaskRequest request);

    /**
     * @param request the request parameters of ListWarehouses  ListWarehousesRequest
     * @return ListWarehousesResponse
     */
    CompletableFuture<ListWarehousesResponse> listWarehouses(ListWarehousesRequest request);

    /**
     * @param request the request parameters of MigrateInstanceZone  MigrateInstanceZoneRequest
     * @return MigrateInstanceZoneResponse
     */
    CompletableFuture<MigrateInstanceZoneResponse> migrateInstanceZone(MigrateInstanceZoneRequest request);

    /**
     * @param request the request parameters of PrepareUpgrade  PrepareUpgradeRequest
     * @return PrepareUpgradeResponse
     */
    CompletableFuture<PrepareUpgradeResponse> prepareUpgrade(PrepareUpgradeRequest request);

    /**
     * @param request the request parameters of RebalanceHoloWarehouse  RebalanceHoloWarehouseRequest
     * @return RebalanceHoloWarehouseResponse
     */
    CompletableFuture<RebalanceHoloWarehouseResponse> rebalanceHoloWarehouse(RebalanceHoloWarehouseRequest request);

    /**
     * @param request the request parameters of RenameHoloWarehouse  RenameHoloWarehouseRequest
     * @return RenameHoloWarehouseResponse
     */
    CompletableFuture<RenameHoloWarehouseResponse> renameHoloWarehouse(RenameHoloWarehouseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing of Hologres, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.</li>
     * <li>For more information about how to renew a Hologres instance, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/manage-renewals?spm=a2c63.p38356.0.0.38e731c9VAwtDP">Manage renewals</a>.</li>
     * <li>You can renew only subscription instances.</li>
     * </ul>
     * 
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * @param request the request parameters of RenewSSLCertificate  RenewSSLCertificateRequest
     * @return RenewSSLCertificateResponse
     */
    CompletableFuture<RenewSSLCertificateResponse> renewSSLCertificate(RenewSSLCertificateRequest request);

    /**
     * @param request the request parameters of RestartHoloWarehouse  RestartHoloWarehouseRequest
     * @return RestartHoloWarehouseResponse
     */
    CompletableFuture<RestartHoloWarehouseResponse> restartHoloWarehouse(RestartHoloWarehouseRequest request);

    /**
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * @param request the request parameters of ResumeHoloWarehouse  ResumeHoloWarehouseRequest
     * @return ResumeHoloWarehouseResponse
     */
    CompletableFuture<ResumeHoloWarehouseResponse> resumeHoloWarehouse(ResumeHoloWarehouseRequest request);

    /**
     * @param request the request parameters of ResumeInstance  ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    /**
     * @param request the request parameters of RevokeDatabasePermission  RevokeDatabasePermissionRequest
     * @return RevokeDatabasePermissionResponse
     */
    CompletableFuture<RevokeDatabasePermissionResponse> revokeDatabasePermission(RevokeDatabasePermissionRequest request);

    /**
     * @param request the request parameters of RevokeSchemaPermission  RevokeSchemaPermissionRequest
     * @return RevokeSchemaPermissionResponse
     */
    CompletableFuture<RevokeSchemaPermissionResponse> revokeSchemaPermission(RevokeSchemaPermissionRequest request);

    /**
     * @param request the request parameters of RevokeTablePermission  RevokeTablePermissionRequest
     * @return RevokeTablePermissionResponse
     */
    CompletableFuture<RevokeTablePermissionResponse> revokeTablePermission(RevokeTablePermissionRequest request);

    /**
     * @param request the request parameters of ScaleHoloWarehouse  ScaleHoloWarehouseRequest
     * @return ScaleHoloWarehouseResponse
     */
    CompletableFuture<ScaleHoloWarehouseResponse> scaleHoloWarehouse(ScaleHoloWarehouseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing of Hologres, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.</li>
     * <li>During the change of computing resource specifications of a Hologres instance, the instance is unavailable. During the change of storage resource specifications of a Hologres instance, the instance can work normally. Do not frequently change instance specifications. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/upgrade-or-downgrade-instance-specifications">Upgrade or downgrade instance specifications</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ScaleInstance  ScaleInstanceRequest
     * @return ScaleInstanceResponse
     */
    CompletableFuture<ScaleInstanceResponse> scaleInstance(ScaleInstanceRequest request);

    /**
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * @param request the request parameters of SuspendHoloWarehouse  SuspendHoloWarehouseRequest
     * @return SuspendHoloWarehouseResponse
     */
    CompletableFuture<SuspendHoloWarehouseResponse> suspendHoloWarehouse(SuspendHoloWarehouseRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnBindLeaderInstance  UnBindLeaderInstanceRequest
     * @return UnBindLeaderInstanceResponse
     */
    CompletableFuture<UnBindLeaderInstanceResponse> unBindLeaderInstance(UnBindLeaderInstanceRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAutoUpgrade  UpdateAutoUpgradeRequest
     * @return UpdateAutoUpgradeResponse
     */
    CompletableFuture<UpdateAutoUpgradeResponse> updateAutoUpgrade(UpdateAutoUpgradeRequest request);

    /**
     * @param request the request parameters of UpdateBackupDataDesc  UpdateBackupDataDescRequest
     * @return UpdateBackupDataDescResponse
     */
    CompletableFuture<UpdateBackupDataDescResponse> updateBackupDataDesc(UpdateBackupDataDescRequest request);

    /**
     * @param request the request parameters of UpdateHoloWebLoginSetting  UpdateHoloWebLoginSettingRequest
     * @return UpdateHoloWebLoginSettingResponse
     */
    CompletableFuture<UpdateHoloWebLoginSettingResponse> updateHoloWebLoginSetting(UpdateHoloWebLoginSettingRequest request);

    /**
     * @param request the request parameters of UpdateInstanceName  UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    CompletableFuture<UpdateInstanceNameResponse> updateInstanceName(UpdateInstanceNameRequest request);

    /**
     * @param request the request parameters of UpdateInstanceNetworkType  UpdateInstanceNetworkTypeRequest
     * @return UpdateInstanceNetworkTypeResponse
     */
    CompletableFuture<UpdateInstanceNetworkTypeResponse> updateInstanceNetworkType(UpdateInstanceNetworkTypeRequest request);

    /**
     * @param request the request parameters of UpdateInstancePort  UpdateInstancePortRequest
     * @return UpdateInstancePortResponse
     */
    CompletableFuture<UpdateInstancePortResponse> updateInstancePort(UpdateInstancePortRequest request);

    /**
     * @param request the request parameters of UpdateMaintenanceWindow  UpdateMaintenanceWindowRequest
     * @return UpdateMaintenanceWindowResponse
     */
    CompletableFuture<UpdateMaintenanceWindowResponse> updateMaintenanceWindow(UpdateMaintenanceWindowRequest request);

    /**
     * @param request the request parameters of UpdateModelService  UpdateModelServiceRequest
     * @return UpdateModelServiceResponse
     */
    CompletableFuture<UpdateModelServiceResponse> updateModelService(UpdateModelServiceRequest request);

    /**
     * @param request the request parameters of UpdateOperationEventScheduleTime  UpdateOperationEventScheduleTimeRequest
     * @return UpdateOperationEventScheduleTimeResponse
     */
    CompletableFuture<UpdateOperationEventScheduleTimeResponse> updateOperationEventScheduleTime(UpdateOperationEventScheduleTimeRequest request);

    /**
     * @param request the request parameters of UpdateScheduledBackupConfig  UpdateScheduledBackupConfigRequest
     * @return UpdateScheduledBackupConfigResponse
     */
    CompletableFuture<UpdateScheduledBackupConfigResponse> updateScheduledBackupConfig(UpdateScheduledBackupConfigRequest request);

    /**
     * @param request the request parameters of UpdateWarehouseScheduleTask  UpdateWarehouseScheduleTaskRequest
     * @return UpdateWarehouseScheduleTaskResponse
     */
    CompletableFuture<UpdateWarehouseScheduleTaskResponse> updateWarehouseScheduleTask(UpdateWarehouseScheduleTaskRequest request);

    /**
     * @param request the request parameters of UpgradeInstance  UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     */
    CompletableFuture<UpgradeInstanceResponse> upgradeInstance(UpgradeInstanceRequest request);

}
