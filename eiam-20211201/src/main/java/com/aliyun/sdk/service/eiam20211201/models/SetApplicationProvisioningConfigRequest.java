// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetApplicationProvisioningConfigRequest} extends {@link RequestModel}
 *
 * <p>SetApplicationProvisioningConfigRequest</p>
 */
public class SetApplicationProvisioningConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackProvisioningConfig")
    private CallbackProvisioningConfig callbackProvisioningConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionPassword")
    private Boolean provisionPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionProtocolType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String provisionProtocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScimProvisioningConfig")
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
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The configuration of event callback synchronization. This parameter is required when the ProvisionProtocolType parameter is set to idaas_callback.</p>
         */
        public Builder callbackProvisioningConfig(CallbackProvisioningConfig callbackProvisioningConfig) {
            this.putQueryParameter("CallbackProvisioningConfig", callbackProvisioningConfig);
            this.callbackProvisioningConfig = callbackProvisioningConfig;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
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

        /**
         * <p>Specifies whether to synchronize the password in IDaaS user event callbacks. Valid values:</p>
         * <ul>
         * <li>true: synchronize the password.</li>
         * <li>false: do not synchronize the password.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder provisionPassword(Boolean provisionPassword) {
            this.putQueryParameter("ProvisionPassword", provisionPassword);
            this.provisionPassword = provisionPassword;
            return this;
        }

        /**
         * <p>The synchronization protocol type of the application. Valid values:</p>
         * <ul>
         * <li>idaas_callback: custom event callback protocol of IDaaS.</li>
         * <li>scim2: System for Cross-domain Identity Management (SCIM) protocol.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_callback</p>
         */
        public Builder provisionProtocolType(String provisionProtocolType) {
            this.putQueryParameter("ProvisionProtocolType", provisionProtocolType);
            this.provisionProtocolType = provisionProtocolType;
            return this;
        }

        /**
         * <p>The configuration of SCIM-based IDaaS synchronization. This parameter is required when the ProvisionProtocolType parameter is set to scim2.</p>
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

    /**
     * 
     * {@link SetApplicationProvisioningConfigRequest} extends {@link TeaModel}
     *
     * <p>SetApplicationProvisioningConfigRequest</p>
     */
    public static class CallbackProvisioningConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallbackUrl")
        private String callbackUrl;

        @com.aliyun.core.annotation.NameInMap("EncryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("EncryptRequired")
        private Boolean encryptRequired;

        @com.aliyun.core.annotation.NameInMap("ListenEventScopes")
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
             * <p>The URL that the application uses to receive IDaaS event callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/event/callback">https://example.com/event/callback</a></p>
             */
            public Builder callbackUrl(String callbackUrl) {
                this.callbackUrl = callbackUrl;
                return this;
            }

            /**
             * <p>The symmetric key for IDaaS event callbacks. The key is an AES-256 encryption key in the HEX format.</p>
             * 
             * <strong>example:</strong>
             * <p>ad3b248**************************b3561a73d7</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt IDaaS event callback messages. Valid values:</p>
             * <ul>
             * <li>true: encrypt the messages.</li>
             * <li>false: transmit the messages in plaintext.</li>
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
             * <p>The list of types of IDaaS event callback messages that are supported by the listener.</p>
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
    /**
     * 
     * {@link SetApplicationProvisioningConfigRequest} extends {@link TeaModel}
     *
     * <p>SetApplicationProvisioningConfigRequest</p>
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

            /**
             * <p>The access token. If the GrantType parameter is set to bearer_token, you can set this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>k52x2ru63rlkflina5utgkxxxx</p>
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * <p>The authentication mode of the SCIM protocol. Valid values:</p>
             * <ul>
             * <li>client_secret_basic: The client secret is passed in the request header.</li>
             * <li>client_secret_post: The client secret is passed in the request body.</li>
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
     * {@link SetApplicationProvisioningConfigRequest} extends {@link TeaModel}
     *
     * <p>SetApplicationProvisioningConfigRequest</p>
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

            /**
             * <p>The authentication mode of the SCIM protocol. Valid value:</p>
             * <ul>
             * <li>oauth2: OAuth2.0 mode.</li>
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
             * <p>The configuration parameters related to authorization.</p>
             * <ul>
             * <li>If the GrantType parameter is set to client_credentials, you can set the configuration parameters ClientId, ClientSecret, and AuthnMethod.</li>
             * <li>If the GrantType parameter is set to bearer_token, you can set the configuration parameter AccessToken.</li>
             * </ul>
             */
            public Builder authnParam(AuthnParam authnParam) {
                this.authnParam = authnParam;
                return this;
            }

            /**
             * <p>The grant type of the SCIM protocol. Valid values:</p>
             * <ul>
             * <li>client_credentials: client mode.</li>
             * <li>bearer_token: key mode.</li>
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
     * {@link SetApplicationProvisioningConfigRequest} extends {@link TeaModel}
     *
     * <p>SetApplicationProvisioningConfigRequest</p>
     */
    public static class ScimProvisioningConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthnConfiguration")
        private AuthnConfiguration authnConfiguration;

        @com.aliyun.core.annotation.NameInMap("FullPushScopes")
        private java.util.List < String > fullPushScopes;

        @com.aliyun.core.annotation.NameInMap("ProvisioningActions")
        private java.util.List < String > provisioningActions;

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
             * <p>The configuration parameters related to SCIM-based synchronization.</p>
             */
            public Builder authnConfiguration(AuthnConfiguration authnConfiguration) {
                this.authnConfiguration = authnConfiguration;
                return this;
            }

            /**
             * <p>The full synchronization scope of the SCIM protocol. Valid value:</p>
             * <ul>
             * <li>urn:alibaba:idaas:app:scim:User:PUSH: full account data synchronization.</li>
             * </ul>
             */
            public Builder fullPushScopes(java.util.List < String > fullPushScopes) {
                this.fullPushScopes = fullPushScopes;
                return this;
            }

            /**
             * <p>The resource operations of the SCIM protocol. Valid values:</p>
             * <ul>
             * <li>urn:alibaba:idaas:app:scim:User:CREATE: account creation.</li>
             * <li>urn:alibaba:idaas:app:scim:User:UPDATE: account update.</li>
             * <li>urn:alibaba:idaas:app:scim:User:DELETE: account deletion.</li>
             * </ul>
             */
            public Builder provisioningActions(java.util.List < String > provisioningActions) {
                this.provisioningActions = provisioningActions;
                return this;
            }

            /**
             * <p>The base URL that the application uses to receive the SCIM protocol for IDaaS synchronization.</p>
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
}
