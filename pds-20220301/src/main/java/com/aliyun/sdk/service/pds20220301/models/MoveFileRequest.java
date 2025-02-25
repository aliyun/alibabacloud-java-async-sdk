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
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The processing method that is used if the file that you want to move has the same name as an existing file in the destination directory. Valid values:</p>
         * <p>ignore: allows you to move the file by using the same name as an existing file in the destination directory.</p>
         * <p>auto_rename: automatically renames the file that has the same name exists in the destination directory. By default, the current point in time is added to the end of the file name. Example: xxx_20060102_150405.</p>
         * <p>refuse: does not move the file that you want to move but returns the information about the file that has the same name in the destination directory.</p>
         * <p>Default value: ignore.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        public Builder checkNameMode(String checkNameMode) {
            this.putBodyParameter("check_name_mode", checkNameMode);
            this.checkNameMode = checkNameMode;
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
         * <p>The file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9520943DC264</p>
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The ID of the destination parent directory to which you want to move a file or folder. If you want to move a file or folder to the root directory, set this parameter to root.</p>
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
        public MoveFileRequest build() {
            return new MoveFileRequest(this);
        } 

    } 

}
