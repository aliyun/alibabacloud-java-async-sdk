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
 * {@link ListCredentialProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ListCredentialProvidersResponseBody</p>
 */
public class ListCredentialProvidersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CredentialProviders")
    private java.util.List<CredentialProviders> credentialProviders;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCredentialProvidersResponseBody(Builder builder) {
        this.credentialProviders = builder.credentialProviders;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCredentialProvidersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialProviders
     */
    public java.util.List<CredentialProviders> getCredentialProviders() {
        return this.credentialProviders;
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
        private java.util.List<CredentialProviders> credentialProviders; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCredentialProvidersResponseBody model) {
            this.credentialProviders = model.credentialProviders;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CredentialProviders.
         */
        public Builder credentialProviders(java.util.List<CredentialProviders> credentialProviders) {
            this.credentialProviders = credentialProviders;
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

        public ListCredentialProvidersResponseBody build() {
            return new ListCredentialProvidersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListCredentialProvidersResponseBody</p>
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
             * <p>签发出的JWT中的issuer字段的允许列表。</p>
             */
            public Builder allowedTokenIssuers(java.util.List<String> allowedTokenIssuers) {
                this.allowedTokenIssuers = allowedTokenIssuers;
                return this;
            }

            /**
             * <p>是否开启JWT派生短令牌能力。</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder derivedShortTokenEnabled(Boolean derivedShortTokenEnabled) {
                this.derivedShortTokenEnabled = derivedShortTokenEnabled;
                return this;
            }

            /**
             * <p>JWT的有效时长，单位秒。</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder expiration(Integer expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>是否开启JWT过期清理。</p>
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
             * <p>JWKs端点地址。</p>
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
     * {@link ListCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListCredentialProvidersResponseBody</p>
     */
    public static class OAuthProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("TokenEndpoint")
        private String tokenEndpoint;

        private OAuthProviderConfig(Builder builder) {
            this.clientId = builder.clientId;
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
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
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
            private String clientId; 
            private String scope; 
            private String tokenEndpoint; 

            private Builder() {
            } 

            private Builder(OAuthProviderConfig model) {
                this.clientId = model.clientId;
                this.scope = model.scope;
                this.tokenEndpoint = model.tokenEndpoint;
            } 

            /**
             * <p>OAuth协议中的client_id，客户端ID。</p>
             * 
             * <strong>example:</strong>
             * <p>client_id_example_xxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>OAuth协议中的scope，权限范围。</p>
             * 
             * <strong>example:</strong>
             * <p>example:test_01 example:test_02</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>OAuth协议的Token端点。</p>
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
     * {@link ListCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListCredentialProvidersResponseBody</p>
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
             * <p>JWT身份提供商配置。</p>
             */
            public Builder jwtProviderConfig(JwtProviderConfig jwtProviderConfig) {
                this.jwtProviderConfig = jwtProviderConfig;
                return this;
            }

            /**
             * <p>OAuth 2LO机用类型的提供商的配置。</p>
             */
            public Builder oAuthProviderConfig(OAuthProviderConfig oAuthProviderConfig) {
                this.oAuthProviderConfig = oAuthProviderConfig;
                return this;
            }

            /**
             * <p>认证令牌提供商的敏感配置对应的凭据ID列表。</p>
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
     * {@link ListCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListCredentialProvidersResponseBody</p>
     */
    public static class CredentialProviders extends TeaModel {
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

        private CredentialProviders(Builder builder) {
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

        public static CredentialProviders create() {
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

            private Builder(CredentialProviders model) {
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
             * <p>认证令牌提供商的创建时间，Unix时间戳。</p>
             * 
             * <strong>example:</strong>
             * <p>1649830225000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>认证令牌提供商的配置。</p>
             */
            public Builder credentialProviderConfig(CredentialProviderConfig credentialProviderConfig) {
                this.credentialProviderConfig = credentialProviderConfig;
                return this;
            }

            /**
             * <p>认证令牌提供商的创建类型。</p>
             * 
             * <strong>example:</strong>
             * <p>user_custom</p>
             */
            public Builder credentialProviderCreationType(String credentialProviderCreationType) {
                this.credentialProviderCreationType = credentialProviderCreationType;
                return this;
            }

            /**
             * <p>认证令牌提供商ID。</p>
             * 
             * <strong>example:</strong>
             * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
             */
            public Builder credentialProviderId(String credentialProviderId) {
                this.credentialProviderId = credentialProviderId;
                return this;
            }

            /**
             * <p>认证令牌提供商的业务标识。</p>
             * 
             * <strong>example:</strong>
             * <p>test_example_identifier</p>
             */
            public Builder credentialProviderIdentifier(String credentialProviderIdentifier) {
                this.credentialProviderIdentifier = credentialProviderIdentifier;
                return this;
            }

            /**
             * <p>认证令牌提供商名称。</p>
             * 
             * <strong>example:</strong>
             * <p>test_example_name</p>
             */
            public Builder credentialProviderName(String credentialProviderName) {
                this.credentialProviderName = credentialProviderName;
                return this;
            }

            /**
             * <p>认证令牌提供商的类型。</p>
             * 
             * <strong>example:</strong>
             * <p>oauth</p>
             */
            public Builder credentialProviderType(String credentialProviderType) {
                this.credentialProviderType = credentialProviderType;
                return this;
            }

            /**
             * <p>描述。</p>
             * 
             * <strong>example:</strong>
             * <p>This is an example description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>EIAM实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>认证令牌提供商的状态。</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>认证令牌提供商的更新时间，Unix时间戳。</p>
             * 
             * <strong>example:</strong>
             * <p>1649830225000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public CredentialProviders build() {
                return new CredentialProviders(this);
            } 

        } 

    }
}
