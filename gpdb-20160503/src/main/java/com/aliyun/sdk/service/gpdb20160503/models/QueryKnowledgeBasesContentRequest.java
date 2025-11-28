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
 * {@link QueryKnowledgeBasesContentRequest} extends {@link RequestModel}
 *
 * <p>QueryKnowledgeBasesContentRequest</p>
 */
public class QueryKnowledgeBasesContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MergeMethod")
    private String mergeMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MergeMethodArgs")
    private MergeMethodArgs mergeMethodArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankFactor")
    private Double rerankFactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCollection")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SourceCollection> sourceCollection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Long topK;

    private QueryKnowledgeBasesContentRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.DBInstanceId = builder.DBInstanceId;
        this.mergeMethod = builder.mergeMethod;
        this.mergeMethodArgs = builder.mergeMethodArgs;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.rerankFactor = builder.rerankFactor;
        this.sourceCollection = builder.sourceCollection;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryKnowledgeBasesContentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<QueryKnowledgeBasesContentRequest, Builder> {
        private String content; 
        private String DBInstanceId; 
        private String mergeMethod; 
        private MergeMethodArgs mergeMethodArgs; 
        private Long ownerId; 
        private String regionId; 
        private Double rerankFactor; 
        private java.util.List<SourceCollection> sourceCollection; 
        private Long topK; 

        private Builder() {
            super();
        } 

        private Builder(QueryKnowledgeBasesContentRequest request) {
            super(request);
            this.content = request.content;
            this.DBInstanceId = request.DBInstanceId;
            this.mergeMethod = request.mergeMethod;
            this.mergeMethodArgs = request.mergeMethodArgs;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.rerankFactor = request.rerankFactor;
            this.sourceCollection = request.sourceCollection;
            this.topK = request.topK;
        } 

        /**
         * <p>The text content for retrieval.</p>
         * <p>This parameter is required.</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
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
         * <p>The method used to merge multiple knowledge bases. Default value: RRF. Valid values:</p>
         * <ul>
         * <li>RRF</li>
         * <li>Weight</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RRF</p>
         */
        public Builder mergeMethod(String mergeMethod) {
            this.putQueryParameter("MergeMethod", mergeMethod);
            this.mergeMethod = mergeMethod;
            return this;
        }

        /**
         * <p>The parameters of the merge method for each SourceCollection.</p>
         */
        public Builder mergeMethodArgs(MergeMethodArgs mergeMethodArgs) {
            String mergeMethodArgsShrink = shrink(mergeMethodArgs, "MergeMethodArgs", "json");
            this.putQueryParameter("MergeMethodArgs", mergeMethodArgsShrink);
            this.mergeMethodArgs = mergeMethodArgs;
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
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The rerank factor. If you specify this parameter, the vector retrieval results are reranked once more. Valid values: 1&lt;RerankFactor&lt;=5.</p>
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
         * <p>2</p>
         */
        public Builder rerankFactor(Double rerankFactor) {
            this.putQueryParameter("RerankFactor", rerankFactor);
            this.rerankFactor = rerankFactor;
            return this;
        }

        /**
         * <p>The information about collections to retrieve from.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sourceCollection(java.util.List<SourceCollection> sourceCollection) {
            String sourceCollectionShrink = shrink(sourceCollection, "SourceCollection", "json");
            this.putQueryParameter("SourceCollection", sourceCollectionShrink);
            this.sourceCollection = sourceCollection;
            return this;
        }

        /**
         * <p>Set the number of top results to be returned after merging results from multiple path retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder topK(Long topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        @Override
        public QueryKnowledgeBasesContentRequest build() {
            return new QueryKnowledgeBasesContentRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryKnowledgeBasesContentRequest} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentRequest</p>
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
             * <p>The smoothing constant k in the formula to calculate the score: 1/(k + rank_i). The k constant must be a positive integer greater than 1.</p>
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
     * {@link QueryKnowledgeBasesContentRequest} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentRequest</p>
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
     * {@link QueryKnowledgeBasesContentRequest} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentRequest</p>
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
             * <p>The parameter that can be configured when the MergeMethod parameter is set to RRF.</p>
             */
            public Builder rrf(Rrf rrf) {
                this.rrf = rrf;
                return this;
            }

            /**
             * <p>The parameter that you can configure when you set the MergeMethod parameter to Weight.</p>
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
     * {@link QueryKnowledgeBasesContentRequest} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentRequest</p>
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
             * <p>Returns the top number of entities and relationship edges. Default value: 60.</p>
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
     * {@link QueryKnowledgeBasesContentRequest} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Integer offset;

        @com.aliyun.core.annotation.NameInMap("OrderBy")
        private String orderBy;

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
            this.offset = builder.offset;
            this.orderBy = builder.orderBy;
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
         * @return offset
         */
        public Integer getOffset() {
            return this.offset;
        }

        /**
         * @return orderBy
         */
        public String getOrderBy() {
            return this.orderBy;
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
            private Integer offset; 
            private String orderBy; 
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
                this.offset = model.offset;
                this.orderBy = model.orderBy;
                this.recallWindow = model.recallWindow;
                this.rerankFactor = model.rerankFactor;
                this.topK = model.topK;
                this.useFullTextRetrieval = model.useFullTextRetrieval;
            } 

            /**
             * <p>The filter condition that is used to query data. Specify this parameter in a format that is the same as the WHERE clause. The parameter is an expression that returns a Boolean value of TRUE or FALSE. The condition can be a simple comparison using operators such as equal (=), not equal (&lt;&gt; or !=), greater than (&gt;), less than (&lt;), greater than or equal (&gt;=), or less than or equal (&lt;=). It can also be a more complex expression combining multiple conditions with logical operators (AND, OR, NOT), or use keywords such as IN, BETWEEN, and LIKE.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>For the syntax, see <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>id = &quot;llm-52tvykqt6u67iw73_j6ovptwjk7_file_6ce3da1f7e69495d9f491f2180c86973_11967297&quot;</p>
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
             * <p>Returns the top number of entities and relationship edges. Default value: 60.</p>
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
             * <p>Offset for pagination.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The fields by which to sort the results. This parameter is empty by default.</p>
             * <p>The field must be either a metadata field or a default field in the table (e.g., id). Supported formats include:</p>
             * <p>Single field, such as chunk_id. Multiple fields that are separated by commas (,), such as block_id,chunk_id. Descending order is supported, such as block_id DESC,chunk_id DESC.</p>
             * 
             * <strong>example:</strong>
             * <p>file_id,sort_num</p>
             */
            public Builder orderBy(String orderBy) {
                this.orderBy = orderBy;
                return this;
            }

            /**
             * <p>The retrieval window. If you specify this parameter, the context of the retrieved result is added in the output. Format: List&lt;A, B&gt;. Valid values: -10&lt;=A&lt;=0 and 0&lt;=B&lt;=10.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>We recommend that you specify this parameter if the source document is segmented into large numbers of pieces, which may result in loss of contextual information during retrieval.</p>
             * </li>
             * <li><p>Perform re-ranking before windowing.</p>
             * </li>
             * </ul>
             */
            public Builder recallWindow(java.util.List<Long> recallWindow) {
                this.recallWindow = recallWindow;
                return this;
            }

            /**
             * <p>The rerank factor. If you specify this parameter, the vector retrieval results are reranked once more. Valid values: 1&lt;RerankFactor&lt;=5.</p>
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
             * <p>776</p>
             */
            public Builder topK(Long topK) {
                this.topK = topK;
                return this;
            }

            /**
             * <p>Specifies whether to use full-text retrieval (dual-path retrieval). The default value is false, which means only vector retrieval is used.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link QueryKnowledgeBasesContentRequest} extends {@link TeaModel}
     *
     * <p>QueryKnowledgeBasesContentRequest</p>
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
             * <p>The name of the document collection.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation to create a document collection and call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to query a list of document collections.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>knowledge22</p>
             */
            public Builder collection(String collection) {
                this.collection = collection;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace and call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query a list of namespaces.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ns_cloud_index</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The password of the namespace.</p>
             * <blockquote>
             * <p> The value of this parameter is specified when you call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ns_password</p>
             */
            public Builder namespacePassword(String namespacePassword) {
                this.namespacePassword = namespacePassword;
                return this;
            }

            /**
             * <p>The condition that is used to filter the data to be updated. Specify this parameter in a format that is the same as the WHERE clause.</p>
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
}
