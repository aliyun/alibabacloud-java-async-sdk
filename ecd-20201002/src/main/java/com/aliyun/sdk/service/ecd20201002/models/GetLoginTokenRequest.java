// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepAlive")
    private Boolean keepAlive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepAliveToken")
    private String keepAliveToken;

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
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenCode")
    private String tokenCode;

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
        this.endUserId = builder.endUserId;
        this.keepAlive = builder.keepAlive;
        this.keepAliveToken = builder.keepAliveToken;
        this.newPassword = builder.newPassword;
        this.officeSiteId = builder.officeSiteId;
        this.oldPassword = builder.oldPassword;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
        this.tokenCode = builder.tokenCode;
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
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
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
     * @return tokenCode
     */
    public String getTokenCode() {
        return this.tokenCode;
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
        private String endUserId; 
        private Boolean keepAlive; 
        private String keepAliveToken; 
        private String newPassword; 
        private String officeSiteId; 
        private String oldPassword; 
        private String password; 
        private String regionId; 
        private String sessionId; 
        private String tokenCode; 
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
            this.endUserId = request.endUserId;
            this.keepAlive = request.keepAlive;
            this.keepAliveToken = request.keepAliveToken;
            this.newPassword = request.newPassword;
            this.officeSiteId = request.officeSiteId;
            this.oldPassword = request.oldPassword;
            this.password = request.password;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.tokenCode = request.tokenCode;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The verification code that is generated by the virtual MFA device. This parameter is required if you set <code>CurrentStage</code> to <code>MFAVerify</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>47****</p>
         */
        public Builder authenticationCode(String authenticationCode) {
            this.putQueryParameter("AuthenticationCode", authenticationCode);
            this.authenticationCode = authenticationCode;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud Workspace client. The system generates a unique ID for each client.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f4a0dc8e-1702-4728-9a60-95b27a35****</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The operating system (OS) of the device that runs an Alibaba Cloud Workspace client.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows_NT 10.0.1**** x64</p>
         */
        public Builder clientOS(String clientOS) {
            this.putQueryParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * <p>The type of Alibaba Cloud Workspace clients.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>HTML5: web client.</p>
         * </li>
         * <li><p>WINDOWS: Windows client.</p>
         * </li>
         * <li><p>MACOS: macOS client.</p>
         * </li>
         * <li><p>IOS: iOS client.</p>
         * </li>
         * <li><p>ANDROID: Android client.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The version of the client. When you use an Alibaba Cloud Workspace client, you can view the client version in the <strong>About</strong> dialog box on the client logon page.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1.0-R-20210731.1****</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The logon authentication stage. Valid values:</p>
         * <ul>
         * <li><code>ADPassword</code>: the stage to verify the identity of the Active Directory (AD) user. You must specify the value when the system verifies the identity of a convenience account or an AD account.</li>
         * <li><code>MFABind: the stage to bind a virtual multi-factor authentication (MFA) device.</code></li>
         * <li><code>MFAVerify: the stage to verify the verification code that is generated by the virtual MFA device.</code></li>
         * <li><code>TokenVerify</code>: the stage to perform two-factor authentication on an Alibaba Cloud Workspace client (hereinafter referred to as the client).</li>
         * <li><code>ChangePassword</code>: the stage to change the password of the user.</li>
         * <li><code>KeepAliveVerify</code>: the stage to obtain LoginToken if KeepAliveToken is valid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ADPassword</p>
         */
        public Builder currentStage(String currentStage) {
            this.putQueryParameter("CurrentStage", currentStage);
            this.currentStage = currentStage;
            return this;
        }

        /**
         * <p>The office network ID. This parameter has the same meaning as <code>OfficeSiteId</code>. We recommend that you replace <code>DirectoryId</code> with <code>OfficeSiteId</code>. You can specify a value for <code>DirectoryId</code> or <code>OfficeSiteId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-885351****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The name of the convenience user or the AD user. This parameter is required if you set <code>CurrentStage</code> to <code>ADPassword</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>Specifies whether to keep the user logged on to the client. 
         * Valid values:</p>
         * <ul>
         * <li>null: Default value. Do not keep the user logged on to the client.</li>
         * <li>true: Keep the user logged on to the client.</li>
         * <li>false:  Do not keep the user logged on to the client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder keepAlive(Boolean keepAlive) {
            this.putQueryParameter("KeepAlive", keepAlive);
            this.keepAlive = keepAlive;
            return this;
        }

        /**
         * <p>The token to keep logging on to an Alibaba Cloud Workspace client. When an end user logs on to the Alibaba Cloud Workspace client and select Auto Sign-in, <code>KeepAliveToken</code> is returned after you call this operation. Within the valid period of the returned token``, you can call the <code>GetLoginToken</code> operation and set <code>CurrentStage</code> to <code>KeepAliveVerify</code>. Then, you can obtain LoginToken. If you set <code>CurrentStage</code> to <code>KeepAliveVerify</code>, <code>KeepAliveToken</code> is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        public Builder keepAliveToken(String keepAliveToken) {
            this.putQueryParameter("KeepAliveToken", keepAliveToken);
            this.keepAliveToken = keepAliveToken;
            return this;
        }

        /**
         * <p>The new password. This parameter is required if you set <code>CurrentStage</code> to <code>ChangePassword</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>NewPassword</p>
         */
        public Builder newPassword(String newPassword) {
            this.putQueryParameter("NewPassword", newPassword);
            this.newPassword = newPassword;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-885351****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The current password. This parameter is required if you set <code>CurrentStage</code> to <code>ChangePassword</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>OldPassword</p>
         */
        public Builder oldPassword(String oldPassword) {
            this.putQueryParameter("OldPassword", oldPassword);
            this.oldPassword = oldPassword;
            return this;
        }

        /**
         * <p>The password of the convenience user or the AD user. This parameter is required if you set <code>CurrentStage</code> to <code>ADPassword</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Password1234</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by EDS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the session.</p>
         * <ul>
         * <li>If the virtual multi-factor authentication (MFA) device is not bound or two-factor authentication is not enabled for the client, you do not need to specify a value for <code>SessionId</code>.</li>
         * <li>If the virtual MFA device is not bound or two-factor authentication is enabled for the client, you must specify a value for <code>SessionId</code> to verify the user identity after you specify a value for <code>ADPassword</code>. The value of the <code>SessionId</code> parameter is returned only if the CurrentStage parameter is set to <code>ADPassword</code> when you call the <code>GetLoginToken</code> operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cd45e873-650d-4d70-acb9-f996187a****</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>If two-factor authentication is enabled for Alibaba Cloud Workspace terminals in the EDS console and the system detects that the current logon user is exposed to risks, the system sends a verification code to the email address of the user. This parameter is required if you set <code>CurrentStage</code> to <code>TokenVerify</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>63****</p>
         */
        public Builder tokenCode(String tokenCode) {
            this.putQueryParameter("TokenCode", tokenCode);
            this.tokenCode = tokenCode;
            return this;
        }

        /**
         * <p>The unique identifier of the client. When you use an Alibaba Cloud Workspace client, you can view the client version in the <strong>About</strong> dialog box on the client logon page.</p>
         * 
         * <strong>example:</strong>
         * <p>C78CA9E99315687575DD2844C1F3****</p>
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
