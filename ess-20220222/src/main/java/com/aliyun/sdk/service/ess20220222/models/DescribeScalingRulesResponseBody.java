// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingRulesResponseBody</p>
 */
public class DescribeScalingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingRules")
    private java.util.List < ScalingRules> scalingRules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
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
         * The total number of scaling rules.
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
        @com.aliyun.core.annotation.NameInMap("DimensionKey")
        private String dimensionKey;

        @com.aliyun.core.annotation.NameInMap("DimensionValue")
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
             * The dimension key of the metric.
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * The dimension value of the metric.
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
        @com.aliyun.core.annotation.NameInMap("DimensionKey")
        private String dimensionKey;

        @com.aliyun.core.annotation.NameInMap("DimensionValue")
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
             * The key of the dimension that is associated with the metric. Valid values:
             * <p>
             * 
             * *   ScalingGroupId: the ID of the scaling group.
             * *   userId: the ID of the user account.
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * The value of the dimension that is associated with the metric.
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
        @com.aliyun.core.annotation.NameInMap("AlarmTaskId")
        private String alarmTaskId;

        @com.aliyun.core.annotation.NameInMap("AlarmTaskName")
        private String alarmTaskName;

        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List < Dimensions> dimensions;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        private Integer evaluationCount;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private String metricType;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
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
             * The ID of the event-triggered task that is associated with the scaling rule.
             */
            public Builder alarmTaskId(String alarmTaskId) {
                this.alarmTaskId = alarmTaskId;
                return this;
            }

            /**
             * The name of the event-triggered task that is associated with the scaling rule.
             */
            public Builder alarmTaskName(String alarmTaskName) {
                this.alarmTaskName = alarmTaskName;
                return this;
            }

            /**
             * The comparison operator between the statistical value and the threshold of the metric of the event-triggered task that is associated with the scaling rule. The comparison operator indicates the relationship in which the metric value and the metric threshold can meet the alert condition.
             * <p>
             * 
             * *   Valid value if the metric value is greater than or equal to the threshold: >=
             * *   Valid value if the metric value is less than or equal to the threshold: <=
             * *   Valid value if the metric value is greater than the threshold: >
             * *   Valid value if the metric value is less than the threshold: <
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
             * The number of consecutive times when the event-triggered task that is associated with the scaling rule must meet the alert condition before an alert is triggered.
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * The name of the metric of the event-triggered task that is associated with the scaling rule.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The type of the metric of the event-triggered task that is associated with the scaling rule. Valid values:
             * <p>
             * 
             * *   system: system metrics
             * *   custom: custom metrics
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
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
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The alert threshold of the event-triggered task that is associated with the scaling rule.
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
        @com.aliyun.core.annotation.NameInMap("MetricIntervalLowerBound")
        private Float metricIntervalLowerBound;

        @com.aliyun.core.annotation.NameInMap("MetricIntervalUpperBound")
        private Float metricIntervalUpperBound;

        @com.aliyun.core.annotation.NameInMap("ScalingAdjustment")
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
             * The lower limit of a step adjustment. Valid values: -9.999999E18 to 9.999999E18.
             */
            public Builder metricIntervalLowerBound(Float metricIntervalLowerBound) {
                this.metricIntervalLowerBound = metricIntervalLowerBound;
                return this;
            }

            /**
             * The upper limit of a step adjustment. Valid values: -9.999999E18 to 9.999999E18.
             */
            public Builder metricIntervalUpperBound(Float metricIntervalUpperBound) {
                this.metricIntervalUpperBound = metricIntervalUpperBound;
                return this;
            }

            /**
             * The number of ECS instances that are scaled in a step adjustment.
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
        @com.aliyun.core.annotation.NameInMap("AdjustmentType")
        private String adjustmentType;

        @com.aliyun.core.annotation.NameInMap("AdjustmentValue")
        private Integer adjustmentValue;

        @com.aliyun.core.annotation.NameInMap("AlarmDimensions")
        private java.util.List < AlarmDimensions> alarmDimensions;

        @com.aliyun.core.annotation.NameInMap("Alarms")
        private java.util.List < Alarms> alarms;

        @com.aliyun.core.annotation.NameInMap("Cooldown")
        private Integer cooldown;

        @com.aliyun.core.annotation.NameInMap("DisableScaleIn")
        private Boolean disableScaleIn;

        @com.aliyun.core.annotation.NameInMap("EstimatedInstanceWarmup")
        private Integer estimatedInstanceWarmup;

        @com.aliyun.core.annotation.NameInMap("InitialMaxSize")
        private Integer initialMaxSize;

        @com.aliyun.core.annotation.NameInMap("MaxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("MinAdjustmentMagnitude")
        private Integer minAdjustmentMagnitude;

        @com.aliyun.core.annotation.NameInMap("MinSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("PredictiveScalingMode")
        private String predictiveScalingMode;

        @com.aliyun.core.annotation.NameInMap("PredictiveTaskBufferTime")
        private Integer predictiveTaskBufferTime;

        @com.aliyun.core.annotation.NameInMap("PredictiveValueBehavior")
        private String predictiveValueBehavior;

        @com.aliyun.core.annotation.NameInMap("PredictiveValueBuffer")
        private Integer predictiveValueBuffer;

        @com.aliyun.core.annotation.NameInMap("ScaleInEvaluationCount")
        private Integer scaleInEvaluationCount;

        @com.aliyun.core.annotation.NameInMap("ScaleOutEvaluationCount")
        private Integer scaleOutEvaluationCount;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingRuleAri")
        private String scalingRuleAri;

        @com.aliyun.core.annotation.NameInMap("ScalingRuleId")
        private String scalingRuleId;

        @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
        private String scalingRuleName;

        @com.aliyun.core.annotation.NameInMap("ScalingRuleType")
        private String scalingRuleType;

        @com.aliyun.core.annotation.NameInMap("StepAdjustments")
        private java.util.List < StepAdjustments> stepAdjustments;

        @com.aliyun.core.annotation.NameInMap("TargetValue")
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
             * The adjustment method of the scaling rule. Valid values:
             * <p>
             * 
             * *   QuantityChangeInCapacity: adds or removes the specified number of Elastic Compute Service (ECS) instances to or from the scaling group.
             * *   PercentChangeInCapacity: adds or removes the specified percentage of ECS instances to or from the scaling group.
             * *   TotalCapacity: adjusts the number of ECS instances in the scaling group to the specified number.
             */
            public Builder adjustmentType(String adjustmentType) {
                this.adjustmentType = adjustmentType;
                return this;
            }

            /**
             * The number of instances that must be scaled based on the scaling rule.
             */
            public Builder adjustmentValue(Integer adjustmentValue) {
                this.adjustmentValue = adjustmentValue;
                return this;
            }

            /**
             * The dimensions. This parameter is applicable to target tracking scaling rules. You can specify this parameter if your predefined metric requires extra dimensions. For example, if you predefine the LoadBalancerRealServerAverageQps metric, you must use this parameter to specify the rulePool dimension.
             */
            public Builder alarmDimensions(java.util.List < AlarmDimensions> alarmDimensions) {
                this.alarmDimensions = alarmDimensions;
                return this;
            }

            /**
             * The event-triggered tasks that are associated with the scaling rule. The value of this parameter is returned only if you set ShowAlarmRules to true. Otherwise, null is returned.
             */
            public Builder alarms(java.util.List < Alarms> alarms) {
                this.alarms = alarms;
                return this;
            }

            /**
             * The cooldown period of the scaling rule. This parameter is available only if you set ScalingRuleType to SimpleScalingRule. Valid values: 0 to 86400. Unit: seconds.
             */
            public Builder cooldown(Integer cooldown) {
                this.cooldown = cooldown;
                return this;
            }

            /**
             * Indicates whether scale-in is disabled. This parameter takes effect only if you set ScalingRuleType to TargetTrackingScalingRule. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder disableScaleIn(Boolean disableScaleIn) {
                this.disableScaleIn = disableScaleIn;
                return this;
            }

            /**
             * The warm-up period of instances. During the warm-up period, a series of preparation measures are taken for the new instances. Performance metrics of instances being warmed up are not counted towards the monitoring range.
             */
            public Builder estimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
                this.estimatedInstanceWarmup = estimatedInstanceWarmup;
                return this;
            }

            /**
             * The maximum number of ECS instances that can be contained in the scaling group. If you specify this parameter, you must also specify PredictiveValueBehavior.
             */
            public Builder initialMaxSize(Integer initialMaxSize) {
                this.initialMaxSize = initialMaxSize;
                return this;
            }

            /**
             * The maximum number of ECS instances that can be contained in the scaling group.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * The name of the metric of the event-triggered task that is associated with the scaling rule.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The minimum number of instances that must be scaled. This parameter takes effect only if you set ScalingRuleType to SimpleScalingRule or StepScalingRule and set AdjustmentType to PercentChangeInCapacity.
             */
            public Builder minAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
                this.minAdjustmentMagnitude = minAdjustmentMagnitude;
                return this;
            }

            /**
             * The minimum number of ECS instances that must be contained in the scaling group.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * The mode of the predictive scaling rule. Valid values:
             * <p>
             * 
             * *   PredictAndScale: provides predictions and creates prediction tasks.
             * *   PredictOnly: provides predictions but does not create prediction tasks.
             */
            public Builder predictiveScalingMode(String predictiveScalingMode) {
                this.predictiveScalingMode = predictiveScalingMode;
                return this;
            }

            /**
             * The amount of buffer time before prediction tasks are executed. By default, all prediction tasks that are automatically created based on a predictive scaling rule are executed on the hour. You can specify a buffer time for resource preparation before prediction tasks are executed. Valid values: 0 to 60. Unit: minutes.
             */
            public Builder predictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
                this.predictiveTaskBufferTime = predictiveTaskBufferTime;
                return this;
            }

            /**
             * The action on the predicted maximum value. Valid values:
             * <p>
             * 
             * *   MaxOverridePredictiveValue: uses the initial maximum capacity as the maximum value for prediction tasks if the predicted value is greater than the initial maximum capacity.
             * *   PredictiveValueOverrideMax: uses the predicted value as the maximum value for prediction tasks when the predicted value is greater than the initial maximum capacity.
             * *   PredictiveValueOverrideMaxWithBuffer: increases the predicted value by a ratio that is specified by PredictiveValueBuffer, and uses the increased value as the maximum value for prediction tasks if the predicted value increased by this ratio is greater than the initial maximum capacity.
             */
            public Builder predictiveValueBehavior(String predictiveValueBehavior) {
                this.predictiveValueBehavior = predictiveValueBehavior;
                return this;
            }

            /**
             * The ratio based on which the predicted value is increased when PredictiveValueBehavior is set to PredictiveValueOverrideMaxWithBuffer. If the predicted value increased by this ratio is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks. Valid values: 0 to 100.
             */
            public Builder predictiveValueBuffer(Integer predictiveValueBuffer) {
                this.predictiveValueBuffer = predictiveValueBuffer;
                return this;
            }

            /**
             * The number of consecutive times that the event-triggered task for scale-in purposes must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and associated with the target tracking scaling rule.
             */
            public Builder scaleInEvaluationCount(Integer scaleInEvaluationCount) {
                this.scaleInEvaluationCount = scaleInEvaluationCount;
                return this;
            }

            /**
             * The number of consecutive times that the event-triggered task created for scale-out purposes must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and associated with the target tracking scaling rule.
             */
            public Builder scaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
                this.scaleOutEvaluationCount = scaleOutEvaluationCount;
                return this;
            }

            /**
             * The ID of the scaling group.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * The unique identifier of the scaling rule.
             */
            public Builder scalingRuleAri(String scalingRuleAri) {
                this.scalingRuleAri = scalingRuleAri;
                return this;
            }

            /**
             * The ID of the scaling rule.
             */
            public Builder scalingRuleId(String scalingRuleId) {
                this.scalingRuleId = scalingRuleId;
                return this;
            }

            /**
             * The name of the scaling rule.
             */
            public Builder scalingRuleName(String scalingRuleName) {
                this.scalingRuleName = scalingRuleName;
                return this;
            }

            /**
             * The type of the scaling rule. Valid values:
             * <p>
             * 
             * *   SimpleScalingRule: a simple scaling rule. Once a simple scaling rule is executed, Auto Scaling adjusts the number of ECS instances in the scaling group based on the values of AdjustmentType and AdjustmentValue.
             * *   TargetTrackingScalingRule: a target tracking scaling rule. Once a target tracking scaling rule is executed, Auto Scaling dynamically calculates the number of ECS instances or elastic container instances to scale based on the predefined metric (MetricName) and attempts to maintain the metric value close to the specified target value (TargetValue).
             * *   StepScalingRule: a step scaling rule. Once a step scaling rule is executed, Auto Scaling scales instances step by step based on the predefined thresholds and metric values.
             * *   PredictiveScalingRule: a predictive scaling rule. Once a predictive scaling rule is executed, Auto Scaling analyzes the historical monitoring data based on the machine learning technology and predicts the trends of metric data. Auto Scaling also creates scheduled tasks to enable dynamic adjustment of the boundary values for the scaling group.
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
             * The target value of the metric. If you set ScalingRuleType to TargetTrackingScalingRule or PredictiveScalingRule, Auto Scaling keeps the metric value close to the target value by adding instances to or removing instances from the scaling group.
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
