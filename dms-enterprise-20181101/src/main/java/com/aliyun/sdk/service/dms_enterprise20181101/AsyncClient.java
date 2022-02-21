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

    CompletableFuture<AddLogicTableRouteConfigResponse> addLogicTableRouteConfig(AddLogicTableRouteConfigRequest request);

    CompletableFuture<ApproveOrderResponse> approveOrder(ApproveOrderRequest request);

    CompletableFuture<ChangeColumnSecLevelResponse> changeColumnSecLevel(ChangeColumnSecLevelRequest request);

    CompletableFuture<CloseOrderResponse> closeOrder(CloseOrderRequest request);

    CompletableFuture<CreateDataCorrectOrderResponse> createDataCorrectOrder(CreateDataCorrectOrderRequest request);

    CompletableFuture<CreateDataCronClearOrderResponse> createDataCronClearOrder(CreateDataCronClearOrderRequest request);

    CompletableFuture<CreateDataImportOrderResponse> createDataImportOrder(CreateDataImportOrderRequest request);

    CompletableFuture<CreateFreeLockCorrectOrderResponse> createFreeLockCorrectOrder(CreateFreeLockCorrectOrderRequest request);

    CompletableFuture<CreateLogicDatabaseResponse> createLogicDatabase(CreateLogicDatabaseRequest request);

    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    CompletableFuture<CreateProxyResponse> createProxy(CreateProxyRequest request);

    CompletableFuture<CreateProxyAccessResponse> createProxyAccess(CreateProxyAccessRequest request);

    CompletableFuture<CreatePublishGroupTaskResponse> createPublishGroupTask(CreatePublishGroupTaskRequest request);

    CompletableFuture<CreateSQLReviewOrderResponse> createSQLReviewOrder(CreateSQLReviewOrderRequest request);

    CompletableFuture<CreateStructSyncOrderResponse> createStructSyncOrder(CreateStructSyncOrderRequest request);

    CompletableFuture<CreateUploadFileJobResponse> createUploadFileJob(CreateUploadFileJobRequest request);

    CompletableFuture<CreateUploadOSSFileJobResponse> createUploadOSSFileJob(CreateUploadOSSFileJobRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteLogicDatabaseResponse> deleteLogicDatabase(DeleteLogicDatabaseRequest request);

    CompletableFuture<DeleteLogicTableRouteConfigResponse> deleteLogicTableRouteConfig(DeleteLogicTableRouteConfigRequest request);

    CompletableFuture<DeleteProxyResponse> deleteProxy(DeleteProxyRequest request);

    CompletableFuture<DeleteProxyAccessResponse> deleteProxyAccess(DeleteProxyAccessRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request);

    CompletableFuture<EditLogicDatabaseResponse> editLogicDatabase(EditLogicDatabaseRequest request);

    CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request);

    CompletableFuture<ExecuteDataCorrectResponse> executeDataCorrect(ExecuteDataCorrectRequest request);

    CompletableFuture<ExecuteDataExportResponse> executeDataExport(ExecuteDataExportRequest request);

    CompletableFuture<ExecuteScriptResponse> executeScript(ExecuteScriptRequest request);

    CompletableFuture<ExecuteStructSyncResponse> executeStructSync(ExecuteStructSyncRequest request);

    CompletableFuture<GetApprovalDetailResponse> getApprovalDetail(GetApprovalDetailRequest request);

    CompletableFuture<GetDBTaskSQLJobLogResponse> getDBTaskSQLJobLog(GetDBTaskSQLJobLogRequest request);

    CompletableFuture<GetDBTopologyResponse> getDBTopology(GetDBTopologyRequest request);

    CompletableFuture<GetDataCorrectBackupFilesResponse> getDataCorrectBackupFiles(GetDataCorrectBackupFilesRequest request);

    CompletableFuture<GetDataCorrectOrderDetailResponse> getDataCorrectOrderDetail(GetDataCorrectOrderDetailRequest request);

    CompletableFuture<GetDataCorrectSQLFileResponse> getDataCorrectSQLFile(GetDataCorrectSQLFileRequest request);

    CompletableFuture<GetDataCorrectTaskDetailResponse> getDataCorrectTaskDetail(GetDataCorrectTaskDetailRequest request);

    CompletableFuture<GetDataCronClearTaskDetailListResponse> getDataCronClearTaskDetailList(GetDataCronClearTaskDetailListRequest request);

    CompletableFuture<GetDataExportDownloadURLResponse> getDataExportDownloadURL(GetDataExportDownloadURLRequest request);

    CompletableFuture<GetDataExportOrderDetailResponse> getDataExportOrderDetail(GetDataExportOrderDetailRequest request);

    CompletableFuture<GetDatabaseResponse> getDatabase(GetDatabaseRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetLogicDatabaseResponse> getLogicDatabase(GetLogicDatabaseRequest request);

    CompletableFuture<GetMetaTableColumnResponse> getMetaTableColumn(GetMetaTableColumnRequest request);

    CompletableFuture<GetMetaTableDetailInfoResponse> getMetaTableDetailInfo(GetMetaTableDetailInfoRequest request);

    CompletableFuture<GetOpLogResponse> getOpLog(GetOpLogRequest request);

    CompletableFuture<GetOrderBaseInfoResponse> getOrderBaseInfo(GetOrderBaseInfoRequest request);

    CompletableFuture<GetOwnerApplyOrderDetailResponse> getOwnerApplyOrderDetail(GetOwnerApplyOrderDetailRequest request);

    CompletableFuture<GetPermApplyOrderDetailResponse> getPermApplyOrderDetail(GetPermApplyOrderDetailRequest request);

    CompletableFuture<GetPhysicalDatabaseResponse> getPhysicalDatabase(GetPhysicalDatabaseRequest request);

    CompletableFuture<GetProxyResponse> getProxy(GetProxyRequest request);

    CompletableFuture<GetSQLReviewCheckResultStatusResponse> getSQLReviewCheckResultStatus(GetSQLReviewCheckResultStatusRequest request);

    CompletableFuture<GetSQLReviewOptimizeDetailResponse> getSQLReviewOptimizeDetail(GetSQLReviewOptimizeDetailRequest request);

    CompletableFuture<GetSparkJobDetailResponse> getSparkJobDetail(GetSparkJobDetailRequest request);

    CompletableFuture<GetSparkJobDriverLogResponse> getSparkJobDriverLog(GetSparkJobDriverLogRequest request);

    CompletableFuture<GetSparkJobExecutorLogsResponse> getSparkJobExecutorLogs(GetSparkJobExecutorLogsRequest request);

    CompletableFuture<GetSparkJobLogResponse> getSparkJobLog(GetSparkJobLogRequest request);

    CompletableFuture<GetStructSyncExecSqlDetailResponse> getStructSyncExecSqlDetail(GetStructSyncExecSqlDetailRequest request);

    CompletableFuture<GetStructSyncJobAnalyzeResultResponse> getStructSyncJobAnalyzeResult(GetStructSyncJobAnalyzeResultRequest request);

    CompletableFuture<GetStructSyncJobDetailResponse> getStructSyncJobDetail(GetStructSyncJobDetailRequest request);

    CompletableFuture<GetStructSyncOrderDetailResponse> getStructSyncOrderDetail(GetStructSyncOrderDetailRequest request);

    CompletableFuture<GetTableDBTopologyResponse> getTableDBTopology(GetTableDBTopologyRequest request);

    CompletableFuture<GetTableTopologyResponse> getTableTopology(GetTableTopologyRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserActiveTenantResponse> getUserActiveTenant(GetUserActiveTenantRequest request);

    CompletableFuture<GetUserUploadFileJobResponse> getUserUploadFileJob(GetUserUploadFileJobRequest request);

    CompletableFuture<GrantUserPermissionResponse> grantUserPermission(GrantUserPermissionRequest request);

    CompletableFuture<InspectProxyAccessSecretResponse> inspectProxyAccessSecret(InspectProxyAccessSecretRequest request);

    CompletableFuture<KillSparkJobResponse> killSparkJob(KillSparkJobRequest request);

    CompletableFuture<ListColumnsResponse> listColumns(ListColumnsRequest request);

    CompletableFuture<ListDBTaskSQLJobResponse> listDBTaskSQLJob(ListDBTaskSQLJobRequest request);

    CompletableFuture<ListDBTaskSQLJobDetailResponse> listDBTaskSQLJobDetail(ListDBTaskSQLJobDetailRequest request);

    CompletableFuture<ListDDLPublishRecordsResponse> listDDLPublishRecords(ListDDLPublishRecordsRequest request);

    CompletableFuture<ListDataCorrectPreCheckDBResponse> listDataCorrectPreCheckDB(ListDataCorrectPreCheckDBRequest request);

    CompletableFuture<ListDataCorrectPreCheckSQLResponse> listDataCorrectPreCheckSQL(ListDataCorrectPreCheckSQLRequest request);

    CompletableFuture<ListDatabaseUserPermssionsResponse> listDatabaseUserPermssions(ListDatabaseUserPermssionsRequest request);

    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    CompletableFuture<ListIndexesResponse> listIndexes(ListIndexesRequest request);

    CompletableFuture<ListInstanceLoginAuditLogResponse> listInstanceLoginAuditLog(ListInstanceLoginAuditLogRequest request);

    CompletableFuture<ListInstanceUserPermissionsResponse> listInstanceUserPermissions(ListInstanceUserPermissionsRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListLogicDatabasesResponse> listLogicDatabases(ListLogicDatabasesRequest request);

    CompletableFuture<ListLogicTableRouteConfigResponse> listLogicTableRouteConfig(ListLogicTableRouteConfigRequest request);

    CompletableFuture<ListLogicTablesResponse> listLogicTables(ListLogicTablesRequest request);

    CompletableFuture<ListOrdersResponse> listOrders(ListOrdersRequest request);

    CompletableFuture<ListProxiesResponse> listProxies(ListProxiesRequest request);

    CompletableFuture<ListProxyAccessesResponse> listProxyAccesses(ListProxyAccessesRequest request);

    CompletableFuture<ListProxySQLExecAuditLogResponse> listProxySQLExecAuditLog(ListProxySQLExecAuditLogRequest request);

    CompletableFuture<ListSQLExecAuditLogResponse> listSQLExecAuditLog(ListSQLExecAuditLogRequest request);

    CompletableFuture<ListSQLReviewOriginSQLResponse> listSQLReviewOriginSQL(ListSQLReviewOriginSQLRequest request);

    CompletableFuture<ListSensitiveColumnsResponse> listSensitiveColumns(ListSensitiveColumnsRequest request);

    CompletableFuture<ListSensitiveColumnsDetailResponse> listSensitiveColumnsDetail(ListSensitiveColumnsDetailRequest request);

    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    CompletableFuture<ListUserPermissionsResponse> listUserPermissions(ListUserPermissionsRequest request);

    CompletableFuture<ListUserTenantsResponse> listUserTenants(ListUserTenantsRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListWorkFlowNodesResponse> listWorkFlowNodes(ListWorkFlowNodesRequest request);

    CompletableFuture<ListWorkFlowTemplatesResponse> listWorkFlowTemplates(ListWorkFlowTemplatesRequest request);

    CompletableFuture<ModifyDataCorrectExecSQLResponse> modifyDataCorrectExecSQL(ModifyDataCorrectExecSQLRequest request);

    CompletableFuture<PauseDataCorrectSQLJobResponse> pauseDataCorrectSQLJob(PauseDataCorrectSQLJobRequest request);

    CompletableFuture<RegisterInstanceResponse> registerInstance(RegisterInstanceRequest request);

    CompletableFuture<RegisterUserResponse> registerUser(RegisterUserRequest request);

    CompletableFuture<RestartDataCorrectSQLJobResponse> restartDataCorrectSQLJob(RestartDataCorrectSQLJobRequest request);

    CompletableFuture<RetryDataCorrectPreCheckResponse> retryDataCorrectPreCheck(RetryDataCorrectPreCheckRequest request);

    CompletableFuture<RevokeUserPermissionResponse> revokeUserPermission(RevokeUserPermissionRequest request);

    CompletableFuture<SearchDatabaseResponse> searchDatabase(SearchDatabaseRequest request);

    CompletableFuture<SearchTableResponse> searchTable(SearchTableRequest request);

    CompletableFuture<SetOwnersResponse> setOwners(SetOwnersRequest request);

    CompletableFuture<SubmitOrderApprovalResponse> submitOrderApproval(SubmitOrderApprovalRequest request);

    CompletableFuture<SubmitSparkJobResponse> submitSparkJob(SubmitSparkJobRequest request);

    CompletableFuture<SubmitStructSyncOrderApprovalResponse> submitStructSyncOrderApproval(SubmitStructSyncOrderApprovalRequest request);

    CompletableFuture<SyncDatabaseMetaResponse> syncDatabaseMeta(SyncDatabaseMetaRequest request);

    CompletableFuture<SyncInstanceMetaResponse> syncInstanceMeta(SyncInstanceMetaRequest request);

    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
