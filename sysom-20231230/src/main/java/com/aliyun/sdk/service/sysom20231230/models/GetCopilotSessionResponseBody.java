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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <ul>
         * <li>If <code>code == Success</code>, this field is empty.</li>
         * <li>Otherwise, this field contains the request error message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. You can use it for end-to-end diagnostics.</p>
         * 
         * <strong>example:</strong>
         * <p>5BC79EF5-798B-5499-9683-4E14EBBBF712</p>
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
             * <p>The time when the execution turn was created, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:01:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The time when the execution turn ended, in ISO 8601 format. This field is empty if the execution has not ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:03:00Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The cumulative number of input tokens in this execution turn.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The cumulative number of output tokens in this execution turn.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The ID of the form that is waiting for user input. It is used when you submit user input. This field is empty if no form needs to be filled out.</p>
             * 
             * <strong>example:</strong>
             * <p>iso-boot-validation</p>
             */
            public Builder pendingInputId(String pendingInputId) {
                this.pendingInputId = pendingInputId;
                return this;
            }

            /**
             * <p>The execution status.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the execution turn. It is used when you submit user input, reconnect, or stop the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>e499819f351242dba59ab8af31bc8b0f</p>
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            /**
             * <p>The time when the execution turn was last updated, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:02:00Z</p>
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
             * <p>The time when the execution turn was created, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:01:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The time when the execution turn ended, in ISO 8601 format. This field is empty if the execution has not ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:03:00Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The cumulative number of input tokens in this execution turn.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The cumulative number of output tokens in this execution turn.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The ID of the form that is waiting for user input. It is used when you submit user input. This field is empty if no form needs to be filled out.</p>
             * 
             * <strong>example:</strong>
             * <p>iso-boot-validation</p>
             */
            public Builder pendingInputId(String pendingInputId) {
                this.pendingInputId = pendingInputId;
                return this;
            }

            /**
             * <p>The execution status.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the execution turn. It is used when you submit user input, reconnect, or stop the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>e499819f351242dba59ab8af31bc8b0f</p>
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            /**
             * <p>The time when the execution turn was last updated, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:02:00Z</p>
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
             * <p>The ID of this scheduled execution. It is used to associate with the scheduled execution record. Multiple triggers of the same scheduled task use different runIds.</p>
             * 
             * <strong>example:</strong>
             * <p>run-example-001</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The scheduled trigger time, in ISO 8601 format with a time zone. This field is empty if no record exists.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:00:00+00:00</p>
             */
            public Builder scheduledAt(String scheduledAt) {
                this.scheduledAt = scheduledAt;
                return this;
            }

            /**
             * <p>The time when the processing of this schedule started, in ISO 8601 format with a time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:00:03+00:00</p>
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * <p>The ID of the associated scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the scheduled task when this trigger occurred. Subsequent changes to the task name do not change this snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>Daily inspection</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The scheduling time zone of the scheduled task.</p>
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
             * <p>The execution information of the turn that currently occupies the session.</p>
             */
            public Builder activeTurn(ActiveTurn activeTurn) {
                this.activeTurn = activeTurn;
                return this;
            }

            /**
             * <p>The time when the session was created, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The cursor of the latest persisted event in the current session.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder cursor(String cursor) {
                this.cursor = cursor;
                return this;
            }

            /**
             * <p>The information about the most recent execution turn.</p>
             */
            public Builder lastTurn(LastTurn lastTurn) {
                this.lastTurn = lastTurn;
                return this;
            }

            /**
             * <p>The session title.</p>
             * 
             * <strong>example:</strong>
             * <p>Troubleshoot CPU load</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The snapshot information captured when the scheduled task was triggered.</p>
             */
            public Builder scheduledTask(ScheduledTask scheduledTask) {
                this.scheduledTask = scheduledTask;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c356bc310e4345c3a602a2912322ad21</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The session source. Valid values:</p>
             * <ul>
             * <li>openapi: API call.</li>
             * <li>cron: Scheduled task.</li>
             * <li>im_dingtalk: DingTalk.</li>
             * <li>im_feishu: Lark.</li>
             * <li>alert: Alert.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>openapi</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * <p>The session status. Valid values:</p>
             * <ul>
             * <li>active: The session is not archived.</li>
             * <li>archived: The session is archived.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the session was last updated, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:02:00Z</p>
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
