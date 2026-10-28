// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.quotas20200510.models.*;
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
        this.product = "quotas";
        this.version = "2020-05-10";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>The quota alerting feature has been upgraded and this API operation will be deprecated. Use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513316.html">PutResourceMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513302.html">PutMetricRuleTargets</a> to create alert rules for the new version of quota alerting.
     * For more information about how to use API operations to manage the new version of quota alerting, see <a href="https://help.aliyun.com/document_detail/2863234.html">Manage new quota alerts by using API operations</a>.</p>
     * 
     * @param request the request parameters of CreateQuotaAlarm  CreateQuotaAlarmRequest
     * @return CreateQuotaAlarmResponse
     */
    @Override
    public CompletableFuture<CreateQuotaAlarmResponse> createQuotaAlarm(CreateQuotaAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQuotaAlarm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQuotaAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQuotaAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you create a quota increase request, you can call the <a href="https://help.aliyun.com/document_detail/440568.html">ListQuotaApplications</a> operation to view the approval result. If the value of <code>Status</code> is <code>Agree</code>, the request is approved.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateQuotaApplication  CreateQuotaApplicationRequest
     * @return CreateQuotaApplicationResponse
     */
    @Override
    public CompletableFuture<CreateQuotaApplicationResponse> createQuotaApplication(CreateQuotaApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQuotaApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQuotaApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQuotaApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>A single application can include a maximum of 10 quota items.</p>
     * 
     * @param request the request parameters of CreateQuotaApplicationsForTemplate  CreateQuotaApplicationsForTemplateRequest
     * @return CreateQuotaApplicationsForTemplateResponse
     */
    @Override
    public CompletableFuture<CreateQuotaApplicationsForTemplateResponse> createQuotaApplicationsForTemplate(CreateQuotaApplicationsForTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQuotaApplicationsForTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQuotaApplicationsForTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQuotaApplicationsForTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <p>Make sure that the status of the quota template is enabled (that is, <code>ServiceStatus</code> is <code>1</code>).
     * Call the <a href="https://help.aliyun.com/document_detail/450407.html">GetQuotaTemplateServiceStatus</a> operation to query the status of the quota template. If the <code>ServiceStatus</code> of the quota template is <code>0</code> (not configured) or <code>-1</code> (disabled), call the <a href="https://help.aliyun.com/document_detail/450406.html">ModifyQuotaTemplateServiceStatus</a> operation to change the status to <code>1</code> (enabled).</p>
     * <h3>Usage notes</h3>
     * <p>After you create a quota template, you can call the <a href="https://help.aliyun.com/document_detail/2584864.html">ListQuotaApplicationsForTemplate</a> operation to view the approval result. If <code>Status</code> is displayed as <code>Agree</code>, the application is approved.</p>
     * 
     * @param request the request parameters of CreateTemplateQuotaItem  CreateTemplateQuotaItemRequest
     * @return CreateTemplateQuotaItemResponse
     */
    @Override
    public CompletableFuture<CreateTemplateQuotaItemResponse> createTemplateQuotaItem(CreateTemplateQuotaItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTemplateQuotaItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTemplateQuotaItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTemplateQuotaItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The quota alerting feature has been upgraded, and this API operation will be deprecated soon. This API operation can only delete legacy quota usage alerts. To delete new-version quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513295.html">DeleteMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513294.html">DeleteMetricRuleTargets</a>.
     * For more information about managing new-version quota alerts by using API operations, see <a href="https://help.aliyun.com/document_detail/2863234.html">Manage new-version quota alerts by using API operations</a>.</p>
     * 
     * @param request the request parameters of DeleteQuotaAlarm  DeleteQuotaAlarmRequest
     * @return DeleteQuotaAlarmResponse
     */
    @Override
    public CompletableFuture<DeleteQuotaAlarmResponse> deleteQuotaAlarm(DeleteQuotaAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQuotaAlarm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQuotaAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQuotaAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTemplateQuotaItem  DeleteTemplateQuotaItemRequest
     * @return DeleteTemplateQuotaItemResponse
     */
    @Override
    public CompletableFuture<DeleteTemplateQuotaItemResponse> deleteTemplateQuotaItem(DeleteTemplateQuotaItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTemplateQuotaItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTemplateQuotaItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTemplateQuotaItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProductQuota  GetProductQuotaRequest
     * @return GetProductQuotaResponse
     */
    @Override
    public CompletableFuture<GetProductQuotaResponse> getProductQuota(GetProductQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProductQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProductQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProductQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProductQuotaDimension  GetProductQuotaDimensionRequest
     * @return GetProductQuotaDimensionResponse
     */
    @Override
    public CompletableFuture<GetProductQuotaDimensionResponse> getProductQuotaDimension(GetProductQuotaDimensionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProductQuotaDimension").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProductQuotaDimensionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProductQuotaDimensionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The quota alert feature has been upgraded. This API operation will be deprecated soon. This API operation can only query the details of legacy quota usage alerts. To query the details of new-version quota usage alerts, use the CloudMonitor API operation <a href="https://help.aliyun.com/document_detail/2513291.html">DescribeMetricRuleList</a>. For more information about how to use API operations to manage new-version quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new-version quota alerts</a>.</p>
     * 
     * @param request the request parameters of GetQuotaAlarm  GetQuotaAlarmRequest
     * @return GetQuotaAlarmResponse
     */
    @Override
    public CompletableFuture<GetQuotaAlarmResponse> getQuotaAlarm(GetQuotaAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQuotaAlarm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQuotaAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQuotaAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQuotaApplication  GetQuotaApplicationRequest
     * @return GetQuotaApplicationResponse
     */
    @Override
    public CompletableFuture<GetQuotaApplicationResponse> getQuotaApplication(GetQuotaApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQuotaApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQuotaApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQuotaApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <p>Make sure that you have created a quota increase application. For more information, see <a href="https://help.aliyun.com/document_detail/440566.html">CreateQuotaApplication</a>.</p>
     * 
     * @param request the request parameters of GetQuotaApplicationApproval  GetQuotaApplicationApprovalRequest
     * @return GetQuotaApplicationApprovalResponse
     */
    @Override
    public CompletableFuture<GetQuotaApplicationApprovalResponse> getQuotaApplicationApproval(GetQuotaApplicationApprovalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQuotaApplicationApproval").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQuotaApplicationApprovalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQuotaApplicationApprovalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The default status of a quota template is unset (that is, <code>ServiceStatus</code> is <code>0</code>). You can use the features of the quota template only when its status is enabled (that is, <code>ServiceStatus</code> is <code>1</code>).</p>
     * 
     * @param request the request parameters of GetQuotaTemplateServiceStatus  GetQuotaTemplateServiceStatusRequest
     * @return GetQuotaTemplateServiceStatusResponse
     */
    @Override
    public CompletableFuture<GetQuotaTemplateServiceStatusResponse> getQuotaTemplateServiceStatus(GetQuotaTemplateServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQuotaTemplateServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQuotaTemplateServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQuotaTemplateServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQuotaUtilizationOverview  GetQuotaUtilizationOverviewRequest
     * @return GetQuotaUtilizationOverviewResponse
     */
    @Override
    public CompletableFuture<GetQuotaUtilizationOverviewResponse> getQuotaUtilizationOverview(GetQuotaUtilizationOverviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQuotaUtilizationOverview").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQuotaUtilizationOverviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQuotaUtilizationOverviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The quota alert feature has been upgraded and this API operation will be deprecated. This API operation can only query the history of legacy quota usage alerts. To query the history of new quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513275.html">DescribeAlertLogCount</a> and <a href="https://help.aliyun.com/document_detail/2513276.html">DescribeAlertLogList</a>. For more information about how to use API operations to manage new quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new quota alerts</a>.</p>
     * 
     * @param request the request parameters of ListAlarmHistories  ListAlarmHistoriesRequest
     * @return ListAlarmHistoriesResponse
     */
    @Override
    public CompletableFuture<ListAlarmHistoriesResponse> listAlarmHistories(ListAlarmHistoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAlarmHistories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlarmHistoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlarmHistoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDependentQuotas  ListDependentQuotasRequest
     * @return ListDependentQuotasResponse
     */
    @Override
    public CompletableFuture<ListDependentQuotasResponse> listDependentQuotas(ListDependentQuotasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDependentQuotas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDependentQuotasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDependentQuotasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProductDimensionGroups  ListProductDimensionGroupsRequest
     * @return ListProductDimensionGroupsResponse
     */
    @Override
    public CompletableFuture<ListProductDimensionGroupsResponse> listProductDimensionGroups(ListProductDimensionGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProductDimensionGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductDimensionGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductDimensionGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProductQuotaDimensions  ListProductQuotaDimensionsRequest
     * @return ListProductQuotaDimensionsResponse
     */
    @Override
    public CompletableFuture<ListProductQuotaDimensionsResponse> listProductQuotaDimensions(ListProductQuotaDimensionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProductQuotaDimensions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductQuotaDimensionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductQuotaDimensionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProductQuotas  ListProductQuotasRequest
     * @return ListProductQuotasResponse
     */
    @Override
    public CompletableFuture<ListProductQuotasResponse> listProductQuotas(ListProductQuotasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProductQuotas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductQuotasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductQuotasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The query results are the same as those in <a href="https://help.aliyun.com/document_detail/182368.html">Alibaba Cloud services supported by Quota Center</a>.</p>
     * 
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    @Override
    public CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProducts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The quota alert feature has been upgraded. This API operation is scheduled for deprecation and queries only earlier-version quota usage alerts. To query new-version quota usage alerts, call the CloudMonitor API operation <a href="https://help.aliyun.com/document_detail/2513291.html">DescribeMetricRuleList</a>. For more information about how to manage new-version quota alerts using API operations, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new-version quota alerts</a>.</p>
     * 
     * @param request the request parameters of ListQuotaAlarms  ListQuotaAlarmsRequest
     * @return ListQuotaAlarmsResponse
     */
    @Override
    public CompletableFuture<ListQuotaAlarmsResponse> listQuotaAlarms(ListQuotaAlarmsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQuotaAlarms").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQuotaAlarmsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQuotaAlarmsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQuotaApplicationTemplates  ListQuotaApplicationTemplatesRequest
     * @return ListQuotaApplicationTemplatesResponse
     */
    @Override
    public CompletableFuture<ListQuotaApplicationTemplatesResponse> listQuotaApplicationTemplates(ListQuotaApplicationTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQuotaApplicationTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQuotaApplicationTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQuotaApplicationTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQuotaApplications  ListQuotaApplicationsRequest
     * @return ListQuotaApplicationsResponse
     */
    @Override
    public CompletableFuture<ListQuotaApplicationsResponse> listQuotaApplications(ListQuotaApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQuotaApplications").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQuotaApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQuotaApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQuotaApplicationsDetailForTemplate  ListQuotaApplicationsDetailForTemplateRequest
     * @return ListQuotaApplicationsDetailForTemplateResponse
     */
    @Override
    public CompletableFuture<ListQuotaApplicationsDetailForTemplateResponse> listQuotaApplicationsDetailForTemplate(ListQuotaApplicationsDetailForTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQuotaApplicationsDetailForTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQuotaApplicationsDetailForTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQuotaApplicationsDetailForTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQuotaApplicationsForTemplate  ListQuotaApplicationsForTemplateRequest
     * @return ListQuotaApplicationsForTemplateResponse
     */
    @Override
    public CompletableFuture<ListQuotaApplicationsForTemplateResponse> listQuotaApplicationsForTemplate(ListQuotaApplicationsForTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQuotaApplicationsForTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQuotaApplicationsForTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQuotaApplicationsForTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQuotaUtilizationReport  ListQuotaUtilizationReportRequest
     * @return ListQuotaUtilizationReportResponse
     */
    @Override
    public CompletableFuture<ListQuotaUtilizationReportResponse> listQuotaUtilizationReport(ListQuotaUtilizationReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQuotaUtilizationReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQuotaUtilizationReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQuotaUtilizationReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>A resource directory is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/604185.html">EnableResourceDirectory</a>.</p>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>If the <code>ServiceStatus</code> parameter is set to <code>0</code> or <code>-1</code>, you can call this operation to set the parameter to <code>1</code>. Then, you can call the <a href="https://help.aliyun.com/document_detail/450615.html">CreateTemplateQuotaItem</a> operation to create a quota template.</p>
     * 
     * @param request the request parameters of ModifyQuotaTemplateServiceStatus  ModifyQuotaTemplateServiceStatusRequest
     * @return ModifyQuotaTemplateServiceStatusResponse
     */
    @Override
    public CompletableFuture<ModifyQuotaTemplateServiceStatusResponse> modifyQuotaTemplateServiceStatus(ModifyQuotaTemplateServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyQuotaTemplateServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyQuotaTemplateServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyQuotaTemplateServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTemplateQuotaItem  ModifyTemplateQuotaItemRequest
     * @return ModifyTemplateQuotaItemResponse
     */
    @Override
    public CompletableFuture<ModifyTemplateQuotaItemResponse> modifyTemplateQuotaItem(ModifyTemplateQuotaItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTemplateQuotaItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTemplateQuotaItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTemplateQuotaItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to quota applications that support reminders. In the GetQuotaApplicationApproval response, the <code>SupportReminder</code> parameter for these applications is <code>true</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemindQuotaApplicationApproval  RemindQuotaApplicationApprovalRequest
     * @return RemindQuotaApplicationApprovalResponse
     */
    @Override
    public CompletableFuture<RemindQuotaApplicationApprovalResponse> remindQuotaApplicationApproval(RemindQuotaApplicationApprovalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemindQuotaApplicationApproval").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemindQuotaApplicationApprovalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemindQuotaApplicationApprovalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartQuotaUtilizationReport  StartQuotaUtilizationReportRequest
     * @return StartQuotaUtilizationReportResponse
     */
    @Override
    public CompletableFuture<StartQuotaUtilizationReportResponse> startQuotaUtilizationReport(StartQuotaUtilizationReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartQuotaUtilizationReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartQuotaUtilizationReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartQuotaUtilizationReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is deprecated because the quota alert feature has been upgraded. To modify information about new quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513316.html">PutResourceMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513302.html">PutMetricRuleTargets</a>. For more information about using API operations to manage new quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new quota alerts</a>.</p>
     * 
     * @param request the request parameters of UpdateQuotaAlarm  UpdateQuotaAlarmRequest
     * @return UpdateQuotaAlarmResponse
     */
    @Override
    public CompletableFuture<UpdateQuotaAlarmResponse> updateQuotaAlarm(UpdateQuotaAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateQuotaAlarm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateQuotaAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateQuotaAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
