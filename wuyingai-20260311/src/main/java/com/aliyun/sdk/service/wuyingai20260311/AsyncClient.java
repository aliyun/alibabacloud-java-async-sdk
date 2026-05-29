// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuyingai20260311;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.wuyingai20260311.models.*;
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
     * @param request the request parameters of GetAccessToken  GetAccessTokenRequest
     * @return GetAccessTokenResponse
     */
    CompletableFuture<GetAccessTokenResponse> getAccessToken(GetAccessTokenRequest request);

}
