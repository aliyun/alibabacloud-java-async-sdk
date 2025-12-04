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
     * @param request the request parameters of CreateAdvancedQueryHistory  CreateAdvancedQueryHistoryRequest
     * @return CreateAdvancedQueryHistoryResponse
     */
    CompletableFuture<CreateAdvancedQueryHistoryResponse> createAdvancedQueryHistory(CreateAdvancedQueryHistoryRequest request);

    /**
     * @param request the request parameters of CreateAdvancedQueryTemplate  CreateAdvancedQueryTemplateRequest
     * @return CreateAdvancedQueryTemplateResponse
     */
    CompletableFuture<CreateAdvancedQueryTemplateResponse> createAdvancedQueryTemplate(CreateAdvancedQueryTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Limits</p>
     * <ul>
     * <li>Make sure that you have created a single-account trail to deliver events to Simple Log Service by calling the <a href="https://help.aliyun.com/document_detail/212313.html">CreateTrail</a> operation.</li>
     * <li>Only one data backfill task can run at a time within an Alibaba Cloud account.
     * This topic provides an example on how to create a data backfill task for a trail named <code>trail-name</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDeliveryHistoryJob  CreateDeliveryHistoryJobRequest
     * @return CreateDeliveryHistoryJobResponse
     */
    CompletableFuture<CreateDeliveryHistoryJobResponse> createDeliveryHistoryJob(CreateDeliveryHistoryJobRequest request);

    /**
     * <b>description</b> :
     * <p><em>Operation description</em>*</p>
     * <blockquote>
     * <p>By default, a trail that is created by calling an operation is in the Disabled state. You must call the StartLogging operation to enable the trail. This way, ActionTrail can deliver events to the destination cloud service.
     * <strong>Prerequisites</strong>
     * Before you create a trail, make sure that at least one of the following storage configurations is complete:</p>
     * </blockquote>
     * <ul>
     * <li><p>Deliver events to OSS</p>
     * <ul>
     * <li>OSS is activated and a bucket is created.</li>
     * </ul>
     * </li>
     * <li><p>Deliver events to Simple Log Service</p>
     * <ul>
     * <li>Simple Log Service is activated and a project is created.<blockquote>
     * <p>When a trail is created, ActionTrail automatically creates a Logstore named <code>actiontrail_&lt;Trail name&gt;</code> in the project. You cannot write data other than the audit data to the Logstore. This ensures the accuracy of the audit data.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><p>Deliver events to MaxCompute</p>
     * <ul>
     * <li>MaxCompute is activated.<blockquote>
     * <p>When a trail is created, ActionTrail automatically creates a project named <code>actiontrail_&lt;Account ID&gt;</code> on the Projects page. You cannot write data other than the audit data to the project. This ensures the accuracy of the audit data.
     * <strong>Usage Notes</strong>
     * This topic provides an example on how to create a single-account trail named <code>trail-test</code> to deliver events to an OSS bucket named <code>audit-log</code>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateTrail  CreateTrailRequest
     * @return CreateTrailResponse
     */
    CompletableFuture<CreateTrailResponse> createTrail(CreateTrailRequest request);

    /**
     * @param request the request parameters of DeleteAdvancedQueryHistory  DeleteAdvancedQueryHistoryRequest
     * @return DeleteAdvancedQueryHistoryResponse
     */
    CompletableFuture<DeleteAdvancedQueryHistoryResponse> deleteAdvancedQueryHistory(DeleteAdvancedQueryHistoryRequest request);

    /**
     * @param request the request parameters of DeleteAdvancedQueryTemplate  DeleteAdvancedQueryTemplateRequest
     * @return DeleteAdvancedQueryTemplateResponse
     */
    CompletableFuture<DeleteAdvancedQueryTemplateResponse> deleteAdvancedQueryTemplate(DeleteAdvancedQueryTemplateRequest request);

    /**
     * @param request the request parameters of DeleteDataEventSelector  DeleteDataEventSelectorRequest
     * @return DeleteDataEventSelectorResponse
     */
    CompletableFuture<DeleteDataEventSelectorResponse> deleteDataEventSelector(DeleteDataEventSelectorRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes how to delete a data backfill task whose ID is <code>16602</code>.</p>
     * 
     * @param request the request parameters of DeleteDeliveryHistoryJob  DeleteDeliveryHistoryJobRequest
     * @return DeleteDeliveryHistoryJobResponse
     */
    CompletableFuture<DeleteDeliveryHistoryJobResponse> deleteDeliveryHistoryJob(DeleteDeliveryHistoryJobRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes how to delete a sample trail named <code>trail-test</code>.</p>
     * 
     * @param request the request parameters of DeleteTrail  DeleteTrailRequest
     * @return DeleteTrailResponse
     */
    CompletableFuture<DeleteTrailResponse> deleteTrail(DeleteTrailRequest request);

    /**
     * @param request the request parameters of DescribeAdvancedQueryHistory  DescribeAdvancedQueryHistoryRequest
     * @return DescribeAdvancedQueryHistoryResponse
     */
    CompletableFuture<DescribeAdvancedQueryHistoryResponse> describeAdvancedQueryHistory(DescribeAdvancedQueryHistoryRequest request);

    /**
     * @param request the request parameters of DescribeAdvancedQueryTemplate  DescribeAdvancedQueryTemplateRequest
     * @return DescribeAdvancedQueryTemplateResponse
     */
    CompletableFuture<DescribeAdvancedQueryTemplateResponse> describeAdvancedQueryTemplate(DescribeAdvancedQueryTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeResourceLifeCycleEvents  DescribeResourceLifeCycleEventsRequest
     * @return DescribeResourceLifeCycleEventsResponse
     */
    CompletableFuture<DescribeResourceLifeCycleEventsResponse> describeResourceLifeCycleEvents(DescribeResourceLifeCycleEventsRequest request);

    /**
     * @param request the request parameters of DescribeScenes  DescribeScenesRequest
     * @return DescribeScenesResponse
     */
    CompletableFuture<DescribeScenesResponse> describeScenes(DescribeScenesRequest request);

    /**
     * @param request the request parameters of DescribeSearchTemplates  DescribeSearchTemplatesRequest
     * @return DescribeSearchTemplatesResponse
     */
    CompletableFuture<DescribeSearchTemplatesResponse> describeSearchTemplates(DescribeSearchTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic shows you how to query the information about the single-account trails within an Alibaba Cloud account. In this example, the information about a trail named <code>test-4</code> is returned.</p>
     * 
     * @param request the request parameters of DescribeTrails  DescribeTrailsRequest
     * @return DescribeTrailsResponse
     */
    CompletableFuture<DescribeTrailsResponse> describeTrails(DescribeTrailsRequest request);

    /**
     * @param request the request parameters of DescribeUserAlertCount  DescribeUserAlertCountRequest
     * @return DescribeUserAlertCountResponse
     */
    CompletableFuture<DescribeUserAlertCountResponse> describeUserAlertCount(DescribeUserAlertCountRequest request);

    /**
     * @param request the request parameters of DescribeUserLogCount  DescribeUserLogCountRequest
     * @return DescribeUserLogCountResponse
     */
    CompletableFuture<DescribeUserLogCountResponse> describeUserLogCount(DescribeUserLogCountRequest request);

    /**
     * @param request the request parameters of EnableInsight  EnableInsightRequest
     * @return EnableInsightResponse
     */
    CompletableFuture<EnableInsightResponse> enableInsight(EnableInsightRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the most recent events that are generated within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. For more information about supported events, see <a href="https://help.aliyun.com/document_detail/419214.html">Alibaba Cloud services and events that are supported by the AccessKey pair audit feature</a>. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * @param request the request parameters of GetAccessKeyLastUsedEvents  GetAccessKeyLastUsedEventsRequest
     * @return GetAccessKeyLastUsedEventsResponse
     */
    CompletableFuture<GetAccessKeyLastUsedEventsResponse> getAccessKeyLastUsedEvents(GetAccessKeyLastUsedEventsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the most recent call of a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * @param request the request parameters of GetAccessKeyLastUsedInfo  GetAccessKeyLastUsedInfoRequest
     * @return GetAccessKeyLastUsedInfoResponse
     */
    CompletableFuture<GetAccessKeyLastUsedInfoResponse> getAccessKeyLastUsedInfo(GetAccessKeyLastUsedInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the IP addresses that are most recently used within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * @param request the request parameters of GetAccessKeyLastUsedIps  GetAccessKeyLastUsedIpsRequest
     * @return GetAccessKeyLastUsedIpsResponse
     */
    CompletableFuture<GetAccessKeyLastUsedIpsResponse> getAccessKeyLastUsedIps(GetAccessKeyLastUsedIpsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about Alibaba Cloud services that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * @param request the request parameters of GetAccessKeyLastUsedProducts  GetAccessKeyLastUsedProductsRequest
     * @return GetAccessKeyLastUsedProductsResponse
     */
    CompletableFuture<GetAccessKeyLastUsedProductsResponse> getAccessKeyLastUsedProducts(GetAccessKeyLastUsedProductsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the information about resources that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * @param request the request parameters of GetAccessKeyLastUsedResources  GetAccessKeyLastUsedResourcesRequest
     * @return GetAccessKeyLastUsedResourcesResponse
     */
    CompletableFuture<GetAccessKeyLastUsedResourcesResponse> getAccessKeyLastUsedResources(GetAccessKeyLastUsedResourcesRequest request);

    /**
     * @param request the request parameters of GetAdvancedQueryTemplate  GetAdvancedQueryTemplateRequest
     * @return GetAdvancedQueryTemplateResponse
     */
    CompletableFuture<GetAdvancedQueryTemplateResponse> getAdvancedQueryTemplate(GetAdvancedQueryTemplateRequest request);

    /**
     * @param request the request parameters of GetDataEventSelector  GetDataEventSelectorRequest
     * @return GetDataEventSelectorResponse
     */
    CompletableFuture<GetDataEventSelectorResponse> getDataEventSelector(GetDataEventSelectorRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a data backfill task whose ID is <code>16602</code>. The return result shows that historical events for a trail named <code>trail-name</code> are delivered to Simple Log Service and the task is complete.</p>
     * 
     * @param request the request parameters of GetDeliveryHistoryJob  GetDeliveryHistoryJobRequest
     * @return GetDeliveryHistoryJobResponse
     */
    CompletableFuture<GetDeliveryHistoryJobResponse> getDeliveryHistoryJob(GetDeliveryHistoryJobRequest request);

    /**
     * <b>description</b> :
     * <p>By default, global events are stored in the Singapore region.
     * To obtain the permissions to call the API operation, you must submit a ticket.</p>
     * 
     * @param request the request parameters of GetGlobalEventsStorageRegion  GetGlobalEventsStorageRegionRequest
     * @return GetGlobalEventsStorageRegionResponse
     */
    CompletableFuture<GetGlobalEventsStorageRegionResponse> getGlobalEventsStorageRegion(GetGlobalEventsStorageRegionRequest request);

    /**
     * @param request the request parameters of GetGovernanceMetrics  GetGovernanceMetricsRequest
     * @return GetGovernanceMetricsResponse
     */
    CompletableFuture<GetGovernanceMetricsResponse> getGovernanceMetrics(GetGovernanceMetricsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes how to query the status of a sample single-account trail named <code>trail-test</code>.</p>
     * 
     * @param request the request parameters of GetTrailStatus  GetTrailStatusRequest
     * @return GetTrailStatusResponse
     */
    CompletableFuture<GetTrailStatusResponse> getTrailStatus(GetTrailStatusRequest request);

    /**
     * @param request the request parameters of ListDataEventSelectors  ListDataEventSelectorsRequest
     * @return ListDataEventSelectorsResponse
     */
    CompletableFuture<ListDataEventSelectorsResponse> listDataEventSelectors(ListDataEventSelectorsRequest request);

    /**
     * @param request the request parameters of ListDataEventServices  ListDataEventServicesRequest
     * @return ListDataEventServicesResponse
     */
    CompletableFuture<ListDataEventServicesResponse> listDataEventServices(ListDataEventServicesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query a list of data backfill tasks. The returned result shows that a data backfill task with the ID <code>16602</code> is used to deliver historical events for a trail named <code>trail-name</code> to Simple Log Service.</p>
     * 
     * @param request the request parameters of ListDeliveryHistoryJobs  ListDeliveryHistoryJobsRequest
     * @return ListDeliveryHistoryJobsResponse
     */
    CompletableFuture<ListDeliveryHistoryJobsResponse> listDeliveryHistoryJobs(ListDeliveryHistoryJobsRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to query event details, you can query the event details at most twice per second.</p>
     * <blockquote>
     * <p>Do not frequently call this operation. You can create a trail to deliver events to Log Service. Then, you can query event details in near real time by using the real-time log consumption feature of Log Service. For more information, see <a href="https://help.aliyun.com/document_detail/28810.html">Create a single-account trail</a>, <a href="https://help.aliyun.com/document_detail/160661.html">Create a multi-account trail</a>, and <a href="https://help.aliyun.com/document_detail/28997.html">Overview</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of LookupEvents  LookupEventsRequest
     * @return LookupEventsResponse
     */
    CompletableFuture<LookupEventsResponse> lookupEvents(LookupEventsRequest request);

    /**
     * @param request the request parameters of PutDataEventSelector  PutDataEventSelectorRequest
     * @return PutDataEventSelectorResponse
     */
    CompletableFuture<PutDataEventSelectorResponse> putDataEventSelector(PutDataEventSelectorRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes how to enable logging for a sample trail named <code>trail-test</code>.</p>
     * 
     * @param request the request parameters of StartLogging  StartLoggingRequest
     * @return StartLoggingResponse
     */
    CompletableFuture<StartLoggingResponse> startLogging(StartLoggingRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes how to disable logging for a sample trail named <code>trail-test</code>.</p>
     * 
     * @param request the request parameters of StopLogging  StopLoggingRequest
     * @return StopLoggingResponse
     */
    CompletableFuture<StopLoggingResponse> stopLogging(StopLoggingRequest request);

    /**
     * @param request the request parameters of UpdateAdvancedQueryTemplate  UpdateAdvancedQueryTemplateRequest
     * @return UpdateAdvancedQueryTemplateResponse
     */
    CompletableFuture<UpdateAdvancedQueryTemplateResponse> updateAdvancedQueryTemplate(UpdateAdvancedQueryTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>By default, global events are stored in the Singapore region.</p>
     * <ul>
     * <li>To obtain the permissions to call the API operation, you must submit a ticket.</li>
     * <li>Only the China (Hangzhou) region (cn-hangzhou) and the Singapore region (ap-southeast-1) are supported.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateGlobalEventsStorageRegion  UpdateGlobalEventsStorageRegionRequest
     * @return UpdateGlobalEventsStorageRegionResponse
     */
    CompletableFuture<UpdateGlobalEventsStorageRegionResponse> updateGlobalEventsStorageRegion(UpdateGlobalEventsStorageRegionRequest request);

    /**
     * <b>description</b> :
     * <p>This topic shows you how to change the destination Object Storage Service (OSS) bucket of a sample trail named <code>trail-test</code> to <code>audit-log</code>.</p>
     * 
     * @param request the request parameters of UpdateTrail  UpdateTrailRequest
     * @return UpdateTrailResponse
     */
    CompletableFuture<UpdateTrailResponse> updateTrail(UpdateTrailRequest request);

}
