// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetApplicationSsoConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationSsoConfigResponseBody</p>
 */
public class GetApplicationSsoConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationSsoConfig")
    private ApplicationSsoConfig applicationSsoConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationSsoConfigResponseBody(Builder builder) {
        this.applicationSsoConfig = builder.applicationSsoConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationSsoConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationSsoConfig
     */
    public ApplicationSsoConfig getApplicationSsoConfig() {
        return this.applicationSsoConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationSsoConfig applicationSsoConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApplicationSsoConfigResponseBody model) {
            this.applicationSsoConfig = model.applicationSsoConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The single sign-on (SSO) configuration information of the application.</p>
         */
        public Builder applicationSsoConfig(ApplicationSsoConfig applicationSsoConfig) {
            this.applicationSsoConfig = applicationSsoConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationSsoConfigResponseBody build() {
            return new GetApplicationSsoConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationSsoConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationSsoConfigResponseBody</p>
     */
    public static class CustomClaims extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClaimName")
        private String claimName;

        @com.aliyun.core.annotation.NameInMap("ClaimValueExpression")
        private String claimValueExpression;

        private CustomClaims(Builder builder) {
            this.claimName = builder.claimName;
            this.claimValueExpression = builder.claimValueExpression;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomClaims create() {
            return builder().build();
        }

        /**
         * @return claimName
         */
        public String getClaimName() {
            return this.claimName;
        }

        /**
         * @return claimValueExpression
         */
        public String getClaimValueExpression() {
            return this.claimValueExpression;
        }

        public static final class Builder {
            private String claimName; 
            private String claimValueExpression; 

            private Builder() {
            } 

            private Builder(CustomClaims model) {
                this.claimName = model.claimName;
                this.claimValueExpression = model.claimValueExpression;
            } 

            /**
             * <p>The name of the returned claim.</p>
             * 
             * <strong>example:</strong>
             * <p>userOuIds</p>
             */
            public Builder claimName(String claimName) {
                this.claimName = claimName;
                return this;
            }

            /**
             * <p>The value expression of the returned claim.</p>
             * 
             * <strong>example:</strong>
             * <p>ObjectToJsonString(user.organizationalUnits)</p>
             */
            public Builder claimValueExpression(String claimValueExpression) {
                this.claimValueExpression = claimValueExpression;
                return this;
            }

            public CustomClaims build() {
                return new CustomClaims(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationSsoConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationSsoConfigResponseBody</p>
     */
    public static class OidcSsoConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTokenEffectiveTime")
        private Long accessTokenEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("AllowedPublicClient")
        private String allowedPublicClient;

        @com.aliyun.core.annotation.NameInMap("CodeEffectiveTime")
        private Long codeEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("CustomClaims")
        private java.util.List<CustomClaims> customClaims;

        @com.aliyun.core.annotation.NameInMap("GrantScopes")
        private java.util.List<String> grantScopes;

        @com.aliyun.core.annotation.NameInMap("GrantTypes")
        private java.util.List<String> grantTypes;

        @com.aliyun.core.annotation.NameInMap("IdTokenEffectiveTime")
        private Long idTokenEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("PasswordAuthenticationSourceId")
        private String passwordAuthenticationSourceId;

        @com.aliyun.core.annotation.NameInMap("PasswordTotpMfaRequired")
        private Boolean passwordTotpMfaRequired;

        @com.aliyun.core.annotation.NameInMap("PkceChallengeMethods")
        private java.util.List<String> pkceChallengeMethods;

        @com.aliyun.core.annotation.NameInMap("PkceRequired")
        private Boolean pkceRequired;

        @com.aliyun.core.annotation.NameInMap("PostLogoutRedirectUris")
        private java.util.List<String> postLogoutRedirectUris;

        @com.aliyun.core.annotation.NameInMap("RedirectUris")
        private java.util.List<String> redirectUris;

        @com.aliyun.core.annotation.NameInMap("RefreshTokenEffective")
        private Long refreshTokenEffective;

        @com.aliyun.core.annotation.NameInMap("ResponseTypes")
        private java.util.List<String> responseTypes;

        @com.aliyun.core.annotation.NameInMap("SubjectIdExpression")
        private String subjectIdExpression;

        private OidcSsoConfig(Builder builder) {
            this.accessTokenEffectiveTime = builder.accessTokenEffectiveTime;
            this.allowedPublicClient = builder.allowedPublicClient;
            this.codeEffectiveTime = builder.codeEffectiveTime;
            this.customClaims = builder.customClaims;
            this.grantScopes = builder.grantScopes;
            this.grantTypes = builder.grantTypes;
            this.idTokenEffectiveTime = builder.idTokenEffectiveTime;
            this.passwordAuthenticationSourceId = builder.passwordAuthenticationSourceId;
            this.passwordTotpMfaRequired = builder.passwordTotpMfaRequired;
            this.pkceChallengeMethods = builder.pkceChallengeMethods;
            this.pkceRequired = builder.pkceRequired;
            this.postLogoutRedirectUris = builder.postLogoutRedirectUris;
            this.redirectUris = builder.redirectUris;
            this.refreshTokenEffective = builder.refreshTokenEffective;
            this.responseTypes = builder.responseTypes;
            this.subjectIdExpression = builder.subjectIdExpression;
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
        public Long getAccessTokenEffectiveTime() {
            return this.accessTokenEffectiveTime;
        }

        /**
         * @return allowedPublicClient
         */
        public String getAllowedPublicClient() {
            return this.allowedPublicClient;
        }

        /**
         * @return codeEffectiveTime
         */
        public Long getCodeEffectiveTime() {
            return this.codeEffectiveTime;
        }

        /**
         * @return customClaims
         */
        public java.util.List<CustomClaims> getCustomClaims() {
            return this.customClaims;
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
         * @return idTokenEffectiveTime
         */
        public Long getIdTokenEffectiveTime() {
            return this.idTokenEffectiveTime;
        }

        /**
         * @return passwordAuthenticationSourceId
         */
        public String getPasswordAuthenticationSourceId() {
            return this.passwordAuthenticationSourceId;
        }

        /**
         * @return passwordTotpMfaRequired
         */
        public Boolean getPasswordTotpMfaRequired() {
            return this.passwordTotpMfaRequired;
        }

        /**
         * @return pkceChallengeMethods
         */
        public java.util.List<String> getPkceChallengeMethods() {
            return this.pkceChallengeMethods;
        }

        /**
         * @return pkceRequired
         */
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        /**
         * @return postLogoutRedirectUris
         */
        public java.util.List<String> getPostLogoutRedirectUris() {
            return this.postLogoutRedirectUris;
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
        public Long getRefreshTokenEffective() {
            return this.refreshTokenEffective;
        }

        /**
         * @return responseTypes
         */
        public java.util.List<String> getResponseTypes() {
            return this.responseTypes;
        }

        /**
         * @return subjectIdExpression
         */
        public String getSubjectIdExpression() {
            return this.subjectIdExpression;
        }

        public static final class Builder {
            private Long accessTokenEffectiveTime; 
            private String allowedPublicClient; 
            private Long codeEffectiveTime; 
            private java.util.List<CustomClaims> customClaims; 
            private java.util.List<String> grantScopes; 
            private java.util.List<String> grantTypes; 
            private Long idTokenEffectiveTime; 
            private String passwordAuthenticationSourceId; 
            private Boolean passwordTotpMfaRequired; 
            private java.util.List<String> pkceChallengeMethods; 
            private Boolean pkceRequired; 
            private java.util.List<String> postLogoutRedirectUris; 
            private java.util.List<String> redirectUris; 
            private Long refreshTokenEffective; 
            private java.util.List<String> responseTypes; 
            private String subjectIdExpression; 

            private Builder() {
            } 

            private Builder(OidcSsoConfig model) {
                this.accessTokenEffectiveTime = model.accessTokenEffectiveTime;
                this.allowedPublicClient = model.allowedPublicClient;
                this.codeEffectiveTime = model.codeEffectiveTime;
                this.customClaims = model.customClaims;
                this.grantScopes = model.grantScopes;
                this.grantTypes = model.grantTypes;
                this.idTokenEffectiveTime = model.idTokenEffectiveTime;
                this.passwordAuthenticationSourceId = model.passwordAuthenticationSourceId;
                this.passwordTotpMfaRequired = model.passwordTotpMfaRequired;
                this.pkceChallengeMethods = model.pkceChallengeMethods;
                this.pkceRequired = model.pkceRequired;
                this.postLogoutRedirectUris = model.postLogoutRedirectUris;
                this.redirectUris = model.redirectUris;
                this.refreshTokenEffective = model.refreshTokenEffective;
                this.responseTypes = model.responseTypes;
                this.subjectIdExpression = model.subjectIdExpression;
            } 

            /**
             * <p>The validity period of the issued access token. Unit: seconds. Default value: 1200 (20 minutes).</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder accessTokenEffectiveTime(Long accessTokenEffectiveTime) {
                this.accessTokenEffectiveTime = accessTokenEffectiveTime;
                return this;
            }

            /**
             * <p>Specifies whether the application is allowed to request the IDaaS EIAM authorization server as a public client. This parameter can be enabled only in authorization code mode and device mode. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowedPublicClient(String allowedPublicClient) {
                this.allowedPublicClient = allowedPublicClient;
                return this;
            }

            /**
             * <p>The validity period of the issued code. Unit: seconds. Default value: 60 (1 minute).</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder codeEffectiveTime(Long codeEffectiveTime) {
                this.codeEffectiveTime = codeEffectiveTime;
                return this;
            }

            /**
             * <p>The custom user information included in the ID token response.</p>
             */
            public Builder customClaims(java.util.List<CustomClaims> customClaims) {
                this.customClaims = customClaims;
                return this;
            }

            /**
             * <p>The OIDC standard parameter scope, which specifies the range of user attributes that can be returned by the userinfo endpoint or ID token.</p>
             * 
             * <strong>example:</strong>
             * <p>profile，email</p>
             */
            public Builder grantScopes(java.util.List<String> grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            /**
             * <p>The list of supported OIDC protocol grant types.</p>
             * 
             * <strong>example:</strong>
             * <p>authorization_code</p>
             */
            public Builder grantTypes(java.util.List<String> grantTypes) {
                this.grantTypes = grantTypes;
                return this;
            }

            /**
             * <p>The validity period of the issued ID token. Unit: seconds. Default value: 300 (5 minutes).</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder idTokenEffectiveTime(Long idTokenEffectiveTime) {
                this.idTokenEffectiveTime = idTokenEffectiveTime;
                return this;
            }

            /**
             * <p>The ID of the identity authentication source used in password mode. This parameter takes effect only when the GrantTypes specified for the OIDC protocol application include the password mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ia_password</p>
             */
            public Builder passwordAuthenticationSourceId(String passwordAuthenticationSourceId) {
                this.passwordAuthenticationSourceId = passwordAuthenticationSourceId;
                return this;
            }

            /**
             * <p>Specifies whether TOTP-based secondary authentication is required in password mode. This parameter takes effect only when the GrantTypes specified for the OIDC protocol application include the password mode.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder passwordTotpMfaRequired(Boolean passwordTotpMfaRequired) {
                this.passwordTotpMfaRequired = passwordTotpMfaRequired;
                return this;
            }

            /**
             * <p>The algorithm used to calculate the Code Challenge in PKCE.</p>
             * 
             * <strong>example:</strong>
             * <p>S256</p>
             */
            public Builder pkceChallengeMethods(java.util.List<String> pkceChallengeMethods) {
                this.pkceChallengeMethods = pkceChallengeMethods;
                return this;
            }

            /**
             * <p>Specifies whether the application SSO requires PKCE (RFC 7636).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pkceRequired(Boolean pkceRequired) {
                this.pkceRequired = pkceRequired;
                return this;
            }

            /**
             * <p>The list of logout callback addresses supported by the application.</p>
             */
            public Builder postLogoutRedirectUris(java.util.List<String> postLogoutRedirectUris) {
                this.postLogoutRedirectUris = postLogoutRedirectUris;
                return this;
            }

            /**
             * <p>The list of redirect URIs supported by the application.</p>
             */
            public Builder redirectUris(java.util.List<String> redirectUris) {
                this.redirectUris = redirectUris;
                return this;
            }

            /**
             * <p>The validity period of the issued refresh token. Unit: seconds. Default value: 86400 (1 day).</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder refreshTokenEffective(Long refreshTokenEffective) {
                this.refreshTokenEffective = refreshTokenEffective;
                return this;
            }

            /**
             * <p>The response types supported by the application when OidcSsoConfig.GrantTypes includes the implicit mode.</p>
             * 
             * <strong>example:</strong>
             * <p>token id_token</p>
             */
            public Builder responseTypes(java.util.List<String> responseTypes) {
                this.responseTypes = responseTypes;
                return this;
            }

            /**
             * <p>The custom expression for the sub value returned in the ID token.</p>
             * 
             * <strong>example:</strong>
             * <p>user.userid</p>
             */
            public Builder subjectIdExpression(String subjectIdExpression) {
                this.subjectIdExpression = subjectIdExpression;
                return this;
            }

            public OidcSsoConfig build() {
                return new OidcSsoConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationSsoConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationSsoConfigResponseBody</p>
     */
    public static class ProtocolEndpointDomain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Oauth2AuthorizationEndpoint")
        private String oauth2AuthorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("Oauth2DeviceAuthorizationEndpoint")
        private String oauth2DeviceAuthorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("Oauth2RevokeEndpoint")
        private String oauth2RevokeEndpoint;

        @com.aliyun.core.annotation.NameInMap("Oauth2TokenEndpoint")
        private String oauth2TokenEndpoint;

        @com.aliyun.core.annotation.NameInMap("Oauth2UserinfoEndpoint")
        private String oauth2UserinfoEndpoint;

        @com.aliyun.core.annotation.NameInMap("OidcIssuer")
        private String oidcIssuer;

        @com.aliyun.core.annotation.NameInMap("OidcJwksEndpoint")
        private String oidcJwksEndpoint;

        @com.aliyun.core.annotation.NameInMap("OidcLogoutEndpoint")
        private String oidcLogoutEndpoint;

        @com.aliyun.core.annotation.NameInMap("SamlMetaEndpoint")
        private String samlMetaEndpoint;

        @com.aliyun.core.annotation.NameInMap("SamlSloEndpoint")
        private String samlSloEndpoint;

        @com.aliyun.core.annotation.NameInMap("SamlSsoEndpoint")
        private String samlSsoEndpoint;

        private ProtocolEndpointDomain(Builder builder) {
            this.oauth2AuthorizationEndpoint = builder.oauth2AuthorizationEndpoint;
            this.oauth2DeviceAuthorizationEndpoint = builder.oauth2DeviceAuthorizationEndpoint;
            this.oauth2RevokeEndpoint = builder.oauth2RevokeEndpoint;
            this.oauth2TokenEndpoint = builder.oauth2TokenEndpoint;
            this.oauth2UserinfoEndpoint = builder.oauth2UserinfoEndpoint;
            this.oidcIssuer = builder.oidcIssuer;
            this.oidcJwksEndpoint = builder.oidcJwksEndpoint;
            this.oidcLogoutEndpoint = builder.oidcLogoutEndpoint;
            this.samlMetaEndpoint = builder.samlMetaEndpoint;
            this.samlSloEndpoint = builder.samlSloEndpoint;
            this.samlSsoEndpoint = builder.samlSsoEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolEndpointDomain create() {
            return builder().build();
        }

        /**
         * @return oauth2AuthorizationEndpoint
         */
        public String getOauth2AuthorizationEndpoint() {
            return this.oauth2AuthorizationEndpoint;
        }

        /**
         * @return oauth2DeviceAuthorizationEndpoint
         */
        public String getOauth2DeviceAuthorizationEndpoint() {
            return this.oauth2DeviceAuthorizationEndpoint;
        }

        /**
         * @return oauth2RevokeEndpoint
         */
        public String getOauth2RevokeEndpoint() {
            return this.oauth2RevokeEndpoint;
        }

        /**
         * @return oauth2TokenEndpoint
         */
        public String getOauth2TokenEndpoint() {
            return this.oauth2TokenEndpoint;
        }

        /**
         * @return oauth2UserinfoEndpoint
         */
        public String getOauth2UserinfoEndpoint() {
            return this.oauth2UserinfoEndpoint;
        }

        /**
         * @return oidcIssuer
         */
        public String getOidcIssuer() {
            return this.oidcIssuer;
        }

        /**
         * @return oidcJwksEndpoint
         */
        public String getOidcJwksEndpoint() {
            return this.oidcJwksEndpoint;
        }

        /**
         * @return oidcLogoutEndpoint
         */
        public String getOidcLogoutEndpoint() {
            return this.oidcLogoutEndpoint;
        }

        /**
         * @return samlMetaEndpoint
         */
        public String getSamlMetaEndpoint() {
            return this.samlMetaEndpoint;
        }

        /**
         * @return samlSloEndpoint
         */
        public String getSamlSloEndpoint() {
            return this.samlSloEndpoint;
        }

        /**
         * @return samlSsoEndpoint
         */
        public String getSamlSsoEndpoint() {
            return this.samlSsoEndpoint;
        }

        public static final class Builder {
            private String oauth2AuthorizationEndpoint; 
            private String oauth2DeviceAuthorizationEndpoint; 
            private String oauth2RevokeEndpoint; 
            private String oauth2TokenEndpoint; 
            private String oauth2UserinfoEndpoint; 
            private String oidcIssuer; 
            private String oidcJwksEndpoint; 
            private String oidcLogoutEndpoint; 
            private String samlMetaEndpoint; 
            private String samlSloEndpoint; 
            private String samlSsoEndpoint; 

            private Builder() {
            } 

            private Builder(ProtocolEndpointDomain model) {
                this.oauth2AuthorizationEndpoint = model.oauth2AuthorizationEndpoint;
                this.oauth2DeviceAuthorizationEndpoint = model.oauth2DeviceAuthorizationEndpoint;
                this.oauth2RevokeEndpoint = model.oauth2RevokeEndpoint;
                this.oauth2TokenEndpoint = model.oauth2TokenEndpoint;
                this.oauth2UserinfoEndpoint = model.oauth2UserinfoEndpoint;
                this.oidcIssuer = model.oidcIssuer;
                this.oidcJwksEndpoint = model.oidcJwksEndpoint;
                this.oidcLogoutEndpoint = model.oidcLogoutEndpoint;
                this.samlMetaEndpoint = model.samlMetaEndpoint;
                this.samlSloEndpoint = model.samlSloEndpoint;
                this.samlSsoEndpoint = model.samlSsoEndpoint;
            } 

            /**
             * <p>The OAuth 2.0 authorization endpoint. This parameter is returned only when the application SSO protocol is OIDC.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://l1seshcn.aliyunidaas.com/login/app/app_mltta64q65enci54slingvvsgq/oauth2/authorize">https://l1seshcn.aliyunidaas.com/login/app/app_mltta64q65enci54slingvvsgq/oauth2/authorize</a></p>
             */
            public Builder oauth2AuthorizationEndpoint(String oauth2AuthorizationEndpoint) {
                this.oauth2AuthorizationEndpoint = oauth2AuthorizationEndpoint;
                return this;
            }

            /**
             * <p>The OAuth 2.0 device authorization endpoint. This parameter is returned only when the application SSO protocol is OIDC.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/device/code">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/device/code</a></p>
             */
            public Builder oauth2DeviceAuthorizationEndpoint(String oauth2DeviceAuthorizationEndpoint) {
                this.oauth2DeviceAuthorizationEndpoint = oauth2DeviceAuthorizationEndpoint;
                return this;
            }

            /**
             * <p>The OAuth 2.0 token revocation endpoint. This parameter is returned only when the application SSO protocol is OIDC.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/revoke">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/revoke</a></p>
             */
            public Builder oauth2RevokeEndpoint(String oauth2RevokeEndpoint) {
                this.oauth2RevokeEndpoint = oauth2RevokeEndpoint;
                return this;
            }

            /**
             * <p>The OAuth 2.0 token endpoint. This parameter is returned only when the application SSO protocol is OIDC.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/token">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/token</a></p>
             */
            public Builder oauth2TokenEndpoint(String oauth2TokenEndpoint) {
                this.oauth2TokenEndpoint = oauth2TokenEndpoint;
                return this;
            }

            /**
             * <p>The OIDC user information endpoint. This parameter is returned only when the application SSO protocol is OIDC.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/userinfo">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/userinfo</a></p>
             */
            public Builder oauth2UserinfoEndpoint(String oauth2UserinfoEndpoint) {
                this.oauth2UserinfoEndpoint = oauth2UserinfoEndpoint;
                return this;
            }

            /**
             * <p>The OIDC issuer information. This parameter is returned only when the application SSO protocol is OIDC.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oidc">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oidc</a></p>
             */
            public Builder oidcIssuer(String oidcIssuer) {
                this.oidcIssuer = oidcIssuer;
                return this;
            }

            /**
             * <p>The OIDC JWKS endpoint. This parameter is returned only when the application SSO protocol is OIDC.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oidc/jwks">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oidc/jwks</a></p>
             */
            public Builder oidcJwksEndpoint(String oidcJwksEndpoint) {
                this.oidcJwksEndpoint = oidcJwksEndpoint;
                return this;
            }

            /**
             * <p>The OIDC RP-initiated logout endpoint. This parameter is returned only when the application SSO protocol is OIDC.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://l1seshcn.aliyunidaas.com/login/app/app_mltta64q65enci54slingvvsgq/oauth2/logout">https://l1seshcn.aliyunidaas.com/login/app/app_mltta64q65enci54slingvvsgq/oauth2/logout</a></p>
             */
            public Builder oidcLogoutEndpoint(String oidcLogoutEndpoint) {
                this.oidcLogoutEndpoint = oidcLogoutEndpoint;
                return this;
            }

            /**
             * <p>The SAML protocol metadata endpoint URL. This parameter is returned only when the application SSO protocol is SAML 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://l1seshcn.aliyunidaas.com/api/v2/app_mltuxdwd4lq4eer6tmtlmaxm5e/saml2/meta">https://l1seshcn.aliyunidaas.com/api/v2/app_mltuxdwd4lq4eer6tmtlmaxm5e/saml2/meta</a></p>
             */
            public Builder samlMetaEndpoint(String samlMetaEndpoint) {
                this.samlMetaEndpoint = samlMetaEndpoint;
                return this;
            }

            /**
             * <p>The SAML single logout URL (SLO URL) on the IdP side. The SP redirects the user to this URL to initiate single logout.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/saml/slo">https://example.com/saml/slo</a></p>
             */
            public Builder samlSloEndpoint(String samlSloEndpoint) {
                this.samlSloEndpoint = samlSloEndpoint;
                return this;
            }

            /**
             * <p>The SAML protocol AuthnRequest receiving endpoint. This parameter is returned only when the application SSO protocol is SAML 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://l1seshcn.aliyunidaas.com/login/app/app_mltuxdwd4lq4eer6tmtlmaxm5e/saml2/sso">https://l1seshcn.aliyunidaas.com/login/app/app_mltuxdwd4lq4eer6tmtlmaxm5e/saml2/sso</a></p>
             */
            public Builder samlSsoEndpoint(String samlSsoEndpoint) {
                this.samlSsoEndpoint = samlSsoEndpoint;
                return this;
            }

            public ProtocolEndpointDomain build() {
                return new ProtocolEndpointDomain(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationSsoConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationSsoConfigResponseBody</p>
     */
    public static class AttributeStatements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeName")
        private String attributeName;

        @com.aliyun.core.annotation.NameInMap("AttributeValueExpression")
        private String attributeValueExpression;

        private AttributeStatements(Builder builder) {
            this.attributeName = builder.attributeName;
            this.attributeValueExpression = builder.attributeValueExpression;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeStatements create() {
            return builder().build();
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return attributeValueExpression
         */
        public String getAttributeValueExpression() {
            return this.attributeValueExpression;
        }

        public static final class Builder {
            private String attributeName; 
            private String attributeValueExpression; 

            private Builder() {
            } 

            private Builder(AttributeStatements model) {
                this.attributeName = model.attributeName;
                this.attributeValueExpression = model.attributeValueExpression;
            } 

            /**
             * <p>The Name of the attribute in the SAML assertion.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com/SAML-Role/Attributes/RoleSessionName">https://www.aliyun.com/SAML-Role/Attributes/RoleSessionName</a></p>
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * <p>The attribute value expression in the SAML assertion.</p>
             * 
             * <strong>example:</strong>
             * <p>user.username</p>
             */
            public Builder attributeValueExpression(String attributeValueExpression) {
                this.attributeValueExpression = attributeValueExpression;
                return this;
            }

            public AttributeStatements build() {
                return new AttributeStatements(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationSsoConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationSsoConfigResponseBody</p>
     */
    public static class OptionalRelayStates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("RelayState")
        private String relayState;

        private OptionalRelayStates(Builder builder) {
            this.displayName = builder.displayName;
            this.relayState = builder.relayState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionalRelayStates create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return relayState
         */
        public String getRelayState() {
            return this.relayState;
        }

        public static final class Builder {
            private String displayName; 
            private String relayState; 

            private Builder() {
            } 

            private Builder(OptionalRelayStates model) {
                this.displayName = model.displayName;
                this.relayState = model.relayState;
            } 

            /**
             * <p>The display name of the RelayState.</p>
             * 
             * <strong>example:</strong>
             * <p>Ram Account SSO</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The optional RelayState value. In the application portal, the application card displays multiple optional redirect addresses with display names. After a user clicks an address and completes SSO, the user is automatically redirected to the corresponding address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://home.console.aliyun.com">https://home.console.aliyun.com</a></p>
             */
            public Builder relayState(String relayState) {
                this.relayState = relayState;
                return this;
            }

            public OptionalRelayStates build() {
                return new OptionalRelayStates(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationSsoConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationSsoConfigResponseBody</p>
     */
    public static class SamlSsoConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssertionSigned")
        private Boolean assertionSigned;

        @com.aliyun.core.annotation.NameInMap("AttributeStatements")
        private java.util.List<AttributeStatements> attributeStatements;

        @com.aliyun.core.annotation.NameInMap("DefaultRelayState")
        private String defaultRelayState;

        @com.aliyun.core.annotation.NameInMap("IdPEntityId")
        private String idPEntityId;

        @com.aliyun.core.annotation.NameInMap("NameIdFormat")
        private String nameIdFormat;

        @com.aliyun.core.annotation.NameInMap("NameIdValueExpression")
        private String nameIdValueExpression;

        @com.aliyun.core.annotation.NameInMap("OptionalRelayStates")
        private java.util.List<OptionalRelayStates> optionalRelayStates;

        @com.aliyun.core.annotation.NameInMap("RequireAuthnRequestSigned")
        private Boolean requireAuthnRequestSigned;

        @com.aliyun.core.annotation.NameInMap("ResponseSigned")
        private Boolean responseSigned;

        @com.aliyun.core.annotation.NameInMap("SignatureAlgorithm")
        private String signatureAlgorithm;

        @com.aliyun.core.annotation.NameInMap("SpEntityId")
        private String spEntityId;

        @com.aliyun.core.annotation.NameInMap("SpSigningCertificates")
        private java.util.List<String> spSigningCertificates;

        @com.aliyun.core.annotation.NameInMap("SpSloResponseUrl")
        private String spSloResponseUrl;

        @com.aliyun.core.annotation.NameInMap("SpSsoAcsUrl")
        private String spSsoAcsUrl;

        private SamlSsoConfig(Builder builder) {
            this.assertionSigned = builder.assertionSigned;
            this.attributeStatements = builder.attributeStatements;
            this.defaultRelayState = builder.defaultRelayState;
            this.idPEntityId = builder.idPEntityId;
            this.nameIdFormat = builder.nameIdFormat;
            this.nameIdValueExpression = builder.nameIdValueExpression;
            this.optionalRelayStates = builder.optionalRelayStates;
            this.requireAuthnRequestSigned = builder.requireAuthnRequestSigned;
            this.responseSigned = builder.responseSigned;
            this.signatureAlgorithm = builder.signatureAlgorithm;
            this.spEntityId = builder.spEntityId;
            this.spSigningCertificates = builder.spSigningCertificates;
            this.spSloResponseUrl = builder.spSloResponseUrl;
            this.spSsoAcsUrl = builder.spSsoAcsUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SamlSsoConfig create() {
            return builder().build();
        }

        /**
         * @return assertionSigned
         */
        public Boolean getAssertionSigned() {
            return this.assertionSigned;
        }

        /**
         * @return attributeStatements
         */
        public java.util.List<AttributeStatements> getAttributeStatements() {
            return this.attributeStatements;
        }

        /**
         * @return defaultRelayState
         */
        public String getDefaultRelayState() {
            return this.defaultRelayState;
        }

        /**
         * @return idPEntityId
         */
        public String getIdPEntityId() {
            return this.idPEntityId;
        }

        /**
         * @return nameIdFormat
         */
        public String getNameIdFormat() {
            return this.nameIdFormat;
        }

        /**
         * @return nameIdValueExpression
         */
        public String getNameIdValueExpression() {
            return this.nameIdValueExpression;
        }

        /**
         * @return optionalRelayStates
         */
        public java.util.List<OptionalRelayStates> getOptionalRelayStates() {
            return this.optionalRelayStates;
        }

        /**
         * @return requireAuthnRequestSigned
         */
        public Boolean getRequireAuthnRequestSigned() {
            return this.requireAuthnRequestSigned;
        }

        /**
         * @return responseSigned
         */
        public Boolean getResponseSigned() {
            return this.responseSigned;
        }

        /**
         * @return signatureAlgorithm
         */
        public String getSignatureAlgorithm() {
            return this.signatureAlgorithm;
        }

        /**
         * @return spEntityId
         */
        public String getSpEntityId() {
            return this.spEntityId;
        }

        /**
         * @return spSigningCertificates
         */
        public java.util.List<String> getSpSigningCertificates() {
            return this.spSigningCertificates;
        }

        /**
         * @return spSloResponseUrl
         */
        public String getSpSloResponseUrl() {
            return this.spSloResponseUrl;
        }

        /**
         * @return spSsoAcsUrl
         */
        public String getSpSsoAcsUrl() {
            return this.spSsoAcsUrl;
        }

        public static final class Builder {
            private Boolean assertionSigned; 
            private java.util.List<AttributeStatements> attributeStatements; 
            private String defaultRelayState; 
            private String idPEntityId; 
            private String nameIdFormat; 
            private String nameIdValueExpression; 
            private java.util.List<OptionalRelayStates> optionalRelayStates; 
            private Boolean requireAuthnRequestSigned; 
            private Boolean responseSigned; 
            private String signatureAlgorithm; 
            private String spEntityId; 
            private java.util.List<String> spSigningCertificates; 
            private String spSloResponseUrl; 
            private String spSsoAcsUrl; 

            private Builder() {
            } 

            private Builder(SamlSsoConfig model) {
                this.assertionSigned = model.assertionSigned;
                this.attributeStatements = model.attributeStatements;
                this.defaultRelayState = model.defaultRelayState;
                this.idPEntityId = model.idPEntityId;
                this.nameIdFormat = model.nameIdFormat;
                this.nameIdValueExpression = model.nameIdValueExpression;
                this.optionalRelayStates = model.optionalRelayStates;
                this.requireAuthnRequestSigned = model.requireAuthnRequestSigned;
                this.responseSigned = model.responseSigned;
                this.signatureAlgorithm = model.signatureAlgorithm;
                this.spEntityId = model.spEntityId;
                this.spSigningCertificates = model.spSigningCertificates;
                this.spSloResponseUrl = model.spSloResponseUrl;
                this.spSsoAcsUrl = model.spSsoAcsUrl;
            } 

            /**
             * <p>Specifies whether the assertion needs to be signed. ResponseSigned and AssertionSigned cannot both be set to false.</p>
             * <ul>
             * <li>true: Signed.</li>
             * <li>false: Not signed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder assertionSigned(Boolean assertionSigned) {
                this.assertionSigned = assertionSigned;
                return this;
            }

            /**
             * <p>The additional user attribute configuration included in the SAML assertion.</p>
             */
            public Builder attributeStatements(java.util.List<AttributeStatements> attributeStatements) {
                this.attributeStatements = attributeStatements;
                return this;
            }

            /**
             * <p>The default RelayState value. When the single sign-on (SSO) request is initiated by EIAM, the SAML Response provided by EIAM specifies the RelayState as this value. This applies when the user logon request is initiated by EIAM.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://home.console.aliyun.com">https://home.console.aliyun.com</a></p>
             */
            public Builder defaultRelayState(String defaultRelayState) {
                this.defaultRelayState = defaultRelayState;
                return this;
            }

            /**
             * <p>The Entity ID that represents the IdP identity in the SAML protocol.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/">https://example.com/</a></p>
             */
            public Builder idPEntityId(String idPEntityId) {
                this.idPEntityId = idPEntityId;
                return this;
            }

            /**
             * <p>The NameID format defined by the SAML protocol standard. Valid values:</p>
             * <ul>
             * <li>urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified: Unspecified. The application determines how to parse the NameID.</li>
             * <li>urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress: Email address format.</li>
             * <li>urn:oasis:names:tc:SAML:2.0:nameid-format:persistent: Persistent NameID.</li>
             * <li>urn:oasis:names:tc:SAML:2.0:nameid-format:transient: Transient NameID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified</p>
             */
            public Builder nameIdFormat(String nameIdFormat) {
                this.nameIdFormat = nameIdFormat;
                return this;
            }

            /**
             * <p>The expression used to generate the actual NameID value in the SAML protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>user.username</p>
             */
            public Builder nameIdValueExpression(String nameIdValueExpression) {
                this.nameIdValueExpression = nameIdValueExpression;
                return this;
            }

            /**
             * <p>The optional RelayState values. In the application portal, the application card displays multiple optional redirect addresses with display names. After a user clicks an address and completes SSO, the user is automatically redirected to the corresponding address. You can specify optional redirect addresses only after you specify a default redirect address.</p>
             */
            public Builder optionalRelayStates(java.util.List<OptionalRelayStates> optionalRelayStates) {
                this.optionalRelayStates = optionalRelayStates;
                return this;
            }

            /**
             * <p>Indicates whether SSO AuthnRequest signature verification is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder requireAuthnRequestSigned(Boolean requireAuthnRequestSigned) {
                this.requireAuthnRequestSigned = requireAuthnRequestSigned;
                return this;
            }

            /**
             * <p>Indicates whether the Response needs to be signed. ResponseSigned and AssertionSigned cannot both be set to false. Valid values:</p>
             * <ul>
             * <li>true: Signing is required.</li>
             * <li>false: Signing is not required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder responseSigned(Boolean responseSigned) {
                this.responseSigned = responseSigned;
                return this;
            }

            /**
             * <p>The signature algorithm for the SAML assertion.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA-SHA256</p>
             */
            public Builder signatureAlgorithm(String signatureAlgorithm) {
                this.signatureAlgorithm = signatureAlgorithm;
                return this;
            }

            /**
             * <p>The SAML EntityId of the application (SP).</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:cloudcomputing</p>
             */
            public Builder spEntityId(String spEntityId) {
                this.spEntityId = spEntityId;
                return this;
            }

            /**
             * <p>The configured SP signing verification certificates in PEM format. A maximum of two certificates are returned for the console or API caller to read and display.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE----- MIIC0jCCAbqgAwIBAgIQXXXXX -----END CERTIFICATE-----</p>
             */
            public Builder spSigningCertificates(java.util.List<String> spSigningCertificates) {
                this.spSigningCertificates = spSigningCertificates;
                return this;
            }

            /**
             * <p>The configured SP SLO response URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/api/slo/response">https://example.com/api/slo/response</a></p>
             */
            public Builder spSloResponseUrl(String spSloResponseUrl) {
                this.spSloResponseUrl = spSloResponseUrl;
                return this;
            }

            /**
             * <p>The SAML Assertion Consumer Service (ACS) URL of the application (SP).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://signin.aliyun.com/saml-role/sso">https://signin.aliyun.com/saml-role/sso</a></p>
             */
            public Builder spSsoAcsUrl(String spSsoAcsUrl) {
                this.spSsoAcsUrl = spSsoAcsUrl;
                return this;
            }

            public SamlSsoConfig build() {
                return new SamlSsoConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationSsoConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationSsoConfigResponseBody</p>
     */
    public static class ApplicationSsoConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InitLoginType")
        private String initLoginType;

        @com.aliyun.core.annotation.NameInMap("InitLoginUrl")
        private String initLoginUrl;

        @com.aliyun.core.annotation.NameInMap("OidcSsoConfig")
        private OidcSsoConfig oidcSsoConfig;

        @com.aliyun.core.annotation.NameInMap("ProtocolEndpointDomain")
        private ProtocolEndpointDomain protocolEndpointDomain;

        @com.aliyun.core.annotation.NameInMap("SamlSsoConfig")
        private SamlSsoConfig samlSsoConfig;

        @com.aliyun.core.annotation.NameInMap("SsoStatus")
        private String ssoStatus;

        private ApplicationSsoConfig(Builder builder) {
            this.initLoginType = builder.initLoginType;
            this.initLoginUrl = builder.initLoginUrl;
            this.oidcSsoConfig = builder.oidcSsoConfig;
            this.protocolEndpointDomain = builder.protocolEndpointDomain;
            this.samlSsoConfig = builder.samlSsoConfig;
            this.ssoStatus = builder.ssoStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationSsoConfig create() {
            return builder().build();
        }

        /**
         * @return initLoginType
         */
        public String getInitLoginType() {
            return this.initLoginType;
        }

        /**
         * @return initLoginUrl
         */
        public String getInitLoginUrl() {
            return this.initLoginUrl;
        }

        /**
         * @return oidcSsoConfig
         */
        public OidcSsoConfig getOidcSsoConfig() {
            return this.oidcSsoConfig;
        }

        /**
         * @return protocolEndpointDomain
         */
        public ProtocolEndpointDomain getProtocolEndpointDomain() {
            return this.protocolEndpointDomain;
        }

        /**
         * @return samlSsoConfig
         */
        public SamlSsoConfig getSamlSsoConfig() {
            return this.samlSsoConfig;
        }

        /**
         * @return ssoStatus
         */
        public String getSsoStatus() {
            return this.ssoStatus;
        }

        public static final class Builder {
            private String initLoginType; 
            private String initLoginUrl; 
            private OidcSsoConfig oidcSsoConfig; 
            private ProtocolEndpointDomain protocolEndpointDomain; 
            private SamlSsoConfig samlSsoConfig; 
            private String ssoStatus; 

            private Builder() {
            } 

            private Builder(ApplicationSsoConfig model) {
                this.initLoginType = model.initLoginType;
                this.initLoginUrl = model.initLoginUrl;
                this.oidcSsoConfig = model.oidcSsoConfig;
                this.protocolEndpointDomain = model.protocolEndpointDomain;
                this.samlSsoConfig = model.samlSsoConfig;
                this.ssoStatus = model.ssoStatus;
            } 

            /**
             * <p>The initialization single sign-on (SSO) method. Valid values:</p>
             * <ul>
             * <li>only_app_init_sso: Only application-initiated SSO. This is the default value for OIDC protocol applications. When a SAML application specifies this method, InitLoginUrl must be specified.</li>
             * <li>idaas_or_app_init_sso: IDaaS portal-initiated or application-initiated SSO. This is the default value for SAML protocol applications. When an OIDC application specifies this method, InitLoginUrl must be specified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>only_app_init_sso</p>
             */
            public Builder initLoginType(String initLoginType) {
                this.initLoginType = initLoginType;
                return this;
            }

            /**
             * <p>The initialization single sign-on (SSO) trigger URL. This parameter is required when the InitLoginType of an OIDC protocol application is set to idaas_or_app_init_sso, or when the InitLoginType of a SAML protocol application is set to only_app_init_sso.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://127.0.0.1:8000/start_login?enterprise_code=ABCDEF">http://127.0.0.1:8000/start_login?enterprise_code=ABCDEF</a></p>
             */
            public Builder initLoginUrl(String initLoginUrl) {
                this.initLoginUrl = initLoginUrl;
                return this;
            }

            /**
             * <p>The SSO configuration parameters for OIDC protocol applications. This parameter is returned only when the application SSO protocol is OIDC.</p>
             */
            public Builder oidcSsoConfig(OidcSsoConfig oidcSsoConfig) {
                this.oidcSsoConfig = oidcSsoConfig;
                return this;
            }

            /**
             * <p>The metadata endpoint configuration provided by the application.</p>
             */
            public Builder protocolEndpointDomain(ProtocolEndpointDomain protocolEndpointDomain) {
                this.protocolEndpointDomain = protocolEndpointDomain;
                return this;
            }

            /**
             * <p>The SSO configuration parameters for SAML protocol applications. This parameter is returned only when the application SSO protocol is SAML 2.0.</p>
             */
            public Builder samlSsoConfig(SamlSsoConfig samlSsoConfig) {
                this.samlSsoConfig = samlSsoConfig;
                return this;
            }

            /**
             * <p>The SSO status of the application. Valid values:</p>
             * <ul>
             * <li>enabled: Enabled.</li>
             * <li>disabled: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder ssoStatus(String ssoStatus) {
                this.ssoStatus = ssoStatus;
                return this;
            }

            public ApplicationSsoConfig build() {
                return new ApplicationSsoConfig(this);
            } 

        } 

    }
}
