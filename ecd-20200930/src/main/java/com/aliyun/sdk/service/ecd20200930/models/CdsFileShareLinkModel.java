// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CdsFileShareLinkModel} extends {@link TeaModel}
 *
 * <p>CdsFileShareLinkModel</p>
 */
public class CdsFileShareLinkModel extends TeaModel {
    @NameInMap("AccessCount")
    private Long accessCount;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Creator")
    private String creator;

    @NameInMap("Description")
    private String description;

    @NameInMap("DisableDownload")
    private Boolean disableDownload;

    @NameInMap("DisablePreview")
    private Boolean disablePreview;

    @NameInMap("DisableSave")
    private Boolean disableSave;

    @NameInMap("DownloadCount")
    private Long downloadCount;

    @NameInMap("DownloadLimit")
    private Long downloadLimit;

    @NameInMap("DriveId")
    private String driveId;

    @NameInMap("Expiration")
    private String expiration;

    @NameInMap("Expired")
    private Boolean expired;

    @NameInMap("FileIds")
    private String fileIds;

    @NameInMap("ModifiyTime")
    private String modifiyTime;

    @NameInMap("PreviewCount")
    private Long previewCount;

    @NameInMap("PreviewLimit")
    private Long previewLimit;

    @NameInMap("ReportCount")
    private Long reportCount;

    @NameInMap("SaveCount")
    private Long saveCount;

    @NameInMap("SaveLimit")
    private Long saveLimit;

    @NameInMap("ShareId")
    private String shareId;

    @NameInMap("ShareLink")
    private String shareLink;

    @NameInMap("ShareName")
    private String shareName;

    @NameInMap("SharePwd")
    private String sharePwd;

    @NameInMap("Status")
    private String status;

    @NameInMap("VideoPreviewCount")
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
         * 访问次数
         */
        public Builder accessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 创建者
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * 描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 禁止下载分享中的文件
         */
        public Builder disableDownload(Boolean disableDownload) {
            this.disableDownload = disableDownload;
            return this;
        }

        /**
         * 禁止预览分享中的文件
         */
        public Builder disablePreview(Boolean disablePreview) {
            this.disablePreview = disablePreview;
            return this;
        }

        /**
         * 禁止转存分享中的文件
         */
        public Builder disableSave(Boolean disableSave) {
            this.disableSave = disableSave;
            return this;
        }

        /**
         * 下载次数
         */
        public Builder downloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }

        /**
         * 分享下载次数限制
         */
        public Builder downloadLimit(Long downloadLimit) {
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * 空间id
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * 失效时间点。 RFC3339格式，比如："2020-06-28T11:33:00.000+08:00"。 永久有效：""
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * 是否过期
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
            return this;
        }

        /**
         * 分享父路径文件id列表
         */
        public Builder fileIds(String fileIds) {
            this.fileIds = fileIds;
            return this;
        }

        /**
         * 修改时间
         */
        public Builder modifiyTime(String modifiyTime) {
            this.modifiyTime = modifiyTime;
            return this;
        }

        /**
         * 预览次数
         */
        public Builder previewCount(Long previewCount) {
            this.previewCount = previewCount;
            return this;
        }

        /**
         * 分享预览次数限制
         */
        public Builder previewLimit(Long previewLimit) {
            this.previewLimit = previewLimit;
            return this;
        }

        /**
         * 被举报次数
         */
        public Builder reportCount(Long reportCount) {
            this.reportCount = reportCount;
            return this;
        }

        /**
         * 转存次数
         */
        public Builder saveCount(Long saveCount) {
            this.saveCount = saveCount;
            return this;
        }

        /**
         * 分享转存次数限制
         */
        public Builder saveLimit(Long saveLimit) {
            this.saveLimit = saveLimit;
            return this;
        }

        /**
         * 分享id
         */
        public Builder shareId(String shareId) {
            this.shareId = shareId;
            return this;
        }

        /**
         * 分享链接
         */
        public Builder shareLink(String shareLink) {
            this.shareLink = shareLink;
            return this;
        }

        /**
         * 分享名，默认使用第一个文件名
         */
        public Builder shareName(String shareName) {
            this.shareName = shareName;
            return this;
        }

        /**
         * 提取码，0-64个字符。长度0表示没有提取码。
         */
        public Builder sharePwd(String sharePwd) {
            this.sharePwd = sharePwd;
            return this;
        }

        /**
         * 状态。 枚举值如下：  forbidden（被禁用） forbidden_disabled（被禁用后取消） disabled（已取消） enabled（有效）
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 音视频播放次数
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
