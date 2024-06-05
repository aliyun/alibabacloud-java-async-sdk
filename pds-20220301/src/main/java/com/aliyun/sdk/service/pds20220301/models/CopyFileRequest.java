// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * Specifies whether to automatically rename the file if the file name already exists in the destination folder. Default value: false.
         */
        public Builder autoRename(Boolean autoRename) {
            this.putBodyParameter("auto_rename", autoRename);
            this.autoRename = autoRename;
            return this;
        }

        /**
         * The drive ID.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * The file ID or folder ID.
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The share ID. If you want to manage a file by using a share link, carry the `x-share-token` header for authentication in the request and specify share_id. In this case, `drive_id` is invalid. Otherwise, use an `AccessKey pair` or `access token` for authentication and specify `drive_id`. You must specify one of `share_id` and `drive_id`.
         */
        public Builder shareId(String shareId) {
            this.putBodyParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * The ID of the drive to which you want to copy the file or folder. Default value: the value of drive_id.
         */
        public Builder toDriveId(String toDriveId) {
            this.putBodyParameter("to_drive_id", toDriveId);
            this.toDriveId = toDriveId;
            return this;
        }

        /**
         * The ID of the destination parent folder. If you want to copy the file or folder to a root directory, set this parameter to root.
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
