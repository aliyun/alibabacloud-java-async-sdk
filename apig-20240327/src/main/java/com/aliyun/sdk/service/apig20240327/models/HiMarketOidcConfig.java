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
 * {@link HiMarketOidcConfig} extends {@link TeaModel}
 *
 * <p>HiMarketOidcConfig</p>
 */
public class HiMarketOidcConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authCodeConfig")
    private AuthCodeConfig authCodeConfig;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("grantType")
    private String grantType;

    @com.aliyun.core.annotation.NameInMap("identityMapping")
    private IdentityMapping identityMapping;

    @com.aliyun.core.annotation.NameInMap("logoUrl")
    private String logoUrl;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    private HiMarketOidcConfig(Builder builder) {
        this.authCodeConfig = builder.authCodeConfig;
        this.enabled = builder.enabled;
        this.grantType = builder.grantType;
        this.identityMapping = builder.identityMapping;
        this.logoUrl = builder.logoUrl;
        this.name = builder.name;
        this.provider = builder.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketOidcConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authCodeConfig
     */
    public AuthCodeConfig getAuthCodeConfig() {
        return this.authCodeConfig;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return grantType
     */
    public String getGrantType() {
        return this.grantType;
    }

    /**
     * @return identityMapping
     */
    public IdentityMapping getIdentityMapping() {
        return this.identityMapping;
    }

    /**
     * @return logoUrl
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    public static final class Builder {
        private AuthCodeConfig authCodeConfig; 
        private Boolean enabled; 
        private String grantType; 
        private IdentityMapping identityMapping; 
        private String logoUrl; 
        private String name; 
        private String provider; 

        private Builder() {
        } 

        private Builder(HiMarketOidcConfig model) {
            this.authCodeConfig = model.authCodeConfig;
            this.enabled = model.enabled;
            this.grantType = model.grantType;
            this.identityMapping = model.identityMapping;
            this.logoUrl = model.logoUrl;
            this.name = model.name;
            this.provider = model.provider;
        } 

        /**
         * <p>The OAuth2 Authorization Code configuration.</p>
         */
        public Builder authCodeConfig(AuthCodeConfig authCodeConfig) {
            this.authCodeConfig = authCodeConfig;
            return this;
        }

        /**
         * <p>Indicates whether the OIDC configuration is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The authorization type.</p>
         * 
         * <strong>example:</strong>
         * <p>authorization_code</p>
         */
        public Builder grantType(String grantType) {
            this.grantType = grantType;
            return this;
        }

        /**
         * <p>The identity field mapping configuration.</p>
         */
        public Builder identityMapping(IdentityMapping identityMapping) {
            this.identityMapping = identityMapping;
            return this;
        }

        /**
         * <p>The provider logo URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/logo.png">https://example.com/logo.png</a></p>
         */
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * <p>The OIDC configuration name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-oidc-config</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The OIDC provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云IDaaS</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        public HiMarketOidcConfig build() {
            return new HiMarketOidcConfig(this);
        } 

    } 

    /**
     * 
     * {@link HiMarketOidcConfig} extends {@link TeaModel}
     *
     * <p>HiMarketOidcConfig</p>
     */
    public static class AuthCodeConfig extends TeaModel {
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

        private AuthCodeConfig(Builder builder) {
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

        public static AuthCodeConfig create() {
            return builder().build();
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

            private Builder(AuthCodeConfig model) {
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
             * <p>The authorization endpoint URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idaas.example.com/oauth2/authorize">https://idaas.example.com/oauth2/authorize</a></p>
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
             * <p>The OAuth2 client secret.</p>
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
             * <p><a href="https://idaas.example.com">https://idaas.example.com</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The JWKS public key set URI.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idaas.example.com/.well-known/jwks.json">https://idaas.example.com/.well-known/jwks.json</a></p>
             */
            public Builder jwkSetUri(String jwkSetUri) {
                this.jwkSetUri = jwkSetUri;
                return this;
            }

            /**
             * <p>The OAuth2 redirect URI.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://gateway.example.com/callback">https://gateway.example.com/callback</a></p>
             */
            public Builder redirectUri(String redirectUri) {
                this.redirectUri = redirectUri;
                return this;
            }

            /**
             * <p>The OAuth2 authorization scopes.</p>
             * 
             * <strong>example:</strong>
             * <p>openid profile email</p>
             */
            public Builder scopes(String scopes) {
                this.scopes = scopes;
                return this;
            }

            /**
             * <p>The token endpoint URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idaas.example.com/oauth2/token">https://idaas.example.com/oauth2/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * <p>The UserInfo endpoint URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idaas.example.com/userinfo">https://idaas.example.com/userinfo</a></p>
             */
            public Builder userInfoEndpoint(String userInfoEndpoint) {
                this.userInfoEndpoint = userInfoEndpoint;
                return this;
            }

            public AuthCodeConfig build() {
                return new AuthCodeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link HiMarketOidcConfig} extends {@link TeaModel}
     *
     * <p>HiMarketOidcConfig</p>
     */
    public static class IdentityMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customFields")
        private java.util.Map<String, String> customFields;

        @com.aliyun.core.annotation.NameInMap("emailField")
        private String emailField;

        @com.aliyun.core.annotation.NameInMap("userIdField")
        private String userIdField;

        @com.aliyun.core.annotation.NameInMap("userNameField")
        private String userNameField;

        private IdentityMapping(Builder builder) {
            this.customFields = builder.customFields;
            this.emailField = builder.emailField;
            this.userIdField = builder.userIdField;
            this.userNameField = builder.userNameField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityMapping create() {
            return builder().build();
        }

        /**
         * @return customFields
         */
        public java.util.Map<String, String> getCustomFields() {
            return this.customFields;
        }

        /**
         * @return emailField
         */
        public String getEmailField() {
            return this.emailField;
        }

        /**
         * @return userIdField
         */
        public String getUserIdField() {
            return this.userIdField;
        }

        /**
         * @return userNameField
         */
        public String getUserNameField() {
            return this.userNameField;
        }

        public static final class Builder {
            private java.util.Map<String, String> customFields; 
            private String emailField; 
            private String userIdField; 
            private String userNameField; 

            private Builder() {
            } 

            private Builder(IdentityMapping model) {
                this.customFields = model.customFields;
                this.emailField = model.emailField;
                this.userIdField = model.userIdField;
                this.userNameField = model.userNameField;
            } 

            /**
             * <p>The custom field mappings.</p>
             */
            public Builder customFields(java.util.Map<String, String> customFields) {
                this.customFields = customFields;
                return this;
            }

            /**
             * <p>The identity field name that corresponds to the email address.</p>
             * 
             * <strong>example:</strong>
             * <p>email</p>
             */
            public Builder emailField(String emailField) {
                this.emailField = emailField;
                return this;
            }

            /**
             * <p>The identity field name that corresponds to the user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sub</p>
             */
            public Builder userIdField(String userIdField) {
                this.userIdField = userIdField;
                return this;
            }

            /**
             * <p>The identity field name that corresponds to the username.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder userNameField(String userNameField) {
                this.userNameField = userNameField;
                return this;
            }

            public IdentityMapping build() {
                return new IdentityMapping(this);
            } 

        } 

    }
}
