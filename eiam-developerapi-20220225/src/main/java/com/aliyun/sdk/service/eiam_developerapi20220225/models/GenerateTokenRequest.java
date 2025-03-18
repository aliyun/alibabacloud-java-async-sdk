// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link GenerateTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateTokenRequest</p>
 */
public class GenerateTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("applicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("client_id")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("client_secret")
    private String clientSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("code_verifier")
    private String codeVerifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("device_code")
    private String deviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("exclusive_tag")
    private String exclusiveTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("grant_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grantType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("redirect_uri")
    private String redirectUri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("refresh_token")
    private String refreshToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("username")
    private String username;

    private GenerateTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.code = builder.code;
        this.codeVerifier = builder.codeVerifier;
        this.deviceCode = builder.deviceCode;
        this.exclusiveTag = builder.exclusiveTag;
        this.grantType = builder.grantType;
        this.password = builder.password;
        this.redirectUri = builder.redirectUri;
        this.refreshToken = builder.refreshToken;
        this.scope = builder.scope;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientSecret
     */
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return codeVerifier
     */
    public String getCodeVerifier() {
        return this.codeVerifier;
    }

    /**
     * @return deviceCode
     */
    public String getDeviceCode() {
        return this.deviceCode;
    }

    /**
     * @return exclusiveTag
     */
    public String getExclusiveTag() {
        return this.exclusiveTag;
    }

    /**
     * @return grantType
     */
    public String getGrantType() {
        return this.grantType;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return redirectUri
     */
    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * @return refreshToken
     */
    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<GenerateTokenRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String applicationId; 
        private String clientId; 
        private String clientSecret; 
        private String code; 
        private String codeVerifier; 
        private String deviceCode; 
        private String exclusiveTag; 
        private String grantType; 
        private String password; 
        private String redirectUri; 
        private String refreshToken; 
        private String scope; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(GenerateTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.code = request.code;
            this.codeVerifier = request.codeVerifier;
            this.deviceCode = request.deviceCode;
            this.exclusiveTag = request.exclusiveTag;
            this.grantType = request.grantType;
            this.password = request.password;
            this.redirectUri = request.redirectUri;
            this.refreshToken = request.refreshToken;
            this.scope = request.scope;
            this.username = request.username;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("client_id", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The client secret. This parameter is required if grant_type is set to client_credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>CSEHDcHcrUKHw1CuxkJEHPveWRXBGqVqRsxxxx</p>
         */
        public Builder clientSecret(String clientSecret) {
            this.putQueryParameter("client_secret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * <p>The authorization code. This parameter is required if grant_type is set to authorization_code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>The verification code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder codeVerifier(String codeVerifier) {
            this.putQueryParameter("code_verifier", codeVerifier);
            this.codeVerifier = codeVerifier;
            return this;
        }

        /**
         * <p>The device code. This parameter is required if grant_type is set to authorization_code.urn:ietf:params:oauth:grant-type:device_code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder deviceCode(String deviceCode) {
            this.putQueryParameter("device_code", deviceCode);
            this.deviceCode = deviceCode;
            return this;
        }

        /**
         * <p>The excluded tags.</p>
         * 
         * <strong>example:</strong>
         * <p>ATxxx</p>
         */
        public Builder exclusiveTag(String exclusiveTag) {
            this.putQueryParameter("exclusive_tag", exclusiveTag);
            this.exclusiveTag = exclusiveTag;
            return this;
        }

        /**
         * <p>The authorization type. Valid values:</p>
         * <ul>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * </ul>
         * <!---->
         * 
         * <ul>
         * <li>authorization_code</li>
         * <li>urn:ietf:params:oauth:grant-type:device_code</li>
         * <li>refresh_token</li>
         * <li>client_credentials: You must specify the client_id and client_secret parameters.</li>
         * <li>password: This option is not supported.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client_credentials</p>
         */
        public Builder grantType(String grantType) {
            this.putQueryParameter("grant_type", grantType);
            this.grantType = grantType;
            return this;
        }

        /**
         * <p>The username. This parameter is required if grant_type is set to password. The password authentication type is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The redirect URI. This parameter is required if grant_type is set to authorization_code. The value of this parameter must be the same as the redirect URI in the request to obtain the authorization code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder redirectUri(String redirectUri) {
            this.putQueryParameter("redirect_uri", redirectUri);
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * <p>The refreshed token. This parameter is required if grant_type is set to refresh_token.</p>
         * 
         * <strong>example:</strong>
         * <p>ATxxx</p>
         */
        public Builder refreshToken(String refreshToken) {
            this.putQueryParameter("refresh_token", refreshToken);
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * <p>The authorization scope. Valid values:</p>
         * <ul>
         * <li>openid</li>
         * <li>email</li>
         * <li>phone</li>
         * <li>profile</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The username. This parameter is required if grant_type is set to password. The password authentication type is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>uesrname_001</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public GenerateTokenRequest build() {
            return new GenerateTokenRequest(this);
        } 

    } 

}
