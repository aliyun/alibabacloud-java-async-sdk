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

    private ChatWithKnowledgeBaseStreamRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.includeKnowledgeBaseResults = builder.includeKnowledgeBaseResults;
        this.knowledgeParams = builder.knowledgeParams;
        this.modelParams = builder.modelParams;
        this.ownerId = builder.ownerId;
        this.promptParams = builder.promptParams;
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

    public static final class Builder extends Request.Builder<ChatWithKnowledgeBaseStreamRequest, Builder> {
        private String DBInstanceId; 
        private Boolean includeKnowledgeBaseResults; 
        private KnowledgeParams knowledgeParams; 
        private ModelParams modelParams; 
        private Long ownerId; 
        private String promptParams; 

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
        } 

        /**
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
         * IncludeKnowledgeBaseResults.
         */
        public Builder includeKnowledgeBaseResults(Boolean includeKnowledgeBaseResults) {
            this.putQueryParameter("IncludeKnowledgeBaseResults", includeKnowledgeBaseResults);
            this.includeKnowledgeBaseResults = includeKnowledgeBaseResults;
            return this;
        }

        /**
         * KnowledgeParams.
         */
        public Builder knowledgeParams(KnowledgeParams knowledgeParams) {
            String knowledgeParamsShrink = shrink(knowledgeParams, "KnowledgeParams", "json");
            this.putQueryParameter("KnowledgeParams", knowledgeParamsShrink);
            this.knowledgeParams = knowledgeParams;
            return this;
        }

        /**
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
         * PromptParams.
         */
        public Builder promptParams(String promptParams) {
            this.putQueryParameter("PromptParams", promptParams);
            this.promptParams = promptParams;
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
             * K.
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
             * Weights.
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
             * Rrf.
             */
            public Builder rrf(Rrf rrf) {
                this.rrf = rrf;
                return this;
            }

            /**
             * Weight.
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
             * GraphTopK.
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
             * Filter.
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * GraphEnhance.
             */
            public Builder graphEnhance(Boolean graphEnhance) {
                this.graphEnhance = graphEnhance;
                return this;
            }

            /**
             * GraphSearchArgs.
             */
            public Builder graphSearchArgs(GraphSearchArgs graphSearchArgs) {
                this.graphSearchArgs = graphSearchArgs;
                return this;
            }

            /**
             * HybridSearch.
             */
            public Builder hybridSearch(String hybridSearch) {
                this.hybridSearch = hybridSearch;
                return this;
            }

            /**
             * HybridSearchArgs.
             */
            public Builder hybridSearchArgs(java.util.Map<String, ?> hybridSearchArgs) {
                this.hybridSearchArgs = hybridSearchArgs;
                return this;
            }

            /**
             * Metrics.
             */
            public Builder metrics(String metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * RecallWindow.
             */
            public Builder recallWindow(java.util.List<Long> recallWindow) {
                this.recallWindow = recallWindow;
                return this;
            }

            /**
             * RerankFactor.
             */
            public Builder rerankFactor(Double rerankFactor) {
                this.rerankFactor = rerankFactor;
                return this;
            }

            /**
             * TopK.
             */
            public Builder topK(Long topK) {
                this.topK = topK;
                return this;
            }

            /**
             * UseFullTextRetrieval.
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
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
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
             * QueryParams.
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
             * MergeMethod.
             */
            public Builder mergeMethod(String mergeMethod) {
                this.mergeMethod = mergeMethod;
                return this;
            }

            /**
             * MergeMethodArgs.
             */
            public Builder mergeMethodArgs(MergeMethodArgs mergeMethodArgs) {
                this.mergeMethodArgs = mergeMethodArgs;
                return this;
            }

            /**
             * RerankFactor.
             */
            public Builder rerankFactor(Double rerankFactor) {
                this.rerankFactor = rerankFactor;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder sourceCollection(java.util.List<SourceCollection> sourceCollection) {
                this.sourceCollection = sourceCollection;
                return this;
            }

            /**
             * TopK.
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Role.
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Parameters.
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
             * Function.
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
             * MaxTokens.
             */
            public Builder maxTokens(Long maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
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
             * N.
             */
            public Builder n(Long n) {
                this.n = n;
                return this;
            }

            /**
             * PresencePenalty.
             */
            public Builder presencePenalty(Double presencePenalty) {
                this.presencePenalty = presencePenalty;
                return this;
            }

            /**
             * Seed.
             */
            public Builder seed(Long seed) {
                this.seed = seed;
                return this;
            }

            /**
             * Stop.
             */
            public Builder stop(java.util.List<String> stop) {
                this.stop = stop;
                return this;
            }

            /**
             * Temperature.
             */
            public Builder temperature(Double temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * Tools.
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * TopP.
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
