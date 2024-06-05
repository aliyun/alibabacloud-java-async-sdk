// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetUploadUrlResponseBody</p>
 */
public class GetUploadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("create_at")
    private String createAt;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("part_info_list")
    private java.util.List < UploadPartInfo > partInfoList;

    @com.aliyun.core.annotation.NameInMap("upload_id")
    private String uploadId;

    private GetUploadUrlResponseBody(Builder builder) {
        this.createAt = builder.createAt;
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.partInfoList = builder.partInfoList;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return createAt
     */
    public String getCreateAt() {
        return this.createAt;
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
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return partInfoList
     */
    public java.util.List < UploadPartInfo > getPartInfoList() {
        return this.partInfoList;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder {
        private String createAt; 
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private java.util.List < UploadPartInfo > partInfoList; 
        private String uploadId; 

        /**
         * The time when the upload task was created.
         */
        public Builder createAt(String createAt) {
            this.createAt = createAt;
            return this;
        }

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
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
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
         * The ID of the upload task.
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        public GetUploadUrlResponseBody build() {
            return new GetUploadUrlResponseBody(this);
        } 

    } 

}
