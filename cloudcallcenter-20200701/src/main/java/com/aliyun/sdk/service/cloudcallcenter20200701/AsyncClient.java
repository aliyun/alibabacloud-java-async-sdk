// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudcallcenter20200701.models.*;
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
     * @param request the request parameters of AbortCases  AbortCasesRequest
     * @return AbortCasesResponse
     */
    CompletableFuture<AbortCasesResponse> abortCases(AbortCasesRequest request);

    /**
     * @param request the request parameters of CheckDemoInstanceExists  CheckDemoInstanceExistsRequest
     * @return CheckDemoInstanceExistsResponse
     */
    CompletableFuture<CheckDemoInstanceExistsResponse> checkDemoInstanceExists(CheckDemoInstanceExistsRequest request);

    /**
     * @param request the request parameters of CheckMQRoleAssumptionAuthority  CheckMQRoleAssumptionAuthorityRequest
     * @return CheckMQRoleAssumptionAuthorityResponse
     */
    CompletableFuture<CheckMQRoleAssumptionAuthorityResponse> checkMQRoleAssumptionAuthority(CheckMQRoleAssumptionAuthorityRequest request);

    /**
     * @param request the request parameters of CreateCampaign  CreateCampaignRequest
     * @return CreateCampaignResponse
     */
    CompletableFuture<CreateCampaignResponse> createCampaign(CreateCampaignRequest request);

    /**
     * @param request the request parameters of CreateChatMediaUrl  CreateChatMediaUrlRequest
     * @return CreateChatMediaUrlResponse
     */
    CompletableFuture<CreateChatMediaUrlResponse> createChatMediaUrl(CreateChatMediaUrlRequest request);

    /**
     * @param request the request parameters of CreateCorpNumberGroup  CreateCorpNumberGroupRequest
     * @return CreateCorpNumberGroupResponse
     */
    CompletableFuture<CreateCorpNumberGroupResponse> createCorpNumberGroup(CreateCorpNumberGroupRequest request);

    /**
     * @param request the request parameters of CreateDemoInstance  CreateDemoInstanceRequest
     * @return CreateDemoInstanceResponse
     */
    CompletableFuture<CreateDemoInstanceResponse> createDemoInstance(CreateDemoInstanceRequest request);

    /**
     * @param request the request parameters of GetAccessChannelOfStaging  GetAccessChannelOfStagingRequest
     * @return GetAccessChannelOfStagingResponse
     */
    CompletableFuture<GetAccessChannelOfStagingResponse> getAccessChannelOfStaging(GetAccessChannelOfStagingRequest request);

    /**
     * @param request the request parameters of GetCampaign  GetCampaignRequest
     * @return GetCampaignResponse
     */
    CompletableFuture<GetCampaignResponse> getCampaign(GetCampaignRequest request);

    /**
     * @param request the request parameters of GetDocument  GetDocumentRequest
     * @return GetDocumentResponse
     */
    CompletableFuture<GetDocumentResponse> getDocument(GetDocumentRequest request);

    /**
     * @param request the request parameters of GetHistoricalCampaignReport  GetHistoricalCampaignReportRequest
     * @return GetHistoricalCampaignReportResponse
     */
    CompletableFuture<GetHistoricalCampaignReportResponse> getHistoricalCampaignReport(GetHistoricalCampaignReportRequest request);

    /**
     * @param request the request parameters of GetInstanceIdsByAliyunUidV2  GetInstanceIdsByAliyunUidV2Request
     * @return GetInstanceIdsByAliyunUidV2Response
     */
    CompletableFuture<GetInstanceIdsByAliyunUidV2Response> getInstanceIdsByAliyunUidV2(GetInstanceIdsByAliyunUidV2Request request);

    /**
     * @param request the request parameters of GetRealtimeCampaignStats  GetRealtimeCampaignStatsRequest
     * @return GetRealtimeCampaignStatsResponse
     */
    CompletableFuture<GetRealtimeCampaignStatsResponse> getRealtimeCampaignStats(GetRealtimeCampaignStatsRequest request);

    /**
     * @param request the request parameters of ImportAdmins  ImportAdminsRequest
     * @return ImportAdminsResponse
     */
    CompletableFuture<ImportAdminsResponse> importAdmins(ImportAdminsRequest request);

    /**
     * @param request the request parameters of IssueSoftphoneCommand  IssueSoftphoneCommandRequest
     * @return IssueSoftphoneCommandResponse
     */
    CompletableFuture<IssueSoftphoneCommandResponse> issueSoftphoneCommand(IssueSoftphoneCommandRequest request);

    /**
     * @param request the request parameters of ListAttempts  ListAttemptsRequest
     * @return ListAttemptsResponse
     */
    CompletableFuture<ListAttemptsResponse> listAttempts(ListAttemptsRequest request);

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
     * @param request the request parameters of ListFlashSmsSettings  ListFlashSmsSettingsRequest
     * @return ListFlashSmsSettingsResponse
     */
    CompletableFuture<ListFlashSmsSettingsResponse> listFlashSmsSettings(ListFlashSmsSettingsRequest request);

    /**
     * @param request the request parameters of ListHistoricalAgentSkillGroupReport  ListHistoricalAgentSkillGroupReportRequest
     * @return ListHistoricalAgentSkillGroupReportResponse
     */
    CompletableFuture<ListHistoricalAgentSkillGroupReportResponse> listHistoricalAgentSkillGroupReport(ListHistoricalAgentSkillGroupReportRequest request);

    /**
     * @param request the request parameters of ListIntervalAgentSkillGroupReport  ListIntervalAgentSkillGroupReportRequest
     * @return ListIntervalAgentSkillGroupReportResponse
     */
    CompletableFuture<ListIntervalAgentSkillGroupReportResponse> listIntervalAgentSkillGroupReport(ListIntervalAgentSkillGroupReportRequest request);

    /**
     * @param request the request parameters of ListMonoRecordings  ListMonoRecordingsRequest
     * @return ListMonoRecordingsResponse
     */
    CompletableFuture<ListMonoRecordingsResponse> listMonoRecordings(ListMonoRecordingsRequest request);

    /**
     * @param request the request parameters of PauseCampaign  PauseCampaignRequest
     * @return PauseCampaignResponse
     */
    CompletableFuture<PauseCampaignResponse> pauseCampaign(PauseCampaignRequest request);

    /**
     * @param request the request parameters of ProcessAliMeCallbackOfStaging  ProcessAliMeCallbackOfStagingRequest
     * @return ProcessAliMeCallbackOfStagingResponse
     */
    CompletableFuture<ProcessAliMeCallbackOfStagingResponse> processAliMeCallbackOfStaging(ProcessAliMeCallbackOfStagingRequest request);

    /**
     * @param request the request parameters of ProcessCustomIMCallback  ProcessCustomIMCallbackRequest
     * @return ProcessCustomIMCallbackResponse
     */
    CompletableFuture<ProcessCustomIMCallbackResponse> processCustomIMCallback(ProcessCustomIMCallbackRequest request);

    /**
     * @param request the request parameters of ReplaceMigrationAvailableNumbers  ReplaceMigrationAvailableNumbersRequest
     * @return ReplaceMigrationAvailableNumbersResponse
     */
    CompletableFuture<ReplaceMigrationAvailableNumbersResponse> replaceMigrationAvailableNumbers(ReplaceMigrationAvailableNumbersRequest request);

    /**
     * @param request the request parameters of ResumeCampaign  ResumeCampaignRequest
     * @return ResumeCampaignResponse
     */
    CompletableFuture<ResumeCampaignResponse> resumeCampaign(ResumeCampaignRequest request);

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
     * @param request the request parameters of SaveWebRtcInfo  SaveWebRtcInfoRequest
     * @return SaveWebRtcInfoResponse
     */
    CompletableFuture<SaveWebRtcInfoResponse> saveWebRtcInfo(SaveWebRtcInfoRequest request);

    /**
     * @param request the request parameters of SendNotification  SendNotificationRequest
     * @return SendNotificationResponse
     */
    CompletableFuture<SendNotificationResponse> sendNotification(SendNotificationRequest request);

    /**
     * @param request the request parameters of SubmitCampaign  SubmitCampaignRequest
     * @return SubmitCampaignResponse
     */
    CompletableFuture<SubmitCampaignResponse> submitCampaign(SubmitCampaignRequest request);

    /**
     * @param request the request parameters of UnregisterDevice  UnregisterDeviceRequest
     * @return UnregisterDeviceResponse
     */
    CompletableFuture<UnregisterDeviceResponse> unregisterDevice(UnregisterDeviceRequest request);

}
