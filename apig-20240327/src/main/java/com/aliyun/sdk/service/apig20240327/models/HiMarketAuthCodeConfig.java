// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketAuthCodeConfig} extends {@link TeaModel}
 *
 * <p>HiMarketAuthCodeConfig</p>
 */
public class HiMarketAuthCodeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authorizationEndpoint")
    private String authorizationEndpoint;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private String clientId;

    @com.aliyun.core.annotation.NameInMap("clientSecret")
    private String clientSecret;

    @com.aliyun.core.annotation.NameInMap("issuer")
    private String issuer;

    @com.aliyun.core.annotation.NameInMap("jwkSetUri")
    private String jwkSetUri;

    @com.aliyun.core.annotation.NameInMap("redirectUri")
    private String redirectUri;

    @com.aliyun.core.annotation.NameInMap("scopes")
    private String scopes;

    @com.aliyun.core.annotation.NameInMap("tokenEndpoint")
    private String tokenEndpoint;

    @com.aliyun.core.annotation.NameInMap("userInfoEndpoint")
    private String userInfoEndpoint;

    private HiMarketAuthCodeConfig(Builder builder) {
        this.authorizationEndpoint = builder.authorizationEndpoint;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.issuer = builder.issuer;
        this.jwkSetUri = builder.jwkSetUri;
        this.redirectUri = builder.redirectUri;
        this.scopes = builder.scopes;
        this.tokenEndpoint = builder.tokenEndpoint;
        this.userInfoEndpoint = builder.userInfoEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketAuthCodeConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationEndpoint
     */
    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
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
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return jwkSetUri
     */
    public String getJwkSetUri() {
        return this.jwkSetUri;
    }

    /**
     * @return redirectUri
     */
    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * @return scopes
     */
    public String getScopes() {
        return this.scopes;
    }

    /**
     * @return tokenEndpoint
     */
    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * @return userInfoEndpoint
     */
    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public static final class Builder {
        private String authorizationEndpoint; 
        private String clientId; 
        private String clientSecret; 
        private String issuer; 
        private String jwkSetUri; 
        private String redirectUri; 
        private String scopes; 
        private String tokenEndpoint; 
        private String userInfoEndpoint; 

        private Builder() {
        } 

        private Builder(HiMarketAuthCodeConfig model) {
            this.authorizationEndpoint = model.authorizationEndpoint;
            this.clientId = model.clientId;
            this.clientSecret = model.clientSecret;
            this.issuer = model.issuer;
            this.jwkSetUri = model.jwkSetUri;
            this.redirectUri = model.redirectUri;
            this.scopes = model.scopes;
            this.tokenEndpoint = model.tokenEndpoint;
            this.userInfoEndpoint = model.userInfoEndpoint;
        } 

        /**
         * <p>The OAuth2 authorization endpoint URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/oauth2/authorize">https://idp.example.com/oauth2/authorize</a></p>
         */
        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        /**
         * <p>The OAuth2 client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>my-client-id</p>
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The OAuth2 client secret. The secret is AES-encrypted when stored.</p>
         * 
         * <strong>example:</strong>
         * <p>my-client-secret</p>
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * <p>The OIDC issuer URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com">https://idp.example.com</a></p>
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * <p>The JWKS public key set URI, used for token signature verification.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/.well-known/jwks.json">https://idp.example.com/.well-known/jwks.json</a></p>
         */
        public Builder jwkSetUri(String jwkSetUri) {
            this.jwkSetUri = jwkSetUri;
            return this;
        }

        /**
         * <p>The OAuth2 callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gateway.example.com/callback">https://gateway.example.com/callback</a></p>
         */
        public Builder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * <p>The OAuth2 authorization scopes, separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>openid profile email</p>
         */
        public Builder scopes(String scopes) {
            this.scopes = scopes;
            return this;
        }

        /**
         * <p>The OAuth2 token endpoint URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/oauth2/token">https://idp.example.com/oauth2/token</a></p>
         */
        public Builder tokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }

        /**
         * <p>The OIDC UserInfo endpoint URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/userinfo">https://idp.example.com/userinfo</a></p>
         */
        public Builder userInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = userInfoEndpoint;
            return this;
        }

        public HiMarketAuthCodeConfig build() {
            return new HiMarketAuthCodeConfig(this);
        } 

    } 

}
