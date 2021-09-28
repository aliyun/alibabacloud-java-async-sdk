// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListObjectVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListObjectVersionsResponseBody</p>
 */
public class ListObjectVersionsResponseBody extends TeaModel {
    @ParentIgnore("ListVersionsResult")
    @NameInMap("Name")
    private String name;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("Prefix")
    private String prefix;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("KeyMarker")
    private String keyMarker;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("VersionIdMarker")
    private String versionIdMarker;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("MaxKeys")
    private Long maxKeys;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("EncodingType")
    private String encodingType;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("Version")
    private java.util.List < ObjectVersion > versions;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("DeleteMarker")
    private java.util.List < DeleteMarkerEntry > deleteMarkers;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("CommonPrefixes")
    private java.util.List < CommonPrefix > commonPrefixes;


    private ListObjectVersionsResponseBody(Builder builder) {
        this.name = builder.name;
        this.prefix = builder.prefix;
        this.keyMarker = builder.keyMarker;
        this.versionIdMarker = builder.versionIdMarker;
        this.maxKeys = builder.maxKeys;
        this.isTruncated = builder.isTruncated;
        this.encodingType = builder.encodingType;
        this.versions = builder.versions;
        this.deleteMarkers = builder.deleteMarkers;
        this.commonPrefixes = builder.commonPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectVersionsResponseBody create() {
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
     * @return keyMarker
     */
    public String keyMarker() {
        return this.keyMarker;
    }

    /**
     * @return versionIdMarker
     */
    public String versionIdMarker() {
        return this.versionIdMarker;
    }

    /**
     * @return maxKeys
     */
    public Long maxKeys() {
        return this.maxKeys;
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
     * @return versions
     */
    public java.util.List < ObjectVersion > versions() {
        return this.versions;
    }

    /**
     * @return deleteMarkers
     */
    public java.util.List < DeleteMarkerEntry > deleteMarkers() {
        return this.deleteMarkers;
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
        private String keyMarker; 
        private String versionIdMarker; 
        private Long maxKeys; 
        private Boolean isTruncated; 
        private String encodingType; 
        private java.util.List < ObjectVersion > versions; 
        private java.util.List < DeleteMarkerEntry > deleteMarkers; 
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
         * <p>Indicates the object from which the operation starts</p>
         */
        public Builder keyMarker(String keyMarker) {
            this.keyMarker = keyMarker;
            return this;
        }

        /**
         * <p>This parameter is returned with KeyMarker together to indicate the version from which the operation starts</p>
         */
        public Builder versionIdMarker(String versionIdMarker) {
            this.versionIdMarker = versionIdMarker;
            return this;
        }

        /**
         * <p>The maximum number of returned objects in the response</p>
         */
        public Builder maxKeys(Long maxKeys) {
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
         * <p>EncodingType.</p>
         */
        public Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>The container that stores the versions of objects except for delete markers</p>
         */
        public Builder versions(java.util.List < ObjectVersion > versions) {
            this.versions = versions;
            return this;
        }

        /**
         * <p>The container that stores delete markers</p>
         */
        public Builder deleteMarkers(java.util.List < DeleteMarkerEntry > deleteMarkers) {
            this.deleteMarkers = deleteMarkers;
            return this;
        }

        /**
         * <p>Objects whose names contain the same string that ranges from the prefix to the next occurrence of the delimiter are grouped as a single result element</p>
         */
        public Builder commonPrefixes(java.util.List < CommonPrefix > commonPrefixes) {
            this.commonPrefixes = commonPrefixes;
            return this;
        }

        public ListObjectVersionsResponseBody build() {
            return new ListObjectVersionsResponseBody(this);
        } 

    } 

}
