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
     * @param request the request parameters of CreateBizUnit  CreateBizUnitRequest
     * @return CreateBizUnitResponse
     */
    CompletableFuture<CreateBizUnitResponse> createBizUnit(CreateBizUnitRequest request);

    /**
     * @param request the request parameters of CreateDataDomain  CreateDataDomainRequest
     * @return CreateDataDomainResponse
     */
    CompletableFuture<CreateDataDomainResponse> createDataDomain(CreateDataDomainRequest request);

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
     * @param request the request parameters of CreatePipelineNode  CreatePipelineNodeRequest
     * @return CreatePipelineNodeResponse
     */
    CompletableFuture<CreatePipelineNodeResponse> createPipelineNode(CreatePipelineNodeRequest request);

    /**
     * @param request the request parameters of CreateStreamBatchJobMapping  CreateStreamBatchJobMappingRequest
     * @return CreateStreamBatchJobMappingResponse
     */
    CompletableFuture<CreateStreamBatchJobMappingResponse> createStreamBatchJobMapping(CreateStreamBatchJobMappingRequest request);

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
     * @param request the request parameters of DeleteBizUnit  DeleteBizUnitRequest
     * @return DeleteBizUnitResponse
     */
    CompletableFuture<DeleteBizUnitResponse> deleteBizUnit(DeleteBizUnitRequest request);

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
     * @param request the request parameters of FixData  FixDataRequest
     * @return FixDataResponse
     */
    CompletableFuture<FixDataResponse> fixData(FixDataRequest request);

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
     * @param request the request parameters of GetBizUnitInfo  GetBizUnitInfoRequest
     * @return GetBizUnitInfoResponse
     */
    CompletableFuture<GetBizUnitInfoResponse> getBizUnitInfo(GetBizUnitInfoRequest request);

    /**
     * @param request the request parameters of GetClusterQueueInfoByEnv  GetClusterQueueInfoByEnvRequest
     * @return GetClusterQueueInfoByEnvResponse
     */
    CompletableFuture<GetClusterQueueInfoByEnvResponse> getClusterQueueInfoByEnv(GetClusterQueueInfoByEnvRequest request);

    /**
     * @param request the request parameters of GetDataDomainInfo  GetDataDomainInfoRequest
     * @return GetDataDomainInfoResponse
     */
    CompletableFuture<GetDataDomainInfoResponse> getDataDomainInfo(GetDataDomainInfoRequest request);

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
     * @param request the request parameters of GetProjectProduceUser  GetProjectProduceUserRequest
     * @return GetProjectProduceUserResponse
     */
    CompletableFuture<GetProjectProduceUserResponse> getProjectProduceUser(GetProjectProduceUserRequest request);

    /**
     * @param request the request parameters of GetQueueEngineVersionByEnv  GetQueueEngineVersionByEnvRequest
     * @return GetQueueEngineVersionByEnvResponse
     */
    CompletableFuture<GetQueueEngineVersionByEnvResponse> getQueueEngineVersionByEnv(GetQueueEngineVersionByEnvRequest request);

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
     * @param request the request parameters of ListDataDomains  ListDataDomainsRequest
     * @return ListDataDomainsResponse
     */
    CompletableFuture<ListDataDomainsResponse> listDataDomains(ListDataDomainsRequest request);

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
     * @param request the request parameters of ListPublishRecords  ListPublishRecordsRequest
     * @return ListPublishRecordsResponse
     */
    CompletableFuture<ListPublishRecordsResponse> listPublishRecords(ListPublishRecordsRequest request);

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
     * @param request the request parameters of ListSubmitRecords  ListSubmitRecordsRequest
     * @return ListSubmitRecordsResponse
     */
    CompletableFuture<ListSubmitRecordsResponse> listSubmitRecords(ListSubmitRecordsRequest request);

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
     * @param request the request parameters of PublishObjectList  PublishObjectListRequest
     * @return PublishObjectListResponse
     */
    CompletableFuture<PublishObjectListResponse> publishObjectList(PublishObjectListRequest request);

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
     * @param request the request parameters of ResumePhysicalNode  ResumePhysicalNodeRequest
     * @return ResumePhysicalNodeResponse
     */
    CompletableFuture<ResumePhysicalNodeResponse> resumePhysicalNode(ResumePhysicalNodeRequest request);

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
     * @param request the request parameters of UpdateBizUnit  UpdateBizUnitRequest
     * @return UpdateBizUnitResponse
     */
    CompletableFuture<UpdateBizUnitResponse> updateBizUnit(UpdateBizUnitRequest request);

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
     * @param request the request parameters of UpdateTenantMember  UpdateTenantMemberRequest
     * @return UpdateTenantMemberResponse
     */
    CompletableFuture<UpdateTenantMemberResponse> updateTenantMember(UpdateTenantMemberRequest request);

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

}
