// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordComplexityConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetPasswordComplexityConfigurationResponseBody</p>
 */
public class GetPasswordComplexityConfigurationResponseBody extends TeaModel {
    @NameInMap("PasswordComplexityConfiguration")
    private PasswordComplexityConfiguration passwordComplexityConfiguration;

    @NameInMap("RequestId")
    private String requestId;

    private GetPasswordComplexityConfigurationResponseBody(Builder builder) {
        this.passwordComplexityConfiguration = builder.passwordComplexityConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPasswordComplexityConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return passwordComplexityConfiguration
     */
    public PasswordComplexityConfiguration getPasswordComplexityConfiguration() {
        return this.passwordComplexityConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PasswordComplexityConfiguration passwordComplexityConfiguration; 
        private String requestId; 

        /**
         * The password complexity configurations.
         */
        public Builder passwordComplexityConfiguration(PasswordComplexityConfiguration passwordComplexityConfiguration) {
            this.passwordComplexityConfiguration = passwordComplexityConfiguration;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPasswordComplexityConfigurationResponseBody build() {
            return new GetPasswordComplexityConfigurationResponseBody(this);
        } 

    } 

    public static class PasswordComplexityRules extends TeaModel {
        @NameInMap("PasswordCheckType")
        private String passwordCheckType;

        private PasswordComplexityRules(Builder builder) {
            this.passwordCheckType = builder.passwordCheckType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordComplexityRules create() {
            return builder().build();
        }

        /**
         * @return passwordCheckType
         */
        public String getPasswordCheckType() {
            return this.passwordCheckType;
        }

        public static final class Builder {
            private String passwordCheckType; 

            /**
             * The type of the password check. Valid values:
             * <p>
             * 
             * *   inclusion_upper_case: The password must contain uppercase letters.
             * *   inclusion_lower_case: The password must contain lowercase letters.
             * *   inclusion_special_case: The password must contain one or more of the following special characters: @ % + \ / \" ! # $ ^ ? : , ( ) { } \[ ] ~ - \_ .
             * *   inclusion_number: The password must contain digits.
             * *   exclusion_username: The password cannot contain a username.
             * *   exclusion_email: The password cannot contain an email prefix.
             * *   exclusion_phone_number: The password cannot contain a mobile number.
             * *   exclusion_display_name: The password cannot contain a display name.
             */
            public Builder passwordCheckType(String passwordCheckType) {
                this.passwordCheckType = passwordCheckType;
                return this;
            }

            public PasswordComplexityRules build() {
                return new PasswordComplexityRules(this);
            } 

        } 

    }
    public static class PasswordComplexityConfiguration extends TeaModel {
        @NameInMap("PasswordComplexityRules")
        private java.util.List < PasswordComplexityRules> passwordComplexityRules;

        @NameInMap("PasswordMinLength")
        private Integer passwordMinLength;

        private PasswordComplexityConfiguration(Builder builder) {
            this.passwordComplexityRules = builder.passwordComplexityRules;
            this.passwordMinLength = builder.passwordMinLength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordComplexityConfiguration create() {
            return builder().build();
        }

        /**
         * @return passwordComplexityRules
         */
        public java.util.List < PasswordComplexityRules> getPasswordComplexityRules() {
            return this.passwordComplexityRules;
        }

        /**
         * @return passwordMinLength
         */
        public Integer getPasswordMinLength() {
            return this.passwordMinLength;
        }

        public static final class Builder {
            private java.util.List < PasswordComplexityRules> passwordComplexityRules; 
            private Integer passwordMinLength; 

            /**
             * The password complexity rules.
             */
            public Builder passwordComplexityRules(java.util.List < PasswordComplexityRules> passwordComplexityRules) {
                this.passwordComplexityRules = passwordComplexityRules;
                return this;
            }

            /**
             * The minimum number of characters in a password.
             */
            public Builder passwordMinLength(Integer passwordMinLength) {
                this.passwordMinLength = passwordMinLength;
                return this;
            }

            public PasswordComplexityConfiguration build() {
                return new PasswordComplexityConfiguration(this);
            } 

        } 

    }
}
