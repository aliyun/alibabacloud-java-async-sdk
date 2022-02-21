// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListObjectsResponseBody</p>
 */
public class ListObjectsResponseBody extends TeaModel {
    @NameInMap("BucketName")
    private String bucketName;

    @NameInMap("CommonPrefixes")
    private java.util.List < String > commonPrefixes;

    @NameInMap("Contents")
    private java.util.List < Contents> contents;

    @NameInMap("ContinuationToken")
    private String continuationToken;

    @NameInMap("Delimiter")
    private String delimiter;

    @NameInMap("EncodingType")
    private String encodingType;

    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("KeyCount")
    private Integer keyCount;

    @NameInMap("Marker")
    private String marker;

    @NameInMap("MaxKeys")
    private Integer maxKeys;

    @NameInMap("NextContinuationToken")
    private String nextContinuationToken;

    @NameInMap("NextMarker")
    private String nextMarker;

    @NameInMap("Prefix")
    private String prefix;

    @NameInMap("RequestId")
    private String requestId;

    private ListObjectsResponseBody(Builder builder) {
        this.bucketName = builder.bucketName;
        this.commonPrefixes = builder.commonPrefixes;
        this.contents = builder.contents;
        this.continuationToken = builder.continuationToken;
        this.delimiter = builder.delimiter;
        this.encodingType = builder.encodingType;
        this.isTruncated = builder.isTruncated;
        this.keyCount = builder.keyCount;
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.nextContinuationToken = builder.nextContinuationToken;
        this.nextMarker = builder.nextMarker;
        this.prefix = builder.prefix;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return commonPrefixes
     */
    public java.util.List < String > getCommonPrefixes() {
        return this.commonPrefixes;
    }

    /**
     * @return contents
     */
    public java.util.List < Contents> getContents() {
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
     * @return nextContinuationToken
     */
    public String getNextContinuationToken() {
        return this.nextContinuationToken;
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bucketName; 
        private java.util.List < String > commonPrefixes; 
        private java.util.List < Contents> contents; 
        private String continuationToken; 
        private String delimiter; 
        private String encodingType; 
        private Boolean isTruncated; 
        private Integer keyCount; 
        private String marker; 
        private Integer maxKeys; 
        private String nextContinuationToken; 
        private String nextMarker; 
        private String prefix; 
        private String requestId; 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * CommonPrefixes.
         */
        public Builder commonPrefixes(java.util.List < String > commonPrefixes) {
            this.commonPrefixes = commonPrefixes;
            return this;
        }

        /**
         * Contents.
         */
        public Builder contents(java.util.List < Contents> contents) {
            this.contents = contents;
            return this;
        }

        /**
         * ContinuationToken.
         */
        public Builder continuationToken(String continuationToken) {
            this.continuationToken = continuationToken;
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
         * KeyCount.
         */
        public Builder keyCount(Integer keyCount) {
            this.keyCount = keyCount;
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
        public Builder maxKeys(Integer maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * NextContinuationToken.
         */
        public Builder nextContinuationToken(String nextContinuationToken) {
            this.nextContinuationToken = nextContinuationToken;
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
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListObjectsResponseBody build() {
            return new ListObjectsResponseBody(this);
        } 

    } 

    public static class Contents extends TeaModel {
        @NameInMap("ETag")
        private String ETag;

        @NameInMap("Key")
        private String key;

        @NameInMap("LastModified")
        private String lastModified;

        @NameInMap("Size")
        private Long size;

        @NameInMap("StorageClass")
        private String storageClass;

        private Contents(Builder builder) {
            this.ETag = builder.ETag;
            this.key = builder.key;
            this.lastModified = builder.lastModified;
            this.size = builder.size;
            this.storageClass = builder.storageClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return ETag
         */
        public String getETag() {
            return this.ETag;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        public static final class Builder {
            private String ETag; 
            private String key; 
            private String lastModified; 
            private Long size; 
            private String storageClass; 

            /**
             * ETag.
             */
            public Builder ETag(String ETag) {
                this.ETag = ETag;
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
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
}
