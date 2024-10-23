// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
         * <p>Specifies whether to disable logon after the password expires. Valid values:</p>
         * <ul>
         * <li>true: After the password expires, you cannot use the password to log on to the console. You can log on to the console only after you reset the password by using your Alibaba Cloud account or as a RAM user that has administrative rights.</li>
         * <li>false: After the password expires, you can change the password to log on to the console. This is the default value.</li>
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
         * <p>The maximum number of password retries. If you enter the wrong passwords for the specified consecutive times, the account is locked for one hour.</p>
         * <p>Valid values: 0 to 32.</p>
         * <p>The default value is 0, which indicates that the password retries are not limited.</p>
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
         * <p>The validity period of the password.</p>
         * <p>Valid values: 0 to 1095. Unit: days.</p>
         * <p>The default value is 0, which indicates that the password never expires.</p>
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
         * <p>The minimum number of unique characters in the password.</p>
         * <p>Valid values: 0 to 8.</p>
         * <p>The default value is 0, which indicates that no limits are imposed on the number of unique characters in a password.</p>
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
         * <p>The minimum number of characters in the password.</p>
         * <p>Valid values: 8 to 32. Default value: 8.</p>
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
         * <p>Specifies whether to exclude the username from the password. Valid values:</p>
         * <ul>
         * <li>true: A password cannot contain the username.</li>
         * <li>false: A password can contain the username. This is the default value.</li>
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
         * <p>The policy for password history check.</p>
         * <p>The previous N passwords cannot be reused. Valid values of N: 0 to 24.</p>
         * <p>The default value is 0, which indicates that RAM users can reuse previous passwords.</p>
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
         * <p>Specifies whether the password must contain lowercase letters. Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>Specifies whether the password must contain digits. Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>Specifies whether the password must contain special characters. Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>Specifies whether the password must contain uppercase letters. Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
