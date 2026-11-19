// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryTaskResponseBody</p>
 */
public class GetMemoryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetMemoryTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryTaskResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMemoryTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The task details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01A00000-0000-0000-0000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMemoryTaskResponseBody build() {
            return new GetMemoryTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class Changes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("memoryId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String memoryId;

        @com.aliyun.core.annotation.NameInMap("operation")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operation;

        private Changes(Builder builder) {
            this.memoryId = builder.memoryId;
            this.operation = builder.operation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Changes create() {
            return builder().build();
        }

        /**
         * @return memoryId
         */
        public String getMemoryId() {
            return this.memoryId;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        public static final class Builder {
            private String memoryId; 
            private String operation; 

            private Builder() {
            } 

            private Builder(Changes model) {
                this.memoryId = model.memoryId;
                this.operation = model.operation;
            } 

            /**
             * <p>The unique identifier of the memory.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mem-2f5f9c5a8d0e4c3b</p>
             */
            public Builder memoryId(String memoryId) {
                this.memoryId = memoryId;
                return this;
            }

            /**
             * <p>The memory change type. Valid values:</p>
             * <ul>
             * <li>ADD: Adds a memory.</li>
             * <li>UPDATE: Updates a memory.</li>
             * <li>DELETE: Deletes a memory.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ADD</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            public Changes build() {
                return new Changes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The task error code.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>UnknownError</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The task error message.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Memory extraction failed.</p>
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
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arguments")
        private Object arguments;

        @com.aliyun.core.annotation.NameInMap("callId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        private Content(Builder builder) {
            this.arguments = builder.arguments;
            this.callId = builder.callId;
            this.format = builder.format;
            this.name = builder.name;
            this.text = builder.text;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public Object getArguments() {
            return this.arguments;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private Object arguments; 
            private String callId; 
            private String format; 
            private String name; 
            private String text; 
            private String type; 
            private Object value; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.arguments = model.arguments;
                this.callId = model.callId;
                this.format = model.format;
                this.name = model.name;
                this.text = model.text;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The tool invocation parameters. This field is required for tool_call content blocks and supports JSON values.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;city&quot;:&quot;Hangzhou&quot;}</p>
             */
            public Builder arguments(Object arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * <p>The tool invocation ID. This field is required for tool_call content blocks and is used to associate subsequent tool messages.</p>
             * 
             * <strong>example:</strong>
             * <p>call-001</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The data format identifier for the opaque content block. A non-empty string is required.</p>
             * 
             * <strong>example:</strong>
             * <p>application/json</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The tool name. This field is required for the tool_call type.</p>
             * 
             * <strong>example:</strong>
             * <p>get_weather</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The text of the text or reasoning content block. This field is required and can be an empty string.</p>
             * 
             * <strong>example:</strong>
             * <p>The user likes hiking</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The type of the message content block. Valid values: text, reasoning, tool_call, json, and opaque.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The data carried by the content block. This field is required for json and opaque content blocks and supports JSON values.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;preference&quot;:&quot;hiking&quot;}</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class ParentScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("teamId")
        private String teamId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private ParentScope(Builder builder) {
            this.agentId = builder.agentId;
            this.sessionId = builder.sessionId;
            this.teamId = builder.teamId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParentScope create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return teamId
         */
        public String getTeamId() {
            return this.teamId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agentId; 
            private String sessionId; 
            private String teamId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ParentScope model) {
                this.agentId = model.agentId;
                this.sessionId = model.sessionId;
                this.teamId = model.teamId;
                this.userId = model.userId;
            } 

            /**
             * <p>The agent ID defined by the caller. If provided, it cannot be empty and can contain up to 128 UTF-8 bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-001</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The session ID defined by the caller. If provided, it cannot be empty and can contain up to 128 UTF-8 bytes.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>session-001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The business team ID defined by the caller. If provided, it cannot be empty and can contain up to 128 UTF-8 bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>team-001</p>
             */
            public Builder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            /**
             * <p>The business user ID defined by the caller. If provided, it cannot be empty and can contain up to 128 UTF-8 bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>user-001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ParentScope build() {
                return new ParentScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class EventsData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("callId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("eventIds")
        private java.util.List<String> eventIds;

        @com.aliyun.core.annotation.NameInMap("parentEventId")
        private String parentEventId;

        @com.aliyun.core.annotation.NameInMap("parentScope")
        private ParentScope parentScope;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        private EventsData(Builder builder) {
            this.callId = builder.callId;
            this.content = builder.content;
            this.eventIds = builder.eventIds;
            this.parentEventId = builder.parentEventId;
            this.parentScope = builder.parentScope;
            this.role = builder.role;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventsData create() {
            return builder().build();
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return eventIds
         */
        public java.util.List<String> getEventIds() {
            return this.eventIds;
        }

        /**
         * @return parentEventId
         */
        public String getParentEventId() {
            return this.parentEventId;
        }

        /**
         * @return parentScope
         */
        public ParentScope getParentScope() {
            return this.parentScope;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private String callId; 
            private java.util.List<Content> content; 
            private java.util.List<String> eventIds; 
            private String parentEventId; 
            private ParentScope parentScope; 
            private String role; 
            private String summary; 

            private Builder() {
            } 

            private Builder(EventsData model) {
                this.callId = model.callId;
                this.content = model.content;
                this.eventIds = model.eventIds;
                this.parentEventId = model.parentEventId;
                this.parentScope = model.parentScope;
                this.role = model.role;
                this.summary = model.summary;
            } 

            /**
             * <p>The tool invocation ID. It is used to associate a tool invocation with its response message.</p>
             * 
             * <strong>example:</strong>
             * <p>call-001</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The list of message content blocks. This field is required and can be an empty array.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The list of visible event IDs referenced by the summary. This field cannot be empty.</p>
             */
            public Builder eventIds(java.util.List<String> eventIds) {
                this.eventIds = eventIds;
                return this;
            }

            /**
             * <p>The event ID that serves as the cutoff position for historical references in the parent session.</p>
             * 
             * <strong>example:</strong>
             * <p>evt-2f5f9c5a8d0e4c3b</p>
             */
            public Builder parentEventId(String parentEventId) {
                this.parentEventId = parentEventId;
                return this;
            }

            /**
             * <p>The full association scope of the parent session. Each dimension must be consistent with those specified when the parent session was created.</p>
             */
            public Builder parentScope(ParentScope parentScope) {
                this.parentScope = parentScope;
                return this;
            }

            /**
             * <p>The message role. Valid values: system, developer, user, assistant, and tool. The tool role also requires a callId.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The summary content for the referenced events. This field cannot be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>The user plans a weekend hiking trip</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public EventsData build() {
                return new EventsData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        @com.aliyun.core.annotation.Validation(required = true)
        private EventsData data;

        @com.aliyun.core.annotation.NameInMap("eventId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Events(Builder builder) {
            this.data = builder.data;
            this.eventId = builder.eventId;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public EventsData getData() {
            return this.data;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private EventsData data; 
            private String eventId; 
            private Long timestamp; 
            private String type; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.data = model.data;
                this.eventId = model.eventId;
                this.timestamp = model.timestamp;
                this.type = model.type;
            } 

            /**
             * <p>The event content. Select fields based on the event type. For message events, use role, content, and an optional callId. For compaction events, use eventIds and summary. For fork events, use parentScope and parentEventId. Do not mix fields from different event types.</p>
             * <p>This parameter is required.</p>
             */
            public Builder data(EventsData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The unique identifier of the event.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>evt-2f5f9c5a8d0e4c3b</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The actual occurrence time of the event in Unix milliseconds, provided by the caller.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1758614400000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The event type. Valid values:</p>
             * <ul>
             * <li>message: message</li>
             * <li>compaction: summary</li>
             * <li>fork: session branch</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>message</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("referenceTime")
        private String referenceTime;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.referenceTime = builder.referenceTime;
            this.role = builder.role;
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
        public String getContent() {
            return this.content;
        }

        /**
         * @return referenceTime
         */
        public String getReferenceTime() {
            return this.referenceTime;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String referenceTime; 
            private String role; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.referenceTime = model.referenceTime;
                this.role = model.role;
            } 

            /**
             * <p>The body content of the memory.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>The user likes hiking</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The reference time of this message in RFC 3339 format with time zone. If omitted, the request-level referenceTime is used. If both are omitted, the current request time is used.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-08T13:56:00+08:00</p>
             */
            public Builder referenceTime(String referenceTime) {
                this.referenceTime = referenceTime;
                return this;
            }

            /**
             * <p>The message role. For example, user indicates the user, and assistant indicates the assistant.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("events")
        private java.util.List<Events> events;

        @com.aliyun.core.annotation.NameInMap("messages")
        private java.util.List<Messages> messages;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, String> metadata;

        @com.aliyun.core.annotation.NameInMap("referenceTime")
        private String referenceTime;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Input(Builder builder) {
            this.events = builder.events;
            this.messages = builder.messages;
            this.metadata = builder.metadata;
            this.referenceTime = builder.referenceTime;
            this.text = builder.text;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return events
         */
        public java.util.List<Events> getEvents() {
            return this.events;
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        /**
         * @return referenceTime
         */
        public String getReferenceTime() {
            return this.referenceTime;
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
            private java.util.List<Events> events; 
            private java.util.List<Messages> messages; 
            private java.util.Map<String, String> metadata; 
            private String referenceTime; 
            private String text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.events = model.events;
                this.messages = model.messages;
                this.metadata = model.metadata;
                this.referenceTime = model.referenceTime;
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * <p>The list of session events to be processed.</p>
             */
            public Builder events(java.util.List<Events> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The list of messages to be processed.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>The string key-value tags set by the caller. A maximum of 16 tags are supported. A key can contain up to 64 Unicode characters, and a value can contain up to 1024 Unicode characters. Empty strings are allowed. Nested objects or arrays are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The reference time for interpreting relative times in the content, in RFC 3339 format with a time zone. If not provided, the time of the current request is used.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-08T13:56:00+08:00</p>
             */
            public Builder referenceTime(String referenceTime) {
                this.referenceTime = referenceTime;
                return this;
            }

            /**
             * <p>The raw text to be extracted for this task.</p>
             * 
             * <strong>example:</strong>
             * <p>The user likes hiking</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The input content format. Valid values:</p>
             * <ul>
             * <li>text: text</li>
             * <li>messages: message list</li>
             * <li>events: event list</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>events</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class Memories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("memoryId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String memoryId;

        private Memories(Builder builder) {
            this.memoryId = builder.memoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memories create() {
            return builder().build();
        }

        /**
         * @return memoryId
         */
        public String getMemoryId() {
            return this.memoryId;
        }

        public static final class Builder {
            private String memoryId; 

            private Builder() {
            } 

            private Builder(Memories model) {
                this.memoryId = model.memoryId;
            } 

            /**
             * <p>The long-term memory ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mem-2f5f9c5a8d0e4c3b</p>
             */
            public Builder memoryId(String memoryId) {
                this.memoryId = memoryId;
                return this;
            }

            public Memories build() {
                return new Memories(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class StrategyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private StrategyConfig(Builder builder) {
            this.instruction = builder.instruction;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StrategyConfig create() {
            return builder().build();
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String instruction; 
            private String type; 

            private Builder() {
            } 

            private Builder(StrategyConfig model) {
                this.instruction = model.instruction;
                this.type = model.type;
            } 

            /**
             * <p>The custom extraction instructions used to restrict the content to be retained. If a conflict occurs with the memory base extraction instructions, this rule prevails. The auto type does not support non-empty instructions.</p>
             * 
             * <strong>example:</strong>
             * <p>Retain only long-term preferences explicitly expressed by the user</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>The memory extraction strategy type. Valid values:</p>
             * <ul>
             * <li>auto: automatic extraction that currently generates semantic memories</li>
             * <li>semantic: semantic memory</li>
             * <li>skill: skill</li>
             * <li>user_profile: user preference</li>
             * <li>session_summary: session summary</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public StrategyConfig build() {
                return new StrategyConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("changes")
        private java.util.List<Changes> changes;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("finishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("inputMessageCount")
        private Long inputMessageCount;

        @com.aliyun.core.annotation.NameInMap("inputTokenCount")
        private Long inputTokenCount;

        @com.aliyun.core.annotation.NameInMap("memories")
        private java.util.List<Memories> memories;

        @com.aliyun.core.annotation.NameInMap("startedAt")
        private String startedAt;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("strategyConfig")
        private StrategyConfig strategyConfig;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        private Data(Builder builder) {
            this.changes = builder.changes;
            this.createdAt = builder.createdAt;
            this.error = builder.error;
            this.finishedAt = builder.finishedAt;
            this.input = builder.input;
            this.inputMessageCount = builder.inputMessageCount;
            this.inputTokenCount = builder.inputTokenCount;
            this.memories = builder.memories;
            this.startedAt = builder.startedAt;
            this.status = builder.status;
            this.strategyConfig = builder.strategyConfig;
            this.taskId = builder.taskId;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changes
         */
        public java.util.List<Changes> getChanges() {
            return this.changes;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        /**
         * @return inputMessageCount
         */
        public Long getInputMessageCount() {
            return this.inputMessageCount;
        }

        /**
         * @return inputTokenCount
         */
        public Long getInputTokenCount() {
            return this.inputTokenCount;
        }

        /**
         * @return memories
         */
        public java.util.List<Memories> getMemories() {
            return this.memories;
        }

        /**
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyConfig
         */
        public StrategyConfig getStrategyConfig() {
            return this.strategyConfig;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private java.util.List<Changes> changes; 
            private String createdAt; 
            private Error error; 
            private String finishedAt; 
            private Input input; 
            private Long inputMessageCount; 
            private Long inputTokenCount; 
            private java.util.List<Memories> memories; 
            private String startedAt; 
            private String status; 
            private StrategyConfig strategyConfig; 
            private String taskId; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.changes = model.changes;
                this.createdAt = model.createdAt;
                this.error = model.error;
                this.finishedAt = model.finishedAt;
                this.input = model.input;
                this.inputMessageCount = model.inputMessageCount;
                this.inputTokenCount = model.inputTokenCount;
                this.memories = model.memories;
                this.startedAt = model.startedAt;
                this.status = model.status;
                this.strategyConfig = model.strategyConfig;
                this.taskId = model.taskId;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>The list of memory changes generated by the task, excluding memories that are not modified.</p>
             */
            public Builder changes(java.util.List<Changes> changes) {
                this.changes = changes;
                return this;
            }

            /**
             * <p>The creation time in RFC 3339 format with time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The task error returned only when the status is FAILED or UNKNOWN. This does not indicate that the current query failed.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The task completion time in RFC 3339 format with time zone. This field is not returned if the task has not finished.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:01Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The input content processed by this task.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The number of messages, events, or text entries input for this task.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder inputMessageCount(Long inputMessageCount) {
                this.inputMessageCount = inputMessageCount;
                return this;
            }

            /**
             * <p>The number of tokens in the input content for this task.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder inputTokenCount(Long inputTokenCount) {
                this.inputTokenCount = inputTokenCount;
                return this;
            }

            /**
             * <p>Returned only when the task succeeds. An empty array is allowed.</p>
             */
            public Builder memories(java.util.List<Memories> memories) {
                this.memories = memories;
                return this;
            }

            /**
             * <p>The task start time in RFC 3339 format with time zone. This field is not returned if the task has not started.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00Z</p>
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * <p>The extraction task status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCEEDED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The extraction strategy used for this task.</p>
             */
            public Builder strategyConfig(StrategyConfig strategyConfig) {
                this.strategyConfig = strategyConfig;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>task-2f5f9c5a8d0e4c3b</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task trigger type. Valid values:</p>
             * <ul>
             * <li>AUTO: Automatically triggered by session events.</li>
             * <li>MANUAL: Triggered when writing to memory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUTO</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
