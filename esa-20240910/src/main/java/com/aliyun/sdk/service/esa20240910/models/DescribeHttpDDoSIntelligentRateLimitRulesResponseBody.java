// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeHttpDDoSIntelligentRateLimitRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHttpDDoSIntelligentRateLimitRulesResponseBody</p>
 */
public class DescribeHttpDDoSIntelligentRateLimitRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleInfos")
    private java.util.List<RuleInfos> ruleInfos;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeHttpDDoSIntelligentRateLimitRulesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.ruleInfos = builder.ruleInfos;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHttpDDoSIntelligentRateLimitRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleInfos
     */
    public java.util.List<RuleInfos> getRuleInfos() {
        return this.ruleInfos;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<RuleInfos> ruleInfos; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHttpDDoSIntelligentRateLimitRulesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.ruleInfos = model.ruleInfos;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of rules.</p>
         */
        public Builder ruleInfos(java.util.List<RuleInfos> ruleInfos) {
            this.ruleInfos = ruleInfos;
            return this;
        }

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHttpDDoSIntelligentRateLimitRulesResponseBody build() {
            return new DescribeHttpDDoSIntelligentRateLimitRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHttpDDoSIntelligentRateLimitRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHttpDDoSIntelligentRateLimitRulesResponseBody</p>
     */
    public static class RuleInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("LogRuleId")
        private Long logRuleId;

        @com.aliyun.core.annotation.NameInMap("PunishTime")
        private Long punishTime;

        @com.aliyun.core.annotation.NameInMap("RateLimit")
        private String rateLimit;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        private RuleInfos(Builder builder) {
            this.action = builder.action;
            this.condition = builder.condition;
            this.logRuleId = builder.logRuleId;
            this.punishTime = builder.punishTime;
            this.rateLimit = builder.rateLimit;
            this.recordName = builder.recordName;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.statistics = builder.statistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return logRuleId
         */
        public Long getLogRuleId() {
            return this.logRuleId;
        }

        /**
         * @return punishTime
         */
        public Long getPunishTime() {
            return this.punishTime;
        }

        /**
         * @return rateLimit
         */
        public String getRateLimit() {
            return this.rateLimit;
        }

        /**
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        public static final class Builder {
            private String action; 
            private String condition; 
            private Long logRuleId; 
            private Long punishTime; 
            private String rateLimit; 
            private String recordName; 
            private Long ruleId; 
            private String ruleName; 
            private String statistics; 

            private Builder() {
            } 

            private Builder(RuleInfos model) {
                this.action = model.action;
                this.condition = model.condition;
                this.logRuleId = model.logRuleId;
                this.punishTime = model.punishTime;
                this.rateLimit = model.rateLimit;
                this.recordName = model.recordName;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.statistics = model.statistics;
            } 

            /**
             * <p>The action to perform.</p>
             * 
             * <strong>example:</strong>
             * <p>js</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The conditions that trigger the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;$and&quot;:[{&quot;key&quot;:&quot;URI&quot;,&quot;opValue&quot;:&quot;prefix-match&quot;,&quot;values&quot;:&quot;/&quot;}]}</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The ID of the protection rule for log records.</p>
             * 
             * <strong>example:</strong>
             * <p>100030</p>
             */
            public Builder logRuleId(Long logRuleId) {
                this.logRuleId = logRuleId;
                return this;
            }

            /**
             * <p>The duration of the penalty in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder punishTime(Long punishTime) {
                this.punishTime = punishTime;
                return this;
            }

            /**
             * <p>The frequency information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;threshold&quot;:2000,&quot;interval&quot;:5,&quot;target&quot;:&quot;ip&quot;,&quot;ttl&quot;:600}</p>
             */
            public Builder rateLimit(String rateLimit) {
                this.rateLimit = rateLimit;
                return this;
            }

            /**
             * <p>The name of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>test.example.com</p>
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>20110849</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>inner_cc_client_ip_ratelimit</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;field&quot;:&quot;ip&quot;,&quot;mode&quot;:&quot;count&quot;}</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            public RuleInfos build() {
                return new RuleInfos(this);
            } 

        } 

    }
}
