// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListKeyPairsResponseBody} extends {@link TeaModel}
 *
 * <p>ListKeyPairsResponseBody</p>
 */
public class ListKeyPairsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyPairs")
    private java.util.List < KeyPairs> keyPairs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListKeyPairsResponseBody(Builder builder) {
        this.keyPairs = builder.keyPairs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKeyPairsResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyPairs
     */
    public java.util.List < KeyPairs> getKeyPairs() {
        return this.keyPairs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < KeyPairs> keyPairs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>Details about the queried AccessKey pairs.</p>
         */
        public Builder keyPairs(java.util.List < KeyPairs> keyPairs) {
            this.keyPairs = keyPairs;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListKeyPairsResponseBody build() {
            return new ListKeyPairsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKeyPairsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKeyPairsResponseBody</p>
     */
    public static class KeyPairs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List < String > instanceIds;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("PublicKey")
        private String publicKey;

        private KeyPairs(Builder builder) {
            this.creationTime = builder.creationTime;
            this.instanceIds = builder.instanceIds;
            this.keyPairName = builder.keyPairName;
            this.publicKey = builder.publicKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyPairs create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return instanceIds
         */
        public java.util.List < String > getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return publicKey
         */
        public String getPublicKey() {
            return this.publicKey;
        }

        public static final class Builder {
            private String creationTime; 
            private java.util.List < String > instanceIds; 
            private String keyPairName; 
            private String publicKey; 

            /**
             * <p>The time when the AccessKey pair was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-06T02:28Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The IDs of simple application servers. A maximum of 50 IDs of simple application servers can be returned.</p>
             */
            public Builder instanceIds(java.util.List < String > instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The name of the AccessKey pair. The name must be 2 to 64 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>testKeyPairName</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * <p>The content of the public key.</p>
             * 
             * <strong>example:</strong>
             * <p>ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCbO5Govwhb0iHzoMYKkIQxjlHyHH8nxFsW6KF5saxgYhOwdeIpWngpi+/NDWQKvuOnXFFDh/o3eJJkh3rqP+RlMggt4HLQWOd9TS0f4/cgbAzud1caW9PnankCr****</p>
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            public KeyPairs build() {
                return new KeyPairs(this);
            } 

        } 

    }
}
