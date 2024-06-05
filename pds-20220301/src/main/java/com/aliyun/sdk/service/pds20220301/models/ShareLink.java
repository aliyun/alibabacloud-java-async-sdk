// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ShareLink} extends {@link TeaModel}
 *
 * <p>ShareLink</p>
 */
public class ShareLink extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("access_count")
    private Long accessCount;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("disable_download")
    private Boolean disableDownload;

    @com.aliyun.core.annotation.NameInMap("disable_preview")
    private Boolean disablePreview;

    @com.aliyun.core.annotation.NameInMap("disable_save")
    private Boolean disableSave;

    @com.aliyun.core.annotation.NameInMap("download_count")
    private Long downloadCount;

    @com.aliyun.core.annotation.NameInMap("download_limit")
    private Long downloadLimit;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("expiration")
    private String expiration;

    @com.aliyun.core.annotation.NameInMap("expired")
    private Boolean expired;

    @com.aliyun.core.annotation.NameInMap("file_id_list")
    private java.util.List < String > fileIdList;

    @com.aliyun.core.annotation.NameInMap("preview_count")
    private Long previewCount;

    @com.aliyun.core.annotation.NameInMap("preview_limit")
    private Long previewLimit;

    @com.aliyun.core.annotation.NameInMap("report_count")
    private Long reportCount;

    @com.aliyun.core.annotation.NameInMap("save_count")
    private Long saveCount;

    @com.aliyun.core.annotation.NameInMap("save_download_limit")
    private Long saveDownloadLimit;

    @com.aliyun.core.annotation.NameInMap("save_limit")
    private Long saveLimit;

    @com.aliyun.core.annotation.NameInMap("share_all_files")
    private Boolean shareAllFiles;

    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.NameInMap("share_name")
    private String shareName;

    @com.aliyun.core.annotation.NameInMap("share_pwd")
    private String sharePwd;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("video_preview_count")
    private Long videoPreviewCount;

    private ShareLink(Builder builder) {
        this.accessCount = builder.accessCount;
        this.createdAt = builder.createdAt;
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
        this.fileIdList = builder.fileIdList;
        this.previewCount = builder.previewCount;
        this.previewLimit = builder.previewLimit;
        this.reportCount = builder.reportCount;
        this.saveCount = builder.saveCount;
        this.saveDownloadLimit = builder.saveDownloadLimit;
        this.saveLimit = builder.saveLimit;
        this.shareAllFiles = builder.shareAllFiles;
        this.shareId = builder.shareId;
        this.shareName = builder.shareName;
        this.sharePwd = builder.sharePwd;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
        this.videoPreviewCount = builder.videoPreviewCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShareLink create() {
        return builder().build();
    }

    /**
     * @return accessCount
     */
    public Long getAccessCount() {
        return this.accessCount;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
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
     * @return fileIdList
     */
    public java.util.List < String > getFileIdList() {
        return this.fileIdList;
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
     * @return saveDownloadLimit
     */
    public Long getSaveDownloadLimit() {
        return this.saveDownloadLimit;
    }

    /**
     * @return saveLimit
     */
    public Long getSaveLimit() {
        return this.saveLimit;
    }

    /**
     * @return shareAllFiles
     */
    public Boolean getShareAllFiles() {
        return this.shareAllFiles;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
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
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return videoPreviewCount
     */
    public Long getVideoPreviewCount() {
        return this.videoPreviewCount;
    }

    public static final class Builder {
        private Long accessCount; 
        private String createdAt; 
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
        private java.util.List < String > fileIdList; 
        private Long previewCount; 
        private Long previewLimit; 
        private Long reportCount; 
        private Long saveCount; 
        private Long saveDownloadLimit; 
        private Long saveLimit; 
        private Boolean shareAllFiles; 
        private String shareId; 
        private String shareName; 
        private String sharePwd; 
        private String status; 
        private String updatedAt; 
        private Long videoPreviewCount; 

        /**
         * access_count.
         */
        public Builder accessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * disable_download.
         */
        public Builder disableDownload(Boolean disableDownload) {
            this.disableDownload = disableDownload;
            return this;
        }

        /**
         * disable_preview.
         */
        public Builder disablePreview(Boolean disablePreview) {
            this.disablePreview = disablePreview;
            return this;
        }

        /**
         * disable_save.
         */
        public Builder disableSave(Boolean disableSave) {
            this.disableSave = disableSave;
            return this;
        }

        /**
         * download_count.
         */
        public Builder downloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }

        /**
         * download_limit.
         */
        public Builder downloadLimit(Long downloadLimit) {
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * expiration.
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * expired.
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
            return this;
        }

        /**
         * file_id_list.
         */
        public Builder fileIdList(java.util.List < String > fileIdList) {
            this.fileIdList = fileIdList;
            return this;
        }

        /**
         * preview_count.
         */
        public Builder previewCount(Long previewCount) {
            this.previewCount = previewCount;
            return this;
        }

        /**
         * preview_limit.
         */
        public Builder previewLimit(Long previewLimit) {
            this.previewLimit = previewLimit;
            return this;
        }

        /**
         * report_count.
         */
        public Builder reportCount(Long reportCount) {
            this.reportCount = reportCount;
            return this;
        }

        /**
         * save_count.
         */
        public Builder saveCount(Long saveCount) {
            this.saveCount = saveCount;
            return this;
        }

        /**
         * save_download_limit.
         */
        public Builder saveDownloadLimit(Long saveDownloadLimit) {
            this.saveDownloadLimit = saveDownloadLimit;
            return this;
        }

        /**
         * save_limit.
         */
        public Builder saveLimit(Long saveLimit) {
            this.saveLimit = saveLimit;
            return this;
        }

        /**
         * share_all_files.
         */
        public Builder shareAllFiles(Boolean shareAllFiles) {
            this.shareAllFiles = shareAllFiles;
            return this;
        }

        /**
         * share_id.
         */
        public Builder shareId(String shareId) {
            this.shareId = shareId;
            return this;
        }

        /**
         * share_name.
         */
        public Builder shareName(String shareName) {
            this.shareName = shareName;
            return this;
        }

        /**
         * share_pwd.
         */
        public Builder sharePwd(String sharePwd) {
            this.sharePwd = sharePwd;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * video_preview_count.
         */
        public Builder videoPreviewCount(Long videoPreviewCount) {
            this.videoPreviewCount = videoPreviewCount;
            return this;
        }

        public ShareLink build() {
            return new ShareLink(this);
        } 

    } 

}
