// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.actiontrail20200706.models.*;
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
      * Take note of the following limits:
      * - You must have created and configured a single-account trail to deliver events to Log Service by calling the [CreateTrail](~~212313~~) operation.
      * - Only one historical event delivery task can be running at a time within an Alibaba Cloud account.
      * This topic shows you how to create a historical event delivery task for a sample trail named `trail-name`.
      *
     */
    CompletableFuture<CreateDeliveryHistoryJobResponse> createDeliveryHistoryJob(CreateDeliveryHistoryJobRequest request);

    /**
      * You can create a trail to deliver events to Log Service, Object Storage Service (OSS), or both. Before you call this operation to create a trail, make sure that the following requirements are met:
      * *   Deliver events to Log Service: A project is created in Log Service.
      * **
      * **Description** After you create a trail to deliver events to Log Service, a Logstore whose name is in the `actiontrail_<Trail name>` format is automatically created and optimally configured for subsequent auditing. Indexes and a dashboard are created for the Logstore to facilitate event queries. You cannot manually write data to the Logstore. This ensures data accuracy. You do not need to create a Logstore in advance.
      * *   Deliver events to OSS: A bucket is created in OSS. This topic provides an example on how to call the API operation to create a single-account trail named `trail-test` to deliver events to an OSS bucket named `audit-log`.
      *
     */
    CompletableFuture<CreateTrailResponse> createTrail(CreateTrailRequest request);

    /**
      * This topic describes how to delete a sample historical event delivery task whose ID is `16602`.
      *
     */
    CompletableFuture<DeleteDeliveryHistoryJobResponse> deleteDeliveryHistoryJob(DeleteDeliveryHistoryJobRequest request);

    /**
      * This topic describes how to delete a sample trail named `trail-test`.
      *
     */
    CompletableFuture<DeleteTrailResponse> deleteTrail(DeleteTrailRequest request);

    /**
      * For more information, see [Regions and zones](~~40654~~).
      *
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * This topic shows you how to query the information about the single-account trails within an Alibaba Cloud account. In this example, the information about a trail named `test-4` is returned.
      *
     */
    CompletableFuture<DescribeTrailsResponse> describeTrails(DescribeTrailsRequest request);

    CompletableFuture<EnableInsightResponse> enableInsight(EnableInsightRequest request);

    /**
      * You can call this operation to query only the information about the most recent events that are generated within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. For more information about supported events, see [Alibaba Cloud services and events that are supported by the AccessKey pair audit feature](~~419214~~). Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
     */
    CompletableFuture<GetAccessKeyLastUsedEventsResponse> getAccessKeyLastUsedEvents(GetAccessKeyLastUsedEventsRequest request);

    /**
      * You can call this operation to query only the information about the most recent call of a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
     */
    CompletableFuture<GetAccessKeyLastUsedInfoResponse> getAccessKeyLastUsedInfo(GetAccessKeyLastUsedInfoRequest request);

    /**
      * You can call this operation to query only the information about the IP addresses that are most recently used within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
     */
    CompletableFuture<GetAccessKeyLastUsedIpsResponse> getAccessKeyLastUsedIps(GetAccessKeyLastUsedIpsRequest request);

    /**
      * You can call this operation to query only the information about Alibaba Cloud services that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
     */
    CompletableFuture<GetAccessKeyLastUsedProductsResponse> getAccessKeyLastUsedProducts(GetAccessKeyLastUsedProductsRequest request);

    /**
      * You can call this operation to query only the information about resources that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
     */
    CompletableFuture<GetAccessKeyLastUsedResourcesResponse> getAccessKeyLastUsedResources(GetAccessKeyLastUsedResourcesRequest request);

    /**
      * This topic describes how to query the details of a historical event delivery tasks created within your Alibaba Cloud account. In this example, the details of a historical event delivery task whose ID is `16602` are returned. The sample response shows that this task is used to deliver the historical events recorded by the trail named `trail-name` to Log Service and the task is complete.
      *
     */
    CompletableFuture<GetDeliveryHistoryJobResponse> getDeliveryHistoryJob(GetDeliveryHistoryJobRequest request);

    /**
      * By default, global events are stored in the Singapore region.
      * To obtain the permissions to call the API operation, you must submit a ticket.
      *
     */
    CompletableFuture<GetGlobalEventsStorageRegionResponse> getGlobalEventsStorageRegion(GetGlobalEventsStorageRegionRequest request);

    /**
      * This topic describes how to query the status of a sample single-account trail named `trail-test`.
      *
     */
    CompletableFuture<GetTrailStatusResponse> getTrailStatus(GetTrailStatusRequest request);

    /**
      * This topic describes how to query the historical event delivery tasks created within your Alibaba Cloud account. In this example, a historical event delivery task whose ID is `16602` is returned. This task is used to deliver historical events for the trail named `trail-name` to Log Service.
      *
     */
    CompletableFuture<ListDeliveryHistoryJobsResponse> listDeliveryHistoryJobs(ListDeliveryHistoryJobsRequest request);

    /**
      * When you call this operation to query event details, you can query the event details at most twice per second.
      * > Do not frequently call this operation. You can create a trail to deliver events to Log Service. Then, you can query event details in near real time by using the real-time log consumption feature of Log Service. For more information, see [Create a single-account trail](~~28810~~), [Create a multi-account trail](~~160661~~), and [Overview](~~28997~~).
      *
     */
    CompletableFuture<LookupEventsResponse> lookupEvents(LookupEventsRequest request);

    /**
      * This topic describes how to enable logging for a sample trail named `trail-test`.
      *
     */
    CompletableFuture<StartLoggingResponse> startLogging(StartLoggingRequest request);

    /**
      * This topic describes how to disable logging for a sample trail named `trail-test`.
      *
     */
    CompletableFuture<StopLoggingResponse> stopLogging(StopLoggingRequest request);

    /**
      * By default, global events are stored in the Singapore region.
      * *   To obtain the permissions to call the API operation, you must submit a ticket.
      * *   Only the China (Hangzhou) region (cn-hangzhou) and the Singapore region (ap-southeast-1) are supported.
      *
     */
    CompletableFuture<UpdateGlobalEventsStorageRegionResponse> updateGlobalEventsStorageRegion(UpdateGlobalEventsStorageRegionRequest request);

    /**
      * This topic shows you how to change the destination Object Storage Service (OSS) bucket of a sample trail named `trail-test` to `audit-log`.
      *
     */
    CompletableFuture<UpdateTrailResponse> updateTrail(UpdateTrailRequest request);

}
