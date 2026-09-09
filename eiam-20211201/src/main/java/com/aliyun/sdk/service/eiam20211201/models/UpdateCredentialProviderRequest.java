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
 * {@link UpdateCredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateCredentialProviderRequest</p>
 */
public class UpdateCredentialProviderRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("CredentialProviderId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String credentialProviderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialProviderName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String credentialProviderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private UpdateCredentialProviderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.credentialProviderConfig = builder.credentialProviderConfig;
        this.credentialProviderId = builder.credentialProviderId;
        this.credentialProviderName = builder.credentialProviderName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCredentialProviderRequest create() {
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
     * @return credentialProviderId
     */
    public String getCredentialProviderId() {
        return this.credentialProviderId;
    }

    /**
     * @return credentialProviderName
     */
    public String getCredentialProviderName() {
        return this.credentialProviderName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateCredentialProviderRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private CredentialProviderConfig credentialProviderConfig; 
        private String credentialProviderId; 
        private String credentialProviderName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCredentialProviderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.credentialProviderConfig = request.credentialProviderConfig;
            this.credentialProviderId = request.credentialProviderId;
            this.credentialProviderName = request.credentialProviderName;
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
         * <p>The idempotency token that ensures the idempotence of the request.</p>
         * <p>Generate a unique parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters. For more information, see References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
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
         * <p>The credential provider ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
         */
        public Builder credentialProviderId(String credentialProviderId) {
            this.putQueryParameter("CredentialProviderId", credentialProviderId);
            this.credentialProviderId = credentialProviderId;
            return this;
        }

        /**
         * <p>The credential provider name.</p>
         * <blockquote>
         * <p>The name cannot exceed 64 characters in length.</p>
         * </blockquote>
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
        public UpdateCredentialProviderRequest build() {
            return new UpdateCredentialProviderRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCredentialProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateCredentialProviderRequest</p>
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
             * <p>The list cannot contain more than 200 entries.</p>
             * </blockquote>
             * <blockquote>
             * <p>Notice: To clear the issuer list, pass an empty list or an empty string when calling the API.</p>
             * </blockquote>
             */
            public Builder allowedTokenIssuers(java.util.List<String> allowedTokenIssuers) {
                this.allowedTokenIssuers = allowedTokenIssuers;
                return this;
            }

            /**
             * <p>Specifies whether the JWT derived short token feature is enabled.</p>
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
             * <p>Specifies whether JWT expiration cleanup is enabled.</p>
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
     * {@link UpdateCredentialProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateCredentialProviderRequest</p>
     */
    public static class OAuthProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationEndpoint")
        private String authorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("AuthorizationFlow")
        private String authorizationFlow;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
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
             * <p>The authorization endpoint.</p>
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
             * <li>m2m: machine-to-machine.</li>
             * <li>user_federation: user federation.</li>
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
             * <p>The client_secret in the OAuth protocol.</p>
             * <blockquote>
             * <p>The value cannot exceed 1024 characters in length.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>client_secret_example_xxx</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * <p>The auto-discovery URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/.well-known/openid-configuration">https://example.com/.well-known/openid-configuration</a></p>
             */
            public Builder discoveryUrl(String discoveryUrl) {
                this.discoveryUrl = discoveryUrl;
                return this;
            }

            /**
             * <p>The authorization server identifier URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/issuer">https://example.com/issuer</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The PKCE challenge method. Valid values:</p>
             * <ul>
             * <li>S256.</li>
             * <li>plain.</li>
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
             * <p>Specifies whether PKCE is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pkceEnabled(Boolean pkceEnabled) {
                this.pkceEnabled = pkceEnabled;
                return this;
            }

            /**
             * <p>The vendor type. Valid values:</p>
             * <ul>
             * <li>custom: custom.</li>
             * <li>dingtalk: DingTalk.</li>
             * <li>feishu: Lark.</li>
             * <li>github: GitHub.</li>
             * <li>microsoft: Microsoft.</li>
             * <li>google: Google.</li>
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
             * <p>The scope in the OAuth protocol, which specifies the permission scope.</p>
             * <blockquote>
             * <p>The Scope configuration on the credential provider serves as the fallback value. If the scope parameter is not specified when calling the DeveloperAPI to obtain an OAuth Access Token, the Scope configuration on the credential provider is used for issuance.</p>
             * </blockquote>
             * <blockquote>
             * <p>Notice: Separate multiple Scope values with spaces. To clear the Scope configuration, pass an empty string.</p>
             * </blockquote>
             * <p>Restrictions on each individual Scope value:</p>
             * <ol>
             * <li>Allowed characters: lowercase letters, digits, and special characters <code>|/:_-.</code></li>
             * <li>Must contain at least one lowercase letter or digit.</li>
             * <li>Must start with a special character <code>.</code>, a lowercase letter, or a digit.</li>
             * <li>Cannot exceed 1024 characters in length.</li>
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
             * <p>The token endpoint of the OAuth protocol.</p>
             * <blockquote>
             * <p>The value must start with <code>http://</code> or <code>https://</code> and cannot exceed 1024 characters in length.</p>
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
     * {@link UpdateCredentialProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateCredentialProviderRequest</p>
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
