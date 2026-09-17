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
 * {@link UpdateKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>UpdateKnowledgeBaseRequest</p>
 */
public class UpdateKnowledgeBaseRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchConfiguration")
    private SearchConfiguration searchConfiguration;

    private UpdateKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.chunkConfiguration = builder.chunkConfiguration;
        this.description = builder.description;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.namespace = builder.namespace;
        this.searchConfiguration = builder.searchConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeBaseRequest create() {
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
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
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

    public static final class Builder extends Request.Builder<UpdateKnowledgeBaseRequest, Builder> {
        private String catalog; 
        private ChunkConfiguration chunkConfiguration; 
        private String description; 
        private String knowledgeBaseName; 
        private String namespace; 
        private SearchConfiguration searchConfiguration; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKnowledgeBaseRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.chunkConfiguration = request.chunkConfiguration;
            this.description = request.description;
            this.knowledgeBaseName = request.knowledgeBaseName;
            this.namespace = request.namespace;
            this.searchConfiguration = request.searchConfiguration;
        } 

        /**
         * <p>The data catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListCatalogs to obtain the value.</p>
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
         * <p>Optional. Updates the default chunking strategy of the knowledge base. The update takes effect only for documents uploaded after the update. Existing documents are not re-chunked. If this parameter is not specified, the configuration remains unchanged.</p>
         */
        public Builder chunkConfiguration(ChunkConfiguration chunkConfiguration) {
            String chunkConfigurationShrink = shrink(chunkConfiguration, "ChunkConfiguration", "json");
            this.putQueryParameter("ChunkConfiguration", chunkConfigurationShrink);
            this.chunkConfiguration = chunkConfiguration;
            return this;
        }

        /**
         * <p>The description of the knowledge base to update. If this parameter is not specified, the description remains unchanged.</p>
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
         * <p>The name of the knowledge base. The name must be unique within the namespace. The name is specified during creation and cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-knowledge-base</p>
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.putQueryParameter("KnowledgeBaseName", knowledgeBaseName);
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListNamespaces to obtain the value.</p>
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
         * <p>Optional. Updates the default search configuration at the knowledge base level. The update takes effect immediately for subsequent search requests. If this parameter is not specified, the configuration remains unchanged.</p>
         */
        public Builder searchConfiguration(SearchConfiguration searchConfiguration) {
            String searchConfigurationShrink = shrink(searchConfiguration, "SearchConfiguration", "json");
            this.putQueryParameter("SearchConfiguration", searchConfigurationShrink);
            this.searchConfiguration = searchConfiguration;
            return this;
        }

        @Override
        public UpdateKnowledgeBaseRequest build() {
            return new UpdateKnowledgeBaseRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseRequest</p>
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
     * {@link UpdateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseRequest</p>
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
             * <p>Required for the BY_HEADING strategy. Valid values: 1 to 6. This parameter is ignored for other strategies. Headings at or above the specified level are used as split boundaries. For example, if you set this parameter to 2, both H1 and H2 headings are used as split boundaries. Deeper-level headings are not used for splitting and are retained in the chunk body. If the content within a section exceeds MaxChunkSize, the content is split by paragraph or sentence as a fallback. Documents without headings fall back to intelligent chunking.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder headingLevel(Integer headingLevel) {
                this.headingLevel = headingLevel;
                return this;
            }

            /**
             * <p>The maximum token length of a single chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxChunkSize(Integer maxChunkSize) {
                this.maxChunkSize = maxChunkSize;
                return this;
            }

            /**
             * <p>The overlap token length between adjacent chunks.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder overlapSize(Integer overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>The preprocessing rules.</p>
             */
            public Builder preprocessRules(PreprocessRules preprocessRules) {
                this.preprocessRules = preprocessRules;
                return this;
            }

            /**
             * <p>The segment identifier for the LINE_BREAK strategy, such as a line feed.</p>
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
             * <li>AUTO: automatic chunking.</li>
             * <li>LINE_BREAK: chunking by segment identifier.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>LINE_BREAK</p>
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
     * {@link UpdateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseRequest</p>
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
             * <p>The retrieve mode. Valid values:</p>
             * <ul>
             * <li>KEYWORD: keyword retrieve.</li>
             * <li>VECTOR: vector retrieve.</li>
             * <li>HYBRID: hybrid retrieve.</li>
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
             * <li>RRF: reciprocal rank fusion.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RRF</p>
             */
            public Builder rankAlgorithm(String rankAlgorithm) {
                this.rankAlgorithm = rankAlgorithm;
                return this;
            }

            /**
             * <p>Takes effect only in hybrid search mode. This default value is used when the search request does not specify Rerank.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder rerankEnabled(Boolean rerankEnabled) {
                this.rerankEnabled = rerankEnabled;
                return this;
            }

            /**
             * <p>The default reranking model used when the search request does not specify RerankModel. Valid values: qwen3-rerank. Default value: qwen3-rerank.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-rerank</p>
             */
            public Builder rerankModel(String rerankModel) {
                this.rerankModel = rerankModel;
                return this;
            }

            /**
             * <p>The parameter k for the RRF fusion algorithm. Default value: 60. The value must be greater than 0.</p>
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
             * <p>The vector path weight for the WEIGHTED fusion algorithm. Valid values: 0 to 1. The keyword path weight equals 1 minus this value. Default value: 0.7.</p>
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
