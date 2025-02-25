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
 * {@link ModifyAutoScalingConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoScalingConfigRequest</p>
 */
public class ModifyAutoScalingConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigName")
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
    @com.aliyun.core.annotation.NameInMap("ScaleType")
    private String scaleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecId")
    private String specId;

    private ModifyAutoScalingConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.configId = builder.configId;
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
        this.scaleType = builder.scaleType;
        this.securityToken = builder.securityToken;
        this.specId = builder.specId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoScalingConfigRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyAutoScalingConfigRequest, Builder> {
        private String regionId; 
        private String configId; 
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
        private String scaleType; 
        private String securityToken; 
        private String specId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoScalingConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.configId = request.configId;
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
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * ConfigName.
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
         * Engine.
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
         * ScaleType.
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
         * SpecId.
         */
        public Builder specId(String specId) {
            this.putQueryParameter("SpecId", specId);
            this.specId = specId;
            return this;
        }

        @Override
        public ModifyAutoScalingConfigRequest build() {
            return new ModifyAutoScalingConfigRequest(this);
        } 

    } 

}
