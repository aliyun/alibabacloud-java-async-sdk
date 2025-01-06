// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.voicenavigator20180612.models.*;
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
     * @param request the request parameters of AssociateChatbotInstance  AssociateChatbotInstanceRequest
     * @return AssociateChatbotInstanceResponse
     */
    CompletableFuture<AssociateChatbotInstanceResponse> associateChatbotInstance(AssociateChatbotInstanceRequest request);

    /**
     * @param request the request parameters of AuditTTSVoice  AuditTTSVoiceRequest
     * @return AuditTTSVoiceResponse
     */
    CompletableFuture<AuditTTSVoiceResponse> auditTTSVoice(AuditTTSVoiceRequest request);

    /**
     * @param request the request parameters of BeginDialogue  BeginDialogueRequest
     * @return BeginDialogueResponse
     */
    CompletableFuture<BeginDialogueResponse> beginDialogue(BeginDialogueRequest request);

    /**
     * @param request the request parameters of CollectedNumber  CollectedNumberRequest
     * @return CollectedNumberResponse
     */
    CompletableFuture<CollectedNumberResponse> collectedNumber(CollectedNumberRequest request);

    /**
     * @param request the request parameters of CreateDownloadUrl  CreateDownloadUrlRequest
     * @return CreateDownloadUrlResponse
     */
    CompletableFuture<CreateDownloadUrlResponse> createDownloadUrl(CreateDownloadUrlRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of DebugBeginDialogue  DebugBeginDialogueRequest
     * @return DebugBeginDialogueResponse
     */
    CompletableFuture<DebugBeginDialogueResponse> debugBeginDialogue(DebugBeginDialogueRequest request);

    /**
     * @param request the request parameters of DebugCollectedNumber  DebugCollectedNumberRequest
     * @return DebugCollectedNumberResponse
     */
    CompletableFuture<DebugCollectedNumberResponse> debugCollectedNumber(DebugCollectedNumberRequest request);

    /**
     * @param request the request parameters of DebugDialogue  DebugDialogueRequest
     * @return DebugDialogueResponse
     */
    CompletableFuture<DebugDialogueResponse> debugDialogue(DebugDialogueRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DescribeConversation  DescribeConversationRequest
     * @return DescribeConversationResponse
     */
    CompletableFuture<DescribeConversationResponse> describeConversation(DescribeConversationRequest request);

    /**
     * @param request the request parameters of DescribeConversationContext  DescribeConversationContextRequest
     * @return DescribeConversationContextResponse
     */
    CompletableFuture<DescribeConversationContextResponse> describeConversationContext(DescribeConversationContextRequest request);

    /**
     * @param request the request parameters of DescribeExportProgress  DescribeExportProgressRequest
     * @return DescribeExportProgressResponse
     */
    CompletableFuture<DescribeExportProgressResponse> describeExportProgress(DescribeExportProgressRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeNavigationConfig  DescribeNavigationConfigRequest
     * @return DescribeNavigationConfigResponse
     */
    CompletableFuture<DescribeNavigationConfigResponse> describeNavigationConfig(DescribeNavigationConfigRequest request);

    /**
     * @param request the request parameters of DescribeRecording  DescribeRecordingRequest
     * @return DescribeRecordingResponse
     */
    CompletableFuture<DescribeRecordingResponse> describeRecording(DescribeRecordingRequest request);

    /**
     * @param request the request parameters of DescribeStatisticalData  DescribeStatisticalDataRequest
     * @return DescribeStatisticalDataResponse
     */
    CompletableFuture<DescribeStatisticalDataResponse> describeStatisticalData(DescribeStatisticalDataRequest request);

    /**
     * @param request the request parameters of DescribeTTSConfig  DescribeTTSConfigRequest
     * @return DescribeTTSConfigResponse
     */
    CompletableFuture<DescribeTTSConfigResponse> describeTTSConfig(DescribeTTSConfigRequest request);

    /**
     * @param request the request parameters of Dialogue  DialogueRequest
     * @return DialogueResponse
     */
    CompletableFuture<DialogueResponse> dialogue(DialogueRequest request);

    /**
     * @param request the request parameters of DisableInstance  DisableInstanceRequest
     * @return DisableInstanceResponse
     */
    CompletableFuture<DisableInstanceResponse> disableInstance(DisableInstanceRequest request);

    /**
     * @param request the request parameters of EnableInstance  EnableInstanceRequest
     * @return EnableInstanceResponse
     */
    CompletableFuture<EnableInstanceResponse> enableInstance(EnableInstanceRequest request);

    /**
     * @param request the request parameters of EndDialogue  EndDialogueRequest
     * @return EndDialogueResponse
     */
    CompletableFuture<EndDialogueResponse> endDialogue(EndDialogueRequest request);

    /**
     * @param request the request parameters of ExportConversationDetails  ExportConversationDetailsRequest
     * @return ExportConversationDetailsResponse
     */
    CompletableFuture<ExportConversationDetailsResponse> exportConversationDetails(ExportConversationDetailsRequest request);

    /**
     * @param request the request parameters of ExportStatisticalData  ExportStatisticalDataRequest
     * @return ExportStatisticalDataResponse
     */
    CompletableFuture<ExportStatisticalDataResponse> exportStatisticalData(ExportStatisticalDataRequest request);

    /**
     * @param request the request parameters of GenerateUploadUrl  GenerateUploadUrlRequest
     * @return GenerateUploadUrlResponse
     */
    CompletableFuture<GenerateUploadUrlResponse> generateUploadUrl(GenerateUploadUrlRequest request);

    /**
     * @param request the request parameters of GetAsrConfig  GetAsrConfigRequest
     * @return GetAsrConfigResponse
     */
    CompletableFuture<GetAsrConfigResponse> getAsrConfig(GetAsrConfigRequest request);

    /**
     * @param request the request parameters of GetRealTimeConcurrency  GetRealTimeConcurrencyRequest
     * @return GetRealTimeConcurrencyResponse
     */
    CompletableFuture<GetRealTimeConcurrencyResponse> getRealTimeConcurrency(GetRealTimeConcurrencyRequest request);

    /**
     * @param request the request parameters of ListChatbotInstances  ListChatbotInstancesRequest
     * @return ListChatbotInstancesResponse
     */
    CompletableFuture<ListChatbotInstancesResponse> listChatbotInstances(ListChatbotInstancesRequest request);

    /**
     * @param request the request parameters of ListConversationDetails  ListConversationDetailsRequest
     * @return ListConversationDetailsResponse
     */
    CompletableFuture<ListConversationDetailsResponse> listConversationDetails(ListConversationDetailsRequest request);

    /**
     * @param request the request parameters of ListConversations  ListConversationsRequest
     * @return ListConversationsResponse
     */
    CompletableFuture<ListConversationsResponse> listConversations(ListConversationsRequest request);

    /**
     * @param request the request parameters of ListDownloadTasks  ListDownloadTasksRequest
     * @return ListDownloadTasksResponse
     */
    CompletableFuture<ListDownloadTasksResponse> listDownloadTasks(ListDownloadTasksRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ModifyAsrConfig  ModifyAsrConfigRequest
     * @return ModifyAsrConfigResponse
     */
    CompletableFuture<ModifyAsrConfigResponse> modifyAsrConfig(ModifyAsrConfigRequest request);

    /**
     * @param request the request parameters of ModifyGreetingConfig  ModifyGreetingConfigRequest
     * @return ModifyGreetingConfigResponse
     */
    CompletableFuture<ModifyGreetingConfigResponse> modifyGreetingConfig(ModifyGreetingConfigRequest request);

    /**
     * @param request the request parameters of ModifyInstance  ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    /**
     * @param request the request parameters of ModifySilenceTimeoutConfig  ModifySilenceTimeoutConfigRequest
     * @return ModifySilenceTimeoutConfigResponse
     */
    CompletableFuture<ModifySilenceTimeoutConfigResponse> modifySilenceTimeoutConfig(ModifySilenceTimeoutConfigRequest request);

    /**
     * @param request the request parameters of ModifyTTSConfig  ModifyTTSConfigRequest
     * @return ModifyTTSConfigResponse
     */
    CompletableFuture<ModifyTTSConfigResponse> modifyTTSConfig(ModifyTTSConfigRequest request);

    /**
     * @param request the request parameters of ModifyUnrecognizingConfig  ModifyUnrecognizingConfigRequest
     * @return ModifyUnrecognizingConfigResponse
     */
    CompletableFuture<ModifyUnrecognizingConfigResponse> modifyUnrecognizingConfig(ModifyUnrecognizingConfigRequest request);

    /**
     * @param request the request parameters of QueryConversations  QueryConversationsRequest
     * @return QueryConversationsResponse
     */
    CompletableFuture<QueryConversationsResponse> queryConversations(QueryConversationsRequest request);

    /**
     * @param request the request parameters of SaveRecording  SaveRecordingRequest
     * @return SaveRecordingResponse
     */
    CompletableFuture<SaveRecordingResponse> saveRecording(SaveRecordingRequest request);

    /**
     * @param request the request parameters of SilenceTimeout  SilenceTimeoutRequest
     * @return SilenceTimeoutResponse
     */
    CompletableFuture<SilenceTimeoutResponse> silenceTimeout(SilenceTimeoutRequest request);

}
