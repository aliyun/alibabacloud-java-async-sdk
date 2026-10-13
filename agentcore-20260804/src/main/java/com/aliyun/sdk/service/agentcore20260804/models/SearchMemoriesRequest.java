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
 * {@link SearchMemoriesRequest} extends {@link RequestModel}
 *
 * <p>SearchMemoriesRequest</p>
 */
public class SearchMemoriesRequest extends Request {
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
    private SearchMemoriesRequestBody body;

    private SearchMemoriesRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMemoriesRequest create() {
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
    public SearchMemoriesRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SearchMemoriesRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private SearchMemoriesRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(SearchMemoriesRequest request) {
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
         * <p>The MemoryStore name.</p>
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
         * <p>The semantic retrieval request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(SearchMemoriesRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public SearchMemoriesRequest build() {
            return new SearchMemoriesRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchMemoriesRequest} extends {@link TeaModel}
     *
     * <p>SearchMemoriesRequest</p>
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
             * <p>The agent ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain forward slashes (/) or asterisks (*). If the memory is not associated with an agent ID, this field is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-001</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The session ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain forward slashes (/) or asterisks (*). If the memory is not associated with a session ID, this field is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>session-001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The user ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain forward slashes (/) or asterisks (*). If the memory is not associated with a user ID, this field is not returned.</p>
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
     * {@link SearchMemoriesRequest} extends {@link TeaModel}
     *
     * <p>SearchMemoriesRequest</p>
     */
    public static class SearchMemoriesRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableRerank")
        private Boolean enableRerank;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, String> metadata;

        @com.aliyun.core.annotation.NameInMap("minScore")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Float minScore;

        @com.aliyun.core.annotation.NameInMap("minSimilarity")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Float minSimilarity;

        @com.aliyun.core.annotation.NameInMap("query")
        @com.aliyun.core.annotation.Validation(required = true)
        private String query;

        @com.aliyun.core.annotation.NameInMap("scope")
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("topK")
        @com.aliyun.core.annotation.Validation(maximum = 50)
        private Integer topK;

        private SearchMemoriesRequestBody(Builder builder) {
            this.enableRerank = builder.enableRerank;
            this.metadata = builder.metadata;
            this.minScore = builder.minScore;
            this.minSimilarity = builder.minSimilarity;
            this.query = builder.query;
            this.scope = builder.scope;
            this.topK = builder.topK;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchMemoriesRequestBody create() {
            return builder().build();
        }

        /**
         * @return enableRerank
         */
        public Boolean getEnableRerank() {
            return this.enableRerank;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        /**
         * @return minScore
         */
        public Float getMinScore() {
            return this.minScore;
        }

        /**
         * @return minSimilarity
         */
        public Float getMinSimilarity() {
            return this.minSimilarity;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return scope
         */
        public Scope getScope() {
            return this.scope;
        }

        /**
         * @return topK
         */
        public Integer getTopK() {
            return this.topK;
        }

        public static final class Builder {
            private Boolean enableRerank; 
            private java.util.Map<String, String> metadata; 
            private Float minScore; 
            private Float minSimilarity; 
            private String query; 
            private Scope scope; 
            private Integer topK; 

            private Builder() {
            } 

            private Builder(SearchMemoriesRequestBody model) {
                this.enableRerank = model.enableRerank;
                this.metadata = model.metadata;
                this.minScore = model.minScore;
                this.minSimilarity = model.minSimilarity;
                this.query = model.query;
                this.scope = model.scope;
                this.topK = model.topK;
            } 

            /**
             * <p>Specifies whether to enable reranking. Default value: true.</p>
             */
            public Builder enableRerank(Boolean enableRerank) {
                this.enableRerank = enableRerank;
                return this;
            }

            /**
             * <p>The string key-value metadata for exact match. You can specify up to 16 keys. Each key can be up to 64 characters in length, and each value can be up to 1,024 characters in length.</p>
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The minimum relevance score. Valid values: 0 to 1. Default value: 0.2. If both minScore and minSimilarity are specified, the AND logic is applied for filtering.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder minScore(Float minScore) {
                this.minScore = minScore;
                return this;
            }

            /**
             * <p>The minimum similarity. Valid values: 0 to 1. Default value: 0.3. If both minScore and minSimilarity are specified, the AND logic is applied for filtering.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder minSimilarity(Float minSimilarity) {
                this.minSimilarity = minSimilarity;
                return this;
            }

            /**
             * <p>The query text. The text can be up to 8,192 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>What sports does the user like?</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The retrieval scope. UserId, AgentId, and SessionId are all optional.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The number of results to return.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            public SearchMemoriesRequestBody build() {
                return new SearchMemoriesRequestBody(this);
            } 

        } 

    }
}
