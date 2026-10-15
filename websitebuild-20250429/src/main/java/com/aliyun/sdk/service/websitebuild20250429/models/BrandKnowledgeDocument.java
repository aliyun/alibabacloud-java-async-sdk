// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link BrandKnowledgeDocument} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeDocument</p>
 */
public class BrandKnowledgeDocument extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContentSufficient")
    private Boolean contentSufficient;

    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("Deletable")
    private Boolean deletable;

    @com.aliyun.core.annotation.NameInMap("DisplayTitle")
    private String displayTitle;

    @com.aliyun.core.annotation.NameInMap("DocCategory")
    private String docCategory;

    @com.aliyun.core.annotation.NameInMap("DocumentId")
    private String documentId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("KeyTopics")
    private java.util.List<String> keyTopics;

    @com.aliyun.core.annotation.NameInMap("OneLineSummary")
    private String oneLineSummary;

    @com.aliyun.core.annotation.NameInMap("OriginalName")
    private String originalName;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ReadyAt")
    private Long readyAt;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusMessage")
    private String statusMessage;

    @com.aliyun.core.annotation.NameInMap("SummaryErrorCode")
    private String summaryErrorCode;

    @com.aliyun.core.annotation.NameInMap("SummaryStatus")
    private String summaryStatus;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private Long updatedAt;

    private BrandKnowledgeDocument(Builder builder) {
        this.contentSufficient = builder.contentSufficient;
        this.contentType = builder.contentType;
        this.createdAt = builder.createdAt;
        this.deletable = builder.deletable;
        this.displayTitle = builder.displayTitle;
        this.docCategory = builder.docCategory;
        this.documentId = builder.documentId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.fileSize = builder.fileSize;
        this.keyTopics = builder.keyTopics;
        this.oneLineSummary = builder.oneLineSummary;
        this.originalName = builder.originalName;
        this.projectId = builder.projectId;
        this.readyAt = builder.readyAt;
        this.status = builder.status;
        this.statusMessage = builder.statusMessage;
        this.summaryErrorCode = builder.summaryErrorCode;
        this.summaryStatus = builder.summaryStatus;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeDocument create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentSufficient
     */
    public Boolean getContentSufficient() {
        return this.contentSufficient;
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
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return deletable
     */
    public Boolean getDeletable() {
        return this.deletable;
    }

    /**
     * @return displayTitle
     */
    public String getDisplayTitle() {
        return this.displayTitle;
    }

    /**
     * @return docCategory
     */
    public String getDocCategory() {
        return this.docCategory;
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
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return keyTopics
     */
    public java.util.List<String> getKeyTopics() {
        return this.keyTopics;
    }

    /**
     * @return oneLineSummary
     */
    public String getOneLineSummary() {
        return this.oneLineSummary;
    }

    /**
     * @return originalName
     */
    public String getOriginalName() {
        return this.originalName;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return readyAt
     */
    public Long getReadyAt() {
        return this.readyAt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusMessage
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * @return summaryErrorCode
     */
    public String getSummaryErrorCode() {
        return this.summaryErrorCode;
    }

    /**
     * @return summaryStatus
     */
    public String getSummaryStatus() {
        return this.summaryStatus;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Boolean contentSufficient; 
        private String contentType; 
        private Long createdAt; 
        private Boolean deletable; 
        private String displayTitle; 
        private String docCategory; 
        private String documentId; 
        private String errorCode; 
        private String errorMessage; 
        private Long fileSize; 
        private java.util.List<String> keyTopics; 
        private String oneLineSummary; 
        private String originalName; 
        private String projectId; 
        private Long readyAt; 
        private String status; 
        private String statusMessage; 
        private String summaryErrorCode; 
        private String summaryStatus; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeDocument model) {
            this.contentSufficient = model.contentSufficient;
            this.contentType = model.contentType;
            this.createdAt = model.createdAt;
            this.deletable = model.deletable;
            this.displayTitle = model.displayTitle;
            this.docCategory = model.docCategory;
            this.documentId = model.documentId;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.fileSize = model.fileSize;
            this.keyTopics = model.keyTopics;
            this.oneLineSummary = model.oneLineSummary;
            this.originalName = model.originalName;
            this.projectId = model.projectId;
            this.readyAt = model.readyAt;
            this.status = model.status;
            this.statusMessage = model.statusMessage;
            this.summaryErrorCode = model.summaryErrorCode;
            this.summaryStatus = model.summaryStatus;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>Specifies whether the content is sufficient to be considered for plan summary candidates.</p>
         */
        public Builder contentSufficient(Boolean contentSufficient) {
            this.contentSufficient = contentSufficient;
            return this;
        }

        /**
         * <p>The MIME type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>application/pdf</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The creation time in Unix milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>Specifies whether deletion is currently allowed.</p>
         */
        public Builder deletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }

        /**
         * <p>The display title.</p>
         * 
         * <strong>example:</strong>
         * <p>Wanxiaozhi product introduction</p>
         */
        public Builder displayTitle(String displayTitle) {
            this.displayTitle = displayTitle;
            return this;
        }

        /**
         * <p>The document category.</p>
         * 
         * <strong>example:</strong>
         * <p>PRODUCT</p>
         */
        public Builder docCategory(String docCategory) {
            this.docCategory = docCategory;
            return this;
        }

        /**
         * <p>The ID of the brand knowledge document.</p>
         * 
         * <strong>example:</strong>
         * <p>bkd_3f7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e</p>
         */
        public Builder documentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        /**
         * <p>The stable error code for main processing failures.</p>
         * 
         * <strong>example:</strong>
         * <p>BRAND_KNOWLEDGE_PARSE_FAILED</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The desensitized error message for main processing failures.</p>
         * 
         * <strong>example:</strong>
         * <p>Document parsing failed. Please re-upload</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The file size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * <p>The summary keywords.</p>
         */
        public Builder keyTopics(java.util.List<String> keyTopics) {
            this.keyTopics = keyTopics;
            return this;
        }

        /**
         * <p>The one-line summary, which is used only to construct search queries and cannot be used as factual evidence.</p>
         * 
         * <strong>example:</strong>
         * <p>Introduces the product positioning and core capabilities of the Wanxiaozhi AI website building platform. It can be used as a reference for content topic selection</p>
         */
        public Builder oneLineSummary(String oneLineSummary) {
            this.oneLineSummary = oneLineSummary;
            return this;
        }

        /**
         * <p>The original file name.</p>
         * 
         * <strong>example:</strong>
         * <p>Wanxiaozhi product introduction.pdf</p>
         */
        public Builder originalName(String originalName) {
            this.originalName = originalName;
            return this;
        }

        /**
         * <p>The ID of the business workspace. For GEO business workspaces of the brand marketing type, this is the appWorkspaceId.</p>
         * 
         * <strong>example:</strong>
         * <p>d4e5f60718293a4b5c6d7e8f90a1b2c3</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The time when the document is ready for reference, in Unix milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660900000</p>
         */
        public Builder readyAt(Long readyAt) {
            this.readyAt = readyAt;
            return this;
        }

        /**
         * <p>The document processing status.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The message displayed on the status page.</p>
         * 
         * <strong>example:</strong>
         * <p>Parsing completed and available for content plans</p>
         */
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        /**
         * <p>The stable error code for summary failures.</p>
         * 
         * <strong>example:</strong>
         * <p>BRAND_KNOWLEDGE_SUMMARY_TIMEOUT</p>
         */
        public Builder summaryErrorCode(String summaryErrorCode) {
            this.summaryErrorCode = summaryErrorCode;
            return this;
        }

        /**
         * <p>The summary status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder summaryStatus(String summaryStatus) {
            this.summaryStatus = summaryStatus;
            return this;
        }

        /**
         * <p>The last update time in Unix milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660900000</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public BrandKnowledgeDocument build() {
            return new BrandKnowledgeDocument(this);
        } 

    } 

}
