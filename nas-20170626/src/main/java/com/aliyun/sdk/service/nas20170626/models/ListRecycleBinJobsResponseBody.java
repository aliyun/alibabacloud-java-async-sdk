// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecycleBinJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecycleBinJobsResponseBody</p>
 */
public class ListRecycleBinJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Jobs")
    private java.util.List < Jobs> jobs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRecycleBinJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecycleBinJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobs
     */
    public java.util.List < Jobs> getJobs() {
        return this.jobs;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Jobs> jobs; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The information about the jobs of the recycle bin.
         */
        public Builder jobs(java.util.List < Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of jobs returned per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * The total number of jobs.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRecycleBinJobsResponseBody build() {
            return new ListRecycleBinJobsResponseBody(this);
        } 

    } 

    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Jobs(Builder builder) {
            this.createTime = builder.createTime;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.progress = builder.progress;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String errorCode; 
            private String errorMessage; 
            private String fileId; 
            private String fileName; 
            private String id; 
            private String progress; 
            private String status; 
            private String type; 

            /**
             * The time when the job was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The error code returned.
             * <p>
             * 
             * A valid value is returned only if you set the Status parameter to Fail or PartialSuccess.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message.
             * <p>
             * 
             * A valid value is returned only if you set the Status parameter to Fail or PartialSuccess.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The ID of the file or directory in the job.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * The name of the file or directory that is associated with the job.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The job ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The progress of the job.
             * <p>
             * 
             * Valid values: 1 to 100.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The status of the job. Valid values:
             * <p>
             * 
             * *   Running: The job is running.
             * *   Defragmenting: The job is defragmenting data.
             * *   PartialSuccess: The job is partially completed.
             * *   Success: The job is completed.
             * *   Fail: The job failed.
             * *   Cancelled: The job is canceled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the job. Valid values:
             * <p>
             * 
             * *   Restore: a file restoration job
             * *   Delete: a file deletion job
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
