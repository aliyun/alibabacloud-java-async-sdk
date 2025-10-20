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
 * {@link CreateFederatedCredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateFederatedCredentialProviderRequest</p>
 */
public class CreateFederatedCredentialProviderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FederatedCredentialProviderName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String federatedCredentialProviderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FederatedCredentialProviderType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String federatedCredentialProviderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String networkAccessEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OidcProviderConfig")
    private OidcProviderConfig oidcProviderConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pkcs7ProviderConfig")
    private Pkcs7ProviderConfig pkcs7ProviderConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateCaProviderConfig")
    private PrivateCaProviderConfig privateCaProviderConfig;

    private CreateFederatedCredentialProviderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.federatedCredentialProviderName = builder.federatedCredentialProviderName;
        this.federatedCredentialProviderType = builder.federatedCredentialProviderType;
        this.instanceId = builder.instanceId;
        this.networkAccessEndpointId = builder.networkAccessEndpointId;
        this.oidcProviderConfig = builder.oidcProviderConfig;
        this.pkcs7ProviderConfig = builder.pkcs7ProviderConfig;
        this.privateCaProviderConfig = builder.privateCaProviderConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFederatedCredentialProviderRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return federatedCredentialProviderName
     */
    public String getFederatedCredentialProviderName() {
        return this.federatedCredentialProviderName;
    }

    /**
     * @return federatedCredentialProviderType
     */
    public String getFederatedCredentialProviderType() {
        return this.federatedCredentialProviderType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkAccessEndpointId
     */
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    /**
     * @return oidcProviderConfig
     */
    public OidcProviderConfig getOidcProviderConfig() {
        return this.oidcProviderConfig;
    }

    /**
     * @return pkcs7ProviderConfig
     */
    public Pkcs7ProviderConfig getPkcs7ProviderConfig() {
        return this.pkcs7ProviderConfig;
    }

    /**
     * @return privateCaProviderConfig
     */
    public PrivateCaProviderConfig getPrivateCaProviderConfig() {
        return this.privateCaProviderConfig;
    }

    public static final class Builder extends Request.Builder<CreateFederatedCredentialProviderRequest, Builder> {
        private String regionId; 
        private String description; 
        private String federatedCredentialProviderName; 
        private String federatedCredentialProviderType; 
        private String instanceId; 
        private String networkAccessEndpointId; 
        private OidcProviderConfig oidcProviderConfig; 
        private Pkcs7ProviderConfig pkcs7ProviderConfig; 
        private PrivateCaProviderConfig privateCaProviderConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateFederatedCredentialProviderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.federatedCredentialProviderName = request.federatedCredentialProviderName;
            this.federatedCredentialProviderType = request.federatedCredentialProviderType;
            this.instanceId = request.instanceId;
            this.networkAccessEndpointId = request.networkAccessEndpointId;
            this.oidcProviderConfig = request.oidcProviderConfig;
            this.pkcs7ProviderConfig = request.pkcs7ProviderConfig;
            this.privateCaProviderConfig = request.privateCaProviderConfig;
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
         * <p>联邦凭证提供方描述</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>联邦凭证提供方名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder federatedCredentialProviderName(String federatedCredentialProviderName) {
            this.putQueryParameter("FederatedCredentialProviderName", federatedCredentialProviderName);
            this.federatedCredentialProviderName = federatedCredentialProviderName;
            return this;
        }

        /**
         * <p>联邦凭证提供方类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkcs7</p>
         */
        public Builder federatedCredentialProviderType(String federatedCredentialProviderType) {
            this.putQueryParameter("FederatedCredentialProviderType", federatedCredentialProviderType);
            this.federatedCredentialProviderType = federatedCredentialProviderType;
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
         * <p>网络端点ID</p>
         * 
         * <strong>example:</strong>
         * <p>nae_example_id</p>
         */
        public Builder networkAccessEndpointId(String networkAccessEndpointId) {
            this.putQueryParameter("NetworkAccessEndpointId", networkAccessEndpointId);
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }

        /**
         * <p>OIDC配置</p>
         */
        public Builder oidcProviderConfig(OidcProviderConfig oidcProviderConfig) {
            this.putQueryParameter("OidcProviderConfig", oidcProviderConfig);
            this.oidcProviderConfig = oidcProviderConfig;
            return this;
        }

        /**
         * <p>PKCS7配置</p>
         */
        public Builder pkcs7ProviderConfig(Pkcs7ProviderConfig pkcs7ProviderConfig) {
            this.putQueryParameter("Pkcs7ProviderConfig", pkcs7ProviderConfig);
            this.pkcs7ProviderConfig = pkcs7ProviderConfig;
            return this;
        }

        /**
         * <p>私有CA配置</p>
         */
        public Builder privateCaProviderConfig(PrivateCaProviderConfig privateCaProviderConfig) {
            this.putQueryParameter("PrivateCaProviderConfig", privateCaProviderConfig);
            this.privateCaProviderConfig = privateCaProviderConfig;
            return this;
        }

        @Override
        public CreateFederatedCredentialProviderRequest build() {
            return new CreateFederatedCredentialProviderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFederatedCredentialProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateFederatedCredentialProviderRequest</p>
     */
    public static class OidcProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audiences")
        private java.util.List<String> audiences;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("JwksSource")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String jwksSource;

        @com.aliyun.core.annotation.NameInMap("JwksUri")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String jwksUri;

        @com.aliyun.core.annotation.NameInMap("StaticJwks")
        private String staticJwks;

        @com.aliyun.core.annotation.NameInMap("TrustCondition")
        @com.aliyun.core.annotation.Validation(maxLength = 10240)
        private String trustCondition;

        private OidcProviderConfig(Builder builder) {
            this.audiences = builder.audiences;
            this.issuer = builder.issuer;
            this.jwksSource = builder.jwksSource;
            this.jwksUri = builder.jwksUri;
            this.staticJwks = builder.staticJwks;
            this.trustCondition = builder.trustCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OidcProviderConfig create() {
            return builder().build();
        }

        /**
         * @return audiences
         */
        public java.util.List<String> getAudiences() {
            return this.audiences;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return jwksSource
         */
        public String getJwksSource() {
            return this.jwksSource;
        }

        /**
         * @return jwksUri
         */
        public String getJwksUri() {
            return this.jwksUri;
        }

        /**
         * @return staticJwks
         */
        public String getStaticJwks() {
            return this.staticJwks;
        }

        /**
         * @return trustCondition
         */
        public String getTrustCondition() {
            return this.trustCondition;
        }

        public static final class Builder {
            private java.util.List<String> audiences; 
            private String issuer; 
            private String jwksSource; 
            private String jwksUri; 
            private String staticJwks; 
            private String trustCondition; 

            private Builder() {
            } 

            private Builder(OidcProviderConfig model) {
                this.audiences = model.audiences;
                this.issuer = model.issuer;
                this.jwksSource = model.jwksSource;
                this.jwksUri = model.jwksUri;
                this.staticJwks = model.staticJwks;
                this.trustCondition = model.trustCondition;
            } 

            /**
             * Audiences.
             */
            public Builder audiences(java.util.List<String> audiences) {
                this.audiences = audiences;
                return this;
            }

            /**
             * <p>Issuer</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com">https://example.com</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>Jwks来源</p>
             * 
             * <strong>example:</strong>
             * <p>static</p>
             */
            public Builder jwksSource(String jwksSource) {
                this.jwksSource = jwksSource;
                return this;
            }

            /**
             * <p>JWKS 端点</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/jwks">https://example.com/jwks</a></p>
             */
            public Builder jwksUri(String jwksUri) {
                this.jwksUri = jwksUri;
                return this;
            }

            /**
             * <p>静态获取的jwks</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;keys&quot;: [
             *     {
             *       &quot;kty&quot;: &quot;RSA&quot;,
             *       &quot;e&quot;: &quot;AQAB&quot;,
             *       &quot;use&quot;: &quot;sig&quot;,
             *       &quot;kid&quot;: &quot;KEY2RzsjRrimRASiAhCjBo18YwDoxpYHnHtv&quot;,
             *       &quot;n&quot;: &quot;qrsfFfSZngqKOxVE29ZIR4SXkwKq029B3HLDAZui_Pwaxwn8FssR9QdwsljZS06BTDp10vhPgqMB7s7TmHulL3I4WuSB-l4uXXXXX&quot;
             *     }
             *   ]
             * }</p>
             */
            public Builder staticJwks(String staticJwks) {
                this.staticJwks = staticJwks;
                return this;
            }

            /**
             * <p>信任条件</p>
             * 
             * <strong>example:</strong>
             * <p>IsNullOrEmpty(&quot;jwt.issuer&quot;)</p>
             */
            public Builder trustCondition(String trustCondition) {
                this.trustCondition = trustCondition;
                return this;
            }

            public OidcProviderConfig build() {
                return new OidcProviderConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateFederatedCredentialProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateFederatedCredentialProviderRequest</p>
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
             * <p>Root证书内容</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----
             * MIIE+zCCA0egAwIBAgIJAJZY0ZY0ZY0Z
             * -----END CERTIFICATE-----</p>
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
     * {@link CreateFederatedCredentialProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateFederatedCredentialProviderRequest</p>
     */
    public static class Pkcs7ProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificates")
        private java.util.List<Certificates> certificates;

        @com.aliyun.core.annotation.NameInMap("CmsVerificationMode")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String cmsVerificationMode;

        @com.aliyun.core.annotation.NameInMap("SignatureEffectiveTime")
        private Long signatureEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("SigningTimeValueExpression")
        private String signingTimeValueExpression;

        @com.aliyun.core.annotation.NameInMap("TrustAnchorSource")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String trustAnchorSource;

        @com.aliyun.core.annotation.NameInMap("TrustCondition")
        @com.aliyun.core.annotation.Validation(maxLength = 10240)
        private String trustCondition;

        private Pkcs7ProviderConfig(Builder builder) {
            this.certificates = builder.certificates;
            this.cmsVerificationMode = builder.cmsVerificationMode;
            this.signatureEffectiveTime = builder.signatureEffectiveTime;
            this.signingTimeValueExpression = builder.signingTimeValueExpression;
            this.trustAnchorSource = builder.trustAnchorSource;
            this.trustCondition = builder.trustCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pkcs7ProviderConfig create() {
            return builder().build();
        }

        /**
         * @return certificates
         */
        public java.util.List<Certificates> getCertificates() {
            return this.certificates;
        }

        /**
         * @return cmsVerificationMode
         */
        public String getCmsVerificationMode() {
            return this.cmsVerificationMode;
        }

        /**
         * @return signatureEffectiveTime
         */
        public Long getSignatureEffectiveTime() {
            return this.signatureEffectiveTime;
        }

        /**
         * @return signingTimeValueExpression
         */
        public String getSigningTimeValueExpression() {
            return this.signingTimeValueExpression;
        }

        /**
         * @return trustAnchorSource
         */
        public String getTrustAnchorSource() {
            return this.trustAnchorSource;
        }

        /**
         * @return trustCondition
         */
        public String getTrustCondition() {
            return this.trustCondition;
        }

        public static final class Builder {
            private java.util.List<Certificates> certificates; 
            private String cmsVerificationMode; 
            private Long signatureEffectiveTime; 
            private String signingTimeValueExpression; 
            private String trustAnchorSource; 
            private String trustCondition; 

            private Builder() {
            } 

            private Builder(Pkcs7ProviderConfig model) {
                this.certificates = model.certificates;
                this.cmsVerificationMode = model.cmsVerificationMode;
                this.signatureEffectiveTime = model.signatureEffectiveTime;
                this.signingTimeValueExpression = model.signingTimeValueExpression;
                this.trustAnchorSource = model.trustAnchorSource;
                this.trustCondition = model.trustCondition;
            } 

            /**
             * <p>pkcs7证书列表</p>
             */
            public Builder certificates(java.util.List<Certificates> certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * <p>CMS验证模式</p>
             * 
             * <strong>example:</strong>
             * <p>cert_chain</p>
             */
            public Builder cmsVerificationMode(String cmsVerificationMode) {
                this.cmsVerificationMode = cmsVerificationMode;
                return this;
            }

            /**
             * <p>签名有效期, 单位秒，1200</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder signatureEffectiveTime(Long signatureEffectiveTime) {
                this.signatureEffectiveTime = signatureEffectiveTime;
                return this;
            }

            /**
             * <p>获取签名时间的表达式</p>
             * 
             * <strong>example:</strong>
             * <p>pkcs7.signingTime</p>
             */
            public Builder signingTimeValueExpression(String signingTimeValueExpression) {
                this.signingTimeValueExpression = signingTimeValueExpression;
                return this;
            }

            /**
             * <p>证书信任锚点来源</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder trustAnchorSource(String trustAnchorSource) {
                this.trustAnchorSource = trustAnchorSource;
                return this;
            }

            /**
             * <p>信任条件</p>
             * 
             * <strong>example:</strong>
             * <p>IsNullOrEmpty(&quot;jwt.issuer&quot;)</p>
             */
            public Builder trustCondition(String trustCondition) {
                this.trustCondition = trustCondition;
                return this;
            }

            public Pkcs7ProviderConfig build() {
                return new Pkcs7ProviderConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateFederatedCredentialProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateFederatedCredentialProviderRequest</p>
     */
    public static class PrivateCaProviderConfigCertificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        private PrivateCaProviderConfigCertificates(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateCaProviderConfigCertificates create() {
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

            private Builder(PrivateCaProviderConfigCertificates model) {
                this.content = model.content;
            } 

            /**
             * <p>Root证书内容</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----
             * MIIE+zCCA0egAwIBAgIJAJZY0ZY0ZY0Z
             * -----END CERTIFICATE-----</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public PrivateCaProviderConfigCertificates build() {
                return new PrivateCaProviderConfigCertificates(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateFederatedCredentialProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateFederatedCredentialProviderRequest</p>
     */
    public static class PrivateCaProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificates")
        private java.util.List<PrivateCaProviderConfigCertificates> certificates;

        @com.aliyun.core.annotation.NameInMap("TrustAnchorSource")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String trustAnchorSource;

        @com.aliyun.core.annotation.NameInMap("TrustCondition")
        @com.aliyun.core.annotation.Validation(maxLength = 10240)
        private String trustCondition;

        private PrivateCaProviderConfig(Builder builder) {
            this.certificates = builder.certificates;
            this.trustAnchorSource = builder.trustAnchorSource;
            this.trustCondition = builder.trustCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateCaProviderConfig create() {
            return builder().build();
        }

        /**
         * @return certificates
         */
        public java.util.List<PrivateCaProviderConfigCertificates> getCertificates() {
            return this.certificates;
        }

        /**
         * @return trustAnchorSource
         */
        public String getTrustAnchorSource() {
            return this.trustAnchorSource;
        }

        /**
         * @return trustCondition
         */
        public String getTrustCondition() {
            return this.trustCondition;
        }

        public static final class Builder {
            private java.util.List<PrivateCaProviderConfigCertificates> certificates; 
            private String trustAnchorSource; 
            private String trustCondition; 

            private Builder() {
            } 

            private Builder(PrivateCaProviderConfig model) {
                this.certificates = model.certificates;
                this.trustAnchorSource = model.trustAnchorSource;
                this.trustCondition = model.trustCondition;
            } 

            /**
             * <p>Root证书列表</p>
             */
            public Builder certificates(java.util.List<PrivateCaProviderConfigCertificates> certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * <p>Root证书获取方式</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder trustAnchorSource(String trustAnchorSource) {
                this.trustAnchorSource = trustAnchorSource;
                return this;
            }

            /**
             * <p>Root证书的信任条件</p>
             * 
             * <strong>example:</strong>
             * <p>IsNullOrEmpty(&quot;jwt.issuer&quot;)</p>
             */
            public Builder trustCondition(String trustCondition) {
                this.trustCondition = trustCondition;
                return this;
            }

            public PrivateCaProviderConfig build() {
                return new PrivateCaProviderConfig(this);
            } 

        } 

    }
}
