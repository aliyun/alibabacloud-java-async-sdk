// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetPasswordPolicyResponseBody</p>
 */
public class GetPasswordPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PasswordPolicy")
    private PasswordPolicy passwordPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPasswordPolicyResponseBody(Builder builder) {
        this.passwordPolicy = builder.passwordPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPasswordPolicyResponseBody create() {
        return builder().build();
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

        /**
         * The password policy.
         */
        public Builder passwordPolicy(PasswordPolicy passwordPolicy) {
            this.passwordPolicy = passwordPolicy;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPasswordPolicyResponseBody build() {
            return new GetPasswordPolicyResponseBody(this);
        } 

    } 

    public static class PasswordPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HardExpire")
        private Boolean hardExpire;

        @com.aliyun.core.annotation.NameInMap("MaxLoginAttempts")
        private Integer maxLoginAttempts;

        @com.aliyun.core.annotation.NameInMap("MaxPasswordAge")
        private Integer maxPasswordAge;

        @com.aliyun.core.annotation.NameInMap("MaxPasswordLength")
        private Integer maxPasswordLength;

        @com.aliyun.core.annotation.NameInMap("MinPasswordDifferentChars")
        private Integer minPasswordDifferentChars;

        @com.aliyun.core.annotation.NameInMap("MinPasswordLength")
        private Integer minPasswordLength;

        @com.aliyun.core.annotation.NameInMap("PasswordNotContainUsername")
        private Boolean passwordNotContainUsername;

        @com.aliyun.core.annotation.NameInMap("PasswordReusePrevention")
        private Integer passwordReusePrevention;

        @com.aliyun.core.annotation.NameInMap("RequireLowerCaseChars")
        private Boolean requireLowerCaseChars;

        @com.aliyun.core.annotation.NameInMap("RequireNumbers")
        private Boolean requireNumbers;

        @com.aliyun.core.annotation.NameInMap("RequireSymbols")
        private Boolean requireSymbols;

        @com.aliyun.core.annotation.NameInMap("RequireUpperCaseChars")
        private Boolean requireUpperCaseChars;

        private PasswordPolicy(Builder builder) {
            this.hardExpire = builder.hardExpire;
            this.maxLoginAttempts = builder.maxLoginAttempts;
            this.maxPasswordAge = builder.maxPasswordAge;
            this.maxPasswordLength = builder.maxPasswordLength;
            this.minPasswordDifferentChars = builder.minPasswordDifferentChars;
            this.minPasswordLength = builder.minPasswordLength;
            this.passwordNotContainUsername = builder.passwordNotContainUsername;
            this.passwordReusePrevention = builder.passwordReusePrevention;
            this.requireLowerCaseChars = builder.requireLowerCaseChars;
            this.requireNumbers = builder.requireNumbers;
            this.requireSymbols = builder.requireSymbols;
            this.requireUpperCaseChars = builder.requireUpperCaseChars;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordPolicy create() {
            return builder().build();
        }

        /**
         * @return hardExpire
         */
        public Boolean getHardExpire() {
            return this.hardExpire;
        }

        /**
         * @return maxLoginAttempts
         */
        public Integer getMaxLoginAttempts() {
            return this.maxLoginAttempts;
        }

        /**
         * @return maxPasswordAge
         */
        public Integer getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        /**
         * @return maxPasswordLength
         */
        public Integer getMaxPasswordLength() {
            return this.maxPasswordLength;
        }

        /**
         * @return minPasswordDifferentChars
         */
        public Integer getMinPasswordDifferentChars() {
            return this.minPasswordDifferentChars;
        }

        /**
         * @return minPasswordLength
         */
        public Integer getMinPasswordLength() {
            return this.minPasswordLength;
        }

        /**
         * @return passwordNotContainUsername
         */
        public Boolean getPasswordNotContainUsername() {
            return this.passwordNotContainUsername;
        }

        /**
         * @return passwordReusePrevention
         */
        public Integer getPasswordReusePrevention() {
            return this.passwordReusePrevention;
        }

        /**
         * @return requireLowerCaseChars
         */
        public Boolean getRequireLowerCaseChars() {
            return this.requireLowerCaseChars;
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
         * @return requireUpperCaseChars
         */
        public Boolean getRequireUpperCaseChars() {
            return this.requireUpperCaseChars;
        }

        public static final class Builder {
            private Boolean hardExpire; 
            private Integer maxLoginAttempts; 
            private Integer maxPasswordAge; 
            private Integer maxPasswordLength; 
            private Integer minPasswordDifferentChars; 
            private Integer minPasswordLength; 
            private Boolean passwordNotContainUsername; 
            private Integer passwordReusePrevention; 
            private Boolean requireLowerCaseChars; 
            private Boolean requireNumbers; 
            private Boolean requireSymbols; 
            private Boolean requireUpperCaseChars; 

            /**
             * Indicates whether to disable logon after a password expires. Valid values:
             * <p>
             * 
             * *   true: disables logon after a password expires.
             * *   false: does not disable logon after a password expires.
             */
            public Builder hardExpire(Boolean hardExpire) {
                this.hardExpire = hardExpire;
                return this;
            }

            /**
             * The number of password retries.
             * <p>
             * 
             * If wrong passwords are entered for the specified consecutive times, the account is locked for 1 hour.
             * 
             * Valid values: 0 to 32. The value 0 indicates that the number of password retries is not limited.
             */
            public Builder maxLoginAttempts(Integer maxLoginAttempts) {
                this.maxLoginAttempts = maxLoginAttempts;
                return this;
            }

            /**
             * The validity period of a password.
             * <p>
             * 
             * Valid values: 1 to 120. Unit: days.
             */
            public Builder maxPasswordAge(Integer maxPasswordAge) {
                this.maxPasswordAge = maxPasswordAge;
                return this;
            }

            /**
             * The maximum password length.
             */
            public Builder maxPasswordLength(Integer maxPasswordLength) {
                this.maxPasswordLength = maxPasswordLength;
                return this;
            }

            /**
             * The minimum number of different characters in a password.
             * <p>
             * 
             * The minimum value is 0, which indicates that the minimum number of different characters in a password is not limited. The maximum value is the value of the `MinPasswordLength` parameter.
             */
            public Builder minPasswordDifferentChars(Integer minPasswordDifferentChars) {
                this.minPasswordDifferentChars = minPasswordDifferentChars;
                return this;
            }

            /**
             * The minimum password length.
             * <p>
             * 
             * Valid values: 8 to 32 characters.
             */
            public Builder minPasswordLength(Integer minPasswordLength) {
                this.minPasswordLength = minPasswordLength;
                return this;
            }

            /**
             * Indicates whether to exclude the username from the password. Valid values:
             * <p>
             * 
             * *   true: A password cannot contain the username.
             * *   false: A password can contain the username.
             */
            public Builder passwordNotContainUsername(Boolean passwordNotContainUsername) {
                this.passwordNotContainUsername = passwordNotContainUsername;
                return this;
            }

            /**
             * The policy for password history check.
             * <p>
             * 
             * The previous N passwords cannot be reused. Valid values of N: 0 to 24. The value 0 indicates that all historical passwords can be reused.
             * 
             * >  Passwords that are generated before January 5, 2024 are not counted as historical passwords.
             */
            public Builder passwordReusePrevention(Integer passwordReusePrevention) {
                this.passwordReusePrevention = passwordReusePrevention;
                return this;
            }

            /**
             * Indicates whether lowercase letters are required in a password. Valid values:
             * <p>
             * 
             * *   true: Lowercase letters are required in a password.
             * *   false: Lowercase letters are not required in a password.
             */
            public Builder requireLowerCaseChars(Boolean requireLowerCaseChars) {
                this.requireLowerCaseChars = requireLowerCaseChars;
                return this;
            }

            /**
             * Indicates whether digits are required in a password. Valid values:
             * <p>
             * 
             * *   true: Digits are required in a password.
             * *   false: Digits are not required in a password.
             */
            public Builder requireNumbers(Boolean requireNumbers) {
                this.requireNumbers = requireNumbers;
                return this;
            }

            /**
             * Indicates whether special characters are required in a password. Valid values:
             * <p>
             * 
             * *   true: Special characters are required in a password.
             * *   false: Special characters are not required in a password.
             */
            public Builder requireSymbols(Boolean requireSymbols) {
                this.requireSymbols = requireSymbols;
                return this;
            }

            /**
             * Indicates whether uppercase letters are required in a password. Valid values:
             * <p>
             * 
             * *   true: Uppercase letters are required in a password.
             * *   false: Uppercase letters are not required in a password.
             */
            public Builder requireUpperCaseChars(Boolean requireUpperCaseChars) {
                this.requireUpperCaseChars = requireUpperCaseChars;
                return this;
            }

            public PasswordPolicy build() {
                return new PasswordPolicy(this);
            } 

        } 

    }
}
