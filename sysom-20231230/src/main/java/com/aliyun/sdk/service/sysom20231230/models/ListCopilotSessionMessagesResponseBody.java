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
 * {@link ListCopilotSessionMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCopilotSessionMessagesResponseBody</p>
 */
public class ListCopilotSessionMessagesResponseBody extends TeaModel {
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

    private ListCopilotSessionMessagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCopilotSessionMessagesResponseBody create() {
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

        private Builder(ListCopilotSessionMessagesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned status code. Success indicates that the request is successful. Other values indicate that the request fails.</p>
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
         * <p>The historical compatibility field, which may be omitted. Use data.maxResults instead.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The error message. If the code is Success, this field is empty. Otherwise, this field contains the request error message.</p>
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

        public ListCopilotSessionMessagesResponseBody build() {
            return new ListCopilotSessionMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCopilotSessionMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCopilotSessionMessagesResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Content(Builder builder) {
            this.text = builder.text;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * <p>The readable text content in the event. This field is empty when no readable string is available.</p>
             * 
             * <strong>example:</strong>
             * <p>Checking</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The event type, such as USER_MESSAGE, TEXT_MESSAGE_CONTENT, or TOOL_CALL_ARGS. This is not fixed to text.</p>
             * 
             * <strong>example:</strong>
             * <p>TEXT_MESSAGE_CONTENT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCopilotSessionMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCopilotSessionMessagesResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("eventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("finishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private Object metadata;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("turnId")
        private String turnId;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Object usage;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.createdAt = builder.createdAt;
            this.eventId = builder.eventId;
            this.finishedAt = builder.finishedAt;
            this.id = builder.id;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.role = builder.role;
            this.turnId = builder.turnId;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metadata
         */
        public Object getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return turnId
         */
        public String getTurnId() {
            return this.turnId;
        }

        /**
         * @return usage
         */
        public Object getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private String createdAt; 
            private String eventId; 
            private String finishedAt; 
            private String id; 
            private Object metadata; 
            private String name; 
            private String role; 
            private String turnId; 
            private Object usage; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.createdAt = model.createdAt;
                this.eventId = model.eventId;
                this.finishedAt = model.finishedAt;
                this.id = model.id;
                this.metadata = model.metadata;
                this.name = model.name;
                this.role = model.role;
                this.turnId = model.turnId;
                this.usage = model.usage;
            } 

            /**
             * <p>The human-readable content summary of the event. To restore the complete interactive interface, use the original event in metadata.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The creation time of the historical event record, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:00:00+08:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The event position within the session, used for sorting and deduplication.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>Currently returns an empty string. Do not use this field to determine whether the execution has finished.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The ID of the historical event record.</p>
             * 
             * <strong>example:</strong>
             * <p>record-001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The complete original event object. The internal fields retain their original protocol names, without recursive naming conversion or the need for further JSON string parsing.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;TEXT_MESSAGE_CONTENT&quot;,&quot;messageId&quot;:&quot;m001&quot;,&quot;delta&quot;:&quot;Checking.&quot;}</p>
             */
            public Builder metadata(Object metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>Currently returns an empty string. Do not use this field to identify the event type.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The role in the original event. Returns an empty string when the event does not contain a role.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The ID of the associated execution. This field is empty when there is no associated execution.</p>
             * 
             * <strong>example:</strong>
             * <p>t001</p>
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            /**
             * <p>The per-event token usage. This data is not currently returned. To query the cumulative usage of an execution, call GetCopilotSession.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder usage(Object usage) {
                this.usage = usage;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCopilotSessionMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCopilotSessionMessagesResponseBody</p>
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
             * <p>The ID of the current scheduled execution. Multiple triggers of the same scheduled task use different runIds.</p>
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
             * <p>The time when Copilot starts processing the current schedule, in ISO 8601 format with time zone. This is not the time when the model outputs the first token.</p>
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
     * {@link ListCopilotSessionMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCopilotSessionMessagesResponseBody</p>
     */
    public static class Session extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Session(Builder builder) {
            this.agentId = builder.agentId;
            this.createdAt = builder.createdAt;
            this.id = builder.id;
            this.name = builder.name;
            this.scheduledTask = builder.scheduledTask;
            this.sessionId = builder.sessionId;
            this.sessionType = builder.sessionType;
            this.updatedAt = builder.updatedAt;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Session create() {
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
            private String agentId; 
            private String createdAt; 
            private String id; 
            private String name; 
            private ScheduledTask scheduledTask; 
            private String sessionId; 
            private String sessionType; 
            private String updatedAt; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Session model) {
                this.agentId = model.agentId;
                this.createdAt = model.createdAt;
                this.id = model.id;
                this.name = model.name;
                this.scheduledTask = model.scheduledTask;
                this.sessionId = model.sessionId;
                this.sessionType = model.sessionType;
                this.updatedAt = model.updatedAt;
                this.userId = model.userId;
            } 

            /**
             * <p>The agent identifier in the session summary, which does not represent the current executor. The current executor is subject to activeTurn.agentId.</p>
             * 
             * <strong>example:</strong>
             * <p>sysagent</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The session creation time, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-09T09:00:00+08:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The session ID, which is the same as sessionId. Use sessionId to initiate subsequent requests.</p>
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
             * <p>The snapshot information when the scheduled task is triggered. This field is returned only for scheduled task sessions and is empty for sessions from other sources. Subsequent renaming or deletion of the task does not change the historical snapshot.</p>
             */
            public Builder scheduledTask(ScheduledTask scheduledTask) {
                this.scheduledTask = scheduledTask;
                return this;
            }

            /**
             * <p>The session ID. Use this value when sending subsequent questions, querying history, and deleting sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>s001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The source of session creation. Valid values:</p>
             * <ul>
             * <li>openapi: active call</li>
             * <li>cron: scheduled task</li>
             * <li>im_dingtalk: DingTalk</li>
             * <li>im_feishu: Lark</li>
             * <li>alert: alert
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
             * <p>The last update time of the session, in ISO 8601 format.</p>
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

            public Session build() {
                return new Session(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCopilotSessionMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCopilotSessionMessagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cursor")
        @com.aliyun.core.annotation.Validation(maxLength = 19, minLength = 1)
        private String cursor;

        @com.aliyun.core.annotation.NameInMap("hasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("maxResults")
        private Long maxResults;

        @com.aliyun.core.annotation.NameInMap("messages")
        private java.util.List<Messages> messages;

        @com.aliyun.core.annotation.NameInMap("nextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("session")
        private Session session;

        private Data(Builder builder) {
            this.cursor = builder.cursor;
            this.hasMore = builder.hasMore;
            this.maxResults = builder.maxResults;
            this.messages = builder.messages;
            this.nextToken = builder.nextToken;
            this.session = builder.session;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cursor
         */
        public String getCursor() {
            return this.cursor;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return maxResults
         */
        public Long getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return session
         */
        public Session getSession() {
            return this.session;
        }

        public static final class Builder {
            private String cursor; 
            private Boolean hasMore; 
            private Long maxResults; 
            private java.util.List<Messages> messages; 
            private String nextToken; 
            private Session session; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cursor = model.cursor;
                this.hasMore = model.hasMore;
                this.maxResults = model.maxResults;
                this.messages = model.messages;
                this.nextToken = model.nextToken;
                this.session = model.session;
            } 

            /**
             * <p>The cursor of the last event on the current page, returned as a decimal string. The value is 0 for an empty page. This is not the pagination nextToken and does not indicate that a round of execution has finished.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder cursor(String cursor) {
                this.cursor = cursor;
                return this;
            }

            /**
             * <p>Indicates whether there are subsequent historical events. Valid values:</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No.</li>
             * </ul>
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>The page size used in the current request.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxResults(Long maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The historical event records on the current page, sorted in ascending order by eventId. A record does not necessarily represent a complete chat message and may be a chunk of text or a tool invoke.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>The token for the next page. Pass this token back as is in the next request. An empty value indicates that there is no next page.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The session summary of the current user. This object does not contain the active execution summary. To query the execution status, call GetCopilotSession.</p>
             */
            public Builder session(Session session) {
                this.session = session;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
