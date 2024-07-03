// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateScalingRuleRequest</p>
 */
public class CreateScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdjustmentType")
    private String adjustmentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdjustmentValue")
    private Integer adjustmentValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmDimensions")
    private java.util.List < AlarmDimensions> alarmDimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cooldown")
    private Integer cooldown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableScaleIn")
    private Boolean disableScaleIn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EstimatedInstanceWarmup")
    private Integer estimatedInstanceWarmup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitialMaxSize")
    private Integer initialMaxSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinAdjustmentMagnitude")
    private Integer minAdjustmentMagnitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PredictiveScalingMode")
    private String predictiveScalingMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PredictiveTaskBufferTime")
    private Integer predictiveTaskBufferTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PredictiveValueBehavior")
    private String predictiveValueBehavior;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PredictiveValueBuffer")
    private Integer predictiveValueBuffer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleInEvaluationCount")
    private Integer scaleInEvaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleOutEvaluationCount")
    private Integer scaleOutEvaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
    private String scalingRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleType")
    private String scalingRuleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StepAdjustments")
    private java.util.List < StepAdjustments> stepAdjustments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetValue")
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
         * The scaling method of the scaling rule. This parameter is required only if you set the ScalingRuleType parameter to SimpleScalingRule or StepScalingRule. Valid values:
         * <p>
         * 
         * *   QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.
         * *   PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.
         * *   TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.
         */
        public Builder adjustmentType(String adjustmentType) {
            this.putQueryParameter("AdjustmentType", adjustmentType);
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * The number of instances that must be scaled based on the scaling rule. This parameter is required only if you set the ScalingRuleType parameter to SimpleScalingRule or StepScalingRule. The number of ECS instances that are scaled in a single scaling activity cannot exceed 1,000.
         * <p>
         * 
         * *   Valid values if you set the AdjustmentType parameter to QuantityChangeInCapacity: -1000 to 1000.
         * *   Valid values if you set the AdjustmentType parameter to PercentChangeInCapacity: -100 to 10000.
         * *   Valid values if you set the AdjustmentType parameter to TotalCapacity: 0 to 2000.
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.putQueryParameter("AdjustmentValue", adjustmentValue);
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * The metric dimensions. This parameter is applicable to target tracking scaling rules. If your predefined metric requires extra dimensions, you must specify this parameter. For example, if you use LoadBalancerRealServerAverageQps as your predefined metric, you must use this parameter to specify the rulePool dimension.
         */
        public Builder alarmDimensions(java.util.List < AlarmDimensions> alarmDimensions) {
            this.putQueryParameter("AlarmDimensions", alarmDimensions);
            this.alarmDimensions = alarmDimensions;
            return this;
        }

        /**
         * The cooldown time of the scaling rule. This parameter is available only if you set the ScalingRuleType parameter to SimpleScalingRule. Valid values: 0 to 86400. Unit: seconds.
         * <p>
         * 
         * By default, this parameter is left empty.
         */
        public Builder cooldown(Integer cooldown) {
            this.putQueryParameter("Cooldown", cooldown);
            this.cooldown = cooldown;
            return this;
        }

        /**
         * Specifies whether to disable scale-in. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule.
         * <p>
         * 
         * Default value: false.
         */
        public Builder disableScaleIn(Boolean disableScaleIn) {
            this.putQueryParameter("DisableScaleIn", disableScaleIn);
            this.disableScaleIn = disableScaleIn;
            return this;
        }

        /**
         * The warmup period of an instance. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. Auto Scaling adds ECS instances that are in the warmup state to a scaling group but does not report monitoring data to CloudMonitor during the warmup period.
         * <p>
         * 
         * > Auto Scaling calculates the number of ECS instances that must be scaled. ECS instances in the warmup state are not counted towards the current capacity of the scaling group.
         * 
         * Valid values: 0 to 86400. Unit: seconds.
         * 
         * Default value: 300.
         */
        public Builder estimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
            this.putQueryParameter("EstimatedInstanceWarmup", estimatedInstanceWarmup);
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }

        /**
         * The maximum number of ECS instances that can be contained in the scaling group. If you specify InitialMaxSize, you must specify `PredictiveValueBehavior`.
         * <p>
         * 
         * The default value of this parameter is the value of MaxSize.
         */
        public Builder initialMaxSize(Integer initialMaxSize) {
            this.putQueryParameter("InitialMaxSize", initialMaxSize);
            this.initialMaxSize = initialMaxSize;
            return this;
        }

        /**
         * The predefined metric of the scaling rule. If you set ScalingRuleType to TargetTrackingScalingRule or PredictiveScalingRule, you must specify this parameter.
         * <p>
         * 
         * Valid values if you set ScalingRuleType to TargetTrackingScalingRule:
         * 
         * *   CpuUtilization: the average CPU utilization.
         * *   IntranetTx: the outbound traffic over an internal network.
         * *   IntranetRx: the inbound traffic over an internal network.
         * *   VpcInternetTx: the outbound traffic from a virtual private cloud (VPC) to the Internet.
         * *   VpcInternetRx: the inbound traffic from the Internet to a VPC.
         * *   MemoryUtilization: the memory usage.
         * *   LoadBalancerRealServerAverageQps:the queries per second (QPS) per Application Load Balancer (ALB) server group.
         * 
         * Valid values if you set ScalingRuleType to PredictiveScalingRule:
         * 
         * *   CpuUtilization: the average CPU utilization.
         * *   IntranetRx: the inbound traffic over an internal network.
         * *   IntranetTx: the outbound traffic over an internal network.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The minimum number of instances that must be scaled when the AdjustmentType parameter is set to PercentChangeInCapacity. This parameter takes effect only if you set the ScalingRuleType parameter to SimpleScalingRule or StepScalingRule.
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
         * The mode of the predictive scaling rule. Valid values:
         * <p>
         * 
         * *   PredictAndScale: produces predictions and creates prediction tasks.
         * *   PredictOnly: produces predictions but does not create prediction tasks.
         * 
         * Default value: PredictAndScale.
         */
        public Builder predictiveScalingMode(String predictiveScalingMode) {
            this.putQueryParameter("PredictiveScalingMode", predictiveScalingMode);
            this.predictiveScalingMode = predictiveScalingMode;
            return this;
        }

        /**
         * The amount of buffer time before the prediction task is executed. By default, all prediction tasks that are automatically created for a predictive scaling rule are executed on the hour. You can specify an amount of buffer time for resource preparation before the prediction tasks are executed. Valid values: 0 to 60. Unit: minutes.
         * <p>
         * 
         * Default value: 0.
         */
        public Builder predictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
            this.putQueryParameter("PredictiveTaskBufferTime", predictiveTaskBufferTime);
            this.predictiveTaskBufferTime = predictiveTaskBufferTime;
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
        public Builder predictiveValueBehavior(String predictiveValueBehavior) {
            this.putQueryParameter("PredictiveValueBehavior", predictiveValueBehavior);
            this.predictiveValueBehavior = predictiveValueBehavior;
            return this;
        }

        /**
         * The ratio based on which the predicted value is increased when you set `PredictiveValueBehavior` to `PredictiveValueOverrideMaxWithBuffer`. If the predicted value increased by this ratio is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks. Valid values: 0 to 100.
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
         * The region ID of the scaling group.
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
         * The number of consecutive times that the event-triggered task created for scale-in activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.
         * <p>
         * 
         * Default value: 15.
         */
        public Builder scaleInEvaluationCount(Integer scaleInEvaluationCount) {
            this.putQueryParameter("ScaleInEvaluationCount", scaleInEvaluationCount);
            this.scaleInEvaluationCount = scaleInEvaluationCount;
            return this;
        }

        /**
         * The number of consecutive times that the event-triggered task created for scale-out activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.
         * <p>
         * 
         * Default value: 3.
         */
        public Builder scaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
            this.putQueryParameter("ScaleOutEvaluationCount", scaleOutEvaluationCount);
            this.scaleOutEvaluationCount = scaleOutEvaluationCount;
            return this;
        }

        /**
         * The ID of the scaling group to which the scaling rule belongs.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * The name of the scaling rule. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (\_), hyphens (-), and periods (.). The name must start with a letter or a digit.
         * <p>
         * 
         * The name of each scaling rule must be unique under the same account within a region.
         * 
         * If you leave this parameter empty, the scaling rule ID is used.
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
         * *   SimpleScalingRule: a simple scaling rule. Once a simple scaling rule is executed, Auto Scaling adjusts the number of ECS instances or elastic container instances in the scaling group based on the values of AdjustmentType and AdjustmentValue.
         * *   TargetTrackingScalingRule: a target tracking scaling rule. Once a target tracking scaling rule is executed, Auto Scaling dynamically calculates the number of ECS instances or elastic container instances to scale based on the predefined metric (MetricName) and attempts to maintain the metric value close to the specified target value (TargetValue).
         * *   StepScalingRule: a step scaling rule. Once a step scaling rule is executed, Auto Scaling scales instances step by step based on the predefined thresholds and metric values.
         * *   PredictiveScalingRule: a predictive scaling rule. Once a predictive scaling rule is executed, Auto Scaling analyzes the historical monitoring data based on the machine learning technology and predicts the trends of metric data. Auto Scaling also creates scheduled tasks to enable dynamic adjustment of the boundary values for the scaling group.
         * 
         * Default value: SimpleScalingRule.
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
         * The target value. This parameter is required only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. The value must be greater than 0 and can have up to three decimal places.
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
             * The lower limit specified in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule. Valid values: -9.999999E18 to 9.999999E18.
             */
            public Builder metricIntervalLowerBound(Float metricIntervalLowerBound) {
                this.metricIntervalLowerBound = metricIntervalLowerBound;
                return this;
            }

            /**
             * The upper limit that is specified in a step adjustment. Valid values: -9.999999E18 to 9.999999E18.
             */
            public Builder metricIntervalUpperBound(Float metricIntervalUpperBound) {
                this.metricIntervalUpperBound = metricIntervalUpperBound;
                return this;
            }

            /**
             * The number of ECS instances that you want to scale in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule.
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
