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
 * {@link UpdateIdentityProviderSCIMResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateIdentityProviderSCIMResponseBody</p>
 */
public class UpdateIdentityProviderSCIMResponseBody extends TeaModel {
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

    private UpdateIdentityProviderSCIMResponseBody(Builder builder) {
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

    public static UpdateIdentityProviderSCIMResponseBody create() {
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

        private Builder(UpdateIdentityProviderSCIMResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business result code. If the request fails, use this code in combination with the HTTP status code and the result message for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data object. Retains the original fields and the meaning of the status field. The new scimStatus field corresponds to the data.status field in the query API operation, and the operationStatus field retains the status of the most recent SCIM task.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. Indicates the processing status of the current request, which does not necessarily reflect the final result of the background task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The result message. Indicates whether the request is accepted or returns an error message. For an asynchronous task, check the task result by calling the corresponding query API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. Retain this ID to correlate the current call and troubleshoot failures.</p>
         * 
         * <strong>example:</strong>
         * <p>request-example</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the current request is successful. A value of true indicates that the request is processed successfully. For asynchronous write operations, you must continue to query the task result.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateIdentityProviderSCIMResponseBody build() {
            return new UpdateIdentityProviderSCIMResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateIdentityProviderSCIMResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderSCIMResponseBody</p>
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
             * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This field is required when you manually enter the configuration. The query returns the short name.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP-Redirect</p>
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * <p>The IdP entity ID. This field is required when you manually enter the metadata. It must be a non-empty string of up to 2,048 characters. You cannot change the entity ID after it is configured. This ID is different from the local entity ID returned by the SP query.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The IdP SSO logon URL. This field is required when you manually enter the metadata. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * <p>The actual SSO logon status of AgentIdentity. The actual switch value is Enabled or Disabled, which is not equivalent to the expected value of loginEnabled saved in the access configuration.</p>
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
     * {@link UpdateIdentityProviderSCIMResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderSCIMResponseBody</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("binding")
        private String binding;

        @com.aliyun.core.annotation.NameInMap("certificates")
        private String certificates;

        @com.aliyun.core.annotation.NameInMap("entityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("loginUrl")
        private String loginUrl;

        private Metadata(Builder builder) {
            this.binding = builder.binding;
            this.certificates = builder.certificates;
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
            private String binding; 
            private String certificates; 
            private String entityId; 
            private String loginUrl; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.binding = model.binding;
                this.certificates = model.certificates;
                this.entityId = model.entityId;
                this.loginUrl = model.loginUrl;
            } 

            /**
             * <p>The SAML binding URI in the historical metadata snapshot. To update CustomSSO, use the saml.bindingType field.</p>
             * 
             * <strong>example:</strong>
             * <p>urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect</p>
             */
            public Builder binding(String binding) {
                this.binding = binding;
                return this;
            }

            /**
             * <p>The certificate string in the historical metadata snapshot. To edit the configuration, use the saml.x509Certificates field instead of submitting the old metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>MIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQELBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoXDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8oGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYNW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbYEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Okkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0EBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUWld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImcaWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTqP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjocJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdVjfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5</p>
             */
            public Builder certificates(String certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * <p>The IdP entity ID. This field is required when you manually enter the metadata. It must be a non-empty string of up to 2,048 characters. You cannot change the entity ID after it is configured. This ID is different from the local entity ID returned by the SP query.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The IdP SSO logon URL. This field is required when you manually enter the metadata. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
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
     * {@link UpdateIdentityProviderSCIMResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderSCIMResponseBody</p>
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
             * <p>The authorization endpoint. This field is required in manual mode and must be an absolute HTTPS URL. Do not specify this field in discovery mode.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/authorize">https://idp.example.com/authorize</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>The client authentication method. Default value: client_secret_post. If the value is none, Proof Key for Code Exchange (PKCE) must be enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>client_secret_post</p>
             */
            public Builder clientAuthMethod(String clientAuthMethod) {
                this.clientAuthMethod = clientAuthMethod;
                return this;
            }

            /**
             * <p>The client ID registered in the external IdP. This ID is different from the Matrix client ID. You cannot change the client ID in place after it is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>example-client</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The absolute HTTPS OIDC discovery endpoint. This field is mutually exclusive with manually entered endpoints.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/.well-known/openid-configuration">https://idp.example.com/.well-known/openid-configuration</a></p>
             */
            public Builder discoveryEndpoint(String discoveryEndpoint) {
                this.discoveryEndpoint = discoveryEndpoint;
                return this;
            }

            /**
             * <p>The absolute HTTPS issuer of the external IdP. You cannot change the issuer in place after it is configured.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com">https://idp.example.com</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The authorization endpoint. This field is required in manual mode and must be an absolute HTTPS URL. Do not specify this field in discovery mode.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/jwks">https://idp.example.com/jwks</a></p>
             */
            public Builder jwksUri(String jwksUri) {
                this.jwksUri = jwksUri;
                return this;
            }

            /**
             * <p>Specifies whether PKCE is enabled. Default value: true. This parameter must be set to true when no client authentication is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pkceRequired(Boolean pkceRequired) {
                this.pkceRequired = pkceRequired;
                return this;
            }

            /**
             * <p>The array of strings that must contain openid. Default values: openid, profile, and email.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
             */
            public Builder scopes(java.util.List<String> scopes) {
                this.scopes = scopes;
                return this;
            }

            /**
             * <p>The name of the claim in the ID token that is used to match the SCIM externalId. If omitted during creation, the default value sub is used. If omitted during an update, the saved value is retained. For Azure, you can specify oid. The value must be non-empty and cannot contain whitespace characters. When querying oidc, the saved value is returned. When querying oidcConfiguration, the actual upstream value is returned, which may be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>oid</p>
             */
            public Builder ssoMappingClaim(String ssoMappingClaim) {
                this.ssoMappingClaim = ssoMappingClaim;
                return this;
            }

            /**
             * <p>The authorization endpoint. This field is required in manual mode and must be an absolute HTTPS URL. Do not specify this field in discovery mode.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/token">https://idp.example.com/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            /**
             * <p>The optional absolute HTTPS URL for manual mode. Leave this field empty in discovery mode.</p>
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
     * {@link UpdateIdentityProviderSCIMResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderSCIMResponseBody</p>
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
             * <p>The SAML binding type. Valid values: HTTP-Redirect and HTTP-POST. This field is required when you manually enter the configuration. The query returns the short name.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP-Redirect</p>
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * <p>The IdP entity ID. This field is required when you manually enter the metadata. It must be a non-empty string of up to 2,048 characters. You cannot change the entity ID after it is configured. This ID is different from the local entity ID returned by the SP query.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The IdP SSO logon URL. This field is required when you manually enter the metadata. It must be an absolute HTTPS URL and cannot contain user credentials or fragments.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * <p>The list of IdP signing certificates. When you manually enter the configuration, this field is required and must be a non-empty array of PEM X.509 certificate texts. The system verifies the current validity period. A maximum of two certificates are retained after deduplication.</p>
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
     * {@link UpdateIdentityProviderSCIMResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderSCIMResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("operationStatus")
        private String operationStatus;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("saml")
        private Saml saml;

        @com.aliyun.core.annotation.NameInMap("scimStatus")
        private String scimStatus;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("syncEnabled")
        private Boolean syncEnabled;

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
            this.operationStatus = builder.operationStatus;
            this.protocol = builder.protocol;
            this.saml = builder.saml;
            this.scimStatus = builder.scimStatus;
            this.status = builder.status;
            this.syncEnabled = builder.syncEnabled;
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
         * @return operationStatus
         */
        public String getOperationStatus() {
            return this.operationStatus;
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
         * @return scimStatus
         */
        public String getScimStatus() {
            return this.scimStatus;
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
            private String operationStatus; 
            private String protocol; 
            private Saml saml; 
            private String scimStatus; 
            private String status; 
            private Boolean syncEnabled; 
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
                this.operationStatus = model.operationStatus;
                this.protocol = model.protocol;
                this.saml = model.saml;
                this.scimStatus = model.scimStatus;
                this.status = model.status;
                this.syncEnabled = model.syncEnabled;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The actual upstream configuration. The actual SAML configuration is read back on demand only by the GetIdentityProvider API operation. The SCIM query and preparation operations return the actual receiving status and URL.</p>
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The time when the record was created on the server.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-26T00:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The SAML vendor event callback URL. For CustomSSO, an empty string is returned. To obtain the SCIM receiving URL, call the SCIM query or preparation API operation. The example shows a JSON empty string &quot;&quot;, but the actual value does not include double quotation marks.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder eventSubscriptionCallbackUrl(String eventSubscriptionCallbackUrl) {
                this.eventSubscriptionCallbackUrl = eventSubscriptionCallbackUrl;
                return this;
            }

            /**
             * <p>The identity provider type. General CRUD operations support DingTalk, Feishu, and CustomSSO. SP queries support only CustomSSO. The SCIM path uses the CustomSSO shared pool.</p>
             * 
             * <strong>example:</strong>
             * <p>CustomSSO</p>
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * <p>The SAML vendor callback URL. For CustomSSO, an empty string is returned. To obtain the Assertion Consumer Service (ACS) URL for SAML, call the SP query API operation. The example shows a JSON empty string &quot;&quot;, but the actual value does not include double quotation marks.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder loginCallbackUrl(String loginCallbackUrl) {
                this.loginCallbackUrl = loginCallbackUrl;
                return this;
            }

            /**
             * <p>Specifies whether logon is enabled. Do not set this parameter to true during CustomSSO initialization. You must save a valid SAML configuration before enabling logon. Disabling logon does not delete the configuration. If an asynchronous task fails, this expected value does not indicate that the change has taken effect on the upstream server.</p>
             */
            public Builder loginEnabled(Boolean loginEnabled) {
                this.loginEnabled = loginEnabled;
                return this;
            }

            /**
             * <p>The standard identity provider (IdP) metadata. Vendor parameters are used for DingTalk and Feishu. To update CustomSSO, use the protocol and saml fields. This field is not accepted for CustomSSO updates. The return value does not include vendor keys.</p>
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The security summary of the expected OIDC configuration. This summary does not include credentials. The original SAML fields and their meanings are retained.</p>
             */
            public Builder oidc(Oidc oidc) {
                this.oidc = oidc;
                return this;
            }

            /**
             * <p>The original status of the most recent independent SCIM operation task. If no historical tasks exist, an empty string (&quot;&quot;) is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * <p>The logon protocol. Only SAML is supported. This field may not be returned if no valid configuration is saved. You cannot use OIDC as a placeholder for initialization.</p>
             * 
             * <strong>example:</strong>
             * <p>SAML</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The SAML logon configuration. You can provide the input by using XML or by manually entering all fields. The query returns the standardized configuration and does not echo the original XML. This field can be omitted if it is not configured.</p>
             */
            public Builder saml(Saml saml) {
                this.saml = saml;
                return this;
            }

            /**
             * <p>The independent SCIM status. This field does not change the meaning of the original status field for shared resources and logon configurations. It corresponds to the data.status field in the query API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATING</p>
             */
            public Builder scimStatus(String scimStatus) {
                this.scimStatus = scimStatus;
                return this;
            }

            /**
             * <p>The operation status of the CustomSSO user pool lifecycle and logon configuration tasks. This status does not indicate the result of SCIM operations. To query the result of the SCIM switch, use the GetIdentityProviderSCIM.operationStatus field. You cannot use this field to determine whether all protocols are configured.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Specifies whether to enable SCIM synchronization. Do not set this parameter to true during CustomSSO initialization. You can only update this parameter later by calling UpdateIdentityProviderSCIM. Determine the result based on the operationStatus field.</p>
             */
            public Builder syncEnabled(Boolean syncEnabled) {
                this.syncEnabled = syncEnabled;
                return this;
            }

            /**
             * <p>The time when the record was last updated on the server.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-26T00:00:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>Required. The ID of the destination workspace. The region of the request must be the same as the region of the destination workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-example</p>
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
