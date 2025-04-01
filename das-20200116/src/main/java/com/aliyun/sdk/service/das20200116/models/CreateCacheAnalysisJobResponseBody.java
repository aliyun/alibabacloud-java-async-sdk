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
 * {@link CreateCacheAnalysisJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCacheAnalysisJobResponseBody</p>
 */
public class CreateCacheAnalysisJobResponseBody extends TeaModel {
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

    private CreateCacheAnalysisJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCacheAnalysisJobResponseBody create() {
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

        private Builder(CreateCacheAnalysisJobResponseBody model) {
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
         * <p>The detailed information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
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

        public CreateCacheAnalysisJobResponseBody build() {
            return new CreateCacheAnalysisJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCacheAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCacheAnalysisJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(KeyInfo model) {
                this.bytes = model.bytes;
                this.count = model.count;
                this.db = model.db;
                this.encoding = model.encoding;
                this.expirationTimeMillis = model.expirationTimeMillis;
                this.key = model.key;
                this.nodeId = model.nodeId;
                this.type = model.type;
            } 

            /**
             * <p>The number of bytes that are occupied by the key.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder bytes(Long bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * <p>The number of elements in the key.</p>
             * 
             * <strong>example:</strong>
             * <p>127</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder db(Integer db) {
                this.db = db;
                return this;
            }

            /**
             * <p>The data type of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>hashtable</p>
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * <p>The expiration period of the key. Unit: milliseconds. A value of 0 indicates that the key does not expire.</p>
             * 
             * <strong>example:</strong>
             * <p>1596256542547</p>
             */
            public Builder expirationTimeMillis(Long expirationTimeMillis) {
                this.expirationTimeMillis = expirationTimeMillis;
                return this;
            }

            /**
             * <p>The name of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>task_x****</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The ID of the data node on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-x****-db-0</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The data type of the ApsaraDB for Redis instance.</p>
             * 
             * <strong>example:</strong>
             * <p>hash</p>
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
    /**
     * 
     * {@link CreateCacheAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCacheAnalysisJobResponseBody</p>
     */
    public static class BigKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyInfo")
        private java.util.List<KeyInfo> keyInfo;

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
        public java.util.List<KeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

        public static final class Builder {
            private java.util.List<KeyInfo> keyInfo; 

            private Builder() {
            } 

            private Builder(BigKeys model) {
                this.keyInfo = model.keyInfo;
            } 

            /**
             * KeyInfo.
             */
            public Builder keyInfo(java.util.List<KeyInfo> keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            public BigKeys build() {
                return new BigKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCacheAnalysisJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCacheAnalysisJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BigKeys")
        private BigKeys bigKeys;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("TaskState")
        private String taskState;

        private Data(Builder builder) {
            this.bigKeys = builder.bigKeys;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
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
            private String message; 
            private String nodeId; 
            private String taskState; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bigKeys = model.bigKeys;
                this.instanceId = model.instanceId;
                this.jobId = model.jobId;
                this.message = model.message;
                this.nodeId = model.nodeId;
                this.taskState = model.taskState;
            } 

            /**
             * <p>The number of elements in the key.</p>
             */
            public Builder bigKeys(BigKeys bigKeys) {
                this.bigKeys = bigKeys;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp18ff4a195d****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the cache analysis task.</p>
             * <blockquote>
             * <p> This parameter can be used to query a specific cache analysis task. When you call the CreateCacheAnalysisJob operation, it takes some time to create a cache analysis task. As a result, the analysis results cannot be immediately returned. You can call the <a href="https://help.aliyun.com/document_detail/180983.html">DescribeCacheAnalysisJob</a> operation to query the analysis results of the specified cache analysis task.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sf79-sd99-sa37-****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * <blockquote>
             * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
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
             * <p>The ID of the data node on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-x****-db-0</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The state of the cache analysis task. Valid values:</p>
             * <ul>
             * <li><strong>BACKUP</strong>: The data is being backed up.</li>
             * <li><strong>ANALYZING</strong>: The data is being analyzed.</li>
             * <li><strong>FINISHED</strong>: The data is analyzed.</li>
             * <li><strong>FAILED</strong>: An error occurred.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BACKUP</p>
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
