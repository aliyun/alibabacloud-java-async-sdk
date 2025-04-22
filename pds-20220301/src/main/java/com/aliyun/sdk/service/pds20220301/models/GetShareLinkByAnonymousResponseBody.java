// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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

    @com.aliyun.core.annotation.NameInMap("has_pwd")
    private Boolean hasPwd;

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
        this.hasPwd = builder.hasPwd;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return hasPwd
     */
    public Boolean getHasPwd() {
        return this.hasPwd;
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
        private Boolean hasPwd; 
        private Long previewCount; 
        private Long previewLimit; 
        private Long reportCount; 
        private Long saveCount; 
        private Long saveDownloadLimit; 
        private Long saveLimit; 
        private String shareName; 
        private String updatedAt; 
        private Long videoPreviewCount; 

        private Builder() {
        } 

        private Builder(GetShareLinkByAnonymousResponseBody model) {
            this.accessCount = model.accessCount;
            this.avatar = model.avatar;
            this.creatorId = model.creatorId;
            this.creatorName = model.creatorName;
            this.creatorPhone = model.creatorPhone;
            this.disableDownload = model.disableDownload;
            this.disablePreview = model.disablePreview;
            this.disableSave = model.disableSave;
            this.downloadCount = model.downloadCount;
            this.downloadLimit = model.downloadLimit;
            this.expiration = model.expiration;
            this.hasPwd = model.hasPwd;
            this.previewCount = model.previewCount;
            this.previewLimit = model.previewLimit;
            this.reportCount = model.reportCount;
            this.saveCount = model.saveCount;
            this.saveDownloadLimit = model.saveDownloadLimit;
            this.saveLimit = model.saveLimit;
            this.shareName = model.shareName;
            this.updatedAt = model.updatedAt;
            this.videoPreviewCount = model.videoPreviewCount;
        } 

        /**
         * <p>The number of times that the shared files are visited.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder accessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }

        /**
         * <p>The profile picture of the user who created the share link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyunpds.com/a.jpg">https://aliyunpds.com/a.jpg</a></p>
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * <p>The ID of the user who created the share link.</p>
         * 
         * <strong>example:</strong>
         * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The name of the user who created the share link. The value is masked.</p>
         * 
         * <strong>example:</strong>
         * <p>AB***CD</p>
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * <p>The mobile number of the user who created the share link. The value is masked.</p>
         * 
         * <strong>example:</strong>
         * <p>136****00</p>
         */
        public Builder creatorPhone(String creatorPhone) {
            this.creatorPhone = creatorPhone;
            return this;
        }

        /**
         * <p>Indicates whether the downloads of the shared files are prohibited.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableDownload(Boolean disableDownload) {
            this.disableDownload = disableDownload;
            return this;
        }

        /**
         * <p>Indicates whether the previews of the shared files are prohibited.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disablePreview(Boolean disablePreview) {
            this.disablePreview = disablePreview;
            return this;
        }

        /**
         * <p>Indicates whether the saves of the shared files are prohibited.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableSave(Boolean disableSave) {
            this.disableSave = disableSave;
            return this;
        }

        /**
         * <p>The number of times that the shared files are downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder downloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }

        /**
         * <p>The maximum number of times that the shared files can be downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder downloadLimit(Long downloadLimit) {
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * <p>The time when the share link expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-20T06:51:27.292Z</p>
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * has_pwd.
         */
        public Builder hasPwd(Boolean hasPwd) {
            this.hasPwd = hasPwd;
            return this;
        }

        /**
         * <p>The number of times that the shared files are previewed.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder previewCount(Long previewCount) {
            this.previewCount = previewCount;
            return this;
        }

        /**
         * <p>The maximum number of times that the shared files can be previewed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder previewLimit(Long previewLimit) {
            this.previewLimit = previewLimit;
            return this;
        }

        /**
         * <p>The number of times that the shared files are reported.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder reportCount(Long reportCount) {
            this.reportCount = reportCount;
            return this;
        }

        /**
         * <p>The number of times that the shared files are saved.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder saveCount(Long saveCount) {
            this.saveCount = saveCount;
            return this;
        }

        /**
         * <p>The maximum number of times that the shared files can be saved and downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder saveDownloadLimit(Long saveDownloadLimit) {
            this.saveDownloadLimit = saveDownloadLimit;
            return this;
        }

        /**
         * <p>The maximum number of times that the shared files can be saved.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder saveLimit(Long saveLimit) {
            this.saveLimit = saveLimit;
            return this;
        }

        /**
         * <p>The name of the share link.</p>
         */
        public Builder shareName(String shareName) {
            this.shareName = shareName;
            return this;
        }

        /**
         * <p>The time when the share link was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-20T06:51:27.292Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The number of times that the videos are previewed in the shared files.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
