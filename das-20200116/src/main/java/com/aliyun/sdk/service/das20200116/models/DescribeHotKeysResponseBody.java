// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHotKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHotKeysResponseBody</p>
 */
public class DescribeHotKeysResponseBody extends TeaModel {
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
         * The details of the hot keys.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.
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
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeHotKeysResponseBody build() {
            return new DescribeHotKeysResponseBody(this);
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

        @NameInMap("Size")
        private Long size;

        private HotKey(Builder builder) {
            this.db = builder.db;
            this.hot = builder.hot;
            this.key = builder.key;
            this.keyType = builder.keyType;
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
            private Long size; 

            /**
             * The database in which the key is stored.
             */
            public Builder db(Integer db) {
                this.db = db;
                return this;
            }

            /**
             * The frequency at which the key is accessed, which indicates the queries per second (QPS) of the key.
             */
            public Builder hot(String hot) {
                this.hot = hot;
                return this;
            }

            /**
             * The name of the key.
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
             * The number of elements in the key.
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
    public static class Data extends TeaModel {
        @NameInMap("HotKey")
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
