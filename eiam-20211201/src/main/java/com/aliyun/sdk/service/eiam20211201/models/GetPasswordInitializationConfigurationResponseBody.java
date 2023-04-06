// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordInitializationConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetPasswordInitializationConfigurationResponseBody</p>
 */
public class GetPasswordInitializationConfigurationResponseBody extends TeaModel {
    @NameInMap("PasswordInitializationConfiguration")
    private PasswordInitializationConfiguration passwordInitializationConfiguration;

    @NameInMap("RequestId")
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
         * PasswordInitializationConfiguration.
         */
        public Builder passwordInitializationConfiguration(PasswordInitializationConfiguration passwordInitializationConfiguration) {
            this.passwordInitializationConfiguration = passwordInitializationConfiguration;
            return this;
        }

        /**
         * 请求ID。
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
        @NameInMap("PasswordForcedUpdateStatus")
        private String passwordForcedUpdateStatus;

        @NameInMap("PasswordInitializationNotificationChannels")
        private java.util.List < String > passwordInitializationNotificationChannels;

        @NameInMap("PasswordInitializationStatus")
        private String passwordInitializationStatus;

        @NameInMap("PasswordInitializationType")
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
             * 密码强制更新状态。枚举取值:enabled(开启)、disabled(禁用)
             */
            public Builder passwordForcedUpdateStatus(String passwordForcedUpdateStatus) {
                this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
                return this;
            }

            /**
             * 密码初始化通知渠道。枚举取值:email(邮件)、sms(短信)
             */
            public Builder passwordInitializationNotificationChannels(java.util.List < String > passwordInitializationNotificationChannels) {
                this.passwordInitializationNotificationChannels = passwordInitializationNotificationChannels;
                return this;
            }

            /**
             * 密码初始化配置状态。枚举取值:enabled(开启)、disabled(禁用)
             */
            public Builder passwordInitializationStatus(String passwordInitializationStatus) {
                this.passwordInitializationStatus = passwordInitializationStatus;
                return this;
            }

            /**
             * 密码初始化方式。枚举取值:random(随机)
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
