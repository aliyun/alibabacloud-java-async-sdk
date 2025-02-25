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
 * {@link DeleteNotificationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DeleteNotificationConfigurationRequest</p>
 */
public class DeleteNotificationConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notificationArn;

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

    private DeleteNotificationConfigurationRequest(Builder builder) {
        super(builder);
        this.notificationArn = builder.notificationArn;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNotificationConfigurationRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteNotificationConfigurationRequest, Builder> {
        private String notificationArn; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNotificationConfigurationRequest request) {
            super(request);
            this.notificationArn = request.notificationArn;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the notification recipient. Specify the value in one of the following formats:</p>
         * <ul>
         * <li>If you specify CloudMonitor as the notification recipient, specify the value in the acs:ess:{region-id}:{account-id}:cloudmonitor format.</li>
         * <li>If you specify a Simple Message Queue (SMQ, formerly MNS) queue as the notification recipient, specify the value in the acs:mns:{region-id}:{account-id}:queue/{queuename} format.</li>
         * <li>If you specify an SMQ queue as the notification recipient, specify the value in the acs:mns:{region-id}:{account-id}:topic/{topicname} format.</li>
         * </ul>
         * <p>The variables in the preceding value formats have the following meanings:</p>
         * <ul>
         * <li>region-id: the region ID of the scaling group.</li>
         * <li>account-id: the ID of your Alibaba Cloud cloud.</li>
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
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public DeleteNotificationConfigurationRequest build() {
            return new DeleteNotificationConfigurationRequest(this);
        } 

    } 

}
