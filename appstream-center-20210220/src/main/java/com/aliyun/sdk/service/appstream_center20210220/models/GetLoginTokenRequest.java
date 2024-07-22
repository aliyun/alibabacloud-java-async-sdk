// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210220.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginTokenRequest} extends {@link RequestModel}
 *
 * <p>GetLoginTokenRequest</p>
 */
public class GetLoginTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationCode")
    private String authenticationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientOS")
    private String clientOS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private String clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentStage")
    private String currentStage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptedFingerPrintData")
    private String encryptedFingerPrintData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptedKey")
    private String encryptedKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptedPassword")
    private String encryptedPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FingerPrintData")
    private String fingerPrintData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdpId")
    private String idpId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepAlive")
    private Boolean keepAlive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepAliveToken")
    private String keepAliveToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginIdentifier")
    private String loginIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginName")
    private String loginName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPassword")
    private String newPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldPassword")
    private String oldPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(maxLength = 500, minLength = 1)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneVerifyCode")
    private String phoneVerifyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsoExtendsCookies")
    private String ssoExtendsCookies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsoSessionToken")
    private String ssoSessionToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenCode")
    private String tokenCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UmidToken")
    private String umidToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private GetLoginTokenRequest(Builder builder) {
        super(builder);
        this.authenticationCode = builder.authenticationCode;
        this.clientId = builder.clientId;
        this.clientOS = builder.clientOS;
        this.clientType = builder.clientType;
        this.clientVersion = builder.clientVersion;
        this.currentStage = builder.currentStage;
        this.directoryId = builder.directoryId;
        this.encryptedFingerPrintData = builder.encryptedFingerPrintData;
        this.encryptedKey = builder.encryptedKey;
        this.encryptedPassword = builder.encryptedPassword;
        this.endUserId = builder.endUserId;
        this.fingerPrintData = builder.fingerPrintData;
        this.idpId = builder.idpId;
        this.imageUrl = builder.imageUrl;
        this.keepAlive = builder.keepAlive;
        this.keepAliveToken = builder.keepAliveToken;
        this.loginIdentifier = builder.loginIdentifier;
        this.loginName = builder.loginName;
        this.networkType = builder.networkType;
        this.newPassword = builder.newPassword;
        this.officeSiteId = builder.officeSiteId;
        this.oldPassword = builder.oldPassword;
        this.password = builder.password;
        this.phone = builder.phone;
        this.phoneVerifyCode = builder.phoneVerifyCode;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
        this.ssoExtendsCookies = builder.ssoExtendsCookies;
        this.ssoSessionToken = builder.ssoSessionToken;
        this.tokenCode = builder.tokenCode;
        this.umidToken = builder.umidToken;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationCode
     */
    public String getAuthenticationCode() {
        return this.authenticationCode;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientOS
     */
    public String getClientOS() {
        return this.clientOS;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return currentStage
     */
    public String getCurrentStage() {
        return this.currentStage;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return encryptedFingerPrintData
     */
    public String getEncryptedFingerPrintData() {
        return this.encryptedFingerPrintData;
    }

    /**
     * @return encryptedKey
     */
    public String getEncryptedKey() {
        return this.encryptedKey;
    }

    /**
     * @return encryptedPassword
     */
    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return fingerPrintData
     */
    public String getFingerPrintData() {
        return this.fingerPrintData;
    }

    /**
     * @return idpId
     */
    public String getIdpId() {
        return this.idpId;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return keepAlive
     */
    public Boolean getKeepAlive() {
        return this.keepAlive;
    }

    /**
     * @return keepAliveToken
     */
    public String getKeepAliveToken() {
        return this.keepAliveToken;
    }

    /**
     * @return loginIdentifier
     */
    public String getLoginIdentifier() {
        return this.loginIdentifier;
    }

    /**
     * @return loginName
     */
    public String getLoginName() {
        return this.loginName;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return phoneVerifyCode
     */
    public String getPhoneVerifyCode() {
        return this.phoneVerifyCode;
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

    /**
     * @return ssoExtendsCookies
     */
    public String getSsoExtendsCookies() {
        return this.ssoExtendsCookies;
    }

    /**
     * @return ssoSessionToken
     */
    public String getSsoSessionToken() {
        return this.ssoSessionToken;
    }

    /**
     * @return tokenCode
     */
    public String getTokenCode() {
        return this.tokenCode;
    }

    /**
     * @return umidToken
     */
    public String getUmidToken() {
        return this.umidToken;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetLoginTokenRequest, Builder> {
        private String authenticationCode; 
        private String clientId; 
        private String clientOS; 
        private String clientType; 
        private String clientVersion; 
        private String currentStage; 
        private String directoryId; 
        private String encryptedFingerPrintData; 
        private String encryptedKey; 
        private String encryptedPassword; 
        private String endUserId; 
        private String fingerPrintData; 
        private String idpId; 
        private String imageUrl; 
        private Boolean keepAlive; 
        private String keepAliveToken; 
        private String loginIdentifier; 
        private String loginName; 
        private String networkType; 
        private String newPassword; 
        private String officeSiteId; 
        private String oldPassword; 
        private String password; 
        private String phone; 
        private String phoneVerifyCode; 
        private String regionId; 
        private String sessionId; 
        private String ssoExtendsCookies; 
        private String ssoSessionToken; 
        private String tokenCode; 
        private String umidToken; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetLoginTokenRequest request) {
            super(request);
            this.authenticationCode = request.authenticationCode;
            this.clientId = request.clientId;
            this.clientOS = request.clientOS;
            this.clientType = request.clientType;
            this.clientVersion = request.clientVersion;
            this.currentStage = request.currentStage;
            this.directoryId = request.directoryId;
            this.encryptedFingerPrintData = request.encryptedFingerPrintData;
            this.encryptedKey = request.encryptedKey;
            this.encryptedPassword = request.encryptedPassword;
            this.endUserId = request.endUserId;
            this.fingerPrintData = request.fingerPrintData;
            this.idpId = request.idpId;
            this.imageUrl = request.imageUrl;
            this.keepAlive = request.keepAlive;
            this.keepAliveToken = request.keepAliveToken;
            this.loginIdentifier = request.loginIdentifier;
            this.loginName = request.loginName;
            this.networkType = request.networkType;
            this.newPassword = request.newPassword;
            this.officeSiteId = request.officeSiteId;
            this.oldPassword = request.oldPassword;
            this.password = request.password;
            this.phone = request.phone;
            this.phoneVerifyCode = request.phoneVerifyCode;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.ssoExtendsCookies = request.ssoExtendsCookies;
            this.ssoSessionToken = request.ssoSessionToken;
            this.tokenCode = request.tokenCode;
            this.umidToken = request.umidToken;
            this.uuid = request.uuid;
        } 

        /**
         * AuthenticationCode.
         */
        public Builder authenticationCode(String authenticationCode) {
            this.putQueryParameter("AuthenticationCode", authenticationCode);
            this.authenticationCode = authenticationCode;
            return this;
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
         * ClientOS.
         */
        public Builder clientOS(String clientOS) {
            this.putQueryParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * CurrentStage.
         */
        public Builder currentStage(String currentStage) {
            this.putQueryParameter("CurrentStage", currentStage);
            this.currentStage = currentStage;
            return this;
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
         * EncryptedFingerPrintData.
         */
        public Builder encryptedFingerPrintData(String encryptedFingerPrintData) {
            this.putQueryParameter("EncryptedFingerPrintData", encryptedFingerPrintData);
            this.encryptedFingerPrintData = encryptedFingerPrintData;
            return this;
        }

        /**
         * EncryptedKey.
         */
        public Builder encryptedKey(String encryptedKey) {
            this.putQueryParameter("EncryptedKey", encryptedKey);
            this.encryptedKey = encryptedKey;
            return this;
        }

        /**
         * EncryptedPassword.
         */
        public Builder encryptedPassword(String encryptedPassword) {
            this.putQueryParameter("EncryptedPassword", encryptedPassword);
            this.encryptedPassword = encryptedPassword;
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
         * FingerPrintData.
         */
        public Builder fingerPrintData(String fingerPrintData) {
            this.putQueryParameter("FingerPrintData", fingerPrintData);
            this.fingerPrintData = fingerPrintData;
            return this;
        }

        /**
         * IdpId.
         */
        public Builder idpId(String idpId) {
            this.putQueryParameter("IdpId", idpId);
            this.idpId = idpId;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * KeepAlive.
         */
        public Builder keepAlive(Boolean keepAlive) {
            this.putQueryParameter("KeepAlive", keepAlive);
            this.keepAlive = keepAlive;
            return this;
        }

        /**
         * KeepAliveToken.
         */
        public Builder keepAliveToken(String keepAliveToken) {
            this.putQueryParameter("KeepAliveToken", keepAliveToken);
            this.keepAliveToken = keepAliveToken;
            return this;
        }

        /**
         * LoginIdentifier.
         */
        public Builder loginIdentifier(String loginIdentifier) {
            this.putQueryParameter("LoginIdentifier", loginIdentifier);
            this.loginIdentifier = loginIdentifier;
            return this;
        }

        /**
         * LoginName.
         */
        public Builder loginName(String loginName) {
            this.putQueryParameter("LoginName", loginName);
            this.loginName = loginName;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * PhoneVerifyCode.
         */
        public Builder phoneVerifyCode(String phoneVerifyCode) {
            this.putQueryParameter("PhoneVerifyCode", phoneVerifyCode);
            this.phoneVerifyCode = phoneVerifyCode;
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

        /**
         * SsoExtendsCookies.
         */
        public Builder ssoExtendsCookies(String ssoExtendsCookies) {
            this.putQueryParameter("SsoExtendsCookies", ssoExtendsCookies);
            this.ssoExtendsCookies = ssoExtendsCookies;
            return this;
        }

        /**
         * SsoSessionToken.
         */
        public Builder ssoSessionToken(String ssoSessionToken) {
            this.putQueryParameter("SsoSessionToken", ssoSessionToken);
            this.ssoSessionToken = ssoSessionToken;
            return this;
        }

        /**
         * TokenCode.
         */
        public Builder tokenCode(String tokenCode) {
            this.putQueryParameter("TokenCode", tokenCode);
            this.tokenCode = tokenCode;
            return this;
        }

        /**
         * UmidToken.
         */
        public Builder umidToken(String umidToken) {
            this.putQueryParameter("UmidToken", umidToken);
            this.umidToken = umidToken;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetLoginTokenRequest build() {
            return new GetLoginTokenRequest(this);
        } 

    } 

}
