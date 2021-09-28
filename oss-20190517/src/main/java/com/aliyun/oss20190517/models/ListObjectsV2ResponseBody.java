// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListObjectsV2ResponseBody} extends {@link TeaModel}
 *
 * <p>ListObjectsV2ResponseBody</p>
 */
public class ListObjectsV2ResponseBody extends TeaModel {
    @ParentIgnore("ListBucketResult")
    @NameInMap("Name")
    private String name;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Prefix")
    private String prefix;

    @ParentIgnore("ListBucketResult")
    @NameInMap("StartAfter")
    private String startAfter;

    @ParentIgnore("ListBucketResult")
    @NameInMap("MaxKeys")
    private Integer maxKeys;

    @ParentIgnore("ListBucketResult")
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @ParentIgnore("ListBucketResult")
    @NameInMap("KeyCount")
    private Integer keyCount;

    @ParentIgnore("ListBucketResult")
    @NameInMap("EncodingType")
    private String encodingType;

    @ParentIgnore("ListBucketResult")
    @NameInMap("ContinuationToken")
    private String continuationToken;

    @ParentIgnore("ListBucketResult")
    @NameInMap("NextContinuationToken")
    private String nextContinuationToken;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Contents")
    private java.util.List < ObjectSummary > versions;

    @ParentIgnore("ListBucketResult")
    @NameInMap("CommonPrefixes")
    private java.util.List < CommonPrefix > commonPrefixes;


    private ListObjectsV2ResponseBody(Builder builder) {
        this.name = builder.name;
        this.prefix = builder.prefix;
        this.startAfter = builder.startAfter;
        this.maxKeys = builder.maxKeys;
        this.isTruncated = builder.isTruncated;
        this.keyCount = builder.keyCount;
        this.encodingType = builder.encodingType;
        this.continuationToken = builder.continuationToken;
        this.nextContinuationToken = builder.nextContinuationToken;
        this.versions = builder.versions;
        this.commonPrefixes = builder.commonPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectsV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String name() {
        return this.name;
    }

    /**
     * @return prefix
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * @return startAfter
     */
    public String startAfter() {
        return this.startAfter;
    }

    /**
     * @return maxKeys
     */
    public Integer maxKeys() {
        return this.maxKeys;
    }

    /**
     * @return isTruncated
     */
    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * @return keyCount
     */
    public Integer keyCount() {
        return this.keyCount;
    }

    /**
     * @return encodingType
     */
    public String encodingType() {
        return this.encodingType;
    }

    /**
     * @return continuationToken
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * @return nextContinuationToken
     */
    public String nextContinuationToken() {
        return this.nextContinuationToken;
    }

    /**
     * @return versions
     */
    public java.util.List < ObjectSummary > versions() {
        return this.versions;
    }

    /**
     * @return commonPrefixes
     */
    public java.util.List < CommonPrefix > commonPrefixes() {
        return this.commonPrefixes;
    }

    public static final class Builder {
        private String name; 
        private String prefix; 
        private String startAfter; 
        private Integer maxKeys; 
        private Boolean isTruncated; 
        private Integer keyCount; 
        private String encodingType; 
        private String continuationToken; 
        private String nextContinuationToken; 
        private java.util.List < ObjectSummary > versions; 
        private java.util.List < CommonPrefix > commonPrefixes; 

        /**
         * <p>The bucket name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The prefix that the names of returned objects must contain</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>StartAfter.</p>
         */
        public Builder startAfter(String startAfter) {
            this.startAfter = startAfter;
            return this;
        }

        /**
         * <p>The maximum number of returned objects in the response</p>
         */
        public Builder maxKeys(Integer maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * <p>Indicates whether the returned results are truncated</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>KeyCount.</p>
         */
        public Builder keyCount(Integer keyCount) {
            this.keyCount = keyCount;
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
         * <p>ContinuationToken.</p>
         */
        public Builder continuationToken(String continuationToken) {
            this.continuationToken = continuationToken;
            return this;
        }

        /**
         * <p>NextContinuationToken.</p>
         */
        public Builder nextContinuationToken(String nextContinuationToken) {
            this.nextContinuationToken = nextContinuationToken;
            return this;
        }

        /**
         * <p>The container that stores the versions of objects except for delete markers</p>
         */
        public Builder versions(java.util.List < ObjectSummary > versions) {
            this.versions = versions;
            return this;
        }

        /**
         * <p>Objects whose names contain the same string that ranges from the prefix to the next occurrence of the delimiter are grouped as a single result element</p>
         */
        public Builder commonPrefixes(java.util.List < CommonPrefix > commonPrefixes) {
            this.commonPrefixes = commonPrefixes;
            return this;
        }

        public ListObjectsV2ResponseBody build() {
            return new ListObjectsV2ResponseBody(this);
        } 

    } 

}
