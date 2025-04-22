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
    private java.util.List<UploadPartInfo> partInfoList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<UploadPartInfo> getPartInfoList() {
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
        private java.util.List<UploadPartInfo> partInfoList; 
        private String uploadId; 

        private Builder() {
        } 

        private Builder(GetUploadUrlResponseBody model) {
            this.createAt = model.createAt;
            this.domainId = model.domainId;
            this.driveId = model.driveId;
            this.fileId = model.fileId;
            this.partInfoList = model.partInfoList;
            this.uploadId = model.uploadId;
        } 

        /**
         * <p>The time when the upload task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-11T16:34:36.977Z</p>
         */
        public Builder createAt(String createAt) {
            this.createAt = createAt;
            return this;
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
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5d5b846942cf94fa72324c14a4bda34e81da635d</p>
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
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
         * <p>The ID of the upload task.</p>
         * 
         * <strong>example:</strong>
         * <p>10166D06127B413BA1EC8ABB1144D111</p>
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
