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
     * @param request the request parameters of CreateAdvancedQueryHistory  CreateAdvancedQueryHistoryRequest
     * @return CreateAdvancedQueryHistoryResponse
     */
    @Override
    public CompletableFuture<CreateAdvancedQueryHistoryResponse> createAdvancedQueryHistory(CreateAdvancedQueryHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAdvancedQueryHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAdvancedQueryHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAdvancedQueryHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAdvancedQueryTemplate  CreateAdvancedQueryTemplateRequest
     * @return CreateAdvancedQueryTemplateResponse
     */
    @Override
    public CompletableFuture<CreateAdvancedQueryTemplateResponse> createAdvancedQueryTemplate(CreateAdvancedQueryTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAdvancedQueryTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAdvancedQueryTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAdvancedQueryTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of DeleteAdvancedQueryHistory  DeleteAdvancedQueryHistoryRequest
     * @return DeleteAdvancedQueryHistoryResponse
     */
    @Override
    public CompletableFuture<DeleteAdvancedQueryHistoryResponse> deleteAdvancedQueryHistory(DeleteAdvancedQueryHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAdvancedQueryHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAdvancedQueryHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAdvancedQueryHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAdvancedQueryTemplate  DeleteAdvancedQueryTemplateRequest
     * @return DeleteAdvancedQueryTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteAdvancedQueryTemplateResponse> deleteAdvancedQueryTemplate(DeleteAdvancedQueryTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAdvancedQueryTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAdvancedQueryTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAdvancedQueryTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to delete a data backfill task whose ID is <code>16602</code>.</p>
     * 
     * @param request the request parameters of DeleteDeliveryHistoryJob  DeleteDeliveryHistoryJobRequest
     * @return DeleteDeliveryHistoryJobResponse
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
     * <b>description</b> :
     * <p>This topic describes how to delete a sample trail named <code>trail-test</code>.</p>
     * 
     * @param request the request parameters of DeleteTrail  DeleteTrailRequest
     * @return DeleteTrailResponse
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
     * @param request the request parameters of DescribeAdvancedQueryHistory  DescribeAdvancedQueryHistoryRequest
     * @return DescribeAdvancedQueryHistoryResponse
     */
    @Override
    public CompletableFuture<DescribeAdvancedQueryHistoryResponse> describeAdvancedQueryHistory(DescribeAdvancedQueryHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAdvancedQueryHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAdvancedQueryHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAdvancedQueryHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAdvancedQueryTemplate  DescribeAdvancedQueryTemplateRequest
     * @return DescribeAdvancedQueryTemplateResponse
     */
    @Override
    public CompletableFuture<DescribeAdvancedQueryTemplateResponse> describeAdvancedQueryTemplate(DescribeAdvancedQueryTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAdvancedQueryTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAdvancedQueryTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAdvancedQueryTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
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
     * @param request the request parameters of DescribeResourceLifeCycleEvents  DescribeResourceLifeCycleEventsRequest
     * @return DescribeResourceLifeCycleEventsResponse
     */
    @Override
    public CompletableFuture<DescribeResourceLifeCycleEventsResponse> describeResourceLifeCycleEvents(DescribeResourceLifeCycleEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourceLifeCycleEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourceLifeCycleEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourceLifeCycleEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScenes  DescribeScenesRequest
     * @return DescribeScenesResponse
     */
    @Override
    public CompletableFuture<DescribeScenesResponse> describeScenes(DescribeScenesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScenes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScenesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScenesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSearchTemplates  DescribeSearchTemplatesRequest
     * @return DescribeSearchTemplatesResponse
     */
    @Override
    public CompletableFuture<DescribeSearchTemplatesResponse> describeSearchTemplates(DescribeSearchTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSearchTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSearchTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSearchTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic shows you how to query the information about the single-account trails within an Alibaba Cloud account. In this example, the information about a trail named <code>test-4</code> is returned.</p>
     * 
     * @param request the request parameters of DescribeTrails  DescribeTrailsRequest
     * @return DescribeTrailsResponse
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

    /**
     * @param request the request parameters of DescribeUserAlertCount  DescribeUserAlertCountRequest
     * @return DescribeUserAlertCountResponse
     */
    @Override
    public CompletableFuture<DescribeUserAlertCountResponse> describeUserAlertCount(DescribeUserAlertCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserAlertCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserAlertCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserAlertCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserLogCount  DescribeUserLogCountRequest
     * @return DescribeUserLogCountResponse
     */
    @Override
    public CompletableFuture<DescribeUserLogCountResponse> describeUserLogCount(DescribeUserLogCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserLogCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserLogCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserLogCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableInsight  EnableInsightRequest
     * @return EnableInsightResponse
     */
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
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the most recent events that are generated within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. For more information about supported events, see <a href="https://help.aliyun.com/document_detail/419214.html">Alibaba Cloud services and events that are supported by the AccessKey pair audit feature</a>. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * @param request the request parameters of GetAccessKeyLastUsedEvents  GetAccessKeyLastUsedEventsRequest
     * @return GetAccessKeyLastUsedEventsResponse
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
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the most recent call of a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * @param request the request parameters of GetAccessKeyLastUsedInfo  GetAccessKeyLastUsedInfoRequest
     * @return GetAccessKeyLastUsedInfoResponse
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
     * <b>description</b> :
     * <p>You can call this operation to query only the information about the IP addresses that are most recently used within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * @param request the request parameters of GetAccessKeyLastUsedIps  GetAccessKeyLastUsedIpsRequest
     * @return GetAccessKeyLastUsedIpsResponse
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
     * <b>description</b> :
     * <p>You can call this operation to query only the information about Alibaba Cloud services that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * @param request the request parameters of GetAccessKeyLastUsedProducts  GetAccessKeyLastUsedProductsRequest
     * @return GetAccessKeyLastUsedProductsResponse
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
     * <b>description</b> :
     * <p>You can call this operation to query only the information about resources that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.</p>
     * 
     * @param request the request parameters of GetAccessKeyLastUsedResources  GetAccessKeyLastUsedResourcesRequest
     * @return GetAccessKeyLastUsedResourcesResponse
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
     * @param request the request parameters of GetAdvancedQueryTemplate  GetAdvancedQueryTemplateRequest
     * @return GetAdvancedQueryTemplateResponse
     */
    @Override
    public CompletableFuture<GetAdvancedQueryTemplateResponse> getAdvancedQueryTemplate(GetAdvancedQueryTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAdvancedQueryTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAdvancedQueryTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAdvancedQueryTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a data backfill task whose ID is <code>16602</code>. The return result shows that historical events for a trail named <code>trail-name</code> are delivered to Simple Log Service and the task is complete.</p>
     * 
     * @param request the request parameters of GetDeliveryHistoryJob  GetDeliveryHistoryJobRequest
     * @return GetDeliveryHistoryJobResponse
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
     * <b>description</b> :
     * <p>By default, global events are stored in the Singapore region.
     * To obtain the permissions to call the API operation, you must submit a ticket.</p>
     * 
     * @param request the request parameters of GetGlobalEventsStorageRegion  GetGlobalEventsStorageRegionRequest
     * @return GetGlobalEventsStorageRegionResponse
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
     * @param request the request parameters of GetGovernanceMetrics  GetGovernanceMetricsRequest
     * @return GetGovernanceMetricsResponse
     */
    @Override
    public CompletableFuture<GetGovernanceMetricsResponse> getGovernanceMetrics(GetGovernanceMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetGovernanceMetrics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGovernanceMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGovernanceMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to query the status of a sample single-account trail named <code>trail-test</code>.</p>
     * 
     * @param request the request parameters of GetTrailStatus  GetTrailStatusRequest
     * @return GetTrailStatusResponse
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
     * @param request the request parameters of ListDataEventServices  ListDataEventServicesRequest
     * @return ListDataEventServicesResponse
     */
    @Override
    public CompletableFuture<ListDataEventServicesResponse> listDataEventServices(ListDataEventServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataEventServices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataEventServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataEventServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query a list of data backfill tasks. The returned result shows that a data backfill task with the ID <code>16602</code> is used to deliver historical events for a trail named <code>trail-name</code> to Simple Log Service.</p>
     * 
     * @param request the request parameters of ListDeliveryHistoryJobs  ListDeliveryHistoryJobsRequest
     * @return ListDeliveryHistoryJobsResponse
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
     * <b>description</b> :
     * <p>When you call this operation to query event details, you can query the event details at most twice per second.</p>
     * <blockquote>
     * <p>Do not frequently call this operation. You can create a trail to deliver events to Log Service. Then, you can query event details in near real time by using the real-time log consumption feature of Log Service. For more information, see <a href="https://help.aliyun.com/document_detail/28810.html">Create a single-account trail</a>, <a href="https://help.aliyun.com/document_detail/160661.html">Create a multi-account trail</a>, and <a href="https://help.aliyun.com/document_detail/28997.html">Overview</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of LookupEvents  LookupEventsRequest
     * @return LookupEventsResponse
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
     * <b>description</b> :
     * <p>This topic describes how to enable logging for a sample trail named <code>trail-test</code>.</p>
     * 
     * @param request the request parameters of StartLogging  StartLoggingRequest
     * @return StartLoggingResponse
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
     * <b>description</b> :
     * <p>This topic describes how to disable logging for a sample trail named <code>trail-test</code>.</p>
     * 
     * @param request the request parameters of StopLogging  StopLoggingRequest
     * @return StopLoggingResponse
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
     * @param request the request parameters of UpdateAdvancedQueryTemplate  UpdateAdvancedQueryTemplateRequest
     * @return UpdateAdvancedQueryTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateAdvancedQueryTemplateResponse> updateAdvancedQueryTemplate(UpdateAdvancedQueryTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAdvancedQueryTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAdvancedQueryTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAdvancedQueryTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <b>description</b> :
     * <p>This topic shows you how to change the destination Object Storage Service (OSS) bucket of a sample trail named <code>trail-test</code> to <code>audit-log</code>.</p>
     * 
     * @param request the request parameters of UpdateTrail  UpdateTrailRequest
     * @return UpdateTrailResponse
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
