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
 * {@link KnowledgeBaseChunk} extends {@link TeaModel}
 *
 * <p>KnowledgeBaseChunk</p>
 */
public class KnowledgeBaseChunk extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChunkSeq")
    private Integer chunkSeq;

    @com.aliyun.core.annotation.NameInMap("ChunkSize")
    private Integer chunkSize;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("DocumentId")
    private String documentId;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("SourceLocation")
    private String sourceLocation;

    @com.aliyun.core.annotation.NameInMap("TitlePath")
    private String titlePath;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    private KnowledgeBaseChunk(Builder builder) {
        this.chunkSeq = builder.chunkSeq;
        this.chunkSize = builder.chunkSize;
        this.content = builder.content;
        this.createdAt = builder.createdAt;
        this.documentId = builder.documentId;
        this.enabled = builder.enabled;
        this.fileName = builder.fileName;
        this.sourceLocation = builder.sourceLocation;
        this.titlePath = builder.titlePath;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeBaseChunk create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chunkSeq
     */
    public Integer getChunkSeq() {
        return this.chunkSeq;
    }

    /**
     * @return chunkSize
     */
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
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
     * @return sourceLocation
     */
    public String getSourceLocation() {
        return this.sourceLocation;
    }

    /**
     * @return titlePath
     */
    public String getTitlePath() {
        return this.titlePath;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Integer chunkSeq; 
        private Integer chunkSize; 
        private String content; 
        private String createdAt; 
        private String documentId; 
        private Boolean enabled; 
        private String fileName; 
        private String sourceLocation; 
        private String titlePath; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(KnowledgeBaseChunk model) {
            this.chunkSeq = model.chunkSeq;
            this.chunkSize = model.chunkSize;
            this.content = model.content;
            this.createdAt = model.createdAt;
            this.documentId = model.documentId;
            this.enabled = model.enabled;
            this.fileName = model.fileName;
            this.sourceLocation = model.sourceLocation;
            this.titlePath = model.titlePath;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The sequence number of the chunk within the document, starting from 1 and numbered consecutively.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder chunkSeq(Integer chunkSeq) {
            this.chunkSeq = chunkSeq;
            return this;
        }

        /**
         * <p>The number of characters in the chunk content, measured in UTF-16 code units, consistent with MaxChunkSize. You can use this value to evaluate chunk saturation against the chunking configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder chunkSize(Integer chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }

        /**
         * <p>The content of the chunk.</p>
         * 
         * <strong>example:</strong>
         * <p>EventBridge supports routing events to multiple target services</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The time when the chunk was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-24T10:00:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The ID of the document to which the chunk belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-bp1xxxxxxxxxxxx</p>
         */
        public Builder documentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        /**
         * <p>Indicates whether the chunk is enabled. Disabled chunks are excluded from retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The file name of the document to which the chunk belongs. This value is from the same source as the FileName returned by GetDocument.</p>
         * 
         * <strong>example:</strong>
         * <p>product-handbook.pdf</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The location of the chunk in the original document. The format varies by document type: for PDF, the value is p.PageNumber (such as p.3). For PPT/PPTX, the value is s.SlideNumber (such as s.2). For XLS/XLSX, the value is the sheet name. For other formats (such as txt, md, html, doc, or docx), this field is not returned if no source location is available.</p>
         * 
         * <strong>example:</strong>
         * <p>p.3</p>
         */
        public Builder sourceLocation(String sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        /**
         * <p>The hierarchical title path of the chunk, connected by &gt;. If no recognizable title exists in the original document, the value falls back to a summary of the first paragraph content (such as CONTENT). This field is for display purposes only.</p>
         * 
         * <strong>example:</strong>
         * <p>Installation Guide&gt;Prerequisites</p>
         */
        public Builder titlePath(String titlePath) {
            this.titlePath = titlePath;
            return this;
        }

        /**
         * <p>The time when the chunk was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-24T10:00:00Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public KnowledgeBaseChunk build() {
            return new KnowledgeBaseChunk(this);
        } 

    } 

}
