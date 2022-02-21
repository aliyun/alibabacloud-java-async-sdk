// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ccc20170705.models.*;
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

    CompletableFuture<AddAgentDeviceResponse> addAgentDevice(AddAgentDeviceRequest request);

    CompletableFuture<AddBulkPhoneNumbersResponse> addBulkPhoneNumbers(AddBulkPhoneNumbersRequest request);

    CompletableFuture<AddPhoneNumberResponse> addPhoneNumber(AddPhoneNumberRequest request);

    CompletableFuture<AddPhoneTagsResponse> addPhoneTags(AddPhoneTagsRequest request);

    CompletableFuture<AssignUsersResponse> assignUsers(AssignUsersRequest request);

    CompletableFuture<CallOnlinePrivacyNumberResponse> callOnlinePrivacyNumber(CallOnlinePrivacyNumberRequest request);

    CompletableFuture<CheckNumberAvaliableResponse> checkNumberAvaliable(CheckNumberAvaliableRequest request);

    CompletableFuture<CommitContactFlowVersionModificationResponse> commitContactFlowVersionModification(CommitContactFlowVersionModificationRequest request);

    CompletableFuture<CreateContactFlowResponse> createContactFlow(CreateContactFlowRequest request);

    CompletableFuture<CreateFaultResponse> createFault(CreateFaultRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateMediaResponse> createMedia(CreateMediaRequest request);

    CompletableFuture<CreateScenarioParameterResponse> createScenarioParameter(CreateScenarioParameterRequest request);

    CompletableFuture<CreateSkillGroupResponse> createSkillGroup(CreateSkillGroupRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<CreateVoiceAppraiseResponse> createVoiceAppraise(CreateVoiceAppraiseRequest request);

    CompletableFuture<DebugIntentResponse> debugIntent(DebugIntentRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteMediaResponse> deleteMedia(DeleteMediaRequest request);

    CompletableFuture<DeletePhoneTagsResponse> deletePhoneTags(DeletePhoneTagsRequest request);

    CompletableFuture<DeleteScenarioParameterResponse> deleteScenarioParameter(DeleteScenarioParameterRequest request);

    CompletableFuture<DeleteSkillGroupResponse> deleteSkillGroup(DeleteSkillGroupRequest request);

    CompletableFuture<DialExResponse> dialEx(DialExRequest request);

    CompletableFuture<DirectDialogueResponse> directDialogue(DirectDialogueRequest request);

    CompletableFuture<DisableTrunkProvidersResponse> disableTrunkProviders(DisableTrunkProvidersRequest request);

    CompletableFuture<DownloadAllTypeRecordingResponse> downloadAllTypeRecording(DownloadAllTypeRecordingRequest request);

    CompletableFuture<DownloadRecordingResponse> downloadRecording(DownloadRecordingRequest request);

    CompletableFuture<FindUsersResponse> findUsers(FindUsersRequest request);

    CompletableFuture<GenerateAgentStatisticReportResponse> generateAgentStatisticReport(GenerateAgentStatisticReportRequest request);

    CompletableFuture<GetAgentDataResponse> getAgentData(GetAgentDataRequest request);

    CompletableFuture<GetCallMeasureSummaryReportResponse> getCallMeasureSummaryReport(GetCallMeasureSummaryReportRequest request);

    CompletableFuture<GetConfigResponse> getConfig(GetConfigRequest request);

    CompletableFuture<GetConversationDetailByContactIdResponse> getConversationDetailByContactId(GetConversationDetailByContactIdRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetInstanceStateResponse> getInstanceState(GetInstanceStateRequest request);

    CompletableFuture<GetInstanceSummaryReportResponse> getInstanceSummaryReport(GetInstanceSummaryReportRequest request);

    CompletableFuture<GetInstanceSummaryReportByIntervalResponse> getInstanceSummaryReportByInterval(GetInstanceSummaryReportByIntervalRequest request);

    CompletableFuture<GetInstanceSummaryReportSinceMidnightResponse> getInstanceSummaryReportSinceMidnight(GetInstanceSummaryReportSinceMidnightRequest request);

    CompletableFuture<GetNumberRegionInfoResponse> getNumberRegionInfo(GetNumberRegionInfoRequest request);

    CompletableFuture<GetRecordOssUploadParamResponse> getRecordOssUploadParam(GetRecordOssUploadParamRequest request);

    CompletableFuture<GetRoutePointResponse> getRoutePoint(GetRoutePointRequest request);

    CompletableFuture<GetServiceExtensionsResponse> getServiceExtensions(GetServiceExtensionsRequest request);

    CompletableFuture<GetSmsConfigResponse> getSmsConfig(GetSmsConfigRequest request);

    CompletableFuture<GetTURNCredentialsResponse> getTURNCredentials(GetTURNCredentialsRequest request);

    CompletableFuture<GetTURNServerListResponse> getTURNServerList(GetTURNServerListRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserByExtensionResponse> getUserByExtension(GetUserByExtensionRequest request);

    CompletableFuture<LaunchAppraiseResponse> launchAppraise(LaunchAppraiseRequest request);

    CompletableFuture<LaunchShortMessageAppraiseResponse> launchShortMessageAppraise(LaunchShortMessageAppraiseRequest request);

    CompletableFuture<ListAgentDevicesResponse> listAgentDevices(ListAgentDevicesRequest request);

    CompletableFuture<ListAgentEventsResponse> listAgentEvents(ListAgentEventsRequest request);

    CompletableFuture<ListAgentStateLogsResponse> listAgentStateLogs(ListAgentStateLogsRequest request);

    CompletableFuture<ListAgentStatesResponse> listAgentStates(ListAgentStatesRequest request);

    CompletableFuture<ListAgentSummaryReportsResponse> listAgentSummaryReports(ListAgentSummaryReportsRequest request);

    CompletableFuture<ListAgentSummaryReportsByIntervalResponse> listAgentSummaryReportsByInterval(ListAgentSummaryReportsByIntervalRequest request);

    CompletableFuture<ListAgentSummaryReportsSinceMidnightResponse> listAgentSummaryReportsSinceMidnight(ListAgentSummaryReportsSinceMidnightRequest request);

    CompletableFuture<ListCallDetailRecordsResponse> listCallDetailRecords(ListCallDetailRecordsRequest request);

    CompletableFuture<ListCallEventDetailByContactIdResponse> listCallEventDetailByContactId(ListCallEventDetailByContactIdRequest request);

    CompletableFuture<ListCallMeasureSummaryReportsResponse> listCallMeasureSummaryReports(ListCallMeasureSummaryReportsRequest request);

    CompletableFuture<ListConfigResponse> listConfig(ListConfigRequest request);

    CompletableFuture<ListContactFlowsResponse> listContactFlows(ListContactFlowsRequest request);

    CompletableFuture<ListInstancesOfUserResponse> listInstancesOfUser(ListInstancesOfUserRequest request);

    CompletableFuture<ListIvrTrackingDetailResponse> listIvrTrackingDetail(ListIvrTrackingDetailRequest request);

    CompletableFuture<ListMediasResponse> listMedias(ListMediasRequest request);

    CompletableFuture<ListOutboundPhoneNumberOfUserResponse> listOutboundPhoneNumberOfUser(ListOutboundPhoneNumberOfUserRequest request);

    CompletableFuture<ListPhoneNumbersResponse> listPhoneNumbers(ListPhoneNumbersRequest request);

    CompletableFuture<ListPhoneTagsResponse> listPhoneTags(ListPhoneTagsRequest request);

    CompletableFuture<ListRealTimeAgentResponse> listRealTimeAgent(ListRealTimeAgentRequest request);

    CompletableFuture<ListRecentCallRecordsResponse> listRecentCallRecords(ListRecentCallRecordsRequest request);

    CompletableFuture<ListRecordingOfDualTrackResponse> listRecordingOfDualTrack(ListRecordingOfDualTrackRequest request);

    CompletableFuture<ListRecordingsResponse> listRecordings(ListRecordingsRequest request);

    CompletableFuture<ListRecordingsByContactIdResponse> listRecordingsByContactId(ListRecordingsByContactIdRequest request);

    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    CompletableFuture<ListScenarioParametersResponse> listScenarioParameters(ListScenarioParametersRequest request);

    CompletableFuture<ListSipCallRecordsResponse> listSipCallRecords(ListSipCallRecordsRequest request);

    CompletableFuture<ListSkillGroupStatesResponse> listSkillGroupStates(ListSkillGroupStatesRequest request);

    CompletableFuture<ListSkillGroupSummaryReportsResponse> listSkillGroupSummaryReports(ListSkillGroupSummaryReportsRequest request);

    CompletableFuture<ListSkillGroupSummaryReportsByIntervalResponse> listSkillGroupSummaryReportsByInterval(ListSkillGroupSummaryReportsByIntervalRequest request);

    CompletableFuture<ListSkillGroupSummaryReportsSinceMidnightResponse> listSkillGroupSummaryReportsSinceMidnight(ListSkillGroupSummaryReportsSinceMidnightRequest request);

    CompletableFuture<ListSkillGroupsResponse> listSkillGroups(ListSkillGroupsRequest request);

    CompletableFuture<ListSkillGroupsOfUserResponse> listSkillGroupsOfUser(ListSkillGroupsOfUserRequest request);

    CompletableFuture<ListTransferableSkillGroupsResponse> listTransferableSkillGroups(ListTransferableSkillGroupsRequest request);

    CompletableFuture<ListTrunkProvidersResponse> listTrunkProviders(ListTrunkProvidersRequest request);

    CompletableFuture<ListTrunksOfSkillGroupResponse> listTrunksOfSkillGroup(ListTrunksOfSkillGroupRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListUsersOfSkillGroupResponse> listUsersOfSkillGroup(ListUsersOfSkillGroupRequest request);

    CompletableFuture<ListVoiceAppraiseResponse> listVoiceAppraise(ListVoiceAppraiseRequest request);

    CompletableFuture<ModifyAgentDeviceResponse> modifyAgentDevice(ModifyAgentDeviceRequest request);

    CompletableFuture<ModifyCallRatioOfJobGroupResponse> modifyCallRatioOfJobGroup(ModifyCallRatioOfJobGroupRequest request);

    CompletableFuture<ModifyPhoneNumberResponse> modifyPhoneNumber(ModifyPhoneNumberRequest request);

    CompletableFuture<ModifyPhoneTagsResponse> modifyPhoneTags(ModifyPhoneTagsRequest request);

    CompletableFuture<ModifyPrimaryTrunksOfSkillGroupResponse> modifyPrimaryTrunksOfSkillGroup(ModifyPrimaryTrunksOfSkillGroupRequest request);

    CompletableFuture<ModifyPrivacyNumberCallDetailResponse> modifyPrivacyNumberCallDetail(ModifyPrivacyNumberCallDetailRequest request);

    CompletableFuture<ModifySkillGroupResponse> modifySkillGroup(ModifySkillGroupRequest request);

    CompletableFuture<ModifySkillGroupOfUserResponse> modifySkillGroupOfUser(ModifySkillGroupOfUserRequest request);

    CompletableFuture<ModifySkillGroupOutboundNumbersResponse> modifySkillGroupOutboundNumbers(ModifySkillGroupOutboundNumbersRequest request);

    CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request);

    CompletableFuture<PickGlobalOutboundNumbersResponse> pickGlobalOutboundNumbers(PickGlobalOutboundNumbersRequest request);

    CompletableFuture<PickLocalNumberResponse> pickLocalNumber(PickLocalNumberRequest request);

    CompletableFuture<PickOutboundNumbersResponse> pickOutboundNumbers(PickOutboundNumbersRequest request);

    CompletableFuture<PublishContactFlowVersionResponse> publishContactFlowVersion(PublishContactFlowVersionRequest request);

    CompletableFuture<RefreshTokenResponse> refreshToken(RefreshTokenRequest request);

    CompletableFuture<RemovePhoneNumberResponse> removePhoneNumber(RemovePhoneNumberRequest request);

    CompletableFuture<RemoveUsersResponse> removeUsers(RemoveUsersRequest request);

    CompletableFuture<RemoveUsersFromSkillGroupResponse> removeUsersFromSkillGroup(RemoveUsersFromSkillGroupRequest request);

    CompletableFuture<RequestLoginInfoResponse> requestLoginInfo(RequestLoginInfoRequest request);

    CompletableFuture<ResetUserStatusResponse> resetUserStatus(ResetUserStatusRequest request);

    CompletableFuture<SaveRTCStatsV1Response> saveRTCStatsV1(SaveRTCStatsV1Request request);

    CompletableFuture<SaveStatsResponse> saveStats(SaveStatsRequest request);

    CompletableFuture<SaveWebRTCStatsResponse> saveWebRTCStats(SaveWebRTCStatsRequest request);

    CompletableFuture<SendPredefinedShortMessageResponse> sendPredefinedShortMessage(SendPredefinedShortMessageRequest request);

    CompletableFuture<StartBack2BackCallResponse> startBack2BackCall(StartBack2BackCallRequest request);

}
