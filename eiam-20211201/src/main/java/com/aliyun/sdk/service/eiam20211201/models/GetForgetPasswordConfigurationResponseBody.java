// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetForgetPasswordConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetForgetPasswordConfigurationResponseBody</p>
 */
public class GetForgetPasswordConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OpenForgetPasswordConfiguration")
    private OpenForgetPasswordConfiguration openForgetPasswordConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetForgetPasswordConfigurationResponseBody model) {
            this.openForgetPasswordConfiguration = model.openForgetPasswordConfiguration;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The forgot password configurations.</p>
         */
        public Builder openForgetPasswordConfiguration(OpenForgetPasswordConfiguration openForgetPasswordConfiguration) {
            this.openForgetPasswordConfiguration = openForgetPasswordConfiguration;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetForgetPasswordConfigurationResponseBody build() {
            return new GetForgetPasswordConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetForgetPasswordConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetForgetPasswordConfigurationResponseBody</p>
     */
    public static class OpenForgetPasswordConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthenticationChannels")
        private java.util.List<String> authenticationChannels;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EnableEmail")
        private Boolean enableEmail;

        @com.aliyun.core.annotation.NameInMap("EnableSms")
        private Boolean enableSms;

        @com.aliyun.core.annotation.NameInMap("ForgetPasswordStatus")
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
        public java.util.List<String> getAuthenticationChannels() {
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
            private java.util.List<String> authenticationChannels; 
            private Boolean enable; 
            private Boolean enableEmail; 
            private Boolean enableSms; 
            private String forgetPasswordStatus; 

            private Builder() {
            } 

            private Builder(OpenForgetPasswordConfiguration model) {
                this.authenticationChannels = model.authenticationChannels;
                this.enable = model.enable;
                this.enableEmail = model.enableEmail;
                this.enableSms = model.enableSms;
                this.forgetPasswordStatus = model.forgetPasswordStatus;
            } 

            /**
             * <p>The authentication channels. Valid values:<br>email<br>sms<br>totp<br>web_authn</p>
             */
            public Builder authenticationChannels(java.util.List<String> authenticationChannels) {
                this.authenticationChannels = authenticationChannels;
                return this;
            }

            /**
             * <p>Indicates whether the forgot password feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>Indicates whether email authentication is enabled for the forgot password feature.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableEmail(Boolean enableEmail) {
                this.enableEmail = enableEmail;
                return this;
            }

            /**
             * <p>Indicates whether Short Message Service (SMS) authentication is enabled for the forgot password feature.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableSms(Boolean enableSms) {
                this.enableSms = enableSms;
                return this;
            }

            /**
             * <p>The status of the forgot password feature. Valid values: enabled and disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
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
