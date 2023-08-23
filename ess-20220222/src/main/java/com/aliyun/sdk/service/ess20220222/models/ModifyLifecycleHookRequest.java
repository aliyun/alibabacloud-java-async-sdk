// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLifecycleHookRequest} extends {@link RequestModel}
 *
 * <p>ModifyLifecycleHookRequest</p>
 */
public class ModifyLifecycleHookRequest extends Request {
    @Query
    @NameInMap("DefaultResult")
    private String defaultResult;

    @Query
    @NameInMap("HeartbeatTimeout")
    private Integer heartbeatTimeout;

    @Query
    @NameInMap("LifecycleHookId")
    private String lifecycleHookId;

    @Query
    @NameInMap("LifecycleHookName")
    private String lifecycleHookName;

    @Query
    @NameInMap("LifecycleHookStatus")
    private String lifecycleHookStatus;

    @Query
    @NameInMap("LifecycleTransition")
    private String lifecycleTransition;

    @Query
    @NameInMap("NotificationArn")
    private String notificationArn;

    @Query
    @NameInMap("NotificationMetadata")
    private String notificationMetadata;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
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
         * The action that you want Auto Scaling to perform after the lifecycle hook times out. Valid values:
         * <p>
         * 
         * *   CONTINUE: Auto Scaling continues to respond to scale-in or scale-out requests.
         * *   ABANDON: Auto Scaling releases Elastic Compute Service (ECS) instances that are created during scale-out activities or removes ECS instances from the scaling group during scale-in activities.
         * *   ROLLBACK: For scale-in activities, Auto Scaling rejects the requests to release ECS instances but rolls back ECS instances. For scale-out activities, the ROLLBACK setting has the same effect as the ABANDON setting.
         * 
         * If a scaling group has multiple lifecycle hooks in effect and you set the DefaultResult parameter for one of the lifecycle hooks to ABANDON or ROLLBACK, the following rule applies to scale-in activities: When the lifecycle hook whose DefaultResult parameter is set to ABANDON or ROLLBACK times out, other lifecycle hooks time out ahead of schedule. In other cases, Auto Scaling performs the action only after all lifecycle hooks time out. The action that Auto Scaling performs is specified by the DefaultResult parameter of the last lifecycle hook that times out.
         */
        public Builder defaultResult(String defaultResult) {
            this.putQueryParameter("DefaultResult", defaultResult);
            this.defaultResult = defaultResult;
            return this;
        }

        /**
         * The period of time before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action specified by the DefaultResult parameter. Valid values: 30 to 21600. Unit: seconds.
         * <p>
         * 
         * You can call the RecordLifecycleActionHeartbeat operation to extend the period of time before a lifecycle hook times out. You can also call the CompleteLifecycleAction operation to end a lifecycle hook ahead of schedule.
         */
        public Builder heartbeatTimeout(Integer heartbeatTimeout) {
            this.putQueryParameter("HeartbeatTimeout", heartbeatTimeout);
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        /**
         * The ID of the lifecycle hook that you want to modify.
         */
        public Builder lifecycleHookId(String lifecycleHookId) {
            this.putQueryParameter("LifecycleHookId", lifecycleHookId);
            this.lifecycleHookId = lifecycleHookId;
            return this;
        }

        /**
         * The name of the lifecycle hook that you want to modify.
         */
        public Builder lifecycleHookName(String lifecycleHookName) {
            this.putQueryParameter("LifecycleHookName", lifecycleHookName);
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }

        /**
         * The status that you want to specify for the lifecycle hook. Valid values:
         * <p>
         * 
         * *   Active
         * *   InActive
         * 
         * If you do not specify this parameter, the status of the lifecycle hook remains unchanged after you call this operation.
         * 
         * > By default, a lifecycle hook is in the Active state after you create it.
         */
        public Builder lifecycleHookStatus(String lifecycleHookStatus) {
            this.putQueryParameter("LifecycleHookStatus", lifecycleHookStatus);
            this.lifecycleHookStatus = lifecycleHookStatus;
            return this;
        }

        /**
         * The type of the scaling activity to which the lifecycle hook applies. Valid values:
         * <p>
         * 
         * *   SCALE_OUT: scale-out activity
         * *   SCALE_IN: scale-in activity
         */
        public Builder lifecycleTransition(String lifecycleTransition) {
            this.putQueryParameter("LifecycleTransition", lifecycleTransition);
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the notification method.
         * <p>
         * 
         * *   If the notification method is a Message Service (MNS) queue, specify the value in the acs:mns:{region-id}:{account-id}:queue/{queuename} format.
         * *   If the notification method is an MNS topic, specify the value in the acs:mns:{region-id}:{account-id}:topic/{topicname} format.
         * *   If the notification method is an Operation Orchestration Service (OOS) template, specify the value in the acs:oos:{region-id}:{account-id}:template/{templatename} format.
         * 
         * The variables in the preceding formats have the following meanings:
         * 
         * *   region-id: the region ID of the scaling group.
         * *   account-id: the ID of the Alibaba Cloud account.
         * *   queuename: the name of the MNS queue.
         * *   topicname: the name of the MNS topic.
         * *   templatename: the name of the OOS template.
         */
        public Builder notificationArn(String notificationArn) {
            this.putQueryParameter("NotificationArn", notificationArn);
            this.notificationArn = notificationArn;
            return this;
        }

        /**
         * The fixed string that is included in a notification. Auto Scaling sends the notification when the lifecycle hook takes effect. The value of this parameter cannot exceed 4,096 characters in length.
         * <p>
         * 
         * Auto Scaling sends the value of the NotificationMetadata parameter together with the notification. This helps you categorize your notifications. If you specify the NotificationMetadata parameter, you must also specify the NotificationArn parameter.
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
         * The region ID of the scaling group.
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
         * The ID of the scaling group to which the lifecycle hook belongs.
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
