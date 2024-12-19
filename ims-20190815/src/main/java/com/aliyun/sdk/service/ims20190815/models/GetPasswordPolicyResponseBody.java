// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
         * <p>The details of the password policy.</p>
         */
        public Builder passwordPolicy(PasswordPolicy passwordPolicy) {
            this.passwordPolicy = passwordPolicy;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BDAA8408-E67C-428B-BFF0-1B2AC05C9610</p>
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
             * <p>Indicates whether to disable logon after the password expires.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hardExpire(Boolean hardExpire) {
                this.hardExpire = hardExpire;
                return this;
            }

            /**
             * <p>The maximum number of password retries.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxLoginAttemps(Integer maxLoginAttemps) {
                this.maxLoginAttemps = maxLoginAttemps;
                return this;
            }

            /**
             * <p>The validity period of the password.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxPasswordAge(Integer maxPasswordAge) {
                this.maxPasswordAge = maxPasswordAge;
                return this;
            }

            /**
             * <p>The minimum number of unique characters in the password.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minimumPasswordDifferentCharacter(Integer minimumPasswordDifferentCharacter) {
                this.minimumPasswordDifferentCharacter = minimumPasswordDifferentCharacter;
                return this;
            }

            /**
             * <p>The minimum required number of characters in a password.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder minimumPasswordLength(Integer minimumPasswordLength) {
                this.minimumPasswordLength = minimumPasswordLength;
                return this;
            }

            /**
             * <p>Indicates whether to exclude the username from the password.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder passwordNotContainUserName(Boolean passwordNotContainUserName) {
                this.passwordNotContainUserName = passwordNotContainUserName;
                return this;
            }

            /**
             * <p>The policy for password history check.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder passwordReusePrevention(Integer passwordReusePrevention) {
                this.passwordReusePrevention = passwordReusePrevention;
                return this;
            }

            /**
             * <p>Indicates whether the password must contain lowercase letters.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder requireLowercaseCharacters(Boolean requireLowercaseCharacters) {
                this.requireLowercaseCharacters = requireLowercaseCharacters;
                return this;
            }

            /**
             * <p>Indicates whether the password must contain digits.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder requireNumbers(Boolean requireNumbers) {
                this.requireNumbers = requireNumbers;
                return this;
            }

            /**
             * <p>Indicates whether the password must contain special characters.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder requireSymbols(Boolean requireSymbols) {
                this.requireSymbols = requireSymbols;
                return this;
            }

            /**
             * <p>Indicates whether the password must contain uppercase letters.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
