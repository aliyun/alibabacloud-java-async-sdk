// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCacheAnalysisJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCacheAnalysisJobResponseBody</p>
 */
public class DescribeCacheAnalysisJobResponseBody extends TeaModel {
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

    private DescribeCacheAnalysisJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCacheAnalysisJobResponseBody create() {
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
         * The details of the task.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned for the request.
         * <p>
         * 
         * >  If the request is successful, **Successful** is returned. If the request fails, an error message that contains information such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
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

        public DescribeCacheAnalysisJobResponseBody build() {
            return new DescribeCacheAnalysisJobResponseBody(this);
        } 

    } 

    public static class KeyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bytes")
        private Long bytes;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Db")
        private Integer db;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("ExpirationTimeMillis")
        private Long expirationTimeMillis;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private KeyInfo(Builder builder) {
            this.bytes = builder.bytes;
            this.count = builder.count;
            this.db = builder.db;
            this.encoding = builder.encoding;
            this.expirationTimeMillis = builder.expirationTimeMillis;
            this.key = builder.key;
            this.nodeId = builder.nodeId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyInfo create() {
            return builder().build();
        }

        /**
         * @return bytes
         */
        public Long getBytes() {
            return this.bytes;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return db
         */
        public Integer getDb() {
            return this.db;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return expirationTimeMillis
         */
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bytes; 
            private Long count; 
            private Integer db; 
            private String encoding; 
            private Long expirationTimeMillis; 
            private String key; 
            private String nodeId; 
            private String type; 

            /**
             * The number of bytes that are occupied by the key.
             */
            public Builder bytes(Long bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * The number of elements in the key.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder db(Integer db) {
                this.db = db;
                return this;
            }

            /**
             * The data type of the key.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * The expiration period of the key. Unit: milliseconds. A value of 0 indicates that the key does not expire.
             */
            public Builder expirationTimeMillis(Long expirationTimeMillis) {
                this.expirationTimeMillis = expirationTimeMillis;
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
             * The ID of the data node on the instance.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The data type of the instance.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public KeyInfo build() {
                return new KeyInfo(this);
            } 

        } 

    }
    public static class BigKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyInfo")
        private java.util.List < KeyInfo> keyInfo;

        private BigKeys(Builder builder) {
            this.keyInfo = builder.keyInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BigKeys create() {
            return builder().build();
        }

        /**
         * @return keyInfo
         */
        public java.util.List < KeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

        public static final class Builder {
            private java.util.List < KeyInfo> keyInfo; 

            /**
             * KeyInfo.
             */
            public Builder keyInfo(java.util.List < KeyInfo> keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            public BigKeys build() {
                return new BigKeys(this);
            } 

        } 

    }
    public static class BigKeysOfNumKeyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bytes")
        private Long bytes;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Db")
        private Integer db;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("ExpirationTimeMillis")
        private Long expirationTimeMillis;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BigKeysOfNumKeyInfo(Builder builder) {
            this.bytes = builder.bytes;
            this.count = builder.count;
            this.db = builder.db;
            this.encoding = builder.encoding;
            this.expirationTimeMillis = builder.expirationTimeMillis;
            this.key = builder.key;
            this.nodeId = builder.nodeId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BigKeysOfNumKeyInfo create() {
            return builder().build();
        }

        /**
         * @return bytes
         */
        public Long getBytes() {
            return this.bytes;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return db
         */
        public Integer getDb() {
            return this.db;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return expirationTimeMillis
         */
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bytes; 
            private Long count; 
            private Integer db; 
            private String encoding; 
            private Long expirationTimeMillis; 
            private String key; 
            private String nodeId; 
            private String type; 

            /**
             * The number of bytes that are occupied by the key.
             */
            public Builder bytes(Long bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * The number of elements in the key.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder db(Integer db) {
                this.db = db;
                return this;
            }

            /**
             * The data type of the key.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * The expiration period of the key. Unit: milliseconds. A value of 0 indicates that the key does not expire.
             */
            public Builder expirationTimeMillis(Long expirationTimeMillis) {
                this.expirationTimeMillis = expirationTimeMillis;
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
             * The ID of the data node on the instance.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The data type of the instance.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BigKeysOfNumKeyInfo build() {
                return new BigKeysOfNumKeyInfo(this);
            } 

        } 

    }
    public static class BigKeysOfNum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyInfo")
        private java.util.List < BigKeysOfNumKeyInfo> keyInfo;

        private BigKeysOfNum(Builder builder) {
            this.keyInfo = builder.keyInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BigKeysOfNum create() {
            return builder().build();
        }

        /**
         * @return keyInfo
         */
        public java.util.List < BigKeysOfNumKeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

        public static final class Builder {
            private java.util.List < BigKeysOfNumKeyInfo> keyInfo; 

            /**
             * KeyInfo.
             */
            public Builder keyInfo(java.util.List < BigKeysOfNumKeyInfo> keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            public BigKeysOfNum build() {
                return new BigKeysOfNum(this);
            } 

        } 

    }
    public static class Prefix extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bytes")
        private Long bytes;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("KeyNum")
        private Long keyNum;

        @com.aliyun.core.annotation.NameInMap("Prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Prefix(Builder builder) {
            this.bytes = builder.bytes;
            this.count = builder.count;
            this.keyNum = builder.keyNum;
            this.prefix = builder.prefix;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Prefix create() {
            return builder().build();
        }

        /**
         * @return bytes
         */
        public Long getBytes() {
            return this.bytes;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return keyNum
         */
        public Long getKeyNum() {
            return this.keyNum;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bytes; 
            private Long count; 
            private Long keyNum; 
            private String prefix; 
            private String type; 

            /**
             * The number of bytes that are occupied by the key.
             */
            public Builder bytes(Long bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * The number of elements in the key.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The number of keys that contain the prefix.
             */
            public Builder keyNum(Long keyNum) {
                this.keyNum = keyNum;
                return this;
            }

            /**
             * The prefix of the key.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * The data type of the instance.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Prefix build() {
                return new Prefix(this);
            } 

        } 

    }
    public static class KeyPrefixes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Prefix")
        private java.util.List < Prefix> prefix;

        private KeyPrefixes(Builder builder) {
            this.prefix = builder.prefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyPrefixes create() {
            return builder().build();
        }

        /**
         * @return prefix
         */
        public java.util.List < Prefix> getPrefix() {
            return this.prefix;
        }

        public static final class Builder {
            private java.util.List < Prefix> prefix; 

            /**
             * The prefix of the key.
             */
            public Builder prefix(java.util.List < Prefix> prefix) {
                this.prefix = prefix;
                return this;
            }

            public KeyPrefixes build() {
                return new KeyPrefixes(this);
            } 

        } 

    }
    public static class UnexBigKeysOfBytesKeyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bytes")
        private Long bytes;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Db")
        private Integer db;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("ExpirationTimeMillis")
        private Long expirationTimeMillis;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UnexBigKeysOfBytesKeyInfo(Builder builder) {
            this.bytes = builder.bytes;
            this.count = builder.count;
            this.db = builder.db;
            this.encoding = builder.encoding;
            this.expirationTimeMillis = builder.expirationTimeMillis;
            this.key = builder.key;
            this.nodeId = builder.nodeId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnexBigKeysOfBytesKeyInfo create() {
            return builder().build();
        }

        /**
         * @return bytes
         */
        public Long getBytes() {
            return this.bytes;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return db
         */
        public Integer getDb() {
            return this.db;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return expirationTimeMillis
         */
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bytes; 
            private Long count; 
            private Integer db; 
            private String encoding; 
            private Long expirationTimeMillis; 
            private String key; 
            private String nodeId; 
            private String type; 

            /**
             * The number of bytes that are occupied by the key.
             */
            public Builder bytes(Long bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * The number of elements in the key.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder db(Integer db) {
                this.db = db;
                return this;
            }

            /**
             * The data type of the key.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * The expiration period of the key. Unit: milliseconds. A value of 0 indicates that the key does not expire.
             */
            public Builder expirationTimeMillis(Long expirationTimeMillis) {
                this.expirationTimeMillis = expirationTimeMillis;
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
             * The ID of the data node on the instance.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The data type of the instance.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UnexBigKeysOfBytesKeyInfo build() {
                return new UnexBigKeysOfBytesKeyInfo(this);
            } 

        } 

    }
    public static class UnexBigKeysOfBytes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyInfo")
        private java.util.List < UnexBigKeysOfBytesKeyInfo> keyInfo;

        private UnexBigKeysOfBytes(Builder builder) {
            this.keyInfo = builder.keyInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnexBigKeysOfBytes create() {
            return builder().build();
        }

        /**
         * @return keyInfo
         */
        public java.util.List < UnexBigKeysOfBytesKeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

        public static final class Builder {
            private java.util.List < UnexBigKeysOfBytesKeyInfo> keyInfo; 

            /**
             * KeyInfo.
             */
            public Builder keyInfo(java.util.List < UnexBigKeysOfBytesKeyInfo> keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            public UnexBigKeysOfBytes build() {
                return new UnexBigKeysOfBytes(this);
            } 

        } 

    }
    public static class UnexBigKeysOfNumKeyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bytes")
        private Long bytes;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Db")
        private Integer db;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("ExpirationTimeMillis")
        private Long expirationTimeMillis;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UnexBigKeysOfNumKeyInfo(Builder builder) {
            this.bytes = builder.bytes;
            this.count = builder.count;
            this.db = builder.db;
            this.encoding = builder.encoding;
            this.expirationTimeMillis = builder.expirationTimeMillis;
            this.key = builder.key;
            this.nodeId = builder.nodeId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnexBigKeysOfNumKeyInfo create() {
            return builder().build();
        }

        /**
         * @return bytes
         */
        public Long getBytes() {
            return this.bytes;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return db
         */
        public Integer getDb() {
            return this.db;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return expirationTimeMillis
         */
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bytes; 
            private Long count; 
            private Integer db; 
            private String encoding; 
            private Long expirationTimeMillis; 
            private String key; 
            private String nodeId; 
            private String type; 

            /**
             * The number of bytes that are occupied by the key.
             */
            public Builder bytes(Long bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * The number of elements in the key.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder db(Integer db) {
                this.db = db;
                return this;
            }

            /**
             * The data type of the key.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * The expiration period of the key. Unit: milliseconds. A value of 0 indicates that the key does not expire.
             */
            public Builder expirationTimeMillis(Long expirationTimeMillis) {
                this.expirationTimeMillis = expirationTimeMillis;
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
             * The ID of the data node on the instance.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The data type of the instance.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UnexBigKeysOfNumKeyInfo build() {
                return new UnexBigKeysOfNumKeyInfo(this);
            } 

        } 

    }
    public static class UnexBigKeysOfNum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyInfo")
        private java.util.List < UnexBigKeysOfNumKeyInfo> keyInfo;

        private UnexBigKeysOfNum(Builder builder) {
            this.keyInfo = builder.keyInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnexBigKeysOfNum create() {
            return builder().build();
        }

        /**
         * @return keyInfo
         */
        public java.util.List < UnexBigKeysOfNumKeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

        public static final class Builder {
            private java.util.List < UnexBigKeysOfNumKeyInfo> keyInfo; 

            /**
             * KeyInfo.
             */
            public Builder keyInfo(java.util.List < UnexBigKeysOfNumKeyInfo> keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            public UnexBigKeysOfNum build() {
                return new UnexBigKeysOfNum(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BigKeys")
        private BigKeys bigKeys;

        @com.aliyun.core.annotation.NameInMap("BigKeysOfNum")
        private BigKeysOfNum bigKeysOfNum;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("KeyPrefixes")
        private KeyPrefixes keyPrefixes;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("TaskState")
        private String taskState;

        @com.aliyun.core.annotation.NameInMap("UnexBigKeysOfBytes")
        private UnexBigKeysOfBytes unexBigKeysOfBytes;

        @com.aliyun.core.annotation.NameInMap("UnexBigKeysOfNum")
        private UnexBigKeysOfNum unexBigKeysOfNum;

        private Data(Builder builder) {
            this.bigKeys = builder.bigKeys;
            this.bigKeysOfNum = builder.bigKeysOfNum;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
            this.keyPrefixes = builder.keyPrefixes;
            this.message = builder.message;
            this.nodeId = builder.nodeId;
            this.taskState = builder.taskState;
            this.unexBigKeysOfBytes = builder.unexBigKeysOfBytes;
            this.unexBigKeysOfNum = builder.unexBigKeysOfNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bigKeys
         */
        public BigKeys getBigKeys() {
            return this.bigKeys;
        }

        /**
         * @return bigKeysOfNum
         */
        public BigKeysOfNum getBigKeysOfNum() {
            return this.bigKeysOfNum;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return keyPrefixes
         */
        public KeyPrefixes getKeyPrefixes() {
            return this.keyPrefixes;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return taskState
         */
        public String getTaskState() {
            return this.taskState;
        }

        /**
         * @return unexBigKeysOfBytes
         */
        public UnexBigKeysOfBytes getUnexBigKeysOfBytes() {
            return this.unexBigKeysOfBytes;
        }

        /**
         * @return unexBigKeysOfNum
         */
        public UnexBigKeysOfNum getUnexBigKeysOfNum() {
            return this.unexBigKeysOfNum;
        }

        public static final class Builder {
            private BigKeys bigKeys; 
            private BigKeysOfNum bigKeysOfNum; 
            private String instanceId; 
            private String jobId; 
            private KeyPrefixes keyPrefixes; 
            private String message; 
            private String nodeId; 
            private String taskState; 
            private UnexBigKeysOfBytes unexBigKeysOfBytes; 
            private UnexBigKeysOfNum unexBigKeysOfNum; 

            /**
             * The details of the large keys. The returned large keys are sorted in descending order based on the number of bytes occupied by the keys.
             */
            public Builder bigKeys(BigKeys bigKeys) {
                this.bigKeys = bigKeys;
                return this;
            }

            /**
             * The details of the large keys. The returned large keys are sorted in descending order based on the number of keys.
             */
            public Builder bigKeysOfNum(BigKeysOfNum bigKeysOfNum) {
                this.bigKeysOfNum = bigKeysOfNum;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the cache analysis task.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The prefixes of the keys.
             */
            public Builder keyPrefixes(KeyPrefixes keyPrefixes) {
                this.keyPrefixes = keyPrefixes;
                return this;
            }

            /**
             * The message that is returned for the request.
             * <p>
             * 
             * >  If the request is successful, **Successful** is returned. If the request fails, an error message that contains information such as an error code is returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the data node on the instance.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The state of the cache analysis task. Valid values:
             * <p>
             * 
             * *   **BACKUP**: The data is being backed up.
             * *   **ANALYZING**: The data is being analyzed.
             * *   **FINISHED**: The data is analyzed.
             * *   **FAILED**: An error occurred.
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * The details of permanent keys. The returned keys are sorted in descending order based on the number of bytes occupied by the keys.
             */
            public Builder unexBigKeysOfBytes(UnexBigKeysOfBytes unexBigKeysOfBytes) {
                this.unexBigKeysOfBytes = unexBigKeysOfBytes;
                return this;
            }

            /**
             * The details of permanent keys. The returned keys are sorted in descending order based on the number of keys.
             */
            public Builder unexBigKeysOfNum(UnexBigKeysOfNum unexBigKeysOfNum) {
                this.unexBigKeysOfNum = unexBigKeysOfNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
