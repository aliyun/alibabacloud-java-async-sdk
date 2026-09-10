// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeBatchTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBatchTasksResponseBody</p>
 */
public class DescribeBatchTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskList")
    private java.util.List<TaskList> taskList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBatchTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.taskList = builder.taskList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBatchTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return taskList
     */
    public java.util.List<TaskList> getTaskList() {
        return this.taskList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<TaskList> taskList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeBatchTasksResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.taskList = model.taskList;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned results.</p>
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
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>925B84D9-CA72-432C-95CF-738C22******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task list.</p>
         */
        public Builder taskList(java.util.List<TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        /**
         * <p>The total number of tasks that match the query, ignoring pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBatchTasksResponseBody build() {
            return new DescribeBatchTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBatchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBatchTasksResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("TaskBegin")
        private String taskBegin;

        @com.aliyun.core.annotation.NameInMap("TaskEnd")
        private String taskEnd;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private TaskList(Builder builder) {
            this.batchId = builder.batchId;
            this.status = builder.status;
            this.successCount = builder.successCount;
            this.taskBegin = builder.taskBegin;
            this.taskEnd = builder.taskEnd;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return taskBegin
         */
        public String getTaskBegin() {
            return this.taskBegin;
        }

        /**
         * @return taskEnd
         */
        public String getTaskEnd() {
            return this.taskEnd;
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

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String batchId; 
            private String status; 
            private Integer successCount; 
            private String taskBegin; 
            private String taskEnd; 
            private String taskName; 
            private String taskType; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.batchId = model.batchId;
                this.status = model.status;
                this.successCount = model.successCount;
                this.taskBegin = model.taskBegin;
                this.taskEnd = model.taskEnd;
                this.taskName = model.taskName;
                this.taskType = model.taskType;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pcb-xxx</p>
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of successfully completed subtasks in the batch.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>The task start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-06 20:51:44</p>
             */
            public Builder taskBegin(String taskBegin) {
                this.taskBegin = taskBegin;
                return this;
            }

            /**
             * <p>The task end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-06 22:43:26</p>
             */
            public Builder taskEnd(String taskEnd) {
                this.taskEnd = taskEnd;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>batch_task_test</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>polarclaw_install_skills</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The total number of subtasks in the batch.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
