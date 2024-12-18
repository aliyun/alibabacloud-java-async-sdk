// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DescribeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskResponseBody</p>
 */
public class DescribeTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Steps")
    private java.util.List<Steps> steps;

    @com.aliyun.core.annotation.NameInMap("TaskState")
    private String taskState;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private DescribeTaskResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.createTime = builder.createTime;
        this.message = builder.message;
        this.nodeIds = builder.nodeIds;
        this.requestId = builder.requestId;
        this.steps = builder.steps;
        this.taskState = builder.taskState;
        this.taskType = builder.taskType;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return steps
     */
    public java.util.List<Steps> getSteps() {
        return this.steps;
    }

    /**
     * @return taskState
     */
    public String getTaskState() {
        return this.taskState;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String clusterId; 
        private String clusterName; 
        private String createTime; 
        private String message; 
        private java.util.List<String> nodeIds; 
        private String requestId; 
        private java.util.List<Steps> steps; 
        private String taskState; 
        private String taskType; 
        private String updateTime; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NodeIds.
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Steps.
         */
        public Builder steps(java.util.List<Steps> steps) {
            this.steps = steps;
            return this;
        }

        /**
         * TaskState.
         */
        public Builder taskState(String taskState) {
            this.taskState = taskState;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public DescribeTaskResponseBody build() {
            return new DescribeTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskResponseBody</p>
     */
    public static class SubTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskState")
        private String taskState;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private SubTasks(Builder builder) {
            this.createTime = builder.createTime;
            this.message = builder.message;
            this.taskId = builder.taskId;
            this.taskState = builder.taskState;
            this.taskType = builder.taskType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubTasks create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskState
         */
        public String getTaskState() {
            return this.taskState;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String message; 
            private String taskId; 
            private String taskState; 
            private String taskType; 
            private String updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
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
             * TaskState.
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SubTasks build() {
                return new SubTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskResponseBody</p>
     */
    public static class Steps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("StageTag")
        private String stageTag;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("StepState")
        private String stepState;

        @com.aliyun.core.annotation.NameInMap("StepType")
        private String stepType;

        @com.aliyun.core.annotation.NameInMap("SubTasks")
        private java.util.List<SubTasks> subTasks;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Steps(Builder builder) {
            this.message = builder.message;
            this.stageTag = builder.stageTag;
            this.startTime = builder.startTime;
            this.stepName = builder.stepName;
            this.stepState = builder.stepState;
            this.stepType = builder.stepType;
            this.subTasks = builder.subTasks;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Steps create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return stageTag
         */
        public String getStageTag() {
            return this.stageTag;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return stepState
         */
        public String getStepState() {
            return this.stepState;
        }

        /**
         * @return stepType
         */
        public String getStepType() {
            return this.stepType;
        }

        /**
         * @return subTasks
         */
        public java.util.List<SubTasks> getSubTasks() {
            return this.subTasks;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String message; 
            private String stageTag; 
            private String startTime; 
            private String stepName; 
            private String stepState; 
            private String stepType; 
            private java.util.List<SubTasks> subTasks; 
            private String updateTime; 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * StageTag.
             */
            public Builder stageTag(String stageTag) {
                this.stageTag = stageTag;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StepName.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * StepState.
             */
            public Builder stepState(String stepState) {
                this.stepState = stepState;
                return this;
            }

            /**
             * StepType.
             */
            public Builder stepType(String stepType) {
                this.stepType = stepType;
                return this;
            }

            /**
             * SubTasks.
             */
            public Builder subTasks(java.util.List<SubTasks> subTasks) {
                this.subTasks = subTasks;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Steps build() {
                return new Steps(this);
            } 

        } 

    }
}
