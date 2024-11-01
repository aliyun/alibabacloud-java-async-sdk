// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetPasswordExpirationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetPasswordExpirationConfigurationRequest</p>
 */
public class SetPasswordExpirationConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordExpirationAction")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String passwordExpirationAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordExpirationNotificationChannels")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private java.util.List < String > passwordExpirationNotificationChannels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordExpirationNotificationDuration")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private Integer passwordExpirationNotificationDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordExpirationNotificationStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String passwordExpirationNotificationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordExpirationStatus")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String passwordExpirationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordForcedUpdateDuration")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private Integer passwordForcedUpdateDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordValidMaxDay")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The action to take upon password expiration. This parameter must be specified when PasswordExpirationStatus is set to enabled. Valid values:</p>
         * <ul>
         * <li>forbid_login: Users cannot log on to IDaaS.</li>
         * <li>force_update_password: Users must change the password.</li>
         * <li>remind_update_password: IDaaS reminds users to change the password upon each logon.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>force_update_password</p>
         */
        public Builder passwordExpirationAction(String passwordExpirationAction) {
            this.putQueryParameter("PasswordExpirationAction", passwordExpirationAction);
            this.passwordExpirationAction = passwordExpirationAction;
            return this;
        }

        /**
         * <p>The methods for receiving password expiration notifications. This parameter must be specified when PasswordExpirationNotificationStatus is set to enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>login</p>
         */
        public Builder passwordExpirationNotificationChannels(java.util.List < String > passwordExpirationNotificationChannels) {
            this.putQueryParameter("PasswordExpirationNotificationChannels", passwordExpirationNotificationChannels);
            this.passwordExpirationNotificationChannels = passwordExpirationNotificationChannels;
            return this;
        }

        /**
         * <p>The number of days before the expiration date during which password expiration notifications are sent. Unit: day. This parameter must be specified when PasswordExpirationNotificationStatus is set to enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder passwordExpirationNotificationDuration(Integer passwordExpirationNotificationDuration) {
            this.putQueryParameter("PasswordExpirationNotificationDuration", passwordExpirationNotificationDuration);
            this.passwordExpirationNotificationDuration = passwordExpirationNotificationDuration;
            return this;
        }

        /**
         * <p>Specifies whether to enable the password expiration notification feature. Valid values:</p>
         * <ul>
         * <li>enabled</li>
         * <li>disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder passwordExpirationNotificationStatus(String passwordExpirationNotificationStatus) {
            this.putQueryParameter("PasswordExpirationNotificationStatus", passwordExpirationNotificationStatus);
            this.passwordExpirationNotificationStatus = passwordExpirationNotificationStatus;
            return this;
        }

        /**
         * <p>Specifies whether to enable the password expiration feature. Valid values:</p>
         * <ul>
         * <li>enabled</li>
         * <li>disabled</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder passwordExpirationStatus(String passwordExpirationStatus) {
            this.putQueryParameter("PasswordExpirationStatus", passwordExpirationStatus);
            this.passwordExpirationStatus = passwordExpirationStatus;
            return this;
        }

        /**
         * <p>The number of days before which users must change the password to prevent password expiration. Unit: day. You must set this parameter to a value greater than the value of PasswordExpirationNotificationDuration.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder passwordForcedUpdateDuration(Integer passwordForcedUpdateDuration) {
            this.putQueryParameter("PasswordForcedUpdateDuration", passwordForcedUpdateDuration);
            this.passwordForcedUpdateDuration = passwordForcedUpdateDuration;
            return this;
        }

        /**
         * <p>The validity period of a password. Unit: day. This parameter must be specified when PasswordExpirationStatus is set to enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
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
