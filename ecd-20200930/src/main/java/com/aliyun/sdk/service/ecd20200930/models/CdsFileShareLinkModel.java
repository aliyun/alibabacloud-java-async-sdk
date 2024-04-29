// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CdsFileShareLinkModel} extends {@link TeaModel}
 *
 * <p>CdsFileShareLinkModel</p>
 */
public class CdsFileShareLinkModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessCount")
    private Long accessCount;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisableDownload")
    private Boolean disableDownload;

    @com.aliyun.core.annotation.NameInMap("DisablePreview")
    private Boolean disablePreview;

    @com.aliyun.core.annotation.NameInMap("DisableSave")
    private Boolean disableSave;

    @com.aliyun.core.annotation.NameInMap("DownloadCount")
    private Long downloadCount;

    @com.aliyun.core.annotation.NameInMap("DownloadLimit")
    private Long downloadLimit;

    @com.aliyun.core.annotation.NameInMap("DriveId")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("Expiration")
    private String expiration;

    @com.aliyun.core.annotation.NameInMap("Expired")
    private Boolean expired;

    @com.aliyun.core.annotation.NameInMap("FileIds")
    private String fileIds;

    @com.aliyun.core.annotation.NameInMap("ModifiyTime")
    private String modifiyTime;

    @com.aliyun.core.annotation.NameInMap("PreviewCount")
    private Long previewCount;

    @com.aliyun.core.annotation.NameInMap("PreviewLimit")
    private Long previewLimit;

    @com.aliyun.core.annotation.NameInMap("ReportCount")
    private Long reportCount;

    @com.aliyun.core.annotation.NameInMap("SaveCount")
    private Long saveCount;

    @com.aliyun.core.annotation.NameInMap("SaveLimit")
    private Long saveLimit;

    @com.aliyun.core.annotation.NameInMap("ShareId")
    private String shareId;

    @com.aliyun.core.annotation.NameInMap("ShareLink")
    private String shareLink;

    @com.aliyun.core.annotation.NameInMap("ShareName")
    private String shareName;

    @com.aliyun.core.annotation.NameInMap("SharePwd")
    private String sharePwd;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VideoPreviewCount")
    private Long videoPreviewCount;

    private CdsFileShareLinkModel(Builder builder) {
        this.accessCount = builder.accessCount;
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.description = builder.description;
        this.disableDownload = builder.disableDownload;
        this.disablePreview = builder.disablePreview;
        this.disableSave = builder.disableSave;
        this.downloadCount = builder.downloadCount;
        this.downloadLimit = builder.downloadLimit;
        this.driveId = builder.driveId;
        this.expiration = builder.expiration;
        this.expired = builder.expired;
        this.fileIds = builder.fileIds;
        this.modifiyTime = builder.modifiyTime;
        this.previewCount = builder.previewCount;
        this.previewLimit = builder.previewLimit;
        this.reportCount = builder.reportCount;
        this.saveCount = builder.saveCount;
        this.saveLimit = builder.saveLimit;
        this.shareId = builder.shareId;
        this.shareLink = builder.shareLink;
        this.shareName = builder.shareName;
        this.sharePwd = builder.sharePwd;
        this.status = builder.status;
        this.videoPreviewCount = builder.videoPreviewCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CdsFileShareLinkModel create() {
        return builder().build();
    }

    /**
     * @return accessCount
     */
    public Long getAccessCount() {
        return this.accessCount;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disableDownload
     */
    public Boolean getDisableDownload() {
        return this.disableDownload;
    }

    /**
     * @return disablePreview
     */
    public Boolean getDisablePreview() {
        return this.disablePreview;
    }

    /**
     * @return disableSave
     */
    public Boolean getDisableSave() {
        return this.disableSave;
    }

    /**
     * @return downloadCount
     */
    public Long getDownloadCount() {
        return this.downloadCount;
    }

    /**
     * @return downloadLimit
     */
    public Long getDownloadLimit() {
        return this.downloadLimit;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
    }

    /**
     * @return expired
     */
    public Boolean getExpired() {
        return this.expired;
    }

    /**
     * @return fileIds
     */
    public String getFileIds() {
        return this.fileIds;
    }

    /**
     * @return modifiyTime
     */
    public String getModifiyTime() {
        return this.modifiyTime;
    }

    /**
     * @return previewCount
     */
    public Long getPreviewCount() {
        return this.previewCount;
    }

    /**
     * @return previewLimit
     */
    public Long getPreviewLimit() {
        return this.previewLimit;
    }

    /**
     * @return reportCount
     */
    public Long getReportCount() {
        return this.reportCount;
    }

    /**
     * @return saveCount
     */
    public Long getSaveCount() {
        return this.saveCount;
    }

    /**
     * @return saveLimit
     */
    public Long getSaveLimit() {
        return this.saveLimit;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return shareLink
     */
    public String getShareLink() {
        return this.shareLink;
    }

    /**
     * @return shareName
     */
    public String getShareName() {
        return this.shareName;
    }

    /**
     * @return sharePwd
     */
    public String getSharePwd() {
        return this.sharePwd;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return videoPreviewCount
     */
    public Long getVideoPreviewCount() {
        return this.videoPreviewCount;
    }

    public static final class Builder {
        private Long accessCount; 
        private String createTime; 
        private String creator; 
        private String description; 
        private Boolean disableDownload; 
        private Boolean disablePreview; 
        private Boolean disableSave; 
        private Long downloadCount; 
        private Long downloadLimit; 
        private String driveId; 
        private String expiration; 
        private Boolean expired; 
        private String fileIds; 
        private String modifiyTime; 
        private Long previewCount; 
        private Long previewLimit; 
        private Long reportCount; 
        private Long saveCount; 
        private Long saveLimit; 
        private String shareId; 
        private String shareLink; 
        private String shareName; 
        private String sharePwd; 
        private String status; 
        private Long videoPreviewCount; 

        /**
         * AccessCount.
         */
        public Builder accessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DisableDownload.
         */
        public Builder disableDownload(Boolean disableDownload) {
            this.disableDownload = disableDownload;
            return this;
        }

        /**
         * DisablePreview.
         */
        public Builder disablePreview(Boolean disablePreview) {
            this.disablePreview = disablePreview;
            return this;
        }

        /**
         * DisableSave.
         */
        public Builder disableSave(Boolean disableSave) {
            this.disableSave = disableSave;
            return this;
        }

        /**
         * DownloadCount.
         */
        public Builder downloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }

        /**
         * DownloadLimit.
         */
        public Builder downloadLimit(Long downloadLimit) {
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * DriveId.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * Expiration.
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * Expired.
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
            return this;
        }

        /**
         * FileIds.
         */
        public Builder fileIds(String fileIds) {
            this.fileIds = fileIds;
            return this;
        }

        /**
         * ModifiyTime.
         */
        public Builder modifiyTime(String modifiyTime) {
            this.modifiyTime = modifiyTime;
            return this;
        }

        /**
         * PreviewCount.
         */
        public Builder previewCount(Long previewCount) {
            this.previewCount = previewCount;
            return this;
        }

        /**
         * PreviewLimit.
         */
        public Builder previewLimit(Long previewLimit) {
            this.previewLimit = previewLimit;
            return this;
        }

        /**
         * ReportCount.
         */
        public Builder reportCount(Long reportCount) {
            this.reportCount = reportCount;
            return this;
        }

        /**
         * SaveCount.
         */
        public Builder saveCount(Long saveCount) {
            this.saveCount = saveCount;
            return this;
        }

        /**
         * SaveLimit.
         */
        public Builder saveLimit(Long saveLimit) {
            this.saveLimit = saveLimit;
            return this;
        }

        /**
         * ShareId.
         */
        public Builder shareId(String shareId) {
            this.shareId = shareId;
            return this;
        }

        /**
         * ShareLink.
         */
        public Builder shareLink(String shareLink) {
            this.shareLink = shareLink;
            return this;
        }

        /**
         * ShareName.
         */
        public Builder shareName(String shareName) {
            this.shareName = shareName;
            return this;
        }

        /**
         * SharePwd.
         */
        public Builder sharePwd(String sharePwd) {
            this.sharePwd = sharePwd;
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
         * VideoPreviewCount.
         */
        public Builder videoPreviewCount(Long videoPreviewCount) {
            this.videoPreviewCount = videoPreviewCount;
            return this;
        }

        public CdsFileShareLinkModel build() {
            return new CdsFileShareLinkModel(this);
        } 

    } 

}
