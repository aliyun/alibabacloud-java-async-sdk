// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bailianmodelonchip20240816.models.*;
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
     * @param request the request parameters of ActiveInteractionCreate  ActiveInteractionCreateRequest
     * @return ActiveInteractionCreateResponse
     */
    CompletableFuture<ActiveInteractionCreateResponse> activeInteractionCreate(ActiveInteractionCreateRequest request);

    /**
     * @param request the request parameters of DeviceRegister  DeviceRegisterRequest
     * @return DeviceRegisterResponse
     */
    CompletableFuture<DeviceRegisterResponse> deviceRegister(DeviceRegisterRequest request);

    /**
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

}
