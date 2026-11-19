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
 * {@link UpdateIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateIdentityProviderResponseBody</p>
 */
public class UpdateIdentityProviderResponseBody extends TeaModel {
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

    private UpdateIdentityProviderResponseBody(Builder builder) {
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

    public static UpdateIdentityProviderResponseBody create() {
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

        private Builder(UpdateIdentityProviderResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business result code. If the request fails, use this code along with the HTTP status code and message for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business result. For the result structure, refer to the response fields of this operation. For asynchronous write operations, the response indicates that the request is accepted, but does not guarantee that the background task is completed.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The processing status of the current request. This does not indicate the final result of the background task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request acceptance or error message. For asynchronous tasks, verify the task result by calling the corresponding query operation.</p>
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
         * <p>Indicates whether the current request is processed successfully. A value of true indicates success. For asynchronous write operations, you must still query the task result.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateIdentityProviderResponseBody build() {
            return new UpdateIdentityProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderResponseBody</p>
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
             * <p>HTTP-Redirect or HTTP-POST. Required for manual entry. The query returns the short name.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP-Redirect</p>
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * <p>Required for manual entry. It must be non-empty and contain up to 2,048 characters. The existing configuration does not support replacement. It is different from the local entity ID returned by the SP query.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>Required for manual entry. It must be an absolute HTTPS URL and must not contain user credentials or fragments.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * <p>The actual switch value, which is Enabled or Disabled. This is not equivalent to the expected loginEnabled value saved in AC.</p>
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
     * {@link UpdateIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderResponseBody</p>
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
             * <p>The client identifier registered in the external IdP, which is different from the Matrix client. This value cannot be changed in place after it is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>example-client</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The absolute HTTPS discovery endpoint URL. This parameter is mutually exclusive with manually specified endpoints.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/.well-known/openid-configuration">https://idp.example.com/.well-known/openid-configuration</a></p>
             */
            public Builder discoveryEndpoint(String discoveryEndpoint) {
                this.discoveryEndpoint = discoveryEndpoint;
                return this;
            }

            /**
             * <p>The absolute HTTPS issuer URL of the external IdP. This value cannot be changed in place after it is configured.</p>
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
             * <p>The array of scope strings. It must include openid. Default values: openid, profile, and email.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
             */
            public Builder scopes(java.util.List<String> scopes) {
                this.scopes = scopes;
                return this;
            }

            /**
             * <p>The name of the claim in the ID token used to match the SCIM externalId. If omitted during the initial configuration, the default value is sub. If omitted during an update, the saved value is retained. For Azure, you can specify oid. The value must be non-empty and cannot contain whitespace characters. When queried, oidc returns the saved value, while oidcConfiguration returns the actual upstream value, which may be empty.</p>
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
     * {@link UpdateIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderResponseBody</p>
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
             * <p>HTTP-Redirect or HTTP-POST. Required for manual entry. The query returns the short name.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP-Redirect</p>
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * <p>Required for manual entry. It must be non-empty and contain up to 2,048 characters. The existing configuration does not support replacement. It is different from the local entity ID returned by the SP query.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>Required for manual entry. It must be an absolute HTTPS URL and must not contain user credentials or fragments.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * <p>Required for manual entry. It must be a non-empty array using PEM X.509 certificate text. The current validity period is verified. Up to two certificates are allowed after deduplication.</p>
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
     * {@link UpdateIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderResponseBody</p>
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
             * <p>When set to SelectedDepartments, it must contain at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When set to AllAuthorized, pass an empty array or omit this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;10001&quot;]</p>
             */
            public Builder departmentIds(java.util.List<String> departmentIds) {
                this.departmentIds = departmentIds;
                return this;
            }

            /**
             * <p>AllAuthorized: the full authorization scope, subject to the application address book authorization limits. SelectedDepartments: the selected departments and all their sub-departments. When explicitly submitting syncScope, a valid mode must be provided and verified by the backend.</p>
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
     * {@link UpdateIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configuration")
        private Configuration configuration;

        @com.aliyun.core.annotation.NameInMap("identityProviderType")
        private String identityProviderType;

        @com.aliyun.core.annotation.NameInMap("loginEnabled")
        private Boolean loginEnabled;

        @com.aliyun.core.annotation.NameInMap("oidc")
        private Oidc oidc;

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

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.configuration = builder.configuration;
            this.identityProviderType = builder.identityProviderType;
            this.loginEnabled = builder.loginEnabled;
            this.oidc = builder.oidc;
            this.protocol = builder.protocol;
            this.saml = builder.saml;
            this.status = builder.status;
            this.syncEnabled = builder.syncEnabled;
            this.syncScope = builder.syncScope;
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
         * @return identityProviderType
         */
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        /**
         * @return loginEnabled
         */
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        /**
         * @return oidc
         */
        public Oidc getOidc() {
            return this.oidc;
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
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Configuration configuration; 
            private String identityProviderType; 
            private Boolean loginEnabled; 
            private Oidc oidc; 
            private String protocol; 
            private Saml saml; 
            private String status; 
            private Boolean syncEnabled; 
            private SyncScope syncScope; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configuration = model.configuration;
                this.identityProviderType = model.identityProviderType;
                this.loginEnabled = model.loginEnabled;
                this.oidc = model.oidc;
                this.protocol = model.protocol;
                this.saml = model.saml;
                this.status = model.status;
                this.syncEnabled = model.syncEnabled;
                this.syncScope = model.syncScope;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The actual upstream configuration. The actual SAML configuration is read on demand only in GetIdentityProvider. SCIM queries and preparations return the actual reception status and URL.</p>
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>General CRUD operations support DingTalk, Feishu, and CustomSSO. SP queries support only CustomSSO. The SCIM path uses the CustomSSO shared pool.</p>
             * 
             * <strong>example:</strong>
             * <p>CustomSSO</p>
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * <p>Do not pass true during CustomSSO initialization. A valid SAML configuration must be saved before enabling. Disabling does not delete the configuration. If an asynchronous failure occurs, this expected value does not indicate that it has taken effect upstream.</p>
             */
            public Builder loginEnabled(Boolean loginEnabled) {
                this.loginEnabled = loginEnabled;
                return this;
            }

            /**
             * <p>The expected security summary of the configuration. This does not include credentials. The original SAML fields and meanings are retained.</p>
             */
            public Builder oidc(Oidc oidc) {
                this.oidc = oidc;
                return this;
            }

            /**
             * <p>The login protocol for CustomSSO. Currently, only SAML is supported. You can pass SAML when saving the SAML configuration. You can omit this parameter if you only modify loginEnabled. DingTalk and Feishu do not accept this field.</p>
             * 
             * <strong>example:</strong>
             * <p>SAML</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The SAML configuration for CustomSSO. Choose either metadataXml or the four manually entered fields: entityId, loginUrl, bindingType, and x509Certificates. If not submitted, the existing configuration is retained. DingTalk and Feishu do not accept this field.</p>
             */
            public Builder saml(Saml saml) {
                this.saml = saml;
                return this;
            }

            /**
             * <p>The status of the identity source resource and logon configuration. A READY status in the CustomSSO shared pool does not mean that SAML is configured. Query operationStatus independently for SCIM operation results.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Specifies whether synchronization is enabled. Do not set this parameter to true during CustomSSO initialization. You can only update this parameter later by calling UpdateIdentityProviderSCIM. Evaluate the result in combination with operationStatus.</p>
             */
            public Builder syncEnabled(Boolean syncEnabled) {
                this.syncEnabled = syncEnabled;
                return this;
            }

            /**
             * <p>Follows the definition of the department-based synchronization scope. If omitted during creation, the default value is AllAuthorized. The initial provider synchronization is determined by syncOnBind. If omitted or set to null during an update, the original value is retained. Saving the scope during an update does not automatically trigger a full synchronization.</p>
             */
            public Builder syncScope(SyncScope syncScope) {
                this.syncScope = syncScope;
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
