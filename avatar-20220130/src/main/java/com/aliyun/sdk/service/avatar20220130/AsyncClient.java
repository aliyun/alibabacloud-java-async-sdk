// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.avatar20220130.models.*;
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

    CompletableFuture<CancelVideoTaskResponse> cancelVideoTask(CancelVideoTaskRequest request);

    CompletableFuture<CloseTimedResetOperateResponse> closeTimedResetOperate(CloseTimedResetOperateRequest request);

    CompletableFuture<DuplexDecisionResponse> duplexDecision(DuplexDecisionRequest request);

    CompletableFuture<GetVideoTaskInfoResponse> getVideoTaskInfo(GetVideoTaskInfoRequest request);

    CompletableFuture<LicenseAuthResponse> licenseAuth(LicenseAuthRequest request);

    CompletableFuture<QueryRunningInstanceResponse> queryRunningInstance(QueryRunningInstanceRequest request);

    CompletableFuture<QueryTimedResetOperateStatusResponse> queryTimedResetOperateStatus(QueryTimedResetOperateStatusRequest request);

    CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request);

    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<StartTimedResetOperateResponse> startTimedResetOperate(StartTimedResetOperateRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<SubmitTextTo2DAvatarVideoTaskResponse> submitTextTo2DAvatarVideoTask(SubmitTextTo2DAvatarVideoTaskRequest request);

    CompletableFuture<SubmitTextTo3DAvatarVideoTaskResponse> submitTextTo3DAvatarVideoTask(SubmitTextTo3DAvatarVideoTaskRequest request);

}
