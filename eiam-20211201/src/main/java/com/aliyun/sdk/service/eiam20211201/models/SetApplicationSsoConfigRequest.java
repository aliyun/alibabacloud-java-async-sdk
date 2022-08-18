// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetApplicationSsoConfigRequest} extends {@link RequestModel}
 *
 * <p>SetApplicationSsoConfigRequest</p>
 */
public class SetApplicationSsoConfigRequest extends Request {
    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true, maxLength = 64)
    private String applicationId;

    @Query
    @NameInMap("InitLoginType")
    private String initLoginType;

    @Query
    @NameInMap("InitLoginUrl")
    private String initLoginUrl;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("OidcSsoConfig")
    private OidcSsoConfig oidcSsoConfig;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SamlSsoConfig")
    private SamlSsoConfig samlSsoConfig;

    private SetApplicationSsoConfigRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.initLoginType = builder.initLoginType;
        this.initLoginUrl = builder.initLoginUrl;
        this.instanceId = builder.instanceId;
        this.oidcSsoConfig = builder.oidcSsoConfig;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return samlSsoConfig
     */
    public SamlSsoConfig getSamlSsoConfig() {
        return this.samlSsoConfig;
    }

    public static final class Builder extends Request.Builder<SetApplicationSsoConfigRequest, Builder> {
        private String applicationId; 
        private String initLoginType; 
        private String initLoginUrl; 
        private String instanceId; 
        private OidcSsoConfig oidcSsoConfig; 
        private String regionId; 
        private SamlSsoConfig samlSsoConfig; 

        private Builder() {
            super();
        } 

        private Builder(SetApplicationSsoConfigRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.initLoginType = request.initLoginType;
            this.initLoginUrl = request.initLoginUrl;
            this.instanceId = request.instanceId;
            this.oidcSsoConfig = request.oidcSsoConfig;
            this.regionId = request.regionId;
            this.samlSsoConfig = request.samlSsoConfig;
        } 

        /**
         * IDaaS的应用主键id
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * 初始化登录方式，only_app_init_sso or idaas_or_app_init_sso
         */
        public Builder initLoginType(String initLoginType) {
            this.putQueryParameter("InitLoginType", initLoginType);
            this.initLoginType = initLoginType;
            return this;
        }

        /**
         * 仅only_app_init_sso情况下，SP指定的登录地址
         */
        public Builder initLoginUrl(String initLoginUrl) {
            this.putQueryParameter("InitLoginUrl", initLoginUrl);
            this.initLoginUrl = initLoginUrl;
            return this;
        }

        /**
         * IDaaS EIAM的实例id
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 单点登录类型为Oidc时可以配置
         */
        public Builder oidcSsoConfig(OidcSsoConfig oidcSsoConfig) {
            this.putQueryParameter("OidcSsoConfig", oidcSsoConfig);
            this.oidcSsoConfig = oidcSsoConfig;
            return this;
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
         * 单点登录类型为saml2时可以配置
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
             * 返回的claim名称
             */
            public Builder claimName(String claimName) {
                this.claimName = claimName;
                return this;
            }

            /**
             * 返回的claim取值表达式
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

        @NameInMap("PkceChallengeMethods")
        private java.util.List < String > pkceChallengeMethods;

        @NameInMap("PkceRequired")
        private Boolean pkceRequired;

        @NameInMap("RedirectUris")
        private java.util.List < String > redirectUris;

        @NameInMap("RefreshTokenEffective")
        private Long refreshTokenEffective;

        @NameInMap("ResponseTypes")
        private java.util.List < String > responseTypes;

        @NameInMap("SubjectIdExpression")
        @Validation(maxLength = 128)
        private String subjectIdExpression;

        private OidcSsoConfig(Builder builder) {
            this.accessTokenEffectiveTime = builder.accessTokenEffectiveTime;
            this.codeEffectiveTime = builder.codeEffectiveTime;
            this.customClaims = builder.customClaims;
            this.grantScopes = builder.grantScopes;
            this.grantTypes = builder.grantTypes;
            this.idTokenEffectiveTime = builder.idTokenEffectiveTime;
            this.pkceChallengeMethods = builder.pkceChallengeMethods;
            this.pkceRequired = builder.pkceRequired;
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
            private java.util.List < String > pkceChallengeMethods; 
            private Boolean pkceRequired; 
            private java.util.List < String > redirectUris; 
            private Long refreshTokenEffective; 
            private java.util.List < String > responseTypes; 
            private String subjectIdExpression; 

            /**
             * 返回的access token有效时间，单位为Second
             */
            public Builder accessTokenEffectiveTime(Long accessTokenEffectiveTime) {
                this.accessTokenEffectiveTime = accessTokenEffectiveTime;
                return this;
            }

            /**
             * Authorization code流中code的有效时间，单位为Second
             */
            public Builder codeEffectiveTime(Long codeEffectiveTime) {
                this.codeEffectiveTime = codeEffectiveTime;
                return this;
            }

            /**
             * 自定义id token返回信息
             */
            public Builder customClaims(java.util.List < CustomClaims> customClaims) {
                this.customClaims = customClaims;
                return this;
            }

            /**
             * OIDC标准参数，如profile、email等
             */
            public Builder grantScopes(java.util.List < String > grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            /**
             * 应用支持的授权类型，OIDC标准参数
             */
            public Builder grantTypes(java.util.List < String > grantTypes) {
                this.grantTypes = grantTypes;
                return this;
            }

            /**
             * id token有效时间，单位为Second
             */
            public Builder idTokenEffectiveTime(Long idTokenEffectiveTime) {
                this.idTokenEffectiveTime = idTokenEffectiveTime;
                return this;
            }

            /**
             * 支持的PKCE算法类型
             */
            public Builder pkceChallengeMethods(java.util.List < String > pkceChallengeMethods) {
                this.pkceChallengeMethods = pkceChallengeMethods;
                return this;
            }

            /**
             * 是否强制PKCE,authorization_code强制必须指定PKCE参数
             */
            public Builder pkceRequired(Boolean pkceRequired) {
                this.pkceRequired = pkceRequired;
                return this;
            }

            /**
             * 应用支持的回调的uri列表，OIDC标准参数
             */
            public Builder redirectUris(java.util.List < String > redirectUris) {
                this.redirectUris = redirectUris;
                return this;
            }

            /**
             * refresh token有效时间，单位为Second
             */
            public Builder refreshTokenEffective(Long refreshTokenEffective) {
                this.refreshTokenEffective = refreshTokenEffective;
                return this;
            }

            /**
             * 隐式流支持的返回类型，OIDC标准参数，如token id_token
             */
            public Builder responseTypes(java.util.List < String > responseTypes) {
                this.responseTypes = responseTypes;
                return this;
            }

            /**
             * 自定义id token返回信息
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
             * SAML属性的Name
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * SAML属性取值表达式
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
             * SAML断言的属性配置
             */
            public Builder attributeStatements(java.util.List < AttributeStatements> attributeStatements) {
                this.attributeStatements = attributeStatements;
                return this;
            }

            /**
             * 默认RelayState取值，可空
             */
            public Builder defaultRelayState(String defaultRelayState) {
                this.defaultRelayState = defaultRelayState;
                return this;
            }

            /**
             * SAML标准协议中的NameID格式
             */
            public Builder nameIdFormat(String nameIdFormat) {
                this.nameIdFormat = nameIdFormat;
                return this;
            }

            /**
             * 返回的claim名称
             */
            public Builder nameIdValueExpression(String nameIdValueExpression) {
                this.nameIdValueExpression = nameIdValueExpression;
                return this;
            }

            /**
             * IDaaS签发SAML断言时使用的签名算法
             */
            public Builder signatureAlgorithm(String signatureAlgorithm) {
                this.signatureAlgorithm = signatureAlgorithm;
                return this;
            }

            /**
             * SP的EntityId，用于唯一标识SP身份
             */
            public Builder spEntityId(String spEntityId) {
                this.spEntityId = spEntityId;
                return this;
            }

            /**
             * SP的SSO地址，用于接受IDaaS签发的SAML断言
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
