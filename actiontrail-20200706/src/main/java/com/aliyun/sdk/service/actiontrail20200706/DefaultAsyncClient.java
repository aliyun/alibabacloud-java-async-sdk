// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.actiontrail20200706.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "Actiontrail";
        this.version = "2020-07-06";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "actiontrail.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-edge-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-fujian", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-wuhan", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "actiontrail.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "actiontrail.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "actiontrail.ap-northeast-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * Take note of the following limits:
      * - You must have created and configured a single-account trail to deliver events to Log Service by calling the [CreateTrail](~~212313~~) operation.
      * - Only one historical event delivery task can be running at a time within an Alibaba Cloud account.
      * This topic shows you how to create a historical event delivery task for a sample trail named `trail-name`.
      *
     */
    @Override
    public CompletableFuture<CreateDeliveryHistoryJobResponse> createDeliveryHistoryJob(CreateDeliveryHistoryJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDeliveryHistoryJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeliveryHistoryJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeliveryHistoryJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can create a trail to deliver events to Log Service, Object Storage Service (OSS), or both. Before you call this operation to create a trail, make sure that the following requirements are met:
      * *   Deliver events to Log Service: A project is created in Log Service.
      * **
      * **Description** After you create a trail to deliver events to Log Service, a Logstore whose name is in the `actiontrail_<Trail name>` format is automatically created and optimally configured for subsequent auditing. Indexes and a dashboard are created for the Logstore to facilitate event queries. You cannot manually write data to the Logstore. This ensures data accuracy. You do not need to create a Logstore in advance.
      * *   Deliver events to OSS: A bucket is created in OSS. This topic provides an example on how to call the API operation to create a single-account trail named `trail-test` to deliver events to an OSS bucket named `audit-log`.
      *
     */
    @Override
    public CompletableFuture<CreateTrailResponse> createTrail(CreateTrailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTrail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic describes how to delete a sample historical event delivery task whose ID is `16602`.
      *
     */
    @Override
    public CompletableFuture<DeleteDeliveryHistoryJobResponse> deleteDeliveryHistoryJob(DeleteDeliveryHistoryJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeliveryHistoryJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeliveryHistoryJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeliveryHistoryJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic describes how to delete a sample trail named `trail-test`.
      *
     */
    @Override
    public CompletableFuture<DeleteTrailResponse> deleteTrail(DeleteTrailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTrail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * For more information, see [Regions and zones](~~40654~~).
      *
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic shows you how to query the information about the single-account trails within an Alibaba Cloud account. In this example, the information about a trail named `test-4` is returned.
      *
     */
    @Override
    public CompletableFuture<DescribeTrailsResponse> describeTrails(DescribeTrailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTrails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTrailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTrailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnableInsightResponse> enableInsight(EnableInsightRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableInsight").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableInsightResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableInsightResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query only the information about the most recent events that are generated within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. For more information about supported events, see [Alibaba Cloud services and events that are supported by the AccessKey pair audit feature](~~419214~~). Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
     */
    @Override
    public CompletableFuture<GetAccessKeyLastUsedEventsResponse> getAccessKeyLastUsedEvents(GetAccessKeyLastUsedEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccessKeyLastUsedEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccessKeyLastUsedEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccessKeyLastUsedEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query only the information about the most recent call of a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
     */
    @Override
    public CompletableFuture<GetAccessKeyLastUsedInfoResponse> getAccessKeyLastUsedInfo(GetAccessKeyLastUsedInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccessKeyLastUsedInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccessKeyLastUsedInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccessKeyLastUsedInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query only the information about the IP addresses that are most recently used within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
     */
    @Override
    public CompletableFuture<GetAccessKeyLastUsedIpsResponse> getAccessKeyLastUsedIps(GetAccessKeyLastUsedIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccessKeyLastUsedIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccessKeyLastUsedIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccessKeyLastUsedIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query only the information about Alibaba Cloud services that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
     */
    @Override
    public CompletableFuture<GetAccessKeyLastUsedProductsResponse> getAccessKeyLastUsedProducts(GetAccessKeyLastUsedProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccessKeyLastUsedProducts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccessKeyLastUsedProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccessKeyLastUsedProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query only the information about resources that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
     */
    @Override
    public CompletableFuture<GetAccessKeyLastUsedResourcesResponse> getAccessKeyLastUsedResources(GetAccessKeyLastUsedResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccessKeyLastUsedResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccessKeyLastUsedResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccessKeyLastUsedResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic describes how to query the details of a historical event delivery tasks created within your Alibaba Cloud account. In this example, the details of a historical event delivery task whose ID is `16602` are returned. The sample response shows that this task is used to deliver the historical events recorded by the trail named `trail-name` to Log Service and the task is complete.
      *
     */
    @Override
    public CompletableFuture<GetDeliveryHistoryJobResponse> getDeliveryHistoryJob(GetDeliveryHistoryJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeliveryHistoryJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeliveryHistoryJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeliveryHistoryJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * By default, global events are stored in the Singapore region.
      * To obtain the permissions to call the API operation, you must submit a ticket.
      *
     */
    @Override
    public CompletableFuture<GetGlobalEventsStorageRegionResponse> getGlobalEventsStorageRegion(GetGlobalEventsStorageRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetGlobalEventsStorageRegion").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGlobalEventsStorageRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGlobalEventsStorageRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic describes how to query the status of a sample single-account trail named `trail-test`.
      *
     */
    @Override
    public CompletableFuture<GetTrailStatusResponse> getTrailStatus(GetTrailStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTrailStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrailStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrailStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic describes how to query the historical event delivery tasks created within your Alibaba Cloud account. In this example, a historical event delivery task whose ID is `16602` is returned. This task is used to deliver historical events for the trail named `trail-name` to Log Service.
      *
     */
    @Override
    public CompletableFuture<ListDeliveryHistoryJobsResponse> listDeliveryHistoryJobs(ListDeliveryHistoryJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDeliveryHistoryJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeliveryHistoryJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeliveryHistoryJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation to query event details, you can query the event details at most twice per second.
      * > Do not frequently call this operation. You can create a trail to deliver events to Log Service. Then, you can query event details in near real time by using the real-time log consumption feature of Log Service. For more information, see [Create a single-account trail](~~28810~~), [Create a multi-account trail](~~160661~~), and [Overview](~~28997~~).
      *
     */
    @Override
    public CompletableFuture<LookupEventsResponse> lookupEvents(LookupEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LookupEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LookupEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LookupEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic describes how to enable logging for a sample trail named `trail-test`.
      *
     */
    @Override
    public CompletableFuture<StartLoggingResponse> startLogging(StartLoggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartLogging").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartLoggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartLoggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic describes how to disable logging for a sample trail named `trail-test`.
      *
     */
    @Override
    public CompletableFuture<StopLoggingResponse> stopLogging(StopLoggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopLogging").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopLoggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopLoggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * By default, global events are stored in the Singapore region.
      * *   To obtain the permissions to call the API operation, you must submit a ticket.
      * *   Only the China (Hangzhou) region (cn-hangzhou) and the Singapore region (ap-southeast-1) are supported.
      *
     */
    @Override
    public CompletableFuture<UpdateGlobalEventsStorageRegionResponse> updateGlobalEventsStorageRegion(UpdateGlobalEventsStorageRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateGlobalEventsStorageRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGlobalEventsStorageRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGlobalEventsStorageRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic shows you how to change the destination Object Storage Service (OSS) bucket of a sample trail named `trail-test` to `audit-log`.
      *
     */
    @Override
    public CompletableFuture<UpdateTrailResponse> updateTrail(UpdateTrailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTrail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
