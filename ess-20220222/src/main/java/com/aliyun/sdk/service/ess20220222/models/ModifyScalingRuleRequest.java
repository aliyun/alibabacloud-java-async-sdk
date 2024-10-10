// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyScalingRuleRequest</p>
 */
public class ModifyScalingRuleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("HybridMetrics")
    private java.util.List < HybridMetrics> hybridMetrics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HybridMonitorNamespace")
    private String hybridMonitorNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitialMaxSize")
    private Integer initialMaxSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleInEvaluationCount")
    private Integer scaleInEvaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleOutEvaluationCount")
    private Integer scaleOutEvaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
    private String scalingRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StepAdjustments")
    private java.util.List < StepAdjustments> stepAdjustments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetValue")
    private Float targetValue;

    private ModifyScalingRuleRequest(Builder builder) {
        super(builder);
        this.adjustmentType = builder.adjustmentType;
        this.adjustmentValue = builder.adjustmentValue;
        this.alarmDimensions = builder.alarmDimensions;
        this.cooldown = builder.cooldown;
        this.disableScaleIn = builder.disableScaleIn;
        this.estimatedInstanceWarmup = builder.estimatedInstanceWarmup;
        this.hybridMetrics = builder.hybridMetrics;
        this.hybridMonitorNamespace = builder.hybridMonitorNamespace;
        this.initialMaxSize = builder.initialMaxSize;
        this.metricName = builder.metricName;
        this.metricType = builder.metricType;
        this.minAdjustmentMagnitude = builder.minAdjustmentMagnitude;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.predictiveScalingMode = builder.predictiveScalingMode;
        this.predictiveTaskBufferTime = builder.predictiveTaskBufferTime;
        this.predictiveValueBehavior = builder.predictiveValueBehavior;
        this.predictiveValueBuffer = builder.predictiveValueBuffer;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scaleInEvaluationCount = builder.scaleInEvaluationCount;
        this.scaleOutEvaluationCount = builder.scaleOutEvaluationCount;
        this.scalingRuleId = builder.scalingRuleId;
        this.scalingRuleName = builder.scalingRuleName;
        this.stepAdjustments = builder.stepAdjustments;
        this.targetValue = builder.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingRuleRequest create() {
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
     * @return hybridMetrics
     */
    public java.util.List < HybridMetrics> getHybridMetrics() {
        return this.hybridMetrics;
    }

    /**
     * @return hybridMonitorNamespace
     */
    public String getHybridMonitorNamespace() {
        return this.hybridMonitorNamespace;
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
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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

    public static final class Builder extends Request.Builder<ModifyScalingRuleRequest, Builder> {
        private String adjustmentType; 
        private Integer adjustmentValue; 
        private java.util.List < AlarmDimensions> alarmDimensions; 
        private Integer cooldown; 
        private Boolean disableScaleIn; 
        private Integer estimatedInstanceWarmup; 
        private java.util.List < HybridMetrics> hybridMetrics; 
        private String hybridMonitorNamespace; 
        private Integer initialMaxSize; 
        private String metricName; 
        private String metricType; 
        private Integer minAdjustmentMagnitude; 
        private String ownerAccount; 
        private Long ownerId; 
        private String predictiveScalingMode; 
        private Integer predictiveTaskBufferTime; 
        private String predictiveValueBehavior; 
        private Integer predictiveValueBuffer; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer scaleInEvaluationCount; 
        private Integer scaleOutEvaluationCount; 
        private String scalingRuleId; 
        private String scalingRuleName; 
        private java.util.List < StepAdjustments> stepAdjustments; 
        private Float targetValue; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScalingRuleRequest request) {
            super(request);
            this.adjustmentType = request.adjustmentType;
            this.adjustmentValue = request.adjustmentValue;
            this.alarmDimensions = request.alarmDimensions;
            this.cooldown = request.cooldown;
            this.disableScaleIn = request.disableScaleIn;
            this.estimatedInstanceWarmup = request.estimatedInstanceWarmup;
            this.hybridMetrics = request.hybridMetrics;
            this.hybridMonitorNamespace = request.hybridMonitorNamespace;
            this.initialMaxSize = request.initialMaxSize;
            this.metricName = request.metricName;
            this.metricType = request.metricType;
            this.minAdjustmentMagnitude = request.minAdjustmentMagnitude;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.predictiveScalingMode = request.predictiveScalingMode;
            this.predictiveTaskBufferTime = request.predictiveTaskBufferTime;
            this.predictiveValueBehavior = request.predictiveValueBehavior;
            this.predictiveValueBuffer = request.predictiveValueBuffer;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scaleInEvaluationCount = request.scaleInEvaluationCount;
            this.scaleOutEvaluationCount = request.scaleOutEvaluationCount;
            this.scalingRuleId = request.scalingRuleId;
            this.scalingRuleName = request.scalingRuleName;
            this.stepAdjustments = request.stepAdjustments;
            this.targetValue = request.targetValue;
        } 

        /**
         * <p>The adjustment method of the scaling rule. This is required when the ScalingRuleType parameter is set to SimpleScalingRule or StepScalingRule. Valid values:</p>
         * <ul>
         * <li>QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.</li>
         * <li>PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.</li>
         * <li>TotalCapacity: adjusts the number of ECS instances in the scaling group to the specified number.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>QuantityChangeInCapacity</p>
         */
        public Builder adjustmentType(String adjustmentType) {
            this.putQueryParameter("AdjustmentType", adjustmentType);
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * <p>The target value specified in the scaling rule. This parameter is required when the ScalingRuleType parameter is set to SimpleScalingRule or StepScalingRule. The number of ECS instances that are scaled in a single scaling activity cannot exceed 1,000.</p>
         * <ul>
         * <li>Valid values if you set the AdjustmentType parameter to QuantityChangeInCapacity: -1000 to 1000.</li>
         * <li>Valid values if you set the AdjustmentType parameter to PercentChangeInCapacity: -100 to 10000.</li>
         * <li>Valid values if you set the AdjustmentType parameter to TotalCapacity: 0 to 2000.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.putQueryParameter("AdjustmentValue", adjustmentValue);
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * <p>The dimensions. This parameter is applicable to target tracking scaling rules. You can specify this parameter if your predefined metric requires extra dimensions. For example, if you predefine the LoadBalancerRealServerAverageQps metric, you must use this parameter to specify the rulePool dimension.</p>
         */
        public Builder alarmDimensions(java.util.List < AlarmDimensions> alarmDimensions) {
            this.putQueryParameter("AlarmDimensions", alarmDimensions);
            this.alarmDimensions = alarmDimensions;
            return this;
        }

        /**
         * <p>The cooldown time of the scaling rule. This parameter is available only if you set the ScalingRuleType parameter to SimpleScalingRule.</p>
         * <p>Valid values: 0 to 86400. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder cooldown(Integer cooldown) {
            this.putQueryParameter("Cooldown", cooldown);
            this.cooldown = cooldown;
            return this;
        }

        /**
         * <p>Specifies whether to disable scale-in. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableScaleIn(Boolean disableScaleIn) {
            this.putQueryParameter("DisableScaleIn", disableScaleIn);
            this.disableScaleIn = disableScaleIn;
            return this;
        }

        /**
         * <p>The warmup period of an instance. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. Auto Scaling adds ECS instances that are in the warmup state to a scaling group but does not report monitoring data to CloudMonitor during the warmup period.</p>
         * <blockquote>
         * <p>Auto Scaling calculates the number of ECS instances that need to be scaled. ECS instances in the warmup state are not counted towards the current capacity of the scaling group.</p>
         * </blockquote>
         * <p>Valid values: 0 to 86400. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder estimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
            this.putQueryParameter("EstimatedInstanceWarmup", estimatedInstanceWarmup);
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }

        /**
         * HybridMetrics.
         */
        public Builder hybridMetrics(java.util.List < HybridMetrics> hybridMetrics) {
            this.putQueryParameter("HybridMetrics", hybridMetrics);
            this.hybridMetrics = hybridMetrics;
            return this;
        }

        /**
         * HybridMonitorNamespace.
         */
        public Builder hybridMonitorNamespace(String hybridMonitorNamespace) {
            this.putQueryParameter("HybridMonitorNamespace", hybridMonitorNamespace);
            this.hybridMonitorNamespace = hybridMonitorNamespace;
            return this;
        }

        /**
         * <p>The maximum number of ECS instances that can be contained in the scaling group. If you specify InitialMaxSize, you must specify <code>PredictiveValueBehavior</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder initialMaxSize(Integer initialMaxSize) {
            this.putQueryParameter("InitialMaxSize", initialMaxSize);
            this.initialMaxSize = initialMaxSize;
            return this;
        }

        /**
         * <p>The predefined metric. This parameter is required only if you create a target tracking scaling rule or predictive scaling rule.</p>
         * <p>Valid values if you create a target tracking scaling rule:</p>
         * <ul>
         * <li>CpuUtilization: the average CPU utilization.</li>
         * <li>IntranetTx: the outbound traffic over an internal network.</li>
         * <li>IntranetRx: the inbound traffic over an internal network.</li>
         * <li>VpcInternetTx: the outbound traffic from a virtual private cloud (VPC) to the Internet.</li>
         * <li>VpcInternetRx: the inbound traffic from the Internet to a VPC.</li>
         * <li>MemoryUtilization: the memory usage.</li>
         * <li>LoadBalancerRealServerAverageQps: the queries per second (QPS) per Application Load Balancer (ALB) server group.</li>
         * </ul>
         * <p>Valid values if you create a predictive scaling rule:</p>
         * <ul>
         * <li>CpuUtilization: the average CPU utilization.</li>
         * <li>IntranetRx: the inbound traffic over an internal network.</li>
         * <li>IntranetTx: the outbound traffic over an internal network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CpuUtilization</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The minimum number of instances to scale. This parameter takes effect only if you create a simple scaling rule or step scaling rule and set <code>AdjustmentType</code> to <code>PercentChangeInCapacity</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The mode of the predictive scaling rule. Valid values:</p>
         * <ul>
         * <li>PredictAndScale: produces predictions and creates prediction tasks.</li>
         * <li>PredictOnly: produces predictions but does not create prediction tasks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PredictAndScale</p>
         */
        public Builder predictiveScalingMode(String predictiveScalingMode) {
            this.putQueryParameter("PredictiveScalingMode", predictiveScalingMode);
            this.predictiveScalingMode = predictiveScalingMode;
            return this;
        }

        /**
         * <p>The amount of buffer time before the prediction task is executed. By default, all prediction tasks that are automatically created for a predictive scaling rule are executed on the hour. You can specify an amount of buffer time for resource preparation before the prediction tasks are executed. Valid values: 0 to 60.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder predictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
            this.putQueryParameter("PredictiveTaskBufferTime", predictiveTaskBufferTime);
            this.predictiveTaskBufferTime = predictiveTaskBufferTime;
            return this;
        }

        /**
         * <p>Specifies which one of the initial maximum capacity and the predicted value can be used as the maximum value for prediction tasks. Valid values:</p>
         * <ul>
         * <li>MaxOverridePredictiveValue: uses the initial maximum capacity as the maximum value for prediction tasks if the predicted value is greater than the initial maximum capacity.</li>
         * <li>PredictiveValueOverrideMax: uses the predicted value as the maximum value for prediction tasks when the predicted value is greater than the initial maximum capacity.</li>
         * <li>PredictiveValueOverrideMaxWithBuffer: increases the predicted value by a percentage that is specified by the PredictiveValueBuffer parameter. If the predicted value that is increased by the percentage is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MaxOverridePredictiveValue</p>
         */
        public Builder predictiveValueBehavior(String predictiveValueBehavior) {
            this.putQueryParameter("PredictiveValueBehavior", predictiveValueBehavior);
            this.predictiveValueBehavior = predictiveValueBehavior;
            return this;
        }

        /**
         * <p>The ratio based on which the predicted value is increased when <code>PredictiveValueBehavior</code> is set to <code>PredictiveValueOverrideMaxWithBuffer</code>. If the predicted value increased by this ratio is greater than the initial maximum capacity, the increased value is used as the maximum value for prediction tasks. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder predictiveValueBuffer(Integer predictiveValueBuffer) {
            this.putQueryParameter("PredictiveValueBuffer", predictiveValueBuffer);
            this.predictiveValueBuffer = predictiveValueBuffer;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The number of consecutive times that the event-triggered task created for scale-in activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder scaleInEvaluationCount(Integer scaleInEvaluationCount) {
            this.putQueryParameter("ScaleInEvaluationCount", scaleInEvaluationCount);
            this.scaleInEvaluationCount = scaleInEvaluationCount;
            return this;
        }

        /**
         * <p>The number of consecutive times that the event-triggered task created for scale-out activities must meet the threshold conditions before an alert is triggered. After a target tracking scaling rule is created, an event-triggered task is automatically created and then associated with the target tracking scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder scaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
            this.putQueryParameter("ScaleOutEvaluationCount", scaleOutEvaluationCount);
            this.scaleOutEvaluationCount = scaleOutEvaluationCount;
            return this;
        }

        /**
         * <p>The ID of the scaling rule that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asr-bp1dvirgwkoowxk7****</p>
         */
        public Builder scalingRuleId(String scalingRuleId) {
            this.putQueryParameter("ScalingRuleId", scalingRuleId);
            this.scalingRuleId = scalingRuleId;
            return this;
        }

        /**
         * <p>The name of the scaling rule. The name must be 2 to 64 letters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter or digit.</p>
         * <p>The name of each scaling rule must be unique under the same account within the same region.</p>
         * 
         * <strong>example:</strong>
         * <p>scalingrule****</p>
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * <p>Details of the step adjustments.</p>
         */
        public Builder stepAdjustments(java.util.List < StepAdjustments> stepAdjustments) {
            this.putQueryParameter("StepAdjustments", stepAdjustments);
            this.stepAdjustments = stepAdjustments;
            return this;
        }

        /**
         * <p>The target value. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. The value must be greater than 0 and can have up to three decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.125</p>
         */
        public Builder targetValue(Float targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        @Override
        public ModifyScalingRuleRequest build() {
            return new ModifyScalingRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyScalingRuleRequest} extends {@link TeaModel}
     *
     * <p>ModifyScalingRuleRequest</p>
     */
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
             * <p>The dimension key of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>rulePool</p>
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * <p>The dimension value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-l1cbirz451yxu2dxxx</p>
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
    /**
     * 
     * {@link ModifyScalingRuleRequest} extends {@link TeaModel}
     *
     * <p>ModifyScalingRuleRequest</p>
     */
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
             * <p>The dimension key of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>rulePool</p>
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * <p>The dimension value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-l1cbirz451yxu2dxxx</p>
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
    /**
     * 
     * {@link ModifyScalingRuleRequest} extends {@link TeaModel}
     *
     * <p>ModifyScalingRuleRequest</p>
     */
    public static class HybridMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List < Dimensions> dimensions;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Statistic")
        private String statistic;

        private HybridMetrics(Builder builder) {
            this.dimensions = builder.dimensions;
            this.expression = builder.expression;
            this.id = builder.id;
            this.metricName = builder.metricName;
            this.statistic = builder.statistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HybridMetrics create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public java.util.List < Dimensions> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return statistic
         */
        public String getStatistic() {
            return this.statistic;
        }

        public static final class Builder {
            private java.util.List < Dimensions> dimensions; 
            private String expression; 
            private String id; 
            private String metricName; 
            private String statistic; 

            /**
             * Dimensions.
             */
            public Builder dimensions(java.util.List < Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The predefined metric. This parameter is required only if you create a target tracking scaling rule or predictive scaling rule.</p>
             * <p>Valid values if you create a target tracking scaling rule:</p>
             * <ul>
             * <li>CpuUtilization: the average CPU utilization.</li>
             * <li>IntranetTx: the outbound traffic over an internal network.</li>
             * <li>IntranetRx: the inbound traffic over an internal network.</li>
             * <li>VpcInternetTx: the outbound traffic from a virtual private cloud (VPC) to the Internet.</li>
             * <li>VpcInternetRx: the inbound traffic from the Internet to a VPC.</li>
             * <li>MemoryUtilization: the memory usage.</li>
             * <li>LoadBalancerRealServerAverageQps: the queries per second (QPS) per Application Load Balancer (ALB) server group.</li>
             * </ul>
             * <p>Valid values if you create a predictive scaling rule:</p>
             * <ul>
             * <li>CpuUtilization: the average CPU utilization.</li>
             * <li>IntranetRx: the inbound traffic over an internal network.</li>
             * <li>IntranetTx: the outbound traffic over an internal network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CpuUtilization</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Statistic.
             */
            public Builder statistic(String statistic) {
                this.statistic = statistic;
                return this;
            }

            public HybridMetrics build() {
                return new HybridMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyScalingRuleRequest} extends {@link TeaModel}
     *
     * <p>ModifyScalingRuleRequest</p>
     */
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
             * <p>The lower limit that is specified in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule. Valid values: -9.999999E18 to 9.999999E18.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder metricIntervalLowerBound(Float metricIntervalLowerBound) {
                this.metricIntervalLowerBound = metricIntervalLowerBound;
                return this;
            }

            /**
             * <p>The upper limit specified in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule. Valid values: -9.999999E18 to 9.999999E18.</p>
             * 
             * <strong>example:</strong>
             * <p>5.0</p>
             */
            public Builder metricIntervalUpperBound(Float metricIntervalUpperBound) {
                this.metricIntervalUpperBound = metricIntervalUpperBound;
                return this;
            }

            /**
             * <p>The number of ECS instances that you want to scale in a step adjustment. This parameter is available only if you set the ScalingRuleType parameter to StepScalingRule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
