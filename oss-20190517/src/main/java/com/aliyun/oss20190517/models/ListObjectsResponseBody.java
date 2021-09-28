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
    @NameInMap("Name")
    private String name;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Prefix")
    private String prefix;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Marker")
    private String marker;

    @ParentIgnore("ListBucketResult")
    @NameInMap("MaxKeys")
    private Integer maxKeys;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Delimiter")
    private String delimiter;

    @ParentIgnore("ListBucketResult")
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @ParentIgnore("ListBucketResult")
    @NameInMap("EncodingType")
    private String encodingType;

    @ParentIgnore("ListBucketResult")
    @NameInMap("Contents")
    private java.util.List < ObjectSummary > contents;

    @ParentIgnore("ListBucketResult")
    @NameInMap("CommonPrefixes")
    private java.util.List < CommonPrefix > commonPrefixes;


    private ListObjectsResponseBody(Builder builder) {
        this.name = builder.name;
        this.prefix = builder.prefix;
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.delimiter = builder.delimiter;
        this.isTruncated = builder.isTruncated;
        this.encodingType = builder.encodingType;
        this.contents = builder.contents;
        this.commonPrefixes = builder.commonPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectsResponseBody create() {
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
     * @return marker
     */
    public String marker() {
        return this.marker;
    }

    /**
     * @return maxKeys
     */
    public Integer maxKeys() {
        return this.maxKeys;
    }

    /**
     * @return delimiter
     */
    public String delimiter() {
        return this.delimiter;
    }

    /**
     * @return isTruncated
     */
    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * @return encodingType
     */
    public String encodingType() {
        return this.encodingType;
    }

    /**
     * @return contents
     */
    public java.util.List < ObjectSummary > contents() {
        return this.contents;
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
        private String marker; 
        private Integer maxKeys; 
        private String delimiter; 
        private Boolean isTruncated; 
        private String encodingType; 
        private java.util.List < ObjectSummary > contents; 
        private java.util.List < CommonPrefix > commonPrefixes; 

        /**
         * <p>The bucket name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The prefix that the names of returned objects contain</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
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
         * <p>The character used to group objects by name</p>
         */
        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
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
         * <p>EncodingType.</p>
         */
        public Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
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
         * <p>Objects whose names contain the same string that ranges from the prefix to the next occurrence of the delimiter are grouped as a single result element</p>
         */
        public Builder commonPrefixes(java.util.List < CommonPrefix > commonPrefixes) {
            this.commonPrefixes = commonPrefixes;
            return this;
        }

        public ListObjectsResponseBody build() {
            return new ListObjectsResponseBody(this);
        } 

    } 

}
