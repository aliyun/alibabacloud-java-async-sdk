// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyScalingGroupRequest</p>
 */
public class ModifyScalingGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemovalPolicy")
    private java.util.List < String > removalPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveScalingConfigurationId")
    private String activeScalingConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultCooldown")
    @com.aliyun.core.annotation.Validation(maximum = 86400)
    private Integer defaultCooldown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSize")
    private Integer maxSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinSize")
    private Integer minSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupName")
    private String scalingGroupName;

    private ModifyScalingGroupRequest(Builder builder) {
        super(builder);
        this.removalPolicy = builder.removalPolicy;
        this.activeScalingConfigurationId = builder.activeScalingConfigurationId;
        this.defaultCooldown = builder.defaultCooldown;
        this.maxSize = builder.maxSize;
        this.minSize = builder.minSize;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.scalingGroupName = builder.scalingGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return removalPolicy
     */
    public java.util.List < String > getRemovalPolicy() {
        return this.removalPolicy;
    }

    /**
     * @return activeScalingConfigurationId
     */
    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    /**
     * @return defaultCooldown
     */
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    /**
     * @return maxSize
     */
    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * @return minSize
     */
    public Integer getMinSize() {
        return this.minSize;
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
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return scalingGroupName
     */
    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    public static final class Builder extends Request.Builder<ModifyScalingGroupRequest, Builder> {
        private java.util.List < String > removalPolicy; 
        private String activeScalingConfigurationId; 
        private Integer defaultCooldown; 
        private Integer maxSize; 
        private Integer minSize; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private String scalingGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScalingGroupRequest request) {
            super(request);
            this.removalPolicy = request.removalPolicy;
            this.activeScalingConfigurationId = request.activeScalingConfigurationId;
            this.defaultCooldown = request.defaultCooldown;
            this.maxSize = request.maxSize;
            this.minSize = request.minSize;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.scalingGroupName = request.scalingGroupName;
        } 

        /**
         * RemovalPolicy.
         */
        public Builder removalPolicy(java.util.List < String > removalPolicy) {
            this.putQueryParameter("RemovalPolicy", removalPolicy);
            this.removalPolicy = removalPolicy;
            return this;
        }

        /**
         * ActiveScalingConfigurationId.
         */
        public Builder activeScalingConfigurationId(String activeScalingConfigurationId) {
            this.putQueryParameter("ActiveScalingConfigurationId", activeScalingConfigurationId);
            this.activeScalingConfigurationId = activeScalingConfigurationId;
            return this;
        }

        /**
         * DefaultCooldown.
         */
        public Builder defaultCooldown(Integer defaultCooldown) {
            this.putQueryParameter("DefaultCooldown", defaultCooldown);
            this.defaultCooldown = defaultCooldown;
            return this;
        }

        /**
         * MaxSize.
         */
        public Builder maxSize(Integer maxSize) {
            this.putQueryParameter("MaxSize", maxSize);
            this.maxSize = maxSize;
            return this;
        }

        /**
         * MinSize.
         */
        public Builder minSize(Integer minSize) {
            this.putQueryParameter("MinSize", minSize);
            this.minSize = minSize;
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
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * ScalingGroupName.
         */
        public Builder scalingGroupName(String scalingGroupName) {
            this.putQueryParameter("ScalingGroupName", scalingGroupName);
            this.scalingGroupName = scalingGroupName;
            return this;
        }

        @Override
        public ModifyScalingGroupRequest build() {
            return new ModifyScalingGroupRequest(this);
        } 

    } 

}
