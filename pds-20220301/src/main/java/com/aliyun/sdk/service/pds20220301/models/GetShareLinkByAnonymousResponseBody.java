// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetShareLinkByAnonymousResponseBody} extends {@link TeaModel}
 *
 * <p>GetShareLinkByAnonymousResponseBody</p>
 */
public class GetShareLinkByAnonymousResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("access_count")
    private Long accessCount;

    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.NameInMap("creator_id")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("creator_name")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("creator_phone")
    private String creatorPhone;

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

    @com.aliyun.core.annotation.NameInMap("expiration")
    private String expiration;

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

    @com.aliyun.core.annotation.NameInMap("share_name")
    private String shareName;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("video_preview_count")
    private Long videoPreviewCount;

    private GetShareLinkByAnonymousResponseBody(Builder builder) {
        this.accessCount = builder.accessCount;
        this.avatar = builder.avatar;
        this.creatorId = builder.creatorId;
        this.creatorName = builder.creatorName;
        this.creatorPhone = builder.creatorPhone;
        this.disableDownload = builder.disableDownload;
        this.disablePreview = builder.disablePreview;
        this.disableSave = builder.disableSave;
        this.downloadCount = builder.downloadCount;
        this.downloadLimit = builder.downloadLimit;
        this.expiration = builder.expiration;
        this.previewCount = builder.previewCount;
        this.previewLimit = builder.previewLimit;
        this.reportCount = builder.reportCount;
        this.saveCount = builder.saveCount;
        this.saveDownloadLimit = builder.saveDownloadLimit;
        this.saveLimit = builder.saveLimit;
        this.shareName = builder.shareName;
        this.updatedAt = builder.updatedAt;
        this.videoPreviewCount = builder.videoPreviewCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShareLinkByAnonymousResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessCount
     */
    public Long getAccessCount() {
        return this.accessCount;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return creatorName
     */
    public String getCreatorName() {
        return this.creatorName;
    }

    /**
     * @return creatorPhone
     */
    public String getCreatorPhone() {
        return this.creatorPhone;
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
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
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
     * @return shareName
     */
    public String getShareName() {
        return this.shareName;
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
        private String avatar; 
        private String creatorId; 
        private String creatorName; 
        private String creatorPhone; 
        private Boolean disableDownload; 
        private Boolean disablePreview; 
        private Boolean disableSave; 
        private Long downloadCount; 
        private Long downloadLimit; 
        private String expiration; 
        private Long previewCount; 
        private Long previewLimit; 
        private Long reportCount; 
        private Long saveCount; 
        private Long saveDownloadLimit; 
        private Long saveLimit; 
        private String shareName; 
        private String updatedAt; 
        private Long videoPreviewCount; 

        /**
         * The number of times that the shared files are visited.
         */
        public Builder accessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }

        /**
         * The profile picture of the user who created the share link.
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * The ID of the user who created the share link.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * The name of the user who created the share link. The value is masked.
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * The mobile number of the user who created the share link. The value is masked.
         */
        public Builder creatorPhone(String creatorPhone) {
            this.creatorPhone = creatorPhone;
            return this;
        }

        /**
         * Indicates whether the downloads of the shared files are prohibited.
         */
        public Builder disableDownload(Boolean disableDownload) {
            this.disableDownload = disableDownload;
            return this;
        }

        /**
         * Indicates whether the previews of the shared files are prohibited.
         */
        public Builder disablePreview(Boolean disablePreview) {
            this.disablePreview = disablePreview;
            return this;
        }

        /**
         * Indicates whether the saves of the shared files are prohibited.
         */
        public Builder disableSave(Boolean disableSave) {
            this.disableSave = disableSave;
            return this;
        }

        /**
         * The number of times that the shared files are downloaded.
         */
        public Builder downloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }

        /**
         * The maximum number of times that the shared files can be downloaded.
         */
        public Builder downloadLimit(Long downloadLimit) {
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * The time when the share link expires.
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * The number of times that the shared files are previewed.
         */
        public Builder previewCount(Long previewCount) {
            this.previewCount = previewCount;
            return this;
        }

        /**
         * The maximum number of times that the shared files can be previewed.
         */
        public Builder previewLimit(Long previewLimit) {
            this.previewLimit = previewLimit;
            return this;
        }

        /**
         * The number of times that the shared files are reported.
         */
        public Builder reportCount(Long reportCount) {
            this.reportCount = reportCount;
            return this;
        }

        /**
         * The number of times that the shared files are saved.
         */
        public Builder saveCount(Long saveCount) {
            this.saveCount = saveCount;
            return this;
        }

        /**
         * The maximum number of times that the shared files can be saved and downloaded.
         */
        public Builder saveDownloadLimit(Long saveDownloadLimit) {
            this.saveDownloadLimit = saveDownloadLimit;
            return this;
        }

        /**
         * The maximum number of times that the shared files can be saved.
         */
        public Builder saveLimit(Long saveLimit) {
            this.saveLimit = saveLimit;
            return this;
        }

        /**
         * The name of the share link.
         */
        public Builder shareName(String shareName) {
            this.shareName = shareName;
            return this;
        }

        /**
         * The time when the share link was last modified.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * The number of times that the videos are previewed in the shared files.
         */
        public Builder videoPreviewCount(Long videoPreviewCount) {
            this.videoPreviewCount = videoPreviewCount;
            return this;
        }

        public GetShareLinkByAnonymousResponseBody build() {
            return new GetShareLinkByAnonymousResponseBody(this);
        } 

    } 

}
