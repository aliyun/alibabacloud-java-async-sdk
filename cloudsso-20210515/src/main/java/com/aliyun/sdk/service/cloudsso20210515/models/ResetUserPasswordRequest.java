// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link ResetUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetUserPasswordRequest</p>
 */
public class ResetUserPasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GenerateRandomPassword")
    private Boolean generateRandomPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequirePasswordResetForNextLogin")
    private Boolean requirePasswordResetForNextLogin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private ResetUserPasswordRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.generateRandomPassword = builder.generateRandomPassword;
        this.password = builder.password;
        this.requirePasswordResetForNextLogin = builder.requirePasswordResetForNextLogin;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetUserPasswordRequest create() {
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
     * @return generateRandomPassword
     */
    public Boolean getGenerateRandomPassword() {
        return this.generateRandomPassword;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return requirePasswordResetForNextLogin
     */
    public Boolean getRequirePasswordResetForNextLogin() {
        return this.requirePasswordResetForNextLogin;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ResetUserPasswordRequest, Builder> {
        private String directoryId; 
        private Boolean generateRandomPassword; 
        private String password; 
        private Boolean requirePasswordResetForNextLogin; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ResetUserPasswordRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.generateRandomPassword = request.generateRandomPassword;
            this.password = request.password;
            this.requirePasswordResetForNextLogin = request.requirePasswordResetForNextLogin;
            this.userId = request.userId;
        } 

        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically generate a password. Valid values:</p>
         * <ul>
         * <li>True: The password is automatically generated.</li>
         * <li>False (default): The password is manually specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder generateRandomPassword(Boolean generateRandomPassword) {
            this.putQueryParameter("GenerateRandomPassword", generateRandomPassword);
            this.generateRandomPassword = generateRandomPassword;
            return this;
        }

        /**
         * <p>The new password.</p>
         * <p>Format: The password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character.</p>
         * <p>Length: 8 to 32 characters.</p>
         * <blockquote>
         * <p>If GenerateRandomPassword is set to False, you must specify Password.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>uc)XK$?ictf72CKFDy9vtWaFmISl****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>Specifies whether the user must reset the password upon the next logon. Valid values:</p>
         * <ul>
         * <li>True: The user must reset the password.</li>
         * <li>False (default): The user does not need to reset the password.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder requirePasswordResetForNextLogin(Boolean requirePasswordResetForNextLogin) {
            this.putQueryParameter("RequirePasswordResetForNextLogin", requirePasswordResetForNextLogin);
            this.requirePasswordResetForNextLogin = requirePasswordResetForNextLogin;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ResetUserPasswordRequest build() {
            return new ResetUserPasswordRequest(this);
        } 

    } 

}
