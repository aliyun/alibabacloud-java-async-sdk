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
 * {@link ListAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetsResponseBody</p>
 */
public class ListAssetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListAssetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAssetsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
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
         * <p>The asset details on the current page, sorted in descending order by the latest upload acceptance time and assetId. Asynchronous index updates may cause brief sorting delays after new uploads or overwrites.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page size used for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The description of the masked result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Pass this value as is to continue pagination. If this value is empty, pagination ends. Do not use totalCount to determine the next page. Cross-page snapshots are not guaranteed during concurrent uploads, overwrites, deletions, or status changes.</p>
         * 
         * <strong>example:</strong>
         * <p>opaque-next-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        /**
         * <p>The count of undeleted assets that meet the file name prefix and status filter conditions of the current request. This count is cached for 60 seconds based on the resource scope and filter conditions, and may be briefly stale. The first request after a cold cache or expiration synchronously scans the count. Concurrent scans do not guarantee transactional snapshots or exact consistency with the current page, and cannot be used for quota verification or determining the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAssetsResponseBody build() {
            return new ListAssetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetsResponseBody</p>
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
     * {@link ListAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetsResponseBody</p>
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
             * <p>This parameter is required when the strategy is BY_HEADING, and the value ranges from 1 to 6. Headings at or above this level are used as boundaries. Deeper headings are retained in the body text. Overlong sections fall back to paragraph or sentence splitting. Documents without headings fall back to intelligent splitting. This parameter is ignored for other strategies and is validated by the backend based on the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder headingLevel(Integer headingLevel) {
                this.headingLevel = headingLevel;
                return this;
            }

            /**
             * <p>The value ranges from 1 to 6000 characters, following the character length standard of EB, not the number of tokens. If this parameter is omitted, the server-side default value is used.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxChunkSize(Integer maxChunkSize) {
                this.maxChunkSize = maxChunkSize;
                return this;
            }

            /**
             * <p>This parameter takes effect only when the strategy is BY_LENGTH. The unit is characters, and the default value is 0. The valid value must be greater than or equal to 0 and less than the valid maxChunkSize, ensuring that the length does not exceed the maximum chunk length after overlapping. This parameter is ignored for other strategies and is validated by the backend based on the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder overlapSize(Integer overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>The text preprocessing rules applied before splitting.</p>
             */
            public Builder preprocessRules(PreprocessRules preprocessRules) {
                this.preprocessRules = preprocessRules;
                return this;
            }

            /**
             * <p>This parameter is required and cannot be empty when the strategy is BY_SEPARATOR. It matches the entire literal string without using regular expressions. This parameter is ignored for other strategies.</p>
             * 
             * <strong>example:</strong>
             * <p>\n\n</p>
             */
            public Builder separator(String separator) {
                this.separator = separator;
                return this;
            }

            /**
             * <p>The saved chunking strategy. AUTO indicates automatic chunking, and BY_SEPARATOR indicates chunking by separator. BY_LENGTH and BY_HEADING are returned only for backward compatibility with historical configurations. Only AUTO and BY_SEPARATOR are accepted when creating or updating configurations in the first phase.</p>
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
     * {@link ListAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetsResponseBody</p>
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
             * <p>The stable product error code. This code does not return internal task IDs, stacks, or storage addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>ProcessingFailed</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The masked error summary that can be displayed to users.</p>
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
     * {@link ListAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetsResponseBody</p>
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
             * <p>The field name declared in metadataSchema. It must not be duplicated within the same request. Fixed values and system variable fields are generated by the server and cannot be overwritten by the client.</p>
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
             * <p>The string parsed according to the schema type. If omitted or left empty during upload, it indicates that no value is assigned and the schema populates the value. In UpdateAsset, omitting the field, setting it to null, or providing an empty string deletes the key, while unsubmitted keys remain unchanged. For DATETIME, ISO 8601 with a time zone, yyyy-MM-dd HH:mm:ss, or yyyy-MM-dd is accepted.</p>
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
     * {@link ListAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assetId")
        private String assetId;

        @com.aliyun.core.annotation.NameInMap("chunkConfiguration")
        private ChunkConfiguration chunkConfiguration;

        @com.aliyun.core.annotation.NameInMap("chunkCount")
        private Integer chunkCount;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("lastError")
        private LastError lastError;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.List<Metadata> metadata;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("publishedResultAvailable")
        private Boolean publishedResultAvailable;

        @com.aliyun.core.annotation.NameInMap("sizeBytes")
        private Long sizeBytes;

        @com.aliyun.core.annotation.NameInMap("sourceModifiedTime")
        private Long sourceModifiedTime;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("sourceUri")
        private String sourceUri;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Items(Builder builder) {
            this.assetId = builder.assetId;
            this.chunkConfiguration = builder.chunkConfiguration;
            this.chunkCount = builder.chunkCount;
            this.contentType = builder.contentType;
            this.createdAt = builder.createdAt;
            this.enabled = builder.enabled;
            this.fileName = builder.fileName;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.lastError = builder.lastError;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.publishedResultAvailable = builder.publishedResultAvailable;
            this.sizeBytes = builder.sizeBytes;
            this.sourceModifiedTime = builder.sourceModifiedTime;
            this.sourceType = builder.sourceType;
            this.sourceUri = builder.sourceUri;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return assetId
         */
        public String getAssetId() {
            return this.assetId;
        }

        /**
         * @return chunkConfiguration
         */
        public ChunkConfiguration getChunkConfiguration() {
            return this.chunkConfiguration;
        }

        /**
         * @return chunkCount
         */
        public Integer getChunkCount() {
            return this.chunkCount;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
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

        /**
         * @return publishedResultAvailable
         */
        public Boolean getPublishedResultAvailable() {
            return this.publishedResultAvailable;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        /**
         * @return sourceModifiedTime
         */
        public Long getSourceModifiedTime() {
            return this.sourceModifiedTime;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return sourceUri
         */
        public String getSourceUri() {
            return this.sourceUri;
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

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String assetId; 
            private ChunkConfiguration chunkConfiguration; 
            private Integer chunkCount; 
            private String contentType; 
            private String createdAt; 
            private Boolean enabled; 
            private String fileName; 
            private String knowledgeBaseId; 
            private LastError lastError; 
            private java.util.List<Metadata> metadata; 
            private String name; 
            private Boolean publishedResultAvailable; 
            private Long sizeBytes; 
            private Long sourceModifiedTime; 
            private String sourceType; 
            private String sourceUri; 
            private String status; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.assetId = model.assetId;
                this.chunkConfiguration = model.chunkConfiguration;
                this.chunkCount = model.chunkCount;
                this.contentType = model.contentType;
                this.createdAt = model.createdAt;
                this.enabled = model.enabled;
                this.fileName = model.fileName;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.lastError = model.lastError;
                this.metadata = model.metadata;
                this.name = model.name;
                this.publishedResultAvailable = model.publishedResultAvailable;
                this.sizeBytes = model.sizeBytes;
                this.sourceModifiedTime = model.sourceModifiedTime;
                this.sourceType = model.sourceType;
                this.sourceUri = model.sourceUri;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The stable ID of the asset. You can specify this ID when creating an asset. If assetId is not specified but clientToken is provided, the platform stably derives the ID based on the resource scope and clientToken. If neither is provided, a new asset is created for each request. Setting overwrite=true allows you to register a new upload session for the same asset, and the previously published version continues to be used until the new result is published.</p>
             * 
             * <strong>example:</strong>
             * <p>asset-001</p>
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * <p>The effective chunk configuration used for the current asset processing. Explicitly uploaded configurations take precedence over the default values of the knowledge base. Subsequent modifications to the knowledge base configuration do not change this snapshot.</p>
             */
            public Builder chunkConfiguration(ChunkConfiguration chunkConfiguration) {
                this.chunkConfiguration = chunkConfiguration;
                return this;
            }

            /**
             * <p>The total number of chunks in the currently published result. This value is 0 before the first publication. During re-chunking or editing, the count still reflects the published result.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder chunkCount(Integer chunkCount) {
                this.chunkCount = chunkCount;
                return this;
            }

            /**
             * <p>The MIME type of the uploaded original file for the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>application/pdf</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The creation time in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>If disabled, the asset does not participate in regular viewing, retrieval, and downloading. Management APIs are still subject to administrative permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The file name of the currently uploaded original file. Modifying the display name does not change this value.</p>
             * 
             * <strong>example:</strong>
             * <p>guide.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The knowledge base to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>kb-001</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The masked error of the current upload or processing. This error does not contain internal credentials, paths, or run IDs.</p>
             */
            public Builder lastError(LastError lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * <p>The complete list of effective metadata key-value pairs, including constants and system variable results. Patches involving retrieval projections do not overwrite previous effective values until new results are published.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;key&quot;:&quot;department&quot;,&quot;value&quot;:&quot;engineering&quot;}]</p>
             */
            public Builder metadata(java.util.List<Metadata> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The default value is the uploaded file name. You can call the UpdateAsset operation to modify the display name.</p>
             * 
             * <strong>example:</strong>
             * <p>guide.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the published result is available. The value is true if a published version exists and the asset is neither disabled nor deleted. The value may still be true if re-chunking or editing fails, and is false if the first processing fails.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publishedResultAvailable(Boolean publishedResultAvailable) {
                this.publishedResultAvailable = publishedResultAvailable;
                return this;
            }

            /**
             * <p>The size of the current original file in bytes. This value is not returned before the upload is confirmed. After confirmation, the actual size verified by the OSS HEAD request is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>102400</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            /**
             * <p>The last modification time of the source file in UTC epoch milliseconds. This value is not returned if it is not provided.</p>
             * 
             * <strong>example:</strong>
             * <p>1793066400000</p>
             */
            public Builder sourceModifiedTime(Long sourceModifiedTime) {
                this.sourceModifiedTime = sourceModifiedTime;
                return this;
            }

            /**
             * <p>The import channel of the asset, such as UPLOAD or OSS. This value is recorded by the platform based on the trusted access path and is not used to grant access permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>UPLOAD</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The URI of the original file source. This value is used only for tracing, does not authorize downloads, and does not trigger server-side fetching.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://source-bucket/path/guide.pdf</p>
             */
            public Builder sourceUri(String sourceUri) {
                this.sourceUri = sourceUri;
                return this;
            }

            /**
             * <p>The current upload or processing status of the document. Uploads, rebuilds, and chunk body edits are polled by using the GetAsset operation. PENDING indicates waiting for processing, PROCESSING indicates processing, COMPLETED indicates that the publication is complete, and FAILED indicates a final failure and returns lastError. This status does not represent the result of a specific historical request. No readable result is available if the first processing fails. During overwrite uploads, rebuilds, or edits, and after failures, the published result remains readable if the enabled and deletion statuses allow it.</p>
             * 
             * <strong>example:</strong>
             * <p>PROCESSING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The creation time in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:05:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The workspace to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-001</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
