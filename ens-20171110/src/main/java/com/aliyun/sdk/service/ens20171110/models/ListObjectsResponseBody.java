// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListObjectsResponseBody</p>
 */
public class ListObjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.NameInMap("CommonPrefixes")
    private java.util.List < String > commonPrefixes;

    @com.aliyun.core.annotation.NameInMap("Contents")
    private java.util.List < Contents> contents;

    @com.aliyun.core.annotation.NameInMap("ContinuationToken")
    private String continuationToken;

    @com.aliyun.core.annotation.NameInMap("Delimiter")
    private String delimiter;

    @com.aliyun.core.annotation.NameInMap("EncodingType")
    private String encodingType;

    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("KeyCount")
    private Long keyCount;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("MaxKeys")
    private Long maxKeys;

    @com.aliyun.core.annotation.NameInMap("NextContinuationToken")
    private String nextContinuationToken;

    @com.aliyun.core.annotation.NameInMap("NextMarker")
    private String nextMarker;

    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public Long getKeyCount() {
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
    public Long getMaxKeys() {
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
        private Long keyCount; 
        private String marker; 
        private Long maxKeys; 
        private String nextContinuationToken; 
        private String nextMarker; 
        private String prefix; 
        private String requestId; 

        /**
         * <p>The name of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>If the delimiter parameter is specified in the request, the response contains CommonPrefixes. Objects whose names contain the same string from the prefix to the next occurrence of the delimiter are grouped as a single result element in CommonPrefixes.</p>
         */
        public Builder commonPrefixes(java.util.List < String > commonPrefixes) {
            this.commonPrefixes = commonPrefixes;
            return this;
        }

        /**
         * <p>The list of object metadata.</p>
         */
        public Builder contents(java.util.List < Contents> contents) {
            this.contents = contents;
            return this;
        }

        /**
         * <p>The token used in this list operation.</p>
         * 
         * <strong>example:</strong>
         * <p>test1.txt</p>
         */
        public Builder continuationToken(String continuationToken) {
            this.continuationToken = continuationToken;
            return this;
        }

        /**
         * <p>The character used to group objects by name.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        /**
         * <p>The encoding type of the object names in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>Indicates whether the listed objects are truncated. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The number of keys returned for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder keyCount(Long keyCount) {
            this.keyCount = keyCount;
            return this;
        }

        /**
         * <p>The position from which the list operation starts.</p>
         * 
         * <strong>example:</strong>
         * <p>ceshi.txt1617853707991</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>The maximum number of objects returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxKeys(Long maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * <p>The token used in the next list operation.</p>
         * 
         * <strong>example:</strong>
         * <p>CgJiYw--</p>
         */
        public Builder nextContinuationToken(String nextContinuationToken) {
            this.nextContinuationToken = nextContinuationToken;
            return this;
        }

        /**
         * <p>The position from which the next list operation starts.</p>
         * 
         * <strong>example:</strong>
         * <p>ceshi.txt1617853707991</p>
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * <p>The prefix contained in the names of returned objects.</p>
         * 
         * <strong>example:</strong>
         * <p>b</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4833C4AC-9396-458C-8F25-1D701334E560</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListObjectsResponseBody build() {
            return new ListObjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListObjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListObjectsResponseBody</p>
     */
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ETag")
        private String eTag;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private Contents(Builder builder) {
            this.eTag = builder.eTag;
            this.key = builder.key;
            this.lastModified = builder.lastModified;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return eTag
         */
        public String getETag() {
            return this.eTag;
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

        public static final class Builder {
            private String eTag; 
            private String key; 
            private String lastModified; 
            private Long size; 

            /**
             * <p>The entity tag (ETag). When an object is created, an ETag is created to identify the content of the object.</p>
             * <ul>
             * <li>For an object that is created by calling the PutObject operation, the ETag value of the object is the MD5 hash of the object content.</li>
             * <li>For an object that is not created by calling the PutObject operation, the ETag value of the object is the UUID of the object content.</li>
             * <li>The ETag of an object can be used to check whether the object content is modified. However, we recommend that you use the MD5 hash of an object rather than the ETag value of the object to verify data integrity.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5B3C1A2E053D763E1B002CC607C5****</p>
             */
            public Builder eTag(String eTag) {
                this.eTag = eTag;
                return this;
            }

            /**
             * <p>The name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>ceshi.txt1617853706546</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The time when the object was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-08T03:48:47.488Z</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The size of the returned object. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
}
