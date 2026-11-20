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
     * <p>Warning: This API operation incurs fees. Make sure that you fully understand the billing methods and pricing of Hologres before you call this operation.
     * &lt;props=&quot;china&quot;&gt;- For more information about Hologres billing, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/billing-overview">Billing overview</a>.
     * &lt;props=&quot;intl&quot;&gt; - For more information about Hologres billing, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.</p>
     * </blockquote>
     * <ul>
     * <li>When you create a Hologres instance, you must specify the region and zone where the instance resides. A region may contain multiple zones, as follows:</li>
     * </ul>
     * <pre><code>   cn-hangzhou (Hangzhou): cn-hangzhou-h, cn-hangzhou-j, cn-hangzhou-k
     *    cn-shanghai (Shanghai): cn-shanghai-e, cn-shanghai-f, cn-shanghai-l
     *    cn-beijing (Beijing): cn-beijing-i, cn-beijing-g, cn-beijing-l
     *    cn-zhangjiakou (Zhangjiakou): cn-zhangjiakou-b
     *    cn-shenzhen (Shenzhen): cn-shenzhen-d, cn-shenzhen-f, cn-shenzhen-e
     *    cn-wulanchabu (Ulanqab): cn-wulanchabu-a
     *    cn-hongkong (Hong Kong): cn-hongkong-b, cn-hongkong-d
     *    cn-shanghai-finance-1 (Shanghai Finance Cloud): cn-shanghai-finance-1z, cn-shanghai-finance-1f
     *    cn-hangzhou-finance (Hangzhou Finance Cloud): cn-hangzhou-finance-k
     *    cn-shenzhen-finance-1 (Shenzhen Finance Cloud): cn-shenzhen-finance-1d
     *    ap-northeast-1 (Japan): ap-northeast-1a
     *    ap-southeast-1 (Singapore): ap-southeast-1c, ap-southeast-1a
     *    ap-southeast-3 (Kuala Lumpur): ap-southeast-3b
     *    ap-southeast-5 (Jakarta): ap-southeast-5b
     *    eu-central-1 (Frankfurt): eu-central-1a
     *    us-east-1 (Silicon Valley): us-east-1a
     *    us-west-1 (Virginia): us-west-1b
     * </code></pre>
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
     * <b>description</b> :
     * <p>Creating a model service requires multiple parameters. For model creation of Alibaba Cloud Model Studio models, invoke ListModelCatalog to query model parameters. For model creation of Hologres AI nodes, invoke GetAvailableModelsResource to query model parameters.</p>
     * 
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
     * <b>description</b> :
     * <p>Creates a time-based elastic plan for a compute group of a specified Hologres instance. Before calling this operation, call ListWarehouses to obtain the compute group ID.</p>
     * 
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
     * <p>Warning: Before calling this operation, carefully read the feature documentation to ensure that you fully understand the prerequisites and the impacts of this operation.</warning>
     * &lt;props=&quot;china&quot;&gt;- After a Hologres instance is released, the data and objects in the instance cannot be recovered. Proceed with caution. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/billing-overview">Billing overview</a>.
     * &lt;props=&quot;intl&quot;&gt;- After a Hologres instance is released, the data and objects in the instance cannot be recovered. Proceed with caution. For more information, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview?spm=a2c63.p38356.0.0.efc33b87i5pDl7">Billing overview</a>.</p>
     * </blockquote>
     * <ul>
     * <li>Only pay-as-you-go instances can be released.
     * &lt;props=&quot;china&quot;&gt;- To unsubscribe from a subscription instance, go to the Unsubscription page in the Alibaba Cloud Management Console. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/subscription">Unsubscribe from subscription instances</a>.</li>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: Before calling this operation, read the feature documentation to ensure that you fully understand the prerequisites and impacts.
     * &lt;props=&quot;china&quot;&gt;- After a Hologres instance is released, the data and objects in the instance cannot be recovered. Proceed with caution. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/billing-overview">Billing overview</a>.
     * &lt;props=&quot;intl&quot;&gt;- After a Hologres instance is released, the data and objects in the instance cannot be recovered. Proceed with caution. For more information, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview?spm=a2c63.p38356.0.0.efc33b87i5pDl7">Billing overview</a>.</p>
     * </blockquote>
     * <ul>
     * <li>Only pay-as-you-go instances can be released.
     * &lt;props=&quot;china&quot;&gt;- To unsubscribe from a subscription instance, go to the Unsubscription Management page in the Alibaba Cloud Management Console. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/subscription">Unsubscribe from a subscription instance</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Disables the OpenAPI SQL execution feature for a specified Hologres instance. After the feature is disabled, all ExecuteStatement calls return an error. You can call EnableExecuteStatement to re-enable it.</p>
     * 
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
     * <b>description</b> :
     * <p>Disables the OpenAPI SQL execution feature for a specified Hologres instance. After the feature is disabled, all ExecuteStatement calls return an error. You can call EnableExecuteStatement to re-enable it.</p>
     * 
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
     * <b>description</b> :
     * <p>删除实例内的用户。删除后该用户不能再登录实例，如需恢复请通过 CreateUser 重新添加。删除前需确认 userName：当前没有列举用户的 OpenAPI 接口，可通过 ExecuteStatement 执行 SELECT rolname FROM pg_roles 查询实例内已有角色，且不能删除当前发起调用的账号自身。</p>
     * 
     * @param request the request parameters of DropUser  DropUserRequest
     * @return DropUserResponse
     */
    CompletableFuture<DropUserResponse> dropUser(DropUserRequest request);

    /**
     * <b>description</b> :
     * <p>Enables SQL execution via OpenAPI for a specified Hologres instance. Once enabled, RAM accounts with the <code>hologram:ExecuteStatement</code> permission can execute SQL statements by calling the <code>ExecuteStatement</code> API. To query the current status, call the <code>GetExecuteStatementEnabled</code> API. To disable the feature, call the <code>DisableExecuteStatement</code> API.</p>
     * 
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
     * <b>description</b> :
     * <p>Enables the OpenAPI SQL execution feature for a specified Hologres instance. After the feature is enabled, RAM users that have the hologram:ExecuteStatement permission can execute SQL statements by calling the ExecuteStatement operation. You can call the GetExecuteStatementEnabled operation to query the current status and call the DisableExecuteStatement operation to disable the feature.</p>
     * 
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
     * <b>description</b> :
     * <p>This API is used to securely execute SQL statements on a Hologres instance by using OpenAPI.
     *   Before you begin, meet the following conditions:</p>
     * <ol>
     * <li>On the instance details page in the console, turn on the Allow SQL Execution by Using OpenAPI switch in the Data Security section.</li>
     * <li>The RAM user used to invoke the API has been granted the hologram:ExecuteStatement permission.
     *   Statements such as SELECT, DDL, and DML are supported. The parameterized query feature with placeholders such as $1 and $2 is supported to prevent SQL injection. By default, a query returns a maximum of 200 rows (up to 1,000 rows) and 10 MB of data. Excess data is truncated, and the truncated field indicates the truncation. The timeout period for a single execution is 30 seconds.</li>
     * </ol>
     * 
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
     * <b>description</b> :
     * <p>This operation checks if the &quot;Allow SQL execution through OpenAPI&quot; feature is enabled for a specified Hologres instance. Returns <code>true</code> if the feature is enabled, and <code>false</code> otherwise. If enabled, you can call the <code>ExecuteStatement</code> operation to execute SQL statements.</p>
     * 
     * @param request the request parameters of GetExecuteStatementEnabled  GetExecuteStatementEnabledRequest
     * @return GetExecuteStatementEnabledResponse
     */
    CompletableFuture<GetExecuteStatementEnabledResponse> getExecuteStatementEnabled(GetExecuteStatementEnabledRequest request);

    /**
     * <b>description</b> :
     * <p>Queries whether the feature that allows SQL execution through OpenAPI is enabled for a specified Hologres instance. A value of true indicates that the feature is enabled, and a value of false indicates that the feature is disabled. After the feature is enabled, you can execute SQL statements by calling the ExecuteStatement operation.</p>
     * 
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
     * <b>description</b> :
     * <p>Retrieves a list of read-only secondary instances bound to a specified Hologres primary instance. instanceId is a path parameter and must be provided when you call this operation.</p>
     * 
     * @param request the request parameters of ListFollowerInstances  ListFollowerInstancesRequest
     * @return ListFollowerInstancesResponse
     */
    CompletableFuture<ListFollowerInstancesResponse> listFollowerInstances(ListFollowerInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Retrieves information about deployed model services on a specific Hologres instance, including but not limited to resource usage such as CPU, GPU, and memory.</li>
     * <li>The <code>instanceId</code> parameter is optional. If not provided, the information of all related instances is returned by default.</li>
     * <li>This operation applies to Hologres AI nodes. Some parameters may be invalid or inapplicable for non-AI nodes.</li>
     * <li>Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/113666.html">billing methods and pricing of Alibaba Cloud Hologres</a> before you call this operation.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Retrieves a list of primary instances that can be bound to a specified Hologres secondary instance. The <code>instanceId</code> parameter is a path parameter and is required.</p>
     * 
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation retrieves a list of elastic scaling events for compute groups of a specified instance.</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters specify the time range for the query. The default values are three days ago and the current time, respectively.</li>
     * <li>The <code>pageSize</code> and <code>pageNumber</code> parameters are used for paging control. The maximum value of <code>pageSize</code> is 100.</li>
     * <li>If the <code>elasticType</code> parameter is not provided, elastic scaling events of all types are returned.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>获取指定计算组型实例下的计算组列表。instanceId 需为计算组型（InstanceType 为 Warehouse）实例，可通过 ListInstances 查询获取。返回结果中的 Name 为计算组名称、Status 为计算组状态（如 kRunning 表示运行中），可用于 RestartHoloWarehouse、SuspendHoloWarehouse 等接口。</p>
     * 
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
     * <p>Warning: This API operation incurs fees. Make sure that you fully understand the billing methods and pricing of Hologres before you call this operation.</warning>
     * &lt;props=&quot;china&quot;&gt;- For more information about Hologres billing, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/billing-overview">Billing overview</a>.
     * &lt;props=&quot;intl&quot;&gt;- For more information about Hologres billing, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.
     * &lt;props=&quot;china&quot;&gt;- For more information about Hologres renewal, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/manage-renewals">Renewal management</a>.
     * &lt;props=&quot;intl&quot;&gt;- For more information about Hologres renewal, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/manage-renewals?spm=a2c63.p38356.0.0.38e731c9VAwtDP">Renewal management</a>.</p>
     * </blockquote>
     * <ul>
     * <li>Renewal applies only to subscription (PrePaid) instances.</li>
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
     * <b>description</b> :
     * <p>重启指定计算组。前置条件：实例处于运行中（Running）状态，可通过 GetInstance 查询 InstanceStatus；计算组处于运行中状态（kRunning），可通过 ListWarehouses 查询 Status 获取计算组名称和当前状态。调用需要实例的 Superuser 权限，重启为异步操作，调用后可再次通过 ListWarehouses 轮询 Status 确认是否完成。</p>
     * 
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
     * <p>Warning: This API operation incurs fees. Make sure that you fully understand the billing methods and pricing of Hologres before you call this operation.
     * &lt;props=&quot;china&quot;&gt;- For more information about Hologres billing, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/billing-overview">Billing overview</a>.
     * &lt;props=&quot;intl&quot;&gt;- For more information about Hologres billing, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.
     * &lt;props=&quot;china&quot;&gt;- The instance is unavailable while its compute resources are being changed. Changing instance storage resources of the instance does not affect its normal use. Do not change instance specifications frequently. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/upgrade-or-downgrade-instance-specifications">Upgrade or downgrade instance specifications</a>.
     * &lt;props=&quot;intl&quot;&gt;- The instance is unavailable while its compute resources are being changed. Changing instance storage resources of the instance does not affect its normal use. Do not change instance specifications frequently. For more information, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/upgrade-or-downgrade-instance-specifications">Upgrade or downgrade instance specifications</a>.</p>
     * </blockquote>
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
     * <b>description</b> :
     * <p>停止指定计算组。前置条件：instanceId 为计算组型（InstanceType 为 Warehouse）且处于运行中状态的实例，可通过 ListInstances 获取；name 为 ListWarehouses 返回的计算组名称，该计算组需处于运行中状态（kRunning）。若该计算组是 Table Group 的主计算组且存在从计算组，则无法停止。调用需要实例的 Superuser 权限，停止为异步操作。</p>
     * 
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
     * <b>description</b> :
     * <p>Model creation for a model service requires a large number of parameters. If you are performing model creation for a Model Studio model, invoke ListModelCatalog to query model parameters. If you are using a Hologres AI node, invoke GetAvailableModelsResource to query model parameters.</p>
     * 
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
     * <b>description</b> :
     * <p>更新计算组分时弹性计划。前置条件：instanceId 对应实例需处于运行中（Running）状态，可通过 GetInstance 查询 InstanceStatus；warehouseId 可通过 ListWarehouses 查询返回的 Id 获取。</p>
     * 
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
