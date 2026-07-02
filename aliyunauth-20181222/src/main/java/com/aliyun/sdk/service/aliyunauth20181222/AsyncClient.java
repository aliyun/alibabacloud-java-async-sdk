// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliyunauth20181222;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aliyunauth20181222.models.*;
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
     * @param request the request parameters of Authenticate  AuthenticateRequest
     * @return AuthenticateResponse
     */
    CompletableFuture<AuthenticateResponse> authenticate(AuthenticateRequest request);

    /**
     * @param request the request parameters of GetDetailByOrder  GetDetailByOrderRequest
     * @return GetDetailByOrderResponse
     */
    CompletableFuture<GetDetailByOrderResponse> getDetailByOrder(GetDetailByOrderRequest request);

    /**
     * @param request the request parameters of QueryAuth  QueryAuthRequest
     * @return QueryAuthResponse
     */
    CompletableFuture<QueryAuthResponse> queryAuth(QueryAuthRequest request);

    /**
     * @param request the request parameters of QueryInEffectQuthOrder  QueryInEffectQuthOrderRequest
     * @return QueryInEffectQuthOrderResponse
     */
    CompletableFuture<QueryInEffectQuthOrderResponse> queryInEffectQuthOrder(QueryInEffectQuthOrderRequest request);

}
