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
     * <b>description</b> :
     * <p>Supports only enterprises and individual businesses.</p>
     * 
     * @param request the request parameters of EntElementVerify  EntElementVerifyRequest
     * @return EntElementVerifyResponse
     */
    CompletableFuture<EntElementVerifyResponse> entElementVerify(EntElementVerifyRequest request);

    /**
     * @param request the request parameters of EntElementVerifyPRO  EntElementVerifyPRORequest
     * @return EntElementVerifyPROResponse
     */
    CompletableFuture<EntElementVerifyPROResponse> entElementVerifyPRO(EntElementVerifyPRORequest request);

    /**
     * <b>description</b> :
     * <p>The Enterprise Element Verification API provides a service for verifying the consistency of enterprise element information, used to identify the authenticity of enterprise information.
     * It supports various institutions including enterprises, individual businesses, farmers\&quot; professional cooperatives, government agencies, public institutions, social organizations, legal profession institutions, and owners\&quot; meetings for 2-3 elements;
     * For 4 elements, it supports enterprises, individual businesses, farmers\&quot; professional cooperatives, and legal professions.</p>
     * 
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
