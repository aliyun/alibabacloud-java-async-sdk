// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeTopBigKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTopBigKeysResponseBody</p>
 */
public class DescribeTopBigKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeTopBigKeysResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTopBigKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information about the large keys.</p>
         * <blockquote>
         * <p>This parameter is left empty If no large keys exist within the specified time range.</p>
         * </blockquote>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeTopBigKeysResponseBody build() {
            return new DescribeTopBigKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTopBigKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTopBigKeysResponseBody</p>
     */
    public static class BigKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Db")
        private Integer db;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private BigKey(Builder builder) {
            this.db = builder.db;
            this.key = builder.key;
            this.keyType = builder.keyType;
            this.nodeId = builder.nodeId;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BigKey create() {
            return builder().build();
        }

        /**
         * @return db
         */
        public Integer getDb() {
            return this.db;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return keyType
         */
        public String getKeyType() {
            return this.keyType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer db; 
            private String key; 
            private String keyType; 
            private String nodeId; 
            private Long size; 

            /**
             * <p>The database in which the key is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder db(Integer db) {
                this.db = db;
                return this;
            }

            /**
             * <p>The key.</p>
             * 
             * <strong>example:</strong>
             * <p>abc:def:eng</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The type of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>zset</p>
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * <p>The ID of the data shard on the ApsaraDB for Redis instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-x****-db-0</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The number of elements in the key.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public BigKey build() {
                return new BigKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTopBigKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTopBigKeysResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BigKey")
        private java.util.List<BigKey> bigKey;

        private Data(Builder builder) {
            this.bigKey = builder.bigKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bigKey
         */
        public java.util.List<BigKey> getBigKey() {
            return this.bigKey;
        }

        public static final class Builder {
            private java.util.List<BigKey> bigKey; 

            /**
             * BigKey.
             */
            public Builder bigKey(java.util.List<BigKey> bigKey) {
                this.bigKey = bigKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
