// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

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
    @NameInMap("StepAdjustment")
    private java.util.List < StepAdjustment> stepAdjustment;

    @Query
    @NameInMap("TargetValue")
    private Float targetValue;

    private CreateScalingRuleRequest(Builder builder) {
        super(builder);
        this.adjustmentType = builder.adjustmentType;
        this.adjustmentValue = builder.adjustmentValue;
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
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scaleInEvaluationCount = builder.scaleInEvaluationCount;
        this.scaleOutEvaluationCount = builder.scaleOutEvaluationCount;
        this.scalingGroupId = builder.scalingGroupId;
        this.scalingRuleName = builder.scalingRuleName;
        this.scalingRuleType = builder.scalingRuleType;
        this.stepAdjustment = builder.stepAdjustment;
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
     * @return stepAdjustment
     */
    public java.util.List < StepAdjustment> getStepAdjustment() {
        return this.stepAdjustment;
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
        private String resourceOwnerAccount; 
        private Integer scaleInEvaluationCount; 
        private Integer scaleOutEvaluationCount; 
        private String scalingGroupId; 
        private String scalingRuleName; 
        private String scalingRuleType; 
        private java.util.List < StepAdjustment> stepAdjustment; 
        private Float targetValue; 

        private Builder() {
            super();
        } 

        private Builder(CreateScalingRuleRequest response) {
            super(response);
            this.adjustmentType = response.adjustmentType;
            this.adjustmentValue = response.adjustmentValue;
            this.cooldown = response.cooldown;
            this.disableScaleIn = response.disableScaleIn;
            this.estimatedInstanceWarmup = response.estimatedInstanceWarmup;
            this.initialMaxSize = response.initialMaxSize;
            this.metricName = response.metricName;
            this.minAdjustmentMagnitude = response.minAdjustmentMagnitude;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.predictiveScalingMode = response.predictiveScalingMode;
            this.predictiveTaskBufferTime = response.predictiveTaskBufferTime;
            this.predictiveValueBehavior = response.predictiveValueBehavior;
            this.predictiveValueBuffer = response.predictiveValueBuffer;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scaleInEvaluationCount = response.scaleInEvaluationCount;
            this.scaleOutEvaluationCount = response.scaleOutEvaluationCount;
            this.scalingGroupId = response.scalingGroupId;
            this.scalingRuleName = response.scalingRuleName;
            this.scalingRuleType = response.scalingRuleType;
            this.stepAdjustment = response.stepAdjustment;
            this.targetValue = response.targetValue;
        } 

        /**
         * AdjustmentType.
         */
        public Builder adjustmentType(String adjustmentType) {
            this.putQueryParameter("AdjustmentType", adjustmentType);
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * AdjustmentValue.
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.putQueryParameter("AdjustmentValue", adjustmentValue);
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * Cooldown.
         */
        public Builder cooldown(Integer cooldown) {
            this.putQueryParameter("Cooldown", cooldown);
            this.cooldown = cooldown;
            return this;
        }

        /**
         * DisableScaleIn.
         */
        public Builder disableScaleIn(Boolean disableScaleIn) {
            this.putQueryParameter("DisableScaleIn", disableScaleIn);
            this.disableScaleIn = disableScaleIn;
            return this;
        }

        /**
         * EstimatedInstanceWarmup.
         */
        public Builder estimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
            this.putQueryParameter("EstimatedInstanceWarmup", estimatedInstanceWarmup);
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }

        /**
         * InitialMaxSize.
         */
        public Builder initialMaxSize(Integer initialMaxSize) {
            this.putQueryParameter("InitialMaxSize", initialMaxSize);
            this.initialMaxSize = initialMaxSize;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * MinAdjustmentMagnitude.
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
         * PredictiveScalingMode.
         */
        public Builder predictiveScalingMode(String predictiveScalingMode) {
            this.putQueryParameter("PredictiveScalingMode", predictiveScalingMode);
            this.predictiveScalingMode = predictiveScalingMode;
            return this;
        }

        /**
         * PredictiveTaskBufferTime.
         */
        public Builder predictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
            this.putQueryParameter("PredictiveTaskBufferTime", predictiveTaskBufferTime);
            this.predictiveTaskBufferTime = predictiveTaskBufferTime;
            return this;
        }

        /**
         * PredictiveValueBehavior.
         */
        public Builder predictiveValueBehavior(String predictiveValueBehavior) {
            this.putQueryParameter("PredictiveValueBehavior", predictiveValueBehavior);
            this.predictiveValueBehavior = predictiveValueBehavior;
            return this;
        }

        /**
         * PredictiveValueBuffer.
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
         * ScaleInEvaluationCount.
         */
        public Builder scaleInEvaluationCount(Integer scaleInEvaluationCount) {
            this.putQueryParameter("ScaleInEvaluationCount", scaleInEvaluationCount);
            this.scaleInEvaluationCount = scaleInEvaluationCount;
            return this;
        }

        /**
         * ScaleOutEvaluationCount.
         */
        public Builder scaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
            this.putQueryParameter("ScaleOutEvaluationCount", scaleOutEvaluationCount);
            this.scaleOutEvaluationCount = scaleOutEvaluationCount;
            return this;
        }

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * ScalingRuleName.
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * ScalingRuleType.
         */
        public Builder scalingRuleType(String scalingRuleType) {
            this.putQueryParameter("ScalingRuleType", scalingRuleType);
            this.scalingRuleType = scalingRuleType;
            return this;
        }

        /**
         * StepAdjustment.
         */
        public Builder stepAdjustment(java.util.List < StepAdjustment> stepAdjustment) {
            this.putQueryParameter("StepAdjustment", stepAdjustment);
            this.stepAdjustment = stepAdjustment;
            return this;
        }

        /**
         * TargetValue.
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
}
