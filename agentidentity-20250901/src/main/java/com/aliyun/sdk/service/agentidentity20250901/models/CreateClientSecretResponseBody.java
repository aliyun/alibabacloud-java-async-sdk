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
         * <p>The client secret information.</p>
         */
        public Builder clientSecret(ClientSecret clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
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
             * <p>The ID of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>client_xxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The name of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>my-web-app</p>
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * <p>The client key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>secret_xxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder clientSecretId(String clientSecretId) {
                this.clientSecretId = clientSecretId;
                return this;
            }

            /**
             * <p>The plaintext client secret. This value is returned only once upon creation and cannot be retrieved later. Store it securely.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxxxxxxxxxx</p>
             */
            public Builder clientSecretValue(String clientSecretValue) {
                this.clientSecretValue = clientSecretValue;
                return this;
            }

            /**
             * <p>The time when the client secret was created, in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07T06:19:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the user pool.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-userpool</p>
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
