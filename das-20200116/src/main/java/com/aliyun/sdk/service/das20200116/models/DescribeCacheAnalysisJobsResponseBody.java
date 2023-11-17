// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCacheAnalysisJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCacheAnalysisJobsResponseBody</p>
 */
public class DescribeCacheAnalysisJobsResponseBody extends TeaModel {
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

    private DescribeCacheAnalysisJobsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCacheAnalysisJobsResponseBody create() {
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
         * The list of cache analysis tasks.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
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

        public DescribeCacheAnalysisJobsResponseBody build() {
            return new DescribeCacheAnalysisJobsResponseBody(this);
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
    public static class CacheAnalysisJob extends TeaModel {
        @NameInMap("BigKeys")
        private BigKeys bigKeys;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Message")
        private String message;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("TaskState")
        private String taskState;

        private CacheAnalysisJob(Builder builder) {
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

        public static CacheAnalysisJob create() {
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

            /**
             * The details about the large keys.
             * <p>
             * 
             * > The sub-parameters of this parameter and the content of the sub-parameters are not returned. To query the detailed information about the cache analysis tasks, call the [DescribeCacheAnalysisJob](~~443012~~) operation.
             */
            public Builder bigKeys(BigKeys bigKeys) {
                this.bigKeys = bigKeys;
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
             * The returned message.
             * <p>
             * 
             * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
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
             * * **BACKUP**: The data is being backed up.
             * * **ANALYZING**: The data is being analyzed.
             * * **FINISHED**: The data is analyzed.
             * * **FAILED**: An error occurred.
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            public CacheAnalysisJob build() {
                return new CacheAnalysisJob(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("CacheAnalysisJob")
        private java.util.List < CacheAnalysisJob> cacheAnalysisJob;

        private List(Builder builder) {
            this.cacheAnalysisJob = builder.cacheAnalysisJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return cacheAnalysisJob
         */
        public java.util.List < CacheAnalysisJob> getCacheAnalysisJob() {
            return this.cacheAnalysisJob;
        }

        public static final class Builder {
            private java.util.List < CacheAnalysisJob> cacheAnalysisJob; 

            /**
             * CacheAnalysisJob.
             */
            public Builder cacheAnalysisJob(java.util.List < CacheAnalysisJob> cacheAnalysisJob) {
                this.cacheAnalysisJob = cacheAnalysisJob;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Extra")
        private String extra;

        @NameInMap("List")
        private List list;

        @NameInMap("PageNo")
        private Long pageNo;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.extra = builder.extra;
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String extra; 
            private List list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            /**
             * The reserved parameter.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * The ID of the data node on the instance.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * The page number. The value must be an integer that is greater than 0. Default value: 1.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * The number of entries per page. Default value: 10.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
