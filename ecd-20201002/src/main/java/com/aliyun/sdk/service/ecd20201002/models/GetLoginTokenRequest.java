// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
         * The verification code that is generated by the virtual MFA device. This parameter is required if you set `CurrentStage` to `MFAVerify`.
         */
        public Builder authenticationCode(String authenticationCode) {
            this.putQueryParameter("AuthenticationCode", authenticationCode);
            this.authenticationCode = authenticationCode;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud Workspace client. The system generates a unique ID for each client.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * The OS that the client runs.
         */
        public Builder clientOS(String clientOS) {
            this.putQueryParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * The type of the software client.
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * The version of the client. When you use an Alibaba Cloud Workspace client, you can view the client version in the **About** dialog box on the client logon page.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * The logon authentication stage. Valid values:
         * <p>
         * 
         * *   `ADPassword`: the stage to verify the identity of the Active Directory (AD) user. You must specify the value when the system verifies the identity of a convenience account or an AD account.
         * *   `MFABind`: the stage to bind a virtual multi-factor authentication (MFA) device.
         * *   `MFAVerify`: the stage to obtain the verification code that is generated by the virtual MFA device.
         * *   `TokenVerify`: the stage to perform two-factor authentication for the client.
         * *   `ChangePassword`: the stage to change the password of the user.
         * *   `VerifyKeepAlive`: the stage to exchange the logon credential. This parameter is valid if KeepAliveToken is valid.
         */
        public Builder currentStage(String currentStage) {
            this.putQueryParameter("CurrentStage", currentStage);
            this.currentStage = currentStage;
            return this;
        }

        /**
         * The ID of the workspace. The parameter is the same as the `OfficeSiteId` parameter. We recommend that you use `OfficeSiteId` instead of `DirectoryId`. You can specify a value for either the `DirectoryId` parameter or the `OfficeSiteId` parameter, but not both.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The name of the convenience user or the AD user. This parameter is required if you set `CurrentStage` to `ADPassword`.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * Specifies whether to keep the user logged on to the client. 
         * <p>
         * Valid values:
         * * null: Default value. Do not keep the user logged on to the client.
         * * true: Keep the user logged on to the client.
         * * false:  Do not keep the user logged on to the client.
         */
        public Builder keepAlive(Boolean keepAlive) {
            this.putQueryParameter("KeepAlive", keepAlive);
            this.keepAlive = keepAlive;
            return this;
        }

        /**
         * The token that is used to keep the user logged on to the client. After the user logs on to the client and KeepAlive is set to true, the `KeepAliveToken` is returned. You can call the `GetLoginToken` operation within the valid duration``, and set `CurrentStage` to `VerifyKeepAlive` to obtain the logon token (LoginToken). This parameter is required if you set `CurrentStage` to `VerifyKeepAlive```.
         */
        public Builder keepAliveToken(String keepAliveToken) {
            this.putQueryParameter("KeepAliveToken", keepAliveToken);
            this.keepAliveToken = keepAliveToken;
            return this;
        }

        /**
         * The new password. This parameter is required if you set `CurrentStage` to `ChangePassword`.
         */
        public Builder newPassword(String newPassword) {
            this.putQueryParameter("NewPassword", newPassword);
            this.newPassword = newPassword;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The current password. This parameter is required if you set `CurrentStage` to `ChangePassword`.
         */
        public Builder oldPassword(String oldPassword) {
            this.putQueryParameter("OldPassword", oldPassword);
            this.oldPassword = oldPassword;
            return this;
        }

        /**
         * The password of the convenience user or the AD user. This parameter is required if you set `CurrentStage` to `ADPassword`.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~436773~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the session.
         * <p>
         * 
         * *   If the virtual multi-factor authentication (MFA) device is not bound or two-factor authentication is not enabled for the client, you do not need to specify a value for `SessionId`.
         * *   If the virtual MFA device is not bound or two-factor authentication is enabled for the client, you must specify a value for `SessionId` to verify the user identity after you specify a value for `ADPassword`. The value of the `SessionId` parameter is returned only if the CurrentStage parameter is set to `ADPassword` when you call the `GetLoginToken` operation.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * If two-factor authentication is enabled in the Elastic Desktop Service (EDS) console and the system detects that the identity of the logon user may have security risks, the system sends a verification code for two-factor authentication to the email address of the user. This parameter is required if you set `CurrentStage` to `TokenVerify`.
         */
        public Builder tokenCode(String tokenCode) {
            this.putQueryParameter("TokenCode", tokenCode);
            this.tokenCode = tokenCode;
            return this;
        }

        /**
         * The unique identifier of the client. When you use an Alibaba Cloud Workspace client, you can view the client version in the **About** dialog box on the client logon page.
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
