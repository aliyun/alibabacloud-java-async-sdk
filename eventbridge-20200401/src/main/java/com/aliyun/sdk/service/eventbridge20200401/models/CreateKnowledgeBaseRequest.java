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
 * {@link CreateKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeBaseRequest</p>
 */
public class CreateKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String catalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChunkConfiguration")
    private ChunkConfiguration chunkConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmbeddingDimension")
    private Integer embeddingDimension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmbeddingModel")
    private String embeddingModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetadataSchema")
    private java.util.List<MetadataSchema> metadataSchema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchConfiguration")
    private SearchConfiguration searchConfiguration;

    private CreateKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.chunkConfiguration = builder.chunkConfiguration;
        this.description = builder.description;
        this.embeddingDimension = builder.embeddingDimension;
        this.embeddingModel = builder.embeddingModel;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.metadataSchema = builder.metadataSchema;
        this.namespace = builder.namespace;
        this.searchConfiguration = builder.searchConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
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
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    /**
     * @return metadataSchema
     */
    public java.util.List<MetadataSchema> getMetadataSchema() {
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

    public static final class Builder extends Request.Builder<CreateKnowledgeBaseRequest, Builder> {
        private String catalog; 
        private ChunkConfiguration chunkConfiguration; 
        private String description; 
        private Integer embeddingDimension; 
        private String embeddingModel; 
        private String knowledgeBaseName; 
        private java.util.List<MetadataSchema> metadataSchema; 
        private String namespace; 
        private SearchConfiguration searchConfiguration; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeBaseRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.chunkConfiguration = request.chunkConfiguration;
            this.description = request.description;
            this.embeddingDimension = request.embeddingDimension;
            this.embeddingModel = request.embeddingModel;
            this.knowledgeBaseName = request.knowledgeBaseName;
            this.metadataSchema = request.metadataSchema;
            this.namespace = request.namespace;
            this.searchConfiguration = request.searchConfiguration;
        } 

        /**
         * <p>The EventHouse catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies the knowledge base. This parameter cannot be modified after the knowledge base is created. System catalogs cannot be bound.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.putQueryParameter("Catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>Optional. The default chunking strategy for the knowledge base. This strategy applies only to documents uploaded after the configuration is set. If this parameter is not specified, the system default chunking strategy is used.</p>
         */
        public Builder chunkConfiguration(ChunkConfiguration chunkConfiguration) {
            String chunkConfigurationShrink = shrink(chunkConfiguration, "ChunkConfiguration", "json");
            this.putQueryParameter("ChunkConfiguration", chunkConfigurationShrink);
            this.chunkConfiguration = chunkConfiguration;
            return this;
        }

        /**
         * <p>The description of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>Product documentation knowledge base</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Optional. The vector dimensions. The value is validated against the embedding model: text-embedding-v3 supports 64, 128, 256, 512, 768, and 1024. text-embedding-v4 supports 64, 128, 256, 512, 768, 1024, 1536, and 2048. qwen3.7-text-embedding supports 256, 512, 768, 1024, 1536, 2048, and 2560. qwen3.7-text-embedding-flash supports 256, 512, 768, and 1024. Default value: 1024 (the default dimension of the model). This parameter cannot be modified after the knowledge base is created. Even if the dimensions are the same, you must rebuild the knowledge base when switching models.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder embeddingDimension(Integer embeddingDimension) {
            this.putQueryParameter("EmbeddingDimension", embeddingDimension);
            this.embeddingDimension = embeddingDimension;
            return this;
        }

        /**
         * <p>Optional. The embedding model used for vectorization. This parameter cannot be modified after the knowledge base is created. Valid values: text-embedding-v3, text-embedding-v4, qwen3.7-text-embedding, and qwen3.7-text-embedding-flash. Only Bailian Tongyi models are supported. Third-party models are not supported. Default value: text-embedding-v4.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v4</p>
         */
        public Builder embeddingModel(String embeddingModel) {
            this.putQueryParameter("EmbeddingModel", embeddingModel);
            this.embeddingModel = embeddingModel;
            return this;
        }

        /**
         * <p>The name of the knowledge base. The name must be unique within the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product-docs</p>
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.putQueryParameter("KnowledgeBaseName", knowledgeBaseName);
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * <p>Declares the metadata fields of the knowledge base. When you upload documents, the metadata can contain only the fields declared here. This parameter cannot be modified after the knowledge base is created.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;department&quot;,&quot;Type&quot;:&quot;STRING&quot;}]</p>
         */
        public Builder metadataSchema(java.util.List<MetadataSchema> metadataSchema) {
            String metadataSchemaShrink = shrink(metadataSchema, "MetadataSchema", "json");
            this.putQueryParameter("MetadataSchema", metadataSchemaShrink);
            this.metadataSchema = metadataSchema;
            return this;
        }

        /**
         * <p>The EventHouse namespace to which the knowledge base belongs. The namespace must belong to the specified catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies the knowledge base. This parameter cannot be modified after the knowledge base is created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Optional. The default search configuration at the knowledge base level. This configuration takes effect when the corresponding parameters are not specified in search requests. You can modify this configuration after creation by calling UpdateKnowledgeBase.</p>
         */
        public Builder searchConfiguration(SearchConfiguration searchConfiguration) {
            String searchConfigurationShrink = shrink(searchConfiguration, "SearchConfiguration", "json");
            this.putQueryParameter("SearchConfiguration", searchConfigurationShrink);
            this.searchConfiguration = searchConfiguration;
            return this;
        }

        @Override
        public CreateKnowledgeBaseRequest build() {
            return new CreateKnowledgeBaseRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
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
             * <p>Specifies whether to replace consecutive whitespace characters (spaces, line breaks, and tabs) with a single space.</p>
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
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
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
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String separator;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>Required for the BY_HEADING strategy. Valid values: 1 to 6. This parameter is ignored for other strategies. Headings at or above the specified level are used as split boundaries. For example, if you set this parameter to 2, both H1 and H2 headings are used as split boundaries. Deeper-level headings are not used for splitting and are retained in the chunk body. If the content within a section exceeds MaxChunkSize, the system falls back to splitting by paragraphs or sentences. Documents without headings fall back to intelligent chunking.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder headingLevel(Integer headingLevel) {
                this.headingLevel = headingLevel;
                return this;
            }

            /**
             * <p>The maximum character length of a single chunk. Valid values: 1 to 6000 (characters). An error is returned if the value exceeds the limit.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxChunkSize(Integer maxChunkSize) {
                this.maxChunkSize = maxChunkSize;
                return this;
            }

            /**
             * <p>Takes effect only for the BY_LENGTH strategy. This parameter is ignored for other strategies. Specifies the overlap length (in characters) between adjacent chunks. If the value is greater than 0, the beginning of the next chunk repeats the content from the end of the previous chunk within this window. The overlap does not cause a chunk to exceed MaxChunkSize. Default value: 0, which indicates no overlap.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder overlapSize(Integer overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>The pre-processing rules.</p>
             */
            public Builder preprocessRules(PreprocessRules preprocessRules) {
                this.preprocessRules = preprocessRules;
                return this;
            }

            /**
             * <p>Required for the BY_SEPARATOR strategy. This parameter is ignored for other strategies. The system splits content by matching the literal string as a whole (not as a regular expression). The maximum length is 32 characters. Example: \
             * \
             *  for paragraph separators.</p>
             * 
             * <strong>example:</strong>
             * <p>\\n\\n</p>
             */
            public Builder separator(String separator) {
                this.separator = separator;
                return this;
            }

            /**
             * <p>Valid values:</p>
             * <ul>
             * <li>AUTO: Intelligent chunking (heading-aware + paragraph packing).</li>
             * <li>BY_LENGTH: Sliding window chunking by length. You can specify OverlapSize.</li>
             * <li>BY_SEPARATOR: Chunking by separator. You must specify Separator.</li>
             * <li>BY_HEADING: Chunking by heading level. You must specify HeadingLevel.</li>
             * </ul>
             * <p>This parameter is required.</p>
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
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
     */
    public static class MetadataSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(maxLength = 255)
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String valueMode;

        private MetadataSchema(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
            this.valueMode = builder.valueMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetadataSchema create() {
            return builder().build();
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

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueMode
         */
        public String getValueMode() {
            return this.valueMode;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String value; 
            private String valueMode; 

            private Builder() {
            } 

            private Builder(MetadataSchema model) {
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
                this.valueMode = model.valueMode;
            } 

            /**
             * <p>The name of the field.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Valid values: STRING, LONG, DOUBLE, BOOLEAN, and DATETIME.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>When ValueMode is set to CONSTANT, this parameter specifies a fixed value. An empty value indicates that the value can be assigned during upload. When ValueMode is set to SYSTEM_VARIABLE, this parameter specifies a system variable name, such as DOCUMENT_NAME, FILE_TYPE, FILE_SIZE, DOCUMENT_UPLOAD_TIME, SOURCE_TYPE, SOURCE_URI, or SOURCE_MODIFIED_TIME.</p>
             * 
             * <strong>example:</strong>
             * <p>EventHouse</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>Valid values:</p>
             * <ul>
             * <li>CONSTANT: Constant. If Value is not empty, all documents use the fixed value. If Value is empty, the value can be assigned during upload.</li>
             * <li>SYSTEM_VARIABLE: System variable. Value specifies the variable name. The system automatically generates the value, and the value cannot be overridden during upload.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder valueMode(String valueMode) {
                this.valueMode = valueMode;
                return this;
            }

            public MetadataSchema build() {
                return new MetadataSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>KEYWORD: Keyword retrieval.</li>
             * <li>VECTOR: Vector retrieval.</li>
             * <li>HYBRID: Hybrid retrieval.</li>
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
             * <p>Takes effect only in hybrid search mode. Valid values:</p>
             * <ul>
             * <li>RRF: Reciprocal rank fusion.</li>
             * <li>WEIGHTED: Weighted normalization fusion. Use this value together with VectorWeight.</li>
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
             * <p>Takes effect only in hybrid search mode. Specifies whether to enable reranking by default when the search request does not specify a Rerank parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder rerankEnabled(Boolean rerankEnabled) {
                this.rerankEnabled = rerankEnabled;
                return this;
            }

            /**
             * <p>The default reranking model used when the search request does not specify a RerankModel parameter. Valid values: qwen3-rerank. Default value: qwen3-rerank.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-rerank</p>
             */
            public Builder rerankModel(String rerankModel) {
                this.rerankModel = rerankModel;
                return this;
            }

            /**
             * <p>The k parameter for the RRF fusion algorithm. The value must be greater than 0. Default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder rrfK(Integer rrfK) {
                this.rrfK = rrfK;
                return this;
            }

            /**
             * <p>The default number of results to return.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            /**
             * <p>The vector weight for the WEIGHTED fusion algorithm. Valid values: 0 to 1. The keyword weight equals 1 minus this value. Default value: 0.7.</p>
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
