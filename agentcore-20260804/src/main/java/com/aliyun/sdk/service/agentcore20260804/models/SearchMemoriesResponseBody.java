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
 * {@link SearchMemoriesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMemoriesResponseBody</p>
 */
public class SearchMemoriesResponseBody extends TeaModel {
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

    private SearchMemoriesResponseBody(Builder builder) {
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

    public static SearchMemoriesResponseBody create() {
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

        private Builder(SearchMemoriesResponseBody model) {
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
         * <p>The retrieval results.</p>
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

        public SearchMemoriesResponseBody build() {
            return new SearchMemoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMemoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoriesResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("text")
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
             * 
             * <strong>example:</strong>
             * <p>The user likes hiking</p>
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
     * {@link SearchMemoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoriesResponseBody</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Scope(Builder builder) {
            this.agentId = builder.agentId;
            this.sessionId = builder.sessionId;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agentId; 
            private String sessionId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Scope model) {
                this.agentId = model.agentId;
                this.sessionId = model.sessionId;
                this.userId = model.userId;
            } 

            /**
             * <p>The agent ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain a forward slash (/) or an asterisk (*). If the memory is not associated with an agent ID, this field is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-001</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The session ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain a forward slash (/) or an asterisk (*). If the memory is not associated with a session ID, this field is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>session-001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The user ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain a forward slash (/) or an asterisk (*). If the memory is not associated with a user ID, this field is not returned.</p>
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
     * {@link SearchMemoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoriesResponseBody</p>
     */
    public static class Memory extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Memory(Builder builder) {
            this.content = builder.content;
            this.createdAt = builder.createdAt;
            this.memoryId = builder.memoryId;
            this.metadata = builder.metadata;
            this.scope = builder.scope;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memory create() {
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
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Content content; 
            private String createdAt; 
            private String memoryId; 
            private java.util.Map<String, String> metadata; 
            private Scope scope; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Memory model) {
                this.content = model.content;
                this.createdAt = model.createdAt;
                this.memoryId = model.memoryId;
                this.metadata = model.metadata;
                this.scope = model.scope;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The memory content.</p>
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The time when the memory was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The long-term memory ID.</p>
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
             * <p>The time when the memory was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:05:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Memory build() {
                return new Memory(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMemoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoriesResponseBody</p>
     */
    public static class Memories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("memory")
        private Memory memory;

        @com.aliyun.core.annotation.NameInMap("score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("similarity")
        private Float similarity;

        private Memories(Builder builder) {
            this.memory = builder.memory;
            this.score = builder.score;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memories create() {
            return builder().build();
        }

        /**
         * @return memory
         */
        public Memory getMemory() {
            return this.memory;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return similarity
         */
        public Float getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private Memory memory; 
            private Float score; 
            private Float similarity; 

            private Builder() {
            } 

            private Builder(Memories model) {
                this.memory = model.memory;
                this.score = model.score;
                this.similarity = model.similarity;
            } 

            /**
             * <p>The matched memory.</p>
             */
            public Builder memory(Memory memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The relevance score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.86</p>
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The vector similarity.</p>
             * 
             * <strong>example:</strong>
             * <p>0.91</p>
             */
            public Builder similarity(Float similarity) {
                this.similarity = similarity;
                return this;
            }

            public Memories build() {
                return new Memories(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMemoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoriesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("memories")
        private java.util.List<Memories> memories;

        private Data(Builder builder) {
            this.memories = builder.memories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return memories
         */
        public java.util.List<Memories> getMemories() {
            return this.memories;
        }

        public static final class Builder {
            private java.util.List<Memories> memories; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.memories = model.memories;
            } 

            /**
             * <p>The list of retrieval results.</p>
             */
            public Builder memories(java.util.List<Memories> memories) {
                this.memories = memories;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
