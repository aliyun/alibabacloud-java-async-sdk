// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLifecycleRetrieveJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLifecycleRetrieveJobsResponseBody</p>
 */
public class ListLifecycleRetrieveJobsResponseBody extends TeaModel {
    @NameInMap("LifecycleRetrieveJobs")
    private java.util.List < LifecycleRetrieveJobs> lifecycleRetrieveJobs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < LifecycleRetrieveJobs> getLifecycleRetrieveJobs() {
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
        private java.util.List < LifecycleRetrieveJobs> lifecycleRetrieveJobs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details about the data retrieval tasks.
         */
        public Builder lifecycleRetrieveJobs(java.util.List < LifecycleRetrieveJobs> lifecycleRetrieveJobs) {
            this.lifecycleRetrieveJobs = lifecycleRetrieveJobs;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of data retrieval tasks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLifecycleRetrieveJobsResponseBody build() {
            return new ListLifecycleRetrieveJobsResponseBody(this);
        } 

    } 

    public static class LifecycleRetrieveJobs extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DiscoveredFileCount")
        private Long discoveredFileCount;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Paths")
        private java.util.List < String > paths;

        @NameInMap("RetrievedFileCount")
        private Long retrievedFileCount;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        private LifecycleRetrieveJobs(Builder builder) {
            this.createTime = builder.createTime;
            this.discoveredFileCount = builder.discoveredFileCount;
            this.fileSystemId = builder.fileSystemId;
            this.jobId = builder.jobId;
            this.paths = builder.paths;
            this.retrievedFileCount = builder.retrievedFileCount;
            this.status = builder.status;
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
        public java.util.List < String > getPaths() {
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
            private java.util.List < String > paths; 
            private Long retrievedFileCount; 
            private String status; 
            private String updateTime; 

            /**
             * The time when the task was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The total number of files that are read in the data retrieval task.
             */
            public Builder discoveredFileCount(Long discoveredFileCount) {
                this.discoveredFileCount = discoveredFileCount;
                return this;
            }

            /**
             * The ID of the file system.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * The ID of the data retrieval task.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Paths.
             */
            public Builder paths(java.util.List < String > paths) {
                this.paths = paths;
                return this;
            }

            /**
             * The total number of files that are retrieved.
             */
            public Builder retrievedFileCount(Long retrievedFileCount) {
                this.retrievedFileCount = retrievedFileCount;
                return this;
            }

            /**
             * The status of the data retrieval task. Valid values:
             * <p>
             * 
             * *   active: The task is running.
             * *   canceled: The task is canceled.
             * *   completed: The task is completed.
             * *   failed: The task has failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the task was updated.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.
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
