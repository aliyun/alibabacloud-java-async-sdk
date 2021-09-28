// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListPartsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPartsResponseBody</p>
 */
public class ListPartsResponseBody extends TeaModel {
    @NameInMap("Bucket")
    private String bucket;

    @NameInMap("Key")
    private String key;

    @NameInMap("UploadId")
    private String uploadId;

    @NameInMap("NextPartNumberMarker")
    private Long nextPartNumberMarker;

    @NameInMap("MaxParts")
    private Long maxParts;

    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("Part")
    private java.util.List < Part > part;


    private ListPartsResponseBody(Builder builder) {
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.uploadId = builder.uploadId;
        this.nextPartNumberMarker = builder.nextPartNumberMarker;
        this.maxParts = builder.maxParts;
        this.isTruncated = builder.isTruncated;
        this.part = builder.part;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPartsResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return key
     */
    public String key() {
        return this.key;
    }

    /**
     * @return uploadId
     */
    public String uploadId() {
        return this.uploadId;
    }

    /**
     * @return nextPartNumberMarker
     */
    public Long nextPartNumberMarker() {
        return this.nextPartNumberMarker;
    }

    /**
     * @return maxParts
     */
    public Long maxParts() {
        return this.maxParts;
    }

    /**
     * @return isTruncated
     */
    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * @return part
     */
    public java.util.List < Part > part() {
        return this.part;
    }

    public static final class Builder {
        private String bucket; 
        private String key; 
        private String uploadId; 
        private Long nextPartNumberMarker; 
        private Long maxParts; 
        private Boolean isTruncated; 
        private java.util.List < Part > part; 

        /**
         * <p>Bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>Key.</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>UploadId.</p>
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        /**
         * <p>NextPartNumberMarker.</p>
         */
        public Builder nextPartNumberMarker(Long nextPartNumberMarker) {
            this.nextPartNumberMarker = nextPartNumberMarker;
            return this;
        }

        /**
         * <p>MaxParts.</p>
         */
        public Builder maxParts(Long maxParts) {
            this.maxParts = maxParts;
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
         * <p>Part.</p>
         */
        public Builder part(java.util.List < Part > part) {
            this.part = part;
            return this;
        }

        public ListPartsResponseBody build() {
            return new ListPartsResponseBody(this);
        } 

    } 

}
