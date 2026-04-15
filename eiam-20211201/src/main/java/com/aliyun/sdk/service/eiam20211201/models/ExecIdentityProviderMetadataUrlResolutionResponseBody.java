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
 * {@link ExecIdentityProviderMetadataUrlResolutionResponseBody} extends {@link TeaModel}
 *
 * <p>ExecIdentityProviderMetadataUrlResolutionResponseBody</p>
 */
public class ExecIdentityProviderMetadataUrlResolutionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdentityProviderMetadata")
    private IdentityProviderMetadata identityProviderMetadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExecIdentityProviderMetadataUrlResolutionResponseBody(Builder builder) {
        this.identityProviderMetadata = builder.identityProviderMetadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecIdentityProviderMetadataUrlResolutionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProviderMetadata
     */
    public IdentityProviderMetadata getIdentityProviderMetadata() {
        return this.identityProviderMetadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IdentityProviderMetadata identityProviderMetadata; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExecIdentityProviderMetadataUrlResolutionResponseBody model) {
            this.identityProviderMetadata = model.identityProviderMetadata;
            this.requestId = model.requestId;
        } 

        /**
         * IdentityProviderMetadata.
         */
        public Builder identityProviderMetadata(IdentityProviderMetadata identityProviderMetadata) {
            this.identityProviderMetadata = identityProviderMetadata;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecIdentityProviderMetadataUrlResolutionResponseBody build() {
            return new ExecIdentityProviderMetadataUrlResolutionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecIdentityProviderMetadataUrlResolutionResponseBody} extends {@link TeaModel}
     *
     * <p>ExecIdentityProviderMetadataUrlResolutionResponseBody</p>
     */
    public static class OidcOpenIdConfiguration extends TeaModel {
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

        private OidcOpenIdConfiguration(Builder builder) {
            this.authorizationEndpoint = builder.authorizationEndpoint;
            this.issuer = builder.issuer;
            this.jwksUri = builder.jwksUri;
            this.tokenEndpoint = builder.tokenEndpoint;
            this.userinfoEndpoint = builder.userinfoEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OidcOpenIdConfiguration create() {
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

            private Builder(OidcOpenIdConfiguration model) {
                this.authorizationEndpoint = model.authorizationEndpoint;
                this.issuer = model.issuer;
                this.jwksUri = model.jwksUri;
                this.tokenEndpoint = model.tokenEndpoint;
                this.userinfoEndpoint = model.userinfoEndpoint;
            } 

            /**
             * <p>oAuth2 授权端点。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://demo.com/oauth2/default/v1/authorize">https://demo.com/oauth2/default/v1/authorize</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>OIDC issuer信息。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://demo.com/fe974231-3454-4b70-9326-70fb71e41bce/v2.0/">https://demo.com/fe974231-3454-4b70-9326-70fb71e41bce/v2.0/</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>OIDC jwks地址。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://demo.com/oauth2/v1/keys">https://demo.com/oauth2/v1/keys</a></p>
             */
            public Builder jwksUri(String jwksUri) {
                this.jwksUri = jwksUri;
                return this;
            }

            /**
             * <p>oAuth2 Token端点。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://demo.com/api/bff/v1.2/developer/oidc/token">https://demo.com/api/bff/v1.2/developer/oidc/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * <p>OIDC 用户信息端点。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://demo.com/api/bff/v1.2/developer/oidc/userinfo">https://demo.com/api/bff/v1.2/developer/oidc/userinfo</a></p>
             */
            public Builder userinfoEndpoint(String userinfoEndpoint) {
                this.userinfoEndpoint = userinfoEndpoint;
                return this;
            }

            public OidcOpenIdConfiguration build() {
                return new OidcOpenIdConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecIdentityProviderMetadataUrlResolutionResponseBody} extends {@link TeaModel}
     *
     * <p>ExecIdentityProviderMetadataUrlResolutionResponseBody</p>
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
             * Content.
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
     * {@link ExecIdentityProviderMetadataUrlResolutionResponseBody} extends {@link TeaModel}
     *
     * <p>ExecIdentityProviderMetadataUrlResolutionResponseBody</p>
     */
    public static class SamlMetadataConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificates")
        private java.util.List<Certificates> certificates;

        @com.aliyun.core.annotation.NameInMap("IdPEntityId")
        private String idPEntityId;

        @com.aliyun.core.annotation.NameInMap("IdPSsoUrl")
        private String idPSsoUrl;

        private SamlMetadataConfiguration(Builder builder) {
            this.certificates = builder.certificates;
            this.idPEntityId = builder.idPEntityId;
            this.idPSsoUrl = builder.idPSsoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SamlMetadataConfiguration create() {
            return builder().build();
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

        public static final class Builder {
            private java.util.List<Certificates> certificates; 
            private String idPEntityId; 
            private String idPSsoUrl; 

            private Builder() {
            } 

            private Builder(SamlMetadataConfiguration model) {
                this.certificates = model.certificates;
                this.idPEntityId = model.idPEntityId;
                this.idPSsoUrl = model.idPSsoUrl;
            } 

            /**
             * Certificates.
             */
            public Builder certificates(java.util.List<Certificates> certificates) {
                this.certificates = certificates;
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
             * IdPSsoUrl.
             */
            public Builder idPSsoUrl(String idPSsoUrl) {
                this.idPSsoUrl = idPSsoUrl;
                return this;
            }

            public SamlMetadataConfiguration build() {
                return new SamlMetadataConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecIdentityProviderMetadataUrlResolutionResponseBody} extends {@link TeaModel}
     *
     * <p>ExecIdentityProviderMetadataUrlResolutionResponseBody</p>
     */
    public static class IdentityProviderMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OidcOpenIdConfiguration")
        private OidcOpenIdConfiguration oidcOpenIdConfiguration;

        @com.aliyun.core.annotation.NameInMap("SamlMetadataConfiguration")
        private SamlMetadataConfiguration samlMetadataConfiguration;

        private IdentityProviderMetadata(Builder builder) {
            this.oidcOpenIdConfiguration = builder.oidcOpenIdConfiguration;
            this.samlMetadataConfiguration = builder.samlMetadataConfiguration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityProviderMetadata create() {
            return builder().build();
        }

        /**
         * @return oidcOpenIdConfiguration
         */
        public OidcOpenIdConfiguration getOidcOpenIdConfiguration() {
            return this.oidcOpenIdConfiguration;
        }

        /**
         * @return samlMetadataConfiguration
         */
        public SamlMetadataConfiguration getSamlMetadataConfiguration() {
            return this.samlMetadataConfiguration;
        }

        public static final class Builder {
            private OidcOpenIdConfiguration oidcOpenIdConfiguration; 
            private SamlMetadataConfiguration samlMetadataConfiguration; 

            private Builder() {
            } 

            private Builder(IdentityProviderMetadata model) {
                this.oidcOpenIdConfiguration = model.oidcOpenIdConfiguration;
                this.samlMetadataConfiguration = model.samlMetadataConfiguration;
            } 

            /**
             * <p>OIDC IdP的Meta信息。</p>
             */
            public Builder oidcOpenIdConfiguration(OidcOpenIdConfiguration oidcOpenIdConfiguration) {
                this.oidcOpenIdConfiguration = oidcOpenIdConfiguration;
                return this;
            }

            /**
             * SamlMetadataConfiguration.
             */
            public Builder samlMetadataConfiguration(SamlMetadataConfiguration samlMetadataConfiguration) {
                this.samlMetadataConfiguration = samlMetadataConfiguration;
                return this;
            }

            public IdentityProviderMetadata build() {
                return new IdentityProviderMetadata(this);
            } 

        } 

    }
}
