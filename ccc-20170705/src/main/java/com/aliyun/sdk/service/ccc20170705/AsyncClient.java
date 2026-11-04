// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ccc20170705.models.*;
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
     * @param request the request parameters of AddAgentDevice  AddAgentDeviceRequest
     * @return AddAgentDeviceResponse
     */
    CompletableFuture<AddAgentDeviceResponse> addAgentDevice(AddAgentDeviceRequest request);

    /**
     * @param request the request parameters of AddBulkPhoneNumbers  AddBulkPhoneNumbersRequest
     * @return AddBulkPhoneNumbersResponse
     */
    CompletableFuture<AddBulkPhoneNumbersResponse> addBulkPhoneNumbers(AddBulkPhoneNumbersRequest request);

    /**
     * @param request the request parameters of AddPhoneNumber  AddPhoneNumberRequest
     * @return AddPhoneNumberResponse
     */
    CompletableFuture<AddPhoneNumberResponse> addPhoneNumber(AddPhoneNumberRequest request);

    /**
     * @param request the request parameters of AddPhoneTags  AddPhoneTagsRequest
     * @return AddPhoneTagsResponse
     */
    CompletableFuture<AddPhoneTagsResponse> addPhoneTags(AddPhoneTagsRequest request);

    /**
     * @param request the request parameters of AssignUsers  AssignUsersRequest
     * @return AssignUsersResponse
     */
    CompletableFuture<AssignUsersResponse> assignUsers(AssignUsersRequest request);

    /**
     * @param request the request parameters of CallOnlinePrivacyNumber  CallOnlinePrivacyNumberRequest
     * @return CallOnlinePrivacyNumberResponse
     */
    CompletableFuture<CallOnlinePrivacyNumberResponse> callOnlinePrivacyNumber(CallOnlinePrivacyNumberRequest request);

    /**
     * @param request the request parameters of CheckNumberAvaliable  CheckNumberAvaliableRequest
     * @return CheckNumberAvaliableResponse
     */
    CompletableFuture<CheckNumberAvaliableResponse> checkNumberAvaliable(CheckNumberAvaliableRequest request);

    /**
     * @param request the request parameters of CommitContactFlowVersionModification  CommitContactFlowVersionModificationRequest
     * @return CommitContactFlowVersionModificationResponse
     */
    CompletableFuture<CommitContactFlowVersionModificationResponse> commitContactFlowVersionModification(CommitContactFlowVersionModificationRequest request);

    /**
     * @param request the request parameters of CreateContactFlow  CreateContactFlowRequest
     * @return CreateContactFlowResponse
     */
    CompletableFuture<CreateContactFlowResponse> createContactFlow(CreateContactFlowRequest request);

    /**
     * @param request the request parameters of CreateFault  CreateFaultRequest
     * @return CreateFaultResponse
     */
    CompletableFuture<CreateFaultResponse> createFault(CreateFaultRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateMedia  CreateMediaRequest
     * @return CreateMediaResponse
     */
    CompletableFuture<CreateMediaResponse> createMedia(CreateMediaRequest request);

    /**
     * @param request the request parameters of CreateSkillGroup  CreateSkillGroupRequest
     * @return CreateSkillGroupResponse
     */
    CompletableFuture<CreateSkillGroupResponse> createSkillGroup(CreateSkillGroupRequest request);

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * @param request the request parameters of CreateVoiceAppraise  CreateVoiceAppraiseRequest
     * @return CreateVoiceAppraiseResponse
     */
    CompletableFuture<CreateVoiceAppraiseResponse> createVoiceAppraise(CreateVoiceAppraiseRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteMedia  DeleteMediaRequest
     * @return DeleteMediaResponse
     */
    CompletableFuture<DeleteMediaResponse> deleteMedia(DeleteMediaRequest request);

    /**
     * @param request the request parameters of DeletePhoneTags  DeletePhoneTagsRequest
     * @return DeletePhoneTagsResponse
     */
    CompletableFuture<DeletePhoneTagsResponse> deletePhoneTags(DeletePhoneTagsRequest request);

    /**
     * @param request the request parameters of DeleteSkillGroup  DeleteSkillGroupRequest
     * @return DeleteSkillGroupResponse
     */
    CompletableFuture<DeleteSkillGroupResponse> deleteSkillGroup(DeleteSkillGroupRequest request);

    /**
     * @param request the request parameters of DialEx  DialExRequest
     * @return DialExResponse
     */
    CompletableFuture<DialExResponse> dialEx(DialExRequest request);

    /**
     * @param request the request parameters of DisableTrunkProviders  DisableTrunkProvidersRequest
     * @return DisableTrunkProvidersResponse
     */
    CompletableFuture<DisableTrunkProvidersResponse> disableTrunkProviders(DisableTrunkProvidersRequest request);

    /**
     * @param request the request parameters of DownloadAllTypeRecording  DownloadAllTypeRecordingRequest
     * @return DownloadAllTypeRecordingResponse
     */
    CompletableFuture<DownloadAllTypeRecordingResponse> downloadAllTypeRecording(DownloadAllTypeRecordingRequest request);

    /**
     * @param request the request parameters of DownloadRecording  DownloadRecordingRequest
     * @return DownloadRecordingResponse
     */
    CompletableFuture<DownloadRecordingResponse> downloadRecording(DownloadRecordingRequest request);

    /**
     * @param request the request parameters of FindUsers  FindUsersRequest
     * @return FindUsersResponse
     */
    CompletableFuture<FindUsersResponse> findUsers(FindUsersRequest request);

    /**
     * @param request the request parameters of GenerateAgentStatisticReport  GenerateAgentStatisticReportRequest
     * @return GenerateAgentStatisticReportResponse
     */
    CompletableFuture<GenerateAgentStatisticReportResponse> generateAgentStatisticReport(GenerateAgentStatisticReportRequest request);

    /**
     * @param request the request parameters of GetAgentData  GetAgentDataRequest
     * @return GetAgentDataResponse
     */
    CompletableFuture<GetAgentDataResponse> getAgentData(GetAgentDataRequest request);

    /**
     * @param request the request parameters of GetCallMeasureSummaryReport  GetCallMeasureSummaryReportRequest
     * @return GetCallMeasureSummaryReportResponse
     */
    CompletableFuture<GetCallMeasureSummaryReportResponse> getCallMeasureSummaryReport(GetCallMeasureSummaryReportRequest request);

    /**
     * @param request the request parameters of GetConfig  GetConfigRequest
     * @return GetConfigResponse
     */
    CompletableFuture<GetConfigResponse> getConfig(GetConfigRequest request);

    /**
     * @param request the request parameters of GetConversationDetailByContactId  GetConversationDetailByContactIdRequest
     * @return GetConversationDetailByContactIdResponse
     */
    CompletableFuture<GetConversationDetailByContactIdResponse> getConversationDetailByContactId(GetConversationDetailByContactIdRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetInstanceState  GetInstanceStateRequest
     * @return GetInstanceStateResponse
     */
    CompletableFuture<GetInstanceStateResponse> getInstanceState(GetInstanceStateRequest request);

    /**
     * @param request the request parameters of GetInstanceSummaryReport  GetInstanceSummaryReportRequest
     * @return GetInstanceSummaryReportResponse
     */
    CompletableFuture<GetInstanceSummaryReportResponse> getInstanceSummaryReport(GetInstanceSummaryReportRequest request);

    /**
     * @param request the request parameters of GetInstanceSummaryReportByInterval  GetInstanceSummaryReportByIntervalRequest
     * @return GetInstanceSummaryReportByIntervalResponse
     */
    CompletableFuture<GetInstanceSummaryReportByIntervalResponse> getInstanceSummaryReportByInterval(GetInstanceSummaryReportByIntervalRequest request);

    /**
     * @param request the request parameters of GetInstanceSummaryReportSinceMidnight  GetInstanceSummaryReportSinceMidnightRequest
     * @return GetInstanceSummaryReportSinceMidnightResponse
     */
    CompletableFuture<GetInstanceSummaryReportSinceMidnightResponse> getInstanceSummaryReportSinceMidnight(GetInstanceSummaryReportSinceMidnightRequest request);

    /**
     * @param request the request parameters of GetNumberRegionInfo  GetNumberRegionInfoRequest
     * @return GetNumberRegionInfoResponse
     */
    CompletableFuture<GetNumberRegionInfoResponse> getNumberRegionInfo(GetNumberRegionInfoRequest request);

    /**
     * @param request the request parameters of GetRecordOssUploadParam  GetRecordOssUploadParamRequest
     * @return GetRecordOssUploadParamResponse
     */
    CompletableFuture<GetRecordOssUploadParamResponse> getRecordOssUploadParam(GetRecordOssUploadParamRequest request);

    /**
     * @param request the request parameters of GetRoutePoint  GetRoutePointRequest
     * @return GetRoutePointResponse
     */
    CompletableFuture<GetRoutePointResponse> getRoutePoint(GetRoutePointRequest request);

    /**
     * @param request the request parameters of GetServiceExtensions  GetServiceExtensionsRequest
     * @return GetServiceExtensionsResponse
     */
    CompletableFuture<GetServiceExtensionsResponse> getServiceExtensions(GetServiceExtensionsRequest request);

    /**
     * @param request the request parameters of GetSmsConfig  GetSmsConfigRequest
     * @return GetSmsConfigResponse
     */
    CompletableFuture<GetSmsConfigResponse> getSmsConfig(GetSmsConfigRequest request);

    /**
     * @param request the request parameters of GetTURNCredentials  GetTURNCredentialsRequest
     * @return GetTURNCredentialsResponse
     */
    CompletableFuture<GetTURNCredentialsResponse> getTURNCredentials(GetTURNCredentialsRequest request);

    /**
     * @param request the request parameters of GetTURNServerList  GetTURNServerListRequest
     * @return GetTURNServerListResponse
     */
    CompletableFuture<GetTURNServerListResponse> getTURNServerList(GetTURNServerListRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of GetUserByExtension  GetUserByExtensionRequest
     * @return GetUserByExtensionResponse
     */
    CompletableFuture<GetUserByExtensionResponse> getUserByExtension(GetUserByExtensionRequest request);

    /**
     * @param request the request parameters of LaunchAppraise  LaunchAppraiseRequest
     * @return LaunchAppraiseResponse
     */
    CompletableFuture<LaunchAppraiseResponse> launchAppraise(LaunchAppraiseRequest request);

    /**
     * @param request the request parameters of LaunchShortMessageAppraise  LaunchShortMessageAppraiseRequest
     * @return LaunchShortMessageAppraiseResponse
     */
    CompletableFuture<LaunchShortMessageAppraiseResponse> launchShortMessageAppraise(LaunchShortMessageAppraiseRequest request);

    /**
     * @param request the request parameters of ListAgentDevices  ListAgentDevicesRequest
     * @return ListAgentDevicesResponse
     */
    CompletableFuture<ListAgentDevicesResponse> listAgentDevices(ListAgentDevicesRequest request);

    /**
     * @param request the request parameters of ListAgentEvents  ListAgentEventsRequest
     * @return ListAgentEventsResponse
     */
    CompletableFuture<ListAgentEventsResponse> listAgentEvents(ListAgentEventsRequest request);

    /**
     * @param request the request parameters of ListAgentStateLogs  ListAgentStateLogsRequest
     * @return ListAgentStateLogsResponse
     */
    CompletableFuture<ListAgentStateLogsResponse> listAgentStateLogs(ListAgentStateLogsRequest request);

    /**
     * @param request the request parameters of ListAgentStates  ListAgentStatesRequest
     * @return ListAgentStatesResponse
     */
    CompletableFuture<ListAgentStatesResponse> listAgentStates(ListAgentStatesRequest request);

    /**
     * @param request the request parameters of ListAgentSummaryReports  ListAgentSummaryReportsRequest
     * @return ListAgentSummaryReportsResponse
     */
    CompletableFuture<ListAgentSummaryReportsResponse> listAgentSummaryReports(ListAgentSummaryReportsRequest request);

    /**
     * @param request the request parameters of ListAgentSummaryReportsByInterval  ListAgentSummaryReportsByIntervalRequest
     * @return ListAgentSummaryReportsByIntervalResponse
     */
    CompletableFuture<ListAgentSummaryReportsByIntervalResponse> listAgentSummaryReportsByInterval(ListAgentSummaryReportsByIntervalRequest request);

    /**
     * @param request the request parameters of ListAgentSummaryReportsSinceMidnight  ListAgentSummaryReportsSinceMidnightRequest
     * @return ListAgentSummaryReportsSinceMidnightResponse
     */
    CompletableFuture<ListAgentSummaryReportsSinceMidnightResponse> listAgentSummaryReportsSinceMidnight(ListAgentSummaryReportsSinceMidnightRequest request);

    /**
     * @param request the request parameters of ListCallDetailRecords  ListCallDetailRecordsRequest
     * @return ListCallDetailRecordsResponse
     */
    CompletableFuture<ListCallDetailRecordsResponse> listCallDetailRecords(ListCallDetailRecordsRequest request);

    /**
     * @param request the request parameters of ListCallEventDetailByContactId  ListCallEventDetailByContactIdRequest
     * @return ListCallEventDetailByContactIdResponse
     */
    CompletableFuture<ListCallEventDetailByContactIdResponse> listCallEventDetailByContactId(ListCallEventDetailByContactIdRequest request);

    /**
     * @param request the request parameters of ListCallMeasureSummaryReports  ListCallMeasureSummaryReportsRequest
     * @return ListCallMeasureSummaryReportsResponse
     */
    CompletableFuture<ListCallMeasureSummaryReportsResponse> listCallMeasureSummaryReports(ListCallMeasureSummaryReportsRequest request);

    /**
     * @param request the request parameters of ListConfig  ListConfigRequest
     * @return ListConfigResponse
     */
    CompletableFuture<ListConfigResponse> listConfig(ListConfigRequest request);

    /**
     * @param request the request parameters of ListContactFlows  ListContactFlowsRequest
     * @return ListContactFlowsResponse
     */
    CompletableFuture<ListContactFlowsResponse> listContactFlows(ListContactFlowsRequest request);

    /**
     * @param request the request parameters of ListInstancesOfUser  ListInstancesOfUserRequest
     * @return ListInstancesOfUserResponse
     */
    CompletableFuture<ListInstancesOfUserResponse> listInstancesOfUser(ListInstancesOfUserRequest request);

    /**
     * @param request the request parameters of ListIvrTrackingDetail  ListIvrTrackingDetailRequest
     * @return ListIvrTrackingDetailResponse
     */
    CompletableFuture<ListIvrTrackingDetailResponse> listIvrTrackingDetail(ListIvrTrackingDetailRequest request);

    /**
     * @param request the request parameters of ListMedias  ListMediasRequest
     * @return ListMediasResponse
     */
    CompletableFuture<ListMediasResponse> listMedias(ListMediasRequest request);

    /**
     * @param request the request parameters of ListOutboundPhoneNumberOfUser  ListOutboundPhoneNumberOfUserRequest
     * @return ListOutboundPhoneNumberOfUserResponse
     */
    CompletableFuture<ListOutboundPhoneNumberOfUserResponse> listOutboundPhoneNumberOfUser(ListOutboundPhoneNumberOfUserRequest request);

    /**
     * @param request the request parameters of ListPhoneNumbers  ListPhoneNumbersRequest
     * @return ListPhoneNumbersResponse
     */
    CompletableFuture<ListPhoneNumbersResponse> listPhoneNumbers(ListPhoneNumbersRequest request);

    /**
     * @param request the request parameters of ListPhoneTags  ListPhoneTagsRequest
     * @return ListPhoneTagsResponse
     */
    CompletableFuture<ListPhoneTagsResponse> listPhoneTags(ListPhoneTagsRequest request);

    /**
     * @param request the request parameters of ListRealTimeAgent  ListRealTimeAgentRequest
     * @return ListRealTimeAgentResponse
     */
    CompletableFuture<ListRealTimeAgentResponse> listRealTimeAgent(ListRealTimeAgentRequest request);

    /**
     * @param request the request parameters of ListRecentCallRecords  ListRecentCallRecordsRequest
     * @return ListRecentCallRecordsResponse
     */
    CompletableFuture<ListRecentCallRecordsResponse> listRecentCallRecords(ListRecentCallRecordsRequest request);

    /**
     * @param request the request parameters of ListRecordingOfDualTrack  ListRecordingOfDualTrackRequest
     * @return ListRecordingOfDualTrackResponse
     */
    CompletableFuture<ListRecordingOfDualTrackResponse> listRecordingOfDualTrack(ListRecordingOfDualTrackRequest request);

    /**
     * @param request the request parameters of ListRecordings  ListRecordingsRequest
     * @return ListRecordingsResponse
     */
    CompletableFuture<ListRecordingsResponse> listRecordings(ListRecordingsRequest request);

    /**
     * @param request the request parameters of ListRecordingsByContactId  ListRecordingsByContactIdRequest
     * @return ListRecordingsByContactIdResponse
     */
    CompletableFuture<ListRecordingsByContactIdResponse> listRecordingsByContactId(ListRecordingsByContactIdRequest request);

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
     * @param request the request parameters of ListSkillGroupStates  ListSkillGroupStatesRequest
     * @return ListSkillGroupStatesResponse
     */
    CompletableFuture<ListSkillGroupStatesResponse> listSkillGroupStates(ListSkillGroupStatesRequest request);

    /**
     * @param request the request parameters of ListSkillGroupSummaryReports  ListSkillGroupSummaryReportsRequest
     * @return ListSkillGroupSummaryReportsResponse
     */
    CompletableFuture<ListSkillGroupSummaryReportsResponse> listSkillGroupSummaryReports(ListSkillGroupSummaryReportsRequest request);

    /**
     * @param request the request parameters of ListSkillGroupSummaryReportsByInterval  ListSkillGroupSummaryReportsByIntervalRequest
     * @return ListSkillGroupSummaryReportsByIntervalResponse
     */
    CompletableFuture<ListSkillGroupSummaryReportsByIntervalResponse> listSkillGroupSummaryReportsByInterval(ListSkillGroupSummaryReportsByIntervalRequest request);

    /**
     * @param request the request parameters of ListSkillGroupSummaryReportsSinceMidnight  ListSkillGroupSummaryReportsSinceMidnightRequest
     * @return ListSkillGroupSummaryReportsSinceMidnightResponse
     */
    CompletableFuture<ListSkillGroupSummaryReportsSinceMidnightResponse> listSkillGroupSummaryReportsSinceMidnight(ListSkillGroupSummaryReportsSinceMidnightRequest request);

    /**
     * @param request the request parameters of ListSkillGroups  ListSkillGroupsRequest
     * @return ListSkillGroupsResponse
     */
    CompletableFuture<ListSkillGroupsResponse> listSkillGroups(ListSkillGroupsRequest request);

    /**
     * @param request the request parameters of ListSkillGroupsOfUser  ListSkillGroupsOfUserRequest
     * @return ListSkillGroupsOfUserResponse
     */
    CompletableFuture<ListSkillGroupsOfUserResponse> listSkillGroupsOfUser(ListSkillGroupsOfUserRequest request);

    /**
     * @param request the request parameters of ListTransferableSkillGroups  ListTransferableSkillGroupsRequest
     * @return ListTransferableSkillGroupsResponse
     */
    CompletableFuture<ListTransferableSkillGroupsResponse> listTransferableSkillGroups(ListTransferableSkillGroupsRequest request);

    /**
     * @param request the request parameters of ListTrunkProviders  ListTrunkProvidersRequest
     * @return ListTrunkProvidersResponse
     */
    CompletableFuture<ListTrunkProvidersResponse> listTrunkProviders(ListTrunkProvidersRequest request);

    /**
     * @param request the request parameters of ListTrunksOfSkillGroup  ListTrunksOfSkillGroupRequest
     * @return ListTrunksOfSkillGroupResponse
     */
    CompletableFuture<ListTrunksOfSkillGroupResponse> listTrunksOfSkillGroup(ListTrunksOfSkillGroupRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListUsersOfSkillGroup  ListUsersOfSkillGroupRequest
     * @return ListUsersOfSkillGroupResponse
     */
    CompletableFuture<ListUsersOfSkillGroupResponse> listUsersOfSkillGroup(ListUsersOfSkillGroupRequest request);

    /**
     * @param request the request parameters of ListVoiceAppraise  ListVoiceAppraiseRequest
     * @return ListVoiceAppraiseResponse
     */
    CompletableFuture<ListVoiceAppraiseResponse> listVoiceAppraise(ListVoiceAppraiseRequest request);

    /**
     * @param request the request parameters of ModifyAgentDevice  ModifyAgentDeviceRequest
     * @return ModifyAgentDeviceResponse
     */
    CompletableFuture<ModifyAgentDeviceResponse> modifyAgentDevice(ModifyAgentDeviceRequest request);

    /**
     * @param request the request parameters of ModifyPhoneNumber  ModifyPhoneNumberRequest
     * @return ModifyPhoneNumberResponse
     */
    CompletableFuture<ModifyPhoneNumberResponse> modifyPhoneNumber(ModifyPhoneNumberRequest request);

    /**
     * @param request the request parameters of ModifyPhoneTags  ModifyPhoneTagsRequest
     * @return ModifyPhoneTagsResponse
     */
    CompletableFuture<ModifyPhoneTagsResponse> modifyPhoneTags(ModifyPhoneTagsRequest request);

    /**
     * @param request the request parameters of ModifyPrimaryTrunksOfSkillGroup  ModifyPrimaryTrunksOfSkillGroupRequest
     * @return ModifyPrimaryTrunksOfSkillGroupResponse
     */
    CompletableFuture<ModifyPrimaryTrunksOfSkillGroupResponse> modifyPrimaryTrunksOfSkillGroup(ModifyPrimaryTrunksOfSkillGroupRequest request);

    /**
     * @param request the request parameters of ModifyPrivacyNumberCallDetail  ModifyPrivacyNumberCallDetailRequest
     * @return ModifyPrivacyNumberCallDetailResponse
     */
    CompletableFuture<ModifyPrivacyNumberCallDetailResponse> modifyPrivacyNumberCallDetail(ModifyPrivacyNumberCallDetailRequest request);

    /**
     * @param request the request parameters of ModifySkillGroup  ModifySkillGroupRequest
     * @return ModifySkillGroupResponse
     */
    CompletableFuture<ModifySkillGroupResponse> modifySkillGroup(ModifySkillGroupRequest request);

    /**
     * @param request the request parameters of ModifySkillGroupBasicInfo  ModifySkillGroupBasicInfoRequest
     * @return ModifySkillGroupBasicInfoResponse
     */
    CompletableFuture<ModifySkillGroupBasicInfoResponse> modifySkillGroupBasicInfo(ModifySkillGroupBasicInfoRequest request);

    /**
     * @param request the request parameters of ModifySkillGroupOfUser  ModifySkillGroupOfUserRequest
     * @return ModifySkillGroupOfUserResponse
     */
    CompletableFuture<ModifySkillGroupOfUserResponse> modifySkillGroupOfUser(ModifySkillGroupOfUserRequest request);

    /**
     * @param request the request parameters of ModifySkillGroupOutboundNumbers  ModifySkillGroupOutboundNumbersRequest
     * @return ModifySkillGroupOutboundNumbersResponse
     */
    CompletableFuture<ModifySkillGroupOutboundNumbersResponse> modifySkillGroupOutboundNumbers(ModifySkillGroupOutboundNumbersRequest request);

    /**
     * @param request the request parameters of ModifyUser  ModifyUserRequest
     * @return ModifyUserResponse
     */
    CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request);

    /**
     * @param request the request parameters of PickGlobalOutboundNumbers  PickGlobalOutboundNumbersRequest
     * @return PickGlobalOutboundNumbersResponse
     */
    CompletableFuture<PickGlobalOutboundNumbersResponse> pickGlobalOutboundNumbers(PickGlobalOutboundNumbersRequest request);

    /**
     * @param request the request parameters of PickLocalNumber  PickLocalNumberRequest
     * @return PickLocalNumberResponse
     */
    CompletableFuture<PickLocalNumberResponse> pickLocalNumber(PickLocalNumberRequest request);

    /**
     * @param request the request parameters of PickOutboundNumbers  PickOutboundNumbersRequest
     * @return PickOutboundNumbersResponse
     */
    CompletableFuture<PickOutboundNumbersResponse> pickOutboundNumbers(PickOutboundNumbersRequest request);

    /**
     * @param request the request parameters of PublishContactFlowVersion  PublishContactFlowVersionRequest
     * @return PublishContactFlowVersionResponse
     */
    CompletableFuture<PublishContactFlowVersionResponse> publishContactFlowVersion(PublishContactFlowVersionRequest request);

    /**
     * @param request the request parameters of RefreshToken  RefreshTokenRequest
     * @return RefreshTokenResponse
     */
    CompletableFuture<RefreshTokenResponse> refreshToken(RefreshTokenRequest request);

    /**
     * @param request the request parameters of RemovePhoneNumber  RemovePhoneNumberRequest
     * @return RemovePhoneNumberResponse
     */
    CompletableFuture<RemovePhoneNumberResponse> removePhoneNumber(RemovePhoneNumberRequest request);

    /**
     * @param request the request parameters of RemoveUsers  RemoveUsersRequest
     * @return RemoveUsersResponse
     */
    CompletableFuture<RemoveUsersResponse> removeUsers(RemoveUsersRequest request);

    /**
     * @param request the request parameters of RemoveUsersFromSkillGroup  RemoveUsersFromSkillGroupRequest
     * @return RemoveUsersFromSkillGroupResponse
     */
    CompletableFuture<RemoveUsersFromSkillGroupResponse> removeUsersFromSkillGroup(RemoveUsersFromSkillGroupRequest request);

    /**
     * @param request the request parameters of RequestLoginInfo  RequestLoginInfoRequest
     * @return RequestLoginInfoResponse
     */
    CompletableFuture<RequestLoginInfoResponse> requestLoginInfo(RequestLoginInfoRequest request);

    /**
     * @param request the request parameters of ResetUserStatus  ResetUserStatusRequest
     * @return ResetUserStatusResponse
     */
    CompletableFuture<ResetUserStatusResponse> resetUserStatus(ResetUserStatusRequest request);

    /**
     * @param request the request parameters of SaveWebRTCStats  SaveWebRTCStatsRequest
     * @return SaveWebRTCStatsResponse
     */
    CompletableFuture<SaveWebRTCStatsResponse> saveWebRTCStats(SaveWebRTCStatsRequest request);

    /**
     * @param request the request parameters of SendPredefinedShortMessage  SendPredefinedShortMessageRequest
     * @return SendPredefinedShortMessageResponse
     */
    CompletableFuture<SendPredefinedShortMessageResponse> sendPredefinedShortMessage(SendPredefinedShortMessageRequest request);

    /**
     * @param request the request parameters of StartBack2BackCall  StartBack2BackCallRequest
     * @return StartBack2BackCallResponse
     */
    CompletableFuture<StartBack2BackCallResponse> startBack2BackCall(StartBack2BackCallRequest request);

}
