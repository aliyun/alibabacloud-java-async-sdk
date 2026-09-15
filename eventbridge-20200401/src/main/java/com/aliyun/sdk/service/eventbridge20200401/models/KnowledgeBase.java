// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link KnowledgeBase} extends {@link TeaModel}
 *
 * <p>KnowledgeBase</p>
 */
public class KnowledgeBase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Catalog")
    private String catalog;

    @com.aliyun.core.annotation.NameInMap("ChunkConfiguration")
    private ChunkConfiguration chunkConfiguration;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EmbeddingDimension")
    private Integer embeddingDimension;

    @com.aliyun.core.annotation.NameInMap("EmbeddingModel")
    private String embeddingModel;

    @com.aliyun.core.annotation.NameInMap("FailureReason")
    private String failureReason;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseName")
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.NameInMap("MetadataSchema")
    private java.util.List<MetadataSchemaField> metadataSchema;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("SearchConfiguration")
    private SearchConfiguration searchConfiguration;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    private KnowledgeBase(Builder builder) {
        this.catalog = builder.catalog;
        this.chunkConfiguration = builder.chunkConfiguration;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.embeddingDimension = builder.embeddingDimension;
        this.embeddingModel = builder.embeddingModel;
        this.failureReason = builder.failureReason;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.metadataSchema = builder.metadataSchema;
        this.namespace = builder.namespace;
        this.searchConfiguration = builder.searchConfiguration;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeBase create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return chunkConfiguration
     */
    public ChunkConfiguration getChunkConfiguration() {
        return this.chunkConfiguration;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return embeddingDimension
     */
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    /**
     * @return embeddingModel
     */
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    /**
     * @return failureReason
     */
    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    /**
     * @return metadataSchema
     */
    public java.util.List<MetadataSchemaField> getMetadataSchema() {
        return this.metadataSchema;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return searchConfiguration
     */
    public SearchConfiguration getSearchConfiguration() {
        return this.searchConfiguration;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String catalog; 
        private ChunkConfiguration chunkConfiguration; 
        private String createdAt; 
        private String description; 
        private Integer embeddingDimension; 
        private String embeddingModel; 
        private String failureReason; 
        private String knowledgeBaseName; 
        private java.util.List<MetadataSchemaField> metadataSchema; 
        private String namespace; 
        private SearchConfiguration searchConfiguration; 
        private String status; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(KnowledgeBase model) {
            this.catalog = model.catalog;
            this.chunkConfiguration = model.chunkConfiguration;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.embeddingDimension = model.embeddingDimension;
            this.embeddingModel = model.embeddingModel;
            this.failureReason = model.failureReason;
            this.knowledgeBaseName = model.knowledgeBaseName;
            this.metadataSchema = model.metadataSchema;
            this.namespace = model.namespace;
            this.searchConfiguration = model.searchConfiguration;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The EventHouse data catalog to which the knowledge base belongs. This value cannot be modified after the knowledge base is created.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>The default chunking strategy of the knowledge base. This configuration takes effect only for documents uploaded after the configuration is updated. Existing documents are not re-chunked.</p>
         */
        public Builder chunkConfiguration(ChunkConfiguration chunkConfiguration) {
            this.chunkConfiguration = chunkConfiguration;
            return this;
        }

        /**
         * <p>The time when the knowledge base was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-24T10:00:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The description of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>Product documentation knowledge base</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The embedding vector dimension specified during creation or the default dimension of the model. This value cannot be modified after the knowledge base is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder embeddingDimension(Integer embeddingDimension) {
            this.embeddingDimension = embeddingDimension;
            return this;
        }

        /**
         * <p>The embedding model specified during creation. This value cannot be modified after the knowledge base is created.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v4</p>
         */
        public Builder embeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }

        /**
         * <p>The brief reason for the most recent creation or deletion failure. This parameter is returned only when the status is CREATE_FAILED or DELETE_FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>OssException: BucketAlreadyExists ...</p>
         */
        public Builder failureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        /**
         * <p>The name of the knowledge base, which is unique within the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>product-docs</p>
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * <p>The metadata fields declared when the knowledge base was created. These fields cannot be modified after the knowledge base is created.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;department&quot;,&quot;Type&quot;:&quot;STRING&quot;}]</p>
         */
        public Builder metadataSchema(java.util.List<MetadataSchemaField> metadataSchema) {
            this.metadataSchema = metadataSchema;
            return this;
        }

        /**
         * <p>The EventHouse namespace to which the knowledge base belongs. This value cannot be modified after the knowledge base is created.</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The default search configuration at the knowledge base level. This configuration takes effect when the corresponding parameters are not specified in a search request. You can modify this configuration by calling the UpdateKnowledgeBase operation.</p>
         */
        public Builder searchConfiguration(SearchConfiguration searchConfiguration) {
            this.searchConfiguration = searchConfiguration;
            return this;
        }

        /**
         * <p>The current status of the knowledge base. Valid values:</p>
         * <ul>
         * <li>CREATING: The knowledge base is being created.</li>
         * <li>ACTIVE: The knowledge base is available.</li>
         * <li>CREATE_FAILED: The knowledge base failed to be created.</li>
         * <li>DELETING: The knowledge base is being deleted.</li>
         * <li>DELETE_FAILED: The knowledge base failed to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the knowledge base was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-24T10:00:00Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public KnowledgeBase build() {
            return new KnowledgeBase(this);
        } 

    } 

    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class PreprocessRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RemoveUrlsAndEmails")
        private Boolean removeUrlsAndEmails;

        @com.aliyun.core.annotation.NameInMap("ReplaceConsecutiveWhitespace")
        private Boolean replaceConsecutiveWhitespace;

        private PreprocessRules(Builder builder) {
            this.removeUrlsAndEmails = builder.removeUrlsAndEmails;
            this.replaceConsecutiveWhitespace = builder.replaceConsecutiveWhitespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreprocessRules create() {
            return builder().build();
        }

        /**
         * @return removeUrlsAndEmails
         */
        public Boolean getRemoveUrlsAndEmails() {
            return this.removeUrlsAndEmails;
        }

        /**
         * @return replaceConsecutiveWhitespace
         */
        public Boolean getReplaceConsecutiveWhitespace() {
            return this.replaceConsecutiveWhitespace;
        }

        public static final class Builder {
            private Boolean removeUrlsAndEmails; 
            private Boolean replaceConsecutiveWhitespace; 

            private Builder() {
            } 

            private Builder(PreprocessRules model) {
                this.removeUrlsAndEmails = model.removeUrlsAndEmails;
                this.replaceConsecutiveWhitespace = model.replaceConsecutiveWhitespace;
            } 

            /**
             * <p>Specifies whether to remove URLs and email addresses during parsing.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder removeUrlsAndEmails(Boolean removeUrlsAndEmails) {
                this.removeUrlsAndEmails = removeUrlsAndEmails;
                return this;
            }

            /**
             * <p>Specifies whether to replace consecutive whitespace characters (spaces, line breaks, and tab characters) with a single space.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder replaceConsecutiveWhitespace(Boolean replaceConsecutiveWhitespace) {
                this.replaceConsecutiveWhitespace = replaceConsecutiveWhitespace;
                return this;
            }

            public PreprocessRules build() {
                return new PreprocessRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class ChunkConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeadingLevel")
        private Integer headingLevel;

        @com.aliyun.core.annotation.NameInMap("MaxChunkSize")
        private Integer maxChunkSize;

        @com.aliyun.core.annotation.NameInMap("OverlapSize")
        private Integer overlapSize;

        @com.aliyun.core.annotation.NameInMap("PreprocessRules")
        private PreprocessRules preprocessRules;

        @com.aliyun.core.annotation.NameInMap("Separator")
        private String separator;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private String strategy;

        private ChunkConfiguration(Builder builder) {
            this.headingLevel = builder.headingLevel;
            this.maxChunkSize = builder.maxChunkSize;
            this.overlapSize = builder.overlapSize;
            this.preprocessRules = builder.preprocessRules;
            this.separator = builder.separator;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChunkConfiguration create() {
            return builder().build();
        }

        /**
         * @return headingLevel
         */
        public Integer getHeadingLevel() {
            return this.headingLevel;
        }

        /**
         * @return maxChunkSize
         */
        public Integer getMaxChunkSize() {
            return this.maxChunkSize;
        }

        /**
         * @return overlapSize
         */
        public Integer getOverlapSize() {
            return this.overlapSize;
        }

        /**
         * @return preprocessRules
         */
        public PreprocessRules getPreprocessRules() {
            return this.preprocessRules;
        }

        /**
         * @return separator
         */
        public String getSeparator() {
            return this.separator;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private Integer headingLevel; 
            private Integer maxChunkSize; 
            private Integer overlapSize; 
            private PreprocessRules preprocessRules; 
            private String separator; 
            private String strategy; 

            private Builder() {
            } 

            private Builder(ChunkConfiguration model) {
                this.headingLevel = model.headingLevel;
                this.maxChunkSize = model.maxChunkSize;
                this.overlapSize = model.overlapSize;
                this.preprocessRules = model.preprocessRules;
                this.separator = model.separator;
                this.strategy = model.strategy;
            } 

            /**
             * <p>The heading level (1 to 6) used for splitting in the BY_HEADING strategy. Headings at or above this level serve as split boundaries. Deeper-level headings are retained in the chunk body.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder headingLevel(Integer headingLevel) {
                this.headingLevel = headingLevel;
                return this;
            }

            /**
             * <p>The maximum character length of a single chunk. Starting from revision 22, this value is character-based. Valid values: 1 to 6000.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder maxChunkSize(Integer maxChunkSize) {
                this.maxChunkSize = maxChunkSize;
                return this;
            }

            /**
             * <p>The overlap character length between adjacent chunks. This parameter takes effect only for the BY_LENGTH strategy. When the value is greater than 0, the beginning of the next chunk repeats the content from the end of the previous chunk within this window. The overlap does not cause a chunk to exceed MaxChunkSize. A value of 0 indicates no overlap.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder overlapSize(Integer overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>The preprocessing rules that take effect during document parsing.</p>
             */
            public Builder preprocessRules(PreprocessRules preprocessRules) {
                this.preprocessRules = preprocessRules;
                return this;
            }

            /**
             * <p>The separator used in the BY_SEPARATOR strategy. The separator is matched as a literal string (not a regular expression). The maximum length is 32 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>\\n\\n</p>
             */
            public Builder separator(String separator) {
                this.separator = separator;
                return this;
            }

            /**
             * <p>The chunking strategy. Valid values:</p>
             * <ul>
             * <li>AUTO: intelligent splitting (heading-aware + paragraph packing).</li>
             * <li>BY_LENGTH: sliding window splitting by length. You can specify OverlapSize.</li>
             * <li>BY_SEPARATOR: splitting by separator. You must specify Separator.</li>
             * <li>BY_HEADING: splitting by heading level. You must specify HeadingLevel.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BY_SEPARATOR</p>
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            public ChunkConfiguration build() {
                return new ChunkConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBase} extends {@link TeaModel}
     *
     * <p>KnowledgeBase</p>
     */
    public static class SearchConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("RankAlgorithm")
        private String rankAlgorithm;

        @com.aliyun.core.annotation.NameInMap("RerankEnabled")
        private Boolean rerankEnabled;

        @com.aliyun.core.annotation.NameInMap("RerankModel")
        private String rerankModel;

        @com.aliyun.core.annotation.NameInMap("RrfK")
        private Integer rrfK;

        @com.aliyun.core.annotation.NameInMap("TopK")
        private Integer topK;

        @com.aliyun.core.annotation.NameInMap("VectorWeight")
        private Double vectorWeight;

        private SearchConfiguration(Builder builder) {
            this.mode = builder.mode;
            this.rankAlgorithm = builder.rankAlgorithm;
            this.rerankEnabled = builder.rerankEnabled;
            this.rerankModel = builder.rerankModel;
            this.rrfK = builder.rrfK;
            this.topK = builder.topK;
            this.vectorWeight = builder.vectorWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchConfiguration create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return rankAlgorithm
         */
        public String getRankAlgorithm() {
            return this.rankAlgorithm;
        }

        /**
         * @return rerankEnabled
         */
        public Boolean getRerankEnabled() {
            return this.rerankEnabled;
        }

        /**
         * @return rerankModel
         */
        public String getRerankModel() {
            return this.rerankModel;
        }

        /**
         * @return rrfK
         */
        public Integer getRrfK() {
            return this.rrfK;
        }

        /**
         * @return topK
         */
        public Integer getTopK() {
            return this.topK;
        }

        /**
         * @return vectorWeight
         */
        public Double getVectorWeight() {
            return this.vectorWeight;
        }

        public static final class Builder {
            private String mode; 
            private String rankAlgorithm; 
            private Boolean rerankEnabled; 
            private String rerankModel; 
            private Integer rrfK; 
            private Integer topK; 
            private Double vectorWeight; 

            private Builder() {
            } 

            private Builder(SearchConfiguration model) {
                this.mode = model.mode;
                this.rankAlgorithm = model.rankAlgorithm;
                this.rerankEnabled = model.rerankEnabled;
                this.rerankModel = model.rerankModel;
                this.rrfK = model.rrfK;
                this.topK = model.topK;
                this.vectorWeight = model.vectorWeight;
            } 

            /**
             * <p>The retrieval mode. Valid values:</p>
             * <ul>
             * <li>KEYWORD: keyword retrieval.</li>
             * <li>VECTOR: vector retrieval.</li>
             * <li>HYBRID: hybrid retrieval.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HYBRID</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The fusion algorithm for hybrid search. This parameter takes effect only in hybrid search mode. Valid values:</p>
             * <ul>
             * <li>RRF: reciprocal rank fusion.</li>
             * <li>WEIGHTED: weighted normalization fusion. Use this value together with VectorWeight.</li>
             * </ul>
             * <p>Default value: RRF.</p>
             * 
             * <strong>example:</strong>
             * <p>RRF</p>
             */
            public Builder rankAlgorithm(String rankAlgorithm) {
                this.rankAlgorithm = rankAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether reranking is enabled by default. This parameter takes effect for all search modes (KEYWORD, VECTOR, and HYBRID). This default value is used when the Rerank parameter is not specified in a search request.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder rerankEnabled(Boolean rerankEnabled) {
                this.rerankEnabled = rerankEnabled;
                return this;
            }

            /**
             * <p>The default reranking model used when the RerankModel parameter is not specified in a search request. Valid values: qwen3-rerank, gte-rerank-v2, and qwen3-vl-rerank. Default value: qwen3-rerank. Score distributions vary across models and cannot be compared. Use the same model consistently within a knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-rerank</p>
             */
            public Builder rerankModel(String rerankModel) {
                this.rerankModel = rerankModel;
                return this;
            }

            /**
             * <p>The k parameter of the RRF fusion algorithm. The value must be greater than 0. Default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder rrfK(Integer rrfK) {
                this.rrfK = rrfK;
                return this;
            }

            /**
             * <p>The maximum number of results returned by default for a search request.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            /**
             * <p>The weight of the vector path in the WEIGHTED fusion algorithm. Valid values: 0 to 1. The keyword path weight equals 1 minus this value. Default value: 0.7.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7</p>
             */
            public Builder vectorWeight(Double vectorWeight) {
                this.vectorWeight = vectorWeight;
                return this;
            }

            public SearchConfiguration build() {
                return new SearchConfiguration(this);
            } 

        } 

    }
}
