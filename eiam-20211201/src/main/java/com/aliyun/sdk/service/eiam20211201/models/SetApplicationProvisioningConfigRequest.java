// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetApplicationProvisioningConfigRequest} extends {@link RequestModel}
 *
 * <p>SetApplicationProvisioningConfigRequest</p>
 */
public class SetApplicationProvisioningConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true, maxLength = 64)
    private String applicationId;

    @Query
    @NameInMap("CallbackProvisioningConfig")
    private CallbackProvisioningConfig callbackProvisioningConfig;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("ProvisionPassword")
    private Boolean provisionPassword;

    @Query
    @NameInMap("ProvisionProtocolType")
    @Validation(required = true, maxLength = 64)
    private String provisionProtocolType;

    @Query
    @NameInMap("ScimProvisioningConfig")
    private ScimProvisioningConfig scimProvisioningConfig;

    private SetApplicationProvisioningConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.callbackProvisioningConfig = builder.callbackProvisioningConfig;
        this.instanceId = builder.instanceId;
        this.provisionPassword = builder.provisionPassword;
        this.provisionProtocolType = builder.provisionProtocolType;
        this.scimProvisioningConfig = builder.scimProvisioningConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetApplicationProvisioningConfigRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<SetApplicationProvisioningConfigRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private CallbackProvisioningConfig callbackProvisioningConfig; 
        private String instanceId; 
        private Boolean provisionPassword; 
        private String provisionProtocolType; 
        private ScimProvisioningConfig scimProvisioningConfig; 

        private Builder() {
            super();
        } 

        private Builder(SetApplicationProvisioningConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.callbackProvisioningConfig = request.callbackProvisioningConfig;
            this.instanceId = request.instanceId;
            this.provisionPassword = request.provisionPassword;
            this.provisionProtocolType = request.provisionProtocolType;
            this.scimProvisioningConfig = request.scimProvisioningConfig;
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
         * The ID of the application.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * The configuration of event callback synchronization. This parameter is required when the ProvisionProtocolType parameter is set to idaas_callback.
         */
        public Builder callbackProvisioningConfig(CallbackProvisioningConfig callbackProvisioningConfig) {
            this.putQueryParameter("CallbackProvisioningConfig", callbackProvisioningConfig);
            this.callbackProvisioningConfig = callbackProvisioningConfig;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to synchronize the password in IDaaS user event callbacks. Valid values:
         * <p>
         * 
         * *   true: synchronize the password.
         * *   false: do not synchronize the password.
         */
        public Builder provisionPassword(Boolean provisionPassword) {
            this.putQueryParameter("ProvisionPassword", provisionPassword);
            this.provisionPassword = provisionPassword;
            return this;
        }

        /**
         * The synchronization protocol type of the application. Valid values:
         * <p>
         * 
         * *   idaas_callback: custom event callback protocol of IDaaS.
         * *   scim2: System for Cross-domain Identity Management (SCIM) protocol.
         */
        public Builder provisionProtocolType(String provisionProtocolType) {
            this.putQueryParameter("ProvisionProtocolType", provisionProtocolType);
            this.provisionProtocolType = provisionProtocolType;
            return this;
        }

        /**
         * The configuration of SCIM-based IDaaS synchronization. This parameter is required when the ProvisionProtocolType parameter is set to scim2.
         */
        public Builder scimProvisioningConfig(ScimProvisioningConfig scimProvisioningConfig) {
            this.putQueryParameter("ScimProvisioningConfig", scimProvisioningConfig);
            this.scimProvisioningConfig = scimProvisioningConfig;
            return this;
        }

        @Override
        public SetApplicationProvisioningConfigRequest build() {
            return new SetApplicationProvisioningConfigRequest(this);
        } 

    } 

    public static class CallbackProvisioningConfig extends TeaModel {
        @NameInMap("CallbackUrl")
        private String callbackUrl;

        @NameInMap("EncryptKey")
        private String encryptKey;

        @NameInMap("EncryptRequired")
        private Boolean encryptRequired;

        @NameInMap("ListenEventScopes")
        private java.util.List < String > listenEventScopes;

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
        public java.util.List < String > getListenEventScopes() {
            return this.listenEventScopes;
        }

        public static final class Builder {
            private String callbackUrl; 
            private String encryptKey; 
            private Boolean encryptRequired; 
            private java.util.List < String > listenEventScopes; 

            /**
             * The URL that the application uses to receive IDaaS event callbacks.
             */
            public Builder callbackUrl(String callbackUrl) {
                this.callbackUrl = callbackUrl;
                return this;
            }

            /**
             * The symmetric key for IDaaS event callbacks. The key is an AES-256 encryption key in the HEX format.
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * Specifies whether to encrypt IDaaS event callback messages. Valid values:
             * <p>
             * 
             * *   true: encrypt the messages.
             * *   false: transmit the messages in plaintext.
             */
            public Builder encryptRequired(Boolean encryptRequired) {
                this.encryptRequired = encryptRequired;
                return this;
            }

            /**
             * The list of types of IDaaS event callback messages that are supported by the listener.
             */
            public Builder listenEventScopes(java.util.List < String > listenEventScopes) {
                this.listenEventScopes = listenEventScopes;
                return this;
            }

            public CallbackProvisioningConfig build() {
                return new CallbackProvisioningConfig(this);
            } 

        } 

    }
    public static class AuthnParam extends TeaModel {
        @NameInMap("AccessToken")
        private String accessToken;

        @NameInMap("AuthnMethod")
        private String authnMethod;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClientSecret")
        private String clientSecret;

        @NameInMap("TokenEndpoint")
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

            /**
             * The access token. If the GrantType parameter is set to bearer_token, you can set this parameter.
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * The authentication mode of the SCIM protocol. Valid values:
             * <p>
             * 
             * *   client_secret_basic: The client secret is passed in the request header.
             * *   client_secret_post: The client secret is passed in the request body.
             */
            public Builder authnMethod(String authnMethod) {
                this.authnMethod = authnMethod;
                return this;
            }

            /**
             * The client ID of the application.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The client secret of the application.
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * The token endpoint.
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
    public static class AuthnConfiguration extends TeaModel {
        @NameInMap("AuthnMode")
        private String authnMode;

        @NameInMap("AuthnParam")
        private AuthnParam authnParam;

        @NameInMap("GrantType")
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

            /**
             * The authentication mode of the SCIM protocol. Valid value:
             * <p>
             * 
             * *   oauth2: OAuth2.0 mode.
             */
            public Builder authnMode(String authnMode) {
                this.authnMode = authnMode;
                return this;
            }

            /**
             * The configuration parameters related to authorization.
             * <p>
             * 
             * *   If the GrantType parameter is set to client_credentials, you can set the configuration parameters ClientId, ClientSecret, and AuthnMethod.
             * *   If the GrantType parameter is set to bearer_token, you can set the configuration parameter AccessToken.
             */
            public Builder authnParam(AuthnParam authnParam) {
                this.authnParam = authnParam;
                return this;
            }

            /**
             * The grant type of the SCIM protocol. Valid values:
             * <p>
             * 
             * *   client_credentials: client mode.
             * *   bearer_token: key mode.
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
    public static class ScimProvisioningConfig extends TeaModel {
        @NameInMap("AuthnConfiguration")
        private AuthnConfiguration authnConfiguration;

        @NameInMap("FullPushScopes")
        private java.util.List < String > fullPushScopes;

        @NameInMap("ProvisioningActions")
        private java.util.List < String > provisioningActions;

        @NameInMap("ScimBaseUrl")
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
        public java.util.List < String > getFullPushScopes() {
            return this.fullPushScopes;
        }

        /**
         * @return provisioningActions
         */
        public java.util.List < String > getProvisioningActions() {
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
            private java.util.List < String > fullPushScopes; 
            private java.util.List < String > provisioningActions; 
            private String scimBaseUrl; 

            /**
             * The configuration parameters related to SCIM-based synchronization.
             */
            public Builder authnConfiguration(AuthnConfiguration authnConfiguration) {
                this.authnConfiguration = authnConfiguration;
                return this;
            }

            /**
             * The full synchronization scope of the SCIM protocol. Valid value:
             * <p>
             * 
             * *   urn:alibaba:idaas:app:scim:User:PUSH: full account data synchronization.
             */
            public Builder fullPushScopes(java.util.List < String > fullPushScopes) {
                this.fullPushScopes = fullPushScopes;
                return this;
            }

            /**
             * The resource operations of the SCIM protocol. Valid values:
             * <p>
             * 
             * *   urn:alibaba:idaas:app:scim:User:CREATE: account creation.
             * *   urn:alibaba:idaas:app:scim:User:UPDATE: account update.
             * *   urn:alibaba:idaas:app:scim:User:DELETE: account deletion.
             */
            public Builder provisioningActions(java.util.List < String > provisioningActions) {
                this.provisioningActions = provisioningActions;
                return this;
            }

            /**
             * The base URL that the application uses to receive the SCIM protocol for IDaaS synchronization.
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
}
