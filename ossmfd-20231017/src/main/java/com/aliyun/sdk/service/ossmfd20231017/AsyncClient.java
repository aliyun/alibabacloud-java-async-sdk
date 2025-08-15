// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossmfd20231017;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ossmfd20231017.models.*;
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
     * @param request the request parameters of CheckMfdServiceOpen  CheckMfdServiceOpenRequest
     * @return CheckMfdServiceOpenResponse
     */
    CompletableFuture<CheckMfdServiceOpenResponse> checkMfdServiceOpen(CheckMfdServiceOpenRequest request);

    /**
     * @param request the request parameters of CreateOssBucketScanTask  CreateOssBucketScanTaskRequest
     * @return CreateOssBucketScanTaskResponse
     */
    CompletableFuture<CreateOssBucketScanTaskResponse> createOssBucketScanTask(CreateOssBucketScanTaskRequest request);

    /**
     * @param request the request parameters of CreateOssScanConfig  CreateOssScanConfigRequest
     * @return CreateOssScanConfigResponse
     */
    CompletableFuture<CreateOssScanConfigResponse> createOssScanConfig(CreateOssScanConfigRequest request);

    /**
     * @param request the request parameters of DescribeExportInfo  DescribeExportInfoRequest
     * @return DescribeExportInfoResponse
     */
    CompletableFuture<DescribeExportInfoResponse> describeExportInfo(DescribeExportInfoRequest request);

    /**
     * @param request the request parameters of DescribeServiceLinkedRoleStatus  DescribeServiceLinkedRoleStatusRequest
     * @return DescribeServiceLinkedRoleStatusResponse
     */
    CompletableFuture<DescribeServiceLinkedRoleStatusResponse> describeServiceLinkedRoleStatus(DescribeServiceLinkedRoleStatusRequest request);

    /**
     * @param request the request parameters of ExportRecord  ExportRecordRequest
     * @return ExportRecordResponse
     */
    CompletableFuture<ExportRecordResponse> exportRecord(ExportRecordRequest request);

    /**
     * @param request the request parameters of GetFileDetectReport  GetFileDetectReportRequest
     * @return GetFileDetectReportResponse
     */
    CompletableFuture<GetFileDetectReportResponse> getFileDetectReport(GetFileDetectReportRequest request);

    /**
     * @param request the request parameters of GetOssBucketScanStatistic  GetOssBucketScanStatisticRequest
     * @return GetOssBucketScanStatisticResponse
     */
    CompletableFuture<GetOssBucketScanStatisticResponse> getOssBucketScanStatistic(GetOssBucketScanStatisticRequest request);

    /**
     * @param request the request parameters of GetOssScanConfig  GetOssScanConfigRequest
     * @return GetOssScanConfigResponse
     */
    CompletableFuture<GetOssScanConfigResponse> getOssScanConfig(GetOssScanConfigRequest request);

    /**
     * @param request the request parameters of ListObjectScanEvent  ListObjectScanEventRequest
     * @return ListObjectScanEventResponse
     */
    CompletableFuture<ListObjectScanEventResponse> listObjectScanEvent(ListObjectScanEventRequest request);

    /**
     * @param request the request parameters of ListOssBucket  ListOssBucketRequest
     * @return ListOssBucketResponse
     */
    CompletableFuture<ListOssBucketResponse> listOssBucket(ListOssBucketRequest request);

    /**
     * @param request the request parameters of ListOssBucketScanInfo  ListOssBucketScanInfoRequest
     * @return ListOssBucketScanInfoResponse
     */
    CompletableFuture<ListOssBucketScanInfoResponse> listOssBucketScanInfo(ListOssBucketScanInfoRequest request);

    /**
     * @param request the request parameters of ListSupportObjectSuffix  ListSupportObjectSuffixRequest
     * @return ListSupportObjectSuffixResponse
     */
    CompletableFuture<ListSupportObjectSuffixResponse> listSupportObjectSuffix(ListSupportObjectSuffixRequest request);

    /**
     * @param request the request parameters of OperateBucketScanTask  OperateBucketScanTaskRequest
     * @return OperateBucketScanTaskResponse
     */
    CompletableFuture<OperateBucketScanTaskResponse> operateBucketScanTask(OperateBucketScanTaskRequest request);

    /**
     * @param request the request parameters of UpdateOssScanConfig  UpdateOssScanConfigRequest
     * @return UpdateOssScanConfigResponse
     */
    CompletableFuture<UpdateOssScanConfigResponse> updateOssScanConfig(UpdateOssScanConfigRequest request);

}
