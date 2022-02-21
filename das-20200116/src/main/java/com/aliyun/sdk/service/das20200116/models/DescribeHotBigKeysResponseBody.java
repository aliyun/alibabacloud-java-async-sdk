// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHotBigKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHotBigKeysResponseBody</p>
 */
public class DescribeHotBigKeysResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeHotBigKeysResponseBody build() {
            return new DescribeHotBigKeysResponseBody(this);
        } 

    } 

    public static class BigKey extends TeaModel {
        @NameInMap("Db")
        private Integer db;

        @NameInMap("Key")
        private String key;

        @NameInMap("KeyType")
        private String keyType;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("Size")
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
             * Db.
             */
            public Builder db(Integer db) {
                this.db = db;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * KeyType.
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Size.
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
    public static class BigKeys extends TeaModel {
        @NameInMap("BigKey")
        private java.util.List < BigKey> bigKey;

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
        public java.util.List < BigKey> getBigKey() {
            return this.bigKey;
        }

        public static final class Builder {
            private java.util.List < BigKey> bigKey; 

            /**
             * BigKey.
             */
            public Builder bigKey(java.util.List < BigKey> bigKey) {
                this.bigKey = bigKey;
                return this;
            }

            public BigKeys build() {
                return new BigKeys(this);
            } 

        } 

    }
    public static class HotKey extends TeaModel {
        @NameInMap("Db")
        private Integer db;

        @NameInMap("Hot")
        private String hot;

        @NameInMap("Key")
        private String key;

        @NameInMap("KeyType")
        private String keyType;

        @NameInMap("Lfu")
        private Integer lfu;

        @NameInMap("NodeId")
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
             * Db.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * KeyType.
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * Lfu.
             */
            public Builder lfu(Integer lfu) {
                this.lfu = lfu;
                return this;
            }

            /**
             * NodeId.
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
    public static class HotKeys extends TeaModel {
        @NameInMap("HotKey")
        private java.util.List < HotKey> hotKey;

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

            public HotKeys build() {
                return new HotKeys(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BigKeyMsg")
        private String bigKeyMsg;

        @NameInMap("BigKeys")
        private BigKeys bigKeys;

        @NameInMap("HotKeyMsg")
        private String hotKeyMsg;

        @NameInMap("HotKeys")
        private HotKeys hotKeys;

        private Data(Builder builder) {
            this.bigKeyMsg = builder.bigKeyMsg;
            this.bigKeys = builder.bigKeys;
            this.hotKeyMsg = builder.hotKeyMsg;
            this.hotKeys = builder.hotKeys;
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

        public static final class Builder {
            private String bigKeyMsg; 
            private BigKeys bigKeys; 
            private String hotKeyMsg; 
            private HotKeys hotKeys; 

            /**
             * BigKeyMsg.
             */
            public Builder bigKeyMsg(String bigKeyMsg) {
                this.bigKeyMsg = bigKeyMsg;
                return this;
            }

            /**
             * BigKeys.
             */
            public Builder bigKeys(BigKeys bigKeys) {
                this.bigKeys = bigKeys;
                return this;
            }

            /**
             * HotKeyMsg.
             */
            public Builder hotKeyMsg(String hotKeyMsg) {
                this.hotKeyMsg = hotKeyMsg;
                return this;
            }

            /**
             * HotKeys.
             */
            public Builder hotKeys(HotKeys hotKeys) {
                this.hotKeys = hotKeys;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
