// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskInfoResponseBody</p>
 */
public class DescribeTaskInfoResponseBody extends TeaModel {
    @NameInMap("cluster_id")
    private String clusterId;

    @NameInMap("task_id")
    private String taskId;

    @NameInMap("created")
    private String created;

    @NameInMap("updated")
    private String updated;

    @NameInMap("state")
    private String state;

    @NameInMap("task_type")
    private String taskType;

    @NameInMap("task_result")
    private java.util.List < TaskResult> taskResult;

    private DescribeTaskInfoResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.taskId = builder.taskId;
        this.created = builder.created;
        this.updated = builder.updated;
        this.state = builder.state;
        this.taskType = builder.taskType;
        this.taskResult = builder.taskResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return created
     */
    public String getCreated() {
        return this.created;
    }

    /**
     * @return updated
     */
    public String getUpdated() {
        return this.updated;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return taskResult
     */
    public java.util.List < TaskResult> getTaskResult() {
        return this.taskResult;
    }

    public static final class Builder {
        private String clusterId; 
        private String taskId; 
        private String created; 
        private String updated; 
        private String state; 
        private String taskType; 
        private java.util.List < TaskResult> taskResult; 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The time when the task was created.
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * The time when the task was updated.
         */
        public Builder updated(String updated) {
            this.updated = updated;
            return this;
        }

        /**
         * Indicates the running status of the task. Valid values:
         * <p>
         * -"running": The task is running.
         * -"fail": the task failed to run.
         * -"success": The task is completed.
         * 
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * The type of the task. The type of the scale-out task is cluster_scaleout ".
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * The task execution details.
         */
        public Builder taskResult(java.util.List < TaskResult> taskResult) {
            this.taskResult = taskResult;
            return this;
        }

        public DescribeTaskInfoResponseBody build() {
            return new DescribeTaskInfoResponseBody(this);
        } 

    } 

    public static class TaskResult extends TeaModel {
        @NameInMap("data")
        private String data;

        @NameInMap("status")
        private String status;

        private TaskResult(Builder builder) {
            this.data = builder.data;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskResult create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String data; 
            private String status; 

            /**
             * The resource used for task operations. For example, if the resource used for operations during scale-out is an instance, the instance ID is displayed here.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * The status of the resource expansion. Valid values:
             * <p>
             * -"success": Scale-Out succeeded.
             * -"failed": Scale-out failed.
             * -"initial": initializing.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public TaskResult build() {
                return new TaskResult(this);
            } 

        } 

    }
}
