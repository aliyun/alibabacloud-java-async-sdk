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
 * {@link UpdateAssetRequest} extends {@link RequestModel}
 *
 * <p>UpdateAssetRequest</p>
 */
public class UpdateAssetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("assetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateAssetRequestBody body;

    private UpdateAssetRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.assetId = builder.assetId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAssetRequest create() {
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
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return body
     */
    public UpdateAssetRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateAssetRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 
        private String assetId; 
        private UpdateAssetRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAssetRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.assetId = request.assetId;
            this.body = request.body;
        } 

        /**
         * <p>Magic resolves the tenant ID from the trusted gateway call identity and verifies workspace ownership. Knowledge bases are created or accessed within this tenant and workspace. Cross-tenant queries cannot be performed by using only the knowledgeBaseId.</p>
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
         * <p>The knowledge base to which the asset belongs.</p>
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
         * <p>The stable identifier of the asset to be updated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asset-001</p>
         */
        public Builder assetId(String assetId) {
            this.putPathParameter("assetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * <p>At least one of the following parameters must be provided: name, enabled, metadata, or chunkConfiguration.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateAssetRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateAssetRequest build() {
            return new UpdateAssetRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAssetRequest} extends {@link TeaModel}
     *
     * <p>UpdateAssetRequest</p>
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
     * {@link UpdateAssetRequest} extends {@link TeaModel}
     *
     * <p>UpdateAssetRequest</p>
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
             * <p>Required when the strategy is BY_HEADING, and the value ranges from 1 to 6. Headings at or above this level are used as boundaries. Deeper headings are retained in the text. Overlong sections fall back to paragraph or sentence chunking, and documents without headings fall back to intelligent chunking. It is ignored for other strategies and validated by the backend according to the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder headingLevel(Integer headingLevel) {
                this.headingLevel = headingLevel;
                return this;
            }

            /**
             * <p>Ranges from 1 to 6,000 characters. It uses the character length metric of EB and is not the number of tokens. If omitted, the server default value is used.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxChunkSize(Integer maxChunkSize) {
                this.maxChunkSize = maxChunkSize;
                return this;
            }

            /**
             * <p>Takes effect only when the strategy is BY_LENGTH. The unit is characters, and the default value is 0. The valid value must be greater than or equal to 0 and less than the valid maxChunkSize, and the length after overlapping must not exceed the maximum chunk size. It is ignored for other strategies and validated by the backend according to the strategy.</p>
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
             * <p>Required and non-empty when the strategy is BY_SEPARATOR. It matches the literal string as a whole and does not use regular expressions. It is ignored for other strategies.</p>
             * 
             * <strong>example:</strong>
             * <p>\n\n</p>
             */
            public Builder separator(String separator) {
                this.separator = separator;
                return this;
            }

            /**
             * <p>The saved chunking strategy. AUTO indicates automatic chunking, and BY_SEPARATOR indicates chunking by separator. BY_LENGTH and BY_HEADING are returned only for compatibility with historical configurations. When creating or updating a configuration in Phase 1, only AUTO and BY_SEPARATOR are accepted.</p>
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
     * {@link UpdateAssetRequest} extends {@link TeaModel}
     *
     * <p>UpdateAssetRequest</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String value;

        private Metadata(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the field declared in the metadataSchema. It must be unique within the same request. Fixed-value and system variable fields are generated by the server and cannot be overwritten by users.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The string parsed according to the schema type. Omitting the value or providing an empty value during upload indicates that no value is assigned, and the value is populated by the schema. In UpdateAsset, omitting the value, setting it to null, or setting it to an empty string indicates that the key is deleted, and unsubmitted keys remain unchanged. For DATETIME, ISO 8601 format with time zone, yyyy-MM-dd HH:mm:ss, or yyyy-MM-dd is accepted.</p>
             * 
             * <strong>example:</strong>
             * <p>engineering</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAssetRequest} extends {@link TeaModel}
     *
     * <p>UpdateAssetRequest</p>
     */
    public static class UpdateAssetRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkConfiguration")
        private ChunkConfiguration chunkConfiguration;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.List<Metadata> metadata;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(maxLength = 255)
        private String name;

        private UpdateAssetRequestBody(Builder builder) {
            this.chunkConfiguration = builder.chunkConfiguration;
            this.enabled = builder.enabled;
            this.metadata = builder.metadata;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateAssetRequestBody create() {
            return builder().build();
        }

        /**
         * @return chunkConfiguration
         */
        public ChunkConfiguration getChunkConfiguration() {
            return this.chunkConfiguration;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return metadata
         */
        public java.util.List<Metadata> getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private ChunkConfiguration chunkConfiguration; 
            private Boolean enabled; 
            private java.util.List<Metadata> metadata; 
            private String name; 

            private Builder() {
            } 

            private Builder(UpdateAssetRequestBody model) {
                this.chunkConfiguration = model.chunkConfiguration;
                this.enabled = model.enabled;
                this.metadata = model.metadata;
                this.name = model.name;
            } 

            /**
             * <p>In Phase 1, only AUTO and BY_SEPARATOR are supported, and maxChunkSize ranges from 1 to 6,000 characters. In the UPLOADING state, only the configuration snapshot is updated and used after the upload is confirmed. In the COMPLETED state, the asset is asynchronously reparsed, chunked, and vectorized according to the new policy. Rebuilding chunks overwrites manual text and start/stop modifications. The FAILED state does not support retries. The PENDING, PROCESSING, DELETING, and DELETED states also return InvalidAssetState. Before asynchronous processing succeeds and conditional publication occurs, old results must still pass validation against current permissions, enabled status, and deletion status. If enabled=false is included in the same request, regular reading is stopped immediately.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;strategy&quot;:&quot;AUTO&quot;,&quot;maxChunkSize&quot;:1000}</p>
             */
            public Builder chunkConfiguration(ChunkConfiguration chunkConfiguration) {
                this.chunkConfiguration = chunkConfiguration;
                return this;
            }

            /**
             * <p>Specifies whether the asset is enabled. When set to false, the asset is excluded from regular viewing, retrieval, and downloading.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Only fields declared in the metadataSchema are allowed. Fields are incrementally merged by key, and unprovided keys are retained. Omitting the value, setting it to null, or setting it to an empty string indicates that the key is deleted. An empty array does not modify any keys. Fixed-value or system variable fields cannot be overwritten or deleted by users, and the backend rejects such modifications. Changes that affect retrieval projections are published with the new generation. Before publication, old results are still validated against current permissions, enabled status, and deletion status. When submitted together with chunkConfiguration, new chunks use the merged metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;key&quot;:&quot;category&quot;,&quot;value&quot;:&quot;manual&quot;}]</p>
             */
            public Builder metadata(java.util.List<Metadata> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The updated display name. It can be up to 255 characters in length and does not change the content of the original file.</p>
             * 
             * <strong>example:</strong>
             * <p>Product User Guide</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UpdateAssetRequestBody build() {
                return new UpdateAssetRequestBody(this);
            } 

        } 

    }
}
