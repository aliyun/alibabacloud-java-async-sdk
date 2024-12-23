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
        this.images = builder.images;
        this.indexId = builder.indexId;
        this.query = builder.query;
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
        private java.util.List<String> images; 
        private String indexId; 
        private String query; 
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
            this.images = request.images;
            this.indexId = request.indexId;
            this.query = request.query;
            this.rerank = request.rerank;
            this.rerankMinScore = request.rerankMinScore;
            this.rerankTopN = request.rerankTopN;
            this.rewrite = request.rewrite;
            this.saveRetrieverHistory = request.saveRetrieverHistory;
            this.searchFilters = request.searchFilters;
            this.sparseSimilarityTopK = request.sparseSimilarityTopK;
        } 

        /**
         * <p>The ID of the workspace to which the knowledge base belongs. To view the workspace ID, you can click the Workspace Details icon in the upper-left corner on the <a href="https://bailian.console.aliyun.com/#/home">homepage</a> of the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_3Nt27MYcoK191ISp</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>Vector retrieval top K. After generating vectors based on input text, the top K chunks in the knowledge base that are most similar to the vector representation of the input text are retrieved. Valid values: 0 to 100. The sum of the <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> parameters must be less than or equal to 200.</p>
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
         * <p>Specifies whether to enable reranking. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>Specifies whether to enable multi-round conversation rewriting. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * Images.
         */
        public Builder images(java.util.List<String> images) {
            String imagesShrink = shrink(images, "Images", "simple");
            this.putQueryParameter("Images", imagesShrink);
            this.images = images;
            return this;
        }

        /**
         * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5pwe0m2g6t</p>
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * <p>The input query prompt. The length and characters of the query are not limited.</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Ranking configurations.</p>
         */
        public Builder rerank(java.util.List<Rerank> rerank) {
            String rerankShrink = shrink(rerank, "Rerank", "json");
            this.putQueryParameter("Rerank", rerankShrink);
            this.rerank = rerank;
            return this;
        }

        /**
         * <p>Similarity Threshold The lowest similarity score of chunks that can be returned. This parameter is used to filter text chunks returned by the rank model. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values: [0.01-1.00]. The priority of this parameter is greater than the similarity threshold configured for the knowledge base.</p>
         * <p>By default, this parameter is left empty. In this case, the similarity threshold of the knowledge base is used.</p>
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
         * <p>The top N return data after reranking. Valid values: 1 to 20. Default value: 5.</p>
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
         * <p>Conversation rewriting configurations.</p>
         */
        public Builder rewrite(java.util.List<Rewrite> rewrite) {
            String rewriteShrink = shrink(rewrite, "Rewrite", "json");
            this.putQueryParameter("Rewrite", rewriteShrink);
            this.rewrite = rewrite;
            return this;
        }

        /**
         * <p>Specifies whether to save the retrieve test history. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>Specifies complex filter conditions. For more information about the syntax of SearchFilters, see the SearchFilter syntax section of this topic.</p>
         */
        public Builder searchFilters(java.util.List<java.util.Map<String, String>> searchFilters) {
            String searchFiltersShrink = shrink(searchFilters, "SearchFilters", "json");
            this.putQueryParameter("SearchFilters", searchFiltersShrink);
            this.searchFilters = searchFilters;
            return this;
        }

        /**
         * <p>The top K of keyword retrieval. Chunks that exactly match the keywords of the input text are retrieved from the knowledge base. This filters out irrelevant chunks and boosts accuracy. Valid values: 0 to 100. The sum of the <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> parameters must be less than or equal to 200.</p>
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
    public static class Rerank extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        private Rerank(Builder builder) {
            this.modelName = builder.modelName;
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

        public static final class Builder {
            private String modelName; 

            /**
             * <p>The name of the rank model. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
             * <ul>
             * <li>gte-rerank-hybrid: Recommended official model.</li>
             * <li>gte-rerank</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>gte-rerank-hybrid</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
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

            /**
             * <p>Conversation rewriting model name. The query rewriting model automatically adjusts the original prompt based on the context to improve retrieval performance. Valid value:</p>
             * <ul>
             * <li>conv-rewrite-qwen-1.8b</li>
             * </ul>
             * <p>By default, this parameter is left empty, which means conv-rewrite-qwen-1.8b is used.</p>
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
