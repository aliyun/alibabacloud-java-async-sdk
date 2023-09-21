// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dms_enterprise20181101.models.*;
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

    CompletableFuture<AddDesensitizationRuleResponse> addDesensitizationRule(AddDesensitizationRuleRequest request);

    /**
      * You must call this operation as a DMS administrator, a database administrator (DBA), or a workspace administrator.
      * Usage notes:
      * *   Before you call this operation to add a user as a task flow developer, make sure that you have added the user as a workspace member.
      * *   You cannot call this operation to transfer the ownership of a task flow. To transfer the ownership of a task flow, call the [ChangLhDagOwner](~~424761~~) operation.
      * *   For more information about workspace roles and permissions, see [Manage permissions on a workspace](~~410893~~).
      *
     */
    CompletableFuture<AddLhMembersResponse> addLhMembers(AddLhMembersRequest request);

    CompletableFuture<AddLogicTableRouteConfigResponse> addLogicTableRouteConfig(AddLogicTableRouteConfigRequest request);

    /**
      * When you add directed edges for a task node, take note of the following limits:
      * 1. The endpoints of the specified edge exist in the Directed Acyclic Graph (DAG) of the task flow specified by DagId.
      * 2. After a backward edge is added, the DAG does not contain loops.
      *
     */
    CompletableFuture<AddTaskFlowEdgesResponse> addTaskFlowEdges(AddTaskFlowEdgesRequest request);

    CompletableFuture<AnalyzeSQLLineageResponse> analyzeSQLLineage(AnalyzeSQLLineageRequest request);

    CompletableFuture<ApproveOrderResponse> approveOrder(ApproveOrderRequest request);

    /**
      * During a data backfill, task flows are run in sequence based on their dates. You can specify whether task flows are run in chronological or reverse chronological order. After the data backfill is complete, you can specify a date or date range, and a node range to run task flows.
      *
     */
    CompletableFuture<BackFillResponse> backFill(BackFillRequest request);

    CompletableFuture<BuyPayAsYouGoOrderResponse> buyPayAsYouGoOrder(BuyPayAsYouGoOrderRequest request);

    CompletableFuture<ChangeColumnSecLevelResponse> changeColumnSecLevel(ChangeColumnSecLevelRequest request);

    CompletableFuture<ChangeColumnSecurityLevelResponse> changeColumnSecurityLevel(ChangeColumnSecurityLevelRequest request);

    /**
      * Usage notes:
      * *   If you call this operation to transfer the ownership of a published task flow, the ownership transfer does not take effect.
      * *   You can call the [ReDeployLhDagVersion](~~424712~~) operation to redeploy a published version of a task flow.
      *
     */
    CompletableFuture<ChangeLhDagOwnerResponse> changeLhDagOwner(ChangeLhDagOwnerRequest request);

    CompletableFuture<CloseOrderResponse> closeOrder(CloseOrderRequest request);

    /**
      * You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](~~324212~~).
      *
     */
    CompletableFuture<CreateAuthorityTemplateResponse> createAuthorityTemplate(CreateAuthorityTemplateRequest request);

    CompletableFuture<CreateDataArchiveOrderResponse> createDataArchiveOrder(CreateDataArchiveOrderRequest request);

    /**
      * For more information about the Normal Data Modify feature, see [Change regular data](~~58419~~).
      *
     */
    CompletableFuture<CreateDataCorrectOrderResponse> createDataCorrectOrder(CreateDataCorrectOrderRequest request);

    /**
      * For more information about the historical data cleaning, see [Clear historical data](~~162507~~).
      * This operation can be used only for MySQL databases.
      *
     */
    CompletableFuture<CreateDataCronClearOrderResponse> createDataCronClearOrder(CreateDataCronClearOrderRequest request);

    CompletableFuture<CreateDataExportOrderResponse> createDataExportOrder(CreateDataExportOrderRequest request);

    /**
      * For more information about the Large Data Import feature, see [Import data](~~161439~~).
      *
     */
    CompletableFuture<CreateDataImportOrderResponse> createDataImportOrder(CreateDataImportOrderRequest request);

    /**
      * This operation is available only for instances that are managed in Security Collaboration mode.
      *
     */
    CompletableFuture<CreateDataTrackOrderResponse> createDataTrackOrder(CreateDataTrackOrderRequest request);

    CompletableFuture<CreateDatabaseExportOrderResponse> createDatabaseExportOrder(CreateDatabaseExportOrderRequest request);

    /**
      * For more information about the lock-free change feature, see [Overview](~~207847~~).
      * This operation can be used only for instances that are managed in Stable Change or Security Collaboration mode. For more information, see [Change data without the need to lock tables](~~96145~~) and [Change schemas without locking tables](~~98373~~).
      *
     */
    CompletableFuture<CreateFreeLockCorrectOrderResponse> createFreeLockCorrectOrder(CreateFreeLockCorrectOrderRequest request);

    /**
      * *   The workspace name must be unique within a tenant. If a workspace with the same name already exists within the tenant, the call may fail.
      * *   You can call the [GetLhSpaceByName](~~424379~~) operation to query whether a workspace with a specific name already exists as a DMS administrator or database administrator (DBA).
      *
     */
    CompletableFuture<CreateLakeHouseSpaceResponse> createLakeHouseSpace(CreateLakeHouseSpaceRequest request);

    CompletableFuture<CreateLogicDatabaseResponse> createLogicDatabase(CreateLogicDatabaseRequest request);

    /**
      * To facilitate ticket creation, you can call the following dedicated operations to create some types of tickets:
      * *   [CreateDataCorrectOrder](~~208388~~): creates a regular data change ticket.
      * *   [CreateDataCronClearOrder](~~208385~~): creates a ticket to clear historical data.
      * *   [CreateDataImportOrder](~~208387~~): creates a data import ticket.
      * *   [CreateFreeLockCorrectOrder](~~208386~~): creates a lock-free change ticket.
      *
     */
    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    CompletableFuture<CreateProcCorrectOrderResponse> createProcCorrectOrder(CreateProcCorrectOrderRequest request);

    /**
      * - The database instance runs the MySQL or MariaDB database engine. For example, the database instance can be an ApsaraDB RDS for MySQL instance, a PolarDB for MySQL cluster, a Distributed Relational Database Service (DRDS) cluster, or an AnalyticDB for MySQL cluster. The database instance can also be a self-managed MySQL or MariaDB database, or a MySQL or MariaDB database in a third-party cloud.
      * - The database instance resides in the China (Hangzhou) or China (Beijing) region.
      * - You are a Data Management (DMS) administrator, a database administrator (DBA), or the owner of the database instance.
      *
     */
    CompletableFuture<CreateProxyResponse> createProxy(CreateProxyRequest request);

    /**
      * - The data security protection feature is enabled for the instance.
      * - Your user role is the administrator role, DBA role, or the owner of data security protection for the current instance.
      *
     */
    CompletableFuture<CreateProxyAccessResponse> createProxyAccess(CreateProxyAccessRequest request);

    CompletableFuture<CreatePublishGroupTaskResponse> createPublishGroupTask(CreatePublishGroupTaskRequest request);

    /**
      * For more information about the SQL review feature, see [SQL review](~~60374~~).
      *
     */
    CompletableFuture<CreateSQLReviewOrderResponse> createSQLReviewOrder(CreateSQLReviewOrderRequest request);

    CompletableFuture<CreateScenarioResponse> createScenario(CreateScenarioRequest request);

    CompletableFuture<CreateStandardGroupResponse> createStandardGroup(CreateStandardGroupRequest request);

    CompletableFuture<CreateStructSyncOrderResponse> createStructSyncOrder(CreateStructSyncOrderRequest request);

    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    CompletableFuture<CreateTaskFlowResponse> createTaskFlow(CreateTaskFlowRequest request);

    CompletableFuture<CreateUploadFileJobResponse> createUploadFileJob(CreateUploadFileJobRequest request);

    CompletableFuture<CreateUploadOSSFileJobResponse> createUploadOSSFileJob(CreateUploadOSSFileJobRequest request);

    /**
      * Note: You can call this operation only to remove a database instance from the instance list of DMS. The instance is not deleted or shut down.
      *
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteLakeHouseSpaceResponse> deleteLakeHouseSpace(DeleteLakeHouseSpaceRequest request);

    /**
      * You must call this operation as a DMS administrator, a database administrator (DBA), or a workspace administrator.
      * You cannot call this operation to transfer the ownership of a task flow. To transfer the ownership of a task flow, call the [ChangLhDagOwner](~~424761~~) operation.
      *
     */
    CompletableFuture<DeleteLhMembersResponse> deleteLhMembers(DeleteLhMembersRequest request);

    CompletableFuture<DeleteLogicDatabaseResponse> deleteLogicDatabase(DeleteLogicDatabaseRequest request);

    CompletableFuture<DeleteLogicTableRouteConfigResponse> deleteLogicTableRouteConfig(DeleteLogicTableRouteConfigRequest request);

    /**
      * After you disable this feature, your DB instance loses the JDBC protocol. All authorization information is recycled.
      *
     */
    CompletableFuture<DeleteProxyResponse> deleteProxy(DeleteProxyRequest request);

    CompletableFuture<DeleteProxyAccessResponse> deleteProxyAccess(DeleteProxyAccessRequest request);

    /**
      * When you call this operation, make sure that no task flow is specified in the business scenario.
      *
     */
    CompletableFuture<DeleteScenarioResponse> deleteScenario(DeleteScenarioRequest request);

    CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request);

    CompletableFuture<DeleteTaskFlowResponse> deleteTaskFlow(DeleteTaskFlowRequest request);

    /**
      * This operation is used for multi-condition query. You can call it to delete the edges of a specified task flow that meet all specified conditions.
      *
     */
    CompletableFuture<DeleteTaskFlowEdgesByConditionResponse> deleteTaskFlowEdgesByCondition(DeleteTaskFlowEdgesByConditionRequest request);

    /**
      * The effect of deleting a user by calling this operation is the same as that of deleting a user by choosing System Management > User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to delete a user that is no longer used from DMS Enterprise. After the user is deleted, the data source permission, data owner configuration, and database administrator (DBA) configuration of the corresponding Alibaba Cloud account or Resource Access Management (RAM) user are revoked and become invalid.
      * >  This operation only removes the association of the Alibaba Cloud account or RAM user with DMS Enterprise of the enterprise, rather than actually deleting the Alibaba Cloud account or RAM user. After the user is deleted, the Alibaba Cloud account or RAM user cannot log on to DMS Enterprise, unless the user is added to DMS Enterprise again.
      *
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
      * The effect of disabling a user by calling this operation is the same as that of disabling a user by choosing System Management > User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to disable a user that is temporarily not used in DMS Enterprise. After the user is disabled, the data source permission, data owner configuration, and database administrator (DBA) configuration of the corresponding Alibaba Cloud account or Resource Access Management (RAM) user are revoked and become invalid.
      * >  This operation only stops the Alibaba Cloud account or RAM user from logging on to DMS Enterprise of the enterprise, rather than actually disabling the Alibaba Cloud account or RAM user. After the user is disabled, the Alibaba Cloud account or RAM user cannot log on to DMS Enterprise, unless the user is enabled again. The disabled user, however, still exists in DMS Enterprise.
      *
     */
    CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request);

    CompletableFuture<DownloadDataTrackResultResponse> downloadDataTrackResult(DownloadDataTrackResultRequest request);

    CompletableFuture<EditLogicDatabaseResponse> editLogicDatabase(EditLogicDatabaseRequest request);

    /**
      * The effect of enabling a user by calling this operation is the same as that of enabling a user by choosing System Management > User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to enable a user that has been disabled in DMS Enterprise. After the user is enabled, the corresponding Alibaba Cloud account or Resource Access Management (RAM) user can continue to log on to DMS Enterprise and perform relevant operations.
      * >  This operation only enables the Alibaba Cloud account or RAM user to log on to DMS Enterprise of the enterprise and perform relevant operations, rather than granting other permissions to the Alibaba Cloud account or RAM user.
      *
     */
    CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request);

    CompletableFuture<ExecuteDataCorrectResponse> executeDataCorrect(ExecuteDataCorrectRequest request);

    CompletableFuture<ExecuteDataExportResponse> executeDataExport(ExecuteDataExportRequest request);

    /**
      * You can call this operation only for instances that are managed in Security Collaboration mode.
      *
     */
    CompletableFuture<ExecuteScriptResponse> executeScript(ExecuteScriptRequest request);

    /**
      * If the security rules of an instance indicate that a ticket must be approved before you perform schema synchronization, you can call the [SubmitStructSyncOrderApproval](~~206166~~) operation to submit the ticket for approval.
      * >  You can call the [GetStructSyncJobDetail](~~206160~~) operation to query whether you need to submit a ticket for approval.
      *
     */
    CompletableFuture<ExecuteStructSyncResponse> executeStructSync(ExecuteStructSyncRequest request);

    CompletableFuture<GetApprovalDetailResponse> getApprovalDetail(GetApprovalDetailRequest request);

    /**
      * You must be a Data Management (DMS) administrator or a database administrator (DBA). For more information about how to view system roles, see [View system roles](~~324212~~).
      *
     */
    CompletableFuture<GetAuthorityTemplateResponse> getAuthorityTemplate(GetAuthorityTemplateRequest request);

    /**
      * You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](~~324212~~).
      *
     */
    CompletableFuture<GetAuthorityTemplateItemResponse> getAuthorityTemplateItem(GetAuthorityTemplateItemRequest request);

    CompletableFuture<GetClassificationTemplateResponse> getClassificationTemplate(GetClassificationTemplateRequest request);

    CompletableFuture<GetDBTaskSQLJobLogResponse> getDBTaskSQLJobLog(GetDBTaskSQLJobLogRequest request);

    CompletableFuture<GetDBTopologyResponse> getDBTopology(GetDBTopologyRequest request);

    CompletableFuture<GetDataArchiveCountResponse> getDataArchiveCount(GetDataArchiveCountRequest request);

    CompletableFuture<GetDataArchiveOrderDetailResponse> getDataArchiveOrderDetail(GetDataArchiveOrderDetailRequest request);

    CompletableFuture<GetDataCorrectBackupFilesResponse> getDataCorrectBackupFiles(GetDataCorrectBackupFilesRequest request);

    CompletableFuture<GetDataCorrectOrderDetailResponse> getDataCorrectOrderDetail(GetDataCorrectOrderDetailRequest request);

    CompletableFuture<GetDataCorrectRollbackFileResponse> getDataCorrectRollbackFile(GetDataCorrectRollbackFileRequest request);

    /**
      * This operation applies to [regular data change](~~58419~~) and [batch data import](~~144643~~).
      *
     */
    CompletableFuture<GetDataCorrectSQLFileResponse> getDataCorrectSQLFile(GetDataCorrectSQLFileRequest request);

    CompletableFuture<GetDataCorrectTaskDetailResponse> getDataCorrectTaskDetail(GetDataCorrectTaskDetailRequest request);

    CompletableFuture<GetDataCronClearConfigResponse> getDataCronClearConfig(GetDataCronClearConfigRequest request);

    CompletableFuture<GetDataCronClearTaskDetailListResponse> getDataCronClearTaskDetailList(GetDataCronClearTaskDetailListRequest request);

    CompletableFuture<GetDataExportDownloadURLResponse> getDataExportDownloadURL(GetDataExportDownloadURLRequest request);

    CompletableFuture<GetDataExportOrderDetailResponse> getDataExportOrderDetail(GetDataExportOrderDetailRequest request);

    CompletableFuture<GetDataExportPreCheckDetailResponse> getDataExportPreCheckDetail(GetDataExportPreCheckDetailRequest request);

    /**
      * You can call this operation only if the data is imported in security mode in your data import ticket.
      *
     */
    CompletableFuture<GetDataImportSQLResponse> getDataImportSQL(GetDataImportSQLRequest request);

    CompletableFuture<GetDataTrackJobDegreeResponse> getDataTrackJobDegree(GetDataTrackJobDegreeRequest request);

    CompletableFuture<GetDataTrackJobTableMetaResponse> getDataTrackJobTableMeta(GetDataTrackJobTableMetaRequest request);

    CompletableFuture<GetDataTrackOrderDetailResponse> getDataTrackOrderDetail(GetDataTrackOrderDetailRequest request);

    CompletableFuture<GetDatabaseResponse> getDatabase(GetDatabaseRequest request);

    CompletableFuture<GetDatabaseExportOrderDetailResponse> getDatabaseExportOrderDetail(GetDatabaseExportOrderDetailRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
      * The scheduling cycle of a task flow must be greater than the minimum scheduling cycle configured in the SLA rule for the task flow.
      *
     */
    CompletableFuture<GetIntervalLimitOfSLAResponse> getIntervalLimitOfSLA(GetIntervalLimitOfSLARequest request);

    /**
      * You are a DMS administrator or a database administrator (DBA).
      *
     */
    CompletableFuture<GetLhSpaceByNameResponse> getLhSpaceByName(GetLhSpaceByNameRequest request);

    CompletableFuture<GetLogicDatabaseResponse> getLogicDatabase(GetLogicDatabaseRequest request);

    /**
      * You can call this operation only for database instances whose control mode is Security Collaboration.
      *
     */
    CompletableFuture<GetMetaTableColumnResponse> getMetaTableColumn(GetMetaTableColumnRequest request);

    /**
      * You can call this operation only for database instances whose control mode is Security Collaboration.
      *
     */
    CompletableFuture<GetMetaTableDetailInfoResponse> getMetaTableDetailInfo(GetMetaTableDetailInfoRequest request);

    CompletableFuture<GetOnlineDDLProgressResponse> getOnlineDDLProgress(GetOnlineDDLProgressRequest request);

    /**
      * Prerequisites: You are an administrator of Data Management (DMS) or a security administrator. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to obtain your user role from the RoleIdList parameter that is returned.
      *
     */
    CompletableFuture<GetOpLogResponse> getOpLog(GetOpLogRequest request);

    CompletableFuture<GetOrderAttachmentFileResponse> getOrderAttachmentFile(GetOrderAttachmentFileRequest request);

    CompletableFuture<GetOrderBaseInfoResponse> getOrderBaseInfo(GetOrderBaseInfoRequest request);

    CompletableFuture<GetOwnerApplyOrderDetailResponse> getOwnerApplyOrderDetail(GetOwnerApplyOrderDetailRequest request);

    /**
      * You can call this operation to query the information about tickets that apply for permissions on databases, tables, and sensitive columns.
      *
     */
    CompletableFuture<GetPermApplyOrderDetailResponse> getPermApplyOrderDetail(GetPermApplyOrderDetailRequest request);

    CompletableFuture<GetPhysicalDatabaseResponse> getPhysicalDatabase(GetPhysicalDatabaseRequest request);

    CompletableFuture<GetProxyResponse> getProxy(GetProxyRequest request);

    CompletableFuture<GetProxyAccessResponse> getProxyAccess(GetProxyAccessRequest request);

    CompletableFuture<GetRuleNumLimitOfSLAResponse> getRuleNumLimitOfSLA(GetRuleNumLimitOfSLARequest request);

    /**
      * For more information about the SQL review feature, see [SQL review](~~60374~~).
      *
     */
    CompletableFuture<GetSQLReviewCheckResultStatusResponse> getSQLReviewCheckResultStatus(GetSQLReviewCheckResultStatusRequest request);

    /**
      * For more information about the SQL review feature, see [SQL review](~~60374~~).
      *
     */
    CompletableFuture<GetSQLReviewOptimizeDetailResponse> getSQLReviewOptimizeDetail(GetSQLReviewOptimizeDetailRequest request);

    CompletableFuture<GetStructSyncExecSqlDetailResponse> getStructSyncExecSqlDetail(GetStructSyncExecSqlDetailRequest request);

    CompletableFuture<GetStructSyncJobAnalyzeResultResponse> getStructSyncJobAnalyzeResult(GetStructSyncJobAnalyzeResultRequest request);

    CompletableFuture<GetStructSyncJobDetailResponse> getStructSyncJobDetail(GetStructSyncJobDetailRequest request);

    CompletableFuture<GetStructSyncOrderDetailResponse> getStructSyncOrderDetail(GetStructSyncOrderDetailRequest request);

    CompletableFuture<GetTableDBTopologyResponse> getTableDBTopology(GetTableDBTopologyRequest request);

    CompletableFuture<GetTableTopologyResponse> getTableTopology(GetTableTopologyRequest request);

    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    CompletableFuture<GetTaskFlowGraphResponse> getTaskFlowGraph(GetTaskFlowGraphRequest request);

    CompletableFuture<GetTaskFlowNotificationResponse> getTaskFlowNotification(GetTaskFlowNotificationRequest request);

    CompletableFuture<GetTaskInstanceRelationResponse> getTaskInstanceRelation(GetTaskInstanceRelationRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserActiveTenantResponse> getUserActiveTenant(GetUserActiveTenantRequest request);

    CompletableFuture<GetUserUploadFileJobResponse> getUserUploadFileJob(GetUserUploadFileJobRequest request);

    /**
      * You must be a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](~~324212~~).
      *
     */
    CompletableFuture<GrantTemplateAuthorityResponse> grantTemplateAuthority(GrantTemplateAuthorityRequest request);

    CompletableFuture<GrantUserPermissionResponse> grantUserPermission(GrantUserPermissionRequest request);

    CompletableFuture<InspectProxyAccessSecretResponse> inspectProxyAccessSecret(InspectProxyAccessSecretRequest request);

    CompletableFuture<ListClassificationTemplatesResponse> listClassificationTemplates(ListClassificationTemplatesRequest request);

    /**
      * You can call this operation only for database instances whose control mode is Security Collaboration.
      *
     */
    CompletableFuture<ListColumnsResponse> listColumns(ListColumnsRequest request);

    CompletableFuture<ListDAGVersionsResponse> listDAGVersions(ListDAGVersionsRequest request);

    CompletableFuture<ListDBTaskSQLJobResponse> listDBTaskSQLJob(ListDBTaskSQLJobRequest request);

    CompletableFuture<ListDBTaskSQLJobDetailResponse> listDBTaskSQLJobDetail(ListDBTaskSQLJobDetailRequest request);

    CompletableFuture<ListDDLPublishRecordsResponse> listDDLPublishRecords(ListDDLPublishRecordsRequest request);

    /**
      * For more information about the Normal Data Modify feature, see [Change regular data](~~58419~~).
      *
     */
    CompletableFuture<ListDataCorrectPreCheckDBResponse> listDataCorrectPreCheckDB(ListDataCorrectPreCheckDBRequest request);

    /**
      * For more information about the Normal Data Modify feature, see [Change regular data](~~58419~~).
      *
     */
    CompletableFuture<ListDataCorrectPreCheckSQLResponse> listDataCorrectPreCheckSQL(ListDataCorrectPreCheckSQLRequest request);

    /**
      * You can call this operation only if the data is imported in security mode in your data import ticket.
      *
     */
    CompletableFuture<ListDataImportSQLPreCheckDetailResponse> listDataImportSQLPreCheckDetail(ListDataImportSQLPreCheckDetailRequest request);

    /**
      * You can call this operation only if the data is imported in security mode in your data import ticket.
      *
     */
    CompletableFuture<ListDataImportSQLTypeResponse> listDataImportSQLType(ListDataImportSQLTypeRequest request);

    CompletableFuture<ListDatabaseUserPermssionsResponse> listDatabaseUserPermssions(ListDatabaseUserPermssionsRequest request);

    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    CompletableFuture<ListDefaultSLARulesResponse> listDefaultSLARules(ListDefaultSLARulesRequest request);

    CompletableFuture<ListDesensitizationRuleResponse> listDesensitizationRule(ListDesensitizationRuleRequest request);

    CompletableFuture<ListEffectiveOrdersResponse> listEffectiveOrders(ListEffectiveOrdersRequest request);

    CompletableFuture<ListIndexesResponse> listIndexes(ListIndexesRequest request);

    CompletableFuture<ListInstanceLoginAuditLogResponse> listInstanceLoginAuditLog(ListInstanceLoginAuditLogRequest request);

    CompletableFuture<ListInstanceUserPermissionsResponse> listInstanceUserPermissions(ListInstanceUserPermissionsRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
      * *   Before you call this operation, make sure that you have the access permissions on the workspace. If you do not have the access permissions on the workspace, you can contact a DMS administrator, database administrator (DBA), or workspace administrator to add you as a member of the workspace. The [AddLhMembers](~~424759~~) operation can be called to add a workspace member.
      * *   If you are a DMS administrator or a workspace administrator, you can query the business scenarios and task flows related to a user in a workspace based on the user ID.
      *
     */
    CompletableFuture<ListLhTaskFlowAndScenarioResponse> listLhTaskFlowAndScenario(ListLhTaskFlowAndScenarioRequest request);

    CompletableFuture<ListLogicDatabasesResponse> listLogicDatabases(ListLogicDatabasesRequest request);

    CompletableFuture<ListLogicTableRouteConfigResponse> listLogicTableRouteConfig(ListLogicTableRouteConfigRequest request);

    CompletableFuture<ListLogicTablesResponse> listLogicTables(ListLogicTablesRequest request);

    CompletableFuture<ListOrdersResponse> listOrders(ListOrdersRequest request);

    CompletableFuture<ListProxiesResponse> listProxies(ListProxiesRequest request);

    CompletableFuture<ListProxyAccessesResponse> listProxyAccesses(ListProxyAccessesRequest request);

    CompletableFuture<ListProxySQLExecAuditLogResponse> listProxySQLExecAuditLog(ListProxySQLExecAuditLogRequest request);

    CompletableFuture<ListSLARulesResponse> listSLARules(ListSLARulesRequest request);

    CompletableFuture<ListSQLExecAuditLogResponse> listSQLExecAuditLog(ListSQLExecAuditLogRequest request);

    /**
      * For more information about the SQL review feature, see [SQL review](~~60374~~).
      *
     */
    CompletableFuture<ListSQLReviewOriginSQLResponse> listSQLReviewOriginSQL(ListSQLReviewOriginSQLRequest request);

    CompletableFuture<ListScenariosResponse> listScenarios(ListScenariosRequest request);

    CompletableFuture<ListSensitiveColumnsResponse> listSensitiveColumns(ListSensitiveColumnsRequest request);

    CompletableFuture<ListSensitiveColumnsDetailResponse> listSensitiveColumnsDetail(ListSensitiveColumnsDetailRequest request);

    CompletableFuture<ListSensitiveDataAuditLogResponse> listSensitiveDataAuditLog(ListSensitiveDataAuditLogRequest request);

    CompletableFuture<ListSensitivityLevelResponse> listSensitivityLevel(ListSensitivityLevelRequest request);

    CompletableFuture<ListStandardGroupsResponse> listStandardGroups(ListStandardGroupsRequest request);

    /**
      * You can call this operation only for database instances whose control mode is Security Collaboration.
      *
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    CompletableFuture<ListTaskFlowResponse> listTaskFlow(ListTaskFlowRequest request);

    CompletableFuture<ListTaskFlowConstantsResponse> listTaskFlowConstants(ListTaskFlowConstantsRequest request);

    CompletableFuture<ListTaskFlowCooperatorsResponse> listTaskFlowCooperators(ListTaskFlowCooperatorsRequest request);

    /**
      * This operation is used for multi-condition query. You can call this operation to query the edges of a specified task flow that meet all specified conditions.
      *
     */
    CompletableFuture<ListTaskFlowEdgesByConditionResponse> listTaskFlowEdgesByCondition(ListTaskFlowEdgesByConditionRequest request);

    CompletableFuture<ListTaskFlowInstanceResponse> listTaskFlowInstance(ListTaskFlowInstanceRequest request);

    CompletableFuture<ListTaskFlowTimeVariablesResponse> listTaskFlowTimeVariables(ListTaskFlowTimeVariablesRequest request);

    CompletableFuture<ListTaskFlowsByPageResponse> listTaskFlowsByPage(ListTaskFlowsByPageRequest request);

    CompletableFuture<ListTasksInTaskFlowResponse> listTasksInTaskFlow(ListTasksInTaskFlowRequest request);

    CompletableFuture<ListUserPermissionsResponse> listUserPermissions(ListUserPermissionsRequest request);

    CompletableFuture<ListUserTenantsResponse> listUserTenants(ListUserTenantsRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListWorkFlowNodesResponse> listWorkFlowNodes(ListWorkFlowNodesRequest request);

    CompletableFuture<ListWorkFlowTemplatesResponse> listWorkFlowTemplates(ListWorkFlowTemplatesRequest request);

    CompletableFuture<MakeTaskFlowInstanceSuccessResponse> makeTaskFlowInstanceSuccess(MakeTaskFlowInstanceSuccessRequest request);

    CompletableFuture<ModifyDataCorrectExecSQLResponse> modifyDataCorrectExecSQL(ModifyDataCorrectExecSQLRequest request);

    CompletableFuture<ModifyDesensitizationStrategyResponse> modifyDesensitizationStrategy(ModifyDesensitizationStrategyRequest request);

    CompletableFuture<MoveTaskFlowToScenarioResponse> moveTaskFlowToScenario(MoveTaskFlowToScenarioRequest request);

    CompletableFuture<OfflineTaskFlowResponse> offlineTaskFlow(OfflineTaskFlowRequest request);

    CompletableFuture<PauseDataCorrectSQLJobResponse> pauseDataCorrectSQLJob(PauseDataCorrectSQLJobRequest request);

    CompletableFuture<PublishAndDeployTaskFlowResponse> publishAndDeployTaskFlow(PublishAndDeployTaskFlowRequest request);

    CompletableFuture<QueryDataTrackResultDownloadStatusResponse> queryDataTrackResultDownloadStatus(QueryDataTrackResultDownloadStatusRequest request);

    CompletableFuture<ReDeployLhDagVersionResponse> reDeployLhDagVersion(ReDeployLhDagVersionRequest request);

    CompletableFuture<ReRunTaskFlowInstanceResponse> reRunTaskFlowInstance(ReRunTaskFlowInstanceRequest request);

    CompletableFuture<RefundPayAsYouGoOrderResponse> refundPayAsYouGoOrder(RefundPayAsYouGoOrderRequest request);

    /**
      * Prerequisites: You are a DMS administrator or a database administrator (DBA). You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to query your user role from the RoleIdList parameter that is returned.
      *
     */
    CompletableFuture<RegisterInstanceResponse> registerInstance(RegisterInstanceRequest request);

    /**
      * If you are an **administrator** in Data Management (DMS), you can call this operation to register a user for your enterprise. To view users that are assigned the administrator role, perform the following steps: Log on to the DMS console. In the top navigation bar, click O&M. In the left-side navigation pane, click User.
      *
     */
    CompletableFuture<RegisterUserResponse> registerUser(RegisterUserRequest request);

    CompletableFuture<RestartDataCorrectSQLJobResponse> restartDataCorrectSQLJob(RestartDataCorrectSQLJobRequest request);

    /**
      * You can call this operation only for task flows that are suspended.
      *
     */
    CompletableFuture<ResumeTaskFlowInstanceResponse> resumeTaskFlowInstance(ResumeTaskFlowInstanceRequest request);

    CompletableFuture<RetryDataCorrectPreCheckResponse> retryDataCorrectPreCheck(RetryDataCorrectPreCheckRequest request);

    /**
      * You must be a database administrator (DBA) or a DMS administrator. For more information about how to view system roles, see [View system roles](~~324212~~).
      *
     */
    CompletableFuture<RevokeTemplateAuthorityResponse> revokeTemplateAuthority(RevokeTemplateAuthorityRequest request);

    CompletableFuture<RevokeUserPermissionResponse> revokeUserPermission(RevokeUserPermissionRequest request);

    CompletableFuture<SearchDataTrackResultResponse> searchDataTrackResult(SearchDataTrackResultRequest request);

    CompletableFuture<SearchDatabaseResponse> searchDatabase(SearchDatabaseRequest request);

    /**
      * You can call this operation only for database instances that are managed in Security Collaboration mode.
      *
     */
    CompletableFuture<SearchTableResponse> searchTable(SearchTableRequest request);

    CompletableFuture<SetOwnersResponse> setOwners(SetOwnersRequest request);

    CompletableFuture<SkipDataCorrectRowCheckResponse> skipDataCorrectRowCheck(SkipDataCorrectRowCheckRequest request);

    CompletableFuture<StopTaskFlowInstanceResponse> stopTaskFlowInstance(StopTaskFlowInstanceRequest request);

    CompletableFuture<SubmitOrderApprovalResponse> submitOrderApproval(SubmitOrderApprovalRequest request);

    CompletableFuture<SubmitStructSyncOrderApprovalResponse> submitStructSyncOrderApproval(SubmitStructSyncOrderApprovalRequest request);

    CompletableFuture<SuspendTaskFlowInstanceResponse> suspendTaskFlowInstance(SuspendTaskFlowInstanceRequest request);

    CompletableFuture<SyncDatabaseMetaResponse> syncDatabaseMeta(SyncDatabaseMetaRequest request);

    /**
      * You can call this operation only for database instances whose control mode is Security Collaboration.
      *
     */
    CompletableFuture<SyncInstanceMetaResponse> syncInstanceMeta(SyncInstanceMetaRequest request);

    /**
      * You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](~~324212~~).
      *
     */
    CompletableFuture<UpdateAuthorityTemplateResponse> updateAuthorityTemplate(UpdateAuthorityTemplateRequest request);

    /**
      * Before you call the UpdateInstance operation, call the [GetInstance](~~141567~~) or [ListInstances](~~141936~~) operation to obtain the complete information about the instance.
      *
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
      * SLA rules take effect after task flows are deployed and published.
      *
     */
    CompletableFuture<UpdateSLARulesResponse> updateSLARules(UpdateSLARulesRequest request);

    CompletableFuture<UpdateScenarioResponse> updateScenario(UpdateScenarioRequest request);

    /**
      * You can call this operation to configure a failed task or rerun a task.
      *
     */
    CompletableFuture<UpdateTaskConfigResponse> updateTaskConfig(UpdateTaskConfigRequest request);

    /**
      * You can call this operation to modify node configurations.
      *
     */
    CompletableFuture<UpdateTaskContentResponse> updateTaskContent(UpdateTaskContentRequest request);

    CompletableFuture<UpdateTaskFlowConstantsResponse> updateTaskFlowConstants(UpdateTaskFlowConstantsRequest request);

    CompletableFuture<UpdateTaskFlowCooperatorsResponse> updateTaskFlowCooperators(UpdateTaskFlowCooperatorsRequest request);

    /**
      * ###
      * The edges can be updated only when the following conditions are met:
      * 1.  The specified edge exists in the directed acyclic graph (DAG) of the task flow specified by DagId.
      * 2.  The specified edge nodes exist in the DAG of the task flow specified by DagId.
      * 3.  After the update, rings do not exist in the DAG.
      *
     */
    CompletableFuture<UpdateTaskFlowEdgesResponse> updateTaskFlowEdges(UpdateTaskFlowEdgesRequest request);

    CompletableFuture<UpdateTaskFlowNameAndDescResponse> updateTaskFlowNameAndDesc(UpdateTaskFlowNameAndDescRequest request);

    CompletableFuture<UpdateTaskFlowNotificationResponse> updateTaskFlowNotification(UpdateTaskFlowNotificationRequest request);

    /**
      * Note: The new owner of the task flow must belong to the same tenant as the previous owner.
      *
     */
    CompletableFuture<UpdateTaskFlowOwnerResponse> updateTaskFlowOwner(UpdateTaskFlowOwnerRequest request);

    /**
      * You can call this operation to perform a full update. For incremental updates, see AddTaskFlowEdges, UpdateTaskFlowEdges, and DeleteTaskFlowEdgesByMultiCondition.
      *
     */
    CompletableFuture<UpdateTaskFlowRelationsResponse> updateTaskFlowRelations(UpdateTaskFlowRelationsRequest request);

    /**
      * You can call this operation to update the scheduling properties for a task flow in the editing state. You can configure a **timed scheduling** task flow or an **event scheduling** task flow. When you configure a **timed scheduling** task flow, you can choose from one-time scheduling or periodic scheduling. When you configure an **event scheduling** task flow, you can subscribe to task flows or task flow nodes.****\\
      * After you update the scheduling properties, you need to publish and deploy the task flow again. The new task flow instance will run based on the updated scheduling properties.
      *
     */
    CompletableFuture<UpdateTaskFlowScheduleResponse> updateTaskFlowSchedule(UpdateTaskFlowScheduleRequest request);

    CompletableFuture<UpdateTaskFlowTimeVariablesResponse> updateTaskFlowTimeVariables(UpdateTaskFlowTimeVariablesRequest request);

    CompletableFuture<UpdateTaskNameResponse> updateTaskName(UpdateTaskNameRequest request);

    /**
      * Only nodes of single-instance SQL assignment, script code, and ECS remote command have output variables.
      *
     */
    CompletableFuture<UpdateTaskOutputResponse> updateTaskOutput(UpdateTaskOutputRequest request);

    CompletableFuture<UpdateTaskTimeVariablesResponse> updateTaskTimeVariables(UpdateTaskTimeVariablesRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
