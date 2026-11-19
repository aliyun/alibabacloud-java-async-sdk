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
 * {@link ListEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventsResponseBody</p>
 */
public class ListEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListEventsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business result code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>The results on the current page.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of entries per page used in the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The request processing message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The next page token. An empty value indicates that all data has been read.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwMH0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>01A00000-0000-0000-0000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. For batch operations, you must still check the result of each item.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records. This field is empty if the exact total count is not provided.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEventsResponseBody build() {
            return new ListEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventsResponseBody</p>
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
             * <p>The JSON parameter values, which are required for tool_call blocks. Unparsed raw strings can be retained.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;city&quot;:&quot;Hangzhou&quot;}</p>
             */
            public Builder arguments(Object arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * <p>The logical call ID, which is required for tool_call blocks.</p>
             * 
             * <strong>example:</strong>
             * <p>call-001</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The access format identifier, which is required for opaque blocks. Saving the format does not mean its content can be interpreted or used across platforms.</p>
             * 
             * <strong>example:</strong>
             * <p>application/json</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The tool name, which is required for tool_call blocks. This content block only expresses the call intent.</p>
             * 
             * <strong>example:</strong>
             * <p>get_weather</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The actual text, which is required for text and reasoning blocks.</p>
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
             * <p>The JSON value, which is required for json and opaque blocks. The data field is not used for opaque blocks.</p>
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
     * {@link ListEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventsResponseBody</p>
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
     * {@link ListEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventsResponseBody</p>
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
             * <p>The call ID, which is required for tool_call, tool_result, or messages with role=tool. It associates the call intent, actual execution, and feedback.</p>
             * 
             * <strong>example:</strong>
             * <p>call-001</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The ordered content blocks, which are required for message and tool_result events. Use a text block for plain text. This can be an empty array if the tool has no output.</p>
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
             * <p>The parent session anchor, which is required for session_fork events. The child session continues from the valid context at this anchor and does not inherit interactions after the anchor.</p>
             * 
             * <strong>example:</strong>
             * <p>evt-2f5f9c5a8d0e4c3b</p>
             */
            public Builder parentEventId(String parentEventId) {
                this.parentEventId = parentEventId;
                return this;
            }

            /**
             * <p>The business positioning of the parent session, which is required for session_fork events. The event is written to the child session, and the requested scope is the child session.</p>
             */
            public Builder parentScope(ParentScope parentScope) {
                this.parentScope = parentScope;
                return this;
            }

            /**
             * <p>The message role, which is required for message events.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The readable summary, which is optional for context_update events.</p>
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
     * {@link ListEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventsResponseBody</p>
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
     * {@link ListEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        @com.aliyun.core.annotation.Validation(required = true)
        private Data data;

        @com.aliyun.core.annotation.NameInMap("eventId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("receivedAt")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long receivedAt;

        @com.aliyun.core.annotation.NameInMap("scope")
        @com.aliyun.core.annotation.Validation(required = true)
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Items(Builder builder) {
            this.data = builder.data;
            this.eventId = builder.eventId;
            this.receivedAt = builder.receivedAt;
            this.scope = builder.scope;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return receivedAt
         */
        public Long getReceivedAt() {
            return this.receivedAt;
        }

        /**
         * @return scope
         */
        public Scope getScope() {
            return this.scope;
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
            private String eventId; 
            private Long receivedAt; 
            private Scope scope; 
            private Long timestamp; 
            private String type; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.data = model.data;
                this.eventId = model.eventId;
                this.receivedAt = model.receivedAt;
                this.scope = model.scope;
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
             * <p>The stable event ID generated by the server. It is used for referencing, locating, and deleting events. It does not represent the business sequence, and no separate messageId is provided.</p>
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
             * <p>The time when the event reaches the server, in Unix milliseconds. It is used for asynchronous processing and not for historical business sorting.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1758614401000</p>
             */
            public Builder receivedAt(Long receivedAt) {
                this.receivedAt = receivedAt;
                return this;
            }

            /**
             * <p>The session to which the event belongs.</p>
             * <p>This parameter is required.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The actual occurrence time provided by the client, in Unix milliseconds. This is the only source for business sorting. Identical values do not indicate a known sequence, and the array position does not imply a business sequence.</p>
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
