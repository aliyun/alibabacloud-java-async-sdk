// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link ThirdApp} extends {@link TeaModel}
 *
 * <p>ThirdApp</p>
 */
public class ThirdApp extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OidcSsoConfig")
    private OidcSsoConfig oidcSsoConfig;

    @com.aliyun.core.annotation.NameInMap("Secrets")
    private java.util.List<Secrets> secrets;

    private ThirdApp(Builder builder) {
        this.appKey = builder.appKey;
        this.name = builder.name;
        this.oidcSsoConfig = builder.oidcSsoConfig;
        this.secrets = builder.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ThirdApp create() {
        return builder().build();
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return oidcSsoConfig
     */
    public OidcSsoConfig getOidcSsoConfig() {
        return this.oidcSsoConfig;
    }

    /**
     * @return secrets
     */
    public java.util.List<Secrets> getSecrets() {
        return this.secrets;
    }

    public static final class Builder {
        private String appKey; 
        private String name; 
        private OidcSsoConfig oidcSsoConfig; 
        private java.util.List<Secrets> secrets; 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OidcSsoConfig.
         */
        public Builder oidcSsoConfig(OidcSsoConfig oidcSsoConfig) {
            this.oidcSsoConfig = oidcSsoConfig;
            return this;
        }

        /**
         * Secrets.
         */
        public Builder secrets(java.util.List<Secrets> secrets) {
            this.secrets = secrets;
            return this;
        }

        public ThirdApp build() {
            return new ThirdApp(this);
        } 

    } 

    /**
     * 
     * {@link ThirdApp} extends {@link TeaModel}
     *
     * <p>ThirdApp</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationEndpoint")
        private String authorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("DiscoveryEndpoint")
        private String discoveryEndpoint;

        @com.aliyun.core.annotation.NameInMap("GuestAuthorizationEndpoint")
        private String guestAuthorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("JwksEndpoint")
        private String jwksEndpoint;

        @com.aliyun.core.annotation.NameInMap("LogoutEndpoint")
        private String logoutEndpoint;

        @com.aliyun.core.annotation.NameInMap("RevokeEndpoint")
        private String revokeEndpoint;

        @com.aliyun.core.annotation.NameInMap("TokenEndpoint")
        private String tokenEndpoint;

        @com.aliyun.core.annotation.NameInMap("UserinfoEndpoint")
        private String userinfoEndpoint;

        private Endpoints(Builder builder) {
            this.authorizationEndpoint = builder.authorizationEndpoint;
            this.discoveryEndpoint = builder.discoveryEndpoint;
            this.guestAuthorizationEndpoint = builder.guestAuthorizationEndpoint;
            this.issuer = builder.issuer;
            this.jwksEndpoint = builder.jwksEndpoint;
            this.logoutEndpoint = builder.logoutEndpoint;
            this.revokeEndpoint = builder.revokeEndpoint;
            this.tokenEndpoint = builder.tokenEndpoint;
            this.userinfoEndpoint = builder.userinfoEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return authorizationEndpoint
         */
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        /**
         * @return discoveryEndpoint
         */
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
        }

        /**
         * @return guestAuthorizationEndpoint
         */
        public String getGuestAuthorizationEndpoint() {
            return this.guestAuthorizationEndpoint;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return jwksEndpoint
         */
        public String getJwksEndpoint() {
            return this.jwksEndpoint;
        }

        /**
         * @return logoutEndpoint
         */
        public String getLogoutEndpoint() {
            return this.logoutEndpoint;
        }

        /**
         * @return revokeEndpoint
         */
        public String getRevokeEndpoint() {
            return this.revokeEndpoint;
        }

        /**
         * @return tokenEndpoint
         */
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        /**
         * @return userinfoEndpoint
         */
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

        public static final class Builder {
            private String authorizationEndpoint; 
            private String discoveryEndpoint; 
            private String guestAuthorizationEndpoint; 
            private String issuer; 
            private String jwksEndpoint; 
            private String logoutEndpoint; 
            private String revokeEndpoint; 
            private String tokenEndpoint; 
            private String userinfoEndpoint; 

            /**
             * AuthorizationEndpoint.
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * DiscoveryEndpoint.
             */
            public Builder discoveryEndpoint(String discoveryEndpoint) {
                this.discoveryEndpoint = discoveryEndpoint;
                return this;
            }

            /**
             * GuestAuthorizationEndpoint.
             */
            public Builder guestAuthorizationEndpoint(String guestAuthorizationEndpoint) {
                this.guestAuthorizationEndpoint = guestAuthorizationEndpoint;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * JwksEndpoint.
             */
            public Builder jwksEndpoint(String jwksEndpoint) {
                this.jwksEndpoint = jwksEndpoint;
                return this;
            }

            /**
             * LogoutEndpoint.
             */
            public Builder logoutEndpoint(String logoutEndpoint) {
                this.logoutEndpoint = logoutEndpoint;
                return this;
            }

            /**
             * RevokeEndpoint.
             */
            public Builder revokeEndpoint(String revokeEndpoint) {
                this.revokeEndpoint = revokeEndpoint;
                return this;
            }

            /**
             * TokenEndpoint.
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * UserinfoEndpoint.
             */
            public Builder userinfoEndpoint(String userinfoEndpoint) {
                this.userinfoEndpoint = userinfoEndpoint;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link ThirdApp} extends {@link TeaModel}
     *
     * <p>ThirdApp</p>
     */
    public static class OidcSsoConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTokenEffectiveTime")
        private Integer accessTokenEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("CodeEffectiveTime")
        private Integer codeEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("EnableAuthLogin")
        private Boolean enableAuthLogin;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private Endpoints endpoints;

        @com.aliyun.core.annotation.NameInMap("GrantScopes")
        private java.util.List<String> grantScopes;

        @com.aliyun.core.annotation.NameInMap("GrantTypes")
        private java.util.List<String> grantTypes;

        @com.aliyun.core.annotation.NameInMap("IdTokenAlgorithmType")
        private String idTokenAlgorithmType;

        @com.aliyun.core.annotation.NameInMap("IdTokenEffectiveTime")
        private Integer idTokenEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("RedirectUris")
        private java.util.List<String> redirectUris;

        @com.aliyun.core.annotation.NameInMap("RefreshTokenEffective")
        private Integer refreshTokenEffective;

        private OidcSsoConfig(Builder builder) {
            this.accessTokenEffectiveTime = builder.accessTokenEffectiveTime;
            this.codeEffectiveTime = builder.codeEffectiveTime;
            this.enableAuthLogin = builder.enableAuthLogin;
            this.endpoints = builder.endpoints;
            this.grantScopes = builder.grantScopes;
            this.grantTypes = builder.grantTypes;
            this.idTokenAlgorithmType = builder.idTokenAlgorithmType;
            this.idTokenEffectiveTime = builder.idTokenEffectiveTime;
            this.redirectUris = builder.redirectUris;
            this.refreshTokenEffective = builder.refreshTokenEffective;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OidcSsoConfig create() {
            return builder().build();
        }

        /**
         * @return accessTokenEffectiveTime
         */
        public Integer getAccessTokenEffectiveTime() {
            return this.accessTokenEffectiveTime;
        }

        /**
         * @return codeEffectiveTime
         */
        public Integer getCodeEffectiveTime() {
            return this.codeEffectiveTime;
        }

        /**
         * @return enableAuthLogin
         */
        public Boolean getEnableAuthLogin() {
            return this.enableAuthLogin;
        }

        /**
         * @return endpoints
         */
        public Endpoints getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return grantScopes
         */
        public java.util.List<String> getGrantScopes() {
            return this.grantScopes;
        }

        /**
         * @return grantTypes
         */
        public java.util.List<String> getGrantTypes() {
            return this.grantTypes;
        }

        /**
         * @return idTokenAlgorithmType
         */
        public String getIdTokenAlgorithmType() {
            return this.idTokenAlgorithmType;
        }

        /**
         * @return idTokenEffectiveTime
         */
        public Integer getIdTokenEffectiveTime() {
            return this.idTokenEffectiveTime;
        }

        /**
         * @return redirectUris
         */
        public java.util.List<String> getRedirectUris() {
            return this.redirectUris;
        }

        /**
         * @return refreshTokenEffective
         */
        public Integer getRefreshTokenEffective() {
            return this.refreshTokenEffective;
        }

        public static final class Builder {
            private Integer accessTokenEffectiveTime; 
            private Integer codeEffectiveTime; 
            private Boolean enableAuthLogin; 
            private Endpoints endpoints; 
            private java.util.List<String> grantScopes; 
            private java.util.List<String> grantTypes; 
            private String idTokenAlgorithmType; 
            private Integer idTokenEffectiveTime; 
            private java.util.List<String> redirectUris; 
            private Integer refreshTokenEffective; 

            /**
             * AccessTokenEffectiveTime.
             */
            public Builder accessTokenEffectiveTime(Integer accessTokenEffectiveTime) {
                this.accessTokenEffectiveTime = accessTokenEffectiveTime;
                return this;
            }

            /**
             * CodeEffectiveTime.
             */
            public Builder codeEffectiveTime(Integer codeEffectiveTime) {
                this.codeEffectiveTime = codeEffectiveTime;
                return this;
            }

            /**
             * EnableAuthLogin.
             */
            public Builder enableAuthLogin(Boolean enableAuthLogin) {
                this.enableAuthLogin = enableAuthLogin;
                return this;
            }

            /**
             * Endpoints.
             */
            public Builder endpoints(Endpoints endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * GrantScopes.
             */
            public Builder grantScopes(java.util.List<String> grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            /**
             * GrantTypes.
             */
            public Builder grantTypes(java.util.List<String> grantTypes) {
                this.grantTypes = grantTypes;
                return this;
            }

            /**
             * IdTokenAlgorithmType.
             */
            public Builder idTokenAlgorithmType(String idTokenAlgorithmType) {
                this.idTokenAlgorithmType = idTokenAlgorithmType;
                return this;
            }

            /**
             * IdTokenEffectiveTime.
             */
            public Builder idTokenEffectiveTime(Integer idTokenEffectiveTime) {
                this.idTokenEffectiveTime = idTokenEffectiveTime;
                return this;
            }

            /**
             * RedirectUris.
             */
            public Builder redirectUris(java.util.List<String> redirectUris) {
                this.redirectUris = redirectUris;
                return this;
            }

            /**
             * RefreshTokenEffective.
             */
            public Builder refreshTokenEffective(Integer refreshTokenEffective) {
                this.refreshTokenEffective = refreshTokenEffective;
                return this;
            }

            public OidcSsoConfig build() {
                return new OidcSsoConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ThirdApp} extends {@link TeaModel}
     *
     * <p>ThirdApp</p>
     */
    public static class Secrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Secret")
        private String secret;

        private Secrets(Builder builder) {
            this.enable = builder.enable;
            this.secret = builder.secret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Secrets create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return secret
         */
        public String getSecret() {
            return this.secret;
        }

        public static final class Builder {
            private Boolean enable; 
            private String secret; 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Secret.
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            public Secrets build() {
                return new Secrets(this);
            } 

        } 

    }
}
