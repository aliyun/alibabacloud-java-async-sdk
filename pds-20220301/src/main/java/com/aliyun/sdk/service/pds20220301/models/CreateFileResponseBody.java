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
 * {@link CreateFileResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileResponseBody</p>
 */
public class CreateFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("exist")
    private Boolean exist;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("file_name")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("parent_file_id")
    private String parentFileId;

    @com.aliyun.core.annotation.NameInMap("part_info_list")
    private java.util.List<UploadPartInfo> partInfoList;

    @com.aliyun.core.annotation.NameInMap("rapid_upload")
    private Boolean rapidUpload;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("upload_id")
    private String uploadId;

    private CreateFileResponseBody(Builder builder) {
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.exist = builder.exist;
        this.fileId = builder.fileId;
        this.fileName = builder.fileName;
        this.parentFileId = builder.parentFileId;
        this.partInfoList = builder.partInfoList;
        this.rapidUpload = builder.rapidUpload;
        this.status = builder.status;
        this.type = builder.type;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileResponseBody create() {
        return builder().build();
    }

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
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return exist
     */
    public Boolean getExist() {
        return this.exist;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return parentFileId
     */
    public String getParentFileId() {
        return this.parentFileId;
    }

    /**
     * @return partInfoList
     */
    public java.util.List<UploadPartInfo> getPartInfoList() {
        return this.partInfoList;
    }

    /**
     * @return rapidUpload
     */
    public Boolean getRapidUpload() {
        return this.rapidUpload;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder {
        private String domainId; 
        private String driveId; 
        private Boolean exist; 
        private String fileId; 
        private String fileName; 
        private String parentFileId; 
        private java.util.List<UploadPartInfo> partInfoList; 
        private Boolean rapidUpload; 
        private String status; 
        private String type; 
        private String uploadId; 

        private Builder() {
        } 

        private Builder(CreateFileResponseBody model) {
            this.domainId = model.domainId;
            this.driveId = model.driveId;
            this.exist = model.exist;
            this.fileId = model.fileId;
            this.fileName = model.fileName;
            this.parentFileId = model.parentFileId;
            this.partInfoList = model.partInfoList;
            this.rapidUpload = model.rapidUpload;
            this.status = model.status;
            this.type = model.type;
            this.uploadId = model.uploadId;
        } 

        /**
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bj1</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>Indicates whether the file exists.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder exist(Boolean exist) {
            this.exist = exist;
            return this;
        }

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fileid1</p>
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>a.txt</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The ID of the parent directory.</p>
         * 
         * <strong>example:</strong>
         * <p>fileid5</p>
         */
        public Builder parentFileId(String parentFileId) {
            this.parentFileId = parentFileId;
            return this;
        }

        /**
         * <p>The information about the file parts.</p>
         */
        public Builder partInfoList(java.util.List<UploadPartInfo> partInfoList) {
            this.partInfoList = partInfoList;
            return this;
        }

        /**
         * <p>Indicates whether the file is instantly uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder rapidUpload(Boolean rapidUpload) {
            this.rapidUpload = rapidUpload;
            return this;
        }

        /**
         * <p>The state of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>uploading</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The ID of the upload task.</p>
         * 
         * <strong>example:</strong>
         * <p>uploadid1</p>
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        public CreateFileResponseBody build() {
            return new CreateFileResponseBody(this);
        } 

    } 

}
