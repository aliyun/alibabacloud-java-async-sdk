// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetPasswordPolicyRequest</p>
 */
public class SetPasswordPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HardExpiry")
    private Boolean hardExpiry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxLoginAttemps")
    private Integer maxLoginAttemps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPasswordAge")
    private Integer maxPasswordAge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumPasswordLength")
    private Integer minimumPasswordLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordReusePrevention")
    private Integer passwordReusePrevention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireLowercaseCharacters")
    private Boolean requireLowercaseCharacters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireNumbers")
    private Boolean requireNumbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireSymbols")
    private Boolean requireSymbols;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireUppercaseCharacters")
    private Boolean requireUppercaseCharacters;

    private SetPasswordPolicyRequest(Builder builder) {
        super(builder);
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

    public static SetPasswordPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<SetPasswordPolicyRequest, Builder> {
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
            super();
        } 

        private Builder(SetPasswordPolicyRequest request) {
            super(request);
            this.hardExpiry = request.hardExpiry;
            this.maxLoginAttemps = request.maxLoginAttemps;
            this.maxPasswordAge = request.maxPasswordAge;
            this.minimumPasswordLength = request.minimumPasswordLength;
            this.passwordReusePrevention = request.passwordReusePrevention;
            this.requireLowercaseCharacters = request.requireLowercaseCharacters;
            this.requireNumbers = request.requireNumbers;
            this.requireSymbols = request.requireSymbols;
            this.requireUppercaseCharacters = request.requireUppercaseCharacters;
        } 

        /**
         * Specifies whether a password will expire.
         * <p>
         * 
         * Valid values: `true` and `false`. Default value: `false`. If you leave this parameter unspecified, the default value false is used.
         * 
         * *   If you set this parameter to `true`, the Alibaba Cloud account to which the RAM users belong must reset the passwords before the RAM users can log on to the Alibaba Cloud Management Console.
         * *   If you set this parameter to `false`, the RAM users can change the passwords after the passwords expire and then log on to the Alibaba Cloud Management Console.
         */
        public Builder hardExpiry(Boolean hardExpiry) {
            this.putQueryParameter("HardExpiry", hardExpiry);
            this.hardExpiry = hardExpiry;
            return this;
        }

        /**
         * The maximum number of permitted logon attempts within one hour. The number of logon attempts is reset to zero if a RAM user changes the password.
         */
        public Builder maxLoginAttemps(Integer maxLoginAttemps) {
            this.putQueryParameter("MaxLoginAttemps", maxLoginAttemps);
            this.maxLoginAttemps = maxLoginAttemps;
            return this;
        }

        /**
         * The number of days for which a password is valid. Default value: 0. The default value indicates that the password never expires.
         */
        public Builder maxPasswordAge(Integer maxPasswordAge) {
            this.putQueryParameter("MaxPasswordAge", maxPasswordAge);
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }

        /**
         * The minimum required number of characters in a password.
         * <p>
         * 
         * Valid values: 8 to 32. Default value: 8.
         */
        public Builder minimumPasswordLength(Integer minimumPasswordLength) {
            this.putQueryParameter("MinimumPasswordLength", minimumPasswordLength);
            this.minimumPasswordLength = minimumPasswordLength;
            return this;
        }

        /**
         * The number of previous passwords that a RAM user is prevented from reusing. Default value: 0. The default value indicates that the RAM user can reuse previous passwords.
         */
        public Builder passwordReusePrevention(Integer passwordReusePrevention) {
            this.putQueryParameter("PasswordReusePrevention", passwordReusePrevention);
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }

        /**
         * Specifies whether a password must contain one or more lowercase letters.
         */
        public Builder requireLowercaseCharacters(Boolean requireLowercaseCharacters) {
            this.putQueryParameter("RequireLowercaseCharacters", requireLowercaseCharacters);
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            return this;
        }

        /**
         * Specifies whether a password must contain one or more digits.
         */
        public Builder requireNumbers(Boolean requireNumbers) {
            this.putQueryParameter("RequireNumbers", requireNumbers);
            this.requireNumbers = requireNumbers;
            return this;
        }

        /**
         * Specifies whether a password must contain one or more special characters.
         */
        public Builder requireSymbols(Boolean requireSymbols) {
            this.putQueryParameter("RequireSymbols", requireSymbols);
            this.requireSymbols = requireSymbols;
            return this;
        }

        /**
         * Specifies whether a password must contain one or more uppercase letters.
         */
        public Builder requireUppercaseCharacters(Boolean requireUppercaseCharacters) {
            this.putQueryParameter("RequireUppercaseCharacters", requireUppercaseCharacters);
            this.requireUppercaseCharacters = requireUppercaseCharacters;
            return this;
        }

        @Override
        public SetPasswordPolicyRequest build() {
            return new SetPasswordPolicyRequest(this);
        } 

    } 

}
