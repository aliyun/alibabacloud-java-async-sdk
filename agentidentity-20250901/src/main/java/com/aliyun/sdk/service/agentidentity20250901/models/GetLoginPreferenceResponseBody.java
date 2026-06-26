// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link GetLoginPreferenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoginPreferenceResponseBody</p>
 */
public class GetLoginPreferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoginPreference")
    private LoginPreference loginPreference;

    @com.aliyun.core.annotation.NameInMap("PasswordPolicy")
    private PasswordPolicy passwordPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLoginPreferenceResponseBody(Builder builder) {
        this.loginPreference = builder.loginPreference;
        this.passwordPolicy = builder.passwordPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginPreferenceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loginPreference
     */
    public LoginPreference getLoginPreference() {
        return this.loginPreference;
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
        private LoginPreference loginPreference; 
        private PasswordPolicy passwordPolicy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetLoginPreferenceResponseBody model) {
            this.loginPreference = model.loginPreference;
            this.passwordPolicy = model.passwordPolicy;
            this.requestId = model.requestId;
        } 

        /**
         * LoginPreference.
         */
        public Builder loginPreference(LoginPreference loginPreference) {
            this.loginPreference = loginPreference;
            return this;
        }

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

        public GetLoginPreferenceResponseBody build() {
            return new GetLoginPreferenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLoginPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginPreferenceResponseBody</p>
     */
    public static class LoginPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnablePasswordLogin")
        private Boolean enablePasswordLogin;

        private LoginPreference(Builder builder) {
            this.enablePasswordLogin = builder.enablePasswordLogin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginPreference create() {
            return builder().build();
        }

        /**
         * @return enablePasswordLogin
         */
        public Boolean getEnablePasswordLogin() {
            return this.enablePasswordLogin;
        }

        public static final class Builder {
            private Boolean enablePasswordLogin; 

            private Builder() {
            } 

            private Builder(LoginPreference model) {
                this.enablePasswordLogin = model.enablePasswordLogin;
            } 

            /**
             * EnablePasswordLogin.
             */
            public Builder enablePasswordLogin(Boolean enablePasswordLogin) {
                this.enablePasswordLogin = enablePasswordLogin;
                return this;
            }

            public LoginPreference build() {
                return new LoginPreference(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLoginPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginPreferenceResponseBody</p>
     */
    public static class PasswordPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HardExpire")
        private Boolean hardExpire;

        @com.aliyun.core.annotation.NameInMap("MaxLoginAttempts")
        private Long maxLoginAttempts;

        @com.aliyun.core.annotation.NameInMap("MaxPasswordAge")
        private Long maxPasswordAge;

        @com.aliyun.core.annotation.NameInMap("MaxPasswordLength")
        private Integer maxPasswordLength;

        @com.aliyun.core.annotation.NameInMap("MinPasswordLength")
        private Integer minPasswordLength;

        @com.aliyun.core.annotation.NameInMap("PasswordNotContainUserName")
        private Boolean passwordNotContainUserName;

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
            this.minPasswordLength = builder.minPasswordLength;
            this.passwordNotContainUserName = builder.passwordNotContainUserName;
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
        public Long getMaxLoginAttempts() {
            return this.maxLoginAttempts;
        }

        /**
         * @return maxPasswordAge
         */
        public Long getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        /**
         * @return maxPasswordLength
         */
        public Integer getMaxPasswordLength() {
            return this.maxPasswordLength;
        }

        /**
         * @return minPasswordLength
         */
        public Integer getMinPasswordLength() {
            return this.minPasswordLength;
        }

        /**
         * @return passwordNotContainUserName
         */
        public Boolean getPasswordNotContainUserName() {
            return this.passwordNotContainUserName;
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
            private Long maxLoginAttempts; 
            private Long maxPasswordAge; 
            private Integer maxPasswordLength; 
            private Integer minPasswordLength; 
            private Boolean passwordNotContainUserName; 
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
                this.minPasswordLength = model.minPasswordLength;
                this.passwordNotContainUserName = model.passwordNotContainUserName;
                this.requireLowerCaseChars = model.requireLowerCaseChars;
                this.requireNumbers = model.requireNumbers;
                this.requireSymbols = model.requireSymbols;
                this.requireUpperCaseChars = model.requireUpperCaseChars;
            } 

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
            public Builder maxLoginAttempts(Long maxLoginAttempts) {
                this.maxLoginAttempts = maxLoginAttempts;
                return this;
            }

            /**
             * MaxPasswordAge.
             */
            public Builder maxPasswordAge(Long maxPasswordAge) {
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
             * MinPasswordLength.
             */
            public Builder minPasswordLength(Integer minPasswordLength) {
                this.minPasswordLength = minPasswordLength;
                return this;
            }

            /**
             * PasswordNotContainUserName.
             */
            public Builder passwordNotContainUserName(Boolean passwordNotContainUserName) {
                this.passwordNotContainUserName = passwordNotContainUserName;
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
