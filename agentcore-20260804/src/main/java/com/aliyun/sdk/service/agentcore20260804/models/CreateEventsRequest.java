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
 * {@link CreateEventsRequest} extends {@link RequestModel}
 *
 * <p>CreateEventsRequest</p>
 */
public class CreateEventsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateEventsRequestBody body;

    private CreateEventsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return body
     */
    public CreateEventsRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateEventsRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private CreateEventsRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateEventsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
            this.body = request.body;
        } 

        /**
         * <p>The ID of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the memory store.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-memory</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>The JSON request body.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateEventsRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public CreateEventsRequest build() {
            return new CreateEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEventsRequest} extends {@link TeaModel}
     *
     * <p>CreateEventsRequest</p>
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
             * <p>The JSON parameter values. This field is required for tool_call blocks. Unparsed raw strings can be retained.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;city&quot;:&quot;Hangzhou&quot;}</p>
             */
            public Builder arguments(Object arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * <p>The logical call ID. This field is required for tool_call blocks.</p>
             * 
             * <strong>example:</strong>
             * <p>call-001</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The access format identifier. This field is required for opaque blocks. Saving the format does not mean that its content can be interpreted or used across platforms.</p>
             * 
             * <strong>example:</strong>
             * <p>application/json</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The tool name. This field is required for tool_call blocks. This content block only expresses the call intent.</p>
             * 
             * <strong>example:</strong>
             * <p>get_weather</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The actual text. This field is required for text and reasoning blocks.</p>
             * 
             * <strong>example:</strong>
             * <p>The user likes hiking</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The content block type. This field determines the required fields.</p>
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
             * <p>The JSON value. This field is required for json and opaque blocks. The data field is not used for opaque blocks.</p>
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
     * {@link CreateEventsRequest} extends {@link TeaModel}
     *
     * <p>CreateEventsRequest</p>
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
             * <p>The business agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-001</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The exact session ID.</p>
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
             * <p>The business team ID.</p>
             * 
             * <strong>example:</strong>
             * <p>team-001</p>
             */
            public Builder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            /**
             * <p>The business user ID. This is not the platform tenant identity.</p>
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
     * {@link CreateEventsRequest} extends {@link TeaModel}
     *
     * <p>CreateEventsRequest</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            private Builder(Data model) {
                this.callId = model.callId;
                this.content = model.content;
                this.eventIds = model.eventIds;
                this.parentEventId = model.parentEventId;
                this.parentScope = model.parentScope;
                this.role = model.role;
                this.summary = model.summary;
            } 

            /**
             * <p>The call ID. This field is required for tool_call and tool_result events, or message events with the role set to tool. It associates the call intent, actual execution, and feedback.</p>
             * 
             * <strong>example:</strong>
             * <p>call-001</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The ordered content blocks. This field is required for message and tool_result events. Use a text block for plain text. This can be an empty array if the tool has no output.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The list of visible event IDs referenced by the summary. This list cannot be empty.</p>
             */
            public Builder eventIds(java.util.List<String> eventIds) {
                this.eventIds = eventIds;
                return this;
            }

            /**
             * <p>The anchor event ID of the parent session. This field is required for session_fork events. The child session continues from the valid context at this anchor and does not inherit interactions after the anchor.</p>
             * 
             * <strong>example:</strong>
             * <p>evt-2f5f9c5a8d0e4c3b</p>
             */
            public Builder parentEventId(String parentEventId) {
                this.parentEventId = parentEventId;
                return this;
            }

            /**
             * <p>The business scope of the parent session. This field is required for session_fork events. The event is written to the child session, and the requested scope is the child session.</p>
             */
            public Builder parentScope(ParentScope parentScope) {
                this.parentScope = parentScope;
                return this;
            }

            /**
             * <p>The message role. This field is required for message events.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The human-readable summary. This field is optional for context_update events.</p>
             * 
             * <strong>example:</strong>
             * <p>The user plans to go hiking on the weekend</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventsRequest} extends {@link TeaModel}
     *
     * <p>CreateEventsRequest</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        @com.aliyun.core.annotation.Validation(required = true)
        private Data data;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Events(Builder builder) {
            this.data = builder.data;
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
        public Data getData() {
            return this.data;
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
            private Data data; 
            private Long timestamp; 
            private String type; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.data = model.data;
                this.timestamp = model.timestamp;
                this.type = model.type;
            } 

            /**
             * <p>The event-specific data. Use the corresponding fields based on the type. For conditional requirements, refer to the description of each field.</p>
             * <p>This parameter is required.</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The actual occurrence time provided by the client as a Unix timestamp in milliseconds. This is the only source for business sorting. Identical values do not indicate a known sequence, and the array position does not imply a business order.</p>
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
             * <p>The event type. This determines the applicable fields and conditional requirements for the data.</p>
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
     * {@link CreateEventsRequest} extends {@link TeaModel}
     *
     * <p>CreateEventsRequest</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("teamId")
        private String teamId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Scope(Builder builder) {
            this.agentId = builder.agentId;
            this.sessionId = builder.sessionId;
            this.teamId = builder.teamId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
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

            private Builder(Scope model) {
                this.agentId = model.agentId;
                this.sessionId = model.sessionId;
                this.teamId = model.teamId;
                this.userId = model.userId;
            } 

            /**
             * <p>The business agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-001</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The exact session ID.</p>
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
             * <p>The business team ID.</p>
             * 
             * <strong>example:</strong>
             * <p>team-001</p>
             */
            public Builder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            /**
             * <p>The business user ID. This is not the platform tenant identity.</p>
             * 
             * <strong>example:</strong>
             * <p>user-001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventsRequest} extends {@link TeaModel}
     *
     * <p>CreateEventsRequest</p>
     */
    public static class Session extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, String> metadata;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Session(Builder builder) {
            this.metadata = builder.metadata;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Session create() {
            return builder().build();
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.Map<String, String> metadata; 
            private String title; 

            private Builder() {
            } 

            private Builder(Session model) {
                this.metadata = model.metadata;
                this.title = model.title;
            } 

            /**
             * <p>The JSON metadata of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The session title. It can be up to 256 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>Travel plan</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Session build() {
                return new Session(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEventsRequest} extends {@link TeaModel}
     *
     * <p>CreateEventsRequest</p>
     */
    public static class CreateEventsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("events")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Events> events;

        @com.aliyun.core.annotation.NameInMap("scope")
        @com.aliyun.core.annotation.Validation(required = true)
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("session")
        private Session session;

        private CreateEventsRequestBody(Builder builder) {
            this.events = builder.events;
            this.scope = builder.scope;
            this.session = builder.session;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateEventsRequestBody create() {
            return builder().build();
        }

        /**
         * @return events
         */
        public java.util.List<Events> getEvents() {
            return this.events;
        }

        /**
         * @return scope
         */
        public Scope getScope() {
            return this.scope;
        }

        /**
         * @return session
         */
        public Session getSession() {
            return this.session;
        }

        public static final class Builder {
            private java.util.List<Events> events; 
            private Scope scope; 
            private Session session; 

            private Builder() {
            } 

            private Builder(CreateEventsRequestBody model) {
                this.events = model.events;
                this.scope = model.scope;
                this.session = model.session;
            } 

            /**
             * <p>A list of 1 to 100 events. The request body cannot exceed 1 MiB.</p>
             * <p>This parameter is required.</p>
             */
            public Builder events(java.util.List<Events> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The exact session to which all events belong.</p>
             * <p>This parameter is required.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The information saved when the first event is successfully written. It is not overwritten by subsequent writes.</p>
             */
            public Builder session(Session session) {
                this.session = session;
                return this;
            }

            public CreateEventsRequestBody build() {
                return new CreateEventsRequestBody(this);
            } 

        } 

    }
}
