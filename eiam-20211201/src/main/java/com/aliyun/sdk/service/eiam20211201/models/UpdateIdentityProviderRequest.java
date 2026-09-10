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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("SamlConfig")
    private SamlConfig samlConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WeComConfig")
    private WeComConfig weComConfig;

    private UpdateIdentityProviderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.dingtalkAppConfig = builder.dingtalkAppConfig;
        this.identityProviderId = builder.identityProviderId;
        this.identityProviderName = builder.identityProviderName;
        this.instanceId = builder.instanceId;
        this.larkConfig = builder.larkConfig;
        this.ldapConfig = builder.ldapConfig;
        this.logoUrl = builder.logoUrl;
        this.networkAccessEndpointId = builder.networkAccessEndpointId;
        this.oidcConfig = builder.oidcConfig;
        this.samlConfig = builder.samlConfig;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return samlConfig
     */
    public SamlConfig getSamlConfig() {
        return this.samlConfig;
    }

    /**
     * @return weComConfig
     */
    public WeComConfig getWeComConfig() {
        return this.weComConfig;
    }

    public static final class Builder extends Request.Builder<UpdateIdentityProviderRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private DingtalkAppConfig dingtalkAppConfig; 
        private String identityProviderId; 
        private String identityProviderName; 
        private String instanceId; 
        private LarkConfig larkConfig; 
        private LdapConfig ldapConfig; 
        private String logoUrl; 
        private String networkAccessEndpointId; 
        private OidcConfig oidcConfig; 
        private SamlConfig samlConfig; 
        private WeComConfig weComConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIdentityProviderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.dingtalkAppConfig = request.dingtalkAppConfig;
            this.identityProviderId = request.identityProviderId;
            this.identityProviderName = request.identityProviderName;
            this.instanceId = request.instanceId;
            this.larkConfig = request.larkConfig;
            this.ldapConfig = request.ldapConfig;
            this.logoUrl = request.logoUrl;
            this.networkAccessEndpointId = request.networkAccessEndpointId;
            this.oidcConfig = request.oidcConfig;
            this.samlConfig = request.samlConfig;
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
         * <p>The client token that is used to ensure the idempotence of the request. The value is generated by the client and must be unique across different requests.</p>
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
         * <p>The DingTalk configuration basic information.</p>
         */
        public Builder dingtalkAppConfig(DingtalkAppConfig dingtalkAppConfig) {
            this.putQueryParameter("DingtalkAppConfig", dingtalkAppConfig);
            this.dingtalkAppConfig = dingtalkAppConfig;
            return this;
        }

        /**
         * <p>The identity provider ID.</p>
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
         * <p>The identity provider name.</p>
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
         * <p>The Lark configuration information.</p>
         */
        public Builder larkConfig(LarkConfig larkConfig) {
            this.putQueryParameter("LarkConfig", larkConfig);
            this.larkConfig = larkConfig;
            return this;
        }

        /**
         * <p>The AD/LDAP basic information.</p>
         */
        public Builder ldapConfig(LdapConfig ldapConfig) {
            this.putQueryParameter("LdapConfig", ldapConfig);
            this.ldapConfig = ldapConfig;
            return this;
        }

        /**
         * <p>The URL of the application logo.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas-image://idaas_23aqr2ye554csg33dqpch5exxxx/tmp/d17d9adc-a943-45e7-ba0c-2838dddea678xxxx</p>
         */
        public Builder logoUrl(String logoUrl) {
            this.putQueryParameter("LogoUrl", logoUrl);
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * <p>The network endpoint ID.</p>
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
         * <p>The OIDC-related configuration.</p>
         */
        public Builder oidcConfig(OidcConfig oidcConfig) {
            this.putQueryParameter("OidcConfig", oidcConfig);
            this.oidcConfig = oidcConfig;
            return this;
        }

        /**
         * <p>The SAML IdP configuration.</p>
         */
        public Builder samlConfig(SamlConfig samlConfig) {
            this.putQueryParameter("SamlConfig", samlConfig);
            this.samlConfig = samlConfig;
            return this;
        }

        /**
         * <p>The WeCom basic information.</p>
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
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("DingtalkLoginVersion")
        private String dingtalkLoginVersion;

        @com.aliyun.core.annotation.NameInMap("EncryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("VerificationToken")
        private String verificationToken;

        private DingtalkAppConfig(Builder builder) {
            this.appKey = builder.appKey;
            this.appSecret = builder.appSecret;
            this.dingtalkLoginVersion = builder.dingtalkLoginVersion;
            this.encryptKey = builder.encryptKey;
            this.verificationToken = builder.verificationToken;
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

        /**
         * @return dingtalkLoginVersion
         */
        public String getDingtalkLoginVersion() {
            return this.dingtalkLoginVersion;
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
            private String appKey; 
            private String appSecret; 
            private String dingtalkLoginVersion; 
            private String encryptKey; 
            private String verificationToken; 

            private Builder() {
            } 

            private Builder(DingtalkAppConfig model) {
                this.appKey = model.appKey;
                this.appSecret = model.appSecret;
                this.dingtalkLoginVersion = model.dingtalkLoginVersion;
                this.encryptKey = model.encryptKey;
                this.verificationToken = model.verificationToken;
            } 

            /**
             * <p>The AppKey of the DingTalk first-party application.</p>
             * 
             * <strong>example:</strong>
             * <p>49nyeaqumk7f</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>The AppSecret of the DingTalk first-party application.</p>
             * 
             * <strong>example:</strong>
             * <p>86nozWFL2CxgwnhKiXaG8dN4keLPkUNc5xxxx</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>The DingTalk QR code login version.</p>
             * 
             * <strong>example:</strong>
             * <p>new_version</p>
             */
            public Builder dingtalkLoginVersion(String dingtalkLoginVersion) {
                this.dingtalkLoginVersion = dingtalkLoginVersion;
                return this;
            }

            /**
             * <p>The EncryptKey of the DingTalk application.</p>
             * 
             * <strong>example:</strong>
             * <p>VkdWw91mdkrjVFr3ObNwefap21dfxxxx</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>The VerificationToken of the DingTalk application.</p>
             * 
             * <strong>example:</strong>
             * <p>myDingApp_VerifyTokenxxxxx</p>
             */
            public Builder verificationToken(String verificationToken) {
                this.verificationToken = verificationToken;
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

            private Builder() {
            } 

            private Builder(LarkConfig model) {
                this.appId = model.appId;
                this.appSecret = model.appSecret;
                this.encryptKey = model.encryptKey;
                this.verificationToken = model.verificationToken;
            } 

            /**
             * <p>The AppId of the Lark application.</p>
             * 
             * <strong>example:</strong>
             * <p>cli_xxxx</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The AppSecret of the Lark application.</p>
             * 
             * <strong>example:</strong>
             * <p>KiiLzh5Dueh4wbLxxxx</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>The encryptKey of the custom Lark application.</p>
             * 
             * <strong>example:</strong>
             * <p>VkdWw91mdkrjVFr3ObNwefap21dfbZbKxxxx</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>The verificationToken of the custom Lark application.</p>
             * 
             * <strong>example:</strong>
             * <p>feishuVerifyTokenxxxxx</p>
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

            private Builder() {
            } 

            private Builder(LdapConfig model) {
                this.administratorPassword = model.administratorPassword;
                this.administratorUsername = model.administratorUsername;
                this.certificateFingerprintStatus = model.certificateFingerprintStatus;
                this.certificateFingerprints = model.certificateFingerprints;
                this.ldapProtocol = model.ldapProtocol;
                this.ldapServerHost = model.ldapServerHost;
                this.ldapServerPort = model.ldapServerPort;
                this.startTlsStatus = model.startTlsStatus;
            } 

            /**
             * <p>The administrator password.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder administratorPassword(String administratorPassword) {
                this.administratorPassword = administratorPassword;
                return this;
            }

            /**
             * <p>The administrator account.</p>
             * 
             * <strong>example:</strong>
             * <p>DC=example,DC=com</p>
             */
            public Builder administratorUsername(String administratorUsername) {
                this.administratorUsername = administratorUsername;
                return this;
            }

            /**
             * <p>Specifies whether to verify the certificate fingerprint. Valid values:</p>
             * <ul>
             * <li><p>disabled: Disabled.</p>
             * </li>
             * <li><p>enabled: Enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder certificateFingerprintStatus(String certificateFingerprintStatus) {
                this.certificateFingerprintStatus = certificateFingerprintStatus;
                return this;
            }

            /**
             * <p>The list of certificate fingerprints.</p>
             */
            public Builder certificateFingerprints(java.util.List<String> certificateFingerprints) {
                this.certificateFingerprints = certificateFingerprints;
                return this;
            }

            /**
             * <p>The communication protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>ldap</p>
             */
            public Builder ldapProtocol(String ldapProtocol) {
                this.ldapProtocol = ldapProtocol;
                return this;
            }

            /**
             * <p>The server address.</p>
             * 
             * <strong>example:</strong>
             * <p>123.xx.xx.89</p>
             */
            public Builder ldapServerHost(String ldapServerHost) {
                this.ldapServerHost = ldapServerHost;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>636</p>
             */
            public Builder ldapServerPort(Integer ldapServerPort) {
                this.ldapServerPort = ldapServerPort;
                return this;
            }

            /**
             * <p>Specifies whether StartTLS is enabled. Valid values:</p>
             * <ul>
             * <li><p>disabled: Disabled.</p>
             * </li>
             * <li><p>enabled: Enabled.</p>
             * </li>
             * </ul>
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

            private Builder() {
            } 

            private Builder(AuthnParam model) {
                this.authnMethod = model.authnMethod;
                this.clientSecret = model.clientSecret;
            } 

            /**
             * <p>The OIDC authentication method. Valid values:</p>
             * <ul>
             * <li><p>client_secret_basic</p>
             * </li>
             * <li><p>client_secret_post</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>client_secret_post</p>
             */
            public Builder authnMethod(String authnMethod) {
                this.authnMethod = authnMethod;
                return this;
            }

            /**
             * <p>The OIDC client secret.</p>
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

            private Builder() {
            } 

            private Builder(EndpointConfig model) {
                this.authorizationEndpoint = model.authorizationEndpoint;
                this.issuer = model.issuer;
                this.jwksUri = model.jwksUri;
                this.tokenEndpoint = model.tokenEndpoint;
                this.userinfoEndpoint = model.userinfoEndpoint;
            } 

            /**
             * <p>The OIDC authorization endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/authorize">https://example.com/oauth/authorize</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>The OIDC issuer information.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth">https://example.com/oauth</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The OIDC JWKS URI.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/jwks">https://example.com/oauth/jwks</a></p>
             */
            public Builder jwksUri(String jwksUri) {
                this.jwksUri = jwksUri;
                return this;
            }

            /**
             * <p>The OIDC token endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oauth/token">https://example.com/oauth/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * <p>The OIDC UserInfo endpoint.</p>
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

            private Builder() {
            } 

            private Builder(OidcConfig model) {
                this.authnParam = model.authnParam;
                this.endpointConfig = model.endpointConfig;
                this.grantScopes = model.grantScopes;
                this.grantType = model.grantType;
                this.pkceChallengeMethod = model.pkceChallengeMethod;
                this.pkceRequired = model.pkceRequired;
            } 

            /**
             * <p>The OIDC client authentication configuration.</p>
             */
            public Builder authnParam(AuthnParam authnParam) {
                this.authnParam = authnParam;
                return this;
            }

            /**
             * <p>The OIDC endpoint configuration.</p>
             */
            public Builder endpointConfig(EndpointConfig endpointConfig) {
                this.endpointConfig = endpointConfig;
                return this;
            }

            /**
             * <p>The list of OIDC grant scopes.</p>
             * 
             * <strong>example:</strong>
             * <p>openid</p>
             */
            public Builder grantScopes(java.util.List<String> grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            /**
             * <p>The OIDC grant type.</p>
             * 
             * <strong>example:</strong>
             * <p>authorization_code</p>
             */
            public Builder grantType(String grantType) {
                this.grantType = grantType;
                return this;
            }

            /**
             * <p>The PKCE algorithm. Valid values:</p>
             * <ul>
             * <li><p>S256: SHA-256.</p>
             * </li>
             * <li><p>plain: Plaintext.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>S256</p>
             */
            public Builder pkceChallengeMethod(String pkceChallengeMethod) {
                this.pkceChallengeMethod = pkceChallengeMethod;
                return this;
            }

            /**
             * <p>Specifies whether to use PKCE in the AuthorizationCode grant mode.</p>
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
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        private Certificates(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        public static final class Builder {
            private String content; 

            private Builder() {
            } 

            private Builder(Certificates model) {
                this.content = model.content;
            } 

            /**
             * <p>The certificate content.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE----- MIIC0jCCAbqgAwIBAgIQXXXXX-----END CERTIFICATE-----</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class SamlConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingMethod")
        private String bindingMethod;

        @com.aliyun.core.annotation.NameInMap("Certificates")
        private java.util.List<Certificates> certificates;

        @com.aliyun.core.annotation.NameInMap("IdPEntityId")
        private String idPEntityId;

        @com.aliyun.core.annotation.NameInMap("IdPSsoUrl")
        private String idPSsoUrl;

        @com.aliyun.core.annotation.NameInMap("MaxClockSkew")
        private Long maxClockSkew;

        @com.aliyun.core.annotation.NameInMap("RequireRequestSigned")
        private Boolean requireRequestSigned;

        @com.aliyun.core.annotation.NameInMap("WantAssertionsSigned")
        private Boolean wantAssertionsSigned;

        @com.aliyun.core.annotation.NameInMap("WantResponseSigned")
        private Boolean wantResponseSigned;

        private SamlConfig(Builder builder) {
            this.bindingMethod = builder.bindingMethod;
            this.certificates = builder.certificates;
            this.idPEntityId = builder.idPEntityId;
            this.idPSsoUrl = builder.idPSsoUrl;
            this.maxClockSkew = builder.maxClockSkew;
            this.requireRequestSigned = builder.requireRequestSigned;
            this.wantAssertionsSigned = builder.wantAssertionsSigned;
            this.wantResponseSigned = builder.wantResponseSigned;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SamlConfig create() {
            return builder().build();
        }

        /**
         * @return bindingMethod
         */
        public String getBindingMethod() {
            return this.bindingMethod;
        }

        /**
         * @return certificates
         */
        public java.util.List<Certificates> getCertificates() {
            return this.certificates;
        }

        /**
         * @return idPEntityId
         */
        public String getIdPEntityId() {
            return this.idPEntityId;
        }

        /**
         * @return idPSsoUrl
         */
        public String getIdPSsoUrl() {
            return this.idPSsoUrl;
        }

        /**
         * @return maxClockSkew
         */
        public Long getMaxClockSkew() {
            return this.maxClockSkew;
        }

        /**
         * @return requireRequestSigned
         */
        public Boolean getRequireRequestSigned() {
            return this.requireRequestSigned;
        }

        /**
         * @return wantAssertionsSigned
         */
        public Boolean getWantAssertionsSigned() {
            return this.wantAssertionsSigned;
        }

        /**
         * @return wantResponseSigned
         */
        public Boolean getWantResponseSigned() {
            return this.wantResponseSigned;
        }

        public static final class Builder {
            private String bindingMethod; 
            private java.util.List<Certificates> certificates; 
            private String idPEntityId; 
            private String idPSsoUrl; 
            private Long maxClockSkew; 
            private Boolean requireRequestSigned; 
            private Boolean wantAssertionsSigned; 
            private Boolean wantResponseSigned; 

            private Builder() {
            } 

            private Builder(SamlConfig model) {
                this.bindingMethod = model.bindingMethod;
                this.certificates = model.certificates;
                this.idPEntityId = model.idPEntityId;
                this.idPSsoUrl = model.idPSsoUrl;
                this.maxClockSkew = model.maxClockSkew;
                this.requireRequestSigned = model.requireRequestSigned;
                this.wantAssertionsSigned = model.wantAssertionsSigned;
                this.wantResponseSigned = model.wantResponseSigned;
            } 

            /**
             * <p>The binding type.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP-REDIRECT</p>
             */
            public Builder bindingMethod(String bindingMethod) {
                this.bindingMethod = bindingMethod;
                return this;
            }

            /**
             * <p>The certificate list of the IdP.</p>
             */
            public Builder certificates(java.util.List<Certificates> certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * <p>The EntityId of the IdP.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://dc.test.com/adfs/services/trust">http://dc.test.com/adfs/services/trust</a></p>
             */
            public Builder idPEntityId(String idPEntityId) {
                this.idPEntityId = idPEntityId;
                return this;
            }

            /**
             * <p>The logon URL of the IdP.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dc.test.com/adfs/ls/">https://dc.test.com/adfs/ls/</a></p>
             */
            public Builder idPSsoUrl(String idPSsoUrl) {
                this.idPSsoUrl = idPSsoUrl;
                return this;
            }

            /**
             * <p>The maximum clock skew.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder maxClockSkew(Long maxClockSkew) {
                this.maxClockSkew = maxClockSkew;
                return this;
            }

            /**
             * <p>Specifies whether the request must be signed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder requireRequestSigned(Boolean requireRequestSigned) {
                this.requireRequestSigned = requireRequestSigned;
                return this;
            }

            /**
             * <p>Specifies whether the external IdP is required to sign the Assertion.</p>
             */
            public Builder wantAssertionsSigned(Boolean wantAssertionsSigned) {
                this.wantAssertionsSigned = wantAssertionsSigned;
                return this;
            }

            /**
             * <p>Specifies whether the external IdP is required to sign the Response.</p>
             */
            public Builder wantResponseSigned(Boolean wantResponseSigned) {
                this.wantResponseSigned = wantResponseSigned;
                return this;
            }

            public SamlConfig build() {
                return new SamlConfig(this);
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

        @com.aliyun.core.annotation.NameInMap("ContactSecret")
        @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 1)
        private String contactSecret;

        @com.aliyun.core.annotation.NameInMap("CorpSecret")
        @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 1)
        private String corpSecret;

        @com.aliyun.core.annotation.NameInMap("TrustableDomain")
        private String trustableDomain;

        private WeComConfig(Builder builder) {
            this.agentId = builder.agentId;
            this.authorizeCallbackDomain = builder.authorizeCallbackDomain;
            this.contactSecret = builder.contactSecret;
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
         * @return contactSecret
         */
        public String getContactSecret() {
            return this.contactSecret;
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
            private String contactSecret; 
            private String corpSecret; 
            private String trustableDomain; 

            private Builder() {
            } 

            private Builder(WeComConfig model) {
                this.agentId = model.agentId;
                this.authorizeCallbackDomain = model.authorizeCallbackDomain;
                this.contactSecret = model.contactSecret;
                this.corpSecret = model.corpSecret;
                this.trustableDomain = model.trustableDomain;
            } 

            /**
             * <p>The AgentId of the WeCom self-built application.</p>
             * 
             * <strong>example:</strong>
             * <p>1237403</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The authorization callback domain.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.aliyunidaas.com/xxxxx">https://xxx.aliyunidaas.com/xxxxx</a></p>
             */
            public Builder authorizeCallbackDomain(String authorizeCallbackDomain) {
                this.authorizeCallbackDomain = authorizeCallbackDomain;
                return this;
            }

            /**
             * ContactSecret.
             */
            public Builder contactSecret(String contactSecret) {
                this.contactSecret = contactSecret;
                return this;
            }

            /**
             * <p>The CorpSecret of the WeCom self-built application.</p>
             * 
             * <strong>example:</strong>
             * <p>CSEHDddddddxxxxuxkJEHPveWRXBGqVqRsxxxx</p>
             */
            public Builder corpSecret(String corpSecret) {
                this.corpSecret = corpSecret;
                return this;
            }

            /**
             * <p>The trusted domain name.</p>
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
