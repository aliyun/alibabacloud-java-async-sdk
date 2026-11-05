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
 * {@link UpdateCopilotSessionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCopilotSessionResponseBody</p>
 */
public class UpdateCopilotSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateCopilotSessionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCopilotSessionResponseBody create() {
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

        private Builder(UpdateCopilotSessionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned status code. A value of Success indicates that the request is successful. Other values indicate that the request failed.</p>
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
         * <p>The error message. If the code is Success, this field is empty. Otherwise, this field contains the error message of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>Service temporarily unavailable</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID for end-to-end diagnostics.</p>
         * 
         * <strong>example:</strong>
         * <p>5BC79EF5-798B-5499-9683-4E14EBBBF712</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCopilotSessionResponseBody build() {
            return new UpdateCopilotSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCopilotSessionResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateCopilotSessionResponseBody</p>
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
             * <p>The time when the current execution turn was created. The time is in the ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:00:00+08:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The time when the execution ended. The time is in the ISO 8601 format. This field is empty if the execution has not ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:03:00+08:00</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The cumulative number of input tokens for the current turn. This is not the incremental usage for the current event.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The cumulative number of output tokens for the current turn.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The ID of the form that is currently waiting for user input. This ID is used when user input is submitted. This field is empty when no form is pending.</p>
             * 
             * <strong>example:</strong>
             * <p>iso-boot-validation</p>
             */
            public Builder pendingInputId(String pendingInputId) {
                this.pendingInputId = pendingInputId;
                return this;
            }

            /**
             * <p>The execution status. Valid values: running (in progress), waiting_input (waiting for user input), cancelling (being canceled), completed (completed), failed (failed), cancelled (canceled), and outcome_unknown (the outcome is unknown, the session may still be occupied, and the execution should not be automatically rerun).</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the current execution turn. You can use this ID to submit user input, reconnect, or stop the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>t001</p>
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            /**
             * <p>The time when the current execution turn was last updated. The time is in the ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:02:00+08:00</p>
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
     * {@link UpdateCopilotSessionResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateCopilotSessionResponseBody</p>
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
             * <p>The time when the current execution turn was created. The time is in the ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:00:00+08:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The time when the execution ended. The time is in the ISO 8601 format. This field is empty if the execution has not ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:03:00+08:00</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The cumulative number of input tokens for the current turn. This is not the incremental usage for the current event.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The cumulative number of output tokens for the current turn.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The ID of the form that is currently waiting for user input. This ID is used when user input is submitted. This field is empty when no form is pending.</p>
             * 
             * <strong>example:</strong>
             * <p>iso-boot-validation</p>
             */
            public Builder pendingInputId(String pendingInputId) {
                this.pendingInputId = pendingInputId;
                return this;
            }

            /**
             * <p>The execution status. Valid values: running (in progress), waiting_input (waiting for user input), cancelling (being canceled), completed (completed), failed (failed), cancelled (canceled), and outcome_unknown (the outcome is unknown, the session may still be occupied, and the execution should not be automatically rerun).</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the current execution turn. You can use this ID to submit user input, reconnect, or stop the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>t001</p>
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            /**
             * <p>The time when the current execution turn was last updated. The time is in the ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:02:00+08:00</p>
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
     * {@link UpdateCopilotSessionResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateCopilotSessionResponseBody</p>
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
             * <p>The ID of this scheduled execution. Multiple triggers of the same scheduled task use different runIds.</p>
             * 
             * <strong>example:</strong>
             * <p>run-example-001</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The scheduled trigger time. The time is in the ISO 8601 format with a time zone. This field is empty when no record exists.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:00:00+00:00</p>
             */
            public Builder scheduledAt(String scheduledAt) {
                this.scheduledAt = scheduledAt;
                return this;
            }

            /**
             * <p>The time when Copilot started processing this schedule. The time is in the ISO 8601 format with a time zone. This is not the time when the model outputs the first token.</p>
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
             * <p>The name of the scheduled task at the time of this trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>Daily inspection</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The scheduling time zone of the scheduled task, such as Asia/Shanghai.</p>
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
     * {@link UpdateCopilotSessionResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateCopilotSessionResponseBody</p>
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
             * <p>The summary of the execution that currently occupies the session. This field is empty when no active execution is in progress. An execution with an unknown outcome may still occupy the session.</p>
             */
            public Builder activeTurn(ActiveTurn activeTurn) {
                this.activeTurn = activeTurn;
                return this;
            }

            /**
             * <p>The time when the session was created. The time is in the ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:00:00+08:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The latest persisted event cursor for the current session, returned as a decimal string. The value is 0 when no events exist. This value does not represent the position consumed by the client.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder cursor(String cursor) {
                this.cursor = cursor;
                return this;
            }

            /**
             * <p>The summary of the most recent execution. This field is empty if no execution has ever occurred. If the most recent execution has not ended, this field may point to the same execution as activeTurn.</p>
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
             * <p>The snapshot information when the scheduled task is triggered. This field is returned only for scheduled task sessions and is empty for sessions from other sources. Subsequent renaming or deletion of the task does not change the historical snapshot.</p>
             */
            public Builder scheduledTask(ScheduledTask scheduledTask) {
                this.scheduledTask = scheduledTask;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The source from which the session was created. Valid values: openapi (proactive call), cron (scheduled task), im_dingtalk (DingTalk), im_feishu (Lark), and alert (alert). This value is determined by the server and is not changed by subsequent follow-up questions.</p>
             * 
             * <strong>example:</strong>
             * <p>openapi</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * <p>The session status. Valid values: active (not archived) and archived (archived). This field does not indicate whether the execution has ended.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the session was last updated. The time is in the ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:02:00+08:00</p>
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
