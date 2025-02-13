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

    /**
     * @param request the request parameters of DescribeAdvices  DescribeAdvicesRequest
     * @return DescribeAdvicesResponse
     */
    CompletableFuture<DescribeAdvicesResponse> describeAdvices(DescribeAdvicesRequest request);

    /**
     * @param request the request parameters of DescribeAdvicesFlatPage  DescribeAdvicesFlatPageRequest
     * @return DescribeAdvicesFlatPageResponse
     */
    CompletableFuture<DescribeAdvicesFlatPageResponse> describeAdvicesFlatPage(DescribeAdvicesFlatPageRequest request);

    /**
     * @param request the request parameters of DescribeAdvicesPage  DescribeAdvicesPageRequest
     * @return DescribeAdvicesPageResponse
     */
    CompletableFuture<DescribeAdvicesPageResponse> describeAdvicesPage(DescribeAdvicesPageRequest request);

    /**
     * @param request the request parameters of DescribeAdvisorChecks  DescribeAdvisorChecksRequest
     * @return DescribeAdvisorChecksResponse
     */
    CompletableFuture<DescribeAdvisorChecksResponse> describeAdvisorChecks(DescribeAdvisorChecksRequest request);

    /**
     * @param request the request parameters of DescribeAdvisorResources  DescribeAdvisorResourcesRequest
     * @return DescribeAdvisorResourcesResponse
     */
    CompletableFuture<DescribeAdvisorResourcesResponse> describeAdvisorResources(DescribeAdvisorResourcesRequest request);

    /**
     * @param request the request parameters of DescribeCostCheckAdvices  DescribeCostCheckAdvicesRequest
     * @return DescribeCostCheckAdvicesResponse
     */
    CompletableFuture<DescribeCostCheckAdvicesResponse> describeCostCheckAdvices(DescribeCostCheckAdvicesRequest request);

    /**
     * @param request the request parameters of DescribeCostCheckResults  DescribeCostCheckResultsRequest
     * @return DescribeCostCheckResultsResponse
     */
    CompletableFuture<DescribeCostCheckResultsResponse> describeCostCheckResults(DescribeCostCheckResultsRequest request);

    /**
     * @param request the request parameters of GetHistoryAdvices  GetHistoryAdvicesRequest
     * @return GetHistoryAdvicesResponse
     */
    CompletableFuture<GetHistoryAdvicesResponse> getHistoryAdvices(GetHistoryAdvicesRequest request);

    /**
     * @param request the request parameters of GetTaskStatusById  GetTaskStatusByIdRequest
     * @return GetTaskStatusByIdResponse
     */
    CompletableFuture<GetTaskStatusByIdResponse> getTaskStatusById(GetTaskStatusByIdRequest request);

    /**
     * @param request the request parameters of RefreshAdvisorCheck  RefreshAdvisorCheckRequest
     * @return RefreshAdvisorCheckResponse
     */
    CompletableFuture<RefreshAdvisorCheckResponse> refreshAdvisorCheck(RefreshAdvisorCheckRequest request);

    /**
     * @param request the request parameters of RefreshAdvisorCostCheck  RefreshAdvisorCostCheckRequest
     * @return RefreshAdvisorCostCheckResponse
     */
    CompletableFuture<RefreshAdvisorCostCheckResponse> refreshAdvisorCostCheck(RefreshAdvisorCostCheckRequest request);

    /**
     * @param request the request parameters of RefreshAdvisorResource  RefreshAdvisorResourceRequest
     * @return RefreshAdvisorResourceResponse
     */
    CompletableFuture<RefreshAdvisorResourceResponse> refreshAdvisorResource(RefreshAdvisorResourceRequest request);

    /**
     * @param request the request parameters of ReportBizAlertInfo  ReportBizAlertInfoRequest
     * @return ReportBizAlertInfoResponse
     */
    CompletableFuture<ReportBizAlertInfoResponse> reportBizAlertInfo(ReportBizAlertInfoRequest request);

}
