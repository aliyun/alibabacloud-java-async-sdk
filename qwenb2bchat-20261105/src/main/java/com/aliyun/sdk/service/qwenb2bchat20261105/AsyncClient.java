// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bchat20261105;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.qwenb2bchat20261105.models.*;
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
     * @param request the request parameters of Chat  ChatRequest
     * @return ChatResponse
     */
    CompletableFuture<ChatResponse> chat(ChatRequest request);

    ResponseIterable<ChatResponseBody> chatWithResponseIterable(ChatRequest request);

    /**
     * @param request the request parameters of OpenService  OpenServiceRequest
     * @return OpenServiceResponse
     */
    CompletableFuture<OpenServiceResponse> openService(OpenServiceRequest request);

    /**
     * @param request the request parameters of StreamVoice  StreamVoiceRequest
     * @return StreamVoiceResponse
     */
    CompletableFuture<StreamVoiceResponse> streamVoice(StreamVoiceRequest request);

}
