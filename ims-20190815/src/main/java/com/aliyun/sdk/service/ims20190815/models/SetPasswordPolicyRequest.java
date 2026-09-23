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
 * {@link SetPasswordPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetPasswordPolicyRequest</p>
 */
public class SetPasswordPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HardExpire")
    private Boolean hardExpire;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitialPasswordAge")
    private Integer initialPasswordAge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterceptRiskPasswordOnApi")
    private Boolean interceptRiskPasswordOnApi;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxLoginAttemps")
    private Integer maxLoginAttemps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPasswordAge")
    private Integer maxPasswordAge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumPasswordDifferentCharacter")
    private Integer minimumPasswordDifferentCharacter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumPasswordLength")
    private Integer minimumPasswordLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordNotContainUserName")
    private Boolean passwordNotContainUserName;

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
        this.hardExpire = builder.hardExpire;
        this.initialPasswordAge = builder.initialPasswordAge;
        this.interceptRiskPasswordOnApi = builder.interceptRiskPasswordOnApi;
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

    public static SetPasswordPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hardExpire
     */
    public Boolean getHardExpire() {
        return this.hardExpire;
    }

    /**
     * @return initialPasswordAge
     */
    public Integer getInitialPasswordAge() {
        return this.initialPasswordAge;
    }

    /**
     * @return interceptRiskPasswordOnApi
     */
    public Boolean getInterceptRiskPasswordOnApi() {
        return this.interceptRiskPasswordOnApi;
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

    public static final class Builder extends Request.Builder<SetPasswordPolicyRequest, Builder> {
        private Boolean hardExpire; 
        private Integer initialPasswordAge; 
        private Boolean interceptRiskPasswordOnApi; 
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

        private Builder() {
            super();
        } 

        private Builder(SetPasswordPolicyRequest request) {
            super(request);
            this.hardExpire = request.hardExpire;
            this.initialPasswordAge = request.initialPasswordAge;
            this.interceptRiskPasswordOnApi = request.interceptRiskPasswordOnApi;
            this.maxLoginAttemps = request.maxLoginAttemps;
            this.maxPasswordAge = request.maxPasswordAge;
            this.minimumPasswordDifferentCharacter = request.minimumPasswordDifferentCharacter;
            this.minimumPasswordLength = request.minimumPasswordLength;
            this.passwordNotContainUserName = request.passwordNotContainUserName;
            this.passwordReusePrevention = request.passwordReusePrevention;
            this.requireLowercaseCharacters = request.requireLowercaseCharacters;
            this.requireNumbers = request.requireNumbers;
            this.requireSymbols = request.requireSymbols;
            this.requireUppercaseCharacters = request.requireUppercaseCharacters;
        } 

        /**
         * <p>Specifies whether logon is blocked after a password expires.</p>
         * <ul>
         * <li><p>true: After a password expires, the RAM user cannot log on to the console. An Alibaba Cloud account owner or a RAM administrator must reset the password before the RAM user can log on.</p>
         * </li>
         * <li><p>false (default): After a password expires, the RAM user can change the password and then log on.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hardExpire(Boolean hardExpire) {
            this.putQueryParameter("HardExpire", hardExpire);
            this.hardExpire = hardExpire;
            return this;
        }

        /**
         * <p>Validity period for initial passwords. Initial passwords apply to newly created RAM users or users whose console logon settings are re-enabled.</p>
         * <p>Valid values: 0 to 90. Unit: days.</p>
         * <p>Default value: 14.</p>
         * <p>A value of 0 disables this constraint.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder initialPasswordAge(Integer initialPasswordAge) {
            this.putQueryParameter("InitialPasswordAge", initialPasswordAge);
            this.initialPasswordAge = initialPasswordAge;
            return this;
        }

        /**
         * <p>Specifies whether threat passwords are blocked when set using APIs.</p>
         * <p>Default value: false</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder interceptRiskPasswordOnApi(Boolean interceptRiskPasswordOnApi) {
            this.putQueryParameter("InterceptRiskPasswordOnApi", interceptRiskPasswordOnApi);
            this.interceptRiskPasswordOnApi = interceptRiskPasswordOnApi;
            return this;
        }

        /**
         * <p>Maximum number of failed password attempts. After the specified number of consecutive incorrect password attempts, the account is locked for one hour.</p>
         * <p>Valid values: 0 to 32.</p>
         * <p>Default value: 0, which disables this constraint.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxLoginAttemps(Integer maxLoginAttemps) {
            this.putQueryParameter("MaxLoginAttemps", maxLoginAttemps);
            this.maxLoginAttemps = maxLoginAttemps;
            return this;
        }

        /**
         * <p>Password validity period.</p>
         * <p>Valid values: 0 to 1095. Unit: days.</p>
         * <p>Default value: 0, which means passwords never expire.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxPasswordAge(Integer maxPasswordAge) {
            this.putQueryParameter("MaxPasswordAge", maxPasswordAge);
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }

        /**
         * <p>Minimum number of unique characters in a password.</p>
         * <p>Valid values: 0 to 8.</p>
         * <p>Default value: 0, which imposes no restriction.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minimumPasswordDifferentCharacter(Integer minimumPasswordDifferentCharacter) {
            this.putQueryParameter("MinimumPasswordDifferentCharacter", minimumPasswordDifferentCharacter);
            this.minimumPasswordDifferentCharacter = minimumPasswordDifferentCharacter;
            return this;
        }

        /**
         * <p>Minimum password length.</p>
         * <p>Valid values: 8 to 32.</p>
         * <p>Default value: 8.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder minimumPasswordLength(Integer minimumPasswordLength) {
            this.putQueryParameter("MinimumPasswordLength", minimumPasswordLength);
            this.minimumPasswordLength = minimumPasswordLength;
            return this;
        }

        /**
         * <p>Specifies whether passwords must not contain the user name.</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder passwordNotContainUserName(Boolean passwordNotContainUserName) {
            this.putQueryParameter("PasswordNotContainUserName", passwordNotContainUserName);
            this.passwordNotContainUserName = passwordNotContainUserName;
            return this;
        }

        /**
         * <p>Prevents reuse of previous passwords.</p>
         * <p>Valid values: 0 to 24. This value specifies how many previous passwords are blocked from reuse.</p>
         * <p>Default value: 0, which disables this constraint.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder passwordReusePrevention(Integer passwordReusePrevention) {
            this.putQueryParameter("PasswordReusePrevention", passwordReusePrevention);
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }

        /**
         * <p>Specifies whether passwords must contain lowercase letters.</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder requireLowercaseCharacters(Boolean requireLowercaseCharacters) {
            this.putQueryParameter("RequireLowercaseCharacters", requireLowercaseCharacters);
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            return this;
        }

        /**
         * <p>Specifies whether passwords must contain numbers.</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder requireNumbers(Boolean requireNumbers) {
            this.putQueryParameter("RequireNumbers", requireNumbers);
            this.requireNumbers = requireNumbers;
            return this;
        }

        /**
         * <p>Specifies whether passwords must contain special characters.</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder requireSymbols(Boolean requireSymbols) {
            this.putQueryParameter("RequireSymbols", requireSymbols);
            this.requireSymbols = requireSymbols;
            return this;
        }

        /**
         * <p>Specifies whether passwords must contain uppercase letters.</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
