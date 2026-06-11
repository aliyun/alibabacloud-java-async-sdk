// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetGatewayQuotaRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayQuotaRuleResponseBody</p>
 */
public class GetGatewayQuotaRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGatewayQuotaRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayQuotaRuleResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGatewayQuotaRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGatewayQuotaRuleResponseBody build() {
            return new GetGatewayQuotaRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayQuotaRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayQuotaRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baseTimestamp")
        private Long baseTimestamp;

        @com.aliyun.core.annotation.NameInMap("consumerCount")
        private Long consumerCount;

        @com.aliyun.core.annotation.NameInMap("periodType")
        private String periodType;

        @com.aliyun.core.annotation.NameInMap("quotaDimension")
        private String quotaDimension;

        @com.aliyun.core.annotation.NameInMap("quotaLimit")
        private Long quotaLimit;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ruleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("windowAlignment")
        private String windowAlignment;

        private Data(Builder builder) {
            this.baseTimestamp = builder.baseTimestamp;
            this.consumerCount = builder.consumerCount;
            this.periodType = builder.periodType;
            this.quotaDimension = builder.quotaDimension;
            this.quotaLimit = builder.quotaLimit;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.timezone = builder.timezone;
            this.windowAlignment = builder.windowAlignment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baseTimestamp
         */
        public Long getBaseTimestamp() {
            return this.baseTimestamp;
        }

        /**
         * @return consumerCount
         */
        public Long getConsumerCount() {
            return this.consumerCount;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        /**
         * @return quotaDimension
         */
        public String getQuotaDimension() {
            return this.quotaDimension;
        }

        /**
         * @return quotaLimit
         */
        public Long getQuotaLimit() {
            return this.quotaLimit;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return windowAlignment
         */
        public String getWindowAlignment() {
            return this.windowAlignment;
        }

        public static final class Builder {
            private Long baseTimestamp; 
            private Long consumerCount; 
            private String periodType; 
            private String quotaDimension; 
            private Long quotaLimit; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 
            private String timezone; 
            private String windowAlignment; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baseTimestamp = model.baseTimestamp;
                this.consumerCount = model.consumerCount;
                this.periodType = model.periodType;
                this.quotaDimension = model.quotaDimension;
                this.quotaLimit = model.quotaLimit;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
                this.timezone = model.timezone;
                this.windowAlignment = model.windowAlignment;
            } 

            /**
             * baseTimestamp.
             */
            public Builder baseTimestamp(Long baseTimestamp) {
                this.baseTimestamp = baseTimestamp;
                return this;
            }

            /**
             * consumerCount.
             */
            public Builder consumerCount(Long consumerCount) {
                this.consumerCount = consumerCount;
                return this;
            }

            /**
             * periodType.
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * quotaDimension.
             */
            public Builder quotaDimension(String quotaDimension) {
                this.quotaDimension = quotaDimension;
                return this;
            }

            /**
             * quotaLimit.
             */
            public Builder quotaLimit(Long quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * ruleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * ruleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * ruleStatus.
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * windowAlignment.
             */
            public Builder windowAlignment(String windowAlignment) {
                this.windowAlignment = windowAlignment;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
