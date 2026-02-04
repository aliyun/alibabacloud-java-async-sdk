// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.appstream_center20210218.models.*;
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
     * @param request the request parameters of ExpireLoginToken  ExpireLoginTokenRequest
     * @return ExpireLoginTokenResponse
     */
    CompletableFuture<ExpireLoginTokenResponse> expireLoginToken(ExpireLoginTokenRequest request);

    /**
     * @param request the request parameters of GetAuthCode  GetAuthCodeRequest
     * @return GetAuthCodeResponse
     */
    CompletableFuture<GetAuthCodeResponse> getAuthCode(GetAuthCodeRequest request);

    /**
     * @param request the request parameters of GetStsToken  GetStsTokenRequest
     * @return GetStsTokenResponse
     */
    CompletableFuture<GetStsTokenResponse> getStsToken(GetStsTokenRequest request);

}
