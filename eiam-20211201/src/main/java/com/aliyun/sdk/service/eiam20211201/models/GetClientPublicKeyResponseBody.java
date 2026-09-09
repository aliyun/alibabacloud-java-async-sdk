// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetClientPublicKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientPublicKeyResponseBody</p>
 */
public class GetClientPublicKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientPublicKey")
    private ClientPublicKey clientPublicKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClientPublicKeyResponseBody(Builder builder) {
        this.clientPublicKey = builder.clientPublicKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientPublicKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientPublicKey
     */
    public ClientPublicKey getClientPublicKey() {
        return this.clientPublicKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClientPublicKey clientPublicKey; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetClientPublicKeyResponseBody model) {
            this.clientPublicKey = model.clientPublicKey;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The application ClientPublicKey information.</p>
         */
        public Builder clientPublicKey(ClientPublicKey clientPublicKey) {
            this.clientPublicKey = clientPublicKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClientPublicKeyResponseBody build() {
            return new GetClientPublicKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClientPublicKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientPublicKeyResponseBody</p>
     */
    public static class ClientPublicKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgorithmType")
        private String algorithmType;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ClientPublicKeyId")
        private String clientPublicKeyId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastUsedTime")
        private Long lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        @com.aliyun.core.annotation.NameInMap("PublicKey")
        private String publicKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ClientPublicKey(Builder builder) {
            this.algorithmType = builder.algorithmType;
            this.applicationId = builder.applicationId;
            this.clientPublicKeyId = builder.clientPublicKeyId;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.lastUsedTime = builder.lastUsedTime;
            this.primary = builder.primary;
            this.publicKey = builder.publicKey;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientPublicKey create() {
            return builder().build();
        }

        /**
         * @return algorithmType
         */
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return clientPublicKeyId
         */
        public String getClientPublicKeyId() {
            return this.clientPublicKeyId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        /**
         * @return publicKey
         */
        public String getPublicKey() {
            return this.publicKey;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String algorithmType; 
            private String applicationId; 
            private String clientPublicKeyId; 
            private Long createTime; 
            private String instanceId; 
            private Long lastUsedTime; 
            private Boolean primary; 
            private String publicKey; 
            private String status; 

            private Builder() {
            } 

            private Builder(ClientPublicKey model) {
                this.algorithmType = model.algorithmType;
                this.applicationId = model.applicationId;
                this.clientPublicKeyId = model.clientPublicKeyId;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.lastUsedTime = model.lastUsedTime;
                this.primary = model.primary;
                this.publicKey = model.publicKey;
                this.status = model.status;
            } 

            /**
             * <p>The algorithm type.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA-2048</p>
             */
            public Builder algorithmType(String algorithmType) {
                this.algorithmType = algorithmType;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The ID of the application ClientPublicKey.</p>
             * 
             * <strong>example:</strong>
             * <p>KEYEqDnDJhztiEAwSin7MZoxGcihzCAuxxxx</p>
             */
            public Builder clientPublicKeyId(String clientPublicKeyId) {
                this.clientPublicKeyId = clientPublicKeyId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1731305755000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The last time the key pair was used.</p>
             * 
             * <strong>example:</strong>
             * <p>1771305755000</p>
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>Indicates whether the key pair is used with priority.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * <p>The public key.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN PUBLIC KEY-----
             * MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmnWMdp9FU3vXljeIqpgR
             * 05E6jEgzIfKsFaLkv+07e2Lg8luTaJh8Q2nkbxdNpTfqBnMMyTgml88WktP45F78
             * La7hQtR3vz0Eu1yA92gXwD5Oob7ay4JYQZ0C80o2tB3FsbXG2jUvr31MNkf/0oBY
             * qUKK5Hnlk1TdrnZ5VkzgLGHKlj+NJHHF/57DbT64C2qpAWeKHAr9umJ8++0hKqG/
             * oRSOpb7oWK4t5c39ulp1j5JJ6cwqrKVCXvsHfWHywOHkcyus+ZNPTQvpwjRnEmRz
             * Vy3NWrjT7JlIa8vS1aUU+FxeFd2MLQzxFxquFLwi05su2faRexaeYwWW6IWAI3tX
             * twxxxxxx
             * -----END PUBLIC KEY-----</p>
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClientPublicKey build() {
                return new ClientPublicKey(this);
            } 

        } 

    }
}
