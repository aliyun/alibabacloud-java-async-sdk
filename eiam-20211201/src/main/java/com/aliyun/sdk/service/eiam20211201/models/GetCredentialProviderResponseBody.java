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
 * {@link GetCredentialProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetCredentialProviderResponseBody</p>
 */
public class GetCredentialProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CredentialProvider")
    private CredentialProvider credentialProvider;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCredentialProviderResponseBody(Builder builder) {
        this.credentialProvider = builder.credentialProvider;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialProvider
     */
    public CredentialProvider getCredentialProvider() {
        return this.credentialProvider;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CredentialProvider credentialProvider; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCredentialProviderResponseBody model) {
            this.credentialProvider = model.credentialProvider;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The credential provider.</p>
         */
        public Builder credentialProvider(CredentialProvider credentialProvider) {
            this.credentialProvider = credentialProvider;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCredentialProviderResponseBody build() {
            return new GetCredentialProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCredentialProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetCredentialProviderResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("JwksEndpoint")
        private String jwksEndpoint;

        private JwtProviderConfig(Builder builder) {
            this.allowedTokenIssuers = builder.allowedTokenIssuers;
            this.derivedShortTokenEnabled = builder.derivedShortTokenEnabled;
            this.expiration = builder.expiration;
            this.expirationCleanupEnabled = builder.expirationCleanupEnabled;
            this.issuer = builder.issuer;
            this.jwksEndpoint = builder.jwksEndpoint;
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

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return jwksEndpoint
         */
        public String getJwksEndpoint() {
            return this.jwksEndpoint;
        }

        public static final class Builder {
            private java.util.List<String> allowedTokenIssuers; 
            private Boolean derivedShortTokenEnabled; 
            private Integer expiration; 
            private Boolean expirationCleanupEnabled; 
            private String issuer; 
            private String jwksEndpoint; 

            private Builder() {
            } 

            private Builder(JwtProviderConfig model) {
                this.allowedTokenIssuers = model.allowedTokenIssuers;
                this.derivedShortTokenEnabled = model.derivedShortTokenEnabled;
                this.expiration = model.expiration;
                this.expirationCleanupEnabled = model.expirationCleanupEnabled;
                this.issuer = model.issuer;
                this.jwksEndpoint = model.jwksEndpoint;
            } 

            /**
             * <p>The list of allowed JWT issuers.</p>
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
             * <p>The validity period of the JWT. Unit: seconds.</p>
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

            /**
             * <p>JWT issuer。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.issuer.com">https://test.issuer.com</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The JWKs endpoint address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example123456.aliyunidaas.com/api/v2/auths_ngz2wj35ixxxdyat55nexxxxxx/oauth2/jwks">https://example123456.aliyunidaas.com/api/v2/auths_ngz2wj35ixxxdyat55nexxxxxx/oauth2/jwks</a></p>
             */
            public Builder jwksEndpoint(String jwksEndpoint) {
                this.jwksEndpoint = jwksEndpoint;
                return this;
            }

            public JwtProviderConfig build() {
                return new JwtProviderConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCredentialProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetCredentialProviderResponseBody</p>
     */
    public static class OAuthProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationEndpoint")
        private String authorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("AuthorizationFlow")
        private String authorizationFlow;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

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

        @com.aliyun.core.annotation.NameInMap("SystemRedirectUri")
        private String systemRedirectUri;

        @com.aliyun.core.annotation.NameInMap("TokenEndpoint")
        private String tokenEndpoint;

        private OAuthProviderConfig(Builder builder) {
            this.authorizationEndpoint = builder.authorizationEndpoint;
            this.authorizationFlow = builder.authorizationFlow;
            this.clientId = builder.clientId;
            this.discoveryUrl = builder.discoveryUrl;
            this.issuer = builder.issuer;
            this.pkceChallengeMethod = builder.pkceChallengeMethod;
            this.pkceEnabled = builder.pkceEnabled;
            this.providerVendor = builder.providerVendor;
            this.scope = builder.scope;
            this.systemRedirectUri = builder.systemRedirectUri;
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
         * @return systemRedirectUri
         */
        public String getSystemRedirectUri() {
            return this.systemRedirectUri;
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
            private String discoveryUrl; 
            private String issuer; 
            private String pkceChallengeMethod; 
            private Boolean pkceEnabled; 
            private String providerVendor; 
            private String scope; 
            private String systemRedirectUri; 
            private String tokenEndpoint; 

            private Builder() {
            } 

            private Builder(OAuthProviderConfig model) {
                this.authorizationEndpoint = model.authorizationEndpoint;
                this.authorizationFlow = model.authorizationFlow;
                this.clientId = model.clientId;
                this.discoveryUrl = model.discoveryUrl;
                this.issuer = model.issuer;
                this.pkceChallengeMethod = model.pkceChallengeMethod;
                this.pkceEnabled = model.pkceEnabled;
                this.providerVendor = model.providerVendor;
                this.scope = model.scope;
                this.systemRedirectUri = model.systemRedirectUri;
                this.tokenEndpoint = model.tokenEndpoint;
            } 

            /**
             * <p>The endpoint address used to guide users through authorization. This parameter is conditionally required: it is required when AuthorizationFlow is set to user_federation and ProviderVendor is set to custom. For preset vendors, this value can be automatically populated through DiscoveryUrl.</p>
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
             * 
             * <strong>example:</strong>
             * <p>client_id_example_xxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The URL of the discovery document used to automatically obtain OAuth endpoint configurations. This parameter is conditionally optional: it is used when AuthorizationFlow is set to user_federation. If DiscoveryUrl is not provided, you must manually configure fields such as TokenEndpoint and AuthorizationEndpoint.</p>
             */
            public Builder discoveryUrl(String discoveryUrl) {
                this.discoveryUrl = discoveryUrl;
                return this;
            }

            /**
             * <p>JWT issuer。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.issuer.com">https://test.issuer.com</a></p>
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
             * <p>The preset vendor or custom configuration. This parameter is optional. Default value: custom.</p>
             */
            public Builder providerVendor(String providerVendor) {
                this.providerVendor = providerVendor;
                return this;
            }

            /**
             * <p>The scope in the OAuth protocol, which specifies the permission scope.</p>
             * <blockquote>
             * <p>The scope configuration of the OAuth credential provider serves as the default value. If the scope parameter is not specified when calling the DeveloperAPI to obtain an OAuth access token, the scope configuration of the credential provider is used for token issuance.</p>
             * </blockquote>
             * <blockquote>
             * <p>Notice: Multiple scope values are separated by spaces.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>example:test_01 example:test_02</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The redirect URI automatically generated by the system when the credential provider is created. Configure this value as the redirect_uri in the OAuth provider.</p>
             */
            public Builder systemRedirectUri(String systemRedirectUri) {
                this.systemRedirectUri = systemRedirectUri;
                return this;
            }

            /**
             * <p>The token endpoint of the OAuth protocol.</p>
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
     * {@link GetCredentialProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetCredentialProviderResponseBody</p>
     */
    public static class CredentialProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JwtProviderConfig")
        private JwtProviderConfig jwtProviderConfig;

        @com.aliyun.core.annotation.NameInMap("OAuthProviderConfig")
        private OAuthProviderConfig oAuthProviderConfig;

        @com.aliyun.core.annotation.NameInMap("ProviderCredentialIds")
        private java.util.List<String> providerCredentialIds;

        private CredentialProviderConfig(Builder builder) {
            this.jwtProviderConfig = builder.jwtProviderConfig;
            this.oAuthProviderConfig = builder.oAuthProviderConfig;
            this.providerCredentialIds = builder.providerCredentialIds;
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

        /**
         * @return providerCredentialIds
         */
        public java.util.List<String> getProviderCredentialIds() {
            return this.providerCredentialIds;
        }

        public static final class Builder {
            private JwtProviderConfig jwtProviderConfig; 
            private OAuthProviderConfig oAuthProviderConfig; 
            private java.util.List<String> providerCredentialIds; 

            private Builder() {
            } 

            private Builder(CredentialProviderConfig model) {
                this.jwtProviderConfig = model.jwtProviderConfig;
                this.oAuthProviderConfig = model.oAuthProviderConfig;
                this.providerCredentialIds = model.providerCredentialIds;
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

            /**
             * <p>The list of credential IDs that correspond to the sensitive configurations of the credential provider.</p>
             * <blockquote>
             * <p>The system securely stores the sensitive configuration information of the credential provider in the form of credentials.</p>
             * </blockquote>
             */
            public Builder providerCredentialIds(java.util.List<String> providerCredentialIds) {
                this.providerCredentialIds = providerCredentialIds;
                return this;
            }

            public CredentialProviderConfig build() {
                return new CredentialProviderConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCredentialProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetCredentialProviderResponseBody</p>
     */
    public static class CredentialProvider extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CredentialProviderConfig")
        private CredentialProviderConfig credentialProviderConfig;

        @com.aliyun.core.annotation.NameInMap("CredentialProviderCreationType")
        private String credentialProviderCreationType;

        @com.aliyun.core.annotation.NameInMap("CredentialProviderId")
        private String credentialProviderId;

        @com.aliyun.core.annotation.NameInMap("CredentialProviderIdentifier")
        private String credentialProviderIdentifier;

        @com.aliyun.core.annotation.NameInMap("CredentialProviderName")
        private String credentialProviderName;

        @com.aliyun.core.annotation.NameInMap("CredentialProviderType")
        private String credentialProviderType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private CredentialProvider(Builder builder) {
            this.createTime = builder.createTime;
            this.credentialProviderConfig = builder.credentialProviderConfig;
            this.credentialProviderCreationType = builder.credentialProviderCreationType;
            this.credentialProviderId = builder.credentialProviderId;
            this.credentialProviderIdentifier = builder.credentialProviderIdentifier;
            this.credentialProviderName = builder.credentialProviderName;
            this.credentialProviderType = builder.credentialProviderType;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialProvider create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return credentialProviderConfig
         */
        public CredentialProviderConfig getCredentialProviderConfig() {
            return this.credentialProviderConfig;
        }

        /**
         * @return credentialProviderCreationType
         */
        public String getCredentialProviderCreationType() {
            return this.credentialProviderCreationType;
        }

        /**
         * @return credentialProviderId
         */
        public String getCredentialProviderId() {
            return this.credentialProviderId;
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
            private CredentialProviderConfig credentialProviderConfig; 
            private String credentialProviderCreationType; 
            private String credentialProviderId; 
            private String credentialProviderIdentifier; 
            private String credentialProviderName; 
            private String credentialProviderType; 
            private String description; 
            private String instanceId; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(CredentialProvider model) {
                this.createTime = model.createTime;
                this.credentialProviderConfig = model.credentialProviderConfig;
                this.credentialProviderCreationType = model.credentialProviderCreationType;
                this.credentialProviderId = model.credentialProviderId;
                this.credentialProviderIdentifier = model.credentialProviderIdentifier;
                this.credentialProviderName = model.credentialProviderName;
                this.credentialProviderType = model.credentialProviderType;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the credential provider was created. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830225000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The configuration of the credential provider.</p>
             */
            public Builder credentialProviderConfig(CredentialProviderConfig credentialProviderConfig) {
                this.credentialProviderConfig = credentialProviderConfig;
                return this;
            }

            /**
             * <p>The creation type of the credential provider. Valid values:</p>
             * <ul>
             * <li>system_init: Created by the system.</li>
             * <li>user_custom: Created by the user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user_custom</p>
             */
            public Builder credentialProviderCreationType(String credentialProviderCreationType) {
                this.credentialProviderCreationType = credentialProviderCreationType;
                return this;
            }

            /**
             * <p>The credential provider ID.</p>
             * 
             * <strong>example:</strong>
             * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
             */
            public Builder credentialProviderId(String credentialProviderId) {
                this.credentialProviderId = credentialProviderId;
                return this;
            }

            /**
             * <p>The business identifier of the credential provider.</p>
             * 
             * <strong>example:</strong>
             * <p>test_example_identifier</p>
             */
            public Builder credentialProviderIdentifier(String credentialProviderIdentifier) {
                this.credentialProviderIdentifier = credentialProviderIdentifier;
                return this;
            }

            /**
             * <p>The name of the credential provider.</p>
             * 
             * <strong>example:</strong>
             * <p>test_example_name</p>
             */
            public Builder credentialProviderName(String credentialProviderName) {
                this.credentialProviderName = credentialProviderName;
                return this;
            }

            /**
             * <p>The type of the credential provider. Valid values:</p>
             * <ul>
             * <li>oauth: OAuth credential provider.</li>
             * <li>jwt: JWT credential provider.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oauth</p>
             */
            public Builder credentialProviderType(String credentialProviderType) {
                this.credentialProviderType = credentialProviderType;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is an example description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the credential provider. Valid values:</p>
             * <ul>
             * <li>enabled: Enabled.</li>
             * <li>disabled: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the credential provider was last updated. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830225000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public CredentialProvider build() {
                return new CredentialProvider(this);
            } 

        } 

    }
}
