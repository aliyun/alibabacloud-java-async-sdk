// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.live20161101.models.*;
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

    CompletableFuture<AddCasterComponentResponse> addCasterComponent(AddCasterComponentRequest request);

    CompletableFuture<AddCasterEpisodeResponse> addCasterEpisode(AddCasterEpisodeRequest request);

    CompletableFuture<AddCasterEpisodeGroupResponse> addCasterEpisodeGroup(AddCasterEpisodeGroupRequest request);

    CompletableFuture<AddCasterEpisodeGroupContentResponse> addCasterEpisodeGroupContent(AddCasterEpisodeGroupContentRequest request);

    CompletableFuture<AddCasterLayoutResponse> addCasterLayout(AddCasterLayoutRequest request);

    CompletableFuture<AddCasterProgramResponse> addCasterProgram(AddCasterProgramRequest request);

    CompletableFuture<AddCasterVideoResourceResponse> addCasterVideoResource(AddCasterVideoResourceRequest request);

    CompletableFuture<AddCustomLiveStreamTranscodeResponse> addCustomLiveStreamTranscode(AddCustomLiveStreamTranscodeRequest request);

    CompletableFuture<AddDRMCertificateResponse> addDRMCertificate(AddDRMCertificateRequest request);

    CompletableFuture<AddLiveASRConfigResponse> addLiveASRConfig(AddLiveASRConfigRequest request);

    CompletableFuture<AddLiveAppRecordConfigResponse> addLiveAppRecordConfig(AddLiveAppRecordConfigRequest request);

    CompletableFuture<AddLiveAppSnapshotConfigResponse> addLiveAppSnapshotConfig(AddLiveAppSnapshotConfigRequest request);

    CompletableFuture<AddLiveAudioAuditConfigResponse> addLiveAudioAuditConfig(AddLiveAudioAuditConfigRequest request);

    CompletableFuture<AddLiveAudioAuditNotifyConfigResponse> addLiveAudioAuditNotifyConfig(AddLiveAudioAuditNotifyConfigRequest request);

    CompletableFuture<AddLiveDetectNotifyConfigResponse> addLiveDetectNotifyConfig(AddLiveDetectNotifyConfigRequest request);

    CompletableFuture<AddLiveDomainResponse> addLiveDomain(AddLiveDomainRequest request);

    CompletableFuture<AddLiveDomainMappingResponse> addLiveDomainMapping(AddLiveDomainMappingRequest request);

    CompletableFuture<AddLiveDomainPlayMappingResponse> addLiveDomainPlayMapping(AddLiveDomainPlayMappingRequest request);

    CompletableFuture<AddLivePullStreamInfoConfigResponse> addLivePullStreamInfoConfig(AddLivePullStreamInfoConfigRequest request);

    CompletableFuture<AddLiveRecordNotifyConfigResponse> addLiveRecordNotifyConfig(AddLiveRecordNotifyConfigRequest request);

    CompletableFuture<AddLiveRecordVodConfigResponse> addLiveRecordVodConfig(AddLiveRecordVodConfigRequest request);

    CompletableFuture<AddLiveSnapshotDetectPornConfigResponse> addLiveSnapshotDetectPornConfig(AddLiveSnapshotDetectPornConfigRequest request);

    CompletableFuture<AddLiveStreamTranscodeResponse> addLiveStreamTranscode(AddLiveStreamTranscodeRequest request);

    CompletableFuture<AddLiveStreamWatermarkResponse> addLiveStreamWatermark(AddLiveStreamWatermarkRequest request);

    CompletableFuture<AddLiveStreamWatermarkRuleResponse> addLiveStreamWatermarkRule(AddLiveStreamWatermarkRuleRequest request);

    CompletableFuture<AddMultiRateConfigResponse> addMultiRateConfig(AddMultiRateConfigRequest request);

    CompletableFuture<AddPlaylistItemsResponse> addPlaylistItems(AddPlaylistItemsRequest request);

    CompletableFuture<AddRtsLiveStreamTranscodeResponse> addRtsLiveStreamTranscode(AddRtsLiveStreamTranscodeRequest request);

    CompletableFuture<AddShowIntoShowListResponse> addShowIntoShowList(AddShowIntoShowListRequest request);

    CompletableFuture<AddStudioLayoutResponse> addStudioLayout(AddStudioLayoutRequest request);

    CompletableFuture<AddTrancodeSEIResponse> addTrancodeSEI(AddTrancodeSEIRequest request);

    CompletableFuture<AllowPushStreamResponse> allowPushStream(AllowPushStreamRequest request);

    CompletableFuture<ApplyBoardTokenResponse> applyBoardToken(ApplyBoardTokenRequest request);

    CompletableFuture<ApplyRecordTokenResponse> applyRecordToken(ApplyRecordTokenRequest request);

    CompletableFuture<BatchDeleteLiveDomainConfigsResponse> batchDeleteLiveDomainConfigs(BatchDeleteLiveDomainConfigsRequest request);

    CompletableFuture<BatchSetLiveDomainConfigsResponse> batchSetLiveDomainConfigs(BatchSetLiveDomainConfigsRequest request);

    CompletableFuture<CheckServiceForRoleResponse> checkServiceForRole(CheckServiceForRoleRequest request);

    CompletableFuture<CloseLiveShiftResponse> closeLiveShift(CloseLiveShiftRequest request);

    CompletableFuture<CompleteBoardResponse> completeBoard(CompleteBoardRequest request);

    CompletableFuture<CompleteBoardRecordResponse> completeBoardRecord(CompleteBoardRecordRequest request);

    CompletableFuture<ControlHtmlResourceResponse> controlHtmlResource(ControlHtmlResourceRequest request);

    CompletableFuture<CopyCasterResponse> copyCaster(CopyCasterRequest request);

    CompletableFuture<CopyCasterSceneConfigResponse> copyCasterSceneConfig(CopyCasterSceneConfigRequest request);

    CompletableFuture<CreateBoardResponse> createBoard(CreateBoardRequest request);

    CompletableFuture<CreateCasterResponse> createCaster(CreateCasterRequest request);

    CompletableFuture<CreateCustomTemplateResponse> createCustomTemplate(CreateCustomTemplateRequest request);

    CompletableFuture<CreateLiveRealTimeLogDeliveryResponse> createLiveRealTimeLogDelivery(CreateLiveRealTimeLogDeliveryRequest request);

    CompletableFuture<CreateLiveStreamMonitorResponse> createLiveStreamMonitor(CreateLiveStreamMonitorRequest request);

    CompletableFuture<CreateLiveStreamRecordIndexFilesResponse> createLiveStreamRecordIndexFiles(CreateLiveStreamRecordIndexFilesRequest request);

    CompletableFuture<CreateMixStreamResponse> createMixStream(CreateMixStreamRequest request);

    CompletableFuture<CreateRoomResponse> createRoom(CreateRoomRequest request);

    CompletableFuture<DeleteBoardResponse> deleteBoard(DeleteBoardRequest request);

    CompletableFuture<DeleteCasterResponse> deleteCaster(DeleteCasterRequest request);

    CompletableFuture<DeleteCasterComponentResponse> deleteCasterComponent(DeleteCasterComponentRequest request);

    CompletableFuture<DeleteCasterEpisodeResponse> deleteCasterEpisode(DeleteCasterEpisodeRequest request);

    CompletableFuture<DeleteCasterEpisodeGroupResponse> deleteCasterEpisodeGroup(DeleteCasterEpisodeGroupRequest request);

    CompletableFuture<DeleteCasterLayoutResponse> deleteCasterLayout(DeleteCasterLayoutRequest request);

    CompletableFuture<DeleteCasterProgramResponse> deleteCasterProgram(DeleteCasterProgramRequest request);

    CompletableFuture<DeleteCasterSceneConfigResponse> deleteCasterSceneConfig(DeleteCasterSceneConfigRequest request);

    CompletableFuture<DeleteCasterVideoResourceResponse> deleteCasterVideoResource(DeleteCasterVideoResourceRequest request);

    CompletableFuture<DeleteCustomTemplateResponse> deleteCustomTemplate(DeleteCustomTemplateRequest request);

    CompletableFuture<DeleteHtmlResourceResponse> deleteHtmlResource(DeleteHtmlResourceRequest request);

    CompletableFuture<DeleteLiveASRConfigResponse> deleteLiveASRConfig(DeleteLiveASRConfigRequest request);

    CompletableFuture<DeleteLiveAppRecordConfigResponse> deleteLiveAppRecordConfig(DeleteLiveAppRecordConfigRequest request);

    CompletableFuture<DeleteLiveAppSnapshotConfigResponse> deleteLiveAppSnapshotConfig(DeleteLiveAppSnapshotConfigRequest request);

    CompletableFuture<DeleteLiveAudioAuditConfigResponse> deleteLiveAudioAuditConfig(DeleteLiveAudioAuditConfigRequest request);

    CompletableFuture<DeleteLiveAudioAuditNotifyConfigResponse> deleteLiveAudioAuditNotifyConfig(DeleteLiveAudioAuditNotifyConfigRequest request);

    CompletableFuture<DeleteLiveDetectNotifyConfigResponse> deleteLiveDetectNotifyConfig(DeleteLiveDetectNotifyConfigRequest request);

    CompletableFuture<DeleteLiveDomainResponse> deleteLiveDomain(DeleteLiveDomainRequest request);

    CompletableFuture<DeleteLiveDomainMappingResponse> deleteLiveDomainMapping(DeleteLiveDomainMappingRequest request);

    CompletableFuture<DeleteLiveDomainPlayMappingResponse> deleteLiveDomainPlayMapping(DeleteLiveDomainPlayMappingRequest request);

    CompletableFuture<DeleteLiveEdgeTransferResponse> deleteLiveEdgeTransfer(DeleteLiveEdgeTransferRequest request);

    CompletableFuture<DeleteLiveLazyPullStreamInfoConfigResponse> deleteLiveLazyPullStreamInfoConfig(DeleteLiveLazyPullStreamInfoConfigRequest request);

    CompletableFuture<DeleteLivePullStreamInfoConfigResponse> deleteLivePullStreamInfoConfig(DeleteLivePullStreamInfoConfigRequest request);

    CompletableFuture<DeleteLiveRealTimeLogLogstoreResponse> deleteLiveRealTimeLogLogstore(DeleteLiveRealTimeLogLogstoreRequest request);

    CompletableFuture<DeleteLiveRealtimeLogDeliveryResponse> deleteLiveRealtimeLogDelivery(DeleteLiveRealtimeLogDeliveryRequest request);

    CompletableFuture<DeleteLiveRecordNotifyConfigResponse> deleteLiveRecordNotifyConfig(DeleteLiveRecordNotifyConfigRequest request);

    CompletableFuture<DeleteLiveRecordVodConfigResponse> deleteLiveRecordVodConfig(DeleteLiveRecordVodConfigRequest request);

    CompletableFuture<DeleteLiveSnapshotDetectPornConfigResponse> deleteLiveSnapshotDetectPornConfig(DeleteLiveSnapshotDetectPornConfigRequest request);

    CompletableFuture<DeleteLiveSpecificStagingConfigResponse> deleteLiveSpecificStagingConfig(DeleteLiveSpecificStagingConfigRequest request);

    CompletableFuture<DeleteLiveStreamMonitorResponse> deleteLiveStreamMonitor(DeleteLiveStreamMonitorRequest request);

    CompletableFuture<DeleteLiveStreamTranscodeResponse> deleteLiveStreamTranscode(DeleteLiveStreamTranscodeRequest request);

    CompletableFuture<DeleteLiveStreamWatermarkResponse> deleteLiveStreamWatermark(DeleteLiveStreamWatermarkRequest request);

    CompletableFuture<DeleteLiveStreamWatermarkRuleResponse> deleteLiveStreamWatermarkRule(DeleteLiveStreamWatermarkRuleRequest request);

    CompletableFuture<DeleteLiveStreamsNotifyUrlConfigResponse> deleteLiveStreamsNotifyUrlConfig(DeleteLiveStreamsNotifyUrlConfigRequest request);

    CompletableFuture<DeleteMixStreamResponse> deleteMixStream(DeleteMixStreamRequest request);

    CompletableFuture<DeleteMultiRateConfigResponse> deleteMultiRateConfig(DeleteMultiRateConfigRequest request);

    CompletableFuture<DeletePlaylistResponse> deletePlaylist(DeletePlaylistRequest request);

    CompletableFuture<DeletePlaylistItemsResponse> deletePlaylistItems(DeletePlaylistItemsRequest request);

    CompletableFuture<DeleteRoomResponse> deleteRoom(DeleteRoomRequest request);

    CompletableFuture<DeleteSnapshotCallbackAuthResponse> deleteSnapshotCallbackAuth(DeleteSnapshotCallbackAuthRequest request);

    CompletableFuture<DeleteStudioLayoutResponse> deleteStudioLayout(DeleteStudioLayoutRequest request);

    CompletableFuture<DescribeBoardEventsResponse> describeBoardEvents(DescribeBoardEventsRequest request);

    CompletableFuture<DescribeBoardSnapshotResponse> describeBoardSnapshot(DescribeBoardSnapshotRequest request);

    CompletableFuture<DescribeBoardsResponse> describeBoards(DescribeBoardsRequest request);

    CompletableFuture<DescribeCasterChannelsResponse> describeCasterChannels(DescribeCasterChannelsRequest request);

    CompletableFuture<DescribeCasterComponentsResponse> describeCasterComponents(DescribeCasterComponentsRequest request);

    CompletableFuture<DescribeCasterConfigResponse> describeCasterConfig(DescribeCasterConfigRequest request);

    CompletableFuture<DescribeCasterHtmlResourceResponse> describeCasterHtmlResource(DescribeCasterHtmlResourceRequest request);

    CompletableFuture<DescribeCasterLayoutsResponse> describeCasterLayouts(DescribeCasterLayoutsRequest request);

    CompletableFuture<DescribeCasterProgramResponse> describeCasterProgram(DescribeCasterProgramRequest request);

    CompletableFuture<DescribeCasterRtcInfoResponse> describeCasterRtcInfo(DescribeCasterRtcInfoRequest request);

    CompletableFuture<DescribeCasterSceneAudioResponse> describeCasterSceneAudio(DescribeCasterSceneAudioRequest request);

    CompletableFuture<DescribeCasterScenesResponse> describeCasterScenes(DescribeCasterScenesRequest request);

    CompletableFuture<DescribeCasterStreamUrlResponse> describeCasterStreamUrl(DescribeCasterStreamUrlRequest request);

    CompletableFuture<DescribeCasterSyncGroupResponse> describeCasterSyncGroup(DescribeCasterSyncGroupRequest request);

    CompletableFuture<DescribeCasterVideoResourcesResponse> describeCasterVideoResources(DescribeCasterVideoResourcesRequest request);

    CompletableFuture<DescribeCastersResponse> describeCasters(DescribeCastersRequest request);

    CompletableFuture<DescribeDRMCertListResponse> describeDRMCertList(DescribeDRMCertListRequest request);

    CompletableFuture<DescribeDomainUsageDataResponse> describeDomainUsageData(DescribeDomainUsageDataRequest request);

    CompletableFuture<DescribeDomainWithIntegrityResponse> describeDomainWithIntegrity(DescribeDomainWithIntegrityRequest request);

    CompletableFuture<DescribeForbidPushStreamRoomListResponse> describeForbidPushStreamRoomList(DescribeForbidPushStreamRoomListRequest request);

    CompletableFuture<DescribeHlsLiveStreamRealTimeBpsDataResponse> describeHlsLiveStreamRealTimeBpsData(DescribeHlsLiveStreamRealTimeBpsDataRequest request);

    CompletableFuture<DescribeHtmlResourceResponse> describeHtmlResource(DescribeHtmlResourceRequest request);

    CompletableFuture<DescribeLiveAsrConfigResponse> describeLiveAsrConfig(DescribeLiveAsrConfigRequest request);

    CompletableFuture<DescribeLiveAudioAuditConfigResponse> describeLiveAudioAuditConfig(DescribeLiveAudioAuditConfigRequest request);

    CompletableFuture<DescribeLiveAudioAuditNotifyConfigResponse> describeLiveAudioAuditNotifyConfig(DescribeLiveAudioAuditNotifyConfigRequest request);

    CompletableFuture<DescribeLiveCertificateDetailResponse> describeLiveCertificateDetail(DescribeLiveCertificateDetailRequest request);

    CompletableFuture<DescribeLiveCertificateListResponse> describeLiveCertificateList(DescribeLiveCertificateListRequest request);

    CompletableFuture<DescribeLiveDetectNotifyConfigResponse> describeLiveDetectNotifyConfig(DescribeLiveDetectNotifyConfigRequest request);

    CompletableFuture<DescribeLiveDetectPornDataResponse> describeLiveDetectPornData(DescribeLiveDetectPornDataRequest request);

    CompletableFuture<DescribeLiveDomainBpsDataResponse> describeLiveDomainBpsData(DescribeLiveDomainBpsDataRequest request);

    CompletableFuture<DescribeLiveDomainBpsDataByTimeStampResponse> describeLiveDomainBpsDataByTimeStamp(DescribeLiveDomainBpsDataByTimeStampRequest request);

    CompletableFuture<DescribeLiveDomainCertificateInfoResponse> describeLiveDomainCertificateInfo(DescribeLiveDomainCertificateInfoRequest request);

    CompletableFuture<DescribeLiveDomainConfigsResponse> describeLiveDomainConfigs(DescribeLiveDomainConfigsRequest request);

    CompletableFuture<DescribeLiveDomainDetailResponse> describeLiveDomainDetail(DescribeLiveDomainDetailRequest request);

    CompletableFuture<DescribeLiveDomainFrameRateAndBitRateDataResponse> describeLiveDomainFrameRateAndBitRateData(DescribeLiveDomainFrameRateAndBitRateDataRequest request);

    CompletableFuture<DescribeLiveDomainHttpsDataResponse> describeLiveDomainHttpsData(DescribeLiveDomainHttpsDataRequest request);

    CompletableFuture<DescribeLiveDomainLimitResponse> describeLiveDomainLimit(DescribeLiveDomainLimitRequest request);

    CompletableFuture<DescribeLiveDomainLogResponse> describeLiveDomainLog(DescribeLiveDomainLogRequest request);

    CompletableFuture<DescribeLiveDomainMappingResponse> describeLiveDomainMapping(DescribeLiveDomainMappingRequest request);

    CompletableFuture<DescribeLiveDomainOnlineUserNumResponse> describeLiveDomainOnlineUserNum(DescribeLiveDomainOnlineUserNumRequest request);

    CompletableFuture<DescribeLiveDomainPushBpsDataResponse> describeLiveDomainPushBpsData(DescribeLiveDomainPushBpsDataRequest request);

    CompletableFuture<DescribeLiveDomainPushTrafficDataResponse> describeLiveDomainPushTrafficData(DescribeLiveDomainPushTrafficDataRequest request);

    CompletableFuture<DescribeLiveDomainPvUvDataResponse> describeLiveDomainPvUvData(DescribeLiveDomainPvUvDataRequest request);

    CompletableFuture<DescribeLiveDomainRealTimeBpsDataResponse> describeLiveDomainRealTimeBpsData(DescribeLiveDomainRealTimeBpsDataRequest request);

    CompletableFuture<DescribeLiveDomainRealTimeHttpCodeDataResponse> describeLiveDomainRealTimeHttpCodeData(DescribeLiveDomainRealTimeHttpCodeDataRequest request);

    CompletableFuture<DescribeLiveDomainRealTimeTrafficDataResponse> describeLiveDomainRealTimeTrafficData(DescribeLiveDomainRealTimeTrafficDataRequest request);

    CompletableFuture<DescribeLiveDomainRealtimeLogDeliveryResponse> describeLiveDomainRealtimeLogDelivery(DescribeLiveDomainRealtimeLogDeliveryRequest request);

    CompletableFuture<DescribeLiveDomainRecordDataResponse> describeLiveDomainRecordData(DescribeLiveDomainRecordDataRequest request);

    CompletableFuture<DescribeLiveDomainRecordUsageDataResponse> describeLiveDomainRecordUsageData(DescribeLiveDomainRecordUsageDataRequest request);

    CompletableFuture<DescribeLiveDomainSnapshotDataResponse> describeLiveDomainSnapshotData(DescribeLiveDomainSnapshotDataRequest request);

    CompletableFuture<DescribeLiveDomainSrcHttpCodeDataResponse> describeLiveDomainSrcHttpCodeData(DescribeLiveDomainSrcHttpCodeDataRequest request);

    CompletableFuture<DescribeLiveDomainStagingConfigResponse> describeLiveDomainStagingConfig(DescribeLiveDomainStagingConfigRequest request);

    CompletableFuture<DescribeLiveDomainStreamTranscodeDataResponse> describeLiveDomainStreamTranscodeData(DescribeLiveDomainStreamTranscodeDataRequest request);

    CompletableFuture<DescribeLiveDomainStreamWaterLevelResponse> describeLiveDomainStreamWaterLevel(DescribeLiveDomainStreamWaterLevelRequest request);

    CompletableFuture<DescribeLiveDomainTimeShiftDataResponse> describeLiveDomainTimeShiftData(DescribeLiveDomainTimeShiftDataRequest request);

    CompletableFuture<DescribeLiveDomainTrafficDataResponse> describeLiveDomainTrafficData(DescribeLiveDomainTrafficDataRequest request);

    CompletableFuture<DescribeLiveDomainTrancodeDataResponse> describeLiveDomainTrancodeData(DescribeLiveDomainTrancodeDataRequest request);

    CompletableFuture<DescribeLiveDomainTranscodeDataResponse> describeLiveDomainTranscodeData(DescribeLiveDomainTranscodeDataRequest request);

    CompletableFuture<DescribeLiveDomainUvDataResponse> describeLiveDomainUvData(DescribeLiveDomainUvDataRequest request);

    CompletableFuture<DescribeLiveDrmUsageDataResponse> describeLiveDrmUsageData(DescribeLiveDrmUsageDataRequest request);

    CompletableFuture<DescribeLiveEdgeTransferResponse> describeLiveEdgeTransfer(DescribeLiveEdgeTransferRequest request);

    CompletableFuture<DescribeLiveIpInfoResponse> describeLiveIpInfo(DescribeLiveIpInfoRequest request);

    CompletableFuture<DescribeLiveLazyPullStreamConfigResponse> describeLiveLazyPullStreamConfig(DescribeLiveLazyPullStreamConfigRequest request);

    CompletableFuture<DescribeLivePullStreamConfigResponse> describeLivePullStreamConfig(DescribeLivePullStreamConfigRequest request);

    CompletableFuture<DescribeLiveRealtimeDeliveryAccResponse> describeLiveRealtimeDeliveryAcc(DescribeLiveRealtimeDeliveryAccRequest request);

    CompletableFuture<DescribeLiveRealtimeLogAuthorizedResponse> describeLiveRealtimeLogAuthorized(DescribeLiveRealtimeLogAuthorizedRequest request);

    CompletableFuture<DescribeLiveRecordConfigResponse> describeLiveRecordConfig(DescribeLiveRecordConfigRequest request);

    CompletableFuture<DescribeLiveRecordNotifyConfigResponse> describeLiveRecordNotifyConfig(DescribeLiveRecordNotifyConfigRequest request);

    CompletableFuture<DescribeLiveRecordVodConfigsResponse> describeLiveRecordVodConfigs(DescribeLiveRecordVodConfigsRequest request);

    CompletableFuture<DescribeLiveShiftConfigsResponse> describeLiveShiftConfigs(DescribeLiveShiftConfigsRequest request);

    CompletableFuture<DescribeLiveSnapshotConfigResponse> describeLiveSnapshotConfig(DescribeLiveSnapshotConfigRequest request);

    CompletableFuture<DescribeLiveSnapshotDetectPornConfigResponse> describeLiveSnapshotDetectPornConfig(DescribeLiveSnapshotDetectPornConfigRequest request);

    CompletableFuture<DescribeLiveStagingIpResponse> describeLiveStagingIp(DescribeLiveStagingIpRequest request);

    CompletableFuture<DescribeLiveStreamBitRateDataResponse> describeLiveStreamBitRateData(DescribeLiveStreamBitRateDataRequest request);

    CompletableFuture<DescribeLiveStreamCountResponse> describeLiveStreamCount(DescribeLiveStreamCountRequest request);

    CompletableFuture<DescribeLiveStreamDelayConfigResponse> describeLiveStreamDelayConfig(DescribeLiveStreamDelayConfigRequest request);

    CompletableFuture<DescribeLiveStreamGRTNDashboardResponse> describeLiveStreamGRTNDashboard(DescribeLiveStreamGRTNDashboardRequest request);

    CompletableFuture<DescribeLiveStreamGRTNStreamDataResponse> describeLiveStreamGRTNStreamData(DescribeLiveStreamGRTNStreamDataRequest request);

    CompletableFuture<DescribeLiveStreamGRTNStreamInfoResponse> describeLiveStreamGRTNStreamInfo(DescribeLiveStreamGRTNStreamInfoRequest request);

    CompletableFuture<DescribeLiveStreamHistoryUserNumResponse> describeLiveStreamHistoryUserNum(DescribeLiveStreamHistoryUserNumRequest request);

    CompletableFuture<DescribeLiveStreamMonitorListResponse> describeLiveStreamMonitorList(DescribeLiveStreamMonitorListRequest request);

    CompletableFuture<DescribeLiveStreamOptimizedFeatureConfigResponse> describeLiveStreamOptimizedFeatureConfig(DescribeLiveStreamOptimizedFeatureConfigRequest request);

    CompletableFuture<DescribeLiveStreamRecordContentResponse> describeLiveStreamRecordContent(DescribeLiveStreamRecordContentRequest request);

    CompletableFuture<DescribeLiveStreamRecordIndexFileResponse> describeLiveStreamRecordIndexFile(DescribeLiveStreamRecordIndexFileRequest request);

    CompletableFuture<DescribeLiveStreamRecordIndexFilesResponse> describeLiveStreamRecordIndexFiles(DescribeLiveStreamRecordIndexFilesRequest request);

    CompletableFuture<DescribeLiveStreamSnapshotInfoResponse> describeLiveStreamSnapshotInfo(DescribeLiveStreamSnapshotInfoRequest request);

    CompletableFuture<DescribeLiveStreamSpecificConfigResponse> describeLiveStreamSpecificConfig(DescribeLiveStreamSpecificConfigRequest request);

    CompletableFuture<DescribeLiveStreamStateResponse> describeLiveStreamState(DescribeLiveStreamStateRequest request);

    CompletableFuture<DescribeLiveStreamTranscodeInfoResponse> describeLiveStreamTranscodeInfo(DescribeLiveStreamTranscodeInfoRequest request);

    CompletableFuture<DescribeLiveStreamTranscodeStreamNumResponse> describeLiveStreamTranscodeStreamNum(DescribeLiveStreamTranscodeStreamNumRequest request);

    CompletableFuture<DescribeLiveStreamWatermarkRulesResponse> describeLiveStreamWatermarkRules(DescribeLiveStreamWatermarkRulesRequest request);

    CompletableFuture<DescribeLiveStreamWatermarksResponse> describeLiveStreamWatermarks(DescribeLiveStreamWatermarksRequest request);

    CompletableFuture<DescribeLiveStreamsBlockListResponse> describeLiveStreamsBlockList(DescribeLiveStreamsBlockListRequest request);

    CompletableFuture<DescribeLiveStreamsControlHistoryResponse> describeLiveStreamsControlHistory(DescribeLiveStreamsControlHistoryRequest request);

    CompletableFuture<DescribeLiveStreamsNotifyUrlConfigResponse> describeLiveStreamsNotifyUrlConfig(DescribeLiveStreamsNotifyUrlConfigRequest request);

    CompletableFuture<DescribeLiveStreamsOnlineListResponse> describeLiveStreamsOnlineList(DescribeLiveStreamsOnlineListRequest request);

    CompletableFuture<DescribeLiveStreamsPublishListResponse> describeLiveStreamsPublishList(DescribeLiveStreamsPublishListRequest request);

    CompletableFuture<DescribeLiveTagResourcesResponse> describeLiveTagResources(DescribeLiveTagResourcesRequest request);

    CompletableFuture<DescribeLiveTopDomainsByFlowResponse> describeLiveTopDomainsByFlow(DescribeLiveTopDomainsByFlowRequest request);

    CompletableFuture<DescribeLiveTranscodeInfoResponse> describeLiveTranscodeInfo(DescribeLiveTranscodeInfoRequest request);

    CompletableFuture<DescribeLiveUserDomainsResponse> describeLiveUserDomains(DescribeLiveUserDomainsRequest request);

    CompletableFuture<DescribeLiveUserTagsResponse> describeLiveUserTags(DescribeLiveUserTagsRequest request);

    CompletableFuture<DescribeLiveVerifyContentResponse> describeLiveVerifyContent(DescribeLiveVerifyContentRequest request);

    CompletableFuture<DescribeMixStreamListResponse> describeMixStreamList(DescribeMixStreamListRequest request);

    CompletableFuture<DescribeRecordResponse> describeRecord(DescribeRecordRequest request);

    CompletableFuture<DescribeRecordsResponse> describeRecords(DescribeRecordsRequest request);

    CompletableFuture<DescribeRoomKickoutUserListResponse> describeRoomKickoutUserList(DescribeRoomKickoutUserListRequest request);

    CompletableFuture<DescribeRoomListResponse> describeRoomList(DescribeRoomListRequest request);

    CompletableFuture<DescribeRoomStatusResponse> describeRoomStatus(DescribeRoomStatusRequest request);

    CompletableFuture<DescribeShowListResponse> describeShowList(DescribeShowListRequest request);

    CompletableFuture<DescribeStudioLayoutsResponse> describeStudioLayouts(DescribeStudioLayoutsRequest request);

    CompletableFuture<DescribeToutiaoLivePlayResponse> describeToutiaoLivePlay(DescribeToutiaoLivePlayRequest request);

    CompletableFuture<DescribeToutiaoLivePublishResponse> describeToutiaoLivePublish(DescribeToutiaoLivePublishRequest request);

    CompletableFuture<DescribeUpBpsPeakDataResponse> describeUpBpsPeakData(DescribeUpBpsPeakDataRequest request);

    CompletableFuture<DescribeUpBpsPeakOfLineResponse> describeUpBpsPeakOfLine(DescribeUpBpsPeakOfLineRequest request);

    CompletableFuture<DescribeUpPeakPublishStreamDataResponse> describeUpPeakPublishStreamData(DescribeUpPeakPublishStreamDataRequest request);

    CompletableFuture<DescribeUserLiveDomainsResponse> describeUserLiveDomains(DescribeUserLiveDomainsRequest request);

    CompletableFuture<DisableLiveRealtimeLogDeliveryResponse> disableLiveRealtimeLogDelivery(DisableLiveRealtimeLogDeliveryRequest request);

    CompletableFuture<EditHtmlResourceResponse> editHtmlResource(EditHtmlResourceRequest request);

    CompletableFuture<EditPlaylistResponse> editPlaylist(EditPlaylistRequest request);

    CompletableFuture<EffectCasterUrgentResponse> effectCasterUrgent(EffectCasterUrgentRequest request);

    CompletableFuture<EffectCasterVideoResourceResponse> effectCasterVideoResource(EffectCasterVideoResourceRequest request);

    CompletableFuture<EnableLiveRealtimeLogDeliveryResponse> enableLiveRealtimeLogDelivery(EnableLiveRealtimeLogDeliveryRequest request);

    CompletableFuture<ForbidLiveCustomStreamResponse> forbidLiveCustomStream(ForbidLiveCustomStreamRequest request);

    CompletableFuture<ForbidLiveStreamResponse> forbidLiveStream(ForbidLiveStreamRequest request);

    CompletableFuture<ForbidPushStreamResponse> forbidPushStream(ForbidPushStreamRequest request);

    CompletableFuture<GetAllCustomTemplatesResponse> getAllCustomTemplates(GetAllCustomTemplatesRequest request);

    CompletableFuture<GetCustomTemplateResponse> getCustomTemplate(GetCustomTemplateRequest request);

    CompletableFuture<GetCustomTemplatesResponse> getCustomTemplates(GetCustomTemplatesRequest request);

    CompletableFuture<GetMultiRateConfigResponse> getMultiRateConfig(GetMultiRateConfigRequest request);

    CompletableFuture<GetMultiRateConfigListResponse> getMultiRateConfigList(GetMultiRateConfigListRequest request);

    CompletableFuture<JoinBoardResponse> joinBoard(JoinBoardRequest request);

    CompletableFuture<ListLiveRealtimeLogDeliveryResponse> listLiveRealtimeLogDelivery(ListLiveRealtimeLogDeliveryRequest request);

    CompletableFuture<ListLiveRealtimeLogDeliveryDomainsResponse> listLiveRealtimeLogDeliveryDomains(ListLiveRealtimeLogDeliveryDomainsRequest request);

    CompletableFuture<ListLiveRealtimeLogDeliveryInfosResponse> listLiveRealtimeLogDeliveryInfos(ListLiveRealtimeLogDeliveryInfosRequest request);

    CompletableFuture<ListPlaylistResponse> listPlaylist(ListPlaylistRequest request);

    CompletableFuture<ListPlaylistItemsResponse> listPlaylistItems(ListPlaylistItemsRequest request);

    CompletableFuture<ManageSnapshotAuthResponse> manageSnapshotAuth(ManageSnapshotAuthRequest request);

    CompletableFuture<ModifyCasterComponentResponse> modifyCasterComponent(ModifyCasterComponentRequest request);

    CompletableFuture<ModifyCasterEpisodeResponse> modifyCasterEpisode(ModifyCasterEpisodeRequest request);

    CompletableFuture<ModifyCasterLayoutResponse> modifyCasterLayout(ModifyCasterLayoutRequest request);

    CompletableFuture<ModifyCasterProgramResponse> modifyCasterProgram(ModifyCasterProgramRequest request);

    CompletableFuture<ModifyCasterVideoResourceResponse> modifyCasterVideoResource(ModifyCasterVideoResourceRequest request);

    CompletableFuture<ModifyLiveDomainSchdmByPropertyResponse> modifyLiveDomainSchdmByProperty(ModifyLiveDomainSchdmByPropertyRequest request);

    CompletableFuture<ModifyLiveRealtimeLogDeliveryResponse> modifyLiveRealtimeLogDelivery(ModifyLiveRealtimeLogDeliveryRequest request);

    CompletableFuture<ModifyShowListResponse> modifyShowList(ModifyShowListRequest request);

    CompletableFuture<ModifyStudioLayoutResponse> modifyStudioLayout(ModifyStudioLayoutRequest request);

    CompletableFuture<OpenLiveShiftResponse> openLiveShift(OpenLiveShiftRequest request);

    CompletableFuture<PlayChoosenShowResponse> playChoosenShow(PlayChoosenShowRequest request);

    CompletableFuture<PublishLiveStagingConfigToProductionResponse> publishLiveStagingConfigToProduction(PublishLiveStagingConfigToProductionRequest request);

    CompletableFuture<QuerySnapshotCallbackAuthResponse> querySnapshotCallbackAuth(QuerySnapshotCallbackAuthRequest request);

    CompletableFuture<RealTimeRecordCommandResponse> realTimeRecordCommand(RealTimeRecordCommandRequest request);

    CompletableFuture<RealTimeSnapshotCommandResponse> realTimeSnapshotCommand(RealTimeSnapshotCommandRequest request);

    CompletableFuture<RemoveShowFromShowListResponse> removeShowFromShowList(RemoveShowFromShowListRequest request);

    CompletableFuture<ResumeLiveStreamResponse> resumeLiveStream(ResumeLiveStreamRequest request);

    CompletableFuture<RollbackLiveStagingConfigResponse> rollbackLiveStagingConfig(RollbackLiveStagingConfigRequest request);

    CompletableFuture<SendRoomNotificationResponse> sendRoomNotification(SendRoomNotificationRequest request);

    CompletableFuture<SendRoomUserNotificationResponse> sendRoomUserNotification(SendRoomUserNotificationRequest request);

    CompletableFuture<SetBoardCallbackResponse> setBoardCallback(SetBoardCallbackRequest request);

    CompletableFuture<SetCasterChannelResponse> setCasterChannel(SetCasterChannelRequest request);

    CompletableFuture<SetCasterConfigResponse> setCasterConfig(SetCasterConfigRequest request);

    CompletableFuture<SetCasterSceneConfigResponse> setCasterSceneConfig(SetCasterSceneConfigRequest request);

    CompletableFuture<SetCasterSyncGroupResponse> setCasterSyncGroup(SetCasterSyncGroupRequest request);

    CompletableFuture<SetLiveDomainCertificateResponse> setLiveDomainCertificate(SetLiveDomainCertificateRequest request);

    CompletableFuture<SetLiveDomainStagingConfigResponse> setLiveDomainStagingConfig(SetLiveDomainStagingConfigRequest request);

    CompletableFuture<SetLiveEdgeTransferResponse> setLiveEdgeTransfer(SetLiveEdgeTransferRequest request);

    CompletableFuture<SetLiveLazyPullStreamInfoConfigResponse> setLiveLazyPullStreamInfoConfig(SetLiveLazyPullStreamInfoConfigRequest request);

    CompletableFuture<SetLiveStreamDelayConfigResponse> setLiveStreamDelayConfig(SetLiveStreamDelayConfigRequest request);

    CompletableFuture<SetLiveStreamMonitorConfigResponse> setLiveStreamMonitorConfig(SetLiveStreamMonitorConfigRequest request);

    CompletableFuture<SetLiveStreamOptimizedFeatureConfigResponse> setLiveStreamOptimizedFeatureConfig(SetLiveStreamOptimizedFeatureConfigRequest request);

    CompletableFuture<SetLiveStreamSpecificConfigResponse> setLiveStreamSpecificConfig(SetLiveStreamSpecificConfigRequest request);

    CompletableFuture<SetLiveStreamsNotifyUrlConfigResponse> setLiveStreamsNotifyUrlConfig(SetLiveStreamsNotifyUrlConfigRequest request);

    CompletableFuture<SetSnapshotCallbackAuthResponse> setSnapshotCallbackAuth(SetSnapshotCallbackAuthRequest request);

    CompletableFuture<StartBoardRecordResponse> startBoardRecord(StartBoardRecordRequest request);

    CompletableFuture<StartCasterResponse> startCaster(StartCasterRequest request);

    CompletableFuture<StartCasterSceneResponse> startCasterScene(StartCasterSceneRequest request);

    CompletableFuture<StartLiveDomainResponse> startLiveDomain(StartLiveDomainRequest request);

    CompletableFuture<StartLiveIndexResponse> startLiveIndex(StartLiveIndexRequest request);

    CompletableFuture<StartLiveStreamMonitorResponse> startLiveStreamMonitor(StartLiveStreamMonitorRequest request);

    CompletableFuture<StartPlaylistResponse> startPlaylist(StartPlaylistRequest request);

    CompletableFuture<StopCasterResponse> stopCaster(StopCasterRequest request);

    CompletableFuture<StopCasterSceneResponse> stopCasterScene(StopCasterSceneRequest request);

    CompletableFuture<StopLiveDomainResponse> stopLiveDomain(StopLiveDomainRequest request);

    CompletableFuture<StopLiveIndexResponse> stopLiveIndex(StopLiveIndexRequest request);

    CompletableFuture<StopLiveStreamMonitorResponse> stopLiveStreamMonitor(StopLiveStreamMonitorRequest request);

    CompletableFuture<StopPlaylistResponse> stopPlaylist(StopPlaylistRequest request);

    CompletableFuture<TagLiveResourcesResponse> tagLiveResources(TagLiveResourcesRequest request);

    CompletableFuture<UnTagLiveResourcesResponse> unTagLiveResources(UnTagLiveResourcesRequest request);

    CompletableFuture<UpdateBoardResponse> updateBoard(UpdateBoardRequest request);

    CompletableFuture<UpdateBoardCallbackResponse> updateBoardCallback(UpdateBoardCallbackRequest request);

    CompletableFuture<UpdateCasterSceneAudioResponse> updateCasterSceneAudio(UpdateCasterSceneAudioRequest request);

    CompletableFuture<UpdateCasterSceneConfigResponse> updateCasterSceneConfig(UpdateCasterSceneConfigRequest request);

    CompletableFuture<UpdateKmsIdResponse> updateKmsId(UpdateKmsIdRequest request);

    CompletableFuture<UpdateLiveASRConfigResponse> updateLiveASRConfig(UpdateLiveASRConfigRequest request);

    CompletableFuture<UpdateLiveAppSnapshotConfigResponse> updateLiveAppSnapshotConfig(UpdateLiveAppSnapshotConfigRequest request);

    CompletableFuture<UpdateLiveAudioAuditConfigResponse> updateLiveAudioAuditConfig(UpdateLiveAudioAuditConfigRequest request);

    CompletableFuture<UpdateLiveAudioAuditNotifyConfigResponse> updateLiveAudioAuditNotifyConfig(UpdateLiveAudioAuditNotifyConfigRequest request);

    CompletableFuture<UpdateLiveDetectNotifyConfigResponse> updateLiveDetectNotifyConfig(UpdateLiveDetectNotifyConfigRequest request);

    CompletableFuture<UpdateLivePullStreamInfoConfigResponse> updateLivePullStreamInfoConfig(UpdateLivePullStreamInfoConfigRequest request);

    CompletableFuture<UpdateLiveRecordNotifyConfigResponse> updateLiveRecordNotifyConfig(UpdateLiveRecordNotifyConfigRequest request);

    CompletableFuture<UpdateLiveSnapshotDetectPornConfigResponse> updateLiveSnapshotDetectPornConfig(UpdateLiveSnapshotDetectPornConfigRequest request);

    CompletableFuture<UpdateLiveStreamMonitorResponse> updateLiveStreamMonitor(UpdateLiveStreamMonitorRequest request);

    CompletableFuture<UpdateLiveStreamWatermarkResponse> updateLiveStreamWatermark(UpdateLiveStreamWatermarkRequest request);

    CompletableFuture<UpdateLiveStreamWatermarkRuleResponse> updateLiveStreamWatermarkRule(UpdateLiveStreamWatermarkRuleRequest request);

    CompletableFuture<UpdateLiveTopLevelDomainResponse> updateLiveTopLevelDomain(UpdateLiveTopLevelDomainRequest request);

    CompletableFuture<UpdateMixStreamResponse> updateMixStream(UpdateMixStreamRequest request);

    CompletableFuture<VerifyLiveDomainOwnerResponse> verifyLiveDomainOwner(VerifyLiveDomainOwnerRequest request);

}
