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
         * 请求Id
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
    public static class ApplicationProvisioningConfig extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("CallbackProvisioningConfig")
        private CallbackProvisioningConfig callbackProvisioningConfig;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ProvisionJwksEndpoint")
        private String provisionJwksEndpoint;

        @NameInMap("ProvisionPassword")
        private Boolean provisionPassword;

        @NameInMap("ProvisionProtocolType")
        private String provisionProtocolType;

        @NameInMap("Status")
        private String status;

        private ApplicationProvisioningConfig(Builder builder) {
            this.applicationId = builder.applicationId;
            this.callbackProvisioningConfig = builder.callbackProvisioningConfig;
            this.instanceId = builder.instanceId;
            this.provisionJwksEndpoint = builder.provisionJwksEndpoint;
            this.provisionPassword = builder.provisionPassword;
            this.provisionProtocolType = builder.provisionProtocolType;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applicationId; 
            private CallbackProvisioningConfig callbackProvisioningConfig; 
            private String instanceId; 
            private String provisionJwksEndpoint; 
            private Boolean provisionPassword; 
            private String provisionProtocolType; 
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
