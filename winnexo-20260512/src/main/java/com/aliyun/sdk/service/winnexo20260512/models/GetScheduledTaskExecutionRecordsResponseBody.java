// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetScheduledTaskExecutionRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>GetScheduledTaskExecutionRecordsResponseBody</p>
 */
public class GetScheduledTaskExecutionRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("tasks")
    private java.util.List<Tasks> tasks;

    private GetScheduledTaskExecutionRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledTaskExecutionRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<Tasks> tasks; 

        private Builder() {
        } 

        private Builder(GetScheduledTaskExecutionRecordsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>The current zone list is illegal.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * tasks.
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public GetScheduledTaskExecutionRecordsResponseBody build() {
            return new GetScheduledTaskExecutionRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScheduledTaskExecutionRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskExecutionRecordsResponseBody</p>
     */
    public static class Timeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actualTime")
        private String actualTime;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("executionId")
        private String executionId;

        @com.aliyun.core.annotation.NameInMap("outputContent")
        private String outputContent;

        @com.aliyun.core.annotation.NameInMap("scheduledTime")
        private String scheduledTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Timeline(Builder builder) {
            this.actualTime = builder.actualTime;
            this.displayName = builder.displayName;
            this.errorMessage = builder.errorMessage;
            this.executionId = builder.executionId;
            this.outputContent = builder.outputContent;
            this.scheduledTime = builder.scheduledTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timeline create() {
            return builder().build();
        }

        /**
         * @return actualTime
         */
        public String getActualTime() {
            return this.actualTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return executionId
         */
        public String getExecutionId() {
            return this.executionId;
        }

        /**
         * @return outputContent
         */
        public String getOutputContent() {
            return this.outputContent;
        }

        /**
         * @return scheduledTime
         */
        public String getScheduledTime() {
            return this.scheduledTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String actualTime; 
            private String displayName; 
            private String errorMessage; 
            private String executionId; 
            private String outputContent; 
            private String scheduledTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Timeline model) {
                this.actualTime = model.actualTime;
                this.displayName = model.displayName;
                this.errorMessage = model.errorMessage;
                this.executionId = model.executionId;
                this.outputContent = model.outputContent;
                this.scheduledTime = model.scheduledTime;
                this.status = model.status;
            } 

            /**
             * <p>实际执行时间（仅历史记录）</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-01T12:00:00Z</p>
             */
            public Builder actualTime(String actualTime) {
                this.actualTime = actualTime;
                return this;
            }

            /**
             * <p>执行记录展示名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>错误信息（仅失败记录）</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>执行记录 ID（历史记录才有）</p>
             * 
             * <strong>example:</strong>
             * <p>exampleExecutionId</p>
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * <p>执行输出内容（仅历史记录）</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder outputContent(String outputContent) {
                this.outputContent = outputContent;
                return this;
            }

            /**
             * <p>计划执行时间 ISO8601</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-01T12:00:00Z</p>
             */
            public Builder scheduledTime(String scheduledTime) {
                this.scheduledTime = scheduledTime;
                return this;
            }

            /**
             * <p>状态：PENDING/RUNNING/SUCCESS/FAILED/SCHEDULED</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Timeline build() {
                return new Timeline(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScheduledTaskExecutionRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskExecutionRecordsResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("isOpen")
        private Boolean isOpen;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("timeline")
        private java.util.List<Timeline> timeline;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        private Tasks(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.description = builder.description;
            this.isOpen = builder.isOpen;
            this.name = builder.name;
            this.taskId = builder.taskId;
            this.timeline = builder.timeline;
            this.timezone = builder.timezone;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isOpen
         */
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return timeline
         */
        public java.util.List<Timeline> getTimeline() {
            return this.timeline;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String cronExpression; 
            private String description; 
            private Boolean isOpen; 
            private String name; 
            private String taskId; 
            private java.util.List<Timeline> timeline; 
            private String timezone; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.cronExpression = model.cronExpression;
                this.description = model.description;
                this.isOpen = model.isOpen;
                this.name = model.name;
                this.taskId = model.taskId;
                this.timeline = model.timeline;
                this.timezone = model.timezone;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>Cron 表达式</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>任务简述</p>
             * 
             * <strong>example:</strong>
             * <p>示例描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>是否公开</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOpen(Boolean isOpen) {
                this.isOpen = isOpen;
                return this;
            }

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>示例名称.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>任务 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleTaskId</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * timeline.
             */
            public Builder timeline(java.util.List<Timeline> timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * <p>时区</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>触发类型 cron/manual/event</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
