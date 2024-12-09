// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.captcha20230305;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.captcha20230305.models.*;
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
     * @param request the request parameters of VerifyCaptcha  VerifyCaptchaRequest
     * @return VerifyCaptchaResponse
     */
    CompletableFuture<VerifyCaptchaResponse> verifyCaptcha(VerifyCaptchaRequest request);

    /**
     * @param request the request parameters of VerifyIntelligentCaptcha  VerifyIntelligentCaptchaRequest
     * @return VerifyIntelligentCaptchaResponse
     */
    CompletableFuture<VerifyIntelligentCaptchaResponse> verifyIntelligentCaptcha(VerifyIntelligentCaptchaRequest request);

}
