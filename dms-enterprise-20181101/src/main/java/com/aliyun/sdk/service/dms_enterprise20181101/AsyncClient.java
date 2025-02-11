// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dms_enterprise20181101.models.*;
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
     * @param request the request parameters of AddAuthorityTemplateItems  AddAuthorityTemplateItemsRequest
     * @return AddAuthorityTemplateItemsResponse
     */
    CompletableFuture<AddAuthorityTemplateItemsResponse> addAuthorityTemplateItems(AddAuthorityTemplateItemsRequest request);

    /**
     * @param request the request parameters of AddDesensitizationRule  AddDesensitizationRuleRequest
     * @return AddDesensitizationRuleResponse
     */
    CompletableFuture<AddDesensitizationRuleResponse> addDesensitizationRule(AddDesensitizationRuleRequest request);

    /**
     * @param request the request parameters of AddInstance  AddInstanceRequest
     * @return AddInstanceResponse
     */
    CompletableFuture<AddInstanceResponse> addInstance(AddInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You must call this operation as a DMS administrator, a database administrator (DBA), or a workspace administrator.
     * Usage notes:</p>
     * <ul>
     * <li>Before you call this operation to add a user as a task flow developer, make sure that you have added the user as a workspace member.</li>
     * <li>You cannot call this operation to transfer the ownership of a task flow. To transfer the ownership of a task flow, call the <a href="https://help.aliyun.com/document_detail/424761.html">ChangLhDagOwner</a> operation.</li>
     * <li>For more information about workspace roles and permissions, see <a href="https://help.aliyun.com/document_detail/410893.html">Manage permissions on a workspace</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddLhMembers  AddLhMembersRequest
     * @return AddLhMembersResponse
     */
    CompletableFuture<AddLhMembersResponse> addLhMembers(AddLhMembersRequest request);

    /**
     * @param request the request parameters of AddLogicTableRouteConfig  AddLogicTableRouteConfigRequest
     * @return AddLogicTableRouteConfigResponse
     */
    CompletableFuture<AddLogicTableRouteConfigResponse> addLogicTableRouteConfig(AddLogicTableRouteConfigRequest request);

    /**
     * <b>description</b> :
     * <p>When you add directed edges for a task node, take note of the following limits:</p>
     * <ol>
     * <li>The endpoints of the specified edge exist in the Directed Acyclic Graph (DAG) of the task flow specified by DagId.</li>
     * <li>After a backward edge is added, the DAG does not contain loops.</li>
     * </ol>
     * 
     * @param request the request parameters of AddTaskFlowEdges  AddTaskFlowEdgesRequest
     * @return AddTaskFlowEdgesResponse
     */
    CompletableFuture<AddTaskFlowEdgesResponse> addTaskFlowEdges(AddTaskFlowEdgesRequest request);

    /**
     * <b>description</b> :
     * <p>The following conditions must be met before you call this API operation.</p>
     * <ul>
     * <li>The database instance is of one of the following types: ApsaraDB RDS for MySQL, PolarDB for MySQL, AnalyticDB for MySQL, ApsaraDB RDS for PostgreSQL, PolarDB for PostgreSQL, AnalyticDB for PostgreSQL, Oracle, and openGauss.</li>
     * <li>A database instance is managed in Security Collaboration mode. For more information about control modes, see <a href="https://help.aliyun.com/document_detail/151629.html">Control modes</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AnalyzeSQLLineage  AnalyzeSQLLineageRequest
     * @return AnalyzeSQLLineageResponse
     */
    CompletableFuture<AnalyzeSQLLineageResponse> analyzeSQLLineage(AnalyzeSQLLineageRequest request);

    /**
     * @param request the request parameters of ApproveOrder  ApproveOrderRequest
     * @return ApproveOrderResponse
     */
    CompletableFuture<ApproveOrderResponse> approveOrder(ApproveOrderRequest request);

    /**
     * <b>description</b> :
     * <p>During a data backfill, task flows are run in sequence based on their dates. You can specify whether task flows are run in chronological or reverse chronological order. After the data backfill is complete, you can specify a date or date range, and a node range to run task flows.</p>
     * 
     * @param request the request parameters of BackFill  BackFillRequest
     * @return BackFillResponse
     */
    CompletableFuture<BackFillResponse> backFill(BackFillRequest request);

    /**
     * @param request the request parameters of BatchCreateDataLakePartitions  BatchCreateDataLakePartitionsRequest
     * @return BatchCreateDataLakePartitionsResponse
     */
    CompletableFuture<BatchCreateDataLakePartitionsResponse> batchCreateDataLakePartitions(BatchCreateDataLakePartitionsRequest request);

    /**
     * @param request the request parameters of BatchDeleteDataLakePartitions  BatchDeleteDataLakePartitionsRequest
     * @return BatchDeleteDataLakePartitionsResponse
     */
    CompletableFuture<BatchDeleteDataLakePartitionsResponse> batchDeleteDataLakePartitions(BatchDeleteDataLakePartitionsRequest request);

    /**
     * @param request the request parameters of BatchUpdateDataLakePartitions  BatchUpdateDataLakePartitionsRequest
     * @return BatchUpdateDataLakePartitionsResponse
     */
    CompletableFuture<BatchUpdateDataLakePartitionsResponse> batchUpdateDataLakePartitions(BatchUpdateDataLakePartitionsRequest request);

    /**
     * @param request the request parameters of BuyPayAsYouGoOrder  BuyPayAsYouGoOrderRequest
     * @return BuyPayAsYouGoOrderResponse
     */
    CompletableFuture<BuyPayAsYouGoOrderResponse> buyPayAsYouGoOrder(BuyPayAsYouGoOrderRequest request);

    /**
     * @param request the request parameters of ChangeColumnSecLevel  ChangeColumnSecLevelRequest
     * @return ChangeColumnSecLevelResponse
     */
    CompletableFuture<ChangeColumnSecLevelResponse> changeColumnSecLevel(ChangeColumnSecLevelRequest request);

    /**
     * @param request the request parameters of ChangeColumnSecurityLevel  ChangeColumnSecurityLevelRequest
     * @return ChangeColumnSecurityLevelResponse
     */
    CompletableFuture<ChangeColumnSecurityLevelResponse> changeColumnSecurityLevel(ChangeColumnSecurityLevelRequest request);

    /**
     * <b>description</b> :
     * <p>Usage notes:</p>
     * <ul>
     * <li>If you call this operation to transfer the ownership of a published task flow, the ownership transfer does not take effect.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/424712.html">ReDeployLhDagVersion</a> operation to redeploy a published version of a task flow.</li>
     * </ul>
     * 
     * @param request the request parameters of ChangeLhDagOwner  ChangeLhDagOwnerRequest
     * @return ChangeLhDagOwnerResponse
     */
    CompletableFuture<ChangeLhDagOwnerResponse> changeLhDagOwner(ChangeLhDagOwnerRequest request);

    /**
     * @param request the request parameters of CloseOrder  CloseOrderRequest
     * @return CloseOrderResponse
     */
    CompletableFuture<CloseOrderResponse> closeOrder(CloseOrderRequest request);

    /**
     * @param request the request parameters of CreateAbacAuthorization  CreateAbacAuthorizationRequest
     * @return CreateAbacAuthorizationResponse
     */
    CompletableFuture<CreateAbacAuthorizationResponse> createAbacAuthorization(CreateAbacAuthorizationRequest request);

    /**
     * @param request the request parameters of CreateAbacPolicy  CreateAbacPolicyRequest
     * @return CreateAbacPolicyResponse
     */
    CompletableFuture<CreateAbacPolicyResponse> createAbacPolicy(CreateAbacPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see <a href="https://help.aliyun.com/document_detail/324212.html">View system roles</a>.</p>
     * 
     * @param request the request parameters of CreateAuthorityTemplate  CreateAuthorityTemplateRequest
     * @return CreateAuthorityTemplateResponse
     */
    CompletableFuture<CreateAuthorityTemplateResponse> createAuthorityTemplate(CreateAuthorityTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation only for database instances that are managed in Security Collaboration mode.</p>
     * 
     * @param request the request parameters of CreateDataArchiveOrder  CreateDataArchiveOrderRequest
     * @return CreateDataArchiveOrderResponse
     */
    CompletableFuture<CreateDataArchiveOrderResponse> createDataArchiveOrder(CreateDataArchiveOrderRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the Normal Data Modify feature, see <a href="https://help.aliyun.com/document_detail/58419.html">Change regular data</a>.</p>
     * 
     * @param request the request parameters of CreateDataCorrectOrder  CreateDataCorrectOrderRequest
     * @return CreateDataCorrectOrderResponse
     */
    CompletableFuture<CreateDataCorrectOrderResponse> createDataCorrectOrder(CreateDataCorrectOrderRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the historical data cleaning, see <a href="https://help.aliyun.com/document_detail/162507.html">Clear historical data</a>.
     * This operation can be used only for MySQL databases.</p>
     * 
     * @param request the request parameters of CreateDataCronClearOrder  CreateDataCronClearOrderRequest
     * @return CreateDataCronClearOrderResponse
     */
    CompletableFuture<CreateDataCronClearOrderResponse> createDataCronClearOrder(CreateDataCronClearOrderRequest request);

    /**
     * @param request the request parameters of CreateDataExportOrder  CreateDataExportOrderRequest
     * @return CreateDataExportOrderResponse
     */
    CompletableFuture<CreateDataExportOrderResponse> createDataExportOrder(CreateDataExportOrderRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the Large Data Import feature, see <a href="https://help.aliyun.com/document_detail/161439.html">Import data</a>.</p>
     * 
     * @param request the request parameters of CreateDataImportOrder  CreateDataImportOrderRequest
     * @return CreateDataImportOrderResponse
     */
    CompletableFuture<CreateDataImportOrderResponse> createDataImportOrder(CreateDataImportOrderRequest request);

    /**
     * @param request the request parameters of CreateDataLakeDatabase  CreateDataLakeDatabaseRequest
     * @return CreateDataLakeDatabaseResponse
     */
    CompletableFuture<CreateDataLakeDatabaseResponse> createDataLakeDatabase(CreateDataLakeDatabaseRequest request);

    /**
     * @param request the request parameters of CreateDataLakePartition  CreateDataLakePartitionRequest
     * @return CreateDataLakePartitionResponse
     */
    CompletableFuture<CreateDataLakePartitionResponse> createDataLakePartition(CreateDataLakePartitionRequest request);

    /**
     * @param request the request parameters of CreateDataLakeTable  CreateDataLakeTableRequest
     * @return CreateDataLakeTableResponse
     */
    CompletableFuture<CreateDataLakeTableResponse> createDataLakeTable(CreateDataLakeTableRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only for instances that are managed in Security Collaboration mode.</p>
     * 
     * @param request the request parameters of CreateDataTrackOrder  CreateDataTrackOrderRequest
     * @return CreateDataTrackOrderResponse
     */
    CompletableFuture<CreateDataTrackOrderResponse> createDataTrackOrder(CreateDataTrackOrderRequest request);

    /**
     * @param request the request parameters of CreateDatabaseExportOrder  CreateDatabaseExportOrderRequest
     * @return CreateDatabaseExportOrderResponse
     */
    CompletableFuture<CreateDatabaseExportOrderResponse> createDatabaseExportOrder(CreateDatabaseExportOrderRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>workspaceOption</code> 参数指示是否新建工作空间，默认使用已有工作空间。</li>
     * <li>如果选择新建工作空间 (<code>CreateNewInstance</code>)，则必须提供 <code>workspaceName</code> 和 <code>workspaceDescription</code>。</li>
     * <li><code>vpcId</code>, <code>VSwitchID</code>, <code>zoneId</code>, <code>regionCode</code>, <code>ResourceQuota</code>, <code>Replicas</code>, <code>storageType</code>, <code>dbInstanceClass</code>, <code>dbEngineVersion</code>, <code>kvstoreEngineVersion</code> 是必填项。</li>
     * <li>当 <code>storageType</code> 为 <code>oss</code> 时，需要指定 <code>ossBucketResourceId</code> 和 <code>ossPath</code>。</li>
     * <li>如果需要新建数据库实例，则必须提供 <code>instanceAccount</code> 和 <code>instancePassword</code>。</li>
     * <li>预付费模式下，<code>PayPeriodType</code> 和 <code>PayPeriod</code> 必须填写。</li>
     * <li>可以通过设置 <code>dryRun</code> 为 <code>true</code> 来执行预检查而不实际创建实例。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDifyInstance  CreateDifyInstanceRequest
     * @return CreateDifyInstanceResponse
     */
    CompletableFuture<CreateDifyInstanceResponse> createDifyInstance(CreateDifyInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the lock-free change feature, see <a href="https://help.aliyun.com/document_detail/207847.html">Overview</a>.
     * This operation can be used only for instances that are managed in Stable Change or Security Collaboration mode. For more information, see <a href="https://help.aliyun.com/document_detail/96145.html">Change data without the need to lock tables</a> and <a href="https://help.aliyun.com/document_detail/98373.html">Change schemas without locking tables</a>.</p>
     * 
     * @param request the request parameters of CreateFreeLockCorrectOrder  CreateFreeLockCorrectOrderRequest
     * @return CreateFreeLockCorrectOrderResponse
     */
    CompletableFuture<CreateFreeLockCorrectOrderResponse> createFreeLockCorrectOrder(CreateFreeLockCorrectOrderRequest request);

    /**
     * <b>description</b> :
     * <p>  The workspace name must be unique within a tenant. If a workspace with the same name already exists within the tenant, the call may fail.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/424379.html">GetLhSpaceByName</a> operation to query whether a workspace with a specific name already exists as a DMS administrator or database administrator (DBA).</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLakeHouseSpace  CreateLakeHouseSpaceRequest
     * @return CreateLakeHouseSpaceResponse
     */
    CompletableFuture<CreateLakeHouseSpaceResponse> createLakeHouseSpace(CreateLakeHouseSpaceRequest request);

    /**
     * @param request the request parameters of CreateLogicDatabase  CreateLogicDatabaseRequest
     * @return CreateLogicDatabaseResponse
     */
    CompletableFuture<CreateLogicDatabaseResponse> createLogicDatabase(CreateLogicDatabaseRequest request);

    /**
     * <b>description</b> :
     * <p>To facilitate ticket creation, you can call the following dedicated operations to create some types of tickets:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/208388.html">CreateDataCorrectOrder</a>: creates a regular data change ticket.</li>
     * <li><a href="https://help.aliyun.com/document_detail/208385.html">CreateDataCronClearOrder</a>: creates a ticket to clear historical data.</li>
     * <li><a href="https://help.aliyun.com/document_detail/208387.html">CreateDataImportOrder</a>: creates a data import ticket.</li>
     * <li><a href="https://help.aliyun.com/document_detail/208386.html">CreateFreeLockCorrectOrder</a>: creates a lock-free change ticket.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateOrder  CreateOrderRequest
     * @return CreateOrderResponse
     */
    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    /**
     * @param request the request parameters of CreateProcCorrectOrder  CreateProcCorrectOrderRequest
     * @return CreateProcCorrectOrderResponse
     */
    CompletableFuture<CreateProcCorrectOrderResponse> createProcCorrectOrder(CreateProcCorrectOrderRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The database instance runs the MySQL or MariaDB database engine. For example, the database instance can be an ApsaraDB RDS for MySQL instance, a PolarDB for MySQL cluster, a Distributed Relational Database Service (DRDS) cluster, or an AnalyticDB for MySQL cluster. The database instance can also be a self-managed MySQL or MariaDB database, or a MySQL or MariaDB database in a third-party cloud.</li>
     * <li>The database instance resides in the China (Hangzhou) or China (Beijing) region.</li>
     * <li>You are a Data Management (DMS) administrator, a database administrator (DBA), or the owner of the database instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateProxy  CreateProxyRequest
     * @return CreateProxyResponse
     */
    CompletableFuture<CreateProxyResponse> createProxy(CreateProxyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The data security protection feature is enabled for the instance.</li>
     * <li>Your user role is the administrator role, DBA role, or the owner of data security protection for the current instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateProxyAccess  CreateProxyAccessRequest
     * @return CreateProxyAccessResponse
     */
    CompletableFuture<CreateProxyAccessResponse> createProxyAccess(CreateProxyAccessRequest request);

    /**
     * @param request the request parameters of CreatePublishGroupTask  CreatePublishGroupTaskRequest
     * @return CreatePublishGroupTaskResponse
     */
    CompletableFuture<CreatePublishGroupTaskResponse> createPublishGroupTask(CreatePublishGroupTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for database instances that are managed in Security Collaboration mode.
     * For more information about the SQL review feature, see <a href="https://help.aliyun.com/document_detail/60374.html">SQL review</a>.</p>
     * 
     * @param request the request parameters of CreateSQLReviewOrder  CreateSQLReviewOrderRequest
     * @return CreateSQLReviewOrderResponse
     */
    CompletableFuture<CreateSQLReviewOrderResponse> createSQLReviewOrder(CreateSQLReviewOrderRequest request);

    /**
     * @param request the request parameters of CreateScenario  CreateScenarioRequest
     * @return CreateScenarioResponse
     */
    CompletableFuture<CreateScenarioResponse> createScenario(CreateScenarioRequest request);

    /**
     * @param request the request parameters of CreateStandardGroup  CreateStandardGroupRequest
     * @return CreateStandardGroupResponse
     */
    CompletableFuture<CreateStandardGroupResponse> createStandardGroup(CreateStandardGroupRequest request);

    /**
     * @param request the request parameters of CreateStructSyncOrder  CreateStructSyncOrderRequest
     * @return CreateStructSyncOrderResponse
     */
    CompletableFuture<CreateStructSyncOrderResponse> createStructSyncOrder(CreateStructSyncOrderRequest request);

    /**
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    /**
     * @param request the request parameters of CreateTaskFlow  CreateTaskFlowRequest
     * @return CreateTaskFlowResponse
     */
    CompletableFuture<CreateTaskFlowResponse> createTaskFlow(CreateTaskFlowRequest request);

    /**
     * @param request the request parameters of CreateUploadFileJob  CreateUploadFileJobRequest
     * @return CreateUploadFileJobResponse
     */
    CompletableFuture<CreateUploadFileJobResponse> createUploadFileJob(CreateUploadFileJobRequest request);

    /**
     * @param request the request parameters of CreateUploadOSSFileJob  CreateUploadOSSFileJobRequest
     * @return CreateUploadOSSFileJobResponse
     */
    CompletableFuture<CreateUploadOSSFileJobResponse> createUploadOSSFileJob(CreateUploadOSSFileJobRequest request);

    /**
     * @param request the request parameters of DeleteAbacAuthorization  DeleteAbacAuthorizationRequest
     * @return DeleteAbacAuthorizationResponse
     */
    CompletableFuture<DeleteAbacAuthorizationResponse> deleteAbacAuthorization(DeleteAbacAuthorizationRequest request);

    /**
     * @param request the request parameters of DeleteAbacPolicy  DeleteAbacPolicyRequest
     * @return DeleteAbacPolicyResponse
     */
    CompletableFuture<DeleteAbacPolicyResponse> deleteAbacPolicy(DeleteAbacPolicyRequest request);

    /**
     * @param request the request parameters of DeleteAuthorityTemplate  DeleteAuthorityTemplateRequest
     * @return DeleteAuthorityTemplateResponse
     */
    CompletableFuture<DeleteAuthorityTemplateResponse> deleteAuthorityTemplate(DeleteAuthorityTemplateRequest request);

    /**
     * @param request the request parameters of DeleteDataLakeDatabase  DeleteDataLakeDatabaseRequest
     * @return DeleteDataLakeDatabaseResponse
     */
    CompletableFuture<DeleteDataLakeDatabaseResponse> deleteDataLakeDatabase(DeleteDataLakeDatabaseRequest request);

    /**
     * @param request the request parameters of DeleteDataLakePartition  DeleteDataLakePartitionRequest
     * @return DeleteDataLakePartitionResponse
     */
    CompletableFuture<DeleteDataLakePartitionResponse> deleteDataLakePartition(DeleteDataLakePartitionRequest request);

    /**
     * @param request the request parameters of DeleteDataLakeTable  DeleteDataLakeTableRequest
     * @return DeleteDataLakeTableResponse
     */
    CompletableFuture<DeleteDataLakeTableResponse> deleteDataLakeTable(DeleteDataLakeTableRequest request);

    /**
     * <b>description</b> :
     * <p>Note: You can call this operation only to remove a database instance from the instance list of DMS. The instance is not deleted or shut down.</p>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteLakeHouseSpace  DeleteLakeHouseSpaceRequest
     * @return DeleteLakeHouseSpaceResponse
     */
    CompletableFuture<DeleteLakeHouseSpaceResponse> deleteLakeHouseSpace(DeleteLakeHouseSpaceRequest request);

    /**
     * <b>description</b> :
     * <p>You must call this operation as a DMS administrator, a database administrator (DBA), or a workspace administrator.
     * You cannot call this operation to transfer the ownership of a task flow. To transfer the ownership of a task flow, call the <a href="https://help.aliyun.com/document_detail/424761.html">ChangLhDagOwner</a> operation.</p>
     * 
     * @param request the request parameters of DeleteLhMembers  DeleteLhMembersRequest
     * @return DeleteLhMembersResponse
     */
    CompletableFuture<DeleteLhMembersResponse> deleteLhMembers(DeleteLhMembersRequest request);

    /**
     * @param request the request parameters of DeleteLogicDatabase  DeleteLogicDatabaseRequest
     * @return DeleteLogicDatabaseResponse
     */
    CompletableFuture<DeleteLogicDatabaseResponse> deleteLogicDatabase(DeleteLogicDatabaseRequest request);

    /**
     * @param request the request parameters of DeleteLogicTableRouteConfig  DeleteLogicTableRouteConfigRequest
     * @return DeleteLogicTableRouteConfigResponse
     */
    CompletableFuture<DeleteLogicTableRouteConfigResponse> deleteLogicTableRouteConfig(DeleteLogicTableRouteConfigRequest request);

    /**
     * <b>description</b> :
     * <p>After you disable this feature, your DB instance loses the JDBC protocol. All authorization information is recycled.</p>
     * 
     * @param request the request parameters of DeleteProxy  DeleteProxyRequest
     * @return DeleteProxyResponse
     */
    CompletableFuture<DeleteProxyResponse> deleteProxy(DeleteProxyRequest request);

    /**
     * @param request the request parameters of DeleteProxyAccess  DeleteProxyAccessRequest
     * @return DeleteProxyAccessResponse
     */
    CompletableFuture<DeleteProxyAccessResponse> deleteProxyAccess(DeleteProxyAccessRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, make sure that no task flow is specified in the business scenario.</p>
     * 
     * @param request the request parameters of DeleteScenario  DeleteScenarioRequest
     * @return DeleteScenarioResponse
     */
    CompletableFuture<DeleteScenarioResponse> deleteScenario(DeleteScenarioRequest request);

    /**
     * @param request the request parameters of DeleteStandardGroup  DeleteStandardGroupRequest
     * @return DeleteStandardGroupResponse
     */
    CompletableFuture<DeleteStandardGroupResponse> deleteStandardGroup(DeleteStandardGroupRequest request);

    /**
     * @param request the request parameters of DeleteTask  DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request);

    /**
     * @param request the request parameters of DeleteTaskFlow  DeleteTaskFlowRequest
     * @return DeleteTaskFlowResponse
     */
    CompletableFuture<DeleteTaskFlowResponse> deleteTaskFlow(DeleteTaskFlowRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used for multi-condition query. You can call it to delete the edges of a specified task flow that meet all specified conditions.</p>
     * 
     * @param request the request parameters of DeleteTaskFlowEdgesByCondition  DeleteTaskFlowEdgesByConditionRequest
     * @return DeleteTaskFlowEdgesByConditionResponse
     */
    CompletableFuture<DeleteTaskFlowEdgesByConditionResponse> deleteTaskFlowEdgesByCondition(DeleteTaskFlowEdgesByConditionRequest request);

    /**
     * <b>description</b> :
     * <p>The effect of deleting a user by calling this operation is the same as that of deleting a user by choosing System Management &gt; User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to delete a user that is no longer used from DMS Enterprise. After the user is deleted, the data source permission, data owner configuration, and database administrator (DBA) configuration of the corresponding Alibaba Cloud account or Resource Access Management (RAM) user are revoked and become invalid.</p>
     * <blockquote>
     * <p> This operation only removes the association of the Alibaba Cloud account or RAM user with DMS Enterprise of the enterprise, rather than actually deleting the Alibaba Cloud account or RAM user. After the user is deleted, the Alibaba Cloud account or RAM user cannot log on to DMS Enterprise, unless the user is added to DMS Enterprise again.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>workspaceOption</code> 参数指示是否新建工作空间，默认使用已有工作空间。</li>
     * <li>如果选择新建工作空间 (<code>CreateNewInstance</code>)，则必须提供 <code>workspaceName</code> 和 <code>workspaceDescription</code>。</li>
     * <li><code>vpcId</code>, <code>VSwitchID</code>, <code>zoneId</code>, <code>regionCode</code>, <code>ResourceQuota</code>, <code>Replicas</code>, <code>storageType</code>, <code>dbInstanceClass</code>, <code>dbEngineVersion</code>, <code>kvstoreEngineVersion</code> 是必填项。</li>
     * <li>当 <code>storageType</code> 为 <code>oss</code> 时，需要指定 <code>ossBucketResourceId</code> 和 <code>ossPath</code>。</li>
     * <li>如果需要新建数据库实例，则必须提供 <code>instanceAccount</code> 和 <code>instancePassword</code>。</li>
     * <li>预付费模式下，<code>PayPeriodType</code> 和 <code>PayPeriod</code> 必须填写。</li>
     * <li>可以通过设置 <code>dryRun</code> 为 <code>true</code> 来执行预检查而不实际创建实例。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDifyDefaultVpc  DescribeDifyDefaultVpcRequest
     * @return DescribeDifyDefaultVpcResponse
     */
    CompletableFuture<DescribeDifyDefaultVpcResponse> describeDifyDefaultVpc(DescribeDifyDefaultVpcRequest request);

    /**
     * <b>description</b> :
     * <p>The effect of disabling a user by calling this operation is the same as that of disabling a user by choosing System Management &gt; User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to disable a user that is temporarily not used in DMS Enterprise. After the user is disabled, the data source permission, data owner configuration, and database administrator (DBA) configuration of the corresponding Alibaba Cloud account or Resource Access Management (RAM) user are revoked and become invalid.</p>
     * <blockquote>
     * <p> This operation only stops the Alibaba Cloud account or RAM user from logging on to DMS Enterprise of the enterprise, rather than actually disabling the Alibaba Cloud account or RAM user. After the user is disabled, the Alibaba Cloud account or RAM user cannot log on to DMS Enterprise, unless the user is enabled again. The disabled user, however, still exists in DMS Enterprise.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DisableUser  DisableUserRequest
     * @return DisableUserResponse
     */
    CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request);

    /**
     * @param request the request parameters of DownloadDataTrackResult  DownloadDataTrackResultRequest
     * @return DownloadDataTrackResultResponse
     */
    CompletableFuture<DownloadDataTrackResultResponse> downloadDataTrackResult(DownloadDataTrackResultRequest request);

    /**
     * @param request the request parameters of EditLogicDatabase  EditLogicDatabaseRequest
     * @return EditLogicDatabaseResponse
     */
    CompletableFuture<EditLogicDatabaseResponse> editLogicDatabase(EditLogicDatabaseRequest request);

    /**
     * <b>description</b> :
     * <p>The effect of enabling a user by calling this operation is the same as that of enabling a user by choosing System Management &gt; User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to enable a user that has been disabled in DMS Enterprise. After the user is enabled, the corresponding Alibaba Cloud account or Resource Access Management (RAM) user can continue to log on to DMS Enterprise and perform relevant operations.</p>
     * <blockquote>
     * <p> This operation only enables the Alibaba Cloud account or RAM user to log on to DMS Enterprise of the enterprise and perform relevant operations, rather than granting other permissions to the Alibaba Cloud account or RAM user.</p>
     * </blockquote>
     * 
     * @param request the request parameters of EnableUser  EnableUserRequest
     * @return EnableUserResponse
     */
    CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request);

    /**
     * @param request the request parameters of ExecuteDataCorrect  ExecuteDataCorrectRequest
     * @return ExecuteDataCorrectResponse
     */
    CompletableFuture<ExecuteDataCorrectResponse> executeDataCorrect(ExecuteDataCorrectRequest request);

    /**
     * @param request the request parameters of ExecuteDataExport  ExecuteDataExportRequest
     * @return ExecuteDataExportResponse
     */
    CompletableFuture<ExecuteDataExportResponse> executeDataExport(ExecuteDataExportRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for instances that are managed in Security Collaboration mode.</p>
     * 
     * @param request the request parameters of ExecuteScript  ExecuteScriptRequest
     * @return ExecuteScriptResponse
     */
    CompletableFuture<ExecuteScriptResponse> executeScript(ExecuteScriptRequest request);

    /**
     * <b>description</b> :
     * <p>If the security rules of an instance indicate that a ticket must be approved before you perform schema synchronization, you can call the <a href="https://help.aliyun.com/document_detail/206166.html">SubmitStructSyncOrderApproval</a> operation to submit the ticket for approval.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/206160.html">GetStructSyncJobDetail</a> operation to query whether you need to submit a ticket for approval.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ExecuteStructSync  ExecuteStructSyncRequest
     * @return ExecuteStructSyncResponse
     */
    CompletableFuture<ExecuteStructSyncResponse> executeStructSync(ExecuteStructSyncRequest request);

    /**
     * @param request the request parameters of GetAbacPolicy  GetAbacPolicyRequest
     * @return GetAbacPolicyResponse
     */
    CompletableFuture<GetAbacPolicyResponse> getAbacPolicy(GetAbacPolicyRequest request);

    /**
     * @param request the request parameters of GetApprovalDetail  GetApprovalDetailRequest
     * @return GetApprovalDetailResponse
     */
    CompletableFuture<GetApprovalDetailResponse> getApprovalDetail(GetApprovalDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You must be a Data Management (DMS) administrator or a database administrator (DBA). For more information about how to view system roles, see <a href="https://help.aliyun.com/document_detail/324212.html">View system roles</a>.</p>
     * 
     * @param request the request parameters of GetAuthorityTemplate  GetAuthorityTemplateRequest
     * @return GetAuthorityTemplateResponse
     */
    CompletableFuture<GetAuthorityTemplateResponse> getAuthorityTemplate(GetAuthorityTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see <a href="https://help.aliyun.com/document_detail/324212.html">View system roles</a>.</p>
     * 
     * @param request the request parameters of GetAuthorityTemplateItem  GetAuthorityTemplateItemRequest
     * @return GetAuthorityTemplateItemResponse
     */
    CompletableFuture<GetAuthorityTemplateItemResponse> getAuthorityTemplateItem(GetAuthorityTemplateItemRequest request);

    /**
     * @param request the request parameters of GetClassificationTemplate  GetClassificationTemplateRequest
     * @return GetClassificationTemplateResponse
     */
    CompletableFuture<GetClassificationTemplateResponse> getClassificationTemplate(GetClassificationTemplateRequest request);

    /**
     * @param request the request parameters of GetDBTaskSQLJobLog  GetDBTaskSQLJobLogRequest
     * @return GetDBTaskSQLJobLogResponse
     */
    CompletableFuture<GetDBTaskSQLJobLogResponse> getDBTaskSQLJobLog(GetDBTaskSQLJobLogRequest request);

    /**
     * @param request the request parameters of GetDBTopology  GetDBTopologyRequest
     * @return GetDBTopologyResponse
     */
    CompletableFuture<GetDBTopologyResponse> getDBTopology(GetDBTopologyRequest request);

    /**
     * @param request the request parameters of GetDataArchiveCount  GetDataArchiveCountRequest
     * @return GetDataArchiveCountResponse
     */
    CompletableFuture<GetDataArchiveCountResponse> getDataArchiveCount(GetDataArchiveCountRequest request);

    /**
     * @param request the request parameters of GetDataArchiveOrderDetail  GetDataArchiveOrderDetailRequest
     * @return GetDataArchiveOrderDetailResponse
     */
    CompletableFuture<GetDataArchiveOrderDetailResponse> getDataArchiveOrderDetail(GetDataArchiveOrderDetailRequest request);

    /**
     * @param request the request parameters of GetDataCorrectBackupFiles  GetDataCorrectBackupFilesRequest
     * @return GetDataCorrectBackupFilesResponse
     */
    CompletableFuture<GetDataCorrectBackupFilesResponse> getDataCorrectBackupFiles(GetDataCorrectBackupFilesRequest request);

    /**
     * @param request the request parameters of GetDataCorrectOrderDetail  GetDataCorrectOrderDetailRequest
     * @return GetDataCorrectOrderDetailResponse
     */
    CompletableFuture<GetDataCorrectOrderDetailResponse> getDataCorrectOrderDetail(GetDataCorrectOrderDetailRequest request);

    /**
     * @param request the request parameters of GetDataCorrectRollbackFile  GetDataCorrectRollbackFileRequest
     * @return GetDataCorrectRollbackFileResponse
     */
    CompletableFuture<GetDataCorrectRollbackFileResponse> getDataCorrectRollbackFile(GetDataCorrectRollbackFileRequest request);

    /**
     * <b>description</b> :
     * <p>This operation applies to <a href="https://help.aliyun.com/document_detail/58419.html">regular data change</a> and <a href="https://help.aliyun.com/document_detail/144643.html">batch data import</a>.</p>
     * 
     * @param request the request parameters of GetDataCorrectSQLFile  GetDataCorrectSQLFileRequest
     * @return GetDataCorrectSQLFileResponse
     */
    CompletableFuture<GetDataCorrectSQLFileResponse> getDataCorrectSQLFile(GetDataCorrectSQLFileRequest request);

    /**
     * @param request the request parameters of GetDataCorrectTaskDetail  GetDataCorrectTaskDetailRequest
     * @return GetDataCorrectTaskDetailResponse
     */
    CompletableFuture<GetDataCorrectTaskDetailResponse> getDataCorrectTaskDetail(GetDataCorrectTaskDetailRequest request);

    /**
     * @param request the request parameters of GetDataCronClearConfig  GetDataCronClearConfigRequest
     * @return GetDataCronClearConfigResponse
     */
    CompletableFuture<GetDataCronClearConfigResponse> getDataCronClearConfig(GetDataCronClearConfigRequest request);

    /**
     * @param request the request parameters of GetDataCronClearTaskDetailList  GetDataCronClearTaskDetailListRequest
     * @return GetDataCronClearTaskDetailListResponse
     */
    CompletableFuture<GetDataCronClearTaskDetailListResponse> getDataCronClearTaskDetailList(GetDataCronClearTaskDetailListRequest request);

    /**
     * @param request the request parameters of GetDataExportDownloadURL  GetDataExportDownloadURLRequest
     * @return GetDataExportDownloadURLResponse
     */
    CompletableFuture<GetDataExportDownloadURLResponse> getDataExportDownloadURL(GetDataExportDownloadURLRequest request);

    /**
     * @param request the request parameters of GetDataExportOrderDetail  GetDataExportOrderDetailRequest
     * @return GetDataExportOrderDetailResponse
     */
    CompletableFuture<GetDataExportOrderDetailResponse> getDataExportOrderDetail(GetDataExportOrderDetailRequest request);

    /**
     * @param request the request parameters of GetDataExportPreCheckDetail  GetDataExportPreCheckDetailRequest
     * @return GetDataExportPreCheckDetailResponse
     */
    CompletableFuture<GetDataExportPreCheckDetailResponse> getDataExportPreCheckDetail(GetDataExportPreCheckDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only if the data is imported in security mode in your data import ticket.</p>
     * 
     * @param request the request parameters of GetDataImportSQL  GetDataImportSQLRequest
     * @return GetDataImportSQLResponse
     */
    CompletableFuture<GetDataImportSQLResponse> getDataImportSQL(GetDataImportSQLRequest request);

    /**
     * @param request the request parameters of GetDataLakeCatalog  GetDataLakeCatalogRequest
     * @return GetDataLakeCatalogResponse
     */
    CompletableFuture<GetDataLakeCatalogResponse> getDataLakeCatalog(GetDataLakeCatalogRequest request);

    /**
     * @param request the request parameters of GetDataLakeDatabase  GetDataLakeDatabaseRequest
     * @return GetDataLakeDatabaseResponse
     */
    CompletableFuture<GetDataLakeDatabaseResponse> getDataLakeDatabase(GetDataLakeDatabaseRequest request);

    /**
     * @param request the request parameters of GetDataLakePartition  GetDataLakePartitionRequest
     * @return GetDataLakePartitionResponse
     */
    CompletableFuture<GetDataLakePartitionResponse> getDataLakePartition(GetDataLakePartitionRequest request);

    /**
     * @param request the request parameters of GetDataLakeTable  GetDataLakeTableRequest
     * @return GetDataLakeTableResponse
     */
    CompletableFuture<GetDataLakeTableResponse> getDataLakeTable(GetDataLakeTableRequest request);

    /**
     * @param request the request parameters of GetDataTrackJobDegree  GetDataTrackJobDegreeRequest
     * @return GetDataTrackJobDegreeResponse
     */
    CompletableFuture<GetDataTrackJobDegreeResponse> getDataTrackJobDegree(GetDataTrackJobDegreeRequest request);

    /**
     * @param request the request parameters of GetDataTrackJobTableMeta  GetDataTrackJobTableMetaRequest
     * @return GetDataTrackJobTableMetaResponse
     */
    CompletableFuture<GetDataTrackJobTableMetaResponse> getDataTrackJobTableMeta(GetDataTrackJobTableMetaRequest request);

    /**
     * @param request the request parameters of GetDataTrackOrderDetail  GetDataTrackOrderDetailRequest
     * @return GetDataTrackOrderDetailResponse
     */
    CompletableFuture<GetDataTrackOrderDetailResponse> getDataTrackOrderDetail(GetDataTrackOrderDetailRequest request);

    /**
     * @param request the request parameters of GetDatabase  GetDatabaseRequest
     * @return GetDatabaseResponse
     */
    CompletableFuture<GetDatabaseResponse> getDatabase(GetDatabaseRequest request);

    /**
     * @param request the request parameters of GetDatabaseExportOrderDetail  GetDatabaseExportOrderDetailRequest
     * @return GetDatabaseExportOrderDetailResponse
     */
    CompletableFuture<GetDatabaseExportOrderDetailResponse> getDatabaseExportOrderDetail(GetDatabaseExportOrderDetailRequest request);

    /**
     * @param request the request parameters of GetDbExportDownloadURL  GetDbExportDownloadURLRequest
     * @return GetDbExportDownloadURLResponse
     */
    CompletableFuture<GetDbExportDownloadURLResponse> getDbExportDownloadURL(GetDbExportDownloadURLRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>The scheduling cycle of a task flow must be greater than the minimum scheduling cycle configured in the SLA rule for the task flow.</p>
     * 
     * @param request the request parameters of GetIntervalLimitOfSLA  GetIntervalLimitOfSLARequest
     * @return GetIntervalLimitOfSLAResponse
     */
    CompletableFuture<GetIntervalLimitOfSLAResponse> getIntervalLimitOfSLA(GetIntervalLimitOfSLARequest request);

    /**
     * <b>description</b> :
     * <p>You are a DMS administrator or a database administrator (DBA).</p>
     * 
     * @param request the request parameters of GetLhSpaceByName  GetLhSpaceByNameRequest
     * @return GetLhSpaceByNameResponse
     */
    CompletableFuture<GetLhSpaceByNameResponse> getLhSpaceByName(GetLhSpaceByNameRequest request);

    /**
     * @param request the request parameters of GetLogicDatabase  GetLogicDatabaseRequest
     * @return GetLogicDatabaseResponse
     */
    CompletableFuture<GetLogicDatabaseResponse> getLogicDatabase(GetLogicDatabaseRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for database instances whose control mode is Security Collaboration.</p>
     * 
     * @param request the request parameters of GetMetaTableColumn  GetMetaTableColumnRequest
     * @return GetMetaTableColumnResponse
     */
    CompletableFuture<GetMetaTableColumnResponse> getMetaTableColumn(GetMetaTableColumnRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for database instances whose control mode is Security Collaboration.</p>
     * 
     * @param request the request parameters of GetMetaTableDetailInfo  GetMetaTableDetailInfoRequest
     * @return GetMetaTableDetailInfoResponse
     */
    CompletableFuture<GetMetaTableDetailInfoResponse> getMetaTableDetailInfo(GetMetaTableDetailInfoRequest request);

    /**
     * @param request the request parameters of GetOnlineDDLProgress  GetOnlineDDLProgressRequest
     * @return GetOnlineDDLProgressResponse
     */
    CompletableFuture<GetOnlineDDLProgressResponse> getOnlineDDLProgress(GetOnlineDDLProgressRequest request);

    /**
     * <b>description</b> :
     * <p>Prerequisites: You are an administrator of Data Management (DMS) or a security administrator. You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> or <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> operation to obtain your user role from the RoleIdList parameter that is returned.</p>
     * 
     * @param request the request parameters of GetOpLog  GetOpLogRequest
     * @return GetOpLogResponse
     */
    CompletableFuture<GetOpLogResponse> getOpLog(GetOpLogRequest request);

    /**
     * @param request the request parameters of GetOrderAttachmentFile  GetOrderAttachmentFileRequest
     * @return GetOrderAttachmentFileResponse
     */
    CompletableFuture<GetOrderAttachmentFileResponse> getOrderAttachmentFile(GetOrderAttachmentFileRequest request);

    /**
     * @param request the request parameters of GetOrderBaseInfo  GetOrderBaseInfoRequest
     * @return GetOrderBaseInfoResponse
     */
    CompletableFuture<GetOrderBaseInfoResponse> getOrderBaseInfo(GetOrderBaseInfoRequest request);

    /**
     * @param request the request parameters of GetOwnerApplyOrderDetail  GetOwnerApplyOrderDetailRequest
     * @return GetOwnerApplyOrderDetailResponse
     */
    CompletableFuture<GetOwnerApplyOrderDetailResponse> getOwnerApplyOrderDetail(GetOwnerApplyOrderDetailRequest request);

    /**
     * @param request the request parameters of GetPagedInstance  GetPagedInstanceRequest
     * @return GetPagedInstanceResponse
     */
    CompletableFuture<GetPagedInstanceResponse> getPagedInstance(GetPagedInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about tickets that apply for permissions on databases, tables, and sensitive columns.</p>
     * 
     * @param request the request parameters of GetPermApplyOrderDetail  GetPermApplyOrderDetailRequest
     * @return GetPermApplyOrderDetailResponse
     */
    CompletableFuture<GetPermApplyOrderDetailResponse> getPermApplyOrderDetail(GetPermApplyOrderDetailRequest request);

    /**
     * @param request the request parameters of GetPhysicalDatabase  GetPhysicalDatabaseRequest
     * @return GetPhysicalDatabaseResponse
     */
    CompletableFuture<GetPhysicalDatabaseResponse> getPhysicalDatabase(GetPhysicalDatabaseRequest request);

    /**
     * @param request the request parameters of GetProxy  GetProxyRequest
     * @return GetProxyResponse
     */
    CompletableFuture<GetProxyResponse> getProxy(GetProxyRequest request);

    /**
     * @param request the request parameters of GetProxyAccess  GetProxyAccessRequest
     * @return GetProxyAccessResponse
     */
    CompletableFuture<GetProxyAccessResponse> getProxyAccess(GetProxyAccessRequest request);

    /**
     * @param request the request parameters of GetRuleNumLimitOfSLA  GetRuleNumLimitOfSLARequest
     * @return GetRuleNumLimitOfSLAResponse
     */
    CompletableFuture<GetRuleNumLimitOfSLAResponse> getRuleNumLimitOfSLA(GetRuleNumLimitOfSLARequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the SQL review feature, see <a href="https://help.aliyun.com/document_detail/60374.html">SQL review</a>.</p>
     * 
     * @param request the request parameters of GetSQLReviewCheckResultStatus  GetSQLReviewCheckResultStatusRequest
     * @return GetSQLReviewCheckResultStatusResponse
     */
    CompletableFuture<GetSQLReviewCheckResultStatusResponse> getSQLReviewCheckResultStatus(GetSQLReviewCheckResultStatusRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the SQL review feature, see <a href="https://help.aliyun.com/document_detail/60374.html">SQL review</a>.</p>
     * 
     * @param request the request parameters of GetSQLReviewOptimizeDetail  GetSQLReviewOptimizeDetailRequest
     * @return GetSQLReviewOptimizeDetailResponse
     */
    CompletableFuture<GetSQLReviewOptimizeDetailResponse> getSQLReviewOptimizeDetail(GetSQLReviewOptimizeDetailRequest request);

    /**
     * @param request the request parameters of GetStandardGroup  GetStandardGroupRequest
     * @return GetStandardGroupResponse
     */
    CompletableFuture<GetStandardGroupResponse> getStandardGroup(GetStandardGroupRequest request);

    /**
     * @param request the request parameters of GetStructSyncExecSqlDetail  GetStructSyncExecSqlDetailRequest
     * @return GetStructSyncExecSqlDetailResponse
     */
    CompletableFuture<GetStructSyncExecSqlDetailResponse> getStructSyncExecSqlDetail(GetStructSyncExecSqlDetailRequest request);

    /**
     * @param request the request parameters of GetStructSyncJobAnalyzeResult  GetStructSyncJobAnalyzeResultRequest
     * @return GetStructSyncJobAnalyzeResultResponse
     */
    CompletableFuture<GetStructSyncJobAnalyzeResultResponse> getStructSyncJobAnalyzeResult(GetStructSyncJobAnalyzeResultRequest request);

    /**
     * @param request the request parameters of GetStructSyncJobDetail  GetStructSyncJobDetailRequest
     * @return GetStructSyncJobDetailResponse
     */
    CompletableFuture<GetStructSyncJobDetailResponse> getStructSyncJobDetail(GetStructSyncJobDetailRequest request);

    /**
     * @param request the request parameters of GetStructSyncOrderDetail  GetStructSyncOrderDetailRequest
     * @return GetStructSyncOrderDetailResponse
     */
    CompletableFuture<GetStructSyncOrderDetailResponse> getStructSyncOrderDetail(GetStructSyncOrderDetailRequest request);

    /**
     * @param request the request parameters of GetTableDBTopology  GetTableDBTopologyRequest
     * @return GetTableDBTopologyResponse
     */
    CompletableFuture<GetTableDBTopologyResponse> getTableDBTopology(GetTableDBTopologyRequest request);

    /**
     * @param request the request parameters of GetTableDesignProjectFlow  GetTableDesignProjectFlowRequest
     * @return GetTableDesignProjectFlowResponse
     */
    CompletableFuture<GetTableDesignProjectFlowResponse> getTableDesignProjectFlow(GetTableDesignProjectFlowRequest request);

    /**
     * @param request the request parameters of GetTableDesignProjectInfo  GetTableDesignProjectInfoRequest
     * @return GetTableDesignProjectInfoResponse
     */
    CompletableFuture<GetTableDesignProjectInfoResponse> getTableDesignProjectInfo(GetTableDesignProjectInfoRequest request);

    /**
     * @param request the request parameters of GetTableTopology  GetTableTopologyRequest
     * @return GetTableTopologyResponse
     */
    CompletableFuture<GetTableTopologyResponse> getTableTopology(GetTableTopologyRequest request);

    /**
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * @param request the request parameters of GetTaskFlowGraph  GetTaskFlowGraphRequest
     * @return GetTaskFlowGraphResponse
     */
    CompletableFuture<GetTaskFlowGraphResponse> getTaskFlowGraph(GetTaskFlowGraphRequest request);

    /**
     * @param request the request parameters of GetTaskFlowNotification  GetTaskFlowNotificationRequest
     * @return GetTaskFlowNotificationResponse
     */
    CompletableFuture<GetTaskFlowNotificationResponse> getTaskFlowNotification(GetTaskFlowNotificationRequest request);

    /**
     * @param request the request parameters of GetTaskInstanceRelation  GetTaskInstanceRelationRequest
     * @return GetTaskInstanceRelationResponse
     */
    CompletableFuture<GetTaskInstanceRelationResponse> getTaskInstanceRelation(GetTaskInstanceRelationRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of GetUserActiveTenant  GetUserActiveTenantRequest
     * @return GetUserActiveTenantResponse
     */
    CompletableFuture<GetUserActiveTenantResponse> getUserActiveTenant(GetUserActiveTenantRequest request);

    /**
     * @param request the request parameters of GetUserUploadFileJob  GetUserUploadFileJobRequest
     * @return GetUserUploadFileJobResponse
     */
    CompletableFuture<GetUserUploadFileJobResponse> getUserUploadFileJob(GetUserUploadFileJobRequest request);

    /**
     * <b>description</b> :
     * <p>You must be a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see <a href="https://help.aliyun.com/document_detail/324212.html">View system roles</a>.</p>
     * 
     * @param request the request parameters of GrantTemplateAuthority  GrantTemplateAuthorityRequest
     * @return GrantTemplateAuthorityResponse
     */
    CompletableFuture<GrantTemplateAuthorityResponse> grantTemplateAuthority(GrantTemplateAuthorityRequest request);

    /**
     * @param request the request parameters of GrantUserPermission  GrantUserPermissionRequest
     * @return GrantUserPermissionResponse
     */
    CompletableFuture<GrantUserPermissionResponse> grantUserPermission(GrantUserPermissionRequest request);

    /**
     * @param request the request parameters of InspectProxyAccessSecret  InspectProxyAccessSecretRequest
     * @return InspectProxyAccessSecretResponse
     */
    CompletableFuture<InspectProxyAccessSecretResponse> inspectProxyAccessSecret(InspectProxyAccessSecretRequest request);

    /**
     * @param request the request parameters of ListAbacAuthorizations  ListAbacAuthorizationsRequest
     * @return ListAbacAuthorizationsResponse
     */
    CompletableFuture<ListAbacAuthorizationsResponse> listAbacAuthorizations(ListAbacAuthorizationsRequest request);

    /**
     * @param request the request parameters of ListAbacPolicies  ListAbacPoliciesRequest
     * @return ListAbacPoliciesResponse
     */
    CompletableFuture<ListAbacPoliciesResponse> listAbacPolicies(ListAbacPoliciesRequest request);

    /**
     * @param request the request parameters of ListAuthorityTemplate  ListAuthorityTemplateRequest
     * @return ListAuthorityTemplateResponse
     */
    CompletableFuture<ListAuthorityTemplateResponse> listAuthorityTemplate(ListAuthorityTemplateRequest request);

    /**
     * @param request the request parameters of ListAuthorizedDatabasesForUser  ListAuthorizedDatabasesForUserRequest
     * @return ListAuthorizedDatabasesForUserResponse
     */
    CompletableFuture<ListAuthorizedDatabasesForUserResponse> listAuthorizedDatabasesForUser(ListAuthorizedDatabasesForUserRequest request);

    /**
     * @param request the request parameters of ListAuthorizedInstancesForUser  ListAuthorizedInstancesForUserRequest
     * @return ListAuthorizedInstancesForUserResponse
     */
    CompletableFuture<ListAuthorizedInstancesForUserResponse> listAuthorizedInstancesForUser(ListAuthorizedInstancesForUserRequest request);

    /**
     * @param request the request parameters of ListAuthorizedUsersForDatabase  ListAuthorizedUsersForDatabaseRequest
     * @return ListAuthorizedUsersForDatabaseResponse
     */
    CompletableFuture<ListAuthorizedUsersForDatabaseResponse> listAuthorizedUsersForDatabase(ListAuthorizedUsersForDatabaseRequest request);

    /**
     * @param request the request parameters of ListAuthorizedUsersForInstance  ListAuthorizedUsersForInstanceRequest
     * @return ListAuthorizedUsersForInstanceResponse
     */
    CompletableFuture<ListAuthorizedUsersForInstanceResponse> listAuthorizedUsersForInstance(ListAuthorizedUsersForInstanceRequest request);

    /**
     * @param request the request parameters of ListClassificationTemplates  ListClassificationTemplatesRequest
     * @return ListClassificationTemplatesResponse
     */
    CompletableFuture<ListClassificationTemplatesResponse> listClassificationTemplates(ListClassificationTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for database instances whose control mode is Security Collaboration.</p>
     * 
     * @param request the request parameters of ListColumns  ListColumnsRequest
     * @return ListColumnsResponse
     */
    CompletableFuture<ListColumnsResponse> listColumns(ListColumnsRequest request);

    /**
     * @param request the request parameters of ListDAGVersions  ListDAGVersionsRequest
     * @return ListDAGVersionsResponse
     */
    CompletableFuture<ListDAGVersionsResponse> listDAGVersions(ListDAGVersionsRequest request);

    /**
     * @param request the request parameters of ListDBTaskSQLJob  ListDBTaskSQLJobRequest
     * @return ListDBTaskSQLJobResponse
     */
    CompletableFuture<ListDBTaskSQLJobResponse> listDBTaskSQLJob(ListDBTaskSQLJobRequest request);

    /**
     * @param request the request parameters of ListDBTaskSQLJobDetail  ListDBTaskSQLJobDetailRequest
     * @return ListDBTaskSQLJobDetailResponse
     */
    CompletableFuture<ListDBTaskSQLJobDetailResponse> listDBTaskSQLJobDetail(ListDBTaskSQLJobDetailRequest request);

    /**
     * @param request the request parameters of ListDDLPublishRecords  ListDDLPublishRecordsRequest
     * @return ListDDLPublishRecordsResponse
     */
    CompletableFuture<ListDDLPublishRecordsResponse> listDDLPublishRecords(ListDDLPublishRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the Normal Data Modify feature, see <a href="https://help.aliyun.com/document_detail/58419.html">Change regular data</a>.</p>
     * 
     * @param request the request parameters of ListDataCorrectPreCheckDB  ListDataCorrectPreCheckDBRequest
     * @return ListDataCorrectPreCheckDBResponse
     */
    CompletableFuture<ListDataCorrectPreCheckDBResponse> listDataCorrectPreCheckDB(ListDataCorrectPreCheckDBRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the Normal Data Modify feature, see <a href="https://help.aliyun.com/document_detail/58419.html">Change regular data</a>.</p>
     * 
     * @param request the request parameters of ListDataCorrectPreCheckSQL  ListDataCorrectPreCheckSQLRequest
     * @return ListDataCorrectPreCheckSQLResponse
     */
    CompletableFuture<ListDataCorrectPreCheckSQLResponse> listDataCorrectPreCheckSQL(ListDataCorrectPreCheckSQLRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only if the data is imported in security mode in your data import ticket.</p>
     * 
     * @param request the request parameters of ListDataImportSQLPreCheckDetail  ListDataImportSQLPreCheckDetailRequest
     * @return ListDataImportSQLPreCheckDetailResponse
     */
    CompletableFuture<ListDataImportSQLPreCheckDetailResponse> listDataImportSQLPreCheckDetail(ListDataImportSQLPreCheckDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only if the data is imported in security mode in your data import ticket.</p>
     * 
     * @param request the request parameters of ListDataImportSQLType  ListDataImportSQLTypeRequest
     * @return ListDataImportSQLTypeResponse
     */
    CompletableFuture<ListDataImportSQLTypeResponse> listDataImportSQLType(ListDataImportSQLTypeRequest request);

    /**
     * @param request the request parameters of ListDataLakeCatalog  ListDataLakeCatalogRequest
     * @return ListDataLakeCatalogResponse
     */
    CompletableFuture<ListDataLakeCatalogResponse> listDataLakeCatalog(ListDataLakeCatalogRequest request);

    /**
     * @param request the request parameters of ListDataLakeDatabase  ListDataLakeDatabaseRequest
     * @return ListDataLakeDatabaseResponse
     */
    CompletableFuture<ListDataLakeDatabaseResponse> listDataLakeDatabase(ListDataLakeDatabaseRequest request);

    /**
     * @param request the request parameters of ListDataLakePartition  ListDataLakePartitionRequest
     * @return ListDataLakePartitionResponse
     */
    CompletableFuture<ListDataLakePartitionResponse> listDataLakePartition(ListDataLakePartitionRequest request);

    /**
     * @param request the request parameters of ListDataLakePartitionByFilter  ListDataLakePartitionByFilterRequest
     * @return ListDataLakePartitionByFilterResponse
     */
    CompletableFuture<ListDataLakePartitionByFilterResponse> listDataLakePartitionByFilter(ListDataLakePartitionByFilterRequest request);

    /**
     * @param request the request parameters of ListDataLakePartitionName  ListDataLakePartitionNameRequest
     * @return ListDataLakePartitionNameResponse
     */
    CompletableFuture<ListDataLakePartitionNameResponse> listDataLakePartitionName(ListDataLakePartitionNameRequest request);

    /**
     * @param request the request parameters of ListDataLakeTable  ListDataLakeTableRequest
     * @return ListDataLakeTableResponse
     */
    CompletableFuture<ListDataLakeTableResponse> listDataLakeTable(ListDataLakeTableRequest request);

    /**
     * @param request the request parameters of ListDataLakeTableName  ListDataLakeTableNameRequest
     * @return ListDataLakeTableNameResponse
     */
    CompletableFuture<ListDataLakeTableNameResponse> listDataLakeTableName(ListDataLakeTableNameRequest request);

    /**
     * @param request the request parameters of ListDataLakeTablebaseInfo  ListDataLakeTablebaseInfoRequest
     * @return ListDataLakeTablebaseInfoResponse
     */
    CompletableFuture<ListDataLakeTablebaseInfoResponse> listDataLakeTablebaseInfo(ListDataLakeTablebaseInfoRequest request);

    /**
     * @param request the request parameters of ListDatabaseUserPermssions  ListDatabaseUserPermssionsRequest
     * @return ListDatabaseUserPermssionsResponse
     */
    CompletableFuture<ListDatabaseUserPermssionsResponse> listDatabaseUserPermssions(ListDatabaseUserPermssionsRequest request);

    /**
     * @param request the request parameters of ListDatabases  ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    /**
     * @param request the request parameters of ListDefaultSLARules  ListDefaultSLARulesRequest
     * @return ListDefaultSLARulesResponse
     */
    CompletableFuture<ListDefaultSLARulesResponse> listDefaultSLARules(ListDefaultSLARulesRequest request);

    /**
     * @param request the request parameters of ListDesensitizationRule  ListDesensitizationRuleRequest
     * @return ListDesensitizationRuleResponse
     */
    CompletableFuture<ListDesensitizationRuleResponse> listDesensitizationRule(ListDesensitizationRuleRequest request);

    /**
     * @param request the request parameters of ListEffectiveOrders  ListEffectiveOrdersRequest
     * @return ListEffectiveOrdersResponse
     */
    CompletableFuture<ListEffectiveOrdersResponse> listEffectiveOrders(ListEffectiveOrdersRequest request);

    /**
     * @param request the request parameters of ListIndexes  ListIndexesRequest
     * @return ListIndexesResponse
     */
    CompletableFuture<ListIndexesResponse> listIndexes(ListIndexesRequest request);

    /**
     * @param request the request parameters of ListInstanceLoginAuditLog  ListInstanceLoginAuditLogRequest
     * @return ListInstanceLoginAuditLogResponse
     */
    CompletableFuture<ListInstanceLoginAuditLogResponse> listInstanceLoginAuditLog(ListInstanceLoginAuditLogRequest request);

    /**
     * @param request the request parameters of ListInstanceUserPermissions  ListInstanceUserPermissionsRequest
     * @return ListInstanceUserPermissionsResponse
     */
    CompletableFuture<ListInstanceUserPermissionsResponse> listInstanceUserPermissions(ListInstanceUserPermissionsRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you have the access permissions on the workspace. If you do not have the access permissions on the workspace, you can contact a DMS administrator, database administrator (DBA), or workspace administrator to add you as a member of the workspace. The <a href="https://help.aliyun.com/document_detail/424759.html">AddLhMembers</a> operation can be called to add a workspace member.</p>
     * <ul>
     * <li>If you are a DMS administrator or a workspace administrator, you can query the business scenarios and task flows related to a user in a workspace based on the user ID.</li>
     * </ul>
     * 
     * @param request the request parameters of ListLhTaskFlowAndScenario  ListLhTaskFlowAndScenarioRequest
     * @return ListLhTaskFlowAndScenarioResponse
     */
    CompletableFuture<ListLhTaskFlowAndScenarioResponse> listLhTaskFlowAndScenario(ListLhTaskFlowAndScenarioRequest request);

    /**
     * @param request the request parameters of ListLogicDatabases  ListLogicDatabasesRequest
     * @return ListLogicDatabasesResponse
     */
    CompletableFuture<ListLogicDatabasesResponse> listLogicDatabases(ListLogicDatabasesRequest request);

    /**
     * @param request the request parameters of ListLogicTableRouteConfig  ListLogicTableRouteConfigRequest
     * @return ListLogicTableRouteConfigResponse
     */
    CompletableFuture<ListLogicTableRouteConfigResponse> listLogicTableRouteConfig(ListLogicTableRouteConfigRequest request);

    /**
     * @param request the request parameters of ListLogicTables  ListLogicTablesRequest
     * @return ListLogicTablesResponse
     */
    CompletableFuture<ListLogicTablesResponse> listLogicTables(ListLogicTablesRequest request);

    /**
     * @param request the request parameters of ListOrders  ListOrdersRequest
     * @return ListOrdersResponse
     */
    CompletableFuture<ListOrdersResponse> listOrders(ListOrdersRequest request);

    /**
     * @param request the request parameters of ListProxies  ListProxiesRequest
     * @return ListProxiesResponse
     */
    CompletableFuture<ListProxiesResponse> listProxies(ListProxiesRequest request);

    /**
     * @param request the request parameters of ListProxyAccesses  ListProxyAccessesRequest
     * @return ListProxyAccessesResponse
     */
    CompletableFuture<ListProxyAccessesResponse> listProxyAccesses(ListProxyAccessesRequest request);

    /**
     * @param request the request parameters of ListProxySQLExecAuditLog  ListProxySQLExecAuditLogRequest
     * @return ListProxySQLExecAuditLogResponse
     */
    CompletableFuture<ListProxySQLExecAuditLogResponse> listProxySQLExecAuditLog(ListProxySQLExecAuditLogRequest request);

    /**
     * @param request the request parameters of ListSLARules  ListSLARulesRequest
     * @return ListSLARulesResponse
     */
    CompletableFuture<ListSLARulesResponse> listSLARules(ListSLARulesRequest request);

    /**
     * @param request the request parameters of ListSQLExecAuditLog  ListSQLExecAuditLogRequest
     * @return ListSQLExecAuditLogResponse
     */
    CompletableFuture<ListSQLExecAuditLogResponse> listSQLExecAuditLog(ListSQLExecAuditLogRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the SQL review feature, see <a href="https://help.aliyun.com/document_detail/60374.html">SQL review</a>.</p>
     * 
     * @param request the request parameters of ListSQLReviewOriginSQL  ListSQLReviewOriginSQLRequest
     * @return ListSQLReviewOriginSQLResponse
     */
    CompletableFuture<ListSQLReviewOriginSQLResponse> listSQLReviewOriginSQL(ListSQLReviewOriginSQLRequest request);

    /**
     * @param request the request parameters of ListScenarios  ListScenariosRequest
     * @return ListScenariosResponse
     */
    CompletableFuture<ListScenariosResponse> listScenarios(ListScenariosRequest request);

    /**
     * @param request the request parameters of ListSensitiveColumnInfo  ListSensitiveColumnInfoRequest
     * @return ListSensitiveColumnInfoResponse
     */
    CompletableFuture<ListSensitiveColumnInfoResponse> listSensitiveColumnInfo(ListSensitiveColumnInfoRequest request);

    /**
     * @param request the request parameters of ListSensitiveColumns  ListSensitiveColumnsRequest
     * @return ListSensitiveColumnsResponse
     */
    CompletableFuture<ListSensitiveColumnsResponse> listSensitiveColumns(ListSensitiveColumnsRequest request);

    /**
     * @param request the request parameters of ListSensitiveColumnsDetail  ListSensitiveColumnsDetailRequest
     * @return ListSensitiveColumnsDetailResponse
     */
    CompletableFuture<ListSensitiveColumnsDetailResponse> listSensitiveColumnsDetail(ListSensitiveColumnsDetailRequest request);

    /**
     * @param request the request parameters of ListSensitiveDataAuditLog  ListSensitiveDataAuditLogRequest
     * @return ListSensitiveDataAuditLogResponse
     */
    CompletableFuture<ListSensitiveDataAuditLogResponse> listSensitiveDataAuditLog(ListSensitiveDataAuditLogRequest request);

    /**
     * @param request the request parameters of ListSensitivityLevel  ListSensitivityLevelRequest
     * @return ListSensitivityLevelResponse
     */
    CompletableFuture<ListSensitivityLevelResponse> listSensitivityLevel(ListSensitivityLevelRequest request);

    /**
     * @param request the request parameters of ListStandardGroups  ListStandardGroupsRequest
     * @return ListStandardGroupsResponse
     */
    CompletableFuture<ListStandardGroupsResponse> listStandardGroups(ListStandardGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for database instances whose control mode is Security Collaboration.</p>
     * 
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    /**
     * @param request the request parameters of ListTaskFlow  ListTaskFlowRequest
     * @return ListTaskFlowResponse
     */
    CompletableFuture<ListTaskFlowResponse> listTaskFlow(ListTaskFlowRequest request);

    /**
     * @param request the request parameters of ListTaskFlowConstants  ListTaskFlowConstantsRequest
     * @return ListTaskFlowConstantsResponse
     */
    CompletableFuture<ListTaskFlowConstantsResponse> listTaskFlowConstants(ListTaskFlowConstantsRequest request);

    /**
     * @param request the request parameters of ListTaskFlowCooperators  ListTaskFlowCooperatorsRequest
     * @return ListTaskFlowCooperatorsResponse
     */
    CompletableFuture<ListTaskFlowCooperatorsResponse> listTaskFlowCooperators(ListTaskFlowCooperatorsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used for multi-condition query. You can call this operation to query the edges of a specified task flow that meet all specified conditions.</p>
     * 
     * @param request the request parameters of ListTaskFlowEdgesByCondition  ListTaskFlowEdgesByConditionRequest
     * @return ListTaskFlowEdgesByConditionResponse
     */
    CompletableFuture<ListTaskFlowEdgesByConditionResponse> listTaskFlowEdgesByCondition(ListTaskFlowEdgesByConditionRequest request);

    /**
     * @param request the request parameters of ListTaskFlowInstance  ListTaskFlowInstanceRequest
     * @return ListTaskFlowInstanceResponse
     */
    CompletableFuture<ListTaskFlowInstanceResponse> listTaskFlowInstance(ListTaskFlowInstanceRequest request);

    /**
     * @param request the request parameters of ListTaskFlowTimeVariables  ListTaskFlowTimeVariablesRequest
     * @return ListTaskFlowTimeVariablesResponse
     */
    CompletableFuture<ListTaskFlowTimeVariablesResponse> listTaskFlowTimeVariables(ListTaskFlowTimeVariablesRequest request);

    /**
     * @param request the request parameters of ListTaskFlowsByPage  ListTaskFlowsByPageRequest
     * @return ListTaskFlowsByPageResponse
     */
    CompletableFuture<ListTaskFlowsByPageResponse> listTaskFlowsByPage(ListTaskFlowsByPageRequest request);

    /**
     * @param request the request parameters of ListTasksInTaskFlow  ListTasksInTaskFlowRequest
     * @return ListTasksInTaskFlowResponse
     */
    CompletableFuture<ListTasksInTaskFlowResponse> listTasksInTaskFlow(ListTasksInTaskFlowRequest request);

    /**
     * @param request the request parameters of ListUserPermissions  ListUserPermissionsRequest
     * @return ListUserPermissionsResponse
     */
    CompletableFuture<ListUserPermissionsResponse> listUserPermissions(ListUserPermissionsRequest request);

    /**
     * @param request the request parameters of ListUserTenants  ListUserTenantsRequest
     * @return ListUserTenantsResponse
     */
    CompletableFuture<ListUserTenantsResponse> listUserTenants(ListUserTenantsRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListWorkFlowNodes  ListWorkFlowNodesRequest
     * @return ListWorkFlowNodesResponse
     */
    CompletableFuture<ListWorkFlowNodesResponse> listWorkFlowNodes(ListWorkFlowNodesRequest request);

    /**
     * @param request the request parameters of ListWorkFlowTemplates  ListWorkFlowTemplatesRequest
     * @return ListWorkFlowTemplatesResponse
     */
    CompletableFuture<ListWorkFlowTemplatesResponse> listWorkFlowTemplates(ListWorkFlowTemplatesRequest request);

    /**
     * @param request the request parameters of MakeTaskFlowInstanceSuccess  MakeTaskFlowInstanceSuccessRequest
     * @return MakeTaskFlowInstanceSuccessResponse
     */
    CompletableFuture<MakeTaskFlowInstanceSuccessResponse> makeTaskFlowInstanceSuccess(MakeTaskFlowInstanceSuccessRequest request);

    /**
     * @param request the request parameters of ModifyDataCorrectExecSQL  ModifyDataCorrectExecSQLRequest
     * @return ModifyDataCorrectExecSQLResponse
     */
    CompletableFuture<ModifyDataCorrectExecSQLResponse> modifyDataCorrectExecSQL(ModifyDataCorrectExecSQLRequest request);

    /**
     * @param request the request parameters of ModifyDesensitizationStrategy  ModifyDesensitizationStrategyRequest
     * @return ModifyDesensitizationStrategyResponse
     */
    CompletableFuture<ModifyDesensitizationStrategyResponse> modifyDesensitizationStrategy(ModifyDesensitizationStrategyRequest request);

    /**
     * @param request the request parameters of ModifyInstance  ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    /**
     * @param request the request parameters of MoveTaskFlowToScenario  MoveTaskFlowToScenarioRequest
     * @return MoveTaskFlowToScenarioResponse
     */
    CompletableFuture<MoveTaskFlowToScenarioResponse> moveTaskFlowToScenario(MoveTaskFlowToScenarioRequest request);

    /**
     * @param request the request parameters of OfflineTaskFlow  OfflineTaskFlowRequest
     * @return OfflineTaskFlowResponse
     */
    CompletableFuture<OfflineTaskFlowResponse> offlineTaskFlow(OfflineTaskFlowRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for database instances that are managed in Security Collaboration mode.</p>
     * 
     * @param request the request parameters of PauseDataCorrectSQLJob  PauseDataCorrectSQLJobRequest
     * @return PauseDataCorrectSQLJobResponse
     */
    CompletableFuture<PauseDataCorrectSQLJobResponse> pauseDataCorrectSQLJob(PauseDataCorrectSQLJobRequest request);

    /**
     * @param request the request parameters of PauseDataExportJob  PauseDataExportJobRequest
     * @return PauseDataExportJobResponse
     */
    CompletableFuture<PauseDataExportJobResponse> pauseDataExportJob(PauseDataExportJobRequest request);

    /**
     * @param request the request parameters of PreviewWorkflow  PreviewWorkflowRequest
     * @return PreviewWorkflowResponse
     */
    CompletableFuture<PreviewWorkflowResponse> previewWorkflow(PreviewWorkflowRequest request);

    /**
     * @param request the request parameters of PublishAndDeployTaskFlow  PublishAndDeployTaskFlowRequest
     * @return PublishAndDeployTaskFlowResponse
     */
    CompletableFuture<PublishAndDeployTaskFlowResponse> publishAndDeployTaskFlow(PublishAndDeployTaskFlowRequest request);

    /**
     * @param request the request parameters of QueryDataTrackResultDownloadStatus  QueryDataTrackResultDownloadStatusRequest
     * @return QueryDataTrackResultDownloadStatusResponse
     */
    CompletableFuture<QueryDataTrackResultDownloadStatusResponse> queryDataTrackResultDownloadStatus(QueryDataTrackResultDownloadStatusRequest request);

    /**
     * @param request the request parameters of ReDeployLhDagVersion  ReDeployLhDagVersionRequest
     * @return ReDeployLhDagVersionResponse
     */
    CompletableFuture<ReDeployLhDagVersionResponse> reDeployLhDagVersion(ReDeployLhDagVersionRequest request);

    /**
     * @param request the request parameters of ReRunTaskFlowInstance  ReRunTaskFlowInstanceRequest
     * @return ReRunTaskFlowInstanceResponse
     */
    CompletableFuture<ReRunTaskFlowInstanceResponse> reRunTaskFlowInstance(ReRunTaskFlowInstanceRequest request);

    /**
     * @param request the request parameters of RefundPayAsYouGoOrder  RefundPayAsYouGoOrderRequest
     * @return RefundPayAsYouGoOrderResponse
     */
    CompletableFuture<RefundPayAsYouGoOrderResponse> refundPayAsYouGoOrder(RefundPayAsYouGoOrderRequest request);

    /**
     * <b>description</b> :
     * <p>Prerequisites: You are a DMS administrator or a database administrator (DBA). You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> or <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> operation to query your user role from the RoleIdList parameter that is returned.</p>
     * 
     * @param request the request parameters of RegisterInstance  RegisterInstanceRequest
     * @return RegisterInstanceResponse
     */
    CompletableFuture<RegisterInstanceResponse> registerInstance(RegisterInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>If you are an <strong>administrator</strong> in Data Management (DMS), you can call this operation to register a user for your enterprise. To view users that are assigned the administrator role, perform the following steps: Log on to the DMS console. In the top navigation bar, click O&amp;M. In the left-side navigation pane, click User.</p>
     * 
     * @param request the request parameters of RegisterUser  RegisterUserRequest
     * @return RegisterUserResponse
     */
    CompletableFuture<RegisterUserResponse> registerUser(RegisterUserRequest request);

    /**
     * @param request the request parameters of RemoveDataExportJob  RemoveDataExportJobRequest
     * @return RemoveDataExportJobResponse
     */
    CompletableFuture<RemoveDataExportJobResponse> removeDataExportJob(RemoveDataExportJobRequest request);

    /**
     * @param request the request parameters of RestartDataCorrectSQLJob  RestartDataCorrectSQLJobRequest
     * @return RestartDataCorrectSQLJobResponse
     */
    CompletableFuture<RestartDataCorrectSQLJobResponse> restartDataCorrectSQLJob(RestartDataCorrectSQLJobRequest request);

    /**
     * @param request the request parameters of RestartDataExportJob  RestartDataExportJobRequest
     * @return RestartDataExportJobResponse
     */
    CompletableFuture<RestartDataExportJobResponse> restartDataExportJob(RestartDataExportJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for task flows that are suspended.</p>
     * 
     * @param request the request parameters of ResumeTaskFlowInstance  ResumeTaskFlowInstanceRequest
     * @return ResumeTaskFlowInstanceResponse
     */
    CompletableFuture<ResumeTaskFlowInstanceResponse> resumeTaskFlowInstance(ResumeTaskFlowInstanceRequest request);

    /**
     * @param request the request parameters of RetryDataCorrectPreCheck  RetryDataCorrectPreCheckRequest
     * @return RetryDataCorrectPreCheckResponse
     */
    CompletableFuture<RetryDataCorrectPreCheckResponse> retryDataCorrectPreCheck(RetryDataCorrectPreCheckRequest request);

    /**
     * <b>description</b> :
     * <p>You must be a database administrator (DBA) or a DMS administrator. For more information about how to view system roles, see <a href="https://help.aliyun.com/document_detail/324212.html">View system roles</a>.</p>
     * 
     * @param request the request parameters of RevokeTemplateAuthority  RevokeTemplateAuthorityRequest
     * @return RevokeTemplateAuthorityResponse
     */
    CompletableFuture<RevokeTemplateAuthorityResponse> revokeTemplateAuthority(RevokeTemplateAuthorityRequest request);

    /**
     * @param request the request parameters of RevokeUserPermission  RevokeUserPermissionRequest
     * @return RevokeUserPermissionResponse
     */
    CompletableFuture<RevokeUserPermissionResponse> revokeUserPermission(RevokeUserPermissionRequest request);

    /**
     * @param request the request parameters of SearchDataTrackResult  SearchDataTrackResultRequest
     * @return SearchDataTrackResultResponse
     */
    CompletableFuture<SearchDataTrackResultResponse> searchDataTrackResult(SearchDataTrackResultRequest request);

    /**
     * @param request the request parameters of SearchDatabase  SearchDatabaseRequest
     * @return SearchDatabaseResponse
     */
    CompletableFuture<SearchDatabaseResponse> searchDatabase(SearchDatabaseRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for database instances that are managed in Security Collaboration mode.</p>
     * 
     * @param request the request parameters of SearchTable  SearchTableRequest
     * @return SearchTableResponse
     */
    CompletableFuture<SearchTableResponse> searchTable(SearchTableRequest request);

    /**
     * @param request the request parameters of SetOwners  SetOwnersRequest
     * @return SetOwnersResponse
     */
    CompletableFuture<SetOwnersResponse> setOwners(SetOwnersRequest request);

    /**
     * @param request the request parameters of SetWorkflowExtraInfo  SetWorkflowExtraInfoRequest
     * @return SetWorkflowExtraInfoResponse
     */
    CompletableFuture<SetWorkflowExtraInfoResponse> setWorkflowExtraInfo(SetWorkflowExtraInfoRequest request);

    /**
     * @param request the request parameters of SkipDataCorrectRowCheck  SkipDataCorrectRowCheckRequest
     * @return SkipDataCorrectRowCheckResponse
     */
    CompletableFuture<SkipDataCorrectRowCheckResponse> skipDataCorrectRowCheck(SkipDataCorrectRowCheckRequest request);

    /**
     * @param request the request parameters of StopTaskFlowInstance  StopTaskFlowInstanceRequest
     * @return StopTaskFlowInstanceResponse
     */
    CompletableFuture<StopTaskFlowInstanceResponse> stopTaskFlowInstance(StopTaskFlowInstanceRequest request);

    /**
     * @param request the request parameters of SubmitOrderApproval  SubmitOrderApprovalRequest
     * @return SubmitOrderApprovalResponse
     */
    CompletableFuture<SubmitOrderApprovalResponse> submitOrderApproval(SubmitOrderApprovalRequest request);

    /**
     * @param request the request parameters of SubmitStructSyncOrderApproval  SubmitStructSyncOrderApprovalRequest
     * @return SubmitStructSyncOrderApprovalResponse
     */
    CompletableFuture<SubmitStructSyncOrderApprovalResponse> submitStructSyncOrderApproval(SubmitStructSyncOrderApprovalRequest request);

    /**
     * @param request the request parameters of SuspendDataExportJob  SuspendDataExportJobRequest
     * @return SuspendDataExportJobResponse
     */
    CompletableFuture<SuspendDataExportJobResponse> suspendDataExportJob(SuspendDataExportJobRequest request);

    /**
     * @param request the request parameters of SuspendTaskFlowInstance  SuspendTaskFlowInstanceRequest
     * @return SuspendTaskFlowInstanceResponse
     */
    CompletableFuture<SuspendTaskFlowInstanceResponse> suspendTaskFlowInstance(SuspendTaskFlowInstanceRequest request);

    /**
     * @param request the request parameters of SyncDatabaseMeta  SyncDatabaseMetaRequest
     * @return SyncDatabaseMetaResponse
     */
    CompletableFuture<SyncDatabaseMetaResponse> syncDatabaseMeta(SyncDatabaseMetaRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for database instances whose control mode is Security Collaboration.</p>
     * 
     * @param request the request parameters of SyncInstanceMeta  SyncInstanceMetaRequest
     * @return SyncInstanceMetaResponse
     */
    CompletableFuture<SyncInstanceMetaResponse> syncInstanceMeta(SyncInstanceMetaRequest request);

    /**
     * @param request the request parameters of UpdateAbacPolicy  UpdateAbacPolicyRequest
     * @return UpdateAbacPolicyResponse
     */
    CompletableFuture<UpdateAbacPolicyResponse> updateAbacPolicy(UpdateAbacPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see <a href="https://help.aliyun.com/document_detail/324212.html">View system roles</a>.</p>
     * 
     * @param request the request parameters of UpdateAuthorityTemplate  UpdateAuthorityTemplateRequest
     * @return UpdateAuthorityTemplateResponse
     */
    CompletableFuture<UpdateAuthorityTemplateResponse> updateAuthorityTemplate(UpdateAuthorityTemplateRequest request);

    /**
     * @param request the request parameters of UpdateDataLakeDatabase  UpdateDataLakeDatabaseRequest
     * @return UpdateDataLakeDatabaseResponse
     */
    CompletableFuture<UpdateDataLakeDatabaseResponse> updateDataLakeDatabase(UpdateDataLakeDatabaseRequest request);

    /**
     * @param request the request parameters of UpdateDataLakePartition  UpdateDataLakePartitionRequest
     * @return UpdateDataLakePartitionResponse
     */
    CompletableFuture<UpdateDataLakePartitionResponse> updateDataLakePartition(UpdateDataLakePartitionRequest request);

    /**
     * @param request the request parameters of UpdateDataLakeTable  UpdateDataLakeTableRequest
     * @return UpdateDataLakeTableResponse
     */
    CompletableFuture<UpdateDataLakeTableResponse> updateDataLakeTable(UpdateDataLakeTableRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call the UpdateInstance operation, call the <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> or <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> operation to obtain the complete information about the instance.</p>
     * 
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>SLA rules take effect after task flows are deployed and published.</p>
     * 
     * @param request the request parameters of UpdateSLARules  UpdateSLARulesRequest
     * @return UpdateSLARulesResponse
     */
    CompletableFuture<UpdateSLARulesResponse> updateSLARules(UpdateSLARulesRequest request);

    /**
     * @param request the request parameters of UpdateScenario  UpdateScenarioRequest
     * @return UpdateScenarioResponse
     */
    CompletableFuture<UpdateScenarioResponse> updateScenario(UpdateScenarioRequest request);

    /**
     * @param request the request parameters of UpdateStandardGroup  UpdateStandardGroupRequest
     * @return UpdateStandardGroupResponse
     */
    CompletableFuture<UpdateStandardGroupResponse> updateStandardGroup(UpdateStandardGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to configure a failed task or rerun a task.</p>
     * 
     * @param request the request parameters of UpdateTaskConfig  UpdateTaskConfigRequest
     * @return UpdateTaskConfigResponse
     */
    CompletableFuture<UpdateTaskConfigResponse> updateTaskConfig(UpdateTaskConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify node configurations.</p>
     * 
     * @param request the request parameters of UpdateTaskContent  UpdateTaskContentRequest
     * @return UpdateTaskContentResponse
     */
    CompletableFuture<UpdateTaskContentResponse> updateTaskContent(UpdateTaskContentRequest request);

    /**
     * @param request the request parameters of UpdateTaskFlowConstants  UpdateTaskFlowConstantsRequest
     * @return UpdateTaskFlowConstantsResponse
     */
    CompletableFuture<UpdateTaskFlowConstantsResponse> updateTaskFlowConstants(UpdateTaskFlowConstantsRequest request);

    /**
     * @param request the request parameters of UpdateTaskFlowCooperators  UpdateTaskFlowCooperatorsRequest
     * @return UpdateTaskFlowCooperatorsResponse
     */
    CompletableFuture<UpdateTaskFlowCooperatorsResponse> updateTaskFlowCooperators(UpdateTaskFlowCooperatorsRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>The edges can be updated only when the following conditions are met:</p>
     * <ol>
     * <li>The specified edge exists in the directed acyclic graph (DAG) of the task flow specified by DagId.</li>
     * <li>The specified edge nodes exist in the DAG of the task flow specified by DagId.</li>
     * <li>After the update, rings do not exist in the DAG.</li>
     * </ol>
     * 
     * @param request the request parameters of UpdateTaskFlowEdges  UpdateTaskFlowEdgesRequest
     * @return UpdateTaskFlowEdgesResponse
     */
    CompletableFuture<UpdateTaskFlowEdgesResponse> updateTaskFlowEdges(UpdateTaskFlowEdgesRequest request);

    /**
     * @param request the request parameters of UpdateTaskFlowNameAndDesc  UpdateTaskFlowNameAndDescRequest
     * @return UpdateTaskFlowNameAndDescResponse
     */
    CompletableFuture<UpdateTaskFlowNameAndDescResponse> updateTaskFlowNameAndDesc(UpdateTaskFlowNameAndDescRequest request);

    /**
     * @param request the request parameters of UpdateTaskFlowNotification  UpdateTaskFlowNotificationRequest
     * @return UpdateTaskFlowNotificationResponse
     */
    CompletableFuture<UpdateTaskFlowNotificationResponse> updateTaskFlowNotification(UpdateTaskFlowNotificationRequest request);

    /**
     * <b>description</b> :
     * <p>Note: The new owner of the task flow must belong to the same tenant as the previous owner.</p>
     * 
     * @param request the request parameters of UpdateTaskFlowOwner  UpdateTaskFlowOwnerRequest
     * @return UpdateTaskFlowOwnerResponse
     */
    CompletableFuture<UpdateTaskFlowOwnerResponse> updateTaskFlowOwner(UpdateTaskFlowOwnerRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to perform a full update. For incremental updates, see AddTaskFlowEdges, UpdateTaskFlowEdges, and DeleteTaskFlowEdgesByMultiCondition.</p>
     * 
     * @param request the request parameters of UpdateTaskFlowRelations  UpdateTaskFlowRelationsRequest
     * @return UpdateTaskFlowRelationsResponse
     */
    CompletableFuture<UpdateTaskFlowRelationsResponse> updateTaskFlowRelations(UpdateTaskFlowRelationsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the scheduling properties for a task flow in the editing state. You can configure a <strong>timed scheduling</strong> task flow or an <strong>event scheduling</strong> task flow. When you configure a <strong>timed scheduling</strong> task flow, you can choose from one-time scheduling or periodic scheduling. When you configure an <strong>event scheduling</strong> task flow, you can subscribe to task flows or task flow nodes.****\
     * After you update the scheduling properties, you need to publish and deploy the task flow again. The new task flow instance will run based on the updated scheduling properties.</p>
     * 
     * @param request the request parameters of UpdateTaskFlowSchedule  UpdateTaskFlowScheduleRequest
     * @return UpdateTaskFlowScheduleResponse
     */
    CompletableFuture<UpdateTaskFlowScheduleResponse> updateTaskFlowSchedule(UpdateTaskFlowScheduleRequest request);

    /**
     * @param request the request parameters of UpdateTaskFlowTimeVariables  UpdateTaskFlowTimeVariablesRequest
     * @return UpdateTaskFlowTimeVariablesResponse
     */
    CompletableFuture<UpdateTaskFlowTimeVariablesResponse> updateTaskFlowTimeVariables(UpdateTaskFlowTimeVariablesRequest request);

    /**
     * @param request the request parameters of UpdateTaskName  UpdateTaskNameRequest
     * @return UpdateTaskNameResponse
     */
    CompletableFuture<UpdateTaskNameResponse> updateTaskName(UpdateTaskNameRequest request);

    /**
     * <b>description</b> :
     * <p>Only nodes of single-instance SQL assignment, script code, and ECS remote command have output variables.</p>
     * 
     * @param request the request parameters of UpdateTaskOutput  UpdateTaskOutputRequest
     * @return UpdateTaskOutputResponse
     */
    CompletableFuture<UpdateTaskOutputResponse> updateTaskOutput(UpdateTaskOutputRequest request);

    /**
     * @param request the request parameters of UpdateTaskTimeVariables  UpdateTaskTimeVariablesRequest
     * @return UpdateTaskTimeVariablesResponse
     */
    CompletableFuture<UpdateTaskTimeVariablesResponse> updateTaskTimeVariables(UpdateTaskTimeVariablesRequest request);

    /**
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
