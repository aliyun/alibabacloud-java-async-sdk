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
 * {@link UpdateMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMemoryResponseBody</p>
 */
public class UpdateMemoryResponseBody extends TeaModel {
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

    private UpdateMemoryResponseBody(Builder builder) {
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

    public static UpdateMemoryResponseBody create() {
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

        private Builder(UpdateMemoryResponseBody model) {
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
         * <p>The updated memory.</p>
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

        public UpdateMemoryResponseBody build() {
            return new UpdateMemoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMemoryResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("text")
        @com.aliyun.core.annotation.Validation(required = true)
        private String text;

        private Content(Builder builder) {
            this.text = builder.text;
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

        public static final class Builder {
            private String text; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.text = model.text;
            } 

            /**
             * <p>The memory text.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>The user enjoys hiking</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMemoryResponseBody</p>
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
             * <p>The agent ID. The length is limited to 1 to 128 UTF-8 bytes. The ID cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with an agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-001</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The session ID. The length is limited to 1 to 128 UTF-8 bytes. The ID cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a session ID.</p>
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
             * <p>The user ID. The length is limited to 1 to 128 UTF-8 bytes. The ID cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a user ID.</p>
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
     * {@link UpdateMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMemoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("memoryId")
        private String memoryId;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, String> metadata;

        @com.aliyun.core.annotation.NameInMap("scope")
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("valid")
        private Boolean valid;

        private Data(Builder builder) {
            this.content = builder.content;
            this.createdAt = builder.createdAt;
            this.memoryId = builder.memoryId;
            this.metadata = builder.metadata;
            this.scope = builder.scope;
            this.source = builder.source;
            this.type = builder.type;
            this.updatedAt = builder.updatedAt;
            this.valid = builder.valid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return memoryId
         */
        public String getMemoryId() {
            return this.memoryId;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        /**
         * @return scope
         */
        public Scope getScope() {
            return this.scope;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return valid
         */
        public Boolean getValid() {
            return this.valid;
        }

        public static final class Builder {
            private Content content; 
            private String createdAt; 
            private String memoryId; 
            private java.util.Map<String, String> metadata; 
            private Scope scope; 
            private String source; 
            private String type; 
            private String updatedAt; 
            private Boolean valid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.createdAt = model.createdAt;
                this.memoryId = model.memoryId;
                this.metadata = model.metadata;
                this.scope = model.scope;
                this.source = model.source;
                this.type = model.type;
                this.updatedAt = model.updatedAt;
                this.valid = model.valid;
            } 

            /**
             * <p>The memory content.</p>
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The creation time. The time is in RFC 3339 format. The Z at the end of the example indicates the UTC time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The ID of the long-term memory.</p>
             * 
             * <strong>example:</strong>
             * <p>mem-2f5f9c5a8d0e4c3b</p>
             */
            public Builder memoryId(String memoryId) {
                this.memoryId = memoryId;
                return this;
            }

            /**
             * <p>The memory metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The memory scope.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The memory source. Valid values: session_extraction: Extracted from session events. content_extraction: Extracted from text or messages. direct: Written directly.</p>
             * 
             * <strong>example:</strong>
             * <p>session_extraction</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The memory content type. Valid values: semantic: Semantic memory. skill: Skill. user_profile: User preference. session_summary: Session summary.</p>
             * 
             * <strong>example:</strong>
             * <p>semantic</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The last updated time. The time is in RFC 3339 format. The Z at the end of the example indicates the UTC time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:05:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>Indicates whether the memory is valid. A value of false indicates that the memory is revoked and is not included in valid memory retrieval.</p>
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
