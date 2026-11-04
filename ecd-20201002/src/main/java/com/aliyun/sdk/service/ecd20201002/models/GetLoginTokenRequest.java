// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link GetLoginTokenRequest} extends {@link RequestModel}
 *
 * <p>GetLoginTokenRequest</p>
 */
public class GetLoginTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationCode")
    private String authenticationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableFeatures")
    private java.util.Map<String, String> availableFeatures;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientName")
    private String clientName;

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
        this.availableFeatures = builder.availableFeatures;
        this.clientId = builder.clientId;
        this.clientName = builder.clientName;
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
     * @return availableFeatures
     */
    public java.util.Map<String, String> getAvailableFeatures() {
        return this.availableFeatures;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientName
     */
    public String getClientName() {
        return this.clientName;
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
        private java.util.Map<String, String> availableFeatures; 
        private String clientId; 
        private String clientName; 
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
            this.availableFeatures = request.availableFeatures;
            this.clientId = request.clientId;
            this.clientName = request.clientName;
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
         * <p>The security code generated by the virtual MFA device. This parameter is required when CurrentStage is set to MFAVerify.</p>
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
         * <p>The features supported by the client.</p>
         */
        public Builder availableFeatures(java.util.Map<String, String> availableFeatures) {
            String availableFeaturesShrink = shrink(availableFeatures, "AvailableFeatures", "json");
            this.putQueryParameter("AvailableFeatures", availableFeaturesShrink);
            this.availableFeatures = availableFeatures;
            return this;
        }

        /**
         * <p>The unique ID generated by the client.</p>
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
         * <p>The name of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-client</p>
         */
        public Builder clientName(String clientName) {
            this.putQueryParameter("ClientName", clientName);
            this.clientName = clientName;
            return this;
        }

        /**
         * <p>The operating system of the device on which the client runs.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows_NT 10.0.18363 x64</p>
         */
        public Builder clientOS(String clientOS) {
            this.putQueryParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * <p>The type of the Wuying software client.</p>
         * 
         * <strong>example:</strong>
         * <p>WINDOWS</p>
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The client version. If you use the Wuying client, you can view this parameter in the <strong>About</strong> dialog box on the client logon page.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1.0-R-20210731.151756</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The current logon authentication stage. Valid values:</p>
         * <ul>
         * <li>ADPassword: verifies user information. Specify this value when password-based authentication is used for a convenience account or an Active Directory (AD) account.</li>
         * <li>MFABind: binds a virtual MFA device.</li>
         * <li>MFAVerify: verifies the security code generated by the virtual MFA device.</li>
         * <li>TokenVerify: performs client-side secondary authentication.</li>
         * <li>ChangePassword: changes the user password.</li>
         * <li>KeepAliveVerify: exchanges a valid KeepAliveToken for a LoginToken.</li>
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
         * <p>The ID of the workspace. This parameter has the same meaning as OfficeSiteId. We recommend that you use OfficeSiteId instead of DirectoryId. You can specify only one of DirectoryId and OfficeSiteId.</p>
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
         * <p>The username of the convenience user or AD user. This parameter is required when CurrentStage is set to ADPassword.</p>
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
         * <p>Specifies whether to keep the user logged on.</p>
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
         * <p>The token used to keep the user logged on. After a successful logon and if the user enables the keep-logged-on option, the API returns KeepAliveToken. Within the validity period of KeepAliveToken, you can call the GetLoginToken operation and set CurrentStage to KeepAliveVerify to exchange it for a logon token (LoginToken). This parameter is required when CurrentStage is set to KeepAliveVerify.</p>
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
         * <p>The new password. This parameter is required when CurrentStage is set to ChangePassword.</p>
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
         * <p>The ID of the workspace.</p>
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
         * <p>The old password. This parameter is required when CurrentStage is set to ChangePassword.</p>
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
         * <p>The password of the convenience user or AD user. This parameter is required when CurrentStage is set to ADPassword.</p>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service.</p>
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
         * <p>The session ID for logon.</p>
         * <ul>
         * <li>If no virtual MFA device is bound or client-side secondary authentication is not enabled, you do not need to specify SessionId.</li>
         * <li>If a virtual MFA device is bound or client-side secondary authentication is enabled, you must specify SessionId in the logon authentication stages after ADPassword. You can obtain SessionId from the response of the convenience account verification (when the GetLoginToken request is in the ADPassword stage).</li>
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
         * <p>The verification code for secondary authentication. If client-side secondary authentication is enabled in the Elastic Desktop Service console and the current logon user is identified as risky, the verification code is sent to the email address of the end user. This parameter is required when CurrentStage is set to TokenVerify.</p>
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
         * <p>The unique identifier of the client. If you use the Wuying client, you can view this parameter in the <strong>About</strong> dialog box on the client logon page.</p>
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
