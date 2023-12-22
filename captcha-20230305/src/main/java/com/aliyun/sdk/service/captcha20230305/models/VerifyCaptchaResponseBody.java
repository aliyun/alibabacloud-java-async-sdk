// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.captcha20230305.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCaptchaResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyCaptchaResponseBody</p>
 */
public class VerifyCaptchaResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private VerifyCaptchaResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCaptchaResponseBody create() {
        return builder().build();
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
         * Id of the request
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

        public VerifyCaptchaResponseBody build() {
            return new VerifyCaptchaResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("VerifyResult")
        private Boolean verifyResult;

        private Result(Builder builder) {
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return verifyResult
         */
        public Boolean getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private Boolean verifyResult; 

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
