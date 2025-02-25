// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vdmeter20210425.models.*;
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

    CompletableFuture<DescribeHuYaRecordByDomainResponse> describeHuYaRecordByDomain(DescribeHuYaRecordByDomainRequest request);

    CompletableFuture<DescribeHuYaScreenshotByDomainResponse> describeHuYaScreenshotByDomain(DescribeHuYaScreenshotByDomainRequest request);

    CompletableFuture<DescribeHuYaTranscodeByDomainResponse> describeHuYaTranscodeByDomain(DescribeHuYaTranscodeByDomainRequest request);

    CompletableFuture<DescribeMeterBypassRtUsageByTaskProfileResponse> describeMeterBypassRtUsageByTaskProfile(DescribeMeterBypassRtUsageByTaskProfileRequest request);

    CompletableFuture<DescribeMeterMpuTranscodeRtUsageByTaskProfileResponse> describeMeterMpuTranscodeRtUsageByTaskProfile(DescribeMeterMpuTranscodeRtUsageByTaskProfileRequest request);

    CompletableFuture<DescribeMeterRecordRtUsageByTaskProfileResponse> describeMeterRecordRtUsageByTaskProfile(DescribeMeterRecordRtUsageByTaskProfileRequest request);

    CompletableFuture<DescribeMeterRtcApproxPeakRateResponse> describeMeterRtcApproxPeakRate(DescribeMeterRtcApproxPeakRateRequest request);

    CompletableFuture<DescribeMeterRtcChannelCntDataResponse> describeMeterRtcChannelCntData(DescribeMeterRtcChannelCntDataRequest request);

    CompletableFuture<DescribeMeterRtcDurationResponse> describeMeterRtcDuration(DescribeMeterRtcDurationRequest request);

    CompletableFuture<DescribeMeterRtcPeakChannelCntDataResponse> describeMeterRtcPeakChannelCntData(DescribeMeterRtcPeakChannelCntDataRequest request);

    CompletableFuture<DescribeMeterRtcPeakUserCntDataResponse> describeMeterRtcPeakUserCntData(DescribeMeterRtcPeakUserCntDataRequest request);

    CompletableFuture<DescribeMeterRtcRtBandWidthUsageResponse> describeMeterRtcRtBandWidthUsage(DescribeMeterRtcRtBandWidthUsageRequest request);

    CompletableFuture<DescribeMeterRtcRtFlowUsageResponse> describeMeterRtcRtFlowUsage(DescribeMeterRtcRtFlowUsageRequest request);

    CompletableFuture<DescribeMeterRtcUserCntDataResponse> describeMeterRtcUserCntData(DescribeMeterRtcUserCntDataRequest request);

    CompletableFuture<DescribeNewPlayVideoPlaySessionEventDetailResponse> describeNewPlayVideoPlaySessionEventDetail(DescribeNewPlayVideoPlaySessionEventDetailRequest request);

    CompletableFuture<DescribeNewPlayVideoPlaySessionListResponse> describeNewPlayVideoPlaySessionList(DescribeNewPlayVideoPlaySessionListRequest request);

    CompletableFuture<DescribeNewPlayVideoPlaySessioninfoResponse> describeNewPlayVideoPlaySessioninfo(DescribeNewPlayVideoPlaySessioninfoRequest request);

}
