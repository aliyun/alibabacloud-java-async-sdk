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
 * {@link ModifyNotificationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyNotificationConfigurationRequest</p>
 */
public class ModifyNotificationConfigurationRequest extends Request {
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

    private ModifyNotificationConfigurationRequest(Builder builder) {
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

    public static ModifyNotificationConfigurationRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyNotificationConfigurationRequest, Builder> {
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

        private Builder(ModifyNotificationConfigurationRequest request) {
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the notification recipient. The following list describes the value formats of this parameter:</p>
         * <ul>
         * <li>If you specify CloudMonitor as the notification recipient, specify the value in the <code>acs:ess:{region-id}:{account-id}:cloudmonitor</code> format.</li>
         * <li>If you specify a Simple Message Queue (SMQ) queue as the notification recipient, specify the value in the <code>acs:mns:{region-id}:{account-id}:queue/{queuename}</code> format.</li>
         * <li>If you specify an SMQ topic as the notification recipient, specify the value in the <code>acs:mns:{region-id}:{account-id}:topic/{topicname}</code> format.</li>
         * </ul>
         * <p>The variables in the preceding value formats have the following meanings:</p>
         * <ul>
         * <li>region-id: the region ID of your scaling group.</li>
         * <li>account-id: the ID of your Alibaba Cloud account.</li>
         * <li>queuename: the name of the SMQ queue.</li>
         * <li>topicname: the name of the SMQ topic.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ess:cn-beijing:161456884340****:cloudmonitor</p>
         */
        public Builder notificationArn(String notificationArn) {
            this.putQueryParameter("NotificationArn", notificationArn);
            this.notificationArn = notificationArn;
            return this;
        }

        /**
         * <p>The event types.</p>
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
         * <p>The time zone of the notification. Specify the value in UTC. For example, a value of UTC+8 specifies that the time is 8 hours ahead of Coordinated Universal Time, and a value of UTC-7 specifies that the time is 7 hours behind Coordinated Universal Time.</p>
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
        public ModifyNotificationConfigurationRequest build() {
            return new ModifyNotificationConfigurationRequest(this);
        } 

    } 

}
