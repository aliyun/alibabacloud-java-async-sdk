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
 * {@link GetApplicationProvisioningConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationProvisioningConfigResponseBody</p>
 */
public class GetApplicationProvisioningConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationProvisioningConfig")
    private ApplicationProvisioningConfig applicationProvisioningConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationProvisioningConfigResponseBody(Builder builder) {
        this.applicationProvisioningConfig = builder.applicationProvisioningConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationProvisioningConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationProvisioningConfig
     */
    public ApplicationProvisioningConfig getApplicationProvisioningConfig() {
        return this.applicationProvisioningConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationProvisioningConfig applicationProvisioningConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApplicationProvisioningConfigResponseBody model) {
            this.applicationProvisioningConfig = model.applicationProvisioningConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The account synchronization configuration of the application.</p>
         */
        public Builder applicationProvisioningConfig(ApplicationProvisioningConfig applicationProvisioningConfig) {
            this.applicationProvisioningConfig = applicationProvisioningConfig;
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

        public GetApplicationProvisioningConfigResponseBody build() {
            return new GetApplicationProvisioningConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationProvisioningConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationProvisioningConfigResponseBody</p>
     */
    public static class CallbackProvisioningConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallbackUrl")
        private String callbackUrl;

        @com.aliyun.core.annotation.NameInMap("EncryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("EncryptRequired")
        private Boolean encryptRequired;

        @com.aliyun.core.annotation.NameInMap("ListenEventScopes")
        private java.util.List<String> listenEventScopes;

        private CallbackProvisioningConfig(Builder builder) {
            this.callbackUrl = builder.callbackUrl;
            this.encryptKey = builder.encryptKey;
            this.encryptRequired = builder.encryptRequired;
            this.listenEventScopes = builder.listenEventScopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallbackProvisioningConfig create() {
            return builder().build();
        }

        /**
         * @return callbackUrl
         */
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        /**
         * @return encryptKey
         */
        public String getEncryptKey() {
            return this.encryptKey;
        }

        /**
         * @return encryptRequired
         */
        public Boolean getEncryptRequired() {
            return this.encryptRequired;
        }

        /**
         * @return listenEventScopes
         */
        public java.util.List<String> getListenEventScopes() {
            return this.listenEventScopes;
        }

        public static final class Builder {
            private String callbackUrl; 
            private String encryptKey; 
            private Boolean encryptRequired; 
            private java.util.List<String> listenEventScopes; 

            private Builder() {
            } 

            private Builder(CallbackProvisioningConfig model) {
                this.callbackUrl = model.callbackUrl;
                this.encryptKey = model.encryptKey;
                this.encryptRequired = model.encryptRequired;
                this.listenEventScopes = model.listenEventScopes;
            } 

            /**
             * <p>The destination address where the application receives IDaaS event callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/event/callback">https://example.com/event/callback</a></p>
             */
            public Builder callbackUrl(String callbackUrl) {
                this.callbackUrl = callbackUrl;
                return this;
            }

            /**
             * <p>The symmetric key for encrypting and decrypting IDaaS event callbacks. This key uses the AES-256 algorithm and is in hexadecimal format.</p>
             * 
             * <strong>example:</strong>
             * <p>1adfdfdfd******111</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>Indicates whether to encrypt IDaaS event callback messages. Valid values:</p>
             * <ul>
             * <li><p>true: The messages are encrypted.</p>
             * </li>
             * <li><p>false: The messages are not encrypted and are transmitted in plaintext.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder encryptRequired(Boolean encryptRequired) {
                this.encryptRequired = encryptRequired;
                return this;
            }

            /**
             * <p>The list of message types for the IDaaS event callback listener.</p>
             */
            public Builder listenEventScopes(java.util.List<String> listenEventScopes) {
                this.listenEventScopes = listenEventScopes;
                return this;
            }

            public CallbackProvisioningConfig build() {
                return new CallbackProvisioningConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationProvisioningConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationProvisioningConfigResponseBody</p>
     */
    public static class AuthnParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessToken")
        private String accessToken;

        @com.aliyun.core.annotation.NameInMap("AuthnMethod")
        private String authnMethod;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        @com.aliyun.core.annotation.NameInMap("TokenEndpoint")
        private String tokenEndpoint;

        private AuthnParam(Builder builder) {
            this.accessToken = builder.accessToken;
            this.authnMethod = builder.authnMethod;
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
            this.tokenEndpoint = builder.tokenEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthnParam create() {
            return builder().build();
        }

        /**
         * @return accessToken
         */
        public String getAccessToken() {
            return this.accessToken;
        }

        /**
         * @return authnMethod
         */
        public String getAuthnMethod() {
            return this.authnMethod;
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
         * @return tokenEndpoint
         */
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public static final class Builder {
            private String accessToken; 
            private String authnMethod; 
            private String clientId; 
            private String clientSecret; 
            private String tokenEndpoint; 

            private Builder() {
            } 

            private Builder(AuthnParam model) {
                this.accessToken = model.accessToken;
                this.authnMethod = model.authnMethod;
                this.clientId = model.clientId;
                this.clientSecret = model.clientSecret;
                this.tokenEndpoint = model.tokenEndpoint;
            } 

            /**
             * <p>The access token. This parameter is required when GrantType is set to bearer_token.</p>
             * 
             * <strong>example:</strong>
             * <p>k52x2ru63rlkflina5utgkxxxx</p>
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * <p>The authentication mode for the SCIM protocol. Valid values:</p>
             * <ul>
             * <li><p>client_secret_basic: The key is passed in the request header.</p>
             * </li>
             * <li><p>client_secret_post: The key is passed in the request body.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>client_secret_basic</p>
             */
            public Builder authnMethod(String authnMethod) {
                this.authnMethod = authnMethod;
                return this;
            }

            /**
             * <p>The client ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The client secret of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>CSEHDcHcrUKHw1CuxkJEHPveWRXBGqVqRsxxxx</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * <p>The token endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com/oauth/token">https://www.example.com/oauth/token</a></p>
             */
            public Builder tokenEndpoint(String tokenEndpoint) {
                this.tokenEndpoint = tokenEndpoint;
                return this;
            }

            public AuthnParam build() {
                return new AuthnParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationProvisioningConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationProvisioningConfigResponseBody</p>
     */
    public static class AuthnConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthnMode")
        private String authnMode;

        @com.aliyun.core.annotation.NameInMap("AuthnParam")
        private AuthnParam authnParam;

        @com.aliyun.core.annotation.NameInMap("GrantType")
        private String grantType;

        private AuthnConfiguration(Builder builder) {
            this.authnMode = builder.authnMode;
            this.authnParam = builder.authnParam;
            this.grantType = builder.grantType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthnConfiguration create() {
            return builder().build();
        }

        /**
         * @return authnMode
         */
        public String getAuthnMode() {
            return this.authnMode;
        }

        /**
         * @return authnParam
         */
        public AuthnParam getAuthnParam() {
            return this.authnParam;
        }

        /**
         * @return grantType
         */
        public String getGrantType() {
            return this.grantType;
        }

        public static final class Builder {
            private String authnMode; 
            private AuthnParam authnParam; 
            private String grantType; 

            private Builder() {
            } 

            private Builder(AuthnConfiguration model) {
                this.authnMode = model.authnMode;
                this.authnParam = model.authnParam;
                this.grantType = model.grantType;
            } 

            /**
             * <p>The authorization mode for the SCIM protocol interface. Valid values:</p>
             * <ul>
             * <li>oauth2: OAuth2 mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oauth2</p>
             */
            public Builder authnMode(String authnMode) {
                this.authnMode = authnMode;
                return this;
            }

            /**
             * <p>The authorization configuration parameters. Usage:</p>
             * <ul>
             * <li><p>If GrantType is set to client_credentials, you must specify ClientId, ClientSecret, and AuthnMethod.</p>
             * </li>
             * <li><p>If GrantType is set to bearer_token, you must specify AccessToken.</p>
             * </li>
             * </ul>
             */
            public Builder authnParam(AuthnParam authnParam) {
                this.authnParam = authnParam;
                return this;
            }

            /**
             * <p>The authorization mode for the SCIM protocol. Valid values:</p>
             * <ul>
             * <li><p>client_credentials: client credentials mode.</p>
             * </li>
             * <li><p>bearer_token: bearer token mode.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>bearer_token</p>
             */
            public Builder grantType(String grantType) {
                this.grantType = grantType;
                return this;
            }

            public AuthnConfiguration build() {
                return new AuthnConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationProvisioningConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationProvisioningConfigResponseBody</p>
     */
    public static class ScimProvisioningConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthnConfiguration")
        private AuthnConfiguration authnConfiguration;

        @com.aliyun.core.annotation.NameInMap("FullPushScopes")
        private java.util.List<String> fullPushScopes;

        @com.aliyun.core.annotation.NameInMap("ProvisioningActions")
        private java.util.List<String> provisioningActions;

        @com.aliyun.core.annotation.NameInMap("ScimBaseUrl")
        private String scimBaseUrl;

        private ScimProvisioningConfig(Builder builder) {
            this.authnConfiguration = builder.authnConfiguration;
            this.fullPushScopes = builder.fullPushScopes;
            this.provisioningActions = builder.provisioningActions;
            this.scimBaseUrl = builder.scimBaseUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScimProvisioningConfig create() {
            return builder().build();
        }

        /**
         * @return authnConfiguration
         */
        public AuthnConfiguration getAuthnConfiguration() {
            return this.authnConfiguration;
        }

        /**
         * @return fullPushScopes
         */
        public java.util.List<String> getFullPushScopes() {
            return this.fullPushScopes;
        }

        /**
         * @return provisioningActions
         */
        public java.util.List<String> getProvisioningActions() {
            return this.provisioningActions;
        }

        /**
         * @return scimBaseUrl
         */
        public String getScimBaseUrl() {
            return this.scimBaseUrl;
        }

        public static final class Builder {
            private AuthnConfiguration authnConfiguration; 
            private java.util.List<String> fullPushScopes; 
            private java.util.List<String> provisioningActions; 
            private String scimBaseUrl; 

            private Builder() {
            } 

            private Builder(ScimProvisioningConfig model) {
                this.authnConfiguration = model.authnConfiguration;
                this.fullPushScopes = model.fullPushScopes;
                this.provisioningActions = model.provisioningActions;
                this.scimBaseUrl = model.scimBaseUrl;
            } 

            /**
             * <p>The configuration parameters for SCIM protocol synchronization.</p>
             */
            public Builder authnConfiguration(AuthnConfiguration authnConfiguration) {
                this.authnConfiguration = authnConfiguration;
                return this;
            }

            /**
             * <p>The scope of a full push for the SCIM protocol. Valid values:</p>
             * <ul>
             * <li>urn:alibaba:idaas:app:scim:User:PUSH: performs a full synchronization of users.</li>
             * </ul>
             */
            public Builder fullPushScopes(java.util.List<String> fullPushScopes) {
                this.fullPushScopes = fullPushScopes;
                return this;
            }

            /**
             * <p>The operations on the target resource for the SCIM protocol. Valid values:</p>
             * <ul>
             * <li><p>urn:alibaba:idaas:app:scim:User:CREATE: creates an account.</p>
             * </li>
             * <li><p>urn:alibaba:idaas:app:scim:User:UPDATE: updates an account.</p>
             * </li>
             * <li><p>urn:alibaba:idaas:app:scim:User:DELETE: deletes an account.</p>
             * </li>
             * </ul>
             */
            public Builder provisioningActions(java.util.List<String> provisioningActions) {
                this.provisioningActions = provisioningActions;
                return this;
            }

            /**
             * <p>The base URL where the application receives IDaaS SCIM protocol synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/scim">https://example.com/scim</a></p>
             */
            public Builder scimBaseUrl(String scimBaseUrl) {
                this.scimBaseUrl = scimBaseUrl;
                return this;
            }

            public ScimProvisioningConfig build() {
                return new ScimProvisioningConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationProvisioningConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationProvisioningConfigResponseBody</p>
     */
    public static class ApplicationProvisioningConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("CallbackProvisioningConfig")
        private CallbackProvisioningConfig callbackProvisioningConfig;

        @com.aliyun.core.annotation.NameInMap("ConfigOperateMode")
        private String configOperateMode;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointId")
        private String networkAccessEndpointId;

        @com.aliyun.core.annotation.NameInMap("ProvisionJwksEndpoint")
        private String provisionJwksEndpoint;

        @com.aliyun.core.annotation.NameInMap("ProvisionPassword")
        private Boolean provisionPassword;

        @com.aliyun.core.annotation.NameInMap("ProvisionProtocolType")
        private String provisionProtocolType;

        @com.aliyun.core.annotation.NameInMap("ScimProvisioningConfig")
        private ScimProvisioningConfig scimProvisioningConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ApplicationProvisioningConfig(Builder builder) {
            this.applicationId = builder.applicationId;
            this.callbackProvisioningConfig = builder.callbackProvisioningConfig;
            this.configOperateMode = builder.configOperateMode;
            this.instanceId = builder.instanceId;
            this.networkAccessEndpointId = builder.networkAccessEndpointId;
            this.provisionJwksEndpoint = builder.provisionJwksEndpoint;
            this.provisionPassword = builder.provisionPassword;
            this.provisionProtocolType = builder.provisionProtocolType;
            this.scimProvisioningConfig = builder.scimProvisioningConfig;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationProvisioningConfig create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return callbackProvisioningConfig
         */
        public CallbackProvisioningConfig getCallbackProvisioningConfig() {
            return this.callbackProvisioningConfig;
        }

        /**
         * @return configOperateMode
         */
        public String getConfigOperateMode() {
            return this.configOperateMode;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return networkAccessEndpointId
         */
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        /**
         * @return provisionJwksEndpoint
         */
        public String getProvisionJwksEndpoint() {
            return this.provisionJwksEndpoint;
        }

        /**
         * @return provisionPassword
         */
        public Boolean getProvisionPassword() {
            return this.provisionPassword;
        }

        /**
         * @return provisionProtocolType
         */
        public String getProvisionProtocolType() {
            return this.provisionProtocolType;
        }

        /**
         * @return scimProvisioningConfig
         */
        public ScimProvisioningConfig getScimProvisioningConfig() {
            return this.scimProvisioningConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applicationId; 
            private CallbackProvisioningConfig callbackProvisioningConfig; 
            private String configOperateMode; 
            private String instanceId; 
            private String networkAccessEndpointId; 
            private String provisionJwksEndpoint; 
            private Boolean provisionPassword; 
            private String provisionProtocolType; 
            private ScimProvisioningConfig scimProvisioningConfig; 
            private String status; 

            private Builder() {
            } 

            private Builder(ApplicationProvisioningConfig model) {
                this.applicationId = model.applicationId;
                this.callbackProvisioningConfig = model.callbackProvisioningConfig;
                this.configOperateMode = model.configOperateMode;
                this.instanceId = model.instanceId;
                this.networkAccessEndpointId = model.networkAccessEndpointId;
                this.provisionJwksEndpoint = model.provisionJwksEndpoint;
                this.provisionPassword = model.provisionPassword;
                this.provisionProtocolType = model.provisionProtocolType;
                this.scimProvisioningConfig = model.scimProvisioningConfig;
                this.status = model.status;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The configuration parameters for the custom event callback protocol of IDaaS.</p>
             */
            public Builder callbackProvisioningConfig(CallbackProvisioningConfig callbackProvisioningConfig) {
                this.callbackProvisioningConfig = callbackProvisioningConfig;
                return this;
            }

            /**
             * <p>The rendering mode of the account synchronization page. Valid values:</p>
             * <ul>
             * <li><p>standard: standard mode.</p>
             * </li>
             * <li><p>template: template mode.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder configOperateMode(String configOperateMode) {
                this.configOperateMode = configOperateMode;
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
             * <p>The network endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>nae_examplexxxx</p>
             */
            public Builder networkAccessEndpointId(String networkAccessEndpointId) {
                this.networkAccessEndpointId = networkAccessEndpointId;
                return this;
            }

            /**
             * <p>The public key endpoint for signature verification of application synchronization callback messages.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk267xxxxx/app_mkv7rgt4d7i4u7zqtzev2mxxxx/provisioning/jwks">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk267xxxxx/app_mkv7rgt4d7i4u7zqtzev2mxxxx/provisioning/jwks</a></p>
             */
            public Builder provisionJwksEndpoint(String provisionJwksEndpoint) {
                this.provisionJwksEndpoint = provisionJwksEndpoint;
                return this;
            }

            /**
             * <p>Indicates whether to synchronize passwords in IDaaS user event callbacks. Valid values:</p>
             * <ul>
             * <li><p>true: Passwords are synchronized.</p>
             * </li>
             * <li><p>false: Passwords are not synchronized.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder provisionPassword(Boolean provisionPassword) {
                this.provisionPassword = provisionPassword;
                return this;
            }

            /**
             * <p>The protocol type for application synchronization. Valid values:</p>
             * <ul>
             * <li><p>idaas_callback: the custom event callback protocol of IDaaS.</p>
             * </li>
             * <li><p>scim2: the System for Cross-domain Identity Management (SCIM) protocol.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>idaas_callback</p>
             */
            public Builder provisionProtocolType(String provisionProtocolType) {
                this.provisionProtocolType = provisionProtocolType;
                return this;
            }

            /**
             * <p>The configuration parameters for IDaaS SCIM protocol synchronization.</p>
             */
            public Builder scimProvisioningConfig(ScimProvisioningConfig scimProvisioningConfig) {
                this.scimProvisioningConfig = scimProvisioningConfig;
                return this;
            }

            /**
             * <p>The status of the IDaaS account synchronization feature. Valid values:</p>
             * <ul>
             * <li><p>enabled: The feature is enabled.</p>
             * </li>
             * <li><p>disabled: The feature is disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ApplicationProvisioningConfig build() {
                return new ApplicationProvisioningConfig(this);
            } 

        } 

    }
}
