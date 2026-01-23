// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dataphin_public20230630.models.*;
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
     * @param request the request parameters of AddDataServiceProjectMember  AddDataServiceProjectMemberRequest
     * @return AddDataServiceProjectMemberResponse
     */
    CompletableFuture<AddDataServiceProjectMemberResponse> addDataServiceProjectMember(AddDataServiceProjectMemberRequest request);

    /**
     * @param request the request parameters of AddProjectMember  AddProjectMemberRequest
     * @return AddProjectMemberResponse
     */
    CompletableFuture<AddProjectMemberResponse> addProjectMember(AddProjectMemberRequest request);

    /**
     * @param request the request parameters of AddRegisterLineage  AddRegisterLineageRequest
     * @return AddRegisterLineageResponse
     */
    CompletableFuture<AddRegisterLineageResponse> addRegisterLineage(AddRegisterLineageRequest request);

    /**
     * @param request the request parameters of AddTenantMembers  AddTenantMembersRequest
     * @return AddTenantMembersResponse
     */
    CompletableFuture<AddTenantMembersResponse> addTenantMembers(AddTenantMembersRequest request);

    /**
     * @param request the request parameters of AddTenantMembersBySourceUser  AddTenantMembersBySourceUserRequest
     * @return AddTenantMembersBySourceUserResponse
     */
    CompletableFuture<AddTenantMembersBySourceUserResponse> addTenantMembersBySourceUser(AddTenantMembersBySourceUserRequest request);

    /**
     * @param request the request parameters of AddUserGroupMember  AddUserGroupMemberRequest
     * @return AddUserGroupMemberResponse
     */
    CompletableFuture<AddUserGroupMemberResponse> addUserGroupMember(AddUserGroupMemberRequest request);

    /**
     * @param request the request parameters of ApplyDataServiceApi  ApplyDataServiceApiRequest
     * @return ApplyDataServiceApiResponse
     */
    CompletableFuture<ApplyDataServiceApiResponse> applyDataServiceApi(ApplyDataServiceApiRequest request);

    /**
     * @param request the request parameters of ApplyDataServiceApp  ApplyDataServiceAppRequest
     * @return ApplyDataServiceAppResponse
     */
    CompletableFuture<ApplyDataServiceAppResponse> applyDataServiceApp(ApplyDataServiceAppRequest request);

    /**
     * @param request the request parameters of AssignQualityRuleOfAllRuleScopeSchedules  AssignQualityRuleOfAllRuleScopeSchedulesRequest
     * @return AssignQualityRuleOfAllRuleScopeSchedulesResponse
     */
    CompletableFuture<AssignQualityRuleOfAllRuleScopeSchedulesResponse> assignQualityRuleOfAllRuleScopeSchedules(AssignQualityRuleOfAllRuleScopeSchedulesRequest request);

    /**
     * @param request the request parameters of CheckComputeSourceConnectivity  CheckComputeSourceConnectivityRequest
     * @return CheckComputeSourceConnectivityResponse
     */
    CompletableFuture<CheckComputeSourceConnectivityResponse> checkComputeSourceConnectivity(CheckComputeSourceConnectivityRequest request);

    /**
     * @param request the request parameters of CheckComputeSourceConnectivityById  CheckComputeSourceConnectivityByIdRequest
     * @return CheckComputeSourceConnectivityByIdResponse
     */
    CompletableFuture<CheckComputeSourceConnectivityByIdResponse> checkComputeSourceConnectivityById(CheckComputeSourceConnectivityByIdRequest request);

    /**
     * @param request the request parameters of CheckDataSourceConnectivity  CheckDataSourceConnectivityRequest
     * @return CheckDataSourceConnectivityResponse
     */
    CompletableFuture<CheckDataSourceConnectivityResponse> checkDataSourceConnectivity(CheckDataSourceConnectivityRequest request);

    /**
     * @param request the request parameters of CheckDataSourceConnectivityById  CheckDataSourceConnectivityByIdRequest
     * @return CheckDataSourceConnectivityByIdResponse
     */
    CompletableFuture<CheckDataSourceConnectivityByIdResponse> checkDataSourceConnectivityById(CheckDataSourceConnectivityByIdRequest request);

    /**
     * @param request the request parameters of CheckProjectHasDependency  CheckProjectHasDependencyRequest
     * @return CheckProjectHasDependencyResponse
     */
    CompletableFuture<CheckProjectHasDependencyResponse> checkProjectHasDependency(CheckProjectHasDependencyRequest request);

    /**
     * @param request the request parameters of CheckResourcePermission  CheckResourcePermissionRequest
     * @return CheckResourcePermissionResponse
     */
    CompletableFuture<CheckResourcePermissionResponse> checkResourcePermission(CheckResourcePermissionRequest request);

    /**
     * @param request the request parameters of CreateAdHocFile  CreateAdHocFileRequest
     * @return CreateAdHocFileResponse
     */
    CompletableFuture<CreateAdHocFileResponse> createAdHocFile(CreateAdHocFileRequest request);

    /**
     * @param request the request parameters of CreateBatchTask  CreateBatchTaskRequest
     * @return CreateBatchTaskResponse
     */
    CompletableFuture<CreateBatchTaskResponse> createBatchTask(CreateBatchTaskRequest request);

    /**
     * @param request the request parameters of CreateBizEntity  CreateBizEntityRequest
     * @return CreateBizEntityResponse
     */
    CompletableFuture<CreateBizEntityResponse> createBizEntity(CreateBizEntityRequest request);

    /**
     * @param request the request parameters of CreateBizMetric  CreateBizMetricRequest
     * @return CreateBizMetricResponse
     */
    CompletableFuture<CreateBizMetricResponse> createBizMetric(CreateBizMetricRequest request);

    /**
     * @param request the request parameters of CreateBizUnit  CreateBizUnitRequest
     * @return CreateBizUnitResponse
     */
    CompletableFuture<CreateBizUnitResponse> createBizUnit(CreateBizUnitRequest request);

    /**
     * @param request the request parameters of CreateComputeSource  CreateComputeSourceRequest
     * @return CreateComputeSourceResponse
     */
    CompletableFuture<CreateComputeSourceResponse> createComputeSource(CreateComputeSourceRequest request);

    /**
     * @param request the request parameters of CreateDataDomain  CreateDataDomainRequest
     * @return CreateDataDomainResponse
     */
    CompletableFuture<CreateDataDomainResponse> createDataDomain(CreateDataDomainRequest request);

    /**
     * @param request the request parameters of CreateDataServiceApi  CreateDataServiceApiRequest
     * @return CreateDataServiceApiResponse
     */
    CompletableFuture<CreateDataServiceApiResponse> createDataServiceApi(CreateDataServiceApiRequest request);

    /**
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    /**
     * @param request the request parameters of CreateDirectory  CreateDirectoryRequest
     * @return CreateDirectoryResponse
     */
    CompletableFuture<CreateDirectoryResponse> createDirectory(CreateDirectoryRequest request);

    /**
     * @param request the request parameters of CreateNodeSupplement  CreateNodeSupplementRequest
     * @return CreateNodeSupplementResponse
     */
    CompletableFuture<CreateNodeSupplementResponse> createNodeSupplement(CreateNodeSupplementRequest request);

    /**
     * @param request the request parameters of CreatePipeline  CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request);

    /**
     * @param request the request parameters of CreatePipelineByAsync  CreatePipelineByAsyncRequest
     * @return CreatePipelineByAsyncResponse
     */
    CompletableFuture<CreatePipelineByAsyncResponse> createPipelineByAsync(CreatePipelineByAsyncRequest request);

    /**
     * @param request the request parameters of CreatePipelineNode  CreatePipelineNodeRequest
     * @return CreatePipelineNodeResponse
     */
    CompletableFuture<CreatePipelineNodeResponse> createPipelineNode(CreatePipelineNodeRequest request);

    /**
     * @param request the request parameters of CreateResource  CreateResourceRequest
     * @return CreateResourceResponse
     */
    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    /**
     * @param request the request parameters of CreateRowPermission  CreateRowPermissionRequest
     * @return CreateRowPermissionResponse
     */
    CompletableFuture<CreateRowPermissionResponse> createRowPermission(CreateRowPermissionRequest request);

    /**
     * @param request the request parameters of CreateSecurityClassify  CreateSecurityClassifyRequest
     * @return CreateSecurityClassifyResponse
     */
    CompletableFuture<CreateSecurityClassifyResponse> createSecurityClassify(CreateSecurityClassifyRequest request);

    /**
     * @param request the request parameters of CreateSecurityClassifyCatalog  CreateSecurityClassifyCatalogRequest
     * @return CreateSecurityClassifyCatalogResponse
     */
    CompletableFuture<CreateSecurityClassifyCatalogResponse> createSecurityClassifyCatalog(CreateSecurityClassifyCatalogRequest request);

    /**
     * @param request the request parameters of CreateSecurityIdentifyResult  CreateSecurityIdentifyResultRequest
     * @return CreateSecurityIdentifyResultResponse
     */
    CompletableFuture<CreateSecurityIdentifyResultResponse> createSecurityIdentifyResult(CreateSecurityIdentifyResultRequest request);

    /**
     * @param request the request parameters of CreateSecurityLevel  CreateSecurityLevelRequest
     * @return CreateSecurityLevelResponse
     */
    CompletableFuture<CreateSecurityLevelResponse> createSecurityLevel(CreateSecurityLevelRequest request);

    /**
     * @param request the request parameters of CreateStandard  CreateStandardRequest
     * @return CreateStandardResponse
     */
    CompletableFuture<CreateStandardResponse> createStandard(CreateStandardRequest request);

    /**
     * @param request the request parameters of CreateStandardLookupTable  CreateStandardLookupTableRequest
     * @return CreateStandardLookupTableResponse
     */
    CompletableFuture<CreateStandardLookupTableResponse> createStandardLookupTable(CreateStandardLookupTableRequest request);

    /**
     * @param request the request parameters of CreateStandardMapping  CreateStandardMappingRequest
     * @return CreateStandardMappingResponse
     */
    CompletableFuture<CreateStandardMappingResponse> createStandardMapping(CreateStandardMappingRequest request);

    /**
     * @param request the request parameters of CreateStandardRelations  CreateStandardRelationsRequest
     * @return CreateStandardRelationsResponse
     */
    CompletableFuture<CreateStandardRelationsResponse> createStandardRelations(CreateStandardRelationsRequest request);

    /**
     * @param request the request parameters of CreateStandardSet  CreateStandardSetRequest
     * @return CreateStandardSetResponse
     */
    CompletableFuture<CreateStandardSetResponse> createStandardSet(CreateStandardSetRequest request);

    /**
     * @param request the request parameters of CreateStandardTemplate  CreateStandardTemplateRequest
     * @return CreateStandardTemplateResponse
     */
    CompletableFuture<CreateStandardTemplateResponse> createStandardTemplate(CreateStandardTemplateRequest request);

    /**
     * @param request the request parameters of CreateStandardWordRoot  CreateStandardWordRootRequest
     * @return CreateStandardWordRootResponse
     */
    CompletableFuture<CreateStandardWordRootResponse> createStandardWordRoot(CreateStandardWordRootRequest request);

    /**
     * @param request the request parameters of CreateStreamBatchJobMapping  CreateStreamBatchJobMappingRequest
     * @return CreateStreamBatchJobMappingResponse
     */
    CompletableFuture<CreateStreamBatchJobMappingResponse> createStreamBatchJobMapping(CreateStreamBatchJobMappingRequest request);

    /**
     * @param request the request parameters of CreateUdf  CreateUdfRequest
     * @return CreateUdfResponse
     */
    CompletableFuture<CreateUdfResponse> createUdf(CreateUdfRequest request);

    /**
     * @param request the request parameters of CreateUserGroup  CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request);

    /**
     * @param request the request parameters of DeleteAdHocFile  DeleteAdHocFileRequest
     * @return DeleteAdHocFileResponse
     */
    CompletableFuture<DeleteAdHocFileResponse> deleteAdHocFile(DeleteAdHocFileRequest request);

    /**
     * @param request the request parameters of DeleteBatchTask  DeleteBatchTaskRequest
     * @return DeleteBatchTaskResponse
     */
    CompletableFuture<DeleteBatchTaskResponse> deleteBatchTask(DeleteBatchTaskRequest request);

    /**
     * @param request the request parameters of DeleteBizEntity  DeleteBizEntityRequest
     * @return DeleteBizEntityResponse
     */
    CompletableFuture<DeleteBizEntityResponse> deleteBizEntity(DeleteBizEntityRequest request);

    /**
     * @param request the request parameters of DeleteBizMetric  DeleteBizMetricRequest
     * @return DeleteBizMetricResponse
     */
    CompletableFuture<DeleteBizMetricResponse> deleteBizMetric(DeleteBizMetricRequest request);

    /**
     * @param request the request parameters of DeleteBizUnit  DeleteBizUnitRequest
     * @return DeleteBizUnitResponse
     */
    CompletableFuture<DeleteBizUnitResponse> deleteBizUnit(DeleteBizUnitRequest request);

    /**
     * @param request the request parameters of DeleteComputeSource  DeleteComputeSourceRequest
     * @return DeleteComputeSourceResponse
     */
    CompletableFuture<DeleteComputeSourceResponse> deleteComputeSource(DeleteComputeSourceRequest request);

    /**
     * @param request the request parameters of DeleteDataDomain  DeleteDataDomainRequest
     * @return DeleteDataDomainResponse
     */
    CompletableFuture<DeleteDataDomainResponse> deleteDataDomain(DeleteDataDomainRequest request);

    /**
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteDirectory  DeleteDirectoryRequest
     * @return DeleteDirectoryResponse
     */
    CompletableFuture<DeleteDirectoryResponse> deleteDirectory(DeleteDirectoryRequest request);

    /**
     * @param request the request parameters of DeleteQualityRules  DeleteQualityRulesRequest
     * @return DeleteQualityRulesResponse
     */
    CompletableFuture<DeleteQualityRulesResponse> deleteQualityRules(DeleteQualityRulesRequest request);

    /**
     * @param request the request parameters of DeleteQualitySchedules  DeleteQualitySchedulesRequest
     * @return DeleteQualitySchedulesResponse
     */
    CompletableFuture<DeleteQualitySchedulesResponse> deleteQualitySchedules(DeleteQualitySchedulesRequest request);

    /**
     * @param request the request parameters of DeleteQualityTemplates  DeleteQualityTemplatesRequest
     * @return DeleteQualityTemplatesResponse
     */
    CompletableFuture<DeleteQualityTemplatesResponse> deleteQualityTemplates(DeleteQualityTemplatesRequest request);

    /**
     * @param request the request parameters of DeleteQualityWatches  DeleteQualityWatchesRequest
     * @return DeleteQualityWatchesResponse
     */
    CompletableFuture<DeleteQualityWatchesResponse> deleteQualityWatches(DeleteQualityWatchesRequest request);

    /**
     * @param request the request parameters of DeleteRegisterLineage  DeleteRegisterLineageRequest
     * @return DeleteRegisterLineageResponse
     */
    CompletableFuture<DeleteRegisterLineageResponse> deleteRegisterLineage(DeleteRegisterLineageRequest request);

    /**
     * @param request the request parameters of DeleteResource  DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    /**
     * @param request the request parameters of DeleteRowPermission  DeleteRowPermissionRequest
     * @return DeleteRowPermissionResponse
     */
    CompletableFuture<DeleteRowPermissionResponse> deleteRowPermission(DeleteRowPermissionRequest request);

    /**
     * @param request the request parameters of DeleteSecurityClassify  DeleteSecurityClassifyRequest
     * @return DeleteSecurityClassifyResponse
     */
    CompletableFuture<DeleteSecurityClassifyResponse> deleteSecurityClassify(DeleteSecurityClassifyRequest request);

    /**
     * @param request the request parameters of DeleteSecurityClassifyCatalog  DeleteSecurityClassifyCatalogRequest
     * @return DeleteSecurityClassifyCatalogResponse
     */
    CompletableFuture<DeleteSecurityClassifyCatalogResponse> deleteSecurityClassifyCatalog(DeleteSecurityClassifyCatalogRequest request);

    /**
     * @param request the request parameters of DeleteSecurityIdentifyResults  DeleteSecurityIdentifyResultsRequest
     * @return DeleteSecurityIdentifyResultsResponse
     */
    CompletableFuture<DeleteSecurityIdentifyResultsResponse> deleteSecurityIdentifyResults(DeleteSecurityIdentifyResultsRequest request);

    /**
     * @param request the request parameters of DeleteSecurityLevel  DeleteSecurityLevelRequest
     * @return DeleteSecurityLevelResponse
     */
    CompletableFuture<DeleteSecurityLevelResponse> deleteSecurityLevel(DeleteSecurityLevelRequest request);

    /**
     * @param request the request parameters of DeleteStandard  DeleteStandardRequest
     * @return DeleteStandardResponse
     */
    CompletableFuture<DeleteStandardResponse> deleteStandard(DeleteStandardRequest request);

    /**
     * @param request the request parameters of DeleteStandardInValidMapping  DeleteStandardInValidMappingRequest
     * @return DeleteStandardInValidMappingResponse
     */
    CompletableFuture<DeleteStandardInValidMappingResponse> deleteStandardInValidMapping(DeleteStandardInValidMappingRequest request);

    /**
     * @param request the request parameters of DeleteStandardLookupTable  DeleteStandardLookupTableRequest
     * @return DeleteStandardLookupTableResponse
     */
    CompletableFuture<DeleteStandardLookupTableResponse> deleteStandardLookupTable(DeleteStandardLookupTableRequest request);

    /**
     * @param request the request parameters of DeleteStandardRelations  DeleteStandardRelationsRequest
     * @return DeleteStandardRelationsResponse
     */
    CompletableFuture<DeleteStandardRelationsResponse> deleteStandardRelations(DeleteStandardRelationsRequest request);

    /**
     * @param request the request parameters of DeleteStandardSet  DeleteStandardSetRequest
     * @return DeleteStandardSetResponse
     */
    CompletableFuture<DeleteStandardSetResponse> deleteStandardSet(DeleteStandardSetRequest request);

    /**
     * @param request the request parameters of DeleteStandardValidMapping  DeleteStandardValidMappingRequest
     * @return DeleteStandardValidMappingResponse
     */
    CompletableFuture<DeleteStandardValidMappingResponse> deleteStandardValidMapping(DeleteStandardValidMappingRequest request);

    /**
     * @param request the request parameters of DeleteStandardWordRoot  DeleteStandardWordRootRequest
     * @return DeleteStandardWordRootResponse
     */
    CompletableFuture<DeleteStandardWordRootResponse> deleteStandardWordRoot(DeleteStandardWordRootRequest request);

    /**
     * @param request the request parameters of DeleteUdf  DeleteUdfRequest
     * @return DeleteUdfResponse
     */
    CompletableFuture<DeleteUdfResponse> deleteUdf(DeleteUdfRequest request);

    /**
     * @param request the request parameters of DeleteUserGroup  DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     */
    CompletableFuture<DeleteUserGroupResponse> deleteUserGroup(DeleteUserGroupRequest request);

    /**
     * @param request the request parameters of ExecuteAdHocTask  ExecuteAdHocTaskRequest
     * @return ExecuteAdHocTaskResponse
     */
    CompletableFuture<ExecuteAdHocTaskResponse> executeAdHocTask(ExecuteAdHocTaskRequest request);

    /**
     * @param request the request parameters of ExecuteManualNode  ExecuteManualNodeRequest
     * @return ExecuteManualNodeResponse
     */
    CompletableFuture<ExecuteManualNodeResponse> executeManualNode(ExecuteManualNodeRequest request);

    /**
     * @param request the request parameters of ExecuteTriggerNode  ExecuteTriggerNodeRequest
     * @return ExecuteTriggerNodeResponse
     */
    CompletableFuture<ExecuteTriggerNodeResponse> executeTriggerNode(ExecuteTriggerNodeRequest request);

    /**
     * @param request the request parameters of FixData  FixDataRequest
     * @return FixDataResponse
     */
    CompletableFuture<FixDataResponse> fixData(FixDataRequest request);

    /**
     * @param request the request parameters of GetAccountByRowPermissionId  GetAccountByRowPermissionIdRequest
     * @return GetAccountByRowPermissionIdResponse
     */
    CompletableFuture<GetAccountByRowPermissionIdResponse> getAccountByRowPermissionId(GetAccountByRowPermissionIdRequest request);

    /**
     * @param request the request parameters of GetAdHocFile  GetAdHocFileRequest
     * @return GetAdHocFileResponse
     */
    CompletableFuture<GetAdHocFileResponse> getAdHocFile(GetAdHocFileRequest request);

    /**
     * @param request the request parameters of GetAdHocTaskLog  GetAdHocTaskLogRequest
     * @return GetAdHocTaskLogResponse
     */
    CompletableFuture<GetAdHocTaskLogResponse> getAdHocTaskLog(GetAdHocTaskLogRequest request);

    /**
     * @param request the request parameters of GetAdHocTaskResult  GetAdHocTaskResultRequest
     * @return GetAdHocTaskResultResponse
     */
    CompletableFuture<GetAdHocTaskResultResponse> getAdHocTaskResult(GetAdHocTaskResultRequest request);

    /**
     * @param request the request parameters of GetAlertEvent  GetAlertEventRequest
     * @return GetAlertEventResponse
     */
    CompletableFuture<GetAlertEventResponse> getAlertEvent(GetAlertEventRequest request);

    /**
     * @param request the request parameters of GetAssetMappingRelations  GetAssetMappingRelationsRequest
     * @return GetAssetMappingRelationsResponse
     */
    CompletableFuture<GetAssetMappingRelationsResponse> getAssetMappingRelations(GetAssetMappingRelationsRequest request);

    /**
     * @param request the request parameters of GetBatchTaskInfo  GetBatchTaskInfoRequest
     * @return GetBatchTaskInfoResponse
     */
    CompletableFuture<GetBatchTaskInfoResponse> getBatchTaskInfo(GetBatchTaskInfoRequest request);

    /**
     * @param request the request parameters of GetBatchTaskInfoByVersion  GetBatchTaskInfoByVersionRequest
     * @return GetBatchTaskInfoByVersionResponse
     */
    CompletableFuture<GetBatchTaskInfoByVersionResponse> getBatchTaskInfoByVersion(GetBatchTaskInfoByVersionRequest request);

    /**
     * @param request the request parameters of GetBatchTaskUdfLineages  GetBatchTaskUdfLineagesRequest
     * @return GetBatchTaskUdfLineagesResponse
     */
    CompletableFuture<GetBatchTaskUdfLineagesResponse> getBatchTaskUdfLineages(GetBatchTaskUdfLineagesRequest request);

    /**
     * @param request the request parameters of GetBatchTaskVersions  GetBatchTaskVersionsRequest
     * @return GetBatchTaskVersionsResponse
     */
    CompletableFuture<GetBatchTaskVersionsResponse> getBatchTaskVersions(GetBatchTaskVersionsRequest request);

    /**
     * @param request the request parameters of GetBelongAssetMapping  GetBelongAssetMappingRequest
     * @return GetBelongAssetMappingResponse
     */
    CompletableFuture<GetBelongAssetMappingResponse> getBelongAssetMapping(GetBelongAssetMappingRequest request);

    /**
     * @param request the request parameters of GetBizEntityInfo  GetBizEntityInfoRequest
     * @return GetBizEntityInfoResponse
     */
    CompletableFuture<GetBizEntityInfoResponse> getBizEntityInfo(GetBizEntityInfoRequest request);

    /**
     * @param request the request parameters of GetBizEntityInfoByVersion  GetBizEntityInfoByVersionRequest
     * @return GetBizEntityInfoByVersionResponse
     */
    CompletableFuture<GetBizEntityInfoByVersionResponse> getBizEntityInfoByVersion(GetBizEntityInfoByVersionRequest request);

    /**
     * @param request the request parameters of GetBizMetricByName  GetBizMetricByNameRequest
     * @return GetBizMetricByNameResponse
     */
    CompletableFuture<GetBizMetricByNameResponse> getBizMetricByName(GetBizMetricByNameRequest request);

    /**
     * @param request the request parameters of GetBizUnitInfo  GetBizUnitInfoRequest
     * @return GetBizUnitInfoResponse
     */
    CompletableFuture<GetBizUnitInfoResponse> getBizUnitInfo(GetBizUnitInfoRequest request);

    /**
     * @param request the request parameters of GetCheckConnectivityJobs  GetCheckConnectivityJobsRequest
     * @return GetCheckConnectivityJobsResponse
     */
    CompletableFuture<GetCheckConnectivityJobsResponse> getCheckConnectivityJobs(GetCheckConnectivityJobsRequest request);

    /**
     * @param request the request parameters of GetClusterQueueInfoByEnv  GetClusterQueueInfoByEnvRequest
     * @return GetClusterQueueInfoByEnvResponse
     */
    CompletableFuture<GetClusterQueueInfoByEnvResponse> getClusterQueueInfoByEnv(GetClusterQueueInfoByEnvRequest request);

    /**
     * @param request the request parameters of GetComputeSource  GetComputeSourceRequest
     * @return GetComputeSourceResponse
     */
    CompletableFuture<GetComputeSourceResponse> getComputeSource(GetComputeSourceRequest request);

    /**
     * @param request the request parameters of GetDataDomainInfo  GetDataDomainInfoRequest
     * @return GetDataDomainInfoResponse
     */
    CompletableFuture<GetDataDomainInfoResponse> getDataDomainInfo(GetDataDomainInfoRequest request);

    /**
     * @param request the request parameters of GetDataServiceApiCallSummary  GetDataServiceApiCallSummaryRequest
     * @return GetDataServiceApiCallSummaryResponse
     */
    CompletableFuture<GetDataServiceApiCallSummaryResponse> getDataServiceApiCallSummary(GetDataServiceApiCallSummaryRequest request);

    /**
     * @param request the request parameters of GetDataServiceApiCallTrend  GetDataServiceApiCallTrendRequest
     * @return GetDataServiceApiCallTrendResponse
     */
    CompletableFuture<GetDataServiceApiCallTrendResponse> getDataServiceApiCallTrend(GetDataServiceApiCallTrendRequest request);

    /**
     * @param request the request parameters of GetDataServiceApiDocument  GetDataServiceApiDocumentRequest
     * @return GetDataServiceApiDocumentResponse
     */
    CompletableFuture<GetDataServiceApiDocumentResponse> getDataServiceApiDocument(GetDataServiceApiDocumentRequest request);

    /**
     * @param request the request parameters of GetDataServiceApiErrorImpact  GetDataServiceApiErrorImpactRequest
     * @return GetDataServiceApiErrorImpactResponse
     */
    CompletableFuture<GetDataServiceApiErrorImpactResponse> getDataServiceApiErrorImpact(GetDataServiceApiErrorImpactRequest request);

    /**
     * @param request the request parameters of GetDataServiceApiGroups  GetDataServiceApiGroupsRequest
     * @return GetDataServiceApiGroupsResponse
     */
    CompletableFuture<GetDataServiceApiGroupsResponse> getDataServiceApiGroups(GetDataServiceApiGroupsRequest request);

    /**
     * @param request the request parameters of GetDataServiceAppAuthorizedUsers  GetDataServiceAppAuthorizedUsersRequest
     * @return GetDataServiceAppAuthorizedUsersResponse
     */
    CompletableFuture<GetDataServiceAppAuthorizedUsersResponse> getDataServiceAppAuthorizedUsers(GetDataServiceAppAuthorizedUsersRequest request);

    /**
     * @param request the request parameters of GetDataServiceAppGroups  GetDataServiceAppGroupsRequest
     * @return GetDataServiceAppGroupsResponse
     */
    CompletableFuture<GetDataServiceAppGroupsResponse> getDataServiceAppGroups(GetDataServiceAppGroupsRequest request);

    /**
     * @param request the request parameters of GetDataServiceAppsByGroupId  GetDataServiceAppsByGroupIdRequest
     * @return GetDataServiceAppsByGroupIdResponse
     */
    CompletableFuture<GetDataServiceAppsByGroupIdResponse> getDataServiceAppsByGroupId(GetDataServiceAppsByGroupIdRequest request);

    /**
     * @param request the request parameters of GetDataServiceAuthorizedAppsByGroupId  GetDataServiceAuthorizedAppsByGroupIdRequest
     * @return GetDataServiceAuthorizedAppsByGroupIdResponse
     */
    CompletableFuture<GetDataServiceAuthorizedAppsByGroupIdResponse> getDataServiceAuthorizedAppsByGroupId(GetDataServiceAuthorizedAppsByGroupIdRequest request);

    /**
     * @param request the request parameters of GetDataServiceAuthorizedProjects  GetDataServiceAuthorizedProjectsRequest
     * @return GetDataServiceAuthorizedProjectsResponse
     */
    CompletableFuture<GetDataServiceAuthorizedProjectsResponse> getDataServiceAuthorizedProjects(GetDataServiceAuthorizedProjectsRequest request);

    /**
     * @param request the request parameters of GetDataServiceMyProjects  GetDataServiceMyProjectsRequest
     * @return GetDataServiceMyProjectsResponse
     */
    CompletableFuture<GetDataServiceMyProjectsResponse> getDataServiceMyProjects(GetDataServiceMyProjectsRequest request);

    /**
     * @param request the request parameters of GetDataServiceProjectAddableUsers  GetDataServiceProjectAddableUsersRequest
     * @return GetDataServiceProjectAddableUsersResponse
     */
    CompletableFuture<GetDataServiceProjectAddableUsersResponse> getDataServiceProjectAddableUsers(GetDataServiceProjectAddableUsersRequest request);

    /**
     * @param request the request parameters of GetDataSourceDependencies  GetDataSourceDependenciesRequest
     * @return GetDataSourceDependenciesResponse
     */
    CompletableFuture<GetDataSourceDependenciesResponse> getDataSourceDependencies(GetDataSourceDependenciesRequest request);

    /**
     * @param request the request parameters of GetDevObjectDependency  GetDevObjectDependencyRequest
     * @return GetDevObjectDependencyResponse
     */
    CompletableFuture<GetDevObjectDependencyResponse> getDevObjectDependency(GetDevObjectDependencyRequest request);

    /**
     * @param request the request parameters of GetDirectoryTree  GetDirectoryTreeRequest
     * @return GetDirectoryTreeResponse
     */
    CompletableFuture<GetDirectoryTreeResponse> getDirectoryTree(GetDirectoryTreeRequest request);

    /**
     * @param request the request parameters of GetFileStorageCredential  GetFileStorageCredentialRequest
     * @return GetFileStorageCredentialResponse
     */
    CompletableFuture<GetFileStorageCredentialResponse> getFileStorageCredential(GetFileStorageCredentialRequest request);

    /**
     * @param request the request parameters of GetInstanceDownStream  GetInstanceDownStreamRequest
     * @return GetInstanceDownStreamResponse
     */
    CompletableFuture<GetInstanceDownStreamResponse> getInstanceDownStream(GetInstanceDownStreamRequest request);

    /**
     * @param request the request parameters of GetInstanceUpDownStream  GetInstanceUpDownStreamRequest
     * @return GetInstanceUpDownStreamResponse
     */
    CompletableFuture<GetInstanceUpDownStreamResponse> getInstanceUpDownStream(GetInstanceUpDownStreamRequest request);

    /**
     * @param request the request parameters of GetLatestSubmitDetail  GetLatestSubmitDetailRequest
     * @return GetLatestSubmitDetailResponse
     */
    CompletableFuture<GetLatestSubmitDetailResponse> getLatestSubmitDetail(GetLatestSubmitDetailRequest request);

    /**
     * @param request the request parameters of GetMyRoles  GetMyRolesRequest
     * @return GetMyRolesResponse
     */
    CompletableFuture<GetMyRolesResponse> getMyRoles(GetMyRolesRequest request);

    /**
     * @param request the request parameters of GetMyTenants  GetMyTenantsRequest
     * @return GetMyTenantsResponse
     */
    CompletableFuture<GetMyTenantsResponse> getMyTenants(GetMyTenantsRequest request);

    /**
     * @param request the request parameters of GetNodeUpDownStream  GetNodeUpDownStreamRequest
     * @return GetNodeUpDownStreamResponse
     */
    CompletableFuture<GetNodeUpDownStreamResponse> getNodeUpDownStream(GetNodeUpDownStreamRequest request);

    /**
     * @param request the request parameters of GetOperationSubmitStatus  GetOperationSubmitStatusRequest
     * @return GetOperationSubmitStatusResponse
     */
    CompletableFuture<GetOperationSubmitStatusResponse> getOperationSubmitStatus(GetOperationSubmitStatusRequest request);

    /**
     * @param request the request parameters of GetPhysicalInstance  GetPhysicalInstanceRequest
     * @return GetPhysicalInstanceResponse
     */
    CompletableFuture<GetPhysicalInstanceResponse> getPhysicalInstance(GetPhysicalInstanceRequest request);

    /**
     * @param request the request parameters of GetPhysicalInstanceLog  GetPhysicalInstanceLogRequest
     * @return GetPhysicalInstanceLogResponse
     */
    CompletableFuture<GetPhysicalInstanceLogResponse> getPhysicalInstanceLog(GetPhysicalInstanceLogRequest request);

    /**
     * @param request the request parameters of GetPhysicalNode  GetPhysicalNodeRequest
     * @return GetPhysicalNodeResponse
     */
    CompletableFuture<GetPhysicalNodeResponse> getPhysicalNode(GetPhysicalNodeRequest request);

    /**
     * @param request the request parameters of GetPhysicalNodeByOutputName  GetPhysicalNodeByOutputNameRequest
     * @return GetPhysicalNodeByOutputNameResponse
     */
    CompletableFuture<GetPhysicalNodeByOutputNameResponse> getPhysicalNodeByOutputName(GetPhysicalNodeByOutputNameRequest request);

    /**
     * @param request the request parameters of GetPhysicalNodeContent  GetPhysicalNodeContentRequest
     * @return GetPhysicalNodeContentResponse
     */
    CompletableFuture<GetPhysicalNodeContentResponse> getPhysicalNodeContent(GetPhysicalNodeContentRequest request);

    /**
     * @param request the request parameters of GetPhysicalNodeOperationLog  GetPhysicalNodeOperationLogRequest
     * @return GetPhysicalNodeOperationLogResponse
     */
    CompletableFuture<GetPhysicalNodeOperationLogResponse> getPhysicalNodeOperationLog(GetPhysicalNodeOperationLogRequest request);

    /**
     * @param request the request parameters of GetPipelineAsyncResult  GetPipelineAsyncResultRequest
     * @return GetPipelineAsyncResultResponse
     */
    CompletableFuture<GetPipelineAsyncResultResponse> getPipelineAsyncResult(GetPipelineAsyncResultRequest request);

    /**
     * @param request the request parameters of GetPipelineById  GetPipelineByIdRequest
     * @return GetPipelineByIdResponse
     */
    CompletableFuture<GetPipelineByIdResponse> getPipelineById(GetPipelineByIdRequest request);

    /**
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * @param request the request parameters of GetProjectByName  GetProjectByNameRequest
     * @return GetProjectByNameResponse
     */
    CompletableFuture<GetProjectByNameResponse> getProjectByName(GetProjectByNameRequest request);

    /**
     * @param request the request parameters of GetProjectProduceUser  GetProjectProduceUserRequest
     * @return GetProjectProduceUserResponse
     */
    CompletableFuture<GetProjectProduceUserResponse> getProjectProduceUser(GetProjectProduceUserRequest request);

    /**
     * @param request the request parameters of GetProjectWhiteLists  GetProjectWhiteListsRequest
     * @return GetProjectWhiteListsResponse
     */
    CompletableFuture<GetProjectWhiteListsResponse> getProjectWhiteLists(GetProjectWhiteListsRequest request);

    /**
     * @param request the request parameters of GetQualityAlertOfAllRuleScopeByWatchId  GetQualityAlertOfAllRuleScopeByWatchIdRequest
     * @return GetQualityAlertOfAllRuleScopeByWatchIdResponse
     */
    CompletableFuture<GetQualityAlertOfAllRuleScopeByWatchIdResponse> getQualityAlertOfAllRuleScopeByWatchId(GetQualityAlertOfAllRuleScopeByWatchIdRequest request);

    /**
     * @param request the request parameters of GetQualityRule  GetQualityRuleRequest
     * @return GetQualityRuleResponse
     */
    CompletableFuture<GetQualityRuleResponse> getQualityRule(GetQualityRuleRequest request);

    /**
     * @param request the request parameters of GetQualityRuleTask  GetQualityRuleTaskRequest
     * @return GetQualityRuleTaskResponse
     */
    CompletableFuture<GetQualityRuleTaskResponse> getQualityRuleTask(GetQualityRuleTaskRequest request);

    /**
     * @param request the request parameters of GetQualityRuleTaskLog  GetQualityRuleTaskLogRequest
     * @return GetQualityRuleTaskLogResponse
     */
    CompletableFuture<GetQualityRuleTaskLogResponse> getQualityRuleTaskLog(GetQualityRuleTaskLogRequest request);

    /**
     * @param request the request parameters of GetQualitySchedule  GetQualityScheduleRequest
     * @return GetQualityScheduleResponse
     */
    CompletableFuture<GetQualityScheduleResponse> getQualitySchedule(GetQualityScheduleRequest request);

    /**
     * @param request the request parameters of GetQualitySchedulesByWatchId  GetQualitySchedulesByWatchIdRequest
     * @return GetQualitySchedulesByWatchIdResponse
     */
    CompletableFuture<GetQualitySchedulesByWatchIdResponse> getQualitySchedulesByWatchId(GetQualitySchedulesByWatchIdRequest request);

    /**
     * @param request the request parameters of GetQualityTemplate  GetQualityTemplateRequest
     * @return GetQualityTemplateResponse
     */
    CompletableFuture<GetQualityTemplateResponse> getQualityTemplate(GetQualityTemplateRequest request);

    /**
     * @param request the request parameters of GetQualityWatch  GetQualityWatchRequest
     * @return GetQualityWatchResponse
     */
    CompletableFuture<GetQualityWatchResponse> getQualityWatch(GetQualityWatchRequest request);

    /**
     * @param request the request parameters of GetQualityWatchByObjectId  GetQualityWatchByObjectIdRequest
     * @return GetQualityWatchByObjectIdResponse
     */
    CompletableFuture<GetQualityWatchByObjectIdResponse> getQualityWatchByObjectId(GetQualityWatchByObjectIdRequest request);

    /**
     * @param request the request parameters of GetQualityWatchTask  GetQualityWatchTaskRequest
     * @return GetQualityWatchTaskResponse
     */
    CompletableFuture<GetQualityWatchTaskResponse> getQualityWatchTask(GetQualityWatchTaskRequest request);

    /**
     * @param request the request parameters of GetQualityWatchTaskLog  GetQualityWatchTaskLogRequest
     * @return GetQualityWatchTaskLogResponse
     */
    CompletableFuture<GetQualityWatchTaskLogResponse> getQualityWatchTaskLog(GetQualityWatchTaskLogRequest request);

    /**
     * @param request the request parameters of GetQueueEngineVersionByEnv  GetQueueEngineVersionByEnvRequest
     * @return GetQueueEngineVersionByEnvResponse
     */
    CompletableFuture<GetQueueEngineVersionByEnvResponse> getQueueEngineVersionByEnv(GetQueueEngineVersionByEnvRequest request);

    /**
     * @param request the request parameters of GetResource  GetResourceRequest
     * @return GetResourceResponse
     */
    CompletableFuture<GetResourceResponse> getResource(GetResourceRequest request);

    /**
     * @param request the request parameters of GetResourceByVersion  GetResourceByVersionRequest
     * @return GetResourceByVersionResponse
     */
    CompletableFuture<GetResourceByVersionResponse> getResourceByVersion(GetResourceByVersionRequest request);

    /**
     * @param request the request parameters of GetSecurityClassify  GetSecurityClassifyRequest
     * @return GetSecurityClassifyResponse
     */
    CompletableFuture<GetSecurityClassifyResponse> getSecurityClassify(GetSecurityClassifyRequest request);

    /**
     * @param request the request parameters of GetSecurityIdentifyResult  GetSecurityIdentifyResultRequest
     * @return GetSecurityIdentifyResultResponse
     */
    CompletableFuture<GetSecurityIdentifyResultResponse> getSecurityIdentifyResult(GetSecurityIdentifyResultRequest request);

    /**
     * @param request the request parameters of GetSecurityLevel  GetSecurityLevelRequest
     * @return GetSecurityLevelResponse
     */
    CompletableFuture<GetSecurityLevelResponse> getSecurityLevel(GetSecurityLevelRequest request);

    /**
     * @param request the request parameters of GetSecuritySecretKey  GetSecuritySecretKeyRequest
     * @return GetSecuritySecretKeyResponse
     */
    CompletableFuture<GetSecuritySecretKeyResponse> getSecuritySecretKey(GetSecuritySecretKeyRequest request);

    /**
     * @param request the request parameters of GetSparkLocalClientInfo  GetSparkLocalClientInfoRequest
     * @return GetSparkLocalClientInfoResponse
     */
    CompletableFuture<GetSparkLocalClientInfoResponse> getSparkLocalClientInfo(GetSparkLocalClientInfoRequest request);

    /**
     * @param request the request parameters of GetStandard  GetStandardRequest
     * @return GetStandardResponse
     */
    CompletableFuture<GetStandardResponse> getStandard(GetStandardRequest request);

    /**
     * @param request the request parameters of GetStandardLookupTable  GetStandardLookupTableRequest
     * @return GetStandardLookupTableResponse
     */
    CompletableFuture<GetStandardLookupTableResponse> getStandardLookupTable(GetStandardLookupTableRequest request);

    /**
     * @param request the request parameters of GetStandardSet  GetStandardSetRequest
     * @return GetStandardSetResponse
     */
    CompletableFuture<GetStandardSetResponse> getStandardSet(GetStandardSetRequest request);

    /**
     * @param request the request parameters of GetStandardStatistics  GetStandardStatisticsRequest
     * @return GetStandardStatisticsResponse
     */
    CompletableFuture<GetStandardStatisticsResponse> getStandardStatistics(GetStandardStatisticsRequest request);

    /**
     * @param request the request parameters of GetStandardTemplate  GetStandardTemplateRequest
     * @return GetStandardTemplateResponse
     */
    CompletableFuture<GetStandardTemplateResponse> getStandardTemplate(GetStandardTemplateRequest request);

    /**
     * @param request the request parameters of GetStandardWordRoot  GetStandardWordRootRequest
     * @return GetStandardWordRootResponse
     */
    CompletableFuture<GetStandardWordRootResponse> getStandardWordRoot(GetStandardWordRootRequest request);

    /**
     * @param request the request parameters of GetStreamJobs  GetStreamJobsRequest
     * @return GetStreamJobsResponse
     */
    CompletableFuture<GetStreamJobsResponse> getStreamJobs(GetStreamJobsRequest request);

    /**
     * @param request the request parameters of GetSupplementDagrun  GetSupplementDagrunRequest
     * @return GetSupplementDagrunResponse
     */
    CompletableFuture<GetSupplementDagrunResponse> getSupplementDagrun(GetSupplementDagrunRequest request);

    /**
     * @param request the request parameters of GetSupplementDagrunInstance  GetSupplementDagrunInstanceRequest
     * @return GetSupplementDagrunInstanceResponse
     */
    CompletableFuture<GetSupplementDagrunInstanceResponse> getSupplementDagrunInstance(GetSupplementDagrunInstanceRequest request);

    /**
     * @param request the request parameters of GetTableColumnLineageByTaskId  GetTableColumnLineageByTaskIdRequest
     * @return GetTableColumnLineageByTaskIdResponse
     */
    CompletableFuture<GetTableColumnLineageByTaskIdResponse> getTableColumnLineageByTaskId(GetTableColumnLineageByTaskIdRequest request);

    /**
     * @param request the request parameters of GetTableColumnLineages  GetTableColumnLineagesRequest
     * @return GetTableColumnLineagesResponse
     */
    CompletableFuture<GetTableColumnLineagesResponse> getTableColumnLineages(GetTableColumnLineagesRequest request);

    /**
     * @param request the request parameters of GetTableColumns  GetTableColumnsRequest
     * @return GetTableColumnsResponse
     */
    CompletableFuture<GetTableColumnsResponse> getTableColumns(GetTableColumnsRequest request);

    /**
     * @param request the request parameters of GetTableLineageByTaskId  GetTableLineageByTaskIdRequest
     * @return GetTableLineageByTaskIdResponse
     */
    CompletableFuture<GetTableLineageByTaskIdResponse> getTableLineageByTaskId(GetTableLineageByTaskIdRequest request);

    /**
     * @param request the request parameters of GetTableLineages  GetTableLineagesRequest
     * @return GetTableLineagesResponse
     */
    CompletableFuture<GetTableLineagesResponse> getTableLineages(GetTableLineagesRequest request);

    /**
     * @param request the request parameters of GetTransferInfo  GetTransferInfoRequest
     * @return GetTransferInfoResponse
     */
    CompletableFuture<GetTransferInfoResponse> getTransferInfo(GetTransferInfoRequest request);

    /**
     * @param request the request parameters of GetUdf  GetUdfRequest
     * @return GetUdfResponse
     */
    CompletableFuture<GetUdfResponse> getUdf(GetUdfRequest request);

    /**
     * @param request the request parameters of GetUdfByVersion  GetUdfByVersionRequest
     * @return GetUdfByVersionResponse
     */
    CompletableFuture<GetUdfByVersionResponse> getUdfByVersion(GetUdfByVersionRequest request);

    /**
     * @param request the request parameters of GetUserBySourceId  GetUserBySourceIdRequest
     * @return GetUserBySourceIdResponse
     */
    CompletableFuture<GetUserBySourceIdResponse> getUserBySourceId(GetUserBySourceIdRequest request);

    /**
     * @param request the request parameters of GetUserGroup  GetUserGroupRequest
     * @return GetUserGroupResponse
     */
    CompletableFuture<GetUserGroupResponse> getUserGroup(GetUserGroupRequest request);

    /**
     * @param request the request parameters of GetUsers  GetUsersRequest
     * @return GetUsersResponse
     */
    CompletableFuture<GetUsersResponse> getUsers(GetUsersRequest request);

    /**
     * @param request the request parameters of GrantDataServiceApi  GrantDataServiceApiRequest
     * @return GrantDataServiceApiResponse
     */
    CompletableFuture<GrantDataServiceApiResponse> grantDataServiceApi(GrantDataServiceApiRequest request);

    /**
     * @param request the request parameters of GrantResourcePermission  GrantResourcePermissionRequest
     * @return GrantResourcePermissionResponse
     */
    CompletableFuture<GrantResourcePermissionResponse> grantResourcePermission(GrantResourcePermissionRequest request);

    /**
     * @param request the request parameters of ListAddableRoles  ListAddableRolesRequest
     * @return ListAddableRolesResponse
     */
    CompletableFuture<ListAddableRolesResponse> listAddableRoles(ListAddableRolesRequest request);

    /**
     * @param request the request parameters of ListAddableUsers  ListAddableUsersRequest
     * @return ListAddableUsersResponse
     */
    CompletableFuture<ListAddableUsersResponse> listAddableUsers(ListAddableUsersRequest request);

    /**
     * @param request the request parameters of ListAlertEvents  ListAlertEventsRequest
     * @return ListAlertEventsResponse
     */
    CompletableFuture<ListAlertEventsResponse> listAlertEvents(ListAlertEventsRequest request);

    /**
     * @param request the request parameters of ListAlertNotifications  ListAlertNotificationsRequest
     * @return ListAlertNotificationsResponse
     */
    CompletableFuture<ListAlertNotificationsResponse> listAlertNotifications(ListAlertNotificationsRequest request);

    /**
     * @param request the request parameters of ListApiByApp  ListApiByAppRequest
     * @return ListApiByAppResponse
     */
    CompletableFuture<ListApiByAppResponse> listApiByApp(ListApiByAppRequest request);

    /**
     * @param request the request parameters of ListAuthorizedDataServiceApiDetails  ListAuthorizedDataServiceApiDetailsRequest
     * @return ListAuthorizedDataServiceApiDetailsResponse
     */
    CompletableFuture<ListAuthorizedDataServiceApiDetailsResponse> listAuthorizedDataServiceApiDetails(ListAuthorizedDataServiceApiDetailsRequest request);

    /**
     * @param request the request parameters of ListBizEntities  ListBizEntitiesRequest
     * @return ListBizEntitiesResponse
     */
    CompletableFuture<ListBizEntitiesResponse> listBizEntities(ListBizEntitiesRequest request);

    /**
     * @param request the request parameters of ListBizUnits  ListBizUnitsRequest
     * @return ListBizUnitsResponse
     */
    CompletableFuture<ListBizUnitsResponse> listBizUnits(ListBizUnitsRequest request);

    /**
     * @param request the request parameters of ListComputeSources  ListComputeSourcesRequest
     * @return ListComputeSourcesResponse
     */
    CompletableFuture<ListComputeSourcesResponse> listComputeSources(ListComputeSourcesRequest request);

    /**
     * @param request the request parameters of ListDataDomains  ListDataDomainsRequest
     * @return ListDataDomainsResponse
     */
    CompletableFuture<ListDataDomainsResponse> listDataDomains(ListDataDomainsRequest request);

    /**
     * @param request the request parameters of ListDataServiceApiCallStatistics  ListDataServiceApiCallStatisticsRequest
     * @return ListDataServiceApiCallStatisticsResponse
     */
    CompletableFuture<ListDataServiceApiCallStatisticsResponse> listDataServiceApiCallStatistics(ListDataServiceApiCallStatisticsRequest request);

    /**
     * @param request the request parameters of ListDataServiceApiCalls  ListDataServiceApiCallsRequest
     * @return ListDataServiceApiCallsResponse
     */
    CompletableFuture<ListDataServiceApiCallsResponse> listDataServiceApiCalls(ListDataServiceApiCallsRequest request);

    /**
     * @param request the request parameters of ListDataServiceApiImpacts  ListDataServiceApiImpactsRequest
     * @return ListDataServiceApiImpactsResponse
     */
    CompletableFuture<ListDataServiceApiImpactsResponse> listDataServiceApiImpacts(ListDataServiceApiImpactsRequest request);

    /**
     * @param request the request parameters of ListDataServiceAuthorizedApps  ListDataServiceAuthorizedAppsRequest
     * @return ListDataServiceAuthorizedAppsResponse
     */
    CompletableFuture<ListDataServiceAuthorizedAppsResponse> listDataServiceAuthorizedApps(ListDataServiceAuthorizedAppsRequest request);

    /**
     * @param request the request parameters of ListDataServiceMyApiPermissions  ListDataServiceMyApiPermissionsRequest
     * @return ListDataServiceMyApiPermissionsResponse
     */
    CompletableFuture<ListDataServiceMyApiPermissionsResponse> listDataServiceMyApiPermissions(ListDataServiceMyApiPermissionsRequest request);

    /**
     * @param request the request parameters of ListDataServiceMyAppPermissions  ListDataServiceMyAppPermissionsRequest
     * @return ListDataServiceMyAppPermissionsResponse
     */
    CompletableFuture<ListDataServiceMyAppPermissionsResponse> listDataServiceMyAppPermissions(ListDataServiceMyAppPermissionsRequest request);

    /**
     * @param request the request parameters of ListDataServicePublishedApis  ListDataServicePublishedApisRequest
     * @return ListDataServicePublishedApisResponse
     */
    CompletableFuture<ListDataServicePublishedApisResponse> listDataServicePublishedApis(ListDataServicePublishedApisRequest request);

    /**
     * @param request the request parameters of ListDataSourceWithConfig  ListDataSourceWithConfigRequest
     * @return ListDataSourceWithConfigResponse
     */
    CompletableFuture<ListDataSourceWithConfigResponse> listDataSourceWithConfig(ListDataSourceWithConfigRequest request);

    /**
     * @param request the request parameters of ListFiles  ListFilesRequest
     * @return ListFilesResponse
     */
    CompletableFuture<ListFilesResponse> listFiles(ListFilesRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListNodeDownStream  ListNodeDownStreamRequest
     * @return ListNodeDownStreamResponse
     */
    CompletableFuture<ListNodeDownStreamResponse> listNodeDownStream(ListNodeDownStreamRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * @param request the request parameters of ListProjectMembers  ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request);

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * @param request the request parameters of ListPublishRecords  ListPublishRecordsRequest
     * @return ListPublishRecordsResponse
     */
    CompletableFuture<ListPublishRecordsResponse> listPublishRecords(ListPublishRecordsRequest request);

    /**
     * @param request the request parameters of ListQualityRuleTasks  ListQualityRuleTasksRequest
     * @return ListQualityRuleTasksResponse
     */
    CompletableFuture<ListQualityRuleTasksResponse> listQualityRuleTasks(ListQualityRuleTasksRequest request);

    /**
     * @param request the request parameters of ListQualityRules  ListQualityRulesRequest
     * @return ListQualityRulesResponse
     */
    CompletableFuture<ListQualityRulesResponse> listQualityRules(ListQualityRulesRequest request);

    /**
     * @param request the request parameters of ListQualityTemplates  ListQualityTemplatesRequest
     * @return ListQualityTemplatesResponse
     */
    CompletableFuture<ListQualityTemplatesResponse> listQualityTemplates(ListQualityTemplatesRequest request);

    /**
     * @param request the request parameters of ListQualityWatchTasks  ListQualityWatchTasksRequest
     * @return ListQualityWatchTasksResponse
     */
    CompletableFuture<ListQualityWatchTasksResponse> listQualityWatchTasks(ListQualityWatchTasksRequest request);

    /**
     * @param request the request parameters of ListQualityWatches  ListQualityWatchesRequest
     * @return ListQualityWatchesResponse
     */
    CompletableFuture<ListQualityWatchesResponse> listQualityWatches(ListQualityWatchesRequest request);

    /**
     * @param request the request parameters of ListResourcePermissionOperationLog  ListResourcePermissionOperationLogRequest
     * @return ListResourcePermissionOperationLogResponse
     */
    CompletableFuture<ListResourcePermissionOperationLogResponse> listResourcePermissionOperationLog(ListResourcePermissionOperationLogRequest request);

    /**
     * @param request the request parameters of ListResourcePermissions  ListResourcePermissionsRequest
     * @return ListResourcePermissionsResponse
     */
    CompletableFuture<ListResourcePermissionsResponse> listResourcePermissions(ListResourcePermissionsRequest request);

    /**
     * @param request the request parameters of ListRowPermission  ListRowPermissionRequest
     * @return ListRowPermissionResponse
     */
    CompletableFuture<ListRowPermissionResponse> listRowPermission(ListRowPermissionRequest request);

    /**
     * @param request the request parameters of ListRowPermissionByUserId  ListRowPermissionByUserIdRequest
     * @return ListRowPermissionByUserIdResponse
     */
    CompletableFuture<ListRowPermissionByUserIdResponse> listRowPermissionByUserId(ListRowPermissionByUserIdRequest request);

    /**
     * @param request the request parameters of ListSecurityIdentifyRecords  ListSecurityIdentifyRecordsRequest
     * @return ListSecurityIdentifyRecordsResponse
     */
    CompletableFuture<ListSecurityIdentifyRecordsResponse> listSecurityIdentifyRecords(ListSecurityIdentifyRecordsRequest request);

    /**
     * @param request the request parameters of ListSecurityIdentifyResults  ListSecurityIdentifyResultsRequest
     * @return ListSecurityIdentifyResultsResponse
     */
    CompletableFuture<ListSecurityIdentifyResultsResponse> listSecurityIdentifyResults(ListSecurityIdentifyResultsRequest request);

    /**
     * @param request the request parameters of ListStandards  ListStandardsRequest
     * @return ListStandardsResponse
     */
    CompletableFuture<ListStandardsResponse> listStandards(ListStandardsRequest request);

    /**
     * @param request the request parameters of ListSubmitRecords  ListSubmitRecordsRequest
     * @return ListSubmitRecordsResponse
     */
    CompletableFuture<ListSubmitRecordsResponse> listSubmitRecords(ListSubmitRecordsRequest request);

    /**
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    /**
     * @param request the request parameters of ListTenantMembers  ListTenantMembersRequest
     * @return ListTenantMembersResponse
     */
    CompletableFuture<ListTenantMembersResponse> listTenantMembers(ListTenantMembersRequest request);

    /**
     * @param request the request parameters of ListUserGroupMembers  ListUserGroupMembersRequest
     * @return ListUserGroupMembersResponse
     */
    CompletableFuture<ListUserGroupMembersResponse> listUserGroupMembers(ListUserGroupMembersRequest request);

    /**
     * @param request the request parameters of ListUserGroups  ListUserGroupsRequest
     * @return ListUserGroupsResponse
     */
    CompletableFuture<ListUserGroupsResponse> listUserGroups(ListUserGroupsRequest request);

    /**
     * @param request the request parameters of OfflineBatchTask  OfflineBatchTaskRequest
     * @return OfflineBatchTaskResponse
     */
    CompletableFuture<OfflineBatchTaskResponse> offlineBatchTask(OfflineBatchTaskRequest request);

    /**
     * @param request the request parameters of OfflineBizEntity  OfflineBizEntityRequest
     * @return OfflineBizEntityResponse
     */
    CompletableFuture<OfflineBizEntityResponse> offlineBizEntity(OfflineBizEntityRequest request);

    /**
     * @param request the request parameters of OfflinePipeline  OfflinePipelineRequest
     * @return OfflinePipelineResponse
     */
    CompletableFuture<OfflinePipelineResponse> offlinePipeline(OfflinePipelineRequest request);

    /**
     * @param request the request parameters of OfflinePipelineByAsync  OfflinePipelineByAsyncRequest
     * @return OfflinePipelineByAsyncResponse
     */
    CompletableFuture<OfflinePipelineByAsyncResponse> offlinePipelineByAsync(OfflinePipelineByAsyncRequest request);

    /**
     * @param request the request parameters of OfflineStandard  OfflineStandardRequest
     * @return OfflineStandardResponse
     */
    CompletableFuture<OfflineStandardResponse> offlineStandard(OfflineStandardRequest request);

    /**
     * @param request the request parameters of OnlineBizEntity  OnlineBizEntityRequest
     * @return OnlineBizEntityResponse
     */
    CompletableFuture<OnlineBizEntityResponse> onlineBizEntity(OnlineBizEntityRequest request);

    /**
     * @param request the request parameters of OperateInstance  OperateInstanceRequest
     * @return OperateInstanceResponse
     */
    CompletableFuture<OperateInstanceResponse> operateInstance(OperateInstanceRequest request);

    /**
     * @param request the request parameters of ParseBatchTaskDependency  ParseBatchTaskDependencyRequest
     * @return ParseBatchTaskDependencyResponse
     */
    CompletableFuture<ParseBatchTaskDependencyResponse> parseBatchTaskDependency(ParseBatchTaskDependencyRequest request);

    /**
     * @param request the request parameters of PausePhysicalNode  PausePhysicalNodeRequest
     * @return PausePhysicalNodeResponse
     */
    CompletableFuture<PausePhysicalNodeResponse> pausePhysicalNode(PausePhysicalNodeRequest request);

    /**
     * @param request the request parameters of PublishDataServiceApi  PublishDataServiceApiRequest
     * @return PublishDataServiceApiResponse
     */
    CompletableFuture<PublishDataServiceApiResponse> publishDataServiceApi(PublishDataServiceApiRequest request);

    /**
     * @param request the request parameters of PublishObjectList  PublishObjectListRequest
     * @return PublishObjectListResponse
     */
    CompletableFuture<PublishObjectListResponse> publishObjectList(PublishObjectListRequest request);

    /**
     * @param request the request parameters of PublishStandard  PublishStandardRequest
     * @return PublishStandardResponse
     */
    CompletableFuture<PublishStandardResponse> publishStandard(PublishStandardRequest request);

    /**
     * @param request the request parameters of RemoveProjectMember  RemoveProjectMemberRequest
     * @return RemoveProjectMemberResponse
     */
    CompletableFuture<RemoveProjectMemberResponse> removeProjectMember(RemoveProjectMemberRequest request);

    /**
     * @param request the request parameters of RemoveQualityRuleSchedules  RemoveQualityRuleSchedulesRequest
     * @return RemoveQualityRuleSchedulesResponse
     */
    CompletableFuture<RemoveQualityRuleSchedulesResponse> removeQualityRuleSchedules(RemoveQualityRuleSchedulesRequest request);

    /**
     * @param request the request parameters of RemoveTenantMember  RemoveTenantMemberRequest
     * @return RemoveTenantMemberResponse
     */
    CompletableFuture<RemoveTenantMemberResponse> removeTenantMember(RemoveTenantMemberRequest request);

    /**
     * @param request the request parameters of RemoveUserGroupMember  RemoveUserGroupMemberRequest
     * @return RemoveUserGroupMemberResponse
     */
    CompletableFuture<RemoveUserGroupMemberResponse> removeUserGroupMember(RemoveUserGroupMemberRequest request);

    /**
     * @param request the request parameters of ReplaceProjectWhiteLists  ReplaceProjectWhiteListsRequest
     * @return ReplaceProjectWhiteListsResponse
     */
    CompletableFuture<ReplaceProjectWhiteListsResponse> replaceProjectWhiteLists(ReplaceProjectWhiteListsRequest request);

    /**
     * @param request the request parameters of ResumePhysicalNode  ResumePhysicalNodeRequest
     * @return ResumePhysicalNodeResponse
     */
    CompletableFuture<ResumePhysicalNodeResponse> resumePhysicalNode(ResumePhysicalNodeRequest request);

    /**
     * @param request the request parameters of RetryTransferOwnership  RetryTransferOwnershipRequest
     * @return RetryTransferOwnershipResponse
     */
    CompletableFuture<RetryTransferOwnershipResponse> retryTransferOwnership(RetryTransferOwnershipRequest request);

    /**
     * @param request the request parameters of RevokeDataServiceApi  RevokeDataServiceApiRequest
     * @return RevokeDataServiceApiResponse
     */
    CompletableFuture<RevokeDataServiceApiResponse> revokeDataServiceApi(RevokeDataServiceApiRequest request);

    /**
     * @param request the request parameters of RevokeResourcePermission  RevokeResourcePermissionRequest
     * @return RevokeResourcePermissionResponse
     */
    CompletableFuture<RevokeResourcePermissionResponse> revokeResourcePermission(RevokeResourcePermissionRequest request);

    /**
     * @param request the request parameters of StopAdHocTask  StopAdHocTaskRequest
     * @return StopAdHocTaskResponse
     */
    CompletableFuture<StopAdHocTaskResponse> stopAdHocTask(StopAdHocTaskRequest request);

    /**
     * @param request the request parameters of SubmitBatchTask  SubmitBatchTaskRequest
     * @return SubmitBatchTaskResponse
     */
    CompletableFuture<SubmitBatchTaskResponse> submitBatchTask(SubmitBatchTaskRequest request);

    /**
     * @param request the request parameters of SubmitQualityRuleTasks  SubmitQualityRuleTasksRequest
     * @return SubmitQualityRuleTasksResponse
     */
    CompletableFuture<SubmitQualityRuleTasksResponse> submitQualityRuleTasks(SubmitQualityRuleTasksRequest request);

    /**
     * @param request the request parameters of SubmitQualityWatchTasks  SubmitQualityWatchTasksRequest
     * @return SubmitQualityWatchTasksResponse
     */
    CompletableFuture<SubmitQualityWatchTasksResponse> submitQualityWatchTasks(SubmitQualityWatchTasksRequest request);

    /**
     * @param request the request parameters of SyncDepartment  SyncDepartmentRequest
     * @return SyncDepartmentResponse
     */
    CompletableFuture<SyncDepartmentResponse> syncDepartment(SyncDepartmentRequest request);

    /**
     * @param request the request parameters of SyncDepartmentUser  SyncDepartmentUserRequest
     * @return SyncDepartmentUserResponse
     */
    CompletableFuture<SyncDepartmentUserResponse> syncDepartmentUser(SyncDepartmentUserRequest request);

    /**
     * @param request the request parameters of TransferOwnershipForAllObject  TransferOwnershipForAllObjectRequest
     * @return TransferOwnershipForAllObjectResponse
     */
    CompletableFuture<TransferOwnershipForAllObjectResponse> transferOwnershipForAllObject(TransferOwnershipForAllObjectRequest request);

    /**
     * @param request the request parameters of UpdateAdHocFile  UpdateAdHocFileRequest
     * @return UpdateAdHocFileResponse
     */
    CompletableFuture<UpdateAdHocFileResponse> updateAdHocFile(UpdateAdHocFileRequest request);

    /**
     * @param request the request parameters of UpdateBatchTask  UpdateBatchTaskRequest
     * @return UpdateBatchTaskResponse
     */
    CompletableFuture<UpdateBatchTaskResponse> updateBatchTask(UpdateBatchTaskRequest request);

    /**
     * @param request the request parameters of UpdateBatchTaskUdfLineages  UpdateBatchTaskUdfLineagesRequest
     * @return UpdateBatchTaskUdfLineagesResponse
     */
    CompletableFuture<UpdateBatchTaskUdfLineagesResponse> updateBatchTaskUdfLineages(UpdateBatchTaskUdfLineagesRequest request);

    /**
     * @param request the request parameters of UpdateBizEntity  UpdateBizEntityRequest
     * @return UpdateBizEntityResponse
     */
    CompletableFuture<UpdateBizEntityResponse> updateBizEntity(UpdateBizEntityRequest request);

    /**
     * @param request the request parameters of UpdateBizMetric  UpdateBizMetricRequest
     * @return UpdateBizMetricResponse
     */
    CompletableFuture<UpdateBizMetricResponse> updateBizMetric(UpdateBizMetricRequest request);

    /**
     * @param request the request parameters of UpdateBizUnit  UpdateBizUnitRequest
     * @return UpdateBizUnitResponse
     */
    CompletableFuture<UpdateBizUnitResponse> updateBizUnit(UpdateBizUnitRequest request);

    /**
     * @param request the request parameters of UpdateComputeSource  UpdateComputeSourceRequest
     * @return UpdateComputeSourceResponse
     */
    CompletableFuture<UpdateComputeSourceResponse> updateComputeSource(UpdateComputeSourceRequest request);

    /**
     * @param request the request parameters of UpdateDataDomain  UpdateDataDomainRequest
     * @return UpdateDataDomainResponse
     */
    CompletableFuture<UpdateDataDomainResponse> updateDataDomain(UpdateDataDomainRequest request);

    /**
     * @param request the request parameters of UpdateDataSourceBasicInfo  UpdateDataSourceBasicInfoRequest
     * @return UpdateDataSourceBasicInfoResponse
     */
    CompletableFuture<UpdateDataSourceBasicInfoResponse> updateDataSourceBasicInfo(UpdateDataSourceBasicInfoRequest request);

    /**
     * @param request the request parameters of UpdateDataSourceConfig  UpdateDataSourceConfigRequest
     * @return UpdateDataSourceConfigResponse
     */
    CompletableFuture<UpdateDataSourceConfigResponse> updateDataSourceConfig(UpdateDataSourceConfigRequest request);

    /**
     * @param request the request parameters of UpdateFileDirectory  UpdateFileDirectoryRequest
     * @return UpdateFileDirectoryResponse
     */
    CompletableFuture<UpdateFileDirectoryResponse> updateFileDirectory(UpdateFileDirectoryRequest request);

    /**
     * @param request the request parameters of UpdateFileName  UpdateFileNameRequest
     * @return UpdateFileNameResponse
     */
    CompletableFuture<UpdateFileNameResponse> updateFileName(UpdateFileNameRequest request);

    /**
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

    /**
     * @param request the request parameters of UpdatePipelineByAsync  UpdatePipelineByAsyncRequest
     * @return UpdatePipelineByAsyncResponse
     */
    CompletableFuture<UpdatePipelineByAsyncResponse> updatePipelineByAsync(UpdatePipelineByAsyncRequest request);

    /**
     * @param request the request parameters of UpdateProjectMember  UpdateProjectMemberRequest
     * @return UpdateProjectMemberResponse
     */
    CompletableFuture<UpdateProjectMemberResponse> updateProjectMember(UpdateProjectMemberRequest request);

    /**
     * @param request the request parameters of UpdateQualityRuleSwitch  UpdateQualityRuleSwitchRequest
     * @return UpdateQualityRuleSwitchResponse
     */
    CompletableFuture<UpdateQualityRuleSwitchResponse> updateQualityRuleSwitch(UpdateQualityRuleSwitchRequest request);

    /**
     * @param request the request parameters of UpdateQualityWatchSwitch  UpdateQualityWatchSwitchRequest
     * @return UpdateQualityWatchSwitchResponse
     */
    CompletableFuture<UpdateQualityWatchSwitchResponse> updateQualityWatchSwitch(UpdateQualityWatchSwitchRequest request);

    /**
     * @param request the request parameters of UpdateResource  UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request);

    /**
     * @param request the request parameters of UpdateRowPermission  UpdateRowPermissionRequest
     * @return UpdateRowPermissionResponse
     */
    CompletableFuture<UpdateRowPermissionResponse> updateRowPermission(UpdateRowPermissionRequest request);

    /**
     * @param request the request parameters of UpdateSecurityClassify  UpdateSecurityClassifyRequest
     * @return UpdateSecurityClassifyResponse
     */
    CompletableFuture<UpdateSecurityClassifyResponse> updateSecurityClassify(UpdateSecurityClassifyRequest request);

    /**
     * @param request the request parameters of UpdateSecurityClassifyCatalog  UpdateSecurityClassifyCatalogRequest
     * @return UpdateSecurityClassifyCatalogResponse
     */
    CompletableFuture<UpdateSecurityClassifyCatalogResponse> updateSecurityClassifyCatalog(UpdateSecurityClassifyCatalogRequest request);

    /**
     * @param request the request parameters of UpdateSecurityIdentifyResultStatus  UpdateSecurityIdentifyResultStatusRequest
     * @return UpdateSecurityIdentifyResultStatusResponse
     */
    CompletableFuture<UpdateSecurityIdentifyResultStatusResponse> updateSecurityIdentifyResultStatus(UpdateSecurityIdentifyResultStatusRequest request);

    /**
     * @param request the request parameters of UpdateSecurityLevel  UpdateSecurityLevelRequest
     * @return UpdateSecurityLevelResponse
     */
    CompletableFuture<UpdateSecurityLevelResponse> updateSecurityLevel(UpdateSecurityLevelRequest request);

    /**
     * @param request the request parameters of UpdateStandard  UpdateStandardRequest
     * @return UpdateStandardResponse
     */
    CompletableFuture<UpdateStandardResponse> updateStandard(UpdateStandardRequest request);

    /**
     * @param request the request parameters of UpdateStandardLookupTable  UpdateStandardLookupTableRequest
     * @return UpdateStandardLookupTableResponse
     */
    CompletableFuture<UpdateStandardLookupTableResponse> updateStandardLookupTable(UpdateStandardLookupTableRequest request);

    /**
     * @param request the request parameters of UpdateStandardMappingToInvalid  UpdateStandardMappingToInvalidRequest
     * @return UpdateStandardMappingToInvalidResponse
     */
    CompletableFuture<UpdateStandardMappingToInvalidResponse> updateStandardMappingToInvalid(UpdateStandardMappingToInvalidRequest request);

    /**
     * @param request the request parameters of UpdateStandardSet  UpdateStandardSetRequest
     * @return UpdateStandardSetResponse
     */
    CompletableFuture<UpdateStandardSetResponse> updateStandardSet(UpdateStandardSetRequest request);

    /**
     * @param request the request parameters of UpdateStandardTemplate  UpdateStandardTemplateRequest
     * @return UpdateStandardTemplateResponse
     */
    CompletableFuture<UpdateStandardTemplateResponse> updateStandardTemplate(UpdateStandardTemplateRequest request);

    /**
     * @param request the request parameters of UpdateStandardWordRoot  UpdateStandardWordRootRequest
     * @return UpdateStandardWordRootResponse
     */
    CompletableFuture<UpdateStandardWordRootResponse> updateStandardWordRoot(UpdateStandardWordRootRequest request);

    /**
     * @param request the request parameters of UpdateTenantComputeEngine  UpdateTenantComputeEngineRequest
     * @return UpdateTenantComputeEngineResponse
     */
    CompletableFuture<UpdateTenantComputeEngineResponse> updateTenantComputeEngine(UpdateTenantComputeEngineRequest request);

    /**
     * @param request the request parameters of UpdateTenantMember  UpdateTenantMemberRequest
     * @return UpdateTenantMemberResponse
     */
    CompletableFuture<UpdateTenantMemberResponse> updateTenantMember(UpdateTenantMemberRequest request);

    /**
     * @param request the request parameters of UpdateUdf  UpdateUdfRequest
     * @return UpdateUdfResponse
     */
    CompletableFuture<UpdateUdfResponse> updateUdf(UpdateUdfRequest request);

    /**
     * @param request the request parameters of UpdateUserGroup  UpdateUserGroupRequest
     * @return UpdateUserGroupResponse
     */
    CompletableFuture<UpdateUserGroupResponse> updateUserGroup(UpdateUserGroupRequest request);

    /**
     * @param request the request parameters of UpdateUserGroupSwitch  UpdateUserGroupSwitchRequest
     * @return UpdateUserGroupSwitchResponse
     */
    CompletableFuture<UpdateUserGroupSwitchResponse> updateUserGroupSwitch(UpdateUserGroupSwitchRequest request);

    /**
     * @param request the request parameters of UpsertQualityRule  UpsertQualityRuleRequest
     * @return UpsertQualityRuleResponse
     */
    CompletableFuture<UpsertQualityRuleResponse> upsertQualityRule(UpsertQualityRuleRequest request);

    /**
     * @param request the request parameters of UpsertQualitySchedule  UpsertQualityScheduleRequest
     * @return UpsertQualityScheduleResponse
     */
    CompletableFuture<UpsertQualityScheduleResponse> upsertQualitySchedule(UpsertQualityScheduleRequest request);

    /**
     * @param request the request parameters of UpsertQualityTemplate  UpsertQualityTemplateRequest
     * @return UpsertQualityTemplateResponse
     */
    CompletableFuture<UpsertQualityTemplateResponse> upsertQualityTemplate(UpsertQualityTemplateRequest request);

    /**
     * @param request the request parameters of UpsertQualityWatch  UpsertQualityWatchRequest
     * @return UpsertQualityWatchResponse
     */
    CompletableFuture<UpsertQualityWatchResponse> upsertQualityWatch(UpsertQualityWatchRequest request);

    /**
     * @param request the request parameters of UpsertQualityWatchAlert  UpsertQualityWatchAlertRequest
     * @return UpsertQualityWatchAlertResponse
     */
    CompletableFuture<UpsertQualityWatchAlertResponse> upsertQualityWatchAlert(UpsertQualityWatchAlertRequest request);

}
