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
 * {@link CreateCredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateCredentialProviderRequest</p>
 */
public class CreateCredentialProviderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialProviderConfig")
    private CredentialProviderConfig credentialProviderConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialProviderIdentifier")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String credentialProviderIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialProviderName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String credentialProviderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialProviderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialProviderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private CreateCredentialProviderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.credentialProviderConfig = builder.credentialProviderConfig;
        this.credentialProviderIdentifier = builder.credentialProviderIdentifier;
        this.credentialProviderName = builder.credentialProviderName;
        this.credentialProviderType = builder.credentialProviderType;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCredentialProviderRequest create() {
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
     * @return credentialProviderConfig
     */
    public CredentialProviderConfig getCredentialProviderConfig() {
        return this.credentialProviderConfig;
    }

    /**
     * @return credentialProviderIdentifier
     */
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

    /**
     * @return credentialProviderName
     */
    public String getCredentialProviderName() {
        return this.credentialProviderName;
    }

    /**
     * @return credentialProviderType
     */
    public String getCredentialProviderType() {
        return this.credentialProviderType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateCredentialProviderRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private CredentialProviderConfig credentialProviderConfig; 
        private String credentialProviderIdentifier; 
        private String credentialProviderName; 
        private String credentialProviderType; 
        private String description; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCredentialProviderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.credentialProviderConfig = request.credentialProviderConfig;
            this.credentialProviderIdentifier = request.credentialProviderIdentifier;
            this.credentialProviderName = request.credentialProviderName;
            this.credentialProviderType = request.credentialProviderType;
            this.description = request.description;
            this.instanceId = request.instanceId;
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length. For more information, see References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The credential provider configuration.</p>
         */
        public Builder credentialProviderConfig(CredentialProviderConfig credentialProviderConfig) {
            this.putQueryParameter("CredentialProviderConfig", credentialProviderConfig);
            this.credentialProviderConfig = credentialProviderConfig;
            return this;
        }

        /**
         * <p>The credential provider identifier.</p>
         * <blockquote>
         * <p>Valid characters: uppercase and lowercase letters, digits, and the following special characters: <code>.-_</code>. The identifier can be up to 64 characters in length.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_example_identifier</p>
         */
        public Builder credentialProviderIdentifier(String credentialProviderIdentifier) {
            this.putQueryParameter("CredentialProviderIdentifier", credentialProviderIdentifier);
            this.credentialProviderIdentifier = credentialProviderIdentifier;
            return this;
        }

        /**
         * <p>The credential provider name.</p>
         * <blockquote>
         * <p>The name can be up to 64 characters in length.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_example_name</p>
         */
        public Builder credentialProviderName(String credentialProviderName) {
            this.putQueryParameter("CredentialProviderName", credentialProviderName);
            this.credentialProviderName = credentialProviderName;
            return this;
        }

        /**
         * <p>The credential provider type. Valid values:</p>
         * <ul>
         * <li>oauth: OAuth credential provider</li>
         * <li>jwt: JWT credential provider</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oauth</p>
         */
        public Builder credentialProviderType(String credentialProviderType) {
            this.putQueryParameter("CredentialProviderType", credentialProviderType);
            this.credentialProviderType = credentialProviderType;
            return this;
        }

        /**
         * <p>The description.</p>
         * <blockquote>
         * <p>The description can be up to 128 characters in length.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>This is an example description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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

        @Override
        public CreateCredentialProviderRequest build() {
            return new CreateCredentialProviderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCredentialProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateCredentialProviderRequest</p>
     */
    public static class JwtProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedTokenIssuers")
        private java.util.List<String> allowedTokenIssuers;

        @com.aliyun.core.annotation.NameInMap("DerivedShortTokenEnabled")
        private Boolean derivedShortTokenEnabled;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private Integer expiration;

        @com.aliyun.core.annotation.NameInMap("ExpirationCleanupEnabled")
        private Boolean expirationCleanupEnabled;

        private JwtProviderConfig(Builder builder) {
            this.allowedTokenIssuers = builder.allowedTokenIssuers;
            this.derivedShortTokenEnabled = builder.derivedShortTokenEnabled;
            this.expiration = builder.expiration;
            this.expirationCleanupEnabled = builder.expirationCleanupEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JwtProviderConfig create() {
            return builder().build();
        }

        /**
         * @return allowedTokenIssuers
         */
        public java.util.List<String> getAllowedTokenIssuers() {
            return this.allowedTokenIssuers;
        }

        /**
         * @return derivedShortTokenEnabled
         */
        public Boolean getDerivedShortTokenEnabled() {
            return this.derivedShortTokenEnabled;
        }

        /**
         * @return expiration
         */
        public Integer getExpiration() {
            return this.expiration;
        }

        /**
         * @return expirationCleanupEnabled
         */
        public Boolean getExpirationCleanupEnabled() {
            return this.expirationCleanupEnabled;
        }

        public static final class Builder {
            private java.util.List<String> allowedTokenIssuers; 
            private Boolean derivedShortTokenEnabled; 
            private Integer expiration; 
            private Boolean expirationCleanupEnabled; 

            private Builder() {
            } 

            private Builder(JwtProviderConfig model) {
                this.allowedTokenIssuers = model.allowedTokenIssuers;
                this.derivedShortTokenEnabled = model.derivedShortTokenEnabled;
                this.expiration = model.expiration;
                this.expirationCleanupEnabled = model.expirationCleanupEnabled;
            } 

            /**
             * <p>The list of allowed JWT issuers.</p>
             * <blockquote>
             * <p>The list can contain up to 200 items.</p>
             * </blockquote>
             */
            public Builder allowedTokenIssuers(java.util.List<String> allowedTokenIssuers) {
                this.allowedTokenIssuers = allowedTokenIssuers;
                return this;
            }

            /**
             * <p>Specifies whether to enable the capability to derive short tokens from JWTs.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder derivedShortTokenEnabled(Boolean derivedShortTokenEnabled) {
                this.derivedShortTokenEnabled = derivedShortTokenEnabled;
                return this;
            }

            /**
             * <p>The validity period of the JWT, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder expiration(Integer expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>Specifies whether to enable cleanup of expired JWTs.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder expirationCleanupEnabled(Boolean expirationCleanupEnabled) {
                this.expirationCleanupEnabled = expirationCleanupEnabled;
                return this;
            }

            public JwtProviderConfig build() {
                return new JwtProviderConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCredentialProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateCredentialProviderRequest</p>
     */
    public static class OAuthProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationEndpoint")
        private String authorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("AuthorizationFlow")
        private String authorizationFlow;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        @com.aliyun.core.annotation.Validation(required = true)
        private String clientSecret;

        @com.aliyun.core.annotation.NameInMap("DiscoveryUrl")
        private String discoveryUrl;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("PkceChallengeMethod")
        private String pkceChallengeMethod;

        @com.aliyun.core.annotation.NameInMap("PkceEnabled")
        private Boolean pkceEnabled;

        @com.aliyun.core.annotation.NameInMap("ProviderVendor")
        private String providerVendor;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("TokenEndpoint")
        private String tokenEndpoint;

        private OAuthProviderConfig(Builder builder) {
            this.authorizationEndpoint = builder.authorizationEndpoint;
            this.authorizationFlow = builder.authorizationFlow;
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
            this.discoveryUrl = builder.discoveryUrl;
            this.issuer = builder.issuer;
            this.pkceChallengeMethod = builder.pkceChallengeMethod;
            this.pkceEnabled = builder.pkceEnabled;
            this.providerVendor = builder.providerVendor;
            this.scope = builder.scope;
            this.tokenEndpoint = builder.tokenEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OAuthProviderConfig create() {
            return builder().build();
        }

        /**
         * @return authorizationEndpoint
         */
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        /**
         * @return authorizationFlow
         */
        public String getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
        }

        /**
         * @return discoveryUrl
         */
        public String getDiscoveryUrl() {
            return this.discoveryUrl;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return pkceChallengeMethod
         */
        public String getPkceChallengeMethod() {
            return this.pkceChallengeMethod;
        }

        /**
         * @return pkceEnabled
         */
        public Boolean getPkceEnabled() {
            return this.pkceEnabled;
        }

        /**
         * @return providerVendor
         */
        public String getProviderVendor() {
            return this.providerVendor;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return tokenEndpoint
         */
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public static final class Builder {
            private String authorizationEndpoint; 
            private String authorizationFlow; 
            private String clientId; 
            private String clientSecret; 
            private String discoveryUrl; 
            private String issuer; 
            private String pkceChallengeMethod; 
            private Boolean pkceEnabled; 
            private String providerVendor; 
            private String scope; 
            private String tokenEndpoint; 

            private Builder() {
            } 

            private Builder(OAuthProviderConfig model) {
                this.authorizationEndpoint = model.authorizationEndpoint;
                this.authorizationFlow = model.authorizationFlow;
                this.clientId = model.clientId;
                this.clientSecret = model.clientSecret;
                this.discoveryUrl = model.discoveryUrl;
                this.issuer = model.issuer;
                this.pkceChallengeMethod = model.pkceChallengeMethod;
                this.pkceEnabled = model.pkceEnabled;
                this.providerVendor = model.providerVendor;
                this.scope = model.scope;
                this.tokenEndpoint = model.tokenEndpoint;
            } 

            /**
             * <p>The authorization endpoint in the OAuth protocol.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/authorize">https://example.com/authorize</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>The OAuth authorization flow type. Valid values:</p>
             * <ul>
             * <li>m2m: Machine-to-machine</li>
             * <li>user_federation: User federation</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>m2m</p>
             */
            public Builder authorizationFlow(String authorizationFlow) {
                this.authorizationFlow = authorizationFlow;
                return this;
            }

            /**
             * <p>The client ID in the OAuth protocol.</p>
             * <blockquote>
             * <p>The client ID can be up to 128 characters in length.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>client_id_example_xxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The client secret in the OAuth protocol.</p>
             * <blockquote>
             * <p>The client secret can be up to 1,024 characters in length.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>client_secret_example_xxx</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * <p>The URL of the OAuth discovery document.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/.well-known/openid-configuration">https://example.com/.well-known/openid-configuration</a></p>
             */
            public Builder discoveryUrl(String discoveryUrl) {
                this.discoveryUrl = discoveryUrl;
                return this;
            }

            /**
             * <p>The issuer endpoint in the OAuth protocol.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/issuer">https://example.com/issuer</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The algorithm used to calculate the code challenge in PKCE. Valid values:</p>
             * <ul>
             * <li>S256</li>
             * <li>plain</li>
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
             * <p>Specifies whether to enable Proof Key for Code Exchange (PKCE).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pkceEnabled(Boolean pkceEnabled) {
                this.pkceEnabled = pkceEnabled;
                return this;
            }

            /**
             * <p>The OAuth provider vendor type. Valid values:</p>
             * <ul>
             * <li>custom: Custom</li>
             * <li>dingtalk: DingTalk</li>
             * <li>feishu: Lark</li>
             * <li>github: GitHub</li>
             * <li>microsoft: Microsoft</li>
             * <li>google: Google</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder providerVendor(String providerVendor) {
                this.providerVendor = providerVendor;
                return this;
            }

            /**
             * <p>The scope in the OAuth protocol.</p>
             * <blockquote>
             * <p>The scope configuration of the OAuth credential provider serves as a fallback value. If the scope parameter is not specified when you call the Developer API to obtain an OAuth access token, the scope configuration of the credential provider is used to issue the token.
             * Notice: Separate multiple scope values with spaces.</notice>
             * Limits on a single scope value:</p>
             * </blockquote>
             * <ol>
             * <li>Valid characters: lowercase letters, digits, and the following special characters: <code>|/:_-.</code>.</li>
             * <li>The value must contain lowercase letters or digits.</li>
             * <li>The value must start with a period (<code>.</code>), a lowercase letter, or a digit.</li>
             * <li>The value can be up to 1,024 characters in length.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>example:test_01 example:test_02</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The token endpoint in the OAuth protocol.</p>
             * <blockquote>
             * <p>The endpoint must start with <code>http://</code> or <code>https://</code> and can be up to 1,024 characters in length.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/token">https://example.com/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            public OAuthProviderConfig build() {
                return new OAuthProviderConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCredentialProviderRequest} extends {@link TeaModel}
     *
     * <p>CreateCredentialProviderRequest</p>
     */
    public static class CredentialProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JwtProviderConfig")
        private JwtProviderConfig jwtProviderConfig;

        @com.aliyun.core.annotation.NameInMap("OAuthProviderConfig")
        private OAuthProviderConfig oAuthProviderConfig;

        private CredentialProviderConfig(Builder builder) {
            this.jwtProviderConfig = builder.jwtProviderConfig;
            this.oAuthProviderConfig = builder.oAuthProviderConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialProviderConfig create() {
            return builder().build();
        }

        /**
         * @return jwtProviderConfig
         */
        public JwtProviderConfig getJwtProviderConfig() {
            return this.jwtProviderConfig;
        }

        /**
         * @return oAuthProviderConfig
         */
        public OAuthProviderConfig getOAuthProviderConfig() {
            return this.oAuthProviderConfig;
        }

        public static final class Builder {
            private JwtProviderConfig jwtProviderConfig; 
            private OAuthProviderConfig oAuthProviderConfig; 

            private Builder() {
            } 

            private Builder(CredentialProviderConfig model) {
                this.jwtProviderConfig = model.jwtProviderConfig;
                this.oAuthProviderConfig = model.oAuthProviderConfig;
            } 

            /**
             * <p>The configuration of the JWT credential provider.</p>
             */
            public Builder jwtProviderConfig(JwtProviderConfig jwtProviderConfig) {
                this.jwtProviderConfig = jwtProviderConfig;
                return this;
            }

            /**
             * <p>The configuration of the OAuth credential provider.</p>
             */
            public Builder oAuthProviderConfig(OAuthProviderConfig oAuthProviderConfig) {
                this.oAuthProviderConfig = oAuthProviderConfig;
                return this;
            }

            public CredentialProviderConfig build() {
                return new CredentialProviderConfig(this);
            } 

        } 

    }
}
