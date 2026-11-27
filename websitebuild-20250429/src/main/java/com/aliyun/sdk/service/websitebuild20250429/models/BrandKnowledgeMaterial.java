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
 * {@link BrandKnowledgeMaterial} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeMaterial</p>
 */
public class BrandKnowledgeMaterial extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentDocumentId")
    private String currentDocumentId;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("ImportErrorMessage")
    private String importErrorMessage;

    @com.aliyun.core.annotation.NameInMap("ImportStatus")
    private String importStatus;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("MaterialId")
    private String materialId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PendingDocumentId")
    private String pendingDocumentId;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("SourceUrl")
    private String sourceUrl;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Long version;

    @com.aliyun.core.annotation.NameInMap("WebsiteId")
    private String websiteId;

    private BrandKnowledgeMaterial(Builder builder) {
        this.currentDocumentId = builder.currentDocumentId;
        this.enabled = builder.enabled;
        this.importErrorMessage = builder.importErrorMessage;
        this.importStatus = builder.importStatus;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.materialId = builder.materialId;
        this.name = builder.name;
        this.pendingDocumentId = builder.pendingDocumentId;
        this.sourceType = builder.sourceType;
        this.sourceUrl = builder.sourceUrl;
        this.status = builder.status;
        this.version = builder.version;
        this.websiteId = builder.websiteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeMaterial create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentDocumentId
     */
    public String getCurrentDocumentId() {
        return this.currentDocumentId;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return importErrorMessage
     */
    public String getImportErrorMessage() {
        return this.importErrorMessage;
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
     * @return materialId
     */
    public String getMaterialId() {
        return this.materialId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pendingDocumentId
     */
    public String getPendingDocumentId() {
        return this.pendingDocumentId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
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
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * @return websiteId
     */
    public String getWebsiteId() {
        return this.websiteId;
    }

    public static final class Builder {
        private String currentDocumentId; 
        private Boolean enabled; 
        private String importErrorMessage; 
        private String importStatus; 
        private String knowledgeBaseId; 
        private String materialId; 
        private String name; 
        private String pendingDocumentId; 
        private String sourceType; 
        private String sourceUrl; 
        private String status; 
        private Long version; 
        private String websiteId; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeMaterial model) {
            this.currentDocumentId = model.currentDocumentId;
            this.enabled = model.enabled;
            this.importErrorMessage = model.importErrorMessage;
            this.importStatus = model.importStatus;
            this.knowledgeBaseId = model.knowledgeBaseId;
            this.materialId = model.materialId;
            this.name = model.name;
            this.pendingDocumentId = model.pendingDocumentId;
            this.sourceType = model.sourceType;
            this.sourceUrl = model.sourceUrl;
            this.status = model.status;
            this.version = model.version;
            this.websiteId = model.websiteId;
        } 

        /**
         * <p>The document ID of the current available version.</p>
         * 
         * <strong>example:</strong>
         * <p>bkd_example001</p>
         */
        public Builder currentDocumentId(String currentDocumentId) {
            this.currentDocumentId = currentDocumentId;
            return this;
        }

        /**
         * <p>Specifies whether the material is enabled for retrieval.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The error message displayed when a single page fails to be imported.</p>
         * 
         * <strong>example:</strong>
         * <p>Material quota exceeded</p>
         */
        public Builder importErrorMessage(String importErrorMessage) {
            this.importErrorMessage = importErrorMessage;
            return this;
        }

        /**
         * <p>The import status of the web material.</p>
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
         * <p>The ID of the brand material.</p>
         * 
         * <strong>example:</strong>
         * <p>bkm_example001</p>
         */
        public Builder materialId(String materialId) {
            this.materialId = materialId;
            return this;
        }

        /**
         * <p>The name of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>Official website product introduction</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The document ID of the new version being processed.</p>
         * 
         * <strong>example:</strong>
         * <p>bkd_example002</p>
         */
        public Builder pendingDocumentId(String pendingDocumentId) {
            this.pendingDocumentId = pendingDocumentId;
            return this;
        }

        /**
         * <p>The source type of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>WEB</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
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
         * <p>The business status of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The version number of the record, which is used to detect concurrent modifications.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder version(Long version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The ID of the Wanxiaozhi site.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20261126000000000001</p>
         */
        public Builder websiteId(String websiteId) {
            this.websiteId = websiteId;
            return this;
        }

        public BrandKnowledgeMaterial build() {
            return new BrandKnowledgeMaterial(this);
        } 

    } 

}
