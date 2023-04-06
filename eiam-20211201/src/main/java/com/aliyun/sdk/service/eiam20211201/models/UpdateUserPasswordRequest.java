// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserPasswordRequest</p>
 */
public class UpdateUserPasswordRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("Password")
    @Validation(required = true, maxLength = 64)
    private String password;

    @Query
    @NameInMap("PasswordForcedUpdateStatus")
    @Validation(maxLength = 64)
    private String passwordForcedUpdateStatus;

    @Query
    @NameInMap("UserId")
    @Validation(required = true, maxLength = 64)
    private String userId;

    @Query
    @NameInMap("UserNotificationChannels")
    @Validation(maxLength = 64)
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
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 密码
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * 强制修改密码状态,默认不启用。枚举取值:enabled(开启)、disabled(禁用)
         */
        public Builder passwordForcedUpdateStatus(String passwordForcedUpdateStatus) {
            this.putQueryParameter("PasswordForcedUpdateStatus", passwordForcedUpdateStatus);
            this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
            return this;
        }

        /**
         * 账户ID
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * 密码通知渠道。枚举取值:email(邮件)、sms(短信)
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
