// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationClientSecretResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationClientSecretResponseBody</p>
 */
public class CreateApplicationClientSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationClientSecret")
    private ApplicationClientSecret applicationClientSecret;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        public CreateApplicationClientSecretResponseBody build() {
            return new CreateApplicationClientSecretResponseBody(this);
        } 

    } 

    public static class ApplicationClientSecret extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        @com.aliyun.core.annotation.NameInMap("SecretId")
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
             * The client key ID of the application.
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
