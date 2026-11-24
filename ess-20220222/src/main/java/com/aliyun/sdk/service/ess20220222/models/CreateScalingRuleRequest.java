// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
    private java.util.List<AlarmDimensions> alarmDimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmOptions")
    private AlarmOptions alarmOptions;

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
    private java.util.List<HybridMetrics> hybridMetrics;

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
    private java.util.List<StepAdjustments> stepAdjustments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetValue")
    private Float targetValue;

    private CreateScalingRuleRequest(Builder builder) {
        super(builder);
        this.adjustmentType = builder.adjustmentType;
        this.adjustmentValue = builder.adjustmentValue;
        this.alarmDimensions = builder.alarmDimensions;
        this.alarmOptions = builder.alarmOptions;
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
    public java.util.List<AlarmDimensions> getAlarmDimensions() {
        return this.alarmDimensions;
    }

    /**
     * @return alarmOptions
     */
    public AlarmOptions getAlarmOptions() {
        return this.alarmOptions;
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
    public java.util.List<HybridMetrics> getHybridMetrics() {
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
    public java.util.List<StepAdjustments> getStepAdjustments() {
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
        private java.util.List<AlarmDimensions> alarmDimensions; 
        private AlarmOptions alarmOptions; 
        private Integer cooldown; 
        private Boolean disableScaleIn; 
        private Integer estimatedInstanceWarmup; 
        private java.util.List<HybridMetrics> hybridMetrics; 
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
        private String regionId; 
        private String resourceOwnerAccount; 
        private Integer scaleInEvaluationCount; 
        private Integer scaleOutEvaluationCount; 
        private String scalingGroupId; 
        private String scalingRuleName; 
        private String scalingRuleType; 
        private java.util.List<StepAdjustments> stepAdjustments; 
        private Float targetValue; 

        private Builder() {
            super();
        } 

        private Builder(CreateScalingRuleRequest request) {
            super(request);
            this.adjustmentType = request.adjustmentType;
            this.adjustmentValue = request.adjustmentValue;
            this.alarmDimensions = request.alarmDimensions;
            this.alarmOptions = request.alarmOptions;
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
         * <p>The adjustment method of the scaling rule. This parameter is required for simple scaling rules and step scaling rules. Valid values:</p>
         * <ul>
         * <li>QuantityChangeInCapacity: adds or removes a specified number of ECS instances.</li>
         * <li>PercentChangeInCapacity: adds or removes a specified percentage of ECS instances.</li>
         * <li>TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.</li>
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
         * <p>The adjustment value of the scaling rule. This parameter is required for simple scaling rules and step scaling rules. The number of ECS instances adjusted in a single operation cannot exceed 1,000. Valid values vary based on the adjustment method:</p>
         * <ul>
         * <li>QuantityChangeInCapacity: -1000 to 1000.</li>
         * <li>PercentChangeInCapacity: -100 to 10000.</li>
         * <li>TotalCapacity: 0 to 2000.</li>
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
         * <p>The dimension information of the metric. This parameter is applicable to target tracking scaling rules and is configured when the metric requires additional dimension information. For example, the LoadBalancerRealServerAverageQps metric requires the dimension key-value information of rulePool.</p>
         */
        public Builder alarmDimensions(java.util.List<AlarmDimensions> alarmDimensions) {
            this.putQueryParameter("AlarmDimensions", alarmDimensions);
            this.alarmDimensions = alarmDimensions;
            return this;
        }

        /**
         * <p>The definition of alert attributes.</p>
         */
        public Builder alarmOptions(AlarmOptions alarmOptions) {
            this.putQueryParameter("AlarmOptions", alarmOptions);
            this.alarmOptions = alarmOptions;
            return this;
        }

        /**
         * <p>The cooldown time of the scaling rule. This parameter is applicable only to simple scaling rules. Valid values: 0 to 86400. Unit: seconds.</p>
         * <p>Default value: none.</p>
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
         * <p>Specifies whether to disable scale-in. This parameter is applicable only to target tracking scaling rules.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableScaleIn(Boolean disableScaleIn) {
            this.putQueryParameter("DisableScaleIn", disableScaleIn);
            this.disableScaleIn = disableScaleIn;
            return this;
        }

        /**
         * <p>The warmup time of instances. This parameter is applicable to target tracking scaling rules and step scaling rules. ECS instances in the warmup state are added to the scaling group normally, but they do not report monitoring data to CloudMonitor during the warmup period.</p>
         * <blockquote>
         * <p>When dynamically calculating the number of ECS instances to be scaled, instances in the warmup state are not counted in the current number of instances.</p>
         * </blockquote>
         * <p>Valid values: 0 to 86400. Unit: seconds.</p>
         * <p>Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder estimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
            this.putQueryParameter("EstimatedInstanceWarmup", estimatedInstanceWarmup);
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }

        /**
         * <p>The metric settings for Hybrid Cloud Monitoring. For more information about how to configure the settings, see <a href="https://help.aliyun.com/document_detail/2852162.html">Customize target tracking scaling rules by using formula operations</a>.</p>
         */
        public Builder hybridMetrics(java.util.List<HybridMetrics> hybridMetrics) {
            this.putQueryParameter("HybridMetrics", hybridMetrics);
            this.hybridMetrics = hybridMetrics;
            return this;
        }

        /**
         * <p>The ID of the monitoring metrics repository for Hybrid Cloud Monitoring.</p>
         * <p>For more information about managing monitoring metrics repositories, see <a href="https://help.aliyun.com/document_detail/217606.html">Manage monitoring metrics repositories</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-test</p>
         */
        public Builder hybridMonitorNamespace(String hybridMonitorNamespace) {
            this.putQueryParameter("HybridMonitorNamespace", hybridMonitorNamespace);
            this.hybridMonitorNamespace = hybridMonitorNamespace;
            return this;
        }

        /**
         * <p>The maximum number of instances in the scaling group. This parameter is used in combination with <code>PredictiveValueBehavior</code>.</p>
         * <p>Default value: the maximum number of instances in the scaling group (the value of MaxSize).</p>
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
         * <p>The predefined metric. This parameter is required for target tracking scaling rules and predictive scaling rules.</p>
         * <p>Valid values for target tracking scaling rules: </p>
         * <ul>
         * <li>CpuUtilizationAgent: (Agent) CPU utilization (recommended).</li>
         * <li>MemoryUtilization: (Agent) memory usage (recommended).</li>
         * <li>CpuUtilization: (ECS) average CPU utilization.</li>
         * <li>IntranetTx: (ECS) average outbound traffic over the internal network.</li>
         * <li>IntranetRx: (ECS) average inbound traffic over the internal network.</li>
         * <li>VpcInternetTx: (ECS) average outbound traffic over the Internet.</li>
         * <li>VpcInternetRx: (ECS) average inbound traffic over the Internet.</li>
         * <li>LoadBalancerRealServerAverageQps: (ALB) average QPS per backend server in a server group.</li>
         * </ul>
         * <p>Valid values for predictive scaling rules: </p>
         * <ul>
         * <li>CpuUtilization: (ECS) average CPU utilization.</li>
         * <li>IntranetRx: (ECS) average inbound traffic over the internal network.</li>
         * <li>IntranetTx: (ECS) average outbound traffic over the internal network.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">System monitoring event-triggered tasks</a>.</p>
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
         * <p>The type of the metric. Valid values:</p>
         * <ul>
         * <li>system: uses system metrics of CloudMonitor.</li>
         * <li>custom: uses custom metrics reported to CloudMonitor.</li>
         * <li>hybrid: uses metrics of Hybrid Cloud Monitoring.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The minimum number of instances to be adjusted. This parameter takes effect only when the scaling rule type is SimpleScalingRule or StepScalingRule and AdjustmentType is set to PercentChangeInCapacity.</p>
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
         * <li>PredictAndScale: generates prediction results and creates predictive tasks.</li>
         * <li>PredictOnly: generates prediction results but does not create predictive tasks.</li>
         * </ul>
         * <p>Default value: PredictAndScale.</p>
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
         * <p>The predictive tasks automatically created by predictive scaling rules are executed on the hour by default. You can set the pre-startup time to execute the predictive tasks in advance and prepare resources beforehand. Valid values: 0 to 60. Unit: minutes.</p>
         * <p>Default value: 0.</p>
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
         * <p>The processing method for the maximum value of the predictive scaling rule. Valid values:</p>
         * <ul>
         * <li>MaxOverridePredictiveValue: The initial maximum value overrides the predicted value. If the predicted value is greater than the initial maximum value, the maximum value of the predictive task uses the initial maximum value.</li>
         * <li>PredictiveValueOverrideMax: The predicted value overrides the initial maximum value. If the predicted value is greater than the initial maximum value, the maximum value of the predictive task uses the predicted value.</li>
         * <li>PredictiveValueOverrideMaxWithBuffer: A buffer ratio is added to the predicted value. The predicted value is increased by the ratio specified by PredictiveValueBuffer. If the increased value is greater than the initial maximum value, the increased value is used.</li>
         * </ul>
         * <p>Default value: MaxOverridePredictiveValue.</p>
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
         * <p>This parameter takes effect only when <code>PredictiveValueBehavior</code> is set to <code>PredictiveValueOverrideMaxWithBuffer</code>. The predicted value is increased by this ratio. If the increased value is greater than the initial maximum value, the increased value is used. Valid values: 0 to 100.</p>
         * <p>Default value: 0.</p>
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
         * <p>The region ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>After a target tracking scaling rule is created, an event-triggered task is automatically created. This parameter specifies the number of consecutive times the threshold condition must be met before the corresponding scale-in event-triggered task triggers an alert.</p>
         * <p>Default value: 15.</p>
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
         * <p>After a target tracking scaling rule is created, an event-triggered task is automatically created. This parameter specifies the number of consecutive times the threshold condition must be met before the corresponding scale-out event-triggered task triggers an alert.</p>
         * <p>Default value: 3.</p>
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
         * <p>The ID of the scaling group to which the scaling rule belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1ffogfdauy0jw0****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The name of the scaling rule. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter, digit, or Chinese character.</p>
         * <p>The name of a scaling rule must be unique within a scaling group in a region for an Alibaba Cloud account.</p>
         * <p>If this parameter is not specified, the value of ScalingRuleId is used by default.</p>
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
         * <p>The type of the scaling rule. Valid values:</p>
         * <ul>
         * <li>SimpleScalingRule: simple scaling rule. Adjusts the number of ECS or ECI instances based on the adjustment method (AdjustmentType) and adjustment value (AdjustmentValue).</li>
         * <li>TargetTrackingScalingRule: target tracking scaling rule. Dynamically calculates the number of ECS or ECI instances for scale-out or scale-in based on a predefined metric (MetricName) to keep the metric value close to the target value (TargetValue).</li>
         * <li>StepScalingRule: step scaling rule. Provides a step-by-step scaling method based on thresholds and metric values.</li>
         * <li>PredictiveScalingRule: predictive scaling rule. Analyzes historical monitoring data of the scaling group based on machine learning capabilities to predict future metric values, and supports the automatic creation of scheduled tasks to configure the boundary values of the scaling group.</li>
         * </ul>
         * <p>Default value: SimpleScalingRule.</p>
         * 
         * <strong>example:</strong>
         * <p>SimpleScalingRule</p>
         */
        public Builder scalingRuleType(String scalingRuleType) {
            this.putQueryParameter("ScalingRuleType", scalingRuleType);
            this.scalingRuleType = scalingRuleType;
            return this;
        }

        /**
         * <p>The collection of instance scaling information corresponding to step adjustments.</p>
         */
        public Builder stepAdjustments(java.util.List<StepAdjustments> stepAdjustments) {
            this.putQueryParameter("StepAdjustments", stepAdjustments);
            this.stepAdjustments = stepAdjustments;
            return this;
        }

        /**
         * <p>The target value. This parameter is required for target tracking scaling rules and predictive scaling rules. The value of TargetValue can be rounded to three decimal places and must be greater than 0.</p>
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
        public CreateScalingRuleRequest build() {
            return new CreateScalingRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateScalingRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingRuleRequest</p>
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

            private Builder() {
            } 

            private Builder(AlarmDimensions model) {
                this.dimensionKey = model.dimensionKey;
                this.dimensionValue = model.dimensionValue;
            } 

            /**
             * <p>The dimension key associated with the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>rulePool</p>
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * <p>The dimension value associated with the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-l1cbirz451yxuxxx</p>
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
     * {@link CreateScalingRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingRuleRequest</p>
     */
    public static class AlarmOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        private AlarmOptions(Builder builder) {
            this.period = builder.period;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmOptions create() {
            return builder().build();
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        public static final class Builder {
            private Integer period; 

            private Builder() {
            } 

            private Builder(AlarmOptions model) {
                this.period = model.period;
            } 

            /**
             * <p>The period for collecting metric data in the target tracking scaling rule. Unit: seconds. Valid values:</p>
             * <ul>
             * <li>15</li>
             * <li>60</li>
             * <li>120</li>
             * <li>300</li>
             * <li>900</li>
             * </ul>
             * <blockquote>
             * <p>Default value: 60.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            public AlarmOptions build() {
                return new AlarmOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScalingRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingRuleRequest</p>
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

            private Builder() {
            } 

            private Builder(Dimensions model) {
                this.dimensionKey = model.dimensionKey;
                this.dimensionValue = model.dimensionValue;
            } 

            /**
             * <p>The dimension key of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>queue</p>
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * <p>The dimension value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>testQueue</p>
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
     * {@link CreateScalingRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingRuleRequest</p>
     */
    public static class HybridMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List<Dimensions> dimensions;

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
        public java.util.List<Dimensions> getDimensions() {
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
            private java.util.List<Dimensions> dimensions; 
            private String expression; 
            private String id; 
            private String metricName; 
            private String statistic; 

            private Builder() {
            } 

            private Builder(HybridMetrics model) {
                this.dimensions = model.dimensions;
                this.expression = model.expression;
                this.id = model.id;
                this.metricName = model.metricName;
                this.statistic = model.statistic;
            } 

            /**
             * <p>The dimensions of the metric. Used to specify the resources monitored by the metric.</p>
             */
            public Builder dimensions(java.util.List<Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The metric operation expression for multiple Hybrid Cloud Monitoring metrics. The calculation result of the expression is used to trigger scaling.</p>
             * <p>The operation expression must comply with the Reverse Polish Notation (RPN) specification, and only the <code>+</code>, <code>-</code>, <code>*</code>, and <code>/</code> operators are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>(a+b)/2</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The reference ID of the metric in the metric operation expression.</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the monitoring metrics in the monitoring metrics repository for Hybrid Cloud Monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunSmq_NumberOfMessagesVisible</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The statistical method of the metric. Valid values:</p>
             * <ul>
             * <li>Average: the average value of all data points within the specified period.</li>
             * <li>Minimum: the minimum value of all data points within the specified period.</li>
             * <li>Maximum: the maximum value of all data points within the specified period.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
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
     * {@link CreateScalingRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingRuleRequest</p>
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

            private Builder() {
            } 

            private Builder(StepAdjustments model) {
                this.metricIntervalLowerBound = model.metricIntervalLowerBound;
                this.metricIntervalUpperBound = model.metricIntervalUpperBound;
                this.scalingAdjustment = model.scalingAdjustment;
            } 

            /**
             * <p>The lower boundary of the step adjustment. This parameter is applicable only to step scaling rules. Valid values: -9.999999E18 to 9.999999E18.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder metricIntervalLowerBound(Float metricIntervalLowerBound) {
                this.metricIntervalLowerBound = metricIntervalLowerBound;
                return this;
            }

            /**
             * <p>The upper boundary of the step adjustment. Valid values: -9.999999E18 to 9.999999E18.</p>
             * 
             * <strong>example:</strong>
             * <p>5.0</p>
             */
            public Builder metricIntervalUpperBound(Float metricIntervalUpperBound) {
                this.metricIntervalUpperBound = metricIntervalUpperBound;
                return this;
            }

            /**
             * <p>The number of instances to be scaled for the step adjustment. This parameter is applicable only to step scaling rules.</p>
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
