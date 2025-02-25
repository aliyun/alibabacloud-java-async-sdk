// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateScalingGroupRequest</p>
 */
public class CreateScalingGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemovalPolicy")
    private java.util.List < String > removalPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceIds")
    private String DBInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultCooldown")
    private Integer defaultCooldown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
    private String loadBalancerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer minSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupName")
    private String scalingGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateScalingGroupRequest(Builder builder) {
        super(builder);
        this.removalPolicy = builder.removalPolicy;
        this.DBInstanceIds = builder.DBInstanceIds;
        this.defaultCooldown = builder.defaultCooldown;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.maxSize = builder.maxSize;
        this.minSize = builder.minSize;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupName = builder.scalingGroupName;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScalingGroupRequest create() {
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
     * @return DBInstanceIds
     */
    public String getDBInstanceIds() {
        return this.DBInstanceIds;
    }

    /**
     * @return defaultCooldown
     */
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    /**
     * @return loadBalancerIds
     */
    public String getLoadBalancerIds() {
        return this.loadBalancerIds;
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
     * @return scalingGroupName
     */
    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateScalingGroupRequest, Builder> {
        private java.util.List < String > removalPolicy; 
        private String DBInstanceIds; 
        private Integer defaultCooldown; 
        private String loadBalancerIds; 
        private Integer maxSize; 
        private Integer minSize; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupName; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateScalingGroupRequest request) {
            super(request);
            this.removalPolicy = request.removalPolicy;
            this.DBInstanceIds = request.DBInstanceIds;
            this.defaultCooldown = request.defaultCooldown;
            this.loadBalancerIds = request.loadBalancerIds;
            this.maxSize = request.maxSize;
            this.minSize = request.minSize;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupName = request.scalingGroupName;
            this.vSwitchId = request.vSwitchId;
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
         * DBInstanceIds.
         */
        public Builder DBInstanceIds(String DBInstanceIds) {
            this.putQueryParameter("DBInstanceIds", DBInstanceIds);
            this.DBInstanceIds = DBInstanceIds;
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
         * LoadBalancerIds.
         */
        public Builder loadBalancerIds(String loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
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
         * RegionId.
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
         * ScalingGroupName.
         */
        public Builder scalingGroupName(String scalingGroupName) {
            this.putQueryParameter("ScalingGroupName", scalingGroupName);
            this.scalingGroupName = scalingGroupName;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateScalingGroupRequest build() {
            return new CreateScalingGroupRequest(this);
        } 

    } 

}
