// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aliding20230426.models.*;
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
     * @param request the request parameters of AddAttendee  AddAttendeeRequest
     * @return AddAttendeeResponse
     */
    CompletableFuture<AddAttendeeResponse> addAttendee(AddAttendeeRequest request);

    /**
     * @param request the request parameters of AddDriveSpace  AddDriveSpaceRequest
     * @return AddDriveSpaceResponse
     */
    CompletableFuture<AddDriveSpaceResponse> addDriveSpace(AddDriveSpaceRequest request);

    /**
     * @param request the request parameters of AddFolder  AddFolderRequest
     * @return AddFolderResponse
     */
    CompletableFuture<AddFolderResponse> addFolder(AddFolderRequest request);

    /**
     * @param request the request parameters of AddMeetingRooms  AddMeetingRoomsRequest
     * @return AddMeetingRoomsResponse
     */
    CompletableFuture<AddMeetingRoomsResponse> addMeetingRooms(AddMeetingRoomsRequest request);

    /**
     * @param request the request parameters of AddMultiDimTable  AddMultiDimTableRequest
     * @return AddMultiDimTableResponse
     */
    CompletableFuture<AddMultiDimTableResponse> addMultiDimTable(AddMultiDimTableRequest request);

    /**
     * @param request the request parameters of AddPermission  AddPermissionRequest
     * @return AddPermissionResponse
     */
    CompletableFuture<AddPermissionResponse> addPermission(AddPermissionRequest request);

    /**
     * @param request the request parameters of AddRecordPermission  AddRecordPermissionRequest
     * @return AddRecordPermissionResponse
     */
    CompletableFuture<AddRecordPermissionResponse> addRecordPermission(AddRecordPermissionRequest request);

    /**
     * @param request the request parameters of AddScenegroupMember  AddScenegroupMemberRequest
     * @return AddScenegroupMemberResponse
     */
    CompletableFuture<AddScenegroupMemberResponse> addScenegroupMember(AddScenegroupMemberRequest request);

    /**
     * @param request the request parameters of AddTicketMemo  AddTicketMemoRequest
     * @return AddTicketMemoResponse
     */
    CompletableFuture<AddTicketMemoResponse> addTicketMemo(AddTicketMemoRequest request);

    /**
     * @param request the request parameters of AddWorkspace  AddWorkspaceRequest
     * @return AddWorkspaceResponse
     */
    CompletableFuture<AddWorkspaceResponse> addWorkspace(AddWorkspaceRequest request);

    /**
     * @param request the request parameters of AddWorkspaceDocMembers  AddWorkspaceDocMembersRequest
     * @return AddWorkspaceDocMembersResponse
     */
    CompletableFuture<AddWorkspaceDocMembersResponse> addWorkspaceDocMembers(AddWorkspaceDocMembersRequest request);

    /**
     * @param request the request parameters of AddWorkspaceMembers  AddWorkspaceMembersRequest
     * @return AddWorkspaceMembersResponse
     */
    CompletableFuture<AddWorkspaceMembersResponse> addWorkspaceMembers(AddWorkspaceMembersRequest request);

    /**
     * @param request the request parameters of AssignTicket  AssignTicketRequest
     * @return AssignTicketResponse
     */
    CompletableFuture<AssignTicketResponse> assignTicket(AssignTicketRequest request);

    /**
     * @param request the request parameters of BatchGetFormDataByIdList  BatchGetFormDataByIdListRequest
     * @return BatchGetFormDataByIdListResponse
     */
    CompletableFuture<BatchGetFormDataByIdListResponse> batchGetFormDataByIdList(BatchGetFormDataByIdListRequest request);

    /**
     * @param request the request parameters of BatchRemovalByFormInstanceIdList  BatchRemovalByFormInstanceIdListRequest
     * @return BatchRemovalByFormInstanceIdListResponse
     */
    CompletableFuture<BatchRemovalByFormInstanceIdListResponse> batchRemovalByFormInstanceIdList(BatchRemovalByFormInstanceIdListRequest request);

    /**
     * @param request the request parameters of BatchSaveFormData  BatchSaveFormDataRequest
     * @return BatchSaveFormDataResponse
     */
    CompletableFuture<BatchSaveFormDataResponse> batchSaveFormData(BatchSaveFormDataRequest request);

    /**
     * @param request the request parameters of BatchUpdateFormDataByInstanceId  BatchUpdateFormDataByInstanceIdRequest
     * @return BatchUpdateFormDataByInstanceIdResponse
     */
    CompletableFuture<BatchUpdateFormDataByInstanceIdResponse> batchUpdateFormDataByInstanceId(BatchUpdateFormDataByInstanceIdRequest request);

    /**
     * @param request the request parameters of BatchUpdateFormDataByInstanceMap  BatchUpdateFormDataByInstanceMapRequest
     * @return BatchUpdateFormDataByInstanceMapResponse
     */
    CompletableFuture<BatchUpdateFormDataByInstanceMapResponse> batchUpdateFormDataByInstanceMap(BatchUpdateFormDataByInstanceMapRequest request);

    /**
     * @param request the request parameters of CancelScheduleConference  CancelScheduleConferenceRequest
     * @return CancelScheduleConferenceResponse
     */
    CompletableFuture<CancelScheduleConferenceResponse> cancelScheduleConference(CancelScheduleConferenceRequest request);

    /**
     * @param request the request parameters of CheckAlibabaStaff  CheckAlibabaStaffRequest
     * @return CheckAlibabaStaffResponse
     */
    CompletableFuture<CheckAlibabaStaffResponse> checkAlibabaStaff(CheckAlibabaStaffRequest request);

    /**
     * @param request the request parameters of CheckUserIsGroupMember  CheckUserIsGroupMemberRequest
     * @return CheckUserIsGroupMemberResponse
     */
    CompletableFuture<CheckUserIsGroupMemberResponse> checkUserIsGroupMember(CheckUserIsGroupMemberRequest request);

    /**
     * @param request the request parameters of Clear  ClearRequest
     * @return ClearResponse
     */
    CompletableFuture<ClearResponse> clear(ClearRequest request);

    /**
     * @param request the request parameters of ClearData  ClearDataRequest
     * @return ClearDataResponse
     */
    CompletableFuture<ClearDataResponse> clearData(ClearDataRequest request);

    /**
     * @param request the request parameters of CloseVideoConference  CloseVideoConferenceRequest
     * @return CloseVideoConferenceResponse
     */
    CompletableFuture<CloseVideoConferenceResponse> closeVideoConference(CloseVideoConferenceRequest request);

    /**
     * @param request the request parameters of CommentListReport  CommentListReportRequest
     * @return CommentListReportResponse
     */
    CompletableFuture<CommentListReportResponse> commentListReport(CommentListReportRequest request);

    /**
     * @param request the request parameters of CommitFile  CommitFileRequest
     * @return CommitFileResponse
     */
    CompletableFuture<CommitFileResponse> commitFile(CommitFileRequest request);

    /**
     * @param request the request parameters of CopyDentry  CopyDentryRequest
     * @return CopyDentryResponse
     */
    CompletableFuture<CopyDentryResponse> copyDentry(CopyDentryRequest request);

    /**
     * @param request the request parameters of CreateDeliveryPlan  CreateDeliveryPlanRequest
     * @return CreateDeliveryPlanResponse
     */
    CompletableFuture<CreateDeliveryPlanResponse> createDeliveryPlan(CreateDeliveryPlanRequest request);

    /**
     * @param request the request parameters of CreateDingtalkPersonalTodoTask  CreateDingtalkPersonalTodoTaskRequest
     * @return CreateDingtalkPersonalTodoTaskResponse
     */
    CompletableFuture<CreateDingtalkPersonalTodoTaskResponse> createDingtalkPersonalTodoTask(CreateDingtalkPersonalTodoTaskRequest request);

    /**
     * @param request the request parameters of CreateEvent  CreateEventRequest
     * @return CreateEventResponse
     */
    CompletableFuture<CreateEventResponse> createEvent(CreateEventRequest request);

    /**
     * @param request the request parameters of CreateLive  CreateLiveRequest
     * @return CreateLiveResponse
     */
    CompletableFuture<CreateLiveResponse> createLive(CreateLiveRequest request);

    /**
     * @param request the request parameters of CreateMeetingRoom  CreateMeetingRoomRequest
     * @return CreateMeetingRoomResponse
     */
    CompletableFuture<CreateMeetingRoomResponse> createMeetingRoom(CreateMeetingRoomRequest request);

    /**
     * @param request the request parameters of CreateMeetingRoomGroup  CreateMeetingRoomGroupRequest
     * @return CreateMeetingRoomGroupResponse
     */
    CompletableFuture<CreateMeetingRoomGroupResponse> createMeetingRoomGroup(CreateMeetingRoomGroupRequest request);

    /**
     * @param request the request parameters of CreateMessage  CreateMessageRequest
     * @return CreateMessageResponse
     */
    CompletableFuture<CreateMessageResponse> createMessage(CreateMessageRequest request);

    /**
     * @param request the request parameters of CreateMultiDimTableField  CreateMultiDimTableFieldRequest
     * @return CreateMultiDimTableFieldResponse
     */
    CompletableFuture<CreateMultiDimTableFieldResponse> createMultiDimTableField(CreateMultiDimTableFieldRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateFormData  CreateOrUpdateFormDataRequest
     * @return CreateOrUpdateFormDataResponse
     */
    CompletableFuture<CreateOrUpdateFormDataResponse> createOrUpdateFormData(CreateOrUpdateFormDataRequest request);

    /**
     * @param request the request parameters of CreateOrgHonorTemplate  CreateOrgHonorTemplateRequest
     * @return CreateOrgHonorTemplateResponse
     */
    CompletableFuture<CreateOrgHonorTemplateResponse> createOrgHonorTemplate(CreateOrgHonorTemplateRequest request);

    /**
     * @param request the request parameters of CreatePersonalTodoTask  CreatePersonalTodoTaskRequest
     * @return CreatePersonalTodoTaskResponse
     */
    CompletableFuture<CreatePersonalTodoTaskResponse> createPersonalTodoTask(CreatePersonalTodoTaskRequest request);

    /**
     * @param request the request parameters of CreateReport  CreateReportRequest
     * @return CreateReportResponse
     */
    CompletableFuture<CreateReportResponse> createReport(CreateReportRequest request);

    /**
     * @param request the request parameters of CreateRun  CreateRunRequest
     * @return CreateRunResponse
     */
    CompletableFuture<CreateRunResponse> createRun(CreateRunRequest request);

    ResponseIterable<CreateRunResponseBody> createRunWithResponseIterable(CreateRunRequest request);

    /**
     * @param request the request parameters of CreateScenegroup  CreateScenegroupRequest
     * @return CreateScenegroupResponse
     */
    CompletableFuture<CreateScenegroupResponse> createScenegroup(CreateScenegroupRequest request);

    /**
     * @param request the request parameters of CreateScheduleConference  CreateScheduleConferenceRequest
     * @return CreateScheduleConferenceResponse
     */
    CompletableFuture<CreateScheduleConferenceResponse> createScheduleConference(CreateScheduleConferenceRequest request);

    /**
     * @param request the request parameters of CreateSearchDome  CreateSearchDomeRequest
     * @return CreateSearchDomeResponse
     */
    CompletableFuture<CreateSearchDomeResponse> createSearchDome(CreateSearchDomeRequest request);

    /**
     * @param request the request parameters of CreateSearchKeyword  CreateSearchKeywordRequest
     * @return CreateSearchKeywordResponse
     */
    CompletableFuture<CreateSearchKeywordResponse> createSearchKeyword(CreateSearchKeywordRequest request);

    /**
     * @param request the request parameters of CreateSheet  CreateSheetRequest
     * @return CreateSheetResponse
     */
    CompletableFuture<CreateSheetResponse> createSheet(CreateSheetRequest request);

    /**
     * @param request the request parameters of CreateSubscribedCalendar  CreateSubscribedCalendarRequest
     * @return CreateSubscribedCalendarResponse
     */
    CompletableFuture<CreateSubscribedCalendarResponse> createSubscribedCalendar(CreateSubscribedCalendarRequest request);

    /**
     * @param request the request parameters of CreateThread  CreateThreadRequest
     * @return CreateThreadResponse
     */
    CompletableFuture<CreateThreadResponse> createThread(CreateThreadRequest request);

    /**
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    /**
     * @param request the request parameters of CreateTodoTask  CreateTodoTaskRequest
     * @return CreateTodoTaskResponse
     */
    CompletableFuture<CreateTodoTaskResponse> createTodoTask(CreateTodoTaskRequest request);

    /**
     * @param request the request parameters of CreateVideoConference  CreateVideoConferenceRequest
     * @return CreateVideoConferenceResponse
     */
    CompletableFuture<CreateVideoConferenceResponse> createVideoConference(CreateVideoConferenceRequest request);

    /**
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    /**
     * @param request the request parameters of CreateWorkspaceDoc  CreateWorkspaceDocRequest
     * @return CreateWorkspaceDocResponse
     */
    CompletableFuture<CreateWorkspaceDocResponse> createWorkspaceDoc(CreateWorkspaceDocRequest request);

    /**
     * @param request the request parameters of DeleteColumns  DeleteColumnsRequest
     * @return DeleteColumnsResponse
     */
    CompletableFuture<DeleteColumnsResponse> deleteColumns(DeleteColumnsRequest request);

    /**
     * @param request the request parameters of DeleteDentry  DeleteDentryRequest
     * @return DeleteDentryResponse
     */
    CompletableFuture<DeleteDentryResponse> deleteDentry(DeleteDentryRequest request);

    /**
     * @param request the request parameters of DeleteDriveSpace  DeleteDriveSpaceRequest
     * @return DeleteDriveSpaceResponse
     */
    CompletableFuture<DeleteDriveSpaceResponse> deleteDriveSpace(DeleteDriveSpaceRequest request);

    /**
     * @param request the request parameters of DeleteEvent  DeleteEventRequest
     * @return DeleteEventResponse
     */
    CompletableFuture<DeleteEventResponse> deleteEvent(DeleteEventRequest request);

    /**
     * @param request the request parameters of DeleteFormData  DeleteFormDataRequest
     * @return DeleteFormDataResponse
     */
    CompletableFuture<DeleteFormDataResponse> deleteFormData(DeleteFormDataRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteLive  DeleteLiveRequest
     * @return DeleteLiveResponse
     */
    CompletableFuture<DeleteLiveResponse> deleteLive(DeleteLiveRequest request);

    /**
     * @param request the request parameters of DeleteMeetingRoom  DeleteMeetingRoomRequest
     * @return DeleteMeetingRoomResponse
     */
    CompletableFuture<DeleteMeetingRoomResponse> deleteMeetingRoom(DeleteMeetingRoomRequest request);

    /**
     * @param request the request parameters of DeleteMeetingRoomGroup  DeleteMeetingRoomGroupRequest
     * @return DeleteMeetingRoomGroupResponse
     */
    CompletableFuture<DeleteMeetingRoomGroupResponse> deleteMeetingRoomGroup(DeleteMeetingRoomGroupRequest request);

    /**
     * @param request the request parameters of DeleteMultiDimTableField  DeleteMultiDimTableFieldRequest
     * @return DeleteMultiDimTableFieldResponse
     */
    CompletableFuture<DeleteMultiDimTableFieldResponse> deleteMultiDimTableField(DeleteMultiDimTableFieldRequest request);

    /**
     * @param request the request parameters of DeleteMultiDimTableRecords  DeleteMultiDimTableRecordsRequest
     * @return DeleteMultiDimTableRecordsResponse
     */
    CompletableFuture<DeleteMultiDimTableRecordsResponse> deleteMultiDimTableRecords(DeleteMultiDimTableRecordsRequest request);

    /**
     * @param request the request parameters of DeletePermission  DeletePermissionRequest
     * @return DeletePermissionResponse
     */
    CompletableFuture<DeletePermissionResponse> deletePermission(DeletePermissionRequest request);

    /**
     * @param request the request parameters of DeleteRows  DeleteRowsRequest
     * @return DeleteRowsResponse
     */
    CompletableFuture<DeleteRowsResponse> deleteRows(DeleteRowsRequest request);

    /**
     * @param request the request parameters of DeleteScenegroupMember  DeleteScenegroupMemberRequest
     * @return DeleteScenegroupMemberResponse
     */
    CompletableFuture<DeleteScenegroupMemberResponse> deleteScenegroupMember(DeleteScenegroupMemberRequest request);

    /**
     * @param request the request parameters of DeleteSheet  DeleteSheetRequest
     * @return DeleteSheetResponse
     */
    CompletableFuture<DeleteSheetResponse> deleteSheet(DeleteSheetRequest request);

    /**
     * @param request the request parameters of DeleteSubscribedCalendar  DeleteSubscribedCalendarRequest
     * @return DeleteSubscribedCalendarResponse
     */
    CompletableFuture<DeleteSubscribedCalendarResponse> deleteSubscribedCalendar(DeleteSubscribedCalendarRequest request);

    /**
     * @param request the request parameters of DeleteTodoTask  DeleteTodoTaskRequest
     * @return DeleteTodoTaskResponse
     */
    CompletableFuture<DeleteTodoTaskResponse> deleteTodoTask(DeleteTodoTaskRequest request);

    /**
     * @param request the request parameters of DeleteWorkspaceDocMembers  DeleteWorkspaceDocMembersRequest
     * @return DeleteWorkspaceDocMembersResponse
     */
    CompletableFuture<DeleteWorkspaceDocMembersResponse> deleteWorkspaceDocMembers(DeleteWorkspaceDocMembersRequest request);

    /**
     * @param request the request parameters of DeleteWorkspaceMembers  DeleteWorkspaceMembersRequest
     * @return DeleteWorkspaceMembersResponse
     */
    CompletableFuture<DeleteWorkspaceMembersResponse> deleteWorkspaceMembers(DeleteWorkspaceMembersRequest request);

    /**
     * @param request the request parameters of DocBlocksQuery  DocBlocksQueryRequest
     * @return DocBlocksQueryResponse
     */
    CompletableFuture<DocBlocksQueryResponse> docBlocksQuery(DocBlocksQueryRequest request);

    /**
     * @param request the request parameters of DocUpdateContent  DocUpdateContentRequest
     * @return DocUpdateContentResponse
     */
    CompletableFuture<DocUpdateContentResponse> docUpdateContent(DocUpdateContentRequest request);

    /**
     * @param request the request parameters of ExecuteBatchTask  ExecuteBatchTaskRequest
     * @return ExecuteBatchTaskResponse
     */
    CompletableFuture<ExecuteBatchTaskResponse> executeBatchTask(ExecuteBatchTaskRequest request);

    /**
     * @param request the request parameters of ExecutePlatformTask  ExecutePlatformTaskRequest
     * @return ExecutePlatformTaskResponse
     */
    CompletableFuture<ExecutePlatformTaskResponse> executePlatformTask(ExecutePlatformTaskRequest request);

    /**
     * @param request the request parameters of ExecuteTask  ExecuteTaskRequest
     * @return ExecuteTaskResponse
     */
    CompletableFuture<ExecuteTaskResponse> executeTask(ExecuteTaskRequest request);

    /**
     * @param request the request parameters of ExpandGroupCapacity  ExpandGroupCapacityRequest
     * @return ExpandGroupCapacityResponse
     */
    CompletableFuture<ExpandGroupCapacityResponse> expandGroupCapacity(ExpandGroupCapacityRequest request);

    /**
     * @param request the request parameters of FinishTicket  FinishTicketRequest
     * @return FinishTicketResponse
     */
    CompletableFuture<FinishTicketResponse> finishTicket(FinishTicketRequest request);

    /**
     * @param request the request parameters of GetActivityList  GetActivityListRequest
     * @return GetActivityListResponse
     */
    CompletableFuture<GetActivityListResponse> getActivityList(GetActivityListRequest request);

    /**
     * @param request the request parameters of GetAllSheets  GetAllSheetsRequest
     * @return GetAllSheetsResponse
     */
    CompletableFuture<GetAllSheetsResponse> getAllSheets(GetAllSheetsRequest request);

    /**
     * @param request the request parameters of GetAssistantCapability  GetAssistantCapabilityRequest
     * @return GetAssistantCapabilityResponse
     */
    CompletableFuture<GetAssistantCapabilityResponse> getAssistantCapability(GetAssistantCapabilityRequest request);

    /**
     * @param request the request parameters of GetConversaionSpace  GetConversaionSpaceRequest
     * @return GetConversaionSpaceResponse
     */
    CompletableFuture<GetConversaionSpaceResponse> getConversaionSpace(GetConversaionSpaceRequest request);

    /**
     * @param request the request parameters of GetCorpAccomplishmentTasks  GetCorpAccomplishmentTasksRequest
     * @return GetCorpAccomplishmentTasksResponse
     */
    CompletableFuture<GetCorpAccomplishmentTasksResponse> getCorpAccomplishmentTasks(GetCorpAccomplishmentTasksRequest request);

    /**
     * @param request the request parameters of GetCorpTasks  GetCorpTasksRequest
     * @return GetCorpTasksResponse
     */
    CompletableFuture<GetCorpTasksResponse> getCorpTasks(GetCorpTasksRequest request);

    /**
     * @param request the request parameters of GetDeptNo  GetDeptNoRequest
     * @return GetDeptNoResponse
     */
    CompletableFuture<GetDeptNoResponse> getDeptNo(GetDeptNoRequest request);

    /**
     * @param request the request parameters of GetDocContent  GetDocContentRequest
     * @return GetDocContentResponse
     */
    CompletableFuture<GetDocContentResponse> getDocContent(GetDocContentRequest request);

    /**
     * @param request the request parameters of GetDocContentTakId  GetDocContentTakIdRequest
     * @return GetDocContentTakIdResponse
     */
    CompletableFuture<GetDocContentTakIdResponse> getDocContentTakId(GetDocContentTakIdRequest request);

    /**
     * @param request the request parameters of GetEvent  GetEventRequest
     * @return GetEventResponse
     */
    CompletableFuture<GetEventResponse> getEvent(GetEventRequest request);

    /**
     * @param request the request parameters of GetFieldDefByUuid  GetFieldDefByUuidRequest
     * @return GetFieldDefByUuidResponse
     */
    CompletableFuture<GetFieldDefByUuidResponse> getFieldDefByUuid(GetFieldDefByUuidRequest request);

    /**
     * @param request the request parameters of GetFileDownloadInfo  GetFileDownloadInfoRequest
     * @return GetFileDownloadInfoResponse
     */
    CompletableFuture<GetFileDownloadInfoResponse> getFileDownloadInfo(GetFileDownloadInfoRequest request);

    /**
     * @param request the request parameters of GetFileUploadInfo  GetFileUploadInfoRequest
     * @return GetFileUploadInfoResponse
     */
    CompletableFuture<GetFileUploadInfoResponse> getFileUploadInfo(GetFileUploadInfoRequest request);

    /**
     * @param request the request parameters of GetFormComponentDefinitionList  GetFormComponentDefinitionListRequest
     * @return GetFormComponentDefinitionListResponse
     */
    CompletableFuture<GetFormComponentDefinitionListResponse> getFormComponentDefinitionList(GetFormComponentDefinitionListRequest request);

    /**
     * @param request the request parameters of GetFormDataByID  GetFormDataByIDRequest
     * @return GetFormDataByIDResponse
     */
    CompletableFuture<GetFormDataByIDResponse> getFormDataByID(GetFormDataByIDRequest request);

    /**
     * @param request the request parameters of GetFormListInApp  GetFormListInAppRequest
     * @return GetFormListInAppResponse
     */
    CompletableFuture<GetFormListInAppResponse> getFormListInApp(GetFormListInAppRequest request);

    /**
     * @param request the request parameters of GetGroupLiveList  GetGroupLiveListRequest
     * @return GetGroupLiveListResponse
     */
    CompletableFuture<GetGroupLiveListResponse> getGroupLiveList(GetGroupLiveListRequest request);

    /**
     * @param request the request parameters of GetInnerGroupMembers  GetInnerGroupMembersRequest
     * @return GetInnerGroupMembersResponse
     */
    CompletableFuture<GetInnerGroupMembersResponse> getInnerGroupMembers(GetInnerGroupMembersRequest request);

    /**
     * @param request the request parameters of GetInstanceById  GetInstanceByIdRequest
     * @return GetInstanceByIdResponse
     */
    CompletableFuture<GetInstanceByIdResponse> getInstanceById(GetInstanceByIdRequest request);

    /**
     * @param request the request parameters of GetInstanceIdList  GetInstanceIdListRequest
     * @return GetInstanceIdListResponse
     */
    CompletableFuture<GetInstanceIdListResponse> getInstanceIdList(GetInstanceIdListRequest request);

    /**
     * @param request the request parameters of GetInstances  GetInstancesRequest
     * @return GetInstancesResponse
     */
    CompletableFuture<GetInstancesResponse> getInstances(GetInstancesRequest request);

    /**
     * @param request the request parameters of GetInstancesByIdList  GetInstancesByIdListRequest
     * @return GetInstancesByIdListResponse
     */
    CompletableFuture<GetInstancesByIdListResponse> getInstancesByIdList(GetInstancesByIdListRequest request);

    /**
     * @param request the request parameters of GetLiveReplayUrl  GetLiveReplayUrlRequest
     * @return GetLiveReplayUrlResponse
     */
    CompletableFuture<GetLiveReplayUrlResponse> getLiveReplayUrl(GetLiveReplayUrlRequest request);

    /**
     * @param request the request parameters of GetMeCorpSubmission  GetMeCorpSubmissionRequest
     * @return GetMeCorpSubmissionResponse
     */
    CompletableFuture<GetMeCorpSubmissionResponse> getMeCorpSubmission(GetMeCorpSubmissionRequest request);

    /**
     * @param request the request parameters of GetMeetingRoomsSchedule  GetMeetingRoomsScheduleRequest
     * @return GetMeetingRoomsScheduleResponse
     */
    CompletableFuture<GetMeetingRoomsScheduleResponse> getMeetingRoomsSchedule(GetMeetingRoomsScheduleRequest request);

    /**
     * @param request the request parameters of GetMineWorkspace  GetMineWorkspaceRequest
     * @return GetMineWorkspaceResponse
     */
    CompletableFuture<GetMineWorkspaceResponse> getMineWorkspace(GetMineWorkspaceRequest request);

    /**
     * @param request the request parameters of GetMultiDimTableAllFields  GetMultiDimTableAllFieldsRequest
     * @return GetMultiDimTableAllFieldsResponse
     */
    CompletableFuture<GetMultiDimTableAllFieldsResponse> getMultiDimTableAllFields(GetMultiDimTableAllFieldsRequest request);

    /**
     * @param request the request parameters of GetMultiDimTableAllSheets  GetMultiDimTableAllSheetsRequest
     * @return GetMultiDimTableAllSheetsResponse
     */
    CompletableFuture<GetMultiDimTableAllSheetsResponse> getMultiDimTableAllSheets(GetMultiDimTableAllSheetsRequest request);

    /**
     * @param request the request parameters of GetMultiDimTableRecord  GetMultiDimTableRecordRequest
     * @return GetMultiDimTableRecordResponse
     */
    CompletableFuture<GetMultiDimTableRecordResponse> getMultiDimTableRecord(GetMultiDimTableRecordRequest request);

    /**
     * @param request the request parameters of GetMultiDimTableSheet  GetMultiDimTableSheetRequest
     * @return GetMultiDimTableSheetResponse
     */
    CompletableFuture<GetMultiDimTableSheetResponse> getMultiDimTableSheet(GetMultiDimTableSheetRequest request);

    /**
     * @param request the request parameters of GetMultipartFileUploadInfos  GetMultipartFileUploadInfosRequest
     * @return GetMultipartFileUploadInfosResponse
     */
    CompletableFuture<GetMultipartFileUploadInfosResponse> getMultipartFileUploadInfos(GetMultipartFileUploadInfosRequest request);

    /**
     * @param request the request parameters of GetNewestInnerGroups  GetNewestInnerGroupsRequest
     * @return GetNewestInnerGroupsResponse
     */
    CompletableFuture<GetNewestInnerGroupsResponse> getNewestInnerGroups(GetNewestInnerGroupsRequest request);

    /**
     * @param request the request parameters of GetNode  GetNodeRequest
     * @return GetNodeResponse
     */
    CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request);

    /**
     * @param request the request parameters of GetNodeByUrl  GetNodeByUrlRequest
     * @return GetNodeByUrlResponse
     */
    CompletableFuture<GetNodeByUrlResponse> getNodeByUrl(GetNodeByUrlRequest request);

    /**
     * @param request the request parameters of GetNodes  GetNodesRequest
     * @return GetNodesResponse
     */
    CompletableFuture<GetNodesResponse> getNodes(GetNodesRequest request);

    /**
     * @param request the request parameters of GetNotifyMe  GetNotifyMeRequest
     * @return GetNotifyMeResponse
     */
    CompletableFuture<GetNotifyMeResponse> getNotifyMe(GetNotifyMeRequest request);

    /**
     * @param request the request parameters of GetOpenUrl  GetOpenUrlRequest
     * @return GetOpenUrlResponse
     */
    CompletableFuture<GetOpenUrlResponse> getOpenUrl(GetOpenUrlRequest request);

    /**
     * @param request the request parameters of GetOperationRecords  GetOperationRecordsRequest
     * @return GetOperationRecordsResponse
     */
    CompletableFuture<GetOperationRecordsResponse> getOperationRecords(GetOperationRecordsRequest request);

    /**
     * @param request the request parameters of GetOrgLiveList  GetOrgLiveListRequest
     * @return GetOrgLiveListResponse
     */
    CompletableFuture<GetOrgLiveListResponse> getOrgLiveList(GetOrgLiveListRequest request);

    /**
     * @param request the request parameters of GetOrgOrWebOpenDocContentTaskId  GetOrgOrWebOpenDocContentTaskIdRequest
     * @return GetOrgOrWebOpenDocContentTaskIdResponse
     */
    CompletableFuture<GetOrgOrWebOpenDocContentTaskIdResponse> getOrgOrWebOpenDocContentTaskId(GetOrgOrWebOpenDocContentTaskIdRequest request);

    /**
     * @param request the request parameters of GetProcessDefinition  GetProcessDefinitionRequest
     * @return GetProcessDefinitionResponse
     */
    CompletableFuture<GetProcessDefinitionResponse> getProcessDefinition(GetProcessDefinitionRequest request);

    /**
     * @param request the request parameters of GetRange  GetRangeRequest
     * @return GetRangeResponse
     */
    CompletableFuture<GetRangeResponse> getRange(GetRangeRequest request);

    /**
     * @param request the request parameters of GetRelatedWorkspaces  GetRelatedWorkspacesRequest
     * @return GetRelatedWorkspacesResponse
     */
    CompletableFuture<GetRelatedWorkspacesResponse> getRelatedWorkspaces(GetRelatedWorkspacesRequest request);

    /**
     * @param request the request parameters of GetReportTemplateByName  GetReportTemplateByNameRequest
     * @return GetReportTemplateByNameResponse
     */
    CompletableFuture<GetReportTemplateByNameResponse> getReportTemplateByName(GetReportTemplateByNameRequest request);

    /**
     * @param request the request parameters of GetReportUnReadCount  GetReportUnReadCountRequest
     * @return GetReportUnReadCountResponse
     */
    CompletableFuture<GetReportUnReadCountResponse> getReportUnReadCount(GetReportUnReadCountRequest request);

    /**
     * @param request the request parameters of GetRunningTasks  GetRunningTasksRequest
     * @return GetRunningTasksResponse
     */
    CompletableFuture<GetRunningTasksResponse> getRunningTasks(GetRunningTasksRequest request);

    /**
     * @param request the request parameters of GetSchedule  GetScheduleRequest
     * @return GetScheduleResponse
     */
    CompletableFuture<GetScheduleResponse> getSchedule(GetScheduleRequest request);

    /**
     * @param request the request parameters of GetSheet  GetSheetRequest
     * @return GetSheetResponse
     */
    CompletableFuture<GetSheetResponse> getSheet(GetSheetRequest request);

    /**
     * @param request the request parameters of GetSheetContentJobId  GetSheetContentJobIdRequest
     * @return GetSheetContentJobIdResponse
     */
    CompletableFuture<GetSheetContentJobIdResponse> getSheetContentJobId(GetSheetContentJobIdRequest request);

    /**
     * @param request the request parameters of GetSpaceDirectories  GetSpaceDirectoriesRequest
     * @return GetSpaceDirectoriesResponse
     */
    CompletableFuture<GetSpaceDirectoriesResponse> getSpaceDirectories(GetSpaceDirectoriesRequest request);

    /**
     * @param request the request parameters of GetSubscribedCalendar  GetSubscribedCalendarRequest
     * @return GetSubscribedCalendarResponse
     */
    CompletableFuture<GetSubscribedCalendarResponse> getSubscribedCalendar(GetSubscribedCalendarRequest request);

    /**
     * @param request the request parameters of GetTaskCopies  GetTaskCopiesRequest
     * @return GetTaskCopiesResponse
     */
    CompletableFuture<GetTaskCopiesResponse> getTaskCopies(GetTaskCopiesRequest request);

    /**
     * @param request the request parameters of GetTemplateListByUserId  GetTemplateListByUserIdRequest
     * @return GetTemplateListByUserIdResponse
     */
    CompletableFuture<GetTemplateListByUserIdResponse> getTemplateListByUserId(GetTemplateListByUserIdRequest request);

    /**
     * @param request the request parameters of GetTicket  GetTicketRequest
     * @return GetTicketResponse
     */
    CompletableFuture<GetTicketResponse> getTicket(GetTicketRequest request);

    /**
     * @param request the request parameters of GetTodoTask  GetTodoTaskRequest
     * @return GetTodoTaskResponse
     */
    CompletableFuture<GetTodoTaskResponse> getTodoTask(GetTodoTaskRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of GetUserId  GetUserIdRequest
     * @return GetUserIdResponse
     */
    CompletableFuture<GetUserIdResponse> getUserId(GetUserIdRequest request);

    /**
     * @param request the request parameters of GetUserIdByOrgIdAndStaffId  GetUserIdByOrgIdAndStaffIdRequest
     * @return GetUserIdByOrgIdAndStaffIdResponse
     */
    CompletableFuture<GetUserIdByOrgIdAndStaffIdResponse> getUserIdByOrgIdAndStaffId(GetUserIdByOrgIdAndStaffIdRequest request);

    /**
     * @param request the request parameters of GetUserLatestPlan  GetUserLatestPlanRequest
     * @return GetUserLatestPlanResponse
     */
    CompletableFuture<GetUserLatestPlanResponse> getUserLatestPlan(GetUserLatestPlanRequest request);

    /**
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    /**
     * @param request the request parameters of GetWorkspaces  GetWorkspacesRequest
     * @return GetWorkspacesResponse
     */
    CompletableFuture<GetWorkspacesResponse> getWorkspaces(GetWorkspacesRequest request);

    /**
     * @param request the request parameters of GrantHonor  GrantHonorRequest
     * @return GrantHonorResponse
     */
    CompletableFuture<GrantHonorResponse> grantHonor(GrantHonorRequest request);

    /**
     * @param request the request parameters of InitMultipartFileUpload  InitMultipartFileUploadRequest
     * @return InitMultipartFileUploadResponse
     */
    CompletableFuture<InitMultipartFileUploadResponse> initMultipartFileUpload(InitMultipartFileUploadRequest request);

    /**
     * @param request the request parameters of InsertColumnsBefore  InsertColumnsBeforeRequest
     * @return InsertColumnsBeforeResponse
     */
    CompletableFuture<InsertColumnsBeforeResponse> insertColumnsBefore(InsertColumnsBeforeRequest request);

    /**
     * @param request the request parameters of InsertContentWithOptions  InsertContentWithOptionsRequest
     * @return InsertContentWithOptionsResponse
     */
    CompletableFuture<InsertContentWithOptionsResponse> insertContentWithOptions(InsertContentWithOptionsRequest request);

    /**
     * @param request the request parameters of InsertMultiDimTableRecord  InsertMultiDimTableRecordRequest
     * @return InsertMultiDimTableRecordResponse
     */
    CompletableFuture<InsertMultiDimTableRecordResponse> insertMultiDimTableRecord(InsertMultiDimTableRecordRequest request);

    /**
     * @param request the request parameters of InsertRowsBefore  InsertRowsBeforeRequest
     * @return InsertRowsBeforeResponse
     */
    CompletableFuture<InsertRowsBeforeResponse> insertRowsBefore(InsertRowsBeforeRequest request);

    /**
     * @param request the request parameters of InviteUsers  InviteUsersRequest
     * @return InviteUsersResponse
     */
    CompletableFuture<InviteUsersResponse> inviteUsers(InviteUsersRequest request);

    /**
     * @param request the request parameters of InvokeAssistant  InvokeAssistantRequest
     * @return InvokeAssistantResponse
     */
    CompletableFuture<InvokeAssistantResponse> invokeAssistant(InvokeAssistantRequest request);

    ResponseIterable<InvokeAssistantResponseBody> invokeAssistantWithResponseIterable(InvokeAssistantRequest request);

    /**
     * @param request the request parameters of InvokeSkill  InvokeSkillRequest
     * @return InvokeSkillResponse
     */
    CompletableFuture<InvokeSkillResponse> invokeSkill(InvokeSkillRequest request);

    /**
     * @param request the request parameters of ListApplication  ListApplicationRequest
     * @return ListApplicationResponse
     */
    CompletableFuture<ListApplicationResponse> listApplication(ListApplicationRequest request);

    /**
     * @param request the request parameters of ListCalendars  ListCalendarsRequest
     * @return ListCalendarsResponse
     */
    CompletableFuture<ListCalendarsResponse> listCalendars(ListCalendarsRequest request);

    /**
     * @param request the request parameters of ListDentries  ListDentriesRequest
     * @return ListDentriesResponse
     */
    CompletableFuture<ListDentriesResponse> listDentries(ListDentriesRequest request);

    /**
     * @param request the request parameters of ListDriveSpaces  ListDriveSpacesRequest
     * @return ListDriveSpacesResponse
     */
    CompletableFuture<ListDriveSpacesResponse> listDriveSpaces(ListDriveSpacesRequest request);

    /**
     * @param request the request parameters of ListEvents  ListEventsRequest
     * @return ListEventsResponse
     */
    CompletableFuture<ListEventsResponse> listEvents(ListEventsRequest request);

    /**
     * @param request the request parameters of ListEventsView  ListEventsViewRequest
     * @return ListEventsViewResponse
     */
    CompletableFuture<ListEventsViewResponse> listEventsView(ListEventsViewRequest request);

    /**
     * @param request the request parameters of ListFormRemarks  ListFormRemarksRequest
     * @return ListFormRemarksResponse
     */
    CompletableFuture<ListFormRemarksResponse> listFormRemarks(ListFormRemarksRequest request);

    /**
     * @param request the request parameters of ListMessage  ListMessageRequest
     * @return ListMessageResponse
     */
    CompletableFuture<ListMessageResponse> listMessage(ListMessageRequest request);

    /**
     * @param request the request parameters of ListMultiDimTableRecords  ListMultiDimTableRecordsRequest
     * @return ListMultiDimTableRecordsResponse
     */
    CompletableFuture<ListMultiDimTableRecordsResponse> listMultiDimTableRecords(ListMultiDimTableRecordsRequest request);

    /**
     * @param request the request parameters of ListNavigationByFormType  ListNavigationByFormTypeRequest
     * @return ListNavigationByFormTypeResponse
     */
    CompletableFuture<ListNavigationByFormTypeResponse> listNavigationByFormType(ListNavigationByFormTypeRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * @param request the request parameters of ListPermissions  ListPermissionsRequest
     * @return ListPermissionsResponse
     */
    CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request);

    /**
     * @param request the request parameters of ListReport  ListReportRequest
     * @return ListReportResponse
     */
    CompletableFuture<ListReportResponse> listReport(ListReportRequest request);

    /**
     * @param request the request parameters of ListTableDataByFormInstanceIdTableId  ListTableDataByFormInstanceIdTableIdRequest
     * @return ListTableDataByFormInstanceIdTableIdResponse
     */
    CompletableFuture<ListTableDataByFormInstanceIdTableIdResponse> listTableDataByFormInstanceIdTableId(ListTableDataByFormInstanceIdTableIdRequest request);

    /**
     * @param request the request parameters of ListTeams  ListTeamsRequest
     * @return ListTeamsResponse
     */
    CompletableFuture<ListTeamsResponse> listTeams(ListTeamsRequest request);

    /**
     * @param request the request parameters of ListTemplate  ListTemplateRequest
     * @return ListTemplateResponse
     */
    CompletableFuture<ListTemplateResponse> listTemplate(ListTemplateRequest request);

    /**
     * @param request the request parameters of ListTicketOperateRecord  ListTicketOperateRecordRequest
     * @return ListTicketOperateRecordResponse
     */
    CompletableFuture<ListTicketOperateRecordResponse> listTicketOperateRecord(ListTicketOperateRecordRequest request);

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * @param request the request parameters of PatchEvent  PatchEventRequest
     * @return PatchEventResponse
     */
    CompletableFuture<PatchEventResponse> patchEvent(PatchEventRequest request);

    /**
     * @param request the request parameters of QueryCloudRecordText  QueryCloudRecordTextRequest
     * @return QueryCloudRecordTextResponse
     */
    CompletableFuture<QueryCloudRecordTextResponse> queryCloudRecordText(QueryCloudRecordTextRequest request);

    /**
     * @param request the request parameters of QueryCloudRecordVideo  QueryCloudRecordVideoRequest
     * @return QueryCloudRecordVideoResponse
     */
    CompletableFuture<QueryCloudRecordVideoResponse> queryCloudRecordVideo(QueryCloudRecordVideoRequest request);

    /**
     * @param request the request parameters of QueryCloudRecordVideoPlayInfo  QueryCloudRecordVideoPlayInfoRequest
     * @return QueryCloudRecordVideoPlayInfoResponse
     */
    CompletableFuture<QueryCloudRecordVideoPlayInfoResponse> queryCloudRecordVideoPlayInfo(QueryCloudRecordVideoPlayInfoRequest request);

    /**
     * @param request the request parameters of QueryConferenceInfo  QueryConferenceInfoRequest
     * @return QueryConferenceInfoResponse
     */
    CompletableFuture<QueryConferenceInfoResponse> queryConferenceInfo(QueryConferenceInfoRequest request);

    /**
     * @param request the request parameters of QueryConferenceInfoByRoomCode  QueryConferenceInfoByRoomCodeRequest
     * @return QueryConferenceInfoByRoomCodeResponse
     */
    CompletableFuture<QueryConferenceInfoByRoomCodeResponse> queryConferenceInfoByRoomCode(QueryConferenceInfoByRoomCodeRequest request);

    /**
     * @param request the request parameters of QueryConferenceMembers  QueryConferenceMembersRequest
     * @return QueryConferenceMembersResponse
     */
    CompletableFuture<QueryConferenceMembersResponse> queryConferenceMembers(QueryConferenceMembersRequest request);

    /**
     * @param request the request parameters of QueryDentriesInfo  QueryDentriesInfoRequest
     * @return QueryDentriesInfoResponse
     */
    CompletableFuture<QueryDentriesInfoResponse> queryDentriesInfo(QueryDentriesInfoRequest request);

    /**
     * @param request the request parameters of QueryDentry  QueryDentryRequest
     * @return QueryDentryResponse
     */
    CompletableFuture<QueryDentryResponse> queryDentry(QueryDentryRequest request);

    /**
     * @param request the request parameters of QueryGroupLiveInfo  QueryGroupLiveInfoRequest
     * @return QueryGroupLiveInfoResponse
     */
    CompletableFuture<QueryGroupLiveInfoResponse> queryGroupLiveInfo(QueryGroupLiveInfoRequest request);

    /**
     * @param request the request parameters of QueryLiveInfo  QueryLiveInfoRequest
     * @return QueryLiveInfoResponse
     */
    CompletableFuture<QueryLiveInfoResponse> queryLiveInfo(QueryLiveInfoRequest request);

    /**
     * @param request the request parameters of QueryLiveWatchDetail  QueryLiveWatchDetailRequest
     * @return QueryLiveWatchDetailResponse
     */
    CompletableFuture<QueryLiveWatchDetailResponse> queryLiveWatchDetail(QueryLiveWatchDetailRequest request);

    /**
     * @param request the request parameters of QueryLiveWatchUserList  QueryLiveWatchUserListRequest
     * @return QueryLiveWatchUserListResponse
     */
    CompletableFuture<QueryLiveWatchUserListResponse> queryLiveWatchUserList(QueryLiveWatchUserListRequest request);

    /**
     * @param request the request parameters of QueryMeetingRoom  QueryMeetingRoomRequest
     * @return QueryMeetingRoomResponse
     */
    CompletableFuture<QueryMeetingRoomResponse> queryMeetingRoom(QueryMeetingRoomRequest request);

    /**
     * @param request the request parameters of QueryMeetingRoomGroup  QueryMeetingRoomGroupRequest
     * @return QueryMeetingRoomGroupResponse
     */
    CompletableFuture<QueryMeetingRoomGroupResponse> queryMeetingRoomGroup(QueryMeetingRoomGroupRequest request);

    /**
     * @param request the request parameters of QueryMeetingRoomGroupList  QueryMeetingRoomGroupListRequest
     * @return QueryMeetingRoomGroupListResponse
     */
    CompletableFuture<QueryMeetingRoomGroupListResponse> queryMeetingRoomGroupList(QueryMeetingRoomGroupListRequest request);

    /**
     * @param request the request parameters of QueryMeetingRoomList  QueryMeetingRoomListRequest
     * @return QueryMeetingRoomListResponse
     */
    CompletableFuture<QueryMeetingRoomListResponse> queryMeetingRoomList(QueryMeetingRoomListRequest request);

    /**
     * @param request the request parameters of QueryMinutes  QueryMinutesRequest
     * @return QueryMinutesResponse
     */
    CompletableFuture<QueryMinutesResponse> queryMinutes(QueryMinutesRequest request);

    /**
     * @param request the request parameters of QueryMinutesSummary  QueryMinutesSummaryRequest
     * @return QueryMinutesSummaryResponse
     */
    CompletableFuture<QueryMinutesSummaryResponse> queryMinutesSummary(QueryMinutesSummaryRequest request);

    /**
     * @param request the request parameters of QueryMinutesText  QueryMinutesTextRequest
     * @return QueryMinutesTextResponse
     */
    CompletableFuture<QueryMinutesTextResponse> queryMinutesText(QueryMinutesTextRequest request);

    /**
     * @param request the request parameters of QueryOrgHonors  QueryOrgHonorsRequest
     * @return QueryOrgHonorsResponse
     */
    CompletableFuture<QueryOrgHonorsResponse> queryOrgHonors(QueryOrgHonorsRequest request);

    /**
     * @param request the request parameters of QueryOrgTodoTasks  QueryOrgTodoTasksRequest
     * @return QueryOrgTodoTasksResponse
     */
    CompletableFuture<QueryOrgTodoTasksResponse> queryOrgTodoTasks(QueryOrgTodoTasksRequest request);

    /**
     * @param request the request parameters of QueryRecordMinutesUrl  QueryRecordMinutesUrlRequest
     * @return QueryRecordMinutesUrlResponse
     */
    CompletableFuture<QueryRecordMinutesUrlResponse> queryRecordMinutesUrl(QueryRecordMinutesUrlRequest request);

    /**
     * @param request the request parameters of QueryReportDetail  QueryReportDetailRequest
     * @return QueryReportDetailResponse
     */
    CompletableFuture<QueryReportDetailResponse> queryReportDetail(QueryReportDetailRequest request);

    /**
     * @param request the request parameters of QueryScheduleConference  QueryScheduleConferenceRequest
     * @return QueryScheduleConferenceResponse
     */
    CompletableFuture<QueryScheduleConferenceResponse> queryScheduleConference(QueryScheduleConferenceRequest request);

    /**
     * @param request the request parameters of QueryScheduleConferenceInfo  QueryScheduleConferenceInfoRequest
     * @return QueryScheduleConferenceInfoResponse
     */
    CompletableFuture<QueryScheduleConferenceInfoResponse> queryScheduleConferenceInfo(QueryScheduleConferenceInfoRequest request);

    /**
     * @param request the request parameters of QueryUserHonors  QueryUserHonorsRequest
     * @return QueryUserHonorsResponse
     */
    CompletableFuture<QueryUserHonorsResponse> queryUserHonors(QueryUserHonorsRequest request);

    /**
     * @param request the request parameters of RecallHonor  RecallHonorRequest
     * @return RecallHonorResponse
     */
    CompletableFuture<RecallHonorResponse> recallHonor(RecallHonorRequest request);

    /**
     * @param request the request parameters of ReceiverListReport  ReceiverListReportRequest
     * @return ReceiverListReportResponse
     */
    CompletableFuture<ReceiverListReportResponse> receiverListReport(ReceiverListReportRequest request);

    /**
     * @param request the request parameters of RedirectTask  RedirectTaskRequest
     * @return RedirectTaskResponse
     */
    CompletableFuture<RedirectTaskResponse> redirectTask(RedirectTaskRequest request);

    /**
     * @param request the request parameters of RemoveAttendee  RemoveAttendeeRequest
     * @return RemoveAttendeeResponse
     */
    CompletableFuture<RemoveAttendeeResponse> removeAttendee(RemoveAttendeeRequest request);

    /**
     * @param request the request parameters of RemoveMeetingRooms  RemoveMeetingRoomsRequest
     * @return RemoveMeetingRoomsResponse
     */
    CompletableFuture<RemoveMeetingRoomsResponse> removeMeetingRooms(RemoveMeetingRoomsRequest request);

    /**
     * @param request the request parameters of RespondEvent  RespondEventRequest
     * @return RespondEventResponse
     */
    CompletableFuture<RespondEventResponse> respondEvent(RespondEventRequest request);

    /**
     * @param request the request parameters of RetrieveRun  RetrieveRunRequest
     * @return RetrieveRunResponse
     */
    CompletableFuture<RetrieveRunResponse> retrieveRun(RetrieveRunRequest request);

    /**
     * @param request the request parameters of SaveContent  SaveContentRequest
     * @return SaveContentResponse
     */
    CompletableFuture<SaveContentResponse> saveContent(SaveContentRequest request);

    /**
     * @param request the request parameters of SaveFormData  SaveFormDataRequest
     * @return SaveFormDataResponse
     */
    CompletableFuture<SaveFormDataResponse> saveFormData(SaveFormDataRequest request);

    /**
     * @param request the request parameters of SaveFormRemark  SaveFormRemarkRequest
     * @return SaveFormRemarkResponse
     */
    CompletableFuture<SaveFormRemarkResponse> saveFormRemark(SaveFormRemarkRequest request);

    /**
     * @param request the request parameters of SearchEmployeeFieldValues  SearchEmployeeFieldValuesRequest
     * @return SearchEmployeeFieldValuesResponse
     */
    CompletableFuture<SearchEmployeeFieldValuesResponse> searchEmployeeFieldValues(SearchEmployeeFieldValuesRequest request);

    /**
     * @param request the request parameters of SearchFormDataIdList  SearchFormDataIdListRequest
     * @return SearchFormDataIdListResponse
     */
    CompletableFuture<SearchFormDataIdListResponse> searchFormDataIdList(SearchFormDataIdListRequest request);

    /**
     * @param request the request parameters of SearchFormDataSecondGeneration  SearchFormDataSecondGenerationRequest
     * @return SearchFormDataSecondGenerationResponse
     */
    CompletableFuture<SearchFormDataSecondGenerationResponse> searchFormDataSecondGeneration(SearchFormDataSecondGenerationRequest request);

    /**
     * @param request the request parameters of SearchFormDataSecondGenerationNoTableField  SearchFormDataSecondGenerationNoTableFieldRequest
     * @return SearchFormDataSecondGenerationNoTableFieldResponse
     */
    CompletableFuture<SearchFormDataSecondGenerationNoTableFieldResponse> searchFormDataSecondGenerationNoTableField(SearchFormDataSecondGenerationNoTableFieldRequest request);

    /**
     * @param request the request parameters of SearchFormDatas  SearchFormDatasRequest
     * @return SearchFormDatasResponse
     */
    CompletableFuture<SearchFormDatasResponse> searchFormDatas(SearchFormDatasRequest request);

    /**
     * @param request the request parameters of SearchInnerGroups  SearchInnerGroupsRequest
     * @return SearchInnerGroupsResponse
     */
    CompletableFuture<SearchInnerGroupsResponse> searchInnerGroups(SearchInnerGroupsRequest request);

    /**
     * @param request the request parameters of SendBanner  SendBannerRequest
     * @return SendBannerResponse
     */
    CompletableFuture<SendBannerResponse> sendBanner(SendBannerRequest request);

    /**
     * @param request the request parameters of SendPopup  SendPopupRequest
     * @return SendPopupResponse
     */
    CompletableFuture<SendPopupResponse> sendPopup(SendPopupRequest request);

    /**
     * @param request the request parameters of SendSearchShade  SendSearchShadeRequest
     * @return SendSearchShadeResponse
     */
    CompletableFuture<SendSearchShadeResponse> sendSearchShade(SendSearchShadeRequest request);

    /**
     * @param request the request parameters of SetColumnsVisibility  SetColumnsVisibilityRequest
     * @return SetColumnsVisibilityResponse
     */
    CompletableFuture<SetColumnsVisibilityResponse> setColumnsVisibility(SetColumnsVisibilityRequest request);

    /**
     * @param request the request parameters of SetConferenceHosts  SetConferenceHostsRequest
     * @return SetConferenceHostsResponse
     */
    CompletableFuture<SetConferenceHostsResponse> setConferenceHosts(SetConferenceHostsRequest request);

    /**
     * @param request the request parameters of SetRowsVisibility  SetRowsVisibilityRequest
     * @return SetRowsVisibilityResponse
     */
    CompletableFuture<SetRowsVisibilityResponse> setRowsVisibility(SetRowsVisibilityRequest request);

    /**
     * @param request the request parameters of SimpleListReport  SimpleListReportRequest
     * @return SimpleListReportResponse
     */
    CompletableFuture<SimpleListReportResponse> simpleListReport(SimpleListReportRequest request);

    /**
     * @param request the request parameters of StartCloudRecord  StartCloudRecordRequest
     * @return StartCloudRecordResponse
     */
    CompletableFuture<StartCloudRecordResponse> startCloudRecord(StartCloudRecordRequest request);

    /**
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * @param request the request parameters of StartMinutes  StartMinutesRequest
     * @return StartMinutesResponse
     */
    CompletableFuture<StartMinutesResponse> startMinutes(StartMinutesRequest request);

    /**
     * @param request the request parameters of StatisticsListByTypeReport  StatisticsListByTypeReportRequest
     * @return StatisticsListByTypeReportResponse
     */
    CompletableFuture<StatisticsListByTypeReportResponse> statisticsListByTypeReport(StatisticsListByTypeReportRequest request);

    /**
     * @param request the request parameters of StatisticsReport  StatisticsReportRequest
     * @return StatisticsReportResponse
     */
    CompletableFuture<StatisticsReportResponse> statisticsReport(StatisticsReportRequest request);

    /**
     * @param request the request parameters of StopCloudRecord  StopCloudRecordRequest
     * @return StopCloudRecordResponse
     */
    CompletableFuture<StopCloudRecordResponse> stopCloudRecord(StopCloudRecordRequest request);

    /**
     * @param request the request parameters of StopMinutes  StopMinutesRequest
     * @return StopMinutesResponse
     */
    CompletableFuture<StopMinutesResponse> stopMinutes(StopMinutesRequest request);

    /**
     * @param request the request parameters of SubscribeCalendar  SubscribeCalendarRequest
     * @return SubscribeCalendarResponse
     */
    CompletableFuture<SubscribeCalendarResponse> subscribeCalendar(SubscribeCalendarRequest request);

    /**
     * @param request the request parameters of SubscribeEvent  SubscribeEventRequest
     * @return SubscribeEventResponse
     */
    CompletableFuture<SubscribeEventResponse> subscribeEvent(SubscribeEventRequest request);

    /**
     * @param request the request parameters of SwitchMainOrg  SwitchMainOrgRequest
     * @return SwitchMainOrgResponse
     */
    CompletableFuture<SwitchMainOrgResponse> switchMainOrg(SwitchMainOrgRequest request);

    /**
     * @param request the request parameters of SyncDingType  SyncDingTypeRequest
     * @return SyncDingTypeResponse
     */
    CompletableFuture<SyncDingTypeResponse> syncDingType(SyncDingTypeRequest request);

    /**
     * @param request the request parameters of TerminateInstance  TerminateInstanceRequest
     * @return TerminateInstanceResponse
     */
    CompletableFuture<TerminateInstanceResponse> terminateInstance(TerminateInstanceRequest request);

    /**
     * @param request the request parameters of TransferTicket  TransferTicketRequest
     * @return TransferTicketResponse
     */
    CompletableFuture<TransferTicketResponse> transferTicket(TransferTicketRequest request);

    /**
     * @param request the request parameters of UnsubscribeCalendar  UnsubscribeCalendarRequest
     * @return UnsubscribeCalendarResponse
     */
    CompletableFuture<UnsubscribeCalendarResponse> unsubscribeCalendar(UnsubscribeCalendarRequest request);

    /**
     * @param request the request parameters of UnsubscribeEvent  UnsubscribeEventRequest
     * @return UnsubscribeEventResponse
     */
    CompletableFuture<UnsubscribeEventResponse> unsubscribeEvent(UnsubscribeEventRequest request);

    /**
     * @param request the request parameters of UpdateFormData  UpdateFormDataRequest
     * @return UpdateFormDataResponse
     */
    CompletableFuture<UpdateFormDataResponse> updateFormData(UpdateFormDataRequest request);

    /**
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * @param request the request parameters of UpdateLive  UpdateLiveRequest
     * @return UpdateLiveResponse
     */
    CompletableFuture<UpdateLiveResponse> updateLive(UpdateLiveRequest request);

    /**
     * @param request the request parameters of UpdateMeetingRoom  UpdateMeetingRoomRequest
     * @return UpdateMeetingRoomResponse
     */
    CompletableFuture<UpdateMeetingRoomResponse> updateMeetingRoom(UpdateMeetingRoomRequest request);

    /**
     * @param request the request parameters of UpdateMeetingRoomGroup  UpdateMeetingRoomGroupRequest
     * @return UpdateMeetingRoomGroupResponse
     */
    CompletableFuture<UpdateMeetingRoomGroupResponse> updateMeetingRoomGroup(UpdateMeetingRoomGroupRequest request);

    /**
     * @param request the request parameters of UpdateMultiDimTable  UpdateMultiDimTableRequest
     * @return UpdateMultiDimTableResponse
     */
    CompletableFuture<UpdateMultiDimTableResponse> updateMultiDimTable(UpdateMultiDimTableRequest request);

    /**
     * @param request the request parameters of UpdateMultiDimTableField  UpdateMultiDimTableFieldRequest
     * @return UpdateMultiDimTableFieldResponse
     */
    CompletableFuture<UpdateMultiDimTableFieldResponse> updateMultiDimTableField(UpdateMultiDimTableFieldRequest request);

    /**
     * @param request the request parameters of UpdateMultiDimTableRecords  UpdateMultiDimTableRecordsRequest
     * @return UpdateMultiDimTableRecordsResponse
     */
    CompletableFuture<UpdateMultiDimTableRecordsResponse> updateMultiDimTableRecords(UpdateMultiDimTableRecordsRequest request);

    /**
     * @param request the request parameters of UpdatePermission  UpdatePermissionRequest
     * @return UpdatePermissionResponse
     */
    CompletableFuture<UpdatePermissionResponse> updatePermission(UpdatePermissionRequest request);

    /**
     * @param request the request parameters of UpdateRange  UpdateRangeRequest
     * @return UpdateRangeResponse
     */
    CompletableFuture<UpdateRangeResponse> updateRange(UpdateRangeRequest request);

    /**
     * @param request the request parameters of UpdateScheduleConfSettings  UpdateScheduleConfSettingsRequest
     * @return UpdateScheduleConfSettingsResponse
     */
    CompletableFuture<UpdateScheduleConfSettingsResponse> updateScheduleConfSettings(UpdateScheduleConfSettingsRequest request);

    /**
     * @param request the request parameters of UpdateScheduleConference  UpdateScheduleConferenceRequest
     * @return UpdateScheduleConferenceResponse
     */
    CompletableFuture<UpdateScheduleConferenceResponse> updateScheduleConference(UpdateScheduleConferenceRequest request);

    /**
     * @param request the request parameters of UpdateStatus  UpdateStatusRequest
     * @return UpdateStatusResponse
     */
    CompletableFuture<UpdateStatusResponse> updateStatus(UpdateStatusRequest request);

    /**
     * @param request the request parameters of UpdateSubscribedCalendars  UpdateSubscribedCalendarsRequest
     * @return UpdateSubscribedCalendarsResponse
     */
    CompletableFuture<UpdateSubscribedCalendarsResponse> updateSubscribedCalendars(UpdateSubscribedCalendarsRequest request);

    /**
     * @param request the request parameters of UpdateTodoTask  UpdateTodoTaskRequest
     * @return UpdateTodoTaskResponse
     */
    CompletableFuture<UpdateTodoTaskResponse> updateTodoTask(UpdateTodoTaskRequest request);

    /**
     * @param request the request parameters of UpdateTodoTaskExecutorStatus  UpdateTodoTaskExecutorStatusRequest
     * @return UpdateTodoTaskExecutorStatusResponse
     */
    CompletableFuture<UpdateTodoTaskExecutorStatusResponse> updateTodoTaskExecutorStatus(UpdateTodoTaskExecutorStatusRequest request);

    /**
     * @param request the request parameters of UpdateUserAvatar  UpdateUserAvatarRequest
     * @return UpdateUserAvatarResponse
     */
    CompletableFuture<UpdateUserAvatarResponse> updateUserAvatar(UpdateUserAvatarRequest request);

    /**
     * @param request the request parameters of UpdateVideoConferenceSetting  UpdateVideoConferenceSettingRequest
     * @return UpdateVideoConferenceSettingResponse
     */
    CompletableFuture<UpdateVideoConferenceSettingResponse> updateVideoConferenceSetting(UpdateVideoConferenceSettingRequest request);

    /**
     * @param request the request parameters of UpdateWorkspaceDocMembers  UpdateWorkspaceDocMembersRequest
     * @return UpdateWorkspaceDocMembersResponse
     */
    CompletableFuture<UpdateWorkspaceDocMembersResponse> updateWorkspaceDocMembers(UpdateWorkspaceDocMembersRequest request);

    /**
     * @param request the request parameters of UpdateWorkspaceMembers  UpdateWorkspaceMembersRequest
     * @return UpdateWorkspaceMembersResponse
     */
    CompletableFuture<UpdateWorkspaceMembersResponse> updateWorkspaceMembers(UpdateWorkspaceMembersRequest request);

    /**
     * @param request the request parameters of UploadMedia  UploadMediaRequest
     * @return UploadMediaResponse
     */
    CompletableFuture<UploadMediaResponse> uploadMedia(UploadMediaRequest request);

    /**
     * @param request the request parameters of WearOrgHonor  WearOrgHonorRequest
     * @return WearOrgHonorResponse
     */
    CompletableFuture<WearOrgHonorResponse> wearOrgHonor(WearOrgHonorRequest request);

}
