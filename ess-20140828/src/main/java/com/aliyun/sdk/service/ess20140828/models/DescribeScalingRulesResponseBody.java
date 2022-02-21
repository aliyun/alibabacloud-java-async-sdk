// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingRulesResponseBody</p>
 */
public class DescribeScalingRulesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingRules")
    private ScalingRules scalingRules;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScalingRulesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scalingRules = builder.scalingRules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingRulesResponseBody create() {
        return builder().build();
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
     * @return scalingRules
     */
    public ScalingRules getScalingRules() {
        return this.scalingRules;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private ScalingRules scalingRules; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * ScalingRules.
         */
        public Builder scalingRules(ScalingRules scalingRules) {
            this.scalingRules = scalingRules;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingRulesResponseBody build() {
            return new DescribeScalingRulesResponseBody(this);
        } 

    } 

    public static class Dimension extends TeaModel {
        @NameInMap("DimensionKey")
        private String dimensionKey;

        @NameInMap("DimensionValue")
        private String dimensionValue;

        private Dimension(Builder builder) {
            this.dimensionKey = builder.dimensionKey;
            this.dimensionValue = builder.dimensionValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimension create() {
            return builder().build();
        }

        /**
         * @return dimensionKey
         */
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        /**
         * @return dimensionValue
         */
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        public static final class Builder {
            private String dimensionKey; 
            private String dimensionValue; 

            /**
             * DimensionKey.
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * DimensionValue.
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            public Dimension build() {
                return new Dimension(this);
            } 

        } 

    }
    public static class Dimensions extends TeaModel {
        @NameInMap("Dimension")
        private java.util.List < Dimension> dimension;

        private Dimensions(Builder builder) {
            this.dimension = builder.dimension;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public java.util.List < Dimension> getDimension() {
            return this.dimension;
        }

        public static final class Builder {
            private java.util.List < Dimension> dimension; 

            /**
             * Dimension.
             */
            public Builder dimension(java.util.List < Dimension> dimension) {
                this.dimension = dimension;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    public static class Alarm extends TeaModel {
        @NameInMap("AlarmTaskId")
        private String alarmTaskId;

        @NameInMap("AlarmTaskName")
        private String alarmTaskName;

        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("Dimensions")
        private Dimensions dimensions;

        @NameInMap("EvaluationCount")
        private Integer evaluationCount;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("MetricType")
        private String metricType;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private Float threshold;

        private Alarm(Builder builder) {
            this.alarmTaskId = builder.alarmTaskId;
            this.alarmTaskName = builder.alarmTaskName;
            this.comparisonOperator = builder.comparisonOperator;
            this.dimensions = builder.dimensions;
            this.evaluationCount = builder.evaluationCount;
            this.metricName = builder.metricName;
            this.metricType = builder.metricType;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarm create() {
            return builder().build();
        }

        /**
         * @return alarmTaskId
         */
        public String getAlarmTaskId() {
            return this.alarmTaskId;
        }

        /**
         * @return alarmTaskName
         */
        public String getAlarmTaskName() {
            return this.alarmTaskName;
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return dimensions
         */
        public Dimensions getDimensions() {
            return this.dimensions;
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
         * @return metricType
         */
        public String getMetricType() {
            return this.metricType;
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
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String alarmTaskId; 
            private String alarmTaskName; 
            private String comparisonOperator; 
            private Dimensions dimensions; 
            private Integer evaluationCount; 
            private String metricName; 
            private String metricType; 
            private String statistics; 
            private Float threshold; 

            /**
             * AlarmTaskId.
             */
            public Builder alarmTaskId(String alarmTaskId) {
                this.alarmTaskId = alarmTaskId;
                return this;
            }

            /**
             * AlarmTaskName.
             */
            public Builder alarmTaskName(String alarmTaskName) {
                this.alarmTaskName = alarmTaskName;
                return this;
            }

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * Dimensions.
             */
            public Builder dimensions(Dimensions dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * EvaluationCount.
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * MetricType.
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public Alarm build() {
                return new Alarm(this);
            } 

        } 

    }
    public static class Alarms extends TeaModel {
        @NameInMap("Alarm")
        private java.util.List < Alarm> alarm;

        private Alarms(Builder builder) {
            this.alarm = builder.alarm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarms create() {
            return builder().build();
        }

        /**
         * @return alarm
         */
        public java.util.List < Alarm> getAlarm() {
            return this.alarm;
        }

        public static final class Builder {
            private java.util.List < Alarm> alarm; 

            /**
             * Alarm.
             */
            public Builder alarm(java.util.List < Alarm> alarm) {
                this.alarm = alarm;
                return this;
            }

            public Alarms build() {
                return new Alarms(this);
            } 

        } 

    }
    public static class StepAdjustment extends TeaModel {
        @NameInMap("MetricIntervalLowerBound")
        private Float metricIntervalLowerBound;

        @NameInMap("MetricIntervalUpperBound")
        private Float metricIntervalUpperBound;

        @NameInMap("ScalingAdjustment")
        private Integer scalingAdjustment;

        private StepAdjustment(Builder builder) {
            this.metricIntervalLowerBound = builder.metricIntervalLowerBound;
            this.metricIntervalUpperBound = builder.metricIntervalUpperBound;
            this.scalingAdjustment = builder.scalingAdjustment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepAdjustment create() {
            return builder().build();
        }

        /**
         * @return metricIntervalLowerBound
         */
        public Float getMetricIntervalLowerBound() {
            return this.metricIntervalLowerBound;
        }

        /**
         * @return metricIntervalUpperBound
         */
        public Float getMetricIntervalUpperBound() {
            return this.metricIntervalUpperBound;
        }

        /**
         * @return scalingAdjustment
         */
        public Integer getScalingAdjustment() {
            return this.scalingAdjustment;
        }

        public static final class Builder {
            private Float metricIntervalLowerBound; 
            private Float metricIntervalUpperBound; 
            private Integer scalingAdjustment; 

            /**
             * MetricIntervalLowerBound.
             */
            public Builder metricIntervalLowerBound(Float metricIntervalLowerBound) {
                this.metricIntervalLowerBound = metricIntervalLowerBound;
                return this;
            }

            /**
             * MetricIntervalUpperBound.
             */
            public Builder metricIntervalUpperBound(Float metricIntervalUpperBound) {
                this.metricIntervalUpperBound = metricIntervalUpperBound;
                return this;
            }

            /**
             * ScalingAdjustment.
             */
            public Builder scalingAdjustment(Integer scalingAdjustment) {
                this.scalingAdjustment = scalingAdjustment;
                return this;
            }

            public StepAdjustment build() {
                return new StepAdjustment(this);
            } 

        } 

    }
    public static class StepAdjustments extends TeaModel {
        @NameInMap("StepAdjustment")
        private java.util.List < StepAdjustment> stepAdjustment;

        private StepAdjustments(Builder builder) {
            this.stepAdjustment = builder.stepAdjustment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepAdjustments create() {
            return builder().build();
        }

        /**
         * @return stepAdjustment
         */
        public java.util.List < StepAdjustment> getStepAdjustment() {
            return this.stepAdjustment;
        }

        public static final class Builder {
            private java.util.List < StepAdjustment> stepAdjustment; 

            /**
             * StepAdjustment.
             */
            public Builder stepAdjustment(java.util.List < StepAdjustment> stepAdjustment) {
                this.stepAdjustment = stepAdjustment;
                return this;
            }

            public StepAdjustments build() {
                return new StepAdjustments(this);
            } 

        } 

    }
    public static class ScalingRule extends TeaModel {
        @NameInMap("AdjustmentType")
        private String adjustmentType;

        @NameInMap("AdjustmentValue")
        private Integer adjustmentValue;

        @NameInMap("Alarms")
        private Alarms alarms;

        @NameInMap("Cooldown")
        private Integer cooldown;

        @NameInMap("DisableScaleIn")
        private Boolean disableScaleIn;

        @NameInMap("EstimatedInstanceWarmup")
        private Integer estimatedInstanceWarmup;

        @NameInMap("InitialMaxSize")
        private Integer initialMaxSize;

        @NameInMap("MaxSize")
        private Integer maxSize;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("MinAdjustmentMagnitude")
        private Integer minAdjustmentMagnitude;

        @NameInMap("MinSize")
        private Integer minSize;

        @NameInMap("PredictiveScalingMode")
        private String predictiveScalingMode;

        @NameInMap("PredictiveTaskBufferTime")
        private Integer predictiveTaskBufferTime;

        @NameInMap("PredictiveValueBehavior")
        private String predictiveValueBehavior;

        @NameInMap("PredictiveValueBuffer")
        private Integer predictiveValueBuffer;

        @NameInMap("ScaleInEvaluationCount")
        private Integer scaleInEvaluationCount;

        @NameInMap("ScaleOutEvaluationCount")
        private Integer scaleOutEvaluationCount;

        @NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @NameInMap("ScalingRuleAri")
        private String scalingRuleAri;

        @NameInMap("ScalingRuleId")
        private String scalingRuleId;

        @NameInMap("ScalingRuleName")
        private String scalingRuleName;

        @NameInMap("ScalingRuleType")
        private String scalingRuleType;

        @NameInMap("StepAdjustments")
        private StepAdjustments stepAdjustments;

        @NameInMap("TargetValue")
        private Float targetValue;

        private ScalingRule(Builder builder) {
            this.adjustmentType = builder.adjustmentType;
            this.adjustmentValue = builder.adjustmentValue;
            this.alarms = builder.alarms;
            this.cooldown = builder.cooldown;
            this.disableScaleIn = builder.disableScaleIn;
            this.estimatedInstanceWarmup = builder.estimatedInstanceWarmup;
            this.initialMaxSize = builder.initialMaxSize;
            this.maxSize = builder.maxSize;
            this.metricName = builder.metricName;
            this.minAdjustmentMagnitude = builder.minAdjustmentMagnitude;
            this.minSize = builder.minSize;
            this.predictiveScalingMode = builder.predictiveScalingMode;
            this.predictiveTaskBufferTime = builder.predictiveTaskBufferTime;
            this.predictiveValueBehavior = builder.predictiveValueBehavior;
            this.predictiveValueBuffer = builder.predictiveValueBuffer;
            this.scaleInEvaluationCount = builder.scaleInEvaluationCount;
            this.scaleOutEvaluationCount = builder.scaleOutEvaluationCount;
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingRuleAri = builder.scalingRuleAri;
            this.scalingRuleId = builder.scalingRuleId;
            this.scalingRuleName = builder.scalingRuleName;
            this.scalingRuleType = builder.scalingRuleType;
            this.stepAdjustments = builder.stepAdjustments;
            this.targetValue = builder.targetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingRule create() {
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
         * @return alarms
         */
        public Alarms getAlarms() {
            return this.alarms;
        }

        /**
         * @return cooldown
         */
        public Integer getCooldown() {
            return this.cooldown;
        }

        /**
         * @return disableScaleIn
         */
        public Boolean getDisableScaleIn() {
            return this.disableScaleIn;
        }

        /**
         * @return estimatedInstanceWarmup
         */
        public Integer getEstimatedInstanceWarmup() {
            return this.estimatedInstanceWarmup;
        }

        /**
         * @return initialMaxSize
         */
        public Integer getInitialMaxSize() {
            return this.initialMaxSize;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return minAdjustmentMagnitude
         */
        public Integer getMinAdjustmentMagnitude() {
            return this.minAdjustmentMagnitude;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return predictiveScalingMode
         */
        public String getPredictiveScalingMode() {
            return this.predictiveScalingMode;
        }

        /**
         * @return predictiveTaskBufferTime
         */
        public Integer getPredictiveTaskBufferTime() {
            return this.predictiveTaskBufferTime;
        }

        /**
         * @return predictiveValueBehavior
         */
        public String getPredictiveValueBehavior() {
            return this.predictiveValueBehavior;
        }

        /**
         * @return predictiveValueBuffer
         */
        public Integer getPredictiveValueBuffer() {
            return this.predictiveValueBuffer;
        }

        /**
         * @return scaleInEvaluationCount
         */
        public Integer getScaleInEvaluationCount() {
            return this.scaleInEvaluationCount;
        }

        /**
         * @return scaleOutEvaluationCount
         */
        public Integer getScaleOutEvaluationCount() {
            return this.scaleOutEvaluationCount;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return scalingRuleAri
         */
        public String getScalingRuleAri() {
            return this.scalingRuleAri;
        }

        /**
         * @return scalingRuleId
         */
        public String getScalingRuleId() {
            return this.scalingRuleId;
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

        /**
         * @return stepAdjustments
         */
        public StepAdjustments getStepAdjustments() {
            return this.stepAdjustments;
        }

        /**
         * @return targetValue
         */
        public Float getTargetValue() {
            return this.targetValue;
        }

        public static final class Builder {
            private String adjustmentType; 
            private Integer adjustmentValue; 
            private Alarms alarms; 
            private Integer cooldown; 
            private Boolean disableScaleIn; 
            private Integer estimatedInstanceWarmup; 
            private Integer initialMaxSize; 
            private Integer maxSize; 
            private String metricName; 
            private Integer minAdjustmentMagnitude; 
            private Integer minSize; 
            private String predictiveScalingMode; 
            private Integer predictiveTaskBufferTime; 
            private String predictiveValueBehavior; 
            private Integer predictiveValueBuffer; 
            private Integer scaleInEvaluationCount; 
            private Integer scaleOutEvaluationCount; 
            private String scalingGroupId; 
            private String scalingRuleAri; 
            private String scalingRuleId; 
            private String scalingRuleName; 
            private String scalingRuleType; 
            private StepAdjustments stepAdjustments; 
            private Float targetValue; 

            /**
             * AdjustmentType.
             */
            public Builder adjustmentType(String adjustmentType) {
                this.adjustmentType = adjustmentType;
                return this;
            }

            /**
             * AdjustmentValue.
             */
            public Builder adjustmentValue(Integer adjustmentValue) {
                this.adjustmentValue = adjustmentValue;
                return this;
            }

            /**
             * Alarms.
             */
            public Builder alarms(Alarms alarms) {
                this.alarms = alarms;
                return this;
            }

            /**
             * Cooldown.
             */
            public Builder cooldown(Integer cooldown) {
                this.cooldown = cooldown;
                return this;
            }

            /**
             * DisableScaleIn.
             */
            public Builder disableScaleIn(Boolean disableScaleIn) {
                this.disableScaleIn = disableScaleIn;
                return this;
            }

            /**
             * EstimatedInstanceWarmup.
             */
            public Builder estimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
                this.estimatedInstanceWarmup = estimatedInstanceWarmup;
                return this;
            }

            /**
             * InitialMaxSize.
             */
            public Builder initialMaxSize(Integer initialMaxSize) {
                this.initialMaxSize = initialMaxSize;
                return this;
            }

            /**
             * MaxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * MinAdjustmentMagnitude.
             */
            public Builder minAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
                this.minAdjustmentMagnitude = minAdjustmentMagnitude;
                return this;
            }

            /**
             * MinSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * PredictiveScalingMode.
             */
            public Builder predictiveScalingMode(String predictiveScalingMode) {
                this.predictiveScalingMode = predictiveScalingMode;
                return this;
            }

            /**
             * PredictiveTaskBufferTime.
             */
            public Builder predictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
                this.predictiveTaskBufferTime = predictiveTaskBufferTime;
                return this;
            }

            /**
             * PredictiveValueBehavior.
             */
            public Builder predictiveValueBehavior(String predictiveValueBehavior) {
                this.predictiveValueBehavior = predictiveValueBehavior;
                return this;
            }

            /**
             * PredictiveValueBuffer.
             */
            public Builder predictiveValueBuffer(Integer predictiveValueBuffer) {
                this.predictiveValueBuffer = predictiveValueBuffer;
                return this;
            }

            /**
             * ScaleInEvaluationCount.
             */
            public Builder scaleInEvaluationCount(Integer scaleInEvaluationCount) {
                this.scaleInEvaluationCount = scaleInEvaluationCount;
                return this;
            }

            /**
             * ScaleOutEvaluationCount.
             */
            public Builder scaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
                this.scaleOutEvaluationCount = scaleOutEvaluationCount;
                return this;
            }

            /**
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * ScalingRuleAri.
             */
            public Builder scalingRuleAri(String scalingRuleAri) {
                this.scalingRuleAri = scalingRuleAri;
                return this;
            }

            /**
             * ScalingRuleId.
             */
            public Builder scalingRuleId(String scalingRuleId) {
                this.scalingRuleId = scalingRuleId;
                return this;
            }

            /**
             * ScalingRuleName.
             */
            public Builder scalingRuleName(String scalingRuleName) {
                this.scalingRuleName = scalingRuleName;
                return this;
            }

            /**
             * ScalingRuleType.
             */
            public Builder scalingRuleType(String scalingRuleType) {
                this.scalingRuleType = scalingRuleType;
                return this;
            }

            /**
             * StepAdjustments.
             */
            public Builder stepAdjustments(StepAdjustments stepAdjustments) {
                this.stepAdjustments = stepAdjustments;
                return this;
            }

            /**
             * TargetValue.
             */
            public Builder targetValue(Float targetValue) {
                this.targetValue = targetValue;
                return this;
            }

            public ScalingRule build() {
                return new ScalingRule(this);
            } 

        } 

    }
    public static class ScalingRules extends TeaModel {
        @NameInMap("ScalingRule")
        private java.util.List < ScalingRule> scalingRule;

        private ScalingRules(Builder builder) {
            this.scalingRule = builder.scalingRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingRules create() {
            return builder().build();
        }

        /**
         * @return scalingRule
         */
        public java.util.List < ScalingRule> getScalingRule() {
            return this.scalingRule;
        }

        public static final class Builder {
            private java.util.List < ScalingRule> scalingRule; 

            /**
             * ScalingRule.
             */
            public Builder scalingRule(java.util.List < ScalingRule> scalingRule) {
                this.scalingRule = scalingRule;
                return this;
            }

            public ScalingRules build() {
                return new ScalingRules(this);
            } 

        } 

    }
}
