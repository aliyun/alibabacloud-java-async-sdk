// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link SetPasswordPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>SetPasswordPolicyResponseBody</p>
 */
public class SetPasswordPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PasswordPolicy")
    private PasswordPolicy passwordPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetPasswordPolicyResponseBody(Builder builder) {
        this.passwordPolicy = builder.passwordPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPasswordPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return passwordPolicy
     */
    public PasswordPolicy getPasswordPolicy() {
        return this.passwordPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PasswordPolicy passwordPolicy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetPasswordPolicyResponseBody model) {
            this.passwordPolicy = model.passwordPolicy;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The password policy.</p>
         */
        public Builder passwordPolicy(PasswordPolicy passwordPolicy) {
            this.passwordPolicy = passwordPolicy;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetPasswordPolicyResponseBody build() {
            return new SetPasswordPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetPasswordPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>SetPasswordPolicyResponseBody</p>
     */
    public static class PasswordPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HardExpiry")
        private Boolean hardExpiry;

        @com.aliyun.core.annotation.NameInMap("MaxLoginAttemps")
        private Integer maxLoginAttemps;

        @com.aliyun.core.annotation.NameInMap("MaxPasswordAge")
        private Integer maxPasswordAge;

        @com.aliyun.core.annotation.NameInMap("MinimumPasswordLength")
        private Integer minimumPasswordLength;

        @com.aliyun.core.annotation.NameInMap("PasswordReusePrevention")
        private Integer passwordReusePrevention;

        @com.aliyun.core.annotation.NameInMap("RequireLowercaseCharacters")
        private Boolean requireLowercaseCharacters;

        @com.aliyun.core.annotation.NameInMap("RequireNumbers")
        private Boolean requireNumbers;

        @com.aliyun.core.annotation.NameInMap("RequireSymbols")
        private Boolean requireSymbols;

        @com.aliyun.core.annotation.NameInMap("RequireUppercaseCharacters")
        private Boolean requireUppercaseCharacters;

        private PasswordPolicy(Builder builder) {
            this.hardExpiry = builder.hardExpiry;
            this.maxLoginAttemps = builder.maxLoginAttemps;
            this.maxPasswordAge = builder.maxPasswordAge;
            this.minimumPasswordLength = builder.minimumPasswordLength;
            this.passwordReusePrevention = builder.passwordReusePrevention;
            this.requireLowercaseCharacters = builder.requireLowercaseCharacters;
            this.requireNumbers = builder.requireNumbers;
            this.requireSymbols = builder.requireSymbols;
            this.requireUppercaseCharacters = builder.requireUppercaseCharacters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordPolicy create() {
            return builder().build();
        }

        /**
         * @return hardExpiry
         */
        public Boolean getHardExpiry() {
            return this.hardExpiry;
        }

        /**
         * @return maxLoginAttemps
         */
        public Integer getMaxLoginAttemps() {
            return this.maxLoginAttemps;
        }

        /**
         * @return maxPasswordAge
         */
        public Integer getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        /**
         * @return minimumPasswordLength
         */
        public Integer getMinimumPasswordLength() {
            return this.minimumPasswordLength;
        }

        /**
         * @return passwordReusePrevention
         */
        public Integer getPasswordReusePrevention() {
            return this.passwordReusePrevention;
        }

        /**
         * @return requireLowercaseCharacters
         */
        public Boolean getRequireLowercaseCharacters() {
            return this.requireLowercaseCharacters;
        }

        /**
         * @return requireNumbers
         */
        public Boolean getRequireNumbers() {
            return this.requireNumbers;
        }

        /**
         * @return requireSymbols
         */
        public Boolean getRequireSymbols() {
            return this.requireSymbols;
        }

        /**
         * @return requireUppercaseCharacters
         */
        public Boolean getRequireUppercaseCharacters() {
            return this.requireUppercaseCharacters;
        }

        public static final class Builder {
            private Boolean hardExpiry; 
            private Integer maxLoginAttemps; 
            private Integer maxPasswordAge; 
            private Integer minimumPasswordLength; 
            private Integer passwordReusePrevention; 
            private Boolean requireLowercaseCharacters; 
            private Boolean requireNumbers; 
            private Boolean requireSymbols; 
            private Boolean requireUppercaseCharacters; 

            private Builder() {
            } 

            private Builder(PasswordPolicy model) {
                this.hardExpiry = model.hardExpiry;
                this.maxLoginAttemps = model.maxLoginAttemps;
                this.maxPasswordAge = model.maxPasswordAge;
                this.minimumPasswordLength = model.minimumPasswordLength;
                this.passwordReusePrevention = model.passwordReusePrevention;
                this.requireLowercaseCharacters = model.requireLowercaseCharacters;
                this.requireNumbers = model.requireNumbers;
                this.requireSymbols = model.requireSymbols;
                this.requireUppercaseCharacters = model.requireUppercaseCharacters;
            } 

            /**
             * <p>Indicates whether a password expires. Valid values: <code>true</code> and <code>false</code>. Default value: <code>false</code>. If the parameter is unspecified, the default value false is returned.</p>
             * <ul>
             * <li>If this parameter is set to <code>true</code>, the Alibaba Cloud account to which the RAM users belong must reset the password before the RAM users can log on to the Alibaba Cloud Management Console.</li>
             * <li>If this parameter is set to <code>false</code>, the RAM users can change the passwords after the passwords expire and then log on to the Alibaba Cloud Management Console.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hardExpiry(Boolean hardExpiry) {
                this.hardExpiry = hardExpiry;
                return this;
            }

            /**
             * <p>The maximum number of permitted logon attempts within one hour. The number of logon attempts is reset to zero if a RAM user changes the password.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxLoginAttemps(Integer maxLoginAttemps) {
                this.maxLoginAttemps = maxLoginAttemps;
                return this;
            }

            /**
             * <p>The number of days for which a password is valid. If you reset a password, the password validity period restarts. Default value: 0. The default value indicates that the password never expires.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxPasswordAge(Integer maxPasswordAge) {
                this.maxPasswordAge = maxPasswordAge;
                return this;
            }

            /**
             * <p>The minimum number of characters in a password.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder minimumPasswordLength(Integer minimumPasswordLength) {
                this.minimumPasswordLength = minimumPasswordLength;
                return this;
            }

            /**
             * <p>The number of previous passwords that a RAM user is prevented from reusing. Default value: 0. The default value indicates that the RAM user can reuse previous passwords.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder passwordReusePrevention(Integer passwordReusePrevention) {
                this.passwordReusePrevention = passwordReusePrevention;
                return this;
            }

            /**
             * <p>Indicates whether a password must contain one or more lowercase letters.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder requireLowercaseCharacters(Boolean requireLowercaseCharacters) {
                this.requireLowercaseCharacters = requireLowercaseCharacters;
                return this;
            }

            /**
             * <p>Indicates whether a password must contain one or more digits.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder requireNumbers(Boolean requireNumbers) {
                this.requireNumbers = requireNumbers;
                return this;
            }

            /**
             * <p>Indicates whether a password must contain one or more special characters.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder requireSymbols(Boolean requireSymbols) {
                this.requireSymbols = requireSymbols;
                return this;
            }

            /**
             * <p>Indicates whether a password must contain one or more uppercase letters.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder requireUppercaseCharacters(Boolean requireUppercaseCharacters) {
                this.requireUppercaseCharacters = requireUppercaseCharacters;
                return this;
            }

            public PasswordPolicy build() {
                return new PasswordPolicy(this);
            } 

        } 

    }
}
