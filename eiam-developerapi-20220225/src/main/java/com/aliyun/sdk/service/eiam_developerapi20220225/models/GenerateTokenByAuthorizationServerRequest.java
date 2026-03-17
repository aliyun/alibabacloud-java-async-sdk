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
 * {@link GenerateTokenByAuthorizationServerRequest} extends {@link RequestModel}
 *
 * <p>GenerateTokenByAuthorizationServerRequest</p>
 */
public class GenerateTokenByAuthorizationServerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("authorizationServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizationServerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("application_federated_credential_name")
    private String applicationFederatedCredentialName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("client_assertion")
    private String clientAssertion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("client_assertion_type")
    private String clientAssertionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("client_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("client_secret")
    private String clientSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("client_x509")
    private String clientX509;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("client_x509_chain")
    private String clientX509Chain;

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

    private GenerateTokenByAuthorizationServerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.authorizationServerId = builder.authorizationServerId;
        this.applicationFederatedCredentialName = builder.applicationFederatedCredentialName;
        this.clientAssertion = builder.clientAssertion;
        this.clientAssertionType = builder.clientAssertionType;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.clientX509 = builder.clientX509;
        this.clientX509Chain = builder.clientX509Chain;
        this.code = builder.code;
        this.codeVerifier = builder.codeVerifier;
        this.deviceCode = builder.deviceCode;
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

    public static GenerateTokenByAuthorizationServerRequest create() {
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
     * @return authorizationServerId
     */
    public String getAuthorizationServerId() {
        return this.authorizationServerId;
    }

    /**
     * @return applicationFederatedCredentialName
     */
    public String getApplicationFederatedCredentialName() {
        return this.applicationFederatedCredentialName;
    }

    /**
     * @return clientAssertion
     */
    public String getClientAssertion() {
        return this.clientAssertion;
    }

    /**
     * @return clientAssertionType
     */
    public String getClientAssertionType() {
        return this.clientAssertionType;
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
     * @return clientX509
     */
    public String getClientX509() {
        return this.clientX509;
    }

    /**
     * @return clientX509Chain
     */
    public String getClientX509Chain() {
        return this.clientX509Chain;
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

    public static final class Builder extends Request.Builder<GenerateTokenByAuthorizationServerRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String authorizationServerId; 
        private String applicationFederatedCredentialName; 
        private String clientAssertion; 
        private String clientAssertionType; 
        private String clientId; 
        private String clientSecret; 
        private String clientX509; 
        private String clientX509Chain; 
        private String code; 
        private String codeVerifier; 
        private String deviceCode; 
        private String grantType; 
        private String password; 
        private String redirectUri; 
        private String refreshToken; 
        private String scope; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(GenerateTokenByAuthorizationServerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.authorizationServerId = request.authorizationServerId;
            this.applicationFederatedCredentialName = request.applicationFederatedCredentialName;
            this.clientAssertion = request.clientAssertion;
            this.clientAssertionType = request.clientAssertionType;
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.clientX509 = request.clientX509;
            this.clientX509Chain = request.clientX509Chain;
            this.code = request.code;
            this.codeVerifier = request.codeVerifier;
            this.deviceCode = request.deviceCode;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iauths_system</p>
         */
        public Builder authorizationServerId(String authorizationServerId) {
            this.putPathParameter("authorizationServerId", authorizationServerId);
            this.authorizationServerId = authorizationServerId;
            return this;
        }

        /**
         * application_federated_credential_name.
         */
        public Builder applicationFederatedCredentialName(String applicationFederatedCredentialName) {
            this.putQueryParameter("application_federated_credential_name", applicationFederatedCredentialName);
            this.applicationFederatedCredentialName = applicationFederatedCredentialName;
            return this;
        }

        /**
         * client_assertion.
         */
        public Builder clientAssertion(String clientAssertion) {
            this.putQueryParameter("client_assertion", clientAssertion);
            this.clientAssertion = clientAssertion;
            return this;
        }

        /**
         * client_assertion_type.
         */
        public Builder clientAssertionType(String clientAssertionType) {
            this.putQueryParameter("client_assertion_type", clientAssertionType);
            this.clientAssertionType = clientAssertionType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * client_secret.
         */
        public Builder clientSecret(String clientSecret) {
            this.putQueryParameter("client_secret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * client_x509.
         */
        public Builder clientX509(String clientX509) {
            this.putQueryParameter("client_x509", clientX509);
            this.clientX509 = clientX509;
            return this;
        }

        /**
         * client_x509_chain.
         */
        public Builder clientX509Chain(String clientX509Chain) {
            this.putQueryParameter("client_x509_chain", clientX509Chain);
            this.clientX509Chain = clientX509Chain;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.putQueryParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * code_verifier.
         */
        public Builder codeVerifier(String codeVerifier) {
            this.putQueryParameter("code_verifier", codeVerifier);
            this.codeVerifier = codeVerifier;
            return this;
        }

        /**
         * device_code.
         */
        public Builder deviceCode(String deviceCode) {
            this.putQueryParameter("device_code", deviceCode);
            this.deviceCode = deviceCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>authorization_code</p>
         */
        public Builder grantType(String grantType) {
            this.putQueryParameter("grant_type", grantType);
            this.grantType = grantType;
            return this;
        }

        /**
         * password.
         */
        public Builder password(String password) {
            this.putQueryParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * redirect_uri.
         */
        public Builder redirectUri(String redirectUri) {
            this.putQueryParameter("redirect_uri", redirectUri);
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * refresh_token.
         */
        public Builder refreshToken(String refreshToken) {
            this.putQueryParameter("refresh_token", refreshToken);
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * username.
         */
        public Builder username(String username) {
            this.putQueryParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public GenerateTokenByAuthorizationServerRequest build() {
            return new GenerateTokenByAuthorizationServerRequest(this);
        } 

    } 

}
