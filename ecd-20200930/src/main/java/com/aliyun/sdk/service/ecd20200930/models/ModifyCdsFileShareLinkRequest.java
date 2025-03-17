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
 * {@link ModifyCdsFileShareLinkRequest} extends {@link RequestModel}
 *
 * <p>ModifyCdsFileShareLinkRequest</p>
 */
public class ModifyCdsFileShareLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableDownload")
    private Boolean disableDownload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisablePreview")
    private Boolean disablePreview;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableSave")
    private Boolean disableSave;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadCount")
    private Long downloadCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadLimit")
    private Long downloadLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expiration")
    private String expiration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviewCount")
    private Long previewCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviewLimit")
    private Long previewLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportCount")
    private Long reportCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaveCount")
    private Long saveCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaveLimit")
    private Long saveLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String shareName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SharePwd")
    @com.aliyun.core.annotation.Validation(maxLength = 8, minLength = 6)
    private String sharePwd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoPreviewCount")
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
         * <p>The ID of the cloud disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai+cds-135515****</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * <p>The description of the file sharing task. The description must be 0 to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to prohibit the download of the files that are being shared.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableDownload(Boolean disableDownload) {
            this.putQueryParameter("DisableDownload", disableDownload);
            this.disableDownload = disableDownload;
            return this;
        }

        /**
         * <p>Specifies whether to prohibit the preview of the files that are being shared.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disablePreview(Boolean disablePreview) {
            this.putQueryParameter("DisablePreview", disablePreview);
            this.disablePreview = disablePreview;
            return this;
        }

        /**
         * <p>Specifies whether to prohibit the dump of the files that are being shared.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableSave(Boolean disableSave) {
            this.putQueryParameter("DisableSave", disableSave);
            this.disableSave = disableSave;
            return this;
        }

        /**
         * <p>The number of times that the shared files are downloaded. The value of this parameter must be equal to or greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder downloadCount(Long downloadCount) {
            this.putQueryParameter("DownloadCount", downloadCount);
            this.downloadCount = downloadCount;
            return this;
        }

        /**
         * <p>The limit on the number of times that the shared files can be downloaded. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder downloadLimit(Long downloadLimit) {
            this.putQueryParameter("DownloadLimit", downloadLimit);
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * <p>The time when the file sharing link expires. The value of this parameter follows the RFC 3339 standard. Example: &quot;2020-06-28T11:33:00.000+08:00&quot;. If this parameter is set to &quot;&quot;, the file sharing link never expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20T06:30:22.365Z</p>
         */
        public Builder expiration(String expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * <p>The number of times that the shared files are previewed. The value of this parameter must be equal to or greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder previewCount(Long previewCount) {
            this.putQueryParameter("PreviewCount", previewCount);
            this.previewCount = previewCount;
            return this;
        }

        /**
         * <p>The limit on the number of times that the shared files can be previewed. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder previewLimit(Long previewLimit) {
            this.putQueryParameter("PreviewLimit", previewLimit);
            this.previewLimit = previewLimit;
            return this;
        }

        /**
         * <p>The number of times that the shared files are reported. The value of this parameter must be equal to or greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder reportCount(Long reportCount) {
            this.putQueryParameter("ReportCount", reportCount);
            this.reportCount = reportCount;
            return this;
        }

        /**
         * <p>The number of times that the shared files are dumped. The value of this parameter must be equal to or greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder saveCount(Long saveCount) {
            this.putQueryParameter("SaveCount", saveCount);
            this.saveCount = saveCount;
            return this;
        }

        /**
         * <p>The limit on the number of times that the shared files can be dumped. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder saveLimit(Long saveLimit) {
            this.putQueryParameter("SaveLimit", saveLimit);
            this.saveLimit = saveLimit;
            return this;
        }

        /**
         * <p>The ID of the file sharing task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7JQX1Fs****</p>
         */
        public Builder shareId(String shareId) {
            this.putQueryParameter("ShareId", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * <p>The name of the file sharing task. If you do not configure this parameter, the sharing task name is the first ID that is returned in the file_id_list value.</p>
         * <blockquote>
         * <p> The sharing task name must be 0 to 128 characters in length.</p>
         * </blockquote>
         */
        public Builder shareName(String shareName) {
            this.putQueryParameter("ShareName", shareName);
            this.shareName = shareName;
            return this;
        }

        /**
         * <p>The length of the access code. Valid values: 6 to 8. Unit: bytes. If you leave this parameter empty or set it to null, no access code is required. If you use a token to share files, you do not need to configure this parameter. The access code can contain only visible ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder sharePwd(String sharePwd) {
            this.putQueryParameter("SharePwd", sharePwd);
            this.sharePwd = sharePwd;
            return this;
        }

        /**
         * <p>The sharing status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>disabled: The sharing task is canceled.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>enabled: The sharing task is valid.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The number of times that the videos are previewed in the shared files. The value of this parameter must be equal to or greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
