// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link CreateClientSecretResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClientSecretResponseBody</p>
 */
public class CreateClientSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientSecret")
    private ClientSecret clientSecret;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateClientSecretResponseBody(Builder builder) {
        this.clientSecret = builder.clientSecret;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientSecretResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientSecret
     */
    public ClientSecret getClientSecret() {
        return this.clientSecret;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClientSecret clientSecret; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateClientSecretResponseBody model) {
            this.clientSecret = model.clientSecret;
            this.requestId = model.requestId;
        } 

        /**
         * ClientSecret.
         */
        public Builder clientSecret(ClientSecret clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateClientSecretResponseBody build() {
            return new CreateClientSecretResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateClientSecretResponseBody} extends {@link TeaModel}
     *
     * <p>CreateClientSecretResponseBody</p>
     */
    public static class ClientSecret extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientSecretId")
        private String clientSecretId;

        @com.aliyun.core.annotation.NameInMap("ClientSecretValue")
        private String clientSecretValue;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("UserPoolName")
        private String userPoolName;

        private ClientSecret(Builder builder) {
            this.clientId = builder.clientId;
            this.clientName = builder.clientName;
            this.clientSecretId = builder.clientSecretId;
            this.clientSecretValue = builder.clientSecretValue;
            this.createTime = builder.createTime;
            this.userPoolName = builder.userPoolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientSecret create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientName
         */
        public String getClientName() {
            return this.clientName;
        }

        /**
         * @return clientSecretId
         */
        public String getClientSecretId() {
            return this.clientSecretId;
        }

        /**
         * @return clientSecretValue
         */
        public String getClientSecretValue() {
            return this.clientSecretValue;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return userPoolName
         */
        public String getUserPoolName() {
            return this.userPoolName;
        }

        public static final class Builder {
            private String clientId; 
            private String clientName; 
            private String clientSecretId; 
            private String clientSecretValue; 
            private String createTime; 
            private String userPoolName; 

            private Builder() {
            } 

            private Builder(ClientSecret model) {
                this.clientId = model.clientId;
                this.clientName = model.clientName;
                this.clientSecretId = model.clientSecretId;
                this.clientSecretValue = model.clientSecretValue;
                this.createTime = model.createTime;
                this.userPoolName = model.userPoolName;
            } 

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientName.
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * ClientSecretId.
             */
            public Builder clientSecretId(String clientSecretId) {
                this.clientSecretId = clientSecretId;
                return this;
            }

            /**
             * ClientSecretValue.
             */
            public Builder clientSecretValue(String clientSecretValue) {
                this.clientSecretValue = clientSecretValue;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * UserPoolName.
             */
            public Builder userPoolName(String userPoolName) {
                this.userPoolName = userPoolName;
                return this;
            }

            public ClientSecret build() {
                return new ClientSecret(this);
            } 

        } 

    }
}
