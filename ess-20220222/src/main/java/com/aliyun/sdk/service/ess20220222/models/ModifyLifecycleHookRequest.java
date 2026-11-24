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
 * {@link ModifyLifecycleHookRequest} extends {@link RequestModel}
 *
 * <p>ModifyLifecycleHookRequest</p>
 */
public class ModifyLifecycleHookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultResult")
    private String defaultResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HeartbeatTimeout")
    private Integer heartbeatTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleActionSources")
    private java.util.List<String> lifecycleActionSources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleHookId")
    private String lifecycleHookId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleHookName")
    private String lifecycleHookName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleHookStatus")
    private String lifecycleHookStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleTransition")
    private String lifecycleTransition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationArn")
    private String notificationArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationMetadata")
    private String notificationMetadata;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    private String scalingGroupId;

    private ModifyLifecycleHookRequest(Builder builder) {
        super(builder);
        this.defaultResult = builder.defaultResult;
        this.heartbeatTimeout = builder.heartbeatTimeout;
        this.lifecycleActionSources = builder.lifecycleActionSources;
        this.lifecycleHookId = builder.lifecycleHookId;
        this.lifecycleHookName = builder.lifecycleHookName;
        this.lifecycleHookStatus = builder.lifecycleHookStatus;
        this.lifecycleTransition = builder.lifecycleTransition;
        this.notificationArn = builder.notificationArn;
        this.notificationMetadata = builder.notificationMetadata;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLifecycleHookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultResult
     */
    public String getDefaultResult() {
        return this.defaultResult;
    }

    /**
     * @return heartbeatTimeout
     */
    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    /**
     * @return lifecycleActionSources
     */
    public java.util.List<String> getLifecycleActionSources() {
        return this.lifecycleActionSources;
    }

    /**
     * @return lifecycleHookId
     */
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
    }

    /**
     * @return lifecycleHookName
     */
    public String getLifecycleHookName() {
        return this.lifecycleHookName;
    }

    /**
     * @return lifecycleHookStatus
     */
    public String getLifecycleHookStatus() {
        return this.lifecycleHookStatus;
    }

    /**
     * @return lifecycleTransition
     */
    public String getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    /**
     * @return notificationArn
     */
    public String getNotificationArn() {
        return this.notificationArn;
    }

    /**
     * @return notificationMetadata
     */
    public String getNotificationMetadata() {
        return this.notificationMetadata;
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
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyLifecycleHookRequest, Builder> {
        private String defaultResult; 
        private Integer heartbeatTimeout; 
        private java.util.List<String> lifecycleActionSources; 
        private String lifecycleHookId; 
        private String lifecycleHookName; 
        private String lifecycleHookStatus; 
        private String lifecycleTransition; 
        private String notificationArn; 
        private String notificationMetadata; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLifecycleHookRequest request) {
            super(request);
            this.defaultResult = request.defaultResult;
            this.heartbeatTimeout = request.heartbeatTimeout;
            this.lifecycleActionSources = request.lifecycleActionSources;
            this.lifecycleHookId = request.lifecycleHookId;
            this.lifecycleHookName = request.lifecycleHookName;
            this.lifecycleHookStatus = request.lifecycleHookStatus;
            this.lifecycleTransition = request.lifecycleTransition;
            this.notificationArn = request.notificationArn;
            this.notificationMetadata = request.notificationMetadata;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * <p>The subsequent action to perform after the wait state ends. Valid values: </p>
         * <ul>
         * <li>CONTINUE: Continues the response to the scale-out or scale-down activity.</li>
         * <li>ABANDON: Releases the ECS instances created during the scale-out activity or removes the ECS instances from the scaling group during the scale-down activity.</li>
         * <li>ROLLBACK: Rejects the release of ECS instances and rolls back the scale-down activity. For a scale-out activity, releases the created ECS instances, which has the same effect as ABANDON.</li>
         * </ul>
         * <p>If a scale-down activity is triggered and multiple lifecycle hooks are invoked, and the DefaultResult of one lifecycle hook is set to ABANDON or ROLLBACK, the wait states of other lifecycle hooks are ended in advance when the wait state of this hook ends. In other cases, the subsequent action is determined by the last lifecycle hook that ends its wait state.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        public Builder defaultResult(String defaultResult) {
            this.putQueryParameter("DefaultResult", defaultResult);
            this.defaultResult = defaultResult;
            return this;
        }

        /**
         * <p>The wait time set by the lifecycle hook for the scaling activity. The subsequent action is performed after the wait state times out. Valid values: 30 to 21600. Unit: seconds.</p>
         * <p>You can call the RecordLifecycleActionHeartbeat operation to extend the wait time of the ECS instance, or call the CompleteLifecycleAction operation to end the wait state of the scaling activity in advance.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder heartbeatTimeout(Integer heartbeatTimeout) {
            this.putQueryParameter("HeartbeatTimeout", heartbeatTimeout);
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        /**
         * <p>The specific scenarios that trigger the lifecycle hook.</p>
         */
        public Builder lifecycleActionSources(java.util.List<String> lifecycleActionSources) {
            this.putQueryParameter("LifecycleActionSources", lifecycleActionSources);
            this.lifecycleActionSources = lifecycleActionSources;
            return this;
        }

        /**
         * <p>The ID of the lifecycle hook to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>ash-bp1fxuqyi98w0aib****</p>
         */
        public Builder lifecycleHookId(String lifecycleHookId) {
            this.putQueryParameter("LifecycleHookId", lifecycleHookId);
            this.lifecycleHookId = lifecycleHookId;
            return this;
        }

        /**
         * <p>The name of the lifecycle hook to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>test_SCAL****</p>
         */
        public Builder lifecycleHookName(String lifecycleHookName) {
            this.putQueryParameter("LifecycleHookName", lifecycleHookName);
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }

        /**
         * <p>The status of the lifecycle hook. Valid values:</p>
         * <ul>
         * <li>Active: Enables the lifecycle hook.</li>
         * <li>InActive: Disables the lifecycle hook.</li>
         * </ul>
         * <p>If you do not specify this parameter, the status of the lifecycle hook remains unchanged.</p>
         * <blockquote>
         * <p>After a lifecycle hook is created, it is enabled by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder lifecycleHookStatus(String lifecycleHookStatus) {
            this.putQueryParameter("LifecycleHookStatus", lifecycleHookStatus);
            this.lifecycleHookStatus = lifecycleHookStatus;
            return this;
        }

        /**
         * <p>The type of scaling activity to which the lifecycle hook applies. Valid values:</p>
         * <ul>
         * <li>SCALE_OUT: Scale-out activity of the scaling group.</li>
         * <li>SCALE_IN: Scale-in activity of the scaling group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCALE_IN</p>
         */
        public Builder lifecycleTransition(String lifecycleTransition) {
            this.putQueryParameter("LifecycleTransition", lifecycleTransition);
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }

        /**
         * <p>The identifier of the notification recipient for the lifecycle hook. The following notification methods are supported:</p>
         * <ul>
         * <li>Message Service (MNS) queue. Format: acs:mns:{region-id}:{account-id}:queue/{queuename}.</li>
         * <li>MNS topic. Format: acs:mns:{region-id}:{account-id}:topic/{topicname}.</li>
         * <li>Operation Orchestration Service (OOS) template. Format: acs:oos:{region-id}:{account-id}:template/{templatename}.</li>
         * <li>EventBridge. Format: acs:eventbridge:{region-id}:{account-id}:eventbus/default.</li>
         * </ul>
         * <p>Variables in the formats:</p>
         * <ul>
         * <li>region-id: The ID of the region where the scaling group resides.</li>
         * <li>account-id: The Alibaba Cloud account ID.</li>
         * <li>queuename: The name of the MNS queue.</li>
         * <li>topicname: The name of the MNS topic.</li>
         * <li>templatename: The name of the OOS template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-beijing:161456884340****:queue/modifyLifecycleHo****</p>
         */
        public Builder notificationArn(String notificationArn) {
            this.putQueryParameter("NotificationArn", notificationArn);
            this.notificationArn = notificationArn;
            return this;
        }

        /**
         * <p>The fixed string information for the wait state of the scaling activity. The value can be up to 4,096 characters in length.</p>
         * <p>When Auto Scaling pushes a message to the notification recipient, it also sends the predefined NotificationMetadata value to help you manage and tag different types of notifications. This parameter takes effect only when the NotificationArn parameter is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder notificationMetadata(String notificationMetadata) {
            this.putQueryParameter("NotificationMetadata", notificationMetadata);
            this.notificationMetadata = notificationMetadata;
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
         * <p>cn-beijing</p>
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
         * <p>The ID of the scaling group to which the lifecycle hook belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public ModifyLifecycleHookRequest build() {
            return new ModifyLifecycleHookRequest(this);
        } 

    } 

}
