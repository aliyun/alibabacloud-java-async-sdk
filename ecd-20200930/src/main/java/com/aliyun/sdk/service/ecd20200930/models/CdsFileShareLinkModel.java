// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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

        private Builder() {
        } 

        private Builder(CdsFileShareLinkModel model) {
            this.accessCount = model.accessCount;
            this.createTime = model.createTime;
            this.creator = model.creator;
            this.description = model.description;
            this.disableDownload = model.disableDownload;
            this.disablePreview = model.disablePreview;
            this.disableSave = model.disableSave;
            this.downloadCount = model.downloadCount;
            this.downloadLimit = model.downloadLimit;
            this.driveId = model.driveId;
            this.expiration = model.expiration;
            this.expired = model.expired;
            this.fileIds = model.fileIds;
            this.modifiyTime = model.modifiyTime;
            this.previewCount = model.previewCount;
            this.previewLimit = model.previewLimit;
            this.reportCount = model.reportCount;
            this.saveCount = model.saveCount;
            this.saveLimit = model.saveLimit;
            this.shareId = model.shareId;
            this.shareLink = model.shareLink;
            this.shareName = model.shareName;
            this.sharePwd = model.sharePwd;
            this.status = model.status;
            this.videoPreviewCount = model.videoPreviewCount;
        } 

        /**
         * <p>The number of times to access the shared file.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder accessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-04T03:30:36Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The user that creates the file sharing task.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>newDescription</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The shared file is forbidden from being downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableDownload(Boolean disableDownload) {
            this.disableDownload = disableDownload;
            return this;
        }

        /**
         * <p>The shared file is forbidden from being previewed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disablePreview(Boolean disablePreview) {
            this.disablePreview = disablePreview;
            return this;
        }

        /**
         * <p>The shared file is forbidden from being dumped.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableSave(Boolean disableSave) {
            this.disableSave = disableSave;
            return this;
        }

        /**
         * <p>The number of times that the shared file can be downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder downloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }

        /**
         * <p>The maximum number of times that the shared file can be downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder downloadLimit(Long downloadLimit) {
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * <p>The team space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dri-g0877jp3hu1ox****</p>
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>The time when the file sharing link expires.</p>
         * <blockquote>
         * <p> The value must be in the FC3339 format. Example: 2020-06-28T11:33:00.000+08:00. If the parameter is left empty, the file sharing link is permanently valid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-06-28T11:33:00.000+08:00</p>
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * <p>Specifies whether the file sharing link expires.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
            return this;
        }

        /**
         * <p>The file sharing task IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;63886f1fe2014d9a5a3348768dcc27dfc57ee103\&quot;]</p>
         */
        public Builder fileIds(String fileIds) {
            this.fileIds = fileIds;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-04T04:30:36Z</p>
         */
        public Builder modifiyTime(String modifiyTime) {
            this.modifiyTime = modifiyTime;
            return this;
        }

        /**
         * <p>The number of times that the shared file is previewed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder previewCount(Long previewCount) {
            this.previewCount = previewCount;
            return this;
        }

        /**
         * <p>The maximum number of times that the shared file can be previewed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder previewLimit(Long previewLimit) {
            this.previewLimit = previewLimit;
            return this;
        }

        /**
         * <p>The number of times that the shared file is reported due to content violation.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder reportCount(Long reportCount) {
            this.reportCount = reportCount;
            return this;
        }

        /**
         * <p>The number of times that the shared files can be dumped.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder saveCount(Long saveCount) {
            this.saveCount = saveCount;
            return this;
        }

        /**
         * <p>The maximum number of times that the shared file can be saved.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder saveLimit(Long saveLimit) {
            this.saveLimit = saveLimit;
            return this;
        }

        /**
         * <p>The file sharing task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7JQX1Fs****</p>
         */
        public Builder shareId(String shareId) {
            this.shareId = shareId;
            return this;
        }

        /**
         * <p>The file sharing link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://stg109960.apps.aliyunpds.com/disk/s/7uLJanz">https://stg109960.apps.aliyunpds.com/disk/s/7uLJanz</a>****</p>
         */
        public Builder shareLink(String shareLink) {
            this.shareLink = shareLink;
            return this;
        }

        /**
         * <p>The shared file name. By default, the name of the first shared file is used.</p>
         * 
         * <strong>example:</strong>
         * <p>view.txt</p>
         */
        public Builder shareName(String shareName) {
            this.shareName = shareName;
            return this;
        }

        /**
         * <p>The access code. It must contain up to 64 characters in length. 0 characters indicates that there is no access code.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder sharePwd(String sharePwd) {
            this.sharePwd = sharePwd;
            return this;
        }

        /**
         * <p>The status of the file sharing link.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>forbidden_disabled</p>
         * <!-- -->
         * 
         * <p>: The file sharing link is canceled</p>
         * <!-- -->
         * 
         * <p>after it</p>
         * <!-- -->
         * 
         * <p>is not allowed.</p>
         * </li>
         * <li><p>forbidden</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>The file sharing link is not allowed</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>disabled</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>The file sharing link is canceled.</p>
         * <!-- -->
         * </li>
         * <li><p>enabled</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>The file sharing link is valid.</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The number of times that the audio and video file is played.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
