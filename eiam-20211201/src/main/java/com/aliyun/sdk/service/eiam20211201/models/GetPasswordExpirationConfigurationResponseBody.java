// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPasswordExpirationConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetPasswordExpirationConfigurationResponseBody</p>
 */
public class GetPasswordExpirationConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PasswordExpirationConfiguration")
    private PasswordExpirationConfiguration passwordExpirationConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The password expiration configurations.</p>
         */
        public Builder passwordExpirationConfiguration(PasswordExpirationConfiguration passwordExpirationConfiguration) {
            this.passwordExpirationConfiguration = passwordExpirationConfiguration;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPasswordExpirationConfigurationResponseBody build() {
            return new GetPasswordExpirationConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPasswordExpirationConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetPasswordExpirationConfigurationResponseBody</p>
     */
    public static class PasswordExpirationConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveAuthenticationSourceIds")
        private java.util.List < String > effectiveAuthenticationSourceIds;

        @com.aliyun.core.annotation.NameInMap("PasswordExpirationAction")
        private String passwordExpirationAction;

        @com.aliyun.core.annotation.NameInMap("PasswordExpirationNotificationChannels")
        private java.util.List < String > passwordExpirationNotificationChannels;

        @com.aliyun.core.annotation.NameInMap("PasswordExpirationNotificationDuration")
        private Integer passwordExpirationNotificationDuration;

        @com.aliyun.core.annotation.NameInMap("PasswordExpirationNotificationStatus")
        private String passwordExpirationNotificationStatus;

        @com.aliyun.core.annotation.NameInMap("PasswordExpirationStatus")
        private String passwordExpirationStatus;

        @com.aliyun.core.annotation.NameInMap("PasswordForcedUpdateDuration")
        private Integer passwordForcedUpdateDuration;

        @com.aliyun.core.annotation.NameInMap("PasswordValidMaxDay")
        private Integer passwordValidMaxDay;

        private PasswordExpirationConfiguration(Builder builder) {
            this.effectiveAuthenticationSourceIds = builder.effectiveAuthenticationSourceIds;
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
         * @return effectiveAuthenticationSourceIds
         */
        public java.util.List < String > getEffectiveAuthenticationSourceIds() {
            return this.effectiveAuthenticationSourceIds;
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
            private java.util.List < String > effectiveAuthenticationSourceIds; 
            private String passwordExpirationAction; 
            private java.util.List < String > passwordExpirationNotificationChannels; 
            private Integer passwordExpirationNotificationDuration; 
            private String passwordExpirationNotificationStatus; 
            private String passwordExpirationStatus; 
            private Integer passwordForcedUpdateDuration; 
            private Integer passwordValidMaxDay; 

            /**
             * <p>The list of valid authentication IDs. The default is all [&quot;ia_all&quot;]</p>
             * <p>ia_all: All. If you fill in this value, you cannot fill in other values</p>
             * <p>ia_password: Account password login</p>
             * <p>ia_otp_sms: SMS verification code login method</p>
             * <p>ia_webauthn: WebAuthn authenticator login method</p>
             * <p>idp_xxx: Specific identity provider authentication method</p>
             */
            public Builder effectiveAuthenticationSourceIds(java.util.List < String > effectiveAuthenticationSourceIds) {
                this.effectiveAuthenticationSourceIds = effectiveAuthenticationSourceIds;
                return this;
            }

            /**
             * <p>The action to take when a password expires. Valid values:</p>
             * <ul>
             * <li>forbid_login: Prohibit the user from using the password to log on to IDaaS.</li>
             * <li>force_update_password: Force the user to change the password.</li>
             * <li>remind_update_password: Remind the user to change the password.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>forbid_login</p>
             */
            public Builder passwordExpirationAction(String passwordExpirationAction) {
                this.passwordExpirationAction = passwordExpirationAction;
                return this;
            }

            /**
             * <p>The methods for receiving password expiration notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>login</p>
             */
            public Builder passwordExpirationNotificationChannels(java.util.List < String > passwordExpirationNotificationChannels) {
                this.passwordExpirationNotificationChannels = passwordExpirationNotificationChannels;
                return this;
            }

            /**
             * <p>The number of days before the expiration date during which password expiration notifications are sent. Unit: day.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder passwordExpirationNotificationDuration(Integer passwordExpirationNotificationDuration) {
                this.passwordExpirationNotificationDuration = passwordExpirationNotificationDuration;
                return this;
            }

            /**
             * <p>Indicates whether the password expiration notification feature is enabled. Valid values:</p>
             * <ul>
             * <li>enabled</li>
             * <li>disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder passwordExpirationNotificationStatus(String passwordExpirationNotificationStatus) {
                this.passwordExpirationNotificationStatus = passwordExpirationNotificationStatus;
                return this;
            }

            /**
             * <p>Indicates whether the password expiration feature is enabled. Valid values:</p>
             * <ul>
             * <li>enabled</li>
             * <li>disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder passwordExpirationStatus(String passwordExpirationStatus) {
                this.passwordExpirationStatus = passwordExpirationStatus;
                return this;
            }

            /**
             * <p>The number of days before which users must change the password to prevent password expiration. Unit: day.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder passwordForcedUpdateDuration(Integer passwordForcedUpdateDuration) {
                this.passwordForcedUpdateDuration = passwordForcedUpdateDuration;
                return this;
            }

            /**
             * <p>The validity period of a password. Unit: day.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
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
