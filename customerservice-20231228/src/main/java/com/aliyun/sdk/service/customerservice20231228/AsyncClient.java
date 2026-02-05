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

    /**
     * @param request the request parameters of ListEnterpriseSupportPlan  ListEnterpriseSupportPlanRequest
     * @return ListEnterpriseSupportPlanResponse
     */
    CompletableFuture<ListEnterpriseSupportPlanResponse> listEnterpriseSupportPlan(ListEnterpriseSupportPlanRequest request);

    /**
     * @param request the request parameters of ListEnterpriseSupportPlanSimple  ListEnterpriseSupportPlanSimpleRequest
     * @return ListEnterpriseSupportPlanSimpleResponse
     */
    CompletableFuture<ListEnterpriseSupportPlanSimpleResponse> listEnterpriseSupportPlanSimple(ListEnterpriseSupportPlanSimpleRequest request);

    /**
     * @param request the request parameters of ListServiceApply  ListServiceApplyRequest
     * @return ListServiceApplyResponse
     */
    CompletableFuture<ListServiceApplyResponse> listServiceApply(ListServiceApplyRequest request);

    /**
     * @param request the request parameters of ListYunQiTaskByUid  ListYunQiTaskByUidRequest
     * @return ListYunQiTaskByUidResponse
     */
    CompletableFuture<ListYunQiTaskByUidResponse> listYunQiTaskByUid(ListYunQiTaskByUidRequest request);

}
