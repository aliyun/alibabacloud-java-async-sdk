// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ObtainApplicationClientSecretResponseBody} extends {@link TeaModel}
 *
 * <p>ObtainApplicationClientSecretResponseBody</p>
 */
public class ObtainApplicationClientSecretResponseBody extends TeaModel {
    @NameInMap("ApplicationClientSecret")
    private ApplicationClientSecret applicationClientSecret;

    @NameInMap("RequestId")
    private String requestId;

    private ObtainApplicationClientSecretResponseBody(Builder builder) {
        this.applicationClientSecret = builder.applicationClientSecret;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObtainApplicationClientSecretResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationClientSecret
     */
    public ApplicationClientSecret getApplicationClientSecret() {
        return this.applicationClientSecret;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationClientSecret applicationClientSecret; 
        private String requestId; 

        /**
         * ApplicationClientSecret.
         */
        public Builder applicationClientSecret(ApplicationClientSecret applicationClientSecret) {
            this.applicationClientSecret = applicationClientSecret;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ObtainApplicationClientSecretResponseBody build() {
            return new ObtainApplicationClientSecretResponseBody(this);
        } 

    } 

    public static class ApplicationClientSecret extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClientSecret")
        private String clientSecret;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LastUsedTime")
        private Long lastUsedTime;

        @NameInMap("SecretId")
        private String secretId;

        @NameInMap("Status")
        private String status;

        private ApplicationClientSecret(Builder builder) {
            this.applicationId = builder.applicationId;
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
            this.instanceId = builder.instanceId;
            this.lastUsedTime = builder.lastUsedTime;
            this.secretId = builder.secretId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationClientSecret create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastUsedTime
         */
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        /**
         * @return secretId
         */
        public String getSecretId() {
            return this.secretId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applicationId; 
            private String clientId; 
            private String clientSecret; 
            private String instanceId; 
            private Long lastUsedTime; 
            private String secretId; 
            private String status; 

            /**
             * IDaaS EIAM 应用Id
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * IDaaS EIAM 客户端ID
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * 客户端密钥
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
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
             * IDaaS EIAM 客户端密钥最近使用时间
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * IDaaS EIAM 客户端密钥Id
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * IDaaS EIAM 客户端密钥状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ApplicationClientSecret build() {
                return new ApplicationClientSecret(this);
            } 

        } 

    }
}
