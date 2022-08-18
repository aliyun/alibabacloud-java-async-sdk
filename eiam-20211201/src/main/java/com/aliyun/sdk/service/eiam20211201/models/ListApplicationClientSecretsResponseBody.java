// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationClientSecretsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationClientSecretsResponseBody</p>
 */
public class ListApplicationClientSecretsResponseBody extends TeaModel {
    @NameInMap("ApplicationClientSecrets")
    private java.util.List < ApplicationClientSecrets> applicationClientSecrets;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationClientSecretsResponseBody(Builder builder) {
        this.applicationClientSecrets = builder.applicationClientSecrets;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationClientSecretsResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationClientSecrets
     */
    public java.util.List < ApplicationClientSecrets> getApplicationClientSecrets() {
        return this.applicationClientSecrets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < ApplicationClientSecrets> applicationClientSecrets; 
        private String requestId; 
        private Long totalCount; 

        /**
         * ApplicationClientSecrets.
         */
        public Builder applicationClientSecrets(java.util.List < ApplicationClientSecrets> applicationClientSecrets) {
            this.applicationClientSecrets = applicationClientSecrets;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 列表条数目
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationClientSecretsResponseBody build() {
            return new ListApplicationClientSecretsResponseBody(this);
        } 

    } 

    public static class ApplicationClientSecrets extends TeaModel {
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

        private ApplicationClientSecrets(Builder builder) {
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

        public static ApplicationClientSecrets create() {
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
             * 客户端密钥（已脱敏）
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

            public ApplicationClientSecrets build() {
                return new ApplicationClientSecrets(this);
            } 

        } 

    }
}
