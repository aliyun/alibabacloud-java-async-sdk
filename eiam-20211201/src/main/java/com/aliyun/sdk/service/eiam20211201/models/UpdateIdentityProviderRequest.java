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
 * {@link UpdateIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateIdentityProviderRequest</p>
 */
public class UpdateIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DingtalkAppConfig")
    private DingtalkAppConfig dingtalkAppConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String identityProviderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
    private String identityProviderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LarkConfig")
    private LarkConfig larkConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LdapConfig")
    private LdapConfig ldapConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogoUrl")
    private String logoUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointId")
    private String networkAccessEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OidcConfig")
    private OidcConfig oidcConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WeComConfig")
    private WeComConfig weComConfig;

    private UpdateIdentityProviderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dingtalkAppConfig = builder.dingtalkAppConfig;
        this.identityProviderId = builder.identityProviderId;
        this.identityProviderName = builder.identityProviderName;
        this.instanceId = builder.instanceId;
        this.larkConfig = builder.larkConfig;
        this.ldapConfig = builder.ldapConfig;
        this.logoUrl = builder.logoUrl;
        this.networkAccessEndpointId = builder.networkAccessEndpointId;
        this.oidcConfig = builder.oidcConfig;
        this.weComConfig = builder.weComConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIdentityProviderRequest create() {
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
     * @return dingtalkAppConfig
     */
    public DingtalkAppConfig getDingtalkAppConfig() {
        return this.dingtalkAppConfig;
    }

    /**
     * @return identityProviderId
     */
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    /**
     * @return identityProviderName
     */
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return larkConfig
     */
    public LarkConfig getLarkConfig() {
        return this.larkConfig;
    }

    /**
     * @return ldapConfig
     */
    public LdapConfig getLdapConfig() {
        return this.ldapConfig;
    }

    /**
     * @return logoUrl
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * @return networkAccessEndpointId
     */
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    /**
     * @return oidcConfig
     */
    public OidcConfig getOidcConfig() {
        return this.oidcConfig;
    }

    /**
     * @return weComConfig
     */
    public WeComConfig getWeComConfig() {
        return this.weComConfig;
    }

    public static final class Builder extends Request.Builder<UpdateIdentityProviderRequest, Builder> {
        private String regionId; 
        private DingtalkAppConfig dingtalkAppConfig; 
        private String identityProviderId; 
        private String identityProviderName; 
        private String instanceId; 
        private LarkConfig larkConfig; 
        private LdapConfig ldapConfig; 
        private String logoUrl; 
        private String networkAccessEndpointId; 
        private OidcConfig oidcConfig; 
        private WeComConfig weComConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIdentityProviderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dingtalkAppConfig = request.dingtalkAppConfig;
            this.identityProviderId = request.identityProviderId;
            this.identityProviderName = request.identityProviderName;
            this.instanceId = request.instanceId;
            this.larkConfig = request.larkConfig;
            this.ldapConfig = request.ldapConfig;
            this.logoUrl = request.logoUrl;
            this.networkAccessEndpointId = request.networkAccessEndpointId;
            this.oidcConfig = request.oidcConfig;
            this.weComConfig = request.weComConfig;
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
         * <p>钉钉出基本信息</p>
         */
        public Builder dingtalkAppConfig(DingtalkAppConfig dingtalkAppConfig) {
            this.putQueryParameter("DingtalkAppConfig", dingtalkAppConfig);
            this.dingtalkAppConfig = dingtalkAppConfig;
            return this;
        }

        /**
         * <p>IDaaS的身份提供方主键id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
         */
        public Builder identityProviderId(String identityProviderId) {
            this.putQueryParameter("IdentityProviderId", identityProviderId);
            this.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * <p>身份提供方名称</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder identityProviderName(String identityProviderName) {
            this.putQueryParameter("IdentityProviderName", identityProviderName);
            this.identityProviderName = identityProviderName;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
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
         * <p>飞书配置</p>
         */
        public Builder larkConfig(LarkConfig larkConfig) {
            this.putQueryParameter("LarkConfig", larkConfig);
            this.larkConfig = larkConfig;
            return this;
        }

        /**
         * <p>AD/LDAP基本信息</p>
         */
        public Builder ldapConfig(LdapConfig ldapConfig) {
            this.putQueryParameter("LdapConfig", ldapConfig);
            this.ldapConfig = ldapConfig;
            return this;
        }

        /**
         * LogoUrl.
         */
        public Builder logoUrl(String logoUrl) {
            this.putQueryParameter("LogoUrl", logoUrl);
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * <p>网络端点ID</p>
         * 
         * <strong>example:</strong>
         * <p>nae_examplexxxx</p>
         */
        public Builder networkAccessEndpointId(String networkAccessEndpointId) {
            this.putQueryParameter("NetworkAccessEndpointId", networkAccessEndpointId);
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }

        /**
         * <p>OIDC IdP配置。</p>
         */
        public Builder oidcConfig(OidcConfig oidcConfig) {
            this.putQueryParameter("OidcConfig", oidcConfig);
            this.oidcConfig = oidcConfig;
            return this;
        }

        /**
         * <p>企业微信基本信息</p>
         */
        public Builder weComConfig(WeComConfig weComConfig) {
            this.putQueryParameter("WeComConfig", weComConfig);
            this.weComConfig = weComConfig;
            return this;
        }

        @Override
        public UpdateIdentityProviderRequest build() {
            return new UpdateIdentityProviderRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class DingtalkAppConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        @com.aliyun.core.annotation.Validation(required = true)
        private String appSecret;

        private DingtalkAppConfig(Builder builder) {
            this.appKey = builder.appKey;
            this.appSecret = builder.appSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingtalkAppConfig create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        public static final class Builder {
            private String appKey; 
            private String appSecret; 

            /**
             * <p>钉钉一方应用的AppKey</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>49nyeaqumk7f</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>钉钉一方应用的AppSecret</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>86nozWFL2CxgwnhKiXaG8dN4keLPkUNc5xxxx</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            public DingtalkAppConfig build() {
                return new DingtalkAppConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class LarkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("EncryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("VerificationToken")
        private String verificationToken;

        private LarkConfig(Builder builder) {
            this.appId = builder.appId;
            this.appSecret = builder.appSecret;
            this.encryptKey = builder.encryptKey;
            this.verificationToken = builder.verificationToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LarkConfig create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        /**
         * @return encryptKey
         */
        public String getEncryptKey() {
            return this.encryptKey;
        }

        /**
         * @return verificationToken
         */
        public String getVerificationToken() {
            return this.verificationToken;
        }

        public static final class Builder {
            private String appId; 
            private String appSecret; 
            private String encryptKey; 
            private String verificationToken; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>钉钉一方应用的AppSecret</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>86nozWFL2CxgwnhKiXaG8dN4keLPkUNc5xxxx</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * EncryptKey.
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * VerificationToken.
             */
            public Builder verificationToken(String verificationToken) {
                this.verificationToken = verificationToken;
                return this;
            }

            public LarkConfig build() {
                return new LarkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class LdapConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdministratorPassword")
        private String administratorPassword;

        @com.aliyun.core.annotation.NameInMap("AdministratorUsername")
        private String administratorUsername;

        @com.aliyun.core.annotation.NameInMap("CertificateFingerprintStatus")
        private String certificateFingerprintStatus;

        @com.aliyun.core.annotation.NameInMap("CertificateFingerprints")
        private java.util.List<String> certificateFingerprints;

        @com.aliyun.core.annotation.NameInMap("LdapProtocol")
        private String ldapProtocol;

        @com.aliyun.core.annotation.NameInMap("LdapServerHost")
        private String ldapServerHost;

        @com.aliyun.core.annotation.NameInMap("LdapServerPort")
        private Integer ldapServerPort;

        @com.aliyun.core.annotation.NameInMap("StartTlsStatus")
        private String startTlsStatus;

        private LdapConfig(Builder builder) {
            this.administratorPassword = builder.administratorPassword;
            this.administratorUsername = builder.administratorUsername;
            this.certificateFingerprintStatus = builder.certificateFingerprintStatus;
            this.certificateFingerprints = builder.certificateFingerprints;
            this.ldapProtocol = builder.ldapProtocol;
            this.ldapServerHost = builder.ldapServerHost;
            this.ldapServerPort = builder.ldapServerPort;
            this.startTlsStatus = builder.startTlsStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LdapConfig create() {
            return builder().build();
        }

        /**
         * @return administratorPassword
         */
        public String getAdministratorPassword() {
            return this.administratorPassword;
        }

        /**
         * @return administratorUsername
         */
        public String getAdministratorUsername() {
            return this.administratorUsername;
        }

        /**
         * @return certificateFingerprintStatus
         */
        public String getCertificateFingerprintStatus() {
            return this.certificateFingerprintStatus;
        }

        /**
         * @return certificateFingerprints
         */
        public java.util.List<String> getCertificateFingerprints() {
            return this.certificateFingerprints;
        }

        /**
         * @return ldapProtocol
         */
        public String getLdapProtocol() {
            return this.ldapProtocol;
        }

        /**
         * @return ldapServerHost
         */
        public String getLdapServerHost() {
            return this.ldapServerHost;
        }

        /**
         * @return ldapServerPort
         */
        public Integer getLdapServerPort() {
            return this.ldapServerPort;
        }

        /**
         * @return startTlsStatus
         */
        public String getStartTlsStatus() {
            return this.startTlsStatus;
        }

        public static final class Builder {
            private String administratorPassword; 
            private String administratorUsername; 
            private String certificateFingerprintStatus; 
            private java.util.List<String> certificateFingerprints; 
            private String ldapProtocol; 
            private String ldapServerHost; 
            private Integer ldapServerPort; 
            private String startTlsStatus; 

            /**
             * <p>管理员密码</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder administratorPassword(String administratorPassword) {
                this.administratorPassword = administratorPassword;
                return this;
            }

            /**
             * <p>管理员账号</p>
             * 
             * <strong>example:</strong>
             * <p>DC=example,DC=com</p>
             */
            public Builder administratorUsername(String administratorUsername) {
                this.administratorUsername = administratorUsername;
                return this;
            }

            /**
             * <p>是否验证指纹证书</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder certificateFingerprintStatus(String certificateFingerprintStatus) {
                this.certificateFingerprintStatus = certificateFingerprintStatus;
                return this;
            }

            /**
             * <p>证书指纹列表</p>
             */
            public Builder certificateFingerprints(java.util.List<String> certificateFingerprints) {
                this.certificateFingerprints = certificateFingerprints;
                return this;
            }

            /**
             * <p>通信协议</p>
             * 
             * <strong>example:</strong>
             * <p>ldap</p>
             */
            public Builder ldapProtocol(String ldapProtocol) {
                this.ldapProtocol = ldapProtocol;
                return this;
            }

            /**
             * <p>ad/ldap 服务器地址</p>
             * 
             * <strong>example:</strong>
             * <p>123.xx.xx.89</p>
             */
            public Builder ldapServerHost(String ldapServerHost) {
                this.ldapServerHost = ldapServerHost;
                return this;
            }

            /**
             * <p>端口号</p>
             * 
             * <strong>example:</strong>
             * <p>636</p>
             */
            public Builder ldapServerPort(Integer ldapServerPort) {
                this.ldapServerPort = ldapServerPort;
                return this;
            }

            /**
             * <p>startTls是否开启</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder startTlsStatus(String startTlsStatus) {
                this.startTlsStatus = startTlsStatus;
                return this;
            }

            public LdapConfig build() {
                return new LdapConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class AuthnParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthnMethod")
        private String authnMethod;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        private AuthnParam(Builder builder) {
            this.authnMethod = builder.authnMethod;
            this.clientSecret = builder.clientSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthnParam create() {
            return builder().build();
        }

        /**
         * @return authnMethod
         */
        public String getAuthnMethod() {
            return this.authnMethod;
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
        }

        public static final class Builder {
            private String authnMethod; 
            private String clientSecret; 

            /**
             * <p>OIDC/oAuth2 认证方法。</p>
             * 
             * <strong>example:</strong>
             * <p>client_secret_post</p>
             */
            public Builder authnMethod(String authnMethod) {
                this.authnMethod = authnMethod;
                return this;
            }

            /**
             * <p>OIDC/oAuth2 客户端密钥。</p>
             * 
             * <strong>example:</strong>
             * <p>CSEHDddddddxxxxuxkJEHPveWRXBGqVqRsxxxx</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            public AuthnParam build() {
                return new AuthnParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class EndpointConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationEndpoint")
        private String authorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("JwksUri")
        private String jwksUri;

        @com.aliyun.core.annotation.NameInMap("TokenEndpoint")
        private String tokenEndpoint;

        @com.aliyun.core.annotation.NameInMap("UserinfoEndpoint")
        private String userinfoEndpoint;

        private EndpointConfig(Builder builder) {
            this.authorizationEndpoint = builder.authorizationEndpoint;
            this.issuer = builder.issuer;
            this.jwksUri = builder.jwksUri;
            this.tokenEndpoint = builder.tokenEndpoint;
            this.userinfoEndpoint = builder.userinfoEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointConfig create() {
            return builder().build();
        }

        /**
         * @return authorizationEndpoint
         */
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return jwksUri
         */
        public String getJwksUri() {
            return this.jwksUri;
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
            private String issuer; 
            private String jwksUri; 
            private String tokenEndpoint; 
            private String userinfoEndpoint; 

            /**
             * <p>oAuth2 授权端点。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/authorize">https://example.com/oauth/authorize</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>OIDC issuer信息。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth">https://example.com/oauth</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>OIDC jwks地址。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/jwks">https://example.com/oauth/jwks</a></p>
             */
            public Builder jwksUri(String jwksUri) {
                this.jwksUri = jwksUri;
                return this;
            }

            /**
             * <p>oAuth2 Token端点。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/token">https://example.com/oauth/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * <p>OIDC 用户信息端点。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/userinfo">https://example.com/oauth/userinfo</a></p>
             */
            public Builder userinfoEndpoint(String userinfoEndpoint) {
                this.userinfoEndpoint = userinfoEndpoint;
                return this;
            }

            public EndpointConfig build() {
                return new EndpointConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class OidcConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthnParam")
        private AuthnParam authnParam;

        @com.aliyun.core.annotation.NameInMap("EndpointConfig")
        private EndpointConfig endpointConfig;

        @com.aliyun.core.annotation.NameInMap("GrantScopes")
        private java.util.List<String> grantScopes;

        @com.aliyun.core.annotation.NameInMap("GrantType")
        private String grantType;

        @com.aliyun.core.annotation.NameInMap("PkceChallengeMethod")
        private String pkceChallengeMethod;

        @com.aliyun.core.annotation.NameInMap("PkceRequired")
        private Boolean pkceRequired;

        private OidcConfig(Builder builder) {
            this.authnParam = builder.authnParam;
            this.endpointConfig = builder.endpointConfig;
            this.grantScopes = builder.grantScopes;
            this.grantType = builder.grantType;
            this.pkceChallengeMethod = builder.pkceChallengeMethod;
            this.pkceRequired = builder.pkceRequired;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OidcConfig create() {
            return builder().build();
        }

        /**
         * @return authnParam
         */
        public AuthnParam getAuthnParam() {
            return this.authnParam;
        }

        /**
         * @return endpointConfig
         */
        public EndpointConfig getEndpointConfig() {
            return this.endpointConfig;
        }

        /**
         * @return grantScopes
         */
        public java.util.List<String> getGrantScopes() {
            return this.grantScopes;
        }

        /**
         * @return grantType
         */
        public String getGrantType() {
            return this.grantType;
        }

        /**
         * @return pkceChallengeMethod
         */
        public String getPkceChallengeMethod() {
            return this.pkceChallengeMethod;
        }

        /**
         * @return pkceRequired
         */
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public static final class Builder {
            private AuthnParam authnParam; 
            private EndpointConfig endpointConfig; 
            private java.util.List<String> grantScopes; 
            private String grantType; 
            private String pkceChallengeMethod; 
            private Boolean pkceRequired; 

            /**
             * <p>OIDC客户端认证配置。</p>
             */
            public Builder authnParam(AuthnParam authnParam) {
                this.authnParam = authnParam;
                return this;
            }

            /**
             * <p>OIDC 端点配置。</p>
             */
            public Builder endpointConfig(EndpointConfig endpointConfig) {
                this.endpointConfig = endpointConfig;
                return this;
            }

            /**
             * <p>OIDC标准参数，如profile、email等</p>
             * 
             * <strong>example:</strong>
             * <p>openid</p>
             */
            public Builder grantScopes(java.util.List<String> grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            /**
             * <p>OIDC授权类型。</p>
             * 
             * <strong>example:</strong>
             * <p>authorization_code</p>
             */
            public Builder grantType(String grantType) {
                this.grantType = grantType;
                return this;
            }

            /**
             * <p>支持的PKCE算法类型。</p>
             * 
             * <strong>example:</strong>
             * <p>S256</p>
             */
            public Builder pkceChallengeMethod(String pkceChallengeMethod) {
                this.pkceChallengeMethod = pkceChallengeMethod;
                return this;
            }

            /**
             * <p>AuthorizationCode授权模式下是否使用PKCE。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pkceRequired(Boolean pkceRequired) {
                this.pkceRequired = pkceRequired;
                return this;
            }

            public OidcConfig build() {
                return new OidcConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class WeComConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AuthorizeCallbackDomain")
        private String authorizeCallbackDomain;

        @com.aliyun.core.annotation.NameInMap("CorpSecret")
        private String corpSecret;

        @com.aliyun.core.annotation.NameInMap("TrustableDomain")
        private String trustableDomain;

        private WeComConfig(Builder builder) {
            this.agentId = builder.agentId;
            this.authorizeCallbackDomain = builder.authorizeCallbackDomain;
            this.corpSecret = builder.corpSecret;
            this.trustableDomain = builder.trustableDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeComConfig create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return authorizeCallbackDomain
         */
        public String getAuthorizeCallbackDomain() {
            return this.authorizeCallbackDomain;
        }

        /**
         * @return corpSecret
         */
        public String getCorpSecret() {
            return this.corpSecret;
        }

        /**
         * @return trustableDomain
         */
        public String getTrustableDomain() {
            return this.trustableDomain;
        }

        public static final class Builder {
            private String agentId; 
            private String authorizeCallbackDomain; 
            private String corpSecret; 
            private String trustableDomain; 

            /**
             * <p>企业微信自建应用的Id</p>
             * 
             * <strong>example:</strong>
             * <p>1237403</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>授权回调域</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.aliyunidaas.com/xxxxx">https://xxx.aliyunidaas.com/xxxxx</a></p>
             */
            public Builder authorizeCallbackDomain(String authorizeCallbackDomain) {
                this.authorizeCallbackDomain = authorizeCallbackDomain;
                return this;
            }

            /**
             * <p>企业微信自建应用的corpSecret</p>
             * 
             * <strong>example:</strong>
             * <p>CSEHDddddddxxxxuxkJEHPveWRXBGqVqRsxxxx</p>
             */
            public Builder corpSecret(String corpSecret) {
                this.corpSecret = corpSecret;
                return this;
            }

            /**
             * <p>可信域名</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.aliyunidaas.com">https://xxx.aliyunidaas.com</a></p>
             */
            public Builder trustableDomain(String trustableDomain) {
                this.trustableDomain = trustableDomain;
                return this;
            }

            public WeComConfig build() {
                return new WeComConfig(this);
            } 

        } 

    }
}
