// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.captcha20230305.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyCaptchaRequest} extends {@link RequestModel}
 *
 * <p>VerifyCaptchaRequest</p>
 */
public class VerifyCaptchaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaptchaVerifyParam")
    private String captchaVerifyParam;

    private VerifyCaptchaRequest(Builder builder) {
        super(builder);
        this.captchaVerifyParam = builder.captchaVerifyParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCaptchaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return captchaVerifyParam
     */
    public String getCaptchaVerifyParam() {
        return this.captchaVerifyParam;
    }

    public static final class Builder extends Request.Builder<VerifyCaptchaRequest, Builder> {
        private String captchaVerifyParam; 

        private Builder() {
            super();
        } 

        private Builder(VerifyCaptchaRequest request) {
            super(request);
            this.captchaVerifyParam = request.captchaVerifyParam;
        } 

        /**
         * CaptchaVerifyParam.
         */
        public Builder captchaVerifyParam(String captchaVerifyParam) {
            this.putQueryParameter("CaptchaVerifyParam", captchaVerifyParam);
            this.captchaVerifyParam = captchaVerifyParam;
            return this;
        }

        @Override
        public VerifyCaptchaRequest build() {
            return new VerifyCaptchaRequest(this);
        } 

    } 

}
