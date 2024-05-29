// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordInitializationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetPasswordInitializationConfigurationRequest</p>
 */
public class SetPasswordInitializationConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordForcedUpdateStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String passwordForcedUpdateStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordInitializationNotificationChannels")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private java.util.List < String > passwordInitializationNotificationChannels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordInitializationStatus")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String passwordInitializationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordInitializationType")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String passwordInitializationType;

    private SetPasswordInitializationConfigurationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.passwordForcedUpdateStatus = builder.passwordForcedUpdateStatus;
        this.passwordInitializationNotificationChannels = builder.passwordInitializationNotificationChannels;
        this.passwordInitializationStatus = builder.passwordInitializationStatus;
        this.passwordInitializationType = builder.passwordInitializationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPasswordInitializationConfigurationRequest create() {
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
     * @return passwordForcedUpdateStatus
     */
    public String getPasswordForcedUpdateStatus() {
        return this.passwordForcedUpdateStatus;
    }

    /**
     * @return passwordInitializationNotificationChannels
     */
    public java.util.List < String > getPasswordInitializationNotificationChannels() {
        return this.passwordInitializationNotificationChannels;
    }

    /**
     * @return passwordInitializationStatus
     */
    public String getPasswordInitializationStatus() {
        return this.passwordInitializationStatus;
    }

    /**
     * @return passwordInitializationType
     */
    public String getPasswordInitializationType() {
        return this.passwordInitializationType;
    }

    public static final class Builder extends Request.Builder<SetPasswordInitializationConfigurationRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String passwordForcedUpdateStatus; 
        private java.util.List < String > passwordInitializationNotificationChannels; 
        private String passwordInitializationStatus; 
        private String passwordInitializationType; 

        private Builder() {
            super();
        } 

        private Builder(SetPasswordInitializationConfigurationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.passwordForcedUpdateStatus = request.passwordForcedUpdateStatus;
            this.passwordInitializationNotificationChannels = request.passwordInitializationNotificationChannels;
            this.passwordInitializationStatus = request.passwordInitializationStatus;
            this.passwordInitializationType = request.passwordInitializationType;
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to enable forcible password change upon first logon. Valid values:
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
         * The methods for receiving password initialization notifications.
         */
        public Builder passwordInitializationNotificationChannels(java.util.List < String > passwordInitializationNotificationChannels) {
            this.putQueryParameter("PasswordInitializationNotificationChannels", passwordInitializationNotificationChannels);
            this.passwordInitializationNotificationChannels = passwordInitializationNotificationChannels;
            return this;
        }

        /**
         * Specifies whether to enable password initialization. Valid values:
         * <p>
         * 
         * *   enabled
         * *   disabled
         */
        public Builder passwordInitializationStatus(String passwordInitializationStatus) {
            this.putQueryParameter("PasswordInitializationStatus", passwordInitializationStatus);
            this.passwordInitializationStatus = passwordInitializationStatus;
            return this;
        }

        /**
         * The password initialization method. This parameter is required when PasswordInitializationStatus is set to enabled. Set the value to random.
         * <p>
         * 
         * *   random: A randomly generated password is used.
         */
        public Builder passwordInitializationType(String passwordInitializationType) {
            this.putQueryParameter("PasswordInitializationType", passwordInitializationType);
            this.passwordInitializationType = passwordInitializationType;
            return this;
        }

        @Override
        public SetPasswordInitializationConfigurationRequest build() {
            return new SetPasswordInitializationConfigurationRequest(this);
        } 

    } 

}
