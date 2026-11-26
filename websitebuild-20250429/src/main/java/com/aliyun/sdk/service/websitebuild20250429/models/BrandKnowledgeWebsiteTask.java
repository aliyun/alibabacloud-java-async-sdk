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
 * {@link BrandKnowledgeWebsiteTask} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeWebsiteTask</p>
 */
public class BrandKnowledgeWebsiteTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Analysis")
    private BrandKnowledgeProfileAnalysis analysis;

    @com.aliyun.core.annotation.NameInMap("AnalysisStatus")
    private String analysisStatus;

    @com.aliyun.core.annotation.NameInMap("BrandName")
    private String brandName;

    @com.aliyun.core.annotation.NameInMap("CaptureScope")
    private String captureScope;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Evidence")
    private java.util.List<BrandKnowledgeProfileEvidence> evidence;

    @com.aliyun.core.annotation.NameInMap("ImportStatus")
    private String importStatus;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("LatestAnalysisStatus")
    private String latestAnalysisStatus;

    @com.aliyun.core.annotation.NameInMap("LatestFetchStatus")
    private String latestFetchStatus;

    @com.aliyun.core.annotation.NameInMap("LatestImportStatus")
    private String latestImportStatus;

    @com.aliyun.core.annotation.NameInMap("Pages")
    private java.util.List<BrandKnowledgeWebsitePage> pages;

    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("RefreshMaterialId")
    private String refreshMaterialId;

    @com.aliyun.core.annotation.NameInMap("SourceUrl")
    private String sourceUrl;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private BrandKnowledgeWebsiteTask(Builder builder) {
        this.analysis = builder.analysis;
        this.analysisStatus = builder.analysisStatus;
        this.brandName = builder.brandName;
        this.captureScope = builder.captureScope;
        this.description = builder.description;
        this.errorMessage = builder.errorMessage;
        this.evidence = builder.evidence;
        this.importStatus = builder.importStatus;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.latestAnalysisStatus = builder.latestAnalysisStatus;
        this.latestFetchStatus = builder.latestFetchStatus;
        this.latestImportStatus = builder.latestImportStatus;
        this.pages = builder.pages;
        this.phase = builder.phase;
        this.refreshMaterialId = builder.refreshMaterialId;
        this.sourceUrl = builder.sourceUrl;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeWebsiteTask create() {
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
     * @return analysisStatus
     */
    public String getAnalysisStatus() {
        return this.analysisStatus;
    }

    /**
     * @return brandName
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * @return captureScope
     */
    public String getCaptureScope() {
        return this.captureScope;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return evidence
     */
    public java.util.List<BrandKnowledgeProfileEvidence> getEvidence() {
        return this.evidence;
    }

    /**
     * @return importStatus
     */
    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return latestAnalysisStatus
     */
    public String getLatestAnalysisStatus() {
        return this.latestAnalysisStatus;
    }

    /**
     * @return latestFetchStatus
     */
    public String getLatestFetchStatus() {
        return this.latestFetchStatus;
    }

    /**
     * @return latestImportStatus
     */
    public String getLatestImportStatus() {
        return this.latestImportStatus;
    }

    /**
     * @return pages
     */
    public java.util.List<BrandKnowledgeWebsitePage> getPages() {
        return this.pages;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return refreshMaterialId
     */
    public String getRefreshMaterialId() {
        return this.refreshMaterialId;
    }

    /**
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return this.sourceUrl;
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

    public static final class Builder {
        private BrandKnowledgeProfileAnalysis analysis; 
        private String analysisStatus; 
        private String brandName; 
        private String captureScope; 
        private String description; 
        private String errorMessage; 
        private java.util.List<BrandKnowledgeProfileEvidence> evidence; 
        private String importStatus; 
        private String knowledgeBaseId; 
        private String latestAnalysisStatus; 
        private String latestFetchStatus; 
        private String latestImportStatus; 
        private java.util.List<BrandKnowledgeWebsitePage> pages; 
        private String phase; 
        private String refreshMaterialId; 
        private String sourceUrl; 
        private String status; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeWebsiteTask model) {
            this.analysis = model.analysis;
            this.analysisStatus = model.analysisStatus;
            this.brandName = model.brandName;
            this.captureScope = model.captureScope;
            this.description = model.description;
            this.errorMessage = model.errorMessage;
            this.evidence = model.evidence;
            this.importStatus = model.importStatus;
            this.knowledgeBaseId = model.knowledgeBaseId;
            this.latestAnalysisStatus = model.latestAnalysisStatus;
            this.latestFetchStatus = model.latestFetchStatus;
            this.latestImportStatus = model.latestImportStatus;
            this.pages = model.pages;
            this.phase = model.phase;
            this.refreshMaterialId = model.refreshMaterialId;
            this.sourceUrl = model.sourceUrl;
            this.status = model.status;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The brand analysis results generated by this task.</p>
         */
        public Builder analysis(BrandKnowledgeProfileAnalysis analysis) {
            this.analysis = analysis;
            return this;
        }

        /**
         * <p>The status of the brand analysis task.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder analysisStatus(String analysisStatus) {
            this.analysisStatus = analysisStatus;
            return this;
        }

        /**
         * <p>The brand name used for analysis or diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample Technology</p>
         */
        public Builder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        /**
         * <p>The web page fetch scope.</p>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED_URLS</p>
         */
        public Builder captureScope(String captureScope) {
            this.captureScope = captureScope;
            return this;
        }

        /**
         * <p>The profile of the brand or collection object.</p>
         * 
         * <strong>example:</strong>
         * <p>Provides software services for enterprises</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The error message displayed upon failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Web page fetch failed</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The list of source evidence used to support the analysis results.</p>
         */
        public Builder evidence(java.util.List<BrandKnowledgeProfileEvidence> evidence) {
            this.evidence = evidence;
            return this;
        }

        /**
         * <p>The import status of the web page material.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder importStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }

        /**
         * <p>The ID of the brand knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>bkb_example001</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The latest brand analysis status of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder latestAnalysisStatus(String latestAnalysisStatus) {
            this.latestAnalysisStatus = latestAnalysisStatus;
            return this;
        }

        /**
         * <p>The latest web page fetch status of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder latestFetchStatus(String latestFetchStatus) {
            this.latestFetchStatus = latestFetchStatus;
            return this;
        }

        /**
         * <p>The latest material import status of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder latestImportStatus(String latestImportStatus) {
            this.latestImportStatus = latestImportStatus;
            return this;
        }

        /**
         * <p>The list of web page information discovered or processed in this task.</p>
         */
        public Builder pages(java.util.List<BrandKnowledgeWebsitePage> pages) {
            this.pages = pages;
            return this;
        }

        /**
         * <p>The current workflow phase.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * <p>The ID of the material associated with the refresh task.</p>
         * 
         * <strong>example:</strong>
         * <p>bkm_example001</p>
         */
        public Builder refreshMaterialId(String refreshMaterialId) {
            this.refreshMaterialId = refreshMaterialId;
            return this;
        }

        /**
         * <p>The source web address of the material.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/about">https://example.com/about</a></p>
         */
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * <p>The current processing status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The task ID used to query the processing progress.</p>
         * 
         * <strong>example:</strong>
         * <p>bwb_example001</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public BrandKnowledgeWebsiteTask build() {
            return new BrandKnowledgeWebsiteTask(this);
        } 

    } 

}
