// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
         * <p>调整类型。</p>
         * 
         * <strong>example:</strong>
         * <p>QUANTITY_CHANGE_IN_CAPACITY</p>
         */
        public Builder adjustmentType(String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * <p>调整值,正数为扩容,负数为缩容。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * <p>冷却时间,单位秒。</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder coolDownTime(Integer coolDownTime) {
            this.coolDownTime = coolDownTime;
            return this;
        }

        /**
         * <p>规则名称。</p>
         * 
         * <strong>example:</strong>
         * <p>tule1</p>
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>规则参数。</p>
         */
        public Builder ruleParam(RuleParam ruleParam) {
            this.ruleParam = ruleParam;
            return this;
        }

        /**
         * <p>规则类型。</p>
         * 
         * <strong>example:</strong>
         * <p>BY_LOAD</p>
         */
        public Builder ruleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>弹性规则配置ID。</p>
         * 
         * <strong>example:</strong>
         * <p>SCB-DCD96BCCFED1****</p>
         */
        public Builder scalingConfigBizId(String scalingConfigBizId) {
            this.scalingConfigBizId = scalingConfigBizId;
            return this;
        }

        public ScalingRuleV1 build() {
            return new ScalingRuleV1(this);
        } 

    } 

    /**
     * 
     * {@link ScalingRuleV1} extends {@link TeaModel}
     *
     * <p>ScalingRuleV1</p>
     */
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
             * <p>[负载触发参数] 比较符。</p>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * </blockquote>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>[负载触发参数] 统计次数。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * <p>[时间调度参数] 周期类型周期过期时间。</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder launchExpirationTime(Integer launchExpirationTime) {
                this.launchExpirationTime = launchExpirationTime;
                return this;
            }

            /**
             * <p>[时间调度参数] 周期类型周期开始时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-15T04:02Z</p>
             */
            public Builder launchTime(String launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * <p>[负载触发参数] 度量名称。</p>
             * 
             * <strong>example:</strong>
             * <p>YarnRootAvailableVCores</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>[负载触发参数] 统计时长,单位分钟。</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>[时间调度参数] 周期类型周期结束时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-16T05:02Z</p>
             */
            public Builder recurrenceEndTime(String recurrenceEndTime) {
                this.recurrenceEndTime = recurrenceEndTime;
                return this;
            }

            /**
             * <p>[时间调度参数] 周期类型。</p>
             * 
             * <strong>example:</strong>
             * <p>Daily</p>
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * <p>[时间调度参数] 周期类型周期值。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recurrenceValue(String recurrenceValue) {
                this.recurrenceValue = recurrenceValue;
                return this;
            }

            /**
             * <p>[负载触发参数] 统计方式。</p>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>[负载触发参数] 阈值。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
