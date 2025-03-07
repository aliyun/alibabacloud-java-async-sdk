// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianchatbot20241105;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bailianchatbot20241105.models.*;
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
     * @param request the request parameters of SseChat  SseChatRequest
     * @return SseChatResponse
     */
    CompletableFuture<SseChatResponse> sseChat(SseChatRequest request);

    ResponseIterable<SseChatResponseBody> sseChatWithResponseIterable(SseChatRequest request);

}
