// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link DeepfakeDetectIntlResponseBody} extends {@link TeaModel}
 *
 * <p>DeepfakeDetectIntlResponseBody</p>
 */
public class DeepfakeDetectIntlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DeepfakeDetectIntlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeepfakeDetectIntlResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DeepfakeDetectIntlResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DeepfakeDetectIntlResponseBody build() {
            return new DeepfakeDetectIntlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeepfakeDetectIntlResponseBody} extends {@link TeaModel}
     *
     * <p>DeepfakeDetectIntlResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("RiskScore")
        private java.util.Map<String, String> riskScore;

        @com.aliyun.core.annotation.NameInMap("RiskTag")
        private String riskTag;

        private ResultObject(Builder builder) {
            this.result = builder.result;
            this.riskScore = builder.riskScore;
            this.riskTag = builder.riskTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return riskScore
         */
        public java.util.Map<String, String> getRiskScore() {
            return this.riskScore;
        }

        /**
         * @return riskTag
         */
        public String getRiskTag() {
            return this.riskTag;
        }

        public static final class Builder {
            private String result; 
            private java.util.Map<String, String> riskScore; 
            private String riskTag; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.result = model.result;
                this.riskScore = model.riskScore;
                this.riskTag = model.riskTag;
            } 

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * RiskScore.
             */
            public Builder riskScore(java.util.Map<String, String> riskScore) {
                this.riskScore = riskScore;
                return this;
            }

            /**
             * RiskTag.
             */
            public Builder riskTag(String riskTag) {
                this.riskTag = riskTag;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
