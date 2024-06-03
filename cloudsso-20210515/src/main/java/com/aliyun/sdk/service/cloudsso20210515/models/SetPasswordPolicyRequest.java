// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxLoginAttempts")
    private Integer maxLoginAttempts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPasswordAge")
    private Integer maxPasswordAge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinPasswordDifferentChars")
    private Integer minPasswordDifferentChars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinPasswordLength")
    private Integer minPasswordLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordNotContainUsername")
    private Boolean passwordNotContainUsername;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordReusePrevention")
    private Integer passwordReusePrevention;

    private SetPasswordPolicyRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.maxLoginAttempts = builder.maxLoginAttempts;
        this.maxPasswordAge = builder.maxPasswordAge;
        this.minPasswordDifferentChars = builder.minPasswordDifferentChars;
        this.minPasswordLength = builder.minPasswordLength;
        this.passwordNotContainUsername = builder.passwordNotContainUsername;
        this.passwordReusePrevention = builder.passwordReusePrevention;
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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

    public static final class Builder extends Request.Builder<SetPasswordPolicyRequest, Builder> {
        private String directoryId; 
        private Integer maxLoginAttempts; 
        private Integer maxPasswordAge; 
        private Integer minPasswordDifferentChars; 
        private Integer minPasswordLength; 
        private Boolean passwordNotContainUsername; 
        private Integer passwordReusePrevention; 

        private Builder() {
            super();
        } 

        private Builder(SetPasswordPolicyRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.maxLoginAttempts = request.maxLoginAttempts;
            this.maxPasswordAge = request.maxPasswordAge;
            this.minPasswordDifferentChars = request.minPasswordDifferentChars;
            this.minPasswordLength = request.minPasswordLength;
            this.passwordNotContainUsername = request.passwordNotContainUsername;
            this.passwordReusePrevention = request.passwordReusePrevention;
        } 

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The number of password retries.
         * <p>
         * 
         * If you enter wrong passwords for the specified consecutive times, the account is locked for 1 hour.
         * 
         * Valid values: 0 to 32. The value 0 specifies that the number of password retries is not limited.
         */
        public Builder maxLoginAttempts(Integer maxLoginAttempts) {
            this.putQueryParameter("MaxLoginAttempts", maxLoginAttempts);
            this.maxLoginAttempts = maxLoginAttempts;
            return this;
        }

        /**
         * The validity period of a password.
         * <p>
         * 
         * Valid values: 1 to 120. Unit: days.
         */
        public Builder maxPasswordAge(Integer maxPasswordAge) {
            this.putQueryParameter("MaxPasswordAge", maxPasswordAge);
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }

        /**
         * The minimum number of unique characters in a password.
         * <p>
         * 
         * The minimum value is 0, which specifies that the minimum number of unique characters in a password is not limited. The maximum value is the value of the `MinPasswordLength` parameter.
         */
        public Builder minPasswordDifferentChars(Integer minPasswordDifferentChars) {
            this.putQueryParameter("MinPasswordDifferentChars", minPasswordDifferentChars);
            this.minPasswordDifferentChars = minPasswordDifferentChars;
            return this;
        }

        /**
         * The minimum password length.
         * <p>
         * 
         * Valid values: 8 to 32 characters.
         */
        public Builder minPasswordLength(Integer minPasswordLength) {
            this.putQueryParameter("MinPasswordLength", minPasswordLength);
            this.minPasswordLength = minPasswordLength;
            return this;
        }

        /**
         * Specifies whether a password can contain the username. Valid value:
         * <p>
         * 
         * *   true: A password cannot contain the username.
         * *   false: A password can contain the username.
         */
        public Builder passwordNotContainUsername(Boolean passwordNotContainUsername) {
            this.putQueryParameter("PasswordNotContainUsername", passwordNotContainUsername);
            this.passwordNotContainUsername = passwordNotContainUsername;
            return this;
        }

        /**
         * The policy for password history check.
         * <p>
         * 
         * The previous N passwords cannot be reused. Valid values of N: 0 to 24. The value 0 specifies that all historical passwords can be reused.
         * 
         * >  Passwords that are generated before January 5, 2024 are not counted as historical passwords.
         */
        public Builder passwordReusePrevention(Integer passwordReusePrevention) {
            this.putQueryParameter("PasswordReusePrevention", passwordReusePrevention);
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }

        @Override
        public SetPasswordPolicyRequest build() {
            return new SetPasswordPolicyRequest(this);
        } 

    } 

}
