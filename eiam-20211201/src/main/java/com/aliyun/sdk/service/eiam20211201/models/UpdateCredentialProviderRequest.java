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
         * <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
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
         * <p>认证令牌提供商的配置。</p>
         */
        public Builder credentialProviderConfig(CredentialProviderConfig credentialProviderConfig) {
            this.putQueryParameter("CredentialProviderConfig", credentialProviderConfig);
            this.credentialProviderConfig = credentialProviderConfig;
            return this;
        }

        /**
         * <p>认证令牌提供商ID。</p>
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
         * <p>认证令牌提供商名称。</p>
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
        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("TokenEndpoint")
        private String tokenEndpoint;

        private OAuthProviderConfig(Builder builder) {
            this.clientSecret = builder.clientSecret;
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
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
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
            private String clientSecret; 
            private String scope; 
            private String tokenEndpoint; 

            private Builder() {
            } 

            private Builder(OAuthProviderConfig model) {
                this.clientSecret = model.clientSecret;
                this.scope = model.scope;
                this.tokenEndpoint = model.tokenEndpoint;
            } 

            /**
             * <p>OAuth协议中的client_secret，客户端密钥。</p>
             * 
             * <strong>example:</strong>
             * <p>client_secret_example_xxx</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
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

            public CredentialProviderConfig build() {
                return new CredentialProviderConfig(this);
            } 

        } 

    }
}
