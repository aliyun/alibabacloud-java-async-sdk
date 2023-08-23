// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNotificationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyNotificationConfigurationRequest</p>
 */
public class ModifyNotificationConfigurationRequest extends Request {
    @Query
    @NameInMap("NotificationArn")
    @Validation(required = true)
    private String notificationArn;

    @Query
    @NameInMap("NotificationTypes")
    @Validation(required = true)
    private java.util.List < String > notificationTypes;

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
    @Validation(required = true)
    private String scalingGroupId;

    private ModifyNotificationConfigurationRequest(Builder builder) {
        super(builder);
        this.notificationArn = builder.notificationArn;
        this.notificationTypes = builder.notificationTypes;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
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

    public static final class Builder extends Request.Builder<ModifyNotificationConfigurationRequest, Builder> {
        private String notificationArn; 
        private java.util.List < String > notificationTypes; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

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
        } 

        /**
         * NotificationArn.
         */
        public Builder notificationArn(String notificationArn) {
            this.putQueryParameter("NotificationArn", notificationArn);
            this.notificationArn = notificationArn;
            return this;
        }

        /**
         * NotificationTypes.
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
         * RegionId.
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
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public ModifyNotificationConfigurationRequest build() {
            return new ModifyNotificationConfigurationRequest(this);
        } 

    } 

}
