// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20190522;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pts20190522.models.*;
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
    CompletableFuture<GetAliwareReportResponse> getAliwareReport(GetAliwareReportRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetReportResponse> getReport(GetReportRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<StartSceneResponse> startScene(StartSceneRequest request);

}
