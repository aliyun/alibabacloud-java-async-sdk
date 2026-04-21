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
         * authCodeConfig.
         */
        public Builder authCodeConfig(AuthCodeConfig authCodeConfig) {
            this.authCodeConfig = authCodeConfig;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * grantType.
         */
        public Builder grantType(String grantType) {
            this.grantType = grantType;
            return this;
        }

        /**
         * identityMapping.
         */
        public Builder identityMapping(IdentityMapping identityMapping) {
            this.identityMapping = identityMapping;
            return this;
        }

        /**
         * logoUrl.
         */
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * provider.
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
             * customFields.
             */
            public Builder customFields(java.util.Map<String, String> customFields) {
                this.customFields = customFields;
                return this;
            }

            /**
             * emailField.
             */
            public Builder emailField(String emailField) {
                this.emailField = emailField;
                return this;
            }

            /**
             * userIdField.
             */
            public Builder userIdField(String userIdField) {
                this.userIdField = userIdField;
                return this;
            }

            /**
             * userNameField.
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
