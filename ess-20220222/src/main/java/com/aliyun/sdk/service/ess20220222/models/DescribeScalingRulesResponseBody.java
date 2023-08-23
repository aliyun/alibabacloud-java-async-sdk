// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
    private java.util.List < ScalingRules> scalingRules;

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
    public java.util.List < ScalingRules> getScalingRules() {
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
        private java.util.List < ScalingRules> scalingRules; 
        private Integer totalCount; 

        /**
         * The number of entries returned per page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of scaling rules.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The scaling rules.
         */
        public Builder scalingRules(java.util.List < ScalingRules> scalingRules) {
            this.scalingRules = scalingRules;
            return this;
        }

        /**
         * Details of the scaling rules.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingRulesResponseBody build() {
            return new DescribeScalingRulesResponseBody(this);
        } 

    } 

    public static class AlarmDimensions extends TeaModel {
        @NameInMap("DimensionKey")
        private String dimensionKey;

        @NameInMap("DimensionValue")
        private String dimensionValue;

        private AlarmDimensions(Builder builder) {
            this.dimensionKey = builder.dimensionKey;
            this.dimensionValue = builder.dimensionValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmDimensions create() {
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
             * 监控项关联的维度信息键。
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * 监控项关联的维度信息值。
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            public AlarmDimensions build() {
                return new AlarmDimensions(this);
            } 

        } 

    }
    public static class Dimensions extends TeaModel {
        @NameInMap("DimensionKey")
        private String dimensionKey;

        @NameInMap("DimensionValue")
        private String dimensionValue;

        private Dimensions(Builder builder) {
            this.dimensionKey = builder.dimensionKey;
            this.dimensionValue = builder.dimensionValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
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
             * The value of the dimension that is associated with the metric.
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * The step adjustments of the step scaling rule.
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    public static class Alarms extends TeaModel {
        @NameInMap("AlarmTaskId")
        private String alarmTaskId;

        @NameInMap("AlarmTaskName")
        private String alarmTaskName;

        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("Dimensions")
        private java.util.List < Dimensions> dimensions;

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

        private Alarms(Builder builder) {
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

        public static Alarms create() {
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
        public java.util.List < Dimensions> getDimensions() {
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
            private java.util.List < Dimensions> dimensions; 
            private Integer evaluationCount; 
            private String metricName; 
            private String metricType; 
            private String statistics; 
            private Float threshold; 

            /**
             * The comparison operator between the metric value and the threshold for the event-triggered task that is associated with the scaling rule. The comparison operator indicates the relationship between the metric value and the threshold that is required to meet the condition.
             * <p>
             * 
             * *   Valid value if the metric value is greater than or equal to the threshold: >=.
             * *   Valid value if the metric value is less than or equal to the threshold: <=.
             * *   Valid value if the metric value is greater than the threshold: >.
             * *   Valid value if the metric value is less than the threshold: <.
             */
            public Builder alarmTaskId(String alarmTaskId) {
                this.alarmTaskId = alarmTaskId;
                return this;
            }

            /**
             * The type of the event-triggered task that is associated with the scaling rule. Valid values:
             * <p>
             * 
             * *   system: system monitoring event-triggered tasks
             * *   custom: custom monitoring event-triggered tasks
             */
            public Builder alarmTaskName(String alarmTaskName) {
                this.alarmTaskName = alarmTaskName;
                return this;
            }

            /**
             * The name of the metric of the event-triggered task that is associated with the scaling rule.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The dimensions of the event-triggered task that is associated with the scaling rule.
             */
            public Builder dimensions(java.util.List < Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * The name of the event-triggered task that is associated with the scaling rule.
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * The number of consecutive times for which the event-triggered task that is associated with the scaling rule meets the threshold expressions before an alert is triggered.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The alert threshold of the event-triggered task that is associated with the scaling rule.
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * The dimensions of the event-triggered task that is associated with the scaling rule.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The statistical method of the event-triggered task that is associated with the scaling rule. Valid values:
             * <p>
             * 
             * *   Average
             * *   Maximum
             * *   Minimum
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public Alarms build() {
                return new Alarms(this);
            } 

        } 

    }
    public static class StepAdjustments extends TeaModel {
        @NameInMap("MetricIntervalLowerBound")
        private Float metricIntervalLowerBound;

        @NameInMap("MetricIntervalUpperBound")
        private Float metricIntervalUpperBound;

        @NameInMap("ScalingAdjustment")
        private Integer scalingAdjustment;

        private StepAdjustments(Builder builder) {
            this.metricIntervalLowerBound = builder.metricIntervalLowerBound;
            this.metricIntervalUpperBound = builder.metricIntervalUpperBound;
            this.scalingAdjustment = builder.scalingAdjustment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepAdjustments create() {
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
             * auditing
             */
            public Builder metricIntervalLowerBound(Float metricIntervalLowerBound) {
                this.metricIntervalLowerBound = metricIntervalLowerBound;
                return this;
            }

            /**
             * The number of ECS instances that are scaled in a step adjustment.
             */
            public Builder metricIntervalUpperBound(Float metricIntervalUpperBound) {
                this.metricIntervalUpperBound = metricIntervalUpperBound;
                return this;
            }

            /**
             * The lower limit that is specified in a step adjustment. Valid values: -9.999999E18 to 9.999999E18.
             */
            public Builder scalingAdjustment(Integer scalingAdjustment) {
                this.scalingAdjustment = scalingAdjustment;
                return this;
            }

            public StepAdjustments build() {
                return new StepAdjustments(this);
            } 

        } 

    }
    public static class ScalingRules extends TeaModel {
        @NameInMap("AdjustmentType")
        private String adjustmentType;

        @NameInMap("AdjustmentValue")
        private Integer adjustmentValue;

        @NameInMap("AlarmDimensions")
        private java.util.List < AlarmDimensions> alarmDimensions;

        @NameInMap("Alarms")
        private java.util.List < Alarms> alarms;

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
        private java.util.List < StepAdjustments> stepAdjustments;

        @NameInMap("TargetValue")
        private Float targetValue;

        private ScalingRules(Builder builder) {
            this.adjustmentType = builder.adjustmentType;
            this.adjustmentValue = builder.adjustmentValue;
            this.alarmDimensions = builder.alarmDimensions;
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

        public static ScalingRules create() {
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
         * @return alarmDimensions
         */
        public java.util.List < AlarmDimensions> getAlarmDimensions() {
            return this.alarmDimensions;
        }

        /**
         * @return alarms
         */
        public java.util.List < Alarms> getAlarms() {
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
        public java.util.List < StepAdjustments> getStepAdjustments() {
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
            private java.util.List < AlarmDimensions> alarmDimensions; 
            private java.util.List < Alarms> alarms; 
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
            private java.util.List < StepAdjustments> stepAdjustments; 
            private Float targetValue; 

            /**
             * The maximum number of ECS instances in the scaling group. You must specify the InitialMaxSize and PredictiveValueBehavior parameters.
             */
            public Builder adjustmentType(String adjustmentType) {
                this.adjustmentType = adjustmentType;
                return this;
            }

            /**
             * The number of consecutive times that the event-triggered task created for scale-out activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.
             */
            public Builder adjustmentValue(Integer adjustmentValue) {
                this.adjustmentValue = adjustmentValue;
                return this;
            }

            /**
             * 监控项维度信息值，适用于目标追踪规则，当监控项需额外维度信息时设置，例如LoadBalancerRealServerAverageQps监控项需指定rulePool维度信息。
             */
            public Builder alarmDimensions(java.util.List < AlarmDimensions> alarmDimensions) {
                this.alarmDimensions = alarmDimensions;
                return this;
            }

            /**
             * The event-triggered tasks that are associated with the scaling rule. Event-triggered tasks that are associated with the scaling rule are returned only if you set the ShowAlarmRules parameter to true. Otherwise, an empty list is returned.
             */
            public Builder alarms(java.util.List < Alarms> alarms) {
                this.alarms = alarms;
                return this;
            }

            /**
             * The maximum number of ECS instances in the scaling group.
             */
            public Builder cooldown(Integer cooldown) {
                this.cooldown = cooldown;
                return this;
            }

            /**
             * The name of the scaling rule.
             */
            public Builder disableScaleIn(Boolean disableScaleIn) {
                this.disableScaleIn = disableScaleIn;
                return this;
            }

            /**
             * The number of consecutive times that the event-triggered task created for scale-in activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.
             */
            public Builder estimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
                this.estimatedInstanceWarmup = estimatedInstanceWarmup;
                return this;
            }

            /**
             * The warmup period of the ECS instance.
             */
            public Builder initialMaxSize(Integer initialMaxSize) {
                this.initialMaxSize = initialMaxSize;
                return this;
            }

            /**
             * The percentage of the increment to the predicted value when the PredictiveValueBehavior parameter is set to PredictiveValueOverrideMaxWithBuffer. If the predicted value increased by this percentage is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks. Valid values: 0 to 100.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * The scaling mode of the scaling rule. Valid values:
             * <p>
             * 
             * *   QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.
             * *   PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.
             * *   TotalCapacity: adjusts the number of ECS instances in the scaling group to the specified number.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The unique identifier of the scaling rule.
             */
            public Builder minAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
                this.minAdjustmentMagnitude = minAdjustmentMagnitude;
                return this;
            }

            /**
             * The ID of the scaling group.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * The minimum number of instances that must be scaled when the AdjustmentType parameter is set to PercentChangeInCapacity. This parameter takes effect only if you set the ScalingRuleType parameter to SimpleScalingRule or StepScalingRule.
             */
            public Builder predictiveScalingMode(String predictiveScalingMode) {
                this.predictiveScalingMode = predictiveScalingMode;
                return this;
            }

            /**
             * The minimum number of ECS instances in the scaling group.
             */
            public Builder predictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
                this.predictiveTaskBufferTime = predictiveTaskBufferTime;
                return this;
            }

            /**
             * The target value of the metric.
             */
            public Builder predictiveValueBehavior(String predictiveValueBehavior) {
                this.predictiveValueBehavior = predictiveValueBehavior;
                return this;
            }

            /**
             * The type of the scaling rule. Valid values:
             * <p>
             * 
             * *   SimpleScalingRule: adjusts the number of ECS instances based on the values of the AdjustmentType and AdjustmentValue parameters.
             * *   TargetTrackingScalingRule: calculates the number of ECS instances that need to be scaled in a dynamic manner and maintains the value of a predefined metric close to the value of the TargetValue parameter.
             * *   StepScalingRule: scales ECS instances in steps based on specified thresholds and metric values.
             * *   PredictiveScalingRule: uses machine learning to analyze historical monitoring data of the scaling group and predicts the future values of metrics. In addition, Auto Scaling automatically creates scheduled tasks to adjust the boundary values for the scaling group.
             */
            public Builder predictiveValueBuffer(Integer predictiveValueBuffer) {
                this.predictiveValueBuffer = predictiveValueBuffer;
                return this;
            }

            /**
             * Specifies whether to disable scale-in. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder scaleInEvaluationCount(Integer scaleInEvaluationCount) {
                this.scaleInEvaluationCount = scaleInEvaluationCount;
                return this;
            }

            /**
             * The mode of the predictive scaling rule. Valid values:
             * <p>
             * 
             * *   PredictAndScale: produces predictions and creates prediction tasks.
             * *   PredictOnly: produces predictions but does not create prediction tasks.
             */
            public Builder scaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
                this.scaleOutEvaluationCount = scaleOutEvaluationCount;
                return this;
            }

            /**
             * Specifies which one of the initial maximum capacity and the predicted value can be used as the maximum value for prediction tasks. Valid values:
             * <p>
             * 
             * *   MaxOverridePredictiveValue: uses the initial maximum capacity as the maximum value for prediction tasks if the predicted value is greater than the initial maximum capacity.
             * *   PredictiveValueOverrideMax: uses the predicted value as the maximum value for prediction tasks when the predicted value is greater than the initial maximum capacity.
             * *   PredictiveValueOverrideMaxWithBuffer: increases the predicted value by a percentage that is specified by the PredictiveValueBuffer parameter. If the predicted value that is increased by the percentage is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * The amount of buffer time before the prediction task is executed. By default, all scheduled tasks that are automatically created for a predictive scaling rule are executed on the hour. You can specify a buffer time for resource preparation before prediction tasks are executed. Valid values: 0 to 60. Unit: minutes.
             */
            public Builder scalingRuleAri(String scalingRuleAri) {
                this.scalingRuleAri = scalingRuleAri;
                return this;
            }

            /**
             * The event-triggered tasks that are associated with the scaling rule. Event-triggered tasks that are associated with the scaling rule are returned only if you set the ShowAlarmRules parameter to true. Otherwise, an empty list is returned.
             */
            public Builder scalingRuleId(String scalingRuleId) {
                this.scalingRuleId = scalingRuleId;
                return this;
            }

            /**
             * The ID of the scaling rule.
             */
            public Builder scalingRuleName(String scalingRuleName) {
                this.scalingRuleName = scalingRuleName;
                return this;
            }

            /**
             * The adjustment value that is specified in the scaling rule.
             */
            public Builder scalingRuleType(String scalingRuleType) {
                this.scalingRuleType = scalingRuleType;
                return this;
            }

            /**
             * The step adjustments of the step scaling rule.
             */
            public Builder stepAdjustments(java.util.List < StepAdjustments> stepAdjustments) {
                this.stepAdjustments = stepAdjustments;
                return this;
            }

            /**
             * The cooldown time of the scaling rule. This parameter is available only if you set the ScalingRuleType parameter to SimpleScalingRule. Valid values: 0 to 86400. Unit: seconds.
             */
            public Builder targetValue(Float targetValue) {
                this.targetValue = targetValue;
                return this;
            }

            public ScalingRules build() {
                return new ScalingRules(this);
            } 

        } 

    }
}
