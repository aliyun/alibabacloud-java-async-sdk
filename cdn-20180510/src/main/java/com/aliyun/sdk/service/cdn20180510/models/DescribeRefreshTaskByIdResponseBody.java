// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRefreshTaskByIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRefreshTaskByIdResponseBody</p>
 */
public class DescribeRefreshTaskByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tasks")
    private java.util.List < Tasks> tasks;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeRefreshTaskByIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRefreshTaskByIdResponseBody create() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Tasks> tasks; 
        private Long totalCount; 

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
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * The total number of tasks.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRefreshTaskByIdResponseBody build() {
            return new DescribeRefreshTaskByIdResponseBody(this);
        } 

    } 

    public static class Tasks extends TeaModel {
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

        private Tasks(Builder builder) {
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

        public static Tasks create() {
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
             * The error returned when the refresh or prefetch task failed. Valid values:
             * <p>
             * 
             * *   **Internal Error**
             * *   **Origin Timeout**
             * *   **Origin Return StatusCode 5XX**
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The path of the object refreshed by the refresh task.
             */
            public Builder objectPath(String objectPath) {
                this.objectPath = objectPath;
                return this;
            }

            /**
             * The type of the task. Valid values:
             * <p>
             * 
             * *   **file**: refreshes an individual file.
             * *   **directory**: refreshes files in the specified directory.
             * *   **preload**: prefetches an individual file.
             * *   **regex**: refreshes content based on a regular expression.
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
             * *   **Complete**
             * *   **Pending**
             * *   **Refreshing**
             * *   **Failed**
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

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
