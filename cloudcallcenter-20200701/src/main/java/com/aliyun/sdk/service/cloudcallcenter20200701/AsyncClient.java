// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudcallcenter20200701.models.*;
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

    CompletableFuture<AbortCasesResponse> abortCases(AbortCasesRequest request);

    CompletableFuture<CheckDemoInstanceExistsResponse> checkDemoInstanceExists(CheckDemoInstanceExistsRequest request);

    CompletableFuture<CheckMQRoleAssumptionAuthorityResponse> checkMQRoleAssumptionAuthority(CheckMQRoleAssumptionAuthorityRequest request);

    CompletableFuture<CreateCampaignResponse> createCampaign(CreateCampaignRequest request);

    CompletableFuture<CreateCorpNumberGroupResponse> createCorpNumberGroup(CreateCorpNumberGroupRequest request);

    CompletableFuture<CreateDemoInstanceResponse> createDemoInstance(CreateDemoInstanceRequest request);

    CompletableFuture<GetCampaignResponse> getCampaign(GetCampaignRequest request);

    CompletableFuture<GetHistoricalCampaignReportResponse> getHistoricalCampaignReport(GetHistoricalCampaignReportRequest request);

    CompletableFuture<GetInstanceIdsByAliyunUidV2Response> getInstanceIdsByAliyunUidV2(GetInstanceIdsByAliyunUidV2Request request);

    CompletableFuture<GetRealtimeCampaignStatsResponse> getRealtimeCampaignStats(GetRealtimeCampaignStatsRequest request);

    CompletableFuture<ImportAdminsResponse> importAdmins(ImportAdminsRequest request);

    CompletableFuture<IssueSoftphoneCommandResponse> issueSoftphoneCommand(IssueSoftphoneCommandRequest request);

    CompletableFuture<ListAttemptsResponse> listAttempts(ListAttemptsRequest request);

    CompletableFuture<ListCampaignTrendingReportResponse> listCampaignTrendingReport(ListCampaignTrendingReportRequest request);

    CompletableFuture<ListCampaignsResponse> listCampaigns(ListCampaignsRequest request);

    CompletableFuture<ListCasesResponse> listCases(ListCasesRequest request);

    CompletableFuture<ListHistoricalAgentSkillGroupReportResponse> listHistoricalAgentSkillGroupReport(ListHistoricalAgentSkillGroupReportRequest request);

    CompletableFuture<ListIntervalAgentSkillGroupReportResponse> listIntervalAgentSkillGroupReport(ListIntervalAgentSkillGroupReportRequest request);

    CompletableFuture<ListMonoRecordingsResponse> listMonoRecordings(ListMonoRecordingsRequest request);

    CompletableFuture<PauseCampaignResponse> pauseCampaign(PauseCampaignRequest request);

    CompletableFuture<ReplaceMigrationAvailableNumbersResponse> replaceMigrationAvailableNumbers(ReplaceMigrationAvailableNumbersRequest request);

    CompletableFuture<ResumeCampaignResponse> resumeCampaign(ResumeCampaignRequest request);

    CompletableFuture<SaveRTCStatsV2Response> saveRTCStatsV2(SaveRTCStatsV2Request request);

    CompletableFuture<SaveTerminalLogResponse> saveTerminalLog(SaveTerminalLogRequest request);

    CompletableFuture<SaveWebRtcInfoResponse> saveWebRtcInfo(SaveWebRtcInfoRequest request);

    CompletableFuture<SubmitCampaignResponse> submitCampaign(SubmitCampaignRequest request);

    CompletableFuture<UnregisterDeviceResponse> unregisterDevice(UnregisterDeviceRequest request);

}
