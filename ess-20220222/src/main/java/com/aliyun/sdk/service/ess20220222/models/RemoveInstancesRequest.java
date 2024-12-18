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
 * {@link RemoveInstancesRequest} extends {@link RequestModel}
 *
 * <p>RemoveInstancesRequest</p>
 */
public class RemoveInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecreaseDesiredCapacity")
    private Boolean decreaseDesiredCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreInvalidInstance")
    private Boolean ignoreInvalidInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemovePolicy")
    private String removePolicy;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopInstanceTimeout")
    private Integer stopInstanceTimeout;

    private RemoveInstancesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.decreaseDesiredCapacity = builder.decreaseDesiredCapacity;
        this.ignoreInvalidInstance = builder.ignoreInvalidInstance;
        this.instanceIds = builder.instanceIds;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.removePolicy = builder.removePolicy;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupId = builder.scalingGroupId;
        this.stopInstanceTimeout = builder.stopInstanceTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveInstancesRequest create() {
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
     * @return ignoreInvalidInstance
     */
    public Boolean getIgnoreInvalidInstance() {
        return this.ignoreInvalidInstance;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
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
     * @return removePolicy
     */
    public String getRemovePolicy() {
        return this.removePolicy;
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

    /**
     * @return stopInstanceTimeout
     */
    public Integer getStopInstanceTimeout() {
        return this.stopInstanceTimeout;
    }

    public static final class Builder extends Request.Builder<RemoveInstancesRequest, Builder> {
        private String clientToken; 
        private Boolean decreaseDesiredCapacity; 
        private Boolean ignoreInvalidInstance; 
        private java.util.List<String> instanceIds; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String removePolicy; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 
        private Integer stopInstanceTimeout; 

        private Builder() {
            super();
        } 

        private Builder(RemoveInstancesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.decreaseDesiredCapacity = request.decreaseDesiredCapacity;
            this.ignoreInvalidInstance = request.ignoreInvalidInstance;
            this.instanceIds = request.instanceIds;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.removePolicy = request.removePolicy;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingGroupId = request.scalingGroupId;
            this.stopInstanceTimeout = request.stopInstanceTimeout;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to adjust the expected number of ECS instances in the scaling group. Valid values:</p>
         * <ul>
         * <li>true: After ECS instances are removed from the scaling group, the expected number of ECS instances in the scaling group decreases.</li>
         * <li>false: After ECS instances are removed from the scaling group, the expected number of ECS instances in the scaling group remains unchanged.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder decreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
            this.putQueryParameter("DecreaseDesiredCapacity", decreaseDesiredCapacity);
            this.decreaseDesiredCapacity = decreaseDesiredCapacity;
            return this;
        }

        /**
         * <p>Specifies whether to ignore invalid instances when you remove a batch of instances from the scaling group. Valid values:</p>
         * <ul>
         * <li>true: ignores invalid instances. If invalid instances exist and valid instances are deleted, the corresponding scaling activity enters the Warning state. You can check the scaling activity details to view the invalid instances that are ignored.</li>
         * <li>false: does not ignore invalid instances. If invalid instances exist in the batch of instances that you want to remove from the scaling group, an error is reported.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ignoreInvalidInstance(Boolean ignoreInvalidInstance) {
            this.putQueryParameter("IgnoreInvalidInstance", ignoreInvalidInstance);
            this.ignoreInvalidInstance = ignoreInvalidInstance;
            return this;
        }

        /**
         * <p>The IDs of the ECS instances that you want to remove from the scaling group.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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
         * <p>The region ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The action subsequent to the removal of the Elastic Compute Service (ECS) instances. Valid values:</p>
         * <ul>
         * <li><p>recycle: The ECS instances enter the Economical Mode.</p>
         * <p>**</p>
         * <p><strong>Note</strong> This setting is applicable only if you set <code>ScalingPolicy</code> to <code>recycle</code>.</p>
         * </li>
         * <li><p>release: The ECS instances are released.</p>
         * </li>
         * </ul>
         * <p>ScalingPolicy of the CreateScalingGroup operation specifies the reclaim mode of the scaling group while RemovePolicy of the RemoveInstances operation specifies the subsequent action when an ECS instance is removed from the scaling group. Examples:</p>
         * <ul>
         * <li>If you set ScalingPolicy and RemovePolicy to recycle, the ECS instances enter the Economical Mode when they are removed.</li>
         * <li>If you set ScalingPolicy to recycle and RemovePolicy to release, the ECS instances are released when they are removed.</li>
         * <li>If you set ScalingPolicy to release and RemovePolicy to recycle, the ECS instances are released when they are removed.</li>
         * <li>If you set ScalingPolicy and RemovePolicy to release, the ECS instances are released when they are removed.</li>
         * </ul>
         * <p>Default value: release.</p>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        public Builder removePolicy(String removePolicy) {
            this.putQueryParameter("RemovePolicy", removePolicy);
            this.removePolicy = removePolicy;
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
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The period of time required by the ECS instance to enter the Stopped state. Unit: seconds. Valid values: 30 to 240.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>By default, this parameter inherits the value of StopInstanceTimeout specified in the CreateScalingGroup or ModifyScalingGroup operation. You can also specify a different value for this parameter in the RemoveInstances operation.</p>
         * </li>
         * <li><p>This parameter takes effect only if you set RemovePolicy to release.</p>
         * </li>
         * <li><p>If you specify this parameter, the system waits for the ECS instance to enter the Stopped state only for up to the specified period of time before continuing with the scale-in operation, regardless of the status of the ECS instance.</p>
         * </li>
         * <li><p>If you do not specify this parameter, the system continues with the scale-in operation until the ECS instance enters the Stopped state. If the ECS instance is not successfully stopped, the scale-in process is rolled back and considered failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder stopInstanceTimeout(Integer stopInstanceTimeout) {
            this.putQueryParameter("StopInstanceTimeout", stopInstanceTimeout);
            this.stopInstanceTimeout = stopInstanceTimeout;
            return this;
        }

        @Override
        public RemoveInstancesRequest build() {
            return new RemoveInstancesRequest(this);
        } 

    } 

}
