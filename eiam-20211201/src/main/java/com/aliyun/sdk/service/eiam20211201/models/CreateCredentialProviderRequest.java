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
         * <p>The idempotency token that ensures the idempotence of the request.</p>
         * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see References <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
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
         * <p>The configuration of the credential provider.</p>
         */
        public Builder credentialProviderConfig(CredentialProviderConfig credentialProviderConfig) {
            this.putQueryParameter("CredentialProviderConfig", credentialProviderConfig);
            this.credentialProviderConfig = credentialProviderConfig;
            return this;
        }

        /**
         * <p>The identifier of the credential provider.</p>
         * <blockquote>
         * <p>Allowed characters include uppercase and lowercase letters, digits, and the special characters <code>.-_</code>. The length cannot exceed 64 characters.</p>
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
         * <p>The name of the credential provider.</p>
         * <blockquote>
         * <p>The length cannot exceed 64 characters.</p>
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
         * <p>The type of the credential provider. Valid values:</p>
         * <ul>
         * <li>oauth: OAuth credential provider.</li>
         * <li>jwt: JWT credential provider.</li>
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
         * <p>The length cannot exceed 128 characters.</p>
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
             * <p>The list length cannot exceed 200.</p>
             * </blockquote>
             */
            public Builder allowedTokenIssuers(java.util.List<String> allowedTokenIssuers) {
                this.allowedTokenIssuers = allowedTokenIssuers;
                return this;
            }

            /**
             * <p>Specifies whether to enable the JWT derived short token capability.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder derivedShortTokenEnabled(Boolean derivedShortTokenEnabled) {
                this.derivedShortTokenEnabled = derivedShortTokenEnabled;
                return this;
            }

            /**
             * <p>The validity duration of the JWT. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder expiration(Integer expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>Specifies whether to enable JWT expiration cleanup.</p>
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
             * <p>The endpoint address used to guide users through authorization. Conditionally required: required when AuthorizationFlow=user_federation and ProviderVendor=custom. For preset vendors, this can be automatically populated through DiscoveryUrl.</p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>The OAuth authorization flow type. Valid values: m2m: machine-to-machine (2LO, Client Credentials). user_federation: user federation (3LO, Authorization Code).</p>
             */
            public Builder authorizationFlow(String authorizationFlow) {
                this.authorizationFlow = authorizationFlow;
                return this;
            }

            /**
             * <p>The client_id in the OAuth protocol.</p>
             * <blockquote>
             * <p>The length cannot exceed 128 characters.</p>
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
             * <p>The client_secret in the OAuth protocol.</p>
             * <blockquote>
             * <p>The length cannot exceed 1024 characters.</p>
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
             * <p>The Discovery document URL used to automatically retrieve OAuth endpoint configurations. Conditionally optional: used when AuthorizationFlow=user_federation. If DiscoveryUrl is not provided, you must manually configure fields such as TokenEndpoint and AuthorizationEndpoint.</p>
             */
            public Builder discoveryUrl(String discoveryUrl) {
                this.discoveryUrl = discoveryUrl;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The PKCE code_challenge generation method. Default value: s256.</p>
             */
            public Builder pkceChallengeMethod(String pkceChallengeMethod) {
                this.pkceChallengeMethod = pkceChallengeMethod;
                return this;
            }

            /**
             * <p>Specifies whether to use the PKCE extension to enhance security. We recommend that you always enable this feature.</p>
             */
            public Builder pkceEnabled(Boolean pkceEnabled) {
                this.pkceEnabled = pkceEnabled;
                return this;
            }

            /**
             * <p>The preset vendor or custom configuration. Optional. Default value: custom.</p>
             */
            public Builder providerVendor(String providerVendor) {
                this.providerVendor = providerVendor;
                return this;
            }

            /**
             * <p>The scope in the OAuth protocol, which defines the permission range.</p>
             * <blockquote>
             * <p>The Scope configuration on the credential provider serves as the fallback value. If the scope parameter is not specified when calling the DeveloperAPI to obtain an OAuth Access Token, the Scope configuration on the credential provider is used for issuance.</p>
             * </blockquote>
             * <blockquote>
             * <p>Notice: Separate multiple Scope values with spaces.</p>
             * </blockquote>
             * <p>Restrictions for each individual Scope value:</p>
             * <ol>
             * <li>Allowed characters: lowercase letters, digits, and the special characters <code>|/:_-.</code></li>
             * <li>Must contain at least one lowercase letter or digit.</li>
             * <li>Must start with the special character <code>.</code>, a lowercase letter, or a digit.</li>
             * <li>The length cannot exceed 1024 characters.</li>
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
             * <p>Must start with <code>http://</code> or <code>https://</code>, and the length cannot exceed 1024 characters.</p>
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
