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
 * {@link ListIndicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndicesResponseBody</p>
 */
public class ListIndicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListIndicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListIndicesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The error status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Index.InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code returned by the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListIndicesResponseBody build() {
            return new ListIndicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIndicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndicesResponseBody</p>
     */
    public static class StructuredIndexConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsRecall")
        private Boolean isRecall;

        @com.aliyun.core.annotation.NameInMap("IsSearch")
        private Boolean isSearch;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private StructuredIndexConfig(Builder builder) {
            this.isRecall = builder.isRecall;
            this.isSearch = builder.isSearch;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructuredIndexConfig create() {
            return builder().build();
        }

        /**
         * @return isRecall
         */
        public Boolean getIsRecall() {
            return this.isRecall;
        }

        /**
         * @return isSearch
         */
        public Boolean getIsSearch() {
            return this.isSearch;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean isRecall; 
            private Boolean isSearch; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(StructuredIndexConfig model) {
                this.isRecall = model.isRecall;
                this.isSearch = model.isSearch;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>Specifies whether this field participates in model responses. A value of <strong>true</strong> indicates that the retrieval results of this column are used as input for the large language model to generate answers.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isRecall(Boolean isRecall) {
                this.isRecall = isRecall;
                return this;
            }

            /**
             * <p>Specifies whether this field participates in knowledge base retrieval. A value of <strong>true</strong> indicates that the knowledge base can search within the data of this column.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSearch(Boolean isSearch) {
                this.isSearch = isSearch;
                return this;
            }

            /**
             * <p>The name of the index field.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the index field.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public StructuredIndexConfig build() {
                return new StructuredIndexConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIndicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndicesResponseBody</p>
     */
    public static class Indices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChunkSize")
        private Integer chunkSize;

        @com.aliyun.core.annotation.NameInMap("ConfgModel")
        private String confgModel;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DocumentIds")
        private java.util.List<String> documentIds;

        @com.aliyun.core.annotation.NameInMap("EmbeddingModelName")
        private String embeddingModelName;

        @com.aliyun.core.annotation.NameInMap("EnableRewrite")
        private Boolean enableRewrite;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OverlapSize")
        private Integer overlapSize;

        @com.aliyun.core.annotation.NameInMap("PipelineCommercialCu")
        private Integer pipelineCommercialCu;

        @com.aliyun.core.annotation.NameInMap("PipelineCommercialType")
        private String pipelineCommercialType;

        @com.aliyun.core.annotation.NameInMap("PipelineStorageUsage")
        private Double pipelineStorageUsage;

        @com.aliyun.core.annotation.NameInMap("RerankMinScore")
        private String rerankMinScore;

        @com.aliyun.core.annotation.NameInMap("RerankModelName")
        private String rerankModelName;

        @com.aliyun.core.annotation.NameInMap("Separator")
        private String separator;

        @com.aliyun.core.annotation.NameInMap("SinkInstanceId")
        private String sinkInstanceId;

        @com.aliyun.core.annotation.NameInMap("SinkRegion")
        private String sinkRegion;

        @com.aliyun.core.annotation.NameInMap("SinkType")
        private String sinkType;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StructureType")
        private String structureType;

        @com.aliyun.core.annotation.NameInMap("StructuredIndexConfig")
        private java.util.List<StructuredIndexConfig> structuredIndexConfig;

        private Indices(Builder builder) {
            this.chunkSize = builder.chunkSize;
            this.confgModel = builder.confgModel;
            this.description = builder.description;
            this.documentIds = builder.documentIds;
            this.embeddingModelName = builder.embeddingModelName;
            this.enableRewrite = builder.enableRewrite;
            this.id = builder.id;
            this.name = builder.name;
            this.overlapSize = builder.overlapSize;
            this.pipelineCommercialCu = builder.pipelineCommercialCu;
            this.pipelineCommercialType = builder.pipelineCommercialType;
            this.pipelineStorageUsage = builder.pipelineStorageUsage;
            this.rerankMinScore = builder.rerankMinScore;
            this.rerankModelName = builder.rerankModelName;
            this.separator = builder.separator;
            this.sinkInstanceId = builder.sinkInstanceId;
            this.sinkRegion = builder.sinkRegion;
            this.sinkType = builder.sinkType;
            this.sourceType = builder.sourceType;
            this.structureType = builder.structureType;
            this.structuredIndexConfig = builder.structuredIndexConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Indices create() {
            return builder().build();
        }

        /**
         * @return chunkSize
         */
        public Integer getChunkSize() {
            return this.chunkSize;
        }

        /**
         * @return confgModel
         */
        public String getConfgModel() {
            return this.confgModel;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return documentIds
         */
        public java.util.List<String> getDocumentIds() {
            return this.documentIds;
        }

        /**
         * @return embeddingModelName
         */
        public String getEmbeddingModelName() {
            return this.embeddingModelName;
        }

        /**
         * @return enableRewrite
         */
        public Boolean getEnableRewrite() {
            return this.enableRewrite;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return overlapSize
         */
        public Integer getOverlapSize() {
            return this.overlapSize;
        }

        /**
         * @return pipelineCommercialCu
         */
        public Integer getPipelineCommercialCu() {
            return this.pipelineCommercialCu;
        }

        /**
         * @return pipelineCommercialType
         */
        public String getPipelineCommercialType() {
            return this.pipelineCommercialType;
        }

        /**
         * @return pipelineStorageUsage
         */
        public Double getPipelineStorageUsage() {
            return this.pipelineStorageUsage;
        }

        /**
         * @return rerankMinScore
         */
        public String getRerankMinScore() {
            return this.rerankMinScore;
        }

        /**
         * @return rerankModelName
         */
        public String getRerankModelName() {
            return this.rerankModelName;
        }

        /**
         * @return separator
         */
        public String getSeparator() {
            return this.separator;
        }

        /**
         * @return sinkInstanceId
         */
        public String getSinkInstanceId() {
            return this.sinkInstanceId;
        }

        /**
         * @return sinkRegion
         */
        public String getSinkRegion() {
            return this.sinkRegion;
        }

        /**
         * @return sinkType
         */
        public String getSinkType() {
            return this.sinkType;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return structureType
         */
        public String getStructureType() {
            return this.structureType;
        }

        /**
         * @return structuredIndexConfig
         */
        public java.util.List<StructuredIndexConfig> getStructuredIndexConfig() {
            return this.structuredIndexConfig;
        }

        public static final class Builder {
            private Integer chunkSize; 
            private String confgModel; 
            private String description; 
            private java.util.List<String> documentIds; 
            private String embeddingModelName; 
            private Boolean enableRewrite; 
            private String id; 
            private String name; 
            private Integer overlapSize; 
            private Integer pipelineCommercialCu; 
            private String pipelineCommercialType; 
            private Double pipelineStorageUsage; 
            private String rerankMinScore; 
            private String rerankModelName; 
            private String separator; 
            private String sinkInstanceId; 
            private String sinkRegion; 
            private String sinkType; 
            private String sourceType; 
            private String structureType; 
            private java.util.List<StructuredIndexConfig> structuredIndexConfig; 

            private Builder() {
            } 

            private Builder(Indices model) {
                this.chunkSize = model.chunkSize;
                this.confgModel = model.confgModel;
                this.description = model.description;
                this.documentIds = model.documentIds;
                this.embeddingModelName = model.embeddingModelName;
                this.enableRewrite = model.enableRewrite;
                this.id = model.id;
                this.name = model.name;
                this.overlapSize = model.overlapSize;
                this.pipelineCommercialCu = model.pipelineCommercialCu;
                this.pipelineCommercialType = model.pipelineCommercialType;
                this.pipelineStorageUsage = model.pipelineStorageUsage;
                this.rerankMinScore = model.rerankMinScore;
                this.rerankModelName = model.rerankModelName;
                this.separator = model.separator;
                this.sinkInstanceId = model.sinkInstanceId;
                this.sinkRegion = model.sinkRegion;
                this.sinkType = model.sinkType;
                this.sourceType = model.sourceType;
                this.structureType = model.structureType;
                this.structuredIndexConfig = model.structuredIndexConfig;
            } 

            /**
             * <p>The estimated chunk size. Valid value range: [1-2048].</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder chunkSize(Integer chunkSize) {
                this.chunkSize = chunkSize;
                return this;
            }

            /**
             * <p>The configuration mode used by this knowledge base. Valid values:</p>
             * <ul>
             * <li>recommend: recommended configuration.</li>
             * <li>user-defined: custom configuration.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>recommend</p>
             */
            public Builder confgModel(String confgModel) {
                this.confgModel = confgModel;
                return this;
            }

            /**
             * <p>The description of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>Products in this catalog are mainly for overseas customers</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of file IDs.</p>
             */
            public Builder documentIds(java.util.List<String> documentIds) {
                this.documentIds = documentIds;
                return this;
            }

            /**
             * <p>The name of the embedding model. Valid values:</p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <ul>
             * <li>text-embedding-v4: text-embedding-v4 model.</li>
             * <li>text-embedding-v3: text-embedding-v3 model.</li>
             * <li>text-embedding-v2: text-embedding-v2 model.</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <ul>
             * <li>text-embedding-v2: text-embedding-v2 model.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text-embedding-v2</p>
             */
            public Builder embeddingModelName(String embeddingModelName) {
                this.embeddingModelName = embeddingModelName;
                return this;
            }

            /**
             * <p>Indicates whether &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/model-studio/use-cases/rag-optimization#b7031e2ad6cji">multi-turn conversation rewriting</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/model-studio/use-cases/rag-optimization#b7031e2ad6cji">multi-turn conversation rewriting</a> is enabled for this knowledge base. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableRewrite(Boolean enableRewrite) {
                this.enableRewrite = enableRewrite;
                return this;
            }

            /**
             * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>lecxr5xxxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>Product Catalog</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The chunk overlap size. Valid value range: [0-1024].</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder overlapSize(Integer overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>The compute unit (CU) specification of the commercial knowledge base. This parameter is valid only for Enterprise Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pipelineCommercialCu(Integer pipelineCommercialCu) {
                this.pipelineCommercialCu = pipelineCommercialCu;
                return this;
            }

            /**
             * <p>The commercial knowledge base edition.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder pipelineCommercialType(String pipelineCommercialType) {
                this.pipelineCommercialType = pipelineCommercialType;
                return this;
            }

            /**
             * <p>The storage usage of the knowledge base. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>0.03</p>
             */
            public Builder pipelineStorageUsage(Double pipelineStorageUsage) {
                this.pipelineStorageUsage = pipelineStorageUsage;
                return this;
            }

            /**
             * <p>The similarity threshold. Valid value range: [0.01-1.00].</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder rerankMinScore(String rerankMinScore) {
                this.rerankMinScore = rerankMinScore;
                return this;
            }

            /**
             * <p>The name of the rerank model. Valid values:</p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <ul>
             * <li>qwen3-rerank-hybrid: qwen3-rerank (hybrid) reranking.</li>
             * <li>qwen3-rerank: qwen3-rerank reranking.</li>
             * <li>gte-rerank-hybrid: gte-rerank (hybrid) reranking.</li>
             * <li>gte-rerank: gte-rerank reranking.</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <ul>
             * <li>gte-rerank-hybrid: official reranking.</li>
             * <li>gte-rerank: gte-rerank reranking.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>gte-rerank-hybrid</p>
             */
            public Builder rerankModelName(String rerankModelName) {
                this.rerankModelName = rerankModelName;
                return this;
            }

            /**
             * <p>The sentence separator. If multiple separators are used, they are separated by |. Valid values:</p>
             * <ul>
             * <li>\
             * : line break</li>
             * <li>，: Chinese comma</li>
             * <li>,: English comma</li>
             * <li>。: Chinese period</li>
             * <li>.: English period</li>
             * <li>！: Chinese exclamation mark</li>
             * <li>!: English exclamation mark</li>
             * <li>；: Chinese semicolon</li>
             * <li>;: English semicolon</li>
             * <li>？: Chinese question mark</li>
             * <li>?: English question mark</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>\n</p>
             */
            public Builder separator(String separator) {
                this.separator = separator;
                return this;
            }

            /**
             * <p>The instance ID of the vector storage for the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>gp-bp1gq62t1788yxxxx</p>
             */
            public Builder sinkInstanceId(String sinkInstanceId) {
                this.sinkInstanceId = sinkInstanceId;
                return this;
            }

            /**
             * <p>The region of the vector storage instance for the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder sinkRegion(String sinkRegion) {
                this.sinkRegion = sinkRegion;
                return this;
            }

            /**
             * <p>The vector storage type of the knowledge base. Valid values:</p>
             * <ul>
             * <li>ES: built-in vector database.</li>
             * <li>BUILT_IN: built-in vector database.</li>
             * <li>ADB: AnalyticDB for PostgreSQL database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BUILT_IN</p>
             */
            public Builder sinkType(String sinkType) {
                this.sinkType = sinkType;
                return this;
            }

            /**
             * <p>The data type in Alibaba Cloud Model Studio &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</p>
             * <p>For document search&lt;props=&quot;china&quot;&gt;/audio and video search knowledge bases, valid values:</p>
             * <ul>
             * <li>DATA_CENTER_CATEGORY: category type.</li>
             * <li>DATA_CENTER_FILE: file type.</li>
             * </ul>
             * <p>For data query/image Q&amp;A knowledge bases, valid values:</p>
             * <ul>
             * <li>DATA_CENTER_STRUCTURED_TABLE: data table type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATA_CENTER_FILE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The type of the knowledge base. Valid values:</p>
             * <ul>
             * <li>UNSTRUCTURED: document search.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UNSTRUCTURED</p>
             */
            public Builder structureType(String structureType) {
                this.structureType = structureType;
                return this;
            }

            /**
             * <p>The index configuration for data query or image Q&amp;A knowledge bases.</p>
             */
            public Builder structuredIndexConfig(java.util.List<StructuredIndexConfig> structuredIndexConfig) {
                this.structuredIndexConfig = structuredIndexConfig;
                return this;
            }

            public Indices build() {
                return new Indices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIndicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Indices")
        private java.util.List<Indices> indices;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.indices = builder.indices;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return indices
         */
        public java.util.List<Indices> getIndices() {
            return this.indices;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Indices> indices; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.indices = model.indices;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of knowledge bases.</p>
             */
            public Builder indices(java.util.List<Indices> indices) {
                this.indices = indices;
                return this;
            }

            /**
             * <p>The page number returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>48</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
