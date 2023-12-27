// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rtc20180111.models.*;
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

    CompletableFuture<AddRecordTemplateResponse> addRecordTemplate(AddRecordTemplateRequest request);

    CompletableFuture<CreateAutoLiveStreamRuleResponse> createAutoLiveStreamRule(CreateAutoLiveStreamRuleRequest request);

    CompletableFuture<CreateEventSubscribeResponse> createEventSubscribe(CreateEventSubscribeRequest request);

    CompletableFuture<CreateMPULayoutResponse> createMPULayout(CreateMPULayoutRequest request);

    CompletableFuture<DeleteAutoLiveStreamRuleResponse> deleteAutoLiveStreamRule(DeleteAutoLiveStreamRuleRequest request);

    CompletableFuture<DeleteChannelResponse> deleteChannel(DeleteChannelRequest request);

    CompletableFuture<DeleteEventSubscribeResponse> deleteEventSubscribe(DeleteEventSubscribeRequest request);

    CompletableFuture<DeleteMPULayoutResponse> deleteMPULayout(DeleteMPULayoutRequest request);

    CompletableFuture<DeleteRecordTemplateResponse> deleteRecordTemplate(DeleteRecordTemplateRequest request);

    CompletableFuture<DescribeAppKeyResponse> describeAppKey(DescribeAppKeyRequest request);

    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    CompletableFuture<DescribeAutoLiveStreamRuleResponse> describeAutoLiveStreamRule(DescribeAutoLiveStreamRuleRequest request);

    CompletableFuture<DescribeCallListResponse> describeCallList(DescribeCallListRequest request);

    CompletableFuture<DescribeChannelParticipantsResponse> describeChannelParticipants(DescribeChannelParticipantsRequest request);

    CompletableFuture<DescribeChannelUsersResponse> describeChannelUsers(DescribeChannelUsersRequest request);

    CompletableFuture<DescribeMPULayoutInfoListResponse> describeMPULayoutInfoList(DescribeMPULayoutInfoListRequest request);

    CompletableFuture<DescribeRecordFilesResponse> describeRecordFiles(DescribeRecordFilesRequest request);

    CompletableFuture<DescribeRecordTemplatesResponse> describeRecordTemplates(DescribeRecordTemplatesRequest request);

    CompletableFuture<DescribeRtcChannelListResponse> describeRtcChannelList(DescribeRtcChannelListRequest request);

    CompletableFuture<DescribeRtcChannelMetricResponse> describeRtcChannelMetric(DescribeRtcChannelMetricRequest request);

    CompletableFuture<DescribeRtcDurationDataResponse> describeRtcDurationData(DescribeRtcDurationDataRequest request);

    CompletableFuture<DescribeRtcPeakChannelCntDataResponse> describeRtcPeakChannelCntData(DescribeRtcPeakChannelCntDataRequest request);

    CompletableFuture<DescribeRtcUserCntDataResponse> describeRtcUserCntData(DescribeRtcUserCntDataRequest request);

    CompletableFuture<DescribeUserInfoInChannelResponse> describeUserInfoInChannel(DescribeUserInfoInChannelRequest request);

    CompletableFuture<DisableAutoLiveStreamRuleResponse> disableAutoLiveStreamRule(DisableAutoLiveStreamRuleRequest request);

    CompletableFuture<EnableAutoLiveStreamRuleResponse> enableAutoLiveStreamRule(EnableAutoLiveStreamRuleRequest request);

    CompletableFuture<GetMPUTaskStatusResponse> getMPUTaskStatus(GetMPUTaskStatusRequest request);

    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    CompletableFuture<ModifyMPULayoutResponse> modifyMPULayout(ModifyMPULayoutRequest request);

    CompletableFuture<RemoveTerminalsResponse> removeTerminals(RemoveTerminalsRequest request);

    CompletableFuture<StartMPUTaskResponse> startMPUTask(StartMPUTaskRequest request);

    CompletableFuture<StartRecordTaskResponse> startRecordTask(StartRecordTaskRequest request);

    CompletableFuture<StopMPUTaskResponse> stopMPUTask(StopMPUTaskRequest request);

    CompletableFuture<StopRecordTaskResponse> stopRecordTask(StopRecordTaskRequest request);

    CompletableFuture<UpdateAutoLiveStreamRuleResponse> updateAutoLiveStreamRule(UpdateAutoLiveStreamRuleRequest request);

    CompletableFuture<UpdateMPUTaskResponse> updateMPUTask(UpdateMPUTaskRequest request);

    CompletableFuture<UpdateRecordTaskResponse> updateRecordTask(UpdateRecordTaskRequest request);

    CompletableFuture<UpdateRecordTemplateResponse> updateRecordTemplate(UpdateRecordTemplateRequest request);

}
