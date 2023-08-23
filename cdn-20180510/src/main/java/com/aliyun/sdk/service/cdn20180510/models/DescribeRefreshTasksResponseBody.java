// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRefreshTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRefreshTasksResponseBody</p>
 */
public class DescribeRefreshTasksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tasks")
    private Tasks tasks;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeRefreshTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRefreshTasksResponseBody create() {
        return builder().build();
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
     * @return tasks
     */
    public Tasks getTasks() {
        return this.tasks;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Tasks tasks; 
        private Long totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Long pageSize) {
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
         * Details about tasks.
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRefreshTasksResponseBody build() {
            return new DescribeRefreshTasksResponseBody(this);
        } 

    } 

    public static class CDNTask extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ObjectPath")
        private String objectPath;

        @NameInMap("ObjectType")
        private String objectType;

        @NameInMap("Process")
        private String process;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        private CDNTask(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.objectPath = builder.objectPath;
            this.objectType = builder.objectType;
            this.process = builder.process;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CDNTask create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return objectPath
         */
        public String getObjectPath() {
            return this.objectPath;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
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

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String objectPath; 
            private String objectType; 
            private String process; 
            private String status; 
            private String taskId; 

            /**
             * The time when the task was created. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The type of the error returned when the refresh or prefetch task failed. Valid values:
             * <p>
             * 
             * *   **InternalError**: An internal error occurred.
             * *   **OriginTimeout**: The response from the origin server timed out.
             * *   **OriginReturnStatusCode 5XX**: The origin server returned a 5XX error.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The URL of the object refreshed.
             */
            public Builder objectPath(String objectPath) {
                this.objectPath = objectPath;
                return this;
            }

            /**
             * The type of the task.
             * <p>
             * 
             * *   **file**: refreshes one or more files.
             * *   **directory**: refreshes files in the specified directories.
             * *   **regex**: refreshes content based on a regular expression.
             * *   **preload**: prefetches one or more files.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * The progress of the task, in percentage.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **Complete**: The task has completed.
             * *   **Refreshing**: The task is in progress.
             * *   **Failed**: The task failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public CDNTask build() {
                return new CDNTask(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("CDNTask")
        private java.util.List < CDNTask> CDNTask;

        private Tasks(Builder builder) {
            this.CDNTask = builder.CDNTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return CDNTask
         */
        public java.util.List < CDNTask> getCDNTask() {
            return this.CDNTask;
        }

        public static final class Builder {
            private java.util.List < CDNTask> CDNTask; 

            /**
             * CDNTask.
             */
            public Builder CDNTask(java.util.List < CDNTask> CDNTask) {
                this.CDNTask = CDNTask;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
