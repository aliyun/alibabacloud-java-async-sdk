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
         * ClientSecrets.
         */
        public Builder clientSecrets(java.util.List<ClientSecrets> clientSecrets) {
            this.clientSecrets = clientSecrets;
            return this;
        }

        /**
         * RequestId.
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

            public ClientSecrets build() {
                return new ClientSecrets(this);
            } 

        } 

    }
}
