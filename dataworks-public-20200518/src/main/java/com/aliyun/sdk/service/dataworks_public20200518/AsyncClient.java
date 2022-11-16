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

    CompletableFuture<AddProjectMemberToRoleResponse> addProjectMemberToRole(AddProjectMemberToRoleRequest request);

    CompletableFuture<AddToMetaCategoryResponse> addToMetaCategory(AddToMetaCategoryRequest request);

    CompletableFuture<ApprovePermissionApplyOrderResponse> approvePermissionApplyOrder(ApprovePermissionApplyOrderRequest request);

    CompletableFuture<CheckFileDeploymentResponse> checkFileDeployment(CheckFileDeploymentRequest request);

    CompletableFuture<CheckMetaPartitionResponse> checkMetaPartition(CheckMetaPartitionRequest request);

    CompletableFuture<CheckMetaTableResponse> checkMetaTable(CheckMetaTableRequest request);

    CompletableFuture<CreateBaselineResponse> createBaseline(CreateBaselineRequest request);

    CompletableFuture<CreateBusinessResponse> createBusiness(CreateBusinessRequest request);

    CompletableFuture<CreateConnectionResponse> createConnection(CreateConnectionRequest request);

    CompletableFuture<CreateDISyncTaskResponse> createDISyncTask(CreateDISyncTaskRequest request);

    CompletableFuture<CreateDagComplementResponse> createDagComplement(CreateDagComplementRequest request);

    CompletableFuture<CreateDagTestResponse> createDagTest(CreateDagTestRequest request);

    CompletableFuture<CreateDataServiceApiResponse> createDataServiceApi(CreateDataServiceApiRequest request);

    CompletableFuture<CreateDataServiceApiAuthorityResponse> createDataServiceApiAuthority(CreateDataServiceApiAuthorityRequest request);

    CompletableFuture<CreateDataServiceFolderResponse> createDataServiceFolder(CreateDataServiceFolderRequest request);

    CompletableFuture<CreateDataServiceGroupResponse> createDataServiceGroup(CreateDataServiceGroupRequest request);

    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    CompletableFuture<CreateExportMigrationResponse> createExportMigration(CreateExportMigrationRequest request);

    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    CompletableFuture<CreateManualDagResponse> createManualDag(CreateManualDagRequest request);

    CompletableFuture<CreateMetaCategoryResponse> createMetaCategory(CreateMetaCategoryRequest request);

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

    CompletableFuture<DeleteConnectionResponse> deleteConnection(DeleteConnectionRequest request);

    CompletableFuture<DeleteDISyncTaskResponse> deleteDISyncTask(DeleteDISyncTaskRequest request);

    CompletableFuture<DeleteDataServiceApiResponse> deleteDataServiceApi(DeleteDataServiceApiRequest request);

    CompletableFuture<DeleteDataServiceApiAuthorityResponse> deleteDataServiceApiAuthority(DeleteDataServiceApiAuthorityRequest request);

    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    CompletableFuture<DeleteFromMetaCategoryResponse> deleteFromMetaCategory(DeleteFromMetaCategoryRequest request);

    CompletableFuture<DeleteMetaCategoryResponse> deleteMetaCategory(DeleteMetaCategoryRequest request);

    CompletableFuture<DeleteProjectMemberResponse> deleteProjectMember(DeleteProjectMemberRequest request);

    CompletableFuture<DeleteQualityEntityResponse> deleteQualityEntity(DeleteQualityEntityRequest request);

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

    CompletableFuture<GenerateDISyncTaskConfigForCreatingResponse> generateDISyncTaskConfigForCreating(GenerateDISyncTaskConfigForCreatingRequest request);

    CompletableFuture<GenerateDISyncTaskConfigForUpdatingResponse> generateDISyncTaskConfigForUpdating(GenerateDISyncTaskConfigForUpdatingRequest request);

    CompletableFuture<GetBaselineResponse> getBaseline(GetBaselineRequest request);

    CompletableFuture<GetBaselineConfigResponse> getBaselineConfig(GetBaselineConfigRequest request);

    CompletableFuture<GetBaselineKeyPathResponse> getBaselineKeyPath(GetBaselineKeyPathRequest request);

    CompletableFuture<GetBaselineStatusResponse> getBaselineStatus(GetBaselineStatusRequest request);

    CompletableFuture<GetBusinessResponse> getBusiness(GetBusinessRequest request);

    CompletableFuture<GetDDLJobStatusResponse> getDDLJobStatus(GetDDLJobStatusRequest request);

    CompletableFuture<GetDISyncInstanceInfoResponse> getDISyncInstanceInfo(GetDISyncInstanceInfoRequest request);

    CompletableFuture<GetDISyncTaskResponse> getDISyncTask(GetDISyncTaskRequest request);

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

    CompletableFuture<GetInstanceConsumeTimeRankResponse> getInstanceConsumeTimeRank(GetInstanceConsumeTimeRankRequest request);

    CompletableFuture<GetInstanceCountTrendResponse> getInstanceCountTrend(GetInstanceCountTrendRequest request);

    CompletableFuture<GetInstanceErrorRankResponse> getInstanceErrorRank(GetInstanceErrorRankRequest request);

    CompletableFuture<GetInstanceLogResponse> getInstanceLog(GetInstanceLogRequest request);

    CompletableFuture<GetInstanceStatusCountResponse> getInstanceStatusCount(GetInstanceStatusCountRequest request);

    CompletableFuture<GetInstanceStatusStatisticResponse> getInstanceStatusStatistic(GetInstanceStatusStatisticRequest request);

    CompletableFuture<GetManualDagInstancesResponse> getManualDagInstances(GetManualDagInstancesRequest request);

    CompletableFuture<GetMetaCategoryResponse> getMetaCategory(GetMetaCategoryRequest request);

    CompletableFuture<GetMetaColumnLineageResponse> getMetaColumnLineage(GetMetaColumnLineageRequest request);

    CompletableFuture<GetMetaDBInfoResponse> getMetaDBInfo(GetMetaDBInfoRequest request);

    CompletableFuture<GetMetaDBTableListResponse> getMetaDBTableList(GetMetaDBTableListRequest request);

    CompletableFuture<GetMetaTableBasicInfoResponse> getMetaTableBasicInfo(GetMetaTableBasicInfoRequest request);

    CompletableFuture<GetMetaTableChangeLogResponse> getMetaTableChangeLog(GetMetaTableChangeLogRequest request);

    CompletableFuture<GetMetaTableColumnResponse> getMetaTableColumn(GetMetaTableColumnRequest request);

    CompletableFuture<GetMetaTableFullInfoResponse> getMetaTableFullInfo(GetMetaTableFullInfoRequest request);

    CompletableFuture<GetMetaTableIntroWikiResponse> getMetaTableIntroWiki(GetMetaTableIntroWikiRequest request);

    CompletableFuture<GetMetaTableLineageResponse> getMetaTableLineage(GetMetaTableLineageRequest request);

    CompletableFuture<GetMetaTableListByCategoryResponse> getMetaTableListByCategory(GetMetaTableListByCategoryRequest request);

    CompletableFuture<GetMetaTableOutputResponse> getMetaTableOutput(GetMetaTableOutputRequest request);

    CompletableFuture<GetMetaTablePartitionResponse> getMetaTablePartition(GetMetaTablePartitionRequest request);

    CompletableFuture<GetMetaTableThemeLevelResponse> getMetaTableThemeLevel(GetMetaTableThemeLevelRequest request);

    CompletableFuture<GetMigrationProcessResponse> getMigrationProcess(GetMigrationProcessRequest request);

    CompletableFuture<GetMigrationSummaryResponse> getMigrationSummary(GetMigrationSummaryRequest request);

    CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request);

    CompletableFuture<GetNodeChildrenResponse> getNodeChildren(GetNodeChildrenRequest request);

    CompletableFuture<GetNodeCodeResponse> getNodeCode(GetNodeCodeRequest request);

    CompletableFuture<GetNodeOnBaselineResponse> getNodeOnBaseline(GetNodeOnBaselineRequest request);

    CompletableFuture<GetNodeParentsResponse> getNodeParents(GetNodeParentsRequest request);

    CompletableFuture<GetNodeTypeListInfoResponse> getNodeTypeListInfo(GetNodeTypeListInfoRequest request);

    CompletableFuture<GetOpRiskDataResponse> getOpRiskData(GetOpRiskDataRequest request);

    CompletableFuture<GetOpSensitiveDataResponse> getOpSensitiveData(GetOpSensitiveDataRequest request);

    CompletableFuture<GetOptionValueForProjectResponse> getOptionValueForProject(GetOptionValueForProjectRequest request);

    CompletableFuture<GetPermissionApplyOrderDetailResponse> getPermissionApplyOrderDetail(GetPermissionApplyOrderDetailRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetProjectDetailResponse> getProjectDetail(GetProjectDetailRequest request);

    CompletableFuture<GetQualityEntityResponse> getQualityEntity(GetQualityEntityRequest request);

    CompletableFuture<GetQualityFollowerResponse> getQualityFollower(GetQualityFollowerRequest request);

    CompletableFuture<GetQualityRuleResponse> getQualityRule(GetQualityRuleRequest request);

    CompletableFuture<GetRemindResponse> getRemind(GetRemindRequest request);

    CompletableFuture<GetSensitiveDataResponse> getSensitiveData(GetSensitiveDataRequest request);

    CompletableFuture<GetSuccessInstanceTrendResponse> getSuccessInstanceTrend(GetSuccessInstanceTrendRequest request);

    CompletableFuture<GetTopicResponse> getTopic(GetTopicRequest request);

    CompletableFuture<GetTopicInfluenceResponse> getTopicInfluence(GetTopicInfluenceRequest request);

    CompletableFuture<ImportDataSourcesResponse> importDataSources(ImportDataSourcesRequest request);

    CompletableFuture<ListAlertMessagesResponse> listAlertMessages(ListAlertMessagesRequest request);

    CompletableFuture<ListBaselineConfigsResponse> listBaselineConfigs(ListBaselineConfigsRequest request);

    CompletableFuture<ListBaselineStatusesResponse> listBaselineStatuses(ListBaselineStatusesRequest request);

    CompletableFuture<ListBaselinesResponse> listBaselines(ListBaselinesRequest request);

    CompletableFuture<ListBusinessResponse> listBusiness(ListBusinessRequest request);

    CompletableFuture<ListCalcEnginesResponse> listCalcEngines(ListCalcEnginesRequest request);

    CompletableFuture<ListConnectionsResponse> listConnections(ListConnectionsRequest request);

    CompletableFuture<ListDIProjectConfigResponse> listDIProjectConfig(ListDIProjectConfigRequest request);

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

    CompletableFuture<ListMetaDBResponse> listMetaDB(ListMetaDBRequest request);

    CompletableFuture<ListMigrationsResponse> listMigrations(ListMigrationsRequest request);

    CompletableFuture<ListNodeIOResponse> listNodeIO(ListNodeIORequest request);

    CompletableFuture<ListNodeInputOrOutputResponse> listNodeInputOrOutput(ListNodeInputOrOutputRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListNodesByBaselineResponse> listNodesByBaseline(ListNodesByBaselineRequest request);

    CompletableFuture<ListNodesByOutputResponse> listNodesByOutput(ListNodesByOutputRequest request);

    CompletableFuture<ListPermissionApplyOrdersResponse> listPermissionApplyOrders(ListPermissionApplyOrdersRequest request);

    CompletableFuture<ListProgramTypeCountResponse> listProgramTypeCount(ListProgramTypeCountRequest request);

    CompletableFuture<ListProjectIdsResponse> listProjectIds(ListProjectIdsRequest request);

    CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request);

    CompletableFuture<ListProjectRolesResponse> listProjectRoles(ListProjectRolesRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

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

    CompletableFuture<OfflineNodeResponse> offlineNode(OfflineNodeRequest request);

    CompletableFuture<PublishDataServiceApiResponse> publishDataServiceApi(PublishDataServiceApiRequest request);

    CompletableFuture<QueryDISyncTaskConfigProcessResultResponse> queryDISyncTaskConfigProcessResult(QueryDISyncTaskConfigProcessResultRequest request);

    CompletableFuture<QueryPublicModelEngineResponse> queryPublicModelEngine(QueryPublicModelEngineRequest request);

    CompletableFuture<RemoveProjectMemberFromRoleResponse> removeProjectMemberFromRole(RemoveProjectMemberFromRoleRequest request);

    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    CompletableFuture<RevokeColumnPermissionResponse> revokeColumnPermission(RevokeColumnPermissionRequest request);

    CompletableFuture<RevokeTablePermissionResponse> revokeTablePermission(RevokeTablePermissionRequest request);

    CompletableFuture<RunCycleDagNodesResponse> runCycleDagNodes(RunCycleDagNodesRequest request);

    CompletableFuture<RunManualDagNodesResponse> runManualDagNodes(RunManualDagNodesRequest request);

    CompletableFuture<RunSmokeTestResponse> runSmokeTest(RunSmokeTestRequest request);

    CompletableFuture<RunTriggerNodeResponse> runTriggerNode(RunTriggerNodeRequest request);

    CompletableFuture<ScanSensitiveDataResponse> scanSensitiveData(ScanSensitiveDataRequest request);

    CompletableFuture<SearchMetaTablesResponse> searchMetaTables(SearchMetaTablesRequest request);

    CompletableFuture<SearchNodesByOutputResponse> searchNodesByOutput(SearchNodesByOutputRequest request);

    CompletableFuture<SetDataSourceShareResponse> setDataSourceShare(SetDataSourceShareRequest request);

    CompletableFuture<SetSuccessInstanceResponse> setSuccessInstance(SetSuccessInstanceRequest request);

    CompletableFuture<StartDISyncInstanceResponse> startDISyncInstance(StartDISyncInstanceRequest request);

    CompletableFuture<StartMigrationResponse> startMigration(StartMigrationRequest request);

    CompletableFuture<StopDISyncInstanceResponse> stopDISyncInstance(StopDISyncInstanceRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<SubmitFileResponse> submitFile(SubmitFileRequest request);

    CompletableFuture<SuspendInstanceResponse> suspendInstance(SuspendInstanceRequest request);

    CompletableFuture<TerminateDISyncInstanceResponse> terminateDISyncInstance(TerminateDISyncInstanceRequest request);

    CompletableFuture<TestDataServiceApiResponse> testDataServiceApi(TestDataServiceApiRequest request);

    CompletableFuture<TestNetworkConnectionResponse> testNetworkConnection(TestNetworkConnectionRequest request);

    CompletableFuture<TopTenElapsedTimeInstanceResponse> topTenElapsedTimeInstance(TopTenElapsedTimeInstanceRequest request);

    CompletableFuture<TopTenErrorTimesInstanceResponse> topTenErrorTimesInstance(TopTenErrorTimesInstanceRequest request);

    CompletableFuture<UpdateBaselineResponse> updateBaseline(UpdateBaselineRequest request);

    CompletableFuture<UpdateBusinessResponse> updateBusiness(UpdateBusinessRequest request);

    CompletableFuture<UpdateConnectionResponse> updateConnection(UpdateConnectionRequest request);

    CompletableFuture<UpdateDIProjectConfigResponse> updateDIProjectConfig(UpdateDIProjectConfigRequest request);

    CompletableFuture<UpdateDISyncTaskResponse> updateDISyncTask(UpdateDISyncTaskRequest request);

    CompletableFuture<UpdateDataServiceApiResponse> updateDataServiceApi(UpdateDataServiceApiRequest request);

    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request);

    CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request);

    CompletableFuture<UpdateIDEEventResultResponse> updateIDEEventResult(UpdateIDEEventResultRequest request);

    CompletableFuture<UpdateMetaCategoryResponse> updateMetaCategory(UpdateMetaCategoryRequest request);

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
