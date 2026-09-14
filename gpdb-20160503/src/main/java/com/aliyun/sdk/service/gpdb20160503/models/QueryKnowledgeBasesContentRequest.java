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
    @com.aliyun.core.annotation.NameInMap("RerankModel")
    private RerankModel rerankModel;

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
        this.rerankModel = builder.rerankModel;
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
     * @return rerankModel
     */
    public RerankModel getRerankModel() {
        return this.rerankModel;
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
        private RerankModel rerankModel; 
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
            this.rerankModel = request.rerankModel;
            this.sourceCollection = request.sourceCollection;
            this.topK = request.topK;
        } 

        /**
         * <p>The text content used for retrieval.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>What is ADBPG?</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a region, including instance IDs.</p>
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
         * <p>The method used to merge results from multiple knowledge bases. Default value: RRF. Valid values:</p>
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
         * <p>The parameters for the merge method of each SourceCollection.</p>
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
         * <p>The region ID of the instance.</p>
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
         * <p>The reranking factor. If this parameter is not empty, the vector retrieval results are reranked. Valid values: 1 &lt; RerankFactor &lt;= 5.</p>
         * <blockquote>
         * <ul>
         * <li>Reranking is slow when document chunks are sparse.</li>
         * <li>The recommended reranking count (TopK × Factor, rounded up) should not exceed 50.</li>
         * </ul>
         * </blockquote>
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
         * <p>The reranking model parameters for performing an additional reranking on the overall results after multi-channel merging.</p>
         */
        public Builder rerankModel(RerankModel rerankModel) {
            String rerankModelShrink = shrink(rerankModel, "RerankModel", "json");
            this.putQueryParameter("RerankModel", rerankModelShrink);
            this.rerankModel = rerankModel;
            return this;
        }

        /**
         * <p>The information about the multiple collections to retrieve.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sourceCollection(java.util.List<SourceCollection> sourceCollection) {
            String sourceCollectionShrink = shrink(sourceCollection, "SourceCollection", "json");
            this.putQueryParameter("SourceCollection", sourceCollectionShrink);
            this.sourceCollection = sourceCollection;
            return this;
        }

        /**
         * <p>The number of top results to return after multi-channel recall merging.</p>
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
             * <p>The k constant in the scoring algorithm <code>1/(k+rank_i)</code>. The value must be a positive integer greater than 1.</p>
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
             * <p>The weight array for each SourceCollection.</p>
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
             * <p>The configurable parameters when MergeMethod is set to RRF.</p>
             */
            public Builder rrf(Rrf rrf) {
                this.rrf = rrf;
                return this;
            }

            /**
             * <p>The configurable parameters when MergeMethod is set to Weight.</p>
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
    public static class RerankModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instruct")
        private String instruct;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private RerankModel(Builder builder) {
            this.instruct = builder.instruct;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RerankModel create() {
            return builder().build();
        }

        /**
         * @return instruct
         */
        public String getInstruct() {
            return this.instruct;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String instruct; 
            private String name; 

            private Builder() {
            } 

            private Builder(RerankModel model) {
                this.instruct = model.instruct;
                this.name = model.name;
            } 

            /**
             * <p>This parameter can be set when RerankModel.Name is set to qwen3-rerank. Specifies a custom ranking task type description that guides the model to adopt different ranking strategies.</p>
             * 
             * <strong>example:</strong>
             * <p>Given a web search query, retrieve relevant passages that answer the query</p>
             */
            public Builder instruct(String instruct) {
                this.instruct = instruct;
                return this;
            }

            /**
             * <p>The reranking model name. Valid values: qwen3-rerank, gte-rerank-v2.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-rerank</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RerankModel build() {
                return new RerankModel(this);
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
             * <p>The number of top entities and relationship edges to return. Default value: 60.</p>
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
    public static class QueryParamsRerankModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instruct")
        private String instruct;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RerankMetadataFields")
        private String rerankMetadataFields;

        private QueryParamsRerankModel(Builder builder) {
            this.instruct = builder.instruct;
            this.name = builder.name;
            this.rerankMetadataFields = builder.rerankMetadataFields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryParamsRerankModel create() {
            return builder().build();
        }

        /**
         * @return instruct
         */
        public String getInstruct() {
            return this.instruct;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rerankMetadataFields
         */
        public String getRerankMetadataFields() {
            return this.rerankMetadataFields;
        }

        public static final class Builder {
            private String instruct; 
            private String name; 
            private String rerankMetadataFields; 

            private Builder() {
            } 

            private Builder(QueryParamsRerankModel model) {
                this.instruct = model.instruct;
                this.name = model.name;
                this.rerankMetadataFields = model.rerankMetadataFields;
            } 

            /**
             * <p>This parameter can be set when RerankModel.Name is set to qwen3-rerank. Specifies a custom ranking task type description that guides the model to adopt different ranking strategies.</p>
             * 
             * <strong>example:</strong>
             * <p>Given a web search query, retrieve relevant passages that answer the query</p>
             */
            public Builder instruct(String instruct) {
                this.instruct = instruct;
                return this;
            }

            /**
             * <p>The reranking model name. Valid values: qwen3-rerank, gte-rerank-v2.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-rerank</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RerankMetadataFields.
             */
            public Builder rerankMetadataFields(String rerankMetadataFields) {
                this.rerankMetadataFields = rerankMetadataFields;
                return this;
            }

            public QueryParamsRerankModel build() {
                return new QueryParamsRerankModel(this);
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

        @com.aliyun.core.annotation.NameInMap("RerankModel")
        private QueryParamsRerankModel rerankModel;

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
            this.rerankModel = builder.rerankModel;
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
         * @return rerankModel
         */
        public QueryParamsRerankModel getRerankModel() {
            return this.rerankModel;
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
            private QueryParamsRerankModel rerankModel; 
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
                this.rerankModel = model.rerankModel;
                this.topK = model.topK;
                this.useFullTextRetrieval = model.useFullTextRetrieval;
            } 

            /**
             * <p>The filter conditions for the data to query, in SQL WHERE clause format. This is an expression that returns a Boolean value (true or false). Conditions can be simple comparison operators such as equal to (=), not equal to (&lt;&gt; or !=), greater than (&gt;), less than (&lt;), greater than or equal to (&gt;=), or less than or equal to (&lt;=). Conditions can also be more complex expressions combined with logical operators (AND, OR, NOT), as well as conditions using the IN, BETWEEN, and LIKE keywords.</p>
             * <blockquote>
             * <ul>
             * <li>For detailed syntax, refer to: <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/</a></li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>id = \&quot;llm-52tvykqt6u67iw73_j6ovptwjk7_file_6ce3da1f7e69495d9f491f2180c86973_11967297\&quot;</p>
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>Specifies whether to enable knowledge graph enhancement. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder graphEnhance(Boolean graphEnhance) {
                this.graphEnhance = graphEnhance;
                return this;
            }

            /**
             * <p>The number of top entities and relationship edges to return. Default value: 60.</p>
             */
            public Builder graphSearchArgs(GraphSearchArgs graphSearchArgs) {
                this.graphSearchArgs = graphSearchArgs;
                return this;
            }

            /**
             * <p>The multi-channel recall algorithm. Default value: empty (scores from dense vectors and full-text retrieval are directly compared and sorted).</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RRF: Reciprocal rank fusion. A parameter k controls the fusion effect. For more information, see the HybridSearchArgs configuration.</li>
             * <li>Weight: Weighted ranking. Parameters control the score weights of vector retrieval and full-text retrieval results before sorting. For more information, see the HybridSearchArgs configuration.</li>
             * <li>Cascaded: Full-text retrieval is performed first, followed by vector retrieval on the full-text retrieval results.</li>
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
             * <p>The algorithm parameters for multi-channel recall. RRF and Weight are supported. HybridPathsSetting specifies the recall paths: dense vectors (dense), sparse vectors (sparse), and full-text retrieval (fulltext). If this value is empty, dense vectors (dense) and full-text retrieval (fulltext) are used by default.</p>
             * <ul>
             * <li>RRF: The k constant in the scoring algorithm <code>1/(k+rank_i)</code>. The value must be a positive integer greater than 1. Format:</li>
             * </ul>
             * <pre><code>{
             *   &quot;HybridPathsSetting&quot;: {
             *     &quot;paths&quot;: &quot;dense,fulltext&quot;
             *   },
             *   &quot;RRF&quot;: {
             *     &quot;k&quot;: 60
             *   }
             * }
             * </code></pre>
             * <ul>
             * <li>Weight: <ul>
             * <li>Dual-path recall (without specifying HybridPathsSetting, only specifying alpha):<ul>
             * <li>Formula: alpha * dense_score + (1-alpha) * fulltext_score. The alpha parameter specifies the score weight between dense vectors and full-text retrieval. Valid values: 0 to 1, where 0 indicates full-text retrieval only and 1 indicates dense vectors only:</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * <pre><code>{ 
             *    &quot;Weight&quot;: {
             *     &quot;alpha&quot;: 0.5
             *    }
             * }
             * </code></pre>
             * <ul>
             * <li>Three-path recall pattern:<ul>
             * <li>Formula: normalized_dense * dense_score + normalized_sparse * sparse_score + normalized_fulltext * fulltext_score. The dense, sparse, and fulltext parameters represent the weights for dense vectors, sparse vectors, and full-text retrieval respectively. Valid values: greater than or equal to 0. The system automatically applies normalization to the weights to 0 to 1 (normalized_x = x / (dense + sparse + fulltext)).</li>
             * </ul>
             * </li>
             * </ul>
             * <pre><code>{
             *   &quot;HybridPathsSetting&quot;: {
             *      &quot;paths&quot;: &quot;dense,sparse,fulltext&quot;
             *    },
             *   &quot;Weight&quot;: {
             *     &quot;dense&quot;: 0.5,
             *     &quot;sparse&quot;: 0.3,
             *     &quot;fulltext&quot;: 0.2
             *   }
             * }
             * </code></pre>
             */
            public Builder hybridSearchArgs(java.util.Map<String, ?> hybridSearchArgs) {
                this.hybridSearchArgs = hybridSearchArgs;
                return this;
            }

            /**
             * <p>The method used to build the vector index. Valid values:</p>
             * <ul>
             * <li>l2: Euclidean distance.</li>
             * <li>ip: inner product distance.</li>
             * <li>cosine: cosine similarity.</li>
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
             * <p>The offset for paged query. Used for paging through results.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The field used for sorting. Default value: empty.</p>
             * <p>The field must belong to metadata or a default field in the table, such as id. Supported formats:</p>
             * <p>A single field, such as chunk_id.
             * Multiple fields separated by commas, such as block_id, chunk_id.
             * Descending order, such as block_id DESC, chunk_id DESC.</p>
             * 
             * <strong>example:</strong>
             * <p>file_id,sort_num</p>
             */
            public Builder orderBy(String orderBy) {
                this.orderBy = orderBy;
                return this;
            }

            /**
             * <p>The recall window. If this value is not empty, additional context is returned for the retrieval results. The format is a two-element array: List&lt;A, B&gt;, where -10 &lt;= A &lt;= 0 and 0 &lt;= B &lt;= 10.</p>
             * <blockquote>
             * <ul>
             * <li>Use this parameter when document chunks are too granular and retrieval may lose context information.</li>
             * <li>Reranking takes priority over windowing. Reranking is performed first, followed by windowing.</li>
             * </ul>
             * </blockquote>
             */
            public Builder recallWindow(java.util.List<Long> recallWindow) {
                this.recallWindow = recallWindow;
                return this;
            }

            /**
             * <p>The reranking factor. If this parameter is not empty, the vector retrieval results are reranked. Valid values: 1 &lt; RerankFactor &lt;= 5.</p>
             * <blockquote>
             * <ul>
             * <li>Reranking is slow when document chunks are sparse.</li>
             * <li>The recommended reranking count (TopK × Factor, rounded up) should not exceed 50.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder rerankFactor(Double rerankFactor) {
                this.rerankFactor = rerankFactor;
                return this;
            }

            /**
             * <p>The reranking model parameters.</p>
             */
            public Builder rerankModel(QueryParamsRerankModel rerankModel) {
                this.rerankModel = rerankModel;
                return this;
            }

            /**
             * <p>The number of top results to return.</p>
             * 
             * <strong>example:</strong>
             * <p>776</p>
             */
            public Builder topK(Long topK) {
                this.topK = topK;
                return this;
            }

            /**
             * <p>Specifies whether to use full-text retrieval (dual-path recall). Default value: false, which indicates that only vector retrieval is used.</p>
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
             * <p>The document collection name.</p>
             * <blockquote>
             * <p>Created by the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation. You can call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to view existing document collections.</p>
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
             * <p>You can create a namespace by calling the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation and view the list by calling the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation.</p>
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
             * <p>The password for the namespace.</p>
             * <blockquote>
             * <p>This value is specified by the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
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
             * <p>The filter conditions for the data to query, in SQL WHERE clause format.</p>
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
