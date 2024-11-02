// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210220;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.appstream_center20210220.models.*;
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
     * @param request the request parameters of FindIdpListByLoginIdentifier  FindIdpListByLoginIdentifierRequest
     * @return FindIdpListByLoginIdentifierResponse
     */
    CompletableFuture<FindIdpListByLoginIdentifierResponse> findIdpListByLoginIdentifier(FindIdpListByLoginIdentifierRequest request);

    /**
     * @param request the request parameters of GetLoginToken  GetLoginTokenRequest
     * @return GetLoginTokenResponse
     */
    CompletableFuture<GetLoginTokenResponse> getLoginToken(GetLoginTokenRequest request);

    /**
     * @param request the request parameters of RefreshLoginToken  RefreshLoginTokenRequest
     * @return RefreshLoginTokenResponse
     */
    CompletableFuture<RefreshLoginTokenResponse> refreshLoginToken(RefreshLoginTokenRequest request);

}
