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
 * {@link UpdateIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateIdentityProviderRequest</p>
 */
public class UpdateIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("identityProviderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityProviderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateIdentityProviderRequestBody body;

    private UpdateIdentityProviderRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.identityProviderType = builder.identityProviderType;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIdentityProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return identityProviderType
     */
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * @return body
     */
    public UpdateIdentityProviderRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateIdentityProviderRequest, Builder> {
        private String workspaceId; 
        private String identityProviderType; 
        private UpdateIdentityProviderRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIdentityProviderRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.identityProviderType = request.identityProviderType;
            this.body = request.body;
        } 

        /**
         * <p>Required. The ID of the destination workspace. The region of the request must be the same as the region of the destination workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-example</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>General CRUD operations support DingTalk, Feishu, and CustomSSO. SP queries support only CustomSSO. The SCIM path uses the CustomSSO shared pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomSSO</p>
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putPathParameter("identityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * <p>Submit business parameters as described in this operation. The body parameters of public APIs are mapped to backend wrappers by the gateway. Do not mix them with backend direct connection body wrappers.</p>
         */
        public Builder body(UpdateIdentityProviderRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateIdentityProviderRequest build() {
            return new UpdateIdentityProviderRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("appKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("appSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("corpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("encryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("verificationToken")
        private String verificationToken;

        private Metadata(Builder builder) {
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.appSecret = builder.appSecret;
            this.corpId = builder.corpId;
            this.encryptKey = builder.encryptKey;
            this.verificationToken = builder.verificationToken;
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
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return encryptKey
         */
        public String getEncryptKey() {
            return this.encryptKey;
        }

        /**
         * @return verificationToken
         */
        public String getVerificationToken() {
            return this.verificationToken;
        }

        public static final class Builder {
            private String appId; 
            private String appKey; 
            private String appSecret; 
            private String corpId; 
            private String encryptKey; 
            private String verificationToken; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.appId = model.appId;
                this.appKey = model.appKey;
                this.appSecret = model.appSecret;
                this.corpId = model.corpId;
                this.encryptKey = model.encryptKey;
                this.verificationToken = model.verificationToken;
            } 

            /**
             * <p>The Feishu App ID. It can be omitted during an update to retain the saved value. The merged Feishu configuration of the old and new values must contain this item.</p>
             * 
             * <strong>example:</strong>
             * <p>cli_exampleappid01</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The DingTalk AppKey. It can be omitted during an update to retain the saved value. The merged DingTalk configuration of the old and new values must contain this item.</p>
             * 
             * <strong>example:</strong>
             * <p>dingexampleappkey01</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>The provider application secret. If omitted during an update, the saved value is retained. You can submit this field separately to update the secret. The explicit value must not be empty. This is sensitive input and is not echoed in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>example-app-secret</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>The DingTalk enterprise CorpId. It can be omitted during an update to retain the saved value. The merged DingTalk configuration of the old and new values must contain this item.</p>
             * 
             * <strong>example:</strong>
             * <p>dingexamplecorpid01</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>Required when synchronization is enabled for DingTalk and Feishu. This is sensitive input and is unrelated to the SCIM token.</p>
             * 
             * <strong>example:</strong>
             * <p>example-encrypt-key</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>Required when synchronization is enabled for DingTalk and Feishu. This is sensitive input and is unrelated to the SCIM token.</p>
             * 
             * <strong>example:</strong>
             * <p>example-verification-token</p>
             */
            public Builder verificationToken(String verificationToken) {
                this.verificationToken = verificationToken;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class Oidc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorizationEndpoint")
        private String authorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("clientAuthMethod")
        private String clientAuthMethod;

        @com.aliyun.core.annotation.NameInMap("clientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("clientPrivateKey")
        private String clientPrivateKey;

        @com.aliyun.core.annotation.NameInMap("clientSecret")
        private String clientSecret;

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
            this.clientPrivateKey = builder.clientPrivateKey;
            this.clientSecret = builder.clientSecret;
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
         * @return clientPrivateKey
         */
        public String getClientPrivateKey() {
            return this.clientPrivateKey;
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
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
            private String clientPrivateKey; 
            private String clientSecret; 
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
                this.clientPrivateKey = model.clientPrivateKey;
                this.clientSecret = model.clientSecret;
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
             * <p>The private key required for private_key_jwt authentication. If omitted during an update, the original value is retained. The value is not echoed in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN PRIVATE KEY-----\nEXAMPLE_ONLY_REPLACE_WITH_YOUR_PKCS8_PRIVATE_KEY\n-----END PRIVATE KEY-----</p>
             */
            public Builder clientPrivateKey(String clientPrivateKey) {
                this.clientPrivateKey = clientPrivateKey;
                return this;
            }

            /**
             * <p>Required for post or basic authentication. If omitted during an update, the original value is retained. Blank or fully masked values with asterisks are not accepted. The value is not echoed in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>example-client-secret-not-for-production</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
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
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class Saml extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bindingType")
        private String bindingType;

        @com.aliyun.core.annotation.NameInMap("entityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("loginUrl")
        private String loginUrl;

        @com.aliyun.core.annotation.NameInMap("metadataXml")
        private String metadataXml;

        @com.aliyun.core.annotation.NameInMap("x509Certificates")
        private java.util.List<String> x509Certificates;

        private Saml(Builder builder) {
            this.bindingType = builder.bindingType;
            this.entityId = builder.entityId;
            this.loginUrl = builder.loginUrl;
            this.metadataXml = builder.metadataXml;
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
         * @return metadataXml
         */
        public String getMetadataXml() {
            return this.metadataXml;
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
            private String metadataXml; 
            private java.util.List<String> x509Certificates; 

            private Builder() {
            } 

            private Builder(Saml model) {
                this.bindingType = model.bindingType;
                this.entityId = model.entityId;
                this.loginUrl = model.loginUrl;
                this.metadataXml = model.metadataXml;
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
             * <p>The XML text of a single IdP EntityDescriptor, with a maximum size of 1 MiB. It must not be a URL or file path. It is mutually exclusive with the four manually entered fields. DTD and external entities are prohibited. If both SSO bindings are declared, HTTP-POST takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p><EntityDescriptor xmlns="urn:oasis:names:tc:SAML:2.0:metadata" entityID="https://idp.example.com/entity"><IDPSSODescriptor protocolSupportEnumeration="urn:oasis:names:tc:SAML:2.0:protocol"><KeyDescriptor use="signing"><KeyInfo xmlns="http://www.w3.org/2000/09/xmldsig#"><X509Data><X509Certificate>MIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQELBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoXDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8oGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYNW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbYEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Okkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0EBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUWld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImcaWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTqP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjocJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdVjfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5</X509Certificate></X509Data></KeyInfo></KeyDescriptor><SingleSignOnService Binding="urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect" Location="https://idp.example.com/sso"/></IDPSSODescriptor></EntityDescriptor></p>
             */
            public Builder metadataXml(String metadataXml) {
                this.metadataXml = metadataXml;
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
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
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
     * {@link UpdateIdentityProviderRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderRequest</p>
     */
    public static class UpdateIdentityProviderRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("loginEnabled")
        private Boolean loginEnabled;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("oidc")
        private Oidc oidc;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("saml")
        private Saml saml;

        @com.aliyun.core.annotation.NameInMap("syncEnabled")
        private Boolean syncEnabled;

        @com.aliyun.core.annotation.NameInMap("syncScope")
        private SyncScope syncScope;

        private UpdateIdentityProviderRequestBody(Builder builder) {
            this.loginEnabled = builder.loginEnabled;
            this.metadata = builder.metadata;
            this.oidc = builder.oidc;
            this.protocol = builder.protocol;
            this.saml = builder.saml;
            this.syncEnabled = builder.syncEnabled;
            this.syncScope = builder.syncScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateIdentityProviderRequestBody create() {
            return builder().build();
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

        public static final class Builder {
            private Boolean loginEnabled; 
            private Metadata metadata; 
            private Oidc oidc; 
            private String protocol; 
            private Saml saml; 
            private Boolean syncEnabled; 
            private SyncScope syncScope; 

            private Builder() {
            } 

            private Builder(UpdateIdentityProviderRequestBody model) {
                this.loginEnabled = model.loginEnabled;
                this.metadata = model.metadata;
                this.oidc = model.oidc;
                this.protocol = model.protocol;
                this.saml = model.saml;
                this.syncEnabled = model.syncEnabled;
                this.syncScope = model.syncScope;
            } 

            /**
             * <p>Do not pass true during CustomSSO initialization. A valid SAML configuration must be saved before enabling. Disabling does not delete the configuration. If an asynchronous failure occurs, this expected value does not indicate that it has taken effect upstream.</p>
             */
            public Builder loginEnabled(Boolean loginEnabled) {
                this.loginEnabled = loginEnabled;
                return this;
            }

            /**
             * <p>The provider configurations for DingTalk and Feishu support partial updates. Omitted fields retain their saved values. Submitted values must not be null, empty strings, or blank strings. The complete configuration is verified after merging. CustomSSO updates use protocol and saml, and do not accept this field. The returned value does not contain provider keys.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;appSecret&quot;:&quot;example-app-secret&quot;}</p>
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>Accepted only for CustomSSO and mutually exclusive with SAML. Submit the complete public configuration. Omitting credentials retains the existing values, while new values replace them. Blank and masked values are not accepted as credentials.</p>
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
             * <p>Specifies whether to enable incremental synchronization for subsequent address book change events of DingTalk or Feishu. If not passed, the original value is retained. It does not control the initial synchronization or manual synchronization. CustomSSO does not accept this field. You must use UpdateIdentityProviderSCIM.</p>
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

            public UpdateIdentityProviderRequestBody build() {
                return new UpdateIdentityProviderRequestBody(this);
            } 

        } 

    }
}
