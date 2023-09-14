// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScalingRuleSpec} extends {@link TeaModel}
 *
 * <p>ScalingRuleSpec</p>
 */
public class ScalingRuleSpec extends TeaModel {
    @NameInMap("AdjustmentValue")
    @Validation(required = true)
    private Integer adjustmentValue;

    @NameInMap("ByLoadScalingRuleSpec")
    private ByLoadScalingRuleSpec byLoadScalingRuleSpec;

    @NameInMap("ByTimeScalingRuleSpec")
    private ByTimeScalingRuleSpec byTimeScalingRuleSpec;

    @NameInMap("CoolDownInterval")
    @Validation(required = true)
    private Integer coolDownInterval;

    @NameInMap("ScalingActivityType")
    @Validation(required = true)
    private String scalingActivityType;

    @NameInMap("ScalingRuleName")
    @Validation(required = true)
    private String scalingRuleName;

    @NameInMap("ScalingRuleType")
    @Validation(required = true)
    private String scalingRuleType;

    private ScalingRuleSpec(Builder builder) {
        this.adjustmentValue = builder.adjustmentValue;
        this.byLoadScalingRuleSpec = builder.byLoadScalingRuleSpec;
        this.byTimeScalingRuleSpec = builder.byTimeScalingRuleSpec;
        this.coolDownInterval = builder.coolDownInterval;
        this.scalingActivityType = builder.scalingActivityType;
        this.scalingRuleName = builder.scalingRuleName;
        this.scalingRuleType = builder.scalingRuleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingRuleSpec create() {
        return builder().build();
    }

    /**
     * @return adjustmentValue
     */
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    /**
     * @return byLoadScalingRuleSpec
     */
    public ByLoadScalingRuleSpec getByLoadScalingRuleSpec() {
        return this.byLoadScalingRuleSpec;
    }

    /**
     * @return byTimeScalingRuleSpec
     */
    public ByTimeScalingRuleSpec getByTimeScalingRuleSpec() {
        return this.byTimeScalingRuleSpec;
    }

    /**
     * @return coolDownInterval
     */
    public Integer getCoolDownInterval() {
        return this.coolDownInterval;
    }

    /**
     * @return scalingActivityType
     */
    public String getScalingActivityType() {
        return this.scalingActivityType;
    }

    /**
     * @return scalingRuleName
     */
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    /**
     * @return scalingRuleType
     */
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

    public static final class Builder {
        private Integer adjustmentValue; 
        private ByLoadScalingRuleSpec byLoadScalingRuleSpec; 
        private ByTimeScalingRuleSpec byTimeScalingRuleSpec; 
        private Integer coolDownInterval; 
        private String scalingActivityType; 
        private String scalingRuleName; 
        private String scalingRuleType; 

        /**
         * 调整值。需要为正数，代表需要扩容或者缩容的实例数量。
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * 按照负载伸缩描述。
         */
        public Builder byLoadScalingRuleSpec(ByLoadScalingRuleSpec byLoadScalingRuleSpec) {
            this.byLoadScalingRuleSpec = byLoadScalingRuleSpec;
            return this;
        }

        /**
         * 按照时间伸缩描述。
         */
        public Builder byTimeScalingRuleSpec(ByTimeScalingRuleSpec byTimeScalingRuleSpec) {
            this.byTimeScalingRuleSpec = byTimeScalingRuleSpec;
            return this;
        }

        /**
         * 冷却时间。单位为秒，取值范围在30~10800秒之间。
         */
        public Builder coolDownInterval(Integer coolDownInterval) {
            this.coolDownInterval = coolDownInterval;
            return this;
        }

        /**
         * 伸缩活动类型。
         */
        public Builder scalingActivityType(String scalingActivityType) {
            this.scalingActivityType = scalingActivityType;
            return this;
        }

        /**
         * 规则名称。
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * 伸缩规则类型。
         */
        public Builder scalingRuleType(String scalingRuleType) {
            this.scalingRuleType = scalingRuleType;
            return this;
        }

        public ScalingRuleSpec build() {
            return new ScalingRuleSpec(this);
        } 

    } 

    public static class ByLoadScalingRuleSpec extends TeaModel {
        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        private String comparisonOperator;

        @NameInMap("EvaluationCount")
        @Validation(required = true)
        private Integer evaluationCount;

        @NameInMap("MetricName")
        @Validation(required = true)
        private String metricName;

        @NameInMap("Statistics")
        @Validation(required = true)
        private String statistics;

        @NameInMap("Threshold")
        @Validation(required = true)
        private Double threshold;

        @NameInMap("TimeWindow")
        @Validation(required = true)
        private Integer timeWindow;

        private ByLoadScalingRuleSpec(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.evaluationCount = builder.evaluationCount;
            this.metricName = builder.metricName;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.timeWindow = builder.timeWindow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ByLoadScalingRuleSpec create() {
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
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
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
        public Double getThreshold() {
            return this.threshold;
        }

        /**
         * @return timeWindow
         */
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private Integer evaluationCount; 
            private String metricName; 
            private String statistics; 
            private Double threshold; 
            private Integer timeWindow; 

            /**
             * 比较符。
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * 统计次数。
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * 指标名称。指标名称需要在 ListAutoScalingMetrics 接口返回的指标名称列表中。
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * 统计量名称。
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * 阈值。
             */
            public Builder threshold(Double threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * 统计窗口。单位为秒。
             */
            public Builder timeWindow(Integer timeWindow) {
                this.timeWindow = timeWindow;
                return this;
            }

            public ByLoadScalingRuleSpec build() {
                return new ByLoadScalingRuleSpec(this);
            } 

        } 

    }
    public static class ByTimeScalingRuleSpec extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("LaunchTime")
        @Validation(required = true)
        private Long launchTime;

        @NameInMap("RecurrenceType")
        private String recurrenceType;

        @NameInMap("RecurrenceValue")
        private String recurrenceValue;

        private ByTimeScalingRuleSpec(Builder builder) {
            this.endTime = builder.endTime;
            this.launchTime = builder.launchTime;
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValue = builder.recurrenceValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ByTimeScalingRuleSpec create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return launchTime
         */
        public Long getLaunchTime() {
            return this.launchTime;
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

        public static final class Builder {
            private Long endTime; 
            private Long launchTime; 
            private String recurrenceType; 
            private String recurrenceValue; 

            /**
             * 重复执行定时任务的结束时间戳。单位为毫秒。
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 启动时间戳。单位为毫秒。
             */
            public Builder launchTime(Long launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * 指定时间规则的执行类型。
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * 重复执行定时任务的数值。具体取值取决于 recurrenceType 设置。
             */
            public Builder recurrenceValue(String recurrenceValue) {
                this.recurrenceValue = recurrenceValue;
                return this;
            }

            public ByTimeScalingRuleSpec build() {
                return new ByTimeScalingRuleSpec(this);
            } 

        } 

    }
}
