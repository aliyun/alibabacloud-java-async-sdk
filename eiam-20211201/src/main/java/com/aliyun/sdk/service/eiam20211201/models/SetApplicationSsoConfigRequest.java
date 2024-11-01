// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetApplicationSsoConfigRequest} extends {@link RequestModel}
 *
 * <p>SetApplicationSsoConfigRequest</p>
 */
public class SetApplicationSsoConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitLoginType")
    private String initLoginType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitLoginUrl")
    private String initLoginUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OidcSsoConfig")
    private OidcSsoConfig oidcSsoConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SamlSsoConfig")
    private SamlSsoConfig samlSsoConfig;

    private SetApplicationSsoConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.initLoginType = builder.initLoginType;
        this.initLoginUrl = builder.initLoginUrl;
        this.instanceId = builder.instanceId;
        this.oidcSsoConfig = builder.oidcSsoConfig;
        this.samlSsoConfig = builder.samlSsoConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetApplicationSsoConfigRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return oidcSsoConfig
     */
    public OidcSsoConfig getOidcSsoConfig() {
        return this.oidcSsoConfig;
    }

    /**
     * @return samlSsoConfig
     */
    public SamlSsoConfig getSamlSsoConfig() {
        return this.samlSsoConfig;
    }

    public static final class Builder extends Request.Builder<SetApplicationSsoConfigRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String initLoginType; 
        private String initLoginUrl; 
        private String instanceId; 
        private OidcSsoConfig oidcSsoConfig; 
        private SamlSsoConfig samlSsoConfig; 

        private Builder() {
            super();
        } 

        private Builder(SetApplicationSsoConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.initLoginType = request.initLoginType;
            this.initLoginUrl = request.initLoginUrl;
            this.instanceId = request.instanceId;
            this.oidcSsoConfig = request.oidcSsoConfig;
            this.samlSsoConfig = request.samlSsoConfig;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The initial SSO method. Valid values:</p>
         * <ul>
         * <li>only_app_init_sso: Only application-initiated SSO is allowed. This method is selected by default when the SSO protocol of the application is an OIDC protocol. If this method is selected when the SSO protocol of the application is SAML, the InitLoginUrl parameter is required.</li>
         * <li>idaas_or_app_init_sso: IDaaS-initiated SSO and application-initiated SSO are allowed. This method is selected by default when the SSO protocol of the application is SAML. If this method is selected when the SSO protocol of the application is an OIDC protocol, the InitLoginUrl parameter is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>only_app_init_sso</p>
         */
        public Builder initLoginType(String initLoginType) {
            this.putQueryParameter("InitLoginType", initLoginType);
            this.initLoginType = initLoginType;
            return this;
        }

        /**
         * <p>The initial webhook URL of SSO. This parameter is required when the SSO protocol of the application is an OIDC protocol and the InitLoginType parameters is set to idaas_or_app_init_sso or when the SSO protocol of the application is SAML and the InitLoginType parameter is set to only_app_init_sso.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://127.0.0.1:8000/start_login?enterprise_code=ABCDEF">http://127.0.0.1:8000/start_login?enterprise_code=ABCDEF</a></p>
         */
        public Builder initLoginUrl(String initLoginUrl) {
            this.putQueryParameter("InitLoginUrl", initLoginUrl);
            this.initLoginUrl = initLoginUrl;
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
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The Open ID Connect (OIDC)-based SSO configuration attributes of the application.</p>
         */
        public Builder oidcSsoConfig(OidcSsoConfig oidcSsoConfig) {
            this.putQueryParameter("OidcSsoConfig", oidcSsoConfig);
            this.oidcSsoConfig = oidcSsoConfig;
            return this;
        }

        /**
         * <p>The Security Assertion Markup Language (SAML)-based single sign-on (SSO) configuration attributes of the application.</p>
         */
        public Builder samlSsoConfig(SamlSsoConfig samlSsoConfig) {
            this.putQueryParameter("SamlSsoConfig", samlSsoConfig);
            this.samlSsoConfig = samlSsoConfig;
            return this;
        }

        @Override
        public SetApplicationSsoConfigRequest build() {
            return new SetApplicationSsoConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetApplicationSsoConfigRequest} extends {@link TeaModel}
     *
     * <p>SetApplicationSsoConfigRequest</p>
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

            /**
             * <p>The claim name.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;Role&quot;</p>
             */
            public Builder claimName(String claimName) {
                this.claimName = claimName;
                return this;
            }

            /**
             * <p>The expression that is used to generate the value of the claim.</p>
             * 
             * <strong>example:</strong>
             * <p>user.dict.applicationRole</p>
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
     * {@link SetApplicationSsoConfigRequest} extends {@link TeaModel}
     *
     * <p>SetApplicationSsoConfigRequest</p>
     */
    public static class OidcSsoConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTokenEffectiveTime")
        private Long accessTokenEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("CodeEffectiveTime")
        private Long codeEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("CustomClaims")
        private java.util.List < CustomClaims> customClaims;

        @com.aliyun.core.annotation.NameInMap("GrantScopes")
        private java.util.List < String > grantScopes;

        @com.aliyun.core.annotation.NameInMap("GrantTypes")
        private java.util.List < String > grantTypes;

        @com.aliyun.core.annotation.NameInMap("IdTokenEffectiveTime")
        private Long idTokenEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("PasswordAuthenticationSourceId")
        private String passwordAuthenticationSourceId;

        @com.aliyun.core.annotation.NameInMap("PasswordTotpMfaRequired")
        private Boolean passwordTotpMfaRequired;

        @com.aliyun.core.annotation.NameInMap("PkceChallengeMethods")
        private java.util.List < String > pkceChallengeMethods;

        @com.aliyun.core.annotation.NameInMap("PkceRequired")
        private Boolean pkceRequired;

        @com.aliyun.core.annotation.NameInMap("PostLogoutRedirectUris")
        private java.util.List < String > postLogoutRedirectUris;

        @com.aliyun.core.annotation.NameInMap("RedirectUris")
        private java.util.List < String > redirectUris;

        @com.aliyun.core.annotation.NameInMap("RefreshTokenEffective")
        private Long refreshTokenEffective;

        @com.aliyun.core.annotation.NameInMap("ResponseTypes")
        private java.util.List < String > responseTypes;

        @com.aliyun.core.annotation.NameInMap("SubjectIdExpression")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
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
             * <p>The validity period of the issued access token. Unit: seconds. Default value: 1200.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder accessTokenEffectiveTime(Long accessTokenEffectiveTime) {
                this.accessTokenEffectiveTime = accessTokenEffectiveTime;
                return this;
            }

            /**
             * <p>The validity period of the issued code. Unit: seconds. Default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder codeEffectiveTime(Long codeEffectiveTime) {
                this.codeEffectiveTime = codeEffectiveTime;
                return this;
            }

            /**
             * <p>The custom claims that are returned for the ID token.</p>
             */
            public Builder customClaims(java.util.List < CustomClaims> customClaims) {
                this.customClaims = customClaims;
                return this;
            }

            /**
             * <p>The scopes of user attributes that can be returned for the UserInfo endpoint or ID token.</p>
             * 
             * <strong>example:</strong>
             * <p>profile，email</p>
             */
            public Builder grantScopes(java.util.List < String > grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            /**
             * <p>The list of grant types that are supported for OIDC protocols.</p>
             * 
             * <strong>example:</strong>
             * <p>authorization_code</p>
             */
            public Builder grantTypes(java.util.List < String > grantTypes) {
                this.grantTypes = grantTypes;
                return this;
            }

            /**
             * <p>The validity period of the issued ID token. Unit: seconds. Default value: 300.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder idTokenEffectiveTime(Long idTokenEffectiveTime) {
                this.idTokenEffectiveTime = idTokenEffectiveTime;
                return this;
            }

            /**
             * <p>The ID of the identity authentication source in password mode. Specify this parameter only when the value of the GrantTypes parameter includes the password mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ia_password</p>
             */
            public Builder passwordAuthenticationSourceId(String passwordAuthenticationSourceId) {
                this.passwordAuthenticationSourceId = passwordAuthenticationSourceId;
                return this;
            }

            /**
             * <p>Specifies whether time-based one-time password (TOTP) authentication is required in password mode. Specify this parameter only when the value of the GrantTypes parameter includes the password mode.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder passwordTotpMfaRequired(Boolean passwordTotpMfaRequired) {
                this.passwordTotpMfaRequired = passwordTotpMfaRequired;
                return this;
            }

            /**
             * <p>The algorithms that are used to calculate the code challenge for PKCE.</p>
             * 
             * <strong>example:</strong>
             * <p>S256</p>
             */
            public Builder pkceChallengeMethods(java.util.List < String > pkceChallengeMethods) {
                this.pkceChallengeMethods = pkceChallengeMethods;
                return this;
            }

            /**
             * <p>Specifies whether the SSO of the application requires Proof Key for Code Exchange (PKCE) (RFC 7636).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pkceRequired(Boolean pkceRequired) {
                this.pkceRequired = pkceRequired;
                return this;
            }

            /**
             * <p>The list of logout redirect URIs that are supported by the application.</p>
             */
            public Builder postLogoutRedirectUris(java.util.List < String > postLogoutRedirectUris) {
                this.postLogoutRedirectUris = postLogoutRedirectUris;
                return this;
            }

            /**
             * <p>The list of redirect URIs that are supported by the application.</p>
             */
            public Builder redirectUris(java.util.List < String > redirectUris) {
                this.redirectUris = redirectUris;
                return this;
            }

            /**
             * <p>The validity period of the issued refresh token. Unit: seconds. Default value: 86400.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder refreshTokenEffective(Long refreshTokenEffective) {
                this.refreshTokenEffective = refreshTokenEffective;
                return this;
            }

            /**
             * <p>The response types that are supported by the application. Specify this parameter when the value of the GrantTypes parameter includes the implicit mode.</p>
             * 
             * <strong>example:</strong>
             * <p>token id_token</p>
             */
            public Builder responseTypes(java.util.List < String > responseTypes) {
                this.responseTypes = responseTypes;
                return this;
            }

            /**
             * <p>The custom expression that is used to generate the subject ID returned for the ID token.</p>
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
     * {@link SetApplicationSsoConfigRequest} extends {@link TeaModel}
     *
     * <p>SetApplicationSsoConfigRequest</p>
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

            /**
             * <p>The attribute name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com/SAML-Role/Attributes/RoleSessionName">https://www.aliyun.com/SAML-Role/Attributes/RoleSessionName</a></p>
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * <p>The expression that is used to generate the value of the attribute.</p>
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
     * {@link SetApplicationSsoConfigRequest} extends {@link TeaModel}
     *
     * <p>SetApplicationSsoConfigRequest</p>
     */
    public static class SamlSsoConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssertionSigned")
        private Boolean assertionSigned;

        @com.aliyun.core.annotation.NameInMap("AttributeStatements")
        private java.util.List < AttributeStatements> attributeStatements;

        @com.aliyun.core.annotation.NameInMap("DefaultRelayState")
        private String defaultRelayState;

        @com.aliyun.core.annotation.NameInMap("IdPEntityId")
        private String idPEntityId;

        @com.aliyun.core.annotation.NameInMap("NameIdFormat")
        private String nameIdFormat;

        @com.aliyun.core.annotation.NameInMap("NameIdValueExpression")
        private String nameIdValueExpression;

        @com.aliyun.core.annotation.NameInMap("ResponseSigned")
        private Boolean responseSigned;

        @com.aliyun.core.annotation.NameInMap("SignatureAlgorithm")
        private String signatureAlgorithm;

        @com.aliyun.core.annotation.NameInMap("SpEntityId")
        private String spEntityId;

        @com.aliyun.core.annotation.NameInMap("SpSsoAcsUrl")
        private String spSsoAcsUrl;

        private SamlSsoConfig(Builder builder) {
            this.assertionSigned = builder.assertionSigned;
            this.attributeStatements = builder.attributeStatements;
            this.defaultRelayState = builder.defaultRelayState;
            this.idPEntityId = builder.idPEntityId;
            this.nameIdFormat = builder.nameIdFormat;
            this.nameIdValueExpression = builder.nameIdValueExpression;
            this.responseSigned = builder.responseSigned;
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
         * @return assertionSigned
         */
        public Boolean getAssertionSigned() {
            return this.assertionSigned;
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
         * @return spSsoAcsUrl
         */
        public String getSpSsoAcsUrl() {
            return this.spSsoAcsUrl;
        }

        public static final class Builder {
            private Boolean assertionSigned; 
            private java.util.List < AttributeStatements> attributeStatements; 
            private String defaultRelayState; 
            private String idPEntityId; 
            private String nameIdFormat; 
            private String nameIdValueExpression; 
            private Boolean responseSigned; 
            private String signatureAlgorithm; 
            private String spEntityId; 
            private String spSsoAcsUrl; 

            /**
             * <p>Specifies whether to calculate the signature for the assertion. You cannot set ResponseSigned and AssertionSigned to false at the same time.</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
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
             * <p>The additional user attributes in the SAML assertion.</p>
             */
            public Builder attributeStatements(java.util.List < AttributeStatements> attributeStatements) {
                this.attributeStatements = attributeStatements;
                return this;
            }

            /**
             * <p>The default value of the RelayState attribute. If the SSO request is initiated in EIAM, the RelayState attribute in the SAML response is set to this default value.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://home.console.aliyun.com">https://home.console.aliyun.com</a></p>
             */
            public Builder defaultRelayState(String defaultRelayState) {
                this.defaultRelayState = defaultRelayState;
                return this;
            }

            /**
             * IdPEntityId.
             */
            public Builder idPEntityId(String idPEntityId) {
                this.idPEntityId = idPEntityId;
                return this;
            }

            /**
             * <p>The Format attribute of the NameID element in the SAML assertion. Valid values:</p>
             * <ul>
             * <li>urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified: No format is specified. How to resolve the NameID element depends on the application.</li>
             * <li>urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress: The NameID element must be an email address.</li>
             * <li>urn:oasis:names:tc:SAML:2.0:nameid-format:persistent: The NameID element must be persistent.</li>
             * <li>urn:oasis:names:tc:SAML:2.0:nameid-format:transient: The NameID element must be transient.</li>
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
             * <p>The expression that is used to generate the value of NameID in the SAML assertion.</p>
             * 
             * <strong>example:</strong>
             * <p>user.email</p>
             */
            public Builder nameIdValueExpression(String nameIdValueExpression) {
                this.nameIdValueExpression = nameIdValueExpression;
                return this;
            }

            /**
             * <p>Specifies whether to calculate the signature for the response. You cannot set ResponseSigned and AssertionSigned to false at the same time.</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
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
             * <p>The algorithm that is used to calculate the signature for the SAML assertion.</p>
             * <p>Enumeration value:</p>
             * <ul>
             * <li><p>RSA-SHA256</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>the Rivest-Shamir-Adleman (RSA)-Secure Hash Algorithm 256 (SHA-256) algorithm</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RSA-SHA256</p>
             */
            public Builder signatureAlgorithm(String signatureAlgorithm) {
                this.signatureAlgorithm = signatureAlgorithm;
                return this;
            }

            /**
             * <p>The entity ID of the application in SAML.</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:cloudcomputing</p>
             */
            public Builder spEntityId(String spEntityId) {
                this.spEntityId = spEntityId;
                return this;
            }

            /**
             * <p>The Assertion Consumer Service (ACS) URL of the application in SAML.</p>
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
}
