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
             * <p>The agent ID. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with an agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-001</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The session ID. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>session-001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The business team ID defined by the caller. If provided, it cannot be empty and can be up to 128 UTF-8 bytes in length.</p>
             * 
             * <strong>example:</strong>
             * <p>team-001</p>
             */
            public Builder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            /**
             * <p>The user ID. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a user ID.</p>
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
        private Float minScore;

        @com.aliyun.core.annotation.NameInMap("minSimilarity")
        private Float minSimilarity;

        @com.aliyun.core.annotation.NameInMap("query")
        @com.aliyun.core.annotation.Validation(required = true)
        private String query;

        @com.aliyun.core.annotation.NameInMap("scope")
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("topK")
        private Integer topK;

        @com.aliyun.core.annotation.NameInMap("types")
        private java.util.List<String> types;

        private SearchMemoriesRequestBody(Builder builder) {
            this.enableRerank = builder.enableRerank;
            this.metadata = builder.metadata;
            this.minScore = builder.minScore;
            this.minSimilarity = builder.minSimilarity;
            this.query = builder.query;
            this.scope = builder.scope;
            this.topK = builder.topK;
            this.types = builder.types;
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

        /**
         * @return types
         */
        public java.util.List<String> getTypes() {
            return this.types;
        }

        public static final class Builder {
            private Boolean enableRerank; 
            private java.util.Map<String, String> metadata; 
            private Float minScore; 
            private Float minSimilarity; 
            private String query; 
            private Scope scope; 
            private Integer topK; 
            private java.util.List<String> types; 

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
                this.types = model.types;
            } 

            /**
             * <p>Specifies whether to enable reranking. Default value: true.</p>
             */
            public Builder enableRerank(Boolean enableRerank) {
                this.enableRerank = enableRerank;
                return this;
            }

            /**
             * <p>The string key-value metadata for exact matching. A maximum of 16 keys are supported. Each key can be up to 64 characters in length, and each value can be up to 1,024 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, String> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The minimum relevance score. Default value: 0.2. Valid values: 0 to 1. If both minScore and minSimilarity are specified, the results are filtered based on the AND logic.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder minScore(Float minScore) {
                this.minScore = minScore;
                return this;
            }

            /**
             * <p>The minimum similarity score. Default value: 0.3. Valid values: 0 to 1. If both minSimilarity and minScore are specified, the results are filtered based on the AND logic.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder minSimilarity(Float minSimilarity) {
                this.minSimilarity = minSimilarity;
                return this;
            }

            /**
             * <p>The query text for retrieval, up to 8,192 characters.</p>
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

            /**
             * <p>The list of memory content types. Supported types include semantic, skill, user_profile, and session_summary. If omitted or left as an empty array, no type restriction is applied.</p>
             */
            public Builder types(java.util.List<String> types) {
                this.types = types;
                return this;
            }

            public SearchMemoriesRequestBody build() {
                return new SearchMemoriesRequestBody(this);
            } 

        } 

    }
}
