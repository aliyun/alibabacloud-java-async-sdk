// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.quotas20200510.models.*;
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
     * <b>description</b> :
     * <p>The quota alerting feature has been upgraded and this API operation will be deprecated. Use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513316.html">PutResourceMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513302.html">PutMetricRuleTargets</a> to create alert rules for the new version of quota alerting.
     * For more information about how to use API operations to manage the new version of quota alerting, see <a href="https://help.aliyun.com/document_detail/2863234.html">Manage new quota alerts by using API operations</a>.</p>
     * 
     * @param request the request parameters of CreateQuotaAlarm  CreateQuotaAlarmRequest
     * @return CreateQuotaAlarmResponse
     */
    CompletableFuture<CreateQuotaAlarmResponse> createQuotaAlarm(CreateQuotaAlarmRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you create a quota increase request, you can call the <a href="https://help.aliyun.com/document_detail/440568.html">ListQuotaApplications</a> operation to view the approval result. If the value of <code>Status</code> is <code>Agree</code>, the request is approved.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateQuotaApplication  CreateQuotaApplicationRequest
     * @return CreateQuotaApplicationResponse
     */
    CompletableFuture<CreateQuotaApplicationResponse> createQuotaApplication(CreateQuotaApplicationRequest request);

    /**
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>A single application can include a maximum of 10 quota items.</p>
     * 
     * @param request the request parameters of CreateQuotaApplicationsForTemplate  CreateQuotaApplicationsForTemplateRequest
     * @return CreateQuotaApplicationsForTemplateResponse
     */
    CompletableFuture<CreateQuotaApplicationsForTemplateResponse> createQuotaApplicationsForTemplate(CreateQuotaApplicationsForTemplateRequest request);

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
    CompletableFuture<CreateTemplateQuotaItemResponse> createTemplateQuotaItem(CreateTemplateQuotaItemRequest request);

    /**
     * <b>description</b> :
     * <p>The quota alerting feature has been upgraded, and this API operation will be deprecated soon. This API operation can only delete legacy quota usage alerts. To delete new-version quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513295.html">DeleteMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513294.html">DeleteMetricRuleTargets</a>.
     * For more information about managing new-version quota alerts by using API operations, see <a href="https://help.aliyun.com/document_detail/2863234.html">Manage new-version quota alerts by using API operations</a>.</p>
     * 
     * @param request the request parameters of DeleteQuotaAlarm  DeleteQuotaAlarmRequest
     * @return DeleteQuotaAlarmResponse
     */
    CompletableFuture<DeleteQuotaAlarmResponse> deleteQuotaAlarm(DeleteQuotaAlarmRequest request);

    /**
     * @param request the request parameters of DeleteTemplateQuotaItem  DeleteTemplateQuotaItemRequest
     * @return DeleteTemplateQuotaItemResponse
     */
    CompletableFuture<DeleteTemplateQuotaItemResponse> deleteTemplateQuotaItem(DeleteTemplateQuotaItemRequest request);

    /**
     * @param request the request parameters of GetProductQuota  GetProductQuotaRequest
     * @return GetProductQuotaResponse
     */
    CompletableFuture<GetProductQuotaResponse> getProductQuota(GetProductQuotaRequest request);

    /**
     * @param request the request parameters of GetProductQuotaDimension  GetProductQuotaDimensionRequest
     * @return GetProductQuotaDimensionResponse
     */
    CompletableFuture<GetProductQuotaDimensionResponse> getProductQuotaDimension(GetProductQuotaDimensionRequest request);

    /**
     * <b>description</b> :
     * <p>The quota alert feature has been upgraded. This API operation will be deprecated soon. This API operation can only query the details of legacy quota usage alerts. To query the details of new-version quota usage alerts, use the CloudMonitor API operation <a href="https://help.aliyun.com/document_detail/2513291.html">DescribeMetricRuleList</a>. For more information about how to use API operations to manage new-version quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new-version quota alerts</a>.</p>
     * 
     * @param request the request parameters of GetQuotaAlarm  GetQuotaAlarmRequest
     * @return GetQuotaAlarmResponse
     */
    CompletableFuture<GetQuotaAlarmResponse> getQuotaAlarm(GetQuotaAlarmRequest request);

    /**
     * @param request the request parameters of GetQuotaApplication  GetQuotaApplicationRequest
     * @return GetQuotaApplicationResponse
     */
    CompletableFuture<GetQuotaApplicationResponse> getQuotaApplication(GetQuotaApplicationRequest request);

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <p>Make sure that you have created a quota increase application. For more information, see <a href="https://help.aliyun.com/document_detail/440566.html">CreateQuotaApplication</a>.</p>
     * 
     * @param request the request parameters of GetQuotaApplicationApproval  GetQuotaApplicationApprovalRequest
     * @return GetQuotaApplicationApprovalResponse
     */
    CompletableFuture<GetQuotaApplicationApprovalResponse> getQuotaApplicationApproval(GetQuotaApplicationApprovalRequest request);

    /**
     * <b>description</b> :
     * <p>The default status of a quota template is unset (that is, <code>ServiceStatus</code> is <code>0</code>). You can use the features of the quota template only when its status is enabled (that is, <code>ServiceStatus</code> is <code>1</code>).</p>
     * 
     * @param request the request parameters of GetQuotaTemplateServiceStatus  GetQuotaTemplateServiceStatusRequest
     * @return GetQuotaTemplateServiceStatusResponse
     */
    CompletableFuture<GetQuotaTemplateServiceStatusResponse> getQuotaTemplateServiceStatus(GetQuotaTemplateServiceStatusRequest request);

    /**
     * @param request the request parameters of GetQuotaUtilizationOverview  GetQuotaUtilizationOverviewRequest
     * @return GetQuotaUtilizationOverviewResponse
     */
    CompletableFuture<GetQuotaUtilizationOverviewResponse> getQuotaUtilizationOverview(GetQuotaUtilizationOverviewRequest request);

    /**
     * <b>description</b> :
     * <p>The quota alert feature has been upgraded and this API operation will be deprecated. This API operation can only query the history of legacy quota usage alerts. To query the history of new quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513275.html">DescribeAlertLogCount</a> and <a href="https://help.aliyun.com/document_detail/2513276.html">DescribeAlertLogList</a>. For more information about how to use API operations to manage new quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new quota alerts</a>.</p>
     * 
     * @param request the request parameters of ListAlarmHistories  ListAlarmHistoriesRequest
     * @return ListAlarmHistoriesResponse
     */
    CompletableFuture<ListAlarmHistoriesResponse> listAlarmHistories(ListAlarmHistoriesRequest request);

    /**
     * @param request the request parameters of ListDependentQuotas  ListDependentQuotasRequest
     * @return ListDependentQuotasResponse
     */
    CompletableFuture<ListDependentQuotasResponse> listDependentQuotas(ListDependentQuotasRequest request);

    /**
     * @param request the request parameters of ListProductDimensionGroups  ListProductDimensionGroupsRequest
     * @return ListProductDimensionGroupsResponse
     */
    CompletableFuture<ListProductDimensionGroupsResponse> listProductDimensionGroups(ListProductDimensionGroupsRequest request);

    /**
     * @param request the request parameters of ListProductQuotaDimensions  ListProductQuotaDimensionsRequest
     * @return ListProductQuotaDimensionsResponse
     */
    CompletableFuture<ListProductQuotaDimensionsResponse> listProductQuotaDimensions(ListProductQuotaDimensionsRequest request);

    /**
     * @param request the request parameters of ListProductQuotas  ListProductQuotasRequest
     * @return ListProductQuotasResponse
     */
    CompletableFuture<ListProductQuotasResponse> listProductQuotas(ListProductQuotasRequest request);

    /**
     * <b>description</b> :
     * <p>The query results are the same as those in <a href="https://help.aliyun.com/document_detail/182368.html">Alibaba Cloud services supported by Quota Center</a>.</p>
     * 
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
     * <b>description</b> :
     * <p>The quota alert feature has been upgraded. This API operation is scheduled for deprecation and queries only earlier-version quota usage alerts. To query new-version quota usage alerts, call the CloudMonitor API operation <a href="https://help.aliyun.com/document_detail/2513291.html">DescribeMetricRuleList</a>. For more information about how to manage new-version quota alerts using API operations, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new-version quota alerts</a>.</p>
     * 
     * @param request the request parameters of ListQuotaAlarms  ListQuotaAlarmsRequest
     * @return ListQuotaAlarmsResponse
     */
    CompletableFuture<ListQuotaAlarmsResponse> listQuotaAlarms(ListQuotaAlarmsRequest request);

    /**
     * @param request the request parameters of ListQuotaApplicationTemplates  ListQuotaApplicationTemplatesRequest
     * @return ListQuotaApplicationTemplatesResponse
     */
    CompletableFuture<ListQuotaApplicationTemplatesResponse> listQuotaApplicationTemplates(ListQuotaApplicationTemplatesRequest request);

    /**
     * @param request the request parameters of ListQuotaApplications  ListQuotaApplicationsRequest
     * @return ListQuotaApplicationsResponse
     */
    CompletableFuture<ListQuotaApplicationsResponse> listQuotaApplications(ListQuotaApplicationsRequest request);

    /**
     * @param request the request parameters of ListQuotaApplicationsDetailForTemplate  ListQuotaApplicationsDetailForTemplateRequest
     * @return ListQuotaApplicationsDetailForTemplateResponse
     */
    CompletableFuture<ListQuotaApplicationsDetailForTemplateResponse> listQuotaApplicationsDetailForTemplate(ListQuotaApplicationsDetailForTemplateRequest request);

    /**
     * @param request the request parameters of ListQuotaApplicationsForTemplate  ListQuotaApplicationsForTemplateRequest
     * @return ListQuotaApplicationsForTemplateResponse
     */
    CompletableFuture<ListQuotaApplicationsForTemplateResponse> listQuotaApplicationsForTemplate(ListQuotaApplicationsForTemplateRequest request);

    /**
     * @param request the request parameters of ListQuotaUtilizationReport  ListQuotaUtilizationReportRequest
     * @return ListQuotaUtilizationReportResponse
     */
    CompletableFuture<ListQuotaUtilizationReportResponse> listQuotaUtilizationReport(ListQuotaUtilizationReportRequest request);

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
    CompletableFuture<ModifyQuotaTemplateServiceStatusResponse> modifyQuotaTemplateServiceStatus(ModifyQuotaTemplateServiceStatusRequest request);

    /**
     * @param request the request parameters of ModifyTemplateQuotaItem  ModifyTemplateQuotaItemRequest
     * @return ModifyTemplateQuotaItemResponse
     */
    CompletableFuture<ModifyTemplateQuotaItemResponse> modifyTemplateQuotaItem(ModifyTemplateQuotaItemRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to quota applications that support reminders. In the GetQuotaApplicationApproval response, the <code>SupportReminder</code> parameter for these applications is <code>true</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemindQuotaApplicationApproval  RemindQuotaApplicationApprovalRequest
     * @return RemindQuotaApplicationApprovalResponse
     */
    CompletableFuture<RemindQuotaApplicationApprovalResponse> remindQuotaApplicationApproval(RemindQuotaApplicationApprovalRequest request);

    /**
     * @param request the request parameters of StartQuotaUtilizationReport  StartQuotaUtilizationReportRequest
     * @return StartQuotaUtilizationReportResponse
     */
    CompletableFuture<StartQuotaUtilizationReportResponse> startQuotaUtilizationReport(StartQuotaUtilizationReportRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is deprecated because the quota alert feature has been upgraded. To modify information about new quota usage alerts, use the CloudMonitor API operations <a href="https://help.aliyun.com/document_detail/2513316.html">PutResourceMetricRules</a> and <a href="https://help.aliyun.com/document_detail/2513302.html">PutMetricRuleTargets</a>. For more information about using API operations to manage new quota alerts, see <a href="https://help.aliyun.com/document_detail/2863234.html">Use API operations to manage new quota alerts</a>.</p>
     * 
     * @param request the request parameters of UpdateQuotaAlarm  UpdateQuotaAlarmRequest
     * @return UpdateQuotaAlarmResponse
     */
    CompletableFuture<UpdateQuotaAlarmResponse> updateQuotaAlarm(UpdateQuotaAlarmRequest request);

}
