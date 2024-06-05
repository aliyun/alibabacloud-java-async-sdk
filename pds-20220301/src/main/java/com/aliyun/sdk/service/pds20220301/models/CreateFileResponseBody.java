// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < UploadPartInfo > partInfoList;

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
    public java.util.List < UploadPartInfo > getPartInfoList() {
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
        private java.util.List < UploadPartInfo > partInfoList; 
        private Boolean rapidUpload; 
        private String status; 
        private String type; 
        private String uploadId; 

        /**
         * The domain ID.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * The drive ID.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * Indicates whether the file exists.
         */
        public Builder exist(Boolean exist) {
            this.exist = exist;
            return this;
        }

        /**
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * The file name.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * The ID of the parent directory.
         */
        public Builder parentFileId(String parentFileId) {
            this.parentFileId = parentFileId;
            return this;
        }

        /**
         * The information about the file parts.
         */
        public Builder partInfoList(java.util.List < UploadPartInfo > partInfoList) {
            this.partInfoList = partInfoList;
            return this;
        }

        /**
         * Indicates whether the file is instantly uploaded.
         */
        public Builder rapidUpload(Boolean rapidUpload) {
            this.rapidUpload = rapidUpload;
            return this;
        }

        /**
         * The state of the file.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The type of the file.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * The ID of the upload task.
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
