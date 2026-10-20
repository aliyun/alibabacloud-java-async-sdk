// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link RetrieveRequest} extends {@link RequestModel}
 *
 * <p>RetrieveRequest</p>
 */
public class RetrieveRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DenseSimilarityTopK")
    private Integer denseSimilarityTopK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableReranking")
    private Boolean enableReranking;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableRewrite")
    private Boolean enableRewrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extra")
    private Extra extra;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List<String> images;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndexId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryHistory")
    private java.util.List<QueryHistory> queryHistory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rerank")
    private java.util.List<Rerank> rerank;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankMinScore")
    private Float rerankMinScore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankTopN")
    private Integer rerankTopN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rewrite")
    private java.util.List<Rewrite> rewrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaveRetrieverHistory")
    private Boolean saveRetrieverHistory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchFilters")
    private java.util.List<java.util.Map<String, String>> searchFilters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SparseSimilarityTopK")
    private Integer sparseSimilarityTopK;

    private RetrieveRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.denseSimilarityTopK = builder.denseSimilarityTopK;
        this.enableReranking = builder.enableReranking;
        this.enableRewrite = builder.enableRewrite;
        this.extra = builder.extra;
        this.images = builder.images;
        this.indexId = builder.indexId;
        this.query = builder.query;
        this.queryHistory = builder.queryHistory;
        this.rerank = builder.rerank;
        this.rerankMinScore = builder.rerankMinScore;
        this.rerankTopN = builder.rerankTopN;
        this.rewrite = builder.rewrite;
        this.saveRetrieverHistory = builder.saveRetrieverHistory;
        this.searchFilters = builder.searchFilters;
        this.sparseSimilarityTopK = builder.sparseSimilarityTopK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveRequest create() {
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
     * @return denseSimilarityTopK
     */
    public Integer getDenseSimilarityTopK() {
        return this.denseSimilarityTopK;
    }

    /**
     * @return enableReranking
     */
    public Boolean getEnableReranking() {
        return this.enableReranking;
    }

    /**
     * @return enableRewrite
     */
    public Boolean getEnableRewrite() {
        return this.enableRewrite;
    }

    /**
     * @return extra
     */
    public Extra getExtra() {
        return this.extra;
    }

    /**
     * @return images
     */
    public java.util.List<String> getImages() {
        return this.images;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return queryHistory
     */
    public java.util.List<QueryHistory> getQueryHistory() {
        return this.queryHistory;
    }

    /**
     * @return rerank
     */
    public java.util.List<Rerank> getRerank() {
        return this.rerank;
    }

    /**
     * @return rerankMinScore
     */
    public Float getRerankMinScore() {
        return this.rerankMinScore;
    }

    /**
     * @return rerankTopN
     */
    public Integer getRerankTopN() {
        return this.rerankTopN;
    }

    /**
     * @return rewrite
     */
    public java.util.List<Rewrite> getRewrite() {
        return this.rewrite;
    }

    /**
     * @return saveRetrieverHistory
     */
    public Boolean getSaveRetrieverHistory() {
        return this.saveRetrieverHistory;
    }

    /**
     * @return searchFilters
     */
    public java.util.List<java.util.Map<String, String>> getSearchFilters() {
        return this.searchFilters;
    }

    /**
     * @return sparseSimilarityTopK
     */
    public Integer getSparseSimilarityTopK() {
        return this.sparseSimilarityTopK;
    }

    public static final class Builder extends Request.Builder<RetrieveRequest, Builder> {
        private String workspaceId; 
        private Integer denseSimilarityTopK; 
        private Boolean enableReranking; 
        private Boolean enableRewrite; 
        private Extra extra; 
        private java.util.List<String> images; 
        private String indexId; 
        private String query; 
        private java.util.List<QueryHistory> queryHistory; 
        private java.util.List<Rerank> rerank; 
        private Float rerankMinScore; 
        private Integer rerankTopN; 
        private java.util.List<Rewrite> rewrite; 
        private Boolean saveRetrieverHistory; 
        private java.util.List<java.util.Map<String, String>> searchFilters; 
        private Integer sparseSimilarityTopK; 

        private Builder() {
            super();
        } 

        private Builder(RetrieveRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.denseSimilarityTopK = request.denseSimilarityTopK;
            this.enableReranking = request.enableReranking;
            this.enableRewrite = request.enableRewrite;
            this.extra = request.extra;
            this.images = request.images;
            this.indexId = request.indexId;
            this.query = request.query;
            this.queryHistory = request.queryHistory;
            this.rerank = request.rerank;
            this.rerankMinScore = request.rerankMinScore;
            this.rerankTopN = request.rerankTopN;
            this.rewrite = request.rewrite;
            this.saveRetrieverHistory = request.saveRetrieverHistory;
            this.searchFilters = request.searchFilters;
            this.sparseSimilarityTopK = request.sparseSimilarityTopK;
        } 

        /**
         * <p>The ID of the workspace to which the knowledge base belongs. For more information about how to obtain the ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3shx2gu255oqxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The top K value for AISearch. The system generates a vector for the input text and retrieves the top K text chunks in the knowledge base that are most similar to the vector representation. Valid values: 0 to 100.
         * The sum of DenseSimilarityTopK and SparseSimilarityTopK must be less than or equal to 200.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder denseSimilarityTopK(Integer denseSimilarityTopK) {
            this.putQueryParameter("DenseSimilarityTopK", denseSimilarityTopK);
            this.denseSimilarityTopK = denseSimilarityTopK;
            return this;
        }

        /**
         * <p>Specifies whether to enable reranking. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableReranking(Boolean enableReranking) {
            this.putQueryParameter("EnableReranking", enableReranking);
            this.enableReranking = enableReranking;
            return this;
        }

        /**
         * <p>Specifies whether to enable &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/model-studio/use-cases/rag-optimization#b7031e2ad6cji">multi-turn conversation rewriting</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/model-studio/use-cases/rag-optimization#b7031e2ad6cji">multi-turn conversation rewriting</a>.
         * Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableRewrite(Boolean enableRewrite) {
            this.putQueryParameter("EnableRewrite", enableRewrite);
            this.enableRewrite = enableRewrite;
            return this;
        }

        /**
         * Extra.
         */
        public Builder extra(Extra extra) {
            String extraShrink = shrink(extra, "Extra", "json");
            this.putQueryParameter("Extra", extraShrink);
            this.extra = extra;
            return this;
        }

        /**
         * <p>The URLs of the images passed in the query.</p>
         */
        public Builder images(java.util.List<String> images) {
            String imagesShrink = shrink(images, "Images", "simple");
            this.putQueryParameter("Images", imagesShrink);
            this.images = images;
            return this;
        }

        /**
         * <p>The ID of the knowledge base, which is the Data.Id returned by the CreateIndex operation.</p>
         * <blockquote>
         * <ul>
         * <li>Make sure that the corresponding knowledge base is created and not deleted.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5pwe0mxxxx</p>
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * <p>The input text, which is the original input prompt. The length and characters of Query are not limited.</p>
         * 
         * <strong>example:</strong>
         * <p>Introduction to Alibaba Cloud Model Studio</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/model-studio/use-cases/rag-optimization#b7031e2ad6cji">Multi-turn conversation rewriting</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/model-studio/use-cases/rag-optimization#b7031e2ad6cji">Multi-turn conversation rewriting</a> allows you to pass in your own managed conversation history. This parameter takes effect only when EnableRewrite is set to <strong>true</strong>. Otherwise, it does not take effect even if you specify it.</p>
         */
        public Builder queryHistory(java.util.List<QueryHistory> queryHistory) {
            String queryHistoryShrink = shrink(queryHistory, "QueryHistory", "json");
            this.putQueryParameter("QueryHistory", queryHistoryShrink);
            this.queryHistory = queryHistory;
            return this;
        }

        /**
         * <p>The reranking configuration.</p>
         */
        public Builder rerank(java.util.List<Rerank> rerank) {
            String rerankShrink = shrink(rerank, "Rerank", "json");
            this.putQueryParameter("Rerank", rerankShrink);
            this.rerank = rerank;
            return this;
        }

        /**
         * <p>The similarity threshold. This threshold specifies the minimum similarity score allowed for recalled text chunks and is used to filter the text chunks returned by the ranking model. Only text chunks with a score greater than this value are recalled. Valid values: 0.01 to 1.00. This parameter has a higher priority than the similarity threshold configured for the knowledge base.</p>
         * <p>If no specific value is specified, the similarity threshold configured for the knowledge base is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>0.20</p>
         */
        public Builder rerankMinScore(Float rerankMinScore) {
            this.putQueryParameter("RerankMinScore", rerankMinScore);
            this.rerankMinScore = rerankMinScore;
            return this;
        }

        /**
         * <p>The top N text chunks to return after reranking. Valid values: 1 to 20. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder rerankTopN(Integer rerankTopN) {
            this.putQueryParameter("RerankTopN", rerankTopN);
            this.rerankTopN = rerankTopN;
            return this;
        }

        /**
         * <p>The multi-turn conversation rewriting configuration.</p>
         */
        public Builder rewrite(java.util.List<Rewrite> rewrite) {
            String rewriteShrink = shrink(rewrite, "Rewrite", "json");
            this.putQueryParameter("Rewrite", rewriteShrink);
            this.rewrite = rewrite;
            return this;
        }

        /**
         * <p>Specifies whether to save the historical text chunk recall test data. Valid values:</p>
         * <ul>
         * <li>true: Save.</li>
         * <li>false: Do not save.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder saveRetrieverHistory(Boolean saveRetrieverHistory) {
            this.putQueryParameter("SaveRetrieverHistory", saveRetrieverHistory);
            this.saveRetrieverHistory = saveRetrieverHistory;
            return this;
        }

        /**
         * <p>The personalized retrieval conditions, such as tags, configured by using SearchFilter to filter semantic retrieval results and exclude information irrelevant to the query.
         * The filtering logic takes effect when the is_displayed_chunk_content parameter is set to true. For more information, see <a href="https://help.aliyun.com/document_detail/2869641.html">Knowledge base SearchFilters</a>.</p>
         */
        public Builder searchFilters(java.util.List<java.util.Map<String, String>> searchFilters) {
            String searchFiltersShrink = shrink(searchFilters, "SearchFilters", "json");
            this.putQueryParameter("SearchFilters", searchFiltersShrink);
            this.searchFilters = searchFilters;
            return this;
        }

        /**
         * <p>The top K value for keyword retrieval. The system retrieves chunks from the knowledge base that are an exact match for the keywords in the input text. This helps you filter out irrelevant text chunks and provides more accurate results.
         * Valid values: 0 to 100.
         * The sum of DenseSimilarityTopK and SparseSimilarityTopK must be less than or equal to 200.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder sparseSimilarityTopK(Integer sparseSimilarityTopK) {
            this.putQueryParameter("SparseSimilarityTopK", sparseSimilarityTopK);
            this.sparseSimilarityTopK = sparseSimilarityTopK;
            return this;
        }

        @Override
        public RetrieveRequest build() {
            return new RetrieveRequest(this);
        } 

    } 

    /**
     * 
     * {@link RetrieveRequest} extends {@link TeaModel}
     *
     * <p>RetrieveRequest</p>
     */
    public static class Extra extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("uniqueId")
        @com.aliyun.core.annotation.Validation(maxLength = 512)
        private String uniqueId;

        private Extra(Builder builder) {
            this.uniqueId = builder.uniqueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extra create() {
            return builder().build();
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        public static final class Builder {
            private String uniqueId; 

            private Builder() {
            } 

            private Builder(Extra model) {
                this.uniqueId = model.uniqueId;
            } 

            /**
             * uniqueId.
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            public Extra build() {
                return new Extra(this);
            } 

        } 

    }
    /**
     * 
     * {@link RetrieveRequest} extends {@link TeaModel}
     *
     * <p>RetrieveRequest</p>
     */
    public static class QueryHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private QueryHistory(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryHistory create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(QueryHistory model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>The question or answer content of the corresponding role.</p>
             * 
             * <strong>example:</strong>
             * <p>A piece of text</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The role.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>user: If this role is passed, content indicates the text that you input to the Alibaba Cloud Model Studio application.</li>
             * <li>assistant: If this role is passed, content indicates the reply from the Alibaba Cloud Model Studio application.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public QueryHistory build() {
                return new QueryHistory(this);
            } 

        } 

    }
    /**
     * 
     * {@link RetrieveRequest} extends {@link TeaModel}
     *
     * <p>RetrieveRequest</p>
     */
    public static class Rerank extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("RerankInstruct")
        private String rerankInstruct;

        @com.aliyun.core.annotation.NameInMap("RerankMode")
        private String rerankMode;

        private Rerank(Builder builder) {
            this.modelName = builder.modelName;
            this.rerankInstruct = builder.rerankInstruct;
            this.rerankMode = builder.rerankMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rerank create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return rerankInstruct
         */
        public String getRerankInstruct() {
            return this.rerankInstruct;
        }

        /**
         * @return rerankMode
         */
        public String getRerankMode() {
            return this.rerankMode;
        }

        public static final class Builder {
            private String modelName; 
            private String rerankInstruct; 
            private String rerankMode; 

            private Builder() {
            } 

            private Builder(Rerank model) {
                this.modelName = model.modelName;
                this.rerankInstruct = model.rerankInstruct;
                this.rerankMode = model.rerankMode;
            } 

            /**
             * <p>The specified reranking model. The value specified here overrides the reranking model selected when the knowledge base was created. Valid values:</p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <ul>
             * <li>qwen3-rerank-hybrid: qwen3-rerank (hybrid) reranking.</li>
             * <li>qwen3-rerank: qwen3-rerank reranking.</li>
             * <li>gte-rerank-hybrid: gte-rerank (hybrid) reranking.</li>
             * <li>gte-rerank: gte-rerank reranking.</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <ul>
             * <li>gte-rerank-hybrid: Official reranking.</li>
             * <li>gte-rerank: gte-rerank reranking.</li>
             * </ul>
             * <p>Default value: null. The reranking model selected when the knowledge base was created is used.</p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <blockquote>
             * <p>If you only need semantic reranking, use qwen3-rerank. If you need both semantic reranking and text matching features to ensure relevance, use qwen3-rerank-hybrid.</p>
             * </blockquote>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <blockquote>
             * <p>If you only need semantic reranking, use gte-rerank. If you need both semantic reranking and text matching features to ensure relevance, use gte-rerank-hybrid.</p>
             * </blockquote>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <blockquote>
             * <p>gte-rerank-hybrid and gte-rerank will no longer be updated and are not recommended.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>gte-rerank-hybrid</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not specify this parameter.</p>
             * <p>&lt;props=&quot;china&quot;&gt;A natural language instruction used to fine-tune the behavior of the reranking model.
             * <notice>This parameter takes effect only when rerank_mode is set to custom.</notice></p>
             * 
             * <strong>example:</strong>
             * <p>Given a web search query, retrieve relevant passages that answer the query.</p>
             */
            public Builder rerankInstruct(String rerankInstruct) {
                this.rerankInstruct = rerankInstruct;
                return this;
            }

            /**
             * <p>&lt;props=&quot;china&quot;&gt;
             * The instruction intervention mode of the reranking model, which determines its scoring preference.</p>
             * <p><strong>Valid values:</strong></p>
             * <ul>
             * <li><p><strong>qa</strong>: (Default) Q&amp;A mode. The model tends to assign higher scores to candidates that can directly answer the query. Recommended for Q&amp;A scenarios.</p>
             * </li>
             * <li><p><strong>similar</strong>: Similarity mode. The model tends to assign higher scores to candidates that are highly consistent with the query content. Recommended for matching and retrieval scenarios.</p>
             * </li>
             * <li><p><strong>custom</strong>: Custom mode. The reranking behavior of the model is determined by the instruction in the rerank_instruct parameter.</p>
             * </li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>qa</p>
             */
            public Builder rerankMode(String rerankMode) {
                this.rerankMode = rerankMode;
                return this;
            }

            public Rerank build() {
                return new Rerank(this);
            } 

        } 

    }
    /**
     * 
     * {@link RetrieveRequest} extends {@link TeaModel}
     *
     * <p>RetrieveRequest</p>
     */
    public static class Rewrite extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        private Rewrite(Builder builder) {
            this.modelName = builder.modelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rewrite create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        public static final class Builder {
            private String modelName; 

            private Builder() {
            } 

            private Builder(Rewrite model) {
                this.modelName = model.modelName;
            } 

            /**
             * <p>The name of the multi-turn conversation rewriting model. The model automatically adjusts the original input prompt (user question) based on the conversation context to improve retrieval performance. Valid values:</p>
             * <ul>
             * <li>conv-rewrite-qwen-1.8b: The conv-rewrite-qwen-1.8b model. Currently, only this model is supported.</li>
             * </ul>
             * <p>Default value: null. The conv-rewrite-qwen-1.8b model is used.</p>
             * 
             * <strong>example:</strong>
             * <p>conv-rewrite-qwen-1.8b</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            public Rewrite build() {
                return new Rewrite(this);
            } 

        } 

    }
}
