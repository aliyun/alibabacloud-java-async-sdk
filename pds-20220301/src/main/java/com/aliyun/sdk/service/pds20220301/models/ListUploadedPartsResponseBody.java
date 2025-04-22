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
 * {@link ListUploadedPartsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUploadedPartsResponseBody</p>
 */
public class ListUploadedPartsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("next_part_number_marker")
    private String nextPartNumberMarker;

    @com.aliyun.core.annotation.NameInMap("parallel_upload")
    private Boolean parallelUpload;

    @com.aliyun.core.annotation.NameInMap("upload_id")
    private String uploadId;

    @com.aliyun.core.annotation.NameInMap("uploaded_parts")
    private java.util.List<UploadPartInfo> uploadedParts;

    private ListUploadedPartsResponseBody(Builder builder) {
        this.fileId = builder.fileId;
        this.nextPartNumberMarker = builder.nextPartNumberMarker;
        this.parallelUpload = builder.parallelUpload;
        this.uploadId = builder.uploadId;
        this.uploadedParts = builder.uploadedParts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUploadedPartsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return nextPartNumberMarker
     */
    public String getNextPartNumberMarker() {
        return this.nextPartNumberMarker;
    }

    /**
     * @return parallelUpload
     */
    public Boolean getParallelUpload() {
        return this.parallelUpload;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * @return uploadedParts
     */
    public java.util.List<UploadPartInfo> getUploadedParts() {
        return this.uploadedParts;
    }

    public static final class Builder {
        private String fileId; 
        private String nextPartNumberMarker; 
        private Boolean parallelUpload; 
        private String uploadId; 
        private java.util.List<UploadPartInfo> uploadedParts; 

        private Builder() {
        } 

        private Builder(ListUploadedPartsResponseBody model) {
            this.fileId = model.fileId;
            this.nextPartNumberMarker = model.nextPartNumberMarker;
            this.parallelUpload = model.parallelUpload;
            this.uploadId = model.uploadId;
            this.uploadedParts = model.uploadedParts;
        } 

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>322fb07b975f4b0ae1b543fe8475eee4c19eb2b2</p>
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder nextPartNumberMarker(String nextPartNumberMarker) {
            this.nextPartNumberMarker = nextPartNumberMarker;
            return this;
        }

        /**
         * <p>Indicates whether the parallel upload feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder parallelUpload(Boolean parallelUpload) {
            this.parallelUpload = parallelUpload;
            return this;
        }

        /**
         * <p>The ID of the upload task.</p>
         * 
         * <strong>example:</strong>
         * <p>00166D06127B413BA1EC8ABB1144D101</p>
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        /**
         * <p>The information about the file parts.</p>
         */
        public Builder uploadedParts(java.util.List<UploadPartInfo> uploadedParts) {
            this.uploadedParts = uploadedParts;
            return this;
        }

        public ListUploadedPartsResponseBody build() {
            return new ListUploadedPartsResponseBody(this);
        } 

    } 

}
