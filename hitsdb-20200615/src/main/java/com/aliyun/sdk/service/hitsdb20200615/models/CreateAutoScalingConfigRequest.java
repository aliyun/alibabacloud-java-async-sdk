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
 * {@link CreateAutoScalingConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoScalingConfigRequest</p>
 */
public class CreateAutoScalingConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTimeEnd")
    private String effectiveTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTimeStart")
    private String effectiveTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodesMax")
    private Integer nodesMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodesMin")
    private Integer nodesMin;

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
    @com.aliyun.core.annotation.NameInMap("ScaleRuleList")
    private java.util.List<ScaleRuleList> scaleRuleList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scaleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String specId;

    private CreateAutoScalingConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.configName = builder.configName;
        this.effectiveTimeEnd = builder.effectiveTimeEnd;
        this.effectiveTimeStart = builder.effectiveTimeStart;
        this.enabled = builder.enabled;
        this.engine = builder.engine;
        this.instanceId = builder.instanceId;
        this.nodesMax = builder.nodesMax;
        this.nodesMin = builder.nodesMin;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scaleRuleList = builder.scaleRuleList;
        this.scaleType = builder.scaleType;
        this.securityToken = builder.securityToken;
        this.specId = builder.specId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoScalingConfigRequest create() {
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
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return effectiveTimeEnd
     */
    public String getEffectiveTimeEnd() {
        return this.effectiveTimeEnd;
    }

    /**
     * @return effectiveTimeStart
     */
    public String getEffectiveTimeStart() {
        return this.effectiveTimeStart;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodesMax
     */
    public Integer getNodesMax() {
        return this.nodesMax;
    }

    /**
     * @return nodesMin
     */
    public Integer getNodesMin() {
        return this.nodesMin;
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
     * @return scaleRuleList
     */
    public java.util.List<ScaleRuleList> getScaleRuleList() {
        return this.scaleRuleList;
    }

    /**
     * @return scaleType
     */
    public String getScaleType() {
        return this.scaleType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return specId
     */
    public String getSpecId() {
        return this.specId;
    }

    public static final class Builder extends Request.Builder<CreateAutoScalingConfigRequest, Builder> {
        private String regionId; 
        private String configName; 
        private String effectiveTimeEnd; 
        private String effectiveTimeStart; 
        private Boolean enabled; 
        private String engine; 
        private String instanceId; 
        private Integer nodesMax; 
        private Integer nodesMin; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<ScaleRuleList> scaleRuleList; 
        private String scaleType; 
        private String securityToken; 
        private String specId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoScalingConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.configName = request.configName;
            this.effectiveTimeEnd = request.effectiveTimeEnd;
            this.effectiveTimeStart = request.effectiveTimeStart;
            this.enabled = request.enabled;
            this.engine = request.engine;
            this.instanceId = request.instanceId;
            this.nodesMax = request.nodesMax;
            this.nodesMin = request.nodesMin;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scaleRuleList = request.scaleRuleList;
            this.scaleType = request.scaleType;
            this.securityToken = request.securityToken;
            this.specId = request.specId;
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
        public Builder configName(String configName) {
            this.putQueryParameter("ConfigName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * EffectiveTimeEnd.
         */
        public Builder effectiveTimeEnd(String effectiveTimeEnd) {
            this.putQueryParameter("EffectiveTimeEnd", effectiveTimeEnd);
            this.effectiveTimeEnd = effectiveTimeEnd;
            return this;
        }

        /**
         * EffectiveTimeStart.
         */
        public Builder effectiveTimeStart(String effectiveTimeStart) {
            this.putQueryParameter("EffectiveTimeStart", effectiveTimeStart);
            this.effectiveTimeStart = effectiveTimeStart;
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
         * <p>This parameter is required.</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
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
         * NodesMax.
         */
        public Builder nodesMax(Integer nodesMax) {
            this.putQueryParameter("NodesMax", nodesMax);
            this.nodesMax = nodesMax;
            return this;
        }

        /**
         * NodesMin.
         */
        public Builder nodesMin(Integer nodesMin) {
            this.putQueryParameter("NodesMin", nodesMin);
            this.nodesMin = nodesMin;
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
         * ScaleRuleList.
         */
        public Builder scaleRuleList(java.util.List<ScaleRuleList> scaleRuleList) {
            String scaleRuleListShrink = shrink(scaleRuleList, "ScaleRuleList", "json");
            this.putQueryParameter("ScaleRuleList", scaleRuleListShrink);
            this.scaleRuleList = scaleRuleList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder scaleType(String scaleType) {
            this.putQueryParameter("ScaleType", scaleType);
            this.scaleType = scaleType;
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
         * <p>This parameter is required.</p>
         */
        public Builder specId(String specId) {
            this.putQueryParameter("SpecId", specId);
            this.specId = specId;
            return this;
        }

        @Override
        public CreateAutoScalingConfigRequest build() {
            return new CreateAutoScalingConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAutoScalingConfigRequest} extends {@link TeaModel}
     *
     * <p>CreateAutoScalingConfigRequest</p>
     */
    public static class ScaleRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ObservationWindow")
        private Integer observationWindow;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("ScaleInStep")
        private Integer scaleInStep;

        @com.aliyun.core.annotation.NameInMap("ScaleOutStep")
        private Integer scaleOutStep;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private Integer silenceTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TargetMetric")
        private String targetMetric;

        @com.aliyun.core.annotation.NameInMap("TargetNodes")
        private Integer targetNodes;

        @com.aliyun.core.annotation.NameInMap("ThresholdLower")
        private Integer thresholdLower;

        @com.aliyun.core.annotation.NameInMap("ThresholdUpper")
        private Integer thresholdUpper;

        @com.aliyun.core.annotation.NameInMap("TriggerCronExpr")
        private String triggerCronExpr;

        private ScaleRuleList(Builder builder) {
            this.configId = builder.configId;
            this.enabled = builder.enabled;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.observationWindow = builder.observationWindow;
            this.operationType = builder.operationType;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
            this.scaleInStep = builder.scaleInStep;
            this.scaleOutStep = builder.scaleOutStep;
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

        public static ScaleRuleList create() {
            return builder().build();
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

        public static final class Builder {
            private String configId; 
            private Boolean enabled; 
            private String endTime; 
            private String instanceId; 
            private Integer observationWindow; 
            private String operationType; 
            private String ruleId; 
            private String ruleName; 
            private String ruleType; 
            private Integer scaleInStep; 
            private Integer scaleOutStep; 
            private Integer silenceTime; 
            private String startTime; 
            private String targetMetric; 
            private Integer targetNodes; 
            private Integer thresholdLower; 
            private Integer thresholdUpper; 
            private String triggerCronExpr; 

            /**
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ObservationWindow.
             */
            public Builder observationWindow(Integer observationWindow) {
                this.observationWindow = observationWindow;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * ScaleInStep.
             */
            public Builder scaleInStep(Integer scaleInStep) {
                this.scaleInStep = scaleInStep;
                return this;
            }

            /**
             * ScaleOutStep.
             */
            public Builder scaleOutStep(Integer scaleOutStep) {
                this.scaleOutStep = scaleOutStep;
                return this;
            }

            /**
             * SilenceTime.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TargetMetric.
             */
            public Builder targetMetric(String targetMetric) {
                this.targetMetric = targetMetric;
                return this;
            }

            /**
             * TargetNodes.
             */
            public Builder targetNodes(Integer targetNodes) {
                this.targetNodes = targetNodes;
                return this;
            }

            /**
             * ThresholdLower.
             */
            public Builder thresholdLower(Integer thresholdLower) {
                this.thresholdLower = thresholdLower;
                return this;
            }

            /**
             * ThresholdUpper.
             */
            public Builder thresholdUpper(Integer thresholdUpper) {
                this.thresholdUpper = thresholdUpper;
                return this;
            }

            /**
             * TriggerCronExpr.
             */
            public Builder triggerCronExpr(String triggerCronExpr) {
                this.triggerCronExpr = triggerCronExpr;
                return this;
            }

            public ScaleRuleList build() {
                return new ScaleRuleList(this);
            } 

        } 

    }
}
