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
 * {@link CreateCdsFileShareLinkRequest} extends {@link RequestModel}
 *
 * <p>CreateCdsFileShareLinkRequest</p>
 */
public class CreateCdsFileShareLinkRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DownloadLimit")
    @com.aliyun.core.annotation.Validation(maximum = 99999)
    private Long downloadLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expiration")
    private String expiration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileIds")
    private java.util.List<String> fileIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviewLimit")
    @com.aliyun.core.annotation.Validation(maximum = 99999)
    private Long previewLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaveLimit")
    @com.aliyun.core.annotation.Validation(maximum = 99999)
    private Long saveLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String shareName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SharePwd")
    @com.aliyun.core.annotation.Validation(maxLength = 8)
    private String sharePwd;

    private CreateCdsFileShareLinkRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.description = builder.description;
        this.disableDownload = builder.disableDownload;
        this.disablePreview = builder.disablePreview;
        this.disableSave = builder.disableSave;
        this.downloadLimit = builder.downloadLimit;
        this.endUserId = builder.endUserId;
        this.expiration = builder.expiration;
        this.fileIds = builder.fileIds;
        this.groupId = builder.groupId;
        this.previewLimit = builder.previewLimit;
        this.saveLimit = builder.saveLimit;
        this.shareName = builder.shareName;
        this.sharePwd = builder.sharePwd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdsFileShareLinkRequest create() {
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
     * @return downloadLimit
     */
    public Long getDownloadLimit() {
        return this.downloadLimit;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
    }

    /**
     * @return fileIds
     */
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return previewLimit
     */
    public Long getPreviewLimit() {
        return this.previewLimit;
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
     * @return sharePwd
     */
    public String getSharePwd() {
        return this.sharePwd;
    }

    public static final class Builder extends Request.Builder<CreateCdsFileShareLinkRequest, Builder> {
        private String cdsId; 
        private String description; 
        private Boolean disableDownload; 
        private Boolean disablePreview; 
        private Boolean disableSave; 
        private Long downloadLimit; 
        private String endUserId; 
        private String expiration; 
        private java.util.List<String> fileIds; 
        private String groupId; 
        private Long previewLimit; 
        private Long saveLimit; 
        private String shareName; 
        private String sharePwd; 

        private Builder() {
            super();
        } 

        private Builder(CreateCdsFileShareLinkRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.description = request.description;
            this.disableDownload = request.disableDownload;
            this.disablePreview = request.disablePreview;
            this.disableSave = request.disableSave;
            this.downloadLimit = request.downloadLimit;
            this.endUserId = request.endUserId;
            this.expiration = request.expiration;
            this.fileIds = request.fileIds;
            this.groupId = request.groupId;
            this.previewLimit = request.previewLimit;
            this.saveLimit = request.saveLimit;
            this.shareName = request.shareName;
            this.sharePwd = request.sharePwd;
        } 

        /**
         * <p>The enterprise cloud disk ID.</p>
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
         * <p>The share description. Length range: 0 to 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>SharedFile</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to disable downloading of files in the share. Valid values:</p>
         * <ul>
         * <li>true: Downloading is disabled.</li>
         * <li>false: Downloading is enabled.</li>
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
         * <p>Specifies whether to disable previewing of files in the share. Valid values:</p>
         * <ul>
         * <li>true: Preview is disabled.</li>
         * <li>false: Preview is enabled.</li>
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
         * <p>Specifies whether to disable saving of files in the share. Valid values:</p>
         * <ul>
         * <li>true: Saving is disabled.</li>
         * <li>false: Saving is enabled.</li>
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
         * <p>The maximum number of times the shared files can be downloaded. The value is an integer. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder downloadLimit(Long downloadLimit) {
            this.putQueryParameter("DownloadLimit", downloadLimit);
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * <p>The ID of the user who uses the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The expiration time in RFC 3339 format. If this parameter is left empty, the share is permanently valid.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-28T11:33:00.000+08:00</p>
         */
        public Builder expiration(String expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * <p>The list of file IDs.</p>
         */
        public Builder fileIds(java.util.List<String> fileIds) {
            this.putQueryParameter("FileIds", fileIds);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * <p>The team space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-i1ruuudp92qpj****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The maximum number of times the shared files can be previewed. The value is an integer. A value of 0 indicates no limit.</p>
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
         * <p>The maximum number of times the shared files can be saved. The value is an integer. A value of 0 indicates no limit.</p>
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
         * <p>The share name. If this parameter is not set, the file name corresponding to the first ID in <code>file_id_list</code> is used by default. Length range: 0 to 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>view.txt</p>
         */
        public Builder shareName(String shareName) {
            this.putQueryParameter("ShareName", shareName);
            this.shareName = shareName;
            return this;
        }

        /**
         * <p>The extraction code. Length range: 0 to 64 bytes. If this parameter is not set or is set to empty, no extraction code is required, and you do not need to specify the extraction code parameter when obtaining the share token. Only printable ASCII characters are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder sharePwd(String sharePwd) {
            this.putQueryParameter("SharePwd", sharePwd);
            this.sharePwd = sharePwd;
            return this;
        }

        @Override
        public CreateCdsFileShareLinkRequest build() {
            return new CreateCdsFileShareLinkRequest(this);
        } 

    } 

}
