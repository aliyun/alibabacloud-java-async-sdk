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
 * {@link CreateNotificationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateNotificationConfigurationRequest</p>
 */
public class CreateNotificationConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageEncoding")
    private String messageEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notificationArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> notificationTypes;

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
        this.messageEncoding = builder.messageEncoding;
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
     * @return messageEncoding
     */
    public String getMessageEncoding() {
        return this.messageEncoding;
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
    public java.util.List<String> getNotificationTypes() {
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
        private String messageEncoding; 
        private String notificationArn; 
        private java.util.List<String> notificationTypes; 
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
            this.messageEncoding = request.messageEncoding;
            this.notificationArn = request.notificationArn;
            this.notificationTypes = request.notificationTypes;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.timeZone = request.timeZone;
        } 

        /**
         * <p>The encoding method for the notification content. Valid values:</p>
         * <ul>
         * <li>PlainText: no encoding. The content is transmitted in plaintext.</li>
         * <li>Base64: Base64 encoding.</li>
         * </ul>
         * <p>Default value: Base64.</p>
         * <blockquote>
         * <p>The Settings for this parameter are supported only for MNS notification recipients.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PlainText</p>
         */
        public Builder messageEncoding(String messageEncoding) {
            this.putQueryParameter("MessageEncoding", messageEncoding);
            this.messageEncoding = messageEncoding;
            return this;
        }

        /**
         * <p>The identifier of the notification recipient. The following notification methods are supported when you configure the Settings for this parameter:</p>
         * <ul>
         * <li>Cloud monitoring. Format: <code>acs:ess:{region-id}:{account-id}:cloudmonitor</code>.</li>
         * <li>MNS queue. Format: <code>acs:mns:{region-id}:{account-id}:queue/{queuename}</code>.</li>
         * <li>MNS topic. Format: <code>acs:mns:{region-id}:{account-id}:topic/{topicname}</code>.</li>
         * </ul>
         * <p>Variables in the formats:</p>
         * <ul>
         * <li><code>region-id</code>: the ID of the region where the scaling group resides.</li>
         * <li><code>account-id</code>: the Alibaba Cloud account ID. You can invoke the STS GetCallerIdentity operation to obtain the AccountId response parameter, or view it by clicking your profile picture in the upper-right corner of the Alibaba Cloud Management Console.</li>
         * <li><code>queuename</code>: the name of the MNS queue.</li>
         * <li><code>topicname</code>: the name of the MNS topic.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The types of Auto Scaling events and resource changes for which you want to receive notifications. You can specify multiple values by using a repeated list.</p>
         * <p>You can invoke the DescribeNotificationTypes operation to query parameter values.</p>
         * <p>This parameter is required.</p>
         */
        public Builder notificationTypes(java.util.List<String> notificationTypes) {
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
         * <p>The ID of the region to which the scaling group belongs.</p>
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
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1igpak5ft1flyp****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The time zone for notifications.
         * Specify the time zone offset from Coordinated Universal Time (UTC), such as UTC+8 or UTC-7.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC+8</p>
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
