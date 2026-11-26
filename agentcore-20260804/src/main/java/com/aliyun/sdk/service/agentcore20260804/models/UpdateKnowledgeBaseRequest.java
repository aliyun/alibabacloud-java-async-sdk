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
 * {@link UpdateKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>UpdateKnowledgeBaseRequest</p>
 */
public class UpdateKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateKnowledgeBaseRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return body
     */
    public UpdateKnowledgeBaseRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateKnowledgeBaseRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 
        private UpdateKnowledgeBaseRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKnowledgeBaseRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The tenant ID is resolved from the trusted gateway identity via Magic, and workspace ownership is verified. Knowledge bases are created or accessed within this tenant and workspace, and cannot be queried across tenants by using only the knowledge base ID.</p>
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
         * <p>The unique identifier of the knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-2f5f9c5a8d0e4c3b</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("knowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>Provide at least one field to be updated. Unprovided fields remain unchanged. You can pass an empty string for the description field to clear the description, or omit it to keep the description unchanged.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateKnowledgeBaseRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>Optional. For retries on the same knowledge base with the same client token and identical update content, the accepted result is returned without further modifications. If the content differs, an IdempotencyConflict error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-update-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
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
     * {@link UpdateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseRequest</p>
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
             * <p>Required when the strategy is BY_HEADING, with a valid range of 1 to 6. Headings at or above this level are used as boundaries. Deeper headings are retained in the body text. Overlong sections fall back to paragraph or sentence splitting. Documents without headings fall back to intelligent splitting. This parameter is ignored for other strategies and is validated by the backend based on the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder headingLevel(Integer headingLevel) {
                this.headingLevel = headingLevel;
                return this;
            }

            /**
             * <p>The maximum chunk size ranges from 1 to 6,000 characters. This follows the character length metric of EB, not the token count. If omitted, the server-side default value is used.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxChunkSize(Integer maxChunkSize) {
                this.maxChunkSize = maxChunkSize;
                return this;
            }

            /**
             * <p>Takes effect only when the strategy is BY_LENGTH. The unit is characters, and the default value is 0. The valid value must be greater than or equal to 0 and less than the valid maxChunkSize, ensuring that the chunk size with overlap does not exceed the maximum chunk size. This parameter is ignored for other strategies and is validated by the backend based on the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder overlapSize(Integer overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>The text preprocessing rules applied before chunking.</p>
             */
            public Builder preprocessRules(PreprocessRules preprocessRules) {
                this.preprocessRules = preprocessRules;
                return this;
            }

            /**
             * <p>Required and non-empty when the strategy is BY_SEPARATOR. The delimiter is matched as a whole literal string without using regular expressions. This parameter is ignored for other strategies.</p>
             * 
             * <strong>example:</strong>
             * <p>\n\n</p>
             */
            public Builder separator(String separator) {
                this.separator = separator;
                return this;
            }

            /**
             * <p>The saved chunking strategy. AUTO indicates automatic chunking, and BY_SEPARATOR indicates delimiter-based chunking. BY_LENGTH and BY_HEADING are returned only for backward compatibility with historical configurations. Only AUTO and BY_SEPARATOR are accepted when creating or updating configurations in the current phase.</p>
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
     * {@link UpdateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseRequest</p>
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
             * <p>KEYWORD indicates keyword retrieval, VECTOR indicates vector retrieval, and HYBRID indicates hybrid retrieval. The request configuration takes precedence over the knowledge base configuration. If neither is configured, HYBRID is used.</p>
             * 
             * <strong>example:</strong>
             * <p>HYBRID</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>RRF indicates reciprocal rank fusion, and WEIGHTED indicates weighted normalized fusion. This parameter takes effect only in HYBRID mode. The system default is RRF.</p>
             * 
             * <strong>example:</strong>
             * <p>RRF</p>
             */
            public Builder rankAlgorithm(String rankAlgorithm) {
                this.rankAlgorithm = rankAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether to enable reranking. This applies to all three search modes. An explicit specification in the request overrides this configuration. If neither is configured, the value is false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder rerankEnabled(Boolean rerankEnabled) {
                this.rerankEnabled = rerankEnabled;
                return this;
            }

            /**
             * <p>Supported models include qwen3-rerank, qwen3.7-text-rerank, gte-rerank-v2, and qwen3-vl-rerank. The request configuration takes precedence over this configuration. If neither is configured, qwen3-rerank is used.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-rerank</p>
             */
            public Builder rerankModel(String rerankModel) {
                this.rerankModel = rerankModel;
                return this;
            }

            /**
             * <p>The k parameter for RRF. The system default is 60, and the value must be greater than 0.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder rrfK(Integer rrfK) {
                this.rrfK = rrfK;
                return this;
            }

            /**
             * <p>The maximum number of results to return is 100. The request configuration takes precedence over the knowledge base configuration. If neither is configured, 10 is used. The actual number of results may be less than this value after permission and release version filtering.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            /**
             * <p>The vector path weight for WEIGHTED fusion. The system default is 0.7. The keyword path weight is 1 minus this value.</p>
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
     * {@link UpdateKnowledgeBaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseRequest</p>
     */
    public static class UpdateKnowledgeBaseRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkConfiguration")
        private ChunkConfiguration chunkConfiguration;

        @com.aliyun.core.annotation.NameInMap("description")
        @com.aliyun.core.annotation.Validation(maxLength = 255)
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(maxLength = 127)
        private String name;

        @com.aliyun.core.annotation.NameInMap("searchConfiguration")
        private SearchConfiguration searchConfiguration;

        private UpdateKnowledgeBaseRequestBody(Builder builder) {
            this.chunkConfiguration = builder.chunkConfiguration;
            this.description = builder.description;
            this.name = builder.name;
            this.searchConfiguration = builder.searchConfiguration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateKnowledgeBaseRequestBody create() {
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
            private String name; 
            private SearchConfiguration searchConfiguration; 

            private Builder() {
            } 

            private Builder(UpdateKnowledgeBaseRequestBody model) {
                this.chunkConfiguration = model.chunkConfiguration;
                this.description = model.description;
                this.name = model.name;
                this.searchConfiguration = model.searchConfiguration;
            } 

            /**
             * <p>The valid configuration with resolved default values. This configuration affects only subsequently uploaded or explicitly reprocessed assets.</p>
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
             * <p>The updated name of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>product-docs-v2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Updates the default search configuration at the knowledge base level, which takes effect immediately for subsequent search requests. If omitted, the configuration is not modified.</p>
             */
            public Builder searchConfiguration(SearchConfiguration searchConfiguration) {
                this.searchConfiguration = searchConfiguration;
                return this;
            }

            public UpdateKnowledgeBaseRequestBody build() {
                return new UpdateKnowledgeBaseRequestBody(this);
            } 

        } 

    }
}
