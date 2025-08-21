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
 * {@link DescribeHotKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHotKeysResponseBody</p>
 */
public class DescribeHotKeysResponseBody extends TeaModel {
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

    private DescribeHotKeysResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHotKeysResponseBody create() {
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

        private Builder(DescribeHotKeysResponseBody model) {
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
         * <p>The details of the hot keys.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
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
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeHotKeysResponseBody build() {
            return new DescribeHotKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHotKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotKeysResponseBody</p>
     */
    public static class HotKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Db")
        private Integer db;

        @com.aliyun.core.annotation.NameInMap("Hot")
        private String hot;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private HotKey(Builder builder) {
            this.category = builder.category;
            this.db = builder.db;
            this.hot = builder.hot;
            this.inBytes = builder.inBytes;
            this.key = builder.key;
            this.keyType = builder.keyType;
            this.nodeId = builder.nodeId;
            this.outBytes = builder.outBytes;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotKey create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
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
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Integer db; 
            private String hot; 
            private Long inBytes; 
            private String key; 
            private String keyType; 
            private String nodeId; 
            private Long outBytes; 
            private Long size; 

            private Builder() {
            } 

            private Builder(HotKey model) {
                this.category = model.category;
                this.db = model.db;
                this.hot = model.hot;
                this.inBytes = model.inBytes;
                this.key = model.key;
                this.keyType = model.keyType;
                this.nodeId = model.nodeId;
                this.outBytes = model.outBytes;
                this.size = model.size;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
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
             * InBytes.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>The name of the key.</p>
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
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * OutBytes.
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
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
     * {@link DescribeHotKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotKeysResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HotKey")
        private java.util.List<HotKey> hotKey;

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
        public java.util.List<HotKey> getHotKey() {
            return this.hotKey;
        }

        public static final class Builder {
            private java.util.List<HotKey> hotKey; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.hotKey = model.hotKey;
            } 

            /**
             * HotKey.
             */
            public Builder hotKey(java.util.List<HotKey> hotKey) {
                this.hotKey = hotKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
