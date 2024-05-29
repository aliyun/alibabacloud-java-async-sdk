// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ObtainApplicationClientSecretResponseBody} extends {@link TeaModel}
 *
 * <p>ObtainApplicationClientSecretResponseBody</p>
 */
public class ObtainApplicationClientSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationClientSecret")
    private ApplicationClientSecret applicationClientSecret;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The information about the client key.
         */
        public Builder applicationClientSecret(ApplicationClientSecret applicationClientSecret) {
            this.applicationClientSecret = applicationClientSecret;
            return this;
        }

        /**
         * The ID of the request.
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
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastUsedTime")
        private Long lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("SecretId")
        private String secretId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * The ID of the application whose client key you want to query.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
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
             * The client key secret of the application.
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time when the client key was last used. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * The client key ID of the application.
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * The status of the client key. Valid values:
             * <p>
             * 
             * *   Enabled: The client key is enabled.
             * *   Disabled: The client key is disabled.
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
