// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.appflow20230904.models.*;
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
     * @param request the request parameters of GenerateUserSessionToken  GenerateUserSessionTokenRequest
     * @return GenerateUserSessionTokenResponse
     */
    CompletableFuture<GenerateUserSessionTokenResponse> generateUserSessionToken(GenerateUserSessionTokenRequest request);

}
