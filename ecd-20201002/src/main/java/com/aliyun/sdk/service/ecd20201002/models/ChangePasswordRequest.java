// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangePasswordRequest} extends {@link RequestModel}
 *
 * <p>ChangePasswordRequest</p>
 */
public class ChangePasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String oldPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private ChangePasswordRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.endUserId = builder.endUserId;
        this.loginToken = builder.loginToken;
        this.newPassword = builder.newPassword;
        this.officeSiteId = builder.officeSiteId;
        this.oldPassword = builder.oldPassword;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangePasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return newPassword
     */
    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return oldPassword
     */
    public String getOldPassword() {
        return this.oldPassword;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<ChangePasswordRequest, Builder> {
        private String clientId; 
        private String endUserId; 
        private String loginToken; 
        private String newPassword; 
        private String officeSiteId; 
        private String oldPassword; 
        private String regionId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ChangePasswordRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.endUserId = request.endUserId;
            this.loginToken = request.loginToken;
            this.newPassword = request.newPassword;
            this.officeSiteId = request.officeSiteId;
            this.oldPassword = request.oldPassword;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * LoginToken.
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * NewPassword.
         */
        public Builder newPassword(String newPassword) {
            this.putQueryParameter("NewPassword", newPassword);
            this.newPassword = newPassword;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * OldPassword.
         */
        public Builder oldPassword(String oldPassword) {
            this.putQueryParameter("OldPassword", oldPassword);
            this.oldPassword = oldPassword;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public ChangePasswordRequest build() {
            return new ChangePasswordRequest(this);
        } 

    } 

}
