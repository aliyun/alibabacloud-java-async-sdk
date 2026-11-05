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
 * {@link DescribeInspectionTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInspectionTaskListResponseBody</p>
 */
public class DescribeInspectionTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskLists")
    private java.util.List<TaskLists> taskLists;

    private DescribeInspectionTaskListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskLists = builder.taskLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInspectionTaskListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskLists
     */
    public java.util.List<TaskLists> getTaskLists() {
        return this.taskLists;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TaskLists> taskLists; 

        private Builder() {
        } 

        private Builder(DescribeInspectionTaskListResponseBody model) {
            this.requestId = model.requestId;
            this.taskLists = model.taskLists;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of inspection tasks.</p>
         */
        public Builder taskLists(java.util.List<TaskLists> taskLists) {
            this.taskLists = taskLists;
            return this;
        }

        public DescribeInspectionTaskListResponseBody build() {
            return new DescribeInspectionTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInspectionTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInspectionTaskListResponseBody</p>
     */
    public static class TaskLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("DBClusterIds")
        private String DBClusterIds;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("TaskDescription")
        private String taskDescription;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private TaskLists(Builder builder) {
            this.createTime = builder.createTime;
            this.cronExpression = builder.cronExpression;
            this.DBClusterIds = builder.DBClusterIds;
            this.expireTime = builder.expireTime;
            this.taskDescription = builder.taskDescription;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskLists create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return DBClusterIds
         */
        public String getDBClusterIds() {
            return this.DBClusterIds;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return taskDescription
         */
        public String getTaskDescription() {
            return this.taskDescription;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String createTime; 
            private String cronExpression; 
            private String DBClusterIds; 
            private String expireTime; 
            private String taskDescription; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TaskLists model) {
                this.createTime = model.createTime;
                this.cronExpression = model.cronExpression;
                this.DBClusterIds = model.DBClusterIds;
                this.expireTime = model.expireTime;
                this.taskDescription = model.taskDescription;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The date when the task was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-01</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The cron expression for periodic inspections.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 2 * * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The IDs of the PolarDB clusters to be inspected. Separate multiple IDs with commas.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-001,pc-002</p>
             */
            public Builder DBClusterIds(String DBClusterIds) {
                this.DBClusterIds = DBClusterIds;
                return this;
            }

            /**
             * <p>The expiration date of the inspection task.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-31</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The description of the inspection task.</p>
             * 
             * <strong>example:</strong>
             * <p>Periodic inspection task</p>
             */
            public Builder taskDescription(String taskDescription) {
                this.taskDescription = taskDescription;
                return this;
            }

            /**
             * <p>The ID of the inspection task.</p>
             * 
             * <strong>example:</strong>
             * <p>task-001</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskLists build() {
                return new TaskLists(this);
            } 

        } 

    }
}
