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

    CompletableFuture<DeleteSymRecordsResponse> deleteSymRecords(DeleteSymRecordsRequest request);

    CompletableFuture<GetH5PageTrendResponse> getH5PageTrend(GetH5PageTrendRequest request);

    CompletableFuture<GetLaunchTrendResponse> getLaunchTrend(GetLaunchTrendRequest request);

    CompletableFuture<GetNativePageTrendResponse> getNativePageTrend(GetNativePageTrendRequest request);

    CompletableFuture<GetNetworkTrendResponse> getNetworkTrend(GetNetworkTrendRequest request);

    CompletableFuture<GetStatTrendResponse> getStatTrend(GetStatTrendRequest request);

    CompletableFuture<GetSymUploadParamResponse> getSymUploadParam(GetSymUploadParamRequest request);

    CompletableFuture<GetTodayStatTrendResponse> getTodayStatTrend(GetTodayStatTrendRequest request);

    CompletableFuture<UpdateAlertPlanResponse> updateAlertPlan(UpdateAlertPlanRequest request);

}
