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
 * {@link UpdateLibraryRequest} extends {@link RequestModel}
 *
 * <p>UpdateLibraryRequest</p>
 */
public class UpdateLibraryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("indexSetting")
    private IndexSetting indexSetting;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryName")
    private String libraryName;

    private UpdateLibraryRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.description = builder.description;
        this.indexSetting = builder.indexSetting;
        this.libraryId = builder.libraryId;
        this.libraryName = builder.libraryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLibraryRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return indexSetting
     */
    public IndexSetting getIndexSetting() {
        return this.indexSetting;
    }

    /**
     * @return libraryId
     */
    public String getLibraryId() {
        return this.libraryId;
    }

    /**
     * @return libraryName
     */
    public String getLibraryName() {
        return this.libraryName;
    }

    public static final class Builder extends Request.Builder<UpdateLibraryRequest, Builder> {
        private String workspaceId; 
        private String description; 
        private IndexSetting indexSetting; 
        private String libraryId; 
        private String libraryName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLibraryRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.description = request.description;
            this.indexSetting = request.indexSetting;
            this.libraryId = request.libraryId;
            this.libraryName = request.libraryName;
        } 

        /**
         * <p>Workspace ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>Document library description</p>
         * 
         * <strong>example:</strong>
         * <p>文档库描述</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Document library index configuration</p>
         */
        public Builder indexSetting(IndexSetting indexSetting) {
            this.putBodyParameter("indexSetting", indexSetting);
            this.indexSetting = indexSetting;
            return this;
        }

        /**
         * <p>Document library ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsfbashdbb</p>
         */
        public Builder libraryId(String libraryId) {
            this.putBodyParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        /**
         * <p>Document library name</p>
         * 
         * <strong>example:</strong>
         * <p>测试文档库</p>
         */
        public Builder libraryName(String libraryName) {
            this.putBodyParameter("libraryName", libraryName);
            this.libraryName = libraryName;
            return this;
        }

        @Override
        public UpdateLibraryRequest build() {
            return new UpdateLibraryRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLibraryRequest} extends {@link TeaModel}
     *
     * <p>UpdateLibraryRequest</p>
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
             * <p>Layout-based chunking</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder docTreeSplit(Boolean docTreeSplit) {
                this.docTreeSplit = docTreeSplit;
                return this;
            }

            /**
             * <p>Layout-based chunking size</p>
             * 
             * <strong>example:</strong>
             * <p>160</p>
             */
            public Builder docTreeSplitSize(Integer docTreeSplitSize) {
                this.docTreeSplitSize = docTreeSplitSize;
                return this;
            }

            /**
             * <p>Enhance images</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enhanceGraph(Boolean enhanceGraph) {
                this.enhanceGraph = enhanceGraph;
                return this;
            }

            /**
             * <p>Enhance tables</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enhanceTable(Boolean enhanceTable) {
                this.enhanceTable = enhanceTable;
                return this;
            }

            /**
             * <p>Chunk overlap length</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder overlap(Integer overlap) {
                this.overlap = overlap;
                return this;
            }

            /**
             * <p>Split by sentence. Default is true</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sentenceSplit(Boolean sentenceSplit) {
                this.sentenceSplit = sentenceSplit;
                return this;
            }

            /**
             * <p>Average sentence-based chunking length</p>
             * 
             * <strong>example:</strong>
             * <p>160</p>
             */
            public Builder sentenceSplitSize(Integer sentenceSplitSize) {
                this.sentenceSplitSize = sentenceSplitSize;
                return this;
            }

            /**
             * <p>Fixed-length chunking size</p>
             * 
             * <strong>example:</strong>
             * <p>256</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Enable chunking</p>
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
     * {@link UpdateLibraryRequest} extends {@link TeaModel}
     *
     * <p>UpdateLibraryRequest</p>
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
             * <p>Temperature</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder temperature(Double temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * <p>Top P</p>
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
     * {@link UpdateLibraryRequest} extends {@link TeaModel}
     *
     * <p>UpdateLibraryRequest</p>
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
             * <p>Multi-turn enhancement</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableFollowUp(Boolean enableFollowUp) {
                this.enableFollowUp = enableFollowUp;
                return this;
            }

            /**
             * <p>Use Large Language Models (LLMs) to decompose queries</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableMultiQuery(Boolean enableMultiQuery) {
                this.enableMultiQuery = enableMultiQuery;
                return this;
            }

            /**
             * <p>Use Large Language Models (LLMs) to answer queries</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableOpenQa(Boolean enableOpenQa) {
                this.enableOpenQa = enableOpenQa;
                return this;
            }

            /**
             * <p>Rewrite queries using domain knowledge</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableQueryRewrite(Boolean enableQueryRewrite) {
                this.enableQueryRewrite = enableQueryRewrite;
                return this;
            }

            /**
             * <p>Record session history</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableSession(Boolean enableSession) {
                this.enableSession = enableSession;
                return this;
            }

            /**
             * <p>Document library ID used for query rewriting</p>
             * 
             * <strong>example:</strong>
             * <p>sjdhgfc</p>
             */
            public Builder localKnowledgeId(String localKnowledgeId) {
                this.localKnowledgeId = localKnowledgeId;
                return this;
            }

            /**
             * <p>Include document references in responses</p>
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
     * {@link UpdateLibraryRequest} extends {@link TeaModel}
     *
     * <p>UpdateLibraryRequest</p>
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
             * <p>Merge and sort strategy</p>
             * 
             * <strong>example:</strong>
             * <p>model</p>
             */
            public Builder documentRankType(String documentRankType) {
                this.documentRankType = documentRankType;
                return this;
            }

            /**
             * <p>Number of results from two-way merge and summarization</p>
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
     * {@link UpdateLibraryRequest} extends {@link TeaModel}
     *
     * <p>UpdateLibraryRequest</p>
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
             * <p>Text index type</p>
             * 
             * <strong>example:</strong>
             * <p>ElasticSearch</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Enable text indexing</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>Text index analyzer: Standard, IkMaxWord, or IkSmart</p>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder indexAnalyzer(String indexAnalyzer) {
                this.indexAnalyzer = indexAnalyzer;
                return this;
            }

            /**
             * <p>Text index ranking threshold</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder rankThreshold(Double rankThreshold) {
                this.rankThreshold = rankThreshold;
                return this;
            }

            /**
             * <p>Text index search analyzer: Standard, IkMaxWord, or IkSmart</p>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder searchAnalyzer(String searchAnalyzer) {
                this.searchAnalyzer = searchAnalyzer;
                return this;
            }

            /**
             * <p>Number of final summarized results from text indexing</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
     * {@link UpdateLibraryRequest} extends {@link TeaModel}
     *
     * <p>UpdateLibraryRequest</p>
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
             * <p>Vector index source. We recommend ADB</p>
             * 
             * <strong>example:</strong>
             * <p>ADB</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Text embedding model for vector indexing</p>
             * 
             * <strong>example:</strong>
             * <p>DashScope</p>
             */
            public Builder embeddingType(String embeddingType) {
                this.embeddingType = embeddingType;
                return this;
            }

            /**
             * <p>Enable vector indexing</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>Vector index ranking threshold</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder rankThreshold(Double rankThreshold) {
                this.rankThreshold = rankThreshold;
                return this;
            }

            /**
             * <p>Number of final summarized results from vector indexing</p>
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
     * {@link UpdateLibraryRequest} extends {@link TeaModel}
     *
     * <p>UpdateLibraryRequest</p>
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
             * <p>Chunking strategy</p>
             */
            public Builder chunkStrategy(ChunkStrategy chunkStrategy) {
                this.chunkStrategy = chunkStrategy;
                return this;
            }

            /**
             * <p>Model configuration</p>
             */
            public Builder modelConfig(ModelConfig modelConfig) {
                this.modelConfig = modelConfig;
                return this;
            }

            /**
             * <p>Prompt role style</p>
             * 
             * <strong>example:</strong>
             * <p>你是一位文档分析专家，非常善于从给定的知识中，找到重点，像老师给学生讲课一样把问题回答清晰。你的回答富有逻辑性，遇到复杂问题，你善于一步一步思考。</p>
             */
            public Builder promptRoleStyle(String promptRoleStyle) {
                this.promptRoleStyle = promptRoleStyle;
                return this;
            }

            /**
             * <p>Query enhancement</p>
             */
            public Builder queryEnhancer(QueryEnhancer queryEnhancer) {
                this.queryEnhancer = queryEnhancer;
                return this;
            }

            /**
             * <p>Retrieval strategy</p>
             */
            public Builder recallStrategy(RecallStrategy recallStrategy) {
                this.recallStrategy = recallStrategy;
                return this;
            }

            /**
             * <p>Text index settings</p>
             */
            public Builder textIndexSetting(TextIndexSetting textIndexSetting) {
                this.textIndexSetting = textIndexSetting;
                return this;
            }

            /**
             * <p>Vector index settings</p>
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
}
