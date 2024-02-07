// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("MaxLoginAttempts")
    private Integer maxLoginAttempts;

    @Query
    @NameInMap("MaxPasswordAge")
    private Integer maxPasswordAge;

    @Query
    @NameInMap("MinPasswordDifferentChars")
    private Integer minPasswordDifferentChars;

    @Query
    @NameInMap("MinPasswordLength")
    private Integer minPasswordLength;

    @Query
    @NameInMap("PasswordNotContainUsername")
    private Boolean passwordNotContainUsername;

    @Query
    @NameInMap("PasswordReusePrevention")
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
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * MaxLoginAttempts.
         */
        public Builder maxLoginAttempts(Integer maxLoginAttempts) {
            this.putQueryParameter("MaxLoginAttempts", maxLoginAttempts);
            this.maxLoginAttempts = maxLoginAttempts;
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
         * MinPasswordDifferentChars.
         */
        public Builder minPasswordDifferentChars(Integer minPasswordDifferentChars) {
            this.putQueryParameter("MinPasswordDifferentChars", minPasswordDifferentChars);
            this.minPasswordDifferentChars = minPasswordDifferentChars;
            return this;
        }

        /**
         * MinPasswordLength.
         */
        public Builder minPasswordLength(Integer minPasswordLength) {
            this.putQueryParameter("MinPasswordLength", minPasswordLength);
            this.minPasswordLength = minPasswordLength;
            return this;
        }

        /**
         * PasswordNotContainUsername.
         */
        public Builder passwordNotContainUsername(Boolean passwordNotContainUsername) {
            this.putQueryParameter("PasswordNotContainUsername", passwordNotContainUsername);
            this.passwordNotContainUsername = passwordNotContainUsername;
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

        @Override
        public SetPasswordPolicyRequest build() {
            return new SetPasswordPolicyRequest(this);
        } 

    } 

}
