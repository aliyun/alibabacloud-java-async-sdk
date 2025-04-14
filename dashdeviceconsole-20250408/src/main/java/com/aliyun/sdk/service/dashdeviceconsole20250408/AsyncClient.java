// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dashdeviceconsole20250408;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dashdeviceconsole20250408.models.*;
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
     * @param request the request parameters of GetPrompt  GetPromptRequest
     * @return GetPromptResponse
     */
    CompletableFuture<GetPromptResponse> getPrompt(GetPromptRequest request);

    /**
     * @param request the request parameters of PushPrompt  PushPromptRequest
     * @return PushPromptResponse
     */
    CompletableFuture<PushPromptResponse> pushPrompt(PushPromptRequest request);

}
