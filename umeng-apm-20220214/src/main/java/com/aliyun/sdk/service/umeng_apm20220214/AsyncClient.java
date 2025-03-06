// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.umeng_apm20220214.models.*;
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
     * @param request the request parameters of DeleteSymRecords  DeleteSymRecordsRequest
     * @return DeleteSymRecordsResponse
     */
    CompletableFuture<DeleteSymRecordsResponse> deleteSymRecords(DeleteSymRecordsRequest request);

    /**
     * @param request the request parameters of GetErrorMinuteStatTrend  GetErrorMinuteStatTrendRequest
     * @return GetErrorMinuteStatTrendResponse
     */
    CompletableFuture<GetErrorMinuteStatTrendResponse> getErrorMinuteStatTrend(GetErrorMinuteStatTrendRequest request);

    /**
     * @param request the request parameters of GetH5PageTrend  GetH5PageTrendRequest
     * @return GetH5PageTrendResponse
     */
    CompletableFuture<GetH5PageTrendResponse> getH5PageTrend(GetH5PageTrendRequest request);

    /**
     * @param request the request parameters of GetLaunchTrend  GetLaunchTrendRequest
     * @return GetLaunchTrendResponse
     */
    CompletableFuture<GetLaunchTrendResponse> getLaunchTrend(GetLaunchTrendRequest request);

    /**
     * @param request the request parameters of GetNativePageTrend  GetNativePageTrendRequest
     * @return GetNativePageTrendResponse
     */
    CompletableFuture<GetNativePageTrendResponse> getNativePageTrend(GetNativePageTrendRequest request);

    /**
     * @param request the request parameters of GetNetworkMinuteTrend  GetNetworkMinuteTrendRequest
     * @return GetNetworkMinuteTrendResponse
     */
    CompletableFuture<GetNetworkMinuteTrendResponse> getNetworkMinuteTrend(GetNetworkMinuteTrendRequest request);

    /**
     * @param request the request parameters of GetNetworkTrend  GetNetworkTrendRequest
     * @return GetNetworkTrendResponse
     */
    CompletableFuture<GetNetworkTrendResponse> getNetworkTrend(GetNetworkTrendRequest request);

    /**
     * @param request the request parameters of GetStatTrend  GetStatTrendRequest
     * @return GetStatTrendResponse
     */
    CompletableFuture<GetStatTrendResponse> getStatTrend(GetStatTrendRequest request);

    /**
     * @param request the request parameters of GetSymUploadParam  GetSymUploadParamRequest
     * @return GetSymUploadParamResponse
     */
    CompletableFuture<GetSymUploadParamResponse> getSymUploadParam(GetSymUploadParamRequest request);

    /**
     * @param request the request parameters of GetTodayStatTrend  GetTodayStatTrendRequest
     * @return GetTodayStatTrendResponse
     */
    CompletableFuture<GetTodayStatTrendResponse> getTodayStatTrend(GetTodayStatTrendRequest request);

    /**
     * @param request the request parameters of UpdateAlertPlan  UpdateAlertPlanRequest
     * @return UpdateAlertPlanResponse
     */
    CompletableFuture<UpdateAlertPlanResponse> updateAlertPlan(UpdateAlertPlanRequest request);

}
