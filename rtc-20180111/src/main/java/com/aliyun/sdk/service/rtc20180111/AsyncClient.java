// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rtc20180111.models.*;
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
     * @param request the request parameters of AddRecordTemplate  AddRecordTemplateRequest
     * @return AddRecordTemplateResponse
     */
    CompletableFuture<AddRecordTemplateResponse> addRecordTemplate(AddRecordTemplateRequest request);

    /**
     * @param request the request parameters of CreateAppLayout  CreateAppLayoutRequest
     * @return CreateAppLayoutResponse
     */
    CompletableFuture<CreateAppLayoutResponse> createAppLayout(CreateAppLayoutRequest request);

    /**
     * @param request the request parameters of CreateAppRecordTemplate  CreateAppRecordTemplateRequest
     * @return CreateAppRecordTemplateResponse
     */
    CompletableFuture<CreateAppRecordTemplateResponse> createAppRecordTemplate(CreateAppRecordTemplateRequest request);

    /**
     * @param request the request parameters of CreateAppStreamingOutTemplate  CreateAppStreamingOutTemplateRequest
     * @return CreateAppStreamingOutTemplateResponse
     */
    CompletableFuture<CreateAppStreamingOutTemplateResponse> createAppStreamingOutTemplate(CreateAppStreamingOutTemplateRequest request);

    /**
     * @param request the request parameters of CreateAutoLiveStreamRule  CreateAutoLiveStreamRuleRequest
     * @return CreateAutoLiveStreamRuleResponse
     */
    CompletableFuture<CreateAutoLiveStreamRuleResponse> createAutoLiveStreamRule(CreateAutoLiveStreamRuleRequest request);

    /**
     * @param request the request parameters of CreateEventSubscribe  CreateEventSubscribeRequest
     * @return CreateEventSubscribeResponse
     */
    CompletableFuture<CreateEventSubscribeResponse> createEventSubscribe(CreateEventSubscribeRequest request);

    /**
     * @param request the request parameters of CreateMPULayout  CreateMPULayoutRequest
     * @return CreateMPULayoutResponse
     */
    CompletableFuture<CreateMPULayoutResponse> createMPULayout(CreateMPULayoutRequest request);

    /**
     * @param request the request parameters of DeleteAppLayout  DeleteAppLayoutRequest
     * @return DeleteAppLayoutResponse
     */
    CompletableFuture<DeleteAppLayoutResponse> deleteAppLayout(DeleteAppLayoutRequest request);

    /**
     * @param request the request parameters of DeleteAppRecordTemplate  DeleteAppRecordTemplateRequest
     * @return DeleteAppRecordTemplateResponse
     */
    CompletableFuture<DeleteAppRecordTemplateResponse> deleteAppRecordTemplate(DeleteAppRecordTemplateRequest request);

    /**
     * @param request the request parameters of DeleteAppStreamingOutTemplate  DeleteAppStreamingOutTemplateRequest
     * @return DeleteAppStreamingOutTemplateResponse
     */
    CompletableFuture<DeleteAppStreamingOutTemplateResponse> deleteAppStreamingOutTemplate(DeleteAppStreamingOutTemplateRequest request);

    /**
     * @param request the request parameters of DeleteAutoLiveStreamRule  DeleteAutoLiveStreamRuleRequest
     * @return DeleteAutoLiveStreamRuleResponse
     */
    CompletableFuture<DeleteAutoLiveStreamRuleResponse> deleteAutoLiveStreamRule(DeleteAutoLiveStreamRuleRequest request);

    /**
     * @param request the request parameters of DeleteChannel  DeleteChannelRequest
     * @return DeleteChannelResponse
     */
    CompletableFuture<DeleteChannelResponse> deleteChannel(DeleteChannelRequest request);

    /**
     * @param request the request parameters of DeleteEventSubscribe  DeleteEventSubscribeRequest
     * @return DeleteEventSubscribeResponse
     */
    CompletableFuture<DeleteEventSubscribeResponse> deleteEventSubscribe(DeleteEventSubscribeRequest request);

    /**
     * @param request the request parameters of DeleteMPULayout  DeleteMPULayoutRequest
     * @return DeleteMPULayoutResponse
     */
    CompletableFuture<DeleteMPULayoutResponse> deleteMPULayout(DeleteMPULayoutRequest request);

    /**
     * @param request the request parameters of DeleteRecordTemplate  DeleteRecordTemplateRequest
     * @return DeleteRecordTemplateResponse
     */
    CompletableFuture<DeleteRecordTemplateResponse> deleteRecordTemplate(DeleteRecordTemplateRequest request);

    /**
     * @param request the request parameters of DescribeAllCallback  DescribeAllCallbackRequest
     * @return DescribeAllCallbackResponse
     */
    CompletableFuture<DescribeAllCallbackResponse> describeAllCallback(DescribeAllCallbackRequest request);

    /**
     * @param request the request parameters of DescribeAppCallStatus  DescribeAppCallStatusRequest
     * @return DescribeAppCallStatusResponse
     */
    CompletableFuture<DescribeAppCallStatusResponse> describeAppCallStatus(DescribeAppCallStatusRequest request);

    /**
     * @param request the request parameters of DescribeAppCallbackSecretKey  DescribeAppCallbackSecretKeyRequest
     * @return DescribeAppCallbackSecretKeyResponse
     */
    CompletableFuture<DescribeAppCallbackSecretKeyResponse> describeAppCallbackSecretKey(DescribeAppCallbackSecretKeyRequest request);

    /**
     * @param request the request parameters of DescribeAppKey  DescribeAppKeyRequest
     * @return DescribeAppKeyResponse
     */
    CompletableFuture<DescribeAppKeyResponse> describeAppKey(DescribeAppKeyRequest request);

    /**
     * @param request the request parameters of DescribeAppLayouts  DescribeAppLayoutsRequest
     * @return DescribeAppLayoutsResponse
     */
    CompletableFuture<DescribeAppLayoutsResponse> describeAppLayouts(DescribeAppLayoutsRequest request);

    /**
     * @param request the request parameters of DescribeAppLiveStreamStatus  DescribeAppLiveStreamStatusRequest
     * @return DescribeAppLiveStreamStatusResponse
     */
    CompletableFuture<DescribeAppLiveStreamStatusResponse> describeAppLiveStreamStatus(DescribeAppLiveStreamStatusRequest request);

    /**
     * @param request the request parameters of DescribeAppRecordStatus  DescribeAppRecordStatusRequest
     * @return DescribeAppRecordStatusResponse
     */
    CompletableFuture<DescribeAppRecordStatusResponse> describeAppRecordStatus(DescribeAppRecordStatusRequest request);

    /**
     * @param request the request parameters of DescribeAppRecordTemplates  DescribeAppRecordTemplatesRequest
     * @return DescribeAppRecordTemplatesResponse
     */
    CompletableFuture<DescribeAppRecordTemplatesResponse> describeAppRecordTemplates(DescribeAppRecordTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeAppRecordingFiles  DescribeAppRecordingFilesRequest
     * @return DescribeAppRecordingFilesResponse
     */
    CompletableFuture<DescribeAppRecordingFilesResponse> describeAppRecordingFiles(DescribeAppRecordingFilesRequest request);

    /**
     * @param request the request parameters of DescribeAppStreamingOutTemplates  DescribeAppStreamingOutTemplatesRequest
     * @return DescribeAppStreamingOutTemplatesResponse
     */
    CompletableFuture<DescribeAppStreamingOutTemplatesResponse> describeAppStreamingOutTemplates(DescribeAppStreamingOutTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeApps  DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    /**
     * @param request the request parameters of DescribeAutoLiveStreamRule  DescribeAutoLiveStreamRuleRequest
     * @return DescribeAutoLiveStreamRuleResponse
     */
    CompletableFuture<DescribeAutoLiveStreamRuleResponse> describeAutoLiveStreamRule(DescribeAutoLiveStreamRuleRequest request);

    /**
     * @param request the request parameters of DescribeCall  DescribeCallRequest
     * @return DescribeCallResponse
     */
    CompletableFuture<DescribeCallResponse> describeCall(DescribeCallRequest request);

    /**
     * @param request the request parameters of DescribeCallList  DescribeCallListRequest
     * @return DescribeCallListResponse
     */
    CompletableFuture<DescribeCallListResponse> describeCallList(DescribeCallListRequest request);

    /**
     * @param request the request parameters of DescribeCallbacks  DescribeCallbacksRequest
     * @return DescribeCallbacksResponse
     */
    CompletableFuture<DescribeCallbacksResponse> describeCallbacks(DescribeCallbacksRequest request);

    /**
     * @param request the request parameters of DescribeChannel  DescribeChannelRequest
     * @return DescribeChannelResponse
     */
    CompletableFuture<DescribeChannelResponse> describeChannel(DescribeChannelRequest request);

    /**
     * @param request the request parameters of DescribeChannelAllUsers  DescribeChannelAllUsersRequest
     * @return DescribeChannelAllUsersResponse
     */
    CompletableFuture<DescribeChannelAllUsersResponse> describeChannelAllUsers(DescribeChannelAllUsersRequest request);

    /**
     * @param request the request parameters of DescribeChannelAreaDistributionStatData  DescribeChannelAreaDistributionStatDataRequest
     * @return DescribeChannelAreaDistributionStatDataResponse
     */
    CompletableFuture<DescribeChannelAreaDistributionStatDataResponse> describeChannelAreaDistributionStatData(DescribeChannelAreaDistributionStatDataRequest request);

    /**
     * @param request the request parameters of DescribeChannelDistributionStatData  DescribeChannelDistributionStatDataRequest
     * @return DescribeChannelDistributionStatDataResponse
     */
    CompletableFuture<DescribeChannelDistributionStatDataResponse> describeChannelDistributionStatData(DescribeChannelDistributionStatDataRequest request);

    /**
     * @param request the request parameters of DescribeChannelOverallData  DescribeChannelOverallDataRequest
     * @return DescribeChannelOverallDataResponse
     */
    CompletableFuture<DescribeChannelOverallDataResponse> describeChannelOverallData(DescribeChannelOverallDataRequest request);

    /**
     * @param request the request parameters of DescribeChannelParticipants  DescribeChannelParticipantsRequest
     * @return DescribeChannelParticipantsResponse
     */
    CompletableFuture<DescribeChannelParticipantsResponse> describeChannelParticipants(DescribeChannelParticipantsRequest request);

    /**
     * @param request the request parameters of DescribeChannelTopPubUserList  DescribeChannelTopPubUserListRequest
     * @return DescribeChannelTopPubUserListResponse
     */
    CompletableFuture<DescribeChannelTopPubUserListResponse> describeChannelTopPubUserList(DescribeChannelTopPubUserListRequest request);

    /**
     * @param request the request parameters of DescribeChannelUser  DescribeChannelUserRequest
     * @return DescribeChannelUserResponse
     */
    CompletableFuture<DescribeChannelUserResponse> describeChannelUser(DescribeChannelUserRequest request);

    /**
     * @param request the request parameters of DescribeChannelUserMetrics  DescribeChannelUserMetricsRequest
     * @return DescribeChannelUserMetricsResponse
     */
    CompletableFuture<DescribeChannelUserMetricsResponse> describeChannelUserMetrics(DescribeChannelUserMetricsRequest request);

    /**
     * @param request the request parameters of DescribeChannelUsers  DescribeChannelUsersRequest
     * @return DescribeChannelUsersResponse
     */
    CompletableFuture<DescribeChannelUsersResponse> describeChannelUsers(DescribeChannelUsersRequest request);

    /**
     * @param request the request parameters of DescribeChannels  DescribeChannelsRequest
     * @return DescribeChannelsResponse
     */
    CompletableFuture<DescribeChannelsResponse> describeChannels(DescribeChannelsRequest request);

    /**
     * @param request the request parameters of DescribeEndPointEventList  DescribeEndPointEventListRequest
     * @return DescribeEndPointEventListResponse
     */
    CompletableFuture<DescribeEndPointEventListResponse> describeEndPointEventList(DescribeEndPointEventListRequest request);

    /**
     * @param request the request parameters of DescribeEndPointMetricData  DescribeEndPointMetricDataRequest
     * @return DescribeEndPointMetricDataResponse
     */
    CompletableFuture<DescribeEndPointMetricDataResponse> describeEndPointMetricData(DescribeEndPointMetricDataRequest request);

    /**
     * @param request the request parameters of DescribeFaultDiagnosisFactorDistributionStat  DescribeFaultDiagnosisFactorDistributionStatRequest
     * @return DescribeFaultDiagnosisFactorDistributionStatResponse
     */
    CompletableFuture<DescribeFaultDiagnosisFactorDistributionStatResponse> describeFaultDiagnosisFactorDistributionStat(DescribeFaultDiagnosisFactorDistributionStatRequest request);

    /**
     * @param request the request parameters of DescribeFaultDiagnosisOverallData  DescribeFaultDiagnosisOverallDataRequest
     * @return DescribeFaultDiagnosisOverallDataResponse
     */
    CompletableFuture<DescribeFaultDiagnosisOverallDataResponse> describeFaultDiagnosisOverallData(DescribeFaultDiagnosisOverallDataRequest request);

    /**
     * @param request the request parameters of DescribeFaultDiagnosisUserDetail  DescribeFaultDiagnosisUserDetailRequest
     * @return DescribeFaultDiagnosisUserDetailResponse
     */
    CompletableFuture<DescribeFaultDiagnosisUserDetailResponse> describeFaultDiagnosisUserDetail(DescribeFaultDiagnosisUserDetailRequest request);

    /**
     * @param request the request parameters of DescribeFaultDiagnosisUserList  DescribeFaultDiagnosisUserListRequest
     * @return DescribeFaultDiagnosisUserListResponse
     */
    CompletableFuture<DescribeFaultDiagnosisUserListResponse> describeFaultDiagnosisUserList(DescribeFaultDiagnosisUserListRequest request);

    /**
     * @param request the request parameters of DescribeMPULayoutInfoList  DescribeMPULayoutInfoListRequest
     * @return DescribeMPULayoutInfoListResponse
     */
    CompletableFuture<DescribeMPULayoutInfoListResponse> describeMPULayoutInfoList(DescribeMPULayoutInfoListRequest request);

    /**
     * @param request the request parameters of DescribePubUserListBySubUser  DescribePubUserListBySubUserRequest
     * @return DescribePubUserListBySubUserResponse
     */
    CompletableFuture<DescribePubUserListBySubUserResponse> describePubUserListBySubUser(DescribePubUserListBySubUserRequest request);

    /**
     * @param request the request parameters of DescribeQoeMetricData  DescribeQoeMetricDataRequest
     * @return DescribeQoeMetricDataResponse
     */
    CompletableFuture<DescribeQoeMetricDataResponse> describeQoeMetricData(DescribeQoeMetricDataRequest request);

    /**
     * @param request the request parameters of DescribeQualityAreaDistributionStatData  DescribeQualityAreaDistributionStatDataRequest
     * @return DescribeQualityAreaDistributionStatDataResponse
     */
    CompletableFuture<DescribeQualityAreaDistributionStatDataResponse> describeQualityAreaDistributionStatData(DescribeQualityAreaDistributionStatDataRequest request);

    /**
     * @param request the request parameters of DescribeQualityDistributionStatData  DescribeQualityDistributionStatDataRequest
     * @return DescribeQualityDistributionStatDataResponse
     */
    CompletableFuture<DescribeQualityDistributionStatDataResponse> describeQualityDistributionStatData(DescribeQualityDistributionStatDataRequest request);

    /**
     * @param request the request parameters of DescribeQualityOsSdkVersionDistributionStatData  DescribeQualityOsSdkVersionDistributionStatDataRequest
     * @return DescribeQualityOsSdkVersionDistributionStatDataResponse
     */
    CompletableFuture<DescribeQualityOsSdkVersionDistributionStatDataResponse> describeQualityOsSdkVersionDistributionStatData(DescribeQualityOsSdkVersionDistributionStatDataRequest request);

    /**
     * @param request the request parameters of DescribeQualityOverallData  DescribeQualityOverallDataRequest
     * @return DescribeQualityOverallDataResponse
     */
    CompletableFuture<DescribeQualityOverallDataResponse> describeQualityOverallData(DescribeQualityOverallDataRequest request);

    /**
     * @param request the request parameters of DescribeRecordFiles  DescribeRecordFilesRequest
     * @return DescribeRecordFilesResponse
     */
    CompletableFuture<DescribeRecordFilesResponse> describeRecordFiles(DescribeRecordFilesRequest request);

    /**
     * @param request the request parameters of DescribeRecordTemplates  DescribeRecordTemplatesRequest
     * @return DescribeRecordTemplatesResponse
     */
    CompletableFuture<DescribeRecordTemplatesResponse> describeRecordTemplates(DescribeRecordTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeRtcChannelList  DescribeRtcChannelListRequest
     * @return DescribeRtcChannelListResponse
     */
    CompletableFuture<DescribeRtcChannelListResponse> describeRtcChannelList(DescribeRtcChannelListRequest request);

    /**
     * @param request the request parameters of DescribeRtcChannelMetric  DescribeRtcChannelMetricRequest
     * @return DescribeRtcChannelMetricResponse
     */
    CompletableFuture<DescribeRtcChannelMetricResponse> describeRtcChannelMetric(DescribeRtcChannelMetricRequest request);

    /**
     * @param request the request parameters of DescribeRtcDurationData  DescribeRtcDurationDataRequest
     * @return DescribeRtcDurationDataResponse
     */
    CompletableFuture<DescribeRtcDurationDataResponse> describeRtcDurationData(DescribeRtcDurationDataRequest request);

    /**
     * @param request the request parameters of DescribeRtcPeakChannelCntData  DescribeRtcPeakChannelCntDataRequest
     * @return DescribeRtcPeakChannelCntDataResponse
     */
    CompletableFuture<DescribeRtcPeakChannelCntDataResponse> describeRtcPeakChannelCntData(DescribeRtcPeakChannelCntDataRequest request);

    /**
     * @param request the request parameters of DescribeRtcUserCntData  DescribeRtcUserCntDataRequest
     * @return DescribeRtcUserCntDataResponse
     */
    CompletableFuture<DescribeRtcUserCntDataResponse> describeRtcUserCntData(DescribeRtcUserCntDataRequest request);

    /**
     * @param request the request parameters of DescribeStreamingOutStatus  DescribeStreamingOutStatusRequest
     * @return DescribeStreamingOutStatusResponse
     */
    CompletableFuture<DescribeStreamingOutStatusResponse> describeStreamingOutStatus(DescribeStreamingOutStatusRequest request);

    /**
     * @param request the request parameters of DescribeSystemLayoutList  DescribeSystemLayoutListRequest
     * @return DescribeSystemLayoutListResponse
     */
    CompletableFuture<DescribeSystemLayoutListResponse> describeSystemLayoutList(DescribeSystemLayoutListRequest request);

    /**
     * @param request the request parameters of DescribeUsageAreaDistributionStatData  DescribeUsageAreaDistributionStatDataRequest
     * @return DescribeUsageAreaDistributionStatDataResponse
     */
    CompletableFuture<DescribeUsageAreaDistributionStatDataResponse> describeUsageAreaDistributionStatData(DescribeUsageAreaDistributionStatDataRequest request);

    /**
     * @param request the request parameters of DescribeUsageDistributionStatData  DescribeUsageDistributionStatDataRequest
     * @return DescribeUsageDistributionStatDataResponse
     */
    CompletableFuture<DescribeUsageDistributionStatDataResponse> describeUsageDistributionStatData(DescribeUsageDistributionStatDataRequest request);

    /**
     * @param request the request parameters of DescribeUsageOsSdkVersionDistributionStatData  DescribeUsageOsSdkVersionDistributionStatDataRequest
     * @return DescribeUsageOsSdkVersionDistributionStatDataResponse
     */
    CompletableFuture<DescribeUsageOsSdkVersionDistributionStatDataResponse> describeUsageOsSdkVersionDistributionStatData(DescribeUsageOsSdkVersionDistributionStatDataRequest request);

    /**
     * @param request the request parameters of DescribeUsageOverallData  DescribeUsageOverallDataRequest
     * @return DescribeUsageOverallDataResponse
     */
    CompletableFuture<DescribeUsageOverallDataResponse> describeUsageOverallData(DescribeUsageOverallDataRequest request);

    /**
     * @param request the request parameters of DescribeUserInfoInChannel  DescribeUserInfoInChannelRequest
     * @return DescribeUserInfoInChannelResponse
     */
    CompletableFuture<DescribeUserInfoInChannelResponse> describeUserInfoInChannel(DescribeUserInfoInChannelRequest request);

    /**
     * @param request the request parameters of DisableAutoLiveStreamRule  DisableAutoLiveStreamRuleRequest
     * @return DisableAutoLiveStreamRuleResponse
     */
    CompletableFuture<DisableAutoLiveStreamRuleResponse> disableAutoLiveStreamRule(DisableAutoLiveStreamRuleRequest request);

    /**
     * @param request the request parameters of EnableAutoLiveStreamRule  EnableAutoLiveStreamRuleRequest
     * @return EnableAutoLiveStreamRuleResponse
     */
    CompletableFuture<EnableAutoLiveStreamRuleResponse> enableAutoLiveStreamRule(EnableAutoLiveStreamRuleRequest request);

    /**
     * @param request the request parameters of GetMPUTaskStatus  GetMPUTaskStatusRequest
     * @return GetMPUTaskStatusResponse
     */
    CompletableFuture<GetMPUTaskStatusResponse> getMPUTaskStatus(GetMPUTaskStatusRequest request);

    /**
     * @param request the request parameters of ModifyApp  ModifyAppRequest
     * @return ModifyAppResponse
     */
    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    /**
     * @param request the request parameters of ModifyAppCallbackStatus  ModifyAppCallbackStatusRequest
     * @return ModifyAppCallbackStatusResponse
     */
    CompletableFuture<ModifyAppCallbackStatusResponse> modifyAppCallbackStatus(ModifyAppCallbackStatusRequest request);

    /**
     * @param request the request parameters of ModifyAppLayout  ModifyAppLayoutRequest
     * @return ModifyAppLayoutResponse
     */
    CompletableFuture<ModifyAppLayoutResponse> modifyAppLayout(ModifyAppLayoutRequest request);

    /**
     * @param request the request parameters of ModifyAppLiveStreamStatus  ModifyAppLiveStreamStatusRequest
     * @return ModifyAppLiveStreamStatusResponse
     */
    CompletableFuture<ModifyAppLiveStreamStatusResponse> modifyAppLiveStreamStatus(ModifyAppLiveStreamStatusRequest request);

    /**
     * @param request the request parameters of ModifyAppRecordStatus  ModifyAppRecordStatusRequest
     * @return ModifyAppRecordStatusResponse
     */
    CompletableFuture<ModifyAppRecordStatusResponse> modifyAppRecordStatus(ModifyAppRecordStatusRequest request);

    /**
     * @param request the request parameters of ModifyAppRecordTemplate  ModifyAppRecordTemplateRequest
     * @return ModifyAppRecordTemplateResponse
     */
    CompletableFuture<ModifyAppRecordTemplateResponse> modifyAppRecordTemplate(ModifyAppRecordTemplateRequest request);

    /**
     * @param request the request parameters of ModifyAppStreamingOutTemplate  ModifyAppStreamingOutTemplateRequest
     * @return ModifyAppStreamingOutTemplateResponse
     */
    CompletableFuture<ModifyAppStreamingOutTemplateResponse> modifyAppStreamingOutTemplate(ModifyAppStreamingOutTemplateRequest request);

    /**
     * @param request the request parameters of ModifyCallbackMeta  ModifyCallbackMetaRequest
     * @return ModifyCallbackMetaResponse
     */
    CompletableFuture<ModifyCallbackMetaResponse> modifyCallbackMeta(ModifyCallbackMetaRequest request);

    /**
     * @param request the request parameters of ModifyMPULayout  ModifyMPULayoutRequest
     * @return ModifyMPULayoutResponse
     */
    CompletableFuture<ModifyMPULayoutResponse> modifyMPULayout(ModifyMPULayoutRequest request);

    /**
     * @param request the request parameters of RemoveTerminals  RemoveTerminalsRequest
     * @return RemoveTerminalsResponse
     */
    CompletableFuture<RemoveTerminalsResponse> removeTerminals(RemoveTerminalsRequest request);

    /**
     * @param request the request parameters of RemoveUsers  RemoveUsersRequest
     * @return RemoveUsersResponse
     */
    CompletableFuture<RemoveUsersResponse> removeUsers(RemoveUsersRequest request);

    /**
     * @param request the request parameters of StartCategoryCallback  StartCategoryCallbackRequest
     * @return StartCategoryCallbackResponse
     */
    CompletableFuture<StartCategoryCallbackResponse> startCategoryCallback(StartCategoryCallbackRequest request);

    /**
     * @param request the request parameters of StartCloudRecord  StartCloudRecordRequest
     * @return StartCloudRecordResponse
     */
    CompletableFuture<StartCloudRecordResponse> startCloudRecord(StartCloudRecordRequest request);

    /**
     * @param request the request parameters of StartMPUTask  StartMPUTaskRequest
     * @return StartMPUTaskResponse
     */
    CompletableFuture<StartMPUTaskResponse> startMPUTask(StartMPUTaskRequest request);

    /**
     * @param request the request parameters of StartRecordTask  StartRecordTaskRequest
     * @return StartRecordTaskResponse
     */
    CompletableFuture<StartRecordTaskResponse> startRecordTask(StartRecordTaskRequest request);

    /**
     * @param request the request parameters of StartStreamingOut  StartStreamingOutRequest
     * @return StartStreamingOutResponse
     */
    CompletableFuture<StartStreamingOutResponse> startStreamingOut(StartStreamingOutRequest request);

    /**
     * @param request the request parameters of StopCategoryCallback  StopCategoryCallbackRequest
     * @return StopCategoryCallbackResponse
     */
    CompletableFuture<StopCategoryCallbackResponse> stopCategoryCallback(StopCategoryCallbackRequest request);

    /**
     * @param request the request parameters of StopChannel  StopChannelRequest
     * @return StopChannelResponse
     */
    CompletableFuture<StopChannelResponse> stopChannel(StopChannelRequest request);

    /**
     * @param request the request parameters of StopCloudRecord  StopCloudRecordRequest
     * @return StopCloudRecordResponse
     */
    CompletableFuture<StopCloudRecordResponse> stopCloudRecord(StopCloudRecordRequest request);

    /**
     * @param request the request parameters of StopMPUTask  StopMPUTaskRequest
     * @return StopMPUTaskResponse
     */
    CompletableFuture<StopMPUTaskResponse> stopMPUTask(StopMPUTaskRequest request);

    /**
     * @param request the request parameters of StopRecordTask  StopRecordTaskRequest
     * @return StopRecordTaskResponse
     */
    CompletableFuture<StopRecordTaskResponse> stopRecordTask(StopRecordTaskRequest request);

    /**
     * @param request the request parameters of StopStreamingOut  StopStreamingOutRequest
     * @return StopStreamingOutResponse
     */
    CompletableFuture<StopStreamingOutResponse> stopStreamingOut(StopStreamingOutRequest request);

    /**
     * @param request the request parameters of UpdateAutoLiveStreamRule  UpdateAutoLiveStreamRuleRequest
     * @return UpdateAutoLiveStreamRuleResponse
     */
    CompletableFuture<UpdateAutoLiveStreamRuleResponse> updateAutoLiveStreamRule(UpdateAutoLiveStreamRuleRequest request);

    /**
     * @param request the request parameters of UpdateCloudRecord  UpdateCloudRecordRequest
     * @return UpdateCloudRecordResponse
     */
    CompletableFuture<UpdateCloudRecordResponse> updateCloudRecord(UpdateCloudRecordRequest request);

    /**
     * @param request the request parameters of UpdateMPUTask  UpdateMPUTaskRequest
     * @return UpdateMPUTaskResponse
     */
    CompletableFuture<UpdateMPUTaskResponse> updateMPUTask(UpdateMPUTaskRequest request);

    /**
     * @param request the request parameters of UpdateRecordTask  UpdateRecordTaskRequest
     * @return UpdateRecordTaskResponse
     */
    CompletableFuture<UpdateRecordTaskResponse> updateRecordTask(UpdateRecordTaskRequest request);

    /**
     * @param request the request parameters of UpdateRecordTemplate  UpdateRecordTemplateRequest
     * @return UpdateRecordTemplateResponse
     */
    CompletableFuture<UpdateRecordTemplateResponse> updateRecordTemplate(UpdateRecordTemplateRequest request);

    /**
     * @param request the request parameters of UpdateStreamingOut  UpdateStreamingOutRequest
     * @return UpdateStreamingOutResponse
     */
    CompletableFuture<UpdateStreamingOutResponse> updateStreamingOut(UpdateStreamingOutRequest request);

}
