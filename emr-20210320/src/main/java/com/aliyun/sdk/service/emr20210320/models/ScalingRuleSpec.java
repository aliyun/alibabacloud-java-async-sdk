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
 * {@link ScalingRuleSpec} extends {@link TeaModel}
 *
 * <p>ScalingRuleSpec</p>
 */
public class ScalingRuleSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdjustmentValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer adjustmentValue;

    @com.aliyun.core.annotation.NameInMap("ByLoadScalingRuleSpec")
    private ByLoadScalingRuleSpec byLoadScalingRuleSpec;

    @com.aliyun.core.annotation.NameInMap("ByTimeScalingRuleSpec")
    private ByTimeScalingRuleSpec byTimeScalingRuleSpec;

    @com.aliyun.core.annotation.NameInMap("CoolDownInterval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer coolDownInterval;

    @com.aliyun.core.annotation.NameInMap("ScalingActivityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingActivityType;

    @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingRuleName;

    @com.aliyun.core.annotation.NameInMap("ScalingRuleType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>调整值。需要为正数，代表需要扩容或者缩容的实例数量。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * <p>按照负载伸缩描述。</p>
         */
        public Builder byLoadScalingRuleSpec(ByLoadScalingRuleSpec byLoadScalingRuleSpec) {
            this.byLoadScalingRuleSpec = byLoadScalingRuleSpec;
            return this;
        }

        /**
         * <p>按照时间伸缩描述。</p>
         */
        public Builder byTimeScalingRuleSpec(ByTimeScalingRuleSpec byTimeScalingRuleSpec) {
            this.byTimeScalingRuleSpec = byTimeScalingRuleSpec;
            return this;
        }

        /**
         * <p>冷却时间。单位为秒，取值范围在30~10800秒之间。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder coolDownInterval(Integer coolDownInterval) {
            this.coolDownInterval = coolDownInterval;
            return this;
        }

        /**
         * <p>伸缩活动类型。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SCALE_IN</p>
         */
        public Builder scalingActivityType(String scalingActivityType) {
            this.scalingActivityType = scalingActivityType;
            return this;
        }

        /**
         * <p>规则名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scale-out-memory</p>
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * <p>伸缩规则类型。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_TIME</p>
         */
        public Builder scalingRuleType(String scalingRuleType) {
            this.scalingRuleType = scalingRuleType;
            return this;
        }

        public ScalingRuleSpec build() {
            return new ScalingRuleSpec(this);
        } 

    } 

    /**
     * 
     * {@link ScalingRuleSpec} extends {@link TeaModel}
     *
     * <p>ScalingRuleSpec</p>
     */
    public static class ByLoadScalingRuleSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer evaluationCount;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        @com.aliyun.core.annotation.Validation(required = true)
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double threshold;

        @com.aliyun.core.annotation.NameInMap("TimeWindow")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>比较符。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>LT</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>统计次数。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * <p>指标名称。指标名称需要在 ListAutoScalingMetrics 接口返回的指标名称列表中。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>yarn_resourcemanager_root_availablememoryusage</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>统计量名称。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AVG</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>阈值。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12.5</p>
             */
            public Builder threshold(Double threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>统计窗口。单位为秒。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
    /**
     * 
     * {@link ScalingRuleSpec} extends {@link TeaModel}
     *
     * <p>ScalingRuleSpec</p>
     */
    public static class ByTimeScalingRuleSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("LaunchTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long launchTime;

        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValue")
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
             * <p>重复执行定时任务的结束时间戳。单位为毫秒。</p>
             * 
             * <strong>example:</strong>
             * <p>1639714800000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>启动时间戳。单位为毫秒。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1639714634819</p>
             */
            public Builder launchTime(Long launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * <p>指定时间规则的执行类型。</p>
             * 
             * <strong>example:</strong>
             * <p>WEEKLY</p>
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * <p>重复执行定时任务的数值。具体取值取决于 recurrenceType 设置。</p>
             * 
             * <strong>example:</strong>
             * <p>MON,FRI,SUN</p>
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
