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

    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("KeyMarker")
    private String keyMarker;

    @NameInMap("MaxUploads")
    private Long maxUploads;

    @NameInMap("NextKeyMarker")
    private String nextKeyMarker;

    @NameInMap("NextUploadMarker")
    private String nextUploadMarker;

    @NameInMap("Upload")
    private java.util.List < Upload > uploads;

    @NameInMap("UploadIdMarker")
    private String uploadIdMarker;


    private ListMultipartUploadsResponseBody(Builder builder) {
        this.bucket = builder.bucket;
        this.encodingType = builder.encodingType;
        this.isTruncated = builder.isTruncated;
        this.keyMarker = builder.keyMarker;
        this.maxUploads = builder.maxUploads;
        this.nextKeyMarker = builder.nextKeyMarker;
        this.nextUploadMarker = builder.nextUploadMarker;
        this.uploads = builder.uploads;
        this.uploadIdMarker = builder.uploadIdMarker;
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
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return encodingType
     */
    public String getEncodingType() {
        return this.encodingType;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return keyMarker
     */
    public String getKeyMarker() {
        return this.keyMarker;
    }

    /**
     * @return maxUploads
     */
    public Long getMaxUploads() {
        return this.maxUploads;
    }

    /**
     * @return nextKeyMarker
     */
    public String getNextKeyMarker() {
        return this.nextKeyMarker;
    }

    /**
     * @return nextUploadMarker
     */
    public String getNextUploadMarker() {
        return this.nextUploadMarker;
    }

    /**
     * @return uploads
     */
    public java.util.List < Upload > getUploads() {
        return this.uploads;
    }

    /**
     * @return uploadIdMarker
     */
    public String getUploadIdMarker() {
        return this.uploadIdMarker;
    }

    public static final class Builder {
        private String bucket; 
        private String encodingType; 
        private Boolean isTruncated; 
        private String keyMarker; 
        private Long maxUploads; 
        private String nextKeyMarker; 
        private String nextUploadMarker; 
        private java.util.List < Upload > uploads; 
        private String uploadIdMarker; 

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
         * <p>IsTruncated.</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
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
         * <p>MaxUploads.</p>
         */
        public Builder maxUploads(Long maxUploads) {
            this.maxUploads = maxUploads;
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
         * <p>Upload.</p>
         */
        public Builder uploads(java.util.List < Upload > uploads) {
            this.uploads = uploads;
            return this;
        }

        /**
         * <p>UploadIdMarker.</p>
         */
        public Builder uploadIdMarker(String uploadIdMarker) {
            this.uploadIdMarker = uploadIdMarker;
            return this;
        }

        public ListMultipartUploadsResponseBody build() {
            return new ListMultipartUploadsResponseBody(this);
        } 

    } 

}
