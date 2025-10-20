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
 * {@link ListFederatedCredentialProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ListFederatedCredentialProvidersResponseBody</p>
 */
public class ListFederatedCredentialProvidersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FederatedCredentialProviders")
    private java.util.List<FederatedCredentialProviders> federatedCredentialProviders;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListFederatedCredentialProvidersResponseBody(Builder builder) {
        this.federatedCredentialProviders = builder.federatedCredentialProviders;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFederatedCredentialProvidersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return federatedCredentialProviders
     */
    public java.util.List<FederatedCredentialProviders> getFederatedCredentialProviders() {
        return this.federatedCredentialProviders;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return previousToken
     */
    public String getPreviousToken() {
        return this.previousToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<FederatedCredentialProviders> federatedCredentialProviders; 
        private Integer maxResults; 
        private String nextToken; 
        private String previousToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListFederatedCredentialProvidersResponseBody model) {
            this.federatedCredentialProviders = model.federatedCredentialProviders;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.previousToken = model.previousToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * FederatedCredentialProviders.
         */
        public Builder federatedCredentialProviders(java.util.List<FederatedCredentialProviders> federatedCredentialProviders) {
            this.federatedCredentialProviders = federatedCredentialProviders;
            return this;
        }

        /**
         * <p>分页查询时每页行数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxexample</p>
         */
        public Builder previousToken(String previousToken) {
            this.previousToken = previousToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFederatedCredentialProvidersResponseBody build() {
            return new ListFederatedCredentialProvidersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFederatedCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListFederatedCredentialProvidersResponseBody</p>
     */
    public static class OidcProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audiences")
        private java.util.List<String> audiences;

        @com.aliyun.core.annotation.NameInMap("DynamicJwks")
        private String dynamicJwks;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("JwksLastObtainedTime")
        private Long jwksLastObtainedTime;

        @com.aliyun.core.annotation.NameInMap("JwksSource")
        private String jwksSource;

        @com.aliyun.core.annotation.NameInMap("JwksUri")
        private String jwksUri;

        @com.aliyun.core.annotation.NameInMap("StaticJwks")
        private String staticJwks;

        @com.aliyun.core.annotation.NameInMap("TrustCondition")
        private String trustCondition;

        private OidcProviderConfig(Builder builder) {
            this.audiences = builder.audiences;
            this.dynamicJwks = builder.dynamicJwks;
            this.issuer = builder.issuer;
            this.jwksLastObtainedTime = builder.jwksLastObtainedTime;
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
         * @return dynamicJwks
         */
        public String getDynamicJwks() {
            return this.dynamicJwks;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return jwksLastObtainedTime
         */
        public Long getJwksLastObtainedTime() {
            return this.jwksLastObtainedTime;
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
            private String dynamicJwks; 
            private String issuer; 
            private Long jwksLastObtainedTime; 
            private String jwksSource; 
            private String jwksUri; 
            private String staticJwks; 
            private String trustCondition; 

            private Builder() {
            } 

            private Builder(OidcProviderConfig model) {
                this.audiences = model.audiences;
                this.dynamicJwks = model.dynamicJwks;
                this.issuer = model.issuer;
                this.jwksLastObtainedTime = model.jwksLastObtainedTime;
                this.jwksSource = model.jwksSource;
                this.jwksUri = model.jwksUri;
                this.staticJwks = model.staticJwks;
                this.trustCondition = model.trustCondition;
            } 

            /**
             * <p>oidc凭证的受众列表</p>
             */
            public Builder audiences(java.util.List<String> audiences) {
                this.audiences = audiences;
                return this;
            }

            /**
             * <p>动态获取的jwks</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;keys&quot;: [
             *     {
             *       &quot;kty&quot;: &quot;RSA&quot;,
             *       &quot;e&quot;: &quot;AQAB&quot;,
             *       &quot;use&quot;: &quot;sig&quot;,
             *       &quot;kid&quot;: &quot;KEY2RzsjRrimRASiAhCjBo18YwDoxpYHnHtv&quot;,
             *       &quot;n&quot;: &quot;qrsfFfSZngqKOxVE29ZIR4SXkwKq029B3HLDAZui_Pwaxwn8FssR9QdwsljZS06BTDp10vhPgqMB7s7TmHulL3I4WuSB-l4uXTXXXX&quot;
             *     }
             *   ]
             * }</p>
             */
            public Builder dynamicJwks(String dynamicJwks) {
                this.dynamicJwks = dynamicJwks;
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
             * JwksLastObtainedTime.
             */
            public Builder jwksLastObtainedTime(Long jwksLastObtainedTime) {
                this.jwksLastObtainedTime = jwksLastObtainedTime;
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
             * <p><a href="https://example.com">https://example.com</a></p>
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
             *       &quot;n&quot;: &quot;qrsfFfSZngqKOxVE29ZIR4SXkwKq029B3HLDAZui_Pwaxwn8FssR9QdwsljZS06BTDp10vhPgqMB7s7TmHulL3I4WuSB-l4uXTXXXX&quot;
             *     }
             *   ]
             * }</p>
             */
            public Builder staticJwks(String staticJwks) {
                this.staticJwks = staticJwks;
                return this;
            }

            /**
             * <p>默认条件</p>
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
     * {@link ListFederatedCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListFederatedCredentialProvidersResponseBody</p>
     */
    public static class CertificateMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotAfter")
        private Long notAfter;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private Long notBefore;

        private CertificateMetadata(Builder builder) {
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateMetadata create() {
            return builder().build();
        }

        /**
         * @return notAfter
         */
        public Long getNotAfter() {
            return this.notAfter;
        }

        /**
         * @return notBefore
         */
        public Long getNotBefore() {
            return this.notBefore;
        }

        public static final class Builder {
            private Long notAfter; 
            private Long notBefore; 

            private Builder() {
            } 

            private Builder(CertificateMetadata model) {
                this.notAfter = model.notAfter;
                this.notBefore = model.notBefore;
            } 

            /**
             * <p>证书过期时间</p>
             * 
             * <strong>example:</strong>
             * <p>1729061324000</p>
             */
            public Builder notAfter(Long notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * <p>证书生效时间</p>
             * 
             * <strong>example:</strong>
             * <p>1729061324000</p>
             */
            public Builder notBefore(Long notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            public CertificateMetadata build() {
                return new CertificateMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFederatedCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListFederatedCredentialProvidersResponseBody</p>
     */
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateMetadata")
        private CertificateMetadata certificateMetadata;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Fingerprint")
        private String fingerprint;

        private Certificates(Builder builder) {
            this.certificateMetadata = builder.certificateMetadata;
            this.content = builder.content;
            this.fingerprint = builder.fingerprint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return certificateMetadata
         */
        public CertificateMetadata getCertificateMetadata() {
            return this.certificateMetadata;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fingerprint
         */
        public String getFingerprint() {
            return this.fingerprint;
        }

        public static final class Builder {
            private CertificateMetadata certificateMetadata; 
            private String content; 
            private String fingerprint; 

            private Builder() {
            } 

            private Builder(Certificates model) {
                this.certificateMetadata = model.certificateMetadata;
                this.content = model.content;
                this.fingerprint = model.fingerprint;
            } 

            /**
             * <p>证书元数据</p>
             */
            public Builder certificateMetadata(CertificateMetadata certificateMetadata) {
                this.certificateMetadata = certificateMetadata;
                return this;
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

            /**
             * <p>Root证书指纹</p>
             * 
             * <strong>example:</strong>
             * <p>2b18947a6a9fc7764fd8b5fb18a863b0c6daxxx</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFederatedCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListFederatedCredentialProvidersResponseBody</p>
     */
    public static class Pkcs7ProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificates")
        private java.util.List<Certificates> certificates;

        @com.aliyun.core.annotation.NameInMap("CmsVerificationMode")
        private String cmsVerificationMode;

        @com.aliyun.core.annotation.NameInMap("SignatureEffectiveTime")
        private Long signatureEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("SigningTimeValueExpression")
        private String signingTimeValueExpression;

        @com.aliyun.core.annotation.NameInMap("TrustAnchorSource")
        private String trustAnchorSource;

        @com.aliyun.core.annotation.NameInMap("TrustCondition")
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
             * <p>cert</p>
             */
            public Builder cmsVerificationMode(String cmsVerificationMode) {
                this.cmsVerificationMode = cmsVerificationMode;
                return this;
            }

            /**
             * <p>签名有效时间</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder signatureEffectiveTime(Long signatureEffectiveTime) {
                this.signatureEffectiveTime = signatureEffectiveTime;
                return this;
            }

            /**
             * <p>签名时间</p>
             * 
             * <strong>example:</strong>
             * <p>pkcs7.payload.jsonData.audience.signingTime</p>
             */
            public Builder signingTimeValueExpression(String signingTimeValueExpression) {
                this.signingTimeValueExpression = signingTimeValueExpression;
                return this;
            }

            /**
             * <p>证书信任锚点来源</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud</p>
             */
            public Builder trustAnchorSource(String trustAnchorSource) {
                this.trustAnchorSource = trustAnchorSource;
                return this;
            }

            /**
             * <p>信任条件</p>
             * 
             * <strong>example:</strong>
             * <p>IsNullOrEmpty(&quot;certNo&quot;)</p>
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
     * {@link ListFederatedCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListFederatedCredentialProvidersResponseBody</p>
     */
    public static class CertificatesCertificateMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotAfter")
        private Long notAfter;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private Long notBefore;

        private CertificatesCertificateMetadata(Builder builder) {
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificatesCertificateMetadata create() {
            return builder().build();
        }

        /**
         * @return notAfter
         */
        public Long getNotAfter() {
            return this.notAfter;
        }

        /**
         * @return notBefore
         */
        public Long getNotBefore() {
            return this.notBefore;
        }

        public static final class Builder {
            private Long notAfter; 
            private Long notBefore; 

            private Builder() {
            } 

            private Builder(CertificatesCertificateMetadata model) {
                this.notAfter = model.notAfter;
                this.notBefore = model.notBefore;
            } 

            /**
             * <p>证书过期时间</p>
             * 
             * <strong>example:</strong>
             * <p>1729061324000</p>
             */
            public Builder notAfter(Long notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * <p>证书生效时间</p>
             * 
             * <strong>example:</strong>
             * <p>1729061324000</p>
             */
            public Builder notBefore(Long notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            public CertificatesCertificateMetadata build() {
                return new CertificatesCertificateMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFederatedCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListFederatedCredentialProvidersResponseBody</p>
     */
    public static class PrivateCaProviderConfigCertificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateMetadata")
        private CertificatesCertificateMetadata certificateMetadata;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Fingerprint")
        private String fingerprint;

        private PrivateCaProviderConfigCertificates(Builder builder) {
            this.certificateMetadata = builder.certificateMetadata;
            this.content = builder.content;
            this.fingerprint = builder.fingerprint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateCaProviderConfigCertificates create() {
            return builder().build();
        }

        /**
         * @return certificateMetadata
         */
        public CertificatesCertificateMetadata getCertificateMetadata() {
            return this.certificateMetadata;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fingerprint
         */
        public String getFingerprint() {
            return this.fingerprint;
        }

        public static final class Builder {
            private CertificatesCertificateMetadata certificateMetadata; 
            private String content; 
            private String fingerprint; 

            private Builder() {
            } 

            private Builder(PrivateCaProviderConfigCertificates model) {
                this.certificateMetadata = model.certificateMetadata;
                this.content = model.content;
                this.fingerprint = model.fingerprint;
            } 

            /**
             * <p>证书元数据</p>
             */
            public Builder certificateMetadata(CertificatesCertificateMetadata certificateMetadata) {
                this.certificateMetadata = certificateMetadata;
                return this;
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

            /**
             * <p>Root证书指纹</p>
             * 
             * <strong>example:</strong>
             * <p>2b18947a6a9fc7764fd8b5fb18a863b0c6daxxx</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            public PrivateCaProviderConfigCertificates build() {
                return new PrivateCaProviderConfigCertificates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFederatedCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListFederatedCredentialProvidersResponseBody</p>
     */
    public static class PrivateCaProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificates")
        private java.util.List<PrivateCaProviderConfigCertificates> certificates;

        @com.aliyun.core.annotation.NameInMap("TrustAnchorSource")
        private String trustAnchorSource;

        @com.aliyun.core.annotation.NameInMap("TrustCondition")
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
             * <p>Root证书</p>
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
             * <p>Root证书的默认条件</p>
             * 
             * <strong>example:</strong>
             * <p>IsNullOrEmpty(&quot;certNo&quot;)</p>
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
    /**
     * 
     * {@link ListFederatedCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListFederatedCredentialProvidersResponseBody</p>
     */
    public static class FederatedCredentialProviders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FederatedCredentialProviderId")
        private String federatedCredentialProviderId;

        @com.aliyun.core.annotation.NameInMap("FederatedCredentialProviderName")
        private String federatedCredentialProviderName;

        @com.aliyun.core.annotation.NameInMap("FederatedCredentialProviderType")
        private String federatedCredentialProviderType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointId")
        private String networkAccessEndpointId;

        @com.aliyun.core.annotation.NameInMap("OidcProviderConfig")
        private OidcProviderConfig oidcProviderConfig;

        @com.aliyun.core.annotation.NameInMap("Pkcs7ProviderConfig")
        private Pkcs7ProviderConfig pkcs7ProviderConfig;

        @com.aliyun.core.annotation.NameInMap("PrivateCaProviderConfig")
        private PrivateCaProviderConfig privateCaProviderConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private FederatedCredentialProviders(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.federatedCredentialProviderId = builder.federatedCredentialProviderId;
            this.federatedCredentialProviderName = builder.federatedCredentialProviderName;
            this.federatedCredentialProviderType = builder.federatedCredentialProviderType;
            this.instanceId = builder.instanceId;
            this.networkAccessEndpointId = builder.networkAccessEndpointId;
            this.oidcProviderConfig = builder.oidcProviderConfig;
            this.pkcs7ProviderConfig = builder.pkcs7ProviderConfig;
            this.privateCaProviderConfig = builder.privateCaProviderConfig;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FederatedCredentialProviders create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return federatedCredentialProviderId
         */
        public String getFederatedCredentialProviderId() {
            return this.federatedCredentialProviderId;
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

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private String federatedCredentialProviderId; 
            private String federatedCredentialProviderName; 
            private String federatedCredentialProviderType; 
            private String instanceId; 
            private String networkAccessEndpointId; 
            private OidcProviderConfig oidcProviderConfig; 
            private Pkcs7ProviderConfig pkcs7ProviderConfig; 
            private PrivateCaProviderConfig privateCaProviderConfig; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(FederatedCredentialProviders model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.federatedCredentialProviderId = model.federatedCredentialProviderId;
                this.federatedCredentialProviderName = model.federatedCredentialProviderName;
                this.federatedCredentialProviderType = model.federatedCredentialProviderType;
                this.instanceId = model.instanceId;
                this.networkAccessEndpointId = model.networkAccessEndpointId;
                this.oidcProviderConfig = model.oidcProviderConfig;
                this.pkcs7ProviderConfig = model.pkcs7ProviderConfig;
                this.privateCaProviderConfig = model.privateCaProviderConfig;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1729061324000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>描述</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Federated Credential Provider ID</p>
             * 
             * <strong>example:</strong>
             * <p>fcp_asda123XXX</p>
             */
            public Builder federatedCredentialProviderId(String federatedCredentialProviderId) {
                this.federatedCredentialProviderId = federatedCredentialProviderId;
                return this;
            }

            /**
             * <p>联邦凭证提供方名称</p>
             * 
             * <strong>example:</strong>
             * <p>pkcs7test</p>
             */
            public Builder federatedCredentialProviderName(String federatedCredentialProviderName) {
                this.federatedCredentialProviderName = federatedCredentialProviderName;
                return this;
            }

            /**
             * <p>联邦凭证提供方类型</p>
             * 
             * <strong>example:</strong>
             * <p>pkcs7</p>
             */
            public Builder federatedCredentialProviderType(String federatedCredentialProviderType) {
                this.federatedCredentialProviderType = federatedCredentialProviderType;
                return this;
            }

            /**
             * <p>EIAM 实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_dd4n3rnknybjjxuu5gq6ovqxXXX</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>网络访问端点ID</p>
             * 
             * <strong>example:</strong>
             * <p>inae_public</p>
             */
            public Builder networkAccessEndpointId(String networkAccessEndpointId) {
                this.networkAccessEndpointId = networkAccessEndpointId;
                return this;
            }

            /**
             * <p>OIDC配置</p>
             */
            public Builder oidcProviderConfig(OidcProviderConfig oidcProviderConfig) {
                this.oidcProviderConfig = oidcProviderConfig;
                return this;
            }

            /**
             * <p>PKCS7配置</p>
             */
            public Builder pkcs7ProviderConfig(Pkcs7ProviderConfig pkcs7ProviderConfig) {
                this.pkcs7ProviderConfig = pkcs7ProviderConfig;
                return this;
            }

            /**
             * <p>私有CA配置</p>
             */
            public Builder privateCaProviderConfig(PrivateCaProviderConfig privateCaProviderConfig) {
                this.privateCaProviderConfig = privateCaProviderConfig;
                return this;
            }

            /**
             * <p>状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1729061324000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public FederatedCredentialProviders build() {
                return new FederatedCredentialProviders(this);
            } 

        } 

    }
}
