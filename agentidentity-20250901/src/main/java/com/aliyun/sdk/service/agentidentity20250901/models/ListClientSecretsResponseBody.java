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
 * {@link ListClientSecretsResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientSecretsResponseBody</p>
 */
public class ListClientSecretsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientSecrets")
    private java.util.List<ClientSecrets> clientSecrets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClientSecretsResponseBody(Builder builder) {
        this.clientSecrets = builder.clientSecrets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientSecretsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientSecrets
     */
    public java.util.List<ClientSecrets> getClientSecrets() {
        return this.clientSecrets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ClientSecrets> clientSecrets; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListClientSecretsResponseBody model) {
            this.clientSecrets = model.clientSecrets;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of client secrets.</p>
         */
        public Builder clientSecrets(java.util.List<ClientSecrets> clientSecrets) {
            this.clientSecrets = clientSecrets;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClientSecretsResponseBody build() {
            return new ListClientSecretsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClientSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListClientSecretsResponseBody</p>
     */
    public static class ClientSecrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientSecretId")
        private String clientSecretId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("UserPoolName")
        private String userPoolName;

        private ClientSecrets(Builder builder) {
            this.clientId = builder.clientId;
            this.clientName = builder.clientName;
            this.clientSecretId = builder.clientSecretId;
            this.createTime = builder.createTime;
            this.userPoolName = builder.userPoolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientSecrets create() {
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
            private String createTime; 
            private String userPoolName; 

            private Builder() {
            } 

            private Builder(ClientSecrets model) {
                this.clientId = model.clientId;
                this.clientName = model.clientName;
                this.clientSecretId = model.clientSecretId;
                this.createTime = model.createTime;
                this.userPoolName = model.userPoolName;
            } 

            /**
             * <p>The client ID.</p>
             * 
             * <strong>example:</strong>
             * <p>client_xxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The client name.</p>
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
             * <p>The creation time of the client secret in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07T06:19:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The user pool name.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-userpool</p>
             */
            public Builder userPoolName(String userPoolName) {
                this.userPoolName = userPoolName;
                return this;
            }

            public ClientSecrets build() {
                return new ClientSecrets(this);
            } 

        } 

    }
}
