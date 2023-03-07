// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dataworks_public20200518.models.*;
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

    CompletableFuture<AbolishDataServiceApiResponse> abolishDataServiceApi(AbolishDataServiceApiRequest request);

    CompletableFuture<AddMetaCollectionEntityResponse> addMetaCollectionEntity(AddMetaCollectionEntityRequest request);

    /**
      * For more information about how to add your Alibaba Cloud account or a RAM user as a member of a DataWorks workspace, see [Add a member to a DataWorks workspace](~~136941~~).
      *
     */
    CompletableFuture<AddProjectMemberToRoleResponse> addProjectMemberToRole(AddProjectMemberToRoleRequest request);

    CompletableFuture<AddToMetaCategoryResponse> addToMetaCategory(AddToMetaCategoryRequest request);

    CompletableFuture<ApprovePermissionApplyOrderResponse> approvePermissionApplyOrder(ApprovePermissionApplyOrderRequest request);

    CompletableFuture<ChangeResourceManagerResourceGroupResponse> changeResourceManagerResourceGroup(ChangeResourceManagerResourceGroupRequest request);

    CompletableFuture<CheckFileDeploymentResponse> checkFileDeployment(CheckFileDeploymentRequest request);

    CompletableFuture<CheckMetaPartitionResponse> checkMetaPartition(CheckMetaPartitionRequest request);

    CompletableFuture<CheckMetaTableResponse> checkMetaTable(CheckMetaTableRequest request);

    CompletableFuture<CreateBaselineResponse> createBaseline(CreateBaselineRequest request);

    CompletableFuture<CreateBusinessResponse> createBusiness(CreateBusinessRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateConnectionResponse> createConnection(CreateConnectionRequest request);

    /**
      * DataWorks allows you to use only the CreateDISyncTask operation to create a batch synchronization node in Data Integration. To create a real-time synchronization node or a synchronization solution, you must first call the [GenerateDISyncTaskConfigForCreating](~~383463~~) operation to generate the ID of an asynchronous thread and call the [QueryDISyncTaskConfigProcessResult](~~383465~~) operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the CreateDISyncTask operation and use the parameters as request parameters to create a real-time synchronization node or a synchronization solution in Data Integration.
      *
     */
    CompletableFuture<CreateDISyncTaskResponse> createDISyncTask(CreateDISyncTaskRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateDagComplementResponse> createDagComplement(CreateDagComplementRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateDagTestResponse> createDagTest(CreateDagTestRequest request);

    CompletableFuture<CreateDataServiceApiResponse> createDataServiceApi(CreateDataServiceApiRequest request);

    CompletableFuture<CreateDataServiceApiAuthorityResponse> createDataServiceApiAuthority(CreateDataServiceApiAuthorityRequest request);

    CompletableFuture<CreateDataServiceFolderResponse> createDataServiceFolder(CreateDataServiceFolderRequest request);

    CompletableFuture<CreateDataServiceGroupResponse> createDataServiceGroup(CreateDataServiceGroupRequest request);

    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    CompletableFuture<CreateExportMigrationResponse> createExportMigration(CreateExportMigrationRequest request);

    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateManualDagResponse> createManualDag(CreateManualDagRequest request);

    CompletableFuture<CreateMetaCategoryResponse> createMetaCategory(CreateMetaCategoryRequest request);

    /**
      * Collections are classified into various types. The names of collections of the same type must be different.
      *
     */
    CompletableFuture<CreateMetaCollectionResponse> createMetaCollection(CreateMetaCollectionRequest request);

    CompletableFuture<CreatePermissionApplyOrderResponse> createPermissionApplyOrder(CreatePermissionApplyOrderRequest request);

    CompletableFuture<CreateProjectMemberResponse> createProjectMember(CreateProjectMemberRequest request);

    CompletableFuture<CreateQualityEntityResponse> createQualityEntity(CreateQualityEntityRequest request);

    CompletableFuture<CreateQualityFollowerResponse> createQualityFollower(CreateQualityFollowerRequest request);

    CompletableFuture<CreateQualityRelativeNodeResponse> createQualityRelativeNode(CreateQualityRelativeNodeRequest request);

    CompletableFuture<CreateQualityRuleResponse> createQualityRule(CreateQualityRuleRequest request);

    CompletableFuture<CreateRemindResponse> createRemind(CreateRemindRequest request);

    CompletableFuture<CreateTableResponse> createTable(CreateTableRequest request);

    CompletableFuture<CreateTableLevelResponse> createTableLevel(CreateTableLevelRequest request);

    CompletableFuture<CreateTableThemeResponse> createTableTheme(CreateTableThemeRequest request);

    CompletableFuture<CreateUdfFileResponse> createUdfFile(CreateUdfFileRequest request);

    CompletableFuture<DeleteBaselineResponse> deleteBaseline(DeleteBaselineRequest request);

    CompletableFuture<DeleteBusinessResponse> deleteBusiness(DeleteBusinessRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteConnectionResponse> deleteConnection(DeleteConnectionRequest request);

    CompletableFuture<DeleteDISyncTaskResponse> deleteDISyncTask(DeleteDISyncTaskRequest request);

    CompletableFuture<DeleteDataServiceApiResponse> deleteDataServiceApi(DeleteDataServiceApiRequest request);

    CompletableFuture<DeleteDataServiceApiAuthorityResponse> deleteDataServiceApiAuthority(DeleteDataServiceApiAuthorityRequest request);

    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    CompletableFuture<DeleteFromMetaCategoryResponse> deleteFromMetaCategory(DeleteFromMetaCategoryRequest request);

    CompletableFuture<DeleteMetaCategoryResponse> deleteMetaCategory(DeleteMetaCategoryRequest request);

    CompletableFuture<DeleteMetaCollectionResponse> deleteMetaCollection(DeleteMetaCollectionRequest request);

    CompletableFuture<DeleteMetaCollectionEntityResponse> deleteMetaCollectionEntity(DeleteMetaCollectionEntityRequest request);

    CompletableFuture<DeleteProjectMemberResponse> deleteProjectMember(DeleteProjectMemberRequest request);

    CompletableFuture<DeleteQualityEntityResponse> deleteQualityEntity(DeleteQualityEntityRequest request);

    /**
      * In Data Quality, you must configure monitoring rules based on a partition filter expression. Data Quality uses these rules to detect changes in source data and dirty data generated during the process of extract, transformation, load (ETL). Thereby, Data Quality automatically blocks the nodes that involve dirty data to stop dirty data from spreading downstream. This prevents nodes from producing unexpected dirty data that affects normal use and business decisions. You can go to the Manage Subscriptions page to add subscribers for a partition filter expression. When the monitoring rule described by the partition filter expression is triggered, the subscribers can receive notifications and troubleshoot errors in a timely manner. For more information, see [Configure monitoring rules for MaxCompute](~~73690~~).
      *
     */
    CompletableFuture<DeleteQualityFollowerResponse> deleteQualityFollower(DeleteQualityFollowerRequest request);

    CompletableFuture<DeleteQualityRelativeNodeResponse> deleteQualityRelativeNode(DeleteQualityRelativeNodeRequest request);

    CompletableFuture<DeleteQualityRuleResponse> deleteQualityRule(DeleteQualityRuleRequest request);

    CompletableFuture<DeleteRemindResponse> deleteRemind(DeleteRemindRequest request);

    CompletableFuture<DeleteTableResponse> deleteTable(DeleteTableRequest request);

    CompletableFuture<DeleteTableLevelResponse> deleteTableLevel(DeleteTableLevelRequest request);

    CompletableFuture<DeleteTableThemeResponse> deleteTableTheme(DeleteTableThemeRequest request);

    CompletableFuture<DeployDISyncTaskResponse> deployDISyncTask(DeployDISyncTaskRequest request);

    CompletableFuture<DeployFileResponse> deployFile(DeployFileRequest request);

    CompletableFuture<DesensitizeDataResponse> desensitizeData(DesensitizeDataRequest request);

    CompletableFuture<EstablishRelationTableToBusinessResponse> establishRelationTableToBusiness(EstablishRelationTableToBusinessRequest request);

    CompletableFuture<ExportDataSourcesResponse> exportDataSources(ExportDataSourcesRequest request);

    /**
      * DataWorks allows you to use only the [CreateDISyncTask](~~278725~~) operation to create a batch synchronization node in Data Integration. To create a real-time synchronization node or a synchronization solution, you must first call the [GenerateDISyncTaskConfigForCreating](~~383463~~) operation to generate the ID of an asynchronous thread and call the [QueryDISyncTaskConfigProcessResult](~~383465~~) operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the [CreateDISyncTask](~~278725~~) operation and use the parameters as request parameters to create a real-time synchronization node or a synchronization solution in Data Integration.
      * DataWorks allows you to create real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
      *
     */
    CompletableFuture<GenerateDISyncTaskConfigForCreatingResponse> generateDISyncTaskConfigForCreating(GenerateDISyncTaskConfigForCreatingRequest request);

    /**
      * DataWorks allows you to use only the [UpdateDISyncTask](~~289109~~) operation to update a batch synchronization node in Data Integration. To update a real-time synchronization node or a synchronization solution, you must first call the GenerateDISyncTaskConfigForUpdating operation to generate the ID of an asynchronous thread and call the [QueryDISyncTaskConfigProcessResult](~~383465~~) operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the UpdateDISyncTask operation and use the parameters as request parameters to update a real-time synchronization node or a synchronization solution in Data Integration. DataWorks allows you to update real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
      *
     */
    CompletableFuture<GenerateDISyncTaskConfigForUpdatingResponse> generateDISyncTaskConfigForUpdating(GenerateDISyncTaskConfigForUpdatingRequest request);

    CompletableFuture<GetBaselineResponse> getBaseline(GetBaselineRequest request);

    CompletableFuture<GetBaselineConfigResponse> getBaselineConfig(GetBaselineConfigRequest request);

    CompletableFuture<GetBaselineKeyPathResponse> getBaselineKeyPath(GetBaselineKeyPathRequest request);

    CompletableFuture<GetBaselineStatusResponse> getBaselineStatus(GetBaselineStatusRequest request);

    CompletableFuture<GetBusinessResponse> getBusiness(GetBusinessRequest request);

    CompletableFuture<GetDDLJobStatusResponse> getDDLJobStatus(GetDDLJobStatusRequest request);

    CompletableFuture<GetDISyncInstanceInfoResponse> getDISyncInstanceInfo(GetDISyncInstanceInfoRequest request);

    CompletableFuture<GetDISyncTaskResponse> getDISyncTask(GetDISyncTaskRequest request);

    /**
      * Supported DAG types:
      * *   MANUAL: the DAG for a manually triggered workflow.
      * *   SMOKE_TEST: the DAG for a smoke testing workflow.
      * *   SUPPLY_DATA: the DAG for a data backfill instance.
      * *   BUSINESS_PROCESS_DAG: the DAG for a one-time workflow.
      * Supported DAG states:
      * *   CREATED: The DAG is created.
      * *   RUNNING: The DAG is running.
      * *   FAILURE: The DAG fails to run.
      * *   SUCCESS: The DAG successfully runs.
      *
     */
    CompletableFuture<GetDagResponse> getDag(GetDagRequest request);

    CompletableFuture<GetDataServiceApiResponse> getDataServiceApi(GetDataServiceApiRequest request);

    CompletableFuture<GetDataServiceApiTestResponse> getDataServiceApiTest(GetDataServiceApiTestRequest request);

    CompletableFuture<GetDataServiceApplicationResponse> getDataServiceApplication(GetDataServiceApplicationRequest request);

    CompletableFuture<GetDataServiceFolderResponse> getDataServiceFolder(GetDataServiceFolderRequest request);

    CompletableFuture<GetDataServiceGroupResponse> getDataServiceGroup(GetDataServiceGroupRequest request);

    CompletableFuture<GetDataServicePublishedApiResponse> getDataServicePublishedApi(GetDataServicePublishedApiRequest request);

    CompletableFuture<GetDataSourceMetaResponse> getDataSourceMeta(GetDataSourceMetaRequest request);

    CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request);

    CompletableFuture<GetExtensionResponse> getExtension(GetExtensionRequest request);

    CompletableFuture<GetFileResponse> getFile(GetFileRequest request);

    CompletableFuture<GetFileTypeStatisticResponse> getFileTypeStatistic(GetFileTypeStatisticRequest request);

    CompletableFuture<GetFileVersionResponse> getFileVersion(GetFileVersionRequest request);

    CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request);

    CompletableFuture<GetIDEEventDetailResponse> getIDEEventDetail(GetIDEEventDetailRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetInstanceConsumeTimeRankResponse> getInstanceConsumeTimeRank(GetInstanceConsumeTimeRankRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetInstanceCountTrendResponse> getInstanceCountTrend(GetInstanceCountTrendRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetInstanceErrorRankResponse> getInstanceErrorRank(GetInstanceErrorRankRequest request);

    /**
      * You may not obtain the instance logs that were generated more than seven days ago.
      *
     */
    CompletableFuture<GetInstanceLogResponse> getInstanceLog(GetInstanceLogRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetInstanceStatusCountResponse> getInstanceStatusCount(GetInstanceStatusCountRequest request);

    CompletableFuture<GetInstanceStatusStatisticResponse> getInstanceStatusStatistic(GetInstanceStatusStatisticRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetManualDagInstancesResponse> getManualDagInstances(GetManualDagInstancesRequest request);

    CompletableFuture<GetMetaCategoryResponse> getMetaCategory(GetMetaCategoryRequest request);

    CompletableFuture<GetMetaCollectionDetailResponse> getMetaCollectionDetail(GetMetaCollectionDetailRequest request);

    CompletableFuture<GetMetaColumnLineageResponse> getMetaColumnLineage(GetMetaColumnLineageRequest request);

    /**
      * You can call this operation to query only the basic metadata information about a MaxCompute or E-MapReduce (EMR) compute engine instance.
      *
     */
    CompletableFuture<GetMetaDBInfoResponse> getMetaDBInfo(GetMetaDBInfoRequest request);

    CompletableFuture<GetMetaDBTableListResponse> getMetaDBTableList(GetMetaDBTableListRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<GetMetaTableBasicInfoResponse> getMetaTableBasicInfo(GetMetaTableBasicInfoRequest request);

    CompletableFuture<GetMetaTableChangeLogResponse> getMetaTableChangeLog(GetMetaTableChangeLogRequest request);

    CompletableFuture<GetMetaTableColumnResponse> getMetaTableColumn(GetMetaTableColumnRequest request);

    CompletableFuture<GetMetaTableFullInfoResponse> getMetaTableFullInfo(GetMetaTableFullInfoRequest request);

    CompletableFuture<GetMetaTableIntroWikiResponse> getMetaTableIntroWiki(GetMetaTableIntroWikiRequest request);

    CompletableFuture<GetMetaTableLineageResponse> getMetaTableLineage(GetMetaTableLineageRequest request);

    CompletableFuture<GetMetaTableListByCategoryResponse> getMetaTableListByCategory(GetMetaTableListByCategoryRequest request);

    CompletableFuture<GetMetaTableOutputResponse> getMetaTableOutput(GetMetaTableOutputRequest request);

    /**
      * You can call this operation to query only the partitions of a metatable in a MaxCompute or E-MapReduce (EMR) compute engine instance.
      *
     */
    CompletableFuture<GetMetaTablePartitionResponse> getMetaTablePartition(GetMetaTablePartitionRequest request);

    CompletableFuture<GetMetaTableProducingTasksResponse> getMetaTableProducingTasks(GetMetaTableProducingTasksRequest request);

    CompletableFuture<GetMetaTableThemeLevelResponse> getMetaTableThemeLevel(GetMetaTableThemeLevelRequest request);

    CompletableFuture<GetMigrationProcessResponse> getMigrationProcess(GetMigrationProcessRequest request);

    CompletableFuture<GetMigrationSummaryResponse> getMigrationSummary(GetMigrationSummaryRequest request);

    CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request);

    CompletableFuture<GetNodeChildrenResponse> getNodeChildren(GetNodeChildrenRequest request);

    CompletableFuture<GetNodeCodeResponse> getNodeCode(GetNodeCodeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetNodeOnBaselineResponse> getNodeOnBaseline(GetNodeOnBaselineRequest request);

    CompletableFuture<GetNodeParentsResponse> getNodeParents(GetNodeParentsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetNodeTypeListInfoResponse> getNodeTypeListInfo(GetNodeTypeListInfoRequest request);

    CompletableFuture<GetOpRiskDataResponse> getOpRiskData(GetOpRiskDataRequest request);

    CompletableFuture<GetOpSensitiveDataResponse> getOpSensitiveData(GetOpSensitiveDataRequest request);

    CompletableFuture<GetOptionValueForProjectResponse> getOptionValueForProject(GetOptionValueForProjectRequest request);

    CompletableFuture<GetPermissionApplyOrderDetailResponse> getPermissionApplyOrderDetail(GetPermissionApplyOrderDetailRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetProjectDetailResponse> getProjectDetail(GetProjectDetailRequest request);

    CompletableFuture<GetQualityEntityResponse> getQualityEntity(GetQualityEntityRequest request);

    CompletableFuture<GetQualityFollowerResponse> getQualityFollower(GetQualityFollowerRequest request);

    CompletableFuture<GetQualityRuleResponse> getQualityRule(GetQualityRuleRequest request);

    CompletableFuture<GetRemindResponse> getRemind(GetRemindRequest request);

    CompletableFuture<GetSensitiveDataResponse> getSensitiveData(GetSensitiveDataRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetSuccessInstanceTrendResponse> getSuccessInstanceTrend(GetSuccessInstanceTrendRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<GetTopicResponse> getTopic(GetTopicRequest request);

    CompletableFuture<GetTopicInfluenceResponse> getTopicInfluence(GetTopicInfluenceRequest request);

    /**
      * You can import self-managed data sources or data sources that are exported from other Dataworks workspaces to a specified DataWorks workspace.
      * *   To import a self-managed data source to DataWorks, the data source type must be supported by DataWorks. For more information about the types of data sources supported by DataWorks, see [Supported data stores](~~181656~~).
      * *   For more information about how to export data sources from DataWorks workspaces to on-premises devices, see [ExportDataSources](~~279570~~).
      *
     */
    CompletableFuture<ImportDataSourcesResponse> importDataSources(ImportDataSourcesRequest request);

    CompletableFuture<ListAlertMessagesResponse> listAlertMessages(ListAlertMessagesRequest request);

    CompletableFuture<ListBaselineConfigsResponse> listBaselineConfigs(ListBaselineConfigsRequest request);

    CompletableFuture<ListBaselineStatusesResponse> listBaselineStatuses(ListBaselineStatusesRequest request);

    CompletableFuture<ListBaselinesResponse> listBaselines(ListBaselinesRequest request);

    CompletableFuture<ListBusinessResponse> listBusiness(ListBusinessRequest request);

    CompletableFuture<ListCalcEnginesResponse> listCalcEngines(ListCalcEnginesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListConnectionsResponse> listConnections(ListConnectionsRequest request);

    /**
      * DataWorks allows you to set the default global configuration for only the processing rules of DDL messages in sync solutions. After you configure the **processing rules of DDL messages** in sync solutions, the configuration is set as the default global configuration and applies to all real-time sync nodes. You can also modify the **processing rules of DDL messages** based on your business requirements. For more information, see [Sync solutions](~~199008~~).
      *
     */
    CompletableFuture<ListDIProjectConfigResponse> listDIProjectConfig(ListDIProjectConfigRequest request);

    /**
      * Supported DAG types:
      * *   MANUAL: the DAG for a manually triggered workflow.
      * *   SMOKE_TEST: the DAG for a smoke testing workflow.
      * *   SUPPLY_DATA: the DAG for a data backfill instance.
      * *   BUSINESS_PROCESS_DAG: the DAG for a one-time workflow.
      * Supported DAG states:
      * *   CREATED: The DAG is created.
      * *   RUNNING: The DAG is running.
      * *   FAILURE: The DAG fails to run.
      * *   SUCCESS: The DAG successfully runs.
      *
     */
    CompletableFuture<ListDagsResponse> listDags(ListDagsRequest request);

    CompletableFuture<ListDataServiceApiAuthoritiesResponse> listDataServiceApiAuthorities(ListDataServiceApiAuthoritiesRequest request);

    CompletableFuture<ListDataServiceApiTestResponse> listDataServiceApiTest(ListDataServiceApiTestRequest request);

    CompletableFuture<ListDataServiceApisResponse> listDataServiceApis(ListDataServiceApisRequest request);

    CompletableFuture<ListDataServiceApplicationsResponse> listDataServiceApplications(ListDataServiceApplicationsRequest request);

    CompletableFuture<ListDataServiceAuthorizedApisResponse> listDataServiceAuthorizedApis(ListDataServiceAuthorizedApisRequest request);

    CompletableFuture<ListDataServiceFoldersResponse> listDataServiceFolders(ListDataServiceFoldersRequest request);

    CompletableFuture<ListDataServiceGroupsResponse> listDataServiceGroups(ListDataServiceGroupsRequest request);

    CompletableFuture<ListDataServicePublishedApisResponse> listDataServicePublishedApis(ListDataServicePublishedApisRequest request);

    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request);

    CompletableFuture<ListEnabledExtensionsForProjectResponse> listEnabledExtensionsForProject(ListEnabledExtensionsForProjectRequest request);

    CompletableFuture<ListExtensionsResponse> listExtensions(ListExtensionsRequest request);

    CompletableFuture<ListFileTypeResponse> listFileType(ListFileTypeRequest request);

    CompletableFuture<ListFileVersionsResponse> listFileVersions(ListFileVersionsRequest request);

    CompletableFuture<ListFilesResponse> listFiles(ListFilesRequest request);

    CompletableFuture<ListFoldersResponse> listFolders(ListFoldersRequest request);

    CompletableFuture<ListInnerNodesResponse> listInnerNodes(ListInnerNodesRequest request);

    CompletableFuture<ListInstanceAmountResponse> listInstanceAmount(ListInstanceAmountRequest request);

    CompletableFuture<ListInstanceHistoryResponse> listInstanceHistory(ListInstanceHistoryRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListManualDagInstancesResponse> listManualDagInstances(ListManualDagInstancesRequest request);

    CompletableFuture<ListMetaCollectionEntitiesResponse> listMetaCollectionEntities(ListMetaCollectionEntitiesRequest request);

    /**
      * The type can be ALBUM or ALBUM_CATEGORY. ALBUM indicates data albums. ALBUM_CATEGORY indicates categories.
      *
     */
    CompletableFuture<ListMetaCollectionsResponse> listMetaCollections(ListMetaCollectionsRequest request);

    CompletableFuture<ListMetaDBResponse> listMetaDB(ListMetaDBRequest request);

    CompletableFuture<ListMigrationsResponse> listMigrations(ListMigrationsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListNodeIOResponse> listNodeIO(ListNodeIORequest request);

    CompletableFuture<ListNodeInputOrOutputResponse> listNodeInputOrOutput(ListNodeInputOrOutputRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListNodesByBaselineResponse> listNodesByBaseline(ListNodesByBaselineRequest request);

    CompletableFuture<ListNodesByOutputResponse> listNodesByOutput(ListNodesByOutputRequest request);

    CompletableFuture<ListPermissionApplyOrdersResponse> listPermissionApplyOrders(ListPermissionApplyOrdersRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListProgramTypeCountResponse> listProgramTypeCount(ListProgramTypeCountRequest request);

    /**
      * For example, an Alibaba Cloud account can assume the developer, O&M engineer, or workspace administrator role in a workspace. For more information, see [Manage members and roles](~~136941~~).
      *
     */
    CompletableFuture<ListProjectIdsResponse> listProjectIds(ListProjectIdsRequest request);

    CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request);

    CompletableFuture<ListProjectRolesResponse> listProjectRoles(ListProjectRolesRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<ListQualityResultsByEntityResponse> listQualityResultsByEntity(ListQualityResultsByEntityRequest request);

    CompletableFuture<ListQualityResultsByRuleResponse> listQualityResultsByRule(ListQualityResultsByRuleRequest request);

    CompletableFuture<ListQualityRulesResponse> listQualityRules(ListQualityRulesRequest request);

    CompletableFuture<ListRefDISyncTasksResponse> listRefDISyncTasks(ListRefDISyncTasksRequest request);

    CompletableFuture<ListRemindsResponse> listReminds(ListRemindsRequest request);

    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    CompletableFuture<ListShiftPersonnelsResponse> listShiftPersonnels(ListShiftPersonnelsRequest request);

    CompletableFuture<ListShiftSchedulesResponse> listShiftSchedules(ListShiftSchedulesRequest request);

    CompletableFuture<ListSuccessInstanceAmountResponse> listSuccessInstanceAmount(ListSuccessInstanceAmountRequest request);

    CompletableFuture<ListTableLevelResponse> listTableLevel(ListTableLevelRequest request);

    CompletableFuture<ListTableThemeResponse> listTableTheme(ListTableThemeRequest request);

    CompletableFuture<ListTopicsResponse> listTopics(ListTopicsRequest request);

    CompletableFuture<MountDirectoryResponse> mountDirectory(MountDirectoryRequest request);

    CompletableFuture<OfflineNodeResponse> offlineNode(OfflineNodeRequest request);

    CompletableFuture<PublishDataServiceApiResponse> publishDataServiceApi(PublishDataServiceApiRequest request);

    /**
      * DataWorks allows you to call only the [CreateDISyncTask](~~278725~~) or [UpdateDISyncTask](~~289109~~) operation to create or update a batch synchronization node in Data Integration. To create or update a real-time synchronization node or a synchronization solution, you must first call the GenerateDISyncTaskConfigForCreating or GenerateDISyncTaskConfigForUpdating operation to generate the ID of an asynchronous thread and call the [QueryDISyncTaskConfigProcessResult](~~383465~~) operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the CreateDISyncTask or UpdateDISyncTask operation and use the parameters as request parameters to create or update a real-time synchronization node or a synchronization solution.
      * DataWorks allows you to create or update real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
      *
     */
    CompletableFuture<QueryDISyncTaskConfigProcessResultResponse> queryDISyncTaskConfigProcessResult(QueryDISyncTaskConfigProcessResultRequest request);

    /**
      * *   You must use FML statements to query information about the data modeling engine when you call this operation.
      * *   The information about the data modeling engine can be queried by page, except for data layers, business processes, and data domains. You can add an offset to the end of an FML statement.
      *     The num LIMIT num statement specifies the offset when the information about the data modeling engine is queried, and the number of pages to return each time. The offset value must be a multiple of the number of pages.
      * *   A maximum of 1,000 entries can be returned each time you call the operation.
      *
     */
    CompletableFuture<QueryPublicModelEngineResponse> queryPublicModelEngine(QueryPublicModelEngineRequest request);

    CompletableFuture<RemoveProjectMemberFromRoleResponse> removeProjectMemberFromRole(RemoveProjectMemberFromRoleRequest request);

    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    CompletableFuture<RevokeColumnPermissionResponse> revokeColumnPermission(RevokeColumnPermissionRequest request);

    CompletableFuture<RevokeTablePermissionResponse> revokeTablePermission(RevokeTablePermissionRequest request);

    /**
      * For more information about data backfill, see [Backfill data](~~137937~~).
      *
     */
    CompletableFuture<RunCycleDagNodesResponse> runCycleDagNodes(RunCycleDagNodesRequest request);

    CompletableFuture<RunManualDagNodesResponse> runManualDagNodes(RunManualDagNodesRequest request);

    CompletableFuture<RunSmokeTestResponse> runSmokeTest(RunSmokeTestRequest request);

    CompletableFuture<RunTriggerNodeResponse> runTriggerNode(RunTriggerNodeRequest request);

    CompletableFuture<ScanSensitiveDataResponse> scanSensitiveData(ScanSensitiveDataRequest request);

    /**
      * You can call this operation to query only metatables in a MaxCompute or E-MapReduce (EMR) compute engine instance.
      *
     */
    CompletableFuture<SearchMetaTablesResponse> searchMetaTables(SearchMetaTablesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<SearchNodesByOutputResponse> searchNodesByOutput(SearchNodesByOutputRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<SetDataSourceShareResponse> setDataSourceShare(SetDataSourceShareRequest request);

    CompletableFuture<SetSuccessInstanceResponse> setSuccessInstance(SetSuccessInstanceRequest request);

    CompletableFuture<StartDISyncInstanceResponse> startDISyncInstance(StartDISyncInstanceRequest request);

    CompletableFuture<StartMigrationResponse> startMigration(StartMigrationRequest request);

    CompletableFuture<StopDISyncInstanceResponse> stopDISyncInstance(StopDISyncInstanceRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<SubmitDataServiceApiResponse> submitDataServiceApi(SubmitDataServiceApiRequest request);

    CompletableFuture<SubmitFileResponse> submitFile(SubmitFileRequest request);

    CompletableFuture<SuspendInstanceResponse> suspendInstance(SuspendInstanceRequest request);

    CompletableFuture<TerminateDISyncInstanceResponse> terminateDISyncInstance(TerminateDISyncInstanceRequest request);

    CompletableFuture<TestDataServiceApiResponse> testDataServiceApi(TestDataServiceApiRequest request);

    CompletableFuture<TestNetworkConnectionResponse> testNetworkConnection(TestNetworkConnectionRequest request);

    CompletableFuture<TopTenElapsedTimeInstanceResponse> topTenElapsedTimeInstance(TopTenElapsedTimeInstanceRequest request);

    CompletableFuture<TopTenErrorTimesInstanceResponse> topTenErrorTimesInstance(TopTenErrorTimesInstanceRequest request);

    CompletableFuture<UmountDirectoryResponse> umountDirectory(UmountDirectoryRequest request);

    CompletableFuture<UpdateBaselineResponse> updateBaseline(UpdateBaselineRequest request);

    CompletableFuture<UpdateBusinessResponse> updateBusiness(UpdateBusinessRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UpdateConnectionResponse> updateConnection(UpdateConnectionRequest request);

    /**
      * DataWorks allows you to specify a default global configuration only for the processing rules of DDL messages in synchronization solutions. After you configure the **processing rules of DDL messages** in synchronization solutions, the configuration is used as the default global configuration and applies to all real-time synchronization nodes in the solutions. You can modify the **processing rules of DDL messages** based on your business requirements. For more information about how to configure a synchronization solution, see [Synchronization solutions](~~199008~~).
      *
     */
    CompletableFuture<UpdateDIProjectConfigResponse> updateDIProjectConfig(UpdateDIProjectConfigRequest request);

    CompletableFuture<UpdateDISyncTaskResponse> updateDISyncTask(UpdateDISyncTaskRequest request);

    CompletableFuture<UpdateDataServiceApiResponse> updateDataServiceApi(UpdateDataServiceApiRequest request);

    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    /**
      * When you debug or call this operation, you must specify new values for the specified parameters to ensure that the values are different from the original configurations of the file. For example, if the original value of a parameter is A, you must change the value of this parameter to B before you commit the node. If you set the parameter to A, an exception that indicates invalid data occurs.
      *
     */
    CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request);

    CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request);

    CompletableFuture<UpdateIDEEventResultResponse> updateIDEEventResult(UpdateIDEEventResultRequest request);

    CompletableFuture<UpdateMetaCategoryResponse> updateMetaCategory(UpdateMetaCategoryRequest request);

    /**
      * Only the name and comment of a collection can be updated.
      *
     */
    CompletableFuture<UpdateMetaCollectionResponse> updateMetaCollection(UpdateMetaCollectionRequest request);

    CompletableFuture<UpdateMetaTableResponse> updateMetaTable(UpdateMetaTableRequest request);

    CompletableFuture<UpdateMetaTableIntroWikiResponse> updateMetaTableIntroWiki(UpdateMetaTableIntroWikiRequest request);

    CompletableFuture<UpdateNodeOwnerResponse> updateNodeOwner(UpdateNodeOwnerRequest request);

    CompletableFuture<UpdateNodeRunModeResponse> updateNodeRunMode(UpdateNodeRunModeRequest request);

    CompletableFuture<UpdateQualityFollowerResponse> updateQualityFollower(UpdateQualityFollowerRequest request);

    CompletableFuture<UpdateQualityRuleResponse> updateQualityRule(UpdateQualityRuleRequest request);

    CompletableFuture<UpdateRemindResponse> updateRemind(UpdateRemindRequest request);

    CompletableFuture<UpdateTableResponse> updateTable(UpdateTableRequest request);

    CompletableFuture<UpdateTableAddColumnResponse> updateTableAddColumn(UpdateTableAddColumnRequest request);

    CompletableFuture<UpdateTableLevelResponse> updateTableLevel(UpdateTableLevelRequest request);

    CompletableFuture<UpdateTableModelInfoResponse> updateTableModelInfo(UpdateTableModelInfoRequest request);

    CompletableFuture<UpdateTableThemeResponse> updateTableTheme(UpdateTableThemeRequest request);

    CompletableFuture<UpdateUdfFileResponse> updateUdfFile(UpdateUdfFileRequest request);

    CompletableFuture<UpdateWorkbenchEventResultResponse> updateWorkbenchEventResult(UpdateWorkbenchEventResultRequest request);

}
