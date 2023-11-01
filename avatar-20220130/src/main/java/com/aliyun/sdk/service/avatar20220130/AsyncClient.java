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

    CompletableFuture<ClientAuthResponse> clientAuth(ClientAuthRequest request);

    CompletableFuture<ClientStartResponse> clientStart(ClientStartRequest request);

    CompletableFuture<CloseTimedResetOperateResponse> closeTimedResetOperate(CloseTimedResetOperateRequest request);

    CompletableFuture<Create2dAvatarResponse> create2dAvatar(Create2dAvatarRequest request);

    CompletableFuture<DeleteAvatarResponse> deleteAvatar(DeleteAvatarRequest request);

    CompletableFuture<DuplexDecisionResponse> duplexDecision(DuplexDecisionRequest request);

    CompletableFuture<GetVideoTaskInfoResponse> getVideoTaskInfo(GetVideoTaskInfoRequest request);

    CompletableFuture<LicenseAuthResponse> licenseAuth(LicenseAuthRequest request);

    CompletableFuture<QueryAvatarResponse> queryAvatar(QueryAvatarRequest request);

    CompletableFuture<QueryAvatarListResponse> queryAvatarList(QueryAvatarListRequest request);

    CompletableFuture<QueryRunningInstanceResponse> queryRunningInstance(QueryRunningInstanceRequest request);

    CompletableFuture<QueryTimedResetOperateStatusResponse> queryTimedResetOperateStatus(QueryTimedResetOperateStatusRequest request);

    CompletableFuture<QueryVideoTaskInfoResponse> queryVideoTaskInfo(QueryVideoTaskInfoRequest request);

    CompletableFuture<Render3dAvatarResponse> render3dAvatar(Render3dAvatarRequest request);

    CompletableFuture<SendCommandResponse> sendCommand(SendCommandRequest request);

    CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request);

    CompletableFuture<SendTextResponse> sendText(SendTextRequest request);

    CompletableFuture<SendVamlResponse> sendVaml(SendVamlRequest request);

    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<StartTimedResetOperateResponse> startTimedResetOperate(StartTimedResetOperateRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<SubmitAudioTo2DAvatarVideoTaskResponse> submitAudioTo2DAvatarVideoTask(SubmitAudioTo2DAvatarVideoTaskRequest request);

    CompletableFuture<SubmitAudioTo3DAvatarVideoTaskResponse> submitAudioTo3DAvatarVideoTask(SubmitAudioTo3DAvatarVideoTaskRequest request);

    CompletableFuture<SubmitAvatarVideoTaskResponse> submitAvatarVideoTask(SubmitAvatarVideoTaskRequest request);

    CompletableFuture<SubmitTextTo2DAvatarVideoTaskResponse> submitTextTo2DAvatarVideoTask(SubmitTextTo2DAvatarVideoTaskRequest request);

    CompletableFuture<SubmitTextTo3DAvatarVideoTaskResponse> submitTextTo3DAvatarVideoTask(SubmitTextTo3DAvatarVideoTaskRequest request);

    CompletableFuture<Update2dAvatarResponse> update2dAvatar(Update2dAvatarRequest request);

}
