// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetCopilotSessionResponseBody} extends {@link TeaModel}
 *
 * <p>GetCopilotSessionResponseBody</p>
 */
public class GetCopilotSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetCopilotSessionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCopilotSessionResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCopilotSessionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCopilotSessionResponseBody build() {
            return new GetCopilotSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCopilotSessionResponseBody} extends {@link TeaModel}
     *
     * <p>GetCopilotSessionResponseBody</p>
     */
    public static class ActiveTurn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("finishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("pendingInputId")
        private String pendingInputId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("turnId")
        private String turnId;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private ActiveTurn(Builder builder) {
            this.createdAt = builder.createdAt;
            this.finishedAt = builder.finishedAt;
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.pendingInputId = builder.pendingInputId;
            this.status = builder.status;
            this.turnId = builder.turnId;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActiveTurn create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return pendingInputId
         */
        public String getPendingInputId() {
            return this.pendingInputId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return turnId
         */
        public String getTurnId() {
            return this.turnId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private String finishedAt; 
            private Long inputTokens; 
            private Long outputTokens; 
            private String pendingInputId; 
            private String status; 
            private String turnId; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(ActiveTurn model) {
                this.createdAt = model.createdAt;
                this.finishedAt = model.finishedAt;
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.pendingInputId = model.pendingInputId;
                this.status = model.status;
                this.turnId = model.turnId;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * finishedAt.
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * inputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * pendingInputId.
             */
            public Builder pendingInputId(String pendingInputId) {
                this.pendingInputId = pendingInputId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * turnId.
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public ActiveTurn build() {
                return new ActiveTurn(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCopilotSessionResponseBody} extends {@link TeaModel}
     *
     * <p>GetCopilotSessionResponseBody</p>
     */
    public static class LastTurn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("finishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("pendingInputId")
        private String pendingInputId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("turnId")
        private String turnId;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private LastTurn(Builder builder) {
            this.createdAt = builder.createdAt;
            this.finishedAt = builder.finishedAt;
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.pendingInputId = builder.pendingInputId;
            this.status = builder.status;
            this.turnId = builder.turnId;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastTurn create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return pendingInputId
         */
        public String getPendingInputId() {
            return this.pendingInputId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return turnId
         */
        public String getTurnId() {
            return this.turnId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private String finishedAt; 
            private Long inputTokens; 
            private Long outputTokens; 
            private String pendingInputId; 
            private String status; 
            private String turnId; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(LastTurn model) {
                this.createdAt = model.createdAt;
                this.finishedAt = model.finishedAt;
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.pendingInputId = model.pendingInputId;
                this.status = model.status;
                this.turnId = model.turnId;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * finishedAt.
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * inputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * pendingInputId.
             */
            public Builder pendingInputId(String pendingInputId) {
                this.pendingInputId = pendingInputId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * turnId.
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public LastTurn build() {
                return new LastTurn(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCopilotSessionResponseBody} extends {@link TeaModel}
     *
     * <p>GetCopilotSessionResponseBody</p>
     */
    public static class ScheduledTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("scheduledAt")
        private String scheduledAt;

        @com.aliyun.core.annotation.NameInMap("startedAt")
        private String startedAt;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        private ScheduledTask(Builder builder) {
            this.runId = builder.runId;
            this.scheduledAt = builder.scheduledAt;
            this.startedAt = builder.startedAt;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.timezone = builder.timezone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledTask create() {
            return builder().build();
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return scheduledAt
         */
        public String getScheduledAt() {
            return this.scheduledAt;
        }

        /**
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        public static final class Builder {
            private String runId; 
            private String scheduledAt; 
            private String startedAt; 
            private Long taskId; 
            private String taskName; 
            private String timezone; 

            private Builder() {
            } 

            private Builder(ScheduledTask model) {
                this.runId = model.runId;
                this.scheduledAt = model.scheduledAt;
                this.startedAt = model.startedAt;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.timezone = model.timezone;
            } 

            /**
             * <p>本次定时执行的 Run ID</p>
             * 
             * <strong>example:</strong>
             * <p>run-example-001</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>计划触发时间，ISO 8601 含时区偏移</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:00:00+00:00</p>
             */
            public Builder scheduledAt(String scheduledAt) {
                this.scheduledAt = scheduledAt;
                return this;
            }

            /**
             * <p>Copilot 开始处理时间，ISO 8601 含时区偏移</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:00:03+00:00</p>
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * <p>任务 ID；任务删除后仍保留</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>触发时的任务名称快照</p>
             * 
             * <strong>example:</strong>
             * <p>每日巡检</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>任务的 cron 时区</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public ScheduledTask build() {
                return new ScheduledTask(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCopilotSessionResponseBody} extends {@link TeaModel}
     *
     * <p>GetCopilotSessionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeTurn")
        private ActiveTurn activeTurn;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("cursor")
        @com.aliyun.core.annotation.Validation(maxLength = 19, minLength = 1)
        private String cursor;

        @com.aliyun.core.annotation.NameInMap("lastTurn")
        private LastTurn lastTurn;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("scheduledTask")
        private ScheduledTask scheduledTask;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("sessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Data(Builder builder) {
            this.activeTurn = builder.activeTurn;
            this.createdAt = builder.createdAt;
            this.cursor = builder.cursor;
            this.lastTurn = builder.lastTurn;
            this.name = builder.name;
            this.scheduledTask = builder.scheduledTask;
            this.sessionId = builder.sessionId;
            this.sessionType = builder.sessionType;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeTurn
         */
        public ActiveTurn getActiveTurn() {
            return this.activeTurn;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return cursor
         */
        public String getCursor() {
            return this.cursor;
        }

        /**
         * @return lastTurn
         */
        public LastTurn getLastTurn() {
            return this.lastTurn;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scheduledTask
         */
        public ScheduledTask getScheduledTask() {
            return this.scheduledTask;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sessionType
         */
        public String getSessionType() {
            return this.sessionType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private ActiveTurn activeTurn; 
            private String createdAt; 
            private String cursor; 
            private LastTurn lastTurn; 
            private String name; 
            private ScheduledTask scheduledTask; 
            private String sessionId; 
            private String sessionType; 
            private String status; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activeTurn = model.activeTurn;
                this.createdAt = model.createdAt;
                this.cursor = model.cursor;
                this.lastTurn = model.lastTurn;
                this.name = model.name;
                this.scheduledTask = model.scheduledTask;
                this.sessionId = model.sessionId;
                this.sessionType = model.sessionType;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * activeTurn.
             */
            public Builder activeTurn(ActiveTurn activeTurn) {
                this.activeTurn = activeTurn;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>十进制事件序号字符串，范围 0..9223372036854775807；避免 JavaScript 精度丢失</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder cursor(String cursor) {
                this.cursor = cursor;
                return this;
            }

            /**
             * lastTurn.
             */
            public Builder lastTurn(LastTurn lastTurn) {
                this.lastTurn = lastTurn;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>定时任务触发快照；非定时会话为空</p>
             */
            public Builder scheduledTask(ScheduledTask scheduledTask) {
                this.scheduledTask = scheduledTask;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>会话初始来源：chat、scheduled_task、alert；后续追问不改变来源</p>
             * 
             * <strong>example:</strong>
             * <p>openapi</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
