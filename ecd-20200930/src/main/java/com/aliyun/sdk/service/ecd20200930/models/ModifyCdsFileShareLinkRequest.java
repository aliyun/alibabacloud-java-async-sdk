// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCdsFileShareLinkRequest} extends {@link RequestModel}
 *
 * <p>ModifyCdsFileShareLinkRequest</p>
 */
public class ModifyCdsFileShareLinkRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 1024)
    private String description;

    @Query
    @NameInMap("DisableDownload")
    private Boolean disableDownload;

    @Query
    @NameInMap("DisablePreview")
    private Boolean disablePreview;

    @Query
    @NameInMap("DisableSave")
    private Boolean disableSave;

    @Query
    @NameInMap("DownloadCount")
    private Long downloadCount;

    @Query
    @NameInMap("DownloadLimit")
    private Long downloadLimit;

    @Query
    @NameInMap("Expiration")
    private String expiration;

    @Query
    @NameInMap("PreviewCount")
    private Long previewCount;

    @Query
    @NameInMap("PreviewLimit")
    private Long previewLimit;

    @Query
    @NameInMap("ReportCount")
    private Long reportCount;

    @Query
    @NameInMap("SaveCount")
    private Long saveCount;

    @Query
    @NameInMap("SaveLimit")
    private Long saveLimit;

    @Query
    @NameInMap("ShareId")
    @Validation(required = true)
    private String shareId;

    @Query
    @NameInMap("ShareName")
    @Validation(maxLength = 128)
    private String shareName;

    @Query
    @NameInMap("SharePwd")
    @Validation(maxLength = 8, minLength = 6)
    private String sharePwd;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("VideoPreviewCount")
    private Long videoPreviewCount;

    private ModifyCdsFileShareLinkRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.description = builder.description;
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
        this.saveLimit = builder.saveLimit;
        this.shareId = builder.shareId;
        this.shareName = builder.shareName;
        this.sharePwd = builder.sharePwd;
        this.status = builder.status;
        this.videoPreviewCount = builder.videoPreviewCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCdsFileShareLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
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

    public static final class Builder extends Request.Builder<ModifyCdsFileShareLinkRequest, Builder> {
        private String cdsId; 
        private String description; 
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
        private Long saveLimit; 
        private String shareId; 
        private String shareName; 
        private String sharePwd; 
        private String status; 
        private Long videoPreviewCount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCdsFileShareLinkRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.description = request.description;
            this.disableDownload = request.disableDownload;
            this.disablePreview = request.disablePreview;
            this.disableSave = request.disableSave;
            this.downloadCount = request.downloadCount;
            this.downloadLimit = request.downloadLimit;
            this.expiration = request.expiration;
            this.previewCount = request.previewCount;
            this.previewLimit = request.previewLimit;
            this.reportCount = request.reportCount;
            this.saveCount = request.saveCount;
            this.saveLimit = request.saveLimit;
            this.shareId = request.shareId;
            this.shareName = request.shareName;
            this.sharePwd = request.sharePwd;
            this.status = request.status;
            this.videoPreviewCount = request.videoPreviewCount;
        } 

        /**
         * CdsId.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DisableDownload.
         */
        public Builder disableDownload(Boolean disableDownload) {
            this.putQueryParameter("DisableDownload", disableDownload);
            this.disableDownload = disableDownload;
            return this;
        }

        /**
         * DisablePreview.
         */
        public Builder disablePreview(Boolean disablePreview) {
            this.putQueryParameter("DisablePreview", disablePreview);
            this.disablePreview = disablePreview;
            return this;
        }

        /**
         * DisableSave.
         */
        public Builder disableSave(Boolean disableSave) {
            this.putQueryParameter("DisableSave", disableSave);
            this.disableSave = disableSave;
            return this;
        }

        /**
         * DownloadCount.
         */
        public Builder downloadCount(Long downloadCount) {
            this.putQueryParameter("DownloadCount", downloadCount);
            this.downloadCount = downloadCount;
            return this;
        }

        /**
         * DownloadLimit.
         */
        public Builder downloadLimit(Long downloadLimit) {
            this.putQueryParameter("DownloadLimit", downloadLimit);
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * Expiration.
         */
        public Builder expiration(String expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * PreviewCount.
         */
        public Builder previewCount(Long previewCount) {
            this.putQueryParameter("PreviewCount", previewCount);
            this.previewCount = previewCount;
            return this;
        }

        /**
         * PreviewLimit.
         */
        public Builder previewLimit(Long previewLimit) {
            this.putQueryParameter("PreviewLimit", previewLimit);
            this.previewLimit = previewLimit;
            return this;
        }

        /**
         * ReportCount.
         */
        public Builder reportCount(Long reportCount) {
            this.putQueryParameter("ReportCount", reportCount);
            this.reportCount = reportCount;
            return this;
        }

        /**
         * SaveCount.
         */
        public Builder saveCount(Long saveCount) {
            this.putQueryParameter("SaveCount", saveCount);
            this.saveCount = saveCount;
            return this;
        }

        /**
         * SaveLimit.
         */
        public Builder saveLimit(Long saveLimit) {
            this.putQueryParameter("SaveLimit", saveLimit);
            this.saveLimit = saveLimit;
            return this;
        }

        /**
         * ShareId.
         */
        public Builder shareId(String shareId) {
            this.putQueryParameter("ShareId", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * ShareName.
         */
        public Builder shareName(String shareName) {
            this.putQueryParameter("ShareName", shareName);
            this.shareName = shareName;
            return this;
        }

        /**
         * SharePwd.
         */
        public Builder sharePwd(String sharePwd) {
            this.putQueryParameter("SharePwd", sharePwd);
            this.sharePwd = sharePwd;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * VideoPreviewCount.
         */
        public Builder videoPreviewCount(Long videoPreviewCount) {
            this.putQueryParameter("VideoPreviewCount", videoPreviewCount);
            this.videoPreviewCount = videoPreviewCount;
            return this;
        }

        @Override
        public ModifyCdsFileShareLinkRequest build() {
            return new ModifyCdsFileShareLinkRequest(this);
        } 

    } 

}
