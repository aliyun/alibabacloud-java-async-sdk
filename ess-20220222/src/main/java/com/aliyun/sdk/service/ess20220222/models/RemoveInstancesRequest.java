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
    @com.aliyun.core.annotation.NameInMap("LifecycleHookContext")
    private LifecycleHookContext lifecycleHookContext;

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
        this.lifecycleHookContext = builder.lifecycleHookContext;
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
     * @return lifecycleHookContext
     */
    public LifecycleHookContext getLifecycleHookContext() {
        return this.lifecycleHookContext;
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
        private LifecycleHookContext lifecycleHookContext; 
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
            this.lifecycleHookContext = request.lifecycleHookContext;
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
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
         * <p>Specifies whether to modify the expected number of instances. Valid values:</p>
         * <ul>
         * <li>true: After the ECS instances are removed from the scaling group, the expected number of instances is decreased by the number of removed instances.</li>
         * <li>false: After the ECS instances are removed from the scaling group, the expected number of instances remains unchanged.</li>
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
         * <p>Specifies whether to ignore invalid instances when removing a batch of instances from the scaling group. Valid values:</p>
         * <ul>
         * <li>true: Invalid instances are ignored when removing a batch of instances from the scaling group. If invalid instances exist and valid instances are successfully removed, the execution status of the scaling activity is displayed as Warning. You can view the invalid instances in the scaling activity details.</li>
         * <li>false: Invalid instances are not ignored when removing a batch of instances from the scaling group. If invalid instances exist in the batch, an error is reported.</li>
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
         * <p>The IDs of the ECS instances to be removed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The context information of the lifecycle hook.</p>
         */
        public Builder lifecycleHookContext(LifecycleHookContext lifecycleHookContext) {
            String lifecycleHookContextShrink = shrink(lifecycleHookContext, "LifecycleHookContext", "json");
            this.putQueryParameter("LifecycleHookContext", lifecycleHookContextShrink);
            this.lifecycleHookContext = lifecycleHookContext;
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
         * <p>Specifies the action for the removed ECS instances. Valid values:</p>
         * <ul>
         * <li><p>recycle: The ECS instances are stopped in economical mode.</p>
         * <blockquote>
         * <p>This value takes effect only when <code>ScalingPolicy</code> is set to <code>recycle</code>.</p>
         * </blockquote>
         * </li>
         * <li><p>release: The ECS instances are released.</p>
         * </li>
         * </ul>
         * <p>The ScalingPolicy parameter of CreateScalingGroup specifies the reclaim mode of the scaling group, but the specific action when an instance is removed is determined by the RemovePolicy parameter of RemoveInstances. Examples:</p>
         * <ul>
         * <li>If ScalingPolicy is set to recycle and RemovePolicy is set to recycle, the ECS instances are stopped in economical mode.</li>
         * <li>If ScalingPolicy is set to recycle and RemovePolicy is set to release, the ECS instances are released.</li>
         * <li>If ScalingPolicy is set to release and RemovePolicy is set to recycle, the ECS instances are released.</li>
         * <li>If ScalingPolicy is set to release and RemovePolicy is set to release, the ECS instances are released.</li>
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
         * <p>The timeout period for waiting for the ECS instances to be successfully stopped during the scale-in process. Unit: seconds.
         * Valid values: 30 to 240.</p>
         * <blockquote>
         * <ul>
         * <li>By default, this parameter inherits the value from the scaling group. You can also reset it when calling RemoveInstances.</li>
         * <li>This parameter takes effect only in the scale-in process when RemovePolicy is set to release.  </li>
         * <li>If this parameter is set, the system waits for a maximum of the StopInstanceTimeout period for the instances to be successfully stopped. After the timeout period, the scale-in process continues regardless of whether the instances are successfully stopped.  </li>
         * <li>If this parameter is not set, the system waits for a long time for the instances to be successfully stopped. The scale-in process continues only after the instances are successfully stopped. If the instances fail to be stopped, the scale-in process is rolled back and the scale-in fails.</li>
         * </ul>
         * </blockquote>
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

    /**
     * 
     * {@link RemoveInstancesRequest} extends {@link TeaModel}
     *
     * <p>RemoveInstancesRequest</p>
     */
    public static class LifecycleHookContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisableLifecycleHook")
        private Boolean disableLifecycleHook;

        @com.aliyun.core.annotation.NameInMap("IgnoredLifecycleHookIds")
        private java.util.List<String> ignoredLifecycleHookIds;

        @com.aliyun.core.annotation.NameInMap("LifecycleHookResult")
        private String lifecycleHookResult;

        private LifecycleHookContext(Builder builder) {
            this.disableLifecycleHook = builder.disableLifecycleHook;
            this.ignoredLifecycleHookIds = builder.ignoredLifecycleHookIds;
            this.lifecycleHookResult = builder.lifecycleHookResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleHookContext create() {
            return builder().build();
        }

        /**
         * @return disableLifecycleHook
         */
        public Boolean getDisableLifecycleHook() {
            return this.disableLifecycleHook;
        }

        /**
         * @return ignoredLifecycleHookIds
         */
        public java.util.List<String> getIgnoredLifecycleHookIds() {
            return this.ignoredLifecycleHookIds;
        }

        /**
         * @return lifecycleHookResult
         */
        public String getLifecycleHookResult() {
            return this.lifecycleHookResult;
        }

        public static final class Builder {
            private Boolean disableLifecycleHook; 
            private java.util.List<String> ignoredLifecycleHookIds; 
            private String lifecycleHookResult; 

            private Builder() {
            } 

            private Builder(LifecycleHookContext model) {
                this.disableLifecycleHook = model.disableLifecycleHook;
                this.ignoredLifecycleHookIds = model.ignoredLifecycleHookIds;
                this.lifecycleHookResult = model.lifecycleHookResult;
            } 

            /**
             * <p>Specifies whether to disable all lifecycle hooks for the scaling activity. Valid values:</p>
             * <ul>
             * <li>true: Disables all lifecycle hooks.</li>
             * <li>false: Does not disable lifecycle hooks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disableLifecycleHook(Boolean disableLifecycleHook) {
                this.disableLifecycleHook = disableLifecycleHook;
                return this;
            }

            /**
             * <p>The IDs of the lifecycle hooks disabled for the scaling activity.</p>
             */
            public Builder ignoredLifecycleHookIds(java.util.List<String> ignoredLifecycleHookIds) {
                this.ignoredLifecycleHookIds = ignoredLifecycleHookIds;
                return this;
            }

            /**
             * <p>The default execution result of the lifecycle hook in this scaling activity. After this parameter is set, it overwrites the original default execution result of the hook.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTINUE</p>
             */
            public Builder lifecycleHookResult(String lifecycleHookResult) {
                this.lifecycleHookResult = lifecycleHookResult;
                return this;
            }

            public LifecycleHookContext build() {
                return new LifecycleHookContext(this);
            } 

        } 

    }
}
