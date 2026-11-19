// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderResponseBody</p>
 */
public class GetIdentityProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetIdentityProviderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The binding details of the external identity provider.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message. Returns an error description when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetIdentityProviderResponseBody build() {
            return new GetIdentityProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bindingType")
        private String bindingType;

        @com.aliyun.core.annotation.NameInMap("entityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("loginUrl")
        private String loginUrl;

        @com.aliyun.core.annotation.NameInMap("ssoStatus")
        private String ssoStatus;

        private Configuration(Builder builder) {
            this.bindingType = builder.bindingType;
            this.entityId = builder.entityId;
            this.loginUrl = builder.loginUrl;
            this.ssoStatus = builder.ssoStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return bindingType
         */
        public String getBindingType() {
            return this.bindingType;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return loginUrl
         */
        public String getLoginUrl() {
            return this.loginUrl;
        }

        /**
         * @return ssoStatus
         */
        public String getSsoStatus() {
            return this.ssoStatus;
        }

        public static final class Builder {
            private String bindingType; 
            private String entityId; 
            private String loginUrl; 
            private String ssoStatus; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.bindingType = model.bindingType;
                this.entityId = model.entityId;
                this.loginUrl = model.loginUrl;
                this.ssoStatus = model.ssoStatus;
            } 

            /**
             * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This parameter is required when manually filled in. Queries return short names.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP-Redirect</p>
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * <p>This parameter is required when manually filled in. It must be non-empty and contain a maximum of 2,048 characters. Existing configurations do not support replacement. It is different from the Entity ID queried by the service provider (SP).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>This parameter is required when manually filled in. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * <p>The actual switch value is Enabled or Disabled, which is not equivalent to the expected loginEnabled value saved in AC.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder ssoStatus(String ssoStatus) {
                this.ssoStatus = ssoStatus;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("appKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("binding")
        private String binding;

        @com.aliyun.core.annotation.NameInMap("certificates")
        private String certificates;

        @com.aliyun.core.annotation.NameInMap("corpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("entityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("loginUrl")
        private String loginUrl;

        private Metadata(Builder builder) {
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.binding = builder.binding;
            this.certificates = builder.certificates;
            this.corpId = builder.corpId;
            this.entityId = builder.entityId;
            this.loginUrl = builder.loginUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return binding
         */
        public String getBinding() {
            return this.binding;
        }

        /**
         * @return certificates
         */
        public String getCertificates() {
            return this.certificates;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return loginUrl
         */
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public static final class Builder {
            private String appId; 
            private String appKey; 
            private String binding; 
            private String certificates; 
            private String corpId; 
            private String entityId; 
            private String loginUrl; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.appId = model.appId;
                this.appKey = model.appKey;
                this.binding = model.binding;
                this.certificates = model.certificates;
                this.corpId = model.corpId;
                this.entityId = model.entityId;
                this.loginUrl = model.loginUrl;
            } 

            /**
             * <p>The App ID of the Lark application. This parameter is required when the binding type is Feishu.</p>
             * 
             * <strong>example:</strong>
             * <p>cli_exampleappid01</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The AppKey of the DingTalk application. This parameter is required when the binding type is DingTalk.</p>
             * 
             * <strong>example:</strong>
             * <p>dingexampleappkey01</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>The SAML Binding URI in the historical metadata snapshot. For CustomSSO updates, use saml.bindingType.</p>
             * 
             * <strong>example:</strong>
             * <p>urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect</p>
             */
            public Builder binding(String binding) {
                this.binding = binding;
                return this;
            }

            /**
             * <p>The certificate string in the historical metadata snapshot. To edit the configuration, use saml.x509Certificates and do not submit the old metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>MIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQELBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoXDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8oGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYNW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbYEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Okkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0EBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUWld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImcaWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTqP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjocJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdVjfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5</p>
             */
            public Builder certificates(String certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * <p>The CorpId of the DingTalk enterprise. This parameter is required when the binding type is DingTalk.</p>
             * 
             * <strong>example:</strong>
             * <p>dingexamplecorpid01</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>This parameter is required when manually filled in. It must be non-empty and contain a maximum of 2,048 characters. Existing configurations do not support replacement. It is different from the Entity ID queried by the service provider (SP).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>This parameter is required when manually filled in. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class Oidc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorizationEndpoint")
        private String authorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("clientAuthMethod")
        private String clientAuthMethod;

        @com.aliyun.core.annotation.NameInMap("clientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("discoveryEndpoint")
        private String discoveryEndpoint;

        @com.aliyun.core.annotation.NameInMap("issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("jwksUri")
        private String jwksUri;

        @com.aliyun.core.annotation.NameInMap("pkceRequired")
        private Boolean pkceRequired;

        @com.aliyun.core.annotation.NameInMap("scopes")
        private java.util.List<String> scopes;

        @com.aliyun.core.annotation.NameInMap("ssoMappingClaim")
        private String ssoMappingClaim;

        @com.aliyun.core.annotation.NameInMap("tokenEndpoint")
        private String tokenEndpoint;

        @com.aliyun.core.annotation.NameInMap("userinfoEndpoint")
        private String userinfoEndpoint;

        private Oidc(Builder builder) {
            this.authorizationEndpoint = builder.authorizationEndpoint;
            this.clientAuthMethod = builder.clientAuthMethod;
            this.clientId = builder.clientId;
            this.discoveryEndpoint = builder.discoveryEndpoint;
            this.issuer = builder.issuer;
            this.jwksUri = builder.jwksUri;
            this.pkceRequired = builder.pkceRequired;
            this.scopes = builder.scopes;
            this.ssoMappingClaim = builder.ssoMappingClaim;
            this.tokenEndpoint = builder.tokenEndpoint;
            this.userinfoEndpoint = builder.userinfoEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Oidc create() {
            return builder().build();
        }

        /**
         * @return authorizationEndpoint
         */
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        /**
         * @return clientAuthMethod
         */
        public String getClientAuthMethod() {
            return this.clientAuthMethod;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return discoveryEndpoint
         */
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
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
         * @return pkceRequired
         */
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        /**
         * @return scopes
         */
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        /**
         * @return ssoMappingClaim
         */
        public String getSsoMappingClaim() {
            return this.ssoMappingClaim;
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
            private String clientAuthMethod; 
            private String clientId; 
            private String discoveryEndpoint; 
            private String issuer; 
            private String jwksUri; 
            private Boolean pkceRequired; 
            private java.util.List<String> scopes; 
            private String ssoMappingClaim; 
            private String tokenEndpoint; 
            private String userinfoEndpoint; 

            private Builder() {
            } 

            private Builder(Oidc model) {
                this.authorizationEndpoint = model.authorizationEndpoint;
                this.clientAuthMethod = model.clientAuthMethod;
                this.clientId = model.clientId;
                this.discoveryEndpoint = model.discoveryEndpoint;
                this.issuer = model.issuer;
                this.jwksUri = model.jwksUri;
                this.pkceRequired = model.pkceRequired;
                this.scopes = model.scopes;
                this.ssoMappingClaim = model.ssoMappingClaim;
                this.tokenEndpoint = model.tokenEndpoint;
                this.userinfoEndpoint = model.userinfoEndpoint;
            } 

            /**
             * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/authorize">https://idp.example.com/authorize</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>The default value is client_secret_post. If the value is none, PKCE must be enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>client_secret_post</p>
             */
            public Builder clientAuthMethod(String clientAuthMethod) {
                this.clientAuthMethod = clientAuthMethod;
                return this;
            }

            /**
             * <p>The client identifier registered in the external IdP, which is different from the Matrix client. In-place replacement is not supported after configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>example-client</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The absolute HTTPS discovery endpoint. It is mutually exclusive with manually entered endpoints.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/.well-known/openid-configuration">https://idp.example.com/.well-known/openid-configuration</a></p>
             */
            public Builder discoveryEndpoint(String discoveryEndpoint) {
                this.discoveryEndpoint = discoveryEndpoint;
                return this;
            }

            /**
             * <p>The absolute HTTPS issuer of the external IdP. In-place replacement is not supported after configuration.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com">https://idp.example.com</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/jwks">https://idp.example.com/jwks</a></p>
             */
            public Builder jwksUri(String jwksUri) {
                this.jwksUri = jwksUri;
                return this;
            }

            /**
             * <p>Specifies whether PKCE is enabled. Default value: true. It must be set to true when no client authentication is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pkceRequired(Boolean pkceRequired) {
                this.pkceRequired = pkceRequired;
                return this;
            }

            /**
             * <p>An array of strings that must contain openid. The default values are openid, profile, and email.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
             */
            public Builder scopes(java.util.List<String> scopes) {
                this.scopes = scopes;
                return this;
            }

            /**
             * <p>The claim name in the ID token used to match the SCIM externalId. If omitted during initial creation, the default value sub is used. If omitted during an update, the saved value is retained. For Azure, you can enter oid. The value must be non-empty and cannot contain whitespace characters. When you query oidc, the saved value is returned. When you query oidcConfiguration, the actual upstream value is returned, which may be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>oid</p>
             */
            public Builder ssoMappingClaim(String ssoMappingClaim) {
                this.ssoMappingClaim = ssoMappingClaim;
                return this;
            }

            /**
             * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/token">https://idp.example.com/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * <p>The optional absolute HTTPS URL in manual mode. Do not specify this parameter in discovery mode.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/userinfo">https://idp.example.com/userinfo</a></p>
             */
            public Builder userinfoEndpoint(String userinfoEndpoint) {
                this.userinfoEndpoint = userinfoEndpoint;
                return this;
            }

            public Oidc build() {
                return new Oidc(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class OidcConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorizationEndpoint")
        private String authorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("clientAuthMethod")
        private String clientAuthMethod;

        @com.aliyun.core.annotation.NameInMap("clientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("discoveryEndpoint")
        private String discoveryEndpoint;

        @com.aliyun.core.annotation.NameInMap("hasClientPrivateKey")
        private Boolean hasClientPrivateKey;

        @com.aliyun.core.annotation.NameInMap("hasClientSecret")
        private Boolean hasClientSecret;

        @com.aliyun.core.annotation.NameInMap("issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("jwksUri")
        private String jwksUri;

        @com.aliyun.core.annotation.NameInMap("pkceRequired")
        private Boolean pkceRequired;

        @com.aliyun.core.annotation.NameInMap("scopes")
        private java.util.List<String> scopes;

        @com.aliyun.core.annotation.NameInMap("ssoMappingClaim")
        private String ssoMappingClaim;

        @com.aliyun.core.annotation.NameInMap("ssoStatus")
        private String ssoStatus;

        @com.aliyun.core.annotation.NameInMap("tokenEndpoint")
        private String tokenEndpoint;

        @com.aliyun.core.annotation.NameInMap("userinfoEndpoint")
        private String userinfoEndpoint;

        private OidcConfiguration(Builder builder) {
            this.authorizationEndpoint = builder.authorizationEndpoint;
            this.clientAuthMethod = builder.clientAuthMethod;
            this.clientId = builder.clientId;
            this.discoveryEndpoint = builder.discoveryEndpoint;
            this.hasClientPrivateKey = builder.hasClientPrivateKey;
            this.hasClientSecret = builder.hasClientSecret;
            this.issuer = builder.issuer;
            this.jwksUri = builder.jwksUri;
            this.pkceRequired = builder.pkceRequired;
            this.scopes = builder.scopes;
            this.ssoMappingClaim = builder.ssoMappingClaim;
            this.ssoStatus = builder.ssoStatus;
            this.tokenEndpoint = builder.tokenEndpoint;
            this.userinfoEndpoint = builder.userinfoEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OidcConfiguration create() {
            return builder().build();
        }

        /**
         * @return authorizationEndpoint
         */
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        /**
         * @return clientAuthMethod
         */
        public String getClientAuthMethod() {
            return this.clientAuthMethod;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return discoveryEndpoint
         */
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
        }

        /**
         * @return hasClientPrivateKey
         */
        public Boolean getHasClientPrivateKey() {
            return this.hasClientPrivateKey;
        }

        /**
         * @return hasClientSecret
         */
        public Boolean getHasClientSecret() {
            return this.hasClientSecret;
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
         * @return pkceRequired
         */
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        /**
         * @return scopes
         */
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        /**
         * @return ssoMappingClaim
         */
        public String getSsoMappingClaim() {
            return this.ssoMappingClaim;
        }

        /**
         * @return ssoStatus
         */
        public String getSsoStatus() {
            return this.ssoStatus;
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
            private String clientAuthMethod; 
            private String clientId; 
            private String discoveryEndpoint; 
            private Boolean hasClientPrivateKey; 
            private Boolean hasClientSecret; 
            private String issuer; 
            private String jwksUri; 
            private Boolean pkceRequired; 
            private java.util.List<String> scopes; 
            private String ssoMappingClaim; 
            private String ssoStatus; 
            private String tokenEndpoint; 
            private String userinfoEndpoint; 

            private Builder() {
            } 

            private Builder(OidcConfiguration model) {
                this.authorizationEndpoint = model.authorizationEndpoint;
                this.clientAuthMethod = model.clientAuthMethod;
                this.clientId = model.clientId;
                this.discoveryEndpoint = model.discoveryEndpoint;
                this.hasClientPrivateKey = model.hasClientPrivateKey;
                this.hasClientSecret = model.hasClientSecret;
                this.issuer = model.issuer;
                this.jwksUri = model.jwksUri;
                this.pkceRequired = model.pkceRequired;
                this.scopes = model.scopes;
                this.ssoMappingClaim = model.ssoMappingClaim;
                this.ssoStatus = model.ssoStatus;
                this.tokenEndpoint = model.tokenEndpoint;
                this.userinfoEndpoint = model.userinfoEndpoint;
            } 

            /**
             * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/authorize">https://idp.example.com/authorize</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>The default value is client_secret_post. If the value is none, PKCE must be enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>client_secret_post</p>
             */
            public Builder clientAuthMethod(String clientAuthMethod) {
                this.clientAuthMethod = clientAuthMethod;
                return this;
            }

            /**
             * <p>The client identifier registered in the external IdP, which is different from the Matrix client. In-place replacement is not supported after configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>example-client</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The absolute HTTPS discovery endpoint. It is mutually exclusive with manually entered endpoints.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/.well-known/openid-configuration">https://idp.example.com/.well-known/openid-configuration</a></p>
             */
            public Builder discoveryEndpoint(String discoveryEndpoint) {
                this.discoveryEndpoint = discoveryEndpoint;
                return this;
            }

            /**
             * <p>Indicates whether the client secret is saved. Only the existence status is returned, not the plaintext.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasClientPrivateKey(Boolean hasClientPrivateKey) {
                this.hasClientPrivateKey = hasClientPrivateKey;
                return this;
            }

            /**
             * <p>Indicates whether the client secret is saved. Only the existence status is returned, not the plaintext.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasClientSecret(Boolean hasClientSecret) {
                this.hasClientSecret = hasClientSecret;
                return this;
            }

            /**
             * <p>The absolute HTTPS issuer of the external IdP. In-place replacement is not supported after configuration.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com">https://idp.example.com</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/jwks">https://idp.example.com/jwks</a></p>
             */
            public Builder jwksUri(String jwksUri) {
                this.jwksUri = jwksUri;
                return this;
            }

            /**
             * <p>Specifies whether PKCE is enabled. Default value: true. It must be set to true when no client authentication is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pkceRequired(Boolean pkceRequired) {
                this.pkceRequired = pkceRequired;
                return this;
            }

            /**
             * <p>An array of strings that must contain openid. The default values are openid, profile, and email.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
             */
            public Builder scopes(java.util.List<String> scopes) {
                this.scopes = scopes;
                return this;
            }

            /**
             * <p>The claim name in the ID token used to match the SCIM externalId. If omitted during initial creation, the default value sub is used. If omitted during an update, the saved value is retained. For Azure, you can enter oid. The value must be non-empty and cannot contain whitespace characters. When you query oidc, the saved value is returned. When you query oidcConfiguration, the actual upstream value is returned, which may be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>oid</p>
             */
            public Builder ssoMappingClaim(String ssoMappingClaim) {
                this.ssoMappingClaim = ssoMappingClaim;
                return this;
            }

            /**
             * <p>The current upstream logon switch, which is Enabled or Disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder ssoStatus(String ssoStatus) {
                this.ssoStatus = ssoStatus;
                return this;
            }

            /**
             * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/token">https://idp.example.com/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * <p>The optional absolute HTTPS URL in manual mode. Do not specify this parameter in discovery mode.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/userinfo">https://idp.example.com/userinfo</a></p>
             */
            public Builder userinfoEndpoint(String userinfoEndpoint) {
                this.userinfoEndpoint = userinfoEndpoint;
                return this;
            }

            public OidcConfiguration build() {
                return new OidcConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class Saml extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bindingType")
        private String bindingType;

        @com.aliyun.core.annotation.NameInMap("entityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("loginUrl")
        private String loginUrl;

        @com.aliyun.core.annotation.NameInMap("x509Certificates")
        private java.util.List<String> x509Certificates;

        private Saml(Builder builder) {
            this.bindingType = builder.bindingType;
            this.entityId = builder.entityId;
            this.loginUrl = builder.loginUrl;
            this.x509Certificates = builder.x509Certificates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Saml create() {
            return builder().build();
        }

        /**
         * @return bindingType
         */
        public String getBindingType() {
            return this.bindingType;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return loginUrl
         */
        public String getLoginUrl() {
            return this.loginUrl;
        }

        /**
         * @return x509Certificates
         */
        public java.util.List<String> getX509Certificates() {
            return this.x509Certificates;
        }

        public static final class Builder {
            private String bindingType; 
            private String entityId; 
            private String loginUrl; 
            private java.util.List<String> x509Certificates; 

            private Builder() {
            } 

            private Builder(Saml model) {
                this.bindingType = model.bindingType;
                this.entityId = model.entityId;
                this.loginUrl = model.loginUrl;
                this.x509Certificates = model.x509Certificates;
            } 

            /**
             * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This parameter is required when manually filled in. Queries return short names.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP-Redirect</p>
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * <p>This parameter is required when manually filled in. It must be non-empty and contain a maximum of 2,048 characters. Existing configurations do not support replacement. It is different from the Entity ID queried by the service provider (SP).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>This parameter is required when manually filled in. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * <p>When manually filled in, a non-empty array is required, using PEM X.509 certificate text. The current validity period is verified, and a maximum of two certificates are allowed after deduplication.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;-----BEGIN CERTIFICATE-----\\nMIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQEL\\nBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoX\\nDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjAN\\nBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8\\noGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYN\\nW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbY\\nEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Ok\\nkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0E\\nBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQAB\\nMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUW\\nld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImca\\nWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTq\\nP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjoc\\nJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdV\\njfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5\\n-----END CERTIFICATE-----&quot;]</p>
             */
            public Builder x509Certificates(java.util.List<String> x509Certificates) {
                this.x509Certificates = x509Certificates;
                return this;
            }

            public Saml build() {
                return new Saml(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class SyncScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("departmentIds")
        private java.util.List<String> departmentIds;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        private SyncScope(Builder builder) {
            this.departmentIds = builder.departmentIds;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncScope create() {
            return builder().build();
        }

        /**
         * @return departmentIds
         */
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private java.util.List<String> departmentIds; 
            private String mode; 

            private Builder() {
            } 

            private Builder(SyncScope model) {
                this.departmentIds = model.departmentIds;
                this.mode = model.mode;
            } 

            /**
             * <p>When the mode is SelectedDepartments, this list must contain at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When the mode is AllAuthorized, pass an empty array or omit this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;10001&quot;]</p>
             */
            public Builder departmentIds(java.util.List<String> departmentIds) {
                this.departmentIds = departmentIds;
                return this;
            }

            /**
             * <p>The scope mode. Valid values: AllAuthorized (all authorized scopes, limited by application address book authorization) and SelectedDepartments (selected departments and all their sub-departments). A valid mode must be provided when explicitly submitting syncScope and is verified by the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>SelectedDepartments</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public SyncScope build() {
                return new SyncScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configuration")
        private Configuration configuration;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("eventSubscriptionCallbackUrl")
        private String eventSubscriptionCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("identityProviderType")
        private String identityProviderType;

        @com.aliyun.core.annotation.NameInMap("loginCallbackUrl")
        private String loginCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("loginEnabled")
        private Boolean loginEnabled;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("oidc")
        private Oidc oidc;

        @com.aliyun.core.annotation.NameInMap("oidcConfiguration")
        private OidcConfiguration oidcConfiguration;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("saml")
        private Saml saml;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("syncEnabled")
        private Boolean syncEnabled;

        @com.aliyun.core.annotation.NameInMap("syncScope")
        private SyncScope syncScope;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.configuration = builder.configuration;
            this.createdAt = builder.createdAt;
            this.eventSubscriptionCallbackUrl = builder.eventSubscriptionCallbackUrl;
            this.identityProviderType = builder.identityProviderType;
            this.loginCallbackUrl = builder.loginCallbackUrl;
            this.loginEnabled = builder.loginEnabled;
            this.metadata = builder.metadata;
            this.oidc = builder.oidc;
            this.oidcConfiguration = builder.oidcConfiguration;
            this.protocol = builder.protocol;
            this.saml = builder.saml;
            this.status = builder.status;
            this.syncEnabled = builder.syncEnabled;
            this.syncScope = builder.syncScope;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public Configuration getConfiguration() {
            return this.configuration;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return eventSubscriptionCallbackUrl
         */
        public String getEventSubscriptionCallbackUrl() {
            return this.eventSubscriptionCallbackUrl;
        }

        /**
         * @return identityProviderType
         */
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        /**
         * @return loginCallbackUrl
         */
        public String getLoginCallbackUrl() {
            return this.loginCallbackUrl;
        }

        /**
         * @return loginEnabled
         */
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        /**
         * @return metadata
         */
        public Metadata getMetadata() {
            return this.metadata;
        }

        /**
         * @return oidc
         */
        public Oidc getOidc() {
            return this.oidc;
        }

        /**
         * @return oidcConfiguration
         */
        public OidcConfiguration getOidcConfiguration() {
            return this.oidcConfiguration;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return saml
         */
        public Saml getSaml() {
            return this.saml;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return syncEnabled
         */
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        /**
         * @return syncScope
         */
        public SyncScope getSyncScope() {
            return this.syncScope;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Configuration configuration; 
            private String createdAt; 
            private String eventSubscriptionCallbackUrl; 
            private String identityProviderType; 
            private String loginCallbackUrl; 
            private Boolean loginEnabled; 
            private Metadata metadata; 
            private Oidc oidc; 
            private OidcConfiguration oidcConfiguration; 
            private String protocol; 
            private Saml saml; 
            private String status; 
            private Boolean syncEnabled; 
            private SyncScope syncScope; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configuration = model.configuration;
                this.createdAt = model.createdAt;
                this.eventSubscriptionCallbackUrl = model.eventSubscriptionCallbackUrl;
                this.identityProviderType = model.identityProviderType;
                this.loginCallbackUrl = model.loginCallbackUrl;
                this.loginEnabled = model.loginEnabled;
                this.metadata = model.metadata;
                this.oidc = model.oidc;
                this.oidcConfiguration = model.oidcConfiguration;
                this.protocol = model.protocol;
                this.saml = model.saml;
                this.status = model.status;
                this.syncEnabled = model.syncEnabled;
                this.syncScope = model.syncScope;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The actual SAML configuration is read back on demand only in GetIdentityProvider. SCIM queries and preparations return the actual received status and URLs.</p>
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The creation time in UTC format based on RFC 3339.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The event subscription callback URL. You must configure this URL in the application of the external identity provider to receive organization change events. An empty string is returned when the user pool is not yet activated.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://auth.cn-hangzhou.agentteams.aliyuncs.com/roa/dingtalk/event/up-123456">http://auth.cn-hangzhou.agentteams.aliyuncs.com/roa/dingtalk/event/up-123456</a></p>
             */
            public Builder eventSubscriptionCallbackUrl(String eventSubscriptionCallbackUrl) {
                this.eventSubscriptionCallbackUrl = eventSubscriptionCallbackUrl;
                return this;
            }

            /**
             * <p>The type of the external identity provider. Valid values: DingTalk and Feishu.</p>
             * 
             * <strong>example:</strong>
             * <p>DingTalk</p>
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * <p>The logon callback URL. You must configure this URL in the application of the external identity provider. An empty string is returned when the user pool is not yet activated.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://signin-cn-hangzhou.aliyunagentid.com/up-123456/dingtalk/callback">https://signin-cn-hangzhou.aliyunagentid.com/up-123456/dingtalk/callback</a></p>
             */
            public Builder loginCallbackUrl(String loginCallbackUrl) {
                this.loginCallbackUrl = loginCallbackUrl;
                return this;
            }

            /**
             * <p>Indicates whether workspace users are allowed to log on through this external identity provider.</p>
             */
            public Builder loginEnabled(Boolean loginEnabled) {
                this.loginEnabled = loginEnabled;
                return this;
            }

            /**
             * <p>The application configuration of the external identity provider. Application secret configurations are not returned.</p>
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The security summary of the expected configuration. It does not contain credentials. The original SAML fields and meanings are retained.</p>
             */
            public Builder oidc(Oidc oidc) {
                this.oidc = oidc;
                return this;
            }

            /**
             * <p>The security summary queried in real time from AgentIdentity. It does not contain secrets, private keys, or JIT fields. It can be empty when it is not configured or during unbinding.</p>
             */
            public Builder oidcConfiguration(OidcConfiguration oidcConfiguration) {
                this.oidcConfiguration = oidcConfiguration;
                return this;
            }

            /**
             * <p>Currently, only SAML is supported. This parameter may not be returned when no valid configuration is saved. Placeholder initialization with OIDC is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>SAML</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The input supports either XML or complete manual entry. Queries return standardized configurations and do not echo the original XML. This parameter can be omitted when not configured.</p>
             */
            public Builder saml(Saml saml) {
                this.saml = saml;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>CONFIGURED: The configuration is accepted and waiting for the user pool to be activated.</li>
             * <li>SYNCING: Organization members are being synchronized.</li>
             * <li>SYNCED: The synchronization of organization members is complete.</li>
             * <li>READY: The binding is in effect.</li>
             * <li>SYNC_FAILED: The synchronization of organization members failed.</li>
             * <li>UPDATING: The configuration is being updated.</li>
             * <li>UPDATE_FAILED: The configuration update failed.</li>
             * <li>DISCONNECTING: The binding is being disconnected.</li>
             * <li>DISCONNECT_FAILED: The disconnection failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether organization member synchronization is enabled. When enabled, organization members are synchronized as workspace users by this external identity provider.</p>
             */
            public Builder syncEnabled(Boolean syncEnabled) {
                this.syncEnabled = syncEnabled;
                return this;
            }

            /**
             * <p>The synchronization scope defined by department. If omitted during creation, the default value is AllAuthorized, and the first vendor synchronization is determined by syncOnBind. If omitted or set to null during an update, the original value is retained. Updating and saving the scope does not automatically trigger a full synchronization.</p>
             */
            public Builder syncScope(SyncScope syncScope) {
                this.syncScope = syncScope;
                return this;
            }

            /**
             * <p>The time of the last modification in UTC format based on RFC 3339.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-123456</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
