// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateScalingRuleRequest</p>
 */
public class CreateScalingRuleRequest extends Request {
    @Query
    @NameInMap("AdjustmentType")
    private String adjustmentType;

    @Query
    @NameInMap("AdjustmentValue")
    private Integer adjustmentValue;

    @Query
    @NameInMap("AlarmDimensions")
    private java.util.List < AlarmDimensions> alarmDimensions;

    @Query
    @NameInMap("Cooldown")
    private Integer cooldown;

    @Query
    @NameInMap("DisableScaleIn")
    private Boolean disableScaleIn;

    @Query
    @NameInMap("EstimatedInstanceWarmup")
    private Integer estimatedInstanceWarmup;

    @Query
    @NameInMap("InitialMaxSize")
    private Integer initialMaxSize;

    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("MinAdjustmentMagnitude")
    private Integer minAdjustmentMagnitude;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PredictiveScalingMode")
    private String predictiveScalingMode;

    @Query
    @NameInMap("PredictiveTaskBufferTime")
    private Integer predictiveTaskBufferTime;

    @Query
    @NameInMap("PredictiveValueBehavior")
    private String predictiveValueBehavior;

    @Query
    @NameInMap("PredictiveValueBuffer")
    private Integer predictiveValueBuffer;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScaleInEvaluationCount")
    private Integer scaleInEvaluationCount;

    @Query
    @NameInMap("ScaleOutEvaluationCount")
    private Integer scaleOutEvaluationCount;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    @Query
    @NameInMap("ScalingRuleName")
    private String scalingRuleName;

    @Query
    @NameInMap("ScalingRuleType")
    private String scalingRuleType;

    @Query
    @NameInMap("StepAdjustments")
    private java.util.List < StepAdjustments> stepAdjustments;

    @Query
    @NameInMap("TargetValue")
    private Float targetValue;

    private CreateScalingRuleRequest(Builder builder) {
        super(builder);
        this.adjustmentType = builder.adjustmentType;
        this.adjustmentValue = builder.adjustmentValue;
        this.alarmDimensions = builder.alarmDimensions;
        this.cooldown = builder.cooldown;
        this.disableScaleIn = builder.disableScaleIn;
        this.estimatedInstanceWarmup = builder.estimatedInstanceWarmup;
        this.initialMaxSize = builder.initialMaxSize;
        this.metricName = builder.metricName;
        this.minAdjustmentMagnitude = builder.minAdjustmentMagnitude;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.predictiveScalingMode = builder.predictiveScalingMode;
        this.predictiveTaskBufferTime = builder.predictiveTaskBufferTime;
        this.predictiveValueBehavior = builder.predictiveValueBehavior;
        this.predictiveValueBuffer = builder.predictiveValueBuffer;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scaleInEvaluationCount = builder.scaleInEvaluationCount;
        this.scaleOutEvaluationCount = builder.scaleOutEvaluationCount;
        this.scalingGroupId = builder.scalingGroupId;
        this.scalingRuleName = builder.scalingRuleName;
        this.scalingRuleType = builder.scalingRuleType;
        this.stepAdjustments = builder.stepAdjustments;
        this.targetValue = builder.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScalingRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
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

    public static final class Builder extends Request.Builder<CreateScalingRuleRequest, Builder> {
        private String adjustmentType; 
        private Integer adjustmentValue; 
        private java.util.List < AlarmDimensions> alarmDimensions; 
        private Integer cooldown; 
        private Boolean disableScaleIn; 
        private Integer estimatedInstanceWarmup; 
        private Integer initialMaxSize; 
        private String metricName; 
        private Integer minAdjustmentMagnitude; 
        private String ownerAccount; 
        private Long ownerId; 
        private String predictiveScalingMode; 
        private Integer predictiveTaskBufferTime; 
        private String predictiveValueBehavior; 
        private Integer predictiveValueBuffer; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Integer scaleInEvaluationCount; 
        private Integer scaleOutEvaluationCount; 
        private String scalingGroupId; 
        private String scalingRuleName; 
        private String scalingRuleType; 
        private java.util.List < StepAdjustments> stepAdjustments; 
        private Float targetValue; 

        private Builder() {
            super();
        } 

        private Builder(CreateScalingRuleRequest request) {
            super(request);
            this.adjustmentType = request.adjustmentType;
            this.adjustmentValue = request.adjustmentValue;
            this.alarmDimensions = request.alarmDimensions;
            this.cooldown = request.cooldown;
            this.disableScaleIn = request.disableScaleIn;
            this.estimatedInstanceWarmup = request.estimatedInstanceWarmup;
            this.initialMaxSize = request.initialMaxSize;
            this.metricName = request.metricName;
            this.minAdjustmentMagnitude = request.minAdjustmentMagnitude;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.predictiveScalingMode = request.predictiveScalingMode;
            this.predictiveTaskBufferTime = request.predictiveTaskBufferTime;
            this.predictiveValueBehavior = request.predictiveValueBehavior;
            this.predictiveValueBuffer = request.predictiveValueBuffer;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scaleInEvaluationCount = request.scaleInEvaluationCount;
            this.scaleOutEvaluationCount = request.scaleOutEvaluationCount;
            this.scalingGroupId = request.scalingGroupId;
            this.scalingRuleName = request.scalingRuleName;
            this.scalingRuleType = request.scalingRuleType;
            this.stepAdjustments = request.stepAdjustments;
            this.targetValue = request.targetValue;
        } 

        /**
         * The number of instances that must be scaled based on the scaling rule. This parameter is required only if you set the ScalingRuleType parameter to SimpleScalingRule or StepScalingRule. The number of ECS instances that are scaled in a single scaling activity cannot exceed 1,000.
         * <p>
         * 
         * *   Valid values if you set the AdjustmentType parameter to QuantityChangeInCapacity: -1000 to 1000.
         * *   Valid values if you set the AdjustmentType parameter to PercentChangeInCapacity: -100 to 10000.
         * *   Valid values if you set the AdjustmentType parameter to TotalCapacity: 0 to 2000.
         */
        public Builder adjustmentType(String adjustmentType) {
            this.putQueryParameter("AdjustmentType", adjustmentType);
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * The type of the scaling rule. Valid values:
         * <p>
         * 
         * *   SimpleScalingRule: scales the number of ECS instances based on the values that are specified for the AdjustmentType and AdjustmentValue parameters.
         * *   TargetTrackingScalingRule: calculates the number of ECS instances that must be scaled and maintains the value of a predefined metric close to the value that is specified for the TargetValue parameter.
         * *   StepScalingRule: scales ECS instances in steps based on the specified thresholds and metric values.
         * *   PredictiveScalingRule: uses machine learning to analyze historical monitoring data of the scaling group and predicts the future values of metrics. In addition, Auto Scaling automatically creates scheduled tasks to specify the boundary values for the scaling group.
         * 
         * Default value: SimpleScalingRule.
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.putQueryParameter("AdjustmentValue", adjustmentValue);
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * 监控项维度信息值，适用于目标追踪规则，当监控项需额外维度信息时设置，例如LoadBalancerRealServerAverageQps监控项需指定rulePool维度键值信息。
         */
        public Builder alarmDimensions(java.util.List < AlarmDimensions> alarmDimensions) {
            this.putQueryParameter("AlarmDimensions", alarmDimensions);
            this.alarmDimensions = alarmDimensions;
            return this;
        }

        /**
         * The minimum number of instances that must be scaled when the AdjustmentType parameter is set to PercentChangeInCapacity. This parameter takes effect only if you set the ScalingRuleType parameter to SimpleScalingRule or StepScalingRule.
         */
        public Builder cooldown(Integer cooldown) {
            this.putQueryParameter("Cooldown", cooldown);
            this.cooldown = cooldown;
            return this;
        }

        /**
         * Specifies whether to disable scale-in. This parameter is available only if you set ScalingRuleType to TargetTrackingScalingRule.
         * <p>
         * 
         * Default value: false
         */
        public Builder disableScaleIn(Boolean disableScaleIn) {
            this.putQueryParameter("DisableScaleIn", disableScaleIn);
            this.disableScaleIn = disableScaleIn;
            return this;
        }

        /**
         * The warmup period of an instance. This parameter is available only if you set ScalingRuleType to TargetTrackingScalingRule or PredictiveScalingRule. Auto Scaling adds ECS instances that are in the Warmup state to a scaling group but does not report the monitoring data of the ECS instances to CloudMonitor during the warmup period.
         * <p>
         * 
         * > Auto Scaling calculates the number of ECS instances that must be scaled. ECS instances in the Warmup state are not counted towards the current capacity of the scaling group.
         * 
         * Valid values: 0 to 86400. Unit: seconds.
         * 
         * Default value: 300
         */
        public Builder estimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
            this.putQueryParameter("EstimatedInstanceWarmup", estimatedInstanceWarmup);
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }

        /**
         * Details of the step adjustments.
         */
        public Builder initialMaxSize(Integer initialMaxSize) {
            this.putQueryParameter("InitialMaxSize", initialMaxSize);
            this.initialMaxSize = initialMaxSize;
            return this;
        }

        /**
         * The target value. This parameter is required only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. The value must be greater than 0 and can have up to three decimal places.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The scaling method of the scaling rule. This parameter is required only if you set the ScalingRuleType parameter to SimpleScalingRule or StepScalingRule. Valid values:
         * <p>
         * 
         * *   QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.
         * *   PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.
         * *   TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.
         */
        public Builder minAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
            this.putQueryParameter("MinAdjustmentMagnitude", minAdjustmentMagnitude);
            this.minAdjustmentMagnitude = minAdjustmentMagnitude;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The maximum value for predication tasks. Valid values:
         * <p>
         * 
         * *   MaxOverridePredictiveValue: uses the initial maximum capacity as the maximum value for prediction tasks if the predicted value is greater than the initial maximum capacity.
         * *   PredictiveValueOverrideMax: uses the predicted value as the maximum value for prediction tasks if the predicted value is greater than the initial maximum capacity.
         * *   PredictiveValueOverrideMaxWithBuffer: increases the predicted value by a percentage that is specified by the PredictiveValueBuffer parameter. If the predicted value that is increased by the percentage is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks.
         * 
         * Default value: MaxOverridePredictiveValue.
         */
        public Builder predictiveScalingMode(String predictiveScalingMode) {
            this.putQueryParameter("PredictiveScalingMode", predictiveScalingMode);
            this.predictiveScalingMode = predictiveScalingMode;
            return this;
        }

        /**
         * The maximum number of ECS instances in the scaling group. If you specify this parameter, you must also specify the PredictiveValueBehavior parameter.
         * <p>
         * 
         * The default value of this parameter is the value of the MaxSize parameter.
         */
        public Builder predictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
            this.putQueryParameter("PredictiveTaskBufferTime", predictiveTaskBufferTime);
            this.predictiveTaskBufferTime = predictiveTaskBufferTime;
            return this;
        }

        /**
         * The percentage of the increment to the predicted value when the PredictiveValueBehavior parameter is set to PredictiveValueOverrideMaxWithBuffer. If the predicted value increased by this percentage is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks. Valid values: 0 to 100.
         * <p>
         * 
         * Default value: 0.
         */
        public Builder predictiveValueBehavior(String predictiveValueBehavior) {
            this.putQueryParameter("PredictiveValueBehavior", predictiveValueBehavior);
            this.predictiveValueBehavior = predictiveValueBehavior;
            return this;
        }

        /**
         * The amount of buffer time before the prediction task is executed. By default, all prediction tasks that are automatically created for a predictive scaling rule are executed on the hour. You can specify an amount of buffer time for resource preparation before the prediction tasks are executed. Valid values: 0 to 60. Unit: minutes.
         * <p>
         * 
         * Default value: 0.
         */
        public Builder predictiveValueBuffer(Integer predictiveValueBuffer) {
            this.putQueryParameter("PredictiveValueBuffer", predictiveValueBuffer);
            this.predictiveValueBuffer = predictiveValueBuffer;
            return this;
        }

        /**
         * The unique identifier of the scaling rule.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The number of consecutive times that the event-triggered task created for scale-out activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.
         * <p>
         * 
         * Default value: 3.
         */
        public Builder scaleInEvaluationCount(Integer scaleInEvaluationCount) {
            this.putQueryParameter("ScaleInEvaluationCount", scaleInEvaluationCount);
            this.scaleInEvaluationCount = scaleInEvaluationCount;
            return this;
        }

        /**
         * The mode of the predictive scaling rule. Valid values:
         * <p>
         * 
         * *   PredictAndScale: produces predictions and creates prediction tasks.
         * *   PredictOnly: produces predictions but does not create prediction tasks.
         * 
         * Default value: PredictAndScale.
         */
        public Builder scaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
            this.putQueryParameter("ScaleOutEvaluationCount", scaleOutEvaluationCount);
            this.scaleOutEvaluationCount = scaleOutEvaluationCount;
            return this;
        }

        /**
         * The name of the scaling rule. It must be 2 to 64 characters in length, and can contain letters, digits, underscores (\_), hyphens (-), and periods (.). It must start with a letter or a digit. The name of a scaling rule must be unique in the scaling group to which the scaling rule belongs and within an Alibaba Cloud account.
         * <p>
         * 
         * If you do not specify this parameter, the value of the ScalingRuleId parameter is used.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * The cooldown time of the scaling rule. This parameter is available only if you set the ScalingRuleType parameter to SimpleScalingRule. Valid values: 0 to 86400. Unit: seconds.
         * <p>
         * 
         * By default, this parameter is left empty.
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * The type of the scaling rule. Valid values:
         * <p>
         * 
         * *   SimpleScalingRule: adjusts the number of ECS instances based on the values of AdjustmentType and AdjustmentValue.
         * *   TargetTrackingScalingRule: calculates the number of ECS instances that need to be scaled in a dynamic manner and maintains the value of a predefined metric close to the value of TargetValue.
         * *   StepScalingRule: scales ECS instances in steps based on the specified thresholds and metric values.
         * *   PredictiveScalingRule: uses machine learning to analyze historical monitoring data of the scaling group and predicts the future values of the predefined metrics. In addition, Auto Scaling automatically creates scheduled tasks to specify the boundary values for the scaling group.
         * 
         * Default value: SimpleScalingRule
         */
        public Builder scalingRuleType(String scalingRuleType) {
            this.putQueryParameter("ScalingRuleType", scalingRuleType);
            this.scalingRuleType = scalingRuleType;
            return this;
        }

        /**
         * Details of the step adjustments.
         */
        public Builder stepAdjustments(java.util.List < StepAdjustments> stepAdjustments) {
            this.putQueryParameter("StepAdjustments", stepAdjustments);
            this.stepAdjustments = stepAdjustments;
            return this;
        }

        /**
         * Specifies whether to disable scale-in. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule.
         * <p>
         * 
         * Default value: false.
         */
        public Builder targetValue(Float targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        @Override
        public CreateScalingRuleRequest build() {
            return new CreateScalingRuleRequest(this);
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
             * The region ID of the scaling group.
             */
            public Builder metricIntervalLowerBound(Float metricIntervalLowerBound) {
                this.metricIntervalLowerBound = metricIntervalLowerBound;
                return this;
            }

            /**
             * The number of ECS instances that you want to scale in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule.
             */
            public Builder metricIntervalUpperBound(Float metricIntervalUpperBound) {
                this.metricIntervalUpperBound = metricIntervalUpperBound;
                return this;
            }

            /**
             * The lower limit specified in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule. Valid values: -9.999999E18 to 9.999999E18.
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
}
