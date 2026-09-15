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
 * {@link KnowledgeBaseDocument} extends {@link TeaModel}
 *
 * <p>KnowledgeBaseDocument</p>
 */
public class KnowledgeBaseDocument extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChunkConfiguration")
    private ChunkConfiguration chunkConfiguration;

    @com.aliyun.core.annotation.NameInMap("ChunkCount")
    private Integer chunkCount;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("DocumentId")
    private String documentId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.List<Metadata> metadata;

    @com.aliyun.core.annotation.NameInMap("SourceModifiedTime")
    private Long sourceModifiedTime;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("SourceUri")
    private String sourceUri;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    private KnowledgeBaseDocument(Builder builder) {
        this.chunkConfiguration = builder.chunkConfiguration;
        this.chunkCount = builder.chunkCount;
        this.createdAt = builder.createdAt;
        this.documentId = builder.documentId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.metadata = builder.metadata;
        this.sourceModifiedTime = builder.sourceModifiedTime;
        this.sourceType = builder.sourceType;
        this.sourceUri = builder.sourceUri;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeBaseDocument create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return documentId
     */
    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return metadata
     */
    public java.util.List<Metadata> getMetadata() {
        return this.metadata;
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

    public static final class Builder {
        private ChunkConfiguration chunkConfiguration; 
        private Integer chunkCount; 
        private String createdAt; 
        private String documentId; 
        private String errorCode; 
        private String errorMessage; 
        private String fileName; 
        private Long fileSize; 
        private java.util.List<Metadata> metadata; 
        private Long sourceModifiedTime; 
        private String sourceType; 
        private String sourceUri; 
        private String status; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(KnowledgeBaseDocument model) {
            this.chunkConfiguration = model.chunkConfiguration;
            this.chunkCount = model.chunkCount;
            this.createdAt = model.createdAt;
            this.documentId = model.documentId;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.fileName = model.fileName;
            this.fileSize = model.fileSize;
            this.metadata = model.metadata;
            this.sourceModifiedTime = model.sourceModifiedTime;
            this.sourceType = model.sourceType;
            this.sourceUri = model.sourceUri;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The snapshot of the document-level chunking policy actually used for this document. This field is returned only if ChunkConfiguration was explicitly specified during upload (BeginUpload) or update (UpdateDocument). If not specified, the document is chunked based on the knowledge base-level default configurations, and this field is not returned. The knowledge base-level configuration is not echoed back to avoid misleading users about the actual chunking basis for this document when the knowledge base-level configuration is subsequently changed.</p>
         */
        public Builder chunkConfiguration(ChunkConfiguration chunkConfiguration) {
            this.chunkConfiguration = chunkConfiguration;
            return this;
        }

        /**
         * <p>The number of chunks generated after processing is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder chunkCount(Integer chunkCount) {
            this.chunkCount = chunkCount;
            return this;
        }

        /**
         * <p>The time when the document was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-24T10:00:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The unique identifier of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-bp1xxxxxxxxxxxx</p>
         */
        public Builder documentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        /**
         * <p>The stable error code returned when processing fails.</p>
         * 
         * <strong>example:</strong>
         * <p>FILE_CORRUPTED</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The desensitized error message returned when processing fails.</p>
         * 
         * <strong>example:</strong>
         * <p>parse pdf failed</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The file name of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>manual.pdf</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The file size of the document, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * <p>The document-level metadata key-value pairs, including constant field values and system variable values. This field is not returned if no metadata is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Key&quot;:&quot;department&quot;,&quot;Value&quot;:&quot;R&amp;D&quot;}]</p>
         */
        public Builder metadata(java.util.List<Metadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The last modification time in the upstream source system, in epoch milliseconds. This field is empty if no source information is available.</p>
         * 
         * <strong>example:</strong>
         * <p>1788000000000</p>
         */
        public Builder sourceModifiedTime(Long sourceModifiedTime) {
            this.sourceModifiedTime = sourceModifiedTime;
            return this;
        }

        /**
         * <p>The delivery channel through which the document entered the knowledge base. This value is written by the system and cannot be specified by users. Valid values:</p>
         * <ul>
         * <li>UPLOAD: manually uploaded through the console or API.</li>
         * <li>OSS: imported through an OSS event stream.</li>
         * </ul>
         * <p>New values may be added when new channels are supported. The values are not restricted to a fixed enumeration.</p>
         * 
         * <strong>example:</strong>
         * <p>UPLOAD</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The original source address of the document, such as oss://bucket/path/file.md. This field may be empty for manually uploaded documents.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://my-bucket/docs/handbook.pdf</p>
         */
        public Builder sourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }

        /**
         * <p>The processing status of the document. Valid values:</p>
         * <ul>
         * <li>UPLOADING: uploading in progress.</li>
         * <li>PENDING: upload complete and queued for processing. This is typically a transitional state that lasts for seconds.</li>
         * <li>PROCESSING: parsing and processing in progress.</li>
         * <li>COMPLETED: processing complete and searchable.</li>
         * <li>FAILED: processing failed.</li>
         * <li>DELETING: deletion in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the document was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-24T10:00:00Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public KnowledgeBaseDocument build() {
            return new KnowledgeBaseDocument(this);
        } 

    } 

    /**
     * 
     * {@link KnowledgeBaseDocument} extends {@link TeaModel}
     *
     * <p>KnowledgeBaseDocument</p>
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
     * {@link KnowledgeBaseDocument} extends {@link TeaModel}
     *
     * <p>KnowledgeBaseDocument</p>
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
             * <p>The overlap character length between adjacent chunks. This parameter takes effect only for the BY_LENGTH strategy. If the value is greater than 0, the beginning of the next chunk repeats the content from the end of the previous chunk within this window. The overlap does not cause a chunk to exceed MaxChunkSize. A value of 0 indicates no overlap.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder overlapSize(Integer overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>The snapshot of preprocessing rules.</p>
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
     * {@link KnowledgeBaseDocument} extends {@link TeaModel}
     *
     * <p>KnowledgeBaseDocument</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The metadata field name.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The metadata field value.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D</p>
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
}
