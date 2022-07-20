// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.actiontrail20200706.models.*;
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

    CompletableFuture<CreateDeliveryHistoryJobResponse> createDeliveryHistoryJob(CreateDeliveryHistoryJobRequest request);

    CompletableFuture<CreateTrailResponse> createTrail(CreateTrailRequest request);

    CompletableFuture<DeleteDeliveryHistoryJobResponse> deleteDeliveryHistoryJob(DeleteDeliveryHistoryJobRequest request);

    CompletableFuture<DeleteTrailResponse> deleteTrail(DeleteTrailRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeTrailsResponse> describeTrails(DescribeTrailsRequest request);

    CompletableFuture<GetAccessKeyLastUsedEventsResponse> getAccessKeyLastUsedEvents(GetAccessKeyLastUsedEventsRequest request);

    CompletableFuture<GetAccessKeyLastUsedInfoResponse> getAccessKeyLastUsedInfo(GetAccessKeyLastUsedInfoRequest request);

    CompletableFuture<GetAccessKeyLastUsedIpsResponse> getAccessKeyLastUsedIps(GetAccessKeyLastUsedIpsRequest request);

    CompletableFuture<GetAccessKeyLastUsedProductsResponse> getAccessKeyLastUsedProducts(GetAccessKeyLastUsedProductsRequest request);

    CompletableFuture<GetAccessKeyLastUsedResourcesResponse> getAccessKeyLastUsedResources(GetAccessKeyLastUsedResourcesRequest request);

    CompletableFuture<GetDeliveryHistoryJobResponse> getDeliveryHistoryJob(GetDeliveryHistoryJobRequest request);

    CompletableFuture<GetTrailStatusResponse> getTrailStatus(GetTrailStatusRequest request);

    CompletableFuture<ListDeliveryHistoryJobsResponse> listDeliveryHistoryJobs(ListDeliveryHistoryJobsRequest request);

    CompletableFuture<LookupEventsResponse> lookupEvents(LookupEventsRequest request);

    CompletableFuture<StartLoggingResponse> startLogging(StartLoggingRequest request);

    CompletableFuture<StopLoggingResponse> stopLogging(StopLoggingRequest request);

    CompletableFuture<UpdateTrailResponse> updateTrail(UpdateTrailRequest request);

}
