// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNotificationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateNotificationConfigurationRequest</p>
 */
public class CreateNotificationConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notificationArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > notificationTypes;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    private CreateNotificationConfigurationRequest(Builder builder) {
        super(builder);
        this.notificationArn = builder.notificationArn;
        this.notificationTypes = builder.notificationTypes;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNotificationConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return notificationArn
     */
    public String getNotificationArn() {
        return this.notificationArn;
    }

    /**
     * @return notificationTypes
     */
    public java.util.List < String > getNotificationTypes() {
        return this.notificationTypes;
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

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder extends Request.Builder<CreateNotificationConfigurationRequest, Builder> {
        private String notificationArn; 
        private java.util.List < String > notificationTypes; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private String timeZone; 

        private Builder() {
            super();
        } 

        private Builder(CreateNotificationConfigurationRequest request) {
            super(request);
            this.notificationArn = request.notificationArn;
            this.notificationTypes = request.notificationTypes;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.timeZone = request.timeZone;
        } 

        /**
         * The Alibaba Cloud Resource Name (ARN) of the notification recipient. The following list describes the value formats of this parameter:
         * <p>
         * 
         * *   If you specify CloudMonitor as the notification recipient, specify the value in the `acs:ess:{region-id}:{account-id}:cloudmonitor` format.
         * *   If you specify an MNS queue as the notification recipient, specify the value in the `acs:mns:{region-id}:{account-id}:queue/{queuename}` format.
         * *   If you specify an MNS topic as the notification recipient, specify the value in the `acs:mns:{region-id}:{account-id}:topic/{topicname}` format.
         * 
         * The variables in the preceding formats have the following meanings:
         * 
         * *   `region-id`: the region ID of the scaling group.
         * *   `account-id`: the ID of the Alibaba Cloud account.
         * *   `queuename`: the name of the MNS queue.
         * *   `topicname`: the name of the MNS topic.
         */
        public Builder notificationArn(String notificationArn) {
            this.putQueryParameter("NotificationArn", notificationArn);
            this.notificationArn = notificationArn;
            return this;
        }

        /**
         * The notification types. Specify multiple IDs in the repeated list form.
         * <p>
         * 
         * You can call the DescribeNotificationTypes operation to query the values of this parameter.
         */
        public Builder notificationTypes(java.util.List < String > notificationTypes) {
            this.putQueryParameter("NotificationTypes", notificationTypes);
            this.notificationTypes = notificationTypes;
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
         * The ID of the scaling group.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * The time zone of the notification. Specify the value in UTC. For example, a value of UTC+8 specifies that the time is 8 hours ahead of Coordinated Universal Time, and a value of UTC-7 specifies that the time is 7 hours behind Coordinated Universal Time.
         */
        public Builder timeZone(String timeZone) {
            this.putQueryParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        @Override
        public CreateNotificationConfigurationRequest build() {
            return new CreateNotificationConfigurationRequest(this);
        } 

    } 

}
