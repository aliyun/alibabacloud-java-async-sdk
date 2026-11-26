// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link CreateKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeBaseRequest</p>
 */
public class CreateKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateKnowledgeBaseRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return body
     */
    public CreateKnowledgeBaseRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateKnowledgeBaseRequest, Builder> {
        private String workspaceId; 
        private CreateKnowledgeBaseRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeBaseRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The tenant ID is resolved from the trusted gateway call identity by Magic, and the workspace ownership is verified. The knowledge base is created or accessed within this tenant and workspace. Cross-tenant queries cannot be performed solely by using the knowledgeBaseId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The request parameters for creating a knowledge base.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateKnowledgeBaseRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The optional idempotency token for the creation request. If provided, it must be a non-blank string with a maximum length of 128 characters. Within the same workspace, the same token and the same request return the original result, while different requests return IdempotencyConflict. If not provided, each request is processed as a new request, and idempotency across request retries is not guaranteed. Creation with the same name is still subject to the name uniqueness constraint.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-create-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
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
        @com.aliyun.core.annotation.NameInMap("removeUrlsAndEmails")
        private Boolean removeUrlsAndEmails;

        @com.aliyun.core.annotation.NameInMap("replaceConsecutiveWhitespace")
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
             * <p>Specifies whether to replace consecutive spaces, line breaks, and tabs with a single space.</p>
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
        @com.aliyun.core.annotation.NameInMap("headingLevel")
        private Integer headingLevel;

        @com.aliyun.core.annotation.NameInMap("maxChunkSize")
        @com.aliyun.core.annotation.Validation(maximum = 6000, minimum = 1)
        private Integer maxChunkSize;

        @com.aliyun.core.annotation.NameInMap("overlapSize")
        private Integer overlapSize;

        @com.aliyun.core.annotation.NameInMap("preprocessRules")
        private PreprocessRules preprocessRules;

        @com.aliyun.core.annotation.NameInMap("separator")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String separator;

        @com.aliyun.core.annotation.NameInMap("strategy")
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
             * <p>Required when the strategy is BY_HEADING, and the value ranges from 1 to 6. Headings at or below this level are used as boundaries. Deeper headings are retained in the body text. Overlong sections fall back to paragraphs or sentences, and documents without headings fall back to intelligent chunking. Ignored for other strategies and verified by the backend according to the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder headingLevel(Integer headingLevel) {
                this.headingLevel = headingLevel;
                return this;
            }

            /**
             * <p>1 to 6000 characters. It follows the character length metric of EB and is not the number of tokens. If omitted, the server-side default value is used.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxChunkSize(Integer maxChunkSize) {
                this.maxChunkSize = maxChunkSize;
                return this;
            }

            /**
             * <p>Takes effect only when the strategy is BY_LENGTH. The unit is characters, and the default value is 0. The valid value must be greater than or equal to 0 and less than the valid maxChunkSize, and the length after overlapping must not exceed the maximum chunk size. Ignored for other strategies and verified by the backend according to the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder overlapSize(Integer overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>The text preprocessing rules before chunking.</p>
             */
            public Builder preprocessRules(PreprocessRules preprocessRules) {
                this.preprocessRules = preprocessRules;
                return this;
            }

            /**
             * <p>Required and non-empty when the strategy is BY_SEPARATOR. It matches the literal string as a whole and does not use regular expressions. Ignored for other strategies.</p>
             * 
             * <strong>example:</strong>
             * <p>\n\n</p>
             */
            public Builder separator(String separator) {
                this.separator = separator;
                return this;
            }

            /**
             * <p>Returns the saved chunking strategy. AUTO indicates automatic chunking, and BY_SEPARATOR indicates chunking by separator. BY_LENGTH and BY_HEADING are returned only for compatibility with historical configurations. When creating or updating a configuration, only AUTO and BY_SEPARATOR are accepted in the first phase.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AUTO</p>
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
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        @com.aliyun.core.annotation.Validation(maxLength = 255)
        private String value;

        @com.aliyun.core.annotation.NameInMap("valueMode")
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
             * <p>The metadata field name of the knowledge base within the workspace. It must be unique within the same schema and cannot occupy system control fields.</p>
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
             * <p>STRING, LONG, DOUBLE, BOOLEAN, or DATETIME. Uploaded and updated string values are parsed by the backend according to this type. Nested objects are not accepted.</p>
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
             * <p>The fixed value or system variable name. The following variables are retained: DOCUMENT_NAME, FILE_TYPE, FILE_SIZE, DOCUMENT_UPLOAD_TIME, SOURCE_TYPE, SOURCE_URI, and SOURCE_MODIFIED_TIME. DOCUMENT_* refers to the original asset in this operation, and the variable names retain EB compatibility.</p>
             * 
             * <strong>example:</strong>
             * <p>engineering</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>CONSTANT indicates a constant. If the value is not empty, the system uses a fixed value. If no value is configured, the system assigns the value during upload. SYSTEM_VARIABLE indicates that the system generates the value and customers cannot overwrite it. You cannot modify the schema after creation.</p>
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
        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("rankAlgorithm")
        private String rankAlgorithm;

        @com.aliyun.core.annotation.NameInMap("rerankEnabled")
        private Boolean rerankEnabled;

        @com.aliyun.core.annotation.NameInMap("rerankModel")
        private String rerankModel;

        @com.aliyun.core.annotation.NameInMap("rrfK")
        private Integer rrfK;

        @com.aliyun.core.annotation.NameInMap("topK")
        @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
        private Integer topK;

        @com.aliyun.core.annotation.NameInMap("vectorWeight")
        @com.aliyun.core.annotation.Validation(maximum = 1)
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
             * <p>The retrieve mode. KEYWORD indicates keyword retrieve, VECTOR indicates AISearch, and HYBRID indicates hybrid retrieve. The request parameter takes precedence over the knowledge base configuration. If neither is configured, HYBRID is used.</p>
             * 
             * <strong>example:</strong>
             * <p>HYBRID</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The rank fusion algorithm. RRF indicates reciprocal rank fusion, and WEIGHTED indicates weighted normalization fusion. This parameter takes effect only when the search mode is HYBRID. The default value is RRF.</p>
             * 
             * <strong>example:</strong>
             * <p>RRF</p>
             */
            public Builder rankAlgorithm(String rankAlgorithm) {
                this.rankAlgorithm = rankAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether to enable reranking by default. This parameter applies to all three search modes. The request parameter takes precedence over this configuration. If neither is configured, the default value is false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder rerankEnabled(Boolean rerankEnabled) {
                this.rerankEnabled = rerankEnabled;
                return this;
            }

            /**
             * <p>The reranking model. Supported models include qwen3-rerank, qwen3.7-text-rerank, gte-rerank-v2, and qwen3-vl-rerank. The request parameter takes precedence over this configuration. If neither is configured, qwen3-rerank is used.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-rerank</p>
             */
            public Builder rerankModel(String rerankModel) {
                this.rerankModel = rerankModel;
                return this;
            }

            /**
             * <p>The k parameter for RRF. The default value is 60. The value must be greater than 0.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder rrfK(Integer rrfK) {
                this.rrfK = rrfK;
                return this;
            }

            /**
             * <p>The default number of results to return. A maximum of 100 results can be returned. The request parameter takes precedence over the knowledge base configuration. If neither is configured, 10 is used. The actual number of returned results may be less than this value after filtering by permissions and published versions.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            /**
             * <p>The vector path weight for WEIGHTED. The default value is 0.7. The keyword path weight is 1 minus this value.</p>
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
    /**
     * 
     * {@link CreateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseRequest</p>
     */
    public static class CreateKnowledgeBaseRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkConfiguration")
        private ChunkConfiguration chunkConfiguration;

        @com.aliyun.core.annotation.NameInMap("description")
        @com.aliyun.core.annotation.Validation(maxLength = 255)
        private String description;

        @com.aliyun.core.annotation.NameInMap("embeddingDimension")
        private Integer embeddingDimension;

        @com.aliyun.core.annotation.NameInMap("embeddingModel")
        private String embeddingModel;

        @com.aliyun.core.annotation.NameInMap("metadataSchema")
        private java.util.List<MetadataSchema> metadataSchema;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
        private String name;

        @com.aliyun.core.annotation.NameInMap("searchConfiguration")
        private SearchConfiguration searchConfiguration;

        private CreateKnowledgeBaseRequestBody(Builder builder) {
            this.chunkConfiguration = builder.chunkConfiguration;
            this.description = builder.description;
            this.embeddingDimension = builder.embeddingDimension;
            this.embeddingModel = builder.embeddingModel;
            this.metadataSchema = builder.metadataSchema;
            this.name = builder.name;
            this.searchConfiguration = builder.searchConfiguration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateKnowledgeBaseRequestBody create() {
            return builder().build();
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
         * @return metadataSchema
         */
        public java.util.List<MetadataSchema> getMetadataSchema() {
            return this.metadataSchema;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return searchConfiguration
         */
        public SearchConfiguration getSearchConfiguration() {
            return this.searchConfiguration;
        }

        public static final class Builder {
            private ChunkConfiguration chunkConfiguration; 
            private String description; 
            private Integer embeddingDimension; 
            private String embeddingModel; 
            private java.util.List<MetadataSchema> metadataSchema; 
            private String name; 
            private SearchConfiguration searchConfiguration; 

            private Builder() {
            } 

            private Builder(CreateKnowledgeBaseRequestBody model) {
                this.chunkConfiguration = model.chunkConfiguration;
                this.description = model.description;
                this.embeddingDimension = model.embeddingDimension;
                this.embeddingModel = model.embeddingModel;
                this.metadataSchema = model.metadataSchema;
                this.name = model.name;
                this.searchConfiguration = model.searchConfiguration;
            } 

            /**
             * <p>The valid configuration with parsed default values. It only affects subsequently newly uploaded or explicitly reprocessed assets.</p>
             */
            public Builder chunkConfiguration(ChunkConfiguration chunkConfiguration) {
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
                this.description = description;
                return this;
            }

            /**
             * <p>If omitted, the default model dimension of 1024 is used. text-embedding-v3 supports 64, 128, 256, 512, 768, and 1024. text-embedding-v4 supports 64, 128, 256, 512, 768, 1024, 1536, and 2048. qwen3.7-text-embedding supports 256, 512, 768, 1024, 1536, 2048, and 2560. qwen3.7-text-embedding-flash supports 256, 512, 768, and 1024. This cannot be modified after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder embeddingDimension(Integer embeddingDimension) {
                this.embeddingDimension = embeddingDimension;
                return this;
            }

            /**
             * <p>Only the listed Model Studio Qwen series models are supported. If omitted, the default value is text-embedding-v4. This cannot be modified after creation. To change the model, you must rebuild the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>text-embedding-v4</p>
             */
            public Builder embeddingModel(String embeddingModel) {
                this.embeddingModel = embeddingModel;
                return this;
            }

            /**
             * <p>Declares the metadata fields that can be used by assets. This cannot be modified after creation. If omitted, user metadata is not used.</p>
             */
            public Builder metadataSchema(java.util.List<MetadataSchema> metadataSchema) {
                this.metadataSchema = metadataSchema;
                return this;
            }

            /**
             * <p>The name of the knowledge base within the workspace.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>product-docs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The default search configuration at the knowledge base level. This configuration takes effect when the corresponding parameters are not provided in the search request. You can modify it by calling UpdateKnowledgeBase.</p>
             */
            public Builder searchConfiguration(SearchConfiguration searchConfiguration) {
                this.searchConfiguration = searchConfiguration;
                return this;
            }

            public CreateKnowledgeBaseRequestBody build() {
                return new CreateKnowledgeBaseRequestBody(this);
            } 

        } 

    }
}
