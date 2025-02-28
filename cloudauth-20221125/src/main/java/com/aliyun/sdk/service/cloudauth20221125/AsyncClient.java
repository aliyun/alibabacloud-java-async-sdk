// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudauth20221125.models.*;
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
     * @param request the request parameters of EntElementVerify  EntElementVerifyRequest
     * @return EntElementVerifyResponse
     */
    CompletableFuture<EntElementVerifyResponse> entElementVerify(EntElementVerifyRequest request);

    /**
     * @param request the request parameters of EntElementVerifyV2  EntElementVerifyV2Request
     * @return EntElementVerifyV2Response
     */
    CompletableFuture<EntElementVerifyV2Response> entElementVerifyV2(EntElementVerifyV2Request request);

    /**
     * @param request the request parameters of EntRiskQuery  EntRiskQueryRequest
     * @return EntRiskQueryResponse
     */
    CompletableFuture<EntRiskQueryResponse> entRiskQuery(EntRiskQueryRequest request);

    /**
     * @param request the request parameters of EntVerify  EntVerifyRequest
     * @return EntVerifyResponse
     */
    CompletableFuture<EntVerifyResponse> entVerify(EntVerifyRequest request);

}
