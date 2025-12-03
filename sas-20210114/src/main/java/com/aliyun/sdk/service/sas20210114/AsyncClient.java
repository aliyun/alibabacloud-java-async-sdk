// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sas20210114.models.*;
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
     * @param request the request parameters of CreateScreenSetting  CreateScreenSettingRequest
     * @return CreateScreenSettingResponse
     */
    CompletableFuture<CreateScreenSettingResponse> createScreenSetting(CreateScreenSettingRequest request);

    /**
     * @param request the request parameters of DeleteScreenSetting  DeleteScreenSettingRequest
     * @return DeleteScreenSettingResponse
     */
    CompletableFuture<DeleteScreenSettingResponse> deleteScreenSetting(DeleteScreenSettingRequest request);

    /**
     * @param request the request parameters of DescribeScreenAlarmEventList  DescribeScreenAlarmEventListRequest
     * @return DescribeScreenAlarmEventListResponse
     */
    CompletableFuture<DescribeScreenAlarmEventListResponse> describeScreenAlarmEventList(DescribeScreenAlarmEventListRequest request);

    /**
     * @param request the request parameters of DescribeScreenAttackAnalysisData  DescribeScreenAttackAnalysisDataRequest
     * @return DescribeScreenAttackAnalysisDataResponse
     */
    CompletableFuture<DescribeScreenAttackAnalysisDataResponse> describeScreenAttackAnalysisData(DescribeScreenAttackAnalysisDataRequest request);

    /**
     * @param request the request parameters of DescribeScreenCloudHcRisk  DescribeScreenCloudHcRiskRequest
     * @return DescribeScreenCloudHcRiskResponse
     */
    CompletableFuture<DescribeScreenCloudHcRiskResponse> describeScreenCloudHcRisk(DescribeScreenCloudHcRiskRequest request);

    /**
     * @param request the request parameters of DescribeScreenDataMap  DescribeScreenDataMapRequest
     * @return DescribeScreenDataMapResponse
     */
    CompletableFuture<DescribeScreenDataMapResponse> describeScreenDataMap(DescribeScreenDataMapRequest request);

    /**
     * @param request the request parameters of DescribeScreenEmerRisk  DescribeScreenEmerRiskRequest
     * @return DescribeScreenEmerRiskResponse
     */
    CompletableFuture<DescribeScreenEmerRiskResponse> describeScreenEmerRisk(DescribeScreenEmerRiskRequest request);

    /**
     * @param request the request parameters of DescribeScreenHostStatistics  DescribeScreenHostStatisticsRequest
     * @return DescribeScreenHostStatisticsResponse
     */
    CompletableFuture<DescribeScreenHostStatisticsResponse> describeScreenHostStatistics(DescribeScreenHostStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeScreenOperateInfo  DescribeScreenOperateInfoRequest
     * @return DescribeScreenOperateInfoResponse
     */
    CompletableFuture<DescribeScreenOperateInfoResponse> describeScreenOperateInfo(DescribeScreenOperateInfoRequest request);

    /**
     * @param request the request parameters of DescribeScreenOssUploadInfo  DescribeScreenOssUploadInfoRequest
     * @return DescribeScreenOssUploadInfoResponse
     */
    CompletableFuture<DescribeScreenOssUploadInfoResponse> describeScreenOssUploadInfo(DescribeScreenOssUploadInfoRequest request);

    /**
     * @param request the request parameters of DescribeScreenScoreThread  DescribeScreenScoreThreadRequest
     * @return DescribeScreenScoreThreadResponse
     */
    CompletableFuture<DescribeScreenScoreThreadResponse> describeScreenScoreThread(DescribeScreenScoreThreadRequest request);

    /**
     * @param request the request parameters of DescribeScreenSecurityStatInfo  DescribeScreenSecurityStatInfoRequest
     * @return DescribeScreenSecurityStatInfoResponse
     */
    CompletableFuture<DescribeScreenSecurityStatInfoResponse> describeScreenSecurityStatInfo(DescribeScreenSecurityStatInfoRequest request);

    /**
     * @param request the request parameters of DescribeScreenSetting  DescribeScreenSettingRequest
     * @return DescribeScreenSettingResponse
     */
    CompletableFuture<DescribeScreenSettingResponse> describeScreenSetting(DescribeScreenSettingRequest request);

    /**
     * @param request the request parameters of DescribeScreenSummaryInfo  DescribeScreenSummaryInfoRequest
     * @return DescribeScreenSummaryInfoResponse
     */
    CompletableFuture<DescribeScreenSummaryInfoResponse> describeScreenSummaryInfo(DescribeScreenSummaryInfoRequest request);

    /**
     * @param request the request parameters of DescribeScreenTitles  DescribeScreenTitlesRequest
     * @return DescribeScreenTitlesResponse
     */
    CompletableFuture<DescribeScreenTitlesResponse> describeScreenTitles(DescribeScreenTitlesRequest request);

    /**
     * @param request the request parameters of DescribeScreenUploadPicture  DescribeScreenUploadPictureRequest
     * @return DescribeScreenUploadPictureResponse
     */
    CompletableFuture<DescribeScreenUploadPictureResponse> describeScreenUploadPicture(DescribeScreenUploadPictureRequest request);

    /**
     * @param request the request parameters of DescribeScreenVersionConfig  DescribeScreenVersionConfigRequest
     * @return DescribeScreenVersionConfigResponse
     */
    CompletableFuture<DescribeScreenVersionConfigResponse> describeScreenVersionConfig(DescribeScreenVersionConfigRequest request);

    /**
     * @param request the request parameters of GetFileDetectResultInner  GetFileDetectResultInnerRequest
     * @return GetFileDetectResultInnerResponse
     */
    CompletableFuture<GetFileDetectResultInnerResponse> getFileDetectResultInner(GetFileDetectResultInnerRequest request);

    /**
     * @param request the request parameters of ListGlobalUserConfig  ListGlobalUserConfigRequest
     * @return ListGlobalUserConfigResponse
     */
    CompletableFuture<ListGlobalUserConfigResponse> listGlobalUserConfig(ListGlobalUserConfigRequest request);

}
