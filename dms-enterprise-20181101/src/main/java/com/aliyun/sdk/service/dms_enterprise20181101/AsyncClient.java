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
      * The operation that you want to perform. Set the value to **AddLhMembers**.
      *
     */
    CompletableFuture<AddLhMembersResponse> addLhMembers(AddLhMembersRequest request);

    CompletableFuture<AddLogicTableRouteConfigResponse> addLogicTableRouteConfig(AddLogicTableRouteConfigRequest request);

    /**
      * The ID of the node where the end node of the edge is located.
      *
     */
    CompletableFuture<AddTaskFlowEdgesResponse> addTaskFlowEdges(AddTaskFlowEdgesRequest request);

    CompletableFuture<ApproveOrderResponse> approveOrder(ApproveOrderRequest request);

    /**
      * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
      *
     */
    CompletableFuture<BackFillResponse> backFill(BackFillRequest request);

    CompletableFuture<BuyPayAsYouGoOrderResponse> buyPayAsYouGoOrder(BuyPayAsYouGoOrderRequest request);

    CompletableFuture<ChangeColumnSecLevelResponse> changeColumnSecLevel(ChangeColumnSecLevelRequest request);

    /**
      * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
      *
     */
    CompletableFuture<ChangeLhDagOwnerResponse> changeLhDagOwner(ChangeLhDagOwnerRequest request);

    CompletableFuture<CloseOrderResponse> closeOrder(CloseOrderRequest request);

    /**
      * You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](~~324212~~).
      *
     */
    CompletableFuture<CreateAuthorityTemplateResponse> createAuthorityTemplate(CreateAuthorityTemplateRequest request);

    /**
      * The error code returned if the request fails.
      *
     */
    CompletableFuture<CreateDataCorrectOrderResponse> createDataCorrectOrder(CreateDataCorrectOrderRequest request);

    /**
      * The error code.
      *
     */
    CompletableFuture<CreateDataCronClearOrderResponse> createDataCronClearOrder(CreateDataCronClearOrderRequest request);

    CompletableFuture<CreateDataExportOrderResponse> createDataExportOrder(CreateDataExportOrderRequest request);

    /**
      * The key of the attachment that contains the SQL statements used to roll back the data import. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key from the value of the AttachmentKey parameter.
      * >  This parameter is required if you set the **RollbackSqlType** parameter to **ATTACHMENT**.
      *
     */
    CompletableFuture<CreateDataImportOrderResponse> createDataImportOrder(CreateDataImportOrderRequest request);

    CompletableFuture<CreateDataTrackOrderResponse> createDataTrackOrder(CreateDataTrackOrderRequest request);

    CompletableFuture<CreateDatabaseExportOrderResponse> createDatabaseExportOrder(CreateDatabaseExportOrderRequest request);

    /**
      * The SQL statements that you want to execute to change data.
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
      * The error code.
      *
     */
    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    CompletableFuture<CreateProxyResponse> createProxy(CreateProxyRequest request);

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
      * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.
      *
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteLakeHouseSpaceResponse> deleteLakeHouseSpace(DeleteLakeHouseSpaceRequest request);

    /**
      * The ID of the user to be removed. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to obtain the user ID.
      *
     */
    CompletableFuture<DeleteLhMembersResponse> deleteLhMembers(DeleteLhMembersRequest request);

    CompletableFuture<DeleteLogicDatabaseResponse> deleteLogicDatabase(DeleteLogicDatabaseRequest request);

    CompletableFuture<DeleteLogicTableRouteConfigResponse> deleteLogicTableRouteConfig(DeleteLogicTableRouteConfigRequest request);

    CompletableFuture<DeleteProxyResponse> deleteProxy(DeleteProxyRequest request);

    CompletableFuture<DeleteProxyAccessResponse> deleteProxyAccess(DeleteProxyAccessRequest request);

    /**
      * The error code returned if the request failed.
      *
     */
    CompletableFuture<DeleteScenarioResponse> deleteScenario(DeleteScenarioRequest request);

    CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request);

    CompletableFuture<DeleteTaskFlowResponse> deleteTaskFlow(DeleteTaskFlowRequest request);

    /**
      * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
      *
     */
    CompletableFuture<DeleteTaskFlowEdgesByConditionResponse> deleteTaskFlowEdgesByCondition(DeleteTaskFlowEdgesByConditionRequest request);

    /**
      * DeleteUser
      *
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
      * The UID of the Alibaba Cloud account.
      *
     */
    CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request);

    CompletableFuture<DownloadDataTrackResultResponse> downloadDataTrackResult(DownloadDataTrackResultRequest request);

    CompletableFuture<EditLogicDatabaseResponse> editLogicDatabase(EditLogicDatabaseRequest request);

    CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request);

    CompletableFuture<ExecuteDataCorrectResponse> executeDataCorrect(ExecuteDataCorrectRequest request);

    CompletableFuture<ExecuteDataExportResponse> executeDataExport(ExecuteDataExportRequest request);

    /**
      * The SQL statements to be executed. Data query language (DQL) statements, data definition language (DDL) statements, and data manipulation language (DML) statements are supported. The control mode of the instance that you want to query determines whether you can execute DDL and DML statements.
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

    CompletableFuture<GetDBTaskSQLJobLogResponse> getDBTaskSQLJobLog(GetDBTaskSQLJobLogRequest request);

    CompletableFuture<GetDBTopologyResponse> getDBTopology(GetDBTopologyRequest request);

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

    CompletableFuture<GetDataImportSQLResponse> getDataImportSQL(GetDataImportSQLRequest request);

    CompletableFuture<GetDataTrackJobDegreeResponse> getDataTrackJobDegree(GetDataTrackJobDegreeRequest request);

    CompletableFuture<GetDataTrackJobTableMetaResponse> getDataTrackJobTableMeta(GetDataTrackJobTableMetaRequest request);

    CompletableFuture<GetDataTrackOrderDetailResponse> getDataTrackOrderDetail(GetDataTrackOrderDetailRequest request);

    CompletableFuture<GetDatabaseResponse> getDatabase(GetDatabaseRequest request);

    CompletableFuture<GetDatabaseExportOrderDetailResponse> getDatabaseExportOrderDetail(GetDatabaseExportOrderDetailRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
      * The minimum scheduling cycle. Unit: minutes.
      *
     */
    CompletableFuture<GetIntervalLimitOfSLAResponse> getIntervalLimitOfSLA(GetIntervalLimitOfSLARequest request);

    /**
      * The ID of the workspace.
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
      * The error message returned if the request failed.
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
      * The number of entries to return on each page.
      *
     */
    CompletableFuture<ListDataCorrectPreCheckDBResponse> listDataCorrectPreCheckDB(ListDataCorrectPreCheckDBRequest request);

    /**
      * The precheck information about SQL statements.
      *
     */
    CompletableFuture<ListDataCorrectPreCheckSQLResponse> listDataCorrectPreCheckSQL(ListDataCorrectPreCheckSQLRequest request);

    CompletableFuture<ListDataImportSQLPreCheckDetailResponse> listDataImportSQLPreCheckDetail(ListDataImportSQLPreCheckDetailRequest request);

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
      * The operation that you want to perform. Set the value to **ListLhTaskFlowAndScenario**.
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
      * The total number of the SQL statements.
      *
     */
    CompletableFuture<ListSQLReviewOriginSQLResponse> listSQLReviewOriginSQL(ListSQLReviewOriginSQLRequest request);

    CompletableFuture<ListScenariosResponse> listScenarios(ListScenariosRequest request);

    CompletableFuture<ListSensitiveColumnsResponse> listSensitiveColumns(ListSensitiveColumnsRequest request);

    CompletableFuture<ListSensitiveColumnsDetailResponse> listSensitiveColumnsDetail(ListSensitiveColumnsDetailRequest request);

    CompletableFuture<ListSensitiveDataAuditLogResponse> listSensitiveDataAuditLog(ListSensitiveDataAuditLogRequest request);

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
      * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
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
      * WB01220505
      *
     */
    CompletableFuture<RegisterInstanceResponse> registerInstance(RegisterInstanceRequest request);

    /**
      * The ID of the tenant.
      * >  To query ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
      *
     */
    CompletableFuture<RegisterUserResponse> registerUser(RegisterUserRequest request);

    CompletableFuture<RestartDataCorrectSQLJobResponse> restartDataCorrectSQLJob(RestartDataCorrectSQLJobRequest request);

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

    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
      * The ID of the task node.
      *
     */
    CompletableFuture<UpdateSLARulesResponse> updateSLARules(UpdateSLARulesRequest request);

    CompletableFuture<UpdateScenarioResponse> updateScenario(UpdateScenarioRequest request);

    CompletableFuture<UpdateTaskConfigResponse> updateTaskConfig(UpdateTaskConfigRequest request);

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
      * The ID of the tenant.
      * >  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
      *
     */
    CompletableFuture<UpdateTaskFlowOwnerResponse> updateTaskFlowOwner(UpdateTaskFlowOwnerRequest request);

    /**
      * The ID of the end node on the edge.
      *
     */
    CompletableFuture<UpdateTaskFlowRelationsResponse> updateTaskFlowRelations(UpdateTaskFlowRelationsRequest request);

    CompletableFuture<UpdateTaskFlowScheduleResponse> updateTaskFlowSchedule(UpdateTaskFlowScheduleRequest request);

    CompletableFuture<UpdateTaskFlowTimeVariablesResponse> updateTaskFlowTimeVariables(UpdateTaskFlowTimeVariablesRequest request);

    CompletableFuture<UpdateTaskNameResponse> updateTaskName(UpdateTaskNameRequest request);

    /**
      * The output variables for the task.
      *
     */
    CompletableFuture<UpdateTaskOutputResponse> updateTaskOutput(UpdateTaskOutputRequest request);

    CompletableFuture<UpdateTaskTimeVariablesResponse> updateTaskTimeVariables(UpdateTaskTimeVariablesRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
