// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationSsoConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationSsoConfigResponseBody</p>
 */
public class GetApplicationSsoConfigResponseBody extends TeaModel {
    @NameInMap("ApplicationSsoConfig")
    private ApplicationSsoConfig applicationSsoConfig;

    @NameInMap("RequestId")
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

        /**
         * The SSO configuration information of the application.
         */
        public Builder applicationSsoConfig(ApplicationSsoConfig applicationSsoConfig) {
            this.applicationSsoConfig = applicationSsoConfig;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationSsoConfigResponseBody build() {
            return new GetApplicationSsoConfigResponseBody(this);
        } 

    } 

    public static class CustomClaims extends TeaModel {
        @NameInMap("ClaimName")
        private String claimName;

        @NameInMap("ClaimValueExpression")
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

            /**
             * The claim name.
             */
            public Builder claimName(String claimName) {
                this.claimName = claimName;
                return this;
            }

            /**
             * The expression that is used to generate the value of the claim.
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
    public static class OidcSsoConfig extends TeaModel {
        @NameInMap("AccessTokenEffectiveTime")
        private Long accessTokenEffectiveTime;

        @NameInMap("CodeEffectiveTime")
        private Long codeEffectiveTime;

        @NameInMap("CustomClaims")
        private java.util.List < CustomClaims> customClaims;

        @NameInMap("GrantScopes")
        private java.util.List < String > grantScopes;

        @NameInMap("GrantTypes")
        private java.util.List < String > grantTypes;

        @NameInMap("IdTokenEffectiveTime")
        private Long idTokenEffectiveTime;

        @NameInMap("PasswordAuthenticationSourceId")
        private String passwordAuthenticationSourceId;

        @NameInMap("PasswordTotpMfaRequired")
        private Boolean passwordTotpMfaRequired;

        @NameInMap("PkceChallengeMethods")
        private java.util.List < String > pkceChallengeMethods;

        @NameInMap("PkceRequired")
        private Boolean pkceRequired;

        @NameInMap("PostLogoutRedirectUris")
        private java.util.List < String > postLogoutRedirectUris;

        @NameInMap("RedirectUris")
        private java.util.List < String > redirectUris;

        @NameInMap("RefreshTokenEffective")
        private Long refreshTokenEffective;

        @NameInMap("ResponseTypes")
        private java.util.List < String > responseTypes;

        @NameInMap("SubjectIdExpression")
        private String subjectIdExpression;

        private OidcSsoConfig(Builder builder) {
            this.accessTokenEffectiveTime = builder.accessTokenEffectiveTime;
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
         * @return codeEffectiveTime
         */
        public Long getCodeEffectiveTime() {
            return this.codeEffectiveTime;
        }

        /**
         * @return customClaims
         */
        public java.util.List < CustomClaims> getCustomClaims() {
            return this.customClaims;
        }

        /**
         * @return grantScopes
         */
        public java.util.List < String > getGrantScopes() {
            return this.grantScopes;
        }

        /**
         * @return grantTypes
         */
        public java.util.List < String > getGrantTypes() {
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
        public java.util.List < String > getPkceChallengeMethods() {
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
        public java.util.List < String > getPostLogoutRedirectUris() {
            return this.postLogoutRedirectUris;
        }

        /**
         * @return redirectUris
         */
        public java.util.List < String > getRedirectUris() {
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
        public java.util.List < String > getResponseTypes() {
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
            private Long codeEffectiveTime; 
            private java.util.List < CustomClaims> customClaims; 
            private java.util.List < String > grantScopes; 
            private java.util.List < String > grantTypes; 
            private Long idTokenEffectiveTime; 
            private String passwordAuthenticationSourceId; 
            private Boolean passwordTotpMfaRequired; 
            private java.util.List < String > pkceChallengeMethods; 
            private Boolean pkceRequired; 
            private java.util.List < String > postLogoutRedirectUris; 
            private java.util.List < String > redirectUris; 
            private Long refreshTokenEffective; 
            private java.util.List < String > responseTypes; 
            private String subjectIdExpression; 

            /**
             * The validity period of the issued access token. Unit: seconds. Default value: 1200.
             */
            public Builder accessTokenEffectiveTime(Long accessTokenEffectiveTime) {
                this.accessTokenEffectiveTime = accessTokenEffectiveTime;
                return this;
            }

            /**
             * The validity period of the issued code. Unit: seconds. Default value: 60.
             */
            public Builder codeEffectiveTime(Long codeEffectiveTime) {
                this.codeEffectiveTime = codeEffectiveTime;
                return this;
            }

            /**
             * The custom claims that are returned for the ID token.
             */
            public Builder customClaims(java.util.List < CustomClaims> customClaims) {
                this.customClaims = customClaims;
                return this;
            }

            /**
             * The scopes of user attributes that can be returned for the UserInfo endpoint or ID token.
             */
            public Builder grantScopes(java.util.List < String > grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            /**
             * The list of grant types that are supported for OIDC protocols.
             */
            public Builder grantTypes(java.util.List < String > grantTypes) {
                this.grantTypes = grantTypes;
                return this;
            }

            /**
             * The validity period of the issued ID token. Unit: seconds. Default value: 300.
             */
            public Builder idTokenEffectiveTime(Long idTokenEffectiveTime) {
                this.idTokenEffectiveTime = idTokenEffectiveTime;
                return this;
            }

            /**
             * The ID of the identity authentication source in password mode. This parameter is returned only when the value of the GrantTypes parameter includes the password mode.
             */
            public Builder passwordAuthenticationSourceId(String passwordAuthenticationSourceId) {
                this.passwordAuthenticationSourceId = passwordAuthenticationSourceId;
                return this;
            }

            /**
             * Indicates whether time-based one-time password (TOTP) authentication is required in password mode. This parameter is returned only when the value of the GrantTypes parameter includes the password mode.
             */
            public Builder passwordTotpMfaRequired(Boolean passwordTotpMfaRequired) {
                this.passwordTotpMfaRequired = passwordTotpMfaRequired;
                return this;
            }

            /**
             * The algorithms that are used to calculate the code challenge for PKCE.
             */
            public Builder pkceChallengeMethods(java.util.List < String > pkceChallengeMethods) {
                this.pkceChallengeMethods = pkceChallengeMethods;
                return this;
            }

            /**
             * Indicates whether the SSO of the application requires Proof Key for Code Exchange (PKCE) (RFC 7636).
             */
            public Builder pkceRequired(Boolean pkceRequired) {
                this.pkceRequired = pkceRequired;
                return this;
            }

            /**
             * The list of logout redirect URIs that are supported by the application.
             */
            public Builder postLogoutRedirectUris(java.util.List < String > postLogoutRedirectUris) {
                this.postLogoutRedirectUris = postLogoutRedirectUris;
                return this;
            }

            /**
             * The list of redirect URIs that are supported by the application.
             */
            public Builder redirectUris(java.util.List < String > redirectUris) {
                this.redirectUris = redirectUris;
                return this;
            }

            /**
             * The validity period of the issued refresh token. Unit: seconds. Default value: 86400.
             */
            public Builder refreshTokenEffective(Long refreshTokenEffective) {
                this.refreshTokenEffective = refreshTokenEffective;
                return this;
            }

            /**
             * The response types that are supported by the application. This parameter is returned when the value of the GrantTypes parameter includes the implicit mode.
             */
            public Builder responseTypes(java.util.List < String > responseTypes) {
                this.responseTypes = responseTypes;
                return this;
            }

            /**
             * The custom expression that is used to generate the subject ID returned for the ID token.
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
    public static class ProtocolEndpointDomain extends TeaModel {
        @NameInMap("Oauth2AuthorizationEndpoint")
        private String oauth2AuthorizationEndpoint;

        @NameInMap("Oauth2DeviceAuthorizationEndpoint")
        private String oauth2DeviceAuthorizationEndpoint;

        @NameInMap("Oauth2RevokeEndpoint")
        private String oauth2RevokeEndpoint;

        @NameInMap("Oauth2TokenEndpoint")
        private String oauth2TokenEndpoint;

        @NameInMap("Oauth2UserinfoEndpoint")
        private String oauth2UserinfoEndpoint;

        @NameInMap("OidcIssuer")
        private String oidcIssuer;

        @NameInMap("OidcJwksEndpoint")
        private String oidcJwksEndpoint;

        @NameInMap("OidcLogoutEndpoint")
        private String oidcLogoutEndpoint;

        @NameInMap("SamlMetaEndpoint")
        private String samlMetaEndpoint;

        @NameInMap("SamlSsoEndpoint")
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
            private String samlSsoEndpoint; 

            /**
             * The OAuth2.0 authorization endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.
             */
            public Builder oauth2AuthorizationEndpoint(String oauth2AuthorizationEndpoint) {
                this.oauth2AuthorizationEndpoint = oauth2AuthorizationEndpoint;
                return this;
            }

            /**
             * The OAuth2.0 device authorization endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.
             */
            public Builder oauth2DeviceAuthorizationEndpoint(String oauth2DeviceAuthorizationEndpoint) {
                this.oauth2DeviceAuthorizationEndpoint = oauth2DeviceAuthorizationEndpoint;
                return this;
            }

            /**
             * The OAuth2.0 token revocation endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.
             */
            public Builder oauth2RevokeEndpoint(String oauth2RevokeEndpoint) {
                this.oauth2RevokeEndpoint = oauth2RevokeEndpoint;
                return this;
            }

            /**
             * The OAuth2.0 token endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.
             */
            public Builder oauth2TokenEndpoint(String oauth2TokenEndpoint) {
                this.oauth2TokenEndpoint = oauth2TokenEndpoint;
                return this;
            }

            /**
             * The OIDC UserInfo endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.
             */
            public Builder oauth2UserinfoEndpoint(String oauth2UserinfoEndpoint) {
                this.oauth2UserinfoEndpoint = oauth2UserinfoEndpoint;
                return this;
            }

            /**
             * The information about the OIDC issuer. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.
             */
            public Builder oidcIssuer(String oidcIssuer) {
                this.oidcIssuer = oidcIssuer;
                return this;
            }

            /**
             * The JSON Web Key Set (JWKS) URL of the OIDC issuer. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.
             */
            public Builder oidcJwksEndpoint(String oidcJwksEndpoint) {
                this.oidcJwksEndpoint = oidcJwksEndpoint;
                return this;
            }

            /**
             * The OIDC relying party (RP)-initiated logout endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.
             */
            public Builder oidcLogoutEndpoint(String oidcLogoutEndpoint) {
                this.oidcLogoutEndpoint = oidcLogoutEndpoint;
                return this;
            }

            /**
             * The metadata URL of the SAML protocol. This parameter is returned only when the SSO protocol of the application is SAML 2.0.
             */
            public Builder samlMetaEndpoint(String samlMetaEndpoint) {
                this.samlMetaEndpoint = samlMetaEndpoint;
                return this;
            }

            /**
             * The request receiving URL of the SAML protocol. This parameter is returned only when the SSO protocol of the application is SAML 2.0.
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
    public static class AttributeStatements extends TeaModel {
        @NameInMap("AttributeName")
        private String attributeName;

        @NameInMap("AttributeValueExpression")
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

            /**
             * The attribute name.
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * The expression that is used to generate the value of the attribute.
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
    public static class SamlSsoConfig extends TeaModel {
        @NameInMap("AttributeStatements")
        private java.util.List < AttributeStatements> attributeStatements;

        @NameInMap("DefaultRelayState")
        private String defaultRelayState;

        @NameInMap("NameIdFormat")
        private String nameIdFormat;

        @NameInMap("NameIdValueExpression")
        private String nameIdValueExpression;

        @NameInMap("SignatureAlgorithm")
        private String signatureAlgorithm;

        @NameInMap("SpEntityId")
        private String spEntityId;

        @NameInMap("SpSsoAcsUrl")
        private String spSsoAcsUrl;

        private SamlSsoConfig(Builder builder) {
            this.attributeStatements = builder.attributeStatements;
            this.defaultRelayState = builder.defaultRelayState;
            this.nameIdFormat = builder.nameIdFormat;
            this.nameIdValueExpression = builder.nameIdValueExpression;
            this.signatureAlgorithm = builder.signatureAlgorithm;
            this.spEntityId = builder.spEntityId;
            this.spSsoAcsUrl = builder.spSsoAcsUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SamlSsoConfig create() {
            return builder().build();
        }

        /**
         * @return attributeStatements
         */
        public java.util.List < AttributeStatements> getAttributeStatements() {
            return this.attributeStatements;
        }

        /**
         * @return defaultRelayState
         */
        public String getDefaultRelayState() {
            return this.defaultRelayState;
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
         * @return spSsoAcsUrl
         */
        public String getSpSsoAcsUrl() {
            return this.spSsoAcsUrl;
        }

        public static final class Builder {
            private java.util.List < AttributeStatements> attributeStatements; 
            private String defaultRelayState; 
            private String nameIdFormat; 
            private String nameIdValueExpression; 
            private String signatureAlgorithm; 
            private String spEntityId; 
            private String spSsoAcsUrl; 

            /**
             * The additional user attributes in the SAML assertion.
             */
            public Builder attributeStatements(java.util.List < AttributeStatements> attributeStatements) {
                this.attributeStatements = attributeStatements;
                return this;
            }

            /**
             * The default value of the RelayState attribute. If the SSO request is initiated in EIAM, the RelayState attribute in the SAML response is set to this default value.
             */
            public Builder defaultRelayState(String defaultRelayState) {
                this.defaultRelayState = defaultRelayState;
                return this;
            }

            /**
             * The Format attribute of the NameID element in the SAML assertion. Valid values:
             * <p>
             * 
             * *   urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified: No format is specified. How to resolve the NameID element depends on the application.
             * *   urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress: The NameID element must be an email address.
             * *   urn:oasis:names:tc:SAML:2.0:nameid-format:persistent: The NameID element must be persistent.
             * *   urn:oasis:names:tc:SAML:2.0:nameid-format:transient: The NameID element must be transient.
             */
            public Builder nameIdFormat(String nameIdFormat) {
                this.nameIdFormat = nameIdFormat;
                return this;
            }

            /**
             * The expression that is used to generate the value of NameID in the SAML assertion.
             */
            public Builder nameIdValueExpression(String nameIdValueExpression) {
                this.nameIdValueExpression = nameIdValueExpression;
                return this;
            }

            /**
             * The algorithm that is used to calculate the signature for the SAML assertion.
             */
            public Builder signatureAlgorithm(String signatureAlgorithm) {
                this.signatureAlgorithm = signatureAlgorithm;
                return this;
            }

            /**
             * The entity ID of the application in SAML. The application assumes the role of service provider.
             */
            public Builder spEntityId(String spEntityId) {
                this.spEntityId = spEntityId;
                return this;
            }

            /**
             * The Assertion Consumer Service (ACS) URL of the application in SAML. The application assumes the role of service provider.
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
    public static class ApplicationSsoConfig extends TeaModel {
        @NameInMap("InitLoginType")
        private String initLoginType;

        @NameInMap("InitLoginUrl")
        private String initLoginUrl;

        @NameInMap("OidcSsoConfig")
        private OidcSsoConfig oidcSsoConfig;

        @NameInMap("ProtocolEndpointDomain")
        private ProtocolEndpointDomain protocolEndpointDomain;

        @NameInMap("SamlSsoConfig")
        private SamlSsoConfig samlSsoConfig;

        @NameInMap("SsoStatus")
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

            /**
             * The initial SSO method. Valid values:
             * <p>
             * 
             * *   only_app_init_sso: Only application-initiated SSO is allowed. This method is selected by default when the SSO protocol of the application is an OIDC protocol. If this method is selected when the SSO protocol of the application is SAML, the InitLoginUrl parameter is required.
             * *   idaas_or_app_init_sso: IDaaS-initiated SSO and application-initiated SSO are allowed. This method is selected by default when the SSO protocol of the application is SAML. If this method is selected when the SSO protocol of the application is an OIDC protocol, the InitLoginUrl parameter is required.
             */
            public Builder initLoginType(String initLoginType) {
                this.initLoginType = initLoginType;
                return this;
            }

            /**
             * The initial webhook URL of SSO. This parameter is required when the SSO protocol of the application is an OIDC protocol and the InitLoginType parameters is set to idaas_or_app_init_sso or when the SSO protocol of the application is SAML and the InitLoginType parameter is set to only_app_init_sso.
             */
            public Builder initLoginUrl(String initLoginUrl) {
                this.initLoginUrl = initLoginUrl;
                return this;
            }

            /**
             * The Open ID Connect (OIDC)-based SSO configuration attributes of the application. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.
             */
            public Builder oidcSsoConfig(OidcSsoConfig oidcSsoConfig) {
                this.oidcSsoConfig = oidcSsoConfig;
                return this;
            }

            /**
             * The configuration of the metadata endpoint provided by the application.
             */
            public Builder protocolEndpointDomain(ProtocolEndpointDomain protocolEndpointDomain) {
                this.protocolEndpointDomain = protocolEndpointDomain;
                return this;
            }

            /**
             * The Security Assertion Markup Language (SAML)-based SSO configuration attributes of the application. This parameter is returned only when the SSO protocol of the application is SAML 2.0.
             */
            public Builder samlSsoConfig(SamlSsoConfig samlSsoConfig) {
                this.samlSsoConfig = samlSsoConfig;
                return this;
            }

            /**
             * The SSO feature status of the application. Valid values:
             * <p>
             * 
             * *   enabled: The feature is enabled.
             * *   disabled: The feature is disabled.
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
