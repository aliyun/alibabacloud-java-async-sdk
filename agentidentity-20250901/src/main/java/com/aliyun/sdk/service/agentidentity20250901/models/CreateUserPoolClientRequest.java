// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link CreateUserPoolClientRequest} extends {@link RequestModel}
 *
 * <p>CreateUserPoolClientRequest</p>
 */
public class CreateUserPoolClientRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessTokenValidity")
    private String accessTokenValidity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientName")
    private String clientName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnforcePKCE")
    private Boolean enforcePKCE;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RedirectURIs")
    private java.util.List<String> redirectURIs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefreshTokenValidity")
    private String refreshTokenValidity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scopes")
    private java.util.List<String> scopes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecretRequired")
    private Boolean secretRequired;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private CreateUserPoolClientRequest(Builder builder) {
        super(builder);
        this.accessTokenValidity = builder.accessTokenValidity;
        this.clientName = builder.clientName;
        this.enforcePKCE = builder.enforcePKCE;
        this.redirectURIs = builder.redirectURIs;
        this.refreshTokenValidity = builder.refreshTokenValidity;
        this.scopes = builder.scopes;
        this.secretRequired = builder.secretRequired;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserPoolClientRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessTokenValidity
     */
    public String getAccessTokenValidity() {
        return this.accessTokenValidity;
    }

    /**
     * @return clientName
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * @return enforcePKCE
     */
    public Boolean getEnforcePKCE() {
        return this.enforcePKCE;
    }

    /**
     * @return redirectURIs
     */
    public java.util.List<String> getRedirectURIs() {
        return this.redirectURIs;
    }

    /**
     * @return refreshTokenValidity
     */
    public String getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    /**
     * @return scopes
     */
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    /**
     * @return secretRequired
     */
    public Boolean getSecretRequired() {
        return this.secretRequired;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<CreateUserPoolClientRequest, Builder> {
        private String accessTokenValidity; 
        private String clientName; 
        private Boolean enforcePKCE; 
        private java.util.List<String> redirectURIs; 
        private String refreshTokenValidity; 
        private java.util.List<String> scopes; 
        private Boolean secretRequired; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserPoolClientRequest request) {
            super(request);
            this.accessTokenValidity = request.accessTokenValidity;
            this.clientName = request.clientName;
            this.enforcePKCE = request.enforcePKCE;
            this.redirectURIs = request.redirectURIs;
            this.refreshTokenValidity = request.refreshTokenValidity;
            this.scopes = request.scopes;
            this.secretRequired = request.secretRequired;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * <p>The validity period of the access token, in seconds. Valid values: 900 to 10800. Default value: 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder accessTokenValidity(String accessTokenValidity) {
            this.putBodyParameter("AccessTokenValidity", accessTokenValidity);
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }

        /**
         * <p>The name of the client. The name must be unique within the same user pool and must be 1 to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>my-web-app</p>
         */
        public Builder clientName(String clientName) {
            this.putBodyParameter("ClientName", clientName);
            this.clientName = clientName;
            return this;
        }

        /**
         * <p>Specifies whether to enforce Proof Key for Code Exchange (PKCE). Valid values:</p>
         * <ul>
         * <li>true: Enforced. The code_challenge parameter is required in the authorization code flow.</li>
         * <li>false: Not enforced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enforcePKCE(Boolean enforcePKCE) {
            this.putBodyParameter("EnforcePKCE", enforcePKCE);
            this.enforcePKCE = enforcePKCE;
            return this;
        }

        /**
         * <p>The list of OAuth redirect URIs. After authorization is complete, the user\&quot;s browser is redirected to one of the URIs in the list.</p>
         */
        public Builder redirectURIs(java.util.List<String> redirectURIs) {
            String redirectURIsShrink = shrink(redirectURIs, "RedirectURIs", "json");
            this.putBodyParameter("RedirectURIs", redirectURIsShrink);
            this.redirectURIs = redirectURIs;
            return this;
        }

        /**
         * <p>The validity period of the refresh token, in seconds. Valid values: 7200 to 31536000 (90 days). Default value: 2592000 (30 days).</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder refreshTokenValidity(String refreshTokenValidity) {
            this.putBodyParameter("RefreshTokenValidity", refreshTokenValidity);
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }

        /**
         * <p>The scopes granted to the application. You can specify multiple scopes.</p>
         */
        public Builder scopes(java.util.List<String> scopes) {
            String scopesShrink = shrink(scopes, "Scopes", "json");
            this.putBodyParameter("Scopes", scopesShrink);
            this.scopes = scopes;
            return this;
        }

        /**
         * <p>Specifies whether an application secret is required. Valid values:</p>
         * <ul>
         * <li>true: Required. This value applies to confidential clients such as server-side applications. You must call CreateClientSecret to create a secret.</li>
         * <li>false: Not required. This value applies to public clients such as single-page applications (SPAs) and mobile applications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder secretRequired(Boolean secretRequired) {
            this.putBodyParameter("SecretRequired", secretRequired);
            this.secretRequired = secretRequired;
            return this;
        }

        /**
         * <p>The name of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public CreateUserPoolClientRequest build() {
            return new CreateUserPoolClientRequest(this);
        } 

    } 

}
