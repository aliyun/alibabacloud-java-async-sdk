// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetForgetPasswordConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetForgetPasswordConfigurationResponseBody</p>
 */
public class GetForgetPasswordConfigurationResponseBody extends TeaModel {
    @NameInMap("OpenForgetPasswordConfiguration")
    private OpenForgetPasswordConfiguration openForgetPasswordConfiguration;

    @NameInMap("RequestId")
    private String requestId;

    private GetForgetPasswordConfigurationResponseBody(Builder builder) {
        this.openForgetPasswordConfiguration = builder.openForgetPasswordConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetForgetPasswordConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return openForgetPasswordConfiguration
     */
    public OpenForgetPasswordConfiguration getOpenForgetPasswordConfiguration() {
        return this.openForgetPasswordConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OpenForgetPasswordConfiguration openForgetPasswordConfiguration; 
        private String requestId; 

        /**
         * The forgot password configurations.
         */
        public Builder openForgetPasswordConfiguration(OpenForgetPasswordConfiguration openForgetPasswordConfiguration) {
            this.openForgetPasswordConfiguration = openForgetPasswordConfiguration;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetForgetPasswordConfigurationResponseBody build() {
            return new GetForgetPasswordConfigurationResponseBody(this);
        } 

    } 

    public static class OpenForgetPasswordConfiguration extends TeaModel {
        @NameInMap("AuthenticationChannels")
        private java.util.List < String > authenticationChannels;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("EnableEmail")
        private Boolean enableEmail;

        @NameInMap("EnableSms")
        private Boolean enableSms;

        @NameInMap("ForgetPasswordStatus")
        private String forgetPasswordStatus;

        private OpenForgetPasswordConfiguration(Builder builder) {
            this.authenticationChannels = builder.authenticationChannels;
            this.enable = builder.enable;
            this.enableEmail = builder.enableEmail;
            this.enableSms = builder.enableSms;
            this.forgetPasswordStatus = builder.forgetPasswordStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenForgetPasswordConfiguration create() {
            return builder().build();
        }

        /**
         * @return authenticationChannels
         */
        public java.util.List < String > getAuthenticationChannels() {
            return this.authenticationChannels;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return enableEmail
         */
        public Boolean getEnableEmail() {
            return this.enableEmail;
        }

        /**
         * @return enableSms
         */
        public Boolean getEnableSms() {
            return this.enableSms;
        }

        /**
         * @return forgetPasswordStatus
         */
        public String getForgetPasswordStatus() {
            return this.forgetPasswordStatus;
        }

        public static final class Builder {
            private java.util.List < String > authenticationChannels; 
            private Boolean enable; 
            private Boolean enableEmail; 
            private Boolean enableSms; 
            private String forgetPasswordStatus; 

            /**
             * 表示忘记密码认证渠道。枚举取值:email(邮件)、sms(短信)
             */
            public Builder authenticationChannels(java.util.List < String > authenticationChannels) {
                this.authenticationChannels = authenticationChannels;
                return this;
            }

            /**
             * Indicates whether the forgot password feature is enabled.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Indicates whether email authentication is enabled for the forgot password feature.
             */
            public Builder enableEmail(Boolean enableEmail) {
                this.enableEmail = enableEmail;
                return this;
            }

            /**
             * Indicates whether Short Message Service (SMS) authentication is enabled for the forgot password feature.
             */
            public Builder enableSms(Boolean enableSms) {
                this.enableSms = enableSms;
                return this;
            }

            /**
             * 表示忘记密码配置状态。枚举取值:enabled(开启)、disabled(禁用)
             */
            public Builder forgetPasswordStatus(String forgetPasswordStatus) {
                this.forgetPasswordStatus = forgetPasswordStatus;
                return this;
            }

            public OpenForgetPasswordConfiguration build() {
                return new OpenForgetPasswordConfiguration(this);
            } 

        } 

    }
}
