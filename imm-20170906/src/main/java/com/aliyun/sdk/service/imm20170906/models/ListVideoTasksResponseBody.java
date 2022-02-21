// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVideoTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListVideoTasksResponseBody</p>
 */
public class ListVideoTasksResponseBody extends TeaModel {
    @NameInMap("NextMarker")
    private String nextMarker;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tasks")
    private java.util.List < Tasks> tasks;

    private ListVideoTasksResponseBody(Builder builder) {
        this.nextMarker = builder.nextMarker;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVideoTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
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

    public static final class Builder {
        private String nextMarker; 
        private String requestId; 
        private java.util.List < Tasks> tasks; 

        /**
         * NextMarker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
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
         * Tasks.
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public ListVideoTasksResponseBody build() {
            return new ListVideoTasksResponseBody(this);
        } 

    } 

    public static class Tasks extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NotifyEndpoint")
        private String notifyEndpoint;

        @NameInMap("NotifyTopicName")
        private String notifyTopicName;

        @NameInMap("Parameters")
        private String parameters;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("Result")
        private String result;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskType")
        private String taskType;

        private Tasks(Builder builder) {
            this.endTime = builder.endTime;
            this.errorMessage = builder.errorMessage;
            this.notifyEndpoint = builder.notifyEndpoint;
            this.notifyTopicName = builder.notifyTopicName;
            this.parameters = builder.parameters;
            this.progress = builder.progress;
            this.result = builder.result;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return notifyEndpoint
         */
        public String getNotifyEndpoint() {
            return this.notifyEndpoint;
        }

        /**
         * @return notifyTopicName
         */
        public String getNotifyTopicName() {
            return this.notifyTopicName;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
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
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String endTime; 
            private String errorMessage; 
            private String notifyEndpoint; 
            private String notifyTopicName; 
            private String parameters; 
            private Integer progress; 
            private String result; 
            private String startTime; 
            private String status; 
            private String taskId; 
            private String taskType; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NotifyEndpoint.
             */
            public Builder notifyEndpoint(String notifyEndpoint) {
                this.notifyEndpoint = notifyEndpoint;
                return this;
            }

            /**
             * NotifyTopicName.
             */
            public Builder notifyTopicName(String notifyTopicName) {
                this.notifyTopicName = notifyTopicName;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
