// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachInstancesRequest} extends {@link RequestModel}
 *
 * <p>DetachInstancesRequest</p>
 */
public class DetachInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecreaseDesiredCapacity")
    private Boolean decreaseDesiredCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetachOption")
    private String detachOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreInvalidInstance")
    private Boolean ignoreInvalidInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleHook")
    private Boolean lifecycleHook;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    private DetachInstancesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.decreaseDesiredCapacity = builder.decreaseDesiredCapacity;
        this.detachOption = builder.detachOption;
        this.ignoreInvalidInstance = builder.ignoreInvalidInstance;
        this.instanceIds = builder.instanceIds;
        this.lifecycleHook = builder.lifecycleHook;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return decreaseDesiredCapacity
     */
    public Boolean getDecreaseDesiredCapacity() {
        return this.decreaseDesiredCapacity;
    }

    /**
     * @return detachOption
     */
    public String getDetachOption() {
        return this.detachOption;
    }

    /**
     * @return ignoreInvalidInstance
     */
    public Boolean getIgnoreInvalidInstance() {
        return this.ignoreInvalidInstance;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return lifecycleHook
     */
    public Boolean getLifecycleHook() {
        return this.lifecycleHook;
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
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<DetachInstancesRequest, Builder> {
        private String clientToken; 
        private Boolean decreaseDesiredCapacity; 
        private String detachOption; 
        private Boolean ignoreInvalidInstance; 
        private java.util.List < String > instanceIds; 
        private Boolean lifecycleHook; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DetachInstancesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.decreaseDesiredCapacity = request.decreaseDesiredCapacity;
            this.detachOption = request.detachOption;
            this.ignoreInvalidInstance = request.ignoreInvalidInstance;
            this.instanceIds = request.instanceIds;
            this.lifecycleHook = request.lifecycleHook;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [Ensure idempotence](~~25965~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to adjust the expected number of instances in the scaling group. Valid values:
         * <p>
         * 
         * *   true: After a specific number of instances are removed from the scaling group, the expected number of instances in the scaling group decreases.
         * *   false: After a specific number of instances are removed from the scaling group, the expected number of instances in the scaling group remains unchanged.
         * 
         * Default value: true.
         */
        public Builder decreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
            this.putQueryParameter("DecreaseDesiredCapacity", decreaseDesiredCapacity);
            this.decreaseDesiredCapacity = decreaseDesiredCapacity;
            return this;
        }

        /**
         * Specifies whether to detach the ECS instances or elastic container instances that are marked for removal from the associated load balancers, and whether to remove the private IP addresses of these instances from the IP address whitelists of the associated ApsaraDB RDS instances.
         * <p>
         * 
         * Both: detaches the ECS instances or elastic container instances that are marked for removal from the associated load balancers and removes the private IP addresses of these instances from the IP address whitelists of the associated ApsaraDB RDS instances.
         * 
         * >  This parameter is not supported if you want to remove Alibaba Cloud-hosted third-party instances from a scaling group.
         */
        public Builder detachOption(String detachOption) {
            this.putQueryParameter("DetachOption", detachOption);
            this.detachOption = detachOption;
            return this;
        }

        /**
         * 从伸缩组移出一批实例时，是否忽略其中无效的实例。取值范围：
         * <p>
         * - true：从伸缩组中移出一批实例时，会忽略其中无效的实例。如果存在无效的实例，并且有效的实例被成功移除时，伸缩活动执行状态也会显示为警告状态，可以从伸缩活动详情查看无效的实例。
         * - false：从伸缩组中移出一批实例时，不会忽略无效的实例。如果一批实例中存在无效的实例，请求会报错。
         * 
         * 默认值：false。
         */
        public Builder ignoreInvalidInstance(Boolean ignoreInvalidInstance) {
            this.putQueryParameter("IgnoreInvalidInstance", ignoreInvalidInstance);
            this.ignoreInvalidInstance = ignoreInvalidInstance;
            return this;
        }

        /**
         * The IDs of the ECS instances, elastic container instances, or Aliababa Cloud-managed third-party instances that you want to remove from a scaling group.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Specifies whether to trigger a lifecycle hook for scale-in purposes when ECS instances or elastic container instances are removed from the scaling group. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * >  This parameter is not supported if you want to remove Alibaba Cloud-hosted third-party instances from a scaling group.
         * 
         * Default value: false.
         */
        public Builder lifecycleHook(Boolean lifecycleHook) {
            this.putQueryParameter("LifecycleHook", lifecycleHook);
            this.lifecycleHook = lifecycleHook;
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
         * The ID of the scaling group.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public DetachInstancesRequest build() {
            return new DetachInstancesRequest(this);
        } 

    } 

}
