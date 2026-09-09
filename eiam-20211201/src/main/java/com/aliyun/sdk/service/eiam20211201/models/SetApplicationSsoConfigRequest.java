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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
        this.clientToken = builder.clientToken;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
        private String clientToken; 
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
            this.clientToken = request.clientToken;
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
         * <p>The application ID.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request. Generate a unique value from your client. The value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.</p>
         * 
         * <strong>example:</strong>
         * <p>client-examplexxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The initial single sign-on (SSO) logon method. Valid values:</p>
         * <ul>
         * <li>only_app_init_sso: Only application-initiated SSO is supported. This is the default value for OIDC protocol applications. When a SAML application uses this method, InitLoginUrl must be specified.</li>
         * <li>idaas_or_app_init_sso: Both IDaaS portal-initiated and application-initiated SSO are supported. This is the default value for SAML protocol applications. When an OIDC protocol application uses this method, InitLoginUrl must be specified.</li>
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
         * <p>The initial single sign-on (SSO) logon trigger URL.
         * This parameter is required when an OIDC protocol application sets InitLoginType to idaas_or_app_init_sso.
         * This parameter is required when a SAML protocol application sets InitLoginType to only_app_init_sso.</p>
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
         * <p>The SSO configuration parameters for an OIDC-based application.</p>
         */
        public Builder oidcSsoConfig(OidcSsoConfig oidcSsoConfig) {
            this.putQueryParameter("OidcSsoConfig", oidcSsoConfig);
            this.oidcSsoConfig = oidcSsoConfig;
            return this;
        }

        /**
         * <p>The SSO configuration parameters for a SAML-based application.</p>
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
             * <p>&quot;Role&quot;</p>
             */
            public Builder claimName(String claimName) {
                this.claimName = claimName;
                return this;
            }

            /**
             * <p>The value expression of the returned claim.</p>
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

        @com.aliyun.core.annotation.NameInMap("AllowedPublicClient")
        private Boolean allowedPublicClient;

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
        @com.aliyun.core.annotation.Validation(maxLength = 128)
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
        public Boolean getAllowedPublicClient() {
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
            private Boolean allowedPublicClient; 
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
             * <p>Specifies whether the application is allowed to act as a public client to request the IDaaS EIAM authorization server. This parameter can be enabled only in authorization code mode and device mode. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowedPublicClient(Boolean allowedPublicClient) {
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
             * <p>The custom user information included in the returned ID token.</p>
             */
            public Builder customClaims(java.util.List<CustomClaims> customClaims) {
                this.customClaims = customClaims;
                return this;
            }

            /**
             * <p>The OIDC standard parameter scope, which specifies the range of user attributes that can be returned by the userinfo endpoint or the id_token.</p>
             * 
             * <strong>example:</strong>
             * <p>profile，email</p>
             */
            public Builder grantScopes(java.util.List<String> grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            /**
             * <p>The list of supported OIDC grant types.</p>
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
             * <p>300</p>
             */
            public Builder idTokenEffectiveTime(Long idTokenEffectiveTime) {
                this.idTokenEffectiveTime = idTokenEffectiveTime;
                return this;
            }

            /**
             * <p>The ID of the authentication source used in password mode. This parameter takes effect only when the GrantTypes specified for the OIDC application include the password mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ia_password</p>
             */
            public Builder passwordAuthenticationSourceId(String passwordAuthenticationSourceId) {
                this.passwordAuthenticationSourceId = passwordAuthenticationSourceId;
                return this;
            }

            /**
             * <p>Specifies whether TOTP-based secondary authentication is required for password mode. This parameter takes effect only when the GrantTypes specified for the OIDC application include the password mode.</p>
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
             * <p>Specifies whether Proof Key for Code Exchange (PKCE) (RFC 7636) is required for application SSO.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pkceRequired(Boolean pkceRequired) {
                this.pkceRequired = pkceRequired;
                return this;
            }

            /**
             * <p>The list of logout callback URIs supported by the application.</p>
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
             * <p>The response types supported by the application when OidcSsoConfig.GrantTypes includes the implicit grant type.</p>
             * 
             * <strong>example:</strong>
             * <p>token id_token</p>
             */
            public Builder responseTypes(java.util.List<String> responseTypes) {
                this.responseTypes = responseTypes;
                return this;
            }

            /**
             * <p>The custom expression for the sub claim value returned in the ID token.</p>
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

            private Builder() {
            } 

            private Builder(AttributeStatements model) {
                this.attributeName = model.attributeName;
                this.attributeValueExpression = model.attributeValueExpression;
            } 

            /**
             * <p>The name of the attribute in the SAML assertion.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com/SAML-Role/Attributes/RoleSessionName">https://www.aliyun.com/SAML-Role/Attributes/RoleSessionName</a></p>
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * <p>The value expression of the attribute in the SAML assertion.</p>
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
    public static class OptionalRelayStates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("RelayState")
        @com.aliyun.core.annotation.Validation(maxLength = 256)
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
             * <p>Ram</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The RelayState value.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ram.console.aliyun.com/">https://ram.console.aliyun.com/</a></p>
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
     * {@link SetApplicationSsoConfigRequest} extends {@link TeaModel}
     *
     * <p>SetApplicationSsoConfigRequest</p>
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
             * <li>true: The assertion is signed.</li>
             * <li>false: The assertion is not signed.</li>
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
             * <p>The additional user attribute configurations included in the SAML assertion.</p>
             */
            public Builder attributeStatements(java.util.List<AttributeStatements> attributeStatements) {
                this.attributeStatements = attributeStatements;
                return this;
            }

            /**
             * <p>The default RelayState value. When a single sign-on (SSO) logon request is initiated by EIAM, the SAML Response provided by EIAM specifies the RelayState as this value.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://home.console.aliyun.com">https://home.console.aliyun.com</a></p>
             */
            public Builder defaultRelayState(String defaultRelayState) {
                this.defaultRelayState = defaultRelayState;
                return this;
            }

            /**
             * <p>The Entity ID that represents the IdP identity in the SAML protocol. URL format and URN format are supported.</p>
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
             * <p>user.email</p>
             */
            public Builder nameIdValueExpression(String nameIdValueExpression) {
                this.nameIdValueExpression = nameIdValueExpression;
                return this;
            }

            /**
             * <p>The optional RelayState configurations.</p>
             */
            public Builder optionalRelayStates(java.util.List<OptionalRelayStates> optionalRelayStates) {
                this.optionalRelayStates = optionalRelayStates;
                return this;
            }

            /**
             * <p>Specifies whether SSO AuthnRequest signature verification is enabled. Default value: false. If set to true, spSigningCertificates must be configured (the array must not be empty).</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder requireAuthnRequestSigned(Boolean requireAuthnRequestSigned) {
                this.requireAuthnRequestSigned = requireAuthnRequestSigned;
                return this;
            }

            /**
             * <p>Specifies whether the response needs to be signed. ResponseSigned and AssertionSigned cannot both be set to false.</p>
             * <ul>
             * <li>true: The response is signed.</li>
             * <li>false: The response is not signed.</li>
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
             * <p>The array of SP signature verification certificates in PEM format. A maximum of two certificates are allowed and are shared by SSO and SLO. Each certificate is validated for format and validity upon write. Requests with more than two certificates are rejected.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE----- MIIC0jCCAbqgAwIBAgIQXXXXX -----END CERTIFICATE-----</p>
             */
            public Builder spSigningCertificates(java.util.List<String> spSigningCertificates) {
                this.spSigningCertificates = spSigningCertificates;
                return this;
            }

            /**
             * <p>The URL on the SP side that receives the LogoutResponse. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/api/slo/response">https://example.com/api/slo/response</a></p>
             */
            public Builder spSloResponseUrl(String spSloResponseUrl) {
                this.spSloResponseUrl = spSloResponseUrl;
                return this;
            }

            /**
             * <p>The SAML assertion consumer service URL of the application (SP).</p>
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
