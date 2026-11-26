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
 * {@link GetKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>GetKnowledgeBaseResponseBody</p>
 */
public class GetKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetKnowledgeBaseResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBaseResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetKnowledgeBaseResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The stable result code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the specified knowledge base.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The actual HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The description of the data masking result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01A00000-0000-0000-0000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetKnowledgeBaseResponseBody build() {
            return new GetKnowledgeBaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseResponseBody</p>
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
     * {@link GetKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseResponseBody</p>
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
             * <p>Required when the strategy is BY_HEADING. Valid values: 1 to 6. Headings at or above this level are used as boundaries. Deeper headings are retained in the body text. Overlong sections fall back to paragraph or sentence splitting. Documents without headings fall back to intelligent splitting. Ignored for other strategies and validated by the backend based on the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder headingLevel(Integer headingLevel) {
                this.headingLevel = headingLevel;
                return this;
            }

            /**
             * <p>Ranges from 1 to 6,000 characters. It follows the character length metric of EB and is not the number of tokens. If omitted, the server-side default value is used.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxChunkSize(Integer maxChunkSize) {
                this.maxChunkSize = maxChunkSize;
                return this;
            }

            /**
             * <p>Takes effect only when the strategy is BY_LENGTH. The unit is characters. Default value: 0. The valid value must be greater than or equal to 0 and less than the valid maxChunkSize. The total length after overlapping must not exceed the maximum chunk size. Ignored for other strategies and validated by the backend based on the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder overlapSize(Integer overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>The text preprocessing rules before splitting.</p>
             */
            public Builder preprocessRules(PreprocessRules preprocessRules) {
                this.preprocessRules = preprocessRules;
                return this;
            }

            /**
             * <p>Required and non-empty when the strategy is BY_SEPARATOR. It matches the entire literal string without using regular expressions. Ignored for other strategies.</p>
             * 
             * <strong>example:</strong>
             * <p>\n\n</p>
             */
            public Builder separator(String separator) {
                this.separator = separator;
                return this;
            }

            /**
             * <p>Returns the saved chunking strategy. AUTO indicates automatic chunking. BY_SEPARATOR indicates chunking by separator. BY_LENGTH and BY_HEADING are returned only for backward compatibility with historical configurations. Only AUTO and BY_SEPARATOR are accepted when you create or update a configuration in the first phase.</p>
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
     * {@link GetKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseResponseBody</p>
     */
    public static class LastError extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private LastError(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastError create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(LastError model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>A stable product error code. Internal task identifiers, stack traces, or storage addresses are not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>ProcessingFailed</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>A sanitized error summary that can be displayed to users.</p>
             * 
             * <strong>example:</strong>
             * <p>File parsing failed</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public LastError build() {
                return new LastError(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseResponseBody</p>
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
             * <p>The name of the metadata field for the knowledge base in the workspace. It must be unique within the same schema and cannot use reserved system control fields.</p>
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
             * <p>STRING, LONG, DOUBLE, BOOLEAN, or DATETIME. Uploaded and updated string values are parsed by the backend based on this type. Nested objects are not accepted.</p>
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
             * <p>A fixed value or system variable name. The following variables are supported: DOCUMENT_NAME, FILE_TYPE, FILE_SIZE, DOCUMENT_UPLOAD_TIME, SOURCE_TYPE, SOURCE_URI, and SOURCE_MODIFIED_TIME. In this API operation, DOCUMENT_* refers to the original asset. The variable names are retained for EB compatibility.</p>
             * 
             * <strong>example:</strong>
             * <p>engineering</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>CONSTANT indicates a constant. If the value is not empty, a fixed value is used. If no value is configured, the value is assigned during upload. SYSTEM_VARIABLE indicates that the value is generated by the system and cannot be overwritten by customers. The schema cannot be modified after creation.</p>
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
     * {@link GetKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseResponseBody</p>
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
             * <p>KEYWORD indicates keyword retrieval. VECTOR indicates vector retrieval. HYBRID indicates hybrid retrieval. The request configuration takes precedence over the knowledge base configuration. If neither is configured, HYBRID is used.</p>
             * 
             * <strong>example:</strong>
             * <p>HYBRID</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>RRF indicates reciprocal rank fusion. WEIGHTED indicates weighted normalization fusion. Takes effect only for HYBRID. Default value: RRF.</p>
             * 
             * <strong>example:</strong>
             * <p>RRF</p>
             */
            public Builder rankAlgorithm(String rankAlgorithm) {
                this.rankAlgorithm = rankAlgorithm;
                return this;
            }

            /**
             * <p>Applies to all three search modes. The request configuration overrides this setting when explicitly specified. If neither is configured, the value is false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder rerankEnabled(Boolean rerankEnabled) {
                this.rerankEnabled = rerankEnabled;
                return this;
            }

            /**
             * <p>Supports qwen3-rerank, qwen3.7-text-rerank, gte-rerank-v2, and qwen3-vl-rerank. The request configuration takes precedence over this configuration. If neither is configured, qwen3-rerank is used.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-rerank</p>
             */
            public Builder rerankModel(String rerankModel) {
                this.rerankModel = rerankModel;
                return this;
            }

            /**
             * <p>The k parameter for RRF. Default value: 60. The value must be greater than 0.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder rrfK(Integer rrfK) {
                this.rrfK = rrfK;
                return this;
            }

            /**
             * <p>Returns a maximum of 100 results. The request configuration takes precedence over the knowledge base configuration. If neither is configured, 10 is used. The actual number of results may be less than this value after permission and release version filtering.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            /**
             * <p>The vector path weight for WEIGHTED. Default value: 0.7. The keyword path weight is 1 minus this value.</p>
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
     * {@link GetKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkConfiguration")
        private ChunkConfiguration chunkConfiguration;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("embeddingDimension")
        private Integer embeddingDimension;

        @com.aliyun.core.annotation.NameInMap("embeddingModel")
        private String embeddingModel;

        @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("lastError")
        private LastError lastError;

        @com.aliyun.core.annotation.NameInMap("metadataSchema")
        private java.util.List<MetadataSchema> metadataSchema;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("searchConfiguration")
        private SearchConfiguration searchConfiguration;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.chunkConfiguration = builder.chunkConfiguration;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.embeddingDimension = builder.embeddingDimension;
            this.embeddingModel = builder.embeddingModel;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.lastError = builder.lastError;
            this.metadataSchema = builder.metadataSchema;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.searchConfiguration = builder.searchConfiguration;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return lastError
         */
        public LastError getLastError() {
            return this.lastError;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private ChunkConfiguration chunkConfiguration; 
            private String createdAt; 
            private String description; 
            private Integer embeddingDimension; 
            private String embeddingModel; 
            private String knowledgeBaseId; 
            private LastError lastError; 
            private java.util.List<MetadataSchema> metadataSchema; 
            private String name; 
            private String regionId; 
            private SearchConfiguration searchConfiguration; 
            private String status; 
            private String tenantId; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chunkConfiguration = model.chunkConfiguration;
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.embeddingDimension = model.embeddingDimension;
                this.embeddingModel = model.embeddingModel;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.lastError = model.lastError;
                this.metadataSchema = model.metadataSchema;
                this.name = model.name;
                this.regionId = model.regionId;
                this.searchConfiguration = model.searchConfiguration;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The valid configuration with parsed default values. It only affects subsequently uploaded or explicitly reprocessed assets.</p>
             */
            public Builder chunkConfiguration(ChunkConfiguration chunkConfiguration) {
                this.chunkConfiguration = chunkConfiguration;
                return this;
            }

            /**
             * <p>The time in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Product documentation</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The vector dimensions that actually take effect. Default value: 1024. It cannot be modified after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder embeddingDimension(Integer embeddingDimension) {
                this.embeddingDimension = embeddingDimension;
                return this;
            }

            /**
             * <p>The name of the model that actually takes effect. It cannot be modified after creation. Default value: text-embedding-v4.</p>
             * 
             * <strong>example:</strong>
             * <p>text-embedding-v4</p>
             */
            public Builder embeddingModel(String embeddingModel) {
                this.embeddingModel = embeddingModel;
                return this;
            }

            /**
             * <p>The stable knowledge base ID generated by the platform. It is persistently bound to the tenantId and workspaceId. Queries and modifications must verify all three identifiers simultaneously. Access based solely on the ID is not allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>kb-001</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The sanitized error summary returned when a lifecycle operation fails.</p>
             */
            public Builder lastError(LastError lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * <p>The metadata schema is determined during creation and cannot be modified afterward. It includes constant or system variable configurations.</p>
             */
            public Builder metadataSchema(java.util.List<MetadataSchema> metadataSchema) {
                this.metadataSchema = metadataSchema;
                return this;
            }

            /**
             * <p>The display name of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>product-docs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region where the knowledge base is located. This region is the same as that of the associated workspace and is maintained by the server.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The valid search configuration with parsed platform default values. It can be overridden by a single search request.</p>
             */
            public Builder searchConfiguration(SearchConfiguration searchConfiguration) {
                this.searchConfiguration = searchConfiguration;
                return this;
            }

            /**
             * <p>You can call GetKnowledgeBase and ListKnowledgeBases to query the creation progress. Creating indicates that the knowledge base is being created. Active indicates that the creation is successful. CreateFailed indicates that the creation failed. The deletion acceptance response may return Deleting, DeleteFailed, or Deleted. After a deletion request is accepted, GetKnowledgeBase returns that the resource does not exist, and ListKnowledgeBases no longer displays the resource while the backend continues cleanup. For the cause of a creation failure, see lastError.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The read-only tenant ownership. It is resolved by Magic based on the trusted gateway call identity and bound during creation. It is consistent with the tenant of the workspace to which it belongs. Client-specified or modified values are not accepted.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The time in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:05:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The AgentCore workspace to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-001</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
