// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListObjectsResponseBody</p>
 */
public class ListObjectsResponseBody extends TeaModel {
    @ParentIgnore("ListBucketResult")
    @NameInMap("CommonPrefixes")
    private java.util.List < CommonPrefix > commonPrefixes;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Contents")
    private java.util.List < ObjectSummary > contents;

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
    @NameInMap("Marker")
    private String marker;

    @ParentIgnore("ListBucketResult")
    @NameInMap("MaxKeys")
    private Integer maxKeys;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Name")
    private String name;

    @ParentIgnore("ListBucketResult")
    @NameInMap("NextMarker")
    private String nextMarker;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Prefix")
    private String prefix;


    private ListObjectsResponseBody(Builder builder) {
        this.commonPrefixes = builder.commonPrefixes;
        this.contents = builder.contents;
        this.delimiter = builder.delimiter;
        this.encodingType = builder.encodingType;
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.name = builder.name;
        this.nextMarker = builder.nextMarker;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectsResponseBody create() {
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
     * @return marker
     */
    public String getMarker() {
        return this.marker;
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
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder {
        private java.util.List < CommonPrefix > commonPrefixes; 
        private java.util.List < ObjectSummary > contents; 
        private String delimiter; 
        private String encodingType; 
        private Boolean isTruncated; 
        private String marker; 
        private Integer maxKeys; 
        private String name; 
        private String nextMarker; 
        private String prefix; 

        /**
         * <p>Objects whose names contain the same string that ranges from the prefix to the next occurrence of the delimiter are grouped as a single result element</p>
         */
        public Builder commonPrefixes(java.util.List < CommonPrefix > commonPrefixes) {
            this.commonPrefixes = commonPrefixes;
            return this;
        }

        /**
         * <p>The container that stores the returned object metadata</p>
         */
        public Builder contents(java.util.List < ObjectSummary > contents) {
            this.contents = contents;
            return this;
        }

        /**
         * <p>The character used to group objects by name</p>
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
         * <p>The name of the object from which the list operation begins</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
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
         * <p>NextMarker.</p>
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * <p>The prefix that the names of returned objects contain</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public ListObjectsResponseBody build() {
            return new ListObjectsResponseBody(this);
        } 

    } 

}
