// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.advisor20180120.models.*;
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

    CompletableFuture<DescribeAdvicesResponse> describeAdvices(DescribeAdvicesRequest request);

    CompletableFuture<DescribeAdvicesFlatPageResponse> describeAdvicesFlatPage(DescribeAdvicesFlatPageRequest request);

    CompletableFuture<DescribeAdvicesPageResponse> describeAdvicesPage(DescribeAdvicesPageRequest request);

    CompletableFuture<DescribeAdvisorChecksResponse> describeAdvisorChecks(DescribeAdvisorChecksRequest request);

    CompletableFuture<DescribeAdvisorResourcesResponse> describeAdvisorResources(DescribeAdvisorResourcesRequest request);

    CompletableFuture<DescribeCostCheckAdvicesResponse> describeCostCheckAdvices(DescribeCostCheckAdvicesRequest request);

    CompletableFuture<DescribeCostCheckResultsResponse> describeCostCheckResults(DescribeCostCheckResultsRequest request);

    CompletableFuture<GetHistoryAdvicesResponse> getHistoryAdvices(GetHistoryAdvicesRequest request);

    CompletableFuture<GetTaskStatusByIdResponse> getTaskStatusById(GetTaskStatusByIdRequest request);

    CompletableFuture<RefreshAdvisorCheckResponse> refreshAdvisorCheck(RefreshAdvisorCheckRequest request);

    CompletableFuture<RefreshAdvisorCostCheckResponse> refreshAdvisorCostCheck(RefreshAdvisorCostCheckRequest request);

    CompletableFuture<RefreshAdvisorResourceResponse> refreshAdvisorResource(RefreshAdvisorResourceRequest request);

    CompletableFuture<ReportBizAlertInfoResponse> reportBizAlertInfo(ReportBizAlertInfoRequest request);

}
