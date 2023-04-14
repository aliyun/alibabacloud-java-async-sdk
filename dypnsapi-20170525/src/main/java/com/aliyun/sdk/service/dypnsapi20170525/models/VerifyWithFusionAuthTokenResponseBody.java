// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyWithFusionAuthTokenResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyWithFusionAuthTokenResponseBody</p>
 */
public class VerifyWithFusionAuthTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private VerifyWithFusionAuthTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyWithFusionAuthTokenResponseBody create() {
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
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Model model; 
        private String requestId; 
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public VerifyWithFusionAuthTokenResponseBody build() {
            return new VerifyWithFusionAuthTokenResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("PhoneScore")
        private Long phoneScore;

        @NameInMap("VerifyResult")
        private String verifyResult;

        private Model(Builder builder) {
            this.phoneNumber = builder.phoneNumber;
            this.phoneScore = builder.phoneScore;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return phoneScore
         */
        public Long getPhoneScore() {
            return this.phoneScore;
        }

        /**
         * @return verifyResult
         */
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String phoneNumber; 
            private Long phoneScore; 
            private String verifyResult; 

            /**
             * 手机号，认证成功时返回该字段。
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * 手机号评分，只有开启手机号评分节点，并且认证通过后才会给出，取值范围[0，100]，分越大，风险系数越高。
             */
            public Builder phoneScore(Long phoneScore) {
                this.phoneScore = phoneScore;
                return this;
            }

            /**
             * 认证结果，认证成功：PASS，认证失败：UNKNOWN
             */
            public Builder verifyResult(String verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
