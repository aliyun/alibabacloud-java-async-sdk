// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mssp20161228.models.*;
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
     * @param request the request parameters of ConfirmDjbhReport  ConfirmDjbhReportRequest
     * @return ConfirmDjbhReportResponse
     */
    CompletableFuture<ConfirmDjbhReportResponse> confirmDjbhReport(ConfirmDjbhReportRequest request);

    /**
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of CreateServiceWorkOrder  CreateServiceWorkOrderRequest
     * @return CreateServiceWorkOrderResponse
     */
    CompletableFuture<CreateServiceWorkOrderResponse> createServiceWorkOrder(CreateServiceWorkOrderRequest request);

    /**
     * @param request the request parameters of DeleteDjbhReport  DeleteDjbhReportRequest
     * @return DeleteDjbhReportResponse
     */
    CompletableFuture<DeleteDjbhReportResponse> deleteDjbhReport(DeleteDjbhReportRequest request);

    /**
     * @param request the request parameters of DescribeServiceLinkedRole  DescribeServiceLinkedRoleRequest
     * @return DescribeServiceLinkedRoleResponse
     */
    CompletableFuture<DescribeServiceLinkedRoleResponse> describeServiceLinkedRole(DescribeServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of DisposeServiceWorkOrder  DisposeServiceWorkOrderRequest
     * @return DisposeServiceWorkOrderResponse
     */
    CompletableFuture<DisposeServiceWorkOrderResponse> disposeServiceWorkOrder(DisposeServiceWorkOrderRequest request);

    /**
     * @param request the request parameters of DisposeWorkTask  DisposeWorkTaskRequest
     * @return DisposeWorkTaskResponse
     */
    CompletableFuture<DisposeWorkTaskResponse> disposeWorkTask(DisposeWorkTaskRequest request);

    /**
     * @param request the request parameters of GetAlarmDetailById  GetAlarmDetailByIdRequest
     * @return GetAlarmDetailByIdResponse
     */
    CompletableFuture<GetAlarmDetailByIdResponse> getAlarmDetailById(GetAlarmDetailByIdRequest request);

    /**
     * @param request the request parameters of GetAttackedAssetDeal  GetAttackedAssetDealRequest
     * @return GetAttackedAssetDealResponse
     */
    CompletableFuture<GetAttackedAssetDealResponse> getAttackedAssetDeal(GetAttackedAssetDealRequest request);

    /**
     * @param request the request parameters of GetBaselineSummary  GetBaselineSummaryRequest
     * @return GetBaselineSummaryResponse
     */
    CompletableFuture<GetBaselineSummaryResponse> getBaselineSummary(GetBaselineSummaryRequest request);

    /**
     * @param request the request parameters of GetConsoleScore  GetConsoleScoreRequest
     * @return GetConsoleScoreResponse
     */
    CompletableFuture<GetConsoleScoreResponse> getConsoleScore(GetConsoleScoreRequest request);

    /**
     * @param request the request parameters of GetDetailById  GetDetailByIdRequest
     * @return GetDetailByIdResponse
     */
    CompletableFuture<GetDetailByIdResponse> getDetailById(GetDetailByIdRequest request);

    /**
     * @param request the request parameters of GetDocumentDownloadUrl  GetDocumentDownloadUrlRequest
     * @return GetDocumentDownloadUrlResponse
     */
    CompletableFuture<GetDocumentDownloadUrlResponse> getDocumentDownloadUrl(GetDocumentDownloadUrlRequest request);

    /**
     * @param request the request parameters of GetDocumentPage  GetDocumentPageRequest
     * @return GetDocumentPageResponse
     */
    CompletableFuture<GetDocumentPageResponse> getDocumentPage(GetDocumentPageRequest request);

    /**
     * @param request the request parameters of GetDocumentSummary  GetDocumentSummaryRequest
     * @return GetDocumentSummaryResponse
     */
    CompletableFuture<GetDocumentSummaryResponse> getDocumentSummary(GetDocumentSummaryRequest request);

    /**
     * @param request the request parameters of GetRecentDocument  GetRecentDocumentRequest
     * @return GetRecentDocumentResponse
     */
    CompletableFuture<GetRecentDocumentResponse> getRecentDocument(GetRecentDocumentRequest request);

    /**
     * @param request the request parameters of GetSafetyCover  GetSafetyCoverRequest
     * @return GetSafetyCoverResponse
     */
    CompletableFuture<GetSafetyCoverResponse> getSafetyCover(GetSafetyCoverRequest request);

    /**
     * @param request the request parameters of GetSowList  GetSowListRequest
     * @return GetSowListResponse
     */
    CompletableFuture<GetSowListResponse> getSowList(GetSowListRequest request);

    /**
     * @param request the request parameters of GetSuspEventPage  GetSuspEventPageRequest
     * @return GetSuspEventPageResponse
     */
    CompletableFuture<GetSuspEventPageResponse> getSuspEventPage(GetSuspEventPageRequest request);

    /**
     * @param request the request parameters of GetSuspEventSummary  GetSuspEventSummaryRequest
     * @return GetSuspEventSummaryResponse
     */
    CompletableFuture<GetSuspEventSummaryResponse> getSuspEventSummary(GetSuspEventSummaryRequest request);

    /**
     * @param request the request parameters of GetSuspPageSummary  GetSuspPageSummaryRequest
     * @return GetSuspPageSummaryResponse
     */
    CompletableFuture<GetSuspPageSummaryResponse> getSuspPageSummary(GetSuspPageSummaryRequest request);

    /**
     * @param request the request parameters of GetUserStatus  GetUserStatusRequest
     * @return GetUserStatusResponse
     */
    CompletableFuture<GetUserStatusResponse> getUserStatus(GetUserStatusRequest request);

    /**
     * @param request the request parameters of GetVulItemPage  GetVulItemPageRequest
     * @return GetVulItemPageResponse
     */
    CompletableFuture<GetVulItemPageResponse> getVulItemPage(GetVulItemPageRequest request);

    /**
     * @param request the request parameters of GetVulListById  GetVulListByIdRequest
     * @return GetVulListByIdResponse
     */
    CompletableFuture<GetVulListByIdResponse> getVulListById(GetVulListByIdRequest request);

    /**
     * @param request the request parameters of GetVulPageSummary  GetVulPageSummaryRequest
     * @return GetVulPageSummaryResponse
     */
    CompletableFuture<GetVulPageSummaryResponse> getVulPageSummary(GetVulPageSummaryRequest request);

    /**
     * @param request the request parameters of GetVulSummary  GetVulSummaryRequest
     * @return GetVulSummaryResponse
     */
    CompletableFuture<GetVulSummaryResponse> getVulSummary(GetVulSummaryRequest request);

    /**
     * @param request the request parameters of GetWorkTaskSummary  GetWorkTaskSummaryRequest
     * @return GetWorkTaskSummaryResponse
     */
    CompletableFuture<GetWorkTaskSummaryResponse> getWorkTaskSummary(GetWorkTaskSummaryRequest request);

    /**
     * @param request the request parameters of PageServiceCustomer  PageServiceCustomerRequest
     * @return PageServiceCustomerResponse
     */
    CompletableFuture<PageServiceCustomerResponse> pageServiceCustomer(PageServiceCustomerRequest request);

    /**
     * @param request the request parameters of SendCustomEvent  SendCustomEventRequest
     * @return SendCustomEventResponse
     */
    CompletableFuture<SendCustomEventResponse> sendCustomEvent(SendCustomEventRequest request);

}
