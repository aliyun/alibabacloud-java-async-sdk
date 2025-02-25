// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vdc20201214.models.*;
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

    CompletableFuture<DescribeAppConfigResponse> describeAppConfig(DescribeAppConfigRequest request);

    CompletableFuture<DescribeCallResponse> describeCall(DescribeCallRequest request);

    CompletableFuture<DescribeCallInfoResponse> describeCallInfo(DescribeCallInfoRequest request);

    CompletableFuture<DescribeCallListResponse> describeCallList(DescribeCallListRequest request);

    CompletableFuture<DescribeCallUserExpResponse> describeCallUserExp(DescribeCallUserExpRequest request);

    CompletableFuture<DescribeCallUserListResponse> describeCallUserList(DescribeCallUserListRequest request);

    CompletableFuture<DescribeChannelAreaDistributionStatDataResponse> describeChannelAreaDistributionStatData(DescribeChannelAreaDistributionStatDataRequest request);

    CompletableFuture<DescribeChannelDistributionStatDataResponse> describeChannelDistributionStatData(DescribeChannelDistributionStatDataRequest request);

    CompletableFuture<DescribeChannelJoinInfoResponse> describeChannelJoinInfo(DescribeChannelJoinInfoRequest request);

    CompletableFuture<DescribeChannelOverallDataResponse> describeChannelOverallData(DescribeChannelOverallDataRequest request);

    CompletableFuture<DescribeChannelTopPubUserListResponse> describeChannelTopPubUserList(DescribeChannelTopPubUserListRequest request);

    CompletableFuture<DescribeChannelUserMetricsResponse> describeChannelUserMetrics(DescribeChannelUserMetricsRequest request);

    CompletableFuture<DescribeEndPointEventListResponse> describeEndPointEventList(DescribeEndPointEventListRequest request);

    CompletableFuture<DescribeEndPointMetricDataResponse> describeEndPointMetricData(DescribeEndPointMetricDataRequest request);

    CompletableFuture<DescribeFaultDiagnosisFactorDistributionStatResponse> describeFaultDiagnosisFactorDistributionStat(DescribeFaultDiagnosisFactorDistributionStatRequest request);

    CompletableFuture<DescribeFaultDiagnosisOverallDataResponse> describeFaultDiagnosisOverallData(DescribeFaultDiagnosisOverallDataRequest request);

    CompletableFuture<DescribeFaultDiagnosisUserDetailResponse> describeFaultDiagnosisUserDetail(DescribeFaultDiagnosisUserDetailRequest request);

    CompletableFuture<DescribeFaultDiagnosisUserListResponse> describeFaultDiagnosisUserList(DescribeFaultDiagnosisUserListRequest request);

    CompletableFuture<DescribeIceDurPeriodByDaySubTypeResponse> describeIceDurPeriodByDaySubType(DescribeIceDurPeriodByDaySubTypeRequest request);

    CompletableFuture<DescribeIceDurSummaryOverviewResponse> describeIceDurSummaryOverview(DescribeIceDurSummaryOverviewRequest request);

    CompletableFuture<DescribePubUserListBySubUserResponse> describePubUserListBySubUser(DescribePubUserListBySubUserRequest request);

    CompletableFuture<DescribeQoeMetricDataResponse> describeQoeMetricData(DescribeQoeMetricDataRequest request);

    CompletableFuture<DescribeQualityAreaDistributionStatDataResponse> describeQualityAreaDistributionStatData(DescribeQualityAreaDistributionStatDataRequest request);

    CompletableFuture<DescribeQualityDistributionStatDataResponse> describeQualityDistributionStatData(DescribeQualityDistributionStatDataRequest request);

    CompletableFuture<DescribeQualityOsSdkVersionDistributionStatDataResponse> describeQualityOsSdkVersionDistributionStatData(DescribeQualityOsSdkVersionDistributionStatDataRequest request);

    CompletableFuture<DescribeQualityOverallDataResponse> describeQualityOverallData(DescribeQualityOverallDataRequest request);

    CompletableFuture<DescribeUsageAreaDistributionStatDataResponse> describeUsageAreaDistributionStatData(DescribeUsageAreaDistributionStatDataRequest request);

    CompletableFuture<DescribeUsageDistributionStatDataResponse> describeUsageDistributionStatData(DescribeUsageDistributionStatDataRequest request);

    CompletableFuture<DescribeUsageOsSdkVersionDistributionStatDataResponse> describeUsageOsSdkVersionDistributionStatData(DescribeUsageOsSdkVersionDistributionStatDataRequest request);

    CompletableFuture<DescribeUsageOverallDataResponse> describeUsageOverallData(DescribeUsageOverallDataRequest request);

}
