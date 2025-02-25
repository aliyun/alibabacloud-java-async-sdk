// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.customerservice20231228.models.*;
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

    CompletableFuture<GetDownloadUrlResponse> getDownloadUrl(GetDownloadUrlRequest request);

    CompletableFuture<GetEnterpriseSupportPlanDetailResponse> getEnterpriseSupportPlanDetail(GetEnterpriseSupportPlanDetailRequest request);

    CompletableFuture<GetPreViewUrlResponse> getPreViewUrl(GetPreViewUrlRequest request);

    CompletableFuture<GetServiceDetailResponse> getServiceDetail(GetServiceDetailRequest request);

    CompletableFuture<GetYunQiTaskByRecordIdResponse> getYunQiTaskByRecordId(GetYunQiTaskByRecordIdRequest request);

    CompletableFuture<ListDocsGroupByYearResponse> listDocsGroupByYear(ListDocsGroupByYearRequest request);

    CompletableFuture<ListEnterpriseSupportPlanResponse> listEnterpriseSupportPlan(ListEnterpriseSupportPlanRequest request);

    CompletableFuture<ListEnterpriseSupportPlanSimpleResponse> listEnterpriseSupportPlanSimple(ListEnterpriseSupportPlanSimpleRequest request);

    CompletableFuture<ListServiceApplyResponse> listServiceApply(ListServiceApplyRequest request);

    CompletableFuture<ListYunQiTaskByUidResponse> listYunQiTaskByUid(ListYunQiTaskByUidRequest request);

    CompletableFuture<MarkFileReadedResponse> markFileReaded(MarkFileReadedRequest request);

}
