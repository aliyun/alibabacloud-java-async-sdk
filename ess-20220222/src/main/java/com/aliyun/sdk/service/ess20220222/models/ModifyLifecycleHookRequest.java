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
         * <p>The action that you want Auto Scaling to perform after the lifecycle hook ends. Valid values:</p>
         * <ul>
         * <li>CONTINUE: Auto Scaling continues to respond to scaling requests.</li>
         * <li>ABANDON: Auto Scaling releases Elastic Compute Service (ECS) instances that are created during scale-out activities, or removes ECS instances from the scaling group during scale-in activities.</li>
         * </ul>
         * <p>If multiple lifecycle hooks in a scaling group are triggered during scale-in activities and you set the DefaultResult parameter to ABANDON for the lifecycle hook that you want to modify, Auto Scaling immediately performs the action after the lifecycle hook that you want to modify ends. As a result, other lifecycle hooks end ahead of schedule. In other cases, Auto Scaling performs the action only after all lifecycle hooks end.</p>
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
         * <p>The period of time before the lifecycle hook ends. Auto Scaling performs the specified action after the lifecycle hook ends. Valid values: 30 to 21600. Unit: seconds.</p>
         * <p>You can call the RecordLifecycleActionHeartbeat operation to prolong the length of a lifecycle hook. You can also call the CompleteLifecycleAction operation to end a lifecycle hook ahead of schedule.</p>
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
         * <p>The ID of the lifecycle hook that you want to modify.</p>
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
         * <p>The name of the lifecycle hook that you want to modify.</p>
         * 
         * <strong>example:</strong>
         * <p>test_SCALE_IN</p>
         */
        public Builder lifecycleHookName(String lifecycleHookName) {
            this.putQueryParameter("LifecycleHookName", lifecycleHookName);
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }

        /**
         * <p>The status into which you want to put the lifecycle hook. Valid values:</p>
         * <ul>
         * <li>Active</li>
         * <li>InActive</li>
         * </ul>
         * <p>If you do not specify this parameter, the status of the lifecycle hook remains unchanged after you call this operation.</p>
         * <blockquote>
         * <p>By default, a lifecycle hook is in the Active state after you create it.</p>
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
         * <li>SCALE_OUT</li>
         * <li>SCALE_IN</li>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the notification recipient. Specify the value in one of the following formats:</p>
         * <ul>
         * <li>If you specify a Simple Message Queue (SMQ, formerly MNS) as the notification recipient, specify the value in the acs:mns:{region-id}:{account-id}:queue/{queuename} format.</li>
         * <li>If you specify an SMQ topic as the notification recipient, specify the value in the acs:mns:{region-id}:{account-id}:topic/{topicname} format.</li>
         * <li>If you specify a CloudOps Orchestration Service (OOS) template as the notification recipient, specify the value in the acs:oos:{region-id}:{account-id}:template/{templatename} format.</li>
         * <li>If you specify an event bus as the notification recipient, specify the value in the acs:eventbridge:{region-id}:{account-id}:eventbus/default format.</li>
         * </ul>
         * <p>The variables in the preceding value formats have the following meanings:</p>
         * <ul>
         * <li>region-id: the region ID of your scaling group.</li>
         * <li>account-id: the ID of your Alibaba Cloud account.</li>
         * <li>queuename: the name of the SMQ queue.</li>
         * <li>topicname: the name of the SMQ topic.</li>
         * <li>templatename: the name of the OOS template.</li>
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
         * <p>The fixed string that is included in a notification. Auto Scaling sends the notification when the lifecycle hook takes effect. The value of this parameter cannot exceed 4,096 characters in length.</p>
         * <p>Auto Scaling sends the value specified for the NotificationMetadata parameter together with the notification. This helps you categorize your notifications. The NotificationMetadata parameter takes effect only after you specify the NotificationArn parameter.</p>
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
