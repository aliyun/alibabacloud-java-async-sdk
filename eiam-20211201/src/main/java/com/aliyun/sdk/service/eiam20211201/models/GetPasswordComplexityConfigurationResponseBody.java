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
 * {@link GetPasswordComplexityConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetPasswordComplexityConfigurationResponseBody</p>
 */
public class GetPasswordComplexityConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PasswordComplexityConfiguration")
    private PasswordComplexityConfiguration passwordComplexityConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The password complexity configurations.</p>
         */
        public Builder passwordComplexityConfiguration(PasswordComplexityConfiguration passwordComplexityConfiguration) {
            this.passwordComplexityConfiguration = passwordComplexityConfiguration;
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

        public GetPasswordComplexityConfigurationResponseBody build() {
            return new GetPasswordComplexityConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPasswordComplexityConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetPasswordComplexityConfigurationResponseBody</p>
     */
    public static class PasswordComplexityRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PasswordCheckType")
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
             * <p>The type of the password check. Valid values:</p>
             * <ul>
             * <li>inclusion_upper_case: The password must contain uppercase letters.</li>
             * <li>inclusion_lower_case: The password must contain lowercase letters.</li>
             * <li>inclusion_special_case: The password must contain one or more of the following special characters: @ % + \ / &quot; ! # $ ^ ? : , ( ) { } [ ] ~ - _ .</li>
             * <li>inclusion_number: The password must contain digits.</li>
             * <li>exclusion_username: The password cannot contain a username.</li>
             * <li>exclusion_email: The password cannot contain an email prefix.</li>
             * <li>exclusion_phone_number: The password cannot contain a mobile number.</li>
             * <li>exclusion_display_name: The password cannot contain a display name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>inclusion_upper_case</p>
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
    /**
     * 
     * {@link GetPasswordComplexityConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetPasswordComplexityConfigurationResponseBody</p>
     */
    public static class PasswordComplexityConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PasswordComplexityRules")
        private java.util.List<PasswordComplexityRules> passwordComplexityRules;

        @com.aliyun.core.annotation.NameInMap("PasswordMinLength")
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
        public java.util.List<PasswordComplexityRules> getPasswordComplexityRules() {
            return this.passwordComplexityRules;
        }

        /**
         * @return passwordMinLength
         */
        public Integer getPasswordMinLength() {
            return this.passwordMinLength;
        }

        public static final class Builder {
            private java.util.List<PasswordComplexityRules> passwordComplexityRules; 
            private Integer passwordMinLength; 

            /**
             * <p>The password complexity rules.</p>
             */
            public Builder passwordComplexityRules(java.util.List<PasswordComplexityRules> passwordComplexityRules) {
                this.passwordComplexityRules = passwordComplexityRules;
                return this;
            }

            /**
             * <p>The minimum number of characters in a password.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
