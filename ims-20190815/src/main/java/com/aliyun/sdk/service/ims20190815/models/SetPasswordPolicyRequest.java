// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetPasswordPolicyRequest</p>
 */
public class SetPasswordPolicyRequest extends Request {
    @Query
    @NameInMap("HardExpire")
    private Boolean hardExpire;

    @Query
    @NameInMap("MaxLoginAttemps")
    private Integer maxLoginAttemps;

    @Query
    @NameInMap("MaxPasswordAge")
    private Integer maxPasswordAge;

    @Query
    @NameInMap("MinimumPasswordDifferentCharacter")
    private Integer minimumPasswordDifferentCharacter;

    @Query
    @NameInMap("MinimumPasswordLength")
    private Integer minimumPasswordLength;

    @Query
    @NameInMap("PasswordNotContainUserName")
    private Boolean passwordNotContainUserName;

    @Query
    @NameInMap("PasswordReusePrevention")
    private Integer passwordReusePrevention;

    @Query
    @NameInMap("RequireLowercaseCharacters")
    private Boolean requireLowercaseCharacters;

    @Query
    @NameInMap("RequireNumbers")
    private Boolean requireNumbers;

    @Query
    @NameInMap("RequireSymbols")
    private Boolean requireSymbols;

    @Query
    @NameInMap("RequireUppercaseCharacters")
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

        private Builder(SetPasswordPolicyRequest response) {
            super(response);
            this.hardExpire = response.hardExpire;
            this.maxLoginAttemps = response.maxLoginAttemps;
            this.maxPasswordAge = response.maxPasswordAge;
            this.minimumPasswordDifferentCharacter = response.minimumPasswordDifferentCharacter;
            this.minimumPasswordLength = response.minimumPasswordLength;
            this.passwordNotContainUserName = response.passwordNotContainUserName;
            this.passwordReusePrevention = response.passwordReusePrevention;
            this.requireLowercaseCharacters = response.requireLowercaseCharacters;
            this.requireNumbers = response.requireNumbers;
            this.requireSymbols = response.requireSymbols;
            this.requireUppercaseCharacters = response.requireUppercaseCharacters;
        } 

        /**
         * HardExpire.
         */
        public Builder hardExpire(Boolean hardExpire) {
            this.putQueryParameter("HardExpire", hardExpire);
            this.hardExpire = hardExpire;
            return this;
        }

        /**
         * MaxLoginAttemps.
         */
        public Builder maxLoginAttemps(Integer maxLoginAttemps) {
            this.putQueryParameter("MaxLoginAttemps", maxLoginAttemps);
            this.maxLoginAttemps = maxLoginAttemps;
            return this;
        }

        /**
         * MaxPasswordAge.
         */
        public Builder maxPasswordAge(Integer maxPasswordAge) {
            this.putQueryParameter("MaxPasswordAge", maxPasswordAge);
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }

        /**
         * MinimumPasswordDifferentCharacter.
         */
        public Builder minimumPasswordDifferentCharacter(Integer minimumPasswordDifferentCharacter) {
            this.putQueryParameter("MinimumPasswordDifferentCharacter", minimumPasswordDifferentCharacter);
            this.minimumPasswordDifferentCharacter = minimumPasswordDifferentCharacter;
            return this;
        }

        /**
         * MinimumPasswordLength.
         */
        public Builder minimumPasswordLength(Integer minimumPasswordLength) {
            this.putQueryParameter("MinimumPasswordLength", minimumPasswordLength);
            this.minimumPasswordLength = minimumPasswordLength;
            return this;
        }

        /**
         * PasswordNotContainUserName.
         */
        public Builder passwordNotContainUserName(Boolean passwordNotContainUserName) {
            this.putQueryParameter("PasswordNotContainUserName", passwordNotContainUserName);
            this.passwordNotContainUserName = passwordNotContainUserName;
            return this;
        }

        /**
         * PasswordReusePrevention.
         */
        public Builder passwordReusePrevention(Integer passwordReusePrevention) {
            this.putQueryParameter("PasswordReusePrevention", passwordReusePrevention);
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }

        /**
         * RequireLowercaseCharacters.
         */
        public Builder requireLowercaseCharacters(Boolean requireLowercaseCharacters) {
            this.putQueryParameter("RequireLowercaseCharacters", requireLowercaseCharacters);
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            return this;
        }

        /**
         * RequireNumbers.
         */
        public Builder requireNumbers(Boolean requireNumbers) {
            this.putQueryParameter("RequireNumbers", requireNumbers);
            this.requireNumbers = requireNumbers;
            return this;
        }

        /**
         * RequireSymbols.
         */
        public Builder requireSymbols(Boolean requireSymbols) {
            this.putQueryParameter("RequireSymbols", requireSymbols);
            this.requireSymbols = requireSymbols;
            return this;
        }

        /**
         * RequireUppercaseCharacters.
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
