// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveFileRequest} extends {@link RequestModel}
 *
 * <p>MoveFileRequest</p>
 */
public class MoveFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("check_name_mode")
    private String checkNameMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("to_parent_file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toParentFileId;

    private MoveFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.checkNameMode = builder.checkNameMode;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.toParentFileId = builder.toParentFileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveFileRequest create() {
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
     * @return checkNameMode
     */
    public String getCheckNameMode() {
        return this.checkNameMode;
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
     * @return toParentFileId
     */
    public String getToParentFileId() {
        return this.toParentFileId;
    }

    public static final class Builder extends Request.Builder<MoveFileRequest, Builder> {
        private String domainId; 
        private String checkNameMode; 
        private String driveId; 
        private String fileId; 
        private String toParentFileId; 

        private Builder() {
            super();
        } 

        private Builder(MoveFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.checkNameMode = request.checkNameMode;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
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
         * The processing method that is used if the file that you want to move has the same name as an existing file in the destination directory. Valid values:
         * <p>
         * 
         * ignore: allows you to move the file by using the same name as an existing file in the destination directory.
         * 
         * auto_rename: automatically renames the file that has the same name exists in the destination directory. By default, the current point in time is added to the end of the file name. Example: xxx\_20060102\_150405.
         * 
         * refuse: does not move the file that you want to move but returns the information about the file that has the same name in the destination directory.
         * 
         * Default value: ignore.
         */
        public Builder checkNameMode(String checkNameMode) {
            this.putBodyParameter("check_name_mode", checkNameMode);
            this.checkNameMode = checkNameMode;
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
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The ID of the destination parent directory to which you want to move a file or folder. If you want to move a file or folder to the root directory, set this parameter to root.
         */
        public Builder toParentFileId(String toParentFileId) {
            this.putBodyParameter("to_parent_file_id", toParentFileId);
            this.toParentFileId = toParentFileId;
            return this;
        }

        @Override
        public MoveFileRequest build() {
            return new MoveFileRequest(this);
        } 

    } 

}
