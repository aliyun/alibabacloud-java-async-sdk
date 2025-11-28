// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link RequestModel}
 *
 * <p>ChatWithKnowledgeBaseStreamRequest</p>
 */
public class ChatWithKnowledgeBaseStreamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeKnowledgeBaseResults")
    private Boolean includeKnowledgeBaseResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeParams")
    private KnowledgeParams knowledgeParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private ModelParams modelParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptParams")
    private String promptParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ChatWithKnowledgeBaseStreamRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.includeKnowledgeBaseResults = builder.includeKnowledgeBaseResults;
        this.knowledgeParams = builder.knowledgeParams;
        this.modelParams = builder.modelParams;
        this.ownerId = builder.ownerId;
        this.promptParams = builder.promptParams;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatWithKnowledgeBaseStreamRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return includeKnowledgeBaseResults
     */
    public Boolean getIncludeKnowledgeBaseResults() {
        return this.includeKnowledgeBaseResults;
    }

    /**
     * @return knowledgeParams
     */
    public KnowledgeParams getKnowledgeParams() {
        return this.knowledgeParams;
    }

    /**
     * @return modelParams
     */
    public ModelParams getModelParams() {
        return this.modelParams;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return promptParams
     */
    public String getPromptParams() {
        return this.promptParams;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ChatWithKnowledgeBaseStreamRequest, Builder> {
        private String DBInstanceId; 
        private Boolean includeKnowledgeBaseResults; 
        private KnowledgeParams knowledgeParams; 
        private ModelParams modelParams; 
        private Long ownerId; 
        private String promptParams; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ChatWithKnowledgeBaseStreamRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.includeKnowledgeBaseResults = request.includeKnowledgeBaseResults;
            this.knowledgeParams = request.knowledgeParams;
            this.modelParams = request.modelParams;
            this.ownerId = request.ownerId;
            this.promptParams = request.promptParams;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Whether to return the retrieved result. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeKnowledgeBaseResults(Boolean includeKnowledgeBaseResults) {
            this.putQueryParameter("IncludeKnowledgeBaseResults", includeKnowledgeBaseResults);
            this.includeKnowledgeBaseResults = includeKnowledgeBaseResults;
            return this;
        }

        /**
         * <p>The knowledge retrieval parameter object. If you do not specify this parameter, only chat mode is enabled.</p>
         */
        public Builder knowledgeParams(KnowledgeParams knowledgeParams) {
            String knowledgeParamsShrink = shrink(knowledgeParams, "KnowledgeParams", "json");
            this.putQueryParameter("KnowledgeParams", knowledgeParamsShrink);
            this.knowledgeParams = knowledgeParams;
            return this;
        }

        /**
         * <p>The Large Language Model (LLM) invocation parameter object.</p>
         * <p>This parameter is required.</p>
         */
        public Builder modelParams(ModelParams modelParams) {
            String modelParamsShrink = shrink(modelParams, "ModelParams", "json");
            this.putQueryParameter("ModelParams", modelParamsShrink);
            this.modelParams = modelParams;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The system prompt template, which should include {{ text_chunks }},{{ user_system_prompt }},{{ graph_entities },{{ graph_relations }}. If any of these placeholders are not specified, the corresponding section should have no effect.</p>
         */
        public Builder promptParams(String promptParams) {
            this.putQueryParameter("PromptParams", promptParams);
            this.promptParams = promptParams;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ChatWithKnowledgeBaseStreamRequest build() {
            return new ChatWithKnowledgeBaseStreamRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseStreamRequest</p>
     */
    public static class Rrf extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("K")
        private Long k;

        private Rrf(Builder builder) {
            this.k = builder.k;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rrf create() {
            return builder().build();
        }

        /**
         * @return k
         */
        public Long getK() {
            return this.k;
        }

        public static final class Builder {
            private Long k; 

            private Builder() {
            } 

            private Builder(Rrf model) {
                this.k = model.k;
            } 

            /**
             * <p>Formula to calculate the score: 1/(k + rank_i). The k constant must be a positive integer greater than 1.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder k(Long k) {
                this.k = k;
                return this;
            }

            public Rrf build() {
                return new Rrf(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseStreamRequest</p>
     */
    public static class Weight extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Weights")
        private java.util.List<Double> weights;

        private Weight(Builder builder) {
            this.weights = builder.weights;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Weight create() {
            return builder().build();
        }

        /**
         * @return weights
         */
        public java.util.List<Double> getWeights() {
            return this.weights;
        }

        public static final class Builder {
            private java.util.List<Double> weights; 

            private Builder() {
            } 

            private Builder(Weight model) {
                this.weights = model.weights;
            } 

            /**
             * <p>An array of weights for each SourceCollection.</p>
             */
            public Builder weights(java.util.List<Double> weights) {
                this.weights = weights;
                return this;
            }

            public Weight build() {
                return new Weight(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseStreamRequest</p>
     */
    public static class MergeMethodArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rrf")
        private Rrf rrf;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Weight weight;

        private MergeMethodArgs(Builder builder) {
            this.rrf = builder.rrf;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MergeMethodArgs create() {
            return builder().build();
        }

        /**
         * @return rrf
         */
        public Rrf getRrf() {
            return this.rrf;
        }

        /**
         * @return weight
         */
        public Weight getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Rrf rrf; 
            private Weight weight; 

            private Builder() {
            } 

            private Builder(MergeMethodArgs model) {
                this.rrf = model.rrf;
                this.weight = model.weight;
            } 

            /**
             * <p>The parameter to be configured when the MergeMethod parameter is set to RRF.</p>
             */
            public Builder rrf(Rrf rrf) {
                this.rrf = rrf;
                return this;
            }

            /**
             * <p>The smoothing constant in the formula to calculate the score: 1/(k + rank_i). It must be a positive integer greater than 1.</p>
             */
            public Builder weight(Weight weight) {
                this.weight = weight;
                return this;
            }

            public MergeMethodArgs build() {
                return new MergeMethodArgs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseStreamRequest</p>
     */
    public static class GraphSearchArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GraphTopK")
        private Long graphTopK;

        private GraphSearchArgs(Builder builder) {
            this.graphTopK = builder.graphTopK;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GraphSearchArgs create() {
            return builder().build();
        }

        /**
         * @return graphTopK
         */
        public Long getGraphTopK() {
            return this.graphTopK;
        }

        public static final class Builder {
            private Long graphTopK; 

            private Builder() {
            } 

            private Builder(GraphSearchArgs model) {
                this.graphTopK = model.graphTopK;
            } 

            /**
             * <p>The number of top entities and relationship edges. Default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder graphTopK(Long graphTopK) {
                this.graphTopK = graphTopK;
                return this;
            }

            public GraphSearchArgs build() {
                return new GraphSearchArgs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseStreamRequest</p>
     */
    public static class QueryParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Filter")
        private String filter;

        @com.aliyun.core.annotation.NameInMap("GraphEnhance")
        private Boolean graphEnhance;

        @com.aliyun.core.annotation.NameInMap("GraphSearchArgs")
        private GraphSearchArgs graphSearchArgs;

        @com.aliyun.core.annotation.NameInMap("HybridSearch")
        private String hybridSearch;

        @com.aliyun.core.annotation.NameInMap("HybridSearchArgs")
        private java.util.Map<String, ?> hybridSearchArgs;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private String metrics;

        @com.aliyun.core.annotation.NameInMap("RecallWindow")
        private java.util.List<Long> recallWindow;

        @com.aliyun.core.annotation.NameInMap("RerankFactor")
        private Double rerankFactor;

        @com.aliyun.core.annotation.NameInMap("TopK")
        private Long topK;

        @com.aliyun.core.annotation.NameInMap("UseFullTextRetrieval")
        private Boolean useFullTextRetrieval;

        private QueryParams(Builder builder) {
            this.filter = builder.filter;
            this.graphEnhance = builder.graphEnhance;
            this.graphSearchArgs = builder.graphSearchArgs;
            this.hybridSearch = builder.hybridSearch;
            this.hybridSearchArgs = builder.hybridSearchArgs;
            this.metrics = builder.metrics;
            this.recallWindow = builder.recallWindow;
            this.rerankFactor = builder.rerankFactor;
            this.topK = builder.topK;
            this.useFullTextRetrieval = builder.useFullTextRetrieval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryParams create() {
            return builder().build();
        }

        /**
         * @return filter
         */
        public String getFilter() {
            return this.filter;
        }

        /**
         * @return graphEnhance
         */
        public Boolean getGraphEnhance() {
            return this.graphEnhance;
        }

        /**
         * @return graphSearchArgs
         */
        public GraphSearchArgs getGraphSearchArgs() {
            return this.graphSearchArgs;
        }

        /**
         * @return hybridSearch
         */
        public String getHybridSearch() {
            return this.hybridSearch;
        }

        /**
         * @return hybridSearchArgs
         */
        public java.util.Map<String, ?> getHybridSearchArgs() {
            return this.hybridSearchArgs;
        }

        /**
         * @return metrics
         */
        public String getMetrics() {
            return this.metrics;
        }

        /**
         * @return recallWindow
         */
        public java.util.List<Long> getRecallWindow() {
            return this.recallWindow;
        }

        /**
         * @return rerankFactor
         */
        public Double getRerankFactor() {
            return this.rerankFactor;
        }

        /**
         * @return topK
         */
        public Long getTopK() {
            return this.topK;
        }

        /**
         * @return useFullTextRetrieval
         */
        public Boolean getUseFullTextRetrieval() {
            return this.useFullTextRetrieval;
        }

        public static final class Builder {
            private String filter; 
            private Boolean graphEnhance; 
            private GraphSearchArgs graphSearchArgs; 
            private String hybridSearch; 
            private java.util.Map<String, ?> hybridSearchArgs; 
            private String metrics; 
            private java.util.List<Long> recallWindow; 
            private Double rerankFactor; 
            private Long topK; 
            private Boolean useFullTextRetrieval; 

            private Builder() {
            } 

            private Builder(QueryParams model) {
                this.filter = model.filter;
                this.graphEnhance = model.graphEnhance;
                this.graphSearchArgs = model.graphSearchArgs;
                this.hybridSearch = model.hybridSearch;
                this.hybridSearchArgs = model.hybridSearchArgs;
                this.metrics = model.metrics;
                this.recallWindow = model.recallWindow;
                this.rerankFactor = model.rerankFactor;
                this.topK = model.topK;
                this.useFullTextRetrieval = model.useFullTextRetrieval;
            } 

            /**
             * <p>The condition that is used to filter the data to be updated. Specify this parameter in a format that is the same as the WHERE clause.</p>
             * 
             * <strong>example:</strong>
             * <p>method_id=&quot;e41695f0-2851-40ac-b21d-dd337b60d71c&quot;</p>
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>Whether to enable knowledge graph enhancement. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder graphEnhance(Boolean graphEnhance) {
                this.graphEnhance = graphEnhance;
                return this;
            }

            /**
             * <p>The knowledge graph retrieval parameters.</p>
             */
            public Builder graphSearchArgs(GraphSearchArgs graphSearchArgs) {
                this.graphSearchArgs = graphSearchArgs;
                return this;
            }

            /**
             * <p>The dual-path retrieval algorithm. This parameter is empty by default, which specifies that scores of vector retrieval and full-text retrieval are directly compared and sorted together.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RRF: The reciprocal rank fusion (RRF) algorithm uses a constant k to control the fusion effect. For more information, see the description of the HybridSearchArgs parameter.</li>
             * <li>Weight: This algorithm uses the alpha parameter to specify the proportion of the vector search score and the full-text search score and then sorts by weight. For more information, see the description of the HybridSearchArgs parameter.</li>
             * <li>Cascaded: This algorithm performs first full-text retrieval and then vector retrieval.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Cascaded</p>
             */
            public Builder hybridSearch(String hybridSearch) {
                this.hybridSearch = hybridSearch;
                return this;
            }

            /**
             * <p>The parameters of the dual-path retrieval algorithm. RRF and Weight are supported at this time:</p>
             * <ul>
             * <li>RRF: Specifies the smoothing constant k in the formula to calculate the score: <code>1/(k + rank_i)</code>. The k constant must be a positive integer greater than 1. The format:</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{ 
             *    &quot;RRF&quot;: {
             *     &quot;k&quot;: 60
             *    }
             * }
             * </code></pre>
             * <ul>
             * <li>Weight: The score is computed as <code>alpha * vector_score + (1 - alpha) * text_score</code>. The parameter alpha controls the weighting between vector search and full-text search scores, with a valid range of [0, 1]. 0 specifies only full-text search score. 1 specifies only vector search score.</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{ 
             *    &quot;Weight&quot;: {
             *     &quot;alpha&quot;: 0.5
             *    }
             * }
             * </code></pre>
             */
            public Builder hybridSearchArgs(java.util.Map<String, ?> hybridSearchArgs) {
                this.hybridSearchArgs = hybridSearchArgs;
                return this;
            }

            /**
             * <p>The method that is used to create vector indexes. Valid values:</p>
             * <ul>
             * <li>l2: Euclidean distance.</li>
             * <li>ip: Inner product distance.</li>
             * <li>cosine: Cosine similarity.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cosine</p>
             */
            public Builder metrics(String metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The retrieval window. If you specify this parameter, the context of the retrieved result is added in the output. Format: List&lt;A, B&gt;. Valid values: -10&lt;=A&lt;=0 and 0&lt;=B&lt;=10.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>We recommend that you specify this parameter if the source document is segmented into large numbers of pieces, which may result in loss of contextual information during retrieval.</p>
             * </li>
             * <li><p>Prioritized reranking with windowing, i.e., perform reranking first followed by windowing processing.</p>
             * </li>
             * </ul>
             */
            public Builder recallWindow(java.util.List<Long> recallWindow) {
                this.recallWindow = recallWindow;
                return this;
            }

            /**
             * <p>The rerank factor. If you specify this parameter, the retrieved results are reranked once again. Valid values: 1&lt;RerankFactor&lt;=5.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If the document is segmented into sparse parts, reranking is inefficient.</p>
             * </li>
             * <li><p>We recommend that the number of reranked results (the ceiling of TopK × RerankFactor) not exceed 50.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder rerankFactor(Double rerankFactor) {
                this.rerankFactor = rerankFactor;
                return this;
            }

            /**
             * <p>The number of top results.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder topK(Long topK) {
                this.topK = topK;
                return this;
            }

            /**
             * <p>Specifies whether to use full-text retrieval (dual-path retrieval). The default value is false, which means only vector retrieval is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useFullTextRetrieval(Boolean useFullTextRetrieval) {
                this.useFullTextRetrieval = useFullTextRetrieval;
                return this;
            }

            public QueryParams build() {
                return new QueryParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseStreamRequest</p>
     */
    public static class SourceCollection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Collection")
        @com.aliyun.core.annotation.Validation(required = true)
        private String collection;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NamespacePassword")
        @com.aliyun.core.annotation.Validation(required = true)
        private String namespacePassword;

        @com.aliyun.core.annotation.NameInMap("QueryParams")
        private QueryParams queryParams;

        private SourceCollection(Builder builder) {
            this.collection = builder.collection;
            this.namespace = builder.namespace;
            this.namespacePassword = builder.namespacePassword;
            this.queryParams = builder.queryParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceCollection create() {
            return builder().build();
        }

        /**
         * @return collection
         */
        public String getCollection() {
            return this.collection;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return namespacePassword
         */
        public String getNamespacePassword() {
            return this.namespacePassword;
        }

        /**
         * @return queryParams
         */
        public QueryParams getQueryParams() {
            return this.queryParams;
        }

        public static final class Builder {
            private String collection; 
            private String namespace; 
            private String namespacePassword; 
            private QueryParams queryParams; 

            private Builder() {
            } 

            private Builder(SourceCollection model) {
                this.collection = model.collection;
                this.namespace = model.namespace;
                this.namespacePassword = model.namespacePassword;
                this.queryParams = model.queryParams;
            } 

            /**
             * <p>The name of the collection to be recalled.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_index_adb_50943_prod</p>
             */
            public Builder collection(String collection) {
                this.collection = collection;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query a list of namespaces.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ddstar_vector</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The password for the namespace.</p>
             * <blockquote>
             * <p>The value of this parameter is specified by the CreateNamespace operation.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>namespacePassword</p>
             */
            public Builder namespacePassword(String namespacePassword) {
                this.namespacePassword = namespacePassword;
                return this;
            }

            /**
             * <p>Parameters related to the knowledge base retrieval.</p>
             */
            public Builder queryParams(QueryParams queryParams) {
                this.queryParams = queryParams;
                return this;
            }

            public SourceCollection build() {
                return new SourceCollection(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseStreamRequest</p>
     */
    public static class KnowledgeParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MergeMethod")
        private String mergeMethod;

        @com.aliyun.core.annotation.NameInMap("MergeMethodArgs")
        private MergeMethodArgs mergeMethodArgs;

        @com.aliyun.core.annotation.NameInMap("RerankFactor")
        private Double rerankFactor;

        @com.aliyun.core.annotation.NameInMap("SourceCollection")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<SourceCollection> sourceCollection;

        @com.aliyun.core.annotation.NameInMap("TopK")
        private Long topK;

        private KnowledgeParams(Builder builder) {
            this.mergeMethod = builder.mergeMethod;
            this.mergeMethodArgs = builder.mergeMethodArgs;
            this.rerankFactor = builder.rerankFactor;
            this.sourceCollection = builder.sourceCollection;
            this.topK = builder.topK;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeParams create() {
            return builder().build();
        }

        /**
         * @return mergeMethod
         */
        public String getMergeMethod() {
            return this.mergeMethod;
        }

        /**
         * @return mergeMethodArgs
         */
        public MergeMethodArgs getMergeMethodArgs() {
            return this.mergeMethodArgs;
        }

        /**
         * @return rerankFactor
         */
        public Double getRerankFactor() {
            return this.rerankFactor;
        }

        /**
         * @return sourceCollection
         */
        public java.util.List<SourceCollection> getSourceCollection() {
            return this.sourceCollection;
        }

        /**
         * @return topK
         */
        public Long getTopK() {
            return this.topK;
        }

        public static final class Builder {
            private String mergeMethod; 
            private MergeMethodArgs mergeMethodArgs; 
            private Double rerankFactor; 
            private java.util.List<SourceCollection> sourceCollection; 
            private Long topK; 

            private Builder() {
            } 

            private Builder(KnowledgeParams model) {
                this.mergeMethod = model.mergeMethod;
                this.mergeMethodArgs = model.mergeMethodArgs;
                this.rerankFactor = model.rerankFactor;
                this.sourceCollection = model.sourceCollection;
                this.topK = model.topK;
            } 

            /**
             * <p>The method used to merge multiple knowledge base. Default value: RRF. Valid values:</p>
             * <ul>
             * <li>RRF</li>
             * <li>Weight</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>&quot;RRF&quot;</p>
             */
            public Builder mergeMethod(String mergeMethod) {
                this.mergeMethod = mergeMethod;
                return this;
            }

            /**
             * <p>Parameters for multi-knowledge-base fusion.</p>
             */
            public Builder mergeMethodArgs(MergeMethodArgs mergeMethodArgs) {
                this.mergeMethodArgs = mergeMethodArgs;
                return this;
            }

            /**
             * <p>The rerank factor. If you specify this parameter, the search result is reranked once again. Valid values: 1&lt;RerankFactor&lt;=5.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If the document is segmented into sparse parts, reranking is inefficient.</p>
             * </li>
             * <li><p>We recommend that the number of reranked results (the ceiling of TopK × RerankFactor) not exceed 50.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5.0</p>
             */
            public Builder rerankFactor(Double rerankFactor) {
                this.rerankFactor = rerankFactor;
                return this;
            }

            /**
             * <p>Knowledge base.</p>
             * <p>This parameter is required.</p>
             */
            public Builder sourceCollection(java.util.List<SourceCollection> sourceCollection) {
                this.sourceCollection = sourceCollection;
                return this;
            }

            /**
             * <p>Specifies the number of top results to return after merging retrieved results from multiple vector collections.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder topK(Long topK) {
                this.topK = topK;
                return this;
            }

            public KnowledgeParams build() {
                return new KnowledgeParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseStreamRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
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

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>The message content.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The message role. Valid values:</p>
             * <ul>
             * <li>system</li>
             * <li>user</li>
             * <li>assistant</li>
             * </ul>
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
     * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseStreamRequest</p>
     */
    public static class Function extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private Object parameters;

        private Function(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Function create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameters
         */
        public Object getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private Object parameters; 

            private Builder() {
            } 

            private Builder(Function model) {
                this.description = model.description;
                this.name = model.name;
                this.parameters = model.parameters;
            } 

            /**
             * <p>The description of the function.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>get_weather</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>JSON Schema for function parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;: &quot;object&quot;, ...}</p>
             */
            public Builder parameters(Object parameters) {
                this.parameters = parameters;
                return this;
            }

            public Function build() {
                return new Function(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseStreamRequest</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Function")
        private Function function;

        private Tools(Builder builder) {
            this.function = builder.function;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public Function getFunction() {
            return this.function;
        }

        public static final class Builder {
            private Function function; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.function = model.function;
            } 

            /**
             * <p>The information about a function.</p>
             */
            public Builder function(Function function) {
                this.function = function;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatWithKnowledgeBaseStreamRequest} extends {@link TeaModel}
     *
     * <p>ChatWithKnowledgeBaseStreamRequest</p>
     */
    public static class ModelParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxTokens")
        private Long maxTokens;

        @com.aliyun.core.annotation.NameInMap("Messages")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Messages> messages;

        @com.aliyun.core.annotation.NameInMap("Model")
        @com.aliyun.core.annotation.Validation(required = true)
        private String model;

        @com.aliyun.core.annotation.NameInMap("N")
        private Long n;

        @com.aliyun.core.annotation.NameInMap("PresencePenalty")
        private Double presencePenalty;

        @com.aliyun.core.annotation.NameInMap("Seed")
        private Long seed;

        @com.aliyun.core.annotation.NameInMap("Stop")
        private java.util.List<String> stop;

        @com.aliyun.core.annotation.NameInMap("Temperature")
        private Double temperature;

        @com.aliyun.core.annotation.NameInMap("Tools")
        private java.util.List<Tools> tools;

        @com.aliyun.core.annotation.NameInMap("TopP")
        private Double topP;

        private ModelParams(Builder builder) {
            this.maxTokens = builder.maxTokens;
            this.messages = builder.messages;
            this.model = builder.model;
            this.n = builder.n;
            this.presencePenalty = builder.presencePenalty;
            this.seed = builder.seed;
            this.stop = builder.stop;
            this.temperature = builder.temperature;
            this.tools = builder.tools;
            this.topP = builder.topP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelParams create() {
            return builder().build();
        }

        /**
         * @return maxTokens
         */
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return n
         */
        public Long getN() {
            return this.n;
        }

        /**
         * @return presencePenalty
         */
        public Double getPresencePenalty() {
            return this.presencePenalty;
        }

        /**
         * @return seed
         */
        public Long getSeed() {
            return this.seed;
        }

        /**
         * @return stop
         */
        public java.util.List<String> getStop() {
            return this.stop;
        }

        /**
         * @return temperature
         */
        public Double getTemperature() {
            return this.temperature;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        /**
         * @return topP
         */
        public Double getTopP() {
            return this.topP;
        }

        public static final class Builder {
            private Long maxTokens; 
            private java.util.List<Messages> messages; 
            private String model; 
            private Long n; 
            private Double presencePenalty; 
            private Long seed; 
            private java.util.List<String> stop; 
            private Double temperature; 
            private java.util.List<Tools> tools; 
            private Double topP; 

            private Builder() {
            } 

            private Builder(ModelParams model) {
                this.maxTokens = model.maxTokens;
                this.messages = model.messages;
                this.model = model.model;
                this.n = model.n;
                this.presencePenalty = model.presencePenalty;
                this.seed = model.seed;
                this.stop = model.stop;
                this.temperature = model.temperature;
                this.tools = model.tools;
                this.topP = model.topP;
            } 

            /**
             * <p>Maximum number of tokens to generate.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder maxTokens(Long maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>Message list.</p>
             * <p>This parameter is required.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>The model name. See <a href="https://help.aliyun.com/zh/model-studio/compatibility-of-openai-with-dashscope?spm=openapi-amp.newDocPublishment.0.0.257c281fH8TtM8&scm=20140722.H_2833609._.OR_help-T_cn~zh-V_1#eadfc13038jd5">Model Studio Document</a> for the available models.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The number of candidate responses to generate.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder n(Long n) {
                this.n = n;
                return this;
            }

            /**
             * <p>Presence penalty coefficient (-2.0 to 2.0).</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder presencePenalty(Double presencePenalty) {
                this.presencePenalty = presencePenalty;
                return this;
            }

            /**
             * <p>The random seed.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder seed(Long seed) {
                this.seed = seed;
                return this;
            }

            /**
             * <p>Stop words.</p>
             */
            public Builder stop(java.util.List<String> stop) {
                this.stop = stop;
                return this;
            }

            /**
             * <p>Sampling temperature (0~2).</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder temperature(Double temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * <p>Tools.</p>
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * <p>Top-p (nucleus) sampling threshold (0–1).</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder topP(Double topP) {
                this.topP = topP;
                return this;
            }

            public ModelParams build() {
                return new ModelParams(this);
            } 

        } 

    }
}
