// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link GetAutoOpsTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoOpsTaskResponseBody</p>
 */
public class GetAutoOpsTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Task")
    private Task task;

    private GetAutoOpsTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoOpsTaskResponseBody create() {
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
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    public static final class Builder {
        private String requestId; 
        private Task task; 

        private Builder() {
        } 

        private Builder(GetAutoOpsTaskResponseBody model) {
            this.requestId = model.requestId;
            this.task = model.task;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Task.
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public GetAutoOpsTaskResponseBody build() {
            return new GetAutoOpsTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoOpsTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoOpsTaskResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedOverTime")
        private Long allowedOverTime;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ScheduleTimeInfo")
        private String scheduleTimeInfo;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private Long scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("ScriptType")
        private String scriptType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskState")
        private String taskState;

        private Task(Builder builder) {
            this.allowedOverTime = builder.allowedOverTime;
            this.comment = builder.comment;
            this.name = builder.name;
            this.scheduleTimeInfo = builder.scheduleTimeInfo;
            this.scheduleType = builder.scheduleType;
            this.script = builder.script;
            this.scriptId = builder.scriptId;
            this.scriptName = builder.scriptName;
            this.scriptType = builder.scriptType;
            this.taskId = builder.taskId;
            this.taskState = builder.taskState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return allowedOverTime
         */
        public Long getAllowedOverTime() {
            return this.allowedOverTime;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scheduleTimeInfo
         */
        public String getScheduleTimeInfo() {
            return this.scheduleTimeInfo;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return scriptId
         */
        public Long getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return scriptType
         */
        public String getScriptType() {
            return this.scriptType;
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

        public static final class Builder {
            private Long allowedOverTime; 
            private String comment; 
            private String name; 
            private String scheduleTimeInfo; 
            private String scheduleType; 
            private String script; 
            private Long scriptId; 
            private String scriptName; 
            private String scriptType; 
            private String taskId; 
            private String taskState; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.allowedOverTime = model.allowedOverTime;
                this.comment = model.comment;
                this.name = model.name;
                this.scheduleTimeInfo = model.scheduleTimeInfo;
                this.scheduleType = model.scheduleType;
                this.script = model.script;
                this.scriptId = model.scriptId;
                this.scriptName = model.scriptName;
                this.scriptType = model.scriptType;
                this.taskId = model.taskId;
                this.taskState = model.taskState;
            } 

            /**
             * AllowedOverTime.
             */
            public Builder allowedOverTime(Long allowedOverTime) {
                this.allowedOverTime = allowedOverTime;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ScheduleTimeInfo.
             */
            public Builder scheduleTimeInfo(String scheduleTimeInfo) {
                this.scheduleTimeInfo = scheduleTimeInfo;
                return this;
            }

            /**
             * ScheduleType.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * Script.
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(Long scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * ScriptName.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * ScriptType.
             */
            public Builder scriptType(String scriptType) {
                this.scriptType = scriptType;
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

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
