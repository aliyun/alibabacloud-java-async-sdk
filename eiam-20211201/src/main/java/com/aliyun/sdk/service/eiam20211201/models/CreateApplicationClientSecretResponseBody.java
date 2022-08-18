// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationClientSecretResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationClientSecretResponseBody</p>
 */
public class CreateApplicationClientSecretResponseBody extends TeaModel {
    @NameInMap("ApplicationClientSecret")
    private ApplicationClientSecret applicationClientSecret;

    @NameInMap("RequestId")
    private String requestId;

    private CreateApplicationClientSecretResponseBody(Builder builder) {
        this.applicationClientSecret = builder.applicationClientSecret;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationClientSecretResponseBody create() {
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

        public CreateApplicationClientSecretResponseBody build() {
            return new CreateApplicationClientSecretResponseBody(this);
        } 

    } 

    public static class ApplicationClientSecret extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClientSecret")
        private String clientSecret;

        @NameInMap("SecretId")
        private String secretId;

        private ApplicationClientSecret(Builder builder) {
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
            this.secretId = builder.secretId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationClientSecret create() {
            return builder().build();
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
         * @return secretId
         */
        public String getSecretId() {
            return this.secretId;
        }

        public static final class Builder {
            private String clientId; 
            private String clientSecret; 
            private String secretId; 

            /**
             * IDaaS EIAM 客户端ID
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * IDaaS EIAM 客户端密钥
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * IDaaS EIAM 客户端密钥Id
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            public ApplicationClientSecret build() {
                return new ApplicationClientSecret(this);
            } 

        } 

    }
}
