// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetLibraryResponseBody} extends {@link TeaModel}
 *
 * <p>GetLibraryResponseBody</p>
 */
public class GetLibraryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private GetLibraryResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLibraryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Data data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        private Builder() {
        } 

        private Builder(GetLibraryResponseBody model) {
            this.cost = model.cost;
            this.data = model.data;
            this.dataType = model.dataType;
            this.errCode = model.errCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.time = model.time;
        } 

        /**
         * <p>Response time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * <p>The response data object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Fault type</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>44BD277A-87F9-5310-8D63-3E6645F1DA85</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>UNIX timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public GetLibraryResponseBody build() {
            return new GetLibraryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLibraryResponseBody} extends {@link TeaModel}
     *
     * <p>GetLibraryResponseBody</p>
     */
    public static class ChunkStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("docTreeSplit")
        private Boolean docTreeSplit;

        @com.aliyun.core.annotation.NameInMap("docTreeSplitSize")
        private Integer docTreeSplitSize;

        @com.aliyun.core.annotation.NameInMap("enhanceGraph")
        private Boolean enhanceGraph;

        @com.aliyun.core.annotation.NameInMap("enhanceTable")
        private Boolean enhanceTable;

        @com.aliyun.core.annotation.NameInMap("overlap")
        private Integer overlap;

        @com.aliyun.core.annotation.NameInMap("sentenceSplit")
        private Boolean sentenceSplit;

        @com.aliyun.core.annotation.NameInMap("sentenceSplitSize")
        private Integer sentenceSplitSize;

        @com.aliyun.core.annotation.NameInMap("size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("split")
        private Boolean split;

        private ChunkStrategy(Builder builder) {
            this.docTreeSplit = builder.docTreeSplit;
            this.docTreeSplitSize = builder.docTreeSplitSize;
            this.enhanceGraph = builder.enhanceGraph;
            this.enhanceTable = builder.enhanceTable;
            this.overlap = builder.overlap;
            this.sentenceSplit = builder.sentenceSplit;
            this.sentenceSplitSize = builder.sentenceSplitSize;
            this.size = builder.size;
            this.split = builder.split;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChunkStrategy create() {
            return builder().build();
        }

        /**
         * @return docTreeSplit
         */
        public Boolean getDocTreeSplit() {
            return this.docTreeSplit;
        }

        /**
         * @return docTreeSplitSize
         */
        public Integer getDocTreeSplitSize() {
            return this.docTreeSplitSize;
        }

        /**
         * @return enhanceGraph
         */
        public Boolean getEnhanceGraph() {
            return this.enhanceGraph;
        }

        /**
         * @return enhanceTable
         */
        public Boolean getEnhanceTable() {
            return this.enhanceTable;
        }

        /**
         * @return overlap
         */
        public Integer getOverlap() {
            return this.overlap;
        }

        /**
         * @return sentenceSplit
         */
        public Boolean getSentenceSplit() {
            return this.sentenceSplit;
        }

        /**
         * @return sentenceSplitSize
         */
        public Integer getSentenceSplitSize() {
            return this.sentenceSplitSize;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return split
         */
        public Boolean getSplit() {
            return this.split;
        }

        public static final class Builder {
            private Boolean docTreeSplit; 
            private Integer docTreeSplitSize; 
            private Boolean enhanceGraph; 
            private Boolean enhanceTable; 
            private Integer overlap; 
            private Boolean sentenceSplit; 
            private Integer sentenceSplitSize; 
            private Integer size; 
            private Boolean split; 

            private Builder() {
            } 

            private Builder(ChunkStrategy model) {
                this.docTreeSplit = model.docTreeSplit;
                this.docTreeSplitSize = model.docTreeSplitSize;
                this.enhanceGraph = model.enhanceGraph;
                this.enhanceTable = model.enhanceTable;
                this.overlap = model.overlap;
                this.sentenceSplit = model.sentenceSplit;
                this.sentenceSplitSize = model.sentenceSplitSize;
                this.size = model.size;
                this.split = model.split;
            } 

            /**
             * <p>Enable layout-based splitting.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder docTreeSplit(Boolean docTreeSplit) {
                this.docTreeSplit = docTreeSplit;
                return this;
            }

            /**
             * <p>The layout-based splitting size.</p>
             * 
             * <strong>example:</strong>
             * <p>160</p>
             */
            public Builder docTreeSplitSize(Integer docTreeSplitSize) {
                this.docTreeSplitSize = docTreeSplitSize;
                return this;
            }

            /**
             * <p>Enhance images.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enhanceGraph(Boolean enhanceGraph) {
                this.enhanceGraph = enhanceGraph;
                return this;
            }

            /**
             * <p>Enhance tables.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enhanceTable(Boolean enhanceTable) {
                this.enhanceTable = enhanceTable;
                return this;
            }

            /**
             * <p>The overlap length between chunks.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder overlap(Integer overlap) {
                this.overlap = overlap;
                return this;
            }

            /**
             * <p>Split by sentence.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sentenceSplit(Boolean sentenceSplit) {
                this.sentenceSplit = sentenceSplit;
                return this;
            }

            /**
             * <p>The sentence-based splitting size.</p>
             * 
             * <strong>example:</strong>
             * <p>160</p>
             */
            public Builder sentenceSplitSize(Integer sentenceSplitSize) {
                this.sentenceSplitSize = sentenceSplitSize;
                return this;
            }

            /**
             * <p>The chunk size.</p>
             * 
             * <strong>example:</strong>
             * <p>256</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Enable chunking.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder split(Boolean split) {
                this.split = split;
                return this;
            }

            public ChunkStrategy build() {
                return new ChunkStrategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLibraryResponseBody} extends {@link TeaModel}
     *
     * <p>GetLibraryResponseBody</p>
     */
    public static class ModelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("temperature")
        private Double temperature;

        @com.aliyun.core.annotation.NameInMap("topP")
        private Double topP;

        private ModelConfig(Builder builder) {
            this.temperature = builder.temperature;
            this.topP = builder.topP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelConfig create() {
            return builder().build();
        }

        /**
         * @return temperature
         */
        public Double getTemperature() {
            return this.temperature;
        }

        /**
         * @return topP
         */
        public Double getTopP() {
            return this.topP;
        }

        public static final class Builder {
            private Double temperature; 
            private Double topP; 

            private Builder() {
            } 

            private Builder(ModelConfig model) {
                this.temperature = model.temperature;
                this.topP = model.topP;
            } 

            /**
             * <p>temperature</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder temperature(Double temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * <p>topP</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder topP(Double topP) {
                this.topP = topP;
                return this;
            }

            public ModelConfig build() {
                return new ModelConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLibraryResponseBody} extends {@link TeaModel}
     *
     * <p>GetLibraryResponseBody</p>
     */
    public static class QueryEnhancer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableFollowUp")
        private Boolean enableFollowUp;

        @com.aliyun.core.annotation.NameInMap("enableMultiQuery")
        private Boolean enableMultiQuery;

        @com.aliyun.core.annotation.NameInMap("enableOpenQa")
        private Boolean enableOpenQa;

        @com.aliyun.core.annotation.NameInMap("enableQueryRewrite")
        private Boolean enableQueryRewrite;

        @com.aliyun.core.annotation.NameInMap("enableSession")
        private Boolean enableSession;

        @com.aliyun.core.annotation.NameInMap("localKnowledgeId")
        private String localKnowledgeId;

        @com.aliyun.core.annotation.NameInMap("withDocumentReference")
        private Boolean withDocumentReference;

        private QueryEnhancer(Builder builder) {
            this.enableFollowUp = builder.enableFollowUp;
            this.enableMultiQuery = builder.enableMultiQuery;
            this.enableOpenQa = builder.enableOpenQa;
            this.enableQueryRewrite = builder.enableQueryRewrite;
            this.enableSession = builder.enableSession;
            this.localKnowledgeId = builder.localKnowledgeId;
            this.withDocumentReference = builder.withDocumentReference;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryEnhancer create() {
            return builder().build();
        }

        /**
         * @return enableFollowUp
         */
        public Boolean getEnableFollowUp() {
            return this.enableFollowUp;
        }

        /**
         * @return enableMultiQuery
         */
        public Boolean getEnableMultiQuery() {
            return this.enableMultiQuery;
        }

        /**
         * @return enableOpenQa
         */
        public Boolean getEnableOpenQa() {
            return this.enableOpenQa;
        }

        /**
         * @return enableQueryRewrite
         */
        public Boolean getEnableQueryRewrite() {
            return this.enableQueryRewrite;
        }

        /**
         * @return enableSession
         */
        public Boolean getEnableSession() {
            return this.enableSession;
        }

        /**
         * @return localKnowledgeId
         */
        public String getLocalKnowledgeId() {
            return this.localKnowledgeId;
        }

        /**
         * @return withDocumentReference
         */
        public Boolean getWithDocumentReference() {
            return this.withDocumentReference;
        }

        public static final class Builder {
            private Boolean enableFollowUp; 
            private Boolean enableMultiQuery; 
            private Boolean enableOpenQa; 
            private Boolean enableQueryRewrite; 
            private Boolean enableSession; 
            private String localKnowledgeId; 
            private Boolean withDocumentReference; 

            private Builder() {
            } 

            private Builder(QueryEnhancer model) {
                this.enableFollowUp = model.enableFollowUp;
                this.enableMultiQuery = model.enableMultiQuery;
                this.enableOpenQa = model.enableOpenQa;
                this.enableQueryRewrite = model.enableQueryRewrite;
                this.enableSession = model.enableSession;
                this.localKnowledgeId = model.localKnowledgeId;
                this.withDocumentReference = model.withDocumentReference;
            } 

            /**
             * <p>Enable multi-turn query enhancement.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableFollowUp(Boolean enableFollowUp) {
                this.enableFollowUp = enableFollowUp;
                return this;
            }

            /**
             * <p>Use Large Language Model (LLM) knowledge to decompose queries.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableMultiQuery(Boolean enableMultiQuery) {
                this.enableMultiQuery = enableMultiQuery;
                return this;
            }

            /**
             * <p>Use Large Language Model (LLM) knowledge to answer questions.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableOpenQa(Boolean enableOpenQa) {
                this.enableOpenQa = enableOpenQa;
                return this;
            }

            /**
             * <p>Rewrite queries using domain-specific knowledge.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableQueryRewrite(Boolean enableQueryRewrite) {
                this.enableQueryRewrite = enableQueryRewrite;
                return this;
            }

            /**
             * <p>Record session history.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableSession(Boolean enableSession) {
                this.enableSession = enableSession;
                return this;
            }

            /**
             * <p>The document library ID used for knowledge rewriting.</p>
             * 
             * <strong>example:</strong>
             * <p>2836482634</p>
             */
            public Builder localKnowledgeId(String localKnowledgeId) {
                this.localKnowledgeId = localKnowledgeId;
                return this;
            }

            /**
             * <p>Include document references in responses.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder withDocumentReference(Boolean withDocumentReference) {
                this.withDocumentReference = withDocumentReference;
                return this;
            }

            public QueryEnhancer build() {
                return new QueryEnhancer(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLibraryResponseBody} extends {@link TeaModel}
     *
     * <p>GetLibraryResponseBody</p>
     */
    public static class RecallStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("documentRankType")
        private String documentRankType;

        @com.aliyun.core.annotation.NameInMap("limit")
        private Integer limit;

        private RecallStrategy(Builder builder) {
            this.documentRankType = builder.documentRankType;
            this.limit = builder.limit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallStrategy create() {
            return builder().build();
        }

        /**
         * @return documentRankType
         */
        public String getDocumentRankType() {
            return this.documentRankType;
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        public static final class Builder {
            private String documentRankType; 
            private Integer limit; 

            private Builder() {
            } 

            private Builder(RecallStrategy model) {
                this.documentRankType = model.documentRankType;
                this.limit = model.limit;
            } 

            /**
             * <p>The merge and sort policy.</p>
             * 
             * <strong>example:</strong>
             * <p>model</p>
             */
            public Builder documentRankType(String documentRankType) {
                this.documentRankType = documentRankType;
                return this;
            }

            /**
             * <p>The number of results returned after merging two recall paths.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            public RecallStrategy build() {
                return new RecallStrategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLibraryResponseBody} extends {@link TeaModel}
     *
     * <p>GetLibraryResponseBody</p>
     */
    public static class TextIndexSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("indexAnalyzer")
        private String indexAnalyzer;

        @com.aliyun.core.annotation.NameInMap("rankThreshold")
        private Double rankThreshold;

        @com.aliyun.core.annotation.NameInMap("searchAnalyzer")
        private String searchAnalyzer;

        @com.aliyun.core.annotation.NameInMap("topK")
        private Integer topK;

        private TextIndexSetting(Builder builder) {
            this.category = builder.category;
            this.enable = builder.enable;
            this.indexAnalyzer = builder.indexAnalyzer;
            this.rankThreshold = builder.rankThreshold;
            this.searchAnalyzer = builder.searchAnalyzer;
            this.topK = builder.topK;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextIndexSetting create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return indexAnalyzer
         */
        public String getIndexAnalyzer() {
            return this.indexAnalyzer;
        }

        /**
         * @return rankThreshold
         */
        public Double getRankThreshold() {
            return this.rankThreshold;
        }

        /**
         * @return searchAnalyzer
         */
        public String getSearchAnalyzer() {
            return this.searchAnalyzer;
        }

        /**
         * @return topK
         */
        public Integer getTopK() {
            return this.topK;
        }

        public static final class Builder {
            private String category; 
            private Boolean enable; 
            private String indexAnalyzer; 
            private Double rankThreshold; 
            private String searchAnalyzer; 
            private Integer topK; 

            private Builder() {
            } 

            private Builder(TextIndexSetting model) {
                this.category = model.category;
                this.enable = model.enable;
                this.indexAnalyzer = model.indexAnalyzer;
                this.rankThreshold = model.rankThreshold;
                this.searchAnalyzer = model.searchAnalyzer;
                this.topK = model.topK;
            } 

            /**
             * <p>The text index type.</p>
             * 
             * <strong>example:</strong>
             * <p>ElasticSearch</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Enable text indexing.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The text index analyzer: Standard, IkMaxWord, or IkSmart.</p>
             * 
             * <strong>example:</strong>
             * <p>IkMaxWord</p>
             */
            public Builder indexAnalyzer(String indexAnalyzer) {
                this.indexAnalyzer = indexAnalyzer;
                return this;
            }

            /**
             * <p>The ranking threshold for text indexing.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder rankThreshold(Double rankThreshold) {
                this.rankThreshold = rankThreshold;
                return this;
            }

            /**
             * <p>The text index search analyzer: Standard, IkMaxWord, or IkSmart.</p>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder searchAnalyzer(String searchAnalyzer) {
                this.searchAnalyzer = searchAnalyzer;
                return this;
            }

            /**
             * <p>The number of final summary results from text indexing.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            public TextIndexSetting build() {
                return new TextIndexSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLibraryResponseBody} extends {@link TeaModel}
     *
     * <p>GetLibraryResponseBody</p>
     */
    public static class VectorIndexSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("embeddingType")
        private String embeddingType;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("rankThreshold")
        private Double rankThreshold;

        @com.aliyun.core.annotation.NameInMap("topK")
        private Integer topK;

        private VectorIndexSetting(Builder builder) {
            this.category = builder.category;
            this.embeddingType = builder.embeddingType;
            this.enable = builder.enable;
            this.rankThreshold = builder.rankThreshold;
            this.topK = builder.topK;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VectorIndexSetting create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return embeddingType
         */
        public String getEmbeddingType() {
            return this.embeddingType;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return rankThreshold
         */
        public Double getRankThreshold() {
            return this.rankThreshold;
        }

        /**
         * @return topK
         */
        public Integer getTopK() {
            return this.topK;
        }

        public static final class Builder {
            private String category; 
            private String embeddingType; 
            private Boolean enable; 
            private Double rankThreshold; 
            private Integer topK; 

            private Builder() {
            } 

            private Builder(VectorIndexSetting model) {
                this.category = model.category;
                this.embeddingType = model.embeddingType;
                this.enable = model.enable;
                this.rankThreshold = model.rankThreshold;
                this.topK = model.topK;
            } 

            /**
             * <p>The vector index source. We recommend ADB.</p>
             * 
             * <strong>example:</strong>
             * <p>ADB</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The text embedding model for the vector index.</p>
             * 
             * <strong>example:</strong>
             * <p>DashScope</p>
             */
            public Builder embeddingType(String embeddingType) {
                this.embeddingType = embeddingType;
                return this;
            }

            /**
             * <p>Enable vector indexing.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The ranking threshold for vector indexing.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder rankThreshold(Double rankThreshold) {
                this.rankThreshold = rankThreshold;
                return this;
            }

            /**
             * <p>Number of final results returned by the vector index.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            public VectorIndexSetting build() {
                return new VectorIndexSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLibraryResponseBody} extends {@link TeaModel}
     *
     * <p>GetLibraryResponseBody</p>
     */
    public static class IndexSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkStrategy")
        private ChunkStrategy chunkStrategy;

        @com.aliyun.core.annotation.NameInMap("modelConfig")
        private ModelConfig modelConfig;

        @com.aliyun.core.annotation.NameInMap("promptRoleStyle")
        private String promptRoleStyle;

        @com.aliyun.core.annotation.NameInMap("queryEnhancer")
        private QueryEnhancer queryEnhancer;

        @com.aliyun.core.annotation.NameInMap("recallStrategy")
        private RecallStrategy recallStrategy;

        @com.aliyun.core.annotation.NameInMap("textIndexSetting")
        private TextIndexSetting textIndexSetting;

        @com.aliyun.core.annotation.NameInMap("vectorIndexSetting")
        private VectorIndexSetting vectorIndexSetting;

        private IndexSetting(Builder builder) {
            this.chunkStrategy = builder.chunkStrategy;
            this.modelConfig = builder.modelConfig;
            this.promptRoleStyle = builder.promptRoleStyle;
            this.queryEnhancer = builder.queryEnhancer;
            this.recallStrategy = builder.recallStrategy;
            this.textIndexSetting = builder.textIndexSetting;
            this.vectorIndexSetting = builder.vectorIndexSetting;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexSetting create() {
            return builder().build();
        }

        /**
         * @return chunkStrategy
         */
        public ChunkStrategy getChunkStrategy() {
            return this.chunkStrategy;
        }

        /**
         * @return modelConfig
         */
        public ModelConfig getModelConfig() {
            return this.modelConfig;
        }

        /**
         * @return promptRoleStyle
         */
        public String getPromptRoleStyle() {
            return this.promptRoleStyle;
        }

        /**
         * @return queryEnhancer
         */
        public QueryEnhancer getQueryEnhancer() {
            return this.queryEnhancer;
        }

        /**
         * @return recallStrategy
         */
        public RecallStrategy getRecallStrategy() {
            return this.recallStrategy;
        }

        /**
         * @return textIndexSetting
         */
        public TextIndexSetting getTextIndexSetting() {
            return this.textIndexSetting;
        }

        /**
         * @return vectorIndexSetting
         */
        public VectorIndexSetting getVectorIndexSetting() {
            return this.vectorIndexSetting;
        }

        public static final class Builder {
            private ChunkStrategy chunkStrategy; 
            private ModelConfig modelConfig; 
            private String promptRoleStyle; 
            private QueryEnhancer queryEnhancer; 
            private RecallStrategy recallStrategy; 
            private TextIndexSetting textIndexSetting; 
            private VectorIndexSetting vectorIndexSetting; 

            private Builder() {
            } 

            private Builder(IndexSetting model) {
                this.chunkStrategy = model.chunkStrategy;
                this.modelConfig = model.modelConfig;
                this.promptRoleStyle = model.promptRoleStyle;
                this.queryEnhancer = model.queryEnhancer;
                this.recallStrategy = model.recallStrategy;
                this.textIndexSetting = model.textIndexSetting;
                this.vectorIndexSetting = model.vectorIndexSetting;
            } 

            /**
             * <p>The chunking strategy.</p>
             */
            public Builder chunkStrategy(ChunkStrategy chunkStrategy) {
                this.chunkStrategy = chunkStrategy;
                return this;
            }

            /**
             * <p>Model configuration.</p>
             */
            public Builder modelConfig(ModelConfig modelConfig) {
                this.modelConfig = modelConfig;
                return this;
            }

            /**
             * <p>The prompt role style.</p>
             * 
             * <strong>example:</strong>
             * <p>你是一个信息处理专家。</p>
             */
            public Builder promptRoleStyle(String promptRoleStyle) {
                this.promptRoleStyle = promptRoleStyle;
                return this;
            }

            /**
             * <p>Query enhancement settings.</p>
             */
            public Builder queryEnhancer(QueryEnhancer queryEnhancer) {
                this.queryEnhancer = queryEnhancer;
                return this;
            }

            /**
             * <p>The recall strategy.</p>
             */
            public Builder recallStrategy(RecallStrategy recallStrategy) {
                this.recallStrategy = recallStrategy;
                return this;
            }

            /**
             * <p>Text index settings.</p>
             */
            public Builder textIndexSetting(TextIndexSetting textIndexSetting) {
                this.textIndexSetting = textIndexSetting;
                return this;
            }

            /**
             * <p>Vector index settings.</p>
             */
            public Builder vectorIndexSetting(VectorIndexSetting vectorIndexSetting) {
                this.vectorIndexSetting = vectorIndexSetting;
                return this;
            }

            public IndexSetting build() {
                return new IndexSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLibraryResponseBody} extends {@link TeaModel}
     *
     * <p>GetLibraryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("documentCount")
        private Long documentCount;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("indexSetting")
        private IndexSetting indexSetting;

        @com.aliyun.core.annotation.NameInMap("libraryName")
        private String libraryName;

        private Data(Builder builder) {
            this.description = builder.description;
            this.documentCount = builder.documentCount;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.indexSetting = builder.indexSetting;
            this.libraryName = builder.libraryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return documentCount
         */
        public Long getDocumentCount() {
            return this.documentCount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return indexSetting
         */
        public IndexSetting getIndexSetting() {
            return this.indexSetting;
        }

        /**
         * @return libraryName
         */
        public String getLibraryName() {
            return this.libraryName;
        }

        public static final class Builder {
            private String description; 
            private Long documentCount; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private IndexSetting indexSetting; 
            private String libraryName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.documentCount = model.documentCount;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.indexSetting = model.indexSetting;
                this.libraryName = model.libraryName;
            } 

            /**
             * <p>The document library description.</p>
             * 
             * <strong>example:</strong>
             * <p>文档库的描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of documents in the library.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder documentCount(Long documentCount) {
                this.documentCount = documentCount;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 00:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time in YYYY-MM-DD HH:MM:SS format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 00:00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The document library ID.</p>
             * 
             * <strong>example:</strong>
             * <p>19386728376</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The document library index settings.</p>
             */
            public Builder indexSetting(IndexSetting indexSetting) {
                this.indexSetting = indexSetting;
                return this;
            }

            /**
             * <p>The document library name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试文档库</p>
             */
            public Builder libraryName(String libraryName) {
                this.libraryName = libraryName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
