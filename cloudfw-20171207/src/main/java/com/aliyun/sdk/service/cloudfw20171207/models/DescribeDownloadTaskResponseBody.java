// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDownloadTaskResponseBody</p>
 */
public class DescribeDownloadTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tasks")
    private java.util.List < Tasks> tasks;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDownloadTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tasks
     */
    public java.util.List < Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Tasks> tasks; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDownloadTaskResponseBody build() {
            return new DescribeDownloadTaskResponseBody(this);
        } 

    } 

    public static class Tasks extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("FileSize")
        private String fileSize;

        @NameInMap("FileURL")
        private String fileURL;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskType")
        private String taskType;

        private Tasks(Builder builder) {
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.fileSize = builder.fileSize;
            this.fileURL = builder.fileURL;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileURL
         */
        public String getFileURL() {
            return this.fileURL;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Long createTime; 
            private Long expireTime; 
            private String fileSize; 
            private String fileURL; 
            private String status; 
            private String taskId; 
            private String taskName; 
            private String taskType; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * FileURL.
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
