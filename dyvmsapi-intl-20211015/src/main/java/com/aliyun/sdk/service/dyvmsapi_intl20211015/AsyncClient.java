// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi_intl20211015;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dyvmsapi_intl20211015.models.*;
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
     * @param request the request parameters of BackendCallGroup  BackendCallGroupRequest
     * @return BackendCallGroupResponse
     */
    CompletableFuture<BackendCallGroupResponse> backendCallGroup(BackendCallGroupRequest request);

    /**
     * @param request the request parameters of BackendCallSignal  BackendCallSignalRequest
     * @return BackendCallSignalResponse
     */
    CompletableFuture<BackendCallSignalResponse> backendCallSignal(BackendCallSignalRequest request);

    /**
     * @param request the request parameters of GroupCall  GroupCallRequest
     * @return GroupCallResponse
     */
    CompletableFuture<GroupCallResponse> groupCall(GroupCallRequest request);

    /**
     * @param request the request parameters of SignalCall  SignalCallRequest
     * @return SignalCallResponse
     */
    CompletableFuture<SignalCallResponse> signalCall(SignalCallRequest request);

    /**
     * @param request the request parameters of VoiceGroupCall  VoiceGroupCallRequest
     * @return VoiceGroupCallResponse
     */
    CompletableFuture<VoiceGroupCallResponse> voiceGroupCall(VoiceGroupCallRequest request);

    /**
     * @param request the request parameters of VoiceSingleCall  VoiceSingleCallRequest
     * @return VoiceSingleCallResponse
     */
    CompletableFuture<VoiceSingleCallResponse> voiceSingleCall(VoiceSingleCallRequest request);

}
