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
 * {@link ListClientPublicKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientPublicKeysResponseBody</p>
 */
public class ListClientPublicKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientPublicKeys")
    private java.util.List<ClientPublicKeys> clientPublicKeys;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListClientPublicKeysResponseBody(Builder builder) {
        this.clientPublicKeys = builder.clientPublicKeys;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientPublicKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientPublicKeys
     */
    public java.util.List<ClientPublicKeys> getClientPublicKeys() {
        return this.clientPublicKeys;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<ClientPublicKeys> clientPublicKeys; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListClientPublicKeysResponseBody model) {
            this.clientPublicKeys = model.clientPublicKeys;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of client public keys for the application.</p>
         */
        public Builder clientPublicKeys(java.util.List<ClientPublicKeys> clientPublicKeys) {
            this.clientPublicKeys = clientPublicKeys;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClientPublicKeysResponseBody build() {
            return new ListClientPublicKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClientPublicKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListClientPublicKeysResponseBody</p>
     */
    public static class ClientPublicKeys extends TeaModel {
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

        private ClientPublicKeys(Builder builder) {
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

        public static ClientPublicKeys create() {
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

            private Builder(ClientPublicKeys model) {
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
             * <p>The ID of the client public key.</p>
             * 
             * <strong>example:</strong>
             * <p>KEYEqDnDJhztiEAwSin7MZoxGcihzCAuxxxx</p>
             */
            public Builder clientPublicKeyId(String clientPublicKeyId) {
                this.clientPublicKeyId = clientPublicKeyId;
                return this;
            }

            /**
             * <p>The time when the key was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1722006052000</p>
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
             * <p>The time when the key was last used.</p>
             * 
             * <strong>example:</strong>
             * <p>1762006052000</p>
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>Indicates whether the key is used with priority.</p>
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

            public ClientPublicKeys build() {
                return new ClientPublicKeys(this);
            } 

        } 

    }
}
