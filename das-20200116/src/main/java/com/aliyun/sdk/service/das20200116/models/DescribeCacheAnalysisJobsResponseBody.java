// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCacheAnalysisJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCacheAnalysisJobsResponseBody</p>
 */
public class DescribeCacheAnalysisJobsResponseBody extends TeaModel {
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
         * <p>The list of cache analysis tasks.</p>
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

        public DescribeCacheAnalysisJobsResponseBody build() {
            return new DescribeCacheAnalysisJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCacheAnalysisJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCacheAnalysisJobsResponseBody</p>
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
             * <p>task_*****</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The ID of the data node on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-****-db-0</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The data type of the instance.</p>
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
     * {@link DescribeCacheAnalysisJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCacheAnalysisJobsResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeCacheAnalysisJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCacheAnalysisJobsResponseBody</p>
     */
    public static class CacheAnalysisJob extends TeaModel {
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
             * <p>The details about the large keys.</p>
             * <blockquote>
             * <p>The sub-parameters of this parameter and the content of the sub-parameters are not returned. To query the detailed information about the cache analysis tasks, call the <a href="https://help.aliyun.com/document_detail/443012.html">DescribeCacheAnalysisJob</a> operation.</p>
             * </blockquote>
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

            public CacheAnalysisJob build() {
                return new CacheAnalysisJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCacheAnalysisJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCacheAnalysisJobsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheAnalysisJob")
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
    /**
     * 
     * {@link DescribeCacheAnalysisJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCacheAnalysisJobsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
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
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The ID of the data node on the instance.</p>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number. The value must be an integer that is greater than 0. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
