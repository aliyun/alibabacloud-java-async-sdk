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
 * {@link AddMemoriesRequest} extends {@link RequestModel}
 *
 * <p>AddMemoriesRequest</p>
 */
public class AddMemoriesRequest extends Request {
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
    private AddMemoriesRequestBody body;

    private AddMemoriesRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMemoriesRequest create() {
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
    public AddMemoriesRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<AddMemoriesRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private AddMemoriesRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(AddMemoriesRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
            this.body = request.body;
        } 

        /**
         * <p>The AgentCore workspace ID.</p>
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
         * <p>The write memory request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(AddMemoriesRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public AddMemoriesRequest build() {
            return new AddMemoriesRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddMemoriesRequest} extends {@link TeaModel}
     *
     * <p>AddMemoriesRequest</p>
     */
    public static class Memories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, String> metadata;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Memories(Builder builder) {
            this.metadata = builder.metadata;
            this.text = builder.text;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memories create() {
            return builder().build();
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
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
            private java.util.Map<String, String> metadata; 
            private String text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Memories model) {
                this.metadata = model.metadata;
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * <p>The string key-value tags set by the caller. A maximum of 16 tags are supported. A key can be up to 64 Unicode characters in length, and a value can be up to 1,024 Unicode characters in length. Empty strings are allowed. Nested objects or arrays are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The content of the memory to be directly written. It cannot be empty and can be up to 32,000 UTF-8 bytes in length.</p>
             * 
             * <strong>example:</strong>
             * <p>The user likes hiking</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The content type of the memory. Valid values: semantic for semantic memory, skill for skill, user_profile for user preference, and session_summary for session summary.</p>
             * 
             * <strong>example:</strong>
             * <p>semantic</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Memories build() {
                return new Memories(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddMemoriesRequest} extends {@link TeaModel}
     *
     * <p>AddMemoriesRequest</p>
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
             * <p>The content of the message.</p>
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
             * <p>The reference time of the message in RFC 3339 format with a time zone. If omitted, the request-level referenceTime is used. If both are omitted, the time of the current request is used.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-08T13:56:00+08:00</p>
             */
            public Builder referenceTime(String referenceTime) {
                this.referenceTime = referenceTime;
                return this;
            }

            /**
             * <p>The role of the message.</p>
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
     * {@link AddMemoriesRequest} extends {@link TeaModel}
     *
     * <p>AddMemoriesRequest</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("sessionId")
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
             * <p>The agent ID. The length is limited to 1 to 128 UTF-8 bytes. It cannot contain a forward slash (/) or an asterisk (*).</p>
             * 
             * <strong>example:</strong>
             * <p>agent-001</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The session ID. The length is limited to 1 to 128 UTF-8 bytes. It cannot contain a forward slash (/) or an asterisk (*).</p>
             * 
             * <strong>example:</strong>
             * <p>session-001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The business team ID defined by the caller. It cannot be empty when provided and can be up to 128 UTF-8 bytes in length.</p>
             * 
             * <strong>example:</strong>
             * <p>team-001</p>
             */
            public Builder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            /**
             * <p>The user ID. The length is limited to 1 to 128 UTF-8 bytes. It cannot contain a forward slash (/) or an asterisk (*).</p>
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
     * {@link AddMemoriesRequest} extends {@link TeaModel}
     *
     * <p>AddMemoriesRequest</p>
     */
    public static class AddMemoriesRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extract")
        private Boolean extract;

        @com.aliyun.core.annotation.NameInMap("memories")
        private java.util.List<Memories> memories;

        @com.aliyun.core.annotation.NameInMap("messages")
        private java.util.List<Messages> messages;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, String> metadata;

        @com.aliyun.core.annotation.NameInMap("referenceTime")
        private String referenceTime;

        @com.aliyun.core.annotation.NameInMap("scope")
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("sync")
        private Boolean sync;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private AddMemoriesRequestBody(Builder builder) {
            this.extract = builder.extract;
            this.memories = builder.memories;
            this.messages = builder.messages;
            this.metadata = builder.metadata;
            this.referenceTime = builder.referenceTime;
            this.scope = builder.scope;
            this.sync = builder.sync;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddMemoriesRequestBody create() {
            return builder().build();
        }

        /**
         * @return extract
         */
        public Boolean getExtract() {
            return this.extract;
        }

        /**
         * @return memories
         */
        public java.util.List<Memories> getMemories() {
            return this.memories;
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
         * @return scope
         */
        public Scope getScope() {
            return this.scope;
        }

        /**
         * @return sync
         */
        public Boolean getSync() {
            return this.sync;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Boolean extract; 
            private java.util.List<Memories> memories; 
            private java.util.List<Messages> messages; 
            private java.util.Map<String, String> metadata; 
            private String referenceTime; 
            private Scope scope; 
            private Boolean sync; 
            private String text; 

            private Builder() {
            } 

            private Builder(AddMemoriesRequestBody model) {
                this.extract = model.extract;
                this.memories = model.memories;
                this.messages = model.messages;
                this.metadata = model.metadata;
                this.referenceTime = model.referenceTime;
                this.scope = model.scope;
                this.sync = model.sync;
                this.text = model.text;
            } 

            /**
             * <p>Specifies whether to extract memories. If omitted or set to true, memories are extracted from text or messages. If set to false, memories are directly written.</p>
             */
            public Builder extract(Boolean extract) {
                this.extract = extract;
                return this;
            }

            /**
             * <p>The list of memories to be directly written when extract is set to false. The list can contain 1 to 100 memories. You cannot provide text, messages, referenceTime, or request-level metadata at the same time.</p>
             */
            public Builder memories(java.util.List<Memories> memories) {
                this.memories = memories;
                return this;
            }

            /**
             * <p>The list of messages. You must provide either text or messages, but not both. The list can contain 1 to 20 messages, and the total length of the content cannot exceed 32,000 UTF-8 bytes.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>The string key-value metadata. A maximum of 16 keys are supported. A key can be up to 64 characters in length, and a value can be up to 1,024 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The time reference point for the batch of messages or text. It uses the RFC 3339 format with a time zone and supports fractional seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-08T13:56:00+08:00</p>
             */
            public Builder referenceTime(String referenceTime) {
                this.referenceTime = referenceTime;
                return this;
            }

            /**
             * <p>The write scope. UserId, AgentId, and SessionId are all optional.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>Specifies whether to synchronously wait for the memory extraction to complete. Default value: true.</p>
             */
            public Builder sync(Boolean sync) {
                this.sync = sync;
                return this;
            }

            /**
             * <p>The text to be directly written. You must provide either text or messages, but not both. The text cannot exceed 32,000 UTF-8 bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>The user likes hiking</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public AddMemoriesRequestBody build() {
                return new AddMemoriesRequestBody(this);
            } 

        } 

    }
}
