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

    CompletableFuture<AddAttendeeResponse> addAttendee(AddAttendeeRequest request);

    CompletableFuture<AddMeetingRoomsResponse> addMeetingRooms(AddMeetingRoomsRequest request);

    CompletableFuture<AddScenegroupMemberResponse> addScenegroupMember(AddScenegroupMemberRequest request);

    CompletableFuture<AddWorkspaceResponse> addWorkspace(AddWorkspaceRequest request);

    CompletableFuture<AddWorkspaceDocMembersResponse> addWorkspaceDocMembers(AddWorkspaceDocMembersRequest request);

    CompletableFuture<AddWorkspaceMembersResponse> addWorkspaceMembers(AddWorkspaceMembersRequest request);

    CompletableFuture<BatchGetFormDataByIdListResponse> batchGetFormDataByIdList(BatchGetFormDataByIdListRequest request);

    CompletableFuture<BatchRemovalByFormInstanceIdListResponse> batchRemovalByFormInstanceIdList(BatchRemovalByFormInstanceIdListRequest request);

    CompletableFuture<BatchSaveFormDataResponse> batchSaveFormData(BatchSaveFormDataRequest request);

    CompletableFuture<BatchUpdateFormDataByInstanceIdResponse> batchUpdateFormDataByInstanceId(BatchUpdateFormDataByInstanceIdRequest request);

    CompletableFuture<BatchUpdateFormDataByInstanceMapResponse> batchUpdateFormDataByInstanceMap(BatchUpdateFormDataByInstanceMapRequest request);

    CompletableFuture<CancelScheduleConferenceResponse> cancelScheduleConference(CancelScheduleConferenceRequest request);

    CompletableFuture<CheckUserIsGroupMemberResponse> checkUserIsGroupMember(CheckUserIsGroupMemberRequest request);

    CompletableFuture<ClearResponse> clear(ClearRequest request);

    CompletableFuture<ClearDataResponse> clearData(ClearDataRequest request);

    CompletableFuture<CommentListReportResponse> commentListReport(CommentListReportRequest request);

    CompletableFuture<CreateDeliveryPlanResponse> createDeliveryPlan(CreateDeliveryPlanRequest request);

    CompletableFuture<CreateEventResponse> createEvent(CreateEventRequest request);

    CompletableFuture<CreateLiveResponse> createLive(CreateLiveRequest request);

    CompletableFuture<CreateMeetingRoomResponse> createMeetingRoom(CreateMeetingRoomRequest request);

    CompletableFuture<CreateMeetingRoomGroupResponse> createMeetingRoomGroup(CreateMeetingRoomGroupRequest request);

    CompletableFuture<CreateOrUpdateFormDataResponse> createOrUpdateFormData(CreateOrUpdateFormDataRequest request);

    CompletableFuture<CreateOrgHonorTemplateResponse> createOrgHonorTemplate(CreateOrgHonorTemplateRequest request);

    CompletableFuture<CreatePersonalTodoTaskResponse> createPersonalTodoTask(CreatePersonalTodoTaskRequest request);

    CompletableFuture<CreateReportResponse> createReport(CreateReportRequest request);

    CompletableFuture<CreateScenegroupResponse> createScenegroup(CreateScenegroupRequest request);

    CompletableFuture<CreateScheduleConferenceResponse> createScheduleConference(CreateScheduleConferenceRequest request);

    CompletableFuture<CreateSearchDomeResponse> createSearchDome(CreateSearchDomeRequest request);

    CompletableFuture<CreateSearchKeywordResponse> createSearchKeyword(CreateSearchKeywordRequest request);

    CompletableFuture<CreateSheetResponse> createSheet(CreateSheetRequest request);

    CompletableFuture<CreateSubscribedCalendarResponse> createSubscribedCalendar(CreateSubscribedCalendarRequest request);

    CompletableFuture<CreateTodoTaskResponse> createTodoTask(CreateTodoTaskRequest request);

    CompletableFuture<CreateVideoConferenceResponse> createVideoConference(CreateVideoConferenceRequest request);

    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    CompletableFuture<CreateWorkspaceDocResponse> createWorkspaceDoc(CreateWorkspaceDocRequest request);

    CompletableFuture<DeleteColumnsResponse> deleteColumns(DeleteColumnsRequest request);

    CompletableFuture<DeleteEventResponse> deleteEvent(DeleteEventRequest request);

    CompletableFuture<DeleteFormDataResponse> deleteFormData(DeleteFormDataRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteLiveResponse> deleteLive(DeleteLiveRequest request);

    CompletableFuture<DeleteMeetingRoomResponse> deleteMeetingRoom(DeleteMeetingRoomRequest request);

    CompletableFuture<DeleteMeetingRoomGroupResponse> deleteMeetingRoomGroup(DeleteMeetingRoomGroupRequest request);

    CompletableFuture<DeleteRowsResponse> deleteRows(DeleteRowsRequest request);

    CompletableFuture<DeleteScenegroupMemberResponse> deleteScenegroupMember(DeleteScenegroupMemberRequest request);

    CompletableFuture<DeleteSheetResponse> deleteSheet(DeleteSheetRequest request);

    CompletableFuture<DeleteSubscribedCalendarResponse> deleteSubscribedCalendar(DeleteSubscribedCalendarRequest request);

    CompletableFuture<DeleteTodoTaskResponse> deleteTodoTask(DeleteTodoTaskRequest request);

    CompletableFuture<DeleteWorkspaceDocMembersResponse> deleteWorkspaceDocMembers(DeleteWorkspaceDocMembersRequest request);

    CompletableFuture<DeleteWorkspaceMembersResponse> deleteWorkspaceMembers(DeleteWorkspaceMembersRequest request);

    CompletableFuture<ExecuteBatchTaskResponse> executeBatchTask(ExecuteBatchTaskRequest request);

    CompletableFuture<ExecutePlatformTaskResponse> executePlatformTask(ExecutePlatformTaskRequest request);

    CompletableFuture<ExecuteTaskResponse> executeTask(ExecuteTaskRequest request);

    CompletableFuture<ExpandGroupCapacityResponse> expandGroupCapacity(ExpandGroupCapacityRequest request);

    CompletableFuture<GetActivityListResponse> getActivityList(GetActivityListRequest request);

    CompletableFuture<GetAllSheetsResponse> getAllSheets(GetAllSheetsRequest request);

    CompletableFuture<GetConversaionSpaceResponse> getConversaionSpace(GetConversaionSpaceRequest request);

    CompletableFuture<GetCorpAccomplishmentTasksResponse> getCorpAccomplishmentTasks(GetCorpAccomplishmentTasksRequest request);

    CompletableFuture<GetCorpTasksResponse> getCorpTasks(GetCorpTasksRequest request);

    CompletableFuture<GetDocContentResponse> getDocContent(GetDocContentRequest request);

    CompletableFuture<GetDocContentTakIdResponse> getDocContentTakId(GetDocContentTakIdRequest request);

    CompletableFuture<GetEventResponse> getEvent(GetEventRequest request);

    CompletableFuture<GetFieldDefByUuidResponse> getFieldDefByUuid(GetFieldDefByUuidRequest request);

    CompletableFuture<GetFileDownloadInfoResponse> getFileDownloadInfo(GetFileDownloadInfoRequest request);

    CompletableFuture<GetFormComponentDefinitionListResponse> getFormComponentDefinitionList(GetFormComponentDefinitionListRequest request);

    CompletableFuture<GetFormDataByIDResponse> getFormDataByID(GetFormDataByIDRequest request);

    CompletableFuture<GetFormListInAppResponse> getFormListInApp(GetFormListInAppRequest request);

    CompletableFuture<GetInnerGroupMembersResponse> getInnerGroupMembers(GetInnerGroupMembersRequest request);

    CompletableFuture<GetInstanceByIdResponse> getInstanceById(GetInstanceByIdRequest request);

    CompletableFuture<GetInstanceIdListResponse> getInstanceIdList(GetInstanceIdListRequest request);

    CompletableFuture<GetInstancesResponse> getInstances(GetInstancesRequest request);

    CompletableFuture<GetInstancesByIdListResponse> getInstancesByIdList(GetInstancesByIdListRequest request);

    CompletableFuture<GetLiveReplayUrlResponse> getLiveReplayUrl(GetLiveReplayUrlRequest request);

    CompletableFuture<GetMeCorpSubmissionResponse> getMeCorpSubmission(GetMeCorpSubmissionRequest request);

    CompletableFuture<GetMeetingRoomsScheduleResponse> getMeetingRoomsSchedule(GetMeetingRoomsScheduleRequest request);

    CompletableFuture<GetMineWorkspaceResponse> getMineWorkspace(GetMineWorkspaceRequest request);

    CompletableFuture<GetNewestInnerGroupsResponse> getNewestInnerGroups(GetNewestInnerGroupsRequest request);

    CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request);

    CompletableFuture<GetNodeByUrlResponse> getNodeByUrl(GetNodeByUrlRequest request);

    CompletableFuture<GetNodesResponse> getNodes(GetNodesRequest request);

    CompletableFuture<GetNotifyMeResponse> getNotifyMe(GetNotifyMeRequest request);

    CompletableFuture<GetOpenUrlResponse> getOpenUrl(GetOpenUrlRequest request);

    CompletableFuture<GetOperationRecordsResponse> getOperationRecords(GetOperationRecordsRequest request);

    CompletableFuture<GetProcessDefinitionResponse> getProcessDefinition(GetProcessDefinitionRequest request);

    CompletableFuture<GetRangeResponse> getRange(GetRangeRequest request);

    CompletableFuture<GetRelatedWorkspacesResponse> getRelatedWorkspaces(GetRelatedWorkspacesRequest request);

    CompletableFuture<GetReportTemplateByNameResponse> getReportTemplateByName(GetReportTemplateByNameRequest request);

    CompletableFuture<GetReportUnReadCountResponse> getReportUnReadCount(GetReportUnReadCountRequest request);

    CompletableFuture<GetRunningTasksResponse> getRunningTasks(GetRunningTasksRequest request);

    CompletableFuture<GetSheetResponse> getSheet(GetSheetRequest request);

    CompletableFuture<GetSpaceDirectoriesResponse> getSpaceDirectories(GetSpaceDirectoriesRequest request);

    CompletableFuture<GetSubscribedCalendarResponse> getSubscribedCalendar(GetSubscribedCalendarRequest request);

    CompletableFuture<GetTaskCopiesResponse> getTaskCopies(GetTaskCopiesRequest request);

    CompletableFuture<GetTemplateListByUserIdResponse> getTemplateListByUserId(GetTemplateListByUserIdRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserLatestPlanResponse> getUserLatestPlan(GetUserLatestPlanRequest request);

    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    CompletableFuture<GetWorkspacesResponse> getWorkspaces(GetWorkspacesRequest request);

    CompletableFuture<GrantHonorResponse> grantHonor(GrantHonorRequest request);

    CompletableFuture<InsertColumnsBeforeResponse> insertColumnsBefore(InsertColumnsBeforeRequest request);

    CompletableFuture<InsertRowsBeforeResponse> insertRowsBefore(InsertRowsBeforeRequest request);

    CompletableFuture<InviteUsersResponse> inviteUsers(InviteUsersRequest request);

    CompletableFuture<ListApplicationResponse> listApplication(ListApplicationRequest request);

    CompletableFuture<ListCalendarsResponse> listCalendars(ListCalendarsRequest request);

    CompletableFuture<ListDentriesResponse> listDentries(ListDentriesRequest request);

    CompletableFuture<ListEventsResponse> listEvents(ListEventsRequest request);

    CompletableFuture<ListEventsViewResponse> listEventsView(ListEventsViewRequest request);

    CompletableFuture<ListFormRemarksResponse> listFormRemarks(ListFormRemarksRequest request);

    CompletableFuture<ListNavigationByFormTypeResponse> listNavigationByFormType(ListNavigationByFormTypeRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListReportResponse> listReport(ListReportRequest request);

    CompletableFuture<ListTableDataByFormInstanceIdTableIdResponse> listTableDataByFormInstanceIdTableId(ListTableDataByFormInstanceIdTableIdRequest request);

    CompletableFuture<ListTeamsResponse> listTeams(ListTeamsRequest request);

    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    CompletableFuture<PatchEventResponse> patchEvent(PatchEventRequest request);

    CompletableFuture<QueryCloudRecordTextResponse> queryCloudRecordText(QueryCloudRecordTextRequest request);

    CompletableFuture<QueryCloudRecordVideoResponse> queryCloudRecordVideo(QueryCloudRecordVideoRequest request);

    CompletableFuture<QueryCloudRecordVideoPlayInfoResponse> queryCloudRecordVideoPlayInfo(QueryCloudRecordVideoPlayInfoRequest request);

    CompletableFuture<QueryConferenceInfoResponse> queryConferenceInfo(QueryConferenceInfoRequest request);

    CompletableFuture<QueryConferenceMembersResponse> queryConferenceMembers(QueryConferenceMembersRequest request);

    CompletableFuture<QueryDentryResponse> queryDentry(QueryDentryRequest request);

    CompletableFuture<QueryLiveInfoResponse> queryLiveInfo(QueryLiveInfoRequest request);

    CompletableFuture<QueryLiveWatchDetailResponse> queryLiveWatchDetail(QueryLiveWatchDetailRequest request);

    CompletableFuture<QueryLiveWatchUserListResponse> queryLiveWatchUserList(QueryLiveWatchUserListRequest request);

    CompletableFuture<QueryMeetingRoomResponse> queryMeetingRoom(QueryMeetingRoomRequest request);

    CompletableFuture<QueryMeetingRoomGroupResponse> queryMeetingRoomGroup(QueryMeetingRoomGroupRequest request);

    CompletableFuture<QueryMeetingRoomGroupListResponse> queryMeetingRoomGroupList(QueryMeetingRoomGroupListRequest request);

    CompletableFuture<QueryMeetingRoomListResponse> queryMeetingRoomList(QueryMeetingRoomListRequest request);

    CompletableFuture<QueryOrgHonorsResponse> queryOrgHonors(QueryOrgHonorsRequest request);

    CompletableFuture<QueryOrgTodoTasksResponse> queryOrgTodoTasks(QueryOrgTodoTasksRequest request);

    CompletableFuture<QueryScheduleConferenceResponse> queryScheduleConference(QueryScheduleConferenceRequest request);

    CompletableFuture<QueryUserHonorsResponse> queryUserHonors(QueryUserHonorsRequest request);

    CompletableFuture<RecallHonorResponse> recallHonor(RecallHonorRequest request);

    CompletableFuture<ReceiverListReportResponse> receiverListReport(ReceiverListReportRequest request);

    CompletableFuture<RedirectTaskResponse> redirectTask(RedirectTaskRequest request);

    CompletableFuture<RemoveAttendeeResponse> removeAttendee(RemoveAttendeeRequest request);

    CompletableFuture<RemoveMeetingRoomsResponse> removeMeetingRooms(RemoveMeetingRoomsRequest request);

    CompletableFuture<SaveContentResponse> saveContent(SaveContentRequest request);

    CompletableFuture<SaveFormDataResponse> saveFormData(SaveFormDataRequest request);

    CompletableFuture<SaveFormRemarkResponse> saveFormRemark(SaveFormRemarkRequest request);

    CompletableFuture<SearchEmployeeFieldValuesResponse> searchEmployeeFieldValues(SearchEmployeeFieldValuesRequest request);

    CompletableFuture<SearchFormDataIdListResponse> searchFormDataIdList(SearchFormDataIdListRequest request);

    CompletableFuture<SearchFormDataSecondGenerationResponse> searchFormDataSecondGeneration(SearchFormDataSecondGenerationRequest request);

    CompletableFuture<SearchFormDataSecondGenerationNoTableFieldResponse> searchFormDataSecondGenerationNoTableField(SearchFormDataSecondGenerationNoTableFieldRequest request);

    CompletableFuture<SearchFormDatasResponse> searchFormDatas(SearchFormDatasRequest request);

    CompletableFuture<SearchInnerGroupsResponse> searchInnerGroups(SearchInnerGroupsRequest request);

    CompletableFuture<SendBannerResponse> sendBanner(SendBannerRequest request);

    CompletableFuture<SendPopupResponse> sendPopup(SendPopupRequest request);

    CompletableFuture<SendSearchShadeResponse> sendSearchShade(SendSearchShadeRequest request);

    CompletableFuture<SetColumnsVisibilityResponse> setColumnsVisibility(SetColumnsVisibilityRequest request);

    CompletableFuture<SetRowsVisibilityResponse> setRowsVisibility(SetRowsVisibilityRequest request);

    CompletableFuture<SimpleListReportResponse> simpleListReport(SimpleListReportRequest request);

    CompletableFuture<StartCloudRecordResponse> startCloudRecord(StartCloudRecordRequest request);

    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<StatisticsListByTypeReportResponse> statisticsListByTypeReport(StatisticsListByTypeReportRequest request);

    CompletableFuture<StatisticsReportResponse> statisticsReport(StatisticsReportRequest request);

    CompletableFuture<StopCloudRecordResponse> stopCloudRecord(StopCloudRecordRequest request);

    CompletableFuture<SubscribeCalendarResponse> subscribeCalendar(SubscribeCalendarRequest request);

    CompletableFuture<SyncDingTypeResponse> syncDingType(SyncDingTypeRequest request);

    CompletableFuture<TerminateInstanceResponse> terminateInstance(TerminateInstanceRequest request);

    CompletableFuture<UnsubscribeCalendarResponse> unsubscribeCalendar(UnsubscribeCalendarRequest request);

    CompletableFuture<UpdateFormDataResponse> updateFormData(UpdateFormDataRequest request);

    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    CompletableFuture<UpdateLiveResponse> updateLive(UpdateLiveRequest request);

    CompletableFuture<UpdateMeetingRoomResponse> updateMeetingRoom(UpdateMeetingRoomRequest request);

    CompletableFuture<UpdateMeetingRoomGroupResponse> updateMeetingRoomGroup(UpdateMeetingRoomGroupRequest request);

    CompletableFuture<UpdateRangeResponse> updateRange(UpdateRangeRequest request);

    CompletableFuture<UpdateScheduleConfSettingsResponse> updateScheduleConfSettings(UpdateScheduleConfSettingsRequest request);

    CompletableFuture<UpdateScheduleConferenceResponse> updateScheduleConference(UpdateScheduleConferenceRequest request);

    CompletableFuture<UpdateStatusResponse> updateStatus(UpdateStatusRequest request);

    CompletableFuture<UpdateSubscribedCalendarsResponse> updateSubscribedCalendars(UpdateSubscribedCalendarsRequest request);

    CompletableFuture<UpdateTodoTaskResponse> updateTodoTask(UpdateTodoTaskRequest request);

    CompletableFuture<UpdateTodoTaskExecutorStatusResponse> updateTodoTaskExecutorStatus(UpdateTodoTaskExecutorStatusRequest request);

    CompletableFuture<UpdateUserAvatarResponse> updateUserAvatar(UpdateUserAvatarRequest request);

    CompletableFuture<UpdateWorkspaceDocMembersResponse> updateWorkspaceDocMembers(UpdateWorkspaceDocMembersRequest request);

    CompletableFuture<UpdateWorkspaceMembersResponse> updateWorkspaceMembers(UpdateWorkspaceMembersRequest request);

    CompletableFuture<UploadMediaResponse> uploadMedia(UploadMediaRequest request);

    CompletableFuture<WearOrgHonorResponse> wearOrgHonor(WearOrgHonorRequest request);

}
