// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.outboundbot20191226.models.*;
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
     * @param request the request parameters of ApplyNumberDistrictInfoParsingResult  ApplyNumberDistrictInfoParsingResultRequest
     * @return ApplyNumberDistrictInfoParsingResultResponse
     */
    CompletableFuture<ApplyNumberDistrictInfoParsingResultResponse> applyNumberDistrictInfoParsingResult(ApplyNumberDistrictInfoParsingResultRequest request);

    /**
     * @param request the request parameters of AssignJobs  AssignJobsRequest
     * @return AssignJobsResponse
     */
    CompletableFuture<AssignJobsResponse> assignJobs(AssignJobsRequest request);

    /**
     * @param request the request parameters of CancelJobs  CancelJobsRequest
     * @return CancelJobsResponse
     */
    CompletableFuture<CancelJobsResponse> cancelJobs(CancelJobsRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateAgentProfile  CreateAgentProfileRequest
     * @return CreateAgentProfileResponse
     */
    CompletableFuture<CreateAgentProfileResponse> createAgentProfile(CreateAgentProfileRequest request);

    /**
     * @param request the request parameters of CreateAnnotationMission  CreateAnnotationMissionRequest
     * @return CreateAnnotationMissionResponse
     */
    CompletableFuture<CreateAnnotationMissionResponse> createAnnotationMission(CreateAnnotationMissionRequest request);

    /**
     * @param request the request parameters of CreateBatchJobs  CreateBatchJobsRequest
     * @return CreateBatchJobsResponse
     */
    CompletableFuture<CreateBatchJobsResponse> createBatchJobs(CreateBatchJobsRequest request);

    /**
     * @param request the request parameters of CreateBatchRepeatJob  CreateBatchRepeatJobRequest
     * @return CreateBatchRepeatJobResponse
     */
    CompletableFuture<CreateBatchRepeatJobResponse> createBatchRepeatJob(CreateBatchRepeatJobRequest request);

    /**
     * @param request the request parameters of CreateDialogueFlow  CreateDialogueFlowRequest
     * @return CreateDialogueFlowResponse
     */
    CompletableFuture<CreateDialogueFlowResponse> createDialogueFlow(CreateDialogueFlowRequest request);

    /**
     * @param request the request parameters of CreateDownloadUrl  CreateDownloadUrlRequest
     * @return CreateDownloadUrlResponse
     */
    CompletableFuture<CreateDownloadUrlResponse> createDownloadUrl(CreateDownloadUrlRequest request);

    /**
     * @param request the request parameters of CreateGlobalQuestion  CreateGlobalQuestionRequest
     * @return CreateGlobalQuestionResponse
     */
    CompletableFuture<CreateGlobalQuestionResponse> createGlobalQuestion(CreateGlobalQuestionRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateInstanceBindNumber  CreateInstanceBindNumberRequest
     * @return CreateInstanceBindNumberResponse
     */
    CompletableFuture<CreateInstanceBindNumberResponse> createInstanceBindNumber(CreateInstanceBindNumberRequest request);

    /**
     * @param request the request parameters of CreateIntent  CreateIntentRequest
     * @return CreateIntentResponse
     */
    CompletableFuture<CreateIntentResponse> createIntent(CreateIntentRequest request);

    /**
     * @param request the request parameters of CreateJobDataParsingTask  CreateJobDataParsingTaskRequest
     * @return CreateJobDataParsingTaskResponse
     */
    CompletableFuture<CreateJobDataParsingTaskResponse> createJobDataParsingTask(CreateJobDataParsingTaskRequest request);

    /**
     * @param request the request parameters of CreateJobGroup  CreateJobGroupRequest
     * @return CreateJobGroupResponse
     */
    CompletableFuture<CreateJobGroupResponse> createJobGroup(CreateJobGroupRequest request);

    /**
     * @param request the request parameters of CreateJobGroupExportTask  CreateJobGroupExportTaskRequest
     * @return CreateJobGroupExportTaskResponse
     */
    CompletableFuture<CreateJobGroupExportTaskResponse> createJobGroupExportTask(CreateJobGroupExportTaskRequest request);

    /**
     * @param request the request parameters of CreateNumberDistrictInfoDownloadUrl  CreateNumberDistrictInfoDownloadUrlRequest
     * @return CreateNumberDistrictInfoDownloadUrlResponse
     */
    CompletableFuture<CreateNumberDistrictInfoDownloadUrlResponse> createNumberDistrictInfoDownloadUrl(CreateNumberDistrictInfoDownloadUrlRequest request);

    /**
     * @param request the request parameters of CreateNumberDistrictInfoParsingTask  CreateNumberDistrictInfoParsingTaskRequest
     * @return CreateNumberDistrictInfoParsingTaskResponse
     */
    CompletableFuture<CreateNumberDistrictInfoParsingTaskResponse> createNumberDistrictInfoParsingTask(CreateNumberDistrictInfoParsingTaskRequest request);

    /**
     * @param request the request parameters of CreateOutboundCallNumber  CreateOutboundCallNumberRequest
     * @return CreateOutboundCallNumberResponse
     */
    CompletableFuture<CreateOutboundCallNumberResponse> createOutboundCallNumber(CreateOutboundCallNumberRequest request);

    /**
     * @param request the request parameters of CreateScript  CreateScriptRequest
     * @return CreateScriptResponse
     */
    CompletableFuture<CreateScriptResponse> createScript(CreateScriptRequest request);

    /**
     * @param request the request parameters of CreateScriptWaveform  CreateScriptWaveformRequest
     * @return CreateScriptWaveformResponse
     */
    CompletableFuture<CreateScriptWaveformResponse> createScriptWaveform(CreateScriptWaveformRequest request);

    /**
     * @param request the request parameters of CreateTag  CreateTagRequest
     * @return CreateTagResponse
     */
    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    /**
     * @param request the request parameters of CreateTaskExportTask  CreateTaskExportTaskRequest
     * @return CreateTaskExportTaskResponse
     */
    CompletableFuture<CreateTaskExportTaskResponse> createTaskExportTask(CreateTaskExportTaskRequest request);

    /**
     * @param request the request parameters of DeleteAgentProfiles  DeleteAgentProfilesRequest
     * @return DeleteAgentProfilesResponse
     */
    CompletableFuture<DeleteAgentProfilesResponse> deleteAgentProfiles(DeleteAgentProfilesRequest request);

    /**
     * @param request the request parameters of DeleteAllNumberDistrictInfo  DeleteAllNumberDistrictInfoRequest
     * @return DeleteAllNumberDistrictInfoResponse
     */
    CompletableFuture<DeleteAllNumberDistrictInfoResponse> deleteAllNumberDistrictInfo(DeleteAllNumberDistrictInfoRequest request);

    /**
     * @param request the request parameters of DeleteContactBlockList  DeleteContactBlockListRequest
     * @return DeleteContactBlockListResponse
     */
    CompletableFuture<DeleteContactBlockListResponse> deleteContactBlockList(DeleteContactBlockListRequest request);

    /**
     * @param request the request parameters of DeleteContactWhiteList  DeleteContactWhiteListRequest
     * @return DeleteContactWhiteListResponse
     */
    CompletableFuture<DeleteContactWhiteListResponse> deleteContactWhiteList(DeleteContactWhiteListRequest request);

    /**
     * @param request the request parameters of DeleteDialogueFlow  DeleteDialogueFlowRequest
     * @return DeleteDialogueFlowResponse
     */
    CompletableFuture<DeleteDialogueFlowResponse> deleteDialogueFlow(DeleteDialogueFlowRequest request);

    /**
     * @param request the request parameters of DeleteGlobalQuestion  DeleteGlobalQuestionRequest
     * @return DeleteGlobalQuestionResponse
     */
    CompletableFuture<DeleteGlobalQuestionResponse> deleteGlobalQuestion(DeleteGlobalQuestionRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteIntent  DeleteIntentRequest
     * @return DeleteIntentResponse
     */
    CompletableFuture<DeleteIntentResponse> deleteIntent(DeleteIntentRequest request);

    /**
     * @param request the request parameters of DeleteJobGroup  DeleteJobGroupRequest
     * @return DeleteJobGroupResponse
     */
    CompletableFuture<DeleteJobGroupResponse> deleteJobGroup(DeleteJobGroupRequest request);

    /**
     * @param request the request parameters of DeleteOutboundCallNumber  DeleteOutboundCallNumberRequest
     * @return DeleteOutboundCallNumberResponse
     */
    CompletableFuture<DeleteOutboundCallNumberResponse> deleteOutboundCallNumber(DeleteOutboundCallNumberRequest request);

    /**
     * @param request the request parameters of DeleteScript  DeleteScriptRequest
     * @return DeleteScriptResponse
     */
    CompletableFuture<DeleteScriptResponse> deleteScript(DeleteScriptRequest request);

    /**
     * @param request the request parameters of DeleteScriptRecording  DeleteScriptRecordingRequest
     * @return DeleteScriptRecordingResponse
     */
    CompletableFuture<DeleteScriptRecordingResponse> deleteScriptRecording(DeleteScriptRecordingRequest request);

    /**
     * @param request the request parameters of DeleteScriptWaveform  DeleteScriptWaveformRequest
     * @return DeleteScriptWaveformResponse
     */
    CompletableFuture<DeleteScriptWaveformResponse> deleteScriptWaveform(DeleteScriptWaveformRequest request);

    /**
     * @param request the request parameters of DescribeDialogueNodeStatistics  DescribeDialogueNodeStatisticsRequest
     * @return DescribeDialogueNodeStatisticsResponse
     */
    CompletableFuture<DescribeDialogueNodeStatisticsResponse> describeDialogueNodeStatistics(DescribeDialogueNodeStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeDsReports  DescribeDsReportsRequest
     * @return DescribeDsReportsResponse
     */
    CompletableFuture<DescribeDsReportsResponse> describeDsReports(DescribeDsReportsRequest request);

    /**
     * @param request the request parameters of DescribeGlobalQuestion  DescribeGlobalQuestionRequest
     * @return DescribeGlobalQuestionResponse
     */
    CompletableFuture<DescribeGlobalQuestionResponse> describeGlobalQuestion(DescribeGlobalQuestionRequest request);

    /**
     * @param request the request parameters of DescribeGroupExecutingInfo  DescribeGroupExecutingInfoRequest
     * @return DescribeGroupExecutingInfoResponse
     */
    CompletableFuture<DescribeGroupExecutingInfoResponse> describeGroupExecutingInfo(DescribeGroupExecutingInfoRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeIntent  DescribeIntentRequest
     * @return DescribeIntentResponse
     */
    CompletableFuture<DescribeIntentResponse> describeIntent(DescribeIntentRequest request);

    /**
     * @param request the request parameters of DescribeIntentStatistics  DescribeIntentStatisticsRequest
     * @return DescribeIntentStatisticsResponse
     */
    CompletableFuture<DescribeIntentStatisticsResponse> describeIntentStatistics(DescribeIntentStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeJob  DescribeJobRequest
     * @return DescribeJobResponse
     */
    CompletableFuture<DescribeJobResponse> describeJob(DescribeJobRequest request);

    /**
     * @param request the request parameters of DescribeJobDataParsingTaskProgress  DescribeJobDataParsingTaskProgressRequest
     * @return DescribeJobDataParsingTaskProgressResponse
     */
    CompletableFuture<DescribeJobDataParsingTaskProgressResponse> describeJobDataParsingTaskProgress(DescribeJobDataParsingTaskProgressRequest request);

    /**
     * @param request the request parameters of DescribeJobGroup  DescribeJobGroupRequest
     * @return DescribeJobGroupResponse
     */
    CompletableFuture<DescribeJobGroupResponse> describeJobGroup(DescribeJobGroupRequest request);

    /**
     * @param request the request parameters of DescribeJobGroupExportTaskProgress  DescribeJobGroupExportTaskProgressRequest
     * @return DescribeJobGroupExportTaskProgressResponse
     */
    CompletableFuture<DescribeJobGroupExportTaskProgressResponse> describeJobGroupExportTaskProgress(DescribeJobGroupExportTaskProgressRequest request);

    /**
     * @param request the request parameters of DescribeNumberDistrictInfoStatus  DescribeNumberDistrictInfoStatusRequest
     * @return DescribeNumberDistrictInfoStatusResponse
     */
    CompletableFuture<DescribeNumberDistrictInfoStatusResponse> describeNumberDistrictInfoStatus(DescribeNumberDistrictInfoStatusRequest request);

    /**
     * @param request the request parameters of DescribeScript  DescribeScriptRequest
     * @return DescribeScriptResponse
     */
    CompletableFuture<DescribeScriptResponse> describeScript(DescribeScriptRequest request);

    /**
     * @param request the request parameters of DescribeScriptVoiceConfig  DescribeScriptVoiceConfigRequest
     * @return DescribeScriptVoiceConfigResponse
     */
    CompletableFuture<DescribeScriptVoiceConfigResponse> describeScriptVoiceConfig(DescribeScriptVoiceConfigRequest request);

    /**
     * @param request the request parameters of DescribeTTSConfig  DescribeTTSConfigRequest
     * @return DescribeTTSConfigResponse
     */
    CompletableFuture<DescribeTTSConfigResponse> describeTTSConfig(DescribeTTSConfigRequest request);

    /**
     * @param request the request parameters of DescribeTTSDemo  DescribeTTSDemoRequest
     * @return DescribeTTSDemoResponse
     */
    CompletableFuture<DescribeTTSDemoResponse> describeTTSDemo(DescribeTTSDemoRequest request);

    /**
     * @param request the request parameters of DescribeTagHitsSummary  DescribeTagHitsSummaryRequest
     * @return DescribeTagHitsSummaryResponse
     */
    CompletableFuture<DescribeTagHitsSummaryResponse> describeTagHitsSummary(DescribeTagHitsSummaryRequest request);

    /**
     * @param request the request parameters of DescribeTenantBindNumber  DescribeTenantBindNumberRequest
     * @return DescribeTenantBindNumberResponse
     */
    CompletableFuture<DescribeTenantBindNumberResponse> describeTenantBindNumber(DescribeTenantBindNumberRequest request);

    /**
     * @param request the request parameters of Dialogue  DialogueRequest
     * @return DialogueResponse
     */
    CompletableFuture<DialogueResponse> dialogue(DialogueRequest request);

    /**
     * @param request the request parameters of DismissNumberDistrictInfoParsingResult  DismissNumberDistrictInfoParsingResultRequest
     * @return DismissNumberDistrictInfoParsingResultResponse
     */
    CompletableFuture<DismissNumberDistrictInfoParsingResultResponse> dismissNumberDistrictInfoParsingResult(DismissNumberDistrictInfoParsingResultRequest request);

    /**
     * @param request the request parameters of DownloadRecording  DownloadRecordingRequest
     * @return DownloadRecordingResponse
     */
    CompletableFuture<DownloadRecordingResponse> downloadRecording(DownloadRecordingRequest request);

    /**
     * @param request the request parameters of DownloadScriptRecording  DownloadScriptRecordingRequest
     * @return DownloadScriptRecordingResponse
     */
    CompletableFuture<DownloadScriptRecordingResponse> downloadScriptRecording(DownloadScriptRecordingRequest request);

    /**
     * @param request the request parameters of DuplicateScript  DuplicateScriptRequest
     * @return DuplicateScriptResponse
     */
    CompletableFuture<DuplicateScriptResponse> duplicateScript(DuplicateScriptRequest request);

    /**
     * @param request the request parameters of ExportScript  ExportScriptRequest
     * @return ExportScriptResponse
     */
    CompletableFuture<ExportScriptResponse> exportScript(ExportScriptRequest request);

    /**
     * @param request the request parameters of GenerateUploadUrl  GenerateUploadUrlRequest
     * @return GenerateUploadUrlResponse
     */
    CompletableFuture<GenerateUploadUrlResponse> generateUploadUrl(GenerateUploadUrlRequest request);

    /**
     * @param request the request parameters of GetAfterAnswerDelayPlayback  GetAfterAnswerDelayPlaybackRequest
     * @return GetAfterAnswerDelayPlaybackResponse
     */
    CompletableFuture<GetAfterAnswerDelayPlaybackResponse> getAfterAnswerDelayPlayback(GetAfterAnswerDelayPlaybackRequest request);

    /**
     * @param request the request parameters of GetAgentProfile  GetAgentProfileRequest
     * @return GetAgentProfileResponse
     */
    CompletableFuture<GetAgentProfileResponse> getAgentProfile(GetAgentProfileRequest request);

    /**
     * @param request the request parameters of GetAgentProfileTemplate  GetAgentProfileTemplateRequest
     * @return GetAgentProfileTemplateResponse
     */
    CompletableFuture<GetAgentProfileTemplateResponse> getAgentProfileTemplate(GetAgentProfileTemplateRequest request);

    /**
     * @param request the request parameters of GetAnnotationMissionSummary  GetAnnotationMissionSummaryRequest
     * @return GetAnnotationMissionSummaryResponse
     */
    CompletableFuture<GetAnnotationMissionSummaryResponse> getAnnotationMissionSummary(GetAnnotationMissionSummaryRequest request);

    /**
     * @param request the request parameters of GetAnnotationMissionTagInfoList  GetAnnotationMissionTagInfoListRequest
     * @return GetAnnotationMissionTagInfoListResponse
     */
    CompletableFuture<GetAnnotationMissionTagInfoListResponse> getAnnotationMissionTagInfoList(GetAnnotationMissionTagInfoListRequest request);

    /**
     * @param request the request parameters of GetAsrServerInfo  GetAsrServerInfoRequest
     * @return GetAsrServerInfoResponse
     */
    CompletableFuture<GetAsrServerInfoResponse> getAsrServerInfo(GetAsrServerInfoRequest request);

    /**
     * @param request the request parameters of GetBaseStrategyPeriod  GetBaseStrategyPeriodRequest
     * @return GetBaseStrategyPeriodResponse
     */
    CompletableFuture<GetBaseStrategyPeriodResponse> getBaseStrategyPeriod(GetBaseStrategyPeriodRequest request);

    /**
     * @param request the request parameters of GetConcurrentConversationQuota  GetConcurrentConversationQuotaRequest
     * @return GetConcurrentConversationQuotaResponse
     */
    CompletableFuture<GetConcurrentConversationQuotaResponse> getConcurrentConversationQuota(GetConcurrentConversationQuotaRequest request);

    /**
     * @param request the request parameters of GetContactBlockList  GetContactBlockListRequest
     * @return GetContactBlockListResponse
     */
    CompletableFuture<GetContactBlockListResponse> getContactBlockList(GetContactBlockListRequest request);

    /**
     * @param request the request parameters of GetContactWhiteList  GetContactWhiteListRequest
     * @return GetContactWhiteListResponse
     */
    CompletableFuture<GetContactWhiteListResponse> getContactWhiteList(GetContactWhiteListRequest request);

    /**
     * @param request the request parameters of GetCurrentConcurrency  GetCurrentConcurrencyRequest
     * @return GetCurrentConcurrencyResponse
     */
    CompletableFuture<GetCurrentConcurrencyResponse> getCurrentConcurrency(GetCurrentConcurrencyRequest request);

    /**
     * @param request the request parameters of GetEffectiveDays  GetEffectiveDaysRequest
     * @return GetEffectiveDaysResponse
     */
    CompletableFuture<GetEffectiveDaysResponse> getEffectiveDays(GetEffectiveDaysRequest request);

    /**
     * @param request the request parameters of GetEmptyNumberNoMoreCallsInfo  GetEmptyNumberNoMoreCallsInfoRequest
     * @return GetEmptyNumberNoMoreCallsInfoResponse
     */
    CompletableFuture<GetEmptyNumberNoMoreCallsInfoResponse> getEmptyNumberNoMoreCallsInfo(GetEmptyNumberNoMoreCallsInfoRequest request);

    /**
     * @param request the request parameters of GetJobDataUploadParams  GetJobDataUploadParamsRequest
     * @return GetJobDataUploadParamsResponse
     */
    CompletableFuture<GetJobDataUploadParamsResponse> getJobDataUploadParams(GetJobDataUploadParamsRequest request);

    /**
     * @param request the request parameters of GetMaxAttemptsPerDay  GetMaxAttemptsPerDayRequest
     * @return GetMaxAttemptsPerDayResponse
     */
    CompletableFuture<GetMaxAttemptsPerDayResponse> getMaxAttemptsPerDay(GetMaxAttemptsPerDayRequest request);

    /**
     * @param request the request parameters of GetNumberDistrictInfoTemplateDownloadUrl  GetNumberDistrictInfoTemplateDownloadUrlRequest
     * @return GetNumberDistrictInfoTemplateDownloadUrlResponse
     */
    CompletableFuture<GetNumberDistrictInfoTemplateDownloadUrlResponse> getNumberDistrictInfoTemplateDownloadUrl(GetNumberDistrictInfoTemplateDownloadUrlRequest request);

    /**
     * @param request the request parameters of GetRealtimeConcurrencyReport  GetRealtimeConcurrencyReportRequest
     * @return GetRealtimeConcurrencyReportResponse
     */
    CompletableFuture<GetRealtimeConcurrencyReportResponse> getRealtimeConcurrencyReport(GetRealtimeConcurrencyReportRequest request);

    /**
     * @param request the request parameters of GetSummaryInfo  GetSummaryInfoRequest
     * @return GetSummaryInfoResponse
     */
    CompletableFuture<GetSummaryInfoResponse> getSummaryInfo(GetSummaryInfoRequest request);

    /**
     * @param request the request parameters of GetTaskByUuid  GetTaskByUuidRequest
     * @return GetTaskByUuidResponse
     */
    CompletableFuture<GetTaskByUuidResponse> getTaskByUuid(GetTaskByUuidRequest request);

    /**
     * @param request the request parameters of GetVersion  GetVersionRequest
     * @return GetVersionResponse
     */
    CompletableFuture<GetVersionResponse> getVersion(GetVersionRequest request);

    /**
     * @param request the request parameters of ImportScript  ImportScriptRequest
     * @return ImportScriptResponse
     */
    CompletableFuture<ImportScriptResponse> importScript(ImportScriptRequest request);

    /**
     * @param request the request parameters of InflightTaskTimeout  InflightTaskTimeoutRequest
     * @return InflightTaskTimeoutResponse
     */
    CompletableFuture<InflightTaskTimeoutResponse> inflightTaskTimeout(InflightTaskTimeoutRequest request);

    /**
     * @param request the request parameters of ListAgentProfiles  ListAgentProfilesRequest
     * @return ListAgentProfilesResponse
     */
    CompletableFuture<ListAgentProfilesResponse> listAgentProfiles(ListAgentProfilesRequest request);

    /**
     * @param request the request parameters of ListAllTenantBindNumberBinding  ListAllTenantBindNumberBindingRequest
     * @return ListAllTenantBindNumberBindingResponse
     */
    CompletableFuture<ListAllTenantBindNumberBindingResponse> listAllTenantBindNumberBinding(ListAllTenantBindNumberBindingRequest request);

    /**
     * @param request the request parameters of ListAnnotationMission  ListAnnotationMissionRequest
     * @return ListAnnotationMissionResponse
     */
    CompletableFuture<ListAnnotationMissionResponse> listAnnotationMission(ListAnnotationMissionRequest request);

    /**
     * @param request the request parameters of ListAnnotationMissionSession  ListAnnotationMissionSessionRequest
     * @return ListAnnotationMissionSessionResponse
     */
    CompletableFuture<ListAnnotationMissionSessionResponse> listAnnotationMissionSession(ListAnnotationMissionSessionRequest request);

    /**
     * @param request the request parameters of ListApiPlugins  ListApiPluginsRequest
     * @return ListApiPluginsResponse
     */
    CompletableFuture<ListApiPluginsResponse> listApiPlugins(ListApiPluginsRequest request);

    /**
     * @param request the request parameters of ListChatbotInstances  ListChatbotInstancesRequest
     * @return ListChatbotInstancesResponse
     */
    CompletableFuture<ListChatbotInstancesResponse> listChatbotInstances(ListChatbotInstancesRequest request);

    /**
     * @param request the request parameters of ListDialogueFlows  ListDialogueFlowsRequest
     * @return ListDialogueFlowsResponse
     */
    CompletableFuture<ListDialogueFlowsResponse> listDialogueFlows(ListDialogueFlowsRequest request);

    /**
     * @param request the request parameters of ListDownloadTasks  ListDownloadTasksRequest
     * @return ListDownloadTasksResponse
     */
    CompletableFuture<ListDownloadTasksResponse> listDownloadTasks(ListDownloadTasksRequest request);

    /**
     * @param request the request parameters of ListFlashSmsTemplates  ListFlashSmsTemplatesRequest
     * @return ListFlashSmsTemplatesResponse
     */
    CompletableFuture<ListFlashSmsTemplatesResponse> listFlashSmsTemplates(ListFlashSmsTemplatesRequest request);

    /**
     * @param request the request parameters of ListGlobalQuestions  ListGlobalQuestionsRequest
     * @return ListGlobalQuestionsResponse
     */
    CompletableFuture<ListGlobalQuestionsResponse> listGlobalQuestions(ListGlobalQuestionsRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListIntents  ListIntentsRequest
     * @return ListIntentsResponse
     */
    CompletableFuture<ListIntentsResponse> listIntents(ListIntentsRequest request);

    /**
     * @param request the request parameters of ListJobGroups  ListJobGroupsRequest
     * @return ListJobGroupsResponse
     */
    CompletableFuture<ListJobGroupsResponse> listJobGroups(ListJobGroupsRequest request);

    /**
     * @param request the request parameters of ListJobGroupsAsync  ListJobGroupsAsyncRequest
     * @return ListJobGroupsAsyncResponse
     */
    CompletableFuture<ListJobGroupsAsyncResponse> listJobGroupsAsync(ListJobGroupsAsyncRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * @param request the request parameters of ListJobsByGroup  ListJobsByGroupRequest
     * @return ListJobsByGroupResponse
     */
    CompletableFuture<ListJobsByGroupResponse> listJobsByGroup(ListJobsByGroupRequest request);

    /**
     * @param request the request parameters of ListOutboundCallNumbers  ListOutboundCallNumbersRequest
     * @return ListOutboundCallNumbersResponse
     */
    CompletableFuture<ListOutboundCallNumbersResponse> listOutboundCallNumbers(ListOutboundCallNumbersRequest request);

    /**
     * @param request the request parameters of ListResourceTags  ListResourceTagsRequest
     * @return ListResourceTagsResponse
     */
    CompletableFuture<ListResourceTagsResponse> listResourceTags(ListResourceTagsRequest request);

    /**
     * @param request the request parameters of ListSchedulerInstances  ListSchedulerInstancesRequest
     * @return ListSchedulerInstancesResponse
     */
    CompletableFuture<ListSchedulerInstancesResponse> listSchedulerInstances(ListSchedulerInstancesRequest request);

    /**
     * @param request the request parameters of ListScriptPublishHistories  ListScriptPublishHistoriesRequest
     * @return ListScriptPublishHistoriesResponse
     */
    CompletableFuture<ListScriptPublishHistoriesResponse> listScriptPublishHistories(ListScriptPublishHistoriesRequest request);

    /**
     * @param request the request parameters of ListScriptRecording  ListScriptRecordingRequest
     * @return ListScriptRecordingResponse
     */
    CompletableFuture<ListScriptRecordingResponse> listScriptRecording(ListScriptRecordingRequest request);

    /**
     * @param request the request parameters of ListScriptVoiceConfigs  ListScriptVoiceConfigsRequest
     * @return ListScriptVoiceConfigsResponse
     */
    CompletableFuture<ListScriptVoiceConfigsResponse> listScriptVoiceConfigs(ListScriptVoiceConfigsRequest request);

    /**
     * @param request the request parameters of ListScripts  ListScriptsRequest
     * @return ListScriptsResponse
     */
    CompletableFuture<ListScriptsResponse> listScripts(ListScriptsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTags  ListTagsRequest
     * @return ListTagsResponse
     */
    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    /**
     * @param request the request parameters of ModifyAgentProfile  ModifyAgentProfileRequest
     * @return ModifyAgentProfileResponse
     */
    CompletableFuture<ModifyAgentProfileResponse> modifyAgentProfile(ModifyAgentProfileRequest request);

    /**
     * @param request the request parameters of ModifyAnnotationMission  ModifyAnnotationMissionRequest
     * @return ModifyAnnotationMissionResponse
     */
    CompletableFuture<ModifyAnnotationMissionResponse> modifyAnnotationMission(ModifyAnnotationMissionRequest request);

    /**
     * @param request the request parameters of ModifyBatchJobs  ModifyBatchJobsRequest
     * @return ModifyBatchJobsResponse
     */
    CompletableFuture<ModifyBatchJobsResponse> modifyBatchJobs(ModifyBatchJobsRequest request);

    /**
     * @param request the request parameters of ModifyDialogueFlow  ModifyDialogueFlowRequest
     * @return ModifyDialogueFlowResponse
     */
    CompletableFuture<ModifyDialogueFlowResponse> modifyDialogueFlow(ModifyDialogueFlowRequest request);

    /**
     * @param request the request parameters of ModifyEmptyNumberNoMoreCallsInfo  ModifyEmptyNumberNoMoreCallsInfoRequest
     * @return ModifyEmptyNumberNoMoreCallsInfoResponse
     */
    CompletableFuture<ModifyEmptyNumberNoMoreCallsInfoResponse> modifyEmptyNumberNoMoreCallsInfo(ModifyEmptyNumberNoMoreCallsInfoRequest request);

    /**
     * @param request the request parameters of ModifyGlobalQuestion  ModifyGlobalQuestionRequest
     * @return ModifyGlobalQuestionResponse
     */
    CompletableFuture<ModifyGlobalQuestionResponse> modifyGlobalQuestion(ModifyGlobalQuestionRequest request);

    /**
     * @param request the request parameters of ModifyInstance  ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    /**
     * @param request the request parameters of ModifyIntent  ModifyIntentRequest
     * @return ModifyIntentResponse
     */
    CompletableFuture<ModifyIntentResponse> modifyIntent(ModifyIntentRequest request);

    /**
     * @param request the request parameters of ModifyJobGroup  ModifyJobGroupRequest
     * @return ModifyJobGroupResponse
     */
    CompletableFuture<ModifyJobGroupResponse> modifyJobGroup(ModifyJobGroupRequest request);

    /**
     * @param request the request parameters of ModifyOutboundCallNumber  ModifyOutboundCallNumberRequest
     * @return ModifyOutboundCallNumberResponse
     */
    CompletableFuture<ModifyOutboundCallNumberResponse> modifyOutboundCallNumber(ModifyOutboundCallNumberRequest request);

    /**
     * @param request the request parameters of ModifyScript  ModifyScriptRequest
     * @return ModifyScriptResponse
     */
    CompletableFuture<ModifyScriptResponse> modifyScript(ModifyScriptRequest request);

    /**
     * @param request the request parameters of ModifyScriptVoiceConfig  ModifyScriptVoiceConfigRequest
     * @return ModifyScriptVoiceConfigResponse
     */
    CompletableFuture<ModifyScriptVoiceConfigResponse> modifyScriptVoiceConfig(ModifyScriptVoiceConfigRequest request);

    /**
     * @param request the request parameters of ModifyTTSConfig  ModifyTTSConfigRequest
     * @return ModifyTTSConfigResponse
     */
    CompletableFuture<ModifyTTSConfigResponse> modifyTTSConfig(ModifyTTSConfigRequest request);

    /**
     * @param request the request parameters of ModifyTagGroups  ModifyTagGroupsRequest
     * @return ModifyTagGroupsResponse
     */
    CompletableFuture<ModifyTagGroupsResponse> modifyTagGroups(ModifyTagGroupsRequest request);

    /**
     * @param request the request parameters of PublishScript  PublishScriptRequest
     * @return PublishScriptResponse
     */
    CompletableFuture<PublishScriptResponse> publishScript(PublishScriptRequest request);

    /**
     * @param request the request parameters of PublishScriptForDebug  PublishScriptForDebugRequest
     * @return PublishScriptForDebugResponse
     */
    CompletableFuture<PublishScriptForDebugResponse> publishScriptForDebug(PublishScriptForDebugRequest request);

    /**
     * @param request the request parameters of QueryJobs  QueryJobsRequest
     * @return QueryJobsResponse
     */
    CompletableFuture<QueryJobsResponse> queryJobs(QueryJobsRequest request);

    /**
     * @param request the request parameters of QueryJobsWithResult  QueryJobsWithResultRequest
     * @return QueryJobsWithResultResponse
     */
    CompletableFuture<QueryJobsWithResultResponse> queryJobsWithResult(QueryJobsWithResultRequest request);

    /**
     * @param request the request parameters of QueryScriptWaveforms  QueryScriptWaveformsRequest
     * @return QueryScriptWaveformsResponse
     */
    CompletableFuture<QueryScriptWaveformsResponse> queryScriptWaveforms(QueryScriptWaveformsRequest request);

    /**
     * @param request the request parameters of QueryScriptsByStatus  QueryScriptsByStatusRequest
     * @return QueryScriptsByStatusResponse
     */
    CompletableFuture<QueryScriptsByStatusResponse> queryScriptsByStatus(QueryScriptsByStatusRequest request);

    /**
     * @param request the request parameters of RecordFailure  RecordFailureRequest
     * @return RecordFailureResponse
     */
    CompletableFuture<RecordFailureResponse> recordFailure(RecordFailureRequest request);

    /**
     * @param request the request parameters of ResumeJobs  ResumeJobsRequest
     * @return ResumeJobsResponse
     */
    CompletableFuture<ResumeJobsResponse> resumeJobs(ResumeJobsRequest request);

    /**
     * @param request the request parameters of RollbackScript  RollbackScriptRequest
     * @return RollbackScriptResponse
     */
    CompletableFuture<RollbackScriptResponse> rollbackScript(RollbackScriptRequest request);

    /**
     * @param request the request parameters of SaveAfterAnswerDelayPlayback  SaveAfterAnswerDelayPlaybackRequest
     * @return SaveAfterAnswerDelayPlaybackResponse
     */
    CompletableFuture<SaveAfterAnswerDelayPlaybackResponse> saveAfterAnswerDelayPlayback(SaveAfterAnswerDelayPlaybackRequest request);

    /**
     * @param request the request parameters of SaveAnnotationMissionSessionList  SaveAnnotationMissionSessionListRequest
     * @return SaveAnnotationMissionSessionListResponse
     */
    CompletableFuture<SaveAnnotationMissionSessionListResponse> saveAnnotationMissionSessionList(SaveAnnotationMissionSessionListRequest request);

    /**
     * @param request the request parameters of SaveAnnotationMissionTagInfoList  SaveAnnotationMissionTagInfoListRequest
     * @return SaveAnnotationMissionTagInfoListResponse
     */
    CompletableFuture<SaveAnnotationMissionTagInfoListResponse> saveAnnotationMissionTagInfoList(SaveAnnotationMissionTagInfoListRequest request);

    /**
     * @param request the request parameters of SaveBaseStrategyPeriod  SaveBaseStrategyPeriodRequest
     * @return SaveBaseStrategyPeriodResponse
     */
    CompletableFuture<SaveBaseStrategyPeriodResponse> saveBaseStrategyPeriod(SaveBaseStrategyPeriodRequest request);

    /**
     * @param request the request parameters of SaveContactBlockList  SaveContactBlockListRequest
     * @return SaveContactBlockListResponse
     */
    CompletableFuture<SaveContactBlockListResponse> saveContactBlockList(SaveContactBlockListRequest request);

    /**
     * @param request the request parameters of SaveContactWhiteList  SaveContactWhiteListRequest
     * @return SaveContactWhiteListResponse
     */
    CompletableFuture<SaveContactWhiteListResponse> saveContactWhiteList(SaveContactWhiteListRequest request);

    /**
     * @param request the request parameters of SaveEffectiveDays  SaveEffectiveDaysRequest
     * @return SaveEffectiveDaysResponse
     */
    CompletableFuture<SaveEffectiveDaysResponse> saveEffectiveDays(SaveEffectiveDaysRequest request);

    /**
     * @param request the request parameters of SaveMaxAttemptsPerDay  SaveMaxAttemptsPerDayRequest
     * @return SaveMaxAttemptsPerDayResponse
     */
    CompletableFuture<SaveMaxAttemptsPerDayResponse> saveMaxAttemptsPerDay(SaveMaxAttemptsPerDayRequest request);

    /**
     * @param request the request parameters of SearchTask  SearchTaskRequest
     * @return SearchTaskResponse
     */
    CompletableFuture<SearchTaskResponse> searchTask(SearchTaskRequest request);

    /**
     * @param request the request parameters of StartJob  StartJobRequest
     * @return StartJobResponse
     */
    CompletableFuture<StartJobResponse> startJob(StartJobRequest request);

    /**
     * @param request the request parameters of SubmitBatchJobs  SubmitBatchJobsRequest
     * @return SubmitBatchJobsResponse
     */
    CompletableFuture<SubmitBatchJobsResponse> submitBatchJobs(SubmitBatchJobsRequest request);

    /**
     * @param request the request parameters of SubmitRecording  SubmitRecordingRequest
     * @return SubmitRecordingResponse
     */
    CompletableFuture<SubmitRecordingResponse> submitRecording(SubmitRecordingRequest request);

    /**
     * @param request the request parameters of SubmitScriptReview  SubmitScriptReviewRequest
     * @return SubmitScriptReviewResponse
     */
    CompletableFuture<SubmitScriptReviewResponse> submitScriptReview(SubmitScriptReviewRequest request);

    /**
     * @param request the request parameters of SuspendCall  SuspendCallRequest
     * @return SuspendCallResponse
     */
    CompletableFuture<SuspendCallResponse> suspendCall(SuspendCallRequest request);

    /**
     * @param request the request parameters of SuspendCallWithFile  SuspendCallWithFileRequest
     * @return SuspendCallWithFileResponse
     */
    CompletableFuture<SuspendCallWithFileResponse> suspendCallWithFile(SuspendCallWithFileRequest request);

    /**
     * @param request the request parameters of SuspendJobs  SuspendJobsRequest
     * @return SuspendJobsResponse
     */
    CompletableFuture<SuspendJobsResponse> suspendJobs(SuspendJobsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li></li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of TaskPreparing  TaskPreparingRequest
     * @return TaskPreparingResponse
     */
    CompletableFuture<TaskPreparingResponse> taskPreparing(TaskPreparingRequest request);

    /**
     * @param request the request parameters of TerminateCall  TerminateCallRequest
     * @return TerminateCallResponse
     */
    CompletableFuture<TerminateCallResponse> terminateCall(TerminateCallRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UploadScriptRecording  UploadScriptRecordingRequest
     * @return UploadScriptRecordingResponse
     */
    CompletableFuture<UploadScriptRecordingResponse> uploadScriptRecording(UploadScriptRecordingRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of WithdrawScriptReview  WithdrawScriptReviewRequest
     * @return WithdrawScriptReviewResponse
     */
    CompletableFuture<WithdrawScriptReviewResponse> withdrawScriptReview(WithdrawScriptReviewRequest request);

}
