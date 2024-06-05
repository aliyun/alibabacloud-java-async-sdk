// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < UploadPartInfo > uploadedParts;

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
    public java.util.List < UploadPartInfo > getUploadedParts() {
        return this.uploadedParts;
    }

    public static final class Builder {
        private String fileId; 
        private String nextPartNumberMarker; 
        private Boolean parallelUpload; 
        private String uploadId; 
        private java.util.List < UploadPartInfo > uploadedParts; 

        /**
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.
         */
        public Builder nextPartNumberMarker(String nextPartNumberMarker) {
            this.nextPartNumberMarker = nextPartNumberMarker;
            return this;
        }

        /**
         * Indicates whether the parallel upload feature is enabled.
         */
        public Builder parallelUpload(Boolean parallelUpload) {
            this.parallelUpload = parallelUpload;
            return this;
        }

        /**
         * The ID of the upload task.
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        /**
         * The information about the file parts.
         */
        public Builder uploadedParts(java.util.List < UploadPartInfo > uploadedParts) {
            this.uploadedParts = uploadedParts;
            return this;
        }

        public ListUploadedPartsResponseBody build() {
            return new ListUploadedPartsResponseBody(this);
        } 

    } 

}
