// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ccc20200701.models.*;
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

    CompletableFuture<AbortCampaignResponse> abortCampaign(AbortCampaignRequest request);

    CompletableFuture<AcceptChatResponse> acceptChat(AcceptChatRequest request);

    CompletableFuture<AddBlacklistCallTaggingResponse> addBlacklistCallTagging(AddBlacklistCallTaggingRequest request);

    CompletableFuture<AddCasesResponse> addCases(AddCasesRequest request);

    CompletableFuture<AddNumbersToSkillGroupResponse> addNumbersToSkillGroup(AddNumbersToSkillGroupRequest request);

    CompletableFuture<AddPersonalNumbersToUserResponse> addPersonalNumbersToUser(AddPersonalNumbersToUserRequest request);

    CompletableFuture<AddPhoneNumberToSkillGroupsResponse> addPhoneNumberToSkillGroups(AddPhoneNumberToSkillGroupsRequest request);

    CompletableFuture<AddPhoneNumbersResponse> addPhoneNumbers(AddPhoneNumbersRequest request);

    CompletableFuture<AddSchemaPropertyResponse> addSchemaProperty(AddSchemaPropertyRequest request);

    CompletableFuture<AddSkillGroupsToUserResponse> addSkillGroupsToUser(AddSkillGroupsToUserRequest request);

    CompletableFuture<AddTicketTaskResponse> addTicketTask(AddTicketTaskRequest request);

    CompletableFuture<AddUsersToSkillGroupResponse> addUsersToSkillGroup(AddUsersToSkillGroupRequest request);

    CompletableFuture<AnalyzeConversationResponse> analyzeConversation(AnalyzeConversationRequest request);

    CompletableFuture<AnswerCallResponse> answerCall(AnswerCallRequest request);

    CompletableFuture<AppendCasesResponse> appendCases(AppendCasesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<AssignUsersResponse> assignUsers(AssignUsersRequest request);

    CompletableFuture<BargeInCallResponse> bargeInCall(BargeInCallRequest request);

    CompletableFuture<BlindTransferResponse> blindTransfer(BlindTransferRequest request);

    CompletableFuture<BridgeRtcCallResponse> bridgeRtcCall(BridgeRtcCallRequest request);

    CompletableFuture<CancelAttendedTransferResponse> cancelAttendedTransfer(CancelAttendedTransferRequest request);

    CompletableFuture<ChangeVisibilityResponse> changeVisibility(ChangeVisibilityRequest request);

    CompletableFuture<ChangeWorkModeResponse> changeWorkMode(ChangeWorkModeRequest request);

    CompletableFuture<ClaimChatResponse> claimChat(ClaimChatRequest request);

    CompletableFuture<CoachCallResponse> coachCall(CoachCallRequest request);

    CompletableFuture<CommitContactFlowResponse> commitContactFlow(CommitContactFlowRequest request);

    CompletableFuture<CompleteAttendedTransferResponse> completeAttendedTransfer(CompleteAttendedTransferRequest request);

    CompletableFuture<CreateAudioFileResponse> createAudioFile(CreateAudioFileRequest request);

    CompletableFuture<CreateCallTagsResponse> createCallTags(CreateCallTagsRequest request);

    CompletableFuture<CreateCampaignResponse> createCampaign(CreateCampaignRequest request);

    CompletableFuture<CreateContactFlowResponse> createContactFlow(CreateContactFlowRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateCustomCallTaggingResponse> createCustomCallTagging(CreateCustomCallTaggingRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateSchemaResponse> createSchema(CreateSchemaRequest request);

    CompletableFuture<CreateSkillGroupResponse> createSkillGroup(CreateSkillGroupRequest request);

    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<DeleteAudioFileResponse> deleteAudioFile(DeleteAudioFileRequest request);

    CompletableFuture<DeleteCallTagResponse> deleteCallTag(DeleteCallTagRequest request);

    CompletableFuture<DeleteContactFlowResponse> deleteContactFlow(DeleteContactFlowRequest request);

    CompletableFuture<DeleteCustomCallTaggingResponse> deleteCustomCallTagging(DeleteCustomCallTaggingRequest request);

    CompletableFuture<DeleteDocumentResponse> deleteDocument(DeleteDocumentRequest request);

    CompletableFuture<DeleteDocumentsResponse> deleteDocuments(DeleteDocumentsRequest request);

    CompletableFuture<DeleteSchemaResponse> deleteSchema(DeleteSchemaRequest request);

    CompletableFuture<DeleteSchemaPropertyResponse> deleteSchemaProperty(DeleteSchemaPropertyRequest request);

    CompletableFuture<DeleteSkillGroupResponse> deleteSkillGroup(DeleteSkillGroupRequest request);

    CompletableFuture<DeleteTicketResponse> deleteTicket(DeleteTicketRequest request);

    CompletableFuture<DeleteTicketTemplateResponse> deleteTicketTemplate(DeleteTicketTemplateRequest request);

    CompletableFuture<DisableSchemaPropertyResponse> disableSchemaProperty(DisableSchemaPropertyRequest request);

    CompletableFuture<DisableTicketTemplateResponse> disableTicketTemplate(DisableTicketTemplateRequest request);

    CompletableFuture<DiscardEditingContactFlowResponse> discardEditingContactFlow(DiscardEditingContactFlowRequest request);

    CompletableFuture<EnableSchemaPropertyResponse> enableSchemaProperty(EnableSchemaPropertyRequest request);

    CompletableFuture<EnableTicketTemplateResponse> enableTicketTemplate(EnableTicketTemplateRequest request);

    CompletableFuture<EndConferenceResponse> endConference(EndConferenceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ExportCustomCallTaggingResponse> exportCustomCallTagging(ExportCustomCallTaggingRequest request);

    CompletableFuture<ExportDoNotCallNumbersResponse> exportDoNotCallNumbers(ExportDoNotCallNumbersRequest request);

    CompletableFuture<FinishTicketTaskResponse> finishTicketTask(FinishTicketTaskRequest request);

    CompletableFuture<GetAccessChannelOfStagingResponse> getAccessChannelOfStaging(GetAccessChannelOfStagingRequest request);

    CompletableFuture<GetAudioFileResponse> getAudioFile(GetAudioFileRequest request);

    CompletableFuture<GetAudioFileDownloadUrlResponse> getAudioFileDownloadUrl(GetAudioFileDownloadUrlRequest request);

    CompletableFuture<GetAudioFileUploadParametersResponse> getAudioFileUploadParameters(GetAudioFileUploadParametersRequest request);

    CompletableFuture<GetCallDetailRecordResponse> getCallDetailRecord(GetCallDetailRecordRequest request);

    CompletableFuture<GetCampaignResponse> getCampaign(GetCampaignRequest request);

    CompletableFuture<GetCaseFileUploadUrlResponse> getCaseFileUploadUrl(GetCaseFileUploadUrlRequest request);

    CompletableFuture<GetChatMediaUrlResponse> getChatMediaUrl(GetChatMediaUrlRequest request);

    CompletableFuture<GetChatRoutingProfileResponse> getChatRoutingProfile(GetChatRoutingProfileRequest request);

    CompletableFuture<GetContactFlowResponse> getContactFlow(GetContactFlowRequest request);

    CompletableFuture<GetConversationDetailResponse> getConversationDetail(GetConversationDetailRequest request);

    CompletableFuture<GetDataChannelCredentialsResponse> getDataChannelCredentials(GetDataChannelCredentialsRequest request);

    CompletableFuture<GetDoNotCallFileUploadParametersResponse> getDoNotCallFileUploadParameters(GetDoNotCallFileUploadParametersRequest request);

    CompletableFuture<GetDocumentUploadParametersResponse> getDocumentUploadParameters(GetDocumentUploadParametersRequest request);

    CompletableFuture<GetEarlyMediaRecordingResponse> getEarlyMediaRecording(GetEarlyMediaRecordingRequest request);

    CompletableFuture<GetHistoricalCallerReportResponse> getHistoricalCallerReport(GetHistoricalCallerReportRequest request);

    CompletableFuture<GetHistoricalCampaignReportResponse> getHistoricalCampaignReport(GetHistoricalCampaignReportRequest request);

    CompletableFuture<GetHistoricalInstanceReportResponse> getHistoricalInstanceReport(GetHistoricalInstanceReportRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetInstanceTrendingReportResponse> getInstanceTrendingReport(GetInstanceTrendingReportRequest request);

    CompletableFuture<GetLoginDetailsResponse> getLoginDetails(GetLoginDetailsRequest request);

    CompletableFuture<GetMonoRecordingResponse> getMonoRecording(GetMonoRecordingRequest request);

    CompletableFuture<GetMultiChannelRecordingResponse> getMultiChannelRecording(GetMultiChannelRecordingRequest request);

    CompletableFuture<GetNumberLocationResponse> getNumberLocation(GetNumberLocationRequest request);

    CompletableFuture<GetRealtimeCampaignStatsResponse> getRealtimeCampaignStats(GetRealtimeCampaignStatsRequest request);

    CompletableFuture<GetRealtimeInstanceStatesResponse> getRealtimeInstanceStates(GetRealtimeInstanceStatesRequest request);

    CompletableFuture<GetSchemaResponse> getSchema(GetSchemaRequest request);

    CompletableFuture<GetSkillGroupResponse> getSkillGroup(GetSkillGroupRequest request);

    CompletableFuture<GetTicketResponse> getTicket(GetTicketRequest request);

    CompletableFuture<GetTicketSummaryReportResponse> getTicketSummaryReport(GetTicketSummaryReportRequest request);

    CompletableFuture<GetTicketTemplateResponse> getTicketTemplate(GetTicketTemplateRequest request);

    CompletableFuture<GetTurnCredentialsResponse> getTurnCredentials(GetTurnCredentialsRequest request);

    CompletableFuture<GetTurnServerListResponse> getTurnServerList(GetTurnServerListRequest request);

    CompletableFuture<GetUploadAudioDataParamsResponse> getUploadAudioDataParams(GetUploadAudioDataParamsRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetVideoResponse> getVideo(GetVideoRequest request);

    CompletableFuture<GetVisitorLoginDetailsResponse> getVisitorLoginDetails(GetVisitorLoginDetailsRequest request);

    CompletableFuture<GetVoicemailRecordingResponse> getVoicemailRecording(GetVoicemailRecordingRequest request);

    CompletableFuture<HoldCallResponse> holdCall(HoldCallRequest request);

    CompletableFuture<ImportAdminsResponse> importAdmins(ImportAdminsRequest request);

    CompletableFuture<ImportCorpNumbersResponse> importCorpNumbers(ImportCorpNumbersRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ImportCustomCallTaggingResponse> importCustomCallTagging(ImportCustomCallTaggingRequest request);

    CompletableFuture<ImportDoNotCallNumbersResponse> importDoNotCallNumbers(ImportDoNotCallNumbersRequest request);

    CompletableFuture<ImportDocumentsResponse> importDocuments(ImportDocumentsRequest request);

    CompletableFuture<InitiateAttendedTransferResponse> initiateAttendedTransfer(InitiateAttendedTransferRequest request);

    CompletableFuture<InterceptCallResponse> interceptCall(InterceptCallRequest request);

    CompletableFuture<LaunchAuthenticationResponse> launchAuthentication(LaunchAuthenticationRequest request);

    CompletableFuture<LaunchSurveyResponse> launchSurvey(LaunchSurveyRequest request);

    CompletableFuture<ListAgentStateLogsResponse> listAgentStateLogs(ListAgentStateLogsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListAgentStatesResponse> listAgentStates(ListAgentStatesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListAgentSummaryReportsSinceMidnightResponse> listAgentSummaryReportsSinceMidnight(ListAgentSummaryReportsSinceMidnightRequest request);

    CompletableFuture<ListAttemptsResponse> listAttempts(ListAttemptsRequest request);

    CompletableFuture<ListAudioFilesResponse> listAudioFiles(ListAudioFilesRequest request);

    CompletableFuture<ListBlacklistCallTaggingsResponse> listBlacklistCallTaggings(ListBlacklistCallTaggingsRequest request);

    CompletableFuture<ListBriefSkillGroupsResponse> listBriefSkillGroups(ListBriefSkillGroupsRequest request);

    CompletableFuture<ListCallDetailRecordsResponse> listCallDetailRecords(ListCallDetailRecordsRequest request);

    CompletableFuture<ListCallDetailRecordsV2Response> listCallDetailRecordsV2(ListCallDetailRecordsV2Request request);

    CompletableFuture<ListCallSummariesResponse> listCallSummaries(ListCallSummariesRequest request);

    CompletableFuture<ListCallTagsResponse> listCallTags(ListCallTagsRequest request);

    CompletableFuture<ListCampaignTrendingReportResponse> listCampaignTrendingReport(ListCampaignTrendingReportRequest request);

    CompletableFuture<ListCampaignsResponse> listCampaigns(ListCampaignsRequest request);

    CompletableFuture<ListCasesResponse> listCases(ListCasesRequest request);

    CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request);

    CompletableFuture<ListCommonTicketFieldsResponse> listCommonTicketFields(ListCommonTicketFieldsRequest request);

    CompletableFuture<ListConfigItemsResponse> listConfigItems(ListConfigItemsRequest request);

    CompletableFuture<ListContactFlowsResponse> listContactFlows(ListContactFlowsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListCustomCallTaggingResponse> listCustomCallTagging(ListCustomCallTaggingRequest request);

    CompletableFuture<ListDevicesResponse> listDevices(ListDevicesRequest request);

    CompletableFuture<ListDoNotCallNumbersResponse> listDoNotCallNumbers(ListDoNotCallNumbersRequest request);

    CompletableFuture<ListDocumentsResponse> listDocuments(ListDocumentsRequest request);

    CompletableFuture<ListFlashSmsApplicationsResponse> listFlashSmsApplications(ListFlashSmsApplicationsRequest request);

    CompletableFuture<ListFlashSmsTemplatesResponse> listFlashSmsTemplates(ListFlashSmsTemplatesRequest request);

    CompletableFuture<ListGroupChatMessagesResponse> listGroupChatMessages(ListGroupChatMessagesRequest request);

    CompletableFuture<ListHistoricalAgentReportResponse> listHistoricalAgentReport(ListHistoricalAgentReportRequest request);

    CompletableFuture<ListHistoricalAgentSkillGroupReportResponse> listHistoricalAgentSkillGroupReport(ListHistoricalAgentSkillGroupReportRequest request);

    CompletableFuture<ListHistoricalSkillGroupReportResponse> listHistoricalSkillGroupReport(ListHistoricalSkillGroupReportRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListInstancesOfUserResponse> listInstancesOfUser(ListInstancesOfUserRequest request);

    CompletableFuture<ListIntervalAgentReportResponse> listIntervalAgentReport(ListIntervalAgentReportRequest request);

    CompletableFuture<ListIntervalAgentSkillGroupReportResponse> listIntervalAgentSkillGroupReport(ListIntervalAgentSkillGroupReportRequest request);

    CompletableFuture<ListIntervalInstanceReportResponse> listIntervalInstanceReport(ListIntervalInstanceReportRequest request);

    CompletableFuture<ListIntervalSkillGroupReportResponse> listIntervalSkillGroupReport(ListIntervalSkillGroupReportRequest request);

    CompletableFuture<ListIvrTrackingDetailsResponse> listIvrTrackingDetails(ListIvrTrackingDetailsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListLegacyAgentEventLogsResponse> listLegacyAgentEventLogs(ListLegacyAgentEventLogsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListLegacyAgentStatusLogsResponse> listLegacyAgentStatusLogs(ListLegacyAgentStatusLogsRequest request);

    CompletableFuture<ListLegacyAppraiseLogsResponse> listLegacyAppraiseLogs(ListLegacyAppraiseLogsRequest request);

    CompletableFuture<ListLegacyQueueEventLogsResponse> listLegacyQueueEventLogs(ListLegacyQueueEventLogsRequest request);

    CompletableFuture<ListMonoRecordingsResponse> listMonoRecordings(ListMonoRecordingsRequest request);

    CompletableFuture<ListMultiChannelRecordingsResponse> listMultiChannelRecordings(ListMultiChannelRecordingsRequest request);

    CompletableFuture<ListOutboundNumbersOfUserResponse> listOutboundNumbersOfUser(ListOutboundNumbersOfUserRequest request);

    CompletableFuture<ListPersonalNumbersOfUserResponse> listPersonalNumbersOfUser(ListPersonalNumbersOfUserRequest request);

    CompletableFuture<ListPhoneNumbersResponse> listPhoneNumbers(ListPhoneNumbersRequest request);

    CompletableFuture<ListPhoneNumbersOfSkillGroupResponse> listPhoneNumbersOfSkillGroup(ListPhoneNumbersOfSkillGroupRequest request);

    CompletableFuture<ListPrivilegesOfUserResponse> listPrivilegesOfUser(ListPrivilegesOfUserRequest request);

    CompletableFuture<ListRamUsersResponse> listRamUsers(ListRamUsersRequest request);

    CompletableFuture<ListRealtimeAgentStatesResponse> listRealtimeAgentStates(ListRealtimeAgentStatesRequest request);

    CompletableFuture<ListRealtimeSkillGroupStatesResponse> listRealtimeSkillGroupStates(ListRealtimeSkillGroupStatesRequest request);

    CompletableFuture<ListRecentCallDetailRecordsResponse> listRecentCallDetailRecords(ListRecentCallDetailRecordsRequest request);

    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListSkillGroupStatesResponse> listSkillGroupStates(ListSkillGroupStatesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListSkillGroupSummaryReportsSinceMidnightResponse> listSkillGroupSummaryReportsSinceMidnight(ListSkillGroupSummaryReportsSinceMidnightRequest request);

    CompletableFuture<ListSkillGroupsResponse> listSkillGroups(ListSkillGroupsRequest request);

    CompletableFuture<ListSkillLevelsOfUserResponse> listSkillLevelsOfUser(ListSkillLevelsOfUserRequest request);

    CompletableFuture<ListTicketTasksResponse> listTicketTasks(ListTicketTasksRequest request);

    CompletableFuture<ListTicketTemplatesResponse> listTicketTemplates(ListTicketTemplatesRequest request);

    CompletableFuture<ListTicketsResponse> listTickets(ListTicketsRequest request);

    CompletableFuture<ListUnassignedNumbersResponse> listUnassignedNumbers(ListUnassignedNumbersRequest request);

    CompletableFuture<ListUserLevelsOfSkillGroupResponse> listUserLevelsOfSkillGroup(ListUserLevelsOfSkillGroupRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListVoicemailsResponse> listVoicemails(ListVoicemailsRequest request);

    CompletableFuture<ListWaitingChatsResponse> listWaitingChats(ListWaitingChatsRequest request);

    CompletableFuture<MakeCallResponse> makeCall(MakeCallRequest request);

    CompletableFuture<ModifyAudioFileResponse> modifyAudioFile(ModifyAudioFileRequest request);

    CompletableFuture<ModifyCustomCallTaggingResponse> modifyCustomCallTagging(ModifyCustomCallTaggingRequest request);

    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    CompletableFuture<ModifyPhoneNumberResponse> modifyPhoneNumber(ModifyPhoneNumberRequest request);

    CompletableFuture<ModifySkillGroupResponse> modifySkillGroup(ModifySkillGroupRequest request);

    CompletableFuture<ModifySkillLevelsOfUserResponse> modifySkillLevelsOfUser(ModifySkillLevelsOfUserRequest request);

    CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request);

    CompletableFuture<ModifyUserLevelsOfSkillGroupResponse> modifyUserLevelsOfSkillGroup(ModifyUserLevelsOfSkillGroupRequest request);

    CompletableFuture<MonitorCallResponse> monitorCall(MonitorCallRequest request);

    CompletableFuture<MuteCallResponse> muteCall(MuteCallRequest request);

    CompletableFuture<PauseCampaignResponse> pauseCampaign(PauseCampaignRequest request);

    CompletableFuture<PickOutboundNumbersResponse> pickOutboundNumbers(PickOutboundNumbersRequest request);

    CompletableFuture<PollUserStatusResponse> pollUserStatus(PollUserStatusRequest request);

    CompletableFuture<ProcessAliMeCallbackOfStagingResponse> processAliMeCallbackOfStaging(ProcessAliMeCallbackOfStagingRequest request);

    CompletableFuture<PublishContactFlowResponse> publishContactFlow(PublishContactFlowRequest request);

    CompletableFuture<ReadyForServiceResponse> readyForService(ReadyForServiceRequest request);

    CompletableFuture<RedialCallResponse> redialCall(RedialCallRequest request);

    CompletableFuture<RegisterDeviceResponse> registerDevice(RegisterDeviceRequest request);

    CompletableFuture<RegisterDevicesResponse> registerDevices(RegisterDevicesRequest request);

    CompletableFuture<RejectChatResponse> rejectChat(RejectChatRequest request);

    CompletableFuture<RejectTicketResponse> rejectTicket(RejectTicketRequest request);

    CompletableFuture<ReleaseCallResponse> releaseCall(ReleaseCallRequest request);

    CompletableFuture<ReleaseChatResponse> releaseChat(ReleaseChatRequest request);

    CompletableFuture<RemoveBlacklistCallTaggingResponse> removeBlacklistCallTagging(RemoveBlacklistCallTaggingRequest request);

    CompletableFuture<RemoveDoNotCallNumbersResponse> removeDoNotCallNumbers(RemoveDoNotCallNumbersRequest request);

    CompletableFuture<RemovePersonalNumbersFromUserResponse> removePersonalNumbersFromUser(RemovePersonalNumbersFromUserRequest request);

    CompletableFuture<RemovePhoneNumberFromSkillGroupsResponse> removePhoneNumberFromSkillGroups(RemovePhoneNumberFromSkillGroupsRequest request);

    CompletableFuture<RemovePhoneNumbersResponse> removePhoneNumbers(RemovePhoneNumbersRequest request);

    CompletableFuture<RemovePhoneNumbersFromSkillGroupResponse> removePhoneNumbersFromSkillGroup(RemovePhoneNumbersFromSkillGroupRequest request);

    CompletableFuture<RemoveSkillGroupsFromUserResponse> removeSkillGroupsFromUser(RemoveSkillGroupsFromUserRequest request);

    CompletableFuture<RemoveUsersResponse> removeUsers(RemoveUsersRequest request);

    CompletableFuture<RemoveUsersFromSkillGroupResponse> removeUsersFromSkillGroup(RemoveUsersFromSkillGroupRequest request);

    CompletableFuture<ResetAgentStateResponse> resetAgentState(ResetAgentStateRequest request);

    CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request);

    CompletableFuture<RestoreArchivedRecordingsResponse> restoreArchivedRecordings(RestoreArchivedRecordingsRequest request);

    CompletableFuture<ResubmitTicketResponse> resubmitTicket(ResubmitTicketRequest request);

    CompletableFuture<ResumeCampaignResponse> resumeCampaign(ResumeCampaignRequest request);

    CompletableFuture<RetrieveCallResponse> retrieveCall(RetrieveCallRequest request);

    CompletableFuture<SaveDocumentResponse> saveDocument(SaveDocumentRequest request);

    CompletableFuture<SaveRTCStatsV2Response> saveRTCStatsV2(SaveRTCStatsV2Request request);

    CompletableFuture<SaveTerminalLogResponse> saveTerminalLog(SaveTerminalLogRequest request);

    CompletableFuture<SaveWebRTCStatsResponse> saveWebRTCStats(SaveWebRTCStatsRequest request);

    CompletableFuture<SaveWebRtcInfoResponse> saveWebRtcInfo(SaveWebRtcInfoRequest request);

    CompletableFuture<SendDtmfSignalingResponse> sendDtmfSignaling(SendDtmfSignalingRequest request);

    CompletableFuture<SignInGroupResponse> signInGroup(SignInGroupRequest request);

    CompletableFuture<SignOutGroupResponse> signOutGroup(SignOutGroupRequest request);

    CompletableFuture<StartBack2BackCallResponse> startBack2BackCall(StartBack2BackCallRequest request);

    CompletableFuture<StartChatResponse> startChat(StartChatRequest request);

    CompletableFuture<StartConferenceResponse> startConference(StartConferenceRequest request);

    CompletableFuture<StartEditContactFlowResponse> startEditContactFlow(StartEditContactFlowRequest request);

    CompletableFuture<StartPredictiveCallResponse> startPredictiveCall(StartPredictiveCallRequest request);

    CompletableFuture<StartPrivacyCallResponse> startPrivacyCall(StartPrivacyCallRequest request);

    CompletableFuture<SubmitCampaignResponse> submitCampaign(SubmitCampaignRequest request);

    CompletableFuture<SwitchToConferenceResponse> switchToConference(SwitchToConferenceRequest request);

    CompletableFuture<TakeBreakResponse> takeBreak(TakeBreakRequest request);

    CompletableFuture<TerminateTicketResponse> terminateTicket(TerminateTicketRequest request);

    CompletableFuture<TransferTicketTaskResponse> transferTicketTask(TransferTicketTaskRequest request);

    CompletableFuture<UnmuteCallResponse> unmuteCall(UnmuteCallRequest request);

    CompletableFuture<UnregisterDeviceResponse> unregisterDevice(UnregisterDeviceRequest request);

    CompletableFuture<UpdateCampaignResponse> updateCampaign(UpdateCampaignRequest request);

    CompletableFuture<UpdateChatRoutingProfileResponse> updateChatRoutingProfile(UpdateChatRoutingProfileRequest request);

    CompletableFuture<UpdateConfigItemsResponse> updateConfigItems(UpdateConfigItemsRequest request);

    CompletableFuture<UpdateSchemaPropertyResponse> updateSchemaProperty(UpdateSchemaPropertyRequest request);

    CompletableFuture<UpdateTicketResponse> updateTicket(UpdateTicketRequest request);

    CompletableFuture<WithdrawTicketResponse> withdrawTicket(WithdrawTicketRequest request);

}
