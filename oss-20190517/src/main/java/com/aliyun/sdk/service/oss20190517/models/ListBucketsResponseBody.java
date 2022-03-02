// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListBucketsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBucketsResponseBody</p>
 */
public class ListBucketsResponseBody extends TeaModel {
    @ParentIgnore("ListAllMyBucketsResult,Buckets")
    @NameInMap("Bucket")
    private java.util.List < Bucket > buckets;

    @ParentIgnore("ListAllMyBucketsResult")
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @ParentIgnore("ListAllMyBucketsResult")
    @NameInMap("Marker")
    private String marker;

    @ParentIgnore("ListAllMyBucketsResult")
    @NameInMap("MaxKeys")
    private Long maxKeys;

    @ParentIgnore("ListAllMyBucketsResult")
    @NameInMap("NextMarker")
    private String nextMarker;

    @ParentIgnore("ListAllMyBucketsResult")
    @NameInMap("Owner")
    private Owner owner;

    @ParentIgnore("ListAllMyBucketsResult")
    @NameInMap("Prefix")
    private String prefix;

    private ListBucketsResponseBody(Builder builder) {
        this.buckets = builder.buckets;
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.nextMarker = builder.nextMarker;
        this.owner = builder.owner;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBucketsResponseBody create() {
        return builder().build();
    }

    /**
     * @return buckets
     */
    public java.util.List < Bucket > getBuckets() {
        return this.buckets;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxKeys
     */
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return owner
     */
    public Owner getOwner() {
        return this.owner;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder {
        private java.util.List < Bucket > buckets; 
        private Boolean isTruncated; 
        private String marker; 
        private Long maxKeys; 
        private String nextMarker; 
        private Owner owner; 
        private String prefix; 

        /**
         * Bucket.
         */
        public Builder buckets(java.util.List < Bucket > buckets) {
            this.buckets = buckets;
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
         * Marker.
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * MaxKeys.
         */
        public Builder maxKeys(Long maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * NextMarker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public ListBucketsResponseBody build() {
            return new ListBucketsResponseBody(this);
        } 

    } 

}
