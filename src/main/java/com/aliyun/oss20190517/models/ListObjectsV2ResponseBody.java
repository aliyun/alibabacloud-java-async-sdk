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
    @NameInMap("CommonPrefixes")
    private java.util.List < CommonPrefix > commonPrefixes;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Contents")
    private java.util.List < ObjectSummary > contents;

    @ParentIgnore("ListBucketResult")
    @NameInMap("ContinuationToken")
    private String continuationToken;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Delimiter")
    private String delimiter;

    @ParentIgnore("ListBucketResult")
    @NameInMap("EncodingType")
    private String encodingType;

    @ParentIgnore("ListBucketResult")
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @ParentIgnore("ListBucketResult")
    @NameInMap("KeyCount")
    private Integer keyCount;

    @ParentIgnore("ListBucketResult")
    @NameInMap("MaxKeys")
    private Integer maxKeys;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Name")
    private String name;

    @ParentIgnore("ListBucketResult")
    @NameInMap("NextContinuationToken")
    private String nextContinuationToken;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Prefix")
    private String prefix;

    @ParentIgnore("ListBucketResult")
    @NameInMap("StartAfter")
    private String startAfter;


    private ListObjectsV2ResponseBody(Builder builder) {
        this.commonPrefixes = builder.commonPrefixes;
        this.contents = builder.contents;
        this.continuationToken = builder.continuationToken;
        this.delimiter = builder.delimiter;
        this.encodingType = builder.encodingType;
        this.isTruncated = builder.isTruncated;
        this.keyCount = builder.keyCount;
        this.maxKeys = builder.maxKeys;
        this.name = builder.name;
        this.nextContinuationToken = builder.nextContinuationToken;
        this.prefix = builder.prefix;
        this.startAfter = builder.startAfter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectsV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return commonPrefixes
     */
    public java.util.List < CommonPrefix > getCommonPrefixes() {
        return this.commonPrefixes;
    }

    /**
     * @return contents
     */
    public java.util.List < ObjectSummary > getContents() {
        return this.contents;
    }

    /**
     * @return continuationToken
     */
    public String getContinuationToken() {
        return this.continuationToken;
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
     * @return keyCount
     */
    public Integer getKeyCount() {
        return this.keyCount;
    }

    /**
     * @return maxKeys
     */
    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextContinuationToken
     */
    public String getNextContinuationToken() {
        return this.nextContinuationToken;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return startAfter
     */
    public String getStartAfter() {
        return this.startAfter;
    }

    public static final class Builder {
        private java.util.List < CommonPrefix > commonPrefixes; 
        private java.util.List < ObjectSummary > contents; 
        private String continuationToken; 
        private String delimiter; 
        private String encodingType; 
        private Boolean isTruncated; 
        private Integer keyCount; 
        private Integer maxKeys; 
        private String name; 
        private String nextContinuationToken; 
        private String prefix; 
        private String startAfter; 

        /**
         * <p>Objects whose names contain the same string that ranges from the prefix to the next occurrence of the delimiter are grouped as a single result element</p>
         */
        public Builder commonPrefixes(java.util.List < CommonPrefix > commonPrefixes) {
            this.commonPrefixes = commonPrefixes;
            return this;
        }

        /**
         * <p>The container that stores the versions of objects except for delete markers</p>
         */
        public Builder contents(java.util.List < ObjectSummary > contents) {
            this.contents = contents;
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
         * <p>Delimiter.</p>
         */
        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
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
         * <p>The maximum number of returned objects in the response</p>
         */
        public Builder maxKeys(Integer maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * <p>The bucket name</p>
         */
        public Builder name(String name) {
            this.name = name;
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

        public ListObjectsV2ResponseBody build() {
            return new ListObjectsV2ResponseBody(this);
        } 

    } 

}
