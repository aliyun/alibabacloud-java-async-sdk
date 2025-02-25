// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link AccountAccessTokenResponse} extends {@link TeaModel}
 *
 * <p>AccountAccessTokenResponse</p>
 */
public class AccountAccessTokenResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("access_token")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.NameInMap("default_drive_id")
    private String defaultDriveId;

    @com.aliyun.core.annotation.NameInMap("default_sbox_drive_id")
    private String defaultSboxDriveId;

    @com.aliyun.core.annotation.NameInMap("device_id")
    private String deviceId;

    @com.aliyun.core.annotation.NameInMap("device_name")
    private String deviceName;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("exist_link")
    private java.util.List<LinkInfo> existLink;

    @com.aliyun.core.annotation.NameInMap("expire_time")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("expires_in")
    private Long expiresIn;

    @com.aliyun.core.annotation.NameInMap("is_first_login")
    private Boolean isFirstLogin;

    @com.aliyun.core.annotation.NameInMap("need_link")
    private Boolean needLink;

    @com.aliyun.core.annotation.NameInMap("need_rp_verify")
    private Boolean needRpVerify;

    @com.aliyun.core.annotation.NameInMap("nick_name")
    private String nickName;

    @com.aliyun.core.annotation.NameInMap("path_status")
    private String pathStatus;

    @com.aliyun.core.annotation.NameInMap("pin_setup")
    private Boolean pinSetup;

    @com.aliyun.core.annotation.NameInMap("refresh_token")
    private String refreshToken;

    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("token_type")
    private String tokenType;

    @com.aliyun.core.annotation.NameInMap("user_data")
    private java.util.Map<String, String> userData;

    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    private AccountAccessTokenResponse(BuilderImpl builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.avatar = builder.avatar;
        this.defaultDriveId = builder.defaultDriveId;
        this.defaultSboxDriveId = builder.defaultSboxDriveId;
        this.deviceId = builder.deviceId;
        this.deviceName = builder.deviceName;
        this.domainId = builder.domainId;
        this.existLink = builder.existLink;
        this.expireTime = builder.expireTime;
        this.expiresIn = builder.expiresIn;
        this.isFirstLogin = builder.isFirstLogin;
        this.needLink = builder.needLink;
        this.needRpVerify = builder.needRpVerify;
        this.nickName = builder.nickName;
        this.pathStatus = builder.pathStatus;
        this.pinSetup = builder.pinSetup;
        this.refreshToken = builder.refreshToken;
        this.role = builder.role;
        this.state = builder.state;
        this.status = builder.status;
        this.tokenType = builder.tokenType;
        this.userData = builder.userData;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static AccountAccessTokenResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return defaultDriveId
     */
    public String getDefaultDriveId() {
        return this.defaultDriveId;
    }

    /**
     * @return defaultSboxDriveId
     */
    public String getDefaultSboxDriveId() {
        return this.defaultSboxDriveId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return existLink
     */
    public java.util.List<LinkInfo> getExistLink() {
        return this.existLink;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expiresIn
     */
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * @return isFirstLogin
     */
    public Boolean getIsFirstLogin() {
        return this.isFirstLogin;
    }

    /**
     * @return needLink
     */
    public Boolean getNeedLink() {
        return this.needLink;
    }

    /**
     * @return needRpVerify
     */
    public Boolean getNeedRpVerify() {
        return this.needRpVerify;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return pathStatus
     */
    public String getPathStatus() {
        return this.pathStatus;
    }

    /**
     * @return pinSetup
     */
    public Boolean getPinSetup() {
        return this.pinSetup;
    }

    /**
     * @return refreshToken
     */
    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tokenType
     */
    public String getTokenType() {
        return this.tokenType;
    }

    /**
     * @return userData
     */
    public java.util.Map<String, String> getUserData() {
        return this.userData;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public interface Builder extends Response.Builder<AccountAccessTokenResponse, Builder> {

        Builder accessToken(String accessToken);

        Builder avatar(String avatar);

        Builder defaultDriveId(String defaultDriveId);

        Builder defaultSboxDriveId(String defaultSboxDriveId);

        Builder deviceId(String deviceId);

        Builder deviceName(String deviceName);

        Builder domainId(String domainId);

        Builder existLink(java.util.List<LinkInfo> existLink);

        Builder expireTime(String expireTime);

        Builder expiresIn(Long expiresIn);

        Builder isFirstLogin(Boolean isFirstLogin);

        Builder needLink(Boolean needLink);

        Builder needRpVerify(Boolean needRpVerify);

        Builder nickName(String nickName);

        Builder pathStatus(String pathStatus);

        Builder pinSetup(Boolean pinSetup);

        Builder refreshToken(String refreshToken);

        Builder role(String role);

        Builder state(String state);

        Builder status(String status);

        Builder tokenType(String tokenType);

        Builder userData(java.util.Map<String, String> userData);

        Builder userId(String userId);

        Builder userName(String userName);

        @Override
        AccountAccessTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AccountAccessTokenResponse, Builder>
            implements Builder {
        private String accessToken; 
        private String avatar; 
        private String defaultDriveId; 
        private String defaultSboxDriveId; 
        private String deviceId; 
        private String deviceName; 
        private String domainId; 
        private java.util.List<LinkInfo> existLink; 
        private String expireTime; 
        private Long expiresIn; 
        private Boolean isFirstLogin; 
        private Boolean needLink; 
        private Boolean needRpVerify; 
        private String nickName; 
        private String pathStatus; 
        private Boolean pinSetup; 
        private String refreshToken; 
        private String role; 
        private String state; 
        private String status; 
        private String tokenType; 
        private java.util.Map<String, String> userData; 
        private String userId; 
        private String userName; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AccountAccessTokenResponse response) {
            super(response);
            this.accessToken = response.accessToken;
            this.avatar = response.avatar;
            this.defaultDriveId = response.defaultDriveId;
            this.defaultSboxDriveId = response.defaultSboxDriveId;
            this.deviceId = response.deviceId;
            this.deviceName = response.deviceName;
            this.domainId = response.domainId;
            this.existLink = response.existLink;
            this.expireTime = response.expireTime;
            this.expiresIn = response.expiresIn;
            this.isFirstLogin = response.isFirstLogin;
            this.needLink = response.needLink;
            this.needRpVerify = response.needRpVerify;
            this.nickName = response.nickName;
            this.pathStatus = response.pathStatus;
            this.pinSetup = response.pinSetup;
            this.refreshToken = response.refreshToken;
            this.role = response.role;
            this.state = response.state;
            this.status = response.status;
            this.tokenType = response.tokenType;
            this.userData = response.userData;
            this.userId = response.userId;
            this.userName = response.userName;
        } 

        /**
         * access_token.
         */
        @Override
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * avatar.
         */
        @Override
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * default_drive_id.
         */
        @Override
        public Builder defaultDriveId(String defaultDriveId) {
            this.defaultDriveId = defaultDriveId;
            return this;
        }

        /**
         * default_sbox_drive_id.
         */
        @Override
        public Builder defaultSboxDriveId(String defaultSboxDriveId) {
            this.defaultSboxDriveId = defaultSboxDriveId;
            return this;
        }

        /**
         * device_id.
         */
        @Override
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * device_name.
         */
        @Override
        public Builder deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * domain_id.
         */
        @Override
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * exist_link.
         */
        @Override
        public Builder existLink(java.util.List<LinkInfo> existLink) {
            this.existLink = existLink;
            return this;
        }

        /**
         * expire_time.
         */
        @Override
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * expires_in.
         */
        @Override
        public Builder expiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * is_first_login.
         */
        @Override
        public Builder isFirstLogin(Boolean isFirstLogin) {
            this.isFirstLogin = isFirstLogin;
            return this;
        }

        /**
         * need_link.
         */
        @Override
        public Builder needLink(Boolean needLink) {
            this.needLink = needLink;
            return this;
        }

        /**
         * need_rp_verify.
         */
        @Override
        public Builder needRpVerify(Boolean needRpVerify) {
            this.needRpVerify = needRpVerify;
            return this;
        }

        /**
         * nick_name.
         */
        @Override
        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        /**
         * path_status.
         */
        @Override
        public Builder pathStatus(String pathStatus) {
            this.pathStatus = pathStatus;
            return this;
        }

        /**
         * pin_setup.
         */
        @Override
        public Builder pinSetup(Boolean pinSetup) {
            this.pinSetup = pinSetup;
            return this;
        }

        /**
         * refresh_token.
         */
        @Override
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * role.
         */
        @Override
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * state.
         */
        @Override
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * status.
         */
        @Override
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * token_type.
         */
        @Override
        public Builder tokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        /**
         * user_data.
         */
        @Override
        public Builder userData(java.util.Map<String, String> userData) {
            this.userData = userData;
            return this;
        }

        /**
         * user_id.
         */
        @Override
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * user_name.
         */
        @Override
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        @Override
        public AccountAccessTokenResponse build() {
            return new AccountAccessTokenResponse(this);
        } 

    } 

}
