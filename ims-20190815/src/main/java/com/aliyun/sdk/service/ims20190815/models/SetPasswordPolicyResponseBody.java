// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The details of the password policy.
         */
        public Builder passwordPolicy(PasswordPolicy passwordPolicy) {
            this.passwordPolicy = passwordPolicy;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetPasswordPolicyResponseBody build() {
            return new SetPasswordPolicyResponseBody(this);
        } 

    } 

    public static class PasswordPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HardExpire")
        private Boolean hardExpire;

        @com.aliyun.core.annotation.NameInMap("MaxLoginAttemps")
        private Integer maxLoginAttemps;

        @com.aliyun.core.annotation.NameInMap("MaxPasswordAge")
        private Integer maxPasswordAge;

        @com.aliyun.core.annotation.NameInMap("MinimumPasswordDifferentCharacter")
        private Integer minimumPasswordDifferentCharacter;

        @com.aliyun.core.annotation.NameInMap("MinimumPasswordLength")
        private Integer minimumPasswordLength;

        @com.aliyun.core.annotation.NameInMap("PasswordNotContainUserName")
        private Boolean passwordNotContainUserName;

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
            this.hardExpire = builder.hardExpire;
            this.maxLoginAttemps = builder.maxLoginAttemps;
            this.maxPasswordAge = builder.maxPasswordAge;
            this.minimumPasswordDifferentCharacter = builder.minimumPasswordDifferentCharacter;
            this.minimumPasswordLength = builder.minimumPasswordLength;
            this.passwordNotContainUserName = builder.passwordNotContainUserName;
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
         * @return hardExpire
         */
        public Boolean getHardExpire() {
            return this.hardExpire;
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
         * @return minimumPasswordDifferentCharacter
         */
        public Integer getMinimumPasswordDifferentCharacter() {
            return this.minimumPasswordDifferentCharacter;
        }

        /**
         * @return minimumPasswordLength
         */
        public Integer getMinimumPasswordLength() {
            return this.minimumPasswordLength;
        }

        /**
         * @return passwordNotContainUserName
         */
        public Boolean getPasswordNotContainUserName() {
            return this.passwordNotContainUserName;
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
            private Boolean hardExpire; 
            private Integer maxLoginAttemps; 
            private Integer maxPasswordAge; 
            private Integer minimumPasswordDifferentCharacter; 
            private Integer minimumPasswordLength; 
            private Boolean passwordNotContainUserName; 
            private Integer passwordReusePrevention; 
            private Boolean requireLowercaseCharacters; 
            private Boolean requireNumbers; 
            private Boolean requireSymbols; 
            private Boolean requireUppercaseCharacters; 

            /**
             * Indicates whether to disable logon after the password expires.
             */
            public Builder hardExpire(Boolean hardExpire) {
                this.hardExpire = hardExpire;
                return this;
            }

            /**
             * The maximum number of password retries.
             */
            public Builder maxLoginAttemps(Integer maxLoginAttemps) {
                this.maxLoginAttemps = maxLoginAttemps;
                return this;
            }

            /**
             * The validity period of the password.
             */
            public Builder maxPasswordAge(Integer maxPasswordAge) {
                this.maxPasswordAge = maxPasswordAge;
                return this;
            }

            /**
             * The minimum number of unique characters in the password.
             */
            public Builder minimumPasswordDifferentCharacter(Integer minimumPasswordDifferentCharacter) {
                this.minimumPasswordDifferentCharacter = minimumPasswordDifferentCharacter;
                return this;
            }

            /**
             * The minimum number of characters in the password.
             */
            public Builder minimumPasswordLength(Integer minimumPasswordLength) {
                this.minimumPasswordLength = minimumPasswordLength;
                return this;
            }

            /**
             * Indicates whether to exclude the username from the password.
             */
            public Builder passwordNotContainUserName(Boolean passwordNotContainUserName) {
                this.passwordNotContainUserName = passwordNotContainUserName;
                return this;
            }

            /**
             * The policy for password history check.
             */
            public Builder passwordReusePrevention(Integer passwordReusePrevention) {
                this.passwordReusePrevention = passwordReusePrevention;
                return this;
            }

            /**
             * Indicates whether the password must contain lowercase letters.
             */
            public Builder requireLowercaseCharacters(Boolean requireLowercaseCharacters) {
                this.requireLowercaseCharacters = requireLowercaseCharacters;
                return this;
            }

            /**
             * Indicates whether the password must contain digits.
             */
            public Builder requireNumbers(Boolean requireNumbers) {
                this.requireNumbers = requireNumbers;
                return this;
            }

            /**
             * Indicates whether the password must contain special characters.
             */
            public Builder requireSymbols(Boolean requireSymbols) {
                this.requireSymbols = requireSymbols;
                return this;
            }

            /**
             * Indicates whether the password must contain uppercase letters.
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
