// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.voicenavigator20180612.models.*;
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

    CompletableFuture<AssociateChatbotInstanceResponse> associateChatbotInstance(AssociateChatbotInstanceRequest request);

    CompletableFuture<AuditTTSVoiceResponse> auditTTSVoice(AuditTTSVoiceRequest request);

    CompletableFuture<BeginDialogueResponse> beginDialogue(BeginDialogueRequest request);

    CompletableFuture<CollectedNumberResponse> collectedNumber(CollectedNumberRequest request);

    CompletableFuture<CreateDownloadUrlResponse> createDownloadUrl(CreateDownloadUrlRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<DebugBeginDialogueResponse> debugBeginDialogue(DebugBeginDialogueRequest request);

    CompletableFuture<DebugCollectedNumberResponse> debugCollectedNumber(DebugCollectedNumberRequest request);

    CompletableFuture<DebugDialogueResponse> debugDialogue(DebugDialogueRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DescribeAsrVadConfigResponse> describeAsrVadConfig(DescribeAsrVadConfigRequest request);

    CompletableFuture<DescribeConversationResponse> describeConversation(DescribeConversationRequest request);

    CompletableFuture<DescribeConversationContextResponse> describeConversationContext(DescribeConversationContextRequest request);

    CompletableFuture<DescribeExportProgressResponse> describeExportProgress(DescribeExportProgressRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeNavigationConfigResponse> describeNavigationConfig(DescribeNavigationConfigRequest request);

    CompletableFuture<DescribeRecordingResponse> describeRecording(DescribeRecordingRequest request);

    CompletableFuture<DescribeStatisticalDataResponse> describeStatisticalData(DescribeStatisticalDataRequest request);

    CompletableFuture<DescribeTTSConfigResponse> describeTTSConfig(DescribeTTSConfigRequest request);

    CompletableFuture<DescribeVoiceConfigResponse> describeVoiceConfig(DescribeVoiceConfigRequest request);

    CompletableFuture<DialogueResponse> dialogue(DialogueRequest request);

    CompletableFuture<DisableInstanceResponse> disableInstance(DisableInstanceRequest request);

    CompletableFuture<EnableInstanceResponse> enableInstance(EnableInstanceRequest request);

    CompletableFuture<EndDialogueResponse> endDialogue(EndDialogueRequest request);

    CompletableFuture<ExportConversationDetailsResponse> exportConversationDetails(ExportConversationDetailsRequest request);

    CompletableFuture<ExportStatisticalDataResponse> exportStatisticalData(ExportStatisticalDataRequest request);

    CompletableFuture<GetInstanceConfigResponse> getInstanceConfig(GetInstanceConfigRequest request);

    CompletableFuture<GetNewBargeInSwitchResponse> getNewBargeInSwitch(GetNewBargeInSwitchRequest request);

    CompletableFuture<ListChatbotInstancesResponse> listChatbotInstances(ListChatbotInstancesRequest request);

    CompletableFuture<ListConversationDetailsResponse> listConversationDetails(ListConversationDetailsRequest request);

    CompletableFuture<ListConversationsResponse> listConversations(ListConversationsRequest request);

    CompletableFuture<ListDownloadTasksResponse> listDownloadTasks(ListDownloadTasksRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ModifyAsrVadConfigResponse> modifyAsrVadConfig(ModifyAsrVadConfigRequest request);

    CompletableFuture<ModifyGreetingConfigResponse> modifyGreetingConfig(ModifyGreetingConfigRequest request);

    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    CompletableFuture<ModifySilenceTimeoutConfigResponse> modifySilenceTimeoutConfig(ModifySilenceTimeoutConfigRequest request);

    CompletableFuture<ModifyTTSConfigResponse> modifyTTSConfig(ModifyTTSConfigRequest request);

    CompletableFuture<ModifyUnrecognizingConfigResponse> modifyUnrecognizingConfig(ModifyUnrecognizingConfigRequest request);

    CompletableFuture<QueryConversationsResponse> queryConversations(QueryConversationsRequest request);

    CompletableFuture<SaveRecordingResponse> saveRecording(SaveRecordingRequest request);

    CompletableFuture<SilenceTimeoutResponse> silenceTimeout(SilenceTimeoutRequest request);

    CompletableFuture<UpdateNewBargeInSwitchResponse> updateNewBargeInSwitch(UpdateNewBargeInSwitchRequest request);

}
