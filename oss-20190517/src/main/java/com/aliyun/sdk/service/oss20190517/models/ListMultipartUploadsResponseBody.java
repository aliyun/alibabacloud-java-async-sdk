// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListMultipartUploadsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultipartUploadsResponseBody</p>
 */
public class ListMultipartUploadsResponseBody extends TeaModel {
    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("Bucket")
    private String bucket;

    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("CommonPrefixes")
    private java.util.List < CommonPrefix > commonPrefixes;

    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("Delimiter")
    private String delimiter;

    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("EncodingType")
    private String encodingType;

    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("KeyMarker")
    private String keyMarker;

    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("MaxUploads")
    private Long maxUploads;

    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("NextKeyMarker")
    private String nextKeyMarker;

    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("NextUploadIdMarker")
    private String nextUploadIdMarker;

    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("Prefix")
    private String prefix;

    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("Upload")
    private java.util.List < Upload > uploads;

    @ParentIgnore("ListMultipartUploadsResult")
    @NameInMap("UploadIdMarker")
    private String uploadIdMarker;

    private ListMultipartUploadsResponseBody(Builder builder) {
        this.bucket = builder.bucket;
        this.commonPrefixes = builder.commonPrefixes;
        this.delimiter = builder.delimiter;
        this.encodingType = builder.encodingType;
        this.isTruncated = builder.isTruncated;
        this.keyMarker = builder.keyMarker;
        this.maxUploads = builder.maxUploads;
        this.nextKeyMarker = builder.nextKeyMarker;
        this.nextUploadIdMarker = builder.nextUploadIdMarker;
        this.prefix = builder.prefix;
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
     * @return commonPrefixes
     */
    public java.util.List < CommonPrefix > getCommonPrefixes() {
        return this.commonPrefixes;
    }

    /**
     * @return delimiter
     */
    public String getDelimiter() {
        return this.delimiter;
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
     * @return nextUploadIdMarker
     */
    public String getNextUploadIdMarker() {
        return this.nextUploadIdMarker;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
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
        private java.util.List < CommonPrefix > commonPrefixes; 
        private String delimiter; 
        private String encodingType; 
        private Boolean isTruncated; 
        private String keyMarker; 
        private Long maxUploads; 
        private String nextKeyMarker; 
        private String nextUploadIdMarker; 
        private String prefix; 
        private java.util.List < Upload > uploads; 
        private String uploadIdMarker; 

        /**
         * Bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * CommonPrefixes.
         */
        public Builder commonPrefixes(java.util.List < CommonPrefix > commonPrefixes) {
            this.commonPrefixes = commonPrefixes;
            return this;
        }

        /**
         * Delimiter.
         */
        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        /**
         * EncodingType.
         */
        public Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        /**
         * IsTruncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * KeyMarker.
         */
        public Builder keyMarker(String keyMarker) {
            this.keyMarker = keyMarker;
            return this;
        }

        /**
         * MaxUploads.
         */
        public Builder maxUploads(Long maxUploads) {
            this.maxUploads = maxUploads;
            return this;
        }

        /**
         * NextKeyMarker.
         */
        public Builder nextKeyMarker(String nextKeyMarker) {
            this.nextKeyMarker = nextKeyMarker;
            return this;
        }

        /**
         * NextUploadIdMarker.
         */
        public Builder nextUploadIdMarker(String nextUploadIdMarker) {
            this.nextUploadIdMarker = nextUploadIdMarker;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Upload.
         */
        public Builder uploads(java.util.List < Upload > uploads) {
            this.uploads = uploads;
            return this;
        }

        /**
         * UploadIdMarker.
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
