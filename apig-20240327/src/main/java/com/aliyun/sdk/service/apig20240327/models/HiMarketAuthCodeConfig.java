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
         * authorizationEndpoint.
         */
        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * clientSecret.
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * issuer.
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * jwkSetUri.
         */
        public Builder jwkSetUri(String jwkSetUri) {
            this.jwkSetUri = jwkSetUri;
            return this;
        }

        /**
         * redirectUri.
         */
        public Builder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * scopes.
         */
        public Builder scopes(String scopes) {
            this.scopes = scopes;
            return this;
        }

        /**
         * tokenEndpoint.
         */
        public Builder tokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }

        /**
         * userInfoEndpoint.
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
