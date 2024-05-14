// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTopHotKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTopHotKeysResponseBody</p>
 */
public class DescribeTopHotKeysResponseBody extends TeaModel {
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

    private DescribeTopHotKeysResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTopHotKeysResponseBody create() {
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
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The detailed information about the hot keys.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeTopHotKeysResponseBody build() {
            return new DescribeTopHotKeysResponseBody(this);
        } 

    } 

    public static class HotKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Db")
        private Integer db;

        @com.aliyun.core.annotation.NameInMap("Hot")
        private String hot;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        @com.aliyun.core.annotation.NameInMap("Lfu")
        private Integer lfu;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private HotKey(Builder builder) {
            this.db = builder.db;
            this.hot = builder.hot;
            this.key = builder.key;
            this.keyType = builder.keyType;
            this.lfu = builder.lfu;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotKey create() {
            return builder().build();
        }

        /**
         * @return db
         */
        public Integer getDb() {
            return this.db;
        }

        /**
         * @return hot
         */
        public String getHot() {
            return this.hot;
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
         * @return lfu
         */
        public Integer getLfu() {
            return this.lfu;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private Integer db; 
            private String hot; 
            private String key; 
            private String keyType; 
            private Integer lfu; 
            private String nodeId; 

            /**
             * The database in which the key is stored.
             */
            public Builder db(Integer db) {
                this.db = db;
                return this;
            }

            /**
             * The frequency at which the key is accessed, which indicates the QPS of the key.
             */
            public Builder hot(String hot) {
                this.hot = hot;
                return this;
            }

            /**
             * The key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The type of the key.
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * The statistical value that is calculated based on the least frequently used (LFU) caching algorithm.
             */
            public Builder lfu(Integer lfu) {
                this.lfu = lfu;
                return this;
            }

            /**
             * The ID of the data shard on the ApsaraDB for Redis instance.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public HotKey build() {
                return new HotKey(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HotKey")
        private java.util.List < HotKey> hotKey;

        private Data(Builder builder) {
            this.hotKey = builder.hotKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hotKey
         */
        public java.util.List < HotKey> getHotKey() {
            return this.hotKey;
        }

        public static final class Builder {
            private java.util.List < HotKey> hotKey; 

            /**
             * HotKey.
             */
            public Builder hotKey(java.util.List < HotKey> hotKey) {
                this.hotKey = hotKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
