// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskInfoResponseBody</p>
 */
public class DescribeTaskInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("created")
    private String created;

    @com.aliyun.core.annotation.NameInMap("current_stage")
    private String currentStage;

    @com.aliyun.core.annotation.NameInMap("error")
    private Error error;

    @com.aliyun.core.annotation.NameInMap("events")
    private java.util.List < Events> events;

    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map < String, ? > parameters;

    @com.aliyun.core.annotation.NameInMap("stages")
    private java.util.List < Stages> stages;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("target")
    private Target target;

    @com.aliyun.core.annotation.NameInMap("task_id")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("task_result")
    private java.util.List < TaskResult> taskResult;

    @com.aliyun.core.annotation.NameInMap("task_type")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("updated")
    private String updated;

    private DescribeTaskInfoResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.created = builder.created;
        this.currentStage = builder.currentStage;
        this.error = builder.error;
        this.events = builder.events;
        this.parameters = builder.parameters;
        this.stages = builder.stages;
        this.state = builder.state;
        this.target = builder.target;
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
     * @return currentStage
     */
    public String getCurrentStage() {
        return this.currentStage;
    }

    /**
     * @return error
     */
    public Error getError() {
        return this.error;
    }

    /**
     * @return events
     */
    public java.util.List < Events> getEvents() {
        return this.events;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return stages
     */
    public java.util.List < Stages> getStages() {
        return this.stages;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return target
     */
    public Target getTarget() {
        return this.target;
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
        private String currentStage; 
        private Error error; 
        private java.util.List < Events> events; 
        private java.util.Map < String, ? > parameters; 
        private java.util.List < Stages> stages; 
        private String state; 
        private Target target; 
        private String taskId; 
        private java.util.List < TaskResult> taskResult; 
        private String taskType; 
        private String updated; 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
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
         * The current stage of the task.
         */
        public Builder currentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }

        /**
         * The error returned for the task.
         */
        public Builder error(Error error) {
            this.error = error;
            return this;
        }

        /**
         * The event generated by the task.
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * The task parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Detailed information about the stage of the task.
         */
        public Builder stages(java.util.List < Stages> stages) {
            this.stages = stages;
            return this;
        }

        /**
         * The status of the task. Valid values:
         * <p>
         * 
         * *   `running`: The task is running.
         * *   `failed`: The task failed.
         * *   `success`: The task is complete.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * The object of the task.
         */
        public Builder target(Target target) {
            this.target = target;
            return this;
        }

        /**
         * The task ID.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The execution details of the task.
         */
        public Builder taskResult(java.util.List < TaskResult> taskResult) {
            this.taskResult = taskResult;
            return this;
        }

        /**
         * The task type. A value of `cluster_scaleout` indicates a scale-out task.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * The time when the task was updated.
         */
        public Builder updated(String updated) {
            this.updated = updated;
            return this;
        }

        public DescribeTaskInfoResponseBody build() {
            return new DescribeTaskInfoResponseBody(this);
        } 

    } 

    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            /**
             * The error code returned.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        private Events(Builder builder) {
            this.action = builder.action;
            this.level = builder.level;
            this.message = builder.message;
            this.reason = builder.reason;
            this.source = builder.source;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String action; 
            private String level; 
            private String message; 
            private String reason; 
            private String source; 
            private String timestamp; 

            /**
             * The action of the event.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The severity level of the event.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The message about the event.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The cause of the event.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The source of the event.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The timestamp when the event was generated.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    public static class Stages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("end_time")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("outputs")
        private java.util.Map < String, ? > outputs;

        @com.aliyun.core.annotation.NameInMap("start_time")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        private Stages(Builder builder) {
            this.endTime = builder.endTime;
            this.message = builder.message;
            this.outputs = builder.outputs;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stages create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return outputs
         */
        public java.util.Map < String, ? > getOutputs() {
            return this.outputs;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String endTime; 
            private String message; 
            private java.util.Map < String, ? > outputs; 
            private String startTime; 
            private String state; 

            /**
             * The end time of the stage.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The message about the stage.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The output generated at the stage.
             */
            public Builder outputs(java.util.Map < String, ? > outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * The start time of the stage.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the stage.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Stages build() {
                return new Stages(this);
            } 

        } 

    }
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Target(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            /**
             * The ID of the object.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The type of the object.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    public static class TaskResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("status")
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
             * The resources that are managed by the task. For a scale-out task, the value of this parameter is the ID of the instance that is added by the task.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * The status of the scale-out task. Valid values:
             * <p>
             * 
             * *   `success`: The scale-out task is successful.
             * *   `success`: The scale-out task failed.
             * *   `initial`: The scale-out task is being initialized.
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
