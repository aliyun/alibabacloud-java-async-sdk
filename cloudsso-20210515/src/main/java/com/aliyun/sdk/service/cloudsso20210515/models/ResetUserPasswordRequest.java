// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetUserPasswordRequest</p>
 */
public class ResetUserPasswordRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("GenerateRandomPassword")
    private Boolean generateRandomPassword;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("RequirePasswordResetForNextLogin")
    private Boolean requirePasswordResetForNextLogin;

    @Query
    @NameInMap("UserId")
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

        private Builder(ResetUserPasswordRequest response) {
            super(response);
            this.directoryId = response.directoryId;
            this.generateRandomPassword = response.generateRandomPassword;
            this.password = response.password;
            this.requirePasswordResetForNextLogin = response.requirePasswordResetForNextLogin;
            this.userId = response.userId;
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
         * GenerateRandomPassword.
         */
        public Builder generateRandomPassword(Boolean generateRandomPassword) {
            this.putQueryParameter("GenerateRandomPassword", generateRandomPassword);
            this.generateRandomPassword = generateRandomPassword;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RequirePasswordResetForNextLogin.
         */
        public Builder requirePasswordResetForNextLogin(Boolean requirePasswordResetForNextLogin) {
            this.putQueryParameter("RequirePasswordResetForNextLogin", requirePasswordResetForNextLogin);
            this.requirePasswordResetForNextLogin = requirePasswordResetForNextLogin;
            return this;
        }

        /**
         * UserId.
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
