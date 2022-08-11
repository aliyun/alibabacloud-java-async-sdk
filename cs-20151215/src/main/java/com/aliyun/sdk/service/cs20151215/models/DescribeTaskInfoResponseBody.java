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

    @NameInMap("created")
    private String created;

    @NameInMap("state")
    private String state;

    @NameInMap("task_id")
    private String taskId;

    @NameInMap("task_result")
    private java.util.List < TaskResult> taskResult;

    @NameInMap("task_type")
    private String taskType;

    @NameInMap("updated")
    private String updated;

    private DescribeTaskInfoResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.created = builder.created;
        this.state = builder.state;
        this.taskId = builder.taskId;
        this.taskResult = builder.taskResult;
        this.taskType = builder.taskType;
        this.updated = builder.updated;
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
     * @return created
     */
    public String getCreated() {
        return this.created;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskResult
     */
    public java.util.List < TaskResult> getTaskResult() {
        return this.taskResult;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return updated
     */
    public String getUpdated() {
        return this.updated;
    }

    public static final class Builder {
        private String clusterId; 
        private String created; 
        private String state; 
        private String taskId; 
        private java.util.List < TaskResult> taskResult; 
        private String taskType; 
        private String updated; 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 任务创建时间。
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * 任务当前状态。
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * 任务ID。
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * 任务执行详情。
         */
        public Builder taskResult(java.util.List < TaskResult> taskResult) {
            this.taskResult = taskResult;
            return this;
        }

        /**
         * 当前任务类型。
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * 任务更新时间。
         */
        public Builder updated(String updated) {
            this.updated = updated;
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
             * 操作的资源，例如：实例ID。
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * 资源的状态。
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
