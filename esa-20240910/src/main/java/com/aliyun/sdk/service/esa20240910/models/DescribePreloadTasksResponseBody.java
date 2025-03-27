// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribePreloadTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePreloadTasksResponseBody</p>
 */
public class DescribePreloadTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePreloadTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePreloadTasksResponseBody create() {
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
    public java.util.List<Tasks> getTasks() {
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
        private java.util.List<Tasks> tasks; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribePreloadTasksResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tasks.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePreloadTasksResponseBody build() {
            return new DescribePreloadTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePreloadTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreloadTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Tasks(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.description = builder.description;
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
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String content; 
            private String createTime; 
            private String description; 
            private String process; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.description = model.description;
                this.process = model.process;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The prefetched content.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://a.com/1.jpg?b=2">http://a.com/1.jpg?b=2</a></p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-28 14:28:57</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error message returned upon a prefetch task failure. Valid values:</p>
             * <ul>
             * <li><strong>Internal Error</strong></li>
             * <li><strong>Origin Timeout</strong></li>
             * <li><strong>Origin Return StatusCode 5XX</strong></li>
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
             * <p>The task status.</p>
             * <ul>
             * <li><strong>Complete</strong>: The task is complete.</li>
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
             * <p>The ID of the queried task.</p>
             * 
             * <strong>example:</strong>
             * <p>1597854579687428</p>
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
