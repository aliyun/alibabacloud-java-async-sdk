// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationProvisioningConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationProvisioningConfigResponseBody</p>
 */
public class GetApplicationProvisioningConfigResponseBody extends TeaModel {
    @NameInMap("ApplicationProvisioningConfig")
    private ApplicationProvisioningConfig applicationProvisioningConfig;

    @NameInMap("RequestId")
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

        /**
         * ApplicationProvisioningConfig.
         */
        public Builder applicationProvisioningConfig(ApplicationProvisioningConfig applicationProvisioningConfig) {
            this.applicationProvisioningConfig = applicationProvisioningConfig;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationProvisioningConfigResponseBody build() {
            return new GetApplicationProvisioningConfigResponseBody(this);
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
             * IDaaS回调SP地址，当provisionProtocolType为idaas_callback时必填
             */
            public Builder callbackUrl(String callbackUrl) {
                this.callbackUrl = callbackUrl;
                return this;
            }

            /**
             * IDaaS回调对称加密秘钥, AES 256格式
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * IDaaS回调是否加密
             */
            public Builder encryptRequired(Boolean encryptRequired) {
                this.encryptRequired = encryptRequired;
                return this;
            }

            /**
             * IDaaS回调事件监听范围
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
             * accessToken
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * oauth2 authentication method
             */
            public Builder authnMethod(String authnMethod) {
                this.authnMethod = authnMethod;
                return this;
            }

            /**
             * oauth2 client id
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * oauth2 client secret
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * oauth2 token端点
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
             * 认证类型
             */
            public Builder authnMode(String authnMode) {
                this.authnMode = authnMode;
                return this;
            }

            /**
             * 授权相关配置
             */
            public Builder authnParam(AuthnParam authnParam) {
                this.authnParam = authnParam;
                return this;
            }

            /**
             * 授权模式
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
             * scim同步相关配置
             */
            public Builder authnConfiguration(AuthnConfiguration authnConfiguration) {
                this.authnConfiguration = authnConfiguration;
                return this;
            }

            /**
             * 全量推送范围
             */
            public Builder fullPushScopes(java.util.List < String > fullPushScopes) {
                this.fullPushScopes = fullPushScopes;
                return this;
            }

            /**
             * 目标资源操作行为
             */
            public Builder provisioningActions(java.util.List < String > provisioningActions) {
                this.provisioningActions = provisioningActions;
                return this;
            }

            /**
             * scim同步端点
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
    public static class ApplicationProvisioningConfig extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("CallbackProvisioningConfig")
        private CallbackProvisioningConfig callbackProvisioningConfig;

        @NameInMap("ConfigOperateMode")
        private String configOperateMode;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ProvisionJwksEndpoint")
        private String provisionJwksEndpoint;

        @NameInMap("ProvisionPassword")
        private Boolean provisionPassword;

        @NameInMap("ProvisionProtocolType")
        private String provisionProtocolType;

        @NameInMap("ScimProvisioningConfig")
        private ScimProvisioningConfig scimProvisioningConfig;

        @NameInMap("Status")
        private String status;

        private ApplicationProvisioningConfig(Builder builder) {
            this.applicationId = builder.applicationId;
            this.callbackProvisioningConfig = builder.callbackProvisioningConfig;
            this.configOperateMode = builder.configOperateMode;
            this.instanceId = builder.instanceId;
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
            private String provisionJwksEndpoint; 
            private Boolean provisionPassword; 
            private String provisionProtocolType; 
            private ScimProvisioningConfig scimProvisioningConfig; 
            private String status; 

            /**
             * IDaaS EIAM 应用Id
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * IDaaS回调同步配置，当provisionProtocolType为idaas_callback时必填
             */
            public Builder callbackProvisioningConfig(CallbackProvisioningConfig callbackProvisioningConfig) {
                this.callbackProvisioningConfig = callbackProvisioningConfig;
                return this;
            }

            /**
             * 账户同步页面渲染方式
             */
            public Builder configOperateMode(String configOperateMode) {
                this.configOperateMode = configOperateMode;
                return this;
            }

            /**
             * IDaaS EIAM 实例Id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 应用同步验签公钥端点
             */
            public Builder provisionJwksEndpoint(String provisionJwksEndpoint) {
                this.provisionJwksEndpoint = provisionJwksEndpoint;
                return this;
            }

            /**
             * 同步信息是否包含密码
             */
            public Builder provisionPassword(Boolean provisionPassword) {
                this.provisionPassword = provisionPassword;
                return this;
            }

            /**
             * IDaaS EIAM 应用同步协议，scim2 or custom or idaas_callback
             */
            public Builder provisionProtocolType(String provisionProtocolType) {
                this.provisionProtocolType = provisionProtocolType;
                return this;
            }

            /**
             * IDaaS SCIM同步配置，当provisionProtocolType为scim2时填写该配置
             */
            public Builder scimProvisioningConfig(ScimProvisioningConfig scimProvisioningConfig) {
                this.scimProvisioningConfig = scimProvisioningConfig;
                return this;
            }

            /**
             * IDaaS 应用同步启用状态
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
