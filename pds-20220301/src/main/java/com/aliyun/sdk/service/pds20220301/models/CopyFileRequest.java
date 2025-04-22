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
 * {@link CopyFileRequest} extends {@link RequestModel}
 *
 * <p>CopyFileRequest</p>
 */
public class CopyFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_rename")
    private Boolean autoRename;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("to_drive_id")
    private String toDriveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("to_parent_file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toParentFileId;

    private CopyFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.autoRename = builder.autoRename;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.shareId = builder.shareId;
        this.toDriveId = builder.toDriveId;
        this.toParentFileId = builder.toParentFileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyFileRequest create() {
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
     * @return autoRename
     */
    public Boolean getAutoRename() {
        return this.autoRename;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return toDriveId
     */
    public String getToDriveId() {
        return this.toDriveId;
    }

    /**
     * @return toParentFileId
     */
    public String getToParentFileId() {
        return this.toParentFileId;
    }

    public static final class Builder extends Request.Builder<CopyFileRequest, Builder> {
        private String domainId; 
        private Boolean autoRename; 
        private String driveId; 
        private String fileId; 
        private String shareId; 
        private String toDriveId; 
        private String toParentFileId; 

        private Builder() {
            super();
        } 

        private Builder(CopyFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.autoRename = request.autoRename;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.shareId = request.shareId;
            this.toDriveId = request.toDriveId;
            this.toParentFileId = request.toParentFileId;
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
         * <p>Specifies whether to automatically rename the file if the file name already exists in the destination folder. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRename(Boolean autoRename) {
            this.putBodyParameter("auto_rename", autoRename);
            this.autoRename = autoRename;
            return this;
        }

        /**
         * <p>The drive ID.</p>
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
         * <p>The file ID or folder ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4221bf6e6ab43c255edc4463bf3a6f5f5d317406</p>
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The share ID. If you want to manage a file by using a share link, carry the <code>x-share-token</code> header for authentication in the request and specify share_id. In this case, <code>drive_id</code> is invalid. Otherwise, use an <code>AccessKey pair</code> or <code>access token</code> for authentication and specify <code>drive_id</code>. You must specify one of <code>share_id</code> and <code>drive_id</code>.</p>
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
         * <p>The ID of the drive to which you want to copy the file or folder. Default value: the value of drive_id.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder toDriveId(String toDriveId) {
            this.putBodyParameter("to_drive_id", toDriveId);
            this.toDriveId = toDriveId;
            return this;
        }

        /**
         * <p>The ID of the destination parent folder. If you want to copy the file or folder to a root directory, set this parameter to root.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6520943DC261</p>
         */
        public Builder toParentFileId(String toParentFileId) {
            this.putBodyParameter("to_parent_file_id", toParentFileId);
            this.toParentFileId = toParentFileId;
            return this;
        }

        @Override
        public CopyFileRequest build() {
            return new CopyFileRequest(this);
        } 

    } 

}
