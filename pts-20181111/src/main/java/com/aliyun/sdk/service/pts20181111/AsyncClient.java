// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20181111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pts20181111.models.*;
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
      * @deprecated
      *
     */
    CompletableFuture<GetReportResponse> getReport(GetReportRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListRunnableScenesResponse> listRunnableScenes(ListRunnableScenesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<QueryPlanStatusResponse> queryPlanStatus(QueryPlanStatusRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<StartSceneResponse> startScene(StartSceneRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<StopSceneResponse> stopScene(StopSceneRequest request);

}
