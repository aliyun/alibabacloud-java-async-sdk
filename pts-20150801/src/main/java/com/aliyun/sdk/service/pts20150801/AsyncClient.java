// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pts20150801.models.*;
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
    CompletableFuture<CreateTransactionResponse> createTransaction(CreateTransactionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetKeySecretResponse> getKeySecret(GetKeySecretRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetScriptResponse> getScript(GetScriptRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetTasksResponse> getTasks(GetTasksRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ReportLogSampleResponse> reportLogSample(ReportLogSampleRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ReportTestSampleResponse> reportTestSample(ReportTestSampleRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ReportVuserResponse> reportVuser(ReportVuserRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<SendWangWangResponse> sendWangWang(SendWangWangRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<SetScenarioStatusResponse> setScenarioStatus(SetScenarioStatusRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<SetTaskStatusResponse> setTaskStatus(SetTaskStatusRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<StopTaskResponse> stopTask(StopTaskRequest request);

}
