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
 * {@link CreateShareLinkRequest} extends {@link RequestModel}
 *
 * <p>CreateShareLinkRequest</p>
 */
public class CreateShareLinkRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("creatable")
    private Boolean creatable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("creatable_file_id_list")
    private java.util.List<String> creatableFileIdList;

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
    @com.aliyun.core.annotation.NameInMap("download_limit")
    private Long downloadLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expiration")
    private String expiration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id_list")
    private java.util.List<String> fileIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("office_editable")
    private Boolean officeEditable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("preview_limit")
    private Long previewLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("require_login")
    private Boolean requireLogin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("save_limit")
    private Long saveLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_all_files")
    private Boolean shareAllFiles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_name")
    private String shareName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_pwd")
    private String sharePwd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    private CreateShareLinkRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.creatable = builder.creatable;
        this.creatableFileIdList = builder.creatableFileIdList;
        this.description = builder.description;
        this.disableDownload = builder.disableDownload;
        this.disablePreview = builder.disablePreview;
        this.disableSave = builder.disableSave;
        this.downloadLimit = builder.downloadLimit;
        this.driveId = builder.driveId;
        this.expiration = builder.expiration;
        this.fileIdList = builder.fileIdList;
        this.officeEditable = builder.officeEditable;
        this.previewLimit = builder.previewLimit;
        this.requireLogin = builder.requireLogin;
        this.saveLimit = builder.saveLimit;
        this.shareAllFiles = builder.shareAllFiles;
        this.shareName = builder.shareName;
        this.sharePwd = builder.sharePwd;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateShareLinkRequest create() {
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
     * @return creatable
     */
    public Boolean getCreatable() {
        return this.creatable;
    }

    /**
     * @return creatableFileIdList
     */
    public java.util.List<String> getCreatableFileIdList() {
        return this.creatableFileIdList;
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
     * @return fileIdList
     */
    public java.util.List<String> getFileIdList() {
        return this.fileIdList;
    }

    /**
     * @return officeEditable
     */
    public Boolean getOfficeEditable() {
        return this.officeEditable;
    }

    /**
     * @return previewLimit
     */
    public Long getPreviewLimit() {
        return this.previewLimit;
    }

    /**
     * @return requireLogin
     */
    public Boolean getRequireLogin() {
        return this.requireLogin;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateShareLinkRequest, Builder> {
        private String domainId; 
        private Boolean creatable; 
        private java.util.List<String> creatableFileIdList; 
        private String description; 
        private Boolean disableDownload; 
        private Boolean disablePreview; 
        private Boolean disableSave; 
        private Long downloadLimit; 
        private String driveId; 
        private String expiration; 
        private java.util.List<String> fileIdList; 
        private Boolean officeEditable; 
        private Long previewLimit; 
        private Boolean requireLogin; 
        private Long saveLimit; 
        private Boolean shareAllFiles; 
        private String shareName; 
        private String sharePwd; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateShareLinkRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.creatable = request.creatable;
            this.creatableFileIdList = request.creatableFileIdList;
            this.description = request.description;
            this.disableDownload = request.disableDownload;
            this.disablePreview = request.disablePreview;
            this.disableSave = request.disableSave;
            this.downloadLimit = request.downloadLimit;
            this.driveId = request.driveId;
            this.expiration = request.expiration;
            this.fileIdList = request.fileIdList;
            this.officeEditable = request.officeEditable;
            this.previewLimit = request.previewLimit;
            this.requireLogin = request.requireLogin;
            this.saveLimit = request.saveLimit;
            this.shareAllFiles = request.shareAllFiles;
            this.shareName = request.shareName;
            this.sharePwd = request.sharePwd;
            this.userId = request.userId;
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
         * creatable.
         */
        public Builder creatable(Boolean creatable) {
            this.putBodyParameter("creatable", creatable);
            this.creatable = creatable;
            return this;
        }

        /**
         * creatable_file_id_list.
         */
        public Builder creatableFileIdList(java.util.List<String> creatableFileIdList) {
            this.putBodyParameter("creatable_file_id_list", creatableFileIdList);
            this.creatableFileIdList = creatableFileIdList;
            return this;
        }

        /**
         * <p>The description of the share. The description must be 0 to 1,024 characters in length.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to disable the download feature.</p>
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
         * <p>Specifies whether to disable the preview feature.</p>
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
         * <p>Specifies whether to disable the dump feature.</p>
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
         * <p>The limit on the number of times that the shared files can be downloaded. The value of this parameter must be equal to or greater than 0. A value of 0 indicates no limit.</p>
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
         * <p>The drive ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>The time when the share URL expires. The value of this parameter follows the RFC 3339 standard. Example: &quot;2020-06-28T11:33:00.000+08:00&quot;. If expiration is set to &quot;&quot;, the share URL never expires.</p>
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
         * <p>The IDs of the files to share in the parent path. The number of files in the parent path ranges from 1 to 100. If share_all_files is set to true, this parameter does not take effect. Otherwise, you must specify this parameter.``</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;520b217f13adf4fc24f2191991b1664ce045b393&quot;]</p>
         */
        public Builder fileIdList(java.util.List<String> fileIdList) {
            this.putBodyParameter("file_id_list", fileIdList);
            this.fileIdList = fileIdList;
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
         * <p>The limit on the number of times that the shared files can be previewed. The value of this parameter must be equal to or greater than 0. A value of 0 indicates no limit.</p>
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
         * require_login.
         */
        public Builder requireLogin(Boolean requireLogin) {
            this.putBodyParameter("require_login", requireLogin);
            this.requireLogin = requireLogin;
            return this;
        }

        /**
         * <p>The limit on the number of times that the shared files can be dumped. The value of this parameter must be equal to or greater than 0. A value of 0 indicates no limit.</p>
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
         * <p>Specifies whether to share all files in the drive.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder shareAllFiles(Boolean shareAllFiles) {
            this.putBodyParameter("share_all_files", shareAllFiles);
            this.shareAllFiles = shareAllFiles;
            return this;
        }

        /**
         * <p>The name of the share. If you leave this parameter empty, the file name that corresponds to the first ID in the file ID list is used. The name must be 0 to 128 characters in length.</p>
         */
        public Builder shareName(String shareName) {
            this.putBodyParameter("share_name", shareName);
            this.shareName = shareName;
            return this;
        }

        /**
         * <p>The access code. An access code must be 0 to 64 bytes in length. If you do not specify this parameter or leave this parameter empty, the files can be accessed without an access code. In this case, you do not need to specify the share_pwd parameter when you call an operation to query the share URL. The access code can contain only visible ASCII characters.</p>
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
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>u123</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateShareLinkRequest build() {
            return new CreateShareLinkRequest(this);
        } 

    } 

}
