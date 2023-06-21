// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordExpirationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetPasswordExpirationConfigurationRequest</p>
 */
public class SetPasswordExpirationConfigurationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("PasswordExpirationAction")
    @Validation(maxLength = 32)
    private String passwordExpirationAction;

    @Query
    @NameInMap("PasswordExpirationNotificationChannels")
    @Validation(maxLength = 32)
    private java.util.List < String > passwordExpirationNotificationChannels;

    @Query
    @NameInMap("PasswordExpirationNotificationDuration")
    @Validation(maxLength = 32)
    private Integer passwordExpirationNotificationDuration;

    @Query
    @NameInMap("PasswordExpirationNotificationStatus")
    @Validation(maxLength = 32)
    private String passwordExpirationNotificationStatus;

    @Query
    @NameInMap("PasswordExpirationStatus")
    @Validation(required = true, maxLength = 32)
    private String passwordExpirationStatus;

    @Query
    @NameInMap("PasswordForcedUpdateDuration")
    @Validation(maxLength = 32)
    private Integer passwordForcedUpdateDuration;

    @Query
    @NameInMap("PasswordValidMaxDay")
    @Validation(maxLength = 32)
    private Integer passwordValidMaxDay;

    private SetPasswordExpirationConfigurationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.passwordExpirationAction = builder.passwordExpirationAction;
        this.passwordExpirationNotificationChannels = builder.passwordExpirationNotificationChannels;
        this.passwordExpirationNotificationDuration = builder.passwordExpirationNotificationDuration;
        this.passwordExpirationNotificationStatus = builder.passwordExpirationNotificationStatus;
        this.passwordExpirationStatus = builder.passwordExpirationStatus;
        this.passwordForcedUpdateDuration = builder.passwordForcedUpdateDuration;
        this.passwordValidMaxDay = builder.passwordValidMaxDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPasswordExpirationConfigurationRequest create() {
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
     * @return passwordExpirationAction
     */
    public String getPasswordExpirationAction() {
        return this.passwordExpirationAction;
    }

    /**
     * @return passwordExpirationNotificationChannels
     */
    public java.util.List < String > getPasswordExpirationNotificationChannels() {
        return this.passwordExpirationNotificationChannels;
    }

    /**
     * @return passwordExpirationNotificationDuration
     */
    public Integer getPasswordExpirationNotificationDuration() {
        return this.passwordExpirationNotificationDuration;
    }

    /**
     * @return passwordExpirationNotificationStatus
     */
    public String getPasswordExpirationNotificationStatus() {
        return this.passwordExpirationNotificationStatus;
    }

    /**
     * @return passwordExpirationStatus
     */
    public String getPasswordExpirationStatus() {
        return this.passwordExpirationStatus;
    }

    /**
     * @return passwordForcedUpdateDuration
     */
    public Integer getPasswordForcedUpdateDuration() {
        return this.passwordForcedUpdateDuration;
    }

    /**
     * @return passwordValidMaxDay
     */
    public Integer getPasswordValidMaxDay() {
        return this.passwordValidMaxDay;
    }

    public static final class Builder extends Request.Builder<SetPasswordExpirationConfigurationRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String passwordExpirationAction; 
        private java.util.List < String > passwordExpirationNotificationChannels; 
        private Integer passwordExpirationNotificationDuration; 
        private String passwordExpirationNotificationStatus; 
        private String passwordExpirationStatus; 
        private Integer passwordForcedUpdateDuration; 
        private Integer passwordValidMaxDay; 

        private Builder() {
            super();
        } 

        private Builder(SetPasswordExpirationConfigurationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.passwordExpirationAction = request.passwordExpirationAction;
            this.passwordExpirationNotificationChannels = request.passwordExpirationNotificationChannels;
            this.passwordExpirationNotificationDuration = request.passwordExpirationNotificationDuration;
            this.passwordExpirationNotificationStatus = request.passwordExpirationNotificationStatus;
            this.passwordExpirationStatus = request.passwordExpirationStatus;
            this.passwordForcedUpdateDuration = request.passwordForcedUpdateDuration;
            this.passwordValidMaxDay = request.passwordValidMaxDay;
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
         * The action to take upon password expiration. This parameter must be specified when PasswordExpirationStatus is set to enabled. Valid values:
         * <p>
         * 
         * *   forbid_login: Users cannot log on to IDaaS.
         * *   force_update_password: Users must change the password.
         * *   remind_update_password: IDaaS reminds users to change the password upon each logon.
         */
        public Builder passwordExpirationAction(String passwordExpirationAction) {
            this.putQueryParameter("PasswordExpirationAction", passwordExpirationAction);
            this.passwordExpirationAction = passwordExpirationAction;
            return this;
        }

        /**
         * The methods for receiving password expiration notifications. This parameter must be specified when PasswordExpirationNotificationStatus is set to enabled.
         */
        public Builder passwordExpirationNotificationChannels(java.util.List < String > passwordExpirationNotificationChannels) {
            this.putQueryParameter("PasswordExpirationNotificationChannels", passwordExpirationNotificationChannels);
            this.passwordExpirationNotificationChannels = passwordExpirationNotificationChannels;
            return this;
        }

        /**
         * The number of days before the expiration date during which password expiration notifications are sent. Unit: day. This parameter must be specified when PasswordExpirationNotificationStatus is set to enabled.
         */
        public Builder passwordExpirationNotificationDuration(Integer passwordExpirationNotificationDuration) {
            this.putQueryParameter("PasswordExpirationNotificationDuration", passwordExpirationNotificationDuration);
            this.passwordExpirationNotificationDuration = passwordExpirationNotificationDuration;
            return this;
        }

        /**
         * Specifies whether to enable the password expiration notification feature. Valid values:
         * <p>
         * 
         * *   enabled
         * *   disabled
         */
        public Builder passwordExpirationNotificationStatus(String passwordExpirationNotificationStatus) {
            this.putQueryParameter("PasswordExpirationNotificationStatus", passwordExpirationNotificationStatus);
            this.passwordExpirationNotificationStatus = passwordExpirationNotificationStatus;
            return this;
        }

        /**
         * Specifies whether to enable the password expiration feature. Valid values:
         * <p>
         * 
         * *   enabled
         * *   disabled
         */
        public Builder passwordExpirationStatus(String passwordExpirationStatus) {
            this.putQueryParameter("PasswordExpirationStatus", passwordExpirationStatus);
            this.passwordExpirationStatus = passwordExpirationStatus;
            return this;
        }

        /**
         * The number of days before which users must change the password to prevent password expiration. Unit: day. You must set this parameter to a value greater than the value of PasswordExpirationNotificationDuration.
         */
        public Builder passwordForcedUpdateDuration(Integer passwordForcedUpdateDuration) {
            this.putQueryParameter("PasswordForcedUpdateDuration", passwordForcedUpdateDuration);
            this.passwordForcedUpdateDuration = passwordForcedUpdateDuration;
            return this;
        }

        /**
         * The validity period of a password. Unit: day. This parameter must be specified when PasswordExpirationStatus is set to enabled.
         */
        public Builder passwordValidMaxDay(Integer passwordValidMaxDay) {
            this.putQueryParameter("PasswordValidMaxDay", passwordValidMaxDay);
            this.passwordValidMaxDay = passwordValidMaxDay;
            return this;
        }

        @Override
        public SetPasswordExpirationConfigurationRequest build() {
            return new SetPasswordExpirationConfigurationRequest(this);
        } 

    } 

}
