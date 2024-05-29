// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordInitializationConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetPasswordInitializationConfigurationResponseBody</p>
 */
public class GetPasswordInitializationConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PasswordInitializationConfiguration")
    private PasswordInitializationConfiguration passwordInitializationConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPasswordInitializationConfigurationResponseBody(Builder builder) {
        this.passwordInitializationConfiguration = builder.passwordInitializationConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPasswordInitializationConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return passwordInitializationConfiguration
     */
    public PasswordInitializationConfiguration getPasswordInitializationConfiguration() {
        return this.passwordInitializationConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PasswordInitializationConfiguration passwordInitializationConfiguration; 
        private String requestId; 

        /**
         * The password initialization configurations.
         */
        public Builder passwordInitializationConfiguration(PasswordInitializationConfiguration passwordInitializationConfiguration) {
            this.passwordInitializationConfiguration = passwordInitializationConfiguration;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPasswordInitializationConfigurationResponseBody build() {
            return new GetPasswordInitializationConfigurationResponseBody(this);
        } 

    } 

    public static class PasswordInitializationConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PasswordForcedUpdateStatus")
        private String passwordForcedUpdateStatus;

        @com.aliyun.core.annotation.NameInMap("PasswordInitializationNotificationChannels")
        private java.util.List < String > passwordInitializationNotificationChannels;

        @com.aliyun.core.annotation.NameInMap("PasswordInitializationStatus")
        private String passwordInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("PasswordInitializationType")
        private String passwordInitializationType;

        private PasswordInitializationConfiguration(Builder builder) {
            this.passwordForcedUpdateStatus = builder.passwordForcedUpdateStatus;
            this.passwordInitializationNotificationChannels = builder.passwordInitializationNotificationChannels;
            this.passwordInitializationStatus = builder.passwordInitializationStatus;
            this.passwordInitializationType = builder.passwordInitializationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordInitializationConfiguration create() {
            return builder().build();
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

        public static final class Builder {
            private String passwordForcedUpdateStatus; 
            private java.util.List < String > passwordInitializationNotificationChannels; 
            private String passwordInitializationStatus; 
            private String passwordInitializationType; 

            /**
             * Indicates whether forcible password change upon first logon is enabled. Valid values:
             * <p>
             * 
             * *   enabled
             * *   disabled
             */
            public Builder passwordForcedUpdateStatus(String passwordForcedUpdateStatus) {
                this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
                return this;
            }

            /**
             * The methods for receiving password initialization notifications.
             */
            public Builder passwordInitializationNotificationChannels(java.util.List < String > passwordInitializationNotificationChannels) {
                this.passwordInitializationNotificationChannels = passwordInitializationNotificationChannels;
                return this;
            }

            /**
             * Indicates whether the password initialization feature is enabled. Valid values:
             * <p>
             * 
             * *   enabled
             * *   disabled
             */
            public Builder passwordInitializationStatus(String passwordInitializationStatus) {
                this.passwordInitializationStatus = passwordInitializationStatus;
                return this;
            }

            /**
             * The password initialization method. Set the value to random.
             * <p>
             * 
             * *   random: A randomly generated password is used.
             */
            public Builder passwordInitializationType(String passwordInitializationType) {
                this.passwordInitializationType = passwordInitializationType;
                return this;
            }

            public PasswordInitializationConfiguration build() {
                return new PasswordInitializationConfiguration(this);
            } 

        } 

    }
}
