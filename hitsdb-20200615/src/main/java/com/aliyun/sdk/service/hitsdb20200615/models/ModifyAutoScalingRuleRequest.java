// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link ModifyAutoScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoScalingRuleRequest</p>
 */
public class ModifyAutoScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObservationWindow")
    private Integer observationWindow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleInStep")
    private Integer scaleInStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleOutStep")
    private Integer scaleOutStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SilenceTime")
    private Integer silenceTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetMetric")
    private String targetMetric;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetNodes")
    private Integer targetNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThresholdLower")
    private Integer thresholdLower;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThresholdUpper")
    private Integer thresholdUpper;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerCronExpr")
    private String triggerCronExpr;

    private ModifyAutoScalingRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.configId = builder.configId;
        this.enabled = builder.enabled;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.observationWindow = builder.observationWindow;
        this.operationType = builder.operationType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.scaleInStep = builder.scaleInStep;
        this.scaleOutStep = builder.scaleOutStep;
        this.securityToken = builder.securityToken;
        this.silenceTime = builder.silenceTime;
        this.startTime = builder.startTime;
        this.targetMetric = builder.targetMetric;
        this.targetNodes = builder.targetNodes;
        this.thresholdLower = builder.thresholdLower;
        this.thresholdUpper = builder.thresholdUpper;
        this.triggerCronExpr = builder.triggerCronExpr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoScalingRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return observationWindow
     */
    public Integer getObservationWindow() {
        return this.observationWindow;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return scaleInStep
     */
    public Integer getScaleInStep() {
        return this.scaleInStep;
    }

    /**
     * @return scaleOutStep
     */
    public Integer getScaleOutStep() {
        return this.scaleOutStep;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return silenceTime
     */
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return targetMetric
     */
    public String getTargetMetric() {
        return this.targetMetric;
    }

    /**
     * @return targetNodes
     */
    public Integer getTargetNodes() {
        return this.targetNodes;
    }

    /**
     * @return thresholdLower
     */
    public Integer getThresholdLower() {
        return this.thresholdLower;
    }

    /**
     * @return thresholdUpper
     */
    public Integer getThresholdUpper() {
        return this.thresholdUpper;
    }

    /**
     * @return triggerCronExpr
     */
    public String getTriggerCronExpr() {
        return this.triggerCronExpr;
    }

    public static final class Builder extends Request.Builder<ModifyAutoScalingRuleRequest, Builder> {
        private String regionId; 
        private String configId; 
        private Boolean enabled; 
        private String endTime; 
        private String instanceId; 
        private Integer observationWindow; 
        private String operationType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ruleId; 
        private String ruleName; 
        private String ruleType; 
        private Integer scaleInStep; 
        private Integer scaleOutStep; 
        private String securityToken; 
        private Integer silenceTime; 
        private String startTime; 
        private String targetMetric; 
        private Integer targetNodes; 
        private Integer thresholdLower; 
        private Integer thresholdUpper; 
        private String triggerCronExpr; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoScalingRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.configId = request.configId;
            this.enabled = request.enabled;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.observationWindow = request.observationWindow;
            this.operationType = request.operationType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.scaleInStep = request.scaleInStep;
            this.scaleOutStep = request.scaleOutStep;
            this.securityToken = request.securityToken;
            this.silenceTime = request.silenceTime;
            this.startTime = request.startTime;
            this.targetMetric = request.targetMetric;
            this.targetNodes = request.targetNodes;
            this.thresholdLower = request.thresholdLower;
            this.thresholdUpper = request.thresholdUpper;
            this.triggerCronExpr = request.triggerCronExpr;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ObservationWindow.
         */
        public Builder observationWindow(Integer observationWindow) {
            this.putQueryParameter("ObservationWindow", observationWindow);
            this.observationWindow = observationWindow;
            return this;
        }

        /**
         * OperationType.
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
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
         * <p>This parameter is required.</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * ScaleInStep.
         */
        public Builder scaleInStep(Integer scaleInStep) {
            this.putQueryParameter("ScaleInStep", scaleInStep);
            this.scaleInStep = scaleInStep;
            return this;
        }

        /**
         * ScaleOutStep.
         */
        public Builder scaleOutStep(Integer scaleOutStep) {
            this.putQueryParameter("ScaleOutStep", scaleOutStep);
            this.scaleOutStep = scaleOutStep;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * SilenceTime.
         */
        public Builder silenceTime(Integer silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TargetMetric.
         */
        public Builder targetMetric(String targetMetric) {
            this.putQueryParameter("TargetMetric", targetMetric);
            this.targetMetric = targetMetric;
            return this;
        }

        /**
         * TargetNodes.
         */
        public Builder targetNodes(Integer targetNodes) {
            this.putQueryParameter("TargetNodes", targetNodes);
            this.targetNodes = targetNodes;
            return this;
        }

        /**
         * ThresholdLower.
         */
        public Builder thresholdLower(Integer thresholdLower) {
            this.putQueryParameter("ThresholdLower", thresholdLower);
            this.thresholdLower = thresholdLower;
            return this;
        }

        /**
         * ThresholdUpper.
         */
        public Builder thresholdUpper(Integer thresholdUpper) {
            this.putQueryParameter("ThresholdUpper", thresholdUpper);
            this.thresholdUpper = thresholdUpper;
            return this;
        }

        /**
         * TriggerCronExpr.
         */
        public Builder triggerCronExpr(String triggerCronExpr) {
            this.putQueryParameter("TriggerCronExpr", triggerCronExpr);
            this.triggerCronExpr = triggerCronExpr;
            return this;
        }

        @Override
        public ModifyAutoScalingRuleRequest build() {
            return new ModifyAutoScalingRuleRequest(this);
        } 

    } 

}
