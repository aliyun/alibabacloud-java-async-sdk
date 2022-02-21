// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCacheAnalysisJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCacheAnalysisJobResponseBody</p>
 */
public class DescribeCacheAnalysisJobResponseBody extends TeaModel {
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

        public DescribeCacheAnalysisJobResponseBody build() {
            return new DescribeCacheAnalysisJobResponseBody(this);
        } 

    } 

    public static class KeyInfo extends TeaModel {
        @NameInMap("Bytes")
        private Long bytes;

        @NameInMap("Count")
        private Long count;

        @NameInMap("Db")
        private Integer db;

        @NameInMap("Encoding")
        private String encoding;

        @NameInMap("ExpirationTimeMillis")
        private Long expirationTimeMillis;

        @NameInMap("Key")
        private String key;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("Type")
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
             * Bytes.
             */
            public Builder bytes(Long bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Db.
             */
            public Builder db(Integer db) {
                this.db = db;
                return this;
            }

            /**
             * Encoding.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * ExpirationTimeMillis.
             */
            public Builder expirationTimeMillis(Long expirationTimeMillis) {
                this.expirationTimeMillis = expirationTimeMillis;
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
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("KeyInfo")
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
    public static class Prefix extends TeaModel {
        @NameInMap("Bytes")
        private Long bytes;

        @NameInMap("Count")
        private Long count;

        @NameInMap("KeyNum")
        private Long keyNum;

        @NameInMap("Prefix")
        private String prefix;

        @NameInMap("Type")
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
             * Bytes.
             */
            public Builder bytes(Long bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * KeyNum.
             */
            public Builder keyNum(Long keyNum) {
                this.keyNum = keyNum;
                return this;
            }

            /**
             * Prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("Prefix")
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
             * Prefix.
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
    public static class Data extends TeaModel {
        @NameInMap("BigKeys")
        private BigKeys bigKeys;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("KeyPrefixes")
        private KeyPrefixes keyPrefixes;

        @NameInMap("Message")
        private String message;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("TaskState")
        private String taskState;

        private Data(Builder builder) {
            this.bigKeys = builder.bigKeys;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
            this.keyPrefixes = builder.keyPrefixes;
            this.message = builder.message;
            this.nodeId = builder.nodeId;
            this.taskState = builder.taskState;
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

        public static final class Builder {
            private BigKeys bigKeys; 
            private String instanceId; 
            private String jobId; 
            private KeyPrefixes keyPrefixes; 
            private String message; 
            private String nodeId; 
            private String taskState; 

            /**
             * BigKeys.
             */
            public Builder bigKeys(BigKeys bigKeys) {
                this.bigKeys = bigKeys;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * KeyPrefixes.
             */
            public Builder keyPrefixes(KeyPrefixes keyPrefixes) {
                this.keyPrefixes = keyPrefixes;
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
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * TaskState.
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
