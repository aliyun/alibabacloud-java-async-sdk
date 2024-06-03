// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScalingRuleV1} extends {@link TeaModel}
 *
 * <p>ScalingRuleV1</p>
 */
public class ScalingRuleV1 extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdjustmentType")
    private String adjustmentType;

    @com.aliyun.core.annotation.NameInMap("AdjustmentValue")
    private Integer adjustmentValue;

    @com.aliyun.core.annotation.NameInMap("CoolDownTime")
    private Integer coolDownTime;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.NameInMap("RuleParam")
    private RuleParam ruleParam;

    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.NameInMap("ScalingConfigBizId")
    private String scalingConfigBizId;

    private ScalingRuleV1(Builder builder) {
        this.adjustmentType = builder.adjustmentType;
        this.adjustmentValue = builder.adjustmentValue;
        this.coolDownTime = builder.coolDownTime;
        this.ruleName = builder.ruleName;
        this.ruleParam = builder.ruleParam;
        this.ruleType = builder.ruleType;
        this.scalingConfigBizId = builder.scalingConfigBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingRuleV1 create() {
        return builder().build();
    }

    /**
     * @return adjustmentType
     */
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    /**
     * @return adjustmentValue
     */
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    /**
     * @return coolDownTime
     */
    public Integer getCoolDownTime() {
        return this.coolDownTime;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleParam
     */
    public RuleParam getRuleParam() {
        return this.ruleParam;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return scalingConfigBizId
     */
    public String getScalingConfigBizId() {
        return this.scalingConfigBizId;
    }

    public static final class Builder {
        private String adjustmentType; 
        private Integer adjustmentValue; 
        private Integer coolDownTime; 
        private String ruleName; 
        private RuleParam ruleParam; 
        private String ruleType; 
        private String scalingConfigBizId; 

        /**
         * 调整类型。
         */
        public Builder adjustmentType(String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * 调整值,正数为扩容,负数为缩容。
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * 冷却时间,单位秒。
         */
        public Builder coolDownTime(Integer coolDownTime) {
            this.coolDownTime = coolDownTime;
            return this;
        }

        /**
         * 规则名称。
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * 规则参数。
         */
        public Builder ruleParam(RuleParam ruleParam) {
            this.ruleParam = ruleParam;
            return this;
        }

        /**
         * 规则类型。
         */
        public Builder ruleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * 弹性规则配置ID。
         */
        public Builder scalingConfigBizId(String scalingConfigBizId) {
            this.scalingConfigBizId = scalingConfigBizId;
            return this;
        }

        public ScalingRuleV1 build() {
            return new ScalingRuleV1(this);
        } 

    } 

    public static class RuleParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        private Integer evaluationCount;

        @com.aliyun.core.annotation.NameInMap("LaunchExpirationTime")
        private Integer launchExpirationTime;

        @com.aliyun.core.annotation.NameInMap("LaunchTime")
        private String launchTime;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("RecurrenceEndTime")
        private String recurrenceEndTime;

        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValue")
        private String recurrenceValue;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Integer threshold;

        private RuleParam(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.evaluationCount = builder.evaluationCount;
            this.launchExpirationTime = builder.launchExpirationTime;
            this.launchTime = builder.launchTime;
            this.metricName = builder.metricName;
            this.period = builder.period;
            this.recurrenceEndTime = builder.recurrenceEndTime;
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValue = builder.recurrenceValue;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleParam create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return evaluationCount
         */
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        /**
         * @return launchExpirationTime
         */
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        /**
         * @return launchTime
         */
        public String getLaunchTime() {
            return this.launchTime;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return recurrenceEndTime
         */
        public String getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        /**
         * @return recurrenceType
         */
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        /**
         * @return recurrenceValue
         */
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public Integer getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private Integer evaluationCount; 
            private Integer launchExpirationTime; 
            private String launchTime; 
            private String metricName; 
            private Integer period; 
            private String recurrenceEndTime; 
            private String recurrenceType; 
            private String recurrenceValue; 
            private String statistics; 
            private Integer threshold; 

            /**
             * [负载触发参数] 比较符。
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * [负载触发参数] 统计次数。
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * [时间调度参数] 周期类型周期过期时间。
             */
            public Builder launchExpirationTime(Integer launchExpirationTime) {
                this.launchExpirationTime = launchExpirationTime;
                return this;
            }

            /**
             * [时间调度参数] 周期类型周期开始时间。
             */
            public Builder launchTime(String launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * [负载触发参数] 度量名称。
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * [负载触发参数] 统计时长,单位分钟。
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * [时间调度参数] 周期类型周期结束时间。
             */
            public Builder recurrenceEndTime(String recurrenceEndTime) {
                this.recurrenceEndTime = recurrenceEndTime;
                return this;
            }

            /**
             * [时间调度参数] 周期类型。
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * [时间调度参数] 周期类型周期值。
             */
            public Builder recurrenceValue(String recurrenceValue) {
                this.recurrenceValue = recurrenceValue;
                return this;
            }

            /**
             * [负载触发参数] 统计方式。
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * [负载触发参数] 阈值。
             */
            public Builder threshold(Integer threshold) {
                this.threshold = threshold;
                return this;
            }

            public RuleParam build() {
                return new RuleParam(this);
            } 

        } 

    }
}
