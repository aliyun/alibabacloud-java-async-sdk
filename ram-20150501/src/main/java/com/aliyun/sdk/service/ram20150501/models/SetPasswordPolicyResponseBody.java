// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>SetPasswordPolicyResponseBody</p>
 */
public class SetPasswordPolicyResponseBody extends TeaModel {
    @NameInMap("PasswordPolicy")
    private PasswordPolicy passwordPolicy;

    @NameInMap("RequestId")
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

        public SetPasswordPolicyResponseBody build() {
            return new SetPasswordPolicyResponseBody(this);
        } 

    } 

    public static class PasswordPolicy extends TeaModel {
        @NameInMap("HardExpiry")
        private Boolean hardExpiry;

        @NameInMap("MaxLoginAttemps")
        private Integer maxLoginAttemps;

        @NameInMap("MaxPasswordAge")
        private Integer maxPasswordAge;

        @NameInMap("MinimumPasswordLength")
        private Integer minimumPasswordLength;

        @NameInMap("PasswordReusePrevention")
        private Integer passwordReusePrevention;

        @NameInMap("RequireLowercaseCharacters")
        private Boolean requireLowercaseCharacters;

        @NameInMap("RequireNumbers")
        private Boolean requireNumbers;

        @NameInMap("RequireSymbols")
        private Boolean requireSymbols;

        @NameInMap("RequireUppercaseCharacters")
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

            /**
             * HardExpiry.
             */
            public Builder hardExpiry(Boolean hardExpiry) {
                this.hardExpiry = hardExpiry;
                return this;
            }

            /**
             * MaxLoginAttemps.
             */
            public Builder maxLoginAttemps(Integer maxLoginAttemps) {
                this.maxLoginAttemps = maxLoginAttemps;
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
             * MinimumPasswordLength.
             */
            public Builder minimumPasswordLength(Integer minimumPasswordLength) {
                this.minimumPasswordLength = minimumPasswordLength;
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
             * RequireLowercaseCharacters.
             */
            public Builder requireLowercaseCharacters(Boolean requireLowercaseCharacters) {
                this.requireLowercaseCharacters = requireLowercaseCharacters;
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
             * RequireUppercaseCharacters.
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
