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

    /**
     * @param request the request parameters of AbortCampaign  AbortCampaignRequest
     * @return AbortCampaignResponse
     */
    CompletableFuture<AbortCampaignResponse> abortCampaign(AbortCampaignRequest request);

    /**
     * @param request the request parameters of AcceptChat  AcceptChatRequest
     * @return AcceptChatResponse
     */
    CompletableFuture<AcceptChatResponse> acceptChat(AcceptChatRequest request);

    /**
     * @param request the request parameters of AddBlacklistCallTagging  AddBlacklistCallTaggingRequest
     * @return AddBlacklistCallTaggingResponse
     */
    CompletableFuture<AddBlacklistCallTaggingResponse> addBlacklistCallTagging(AddBlacklistCallTaggingRequest request);

    /**
     * @param request the request parameters of AddCases  AddCasesRequest
     * @return AddCasesResponse
     */
    CompletableFuture<AddCasesResponse> addCases(AddCasesRequest request);

    /**
     * @param request the request parameters of AddNumbersToSkillGroup  AddNumbersToSkillGroupRequest
     * @return AddNumbersToSkillGroupResponse
     */
    CompletableFuture<AddNumbersToSkillGroupResponse> addNumbersToSkillGroup(AddNumbersToSkillGroupRequest request);

    /**
     * @param request the request parameters of AddPersonalNumbersToUser  AddPersonalNumbersToUserRequest
     * @return AddPersonalNumbersToUserResponse
     */
    CompletableFuture<AddPersonalNumbersToUserResponse> addPersonalNumbersToUser(AddPersonalNumbersToUserRequest request);

    /**
     * @param request the request parameters of AddPhoneNumberToSkillGroups  AddPhoneNumberToSkillGroupsRequest
     * @return AddPhoneNumberToSkillGroupsResponse
     */
    CompletableFuture<AddPhoneNumberToSkillGroupsResponse> addPhoneNumberToSkillGroups(AddPhoneNumberToSkillGroupsRequest request);

    /**
     * @param request the request parameters of AddPhoneNumbers  AddPhoneNumbersRequest
     * @return AddPhoneNumbersResponse
     */
    CompletableFuture<AddPhoneNumbersResponse> addPhoneNumbers(AddPhoneNumbersRequest request);

    /**
     * @param request the request parameters of AddSchemaProperty  AddSchemaPropertyRequest
     * @return AddSchemaPropertyResponse
     */
    CompletableFuture<AddSchemaPropertyResponse> addSchemaProperty(AddSchemaPropertyRequest request);

    /**
     * @param request the request parameters of AddSkillGroupsToUser  AddSkillGroupsToUserRequest
     * @return AddSkillGroupsToUserResponse
     */
    CompletableFuture<AddSkillGroupsToUserResponse> addSkillGroupsToUser(AddSkillGroupsToUserRequest request);

    /**
     * @param request the request parameters of AddTicketTask  AddTicketTaskRequest
     * @return AddTicketTaskResponse
     */
    CompletableFuture<AddTicketTaskResponse> addTicketTask(AddTicketTaskRequest request);

    /**
     * @param request the request parameters of AddUsersToSkillGroup  AddUsersToSkillGroupRequest
     * @return AddUsersToSkillGroupResponse
     */
    CompletableFuture<AddUsersToSkillGroupResponse> addUsersToSkillGroup(AddUsersToSkillGroupRequest request);

    /**
     * @param request the request parameters of AnalyzeConversation  AnalyzeConversationRequest
     * @return AnalyzeConversationResponse
     */
    CompletableFuture<AnalyzeConversationResponse> analyzeConversation(AnalyzeConversationRequest request);

    /**
     * @param request the request parameters of AnswerCall  AnswerCallRequest
     * @return AnswerCallResponse
     */
    CompletableFuture<AnswerCallResponse> answerCall(AnswerCallRequest request);

    /**
     * @param request the request parameters of AppendCases  AppendCasesRequest
     * @return AppendCasesResponse
     */
    CompletableFuture<AppendCasesResponse> appendCases(AppendCasesRequest request);

    /**
     * @deprecated OpenAPI AssignUsers is deprecated, please use CCC::2020-07-01::ImportRamUsers instead.  * @param request  the request parameters of AssignUsers  AssignUsersRequest
     * @return AssignUsersResponse
     */
    @Deprecated
    CompletableFuture<AssignUsersResponse> assignUsers(AssignUsersRequest request);

    /**
     * @param request the request parameters of BargeInCall  BargeInCallRequest
     * @return BargeInCallResponse
     */
    CompletableFuture<BargeInCallResponse> bargeInCall(BargeInCallRequest request);

    /**
     * @param request the request parameters of BlindTransfer  BlindTransferRequest
     * @return BlindTransferResponse
     */
    CompletableFuture<BlindTransferResponse> blindTransfer(BlindTransferRequest request);

    /**
     * @param request the request parameters of BridgeRtcCall  BridgeRtcCallRequest
     * @return BridgeRtcCallResponse
     */
    CompletableFuture<BridgeRtcCallResponse> bridgeRtcCall(BridgeRtcCallRequest request);

    /**
     * @param request the request parameters of CancelAttendedTransfer  CancelAttendedTransferRequest
     * @return CancelAttendedTransferResponse
     */
    CompletableFuture<CancelAttendedTransferResponse> cancelAttendedTransfer(CancelAttendedTransferRequest request);

    /**
     * @param request the request parameters of ChangeVisibility  ChangeVisibilityRequest
     * @return ChangeVisibilityResponse
     */
    CompletableFuture<ChangeVisibilityResponse> changeVisibility(ChangeVisibilityRequest request);

    /**
     * @param request the request parameters of ChangeWorkMode  ChangeWorkModeRequest
     * @return ChangeWorkModeResponse
     */
    CompletableFuture<ChangeWorkModeResponse> changeWorkMode(ChangeWorkModeRequest request);

    /**
     * @param request the request parameters of ClaimChat  ClaimChatRequest
     * @return ClaimChatResponse
     */
    CompletableFuture<ClaimChatResponse> claimChat(ClaimChatRequest request);

    /**
     * @param request the request parameters of CoachCall  CoachCallRequest
     * @return CoachCallResponse
     */
    CompletableFuture<CoachCallResponse> coachCall(CoachCallRequest request);

    /**
     * @param request the request parameters of CommitContactFlow  CommitContactFlowRequest
     * @return CommitContactFlowResponse
     */
    CompletableFuture<CommitContactFlowResponse> commitContactFlow(CommitContactFlowRequest request);

    /**
     * @param request the request parameters of CompleteAttendedTransfer  CompleteAttendedTransferRequest
     * @return CompleteAttendedTransferResponse
     */
    CompletableFuture<CompleteAttendedTransferResponse> completeAttendedTransfer(CompleteAttendedTransferRequest request);

    /**
     * @param request the request parameters of CreateAudioFile  CreateAudioFileRequest
     * @return CreateAudioFileResponse
     */
    CompletableFuture<CreateAudioFileResponse> createAudioFile(CreateAudioFileRequest request);

    /**
     * @param request the request parameters of CreateCallTags  CreateCallTagsRequest
     * @return CreateCallTagsResponse
     */
    CompletableFuture<CreateCallTagsResponse> createCallTags(CreateCallTagsRequest request);

    /**
     * @param request the request parameters of CreateCampaign  CreateCampaignRequest
     * @return CreateCampaignResponse
     */
    CompletableFuture<CreateCampaignResponse> createCampaign(CreateCampaignRequest request);

    /**
     * @param request the request parameters of CreateContactFlow  CreateContactFlowRequest
     * @return CreateContactFlowResponse
     */
    CompletableFuture<CreateContactFlowResponse> createContactFlow(CreateContactFlowRequest request);

    /**
     * @deprecated OpenAPI CreateCustomCallTagging is deprecated, please use CCC::2020-07-01::CreateCustomCallTaggings instead.  * @param request  the request parameters of CreateCustomCallTagging  CreateCustomCallTaggingRequest
     * @return CreateCustomCallTaggingResponse
     */
    @Deprecated
    CompletableFuture<CreateCustomCallTaggingResponse> createCustomCallTagging(CreateCustomCallTaggingRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateSchema  CreateSchemaRequest
     * @return CreateSchemaResponse
     */
    CompletableFuture<CreateSchemaResponse> createSchema(CreateSchemaRequest request);

    /**
     * @param request the request parameters of CreateSkillGroup  CreateSkillGroupRequest
     * @return CreateSkillGroupResponse
     */
    CompletableFuture<CreateSkillGroupResponse> createSkillGroup(CreateSkillGroupRequest request);

    /**
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * @param request the request parameters of DeleteAudioFile  DeleteAudioFileRequest
     * @return DeleteAudioFileResponse
     */
    CompletableFuture<DeleteAudioFileResponse> deleteAudioFile(DeleteAudioFileRequest request);

    /**
     * @param request the request parameters of DeleteCallTag  DeleteCallTagRequest
     * @return DeleteCallTagResponse
     */
    CompletableFuture<DeleteCallTagResponse> deleteCallTag(DeleteCallTagRequest request);

    /**
     * @param request the request parameters of DeleteContactFlow  DeleteContactFlowRequest
     * @return DeleteContactFlowResponse
     */
    CompletableFuture<DeleteContactFlowResponse> deleteContactFlow(DeleteContactFlowRequest request);

    /**
     * @param request the request parameters of DeleteCustomCallTagging  DeleteCustomCallTaggingRequest
     * @return DeleteCustomCallTaggingResponse
     */
    CompletableFuture<DeleteCustomCallTaggingResponse> deleteCustomCallTagging(DeleteCustomCallTaggingRequest request);

    /**
     * @param request the request parameters of DeleteDocument  DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    CompletableFuture<DeleteDocumentResponse> deleteDocument(DeleteDocumentRequest request);

    /**
     * @param request the request parameters of DeleteDocuments  DeleteDocumentsRequest
     * @return DeleteDocumentsResponse
     */
    CompletableFuture<DeleteDocumentsResponse> deleteDocuments(DeleteDocumentsRequest request);

    /**
     * @param request the request parameters of DeleteSchema  DeleteSchemaRequest
     * @return DeleteSchemaResponse
     */
    CompletableFuture<DeleteSchemaResponse> deleteSchema(DeleteSchemaRequest request);

    /**
     * @param request the request parameters of DeleteSchemaProperty  DeleteSchemaPropertyRequest
     * @return DeleteSchemaPropertyResponse
     */
    CompletableFuture<DeleteSchemaPropertyResponse> deleteSchemaProperty(DeleteSchemaPropertyRequest request);

    /**
     * @param request the request parameters of DeleteSkillGroup  DeleteSkillGroupRequest
     * @return DeleteSkillGroupResponse
     */
    CompletableFuture<DeleteSkillGroupResponse> deleteSkillGroup(DeleteSkillGroupRequest request);

    /**
     * @param request the request parameters of DeleteTicket  DeleteTicketRequest
     * @return DeleteTicketResponse
     */
    CompletableFuture<DeleteTicketResponse> deleteTicket(DeleteTicketRequest request);

    /**
     * @param request the request parameters of DeleteTicketTemplate  DeleteTicketTemplateRequest
     * @return DeleteTicketTemplateResponse
     */
    CompletableFuture<DeleteTicketTemplateResponse> deleteTicketTemplate(DeleteTicketTemplateRequest request);

    /**
     * @param request the request parameters of DisableSchemaProperty  DisableSchemaPropertyRequest
     * @return DisableSchemaPropertyResponse
     */
    CompletableFuture<DisableSchemaPropertyResponse> disableSchemaProperty(DisableSchemaPropertyRequest request);

    /**
     * @param request the request parameters of DisableTicketTemplate  DisableTicketTemplateRequest
     * @return DisableTicketTemplateResponse
     */
    CompletableFuture<DisableTicketTemplateResponse> disableTicketTemplate(DisableTicketTemplateRequest request);

    /**
     * @param request the request parameters of DiscardEditingContactFlow  DiscardEditingContactFlowRequest
     * @return DiscardEditingContactFlowResponse
     */
    CompletableFuture<DiscardEditingContactFlowResponse> discardEditingContactFlow(DiscardEditingContactFlowRequest request);

    /**
     * @param request the request parameters of EnableSchemaProperty  EnableSchemaPropertyRequest
     * @return EnableSchemaPropertyResponse
     */
    CompletableFuture<EnableSchemaPropertyResponse> enableSchemaProperty(EnableSchemaPropertyRequest request);

    /**
     * @param request the request parameters of EnableTicketTemplate  EnableTicketTemplateRequest
     * @return EnableTicketTemplateResponse
     */
    CompletableFuture<EnableTicketTemplateResponse> enableTicketTemplate(EnableTicketTemplateRequest request);

    /**
     * @param request the request parameters of EndConference  EndConferenceRequest
     * @return EndConferenceResponse
     */
    CompletableFuture<EndConferenceResponse> endConference(EndConferenceRequest request);

    /**
     * @deprecated OpenAPI ExportCustomCallTagging is deprecated, please use CCC::2020-07-01::ExportCustomCallTaggings instead.  * @param request  the request parameters of ExportCustomCallTagging  ExportCustomCallTaggingRequest
     * @return ExportCustomCallTaggingResponse
     */
    @Deprecated
    CompletableFuture<ExportCustomCallTaggingResponse> exportCustomCallTagging(ExportCustomCallTaggingRequest request);

    /**
     * @param request the request parameters of ExportDoNotCallNumbers  ExportDoNotCallNumbersRequest
     * @return ExportDoNotCallNumbersResponse
     */
    CompletableFuture<ExportDoNotCallNumbersResponse> exportDoNotCallNumbers(ExportDoNotCallNumbersRequest request);

    /**
     * @param request the request parameters of FinishTicketTask  FinishTicketTaskRequest
     * @return FinishTicketTaskResponse
     */
    CompletableFuture<FinishTicketTaskResponse> finishTicketTask(FinishTicketTaskRequest request);

    /**
     * @param request the request parameters of GetAccessChannelOfStaging  GetAccessChannelOfStagingRequest
     * @return GetAccessChannelOfStagingResponse
     */
    CompletableFuture<GetAccessChannelOfStagingResponse> getAccessChannelOfStaging(GetAccessChannelOfStagingRequest request);

    /**
     * @param request the request parameters of GetAudioFile  GetAudioFileRequest
     * @return GetAudioFileResponse
     */
    CompletableFuture<GetAudioFileResponse> getAudioFile(GetAudioFileRequest request);

    /**
     * @param request the request parameters of GetAudioFileDownloadUrl  GetAudioFileDownloadUrlRequest
     * @return GetAudioFileDownloadUrlResponse
     */
    CompletableFuture<GetAudioFileDownloadUrlResponse> getAudioFileDownloadUrl(GetAudioFileDownloadUrlRequest request);

    /**
     * @param request the request parameters of GetAudioFileUploadParameters  GetAudioFileUploadParametersRequest
     * @return GetAudioFileUploadParametersResponse
     */
    CompletableFuture<GetAudioFileUploadParametersResponse> getAudioFileUploadParameters(GetAudioFileUploadParametersRequest request);

    /**
     * @param request the request parameters of GetCallDetailRecord  GetCallDetailRecordRequest
     * @return GetCallDetailRecordResponse
     */
    CompletableFuture<GetCallDetailRecordResponse> getCallDetailRecord(GetCallDetailRecordRequest request);

    /**
     * @param request the request parameters of GetCampaign  GetCampaignRequest
     * @return GetCampaignResponse
     */
    CompletableFuture<GetCampaignResponse> getCampaign(GetCampaignRequest request);

    /**
     * @param request the request parameters of GetCaseFileUploadUrl  GetCaseFileUploadUrlRequest
     * @return GetCaseFileUploadUrlResponse
     */
    CompletableFuture<GetCaseFileUploadUrlResponse> getCaseFileUploadUrl(GetCaseFileUploadUrlRequest request);

    /**
     * @param request the request parameters of GetChatMediaUrl  GetChatMediaUrlRequest
     * @return GetChatMediaUrlResponse
     */
    CompletableFuture<GetChatMediaUrlResponse> getChatMediaUrl(GetChatMediaUrlRequest request);

    /**
     * @param request the request parameters of GetChatRoutingProfile  GetChatRoutingProfileRequest
     * @return GetChatRoutingProfileResponse
     */
    CompletableFuture<GetChatRoutingProfileResponse> getChatRoutingProfile(GetChatRoutingProfileRequest request);

    /**
     * @param request the request parameters of GetContactFlow  GetContactFlowRequest
     * @return GetContactFlowResponse
     */
    CompletableFuture<GetContactFlowResponse> getContactFlow(GetContactFlowRequest request);

    /**
     * @param request the request parameters of GetConversationDetail  GetConversationDetailRequest
     * @return GetConversationDetailResponse
     */
    CompletableFuture<GetConversationDetailResponse> getConversationDetail(GetConversationDetailRequest request);

    /**
     * @param request the request parameters of GetDataChannelCredentials  GetDataChannelCredentialsRequest
     * @return GetDataChannelCredentialsResponse
     */
    CompletableFuture<GetDataChannelCredentialsResponse> getDataChannelCredentials(GetDataChannelCredentialsRequest request);

    /**
     * @param request the request parameters of GetDoNotCallFileUploadParameters  GetDoNotCallFileUploadParametersRequest
     * @return GetDoNotCallFileUploadParametersResponse
     */
    CompletableFuture<GetDoNotCallFileUploadParametersResponse> getDoNotCallFileUploadParameters(GetDoNotCallFileUploadParametersRequest request);

    /**
     * @param request the request parameters of GetDocumentUploadParameters  GetDocumentUploadParametersRequest
     * @return GetDocumentUploadParametersResponse
     */
    CompletableFuture<GetDocumentUploadParametersResponse> getDocumentUploadParameters(GetDocumentUploadParametersRequest request);

    /**
     * @param request the request parameters of GetEarlyMediaRecording  GetEarlyMediaRecordingRequest
     * @return GetEarlyMediaRecordingResponse
     */
    CompletableFuture<GetEarlyMediaRecordingResponse> getEarlyMediaRecording(GetEarlyMediaRecordingRequest request);

    /**
     * @param request the request parameters of GetHistoricalCallerReport  GetHistoricalCallerReportRequest
     * @return GetHistoricalCallerReportResponse
     */
    CompletableFuture<GetHistoricalCallerReportResponse> getHistoricalCallerReport(GetHistoricalCallerReportRequest request);

    /**
     * @param request the request parameters of GetHistoricalCampaignReport  GetHistoricalCampaignReportRequest
     * @return GetHistoricalCampaignReportResponse
     */
    CompletableFuture<GetHistoricalCampaignReportResponse> getHistoricalCampaignReport(GetHistoricalCampaignReportRequest request);

    /**
     * @param request the request parameters of GetHistoricalInstanceReport  GetHistoricalInstanceReportRequest
     * @return GetHistoricalInstanceReportResponse
     */
    CompletableFuture<GetHistoricalInstanceReportResponse> getHistoricalInstanceReport(GetHistoricalInstanceReportRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetInstanceTrendingReport  GetInstanceTrendingReportRequest
     * @return GetInstanceTrendingReportResponse
     */
    CompletableFuture<GetInstanceTrendingReportResponse> getInstanceTrendingReport(GetInstanceTrendingReportRequest request);

    /**
     * @param request the request parameters of GetIvrTrackingSummary  GetIvrTrackingSummaryRequest
     * @return GetIvrTrackingSummaryResponse
     */
    CompletableFuture<GetIvrTrackingSummaryResponse> getIvrTrackingSummary(GetIvrTrackingSummaryRequest request);

    /**
     * @param request the request parameters of GetLoginDetails  GetLoginDetailsRequest
     * @return GetLoginDetailsResponse
     */
    CompletableFuture<GetLoginDetailsResponse> getLoginDetails(GetLoginDetailsRequest request);

    /**
     * @param request the request parameters of GetMonoRecording  GetMonoRecordingRequest
     * @return GetMonoRecordingResponse
     */
    CompletableFuture<GetMonoRecordingResponse> getMonoRecording(GetMonoRecordingRequest request);

    /**
     * @param request the request parameters of GetMultiChannelRecording  GetMultiChannelRecordingRequest
     * @return GetMultiChannelRecordingResponse
     */
    CompletableFuture<GetMultiChannelRecordingResponse> getMultiChannelRecording(GetMultiChannelRecordingRequest request);

    /**
     * @param request the request parameters of GetNumberLocation  GetNumberLocationRequest
     * @return GetNumberLocationResponse
     */
    CompletableFuture<GetNumberLocationResponse> getNumberLocation(GetNumberLocationRequest request);

    /**
     * @param request the request parameters of GetRealtimeCampaignStats  GetRealtimeCampaignStatsRequest
     * @return GetRealtimeCampaignStatsResponse
     */
    CompletableFuture<GetRealtimeCampaignStatsResponse> getRealtimeCampaignStats(GetRealtimeCampaignStatsRequest request);

    /**
     * @param request the request parameters of GetRealtimeInstanceStates  GetRealtimeInstanceStatesRequest
     * @return GetRealtimeInstanceStatesResponse
     */
    CompletableFuture<GetRealtimeInstanceStatesResponse> getRealtimeInstanceStates(GetRealtimeInstanceStatesRequest request);

    /**
     * @param request the request parameters of GetSchema  GetSchemaRequest
     * @return GetSchemaResponse
     */
    CompletableFuture<GetSchemaResponse> getSchema(GetSchemaRequest request);

    /**
     * @param request the request parameters of GetSkillGroup  GetSkillGroupRequest
     * @return GetSkillGroupResponse
     */
    CompletableFuture<GetSkillGroupResponse> getSkillGroup(GetSkillGroupRequest request);

    /**
     * @param request the request parameters of GetTicket  GetTicketRequest
     * @return GetTicketResponse
     */
    CompletableFuture<GetTicketResponse> getTicket(GetTicketRequest request);

    /**
     * @param request the request parameters of GetTicketSummaryReport  GetTicketSummaryReportRequest
     * @return GetTicketSummaryReportResponse
     */
    CompletableFuture<GetTicketSummaryReportResponse> getTicketSummaryReport(GetTicketSummaryReportRequest request);

    /**
     * @param request the request parameters of GetTicketTemplate  GetTicketTemplateRequest
     * @return GetTicketTemplateResponse
     */
    CompletableFuture<GetTicketTemplateResponse> getTicketTemplate(GetTicketTemplateRequest request);

    /**
     * @param request the request parameters of GetTurnCredentials  GetTurnCredentialsRequest
     * @return GetTurnCredentialsResponse
     */
    CompletableFuture<GetTurnCredentialsResponse> getTurnCredentials(GetTurnCredentialsRequest request);

    /**
     * @param request the request parameters of GetTurnServerList  GetTurnServerListRequest
     * @return GetTurnServerListResponse
     */
    CompletableFuture<GetTurnServerListResponse> getTurnServerList(GetTurnServerListRequest request);

    /**
     * @param request the request parameters of GetUploadAudioDataParams  GetUploadAudioDataParamsRequest
     * @return GetUploadAudioDataParamsResponse
     */
    CompletableFuture<GetUploadAudioDataParamsResponse> getUploadAudioDataParams(GetUploadAudioDataParamsRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of GetVideo  GetVideoRequest
     * @return GetVideoResponse
     */
    CompletableFuture<GetVideoResponse> getVideo(GetVideoRequest request);

    /**
     * @param request the request parameters of GetVisitorLoginDetails  GetVisitorLoginDetailsRequest
     * @return GetVisitorLoginDetailsResponse
     */
    CompletableFuture<GetVisitorLoginDetailsResponse> getVisitorLoginDetails(GetVisitorLoginDetailsRequest request);

    /**
     * @param request the request parameters of GetVoicemailRecording  GetVoicemailRecordingRequest
     * @return GetVoicemailRecordingResponse
     */
    CompletableFuture<GetVoicemailRecordingResponse> getVoicemailRecording(GetVoicemailRecordingRequest request);

    /**
     * @param request the request parameters of HoldCall  HoldCallRequest
     * @return HoldCallResponse
     */
    CompletableFuture<HoldCallResponse> holdCall(HoldCallRequest request);

    /**
     * @param request the request parameters of ImportAdmins  ImportAdminsRequest
     * @return ImportAdminsResponse
     */
    CompletableFuture<ImportAdminsResponse> importAdmins(ImportAdminsRequest request);

    /**
     * @param request the request parameters of ImportCorpNumbers  ImportCorpNumbersRequest
     * @return ImportCorpNumbersResponse
     */
    CompletableFuture<ImportCorpNumbersResponse> importCorpNumbers(ImportCorpNumbersRequest request);

    /**
     * @deprecated OpenAPI ImportCustomCallTagging is deprecated, please use CCC::2020-07-01::ImportCustomCallTaggings instead.  * @param request  the request parameters of ImportCustomCallTagging  ImportCustomCallTaggingRequest
     * @return ImportCustomCallTaggingResponse
     */
    @Deprecated
    CompletableFuture<ImportCustomCallTaggingResponse> importCustomCallTagging(ImportCustomCallTaggingRequest request);

    /**
     * @param request the request parameters of ImportDoNotCallNumbers  ImportDoNotCallNumbersRequest
     * @return ImportDoNotCallNumbersResponse
     */
    CompletableFuture<ImportDoNotCallNumbersResponse> importDoNotCallNumbers(ImportDoNotCallNumbersRequest request);

    /**
     * @param request the request parameters of ImportDocuments  ImportDocumentsRequest
     * @return ImportDocumentsResponse
     */
    CompletableFuture<ImportDocumentsResponse> importDocuments(ImportDocumentsRequest request);

    /**
     * @param request the request parameters of InitiateAttendedTransfer  InitiateAttendedTransferRequest
     * @return InitiateAttendedTransferResponse
     */
    CompletableFuture<InitiateAttendedTransferResponse> initiateAttendedTransfer(InitiateAttendedTransferRequest request);

    /**
     * @param request the request parameters of InterceptCall  InterceptCallRequest
     * @return InterceptCallResponse
     */
    CompletableFuture<InterceptCallResponse> interceptCall(InterceptCallRequest request);

    /**
     * @param request the request parameters of LaunchAuthentication  LaunchAuthenticationRequest
     * @return LaunchAuthenticationResponse
     */
    CompletableFuture<LaunchAuthenticationResponse> launchAuthentication(LaunchAuthenticationRequest request);

    /**
     * @param request the request parameters of LaunchSurvey  LaunchSurveyRequest
     * @return LaunchSurveyResponse
     */
    CompletableFuture<LaunchSurveyResponse> launchSurvey(LaunchSurveyRequest request);

    /**
     * @param request the request parameters of ListAgentStateLogs  ListAgentStateLogsRequest
     * @return ListAgentStateLogsResponse
     */
    CompletableFuture<ListAgentStateLogsResponse> listAgentStateLogs(ListAgentStateLogsRequest request);

    /**
     * @deprecated OpenAPI ListAgentStates is deprecated, please use CCC::2020-07-01::ListRealtimeAgentStates instead.  * @param request  the request parameters of ListAgentStates  ListAgentStatesRequest
     * @return ListAgentStatesResponse
     */
    @Deprecated
    CompletableFuture<ListAgentStatesResponse> listAgentStates(ListAgentStatesRequest request);

    /**
     * @deprecated OpenAPI ListAgentSummaryReportsSinceMidnight is deprecated, please use CCC::2020-07-01::ListHistoricalAgentReport instead.  * @param request  the request parameters of ListAgentSummaryReportsSinceMidnight  ListAgentSummaryReportsSinceMidnightRequest
     * @return ListAgentSummaryReportsSinceMidnightResponse
     */
    @Deprecated
    CompletableFuture<ListAgentSummaryReportsSinceMidnightResponse> listAgentSummaryReportsSinceMidnight(ListAgentSummaryReportsSinceMidnightRequest request);

    /**
     * @param request the request parameters of ListAttempts  ListAttemptsRequest
     * @return ListAttemptsResponse
     */
    CompletableFuture<ListAttemptsResponse> listAttempts(ListAttemptsRequest request);

    /**
     * @param request the request parameters of ListAudioFiles  ListAudioFilesRequest
     * @return ListAudioFilesResponse
     */
    CompletableFuture<ListAudioFilesResponse> listAudioFiles(ListAudioFilesRequest request);

    /**
     * @param request the request parameters of ListBlacklistCallTaggings  ListBlacklistCallTaggingsRequest
     * @return ListBlacklistCallTaggingsResponse
     */
    CompletableFuture<ListBlacklistCallTaggingsResponse> listBlacklistCallTaggings(ListBlacklistCallTaggingsRequest request);

    /**
     * @param request the request parameters of ListBriefSkillGroups  ListBriefSkillGroupsRequest
     * @return ListBriefSkillGroupsResponse
     */
    CompletableFuture<ListBriefSkillGroupsResponse> listBriefSkillGroups(ListBriefSkillGroupsRequest request);

    /**
     * @param request the request parameters of ListCallDetailRecords  ListCallDetailRecordsRequest
     * @return ListCallDetailRecordsResponse
     */
    CompletableFuture<ListCallDetailRecordsResponse> listCallDetailRecords(ListCallDetailRecordsRequest request);

    /**
     * @param request the request parameters of ListCallDetailRecordsV2  ListCallDetailRecordsV2Request
     * @return ListCallDetailRecordsV2Response
     */
    CompletableFuture<ListCallDetailRecordsV2Response> listCallDetailRecordsV2(ListCallDetailRecordsV2Request request);

    /**
     * @param request the request parameters of ListCallSummaries  ListCallSummariesRequest
     * @return ListCallSummariesResponse
     */
    CompletableFuture<ListCallSummariesResponse> listCallSummaries(ListCallSummariesRequest request);

    /**
     * @param request the request parameters of ListCallTags  ListCallTagsRequest
     * @return ListCallTagsResponse
     */
    CompletableFuture<ListCallTagsResponse> listCallTags(ListCallTagsRequest request);

    /**
     * @param request the request parameters of ListCampaignTrendingReport  ListCampaignTrendingReportRequest
     * @return ListCampaignTrendingReportResponse
     */
    CompletableFuture<ListCampaignTrendingReportResponse> listCampaignTrendingReport(ListCampaignTrendingReportRequest request);

    /**
     * @param request the request parameters of ListCampaigns  ListCampaignsRequest
     * @return ListCampaignsResponse
     */
    CompletableFuture<ListCampaignsResponse> listCampaigns(ListCampaignsRequest request);

    /**
     * @param request the request parameters of ListCases  ListCasesRequest
     * @return ListCasesResponse
     */
    CompletableFuture<ListCasesResponse> listCases(ListCasesRequest request);

    /**
     * @param request the request parameters of ListCategories  ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request);

    /**
     * @param request the request parameters of ListCommonTicketFields  ListCommonTicketFieldsRequest
     * @return ListCommonTicketFieldsResponse
     */
    CompletableFuture<ListCommonTicketFieldsResponse> listCommonTicketFields(ListCommonTicketFieldsRequest request);

    /**
     * @param request the request parameters of ListConfigItems  ListConfigItemsRequest
     * @return ListConfigItemsResponse
     */
    CompletableFuture<ListConfigItemsResponse> listConfigItems(ListConfigItemsRequest request);

    /**
     * @param request the request parameters of ListContactFlows  ListContactFlowsRequest
     * @return ListContactFlowsResponse
     */
    CompletableFuture<ListContactFlowsResponse> listContactFlows(ListContactFlowsRequest request);

    /**
     * @deprecated OpenAPI ListCustomCallTagging is deprecated, please use CCC::2020-07-01::ListCustomCallTaggings instead.  * @param request  the request parameters of ListCustomCallTagging  ListCustomCallTaggingRequest
     * @return ListCustomCallTaggingResponse
     */
    @Deprecated
    CompletableFuture<ListCustomCallTaggingResponse> listCustomCallTagging(ListCustomCallTaggingRequest request);

    /**
     * @param request the request parameters of ListDevices  ListDevicesRequest
     * @return ListDevicesResponse
     */
    CompletableFuture<ListDevicesResponse> listDevices(ListDevicesRequest request);

    /**
     * @param request the request parameters of ListDoNotCallNumbers  ListDoNotCallNumbersRequest
     * @return ListDoNotCallNumbersResponse
     */
    CompletableFuture<ListDoNotCallNumbersResponse> listDoNotCallNumbers(ListDoNotCallNumbersRequest request);

    /**
     * @param request the request parameters of ListDocuments  ListDocumentsRequest
     * @return ListDocumentsResponse
     */
    CompletableFuture<ListDocumentsResponse> listDocuments(ListDocumentsRequest request);

    /**
     * @param request the request parameters of ListFlashSmsApplications  ListFlashSmsApplicationsRequest
     * @return ListFlashSmsApplicationsResponse
     */
    CompletableFuture<ListFlashSmsApplicationsResponse> listFlashSmsApplications(ListFlashSmsApplicationsRequest request);

    /**
     * @param request the request parameters of ListFlashSmsTemplates  ListFlashSmsTemplatesRequest
     * @return ListFlashSmsTemplatesResponse
     */
    CompletableFuture<ListFlashSmsTemplatesResponse> listFlashSmsTemplates(ListFlashSmsTemplatesRequest request);

    /**
     * @param request the request parameters of ListGroupChatMessages  ListGroupChatMessagesRequest
     * @return ListGroupChatMessagesResponse
     */
    CompletableFuture<ListGroupChatMessagesResponse> listGroupChatMessages(ListGroupChatMessagesRequest request);

    /**
     * @param request the request parameters of ListHistoricalAgentReport  ListHistoricalAgentReportRequest
     * @return ListHistoricalAgentReportResponse
     */
    CompletableFuture<ListHistoricalAgentReportResponse> listHistoricalAgentReport(ListHistoricalAgentReportRequest request);

    /**
     * @param request the request parameters of ListHistoricalAgentSkillGroupReport  ListHistoricalAgentSkillGroupReportRequest
     * @return ListHistoricalAgentSkillGroupReportResponse
     */
    CompletableFuture<ListHistoricalAgentSkillGroupReportResponse> listHistoricalAgentSkillGroupReport(ListHistoricalAgentSkillGroupReportRequest request);

    /**
     * @param request the request parameters of ListHistoricalSkillGroupReport  ListHistoricalSkillGroupReportRequest
     * @return ListHistoricalSkillGroupReportResponse
     */
    CompletableFuture<ListHistoricalSkillGroupReportResponse> listHistoricalSkillGroupReport(ListHistoricalSkillGroupReportRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListInstancesOfUser  ListInstancesOfUserRequest
     * @return ListInstancesOfUserResponse
     */
    CompletableFuture<ListInstancesOfUserResponse> listInstancesOfUser(ListInstancesOfUserRequest request);

    /**
     * @param request the request parameters of ListIntervalAgentReport  ListIntervalAgentReportRequest
     * @return ListIntervalAgentReportResponse
     */
    CompletableFuture<ListIntervalAgentReportResponse> listIntervalAgentReport(ListIntervalAgentReportRequest request);

    /**
     * @param request the request parameters of ListIntervalAgentSkillGroupReport  ListIntervalAgentSkillGroupReportRequest
     * @return ListIntervalAgentSkillGroupReportResponse
     */
    CompletableFuture<ListIntervalAgentSkillGroupReportResponse> listIntervalAgentSkillGroupReport(ListIntervalAgentSkillGroupReportRequest request);

    /**
     * @param request the request parameters of ListIntervalInstanceReport  ListIntervalInstanceReportRequest
     * @return ListIntervalInstanceReportResponse
     */
    CompletableFuture<ListIntervalInstanceReportResponse> listIntervalInstanceReport(ListIntervalInstanceReportRequest request);

    /**
     * @param request the request parameters of ListIntervalSkillGroupReport  ListIntervalSkillGroupReportRequest
     * @return ListIntervalSkillGroupReportResponse
     */
    CompletableFuture<ListIntervalSkillGroupReportResponse> listIntervalSkillGroupReport(ListIntervalSkillGroupReportRequest request);

    /**
     * @param request the request parameters of ListIvrTrackingDetails  ListIvrTrackingDetailsRequest
     * @return ListIvrTrackingDetailsResponse
     */
    CompletableFuture<ListIvrTrackingDetailsResponse> listIvrTrackingDetails(ListIvrTrackingDetailsRequest request);

    /**
     * @deprecated OpenAPI ListLegacyAgentEventLogs is deprecated, please use CCC::2020-07-01::ListAgentStateLogs instead.  * @param request  the request parameters of ListLegacyAgentEventLogs  ListLegacyAgentEventLogsRequest
     * @return ListLegacyAgentEventLogsResponse
     */
    @Deprecated
    CompletableFuture<ListLegacyAgentEventLogsResponse> listLegacyAgentEventLogs(ListLegacyAgentEventLogsRequest request);

    /**
     * @deprecated OpenAPI ListLegacyAgentStatusLogs is deprecated, please use CCC::2020-07-01::ListAgentStateLogs instead.  * @param request  the request parameters of ListLegacyAgentStatusLogs  ListLegacyAgentStatusLogsRequest
     * @return ListLegacyAgentStatusLogsResponse
     */
    @Deprecated
    CompletableFuture<ListLegacyAgentStatusLogsResponse> listLegacyAgentStatusLogs(ListLegacyAgentStatusLogsRequest request);

    /**
     * @param request the request parameters of ListLegacyAppraiseLogs  ListLegacyAppraiseLogsRequest
     * @return ListLegacyAppraiseLogsResponse
     */
    CompletableFuture<ListLegacyAppraiseLogsResponse> listLegacyAppraiseLogs(ListLegacyAppraiseLogsRequest request);

    /**
     * @param request the request parameters of ListLegacyQueueEventLogs  ListLegacyQueueEventLogsRequest
     * @return ListLegacyQueueEventLogsResponse
     */
    CompletableFuture<ListLegacyQueueEventLogsResponse> listLegacyQueueEventLogs(ListLegacyQueueEventLogsRequest request);

    /**
     * @param request the request parameters of ListMonoRecordings  ListMonoRecordingsRequest
     * @return ListMonoRecordingsResponse
     */
    CompletableFuture<ListMonoRecordingsResponse> listMonoRecordings(ListMonoRecordingsRequest request);

    /**
     * @param request the request parameters of ListMultiChannelRecordings  ListMultiChannelRecordingsRequest
     * @return ListMultiChannelRecordingsResponse
     */
    CompletableFuture<ListMultiChannelRecordingsResponse> listMultiChannelRecordings(ListMultiChannelRecordingsRequest request);

    /**
     * @param request the request parameters of ListOutboundNumbersOfUser  ListOutboundNumbersOfUserRequest
     * @return ListOutboundNumbersOfUserResponse
     */
    CompletableFuture<ListOutboundNumbersOfUserResponse> listOutboundNumbersOfUser(ListOutboundNumbersOfUserRequest request);

    /**
     * @param request the request parameters of ListPersonalNumbersOfUser  ListPersonalNumbersOfUserRequest
     * @return ListPersonalNumbersOfUserResponse
     */
    CompletableFuture<ListPersonalNumbersOfUserResponse> listPersonalNumbersOfUser(ListPersonalNumbersOfUserRequest request);

    /**
     * @param request the request parameters of ListPhoneNumbers  ListPhoneNumbersRequest
     * @return ListPhoneNumbersResponse
     */
    CompletableFuture<ListPhoneNumbersResponse> listPhoneNumbers(ListPhoneNumbersRequest request);

    /**
     * @param request the request parameters of ListPhoneNumbersOfSkillGroup  ListPhoneNumbersOfSkillGroupRequest
     * @return ListPhoneNumbersOfSkillGroupResponse
     */
    CompletableFuture<ListPhoneNumbersOfSkillGroupResponse> listPhoneNumbersOfSkillGroup(ListPhoneNumbersOfSkillGroupRequest request);

    /**
     * @param request the request parameters of ListPrivilegesOfUser  ListPrivilegesOfUserRequest
     * @return ListPrivilegesOfUserResponse
     */
    CompletableFuture<ListPrivilegesOfUserResponse> listPrivilegesOfUser(ListPrivilegesOfUserRequest request);

    /**
     * @param request the request parameters of ListRamUsers  ListRamUsersRequest
     * @return ListRamUsersResponse
     */
    CompletableFuture<ListRamUsersResponse> listRamUsers(ListRamUsersRequest request);

    /**
     * @param request the request parameters of ListRealtimeAgentStates  ListRealtimeAgentStatesRequest
     * @return ListRealtimeAgentStatesResponse
     */
    CompletableFuture<ListRealtimeAgentStatesResponse> listRealtimeAgentStates(ListRealtimeAgentStatesRequest request);

    /**
     * @param request the request parameters of ListRealtimeSkillGroupStates  ListRealtimeSkillGroupStatesRequest
     * @return ListRealtimeSkillGroupStatesResponse
     */
    CompletableFuture<ListRealtimeSkillGroupStatesResponse> listRealtimeSkillGroupStates(ListRealtimeSkillGroupStatesRequest request);

    /**
     * @param request the request parameters of ListRecentCallDetailRecords  ListRecentCallDetailRecordsRequest
     * @return ListRecentCallDetailRecordsResponse
     */
    CompletableFuture<ListRecentCallDetailRecordsResponse> listRecentCallDetailRecords(ListRecentCallDetailRecordsRequest request);

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
     * @deprecated OpenAPI ListSkillGroupStates is deprecated, please use CCC::2020-07-01::ListRealtimeSkillGroupStates instead.  * @param request  the request parameters of ListSkillGroupStates  ListSkillGroupStatesRequest
     * @return ListSkillGroupStatesResponse
     */
    @Deprecated
    CompletableFuture<ListSkillGroupStatesResponse> listSkillGroupStates(ListSkillGroupStatesRequest request);

    /**
     * @deprecated OpenAPI ListSkillGroupSummaryReportsSinceMidnight is deprecated, please use CCC::2020-07-01::ListHistoricalSkillGroupReport instead.  * @param request  the request parameters of ListSkillGroupSummaryReportsSinceMidnight  ListSkillGroupSummaryReportsSinceMidnightRequest
     * @return ListSkillGroupSummaryReportsSinceMidnightResponse
     */
    @Deprecated
    CompletableFuture<ListSkillGroupSummaryReportsSinceMidnightResponse> listSkillGroupSummaryReportsSinceMidnight(ListSkillGroupSummaryReportsSinceMidnightRequest request);

    /**
     * @param request the request parameters of ListSkillGroups  ListSkillGroupsRequest
     * @return ListSkillGroupsResponse
     */
    CompletableFuture<ListSkillGroupsResponse> listSkillGroups(ListSkillGroupsRequest request);

    /**
     * @param request the request parameters of ListSkillLevelsOfUser  ListSkillLevelsOfUserRequest
     * @return ListSkillLevelsOfUserResponse
     */
    CompletableFuture<ListSkillLevelsOfUserResponse> listSkillLevelsOfUser(ListSkillLevelsOfUserRequest request);

    /**
     * @param request the request parameters of ListTicketTasks  ListTicketTasksRequest
     * @return ListTicketTasksResponse
     */
    CompletableFuture<ListTicketTasksResponse> listTicketTasks(ListTicketTasksRequest request);

    /**
     * @param request the request parameters of ListTicketTemplates  ListTicketTemplatesRequest
     * @return ListTicketTemplatesResponse
     */
    CompletableFuture<ListTicketTemplatesResponse> listTicketTemplates(ListTicketTemplatesRequest request);

    /**
     * @param request the request parameters of ListTickets  ListTicketsRequest
     * @return ListTicketsResponse
     */
    CompletableFuture<ListTicketsResponse> listTickets(ListTicketsRequest request);

    /**
     * @param request the request parameters of ListUnassignedNumbers  ListUnassignedNumbersRequest
     * @return ListUnassignedNumbersResponse
     */
    CompletableFuture<ListUnassignedNumbersResponse> listUnassignedNumbers(ListUnassignedNumbersRequest request);

    /**
     * @param request the request parameters of ListUserLevelsOfSkillGroup  ListUserLevelsOfSkillGroupRequest
     * @return ListUserLevelsOfSkillGroupResponse
     */
    CompletableFuture<ListUserLevelsOfSkillGroupResponse> listUserLevelsOfSkillGroup(ListUserLevelsOfSkillGroupRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListVoicemails  ListVoicemailsRequest
     * @return ListVoicemailsResponse
     */
    CompletableFuture<ListVoicemailsResponse> listVoicemails(ListVoicemailsRequest request);

    /**
     * @param request the request parameters of ListWaitingChats  ListWaitingChatsRequest
     * @return ListWaitingChatsResponse
     */
    CompletableFuture<ListWaitingChatsResponse> listWaitingChats(ListWaitingChatsRequest request);

    /**
     * @param request the request parameters of MakeCall  MakeCallRequest
     * @return MakeCallResponse
     */
    CompletableFuture<MakeCallResponse> makeCall(MakeCallRequest request);

    /**
     * @param request the request parameters of ModifyAudioFile  ModifyAudioFileRequest
     * @return ModifyAudioFileResponse
     */
    CompletableFuture<ModifyAudioFileResponse> modifyAudioFile(ModifyAudioFileRequest request);

    /**
     * @param request the request parameters of ModifyCustomCallTagging  ModifyCustomCallTaggingRequest
     * @return ModifyCustomCallTaggingResponse
     */
    CompletableFuture<ModifyCustomCallTaggingResponse> modifyCustomCallTagging(ModifyCustomCallTaggingRequest request);

    /**
     * @param request the request parameters of ModifyInstance  ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    /**
     * @param request the request parameters of ModifyPhoneNumber  ModifyPhoneNumberRequest
     * @return ModifyPhoneNumberResponse
     */
    CompletableFuture<ModifyPhoneNumberResponse> modifyPhoneNumber(ModifyPhoneNumberRequest request);

    /**
     * @param request the request parameters of ModifySkillGroup  ModifySkillGroupRequest
     * @return ModifySkillGroupResponse
     */
    CompletableFuture<ModifySkillGroupResponse> modifySkillGroup(ModifySkillGroupRequest request);

    /**
     * @param request the request parameters of ModifySkillLevelsOfUser  ModifySkillLevelsOfUserRequest
     * @return ModifySkillLevelsOfUserResponse
     */
    CompletableFuture<ModifySkillLevelsOfUserResponse> modifySkillLevelsOfUser(ModifySkillLevelsOfUserRequest request);

    /**
     * @param request the request parameters of ModifyUser  ModifyUserRequest
     * @return ModifyUserResponse
     */
    CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request);

    /**
     * @param request the request parameters of ModifyUserLevelsOfSkillGroup  ModifyUserLevelsOfSkillGroupRequest
     * @return ModifyUserLevelsOfSkillGroupResponse
     */
    CompletableFuture<ModifyUserLevelsOfSkillGroupResponse> modifyUserLevelsOfSkillGroup(ModifyUserLevelsOfSkillGroupRequest request);

    /**
     * @param request the request parameters of MonitorCall  MonitorCallRequest
     * @return MonitorCallResponse
     */
    CompletableFuture<MonitorCallResponse> monitorCall(MonitorCallRequest request);

    /**
     * @param request the request parameters of MuteCall  MuteCallRequest
     * @return MuteCallResponse
     */
    CompletableFuture<MuteCallResponse> muteCall(MuteCallRequest request);

    /**
     * @param request the request parameters of PauseCampaign  PauseCampaignRequest
     * @return PauseCampaignResponse
     */
    CompletableFuture<PauseCampaignResponse> pauseCampaign(PauseCampaignRequest request);

    /**
     * @param request the request parameters of PickOutboundNumbers  PickOutboundNumbersRequest
     * @return PickOutboundNumbersResponse
     */
    CompletableFuture<PickOutboundNumbersResponse> pickOutboundNumbers(PickOutboundNumbersRequest request);

    /**
     * @param request the request parameters of PollUserStatus  PollUserStatusRequest
     * @return PollUserStatusResponse
     */
    CompletableFuture<PollUserStatusResponse> pollUserStatus(PollUserStatusRequest request);

    /**
     * @param request the request parameters of ProcessAliMeCallbackOfStaging  ProcessAliMeCallbackOfStagingRequest
     * @return ProcessAliMeCallbackOfStagingResponse
     */
    CompletableFuture<ProcessAliMeCallbackOfStagingResponse> processAliMeCallbackOfStaging(ProcessAliMeCallbackOfStagingRequest request);

    /**
     * @param request the request parameters of PublishContactFlow  PublishContactFlowRequest
     * @return PublishContactFlowResponse
     */
    CompletableFuture<PublishContactFlowResponse> publishContactFlow(PublishContactFlowRequest request);

    /**
     * @param request the request parameters of ReadyForService  ReadyForServiceRequest
     * @return ReadyForServiceResponse
     */
    CompletableFuture<ReadyForServiceResponse> readyForService(ReadyForServiceRequest request);

    /**
     * @param request the request parameters of RedialCall  RedialCallRequest
     * @return RedialCallResponse
     */
    CompletableFuture<RedialCallResponse> redialCall(RedialCallRequest request);

    /**
     * @param request the request parameters of RegisterDevice  RegisterDeviceRequest
     * @return RegisterDeviceResponse
     */
    CompletableFuture<RegisterDeviceResponse> registerDevice(RegisterDeviceRequest request);

    /**
     * @param request the request parameters of RegisterDevices  RegisterDevicesRequest
     * @return RegisterDevicesResponse
     */
    CompletableFuture<RegisterDevicesResponse> registerDevices(RegisterDevicesRequest request);

    /**
     * @param request the request parameters of RejectChat  RejectChatRequest
     * @return RejectChatResponse
     */
    CompletableFuture<RejectChatResponse> rejectChat(RejectChatRequest request);

    /**
     * @param request the request parameters of RejectTicket  RejectTicketRequest
     * @return RejectTicketResponse
     */
    CompletableFuture<RejectTicketResponse> rejectTicket(RejectTicketRequest request);

    /**
     * @param request the request parameters of ReleaseCall  ReleaseCallRequest
     * @return ReleaseCallResponse
     */
    CompletableFuture<ReleaseCallResponse> releaseCall(ReleaseCallRequest request);

    /**
     * @param request the request parameters of ReleaseChat  ReleaseChatRequest
     * @return ReleaseChatResponse
     */
    CompletableFuture<ReleaseChatResponse> releaseChat(ReleaseChatRequest request);

    /**
     * @param request the request parameters of RemoveBlacklistCallTagging  RemoveBlacklistCallTaggingRequest
     * @return RemoveBlacklistCallTaggingResponse
     */
    CompletableFuture<RemoveBlacklistCallTaggingResponse> removeBlacklistCallTagging(RemoveBlacklistCallTaggingRequest request);

    /**
     * @param request the request parameters of RemoveDoNotCallNumbers  RemoveDoNotCallNumbersRequest
     * @return RemoveDoNotCallNumbersResponse
     */
    CompletableFuture<RemoveDoNotCallNumbersResponse> removeDoNotCallNumbers(RemoveDoNotCallNumbersRequest request);

    /**
     * @param request the request parameters of RemovePersonalNumbersFromUser  RemovePersonalNumbersFromUserRequest
     * @return RemovePersonalNumbersFromUserResponse
     */
    CompletableFuture<RemovePersonalNumbersFromUserResponse> removePersonalNumbersFromUser(RemovePersonalNumbersFromUserRequest request);

    /**
     * @param request the request parameters of RemovePhoneNumberFromSkillGroups  RemovePhoneNumberFromSkillGroupsRequest
     * @return RemovePhoneNumberFromSkillGroupsResponse
     */
    CompletableFuture<RemovePhoneNumberFromSkillGroupsResponse> removePhoneNumberFromSkillGroups(RemovePhoneNumberFromSkillGroupsRequest request);

    /**
     * @param request the request parameters of RemovePhoneNumbers  RemovePhoneNumbersRequest
     * @return RemovePhoneNumbersResponse
     */
    CompletableFuture<RemovePhoneNumbersResponse> removePhoneNumbers(RemovePhoneNumbersRequest request);

    /**
     * @param request the request parameters of RemovePhoneNumbersFromSkillGroup  RemovePhoneNumbersFromSkillGroupRequest
     * @return RemovePhoneNumbersFromSkillGroupResponse
     */
    CompletableFuture<RemovePhoneNumbersFromSkillGroupResponse> removePhoneNumbersFromSkillGroup(RemovePhoneNumbersFromSkillGroupRequest request);

    /**
     * @param request the request parameters of RemoveSkillGroupsFromUser  RemoveSkillGroupsFromUserRequest
     * @return RemoveSkillGroupsFromUserResponse
     */
    CompletableFuture<RemoveSkillGroupsFromUserResponse> removeSkillGroupsFromUser(RemoveSkillGroupsFromUserRequest request);

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
     * @param request the request parameters of ResetAgentState  ResetAgentStateRequest
     * @return ResetAgentStateResponse
     */
    CompletableFuture<ResetAgentStateResponse> resetAgentState(ResetAgentStateRequest request);

    /**
     * @param request the request parameters of ResetUserPassword  ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request);

    /**
     * @param request the request parameters of RestoreArchivedRecordings  RestoreArchivedRecordingsRequest
     * @return RestoreArchivedRecordingsResponse
     */
    CompletableFuture<RestoreArchivedRecordingsResponse> restoreArchivedRecordings(RestoreArchivedRecordingsRequest request);

    /**
     * @param request the request parameters of ResubmitTicket  ResubmitTicketRequest
     * @return ResubmitTicketResponse
     */
    CompletableFuture<ResubmitTicketResponse> resubmitTicket(ResubmitTicketRequest request);

    /**
     * @param request the request parameters of ResumeCampaign  ResumeCampaignRequest
     * @return ResumeCampaignResponse
     */
    CompletableFuture<ResumeCampaignResponse> resumeCampaign(ResumeCampaignRequest request);

    /**
     * @param request the request parameters of RetrieveCall  RetrieveCallRequest
     * @return RetrieveCallResponse
     */
    CompletableFuture<RetrieveCallResponse> retrieveCall(RetrieveCallRequest request);

    /**
     * @param request the request parameters of SaveDocument  SaveDocumentRequest
     * @return SaveDocumentResponse
     */
    CompletableFuture<SaveDocumentResponse> saveDocument(SaveDocumentRequest request);

    /**
     * @param request the request parameters of SaveRTCStatsV2  SaveRTCStatsV2Request
     * @return SaveRTCStatsV2Response
     */
    CompletableFuture<SaveRTCStatsV2Response> saveRTCStatsV2(SaveRTCStatsV2Request request);

    /**
     * @param request the request parameters of SaveTerminalLog  SaveTerminalLogRequest
     * @return SaveTerminalLogResponse
     */
    CompletableFuture<SaveTerminalLogResponse> saveTerminalLog(SaveTerminalLogRequest request);

    /**
     * @param request the request parameters of SaveWebRTCStats  SaveWebRTCStatsRequest
     * @return SaveWebRTCStatsResponse
     */
    CompletableFuture<SaveWebRTCStatsResponse> saveWebRTCStats(SaveWebRTCStatsRequest request);

    /**
     * @param request the request parameters of SaveWebRtcInfo  SaveWebRtcInfoRequest
     * @return SaveWebRtcInfoResponse
     */
    CompletableFuture<SaveWebRtcInfoResponse> saveWebRtcInfo(SaveWebRtcInfoRequest request);

    /**
     * @param request the request parameters of SendDtmfSignaling  SendDtmfSignalingRequest
     * @return SendDtmfSignalingResponse
     */
    CompletableFuture<SendDtmfSignalingResponse> sendDtmfSignaling(SendDtmfSignalingRequest request);

    /**
     * @param request the request parameters of SignInGroup  SignInGroupRequest
     * @return SignInGroupResponse
     */
    CompletableFuture<SignInGroupResponse> signInGroup(SignInGroupRequest request);

    /**
     * @param request the request parameters of SignOutGroup  SignOutGroupRequest
     * @return SignOutGroupResponse
     */
    CompletableFuture<SignOutGroupResponse> signOutGroup(SignOutGroupRequest request);

    /**
     * @param request the request parameters of StartBack2BackCall  StartBack2BackCallRequest
     * @return StartBack2BackCallResponse
     */
    CompletableFuture<StartBack2BackCallResponse> startBack2BackCall(StartBack2BackCallRequest request);

    /**
     * @param request the request parameters of StartChat  StartChatRequest
     * @return StartChatResponse
     */
    CompletableFuture<StartChatResponse> startChat(StartChatRequest request);

    /**
     * @param request the request parameters of StartConference  StartConferenceRequest
     * @return StartConferenceResponse
     */
    CompletableFuture<StartConferenceResponse> startConference(StartConferenceRequest request);

    /**
     * @param request the request parameters of StartEditContactFlow  StartEditContactFlowRequest
     * @return StartEditContactFlowResponse
     */
    CompletableFuture<StartEditContactFlowResponse> startEditContactFlow(StartEditContactFlowRequest request);

    /**
     * @param request the request parameters of StartPredictiveCall  StartPredictiveCallRequest
     * @return StartPredictiveCallResponse
     */
    CompletableFuture<StartPredictiveCallResponse> startPredictiveCall(StartPredictiveCallRequest request);

    /**
     * @param request the request parameters of StartPrivacyCall  StartPrivacyCallRequest
     * @return StartPrivacyCallResponse
     */
    CompletableFuture<StartPrivacyCallResponse> startPrivacyCall(StartPrivacyCallRequest request);

    /**
     * @param request the request parameters of SubmitCampaign  SubmitCampaignRequest
     * @return SubmitCampaignResponse
     */
    CompletableFuture<SubmitCampaignResponse> submitCampaign(SubmitCampaignRequest request);

    /**
     * @param request the request parameters of SwitchToConference  SwitchToConferenceRequest
     * @return SwitchToConferenceResponse
     */
    CompletableFuture<SwitchToConferenceResponse> switchToConference(SwitchToConferenceRequest request);

    /**
     * @param request the request parameters of TakeBreak  TakeBreakRequest
     * @return TakeBreakResponse
     */
    CompletableFuture<TakeBreakResponse> takeBreak(TakeBreakRequest request);

    /**
     * @param request the request parameters of TerminateTicket  TerminateTicketRequest
     * @return TerminateTicketResponse
     */
    CompletableFuture<TerminateTicketResponse> terminateTicket(TerminateTicketRequest request);

    /**
     * @param request the request parameters of TransferTicketTask  TransferTicketTaskRequest
     * @return TransferTicketTaskResponse
     */
    CompletableFuture<TransferTicketTaskResponse> transferTicketTask(TransferTicketTaskRequest request);

    /**
     * @param request the request parameters of UnmuteCall  UnmuteCallRequest
     * @return UnmuteCallResponse
     */
    CompletableFuture<UnmuteCallResponse> unmuteCall(UnmuteCallRequest request);

    /**
     * @param request the request parameters of UnregisterDevice  UnregisterDeviceRequest
     * @return UnregisterDeviceResponse
     */
    CompletableFuture<UnregisterDeviceResponse> unregisterDevice(UnregisterDeviceRequest request);

    /**
     * @param request the request parameters of UpdateCampaign  UpdateCampaignRequest
     * @return UpdateCampaignResponse
     */
    CompletableFuture<UpdateCampaignResponse> updateCampaign(UpdateCampaignRequest request);

    /**
     * @param request the request parameters of UpdateChatRoutingProfile  UpdateChatRoutingProfileRequest
     * @return UpdateChatRoutingProfileResponse
     */
    CompletableFuture<UpdateChatRoutingProfileResponse> updateChatRoutingProfile(UpdateChatRoutingProfileRequest request);

    /**
     * @param request the request parameters of UpdateConfigItems  UpdateConfigItemsRequest
     * @return UpdateConfigItemsResponse
     */
    CompletableFuture<UpdateConfigItemsResponse> updateConfigItems(UpdateConfigItemsRequest request);

    /**
     * @param request the request parameters of UpdateSchemaProperty  UpdateSchemaPropertyRequest
     * @return UpdateSchemaPropertyResponse
     */
    CompletableFuture<UpdateSchemaPropertyResponse> updateSchemaProperty(UpdateSchemaPropertyRequest request);

    /**
     * @param request the request parameters of UpdateTicket  UpdateTicketRequest
     * @return UpdateTicketResponse
     */
    CompletableFuture<UpdateTicketResponse> updateTicket(UpdateTicketRequest request);

    /**
     * @param request the request parameters of WithdrawTicket  WithdrawTicketRequest
     * @return WithdrawTicketResponse
     */
    CompletableFuture<WithdrawTicketResponse> withdrawTicket(WithdrawTicketRequest request);

}
