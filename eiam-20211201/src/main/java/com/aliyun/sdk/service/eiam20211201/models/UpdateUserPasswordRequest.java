// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserPasswordRequest</p>
 */
public class UpdateUserPasswordRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordForcedUpdateStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String passwordForcedUpdateStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNotificationChannels")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private java.util.List < String > userNotificationChannels;

    private UpdateUserPasswordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.passwordForcedUpdateStatus = builder.passwordForcedUpdateStatus;
        this.userId = builder.userId;
        this.userNotificationChannels = builder.userNotificationChannels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return passwordForcedUpdateStatus
     */
    public String getPasswordForcedUpdateStatus() {
        return this.passwordForcedUpdateStatus;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userNotificationChannels
     */
    public java.util.List < String > getUserNotificationChannels() {
        return this.userNotificationChannels;
    }

    public static final class Builder extends Request.Builder<UpdateUserPasswordRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String password; 
        private String passwordForcedUpdateStatus; 
        private String userId; 
        private java.util.List < String > userNotificationChannels; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserPasswordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.password = request.password;
            this.passwordForcedUpdateStatus = request.passwordForcedUpdateStatus;
            this.userId = request.userId;
            this.userNotificationChannels = request.userNotificationChannels;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The new password of the account. For more information about the password format, see the "Password Policies" topic.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Specifies whether to enable forcible password change upon first logon. Default value: disabled. Valid values:
         * <p>
         * 
         * *   enabled
         * *   disabled
         */
        public Builder passwordForcedUpdateStatus(String passwordForcedUpdateStatus) {
            this.putQueryParameter("PasswordForcedUpdateStatus", passwordForcedUpdateStatus);
            this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
            return this;
        }

        /**
         * The account ID.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * The methods for receiving password notifications.
         */
        public Builder userNotificationChannels(java.util.List < String > userNotificationChannels) {
            this.putQueryParameter("UserNotificationChannels", userNotificationChannels);
            this.userNotificationChannels = userNotificationChannels;
            return this;
        }

        @Override
        public UpdateUserPasswordRequest build() {
            return new UpdateUserPasswordRequest(this);
        } 

    } 

}
