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
 * {@link BrandKnowledgeInitialImport} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeInitialImport</p>
 */
public class BrandKnowledgeInitialImport extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Analysis")
    private BrandKnowledgeProfileAnalysis analysis;

    @com.aliyun.core.annotation.NameInMap("CompletedCount")
    private Integer completedCount;

    @com.aliyun.core.annotation.NameInMap("DocumentIds")
    private java.util.List<String> documentIds;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ExpectedVersion")
    private Long expectedVersion;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Urls")
    private java.util.List<String> urls;

    @com.aliyun.core.annotation.NameInMap("WebsiteId")
    private String websiteId;

    private BrandKnowledgeInitialImport(Builder builder) {
        this.analysis = builder.analysis;
        this.completedCount = builder.completedCount;
        this.documentIds = builder.documentIds;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.expectedVersion = builder.expectedVersion;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.phase = builder.phase;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.totalCount = builder.totalCount;
        this.urls = builder.urls;
        this.websiteId = builder.websiteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeInitialImport create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysis
     */
    public BrandKnowledgeProfileAnalysis getAnalysis() {
        return this.analysis;
    }

    /**
     * @return completedCount
     */
    public Integer getCompletedCount() {
        return this.completedCount;
    }

    /**
     * @return documentIds
     */
    public java.util.List<String> getDocumentIds() {
        return this.documentIds;
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
     * @return expectedVersion
     */
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return urls
     */
    public java.util.List<String> getUrls() {
        return this.urls;
    }

    /**
     * @return websiteId
     */
    public String getWebsiteId() {
        return this.websiteId;
    }

    public static final class Builder {
        private BrandKnowledgeProfileAnalysis analysis; 
        private Integer completedCount; 
        private java.util.List<String> documentIds; 
        private String errorCode; 
        private String errorMessage; 
        private Long expectedVersion; 
        private String knowledgeBaseId; 
        private String phase; 
        private String status; 
        private String taskId; 
        private Integer totalCount; 
        private java.util.List<String> urls; 
        private String websiteId; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeInitialImport model) {
            this.analysis = model.analysis;
            this.completedCount = model.completedCount;
            this.documentIds = model.documentIds;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.expectedVersion = model.expectedVersion;
            this.knowledgeBaseId = model.knowledgeBaseId;
            this.phase = model.phase;
            this.status = model.status;
            this.taskId = model.taskId;
            this.totalCount = model.totalCount;
            this.urls = model.urls;
            this.websiteId = model.websiteId;
        } 

        /**
         * Analysis.
         */
        public Builder analysis(BrandKnowledgeProfileAnalysis analysis) {
            this.analysis = analysis;
            return this;
        }

        /**
         * CompletedCount.
         */
        public Builder completedCount(Integer completedCount) {
            this.completedCount = completedCount;
            return this;
        }

        /**
         * DocumentIds.
         */
        public Builder documentIds(java.util.List<String> documentIds) {
            this.documentIds = documentIds;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * ExpectedVersion.
         */
        public Builder expectedVersion(Long expectedVersion) {
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * KnowledgeBaseId.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Urls.
         */
        public Builder urls(java.util.List<String> urls) {
            this.urls = urls;
            return this;
        }

        /**
         * WebsiteId.
         */
        public Builder websiteId(String websiteId) {
            this.websiteId = websiteId;
            return this;
        }

        public BrandKnowledgeInitialImport build() {
            return new BrandKnowledgeInitialImport(this);
        } 

    } 

}
