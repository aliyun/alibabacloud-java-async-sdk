// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FaceGuardRiskResponseBody} extends {@link TeaModel}
 *
 * <p>FaceGuardRiskResponseBody</p>
 */
public class FaceGuardRiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private FaceGuardRiskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceGuardRiskResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

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
         * <p>595E387B-3F0E-5C52-BD02-8EFE63D41FD5</p>
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

        public FaceGuardRiskResponseBody build() {
            return new FaceGuardRiskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FaceGuardRiskResponseBody} extends {@link TeaModel}
     *
     * <p>FaceGuardRiskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskExtends")
        private String riskExtends;

        @com.aliyun.core.annotation.NameInMap("RiskTags")
        private String riskTags;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        private Result(Builder builder) {
            this.riskExtends = builder.riskExtends;
            this.riskTags = builder.riskTags;
            this.transactionId = builder.transactionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return riskExtends
         */
        public String getRiskExtends() {
            return this.riskExtends;
        }

        /**
         * @return riskTags
         */
        public String getRiskTags() {
            return this.riskTags;
        }

        /**
         * @return transactionId
         */
        public String getTransactionId() {
            return this.transactionId;
        }

        public static final class Builder {
            private String riskExtends; 
            private String riskTags; 
            private String transactionId; 

            /**
             * RiskExtends.
             */
            public Builder riskExtends(String riskExtends) {
                this.riskExtends = riskExtends;
                return this;
            }

            /**
             * RiskTags.
             */
            public Builder riskTags(String riskTags) {
                this.riskTags = riskTags;
                return this;
            }

            /**
             * TransactionId.
             */
            public Builder transactionId(String transactionId) {
                this.transactionId = transactionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
