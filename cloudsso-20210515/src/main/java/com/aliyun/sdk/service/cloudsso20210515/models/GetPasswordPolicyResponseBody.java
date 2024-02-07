// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetPasswordPolicyResponseBody</p>
 */
public class GetPasswordPolicyResponseBody extends TeaModel {
    @NameInMap("PasswordPolicy")
    private PasswordPolicy passwordPolicy;

    @NameInMap("RequestId")
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
         * PasswordPolicy.
         */
        public Builder passwordPolicy(PasswordPolicy passwordPolicy) {
            this.passwordPolicy = passwordPolicy;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("HardExpire")
        private Boolean hardExpire;

        @NameInMap("MaxLoginAttempts")
        private Integer maxLoginAttempts;

        @NameInMap("MaxPasswordAge")
        private Integer maxPasswordAge;

        @NameInMap("MaxPasswordLength")
        private Integer maxPasswordLength;

        @NameInMap("MinPasswordDifferentChars")
        private Integer minPasswordDifferentChars;

        @NameInMap("MinPasswordLength")
        private Integer minPasswordLength;

        @NameInMap("PasswordNotContainUsername")
        private Boolean passwordNotContainUsername;

        @NameInMap("PasswordReusePrevention")
        private Integer passwordReusePrevention;

        @NameInMap("RequireLowerCaseChars")
        private Boolean requireLowerCaseChars;

        @NameInMap("RequireNumbers")
        private Boolean requireNumbers;

        @NameInMap("RequireSymbols")
        private Boolean requireSymbols;

        @NameInMap("RequireUpperCaseChars")
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
             * HardExpire.
             */
            public Builder hardExpire(Boolean hardExpire) {
                this.hardExpire = hardExpire;
                return this;
            }

            /**
             * MaxLoginAttempts.
             */
            public Builder maxLoginAttempts(Integer maxLoginAttempts) {
                this.maxLoginAttempts = maxLoginAttempts;
                return this;
            }

            /**
             * MaxPasswordAge.
             */
            public Builder maxPasswordAge(Integer maxPasswordAge) {
                this.maxPasswordAge = maxPasswordAge;
                return this;
            }

            /**
             * MaxPasswordLength.
             */
            public Builder maxPasswordLength(Integer maxPasswordLength) {
                this.maxPasswordLength = maxPasswordLength;
                return this;
            }

            /**
             * MinPasswordDifferentChars.
             */
            public Builder minPasswordDifferentChars(Integer minPasswordDifferentChars) {
                this.minPasswordDifferentChars = minPasswordDifferentChars;
                return this;
            }

            /**
             * MinPasswordLength.
             */
            public Builder minPasswordLength(Integer minPasswordLength) {
                this.minPasswordLength = minPasswordLength;
                return this;
            }

            /**
             * PasswordNotContainUsername.
             */
            public Builder passwordNotContainUsername(Boolean passwordNotContainUsername) {
                this.passwordNotContainUsername = passwordNotContainUsername;
                return this;
            }

            /**
             * PasswordReusePrevention.
             */
            public Builder passwordReusePrevention(Integer passwordReusePrevention) {
                this.passwordReusePrevention = passwordReusePrevention;
                return this;
            }

            /**
             * RequireLowerCaseChars.
             */
            public Builder requireLowerCaseChars(Boolean requireLowerCaseChars) {
                this.requireLowerCaseChars = requireLowerCaseChars;
                return this;
            }

            /**
             * RequireNumbers.
             */
            public Builder requireNumbers(Boolean requireNumbers) {
                this.requireNumbers = requireNumbers;
                return this;
            }

            /**
             * RequireSymbols.
             */
            public Builder requireSymbols(Boolean requireSymbols) {
                this.requireSymbols = requireSymbols;
                return this;
            }

            /**
             * RequireUpperCaseChars.
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
