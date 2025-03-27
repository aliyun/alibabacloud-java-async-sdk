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
 * {@link DescribePurgeTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePurgeTasksResponseBody</p>
 */
public class DescribePurgeTasksResponseBody extends TeaModel {
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

    private DescribePurgeTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePurgeTasksResponseBody create() {
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

        private Builder(DescribePurgeTasksResponseBody model) {
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
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
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
         * <p>15</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePurgeTasksResponseBody build() {
            return new DescribePurgeTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePurgeTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePurgeTasksResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Tasks(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.process = builder.process;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.type = builder.type;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private String description; 
            private String process; 
            private String status; 
            private String taskId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.description = model.description;
                this.process = model.process;
                this.status = model.status;
                this.taskId = model.taskId;
                this.type = model.type;
            } 

            /**
             * <p>The purged content.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://a.com/1.jpg?b=1">http://a.com/1.jpg?b=1</a></p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-26T01:56:15Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error description returned when the purge task failed.</p>
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
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16346513304</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The type of the purge task. Valid values:</p>
             * <ul>
             * <li><strong>file</strong> (default): purges the cache by file.</li>
             * <li><strong>cachetag</strong>: purges the cache by cache tag.</li>
             * <li><strong>directory</strong>: purges the cache by directory.</li>
             * <li><strong>ignoreParams</strong>: purges the cache by URL with specified parameters ignored.</li>
             * <li><strong>hostname</strong>: purges the cache by hostname.</li>
             * <li><strong>purgeall</strong>: purges all cache.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
