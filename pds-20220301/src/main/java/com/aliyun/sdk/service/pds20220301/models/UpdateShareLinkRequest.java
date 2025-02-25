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
 * {@link UpdateShareLinkRequest} extends {@link RequestModel}
 *
 * <p>UpdateShareLinkRequest</p>
 */
public class UpdateShareLinkRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disable_download")
    private Boolean disableDownload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disable_preview")
    private Boolean disablePreview;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disable_save")
    private Boolean disableSave;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("download_count")
    private Long downloadCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("download_limit")
    private Long downloadLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expiration")
    private String expiration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("office_editable")
    private Boolean officeEditable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("preview_count")
    private Long previewCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("preview_limit")
    private Long previewLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("report_count")
    private Long reportCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("save_count")
    private Long saveCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("save_limit")
    private Long saveLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_name")
    private String shareName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_pwd")
    private String sharePwd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("video_preview_count")
    private Long videoPreviewCount;

    private UpdateShareLinkRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.description = builder.description;
        this.disableDownload = builder.disableDownload;
        this.disablePreview = builder.disablePreview;
        this.disableSave = builder.disableSave;
        this.downloadCount = builder.downloadCount;
        this.downloadLimit = builder.downloadLimit;
        this.expiration = builder.expiration;
        this.officeEditable = builder.officeEditable;
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

    public static UpdateShareLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
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
     * @return officeEditable
     */
    public Boolean getOfficeEditable() {
        return this.officeEditable;
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

    public static final class Builder extends Request.Builder<UpdateShareLinkRequest, Builder> {
        private String domainId; 
        private String description; 
        private Boolean disableDownload; 
        private Boolean disablePreview; 
        private Boolean disableSave; 
        private Long downloadCount; 
        private Long downloadLimit; 
        private String expiration; 
        private Boolean officeEditable; 
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

        private Builder(UpdateShareLinkRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.description = request.description;
            this.disableDownload = request.disableDownload;
            this.disablePreview = request.disablePreview;
            this.disableSave = request.disableSave;
            this.downloadCount = request.downloadCount;
            this.downloadLimit = request.downloadLimit;
            this.expiration = request.expiration;
            this.officeEditable = request.officeEditable;
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
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The description of the share link. The description can be up to 1,024 characters in length.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to prohibit the downloads of the shared files.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableDownload(Boolean disableDownload) {
            this.putBodyParameter("disable_download", disableDownload);
            this.disableDownload = disableDownload;
            return this;
        }

        /**
         * <p>Specifies whether to prohibit the previews of the shared files.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disablePreview(Boolean disablePreview) {
            this.putBodyParameter("disable_preview", disablePreview);
            this.disablePreview = disablePreview;
            return this;
        }

        /**
         * <p>Specifies whether to prohibit the saves of the shared files.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableSave(Boolean disableSave) {
            this.putBodyParameter("disable_save", disableSave);
            this.disableSave = disableSave;
            return this;
        }

        /**
         * <p>The number of times that the shared files are downloaded. The value must be greater than or equal to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder downloadCount(Long downloadCount) {
            this.putBodyParameter("download_count", downloadCount);
            this.downloadCount = downloadCount;
            return this;
        }

        /**
         * <p>The maximum number of times that the shared files can be downloaded. The value must be greater than or equal to 0. A value of 0 specifies that the number is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder downloadLimit(Long downloadLimit) {
            this.putBodyParameter("download_limit", downloadLimit);
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * <p>The time when the share link expires. The time follows the RFC 3339 standard. Example: 2020-06-28T11:33:00.000+08:00. If you leave this parameter empty, the share link never expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-28T11:33:00.000+08:00</p>
         */
        public Builder expiration(String expiration) {
            this.putBodyParameter("expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * office_editable.
         */
        public Builder officeEditable(Boolean officeEditable) {
            this.putBodyParameter("office_editable", officeEditable);
            this.officeEditable = officeEditable;
            return this;
        }

        /**
         * <p>The number of times that the shared files are previewed. The value must be greater than or equal to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder previewCount(Long previewCount) {
            this.putBodyParameter("preview_count", previewCount);
            this.previewCount = previewCount;
            return this;
        }

        /**
         * <p>The maximum number of times that the shared files can be previewed. The value must be greater than or equal to 0. A value of 0 specifies that the number is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder previewLimit(Long previewLimit) {
            this.putBodyParameter("preview_limit", previewLimit);
            this.previewLimit = previewLimit;
            return this;
        }

        /**
         * <p>The number of times that the shared files are reported. The value must be greater than or equal to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reportCount(Long reportCount) {
            this.putBodyParameter("report_count", reportCount);
            this.reportCount = reportCount;
            return this;
        }

        /**
         * <p>The number of times that the shared files are saved. The value must be greater than or equal to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder saveCount(Long saveCount) {
            this.putBodyParameter("save_count", saveCount);
            this.saveCount = saveCount;
            return this;
        }

        /**
         * <p>The maximum number of times that the shared files can be saved. The value must be greater than or equal to 0. A value of 0 specifies that the number is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder saveLimit(Long saveLimit) {
            this.putBodyParameter("save_limit", saveLimit);
            this.saveLimit = saveLimit;
            return this;
        }

        /**
         * <p>The share ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7JQX1FswpQ8</p>
         */
        public Builder shareId(String shareId) {
            this.putBodyParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * <p>The name of the share link. By default, the name of the first file is used. The name can be up to 128 characters in length.</p>
         */
        public Builder shareName(String shareName) {
            this.putBodyParameter("share_name", shareName);
            this.shareName = shareName;
            return this;
        }

        /**
         * <p>The access code. The access code can be up to 64 characters in length. A value of 0 specifies an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>abcF123x</p>
         */
        public Builder sharePwd(String sharePwd) {
            this.putBodyParameter("share_pwd", sharePwd);
            this.sharePwd = sharePwd;
            return this;
        }

        /**
         * <p>The state of the share link. Valid values:</p>
         * <ul>
         * <li>disabled: The share link is canceled.</li>
         * <li>enabled: The share link is effective.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The number of times that the videos are previewed in the shared files. The value must be greater than or equal to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder videoPreviewCount(Long videoPreviewCount) {
            this.putBodyParameter("video_preview_count", videoPreviewCount);
            this.videoPreviewCount = videoPreviewCount;
            return this;
        }

        @Override
        public UpdateShareLinkRequest build() {
            return new UpdateShareLinkRequest(this);
        } 

    } 

}
