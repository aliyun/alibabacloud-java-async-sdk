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
 * {@link BrandKnowledgeWebsitePage} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeWebsitePage</p>
 */
public class BrandKnowledgeWebsitePage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CapturedAt")
    private String capturedAt;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ExistingMaterialId")
    private String existingMaterialId;

    @com.aliyun.core.annotation.NameInMap("FinalUrl")
    private String finalUrl;

    @com.aliyun.core.annotation.NameInMap("ImportErrorCode")
    private String importErrorCode;

    @com.aliyun.core.annotation.NameInMap("ImportErrorMessage")
    private String importErrorMessage;

    @com.aliyun.core.annotation.NameInMap("ImportStatus")
    private String importStatus;

    @com.aliyun.core.annotation.NameInMap("PageId")
    private String pageId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private BrandKnowledgeWebsitePage(Builder builder) {
        this.capturedAt = builder.capturedAt;
        this.errorMessage = builder.errorMessage;
        this.existingMaterialId = builder.existingMaterialId;
        this.finalUrl = builder.finalUrl;
        this.importErrorCode = builder.importErrorCode;
        this.importErrorMessage = builder.importErrorMessage;
        this.importStatus = builder.importStatus;
        this.pageId = builder.pageId;
        this.status = builder.status;
        this.title = builder.title;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeWebsitePage create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capturedAt
     */
    public String getCapturedAt() {
        return this.capturedAt;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return existingMaterialId
     */
    public String getExistingMaterialId() {
        return this.existingMaterialId;
    }

    /**
     * @return finalUrl
     */
    public String getFinalUrl() {
        return this.finalUrl;
    }

    /**
     * @return importErrorCode
     */
    public String getImportErrorCode() {
        return this.importErrorCode;
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
     * @return pageId
     */
    public String getPageId() {
        return this.pageId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String capturedAt; 
        private String errorMessage; 
        private String existingMaterialId; 
        private String finalUrl; 
        private String importErrorCode; 
        private String importErrorMessage; 
        private String importStatus; 
        private String pageId; 
        private String status; 
        private String title; 
        private String url; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeWebsitePage model) {
            this.capturedAt = model.capturedAt;
            this.errorMessage = model.errorMessage;
            this.existingMaterialId = model.existingMaterialId;
            this.finalUrl = model.finalUrl;
            this.importErrorCode = model.importErrorCode;
            this.importErrorMessage = model.importErrorMessage;
            this.importStatus = model.importStatus;
            this.pageId = model.pageId;
            this.status = model.status;
            this.title = model.title;
            this.url = model.url;
        } 

        /**
         * CapturedAt.
         */
        public Builder capturedAt(String capturedAt) {
            this.capturedAt = capturedAt;
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
         * ExistingMaterialId.
         */
        public Builder existingMaterialId(String existingMaterialId) {
            this.existingMaterialId = existingMaterialId;
            return this;
        }

        /**
         * FinalUrl.
         */
        public Builder finalUrl(String finalUrl) {
            this.finalUrl = finalUrl;
            return this;
        }

        /**
         * ImportErrorCode.
         */
        public Builder importErrorCode(String importErrorCode) {
            this.importErrorCode = importErrorCode;
            return this;
        }

        /**
         * ImportErrorMessage.
         */
        public Builder importErrorMessage(String importErrorMessage) {
            this.importErrorMessage = importErrorMessage;
            return this;
        }

        /**
         * ImportStatus.
         */
        public Builder importStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }

        /**
         * PageId.
         */
        public Builder pageId(String pageId) {
            this.pageId = pageId;
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
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public BrandKnowledgeWebsitePage build() {
            return new BrandKnowledgeWebsitePage(this);
        } 

    } 

}
