// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListPartsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPartsResponseBody</p>
 */
public class ListPartsResponseBody extends TeaModel {
    @ParentIgnore("ListPartsResult")
    @NameInMap("Bucket")
    private String bucket;

    @ParentIgnore("ListPartsResult")
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @ParentIgnore("ListPartsResult")
    @NameInMap("Key")
    private String key;

    @ParentIgnore("ListPartsResult")
    @NameInMap("MaxParts")
    private Long maxParts;

    @ParentIgnore("ListPartsResult")
    @NameInMap("NextPartNumberMarker")
    private Long nextPartNumberMarker;

    @ParentIgnore("ListPartsResult")
    @NameInMap("Part")
    private java.util.List < Part > part;

    @ParentIgnore("ListPartsResult")
    @NameInMap("PartNumberMarker")
    private Long partNumberMarker;

    @ParentIgnore("ListPartsResult")
    @NameInMap("UploadId")
    private String uploadId;

    private ListPartsResponseBody(Builder builder) {
        this.bucket = builder.bucket;
        this.isTruncated = builder.isTruncated;
        this.key = builder.key;
        this.maxParts = builder.maxParts;
        this.nextPartNumberMarker = builder.nextPartNumberMarker;
        this.part = builder.part;
        this.partNumberMarker = builder.partNumberMarker;
        this.uploadId = builder.uploadId;
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
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return maxParts
     */
    public Long getMaxParts() {
        return this.maxParts;
    }

    /**
     * @return nextPartNumberMarker
     */
    public Long getNextPartNumberMarker() {
        return this.nextPartNumberMarker;
    }

    /**
     * @return part
     */
    public java.util.List < Part > getPart() {
        return this.part;
    }

    /**
     * @return partNumberMarker
     */
    public Long getPartNumberMarker() {
        return this.partNumberMarker;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder {
        private String bucket; 
        private Boolean isTruncated; 
        private String key; 
        private Long maxParts; 
        private Long nextPartNumberMarker; 
        private java.util.List < Part > part; 
        private Long partNumberMarker; 
        private String uploadId; 

        /**
         * Bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
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
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * MaxParts.
         */
        public Builder maxParts(Long maxParts) {
            this.maxParts = maxParts;
            return this;
        }

        /**
         * NextPartNumberMarker.
         */
        public Builder nextPartNumberMarker(Long nextPartNumberMarker) {
            this.nextPartNumberMarker = nextPartNumberMarker;
            return this;
        }

        /**
         * Part.
         */
        public Builder part(java.util.List < Part > part) {
            this.part = part;
            return this;
        }

        /**
         * PartNumberMarker.
         */
        public Builder partNumberMarker(Long partNumberMarker) {
            this.partNumberMarker = partNumberMarker;
            return this;
        }

        /**
         * UploadId.
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        public ListPartsResponseBody build() {
            return new ListPartsResponseBody(this);
        } 

    } 

}
