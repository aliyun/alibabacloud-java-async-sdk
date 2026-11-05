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
 * {@link ListCopilotSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCopilotSessionsResponseBody</p>
 */
public class ListCopilotSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListCopilotSessionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCopilotSessionsResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
        private Integer maxResults; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCopilotSessionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned status code. Success indicates that the request is successful. Other values indicate that the request failed.</p>
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
         * <p>The page size used for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The error message. If code is Success, this field is empty. Otherwise, this field contains the request error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Service temporarily unavailable</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which can be used for end-to-end diagnostics.</p>
         * 
         * <strong>example:</strong>
         * <p>5BC79EF5-798B-5499-9683-4E14EBBBF712</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCopilotSessionsResponseBody build() {
            return new ListCopilotSessionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCopilotSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCopilotSessionsResponseBody</p>
     */
    public static class ActiveTurn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

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
            this.agentId = builder.agentId;
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
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
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
            private String agentId; 
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
                this.agentId = model.agentId;
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
             * <p>The agent ID bound to the current execution round.</p>
             * 
             * <strong>example:</strong>
             * <p>sysagent</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The time when the current execution round was created, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:00:00+08:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The time when the execution ended, in ISO 8601 format. This field is empty if the execution has not ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:03:00+08:00</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The cumulative number of input tokens for the current round, which is not the incremental usage of the current event.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The cumulative number of output tokens for the current round.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The ID of the form that is currently waiting for user input. This value is used when submitting user input. This field is empty when there is no form to be filled.</p>
             * 
             * <strong>example:</strong>
             * <p>iso-boot-validation</p>
             */
            public Builder pendingInputId(String pendingInputId) {
                this.pendingInputId = pendingInputId;
                return this;
            }

            /**
             * <p>The execution status. Valid values:</p>
             * <ul>
             * <li>running: The execution is in progress.</li>
             * <li>waiting_input: Waiting for user input.</li>
             * <li>cancelling: The execution is being canceled.</li>
             * <li>completed: The execution is completed.</li>
             * <li>failed: The execution failed.</li>
             * <li>cancelled: The execution is canceled.</li>
             * <li>outcome_unknown: The outcome is unknown. The session may still be occupied and should not be automatically rerun.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the current execution round, which is used to submit user input, reconnect, or stop the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>t001</p>
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            /**
             * <p>The time when the current execution round was last updated, in ISO 8601 format.</p>
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
     * {@link ListCopilotSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCopilotSessionsResponseBody</p>
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
             * <p>The ID of the current scheduled execution. Different runIds are used for multiple triggers of the same scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>run-example-001</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The scheduled trigger time, in ISO 8601 format with time zone. This field is empty when there is no record.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T01:00:00+00:00</p>
             */
            public Builder scheduledAt(String scheduledAt) {
                this.scheduledAt = scheduledAt;
                return this;
            }

            /**
             * <p>The time when Copilot started processing the current schedule, in ISO 8601 format with time zone. This is not the time when the model outputs the first token.</p>
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
     * {@link ListCopilotSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCopilotSessionsResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeTurn")
        private ActiveTurn activeTurn;

        @com.aliyun.core.annotation.NameInMap("activeTurnId")
        private String activeTurnId;

        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

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

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Sessions(Builder builder) {
            this.activeTurn = builder.activeTurn;
            this.activeTurnId = builder.activeTurnId;
            this.agentId = builder.agentId;
            this.createdAt = builder.createdAt;
            this.id = builder.id;
            this.name = builder.name;
            this.scheduledTask = builder.scheduledTask;
            this.sessionId = builder.sessionId;
            this.sessionType = builder.sessionType;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return activeTurn
         */
        public ActiveTurn getActiveTurn() {
            return this.activeTurn;
        }

        /**
         * @return activeTurnId
         */
        public String getActiveTurnId() {
            return this.activeTurnId;
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private ActiveTurn activeTurn; 
            private String activeTurnId; 
            private String agentId; 
            private String createdAt; 
            private String id; 
            private String name; 
            private ScheduledTask scheduledTask; 
            private String sessionId; 
            private String sessionType; 
            private String status; 
            private String updatedAt; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.activeTurn = model.activeTurn;
                this.activeTurnId = model.activeTurnId;
                this.agentId = model.agentId;
                this.createdAt = model.createdAt;
                this.id = model.id;
                this.name = model.name;
                this.scheduledTask = model.scheduledTask;
                this.sessionId = model.sessionId;
                this.sessionType = model.sessionType;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
                this.userId = model.userId;
            } 

            /**
             * <p>The information about the execution that currently occupies the session.</p>
             */
            public Builder activeTurn(ActiveTurn activeTurn) {
                this.activeTurn = activeTurn;
                return this;
            }

            /**
             * <p>The ID of the execution that currently occupies the session. This field is empty when there is no active execution.</p>
             * 
             * <strong>example:</strong>
             * <p>t001</p>
             */
            public Builder activeTurnId(String activeTurnId) {
                this.activeTurnId = activeTurnId;
                return this;
            }

            /**
             * <p>The agent identifier of the session. The current executor is subject to activeTurn.agentId.</p>
             * 
             * <strong>example:</strong>
             * <p>sysagent</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The time when the session was created, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:00:00+08:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s001</p>
             */
            public Builder id(String id) {
                this.id = id;
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
             * <p>The snapshot information when the scheduled task is triggered. This field is returned only for scheduled task sessions and is empty for sessions from other sources.</p>
             */
            public Builder scheduledTask(ScheduledTask scheduledTask) {
                this.scheduledTask = scheduledTask;
                return this;
            }

            /**
             * <p>The session ID. Use this value when sending questions, querying history, and deleting sessions later.</p>
             * 
             * <strong>example:</strong>
             * <p>s001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The source from which the session was created. Valid values:</p>
             * <ul>
             * <li>openapi: Proactive call.</li>
             * <li>cron: Scheduled task.</li>
             * <li>im_dingtalk: DingTalk.</li>
             * <li>im_feishu: Lark.</li>
             * <li>alert: Alert.
             * This value is determined by the server and is not changed by subsequent follow-up questions.</li>
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
             * <li>active: Not archived.</li>
             * <li>archived: Archived.
             * This field does not indicate whether the execution has ended.</li>
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
             * <p>2026-09-09T09:02:00+08:00</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The ID of the user to whom the session belongs. This value is determined by the server based on the caller identity and is not used as a parameter for the client to specify the identity.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCopilotSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCopilotSessionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxResults")
        private Long maxResults;

        @com.aliyun.core.annotation.NameInMap("nextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("sessions")
        private java.util.List<Sessions> sessions;

        private Data(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.sessions = builder.sessions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return maxResults
         */
        public Long getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return sessions
         */
        public java.util.List<Sessions> getSessions() {
            return this.sessions;
        }

        public static final class Builder {
            private Long maxResults; 
            private String nextToken; 
            private java.util.List<Sessions> sessions; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.sessions = model.sessions;
            } 

            /**
             * <p>The page size used for the current request.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxResults(Long maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The pagination token for the next page. Pass this value back as is in the next request. An empty value indicates that there are no more pages.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The session list.</p>
             */
            public Builder sessions(java.util.List<Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
