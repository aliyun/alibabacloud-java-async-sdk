// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link ListLifecycleRetrieveJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLifecycleRetrieveJobsResponseBody</p>
 */
public class ListLifecycleRetrieveJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LifecycleRetrieveJobs")
    private java.util.List<LifecycleRetrieveJobs> lifecycleRetrieveJobs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListLifecycleRetrieveJobsResponseBody(Builder builder) {
        this.lifecycleRetrieveJobs = builder.lifecycleRetrieveJobs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLifecycleRetrieveJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return lifecycleRetrieveJobs
     */
    public java.util.List<LifecycleRetrieveJobs> getLifecycleRetrieveJobs() {
        return this.lifecycleRetrieveJobs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<LifecycleRetrieveJobs> lifecycleRetrieveJobs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The details about the data retrieval tasks.</p>
         */
        public Builder lifecycleRetrieveJobs(java.util.List<LifecycleRetrieveJobs> lifecycleRetrieveJobs) {
            this.lifecycleRetrieveJobs = lifecycleRetrieveJobs;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of data retrieval tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLifecycleRetrieveJobsResponseBody build() {
            return new ListLifecycleRetrieveJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLifecycleRetrieveJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLifecycleRetrieveJobsResponseBody</p>
     */
    public static class LifecycleRetrieveJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DiscoveredFileCount")
        private Long discoveredFileCount;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("RetrievedFileCount")
        private Long retrievedFileCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private LifecycleRetrieveJobs(Builder builder) {
            this.createTime = builder.createTime;
            this.discoveredFileCount = builder.discoveredFileCount;
            this.fileSystemId = builder.fileSystemId;
            this.jobId = builder.jobId;
            this.paths = builder.paths;
            this.retrievedFileCount = builder.retrievedFileCount;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleRetrieveJobs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return discoveredFileCount
         */
        public Long getDiscoveredFileCount() {
            return this.discoveredFileCount;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return paths
         */
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        /**
         * @return retrievedFileCount
         */
        public Long getRetrievedFileCount() {
            return this.retrievedFileCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private Long discoveredFileCount; 
            private String fileSystemId; 
            private String jobId; 
            private java.util.List<String> paths; 
            private Long retrievedFileCount; 
            private String status; 
            private String storageType; 
            private String updateTime; 

            /**
             * <p>The time when the task was created.</p>
             * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-30T10:08:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The total number of files that are read in the data retrieval task.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder discoveredFileCount(Long discoveredFileCount) {
                this.discoveredFileCount = discoveredFileCount;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>31a8e4****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The ID of the data retrieval task.</p>
             * 
             * <strong>example:</strong>
             * <p>lrj-nfstest-ia-160****853-hshvw</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The execution path of the data retrieval task.</p>
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The total number of files that are retrieved.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder retrievedFileCount(Long retrievedFileCount) {
                this.retrievedFileCount = retrievedFileCount;
                return this;
            }

            /**
             * <p>The status of the data retrieval task. Valid values:</p>
             * <ul>
             * <li>active: The task is running.</li>
             * <li>canceled: The task is canceled.</li>
             * <li>completed: The task is completed.</li>
             * <li>failed: The task has failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage class.</p>
             * <ul>
             * <li>InfrequentAccess: the IA storage class.</li>
             * <li>Archive: the Archive storage class.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InfrequentAccess</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The time when the task was updated.</p>
             * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-30T11:08:08Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public LifecycleRetrieveJobs build() {
                return new LifecycleRetrieveJobs(this);
            } 

        } 

    }
}
