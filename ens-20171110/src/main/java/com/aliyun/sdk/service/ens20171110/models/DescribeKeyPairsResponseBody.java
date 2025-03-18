// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeKeyPairsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKeyPairsResponseBody</p>
 */
public class DescribeKeyPairsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyPairs")
    private KeyPairs keyPairs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeKeyPairsResponseBody(Builder builder) {
        this.keyPairs = builder.keyPairs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeyPairsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyPairs
     */
    public KeyPairs getKeyPairs() {
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
        private KeyPairs keyPairs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeKeyPairsResponseBody model) {
            this.keyPairs = model.keyPairs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details about the key pairs.</p>
         */
        public Builder keyPairs(KeyPairs keyPairs) {
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
         * <p>The number of entries returned per page.</p>
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
         * <p>37B52F33-6879-49D0-A39B-22966B01449E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of key pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeKeyPairsResponseBody build() {
            return new DescribeKeyPairsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKeyPairsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKeyPairsResponseBody</p>
     */
    public static class KeyPair extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("KeyPairFingerPrint")
        private String keyPairFingerPrint;

        @com.aliyun.core.annotation.NameInMap("KeyPairId")
        private String keyPairId;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        private KeyPair(Builder builder) {
            this.creationTime = builder.creationTime;
            this.keyPairFingerPrint = builder.keyPairFingerPrint;
            this.keyPairId = builder.keyPairId;
            this.keyPairName = builder.keyPairName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyPair create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return keyPairFingerPrint
         */
        public String getKeyPairFingerPrint() {
            return this.keyPairFingerPrint;
        }

        /**
         * @return keyPairId
         */
        public String getKeyPairId() {
            return this.keyPairId;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public static final class Builder {
            private String creationTime; 
            private String keyPairFingerPrint; 
            private String keyPairId; 
            private String keyPairName; 

            private Builder() {
            } 

            private Builder(KeyPair model) {
                this.creationTime = model.creationTime;
                this.keyPairFingerPrint = model.keyPairFingerPrint;
                this.keyPairId = model.keyPairId;
                this.keyPairName = model.keyPairName;
            } 

            /**
             * <p>The time when the key pair was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-26T15:38:27Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The fingerprint of the key pair.</p>
             * 
             * <strong>example:</strong>
             * <p>fdaf8ff7a756ef843814fc****</p>
             */
            public Builder keyPairFingerPrint(String keyPairFingerPrint) {
                this.keyPairFingerPrint = keyPairFingerPrint;
                return this;
            }

            /**
             * <p>The ID of the key pair.</p>
             * 
             * <strong>example:</strong>
             * <p>ssh-50cynkq42sgj4ej1tn78t4***</p>
             */
            public Builder keyPairId(String keyPairId) {
                this.keyPairId = keyPairId;
                return this;
            }

            /**
             * <p>The name of the SSH key pair.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKeyPairName</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            public KeyPair build() {
                return new KeyPair(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKeyPairsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKeyPairsResponseBody</p>
     */
    public static class KeyPairs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyPair")
        private java.util.List<KeyPair> keyPair;

        private KeyPairs(Builder builder) {
            this.keyPair = builder.keyPair;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyPairs create() {
            return builder().build();
        }

        /**
         * @return keyPair
         */
        public java.util.List<KeyPair> getKeyPair() {
            return this.keyPair;
        }

        public static final class Builder {
            private java.util.List<KeyPair> keyPair; 

            private Builder() {
            } 

            private Builder(KeyPairs model) {
                this.keyPair = model.keyPair;
            } 

            /**
             * KeyPair.
             */
            public Builder keyPair(java.util.List<KeyPair> keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            public KeyPairs build() {
                return new KeyPairs(this);
            } 

        } 

    }
}
