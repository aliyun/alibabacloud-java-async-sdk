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
 * {@link DescribeHotBigKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHotBigKeysResponseBody</p>
 */
public class DescribeHotBigKeysResponseBody extends TeaModel {
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

    private DescribeHotBigKeysResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHotBigKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeHotBigKeysResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * <p>The list of hot keys and large keys.</p>
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

        public DescribeHotBigKeysResponseBody build() {
            return new DescribeHotBigKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHotBigKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotBigKeysResponseBody</p>
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

            private Builder() {
            } 

            private Builder(BigKey model) {
                this.db = model.db;
                this.key = model.key;
                this.keyType = model.keyType;
                this.nodeId = model.nodeId;
                this.size = model.size;
            } 

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
     * {@link DescribeHotBigKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotBigKeysResponseBody</p>
     */
    public static class BigKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BigKey")
        private java.util.List<BigKey> bigKey;

        private BigKeys(Builder builder) {
            this.bigKey = builder.bigKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BigKeys create() {
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

            private Builder() {
            } 

            private Builder(BigKeys model) {
                this.bigKey = model.bigKey;
            } 

            /**
             * BigKey.
             */
            public Builder bigKey(java.util.List<BigKey> bigKey) {
                this.bigKey = bigKey;
                return this;
            }

            public BigKeys build() {
                return new BigKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHotBigKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotBigKeysResponseBody</p>
     */
    public static class HighTrafficKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Db")
        private Integer db;

        @com.aliyun.core.annotation.NameInMap("Hot")
        private String hot;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("inBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("outBytes")
        private Long outBytes;

        private HighTrafficKey(Builder builder) {
            this.db = builder.db;
            this.hot = builder.hot;
            this.key = builder.key;
            this.keyType = builder.keyType;
            this.nodeId = builder.nodeId;
            this.size = builder.size;
            this.inBytes = builder.inBytes;
            this.outBytes = builder.outBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighTrafficKey create() {
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

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        public static final class Builder {
            private Integer db; 
            private String hot; 
            private String key; 
            private String keyType; 
            private String nodeId; 
            private Long size; 
            private Long inBytes; 
            private Long outBytes; 

            private Builder() {
            } 

            private Builder(HighTrafficKey model) {
                this.db = model.db;
                this.hot = model.hot;
                this.key = model.key;
                this.keyType = model.keyType;
                this.nodeId = model.nodeId;
                this.size = model.size;
                this.inBytes = model.inBytes;
                this.outBytes = model.outBytes;
            } 

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
             * Hot.
             */
            public Builder hot(String hot) {
                this.hot = hot;
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

            /**
             * inBytes.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * outBytes.
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            public HighTrafficKey build() {
                return new HighTrafficKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHotBigKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotBigKeysResponseBody</p>
     */
    public static class HighTrafficKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HighTrafficKey")
        private java.util.List<HighTrafficKey> highTrafficKey;

        private HighTrafficKeys(Builder builder) {
            this.highTrafficKey = builder.highTrafficKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighTrafficKeys create() {
            return builder().build();
        }

        /**
         * @return highTrafficKey
         */
        public java.util.List<HighTrafficKey> getHighTrafficKey() {
            return this.highTrafficKey;
        }

        public static final class Builder {
            private java.util.List<HighTrafficKey> highTrafficKey; 

            private Builder() {
            } 

            private Builder(HighTrafficKeys model) {
                this.highTrafficKey = model.highTrafficKey;
            } 

            /**
             * HighTrafficKey.
             */
            public Builder highTrafficKey(java.util.List<HighTrafficKey> highTrafficKey) {
                this.highTrafficKey = highTrafficKey;
                return this;
            }

            public HighTrafficKeys build() {
                return new HighTrafficKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHotBigKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotBigKeysResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private HotKey(Builder builder) {
            this.db = builder.db;
            this.hot = builder.hot;
            this.key = builder.key;
            this.keyType = builder.keyType;
            this.lfu = builder.lfu;
            this.nodeId = builder.nodeId;
            this.size = builder.size;
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

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer db; 
            private String hot; 
            private String key; 
            private String keyType; 
            private Integer lfu; 
            private String nodeId; 
            private Long size; 

            private Builder() {
            } 

            private Builder(HotKey model) {
                this.db = model.db;
                this.hot = model.hot;
                this.key = model.key;
                this.keyType = model.keyType;
                this.lfu = model.lfu;
                this.nodeId = model.nodeId;
                this.size = model.size;
            } 

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
             * <p>The frequency at which the key is accessed, which indicates the queries per second (QPS) of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>5500~6000</p>
             */
            public Builder hot(String hot) {
                this.hot = hot;
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
             * <p>The statistical value that is calculated based on the least frequently used (LFU) caching algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>253</p>
             */
            public Builder lfu(Integer lfu) {
                this.lfu = lfu;
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

            public HotKey build() {
                return new HotKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHotBigKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotBigKeysResponseBody</p>
     */
    public static class HotKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HotKey")
        private java.util.List<HotKey> hotKey;

        private HotKeys(Builder builder) {
            this.hotKey = builder.hotKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotKeys create() {
            return builder().build();
        }

        /**
         * @return hotKey
         */
        public java.util.List<HotKey> getHotKey() {
            return this.hotKey;
        }

        public static final class Builder {
            private java.util.List<HotKey> hotKey; 

            private Builder() {
            } 

            private Builder(HotKeys model) {
                this.hotKey = model.hotKey;
            } 

            /**
             * HotKey.
             */
            public Builder hotKey(java.util.List<HotKey> hotKey) {
                this.hotKey = hotKey;
                return this;
            }

            public HotKeys build() {
                return new HotKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHotBigKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotBigKeysResponseBody</p>
     */
    public static class LargeKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSize")
        private String dataSize;

        @com.aliyun.core.annotation.NameInMap("Db")
        private String db;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private LargeKey(Builder builder) {
            this.dataSize = builder.dataSize;
            this.db = builder.db;
            this.key = builder.key;
            this.keyType = builder.keyType;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LargeKey create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public String getDataSize() {
            return this.dataSize;
        }

        /**
         * @return db
         */
        public String getDb() {
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

        public static final class Builder {
            private String dataSize; 
            private String db; 
            private String key; 
            private String keyType; 
            private String nodeId; 

            private Builder() {
            } 

            private Builder(LargeKey model) {
                this.dataSize = model.dataSize;
                this.db = model.db;
                this.key = model.key;
                this.keyType = model.keyType;
                this.nodeId = model.nodeId;
            } 

            /**
             * DataSize.
             */
            public Builder dataSize(String dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * <p>The database in which the key is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder db(String db) {
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

            public LargeKey build() {
                return new LargeKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHotBigKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotBigKeysResponseBody</p>
     */
    public static class LargeKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LargeKey")
        private java.util.List<LargeKey> largeKey;

        private LargeKeys(Builder builder) {
            this.largeKey = builder.largeKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LargeKeys create() {
            return builder().build();
        }

        /**
         * @return largeKey
         */
        public java.util.List<LargeKey> getLargeKey() {
            return this.largeKey;
        }

        public static final class Builder {
            private java.util.List<LargeKey> largeKey; 

            private Builder() {
            } 

            private Builder(LargeKeys model) {
                this.largeKey = model.largeKey;
            } 

            /**
             * LargeKey.
             */
            public Builder largeKey(java.util.List<LargeKey> largeKey) {
                this.largeKey = largeKey;
                return this;
            }

            public LargeKeys build() {
                return new LargeKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHotBigKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotBigKeysResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BigKeyMsg")
        private String bigKeyMsg;

        @com.aliyun.core.annotation.NameInMap("BigKeys")
        private BigKeys bigKeys;

        @com.aliyun.core.annotation.NameInMap("HighTrafficKeyMsg")
        private String highTrafficKeyMsg;

        @com.aliyun.core.annotation.NameInMap("HighTrafficKeys")
        private HighTrafficKeys highTrafficKeys;

        @com.aliyun.core.annotation.NameInMap("HotKeyMsg")
        private String hotKeyMsg;

        @com.aliyun.core.annotation.NameInMap("HotKeys")
        private HotKeys hotKeys;

        @com.aliyun.core.annotation.NameInMap("LargeKeyMsg")
        private String largeKeyMsg;

        @com.aliyun.core.annotation.NameInMap("LargeKeys")
        private LargeKeys largeKeys;

        private Data(Builder builder) {
            this.bigKeyMsg = builder.bigKeyMsg;
            this.bigKeys = builder.bigKeys;
            this.highTrafficKeyMsg = builder.highTrafficKeyMsg;
            this.highTrafficKeys = builder.highTrafficKeys;
            this.hotKeyMsg = builder.hotKeyMsg;
            this.hotKeys = builder.hotKeys;
            this.largeKeyMsg = builder.largeKeyMsg;
            this.largeKeys = builder.largeKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bigKeyMsg
         */
        public String getBigKeyMsg() {
            return this.bigKeyMsg;
        }

        /**
         * @return bigKeys
         */
        public BigKeys getBigKeys() {
            return this.bigKeys;
        }

        /**
         * @return highTrafficKeyMsg
         */
        public String getHighTrafficKeyMsg() {
            return this.highTrafficKeyMsg;
        }

        /**
         * @return highTrafficKeys
         */
        public HighTrafficKeys getHighTrafficKeys() {
            return this.highTrafficKeys;
        }

        /**
         * @return hotKeyMsg
         */
        public String getHotKeyMsg() {
            return this.hotKeyMsg;
        }

        /**
         * @return hotKeys
         */
        public HotKeys getHotKeys() {
            return this.hotKeys;
        }

        /**
         * @return largeKeyMsg
         */
        public String getLargeKeyMsg() {
            return this.largeKeyMsg;
        }

        /**
         * @return largeKeys
         */
        public LargeKeys getLargeKeys() {
            return this.largeKeys;
        }

        public static final class Builder {
            private String bigKeyMsg; 
            private BigKeys bigKeys; 
            private String highTrafficKeyMsg; 
            private HighTrafficKeys highTrafficKeys; 
            private String hotKeyMsg; 
            private HotKeys hotKeys; 
            private String largeKeyMsg; 
            private LargeKeys largeKeys; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bigKeyMsg = model.bigKeyMsg;
                this.bigKeys = model.bigKeys;
                this.highTrafficKeyMsg = model.highTrafficKeyMsg;
                this.highTrafficKeys = model.highTrafficKeys;
                this.hotKeyMsg = model.hotKeyMsg;
                this.hotKeys = model.hotKeys;
                this.largeKeyMsg = model.largeKeyMsg;
                this.largeKeys = model.largeKeys;
            } 

            /**
             * <p>The reason why the large key failed to be queried.</p>
             * 
             * <strong>example:</strong>
             * <p>current version doesn&quot;t support</p>
             */
            public Builder bigKeyMsg(String bigKeyMsg) {
                this.bigKeyMsg = bigKeyMsg;
                return this;
            }

            /**
             * <p>The list of large keys.</p>
             */
            public Builder bigKeys(BigKeys bigKeys) {
                this.bigKeys = bigKeys;
                return this;
            }

            /**
             * HighTrafficKeyMsg.
             */
            public Builder highTrafficKeyMsg(String highTrafficKeyMsg) {
                this.highTrafficKeyMsg = highTrafficKeyMsg;
                return this;
            }

            /**
             * HighTrafficKeys.
             */
            public Builder highTrafficKeys(HighTrafficKeys highTrafficKeys) {
                this.highTrafficKeys = highTrafficKeys;
                return this;
            }

            /**
             * <p>The reason why the hot key failed to be queried.</p>
             * 
             * <strong>example:</strong>
             * <p>current version doesn&quot;t support</p>
             */
            public Builder hotKeyMsg(String hotKeyMsg) {
                this.hotKeyMsg = hotKeyMsg;
                return this;
            }

            /**
             * <p>The list of hot keys.</p>
             */
            public Builder hotKeys(HotKeys hotKeys) {
                this.hotKeys = hotKeys;
                return this;
            }

            /**
             * LargeKeyMsg.
             */
            public Builder largeKeyMsg(String largeKeyMsg) {
                this.largeKeyMsg = largeKeyMsg;
                return this;
            }

            /**
             * LargeKeys.
             */
            public Builder largeKeys(LargeKeys largeKeys) {
                this.largeKeys = largeKeys;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
