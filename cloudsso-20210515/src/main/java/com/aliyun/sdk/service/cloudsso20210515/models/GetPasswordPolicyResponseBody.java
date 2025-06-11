// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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

        private Builder(GetPasswordPolicyResponseBody model) {
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
         * <p>B7C6E839-FB65-59BE-B753-003AA8AF7DF7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPasswordPolicyResponseBody build() {
            return new GetPasswordPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPasswordPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPasswordPolicyResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PasswordPolicy model) {
                this.hardExpire = model.hardExpire;
                this.maxLoginAttempts = model.maxLoginAttempts;
                this.maxPasswordAge = model.maxPasswordAge;
                this.maxPasswordLength = model.maxPasswordLength;
                this.minPasswordDifferentChars = model.minPasswordDifferentChars;
                this.minPasswordLength = model.minPasswordLength;
                this.passwordNotContainUsername = model.passwordNotContainUsername;
                this.passwordReusePrevention = model.passwordReusePrevention;
                this.requireLowerCaseChars = model.requireLowerCaseChars;
                this.requireNumbers = model.requireNumbers;
                this.requireSymbols = model.requireSymbols;
                this.requireUpperCaseChars = model.requireUpperCaseChars;
            } 

            /**
             * <p>Indicates whether to disable logon after a password expires. Valid values:</p>
             * <ul>
             * <li>true: disables logon after a password expires.</li>
             * <li>false: does not disable logon after a password expires.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hardExpire(Boolean hardExpire) {
                this.hardExpire = hardExpire;
                return this;
            }

            /**
             * <p>The number of password retries.</p>
             * <p>If wrong passwords are entered for the specified consecutive times, the account is locked for 1 hour.</p>
             * <p>Valid values: 0 to 32. The value 0 indicates that the number of password retries is not limited.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxLoginAttempts(Integer maxLoginAttempts) {
                this.maxLoginAttempts = maxLoginAttempts;
                return this;
            }

            /**
             * <p>The validity period of a password.</p>
             * <p>Valid values: 1 to 120. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder maxPasswordAge(Integer maxPasswordAge) {
                this.maxPasswordAge = maxPasswordAge;
                return this;
            }

            /**
             * <p>The maximum password length.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder maxPasswordLength(Integer maxPasswordLength) {
                this.maxPasswordLength = maxPasswordLength;
                return this;
            }

            /**
             * <p>The minimum number of different characters in a password.</p>
             * <p>The minimum value is 0, which indicates that the minimum number of different characters in a password is not limited. The maximum value is the value of the <code>MinPasswordLength</code> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder minPasswordDifferentChars(Integer minPasswordDifferentChars) {
                this.minPasswordDifferentChars = minPasswordDifferentChars;
                return this;
            }

            /**
             * <p>The minimum password length.</p>
             * <p>Valid values: 8 to 32 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder minPasswordLength(Integer minPasswordLength) {
                this.minPasswordLength = minPasswordLength;
                return this;
            }

            /**
             * <p>Indicates whether to exclude the username from the password. Valid values:</p>
             * <ul>
             * <li>true: A password cannot contain the username.</li>
             * <li>false: A password can contain the username.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder passwordNotContainUsername(Boolean passwordNotContainUsername) {
                this.passwordNotContainUsername = passwordNotContainUsername;
                return this;
            }

            /**
             * <p>The policy for password history check.</p>
             * <p>The previous N passwords cannot be reused. Valid values of N: 0 to 24. The value 0 indicates that all historical passwords can be reused.</p>
             * <blockquote>
             * <p> Passwords that are generated before January 5, 2024 are not counted as historical passwords.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder passwordReusePrevention(Integer passwordReusePrevention) {
                this.passwordReusePrevention = passwordReusePrevention;
                return this;
            }

            /**
             * <p>Indicates whether lowercase letters are required in a password. Valid values:</p>
             * <ul>
             * <li>true: Lowercase letters are required in a password.</li>
             * <li>false: Lowercase letters are not required in a password.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder requireLowerCaseChars(Boolean requireLowerCaseChars) {
                this.requireLowerCaseChars = requireLowerCaseChars;
                return this;
            }

            /**
             * <p>Indicates whether digits are required in a password. Valid values:</p>
             * <ul>
             * <li>true: Digits are required in a password.</li>
             * <li>false: Digits are not required in a password.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder requireNumbers(Boolean requireNumbers) {
                this.requireNumbers = requireNumbers;
                return this;
            }

            /**
             * <p>Indicates whether special characters are required in a password. Valid values:</p>
             * <ul>
             * <li>true: Special characters are required in a password.</li>
             * <li>false: Special characters are not required in a password.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder requireSymbols(Boolean requireSymbols) {
                this.requireSymbols = requireSymbols;
                return this;
            }

            /**
             * <p>Indicates whether uppercase letters are required in a password. Valid values:</p>
             * <ul>
             * <li>true: Uppercase letters are required in a password.</li>
             * <li>false: Uppercase letters are not required in a password.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
