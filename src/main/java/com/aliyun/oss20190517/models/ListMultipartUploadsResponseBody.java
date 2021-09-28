// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListMultipartUploadsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultipartUploadsResponseBody</p>
 */
public class ListMultipartUploadsResponseBody extends TeaModel {
    @NameInMap("Bucket")
    private String bucket;

    @NameInMap("EncodingType")
    private String encodingType;

    @NameInMap("KeyMarker")
    private String keyMarker;

    @NameInMap("UploadIdMarker")
    private String uploadIdMarker;

    @NameInMap("NextKeyMarker")
    private String nextKeyMarker;

    @NameInMap("NextUploadMarker")
    private String nextUploadMarker;

    @NameInMap("MaxUploads")
    private Long maxUploads;

    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("Upload")
    private java.util.List < Upload > upload;


    private ListMultipartUploadsResponseBody(Builder builder) {
        this.bucket = builder.bucket;
        this.encodingType = builder.encodingType;
        this.keyMarker = builder.keyMarker;
        this.uploadIdMarker = builder.uploadIdMarker;
        this.nextKeyMarker = builder.nextKeyMarker;
        this.nextUploadMarker = builder.nextUploadMarker;
        this.maxUploads = builder.maxUploads;
        this.isTruncated = builder.isTruncated;
        this.upload = builder.upload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultipartUploadsResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return encodingType
     */
    public String encodingType() {
        return this.encodingType;
    }

    /**
     * @return keyMarker
     */
    public String keyMarker() {
        return this.keyMarker;
    }

    /**
     * @return uploadIdMarker
     */
    public String uploadIdMarker() {
        return this.uploadIdMarker;
    }

    /**
     * @return nextKeyMarker
     */
    public String nextKeyMarker() {
        return this.nextKeyMarker;
    }

    /**
     * @return nextUploadMarker
     */
    public String nextUploadMarker() {
        return this.nextUploadMarker;
    }

    /**
     * @return maxUploads
     */
    public Long maxUploads() {
        return this.maxUploads;
    }

    /**
     * @return isTruncated
     */
    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * @return upload
     */
    public java.util.List < Upload > upload() {
        return this.upload;
    }

    public static final class Builder {
        private String bucket; 
        private String encodingType; 
        private String keyMarker; 
        private String uploadIdMarker; 
        private String nextKeyMarker; 
        private String nextUploadMarker; 
        private Long maxUploads; 
        private Boolean isTruncated; 
        private java.util.List < Upload > upload; 

        /**
         * <p>Bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>EncodingType.</p>
         */
        public Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>KeyMarker.</p>
         */
        public Builder keyMarker(String keyMarker) {
            this.keyMarker = keyMarker;
            return this;
        }

        /**
         * <p>UploadIdMarker.</p>
         */
        public Builder uploadIdMarker(String uploadIdMarker) {
            this.uploadIdMarker = uploadIdMarker;
            return this;
        }

        /**
         * <p>NextKeyMarker.</p>
         */
        public Builder nextKeyMarker(String nextKeyMarker) {
            this.nextKeyMarker = nextKeyMarker;
            return this;
        }

        /**
         * <p>NextUploadMarker.</p>
         */
        public Builder nextUploadMarker(String nextUploadMarker) {
            this.nextUploadMarker = nextUploadMarker;
            return this;
        }

        /**
         * <p>MaxUploads.</p>
         */
        public Builder maxUploads(Long maxUploads) {
            this.maxUploads = maxUploads;
            return this;
        }

        /**
         * <p>IsTruncated.</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>Upload.</p>
         */
        public Builder upload(java.util.List < Upload > upload) {
            this.upload = upload;
            return this;
        }

        public ListMultipartUploadsResponseBody build() {
            return new ListMultipartUploadsResponseBody(this);
        } 

    } 

}
