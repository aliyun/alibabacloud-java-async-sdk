// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dataworks_public20200518.models.*;
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
     * @param request the request parameters of AbolishDataServiceApi  AbolishDataServiceApiRequest
     * @return AbolishDataServiceApiResponse
     */
    CompletableFuture<AbolishDataServiceApiResponse> abolishDataServiceApi(AbolishDataServiceApiRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin: Before calling this operation, activate DataWorks Professional Edition or a higher edition. The Basic Edition and Standard Edition do not support the metadata collection feature.</p>
     * 
     * @param request the request parameters of AddMetaCollectionEntity  AddMetaCollectionEntityRequest
     * @return AddMetaCollectionEntityResponse
     */
    CompletableFuture<AddMetaCollectionEntityResponse> addMetaCollectionEntity(AddMetaCollectionEntityRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>To add the target account as a member of the DataWorks workspace, refer to <a href="https://help.aliyun.com/document_detail/136941.html">Add members to a DataWorks workspace</a>.</li>
     * <li>When you add a user to a preset role in a DataWorks workspace, the user is also added as a project role member in the MaxCompute project of the development environment of the workspace. For more information, refer to <a href="https://help.aliyun.com/document_detail/449397.html">Mapping between workspace-level preset roles and MaxCompute engine permissions</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddProjectMemberToRole  AddProjectMemberToRoleRequest
     * @return AddProjectMemberToRoleResponse
     */
    CompletableFuture<AddProjectMemberToRoleResponse> addProjectMemberToRole(AddProjectMemberToRoleRequest request);

    /**
     * @param request the request parameters of AddRecognizeRule  AddRecognizeRuleRequest
     * @return AddRecognizeRuleResponse
     */
    CompletableFuture<AddRecognizeRuleResponse> addRecognizeRule(AddRecognizeRuleRequest request);

    /**
     * @param request the request parameters of AddToMetaCategory  AddToMetaCategoryRequest
     * @return AddToMetaCategoryResponse
     */
    CompletableFuture<AddToMetaCategoryResponse> addToMetaCategory(AddToMetaCategoryRequest request);

    /**
     * <b>description</b> :
     * <p><em>Note: The 2020 edition of OpenAPI will be discontinued. Migrate to the 2024 edition of OpenAPI as soon as possible — <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/api-dataworks-public-2024-05-18-approveprocessinstance">ApproveProcessInstance</a>.</em>*</p>
     * 
     * @param request the request parameters of ApprovePermissionApplyOrder  ApprovePermissionApplyOrderRequest
     * @return ApprovePermissionApplyOrderResponse
     */
    CompletableFuture<ApprovePermissionApplyOrderResponse> approvePermissionApplyOrder(ApprovePermissionApplyOrderRequest request);

    /**
     * @param request the request parameters of CallbackExtension  CallbackExtensionRequest
     * @return CallbackExtensionResponse
     */
    CompletableFuture<CallbackExtensionResponse> callbackExtension(CallbackExtensionRequest request);

    /**
     * @param request the request parameters of ChangeResourceManagerResourceGroup  ChangeResourceManagerResourceGroupRequest
     * @return ChangeResourceManagerResourceGroupResponse
     */
    CompletableFuture<ChangeResourceManagerResourceGroupResponse> changeResourceManagerResourceGroup(ChangeResourceManagerResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckFileDeployment  CheckFileDeploymentRequest
     * @return CheckFileDeploymentResponse
     */
    CompletableFuture<CheckFileDeploymentResponse> checkFileDeployment(CheckFileDeploymentRequest request);

    /**
     * @param request the request parameters of CheckMetaPartition  CheckMetaPartitionRequest
     * @return CheckMetaPartitionResponse
     */
    CompletableFuture<CheckMetaPartitionResponse> checkMetaPartition(CheckMetaPartitionRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin: Activate DataWorks Enterprise Edition or Ultimate Edition before calling this operation. If the edition is not activated, the service returns 403 Forbidden.Access.</p>
     * 
     * @param request the request parameters of CheckMetaTable  CheckMetaTableRequest
     * @return CheckMetaTableResponse
     */
    CompletableFuture<CheckMetaTableResponse> checkMetaTable(CheckMetaTableRequest request);

    /**
     * @param request the request parameters of CreateBaseline  CreateBaselineRequest
     * @return CreateBaselineResponse
     */
    CompletableFuture<CreateBaselineResponse> createBaseline(CreateBaselineRequest request);

    /**
     * @param request the request parameters of CreateBusiness  CreateBusinessRequest
     * @return CreateBusinessResponse
     */
    CompletableFuture<CreateBusinessResponse> createBusiness(CreateBusinessRequest request);

    /**
     * @deprecated OpenAPI CreateConnection is deprecated, please use dataworks-public::2020-05-18::CreateDataSource instead.  * @param request  the request parameters of CreateConnection  CreateConnectionRequest
     * @return CreateConnectionResponse
     */
    @Deprecated
    CompletableFuture<CreateConnectionResponse> createConnection(CreateConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Alert rules can be configured when your task includes real-time synchronization.</p>
     * 
     * @param request the request parameters of CreateDIAlarmRule  CreateDIAlarmRuleRequest
     * @return CreateDIAlarmRuleResponse
     */
    CompletableFuture<CreateDIAlarmRuleResponse> createDIAlarmRule(CreateDIAlarmRuleRequest request);

    /**
     * @param request the request parameters of CreateDIJob  CreateDIJobRequest
     * @return CreateDIJobResponse
     */
    CompletableFuture<CreateDIJobResponse> createDIJob(CreateDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot configure scheduling properties for a task by calling this operation. If you want to configure scheduling properties for a task, you can call the UpdateFile operation.<a href="~~2780137~~"></a></p>
     * 
     * @param request the request parameters of CreateDISyncTask  CreateDISyncTaskRequest
     * @return CreateDISyncTaskResponse
     */
    CompletableFuture<CreateDISyncTaskResponse> createDISyncTask(CreateDISyncTaskRequest request);

    /**
     * @deprecated OpenAPI CreateDagComplement is deprecated  * @param request  the request parameters of CreateDagComplement  CreateDagComplementRequest
     * @return CreateDagComplementResponse
     */
    @Deprecated
    CompletableFuture<CreateDagComplementResponse> createDagComplement(CreateDagComplementRequest request);

    /**
     * @deprecated OpenAPI CreateDagTest is deprecated  * @param request  the request parameters of CreateDagTest  CreateDagTestRequest
     * @return CreateDagTestResponse
     */
    @Deprecated
    CompletableFuture<CreateDagTestResponse> createDagTest(CreateDagTestRequest request);

    /**
     * @param request the request parameters of CreateDataServiceApi  CreateDataServiceApiRequest
     * @return CreateDataServiceApiResponse
     */
    CompletableFuture<CreateDataServiceApiResponse> createDataServiceApi(CreateDataServiceApiRequest request);

    /**
     * @param request the request parameters of CreateDataServiceApiAuthority  CreateDataServiceApiAuthorityRequest
     * @return CreateDataServiceApiAuthorityResponse
     */
    CompletableFuture<CreateDataServiceApiAuthorityResponse> createDataServiceApiAuthority(CreateDataServiceApiAuthorityRequest request);

    /**
     * @param request the request parameters of CreateDataServiceFolder  CreateDataServiceFolderRequest
     * @return CreateDataServiceFolderResponse
     */
    CompletableFuture<CreateDataServiceFolderResponse> createDataServiceFolder(CreateDataServiceFolderRequest request);

    /**
     * @param request the request parameters of CreateDataServiceGroup  CreateDataServiceGroupRequest
     * @return CreateDataServiceGroupResponse
     */
    CompletableFuture<CreateDataServiceGroupResponse> createDataServiceGroup(CreateDataServiceGroupRequest request);

    /**
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    /**
     * @param request the request parameters of CreateExportMigration  CreateExportMigrationRequest
     * @return CreateExportMigrationResponse
     */
    CompletableFuture<CreateExportMigrationResponse> createExportMigration(CreateExportMigrationRequest request);

    /**
     * @param request the request parameters of CreateFile  CreateFileRequest
     * @return CreateFileResponse
     */
    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    /**
     * @param request the request parameters of CreateFolder  CreateFolderRequest
     * @return CreateFolderResponse
     */
    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    /**
     * @deprecated OpenAPI CreateManualDag is deprecated  * @param request  the request parameters of CreateManualDag  CreateManualDagRequest
     * @return CreateManualDagResponse
     */
    @Deprecated
    CompletableFuture<CreateManualDagResponse> createManualDag(CreateManualDagRequest request);

    /**
     * @param request the request parameters of CreateMetaCategory  CreateMetaCategoryRequest
     * @return CreateMetaCategoryResponse
     */
    CompletableFuture<CreateMetaCategoryResponse> createMetaCategory(CreateMetaCategoryRequest request);

    /**
     * <b>description</b> :
     * <p>Collections have multiple types. The name must be unique within the same collection type.</p>
     * 
     * @param request the request parameters of CreateMetaCollection  CreateMetaCollectionRequest
     * @return CreateMetaCollectionResponse
     */
    CompletableFuture<CreateMetaCollectionResponse> createMetaCollection(CreateMetaCollectionRequest request);

    /**
     * <b>description</b> :
     * <p><em>Note: The 2020 version of OpenAPI will be discontinued. Migrate to the 2024 version of OpenAPI — <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/api-dataworks-public-2024-05-18-applyresourceaccesspermission">ApplyResourceAccessPermission</a> as soon as possible.</em>*</p>
     * 
     * @param request the request parameters of CreatePermissionApplyOrder  CreatePermissionApplyOrderRequest
     * @return CreatePermissionApplyOrderResponse
     */
    CompletableFuture<CreatePermissionApplyOrderResponse> createPermissionApplyOrder(CreatePermissionApplyOrderRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * @param request the request parameters of CreateProjectMember  CreateProjectMemberRequest
     * @return CreateProjectMemberResponse
     */
    CompletableFuture<CreateProjectMemberResponse> createProjectMember(CreateProjectMemberRequest request);

    /**
     * @deprecated OpenAPI CreateQualityEntity is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @param request  the request parameters of CreateQualityEntity  CreateQualityEntityRequest
     * @return CreateQualityEntityResponse
     */
    @Deprecated
    CompletableFuture<CreateQualityEntityResponse> createQualityEntity(CreateQualityEntityRequest request);

    /**
     * @deprecated OpenAPI CreateQualityFollower is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityAlertRule instead.  * @param request  the request parameters of CreateQualityFollower  CreateQualityFollowerRequest
     * @return CreateQualityFollowerResponse
     */
    @Deprecated
    CompletableFuture<CreateQualityFollowerResponse> createQualityFollower(CreateQualityFollowerRequest request);

    /**
     * @deprecated OpenAPI CreateQualityRelativeNode is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @param request  the request parameters of CreateQualityRelativeNode  CreateQualityRelativeNodeRequest
     * @return CreateQualityRelativeNodeResponse
     */
    @Deprecated
    CompletableFuture<CreateQualityRelativeNodeResponse> createQualityRelativeNode(CreateQualityRelativeNodeRequest request);

    /**
     * @deprecated OpenAPI CreateQualityRule is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @param request  the request parameters of CreateQualityRule  CreateQualityRuleRequest
     * @return CreateQualityRuleResponse
     */
    @Deprecated
    CompletableFuture<CreateQualityRuleResponse> createQualityRule(CreateQualityRuleRequest request);

    /**
     * @param request the request parameters of CreateRemind  CreateRemindRequest
     * @return CreateRemindResponse
     */
    CompletableFuture<CreateRemindResponse> createRemind(CreateRemindRequest request);

    /**
     * @deprecated OpenAPI CreateTable is deprecated  * @param request  the request parameters of CreateTable  CreateTableRequest
     * @return CreateTableResponse
     */
    @Deprecated
    CompletableFuture<CreateTableResponse> createTable(CreateTableRequest request);

    /**
     * @param request the request parameters of CreateTableLevel  CreateTableLevelRequest
     * @return CreateTableLevelResponse
     */
    CompletableFuture<CreateTableLevelResponse> createTableLevel(CreateTableLevelRequest request);

    /**
     * @param request the request parameters of CreateTableTheme  CreateTableThemeRequest
     * @return CreateTableThemeResponse
     */
    CompletableFuture<CreateTableThemeResponse> createTableTheme(CreateTableThemeRequest request);

    /**
     * @param request the request parameters of CreateUdfFile  CreateUdfFileRequest
     * @return CreateUdfFileResponse
     */
    CompletableFuture<CreateUdfFileResponse> createUdfFile(CreateUdfFileRequest request);

    /**
     * @param request the request parameters of DeleteBaseline  DeleteBaselineRequest
     * @return DeleteBaselineResponse
     */
    CompletableFuture<DeleteBaselineResponse> deleteBaseline(DeleteBaselineRequest request);

    /**
     * @param request the request parameters of DeleteBusiness  DeleteBusinessRequest
     * @return DeleteBusinessResponse
     */
    CompletableFuture<DeleteBusinessResponse> deleteBusiness(DeleteBusinessRequest request);

    /**
     * @deprecated OpenAPI DeleteConnection is deprecated  * @param request  the request parameters of DeleteConnection  DeleteConnectionRequest
     * @return DeleteConnectionResponse
     */
    @Deprecated
    CompletableFuture<DeleteConnectionResponse> deleteConnection(DeleteConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks whose MigrationType is set to RealtimeIncremental.</p>
     * 
     * @param request the request parameters of DeleteDIAlarmRule  DeleteDIAlarmRuleRequest
     * @return DeleteDIAlarmRuleResponse
     */
    CompletableFuture<DeleteDIAlarmRuleResponse> deleteDIAlarmRule(DeleteDIAlarmRuleRequest request);

    /**
     * @param request the request parameters of DeleteDIJob  DeleteDIJobRequest
     * @return DeleteDIJobResponse
     */
    CompletableFuture<DeleteDIJobResponse> deleteDIJob(DeleteDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>If you want to delete a batch synchronization task, call the DeleteFile operation. For more information, see <a href="https://help.aliyun.com/document_detail/321443.html">Delete a synchronization task</a>.</p>
     * 
     * @param request the request parameters of DeleteDISyncTask  DeleteDISyncTaskRequest
     * @return DeleteDISyncTaskResponse
     */
    CompletableFuture<DeleteDISyncTaskResponse> deleteDISyncTask(DeleteDISyncTaskRequest request);

    /**
     * @param request the request parameters of DeleteDataServiceApi  DeleteDataServiceApiRequest
     * @return DeleteDataServiceApiResponse
     */
    CompletableFuture<DeleteDataServiceApiResponse> deleteDataServiceApi(DeleteDataServiceApiRequest request);

    /**
     * @param request the request parameters of DeleteDataServiceApiAuthority  DeleteDataServiceApiAuthorityRequest
     * @return DeleteDataServiceApiAuthorityResponse
     */
    CompletableFuture<DeleteDataServiceApiAuthorityResponse> deleteDataServiceApiAuthority(DeleteDataServiceApiAuthorityRequest request);

    /**
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    /**
     * @param request the request parameters of DeleteFolder  DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    /**
     * @param request the request parameters of DeleteFromMetaCategory  DeleteFromMetaCategoryRequest
     * @return DeleteFromMetaCategoryResponse
     */
    CompletableFuture<DeleteFromMetaCategoryResponse> deleteFromMetaCategory(DeleteFromMetaCategoryRequest request);

    /**
     * <b>description</b> :
     * <p>This API is currently in the trial phase. Users who wish to experience it can apply, and after the administrator adds them to the trial list, they can call this API.</p>
     * 
     * @param request the request parameters of DeleteLineageRelation  DeleteLineageRelationRequest
     * @return DeleteLineageRelationResponse
     */
    CompletableFuture<DeleteLineageRelationResponse> deleteLineageRelation(DeleteLineageRelationRequest request);

    /**
     * @param request the request parameters of DeleteMetaCategory  DeleteMetaCategoryRequest
     * @return DeleteMetaCategoryResponse
     */
    CompletableFuture<DeleteMetaCategoryResponse> deleteMetaCategory(DeleteMetaCategoryRequest request);

    /**
     * @param request the request parameters of DeleteMetaCollection  DeleteMetaCollectionRequest
     * @return DeleteMetaCollectionResponse
     */
    CompletableFuture<DeleteMetaCollectionResponse> deleteMetaCollection(DeleteMetaCollectionRequest request);

    /**
     * @param request the request parameters of DeleteMetaCollectionEntity  DeleteMetaCollectionEntityRequest
     * @return DeleteMetaCollectionEntityResponse
     */
    CompletableFuture<DeleteMetaCollectionEntityResponse> deleteMetaCollectionEntity(DeleteMetaCollectionEntityRequest request);

    /**
     * @param request the request parameters of DeleteProjectMember  DeleteProjectMemberRequest
     * @return DeleteProjectMemberResponse
     */
    CompletableFuture<DeleteProjectMemberResponse> deleteProjectMember(DeleteProjectMemberRequest request);

    /**
     * @deprecated OpenAPI DeleteQualityEntity is deprecated, please use dataworks-public::2024-05-18::DeleteDataQualityScan instead.  * @param request  the request parameters of DeleteQualityEntity  DeleteQualityEntityRequest
     * @return DeleteQualityEntityResponse
     */
    @Deprecated
    CompletableFuture<DeleteQualityEntityResponse> deleteQualityEntity(DeleteQualityEntityRequest request);

    /**
     * @deprecated OpenAPI DeleteQualityFollower is deprecated, please use dataworks-public::2024-05-18::DeleteDataQualityAlertRule instead.  * @description Data Quality uses partition expressions to determine which monitoring rules to configure. These rules help you immediately detect changes in a data source and identify dirty data generated during ETL processes. These rules can automatically block tasks to prevent dirty data from propagating downstream. This practice prevents tasks from producing unexpected data that could affect normal operations. You can add Followers to a partition expression. When a monitoring rule for that partition expression is triggered, the specified Followers receive a notification, which helps them quickly identify and resolve the issue. For more information, see [Configure monitoring rules](https://help.aliyun.com/document_detail/73690.html).
     * 
     * @param request the request parameters of DeleteQualityFollower  DeleteQualityFollowerRequest
     * @return DeleteQualityFollowerResponse
     */
    @Deprecated
    CompletableFuture<DeleteQualityFollowerResponse> deleteQualityFollower(DeleteQualityFollowerRequest request);

    /**
     * @deprecated OpenAPI DeleteQualityRelativeNode is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @param request  the request parameters of DeleteQualityRelativeNode  DeleteQualityRelativeNodeRequest
     * @return DeleteQualityRelativeNodeResponse
     */
    @Deprecated
    CompletableFuture<DeleteQualityRelativeNodeResponse> deleteQualityRelativeNode(DeleteQualityRelativeNodeRequest request);

    /**
     * @deprecated OpenAPI DeleteQualityRule is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @param request  the request parameters of DeleteQualityRule  DeleteQualityRuleRequest
     * @return DeleteQualityRuleResponse
     */
    @Deprecated
    CompletableFuture<DeleteQualityRuleResponse> deleteQualityRule(DeleteQualityRuleRequest request);

    /**
     * @param request the request parameters of DeleteRecognizeRule  DeleteRecognizeRuleRequest
     * @return DeleteRecognizeRuleResponse
     */
    CompletableFuture<DeleteRecognizeRuleResponse> deleteRecognizeRule(DeleteRecognizeRuleRequest request);

    /**
     * @param request the request parameters of DeleteRemind  DeleteRemindRequest
     * @return DeleteRemindResponse
     */
    CompletableFuture<DeleteRemindResponse> deleteRemind(DeleteRemindRequest request);

    /**
     * @deprecated OpenAPI DeleteTable is deprecated  * @param request  the request parameters of DeleteTable  DeleteTableRequest
     * @return DeleteTableResponse
     */
    @Deprecated
    CompletableFuture<DeleteTableResponse> deleteTable(DeleteTableRequest request);

    /**
     * @param request the request parameters of DeleteTableLevel  DeleteTableLevelRequest
     * @return DeleteTableLevelResponse
     */
    CompletableFuture<DeleteTableLevelResponse> deleteTableLevel(DeleteTableLevelRequest request);

    /**
     * @param request the request parameters of DeleteTableTheme  DeleteTableThemeRequest
     * @return DeleteTableThemeResponse
     */
    CompletableFuture<DeleteTableThemeResponse> deleteTableTheme(DeleteTableThemeRequest request);

    /**
     * @param request the request parameters of DeployDISyncTask  DeployDISyncTaskRequest
     * @return DeployDISyncTaskResponse
     */
    CompletableFuture<DeployDISyncTaskResponse> deployDISyncTask(DeployDISyncTaskRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. A successful call returns a deployment ID. Use this ID with the <a href="https://help.aliyun.com/document_detail/173950.html">GetDeployment</a> operation to query the execution status and final result of the deployment task.</p>
     * 
     * @param request the request parameters of DeployFile  DeployFileRequest
     * @return DeployFileResponse
     */
    CompletableFuture<DeployFileResponse> deployFile(DeployFileRequest request);

    /**
     * @param request the request parameters of DesensitizeData  DesensitizeDataRequest
     * @return DesensitizeDataResponse
     */
    CompletableFuture<DesensitizeDataResponse> desensitizeData(DesensitizeDataRequest request);

    /**
     * @param request the request parameters of DsgDesensPlanAddOrUpdate  DsgDesensPlanAddOrUpdateRequest
     * @return DsgDesensPlanAddOrUpdateResponse
     */
    CompletableFuture<DsgDesensPlanAddOrUpdateResponse> dsgDesensPlanAddOrUpdate(DsgDesensPlanAddOrUpdateRequest request);

    /**
     * @param request the request parameters of DsgDesensPlanDelete  DsgDesensPlanDeleteRequest
     * @return DsgDesensPlanDeleteResponse
     */
    CompletableFuture<DsgDesensPlanDeleteResponse> dsgDesensPlanDelete(DsgDesensPlanDeleteRequest request);

    /**
     * @param request the request parameters of DsgDesensPlanQueryList  DsgDesensPlanQueryListRequest
     * @return DsgDesensPlanQueryListResponse
     */
    CompletableFuture<DsgDesensPlanQueryListResponse> dsgDesensPlanQueryList(DsgDesensPlanQueryListRequest request);

    /**
     * @param request the request parameters of DsgDesensPlanUpdateStatus  DsgDesensPlanUpdateStatusRequest
     * @return DsgDesensPlanUpdateStatusResponse
     */
    CompletableFuture<DsgDesensPlanUpdateStatusResponse> dsgDesensPlanUpdateStatus(DsgDesensPlanUpdateStatusRequest request);

    /**
     * @param request the request parameters of DsgGetVisitDetail  DsgGetVisitDetailRequest
     * @return DsgGetVisitDetailResponse
     */
    CompletableFuture<DsgGetVisitDetailResponse> dsgGetVisitDetail(DsgGetVisitDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation retrieves all configuration information of a specific security policy by specifying the security policy ID.</li>
     * <li>Ensure that the value of the <code>Id</code> parameter is valid and exists. Otherwise, an error message is returned.</li>
     * <li>The returned data structure includes basic policy information (such as name and description) and detailed policy content (such as control items and their settings).</li>
     * <li>Note: Some fields of system default policies may not be modified or deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DsgGetVisitStat  DsgGetVisitStatRequest
     * @return DsgGetVisitStatResponse
     */
    CompletableFuture<DsgGetVisitStatResponse> dsgGetVisitStat(DsgGetVisitStatRequest request);

    /**
     * @param request the request parameters of DsgPlatformQueryProjectsAndSchemaFromMeta  DsgPlatformQueryProjectsAndSchemaFromMetaRequest
     * @return DsgPlatformQueryProjectsAndSchemaFromMetaResponse
     */
    CompletableFuture<DsgPlatformQueryProjectsAndSchemaFromMetaResponse> dsgPlatformQueryProjectsAndSchemaFromMeta(DsgPlatformQueryProjectsAndSchemaFromMetaRequest request);

    /**
     * @param request the request parameters of DsgQueryDefaultTemplates  DsgQueryDefaultTemplatesRequest
     * @return DsgQueryDefaultTemplatesResponse
     */
    CompletableFuture<DsgQueryDefaultTemplatesResponse> dsgQueryDefaultTemplates(DsgQueryDefaultTemplatesRequest request);

    /**
     * @param request the request parameters of DsgQueryDesensStatusList  DsgQueryDesensStatusListRequest
     * @return DsgQueryDesensStatusListResponse
     */
    CompletableFuture<DsgQueryDesensStatusListResponse> dsgQueryDesensStatusList(DsgQueryDesensStatusListRequest request);

    /**
     * <b>description</b> :
     * <p>This API corresponds to the query feature on the Data Security Guard console interface. It retrieves sensitive data identification results for a specified tenant by associating with the tenant ID.</p>
     * <ul>
     * <li>Supports filtering by dimensions such as data source type and project workspace.</li>
     * <li>Supports ascending or descending sorting on a specific field.</li>
     * <li>Supports paging.</li>
     * </ul>
     * 
     * @param request the request parameters of DsgQueryDetails  DsgQueryDetailsRequest
     * @return DsgQueryDetailsResponse
     */
    CompletableFuture<DsgQueryDetailsResponse> dsgQueryDetails(DsgQueryDetailsRequest request);

    /**
     * <b>description</b> :
     * <p>This API corresponds to the query feature on the Data Protection Umbrella console interface. It retrieves sensitive data identification results for a specified tenant by associating with the tenant ID.</p>
     * <ul>
     * <li>Supports filtering by dimensions such as data source type and project workspace.</li>
     * <li>Supports ascending or descending sorting on a specific field.</li>
     * <li>Supports paging query.</li>
     * </ul>
     * 
     * @param request the request parameters of DsgQueryRowDetail  DsgQueryRowDetailRequest
     * @return DsgQueryRowDetailResponse
     */
    CompletableFuture<DsgQueryRowDetailResponse> dsgQueryRowDetail(DsgQueryRowDetailRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation corresponds to the query feature on the Data Security Guard console interface. It retrieves the sensitive data identification results for a specified tenant by associating with the tenant ID.</p>
     * <ul>
     * <li>Supports filtering by data source type, project workspace, and other dimensions.</li>
     * <li>Supports ascending or descending sorting on a specific field.</li>
     * <li>Supports paged query.</li>
     * </ul>
     * 
     * @param request the request parameters of DsgQuerySensResult  DsgQuerySensResultRequest
     * @return DsgQuerySensResultResponse
     */
    CompletableFuture<DsgQuerySensResultResponse> dsgQuerySensResult(DsgQuerySensResultRequest request);

    /**
     * @param request the request parameters of DsgRunSensIdentify  DsgRunSensIdentifyRequest
     * @return DsgRunSensIdentifyResponse
     */
    CompletableFuture<DsgRunSensIdentifyResponse> dsgRunSensIdentify(DsgRunSensIdentifyRequest request);

    /**
     * @param request the request parameters of DsgSceneAddOrUpdateScene  DsgSceneAddOrUpdateSceneRequest
     * @return DsgSceneAddOrUpdateSceneResponse
     */
    CompletableFuture<DsgSceneAddOrUpdateSceneResponse> dsgSceneAddOrUpdateScene(DsgSceneAddOrUpdateSceneRequest request);

    /**
     * @param request the request parameters of DsgSceneQuerySceneListByName  DsgSceneQuerySceneListByNameRequest
     * @return DsgSceneQuerySceneListByNameResponse
     */
    CompletableFuture<DsgSceneQuerySceneListByNameResponse> dsgSceneQuerySceneListByName(DsgSceneQuerySceneListByNameRequest request);

    /**
     * @param request the request parameters of DsgScenedDeleteScene  DsgScenedDeleteSceneRequest
     * @return DsgScenedDeleteSceneResponse
     */
    CompletableFuture<DsgScenedDeleteSceneResponse> dsgScenedDeleteScene(DsgScenedDeleteSceneRequest request);

    /**
     * @param request the request parameters of DsgStopSensIdentify  DsgStopSensIdentifyRequest
     * @return DsgStopSensIdentifyResponse
     */
    CompletableFuture<DsgStopSensIdentifyResponse> dsgStopSensIdentify(DsgStopSensIdentifyRequest request);

    /**
     * @param request the request parameters of DsgUpdateDesensStatusList  DsgUpdateDesensStatusListRequest
     * @return DsgUpdateDesensStatusListResponse
     */
    CompletableFuture<DsgUpdateDesensStatusListResponse> dsgUpdateDesensStatusList(DsgUpdateDesensStatusListRequest request);

    /**
     * @param request the request parameters of DsgUserGroupAddOrUpdate  DsgUserGroupAddOrUpdateRequest
     * @return DsgUserGroupAddOrUpdateResponse
     */
    CompletableFuture<DsgUserGroupAddOrUpdateResponse> dsgUserGroupAddOrUpdate(DsgUserGroupAddOrUpdateRequest request);

    /**
     * @param request the request parameters of DsgUserGroupDelete  DsgUserGroupDeleteRequest
     * @return DsgUserGroupDeleteResponse
     */
    CompletableFuture<DsgUserGroupDeleteResponse> dsgUserGroupDelete(DsgUserGroupDeleteRequest request);

    /**
     * @param request the request parameters of DsgUserGroupGetOdpsRoleGroups  DsgUserGroupGetOdpsRoleGroupsRequest
     * @return DsgUserGroupGetOdpsRoleGroupsResponse
     */
    CompletableFuture<DsgUserGroupGetOdpsRoleGroupsResponse> dsgUserGroupGetOdpsRoleGroups(DsgUserGroupGetOdpsRoleGroupsRequest request);

    /**
     * @param request the request parameters of DsgUserGroupQueryList  DsgUserGroupQueryListRequest
     * @return DsgUserGroupQueryListResponse
     */
    CompletableFuture<DsgUserGroupQueryListResponse> dsgUserGroupQueryList(DsgUserGroupQueryListRequest request);

    /**
     * @param request the request parameters of DsgUserGroupQueryUserList  DsgUserGroupQueryUserListRequest
     * @return DsgUserGroupQueryUserListResponse
     */
    CompletableFuture<DsgUserGroupQueryUserListResponse> dsgUserGroupQueryUserList(DsgUserGroupQueryUserListRequest request);

    /**
     * @param request the request parameters of DsgWhiteListAddOrUpdate  DsgWhiteListAddOrUpdateRequest
     * @return DsgWhiteListAddOrUpdateResponse
     */
    CompletableFuture<DsgWhiteListAddOrUpdateResponse> dsgWhiteListAddOrUpdate(DsgWhiteListAddOrUpdateRequest request);

    /**
     * @param request the request parameters of DsgWhiteListDeleteList  DsgWhiteListDeleteListRequest
     * @return DsgWhiteListDeleteListResponse
     */
    CompletableFuture<DsgWhiteListDeleteListResponse> dsgWhiteListDeleteList(DsgWhiteListDeleteListRequest request);

    /**
     * @param request the request parameters of DsgWhiteListQueryList  DsgWhiteListQueryListRequest
     * @return DsgWhiteListQueryListResponse
     */
    CompletableFuture<DsgWhiteListQueryListResponse> dsgWhiteListQueryList(DsgWhiteListQueryListRequest request);

    /**
     * @param request the request parameters of EditRecognizeRule  EditRecognizeRuleRequest
     * @return EditRecognizeRuleResponse
     */
    CompletableFuture<EditRecognizeRuleResponse> editRecognizeRule(EditRecognizeRuleRequest request);

    /**
     * @param request the request parameters of EstablishRelationTableToBusiness  EstablishRelationTableToBusinessRequest
     * @return EstablishRelationTableToBusinessResponse
     */
    CompletableFuture<EstablishRelationTableToBusinessResponse> establishRelationTableToBusiness(EstablishRelationTableToBusinessRequest request);

    /**
     * @param request the request parameters of ExportDataSources  ExportDataSourcesRequest
     * @return ExportDataSourcesResponse
     */
    CompletableFuture<ExportDataSourcesResponse> exportDataSources(ExportDataSourcesRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to use the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to directly create a batch synchronization task in Data Integration. To create a real-time synchronization task or another type of synchronization task, you must first call the <a href="https://help.aliyun.com/document_detail/383463.html">GenerateDISyncTaskConfigForCreating</a> operation to generate the ID of an asynchronous thread and call the <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operation to obtain the asynchronously generated parameters based on the ID. Then, you can use the parameters as request parameters of <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> and call the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to create a real-time synchronization task or another type of synchronization task. DataWorks allows you to create real-time synchronization tasks and other types of synchronization tasks in Data Integration only in asynchronous mode.</p>
     * 
     * @param request the request parameters of GenerateDISyncTaskConfigForCreating  GenerateDISyncTaskConfigForCreatingRequest
     * @return GenerateDISyncTaskConfigForCreatingResponse
     */
    CompletableFuture<GenerateDISyncTaskConfigForCreatingResponse> generateDISyncTaskConfigForCreating(GenerateDISyncTaskConfigForCreatingRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to directly call the <a href="https://help.aliyun.com/document_detail/289109.html">UpdateDISyncTask</a> operation to update batch synchronization tasks in Data Integration. To update a real-time synchronization task, you must first call the GenerateDISyncTaskConfigForUpdating and <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operations to asynchronously generate the required parameters, and then pass the parameters to the UpdateDISyncTask operation. Only asynchronous updates are supported for real-time synchronization tasks in Data Integration.</p>
     * 
     * @param request the request parameters of GenerateDISyncTaskConfigForUpdating  GenerateDISyncTaskConfigForUpdatingRequest
     * @return GenerateDISyncTaskConfigForUpdatingResponse
     */
    CompletableFuture<GenerateDISyncTaskConfigForUpdatingResponse> generateDISyncTaskConfigForUpdating(GenerateDISyncTaskConfigForUpdatingRequest request);

    /**
     * @param request the request parameters of GetAlertMessage  GetAlertMessageRequest
     * @return GetAlertMessageResponse
     */
    CompletableFuture<GetAlertMessageResponse> getAlertMessage(GetAlertMessageRequest request);

    /**
     * @param request the request parameters of GetBaseline  GetBaselineRequest
     * @return GetBaselineResponse
     */
    CompletableFuture<GetBaselineResponse> getBaseline(GetBaselineRequest request);

    /**
     * @param request the request parameters of GetBaselineConfig  GetBaselineConfigRequest
     * @return GetBaselineConfigResponse
     */
    CompletableFuture<GetBaselineConfigResponse> getBaselineConfig(GetBaselineConfigRequest request);

    /**
     * <b>description</b> :
     * <p>调用前需准备有效的 BaselineId：可先通过 ListProjects 获取 ProjectId，再调用 ListBaselines，并从其 Data.Baselines[].BaselineId 获取。</p>
     * 
     * @param request the request parameters of GetBaselineKeyPath  GetBaselineKeyPathRequest
     * @return GetBaselineKeyPathResponse
     */
    CompletableFuture<GetBaselineKeyPathResponse> getBaselineKeyPath(GetBaselineKeyPathRequest request);

    /**
     * @param request the request parameters of GetBaselineStatus  GetBaselineStatusRequest
     * @return GetBaselineStatusResponse
     */
    CompletableFuture<GetBaselineStatusResponse> getBaselineStatus(GetBaselineStatusRequest request);

    /**
     * @param request the request parameters of GetBusiness  GetBusinessRequest
     * @return GetBusinessResponse
     */
    CompletableFuture<GetBusinessResponse> getBusiness(GetBusinessRequest request);

    /**
     * @deprecated OpenAPI GetDDLJobStatus is deprecated  * @param request  the request parameters of GetDDLJobStatus  GetDDLJobStatusRequest
     * @return GetDDLJobStatusResponse
     */
    @Deprecated
    CompletableFuture<GetDDLJobStatusResponse> getDDLJobStatus(GetDDLJobStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Alert rules can be configured when your task includes real-time synchronization.</p>
     * 
     * @param request the request parameters of GetDIAlarmRule  GetDIAlarmRuleRequest
     * @return GetDIAlarmRuleResponse
     */
    CompletableFuture<GetDIAlarmRuleResponse> getDIAlarmRule(GetDIAlarmRuleRequest request);

    /**
     * @param request the request parameters of GetDIJob  GetDIJobRequest
     * @return GetDIJobResponse
     */
    CompletableFuture<GetDIJobResponse> getDIJob(GetDIJobRequest request);

    /**
     * @param request the request parameters of GetDISyncInstanceInfo  GetDISyncInstanceInfoRequest
     * @return GetDISyncInstanceInfoResponse
     */
    CompletableFuture<GetDISyncInstanceInfoResponse> getDISyncInstanceInfo(GetDISyncInstanceInfoRequest request);

    /**
     * @param request the request parameters of GetDISyncTask  GetDISyncTaskRequest
     * @return GetDISyncTaskResponse
     */
    CompletableFuture<GetDISyncTaskResponse> getDISyncTask(GetDISyncTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Supported DAG types:</p>
     * <ul>
     * <li>MANUAL: DAG for a manually triggered workflow</li>
     * <li>SMOKE_TEST: DAG for a smoke testing workflow</li>
     * <li>SUPPLY_DATA: DAG for a data backfill instance</li>
     * <li>BUSINESS_PROCESS_DAG: DAG for a one-time workflow
     * Supported DAG states:</li>
     * <li>CREATED: The DAG is created.</li>
     * <li>RUNNING: The DAG is running.</li>
     * <li>FAILURE: The DAG fails to run.</li>
     * <li>SUCCESS: The DAG is successfully run.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDag  GetDagRequest
     * @return GetDagResponse
     */
    CompletableFuture<GetDagResponse> getDag(GetDagRequest request);

    /**
     * @param request the request parameters of GetDataServiceApi  GetDataServiceApiRequest
     * @return GetDataServiceApiResponse
     */
    CompletableFuture<GetDataServiceApiResponse> getDataServiceApi(GetDataServiceApiRequest request);

    /**
     * @param request the request parameters of GetDataServiceApiTest  GetDataServiceApiTestRequest
     * @return GetDataServiceApiTestResponse
     */
    CompletableFuture<GetDataServiceApiTestResponse> getDataServiceApiTest(GetDataServiceApiTestRequest request);

    /**
     * @param request the request parameters of GetDataServiceApplication  GetDataServiceApplicationRequest
     * @return GetDataServiceApplicationResponse
     */
    CompletableFuture<GetDataServiceApplicationResponse> getDataServiceApplication(GetDataServiceApplicationRequest request);

    /**
     * @param request the request parameters of GetDataServiceFolder  GetDataServiceFolderRequest
     * @return GetDataServiceFolderResponse
     */
    CompletableFuture<GetDataServiceFolderResponse> getDataServiceFolder(GetDataServiceFolderRequest request);

    /**
     * @param request the request parameters of GetDataServiceGroup  GetDataServiceGroupRequest
     * @return GetDataServiceGroupResponse
     */
    CompletableFuture<GetDataServiceGroupResponse> getDataServiceGroup(GetDataServiceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>前置条件：请先开通 DataWorks 企业版或旗舰版，并准备已发布的数据服务 API。ProjectId 可通过 ListProjects 获取，ApiId 可通过 ListDataServicePublishedApis 的 Data.Apis[].ApiId 获取；未开通所需版本时会返回 403 Forbidden.Access。</p>
     * 
     * @param request the request parameters of GetDataServicePublishedApi  GetDataServicePublishedApiRequest
     * @return GetDataServicePublishedApiResponse
     */
    CompletableFuture<GetDataServicePublishedApiResponse> getDataServicePublishedApi(GetDataServicePublishedApiRequest request);

    /**
     * @param request the request parameters of GetDataSourceMeta  GetDataSourceMetaRequest
     * @return GetDataSourceMetaResponse
     */
    CompletableFuture<GetDataSourceMetaResponse> getDataSourceMeta(GetDataSourceMetaRequest request);

    /**
     * @param request the request parameters of GetDeployment  GetDeploymentRequest
     * @return GetDeploymentResponse
     */
    CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request);

    /**
     * @param request the request parameters of GetExtension  GetExtensionRequest
     * @return GetExtensionResponse
     */
    CompletableFuture<GetExtensionResponse> getExtension(GetExtensionRequest request);

    /**
     * @param request the request parameters of GetFile  GetFileRequest
     * @return GetFileResponse
     */
    CompletableFuture<GetFileResponse> getFile(GetFileRequest request);

    /**
     * @param request the request parameters of GetFileTypeStatistic  GetFileTypeStatisticRequest
     * @return GetFileTypeStatisticResponse
     */
    CompletableFuture<GetFileTypeStatisticResponse> getFileTypeStatistic(GetFileTypeStatisticRequest request);

    /**
     * @param request the request parameters of GetFileVersion  GetFileVersionRequest
     * @return GetFileVersionResponse
     */
    CompletableFuture<GetFileVersionResponse> getFileVersion(GetFileVersionRequest request);

    /**
     * @param request the request parameters of GetFolder  GetFolderRequest
     * @return GetFolderResponse
     */
    CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin: Activate DataWorks Enterprise Edition or Ultimate Edition before calling this operation. If the edition is not activated, the service returns a 403 Forbidden.Access error.</p>
     * 
     * @param request the request parameters of GetIDEEventDetail  GetIDEEventDetailRequest
     * @return GetIDEEventDetailResponse
     */
    CompletableFuture<GetIDEEventDetailResponse> getIDEEventDetail(GetIDEEventDetailRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @deprecated OpenAPI GetInstanceConsumeTimeRank is deprecated  * @param request  the request parameters of GetInstanceConsumeTimeRank  GetInstanceConsumeTimeRankRequest
     * @return GetInstanceConsumeTimeRankResponse
     */
    @Deprecated
    CompletableFuture<GetInstanceConsumeTimeRankResponse> getInstanceConsumeTimeRank(GetInstanceConsumeTimeRankRequest request);

    /**
     * @deprecated OpenAPI GetInstanceCountTrend is deprecated  * @param request  the request parameters of GetInstanceCountTrend  GetInstanceCountTrendRequest
     * @return GetInstanceCountTrendResponse
     */
    @Deprecated
    CompletableFuture<GetInstanceCountTrendResponse> getInstanceCountTrend(GetInstanceCountTrendRequest request);

    /**
     * @deprecated OpenAPI GetInstanceErrorRank is deprecated  * @param request  the request parameters of GetInstanceErrorRank  GetInstanceErrorRankRequest
     * @return GetInstanceErrorRankResponse
     */
    @Deprecated
    CompletableFuture<GetInstanceErrorRankResponse> getInstanceErrorRank(GetInstanceErrorRankRequest request);

    /**
     * <b>description</b> :
     * <p>You may not obtain the instance logs that were generated more than seven days ago.</p>
     * 
     * @param request the request parameters of GetInstanceLog  GetInstanceLogRequest
     * @return GetInstanceLogResponse
     */
    CompletableFuture<GetInstanceLogResponse> getInstanceLog(GetInstanceLogRequest request);

    /**
     * @deprecated OpenAPI GetInstanceStatusCount is deprecated  * @param request  the request parameters of GetInstanceStatusCount  GetInstanceStatusCountRequest
     * @return GetInstanceStatusCountResponse
     */
    @Deprecated
    CompletableFuture<GetInstanceStatusCountResponse> getInstanceStatusCount(GetInstanceStatusCountRequest request);

    /**
     * @param request the request parameters of GetInstanceStatusStatistic  GetInstanceStatusStatisticRequest
     * @return GetInstanceStatusStatisticResponse
     */
    CompletableFuture<GetInstanceStatusStatisticResponse> getInstanceStatusStatistic(GetInstanceStatusStatisticRequest request);

    /**
     * @deprecated OpenAPI GetManualDagInstances is deprecated  * @param request  the request parameters of GetManualDagInstances  GetManualDagInstancesRequest
     * @return GetManualDagInstancesResponse
     */
    @Deprecated
    CompletableFuture<GetManualDagInstancesResponse> getManualDagInstances(GetManualDagInstancesRequest request);

    /**
     * @param request the request parameters of GetMetaCategory  GetMetaCategoryRequest
     * @return GetMetaCategoryResponse
     */
    CompletableFuture<GetMetaCategoryResponse> getMetaCategory(GetMetaCategoryRequest request);

    /**
     * @param request the request parameters of GetMetaCollectionDetail  GetMetaCollectionDetailRequest
     * @return GetMetaCollectionDetailResponse
     */
    CompletableFuture<GetMetaCollectionDetailResponse> getMetaCollectionDetail(GetMetaCollectionDetailRequest request);

    /**
     * @param request the request parameters of GetMetaColumnLineage  GetMetaColumnLineageRequest
     * @return GetMetaColumnLineageResponse
     */
    CompletableFuture<GetMetaColumnLineageResponse> getMetaColumnLineage(GetMetaColumnLineageRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin: Activate DataWorks Enterprise Edition or Ultimate Edition before calling this operation. If the edition is not activated, the service returns 403 Forbidden.Access.</p>
     * 
     * @param request the request parameters of GetMetaDBInfo  GetMetaDBInfoRequest
     * @return GetMetaDBInfoResponse
     */
    CompletableFuture<GetMetaDBInfoResponse> getMetaDBInfo(GetMetaDBInfoRequest request);

    /**
     * @param request the request parameters of GetMetaDBTableList  GetMetaDBTableListRequest
     * @return GetMetaDBTableListResponse
     */
    CompletableFuture<GetMetaDBTableListResponse> getMetaDBTableList(GetMetaDBTableListRequest request);

    /**
     * <b>description</b> :
     * <p>前置条件：调用本接口前，请先开通 DataWorks 企业版或旗舰版；未开通时服务会返回 403 Forbidden.Access。</p>
     * 
     * @param request the request parameters of GetMetaTableBasicInfo  GetMetaTableBasicInfoRequest
     * @return GetMetaTableBasicInfoResponse
     */
    CompletableFuture<GetMetaTableBasicInfoResponse> getMetaTableBasicInfo(GetMetaTableBasicInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>We do not recommend that you use this API operation. A new API operation will be released to replace it.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetMetaTableChangeLog  GetMetaTableChangeLogRequest
     * @return GetMetaTableChangeLogResponse
     */
    CompletableFuture<GetMetaTableChangeLogResponse> getMetaTableChangeLog(GetMetaTableChangeLogRequest request);

    /**
     * @param request the request parameters of GetMetaTableColumn  GetMetaTableColumnRequest
     * @return GetMetaTableColumnResponse
     */
    CompletableFuture<GetMetaTableColumnResponse> getMetaTableColumn(GetMetaTableColumnRequest request);

    /**
     * @deprecated OpenAPI GetMetaTableFullInfo is deprecated  * @description Only tables of the EMR engine type are supported.
     * 
     * @param request the request parameters of GetMetaTableFullInfo  GetMetaTableFullInfoRequest
     * @return GetMetaTableFullInfoResponse
     */
    @Deprecated
    CompletableFuture<GetMetaTableFullInfoResponse> getMetaTableFullInfo(GetMetaTableFullInfoRequest request);

    /**
     * @param request the request parameters of GetMetaTableIntroWiki  GetMetaTableIntroWikiRequest
     * @return GetMetaTableIntroWikiResponse
     */
    CompletableFuture<GetMetaTableIntroWikiResponse> getMetaTableIntroWiki(GetMetaTableIntroWikiRequest request);

    /**
     * @param request the request parameters of GetMetaTableLineage  GetMetaTableLineageRequest
     * @return GetMetaTableLineageResponse
     */
    CompletableFuture<GetMetaTableLineageResponse> getMetaTableLineage(GetMetaTableLineageRequest request);

    /**
     * @param request the request parameters of GetMetaTableListByCategory  GetMetaTableListByCategoryRequest
     * @return GetMetaTableListByCategoryResponse
     */
    CompletableFuture<GetMetaTableListByCategoryResponse> getMetaTableListByCategory(GetMetaTableListByCategoryRequest request);

    /**
     * @param request the request parameters of GetMetaTableOutput  GetMetaTableOutputRequest
     * @return GetMetaTableOutputResponse
     */
    CompletableFuture<GetMetaTableOutputResponse> getMetaTableOutput(GetMetaTableOutputRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports only MaxCompute and E-MapReduce (EMR) tables. For EMR, supported cluster types include new data lake clusters that use Data Lake Formation (DLF) for metadata management, and Hadoop clusters with versions earlier than V3.41.0 or V5.7.0.</p>
     * 
     * @param request the request parameters of GetMetaTablePartition  GetMetaTablePartitionRequest
     * @return GetMetaTablePartitionResponse
     */
    CompletableFuture<GetMetaTablePartitionResponse> getMetaTablePartition(GetMetaTablePartitionRequest request);

    /**
     * @param request the request parameters of GetMetaTableProducingTasks  GetMetaTableProducingTasksRequest
     * @return GetMetaTableProducingTasksResponse
     */
    CompletableFuture<GetMetaTableProducingTasksResponse> getMetaTableProducingTasks(GetMetaTableProducingTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin: Activate DataWorks Enterprise Edition or Ultimate Edition. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> to activate or upgrade to the required edition.</p>
     * 
     * @param request the request parameters of GetMetaTableThemeLevel  GetMetaTableThemeLevelRequest
     * @return GetMetaTableThemeLevelResponse
     */
    CompletableFuture<GetMetaTableThemeLevelResponse> getMetaTableThemeLevel(GetMetaTableThemeLevelRequest request);

    /**
     * @param request the request parameters of GetMigrationProcess  GetMigrationProcessRequest
     * @return GetMigrationProcessResponse
     */
    CompletableFuture<GetMigrationProcessResponse> getMigrationProcess(GetMigrationProcessRequest request);

    /**
     * @param request the request parameters of GetMigrationSummary  GetMigrationSummaryRequest
     * @return GetMigrationSummaryResponse
     */
    CompletableFuture<GetMigrationSummaryResponse> getMigrationSummary(GetMigrationSummaryRequest request);

    /**
     * @param request the request parameters of GetNode  GetNodeRequest
     * @return GetNodeResponse
     */
    CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request);

    /**
     * @param request the request parameters of GetNodeChildren  GetNodeChildrenRequest
     * @return GetNodeChildrenResponse
     */
    CompletableFuture<GetNodeChildrenResponse> getNodeChildren(GetNodeChildrenRequest request);

    /**
     * @param request the request parameters of GetNodeCode  GetNodeCodeRequest
     * @return GetNodeCodeResponse
     */
    CompletableFuture<GetNodeCodeResponse> getNodeCode(GetNodeCodeRequest request);

    /**
     * @deprecated OpenAPI GetNodeOnBaseline is deprecated  * @param request  the request parameters of GetNodeOnBaseline  GetNodeOnBaselineRequest
     * @return GetNodeOnBaselineResponse
     */
    @Deprecated
    CompletableFuture<GetNodeOnBaselineResponse> getNodeOnBaseline(GetNodeOnBaselineRequest request);

    /**
     * @param request the request parameters of GetNodeParents  GetNodeParentsRequest
     * @return GetNodeParentsResponse
     */
    CompletableFuture<GetNodeParentsResponse> getNodeParents(GetNodeParentsRequest request);

    /**
     * @deprecated OpenAPI GetNodeTypeListInfo is deprecated  * @param request  the request parameters of GetNodeTypeListInfo  GetNodeTypeListInfoRequest
     * @return GetNodeTypeListInfoResponse
     */
    @Deprecated
    CompletableFuture<GetNodeTypeListInfoResponse> getNodeTypeListInfo(GetNodeTypeListInfoRequest request);

    /**
     * @param request the request parameters of GetOpRiskData  GetOpRiskDataRequest
     * @return GetOpRiskDataResponse
     */
    CompletableFuture<GetOpRiskDataResponse> getOpRiskData(GetOpRiskDataRequest request);

    /**
     * @param request the request parameters of GetOpSensitiveData  GetOpSensitiveDataRequest
     * @return GetOpSensitiveDataResponse
     */
    CompletableFuture<GetOpSensitiveDataResponse> getOpSensitiveData(GetOpSensitiveDataRequest request);

    /**
     * @param request the request parameters of GetOptionValueForProject  GetOptionValueForProjectRequest
     * @return GetOptionValueForProjectResponse
     */
    CompletableFuture<GetOptionValueForProjectResponse> getOptionValueForProject(GetOptionValueForProjectRequest request);

    /**
     * <b>description</b> :
     * <p><em>Note: The 2020 version of OpenAPI will be discontinued. Migrate to the 2024 version of OpenAPI as soon as possible: <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/api-dataworks-public-2024-05-18-getapplicationcontents">GetApplicationContents</a>/<a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/api-dataworks-public-2024-05-18-getprocessinstance">GetProcessInstance</a>.</em>*</p>
     * 
     * @param request the request parameters of GetPermissionApplyOrderDetail  GetPermissionApplyOrderDetailRequest
     * @return GetPermissionApplyOrderDetailResponse
     */
    CompletableFuture<GetPermissionApplyOrderDetailResponse> getPermissionApplyOrderDetail(GetPermissionApplyOrderDetailRequest request);

    /**
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * @deprecated OpenAPI GetProjectDetail is deprecated, please use dataworks-public::2020-05-18::GetProject instead.  * @param request  the request parameters of GetProjectDetail  GetProjectDetailRequest
     * @return GetProjectDetailResponse
     */
    @Deprecated
    CompletableFuture<GetProjectDetailResponse> getProjectDetail(GetProjectDetailRequest request);

    /**
     * @deprecated OpenAPI GetQualityEntity is deprecated, please use dataworks-public::2024-05-18::GetDataQualityScan instead.  * @param request  the request parameters of GetQualityEntity  GetQualityEntityRequest
     * @return GetQualityEntityResponse
     */
    @Deprecated
    CompletableFuture<GetQualityEntityResponse> getQualityEntity(GetQualityEntityRequest request);

    /**
     * @deprecated OpenAPI GetQualityFollower is deprecated, please use dataworks-public::2024-05-18::GetDataQualityAlertRule instead.  * @param request  the request parameters of GetQualityFollower  GetQualityFollowerRequest
     * @return GetQualityFollowerResponse
     */
    @Deprecated
    CompletableFuture<GetQualityFollowerResponse> getQualityFollower(GetQualityFollowerRequest request);

    /**
     * @deprecated OpenAPI GetQualityRule is deprecated, please use dataworks-public::2024-05-18::GetDataQualityScan instead.  * @param request  the request parameters of GetQualityRule  GetQualityRuleRequest
     * @return GetQualityRuleResponse
     */
    @Deprecated
    CompletableFuture<GetQualityRuleResponse> getQualityRule(GetQualityRuleRequest request);

    /**
     * @param request the request parameters of GetRemind  GetRemindRequest
     * @return GetRemindResponse
     */
    CompletableFuture<GetRemindResponse> getRemind(GetRemindRequest request);

    /**
     * @param request the request parameters of GetSensitiveData  GetSensitiveDataRequest
     * @return GetSensitiveDataResponse
     */
    CompletableFuture<GetSensitiveDataResponse> getSensitiveData(GetSensitiveDataRequest request);

    /**
     * @deprecated OpenAPI GetSuccessInstanceTrend is deprecated  * @param request  the request parameters of GetSuccessInstanceTrend  GetSuccessInstanceTrendRequest
     * @return GetSuccessInstanceTrendResponse
     */
    @Deprecated
    CompletableFuture<GetSuccessInstanceTrendResponse> getSuccessInstanceTrend(GetSuccessInstanceTrendRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of GetTopic  GetTopicRequest
     * @return GetTopicResponse
     */
    CompletableFuture<GetTopicResponse> getTopic(GetTopicRequest request);

    /**
     * @param request the request parameters of GetTopicInfluence  GetTopicInfluenceRequest
     * @return GetTopicInfluenceResponse
     */
    CompletableFuture<GetTopicInfluenceResponse> getTopicInfluence(GetTopicInfluenceRequest request);

    /**
     * <b>description</b> :
     * <p>You can import self-managed data sources or data sources that are exported from other DataWorks workspaces to a specific DataWorks workspace.</p>
     * <ul>
     * <li>To import a self-managed data source to a DataWorks workspace, the data source type must be supported by DataWorks. For more information about the types of data sources supported by DataWorks, see <a href="https://help.aliyun.com/document_detail/181656.html">Supported data stores</a>.</li>
     * <li>For more information about how to export data sources from DataWorks workspaces to your on-premises machine, see <a href="https://help.aliyun.com/document_detail/279570.html">ExportDataSources</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportDataSources  ImportDataSourcesRequest
     * @return ImportDataSourcesResponse
     */
    CompletableFuture<ImportDataSourcesResponse> importDataSources(ImportDataSourcesRequest request);

    /**
     * @param request the request parameters of ListAlertMessages  ListAlertMessagesRequest
     * @return ListAlertMessagesResponse
     */
    CompletableFuture<ListAlertMessagesResponse> listAlertMessages(ListAlertMessagesRequest request);

    /**
     * @param request the request parameters of ListBaselineConfigs  ListBaselineConfigsRequest
     * @return ListBaselineConfigsResponse
     */
    CompletableFuture<ListBaselineConfigsResponse> listBaselineConfigs(ListBaselineConfigsRequest request);

    /**
     * @param request the request parameters of ListBaselineStatuses  ListBaselineStatusesRequest
     * @return ListBaselineStatusesResponse
     */
    CompletableFuture<ListBaselineStatusesResponse> listBaselineStatuses(ListBaselineStatusesRequest request);

    /**
     * @param request the request parameters of ListBaselines  ListBaselinesRequest
     * @return ListBaselinesResponse
     */
    CompletableFuture<ListBaselinesResponse> listBaselines(ListBaselinesRequest request);

    /**
     * @param request the request parameters of ListBusiness  ListBusinessRequest
     * @return ListBusinessResponse
     */
    CompletableFuture<ListBusinessResponse> listBusiness(ListBusinessRequest request);

    /**
     * @param request the request parameters of ListCalcEngines  ListCalcEnginesRequest
     * @return ListCalcEnginesResponse
     */
    CompletableFuture<ListCalcEnginesResponse> listCalcEngines(ListCalcEnginesRequest request);

    /**
     * @param request the request parameters of ListCheckProcesses  ListCheckProcessesRequest
     * @return ListCheckProcessesResponse
     */
    CompletableFuture<ListCheckProcessesResponse> listCheckProcesses(ListCheckProcessesRequest request);

    /**
     * @param request the request parameters of ListClusterConfigs  ListClusterConfigsRequest
     * @return ListClusterConfigsResponse
     */
    CompletableFuture<ListClusterConfigsResponse> listClusterConfigs(ListClusterConfigsRequest request);

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
     * @deprecated OpenAPI ListConnections is deprecated  * @param request  the request parameters of ListConnections  ListConnectionsRequest
     * @return ListConnectionsResponse
     */
    @Deprecated
    CompletableFuture<ListConnectionsResponse> listConnections(ListConnectionsRequest request);

    /**
     * <b>description</b> :
     * <p>When your task synchronization type includes real-time synchronization, you can configure alert rules.</p>
     * 
     * @param request the request parameters of ListDIAlarmRules  ListDIAlarmRulesRequest
     * @return ListDIAlarmRulesResponse
     */
    CompletableFuture<ListDIAlarmRulesResponse> listDIAlarmRules(ListDIAlarmRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This list operation returns only basic task information. To view detailed task information, call the GetDIJob operation.
     * Prerequisites: Activate DataWorks Enterprise Edition or Ultimate Edition first. The required ProjectId can be obtained from PageResult.ProjectList[].ProjectId in the ListProjects response. If the required edition is not activated, this operation returns 403 Forbidden.Access.</p>
     * 
     * @param request the request parameters of ListDIJobs  ListDIJobsRequest
     * @return ListDIJobsResponse
     */
    CompletableFuture<ListDIJobsResponse> listDIJobs(ListDIJobsRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to specify a default global configuration only for the processing rules of DDL messages in synchronization solutions. After you configure the <strong>processing rules of DDL messages</strong> in synchronization solutions, the configuration is used as the default global configuration and applies to all real-time synchronization tasks in the solutions. You can modify the <strong>processing rules of DDL messages</strong> based on your business requirements. For more information about how to configure a synchronization solution, see <a href="https://help.aliyun.com/document_detail/199008.html">Synchronization solutions</a>.</p>
     * 
     * @param request the request parameters of ListDIProjectConfig  ListDIProjectConfigRequest
     * @return ListDIProjectConfigResponse
     */
    CompletableFuture<ListDIProjectConfigResponse> listDIProjectConfig(ListDIProjectConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Dag Type values:</p>
     * <ul>
     * <li>MANUAL: manual task workflow</li>
     * <li>SMOKE_TEST: smoke test workflow</li>
     * <li>SUPPLY_DATA: data backfill</li>
     * <li>BUSINESS_PROCESS_DAG: one-time business process workflow
     * Dag Status values:</li>
     * <li>CREATED: created</li>
     * <li>RUNNING: running</li>
     * <li>FAILURE: failed</li>
     * <li>SUCCESS: succeeded</li>
     * </ul>
     * 
     * @param request the request parameters of ListDags  ListDagsRequest
     * @return ListDagsResponse
     */
    CompletableFuture<ListDagsResponse> listDags(ListDagsRequest request);

    /**
     * @param request the request parameters of ListDataServiceApiAuthorities  ListDataServiceApiAuthoritiesRequest
     * @return ListDataServiceApiAuthoritiesResponse
     */
    CompletableFuture<ListDataServiceApiAuthoritiesResponse> listDataServiceApiAuthorities(ListDataServiceApiAuthoritiesRequest request);

    /**
     * @param request the request parameters of ListDataServiceApiTest  ListDataServiceApiTestRequest
     * @return ListDataServiceApiTestResponse
     */
    CompletableFuture<ListDataServiceApiTestResponse> listDataServiceApiTest(ListDataServiceApiTestRequest request);

    /**
     * @param request the request parameters of ListDataServiceApis  ListDataServiceApisRequest
     * @return ListDataServiceApisResponse
     */
    CompletableFuture<ListDataServiceApisResponse> listDataServiceApis(ListDataServiceApisRequest request);

    /**
     * @param request the request parameters of ListDataServiceApplications  ListDataServiceApplicationsRequest
     * @return ListDataServiceApplicationsResponse
     */
    CompletableFuture<ListDataServiceApplicationsResponse> listDataServiceApplications(ListDataServiceApplicationsRequest request);

    /**
     * @param request the request parameters of ListDataServiceAuthorizedApis  ListDataServiceAuthorizedApisRequest
     * @return ListDataServiceAuthorizedApisResponse
     */
    CompletableFuture<ListDataServiceAuthorizedApisResponse> listDataServiceAuthorizedApis(ListDataServiceAuthorizedApisRequest request);

    /**
     * @param request the request parameters of ListDataServiceFolders  ListDataServiceFoldersRequest
     * @return ListDataServiceFoldersResponse
     */
    CompletableFuture<ListDataServiceFoldersResponse> listDataServiceFolders(ListDataServiceFoldersRequest request);

    /**
     * @param request the request parameters of ListDataServiceGroups  ListDataServiceGroupsRequest
     * @return ListDataServiceGroupsResponse
     */
    CompletableFuture<ListDataServiceGroupsResponse> listDataServiceGroups(ListDataServiceGroupsRequest request);

    /**
     * @param request the request parameters of ListDataServicePublishedApis  ListDataServicePublishedApisRequest
     * @return ListDataServicePublishedApisResponse
     */
    CompletableFuture<ListDataServicePublishedApisResponse> listDataServicePublishedApis(ListDataServicePublishedApisRequest request);

    /**
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    /**
     * @param request the request parameters of ListDeployments  ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request);

    /**
     * <b>description</b> :
     * <p>For information about codes of extension point events, see <a href="https://help.aliyun.com/document_detail/463357.html">Development references: Extension point event codes</a>.</p>
     * 
     * @param request the request parameters of ListEnabledExtensionsForProject  ListEnabledExtensionsForProjectRequest
     * @return ListEnabledExtensionsForProjectResponse
     */
    CompletableFuture<ListEnabledExtensionsForProjectResponse> listEnabledExtensionsForProject(ListEnabledExtensionsForProjectRequest request);

    /**
     * @param request the request parameters of ListEntitiesByTags  ListEntitiesByTagsRequest
     * @return ListEntitiesByTagsResponse
     */
    CompletableFuture<ListEntitiesByTagsResponse> listEntitiesByTags(ListEntitiesByTagsRequest request);

    /**
     * @param request the request parameters of ListEntityTags  ListEntityTagsRequest
     * @return ListEntityTagsResponse
     */
    CompletableFuture<ListEntityTagsResponse> listEntityTags(ListEntityTagsRequest request);

    /**
     * @param request the request parameters of ListExtensions  ListExtensionsRequest
     * @return ListExtensionsResponse
     */
    CompletableFuture<ListExtensionsResponse> listExtensions(ListExtensionsRequest request);

    /**
     * @param request the request parameters of ListFileType  ListFileTypeRequest
     * @return ListFileTypeResponse
     */
    CompletableFuture<ListFileTypeResponse> listFileType(ListFileTypeRequest request);

    /**
     * @param request the request parameters of ListFileVersions  ListFileVersionsRequest
     * @return ListFileVersionsResponse
     */
    CompletableFuture<ListFileVersionsResponse> listFileVersions(ListFileVersionsRequest request);

    /**
     * @param request the request parameters of ListFiles  ListFilesRequest
     * @return ListFilesResponse
     */
    CompletableFuture<ListFilesResponse> listFiles(ListFilesRequest request);

    /**
     * @param request the request parameters of ListFolders  ListFoldersRequest
     * @return ListFoldersResponse
     */
    CompletableFuture<ListFoldersResponse> listFolders(ListFoldersRequest request);

    /**
     * @param request the request parameters of ListInnerNodes  ListInnerNodesRequest
     * @return ListInnerNodesResponse
     */
    CompletableFuture<ListInnerNodesResponse> listInnerNodes(ListInnerNodesRequest request);

    /**
     * @param request the request parameters of ListInstanceAmount  ListInstanceAmountRequest
     * @return ListInstanceAmountResponse
     */
    CompletableFuture<ListInstanceAmountResponse> listInstanceAmount(ListInstanceAmountRequest request);

    /**
     * @param request the request parameters of ListInstanceHistory  ListInstanceHistoryRequest
     * @return ListInstanceHistoryResponse
     */
    CompletableFuture<ListInstanceHistoryResponse> listInstanceHistory(ListInstanceHistoryRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListLineage  ListLineageRequest
     * @return ListLineageResponse
     */
    CompletableFuture<ListLineageResponse> listLineage(ListLineageRequest request);

    /**
     * @param request the request parameters of ListManualDagInstances  ListManualDagInstancesRequest
     * @return ListManualDagInstancesResponse
     */
    CompletableFuture<ListManualDagInstancesResponse> listManualDagInstances(ListManualDagInstancesRequest request);

    /**
     * @param request the request parameters of ListMeasureData  ListMeasureDataRequest
     * @return ListMeasureDataResponse
     */
    CompletableFuture<ListMeasureDataResponse> listMeasureData(ListMeasureDataRequest request);

    /**
     * @param request the request parameters of ListMetaCollectionEntities  ListMetaCollectionEntitiesRequest
     * @return ListMetaCollectionEntitiesResponse
     */
    CompletableFuture<ListMetaCollectionEntitiesResponse> listMetaCollectionEntities(ListMetaCollectionEntitiesRequest request);

    /**
     * <b>description</b> :
     * <p>Collections include: ALBUM (album collection) and ALBUM_CATEGORY (subcategory within an album).</p>
     * 
     * @param request the request parameters of ListMetaCollections  ListMetaCollectionsRequest
     * @return ListMetaCollectionsResponse
     */
    CompletableFuture<ListMetaCollectionsResponse> listMetaCollections(ListMetaCollectionsRequest request);

    /**
     * @param request the request parameters of ListMetaDB  ListMetaDBRequest
     * @return ListMetaDBResponse
     */
    CompletableFuture<ListMetaDBResponse> listMetaDB(ListMetaDBRequest request);

    /**
     * @param request the request parameters of ListMigrations  ListMigrationsRequest
     * @return ListMigrationsResponse
     */
    CompletableFuture<ListMigrationsResponse> listMigrations(ListMigrationsRequest request);

    /**
     * @deprecated OpenAPI ListNodeIO is deprecated  * @param request  the request parameters of ListNodeIO  ListNodeIORequest
     * @return ListNodeIOResponse
     */
    @Deprecated
    CompletableFuture<ListNodeIOResponse> listNodeIO(ListNodeIORequest request);

    /**
     * @param request the request parameters of ListNodeInputOrOutput  ListNodeInputOrOutputRequest
     * @return ListNodeInputOrOutputResponse
     */
    CompletableFuture<ListNodeInputOrOutputResponse> listNodeInputOrOutput(ListNodeInputOrOutputRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * @param request the request parameters of ListNodesByBaseline  ListNodesByBaselineRequest
     * @return ListNodesByBaselineResponse
     */
    CompletableFuture<ListNodesByBaselineResponse> listNodesByBaseline(ListNodesByBaselineRequest request);

    /**
     * @param request the request parameters of ListNodesByOutput  ListNodesByOutputRequest
     * @return ListNodesByOutputResponse
     */
    CompletableFuture<ListNodesByOutputResponse> listNodesByOutput(ListNodesByOutputRequest request);

    /**
     * <b>description</b> :
     * <p><em>Note: The 2020 version of OpenAPI will be discontinued at a scheduled time. Please migrate to the 2024 version of OpenAPI as soon as possible — <a href="https://help.aliyun.com/zh/dataworks/developer-reference/api-dataworks-public-2024-05-18-listmyapplications?spm=a2c4g.11186623.help-menu-72772.d_1_1_3_12_0_7.1c237afdFAePBC&scm=20140722.H_3040929._.OR_help-T_cn~zh-V_1">ListMyApplications</a>/<a href="https://help.aliyun.com/zh/dataworks/developer-reference/api-dataworks-public-2024-05-18-listpendingapprovals?spm=a2c4g.11186623.help-menu-72772.d_1_1_3_12_0_5.644e11b8FqtyZe&scm=20140722.H_3040932._.OR_help-T_cn~zh-V_1">ListPendingApprovals</a>/<a href="https://help.aliyun.com/zh/dataworks/developer-reference/api-dataworks-public-2024-05-18-listmyrelatedapprovals?spm=a2c4g.11186623.help-menu-72772.d_1_1_3_12_0_6.62893177dwvvfp&scm=20140722.H_3040931._.OR_help-T_cn~zh-V_1">ListMyRelatedApprovals</a>.</em>*</p>
     * 
     * @param request the request parameters of ListPermissionApplyOrders  ListPermissionApplyOrdersRequest
     * @return ListPermissionApplyOrdersResponse
     */
    CompletableFuture<ListPermissionApplyOrdersResponse> listPermissionApplyOrders(ListPermissionApplyOrdersRequest request);

    /**
     * @deprecated OpenAPI ListProgramTypeCount is deprecated  * @param request  the request parameters of ListProgramTypeCount  ListProgramTypeCountRequest
     * @return ListProgramTypeCountResponse
     */
    @Deprecated
    CompletableFuture<ListProgramTypeCountResponse> listProgramTypeCount(ListProgramTypeCountRequest request);

    /**
     * <b>description</b> :
     * <p>Your Alibaba Cloud account can have different role permissions such as Developer, O\&amp;M, and Workspace Administrator in a DataWorks workspace. For more information about workspace role permissions, see <a href="https://help.aliyun.com/document_detail/136941.html">DataWorks role management</a>.</p>
     * 
     * @param request the request parameters of ListProjectIds  ListProjectIdsRequest
     * @return ListProjectIdsResponse
     */
    CompletableFuture<ListProjectIdsResponse> listProjectIds(ListProjectIdsRequest request);

    /**
     * @param request the request parameters of ListProjectMembers  ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request);

    /**
     * @param request the request parameters of ListProjectRoles  ListProjectRolesRequest
     * @return ListProjectRolesResponse
     */
    CompletableFuture<ListProjectRolesResponse> listProjectRoles(ListProjectRolesRequest request);

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * @deprecated OpenAPI ListQualityResultsByEntity is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScanRuns instead.  * @description ***
     * 
     * @param request the request parameters of ListQualityResultsByEntity  ListQualityResultsByEntityRequest
     * @return ListQualityResultsByEntityResponse
     */
    @Deprecated
    CompletableFuture<ListQualityResultsByEntityResponse> listQualityResultsByEntity(ListQualityResultsByEntityRequest request);

    /**
     * @deprecated OpenAPI ListQualityResultsByRule is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScanRuns instead.  * @param request  the request parameters of ListQualityResultsByRule  ListQualityResultsByRuleRequest
     * @return ListQualityResultsByRuleResponse
     */
    @Deprecated
    CompletableFuture<ListQualityResultsByRuleResponse> listQualityResultsByRule(ListQualityResultsByRuleRequest request);

    /**
     * @deprecated OpenAPI ListQualityRules is deprecated, please use dataworks-public::2024-05-18::GetDataQualityScan instead.  * @param request  the request parameters of ListQualityRules  ListQualityRulesRequest
     * @return ListQualityRulesResponse
     */
    @Deprecated
    CompletableFuture<ListQualityRulesResponse> listQualityRules(ListQualityRulesRequest request);

    /**
     * @param request the request parameters of ListRefDISyncTasks  ListRefDISyncTasksRequest
     * @return ListRefDISyncTasksResponse
     */
    CompletableFuture<ListRefDISyncTasksResponse> listRefDISyncTasks(ListRefDISyncTasksRequest request);

    /**
     * @param request the request parameters of ListReminds  ListRemindsRequest
     * @return ListRemindsResponse
     */
    CompletableFuture<ListRemindsResponse> listReminds(ListRemindsRequest request);

    /**
     * @param request the request parameters of ListResourceGroups  ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    /**
     * @param request the request parameters of ListShiftPersonnels  ListShiftPersonnelsRequest
     * @return ListShiftPersonnelsResponse
     */
    CompletableFuture<ListShiftPersonnelsResponse> listShiftPersonnels(ListShiftPersonnelsRequest request);

    /**
     * @param request the request parameters of ListShiftSchedules  ListShiftSchedulesRequest
     * @return ListShiftSchedulesResponse
     */
    CompletableFuture<ListShiftSchedulesResponse> listShiftSchedules(ListShiftSchedulesRequest request);

    /**
     * @param request the request parameters of ListSuccessInstanceAmount  ListSuccessInstanceAmountRequest
     * @return ListSuccessInstanceAmountResponse
     */
    CompletableFuture<ListSuccessInstanceAmountResponse> listSuccessInstanceAmount(ListSuccessInstanceAmountRequest request);

    /**
     * @param request the request parameters of ListTableLevel  ListTableLevelRequest
     * @return ListTableLevelResponse
     */
    CompletableFuture<ListTableLevelResponse> listTableLevel(ListTableLevelRequest request);

    /**
     * @param request the request parameters of ListTableTheme  ListTableThemeRequest
     * @return ListTableThemeResponse
     */
    CompletableFuture<ListTableThemeResponse> listTableTheme(ListTableThemeRequest request);

    /**
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin: Activate DataWorks Enterprise Edition or Ultimate Edition before calling this operation. If the edition is not activated, the service returns 403 Forbidden.Access.</p>
     * 
     * @param request the request parameters of ListTopics  ListTopicsRequest
     * @return ListTopicsResponse
     */
    CompletableFuture<ListTopicsResponse> listTopics(ListTopicsRequest request);

    /**
     * @param request the request parameters of OfflineNode  OfflineNodeRequest
     * @return OfflineNodeResponse
     */
    CompletableFuture<OfflineNodeResponse> offlineNode(OfflineNodeRequest request);

    /**
     * @param request the request parameters of PublishDataServiceApi  PublishDataServiceApiRequest
     * @return PublishDataServiceApiResponse
     */
    CompletableFuture<PublishDataServiceApiResponse> publishDataServiceApi(PublishDataServiceApiRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to directly call the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to create or the <a href="https://help.aliyun.com/document_detail/289109.html">UpdateDISyncTask</a> operation to update batch synchronization tasks in Data Integration. To create or update a real-time synchronization task, you must first call the <a href="https://help.aliyun.com/document_detail/383463.html">GenerateDISyncTaskConfigForCreating</a>, <a href="https://help.aliyun.com/document_detail/383464.html">GenerateDISyncTaskConfigForUpdating</a>, and <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operations to asynchronously generate the required parameters, and then pass the parameters to the CreateDISyncTask or UpdateDISyncTask operation.
     * Only asynchronous creation or update is supported for real-time synchronization tasks in Data Integration.</p>
     * 
     * @param request the request parameters of QueryDISyncTaskConfigProcessResult  QueryDISyncTaskConfigProcessResultRequest
     * @return QueryDISyncTaskConfigProcessResultResponse
     */
    CompletableFuture<QueryDISyncTaskConfigProcessResultResponse> queryDISyncTaskConfigProcessResult(QueryDISyncTaskConfigProcessResultRequest request);

    /**
     * @param request the request parameters of QueryDefaultTemplate  QueryDefaultTemplateRequest
     * @return QueryDefaultTemplateResponse
     */
    CompletableFuture<QueryDefaultTemplateResponse> queryDefaultTemplate(QueryDefaultTemplateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Each time you call this API operation, you must use FML statements to query information about objects that are created in Data Modeling.</li>
     * <li>The information about the objects can be queried by page, except for data layers, business processes, and data domains. You can add an offset to the end of an FML statement. The num LIMIT num statement specifies the offset when the information about the objects is queried, and the number of pages to return each time. The offset value must be a multiple of the number of pages.</li>
     * <li>A maximum of 1,000 entries can be returned each time you call this API operation.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryPublicModelEngine  QueryPublicModelEngineRequest
     * @return QueryPublicModelEngineResponse
     */
    CompletableFuture<QueryPublicModelEngineResponse> queryPublicModelEngine(QueryPublicModelEngineRequest request);

    /**
     * @param request the request parameters of QueryRecognizeDataByRuleType  QueryRecognizeDataByRuleTypeRequest
     * @return QueryRecognizeDataByRuleTypeResponse
     */
    CompletableFuture<QueryRecognizeDataByRuleTypeResponse> queryRecognizeDataByRuleType(QueryRecognizeDataByRuleTypeRequest request);

    /**
     * @param request the request parameters of QueryRecognizeRuleDetail  QueryRecognizeRuleDetailRequest
     * @return QueryRecognizeRuleDetailResponse
     */
    CompletableFuture<QueryRecognizeRuleDetailResponse> queryRecognizeRuleDetail(QueryRecognizeRuleDetailRequest request);

    /**
     * @param request the request parameters of QueryRecognizeRulesType  QueryRecognizeRulesTypeRequest
     * @return QueryRecognizeRulesTypeResponse
     */
    CompletableFuture<QueryRecognizeRulesTypeResponse> queryRecognizeRulesType(QueryRecognizeRulesTypeRequest request);

    /**
     * @param request the request parameters of QuerySensClassification  QuerySensClassificationRequest
     * @return QuerySensClassificationResponse
     */
    CompletableFuture<QuerySensClassificationResponse> querySensClassification(QuerySensClassificationRequest request);

    /**
     * @param request the request parameters of QuerySensLevel  QuerySensLevelRequest
     * @return QuerySensLevelResponse
     */
    CompletableFuture<QuerySensLevelResponse> querySensLevel(QuerySensLevelRequest request);

    /**
     * @param request the request parameters of QuerySensNodeInfo  QuerySensNodeInfoRequest
     * @return QuerySensNodeInfoResponse
     */
    CompletableFuture<QuerySensNodeInfoResponse> querySensNodeInfo(QuerySensNodeInfoRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is currently in trial. To use this operation, submit a request. After an administrator adds you to the trial list, you can call this operation.</p>
     * 
     * @param request the request parameters of RegisterLineageRelation  RegisterLineageRelationRequest
     * @return RegisterLineageRelationResponse
     */
    CompletableFuture<RegisterLineageRelationResponse> registerLineageRelation(RegisterLineageRelationRequest request);

    /**
     * @param request the request parameters of RemoveEntityTags  RemoveEntityTagsRequest
     * @return RemoveEntityTagsResponse
     */
    CompletableFuture<RemoveEntityTagsResponse> removeEntityTags(RemoveEntityTagsRequest request);

    /**
     * @param request the request parameters of RemoveProjectMemberFromRole  RemoveProjectMemberFromRoleRequest
     * @return RemoveProjectMemberFromRoleResponse
     */
    CompletableFuture<RemoveProjectMemberFromRoleResponse> removeProjectMemberFromRole(RemoveProjectMemberFromRoleRequest request);

    /**
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * @param request the request parameters of ResumeInstance  ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    /**
     * @param request the request parameters of RevokeTablePermission  RevokeTablePermissionRequest
     * @return RevokeTablePermissionResponse
     */
    CompletableFuture<RevokeTablePermissionResponse> revokeTablePermission(RevokeTablePermissionRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about data backfill, see <a href="https://help.aliyun.com/document_detail/137937.html">Data backfill</a>.</p>
     * 
     * @param request the request parameters of RunCycleDagNodes  RunCycleDagNodesRequest
     * @return RunCycleDagNodesResponse
     */
    CompletableFuture<RunCycleDagNodesResponse> runCycleDagNodes(RunCycleDagNodesRequest request);

    /**
     * @param request the request parameters of RunManualDagNodes  RunManualDagNodesRequest
     * @return RunManualDagNodesResponse
     */
    CompletableFuture<RunManualDagNodesResponse> runManualDagNodes(RunManualDagNodesRequest request);

    /**
     * @param request the request parameters of RunSmokeTest  RunSmokeTestRequest
     * @return RunSmokeTestResponse
     */
    CompletableFuture<RunSmokeTestResponse> runSmokeTest(RunSmokeTestRequest request);

    /**
     * @param request the request parameters of RunTriggerNode  RunTriggerNodeRequest
     * @return RunTriggerNodeResponse
     */
    CompletableFuture<RunTriggerNodeResponse> runTriggerNode(RunTriggerNodeRequest request);

    /**
     * @param request the request parameters of SaveDataServiceApiTestResult  SaveDataServiceApiTestResultRequest
     * @return SaveDataServiceApiTestResultResponse
     */
    CompletableFuture<SaveDataServiceApiTestResultResponse> saveDataServiceApiTestResult(SaveDataServiceApiTestResultRequest request);

    /**
     * @param request the request parameters of ScanSensitiveData  ScanSensitiveDataRequest
     * @return ScanSensitiveDataResponse
     */
    CompletableFuture<ScanSensitiveDataResponse> scanSensitiveData(ScanSensitiveDataRequest request);

    /**
     * <b>description</b> :
     * <p>Only MaxCompute and EMR engine tables are supported for search.</p>
     * 
     * @param request the request parameters of SearchMetaTables  SearchMetaTablesRequest
     * @return SearchMetaTablesResponse
     */
    CompletableFuture<SearchMetaTablesResponse> searchMetaTables(SearchMetaTablesRequest request);

    /**
     * @deprecated OpenAPI SearchNodesByOutput is deprecated  * @param request  the request parameters of SearchNodesByOutput  SearchNodesByOutputRequest
     * @return SearchNodesByOutputResponse
     */
    @Deprecated
    CompletableFuture<SearchNodesByOutputResponse> searchNodesByOutput(SearchNodesByOutputRequest request);

    /**
     * @deprecated OpenAPI SetDataSourceShare is deprecated  * @param request  the request parameters of SetDataSourceShare  SetDataSourceShareRequest
     * @return SetDataSourceShareResponse
     */
    @Deprecated
    CompletableFuture<SetDataSourceShareResponse> setDataSourceShare(SetDataSourceShareRequest request);

    /**
     * @param request the request parameters of SetEntityTags  SetEntityTagsRequest
     * @return SetEntityTagsResponse
     */
    CompletableFuture<SetEntityTagsResponse> setEntityTags(SetEntityTagsRequest request);

    /**
     * @param request the request parameters of SetSuccessInstance  SetSuccessInstanceRequest
     * @return SetSuccessInstanceResponse
     */
    CompletableFuture<SetSuccessInstanceResponse> setSuccessInstance(SetSuccessInstanceRequest request);

    /**
     * @param request the request parameters of StartDIJob  StartDIJobRequest
     * @return StartDIJobResponse
     */
    CompletableFuture<StartDIJobResponse> startDIJob(StartDIJobRequest request);

    /**
     * @param request the request parameters of StartDISyncInstance  StartDISyncInstanceRequest
     * @return StartDISyncInstanceResponse
     */
    CompletableFuture<StartDISyncInstanceResponse> startDISyncInstance(StartDISyncInstanceRequest request);

    /**
     * @param request the request parameters of StartMigration  StartMigrationRequest
     * @return StartMigrationResponse
     */
    CompletableFuture<StartMigrationResponse> startMigration(StartMigrationRequest request);

    /**
     * @param request the request parameters of StopDIJob  StopDIJobRequest
     * @return StopDIJobResponse
     */
    CompletableFuture<StopDIJobResponse> stopDIJob(StopDIJobRequest request);

    /**
     * @param request the request parameters of StopDISyncInstance  StopDISyncInstanceRequest
     * @return StopDISyncInstanceResponse
     */
    CompletableFuture<StopDISyncInstanceResponse> stopDISyncInstance(StopDISyncInstanceRequest request);

    /**
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * @param request the request parameters of SubmitDataServiceApi  SubmitDataServiceApiRequest
     * @return SubmitDataServiceApiResponse
     */
    CompletableFuture<SubmitDataServiceApiResponse> submitDataServiceApi(SubmitDataServiceApiRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is asynchronous. After a successful submission, the system returns a DeploymentId. Call the <a href="https://help.aliyun.com/document_detail/173950.html">GetDeployment</a> operation with this ID to query the status and final result of the deployment task.</p>
     * 
     * @param request the request parameters of SubmitFile  SubmitFileRequest
     * @return SubmitFileResponse
     */
    CompletableFuture<SubmitFileResponse> submitFile(SubmitFileRequest request);

    /**
     * @param request the request parameters of SuspendInstance  SuspendInstanceRequest
     * @return SuspendInstanceResponse
     */
    CompletableFuture<SuspendInstanceResponse> suspendInstance(SuspendInstanceRequest request);

    /**
     * @param request the request parameters of TerminateDISyncInstance  TerminateDISyncInstanceRequest
     * @return TerminateDISyncInstanceResponse
     */
    CompletableFuture<TerminateDISyncInstanceResponse> terminateDISyncInstance(TerminateDISyncInstanceRequest request);

    /**
     * @param request the request parameters of TestDataServiceApi  TestDataServiceApiRequest
     * @return TestDataServiceApiResponse
     */
    CompletableFuture<TestDataServiceApiResponse> testDataServiceApi(TestDataServiceApiRequest request);

    /**
     * @param request the request parameters of TestNetworkConnection  TestNetworkConnectionRequest
     * @return TestNetworkConnectionResponse
     */
    CompletableFuture<TestNetworkConnectionResponse> testNetworkConnection(TestNetworkConnectionRequest request);

    /**
     * @param request the request parameters of TopTenElapsedTimeInstance  TopTenElapsedTimeInstanceRequest
     * @return TopTenElapsedTimeInstanceResponse
     */
    CompletableFuture<TopTenElapsedTimeInstanceResponse> topTenElapsedTimeInstance(TopTenElapsedTimeInstanceRequest request);

    /**
     * @param request the request parameters of TopTenErrorTimesInstance  TopTenErrorTimesInstanceRequest
     * @return TopTenErrorTimesInstanceResponse
     */
    CompletableFuture<TopTenErrorTimesInstanceResponse> topTenErrorTimesInstance(TopTenErrorTimesInstanceRequest request);

    /**
     * @param request the request parameters of UpdateBaseline  UpdateBaselineRequest
     * @return UpdateBaselineResponse
     */
    CompletableFuture<UpdateBaselineResponse> updateBaseline(UpdateBaselineRequest request);

    /**
     * @param request the request parameters of UpdateBusiness  UpdateBusinessRequest
     * @return UpdateBusinessResponse
     */
    CompletableFuture<UpdateBusinessResponse> updateBusiness(UpdateBusinessRequest request);

    /**
     * @param request the request parameters of UpdateClusterConfigs  UpdateClusterConfigsRequest
     * @return UpdateClusterConfigsResponse
     */
    CompletableFuture<UpdateClusterConfigsResponse> updateClusterConfigs(UpdateClusterConfigsRequest request);

    /**
     * @deprecated OpenAPI UpdateConnection is deprecated, please use dataworks-public::2020-05-18::UpdateDataSource instead.  * @param request  the request parameters of UpdateConnection  UpdateConnectionRequest
     * @return UpdateConnectionResponse
     */
    @Deprecated
    CompletableFuture<UpdateConnectionResponse> updateConnection(UpdateConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Alert rules can be configured when your task includes real-time synchronization.
     * The alert rule is updated as a full-field update. Partial field updates are not supported.</p>
     * 
     * @param request the request parameters of UpdateDIAlarmRule  UpdateDIAlarmRuleRequest
     * @return UpdateDIAlarmRuleResponse
     */
    CompletableFuture<UpdateDIAlarmRuleResponse> updateDIAlarmRule(UpdateDIAlarmRuleRequest request);

    /**
     * @param request the request parameters of UpdateDIJob  UpdateDIJobRequest
     * @return UpdateDIJobResponse
     */
    CompletableFuture<UpdateDIJobResponse> updateDIJob(UpdateDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to specify a default global configuration only for the processing rules of DDL messages in synchronization solutions. After you configure the <strong>processing rules of DDL messages</strong> in synchronization solutions, the configuration is used as the default global configuration and applies to all real-time synchronization tasks in the solutions. You can modify the <strong>processing rules of DDL messages</strong> based on your business requirements. For more information about how to configure a synchronization solution, see <a href="https://help.aliyun.com/document_detail/199008.html">Synchronization solutions</a>.</p>
     * 
     * @param request the request parameters of UpdateDIProjectConfig  UpdateDIProjectConfigRequest
     * @return UpdateDIProjectConfigResponse
     */
    CompletableFuture<UpdateDIProjectConfigResponse> updateDIProjectConfig(UpdateDIProjectConfigRequest request);

    /**
     * @param request the request parameters of UpdateDISyncTask  UpdateDISyncTaskRequest
     * @return UpdateDISyncTaskResponse
     */
    CompletableFuture<UpdateDISyncTaskResponse> updateDISyncTask(UpdateDISyncTaskRequest request);

    /**
     * @param request the request parameters of UpdateDataServiceApi  UpdateDataServiceApiRequest
     * @return UpdateDataServiceApiResponse
     */
    CompletableFuture<UpdateDataServiceApiResponse> updateDataServiceApi(UpdateDataServiceApiRequest request);

    /**
     * @param request the request parameters of UpdateDataSource  UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    /**
     * <b>description</b> :
     * <p>When you debug or call this operation, the parameter values that you specify must be different from the existing file configurations of the node. For example, if a parameter of the source node is set to A, you must change the value to B before you submit the request. If you still specify A, an invalid exception is returned.</p>
     * 
     * @param request the request parameters of UpdateFile  UpdateFileRequest
     * @return UpdateFileResponse
     */
    CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request);

    /**
     * @param request the request parameters of UpdateFolder  UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request);

    /**
     * @param request the request parameters of UpdateIDEEventResult  UpdateIDEEventResultRequest
     * @return UpdateIDEEventResultResponse
     */
    CompletableFuture<UpdateIDEEventResultResponse> updateIDEEventResult(UpdateIDEEventResultRequest request);

    /**
     * @param request the request parameters of UpdateMetaCategory  UpdateMetaCategoryRequest
     * @return UpdateMetaCategoryResponse
     */
    CompletableFuture<UpdateMetaCategoryResponse> updateMetaCategory(UpdateMetaCategoryRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, only the name (Name) and comment (Comment) can be updated.</p>
     * 
     * @param request the request parameters of UpdateMetaCollection  UpdateMetaCollectionRequest
     * @return UpdateMetaCollectionResponse
     */
    CompletableFuture<UpdateMetaCollectionResponse> updateMetaCollection(UpdateMetaCollectionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports only MaxCompute tables.</p>
     * 
     * @param request the request parameters of UpdateMetaTable  UpdateMetaTableRequest
     * @return UpdateMetaTableResponse
     */
    CompletableFuture<UpdateMetaTableResponse> updateMetaTable(UpdateMetaTableRequest request);

    /**
     * @param request the request parameters of UpdateMetaTableIntroWiki  UpdateMetaTableIntroWikiRequest
     * @return UpdateMetaTableIntroWikiResponse
     */
    CompletableFuture<UpdateMetaTableIntroWikiResponse> updateMetaTableIntroWiki(UpdateMetaTableIntroWikiRequest request);

    /**
     * @param request the request parameters of UpdateNodeOwner  UpdateNodeOwnerRequest
     * @return UpdateNodeOwnerResponse
     */
    CompletableFuture<UpdateNodeOwnerResponse> updateNodeOwner(UpdateNodeOwnerRequest request);

    /**
     * @param request the request parameters of UpdateNodeRunMode  UpdateNodeRunModeRequest
     * @return UpdateNodeRunModeResponse
     */
    CompletableFuture<UpdateNodeRunModeResponse> updateNodeRunMode(UpdateNodeRunModeRequest request);

    /**
     * @deprecated OpenAPI UpdateQualityFollower is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityAlertRule instead.  * @param request  the request parameters of UpdateQualityFollower  UpdateQualityFollowerRequest
     * @return UpdateQualityFollowerResponse
     */
    @Deprecated
    CompletableFuture<UpdateQualityFollowerResponse> updateQualityFollower(UpdateQualityFollowerRequest request);

    /**
     * @deprecated OpenAPI UpdateQualityRule is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @param request  the request parameters of UpdateQualityRule  UpdateQualityRuleRequest
     * @return UpdateQualityRuleResponse
     */
    @Deprecated
    CompletableFuture<UpdateQualityRuleResponse> updateQualityRule(UpdateQualityRuleRequest request);

    /**
     * @param request the request parameters of UpdateRemind  UpdateRemindRequest
     * @return UpdateRemindResponse
     */
    CompletableFuture<UpdateRemindResponse> updateRemind(UpdateRemindRequest request);

    /**
     * @deprecated OpenAPI UpdateTable is deprecated  * @param request  the request parameters of UpdateTable  UpdateTableRequest
     * @return UpdateTableResponse
     */
    @Deprecated
    CompletableFuture<UpdateTableResponse> updateTable(UpdateTableRequest request);

    /**
     * @deprecated OpenAPI UpdateTableAddColumn is deprecated  * @param request  the request parameters of UpdateTableAddColumn  UpdateTableAddColumnRequest
     * @return UpdateTableAddColumnResponse
     */
    @Deprecated
    CompletableFuture<UpdateTableAddColumnResponse> updateTableAddColumn(UpdateTableAddColumnRequest request);

    /**
     * @param request the request parameters of UpdateTableLevel  UpdateTableLevelRequest
     * @return UpdateTableLevelResponse
     */
    CompletableFuture<UpdateTableLevelResponse> updateTableLevel(UpdateTableLevelRequest request);

    /**
     * @param request the request parameters of UpdateTableModelInfo  UpdateTableModelInfoRequest
     * @return UpdateTableModelInfoResponse
     */
    CompletableFuture<UpdateTableModelInfoResponse> updateTableModelInfo(UpdateTableModelInfoRequest request);

    /**
     * @param request the request parameters of UpdateTableTheme  UpdateTableThemeRequest
     * @return UpdateTableThemeResponse
     */
    CompletableFuture<UpdateTableThemeResponse> updateTableTheme(UpdateTableThemeRequest request);

    /**
     * @param request the request parameters of UpdateUdfFile  UpdateUdfFileRequest
     * @return UpdateUdfFileResponse
     */
    CompletableFuture<UpdateUdfFileResponse> updateUdfFile(UpdateUdfFileRequest request);

    /**
     * @param request the request parameters of UpdateWorkbenchEventResult  UpdateWorkbenchEventResultRequest
     * @return UpdateWorkbenchEventResultResponse
     */
    CompletableFuture<UpdateWorkbenchEventResultResponse> updateWorkbenchEventResult(UpdateWorkbenchEventResultRequest request);

}
