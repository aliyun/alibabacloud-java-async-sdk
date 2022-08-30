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

    @NameInMap("current_stage")
    private String currentStage;

    @NameInMap("error")
    private Error error;

    @NameInMap("events")
    private java.util.List < Events> events;

    @NameInMap("parameters")
    private java.util.Map < String, ? > parameters;

    @NameInMap("stages")
    private java.util.List < Stages> stages;

    @NameInMap("state")
    private String state;

    @NameInMap("target")
    private Target target;

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
         * 任务当前运行阶段。
         */
        public Builder currentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }

        /**
         * 任务错误信息。
         */
        public Builder error(Error error) {
            this.error = error;
            return this;
        }

        /**
         * 任务产生的事件。
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * 任务参数。
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * 任务阶段。
         */
        public Builder stages(java.util.List < Stages> stages) {
            this.stages = stages;
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
         * 任务执行对象。
         */
        public Builder target(Target target) {
            this.target = target;
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

    public static class Error extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("message")
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
             * 错误码。
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * 错误消息。
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
        @NameInMap("action")
        private String action;

        @NameInMap("level")
        private String level;

        @NameInMap("message")
        private String message;

        @NameInMap("reason")
        private String reason;

        @NameInMap("source")
        private String source;

        @NameInMap("timestamp")
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
             * 事件动作。
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * 事件等级。
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * 事件消息。
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * 事件原因。
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * 事件来源。
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * 事件生成时间。
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
        @NameInMap("end_time")
        private String endTime;

        @NameInMap("message")
        private String message;

        @NameInMap("outputs")
        private java.util.Map < String, ? > outputs;

        @NameInMap("start_time")
        private String startTime;

        @NameInMap("state")
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
             * 任务阶段结束时间。
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 任务阶段信息。
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * 任务阶段输出。
             */
            public Builder outputs(java.util.Map < String, ? > outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * 任务阶段开始时间。
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 任务阶段状态。
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
        @NameInMap("id")
        private String id;

        @NameInMap("type")
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
             * 任务执行对象ID。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 任务执行对象类型。
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
