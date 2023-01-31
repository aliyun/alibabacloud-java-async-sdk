// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.outboundbot20191226.models.*;
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

    CompletableFuture<ApplyNumberDistrictInfoParsingResultResponse> applyNumberDistrictInfoParsingResult(ApplyNumberDistrictInfoParsingResultRequest request);

    CompletableFuture<AssignJobsResponse> assignJobs(AssignJobsRequest request);

    CompletableFuture<CancelJobsResponse> cancelJobs(CancelJobsRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CreateBatchJobsResponse> createBatchJobs(CreateBatchJobsRequest request);

    CompletableFuture<CreateBatchRepeatJobResponse> createBatchRepeatJob(CreateBatchRepeatJobRequest request);

    CompletableFuture<CreateDialogueFlowResponse> createDialogueFlow(CreateDialogueFlowRequest request);

    CompletableFuture<CreateDownloadUrlResponse> createDownloadUrl(CreateDownloadUrlRequest request);

    CompletableFuture<CreateGlobalQuestionResponse> createGlobalQuestion(CreateGlobalQuestionRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateInstanceBindNumberResponse> createInstanceBindNumber(CreateInstanceBindNumberRequest request);

    CompletableFuture<CreateIntentResponse> createIntent(CreateIntentRequest request);

    CompletableFuture<CreateJobDataParsingTaskResponse> createJobDataParsingTask(CreateJobDataParsingTaskRequest request);

    CompletableFuture<CreateJobGroupResponse> createJobGroup(CreateJobGroupRequest request);

    CompletableFuture<CreateJobGroupExportTaskResponse> createJobGroupExportTask(CreateJobGroupExportTaskRequest request);

    CompletableFuture<CreateNumberDistrictInfoDownloadUrlResponse> createNumberDistrictInfoDownloadUrl(CreateNumberDistrictInfoDownloadUrlRequest request);

    CompletableFuture<CreateNumberDistrictInfoParsingTaskResponse> createNumberDistrictInfoParsingTask(CreateNumberDistrictInfoParsingTaskRequest request);

    CompletableFuture<CreateOutboundCallNumberResponse> createOutboundCallNumber(CreateOutboundCallNumberRequest request);

    CompletableFuture<CreateScriptResponse> createScript(CreateScriptRequest request);

    CompletableFuture<CreateScriptWaveformResponse> createScriptWaveform(CreateScriptWaveformRequest request);

    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    CompletableFuture<CreateTaskExportTaskResponse> createTaskExportTask(CreateTaskExportTaskRequest request);

    CompletableFuture<DeleteAllNumberDistrictInfoResponse> deleteAllNumberDistrictInfo(DeleteAllNumberDistrictInfoRequest request);

    CompletableFuture<DeleteContactBlockListResponse> deleteContactBlockList(DeleteContactBlockListRequest request);

    CompletableFuture<DeleteContactWhiteListResponse> deleteContactWhiteList(DeleteContactWhiteListRequest request);

    CompletableFuture<DeleteDialogueFlowResponse> deleteDialogueFlow(DeleteDialogueFlowRequest request);

    CompletableFuture<DeleteGlobalQuestionResponse> deleteGlobalQuestion(DeleteGlobalQuestionRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteIntentResponse> deleteIntent(DeleteIntentRequest request);

    CompletableFuture<DeleteJobGroupResponse> deleteJobGroup(DeleteJobGroupRequest request);

    CompletableFuture<DeleteOutboundCallNumberResponse> deleteOutboundCallNumber(DeleteOutboundCallNumberRequest request);

    CompletableFuture<DeleteScriptResponse> deleteScript(DeleteScriptRequest request);

    CompletableFuture<DeleteScriptRecordingResponse> deleteScriptRecording(DeleteScriptRecordingRequest request);

    CompletableFuture<DeleteScriptWaveformResponse> deleteScriptWaveform(DeleteScriptWaveformRequest request);

    CompletableFuture<DescribeDialogueNodeStatisticsResponse> describeDialogueNodeStatistics(DescribeDialogueNodeStatisticsRequest request);

    CompletableFuture<DescribeDsReportsResponse> describeDsReports(DescribeDsReportsRequest request);

    CompletableFuture<DescribeGlobalQuestionResponse> describeGlobalQuestion(DescribeGlobalQuestionRequest request);

    CompletableFuture<DescribeGroupExecutingInfoResponse> describeGroupExecutingInfo(DescribeGroupExecutingInfoRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeIntentResponse> describeIntent(DescribeIntentRequest request);

    CompletableFuture<DescribeIntentStatisticsResponse> describeIntentStatistics(DescribeIntentStatisticsRequest request);

    CompletableFuture<DescribeJobResponse> describeJob(DescribeJobRequest request);

    CompletableFuture<DescribeJobDataParsingTaskProgressResponse> describeJobDataParsingTaskProgress(DescribeJobDataParsingTaskProgressRequest request);

    CompletableFuture<DescribeJobGroupResponse> describeJobGroup(DescribeJobGroupRequest request);

    CompletableFuture<DescribeJobGroupExportTaskProgressResponse> describeJobGroupExportTaskProgress(DescribeJobGroupExportTaskProgressRequest request);

    CompletableFuture<DescribeNumberDistrictInfoStatusResponse> describeNumberDistrictInfoStatus(DescribeNumberDistrictInfoStatusRequest request);

    CompletableFuture<DescribeScriptResponse> describeScript(DescribeScriptRequest request);

    CompletableFuture<DescribeScriptVoiceConfigResponse> describeScriptVoiceConfig(DescribeScriptVoiceConfigRequest request);

    CompletableFuture<DescribeTTSConfigResponse> describeTTSConfig(DescribeTTSConfigRequest request);

    CompletableFuture<DescribeTTSDemoResponse> describeTTSDemo(DescribeTTSDemoRequest request);

    CompletableFuture<DescribeTagHitsSummaryResponse> describeTagHitsSummary(DescribeTagHitsSummaryRequest request);

    CompletableFuture<DescribeTenantBindNumberResponse> describeTenantBindNumber(DescribeTenantBindNumberRequest request);

    CompletableFuture<DialogueResponse> dialogue(DialogueRequest request);

    CompletableFuture<DismissNumberDistrictInfoParsingResultResponse> dismissNumberDistrictInfoParsingResult(DismissNumberDistrictInfoParsingResultRequest request);

    CompletableFuture<DownloadRecordingResponse> downloadRecording(DownloadRecordingRequest request);

    CompletableFuture<DownloadScriptRecordingResponse> downloadScriptRecording(DownloadScriptRecordingRequest request);

    CompletableFuture<DuplicateScriptResponse> duplicateScript(DuplicateScriptRequest request);

    CompletableFuture<ExportScriptResponse> exportScript(ExportScriptRequest request);

    CompletableFuture<GenerateUploadUrlResponse> generateUploadUrl(GenerateUploadUrlRequest request);

    CompletableFuture<GetAfterAnswerDelayPlaybackResponse> getAfterAnswerDelayPlayback(GetAfterAnswerDelayPlaybackRequest request);

    CompletableFuture<GetAsrServerInfoResponse> getAsrServerInfo(GetAsrServerInfoRequest request);

    CompletableFuture<GetBaseStrategyPeriodResponse> getBaseStrategyPeriod(GetBaseStrategyPeriodRequest request);

    CompletableFuture<GetConcurrentConversationQuotaResponse> getConcurrentConversationQuota(GetConcurrentConversationQuotaRequest request);

    CompletableFuture<GetContactBlockListResponse> getContactBlockList(GetContactBlockListRequest request);

    CompletableFuture<GetContactWhiteListResponse> getContactWhiteList(GetContactWhiteListRequest request);

    CompletableFuture<GetCurrentConcurrencyResponse> getCurrentConcurrency(GetCurrentConcurrencyRequest request);

    CompletableFuture<GetEffectiveDaysResponse> getEffectiveDays(GetEffectiveDaysRequest request);

    CompletableFuture<GetEmptyNumberNoMoreCallsInfoResponse> getEmptyNumberNoMoreCallsInfo(GetEmptyNumberNoMoreCallsInfoRequest request);

    CompletableFuture<GetMaxAttemptsPerDayResponse> getMaxAttemptsPerDay(GetMaxAttemptsPerDayRequest request);

    CompletableFuture<GetNumberDistrictInfoTemplateDownloadUrlResponse> getNumberDistrictInfoTemplateDownloadUrl(GetNumberDistrictInfoTemplateDownloadUrlRequest request);

    CompletableFuture<GetSummaryInfoResponse> getSummaryInfo(GetSummaryInfoRequest request);

    CompletableFuture<GetTaskByUuidResponse> getTaskByUuid(GetTaskByUuidRequest request);

    CompletableFuture<GetVersionResponse> getVersion(GetVersionRequest request);

    CompletableFuture<ImportScriptResponse> importScript(ImportScriptRequest request);

    CompletableFuture<InflightTaskTimeoutResponse> inflightTaskTimeout(InflightTaskTimeoutRequest request);

    CompletableFuture<ListAllTenantBindNumberBindingResponse> listAllTenantBindNumberBinding(ListAllTenantBindNumberBindingRequest request);

    CompletableFuture<ListChatbotInstancesResponse> listChatbotInstances(ListChatbotInstancesRequest request);

    CompletableFuture<ListDialogueFlowsResponse> listDialogueFlows(ListDialogueFlowsRequest request);

    CompletableFuture<ListDownloadTasksResponse> listDownloadTasks(ListDownloadTasksRequest request);

    CompletableFuture<ListGlobalQuestionsResponse> listGlobalQuestions(ListGlobalQuestionsRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListIntentsResponse> listIntents(ListIntentsRequest request);

    CompletableFuture<ListJobGroupsResponse> listJobGroups(ListJobGroupsRequest request);

    CompletableFuture<ListJobGroupsAsyncResponse> listJobGroupsAsync(ListJobGroupsAsyncRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<ListJobsByGroupResponse> listJobsByGroup(ListJobsByGroupRequest request);

    CompletableFuture<ListOutboundCallNumbersResponse> listOutboundCallNumbers(ListOutboundCallNumbersRequest request);

    CompletableFuture<ListResourceTagsResponse> listResourceTags(ListResourceTagsRequest request);

    CompletableFuture<ListSchedulerInstancesResponse> listSchedulerInstances(ListSchedulerInstancesRequest request);

    CompletableFuture<ListScriptPublishHistoriesResponse> listScriptPublishHistories(ListScriptPublishHistoriesRequest request);

    CompletableFuture<ListScriptRecordingResponse> listScriptRecording(ListScriptRecordingRequest request);

    CompletableFuture<ListScriptVoiceConfigsResponse> listScriptVoiceConfigs(ListScriptVoiceConfigsRequest request);

    CompletableFuture<ListScriptsResponse> listScripts(ListScriptsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    CompletableFuture<ModifyBatchJobsResponse> modifyBatchJobs(ModifyBatchJobsRequest request);

    CompletableFuture<ModifyDialogueFlowResponse> modifyDialogueFlow(ModifyDialogueFlowRequest request);

    CompletableFuture<ModifyEmptyNumberNoMoreCallsInfoResponse> modifyEmptyNumberNoMoreCallsInfo(ModifyEmptyNumberNoMoreCallsInfoRequest request);

    CompletableFuture<ModifyGlobalQuestionResponse> modifyGlobalQuestion(ModifyGlobalQuestionRequest request);

    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    CompletableFuture<ModifyIntentResponse> modifyIntent(ModifyIntentRequest request);

    CompletableFuture<ModifyJobGroupResponse> modifyJobGroup(ModifyJobGroupRequest request);

    CompletableFuture<ModifyOutboundCallNumberResponse> modifyOutboundCallNumber(ModifyOutboundCallNumberRequest request);

    CompletableFuture<ModifyScriptResponse> modifyScript(ModifyScriptRequest request);

    CompletableFuture<ModifyScriptVoiceConfigResponse> modifyScriptVoiceConfig(ModifyScriptVoiceConfigRequest request);

    CompletableFuture<ModifyTTSConfigResponse> modifyTTSConfig(ModifyTTSConfigRequest request);

    CompletableFuture<ModifyTagGroupsResponse> modifyTagGroups(ModifyTagGroupsRequest request);

    CompletableFuture<PublishScriptResponse> publishScript(PublishScriptRequest request);

    CompletableFuture<PublishScriptForDebugResponse> publishScriptForDebug(PublishScriptForDebugRequest request);

    CompletableFuture<QueryJobsResponse> queryJobs(QueryJobsRequest request);

    CompletableFuture<QueryJobsWithResultResponse> queryJobsWithResult(QueryJobsWithResultRequest request);

    CompletableFuture<QueryScriptWaveformsResponse> queryScriptWaveforms(QueryScriptWaveformsRequest request);

    CompletableFuture<QueryScriptsByStatusResponse> queryScriptsByStatus(QueryScriptsByStatusRequest request);

    CompletableFuture<RecordFailureResponse> recordFailure(RecordFailureRequest request);

    CompletableFuture<ResumeJobsResponse> resumeJobs(ResumeJobsRequest request);

    CompletableFuture<RollbackScriptResponse> rollbackScript(RollbackScriptRequest request);

    CompletableFuture<SaveAfterAnswerDelayPlaybackResponse> saveAfterAnswerDelayPlayback(SaveAfterAnswerDelayPlaybackRequest request);

    CompletableFuture<SaveBaseStrategyPeriodResponse> saveBaseStrategyPeriod(SaveBaseStrategyPeriodRequest request);

    CompletableFuture<SaveContactBlockListResponse> saveContactBlockList(SaveContactBlockListRequest request);

    CompletableFuture<SaveContactWhiteListResponse> saveContactWhiteList(SaveContactWhiteListRequest request);

    CompletableFuture<SaveEffectiveDaysResponse> saveEffectiveDays(SaveEffectiveDaysRequest request);

    CompletableFuture<SaveMaxAttemptsPerDayResponse> saveMaxAttemptsPerDay(SaveMaxAttemptsPerDayRequest request);

    CompletableFuture<SearchTaskResponse> searchTask(SearchTaskRequest request);

    CompletableFuture<StartJobResponse> startJob(StartJobRequest request);

    CompletableFuture<SubmitBatchJobsResponse> submitBatchJobs(SubmitBatchJobsRequest request);

    CompletableFuture<SubmitRecordingResponse> submitRecording(SubmitRecordingRequest request);

    CompletableFuture<SubmitScriptReviewResponse> submitScriptReview(SubmitScriptReviewRequest request);

    CompletableFuture<SuspendCallResponse> suspendCall(SuspendCallRequest request);

    CompletableFuture<SuspendCallWithFileResponse> suspendCallWithFile(SuspendCallWithFileRequest request);

    CompletableFuture<SuspendJobsResponse> suspendJobs(SuspendJobsRequest request);

    /**
      * **
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<TaskPreparingResponse> taskPreparing(TaskPreparingRequest request);

    CompletableFuture<TerminateCallResponse> terminateCall(TerminateCallRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UploadScriptRecordingResponse> uploadScriptRecording(UploadScriptRecordingRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<WithdrawScriptReviewResponse> withdrawScriptReview(WithdrawScriptReviewRequest request);

}
