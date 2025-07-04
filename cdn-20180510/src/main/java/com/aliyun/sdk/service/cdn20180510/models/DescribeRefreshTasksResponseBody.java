// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeRefreshTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRefreshTasksResponseBody</p>
 */
public class DescribeRefreshTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private Tasks tasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRefreshTasksResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>174F6032-AA26-470D-B90E-36F0EB205BEE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about tasks.</p>
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRefreshTasksResponseBody build() {
            return new DescribeRefreshTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRefreshTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRefreshTasksResponseBody</p>
     */
    public static class CDNTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ObjectPath")
        private String objectPath;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
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

            private Builder() {
            } 

            private Builder(CDNTask model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.objectPath = model.objectPath;
                this.objectType = model.objectType;
                this.process = model.process;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The time when the task was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-11-27T08:23:22Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The type of the error returned when the refresh or prefetch task failed. Valid values:</p>
             * <ul>
             * <li><strong>InternalError</strong>: An internal error occurred.</li>
             * <li><strong>OriginTimeout</strong>: The response from the origin server timed out.</li>
             * <li><strong>OriginReturnStatusCode 5XX</strong>: The origin server returned a 5XX error.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internal Error</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The URL of the object refreshed.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/1.txt">http://example.com/1.txt</a></p>
             */
            public Builder objectPath(String objectPath) {
                this.objectPath = objectPath;
                return this;
            }

            /**
             * <p>The type of the task.</p>
             * <ul>
             * <li><strong>file</strong>: refreshes one or more files.</li>
             * <li><strong>directory</strong>: refreshes files in the specified directories.</li>
             * <li><strong>regex</strong>: refreshes content based on a regular expression.</li>
             * <li><strong>preload</strong>: prefetches one or more files.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The progress of the task, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>Complete</strong>: The task has completed.</li>
             * <li><strong>Refreshing</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Complete</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>704225667</p>
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
    /**
     * 
     * {@link DescribeRefreshTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRefreshTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CDNTask")
        private java.util.List<CDNTask> CDNTask;

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
        public java.util.List<CDNTask> getCDNTask() {
            return this.CDNTask;
        }

        public static final class Builder {
            private java.util.List<CDNTask> CDNTask; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.CDNTask = model.CDNTask;
            } 

            /**
             * CDNTask.
             */
            public Builder CDNTask(java.util.List<CDNTask> CDNTask) {
                this.CDNTask = CDNTask;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
