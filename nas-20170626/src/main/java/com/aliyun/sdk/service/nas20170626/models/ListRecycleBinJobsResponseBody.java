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
 * {@link ListRecycleBinJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecycleBinJobsResponseBody</p>
 */
public class ListRecycleBinJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Jobs")
    private java.util.List<Jobs> jobs;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobs
     */
    public java.util.List<Jobs> getJobs() {
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
        private java.util.List<Jobs> jobs; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRecycleBinJobsResponseBody model) {
            this.jobs = model.jobs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The collection of task information in the recycle bin.</p>
         */
        public Builder jobs(java.util.List<Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of tasks per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E15E394-38A6-457A-A62A-D9797C9A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of tasks in the recycle bin.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRecycleBinJobsResponseBody build() {
            return new ListRecycleBinJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecycleBinJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecycleBinJobsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.createTime = model.createTime;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.id = model.id;
                this.progress = model.progress;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-30T10:08:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error code.</p>
             * <p>This value is valid only when Status is Fail or PartialSuccess.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidFileId.NotFound</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * <p>This value is valid only when JobStatus is Fail or PartialSuccess.</p>
             * 
             * <strong>example:</strong>
             * <p>The Target File or Directory does not exist.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The FileId of the file or directory associated with the task.</p>
             * 
             * <strong>example:</strong>
             * <p>04***08</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the file or directory associated with the task.</p>
             * 
             * <strong>example:</strong>
             * <p>test001</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8C****C54</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The execution progress of the task.</p>
             * <p>Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Running: The task is running.</li>
             * <li>Defragmenting: Data is being defragmented.</li>
             * <li>PartialSuccess: The task partially succeeded.</li>
             * <li>Success: The task succeeded.</li>
             * <li>Fail: The task failed.</li>
             * <li>Cancelled: The task is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Fail</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li>Restore: A file restoration task.</li>
             * <li>Delete: A file deletion task.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Restore</p>
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
