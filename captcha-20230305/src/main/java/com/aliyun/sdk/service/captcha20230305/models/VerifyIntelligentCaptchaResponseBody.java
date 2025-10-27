// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.captcha20230305.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyIntelligentCaptchaResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyIntelligentCaptchaResponseBody</p>
 */
public class VerifyIntelligentCaptchaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private VerifyIntelligentCaptchaResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyIntelligentCaptchaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(VerifyIntelligentCaptchaResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>95784F***D39FDC5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public VerifyIntelligentCaptchaResponseBody build() {
            return new VerifyIntelligentCaptchaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyIntelligentCaptchaResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyIntelligentCaptchaResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertifyId")
        private String certifyId;

        @com.aliyun.core.annotation.NameInMap("VerifyCode")
        private String verifyCode;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private Boolean verifyResult;

        private Result(Builder builder) {
            this.certifyId = builder.certifyId;
            this.verifyCode = builder.verifyCode;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return certifyId
         */
        public String getCertifyId() {
            return this.certifyId;
        }

        /**
         * @return verifyCode
         */
        public String getVerifyCode() {
            return this.verifyCode;
        }

        /**
         * @return verifyResult
         */
        public Boolean getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String certifyId; 
            private String verifyCode; 
            private Boolean verifyResult; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.certifyId = model.certifyId;
                this.verifyCode = model.verifyCode;
                this.verifyResult = model.verifyResult;
            } 

            /**
             * CertifyId.
             */
            public Builder certifyId(String certifyId) {
                this.certifyId = certifyId;
                return this;
            }

            /**
             * VerifyCode.
             */
            public Builder verifyCode(String verifyCode) {
                this.verifyCode = verifyCode;
                return this;
            }

            /**
             * VerifyResult.
             */
            public Builder verifyResult(Boolean verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
