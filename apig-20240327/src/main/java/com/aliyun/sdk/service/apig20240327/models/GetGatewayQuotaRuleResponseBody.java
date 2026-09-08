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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ruleId&quot;:1001}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
    public static class Consumers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Consumers(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Consumers create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Consumers model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The subject (API consumer) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-aaa</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The subject (API consumer) name.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-a</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Consumers build() {
                return new Consumers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayQuotaRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayQuotaRuleResponseBody</p>
     */
    public static class Subjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("subjectType")
        private String subjectType;

        private Subjects(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.subjectType = builder.subjectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subjects create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subjectType
         */
        public String getSubjectType() {
            return this.subjectType;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String subjectType; 

            private Builder() {
            } 

            private Builder(Subjects model) {
                this.id = model.id;
                this.name = model.name;
                this.subjectType = model.subjectType;
            } 

            /**
             * <p>The subject ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-xxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The subject name.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-a</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The subject type. Valid values: consumer or consumer_group.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer</p>
             */
            public Builder subjectType(String subjectType) {
                this.subjectType = subjectType;
                return this;
            }

            public Subjects build() {
                return new Subjects(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("consumers")
        private java.util.List<Consumers> consumers;

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

        @com.aliyun.core.annotation.NameInMap("subjectCount")
        private Long subjectCount;

        @com.aliyun.core.annotation.NameInMap("subjectType")
        private String subjectType;

        @com.aliyun.core.annotation.NameInMap("subjects")
        private java.util.List<Subjects> subjects;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("windowAlignment")
        private String windowAlignment;

        private Data(Builder builder) {
            this.baseTimestamp = builder.baseTimestamp;
            this.consumerCount = builder.consumerCount;
            this.consumers = builder.consumers;
            this.periodType = builder.periodType;
            this.quotaDimension = builder.quotaDimension;
            this.quotaLimit = builder.quotaLimit;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.subjectCount = builder.subjectCount;
            this.subjectType = builder.subjectType;
            this.subjects = builder.subjects;
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
         * @return consumers
         */
        public java.util.List<Consumers> getConsumers() {
            return this.consumers;
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
         * @return subjectCount
         */
        public Long getSubjectCount() {
            return this.subjectCount;
        }

        /**
         * @return subjectType
         */
        public String getSubjectType() {
            return this.subjectType;
        }

        /**
         * @return subjects
         */
        public java.util.List<Subjects> getSubjects() {
            return this.subjects;
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
            private java.util.List<Consumers> consumers; 
            private String periodType; 
            private String quotaDimension; 
            private Long quotaLimit; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 
            private Long subjectCount; 
            private String subjectType; 
            private java.util.List<Subjects> subjects; 
            private String timezone; 
            private String windowAlignment; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baseTimestamp = model.baseTimestamp;
                this.consumerCount = model.consumerCount;
                this.consumers = model.consumers;
                this.periodType = model.periodType;
                this.quotaDimension = model.quotaDimension;
                this.quotaLimit = model.quotaLimit;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
                this.subjectCount = model.subjectCount;
                this.subjectType = model.subjectType;
                this.subjects = model.subjects;
                this.timezone = model.timezone;
                this.windowAlignment = model.windowAlignment;
            } 

            /**
             * <p>The period base timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1745846400000</p>
             */
            public Builder baseTimestamp(Long baseTimestamp) {
                this.baseTimestamp = baseTimestamp;
                return this;
            }

            /**
             * <p>The number of API consumers associated with the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder consumerCount(Long consumerCount) {
                this.consumerCount = consumerCount;
                return this;
            }

            /**
             * <p>The list of subjects (API consumers) bound to this rule.</p>
             */
            public Builder consumers(java.util.List<Consumers> consumers) {
                this.consumers = consumers;
                return this;
            }

            /**
             * <p>The quota period type.</p>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * <p>The quota dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>token</p>
             */
            public Builder quotaDimension(String quotaDimension) {
                this.quotaDimension = quotaDimension;
                return this;
            }

            /**
             * <p>The quota limit.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder quotaLimit(Long quotaLimit) {
                this.quotaLimit = quotaLimit;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>qr-d8j7fpmm1hks65xxxxxx</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>daily-token-limit</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The rule status.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>The number of associated subjects.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder subjectCount(Long subjectCount) {
                this.subjectCount = subjectCount;
                return this;
            }

            /**
             * <p>The rule subject type. Valid values: consumer or consumer_group.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer_group</p>
             */
            public Builder subjectType(String subjectType) {
                this.subjectType = subjectType;
                return this;
            }

            /**
             * <p>The general subject list bound to this rule. Returned only when withSubjects is set to true.</p>
             */
            public Builder subjects(java.util.List<Subjects> subjects) {
                this.subjects = subjects;
                return this;
            }

            /**
             * <p>The time zone corresponding to the calendar period, in UTC+x format.</p>
             * 
             * <strong>example:</strong>
             * <p>GMT+8</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The reset period type.</p>
             * 
             * <strong>example:</strong>
             * <p>calendar</p>
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
