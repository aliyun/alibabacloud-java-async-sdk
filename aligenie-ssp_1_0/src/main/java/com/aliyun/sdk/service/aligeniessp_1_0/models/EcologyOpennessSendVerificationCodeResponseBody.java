// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link EcologyOpennessSendVerificationCodeResponseBody} extends {@link TeaModel}
 *
 * <p>EcologyOpennessSendVerificationCodeResponseBody</p>
 */
public class EcologyOpennessSendVerificationCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EcologyOpennessSendVerificationCodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EcologyOpennessSendVerificationCodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EcologyOpennessSendVerificationCodeResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Response code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response message</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Response Result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Flag indicating whether the invocation succeeded</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EcologyOpennessSendVerificationCodeResponseBody build() {
            return new EcologyOpennessSendVerificationCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EcologyOpennessSendVerificationCodeResponseBody} extends {@link TeaModel}
     *
     * <p>EcologyOpennessSendVerificationCodeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpireIn")
        private Integer expireIn;

        @com.aliyun.core.annotation.NameInMap("RepeatInterval")
        private Integer repeatInterval;

        private Result(Builder builder) {
            this.expireIn = builder.expireIn;
            this.repeatInterval = builder.repeatInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return expireIn
         */
        public Integer getExpireIn() {
            return this.expireIn;
        }

        /**
         * @return repeatInterval
         */
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

        public static final class Builder {
            private Integer expireIn; 
            private Integer repeatInterval; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.expireIn = model.expireIn;
                this.repeatInterval = model.repeatInterval;
            } 

            /**
             * <p>Validity Period (unit: seconds)</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder expireIn(Integer expireIn) {
                this.expireIn = expireIn;
                return this;
            }

            /**
             * <p>Recency before the next resend is allowed (unit: seconds)</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder repeatInterval(Integer repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
