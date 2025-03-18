// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
    private java.util.List<Events> events;

    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.NameInMap("stages")
    private java.util.List<Stages> stages;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("target")
    private Target target;

    @com.aliyun.core.annotation.NameInMap("task_id")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("task_result")
    private java.util.List<TaskResult> taskResult;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Events> getEvents() {
        return this.events;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return stages
     */
    public java.util.List<Stages> getStages() {
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
    public java.util.List<TaskResult> getTaskResult() {
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
        private java.util.List<Events> events; 
        private java.util.Map<String, ?> parameters; 
        private java.util.List<Stages> stages; 
        private String state; 
        private Target target; 
        private String taskId; 
        private java.util.List<TaskResult> taskResult; 
        private String taskType; 
        private String updated; 

        private Builder() {
        } 

        private Builder(DescribeTaskInfoResponseBody model) {
            this.clusterId = model.clusterId;
            this.created = model.created;
            this.currentStage = model.currentStage;
            this.error = model.error;
            this.events = model.events;
            this.parameters = model.parameters;
            this.stages = model.stages;
            this.state = model.state;
            this.target = model.target;
            this.taskId = model.taskId;
            this.taskResult = model.taskResult;
            this.taskType = model.taskType;
            this.updated = model.updated;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c78592bfe92244365b3c3ad47f1de****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-10T16:02:04+08:00</p>
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * <p>The current stage of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>DrainNodes</p>
         */
        public Builder currentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }

        /**
         * <p>The error returned for the task.</p>
         */
        public Builder error(Error error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The event generated by the task.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The task parameters.</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>Detailed information about the stage of the task.</p>
         */
        public Builder stages(java.util.List<Stages> stages) {
            this.stages = stages;
            return this;
        }

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><code>running</code>: The task is running.</li>
         * <li><code>failed</code>: The task failed.</li>
         * <li><code>success</code>: The task is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The object of the task.</p>
         */
        public Builder target(Target target) {
            this.target = target;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>T-5faa48fb31b6b8078d000006</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The execution details of the task.</p>
         */
        public Builder taskResult(java.util.List<TaskResult> taskResult) {
            this.taskResult = taskResult;
            return this;
        }

        /**
         * <p>The task type. A value of <code>cluster_scaleout</code> indicates a scale-out task.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster_scaleout</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The time when the task was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-10T16:03:06+08:00</p>
         */
        public Builder updated(String updated) {
            this.updated = updated;
            return this;
        }

        public DescribeTaskInfoResponseBody build() {
            return new DescribeTaskInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The error code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>failed to xxx</p>
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
    /**
     * 
     * {@link DescribeTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Events model) {
                this.action = model.action;
                this.level = model.level;
                this.message = model.message;
                this.reason = model.reason;
                this.source = model.source;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The action of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>start</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The severity level of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The message about the event.</p>
             * 
             * <strong>example:</strong>
             * <p>start to xxx</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The cause of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>NodePoolUpgradeStart</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The source of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>ACK</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The timestamp when the event was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1669706229286</p>
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
    /**
     * 
     * {@link DescribeTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskInfoResponseBody</p>
     */
    public static class Stages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("end_time")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("outputs")
        private java.util.Map<String, ?> outputs;

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
        public java.util.Map<String, ?> getOutputs() {
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
            private java.util.Map<String, ?> outputs; 
            private String startTime; 
            private String state; 

            private Builder() {
            } 

            private Builder(Stages model) {
                this.endTime = model.endTime;
                this.message = model.message;
                this.outputs = model.outputs;
                this.startTime = model.startTime;
                this.state = model.state;
            } 

            /**
             * <p>The end time of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-15 23:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The message about the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>success to xxxxx</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The output generated at the stage.</p>
             */
            public Builder outputs(java.util.Map<String, ?> outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The start time of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-15 23:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
    /**
     * 
     * {@link DescribeTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Target model) {
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>c78592bfe92244365b3c3ad47f1de****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
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
    /**
     * 
     * {@link DescribeTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TaskResult model) {
                this.data = model.data;
                this.status = model.status;
            } 

            /**
             * <p>The resources that are managed by the task. For a scale-out task, the value of this parameter is the ID of the instance that is added by the task.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxx</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The status of the scale-out task. Valid values:</p>
             * <ul>
             * <li><code>success</code>: The scale-out task is successful.</li>
             * <li><code>success</code>: The scale-out task failed.</li>
             * <li><code>initial</code>: The scale-out task is being initialized.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
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
