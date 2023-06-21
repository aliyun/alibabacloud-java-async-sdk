// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordExpirationConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetPasswordExpirationConfigurationResponseBody</p>
 */
public class GetPasswordExpirationConfigurationResponseBody extends TeaModel {
    @NameInMap("PasswordExpirationConfiguration")
    private PasswordExpirationConfiguration passwordExpirationConfiguration;

    @NameInMap("RequestId")
    private String requestId;

    private GetPasswordExpirationConfigurationResponseBody(Builder builder) {
        this.passwordExpirationConfiguration = builder.passwordExpirationConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPasswordExpirationConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return passwordExpirationConfiguration
     */
    public PasswordExpirationConfiguration getPasswordExpirationConfiguration() {
        return this.passwordExpirationConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PasswordExpirationConfiguration passwordExpirationConfiguration; 
        private String requestId; 

        /**
         * The password expiration configurations.
         */
        public Builder passwordExpirationConfiguration(PasswordExpirationConfiguration passwordExpirationConfiguration) {
            this.passwordExpirationConfiguration = passwordExpirationConfiguration;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPasswordExpirationConfigurationResponseBody build() {
            return new GetPasswordExpirationConfigurationResponseBody(this);
        } 

    } 

    public static class PasswordExpirationConfiguration extends TeaModel {
        @NameInMap("PasswordExpirationAction")
        private String passwordExpirationAction;

        @NameInMap("PasswordExpirationNotificationChannels")
        private java.util.List < String > passwordExpirationNotificationChannels;

        @NameInMap("PasswordExpirationNotificationDuration")
        private Integer passwordExpirationNotificationDuration;

        @NameInMap("PasswordExpirationNotificationStatus")
        private String passwordExpirationNotificationStatus;

        @NameInMap("PasswordExpirationStatus")
        private String passwordExpirationStatus;

        @NameInMap("PasswordForcedUpdateDuration")
        private Integer passwordForcedUpdateDuration;

        @NameInMap("PasswordValidMaxDay")
        private Integer passwordValidMaxDay;

        private PasswordExpirationConfiguration(Builder builder) {
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

        public static PasswordExpirationConfiguration create() {
            return builder().build();
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

        public static final class Builder {
            private String passwordExpirationAction; 
            private java.util.List < String > passwordExpirationNotificationChannels; 
            private Integer passwordExpirationNotificationDuration; 
            private String passwordExpirationNotificationStatus; 
            private String passwordExpirationStatus; 
            private Integer passwordForcedUpdateDuration; 
            private Integer passwordValidMaxDay; 

            /**
             * The action to take when a password expires. Valid values:
             * <p>
             * 
             * *   forbid_login: Prohibit the user from using the password to log on to IDaaS.
             * *   force_update_password: Force the user to change the password.
             * *   remind_update_password: Remind the user to change the password.
             */
            public Builder passwordExpirationAction(String passwordExpirationAction) {
                this.passwordExpirationAction = passwordExpirationAction;
                return this;
            }

            /**
             * The methods for receiving password expiration notifications.
             */
            public Builder passwordExpirationNotificationChannels(java.util.List < String > passwordExpirationNotificationChannels) {
                this.passwordExpirationNotificationChannels = passwordExpirationNotificationChannels;
                return this;
            }

            /**
             * The number of days before the expiration date during which password expiration notifications are sent. Unit: day.
             */
            public Builder passwordExpirationNotificationDuration(Integer passwordExpirationNotificationDuration) {
                this.passwordExpirationNotificationDuration = passwordExpirationNotificationDuration;
                return this;
            }

            /**
             * Indicates whether the password expiration notification feature is enabled. Valid values:
             * <p>
             * 
             * *   enabled
             * *   disabled
             */
            public Builder passwordExpirationNotificationStatus(String passwordExpirationNotificationStatus) {
                this.passwordExpirationNotificationStatus = passwordExpirationNotificationStatus;
                return this;
            }

            /**
             * Indicates whether the password expiration feature is enabled. Valid values:
             * <p>
             * 
             * *   enabled
             * *   disabled
             */
            public Builder passwordExpirationStatus(String passwordExpirationStatus) {
                this.passwordExpirationStatus = passwordExpirationStatus;
                return this;
            }

            /**
             * The number of days before which users must change the password to prevent password expiration. Unit: day.
             */
            public Builder passwordForcedUpdateDuration(Integer passwordForcedUpdateDuration) {
                this.passwordForcedUpdateDuration = passwordForcedUpdateDuration;
                return this;
            }

            /**
             * The validity period of a password. Unit: day.
             */
            public Builder passwordValidMaxDay(Integer passwordValidMaxDay) {
                this.passwordValidMaxDay = passwordValidMaxDay;
                return this;
            }

            public PasswordExpirationConfiguration build() {
                return new PasswordExpirationConfiguration(this);
            } 

        } 

    }
}
